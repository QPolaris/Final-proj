package cs.mad.flashcards.activities;

import java.lang.System;

@android.annotation.SuppressLint(value = {"SetTextI18n"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001f"}, d2 = {"Lcs/mad/flashcards/activities/StudySetActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcs/mad/flashcards/databinding/ActivityStudySetBinding;", "completedCount", "", "correctCount", "flashcards", "", "Lcs/mad/flashcards/entities/Flashcard;", "initialCount", "isCardFlipped", "", "missedCards", "missedCount", "getMissedCount", "()I", "flipCard", "", "markCorrectCurrent", "missCurrent", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupButtons", "skipCurrent", "updateCard", "updateCompletedText", "updateCorrectText", "updateMissedText", "app_debug"})
public final class StudySetActivity extends androidx.appcompat.app.AppCompatActivity {
    private cs.mad.flashcards.databinding.ActivityStudySetBinding binding;
    private final java.util.List<cs.mad.flashcards.entities.Flashcard> flashcards = null;
    private final java.util.List<cs.mad.flashcards.entities.Flashcard> missedCards = null;
    private final int initialCount = 0;
    private int completedCount = 0;
    private int correctCount = 0;
    private boolean isCardFlipped = false;
    
    public StudySetActivity() {
        super();
    }
    
    private final int getMissedCount() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void missCurrent() {
    }
    
    private final void skipCurrent() {
    }
    
    private final void markCorrectCurrent() {
    }
    
    private final void flipCard() {
    }
    
    private final void updateCard() {
    }
    
    private final void updateCompletedText() {
    }
    
    private final void updateMissedText() {
    }
    
    private final void updateCorrectText() {
    }
    
    private final void setupButtons() {
    }
}