package lat.pam.restaurantuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btnKirim = findViewById<Button>(R.id.button_second)
        btnKirim.setOnClickListener {
            // Create an Intent to switch to the new layout (menupage)
            val intent = Intent(this, MainActivity3 ::class.java)
            startActivity(intent)
        }
    }
}