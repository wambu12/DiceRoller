package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var Imageview: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  val binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)


      //     Dynamic text to a toast  binding.rollButton.text="Roll The butoon"


       val button: Button =findViewById(R.id.roll_Button)

        button.setOnClickListener {


            //Toast.makeText(this,"Hello i am clicked",Toast.LENGTH_LONG).show()

            rollDice()

        }

        Imageview = findViewById(R.id.image_View)


    }

    private fun rollDice() {
       // TODO("Not yet implemented")
      //  val Imageview: ImageView = findViewById(R.id.image_View)

        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        Imageview.setImageResource(drawableResource)

     }
}