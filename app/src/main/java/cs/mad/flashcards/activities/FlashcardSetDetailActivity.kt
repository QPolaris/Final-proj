package cs.mad.flashcards.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cs.mad.flashcards.adapters.FlashcardAdapter
import cs.mad.flashcards.databinding.ActivityFlashcardSetDetailBinding
import cs.mad.flashcards.entities.Flashcard

class FlashcardSetDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFlashcardSetDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFlashcardSetDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.flashcardList.adapter = FlashcardAdapter(Flashcard.getHardcodedFlashcards())

        binding.addFlashcardButton.setOnClickListener {
            (binding.flashcardList.adapter as FlashcardAdapter).addItem(Flashcard("test", "test"))
                binding.flashcardList.smoothScrollToPosition((binding.flashcardList.adapter as FlashcardAdapter).itemCount - 1)
        }

        binding.studySetButton.setOnClickListener {
            startActivity(Intent(this, StudySetActivity::class.java))
        }
    }
}