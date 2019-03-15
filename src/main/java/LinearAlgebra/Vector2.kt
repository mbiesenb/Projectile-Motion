package LinearAlgebra


class Vector2 (val x : Double , val y : Double) {




    init {
        /*this.x = x
        this.y = y*/
    }

    /**
     *  Define vector functions
     */
    fun add( vector: Vector2) =  Vector2 ( x + vector.x  , x + vector.x)
    fun subract(vector: Vector2) = Vector2 ( x - vector.x  , x - vector.x)
    fun angleBetween(vector: Vector2) = dotProduct(vector) / (distance(this) * distance(vector))
    fun dotProduct(vector: Vector2): Double  =  x * vector.x + y * vector.y
    fun magnitude() : Vector2 = (1 / distance(this)) * this
    fun distance( vector: Vector2) = Math.sqrt( Math.pow(vector.x - x, 2.0) + Math.pow(vector.y - y,2.0))
    fun distance() = distance(Vector2.ZERO)
    /**
     *  Basic Obejct Stuff
     */
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Vector2
        if (x != other.x) return false
        if (y != other.y) return false
        var i : Int = 0
        return true
    }
    override fun toString(): String = "Vector2(x=$x, y=$y)"




    companion object {

        /**
         *  Declare some Vecors
         */
        val ZERO = Vector2(0.0,0.0)
        val LEFT = Vector2(-1.0,0.0)
        val RIGHT = Vector2(1.0,0.0)
        val UP = Vector2(0.0,1.0)
        val DOWN = Vector2(0.0,-1.0)

        /**
         *  Declar Static Number Operators
         */
        fun scalarMul( product : Double , vector: Vector2) : Vector2=Vector2 ( product * vector.x , product * vector.y)
        fun scalarDiv(divisor: Double, vector: Vector2): Vector2 = Vector2(vector.x / divisor , vector.y / divisor)

    }

    /**
     *  Override operators
     */
    operator fun plus(vector: Vector2) = add(vector)
    operator fun minus(vector: Vector2) = subract(vector)
    operator fun times(product: Number) = scalarMul(product.toDouble() , this)
    operator fun div(divisor: Number) = scalarDiv(divisor.toDouble() , this)
    //operator fun equals(vector: Vector2) = equals()


    /**
     *  Override Numer Operations
     */
    operator fun Number.times(vector: Vector2) = scalarMul(toDouble() , vector)
    operator fun Number.div(vector: Vector2) = scalarDiv(toDouble() , vector)
    operator fun Double.div(vector: Vector2) = scalarDiv(toDouble() , vector)


}