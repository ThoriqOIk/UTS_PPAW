package lat.pam.restaurantuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val btnorder = findViewById<Button>(R.id.button_first)
        btnorder.setOnClickListener {
            // Create an Intent to switch to the new layout (menupage)
            val intent = Intent(this, MainActivity4 ::class.java)
            startActivity(intent)
        }
        val btnback = findViewById<Button>(R.id.button_seond)
        btnback.setOnClickListener {
            // Create an Intent to switch to the new layout (menupage)
            val intent = Intent(this, MainActivity3 ::class.java)
            startActivity(intent)
        }
    }
}