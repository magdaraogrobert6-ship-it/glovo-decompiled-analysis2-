package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum WeatherDetail {
    CLEAR(0, "Clear"),
    CLOUDY(1, "Cloudy"),
    FEW_CLOUDS(2, "FewClouds"),
    PARTLY_CLOUDY(3, "PartlyCloudy"),
    OVERCAST(4, "Overcast"),
    WINDY(5, "Windy"),
    CALM(6, "Calm"),
    LIGHT_BREEZE(7, "LightBreeze"),
    GENTLE_BREEZE(8, "GentleBreeze"),
    FRESH_BREEZE(9, "FreshBreeze"),
    STRONG_BREEZE(10, "StrongBreeze"),
    HIGH_WIND(11, "HighWind"),
    GALE(12, "Gale"),
    STRONG_GALE(13, "StrongGale"),
    STORM(14, "Storm"),
    VIOLENT_STORM(15, "ViolentStorm"),
    HURRICANE(16, "Hurricane"),
    TORNADO(17, "Tornado"),
    TROPICAL_STORM(18, "TropicalStorm"),
    SHOWER_RAIN(19, "ShowerRain"),
    HEAVY_SHOWER_RAIN(20, "HeavyShowerRain"),
    THUNDERSHOWER(21, "Thundershower"),
    HEAVY_THUNDERSTORM(22, "HeavyThunderstorm"),
    HAIL(23, "Hail"),
    LIGHT_RAIN(24, "LightRain"),
    MODERATE_RAIN(25, "ModerateRain"),
    HEAVY_RAIN(26, "HeavyRain"),
    EXTREME_RAIN(27, "ExtremeRain"),
    DRIZZLE_RAIN(28, "DrizzleRain"),
    RAIN_STORM(29, "RainStorm"),
    HEAVY_STORM(30, "HeavyStorm"),
    SEVERE_STORM(31, "SevereStorm"),
    FREEZING_RAIN(32, "FreezingRain"),
    LIGHT_SNOW(33, "LightSnow"),
    MODERATE_SNOW(34, "ModerateSnow"),
    HEAVY_SNOW(35, "HeavySnow"),
    SNOWSTORM(36, "Snowstorm"),
    SLEET(37, "Sleet"),
    RAIN_AND_SNOW(38, "RainAndSnow"),
    SHOWER_SNOW(39, "ShowerSnow"),
    SNOW_FLURRY(40, "SnowFlurry"),
    MIST(41, "Mist"),
    FOGGY(42, "Foggy"),
    HAZE(43, "Haze"),
    SAND(44, "Sand"),
    DUST(45, "Dust"),
    DUSTSTORM(46, "Duststorm"),
    SANDSTORM(47, "Sandstorm"),
    HOT(48, "Hot"),
    COLD(49, "Cold"),
    ICE_PARTICLES(50, "IceParticles"),
    ICE_NEEDLE(51, "IceNeedle"),
    UNKNOWN(127, "Unknown");

    private String str;
    public final int value;

    private int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    WeatherDetail(int i, String str) {
        this.value = i;
        this.str = str;
    }
}
