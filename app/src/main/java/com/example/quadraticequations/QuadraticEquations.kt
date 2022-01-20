package com.example.quadraticequations

import android.util.Log
import android.widget.EditText
import android.widget.TextView

class QuadraticEquations {


    val  mathematicsClass=MathematicsClass()

    private var a=0.0
    private var b=0.0
    private var c=0.0

    private var quadrD=0.0
    private var ac_4=0.0
    private var discriminant=0.0
    private var discriminantRoot=0.0

    private var root1=0.0
    private var root2=0.0

    // переменнная обозначающая отсутствие корней
    var solved=true

    fun setA (a:Double){ this.a=a;meth()}
    fun setB (b:Double){ this.b=b;meth()}
    fun setC (c:Double){ this.c=c;meth()}

    fun setABC (a:Double,b:Double,c: Double){ this.a=a;this.b=b;this.c=c;meth() }

  fun meth(){
      solved=true
      ZeroParam()
      Log.i("afterTextChanged a", "n    " + a + " " + b + " " + c)
      if (a != 0.0) {
              quadrD = b * b
              ac_4 = 4 * a * c
              discriminant = mathematicsClass.discriminant(a, b, c)
              if (discriminant >= 0) {
                  discriminantRoot = kotlin.math.sqrt(discriminant)
                  root1 = mathematicsClass.root_fun1(a, b, discriminant)
                  root2 = mathematicsClass.root_fun2(a, b, discriminant)
              } else {
                  solved = false;
              }
          Log.i("afterTextChanged a", "res "+b+" "+c+"-> "+solved+" "+root1+" "+root2)
      } else {
          if (b == 0.0) solved = false
          root1 = mathematicsClass.ZeroA(b, c)
          root2 = root1
          Log.i("afterTextChanged a", "res "+b+" "+c+"-> "+solved+" "+root1+" "+root2)
    }

  }
    fun ZeroParam(){
        quadrD=0.0
        ac_4=0.0
        discriminant=0.0
        discriminantRoot=0.0
        root1 = 0.0
        root2 = 0.0
    }

    fun getQuadrD()=quadrD
    fun getAC_4()=ac_4
    fun getDiscriminant()=discriminant
    fun getDiscriminantRoot()=discriminantRoot
    fun getRoot1()=root1
    fun getRoot2()=root2

}