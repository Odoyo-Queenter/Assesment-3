package dev.queenter.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilFirstnum:TextInputLayout
    lateinit var  tilSecondnum: TextInputLayout
    lateinit var etFirstnum: TextInputEditText
    lateinit var etSecondnum: TextInputEditText
    lateinit var btnAdd: Button
    lateinit var btnMinus: Button
    lateinit var btnDivide: Button
    lateinit var btnModulus:Button
    lateinit var  tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilFirstnum = findViewById(R.id.tilFirstnum)
        tilSecondnum = findViewById(R.id.tilSecondnum)
        etFirstnum = findViewById(R.id.etFirstnum)
        etSecondnum = findViewById(R.id.etSecondnum)
        btnAdd = findViewById(R.id.btnAdd)
        btnMinus = findViewById(R.id.btnMinus)
        btnDivide = findViewById(R.id.btnDivide)
        btnModulus = findViewById(R.id.btnModulus)
        tvResult = findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            var num1 = etFirstnum.text.toString().toDouble()
            var num2 = etSecondnum.text.toString().toDouble()
            add(num1,num2)
        }
        btnMinus.setOnClickListener {
            var num1 = etFirstnum.text.toString().toDouble()
            var num2 = etSecondnum.text.toString().toDouble()
            minus(num1,num2)
        }
        btnDivide.setOnClickListener {
            var num1 = etFirstnum.text.toString().toDouble()
            var num2 = etSecondnum.text.toString().toDouble()
            divide(num1,num2)
        }
        btnModulus.setOnClickListener {
            var num1 = etFirstnum.text.toString().toDouble()
            var num2 = etSecondnum.text.toString().toDouble()
            modulus(num1,num2)
        }



    }
    fun add (num1:Double,num2:Double){
        var total = num1 + num2
        tvResult.text= total.toString()
    }
    fun minus (num1:Double,num2:Double){
        var total = num1 - num2
        tvResult.text = total.toString()
    }
    fun divide (num1:Double,num2:Double) {
        var total = num1 / num2
        tvResult.text = total.toString()
    }
    fun modulus (num1:Double,num2:Double) {
        var total = num1 % num2
        tvResult.text = total.toString()
    }
}



























//
//
//
//    fun add(num1:Double,num2: Double){
//        var total=num1+num2
//        tvResult.text=total.toString()
//    }
//    fun subtract(num1:Double,num2: Double){
//        var total=num1+num2
//        tvResult.text=total.toString()
//    }
//    fun multiply(num1:Double,num2: Double){
//        var total=num1*num2
//        tvResult.text=total.toString()
//    }
//    fun modulus(num1:Double,num2: Double){
//        var total=num1%num2
//        tvResult.text=total.toString()
//    }
//}