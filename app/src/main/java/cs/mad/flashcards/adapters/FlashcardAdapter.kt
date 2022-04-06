package cs.mad.flashcards.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import cs.mad.flashcards.R
import cs.mad.flashcards.entities.Flashcard

class FlashcardAdapter(dataSet: List<Flashcard>) :
    RecyclerView.Adapter<FlashcardAdapter.ViewHolder>() {

    private val dataSet = mutableListOf<Flashcard>()

    init {
        this.dataSet.addAll(dataSet)
    }

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val flashcardTitle: TextView = view.findViewById(R.id.flashcard_title)
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_flashcard, viewGroup, false)
        )
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val item = dataSet[position]
        viewHolder.flashcardTitle.text = item.question
        viewHolder.itemView.setOnClickListener {
            AlertDialog.Builder(it.context)
                    .setTitle(item.question)
                    .setMessage(item.answer)
                    .setPositiveButton("Done") { _,_ -> }
                    .setNeutralButton("Edit") { _, _ -> showEditDialog(it.context, item) }
                    .create()
                    .show()
        }
        viewHolder.itemView.setOnLongClickListener {
            showEditDialog(it.context, item)
            true
        }
    }

    private fun showEditDialog(context: Context, flashcard: Flashcard) {
        val customTitle = EditText(context)
        val customBody = EditText(context)
        customTitle.setText(flashcard.question)
        customBody.setText(flashcard.answer)
        AlertDialog.Builder(context)
                .setCustomTitle(customTitle)
                .setView(customBody)
                .setPositiveButton("Done") { _,_ -> }
                .setNegativeButton("Delete") { _,_ -> }
                .create()
                .show()
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    fun addItem(it: Flashcard) {
        dataSet.add(it)
        notifyItemInserted(dataSet.lastIndex)
    }
}