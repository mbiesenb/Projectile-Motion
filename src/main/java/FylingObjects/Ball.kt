package main.java.FylingObjects

import LinearAlgebra.Vector2


class Ball : Fying {
    override fun getCurrentPosition(time: Double?, force: Vector2, startPosition: Vector2): Vector2 {
        return Vector2.ZERO
    }

}
