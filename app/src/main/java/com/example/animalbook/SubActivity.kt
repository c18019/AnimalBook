package com.example.animalbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        dogButton.setOnClickListener{
            val fragment=dogFragment()
            val fragmentManager=this.getSupportFragmentManager()
            val fragmentTransaction=fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container,fragment)
                .addToBackStack(null)
                .commit()

        }

        birdButton.setOnClickListener{
            val fragment=birdFragment()
            val fragmentManager=this.getSupportFragmentManager()
            val fragmentTransaction=fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container,fragment)
                .addToBackStack(null)
                .commit()

        }

        monkeyButton.setOnClickListener{
            val fragment=monkeyFragment()
            val fragmentManager=this.getSupportFragmentManager()
            val fragmentTransaction=fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container,fragment)
                .addToBackStack(null)
                .commit()

        }

        val fragment=titleFragment as? TitleFragment
        fragment?.setTitle("図鑑画面")
    }
}
