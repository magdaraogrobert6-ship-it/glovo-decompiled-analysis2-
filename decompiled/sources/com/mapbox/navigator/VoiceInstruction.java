package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceInstruction implements Serializable {
    private final String announcement;
    private final int index;
    private final float remainingStepDistance;
    private final String ssmlAnnouncement;

    public String getAnnouncement() {
        return this.announcement;
    }

    public int getIndex() {
        return this.index;
    }

    public float getRemainingStepDistance() {
        return this.remainingStepDistance;
    }

    public String getSsmlAnnouncement() {
        return this.ssmlAnnouncement;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.ssmlAnnouncement, this.announcement, Float.valueOf(this.remainingStepDistance), Integer.valueOf(this.index));
    }

    public VoiceInstruction(String str, String str2, float f, int i) {
        this.ssmlAnnouncement = str;
        this.announcement = str2;
        this.remainingStepDistance = f;
        this.index = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ssmlAnnouncement: ");
        IconCompatParcelizer.read(sb, this.ssmlAnnouncement, ", announcement: ");
        IconCompatParcelizer.read(sb, this.announcement, ", remainingStepDistance: ");
        getBitmapFromCache.write(this.remainingStepDistance, ", index: ", sb);
        return SweepGradientShader9KIMszodefault.serializer(this.index, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VoiceInstruction voiceInstruction = (VoiceInstruction) obj;
        return Objects.equals(this.ssmlAnnouncement, voiceInstruction.ssmlAnnouncement) && Objects.equals(this.announcement, voiceInstruction.announcement) && PartialEq.compare(this.remainingStepDistance, voiceInstruction.remainingStepDistance) && this.index == voiceInstruction.index;
    }
}
