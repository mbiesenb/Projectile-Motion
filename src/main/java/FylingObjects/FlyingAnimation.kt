package FylingObjects

import FireUp.FireUp
import LinearAlgebra.Vector2
import WorldDimensions.WorldDimension
import main.java.FylingObjects.Fying
import java.awt.Color
import java.awt.Dimension
import java.awt.Graphics

open class FlyingAnimation (val fying: Fying, val fireUp: FireUp) {

    var currentPosition = fireUp.startPosition
    val thread = Thread{
        var start = System.currentTimeMillis()
        while (true){
            var currentSeconds = ( System.currentTimeMillis().toDouble() - start.toDouble() ) / 1000.0
            currentPosition = fying.getCurrentPosition(currentSeconds , fireUp)
        }
    }

    fun paint(displaySize : Vector2 , dimension: WorldDimension, g: Graphics) {
        g.color = Color.black
        var pxCoord = dimension.getPixelsFromMeter(currentPosition,displaySize)
        g.drawOval(pxCoord.x.toInt()-25 , pxCoord.y.toInt()-25 , 50 , 50)
        //println("Neue Coordinaten ${pxCoord.toString()}  DisplaySize: ${displaySize}  WorldSize: ${dimension}  CurrentPosition: $currentPosition")
    }
    fun start(){
        thread.start()
    }
    fun stop(){
        throw NotImplementedError()
    }

}