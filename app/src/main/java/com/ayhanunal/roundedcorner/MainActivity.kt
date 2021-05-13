package com.ayhanunal.roundedcorner

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.ayhanunal.roundedcorner.databinding.ActivityMainBinding
import com.ayhanunal.roundedcorner.databinding.DialogTmpBinding

class MainActivity : AppCompatActivity() {

    //view binding
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.showBtn.setOnClickListener {
            val alertDialogBuilder = AlertDialog.Builder(this)

            val inflater = layoutInflater
            var dialogView = inflater.inflate(R.layout.dialog_tmp, null)
            alertDialogBuilder.setView(dialogView)

            val alertDialog: AlertDialog = alertDialogBuilder.create()
            alertDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            alertDialog.setCancelable(false)
            alertDialog.setCanceledOnTouchOutside(false)
            alertDialog.show()

            val closeButton: Button = dialogView.findViewById(R.id.closeButton)
            closeButton.setOnClickListener {
                alertDialog.cancel()
            }



        }

    }
}