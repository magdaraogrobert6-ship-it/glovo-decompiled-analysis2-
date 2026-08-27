package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class EventsMetadata implements Serializable {
    private final AppMetadata appMetadata;
    private final AudioType audioType;
    private final Byte batteryLevel;
    private final Boolean batteryPluggedIn;
    private final String connectivity;
    private final Byte percentTimeInForeground;
    private final Byte percentTimeInPortrait;
    private final Byte screenBrightness;
    private final Byte volumeLevel;

    public AppMetadata getAppMetadata() {
        return this.appMetadata;
    }

    public AudioType getAudioType() {
        return this.audioType;
    }

    public Byte getBatteryLevel() {
        return this.batteryLevel;
    }

    public Boolean getBatteryPluggedIn() {
        return this.batteryPluggedIn;
    }

    public String getConnectivity() {
        return this.connectivity;
    }

    public Byte getPercentTimeInForeground() {
        return this.percentTimeInForeground;
    }

    public Byte getPercentTimeInPortrait() {
        return this.percentTimeInPortrait;
    }

    public Byte getScreenBrightness() {
        return this.screenBrightness;
    }

    public Byte getVolumeLevel() {
        return this.volumeLevel;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.volumeLevel, this.audioType, this.screenBrightness, this.percentTimeInForeground, this.percentTimeInPortrait, this.batteryPluggedIn, this.batteryLevel, this.connectivity, this.appMetadata);
    }

    public EventsMetadata(Byte b, AudioType audioType, Byte b2, Byte b3, Byte b4, Boolean bool, Byte b5, String str, AppMetadata appMetadata) {
        this.volumeLevel = b;
        this.audioType = audioType;
        this.screenBrightness = b2;
        this.percentTimeInForeground = b3;
        this.percentTimeInPortrait = b4;
        this.batteryPluggedIn = bool;
        this.batteryLevel = b5;
        this.connectivity = str;
        this.appMetadata = appMetadata;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[volumeLevel: ");
        sb.append(RecordUtils.fieldToString(this.volumeLevel));
        sb.append(", audioType: ");
        sb.append(RecordUtils.fieldToString(this.audioType));
        sb.append(", screenBrightness: ");
        sb.append(RecordUtils.fieldToString(this.screenBrightness));
        sb.append(", percentTimeInForeground: ");
        sb.append(RecordUtils.fieldToString(this.percentTimeInForeground));
        sb.append(", percentTimeInPortrait: ");
        sb.append(RecordUtils.fieldToString(this.percentTimeInPortrait));
        sb.append(", batteryPluggedIn: ");
        getBitmapFromCache.write(sb, ", batteryLevel: ", this.batteryPluggedIn);
        sb.append(RecordUtils.fieldToString(this.batteryLevel));
        sb.append(", connectivity: ");
        IconCompatParcelizer.read(sb, this.connectivity, ", appMetadata: ");
        sb.append(RecordUtils.fieldToString(this.appMetadata));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventsMetadata eventsMetadata = (EventsMetadata) obj;
        return Objects.equals(this.volumeLevel, eventsMetadata.volumeLevel) && Objects.equals(this.audioType, eventsMetadata.audioType) && Objects.equals(this.screenBrightness, eventsMetadata.screenBrightness) && Objects.equals(this.percentTimeInForeground, eventsMetadata.percentTimeInForeground) && Objects.equals(this.percentTimeInPortrait, eventsMetadata.percentTimeInPortrait) && Objects.equals(this.batteryPluggedIn, eventsMetadata.batteryPluggedIn) && Objects.equals(this.batteryLevel, eventsMetadata.batteryLevel) && Objects.equals(this.connectivity, eventsMetadata.connectivity) && Objects.equals(this.appMetadata, eventsMetadata.appMetadata);
    }
}
