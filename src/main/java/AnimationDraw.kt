package main.java

import javax.swing.*
import java.awt.*

class AnimationDraw : JPanel() {

    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        g.color = Color.black
        g.drawRect(100, 100, 100, 100)


    }
}
