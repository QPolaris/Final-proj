package cs.mad.flashcards.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cs.mad.flashcards.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.localWeatherButton.setOnClickListener {
            binding.root.context.startActivity(Intent(binding.root.context, LocalWeatherActivity::class.java))
        }
    }
}