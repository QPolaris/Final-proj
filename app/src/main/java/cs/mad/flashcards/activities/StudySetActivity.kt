package cs.mad.flashcards.activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cs.mad.flashcards.databinding.ActivityStudySetBinding
import cs.mad.flashcards.entities.Flashcard

@SuppressLint("SetTextI18n")
class StudySetActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStudySetBinding
    private val flashcards = Flashcard.getHardcodedFlashcards().toMutableList()
    private val missedCards = mutableListOf<Flashcard>()
    private val initialCount = flashcards.size
    private var completedCount = 0
    private val missedCount
        get() = missedCards.size
    private var correctCount = 0
    private var isCardFlipped = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudySetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateCard()
        updateCompletedText()
        setupButtons()
        binding.cardView.setOnClickListener {
            flipCard()
        }
    }

    private fun missCurrent() {
        val current = flashcards.removeFirst()
        missedCards.add(current)
        flashcards.add(current)
        updateMissedText()
        isCardFlipped = false
        updateCard()
    }

    private fun skipCurrent() {
        val current = flashcards.removeFirst()
        flashcards.add(current)
        isCardFlipped = false
        updateCard()
    }

    private fun markCorrectCurrent() {
        val current = flashcards.removeFirst()
        completedCount += 1
        updateCompletedText()

        if (!missedCards.contains(current)) {
            correctCount += 1
            updateCorrectText()
        }
        if (flashcards.size == 0) {
            binding.flashcardSetTitle.text = "Finished!"
            binding.missedButton.isEnabled = false
            binding.skipButton.isEnabled = false
            binding.correctButton.isEnabled = false
            binding.cardView.setOnClickListener {  }
        } else {
            isCardFlipped = false
            updateCard()
        }
    }

    private fun flipCard() {
        if (flashcards.isNotEmpty()) {
            isCardFlipped = !isCardFlipped
            updateCard()
        }
    }

    private fun updateCard() {
        if (isCardFlipped) {
            binding.flashcardSetTitle.text = flashcards[0].answer
        } else {
            binding.flashcardSetTitle.text = flashcards[0].question
        }
    }

    private fun updateCompletedText() {
        binding.completedCountText.text = "$completedCount / $initialCount"
    }

    private fun updateMissedText() {
        binding.missedCountText.text = "Missed: $missedCount"
    }

    private fun updateCorrectText() {
        binding.correctCountText.text = "Correct: $correctCount"
    }

    private fun setupButtons() {
        binding.exitButton.setOnClickListener { finish() }
        binding.missedButton.setOnClickListener { missCurrent() }
        binding.skipButton.setOnClickListener { skipCurrent() }
        binding.correctButton.setOnClickListener { markCorrectCurrent() }
    }
}