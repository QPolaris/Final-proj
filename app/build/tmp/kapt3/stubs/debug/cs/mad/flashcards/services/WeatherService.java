package cs.mad.flashcards.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcs/mad/flashcards/services/WeatherService;", "", "()V", "retrofit", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "getRetrofit", "()Lretrofit2/Retrofit;", "weatherService", "Lcs/mad/flashcards/services/WeatherService$IWeatherService;", "getWeatherService", "()Lcs/mad/flashcards/services/WeatherService$IWeatherService;", "Companion", "IWeatherService", "app_debug"})
public final class WeatherService {
    @org.jetbrains.annotations.NotNull()
    public static final cs.mad.flashcards.services.WeatherService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String API_KEY = "0af6e62f4ea0c9d0d46f5e69e763805d";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL = "http://api.openweathermap.org";
    private final retrofit2.Retrofit retrofit = null;
    private final cs.mad.flashcards.services.WeatherService.IWeatherService weatherService = null;
    
    public WeatherService() {
        super();
    }
    
    public final retrofit2.Retrofit getRetrofit() {
        return null;
    }
    
    public final cs.mad.flashcards.services.WeatherService.IWeatherService getWeatherService() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\'J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\tH\'\u00a8\u0006\r"}, d2 = {"Lcs/mad/flashcards/services/WeatherService$IWeatherService;", "", "getWeatherByCoord", "Lretrofit2/Call;", "Lcs/mad/flashcards/entities/WeatherInfo;", "lat", "", "lon", "API_KEY", "", "getWeatherInfo", "zipCode", "", "app_debug"})
    public static abstract interface IWeatherService {
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "weather?us&units=imperial")
        public abstract retrofit2.Call<cs.mad.flashcards.entities.WeatherInfo> getWeatherInfo(@retrofit2.http.Query(value = "zip")
        int zipCode, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "appid")
        java.lang.String API_KEY);
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "weather?us&units=imperial")
        public abstract retrofit2.Call<cs.mad.flashcards.entities.WeatherInfo> getWeatherByCoord(@retrofit2.http.Query(value = "lat")
        double lat, @retrofit2.http.Query(value = "lon")
        double lon, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "appid")
        java.lang.String API_KEY);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcs/mad/flashcards/services/WeatherService$Companion;", "", "()V", "API_KEY", "", "getAPI_KEY", "()Ljava/lang/String;", "BASE_URL", "getBASE_URL", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAPI_KEY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBASE_URL() {
            return null;
        }
    }
}