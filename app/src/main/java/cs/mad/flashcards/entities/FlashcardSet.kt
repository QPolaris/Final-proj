package cs.mad.flashcards.entities

data class FlashcardSet(val title: String, val id: Long? = null) {
    companion object {
        fun getHardcodedFlashcardSets(): List<FlashcardSet> {
            val sets = mutableListOf<FlashcardSet>()
            for (i in 1..10) {
                sets.add(FlashcardSet("Set $i"))
            }
            return sets
        }
    }
}