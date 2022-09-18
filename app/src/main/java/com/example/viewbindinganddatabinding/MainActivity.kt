package com.example.viewbindinganddatabinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbindinganddatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtName.text = "Welcome to Android Batch"

        binding.btnSetName.setOnClickListener{
            binding.txtName.text = binding.edtName.text.toString()
            binding.imgLogo.setImageResource(R.mipmap.ic_launcher)
        }

        binding.btnShowUserDetails.setOnClickListener {
            var user = User(
                R.mipmap.ic_launcher,
                "Shruti Rote",
                2,
                2001,
                "shruti.rote3901@gmail.com"
            )

            var intent : Intent = Intent(this,UserDetailsActivity::class.java)
            intent.putExtra("user",user)
            startActivity(intent)
        }
    }
}