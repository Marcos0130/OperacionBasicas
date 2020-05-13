package edu.itsco.numeros2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txt_numero1 = findViewById<View>(R.id.texto1) as EditText
        var txt_numero2 = findViewById<View>(R.id.texto2) as EditText
        var btnsuma = findViewById<View>(R.id.suma) as Button
        var btnresta = findViewById<View>(R.id.resta) as Button
        var btnmultiplicacion = findViewById<View>(R.id.multiplicacion) as Button
        var btndivision = findViewById<View>(R.id.division) as Button

        btnsuma.setOnClickListener(View.OnClickListener {

            var resultado=texto1.text.toString().toInt()+texto2.text.toString().toInt()

            Toast.makeText(this,"La suma es: "+resultado,Toast.LENGTH_LONG).show()
        })
        btnresta.setOnClickListener(View.OnClickListener {

            var resultado=texto1.text.toString().toInt()-texto2.text.toString().toInt()

            Toast.makeText(this,"La resta es: "+resultado,Toast.LENGTH_LONG).show()
        })
        btnmultiplicacion.setOnClickListener(View.OnClickListener {

            var resultado=texto1.text.toString().toInt()*texto2.text.toString().toInt()

            Toast.makeText(this,"La multiplicacione es: "+resultado,Toast.LENGTH_LONG).show()
        })
        btndivision.setOnClickListener(View.OnClickListener {

            var resultado=texto1.text.toString().toInt()/texto2.text.toString().toInt()

            Toast.makeText(this,"la division es: "+resultado,Toast.LENGTH_LONG).show()
        })
    }

}
