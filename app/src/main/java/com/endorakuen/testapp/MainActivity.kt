package com.endorakuen.testapp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.endorakuen.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            txtNumber.text=number.toString()
            btnAdd.setOnClickListener {
                number++
                txtNumber.text=number.toString()
            }
            btnSubt.setOnClickListener {
                number--
                txtNumber.text=number.toString()
            }
            btnCrntnmbr.setOnClickListener {
                Toast.makeText(this@MainActivity,"Current Number: $number",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}