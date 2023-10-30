package lat.pam.restaurantuts

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val image_view = findViewById(R.id.pizza) as ImageView
// set on-click listener for ImageView
        image_view.setOnClickListener {
            val intent = Intent(this, MainActivity5 ::class.java)
            startActivity(intent)
        }


        }
    }
