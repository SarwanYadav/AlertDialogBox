package com.example.alertdialogbox2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {


    lateinit var click:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


      click=findViewById(R.id.button)

        click.setOnClickListener {
            val dialog= AlertDialog.Builder(this)

            dialog.setTitle("Delete file ")
            dialog.setMessage(R.string.des)
            dialog.setIcon(R.drawable.baseline_delete_sweep_24)

            dialog.setPositiveButton("Yes"){dialogInterface,with ->

                Toast.makeText(this@MainActivity, "Click yes" , Toast.LENGTH_SHORT).show()

            }

            dialog.setNegativeButton("NO"){dialogInterface, with->

                Toast.makeText(this@MainActivity , "Click No ", Toast.LENGTH_SHORT).show()


            }


            dialog.setNeutralButton("Cancle "){dialogInterface, with ->

                Toast.makeText(this@MainActivity, " Click cancle button ", Toast. LENGTH_SHORT).show()



            }

            val alertDialog: AlertDialog= dialog.create()
            alertDialog.setCancelable(false)
            alertDialog.show()


        }




    }
}