package com.example.firstandroidappchallenge

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    internal lateinit var tapMeButton1: Button
    internal lateinit var tapMeButton2: Button
    internal lateinit var tapMeButton3: Button
    internal lateinit var tapMeButton4: Button
    internal lateinit var tapMeButton5: Button
    internal lateinit var tapMeButton6: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tapMeButton1 = findViewById(R.id.tapME1)
        tapMeButton2 = findViewById(R.id.tapME2)
        tapMeButton3 = findViewById(R.id.tapME3)
        tapMeButton4 = findViewById(R.id.tapME4)
        tapMeButton5 = findViewById(R.id.tapME5)
        tapMeButton6 = findViewById(R.id.tapME6)


        tapMeButton1.setOnClickListener{
            Toast.makeText(this,"Black like chicken noodle soup.", Toast.LENGTH_SHORT).show()
        }

        tapMeButton2.setOnClickListener{
            Toast.makeText(this,"The kind you eat. (chicken)", Toast.LENGTH_SHORT).show()
        }

        tapMeButton3.setOnClickListener{
            Toast.makeText(this,"The Office.", Toast.LENGTH_SHORT).show()
        }

        tapMeButton4.setOnClickListener{
            Toast.makeText(this,"The one who cut off his ear. (Vincent Van Gogh)", Toast.LENGTH_SHORT).show()
        }

        tapMeButton5.setOnClickListener{
            Toast.makeText(this,"Wet ness day. (Wednesday)", Toast.LENGTH_SHORT).show()
        }

        tapMeButton6.setOnClickListener{
            Toast.makeText(this,"Winter.", Toast.LENGTH_SHORT).show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.actionAbout) {
            showInfo()
        }
        return true
    }

    @SuppressLint("StringFormatInvalid")
    private fun showInfo() {
        val dialogTitle = getString(R.string.aboutTitle, BuildConfig.VERSION_NAME)
        val dialogMessage = getString(R.string.aboutMessage)

        val builder = AlertDialog.Builder(this)
        builder.setTitle(dialogTitle)
        builder.setMessage(dialogMessage)
        builder.create().show()
    }

}
