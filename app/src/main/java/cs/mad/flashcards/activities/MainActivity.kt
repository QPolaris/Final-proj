package cs.mad.flashcards.activities

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import androidx.appcompat.app.AppCompatActivity
import cs.mad.flashcards.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var zipcode = 59601

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.localWeatherButton.setOnClickListener {
            binding.root.context.startActivity(Intent(binding.root.context, LocalWeatherActivity::class.java))
        }
        binding.zipCodeButton.setOnClickListener {
            zipcode = binding.zipInput.text.toString().toInt()
            val i = Intent(binding.root.context, InputWeatherActivity::class.java)
            i.putExtra("key", zipcode)
            binding.root.context.startActivity(i)
        }
    }
}