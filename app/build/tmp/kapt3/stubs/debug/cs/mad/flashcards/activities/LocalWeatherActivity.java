package cs.mad.flashcards.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u001e\u0010\u001e\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\rH\u0016J-\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u00112\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\'2\u0006\u0010(\u001a\u00020)H\u0016\u00a2\u0006\u0002\u0010*J$\u0010+\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030 2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030-H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006."}, d2 = {"Lcs/mad/flashcards/activities/LocalWeatherActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lretrofit2/Callback;", "Lcs/mad/flashcards/entities/WeatherInfo;", "Landroid/location/LocationListener;", "()V", "API_KEY", "", "getAPI_KEY", "()Ljava/lang/String;", "binding", "Lcs/mad/flashcards/databinding/ActivityLocalWeatherBinding;", "location", "Landroid/location/Location;", "locationManager", "Landroid/location/LocationManager;", "locationPermissionCode", "", "service", "Lcs/mad/flashcards/services/WeatherService;", "zipCode", "getZipCode", "()I", "setZipCode", "(I)V", "getLocation", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFailure", "call", "Lretrofit2/Call;", "t", "", "onLocationChanged", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResponse", "response", "Lretrofit2/Response;", "app_debug"})
public final class LocalWeatherActivity extends androidx.appcompat.app.AppCompatActivity implements retrofit2.Callback<cs.mad.flashcards.entities.WeatherInfo>, android.location.LocationListener {
    private android.location.LocationManager locationManager;
    private cs.mad.flashcards.databinding.ActivityLocalWeatherBinding binding;
    private final int locationPermissionCode = 2;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String API_KEY = "0af6e62f4ea0c9d0d46f5e69e763805d";
    private int zipCode = 35218;
    private cs.mad.flashcards.services.WeatherService service;
    private android.location.Location location;
    
    public LocalWeatherActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAPI_KEY() {
        return null;
    }
    
    public final int getZipCode() {
        return 0;
    }
    
    public final void setZipCode(int p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getLocation() {
    }
    
    @java.lang.Override()
    public void onLocationChanged(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
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