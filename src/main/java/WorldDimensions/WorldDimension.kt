package WorldDimensions

import LinearAlgebra.Vector2

open class WorldDimension (val world_size_in_meter : Vector2) {

    /*protected var x_width = 0.0
    protected var y_height = 0.0*/
    fun getRelMeters( percentage_x : Double , percentage_y : Double ) = Vector2(percentage_x * world_size_in_meter.x , percentage_y  * world_size_in_meter.y)
    fun getPixelsFromMeter(meter: Vector2 , displaySize : Vector2) = Vector2((meter.x / world_size_in_meter.x) * displaySize.x, (meter.y / world_size_in_meter.y) * displaySize.y)

}