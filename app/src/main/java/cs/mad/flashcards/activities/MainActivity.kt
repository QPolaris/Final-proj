package cs.mad.flashcards.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cs.mad.flashcards.adapters.FlashcardSetAdapter
import cs.mad.flashcards.databinding.ActivityMainBinding
import cs.mad.flashcards.entities.FlashcardSet

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.flashcardSetList.adapter = FlashcardSetAdapter(FlashcardSet.getHardcodedFlashcardSets())

        binding.createSetButton.setOnClickListener {
            (binding.flashcardSetList.adapter as FlashcardSetAdapter).addItem(FlashcardSet("test"))
            binding.flashcardSetList.smoothScrollToPosition((binding.flashcardSetList.adapter as FlashcardSetAdapter).itemCount - 1)
        }
    }
}