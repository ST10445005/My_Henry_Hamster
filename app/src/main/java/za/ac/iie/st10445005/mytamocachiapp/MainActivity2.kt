package za.ac.iie.st10445005.mytamocachiapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity2 : ComponentActivity() {
    private var petHealth = 100
    private var petHunger = 50
    private var petJoy = 50
    private var petCleanliness = 50

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Set the buttons and text views
        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val txtHunger = findViewById<EditText>(R.id.txtHunger)
        val txtJoy = findViewById<EditText>(R.id.txtJoy)
        val txtCleanliness = findViewById<EditText>(R.id.txtClean)
        val petImage = findViewById<ImageView>(R.id.petImage)

        // Set the initial text values
        txtHunger.setText(petHunger.toString())
        txtJoy.setText(petJoy.toString())
        txtCleanliness.setText(petCleanliness.toString())

        // Handle button clicks
        btnFeed.setOnClickListener {
            petHunger += 10
            petJoy += 10
            petCleanliness += 5
            txtHunger.setText(petHunger.toString())
            txtJoy.setText(petJoy.toString())
            txtCleanliness.setText(petCleanliness.toString())
            animateImageChange(petImage, R.drawable.pic1_eat)
        }

        btnClean.setOnClickListener {
            petCleanliness += 10
            petJoy += 10
            txtCleanliness.setText(petCleanliness.toString())
            txtJoy.setText(petJoy.toString())
            animateImageChange(petImage, R.drawable.pic3_wash)
        }

        btnPlay.setOnClickListener {
            petJoy += 10
            petHunger += 5
            petCleanliness -= 5
            txtJoy.setText(petJoy.toString())
            txtHunger.setText(petHunger.toString())
            txtCleanliness.setText(petCleanliness.toString())
            animateImageChange(petImage, R.drawable.pic2_playing)
        }
    }
}


