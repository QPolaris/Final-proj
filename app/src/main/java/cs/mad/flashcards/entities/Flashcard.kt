package cs.mad.flashcards.entities


data class Flashcard(
    val question: String,
    val answer: String
) {
    companion object {
        fun getHardcodedFlashcards(): List<Flashcard> {
            val cards = mutableListOf<Flashcard>()
            for (i in 1..10) {
                cards.add(Flashcard("Term $i", "Def $i"))
            }
            return cards
        }
    }
}