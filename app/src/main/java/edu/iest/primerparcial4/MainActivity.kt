package edu.iest.primerparcial4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var cambioIcono: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ivImagen = findViewById<ImageView>(R.id.tvImagen)
        var btCerrar = findViewById<TextView>(R.id.textView2)

        ivImagen.setOnClickListener{
            var arregloImagen = arrayOf(R.drawable.antman, R.drawable.antmandos)
            if (cambioIcono){
                ivImagen.setImageResource(arregloImagen[0])
            }else{
                ivImagen.setImageResource(arregloImagen[1])
            }

            cambioIcono =! cambioIcono
        }

        btCerrar.setOnClickListener{
            finish()
        }
    }
}