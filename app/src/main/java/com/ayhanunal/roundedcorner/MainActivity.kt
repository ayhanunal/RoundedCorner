package com.ayhanunal.roundedcorner

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.ayhanunal.roundedcorner.databinding.ActivityMainBinding
import com.ayhanunal.roundedcorner.databinding.DialogTmpBinding

class MainActivity : AppCompatActivity() {

    //view binding
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //view binding initialize
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.showBtn.setOnClickListener {
            // show button is clicked
            val alertDialogBuilder = AlertDialog.Builder(this)

            //inflate dialog_tmp.xml
            val inflater = layoutInflater
            var dialogView = inflater.inflate(R.layout.dialog_tmp, null)

            alertDialogBuilder.setView(dialogView) // alert dialog set View

            //create alert dialog
            val alertDialog: AlertDialog = alertDialogBuilder.create()
            alertDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            alertDialog.setCancelable(false) // When we press the back button, we prevent it from closing
            alertDialog.setCanceledOnTouchOutside(false)
            alertDialog.show()

            val closeButton: Button = dialogView.findViewById(R.id.closeButton)
            closeButton.setOnClickListener {
                alertDialog.cancel()
            }


        }

    }
}