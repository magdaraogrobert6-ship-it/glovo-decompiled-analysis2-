package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BannerComponents extends DirectionsJsonObject implements Comparable<BannerComponents> {

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.CLASS)
    public @interface BannerComponentsSubType {
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.CLASS)
    public @interface BannerComponentsType {
    }

    @SerializedName("abbr")
    public abstract String abbreviation();

    @SerializedName("abbr_priority")
    public abstract Integer abbreviationPriority();

    public abstract Boolean active();

    @SerializedName("active_direction")
    public abstract String activeDirection();

    public abstract List<String> directions();

    @SerializedName("imageBaseURL")
    public abstract String imageBaseUrl();

    @SerializedName("imageURL")
    public abstract String imageUrl();

    @SerializedName("mapbox_shield")
    public abstract MapboxShield mapboxShield();

    @BannerComponentsSubType
    public abstract String subType();

    public abstract String text();

    @BannerComponentsType
    public abstract String type();

    public static TypeAdapter<BannerComponents> typeAdapter(Gson gson) {
        return new AutoValue_BannerComponents.GsonTypeAdapter(gson);
    }

    @Override // java.lang.Comparable
    public int compareTo(BannerComponents bannerComponents) {
        Integer numAbbreviationPriority = abbreviationPriority();
        Integer numAbbreviationPriority2 = bannerComponents.abbreviationPriority();
        if (numAbbreviationPriority == null && numAbbreviationPriority2 == null) {
            return 0;
        }
        if (numAbbreviationPriority == null) {
            return 1;
        }
        if (numAbbreviationPriority2 == null) {
            return -1;
        }
        return numAbbreviationPriority.compareTo(numAbbreviationPriority2);
    }
}
