package com.mapbox.api.directions.v5.models;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class VoiceInstructions extends DirectionsJsonObject {

    /* JADX INFO: loaded from: classes4.dex */
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract Builder announcement(String str);

        public abstract VoiceInstructions build();

        public abstract Builder distanceAlongGeometry(Double d);

        public abstract Builder ssmlAnnouncement(String str);
    }

    public abstract String announcement();

    public abstract Double distanceAlongGeometry();

    public abstract String ssmlAnnouncement();

    public static Builder builder() {
        return new C$AutoValue_VoiceInstructions.Builder();
    }

    public static TypeAdapter<VoiceInstructions> typeAdapter(Gson gson) {
        return new AutoValue_VoiceInstructions.GsonTypeAdapter(gson);
    }
}
