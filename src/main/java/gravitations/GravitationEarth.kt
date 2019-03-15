package gravitations

import gravitations.Gravitation

class GravitationEarth : Gravitation {
    override fun getGravitation(): Double {
        return 9.807 // m/s
    }
}