package main.java.FylingObjects

import FireUp.FireUp
import gravitations.Gravitation
import gravitations.GravitationEarth
import LinearAlgebra.Vector2


class Ball : Fying {

    var gravitation : Gravitation = GravitationEarth()

    override fun getCurrentPosition(time: Double, fireUp: FireUp): Vector2 {
        var angle = fireUp.direction.angleBetween(Vector2.RIGHT)
        var x_t = fireUp.direction.x * Math.cos(angle) * time
        var y_t =   -0.5 * gravitation.getGravitation() * Math.pow(time , 2.0) +
                    fireUp.direction.y *  Math.sin(angle) * time +
                    fireUp.startPosition.y
        return Vector2(x_t, y_t)
    }


}
