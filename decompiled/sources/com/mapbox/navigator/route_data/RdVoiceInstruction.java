package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes5.dex */
public class RdVoiceInstruction implements Serializable {
    private final String announcement;
    private final float distanceAlongGeometry;
    private final String ssmlAnnouncement;

    public String getAnnouncement() {
        return this.announcement;
    }

    public float getDistanceAlongGeometry() {
        return this.distanceAlongGeometry;
    }

    public String getSsmlAnnouncement() {
        return this.ssmlAnnouncement;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdVoiceInstruction(float f, String str, String str2) {
        this.distanceAlongGeometry = f;
        this.announcement = str;
        this.ssmlAnnouncement = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[distanceAlongGeometry: ");
        getBitmapFromCache.write(this.distanceAlongGeometry, ", announcement: ", sb);
        IconCompatParcelizer.read(sb, this.announcement, ", ssmlAnnouncement: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.ssmlAnnouncement, "]");
    }

    public int hashCode() {
        float f = this.distanceAlongGeometry;
        return Objects.hash(Float.valueOf(f), this.announcement, this.ssmlAnnouncement);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RdVoiceInstruction rdVoiceInstruction = (RdVoiceInstruction) obj;
        return PartialEq.compare(this.distanceAlongGeometry, rdVoiceInstruction.distanceAlongGeometry) && Objects.equals(this.announcement, rdVoiceInstruction.announcement) && Objects.equals(this.ssmlAnnouncement, rdVoiceInstruction.ssmlAnnouncement);
    }
}
