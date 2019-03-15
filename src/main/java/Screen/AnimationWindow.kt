package main.java

import javax.swing.*
import java.awt.*

class AnimationWindow @Throws(HeadlessException::class)
constructor() : JFrame() {

    internal var animationDraw = AnimationDraw()

    init {

        title = "Projectile Motion"
        size = Dimension(800, 600)
        isVisible = true
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        layout = BorderLayout()
        add(animationDraw, BorderLayout.CENTER)


    }

}
