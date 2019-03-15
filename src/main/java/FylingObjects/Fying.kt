package main.java.FylingObjects

import FireUp.FireUp
import LinearAlgebra.Vector2

interface Fying {
    fun getCurrentPosition(time: Double, fireUp: FireUp): Vector2

}
