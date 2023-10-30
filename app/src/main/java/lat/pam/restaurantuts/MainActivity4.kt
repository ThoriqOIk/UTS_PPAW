package lat.pam.restaurantuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val btndone = findViewById<Button>(R.id.button_done)
        btndone.setOnClickListener {
            // Create an Intent to switch to the new layout (menupage)
            Toast.makeText(this, "Terima kasih Pa Asep sudah memesan \n" +
                    "ditoko kami, pesanan Pepperoni Pizza \n" +
                    "anda dikirim menggunakan Fast Delivery ", Toast.LENGTH_SHORT).show()
        }
    }
    fun onRadioButtonClicked(view: View) {
        // Is the button now checked?
        val checked = (view as RadioButton).isChecked
        when (view.getId()) {
            R.id.radio1 -> if (checked) // Same day service
                displayToast(getString(R.string.radio1))


            R.id.radio2 -> if (checked) // Next day delivery
                displayToast(getString(R.string.radio2))



            else -> {}
        }

    }


    private fun displayToast(message: String) {
        Toast.makeText(
            applicationContext, message,
            Toast.LENGTH_SHORT
        ).show()
    }

}
