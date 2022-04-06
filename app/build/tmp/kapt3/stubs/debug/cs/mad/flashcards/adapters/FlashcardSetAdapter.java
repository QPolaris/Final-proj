package cs.mad.flashcards.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcs/mad/flashcards/adapters/FlashcardSetAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcs/mad/flashcards/adapters/FlashcardSetAdapter$ViewHolder;", "dataSet", "", "Lcs/mad/flashcards/entities/FlashcardSet;", "(Ljava/util/List;)V", "", "addItem", "", "it", "getItemCount", "", "onBindViewHolder", "viewHolder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class FlashcardSetAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<cs.mad.flashcards.adapters.FlashcardSetAdapter.ViewHolder> {
    private final java.util.List<cs.mad.flashcards.entities.FlashcardSet> dataSet = null;
    
    public FlashcardSetAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<cs.mad.flashcards.entities.FlashcardSet> dataSet) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cs.mad.flashcards.adapters.FlashcardSetAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    cs.mad.flashcards.adapters.FlashcardSetAdapter.ViewHolder viewHolder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void addItem(@org.jetbrains.annotations.NotNull()
    cs.mad.flashcards.entities.FlashcardSet it) {
    }
    
    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcs/mad/flashcards/adapters/FlashcardSetAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "bind", "Lcs/mad/flashcards/databinding/ItemFlashcardSetBinding;", "(Lcs/mad/flashcards/databinding/ItemFlashcardSetBinding;)V", "binding", "getBinding", "()Lcs/mad/flashcards/databinding/ItemFlashcardSetBinding;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final cs.mad.flashcards.databinding.ItemFlashcardSetBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        cs.mad.flashcards.databinding.ItemFlashcardSetBinding bind) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final cs.mad.flashcards.databinding.ItemFlashcardSetBinding getBinding() {
            return null;
        }
    }
}