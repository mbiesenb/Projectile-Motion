package main.java

import LinearAlgebra.Vector2


object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val animationWindow = AnimationWindow()


        var upRight = (Vector2.UP * 2 + Vector2.RIGHT * 2)
        println(upRight.distance())

    }
}
