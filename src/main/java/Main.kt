package main.java

import FireUp.ExampleFireUp
import FylingObjects.FlyingAnimation
import LinearAlgebra.Vector2
import main.java.FylingObjects.Ball

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val animationWindow = AnimationWindow()


        var upRight = (Vector2.UP * 2 + Vector2.RIGHT * 2)
        println(upRight.distance())

        //var fylingAnmiation  = FlyingAnimation(Ball() , ExampleFireUp())
        //fylingAnmiation.start()

    }
}


