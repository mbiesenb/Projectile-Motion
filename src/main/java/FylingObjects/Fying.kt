package main.java.FylingObjects

import LinearAlgebra.Vector2

interface Fying {
    fun getCurrentPosition(time: Double?, force: Vector2, startPosition: Vector2): Vector2

    companion object {

        val GRAVIATION = 9.807
    }

}
