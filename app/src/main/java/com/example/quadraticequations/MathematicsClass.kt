package com.example.quadraticequations

class MathematicsClass {

    fun discriminant(a: Double, b: Double, c: Double): Double {
        if (a != 0.0) return b * b - 4 * a * c else return 0.0
    }

    fun root_fun1(a: Double, b: Double, discriminant: Double):Double{
        if (a != 0.0 && discriminant>=0.0) return (-1 * b + kotlin.math.sqrt(discriminant)) / (2 * a)
        else return 0.0
    }

    fun root_fun2(a: Double, b: Double,discriminant: Double):Double{
        // иначе вылезает -0
        if (a != 0.0 && discriminant==0.0) return (-1 * b + kotlin.math.sqrt(discriminant)) / (2 * a)
        if (a != 0.0 && discriminant>=0.0) return (-1 * b - kotlin.math.sqrt(discriminant)) / (2 * a)
        else return 0.0
    }

    fun ZeroA(b:Double,c:Double): Double {
        if(b!=0.0 && c!=0.0){
            return -1 * c / b
            }

        if(b!=0.0 && c==0.0){
            return 0.0
        }
        return 0.0
    }

}