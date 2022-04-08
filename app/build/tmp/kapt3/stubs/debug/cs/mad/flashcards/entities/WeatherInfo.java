package cs.mad.flashcards.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b#\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\rR\u001a\u0010&\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0011\"\u0004\b(\u0010\u0013R\u001a\u0010)\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010\u0013R\u001a\u0010,\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010\rR\u001a\u0010/\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\r\u00a8\u00062"}, d2 = {"Lcs/mad/flashcards/entities/WeatherInfo;", "", "()V", "base", "", "getBase", "()Ljava/lang/String;", "setBase", "(Ljava/lang/String;)V", "clouds", "getClouds", "()Ljava/lang/Object;", "setClouds", "(Ljava/lang/Object;)V", "cod", "", "getCod", "()I", "setCod", "(I)V", "coord", "getCoord", "setCoord", "dt", "getDt", "setDt", "id", "getId", "setId", "main", "getMain", "setMain", "name", "getName", "setName", "sys", "getSys", "setSys", "timezone", "getTimezone", "setTimezone", "visibility", "getVisibility", "setVisibility", "weather", "getWeather", "setWeather", "wind", "getWind", "setWind", "app_debug"})
public final class WeatherInfo {
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object coord;
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object weather;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String base = "N/A";
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object main;
    private int visibility = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object wind;
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object clouds;
    private int dt = 1560350645;
    @org.jetbrains.annotations.NotNull()
    private java.lang.Object sys;
    private int timezone = -25200;
    private int id = 420006353;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name = "Mountain View";
    private int cod = 200;
    
    public WeatherInfo() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCoord() {
        return null;
    }
    
    public final void setCoord(@org.jetbrains.annotations.NotNull()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getWeather() {
        return null;
    }
    
    public final void setWeather(@org.jetbrains.annotations.NotNull()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBase() {
        return null;
    }
    
    public final void setBase(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getMain() {
        return null;
    }
    
    public final void setMain(@org.jetbrains.annotations.NotNull()
    java.lang.Object p0) {
    }
    
    public final int getVisibility() {
        return 0;
    }
    
    public final void setVisibility(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getWind() {
        return null;
    }
    
    public final void setWind(@org.jetbrains.annotations.NotNull()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getClouds() {
        return null;
    }
    
    public final void setClouds(@org.jetbrains.annotations.NotNull()
    java.lang.Object p0) {
    }
    
    public final int getDt() {
        return 0;
    }
    
    public final void setDt(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSys() {
        return null;
    }
    
    public final void setSys(@org.jetbrains.annotations.NotNull()
    java.lang.Object p0) {
    }
    
    public final int getTimezone() {
        return 0;
    }
    
    public final void setTimezone(int p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getCod() {
        return 0;
    }
    
    public final void setCod(int p0) {
    }
}