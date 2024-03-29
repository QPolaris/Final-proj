package cs.mad.flashcards.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u001e\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018H\u0017R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcs/mad/flashcards/activities/AdvancedStats;", "Landroidx/appcompat/app/AppCompatActivity;", "Lretrofit2/Callback;", "Lcs/mad/flashcards/entities/WeatherInfo;", "()V", "API_KEY", "", "getAPI_KEY", "()Ljava/lang/String;", "binding", "Lcs/mad/flashcards/databinding/ActivityAdvancedStatsBinding;", "service", "Lcs/mad/flashcards/services/WeatherService;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onFailure", "call", "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_debug"})
public final class AdvancedStats extends androidx.appcompat.app.AppCompatActivity implements retrofit2.Callback<cs.mad.flashcards.entities.WeatherInfo> {
    private cs.mad.flashcards.databinding.ActivityAdvancedStatsBinding binding;
    private cs.mad.flashcards.services.WeatherService service;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String API_KEY = "0af6e62f4ea0c9d0d46f5e69e763805d";
    
    public AdvancedStats() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAPI_KEY() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public void onResponse(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<cs.mad.flashcards.entities.WeatherInfo> call, @org.jetbrains.annotations.NotNull()
    retrofit2.Response<cs.mad.flashcards.entities.WeatherInfo> response) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<cs.mad.flashcards.entities.WeatherInfo> call, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable t) {
    }
}