package com.example.quadraticequations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), TextWatcher {

    val quadraticEquations = QuadraticEquations()
    private lateinit var EditA: EditText
    private lateinit var EditB: EditText
    private lateinit var EditC: EditText
    private lateinit var QuadrD: TextView
    private lateinit var AC_4: TextView
    private lateinit var Discriminant: TextView
    private lateinit var DiscriminantRoot: TextView
    private lateinit var Root1: TextView
    private lateinit var Root2: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

        //https://habr.com/ru/company/skillbox/blog/448582/
    }

    private fun initViews() {


        EditA = findViewById(R.id.EditA)

        EditB = findViewById(R.id.EditB)

        EditC = findViewById(R.id.EditC)

        QuadrD = findViewById(R.id.QuadrD)

        AC_4 = findViewById(R.id.AC_4)

        Discriminant = findViewById(R.id.Discriminant)

        DiscriminantRoot = findViewById(R.id.DiscriminantRoot)

        Root1 = findViewById(R.id.Root1)
        Root2 = findViewById(R.id.Root2)

        EditA.addTextChangedListener(this)
        EditB.addTextChangedListener(this)
        EditC.addTextChangedListener(this)

    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        // TODO("Not yet implemented")

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        // TODO("Not yet implemented")
    }

    override fun afterTextChanged(s: Editable?) {

        try {
            Log.i("afterTextChanged a", " " + EditA.text)
            quadraticEquations.setA(EditA.text.toString().toDouble())
        } catch (e: Exception) {
            quadraticEquations.setA(0.0)
        }

        try {
            quadraticEquations.setB(EditB.text.toString().toDouble())
        } catch (e: Exception) {
            quadraticEquations.setB(0.0)
        }

        try {
            quadraticEquations.setC(EditC.text.toString().toDouble())
        } catch (e: Exception) {
            quadraticEquations.setC(0.0)
        }


        if (!EditA.text.isEmpty()) {
            completionTextView()
        }
        if (!EditB.text.isEmpty()) {
            completionTextView()
        }
        if (!EditC.text.isEmpty()) {
            completionTextView()
        }
    }

    fun completionTextView() {
        QuadrD.text = quadraticEquations.getQuadrD().toString()
        AC_4.text = quadraticEquations.getAC_4().toString()
        Discriminant.text = quadraticEquations.getDiscriminant().toString()
        DiscriminantRoot.text = quadraticEquations.getDiscriminantRoot().toString()
        if (quadraticEquations.solved) {
            Root1.text = quadraticEquations.getRoot1().toString()
            Root2.text = quadraticEquations.getRoot2().toString()
        } else {
            Root1.text = "корней нет"
            Root2.text = "корней нет"
        }
    }

}