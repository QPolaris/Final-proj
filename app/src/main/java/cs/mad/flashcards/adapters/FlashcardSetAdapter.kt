package cs.mad.flashcards.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cs.mad.flashcards.activities.FlashcardSetDetailActivity
import cs.mad.flashcards.databinding.ItemFlashcardSetBinding
import cs.mad.flashcards.entities.Flashcard
import cs.mad.flashcards.entities.FlashcardSet

class FlashcardSetAdapter(dataSet: List<FlashcardSet>) :
    RecyclerView.Adapter<FlashcardSetAdapter.ViewHolder>() {

    private val dataSet = mutableListOf<FlashcardSet>()

    init {
        this.dataSet.addAll(dataSet)
    }

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(bind: ItemFlashcardSetBinding) : RecyclerView.ViewHolder(bind.root) {
        val binding: ItemFlashcardSetBinding = bind
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemFlashcardSetBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
        binding.root.minimumHeight = viewGroup.height / 5
        return ViewHolder(binding)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val item = dataSet[position]
        viewHolder.binding.flashcardSetTitle.text = item.title
        viewHolder.binding.root.setOnClickListener {
            viewHolder.itemView.context.startActivity(Intent(viewHolder.itemView.context, FlashcardSetDetailActivity::class.java))
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    fun addItem(it: FlashcardSet) {
        dataSet.add(it)
        notifyItemInserted(dataSet.lastIndex)
    }
}