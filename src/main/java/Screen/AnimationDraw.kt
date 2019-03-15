package main.java

import FireUp.ExampleFireUp
import FylingObjects.FlyingAnimation
import LinearAlgebra.Vector2
import WorldDimensions.StandardDimension
import WorldDimensions.WorldDimension
import main.java.FylingObjects.*
import javax.swing.*
import java.awt.*

class AnimationDraw : JPanel() {
    var dimension: WorldDimension = StandardDimension()
    var animations = mutableListOf<FlyingAnimation>()

    init {
        // Test Ball Fly
        var animation = FlyingAnimation(Ball(), ExampleFireUp())
        animations.add(animation)
        startAnimations()
        var reDraw = Thread {
            while (true) {
                repaint()
            }
        }.start()

    }

    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)

        var g2d = g as Graphics2D;
        g2d.translate(0, getHeight());
        g2d.scale(1.0, -1.0)

        var displaySize = Vector2(getSize().getWidth(), getSize().getHeight())
        animations.forEach { a -> a.paint(displaySize, dimension, g) }
    }

    fun startAnimations() {
        animations.forEach { a -> a.start() }
    }
}
