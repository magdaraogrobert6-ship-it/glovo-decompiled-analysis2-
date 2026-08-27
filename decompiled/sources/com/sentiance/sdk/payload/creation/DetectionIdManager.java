package com.sentiance.sdk.payload.creation;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.util.c;
import java.io.File;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.UUID;
import o.parseLonglambda0;
import o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "DetectionIdManager", componentName = "DetectionIdManager")
public class DetectionIdManager implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final parseLonglambda0 IconCompatParcelizer;
    private final c read;
    private final EnumMap write = new EnumMap(Detection.class);

    public final String IconCompatParcelizer(Detection detection) {
        String string;
        synchronized (this) {
            string = (String) this.write.get(detection);
            if (string == null) {
                string = UUID.randomUUID().toString();
                this.IconCompatParcelizer.IconCompatParcelizer("Creating new id for %s: %s", detection.name(), string);
                IconCompatParcelizer(detection, string);
            } else {
                this.IconCompatParcelizer.IconCompatParcelizer("Use existing id for %s: %s", detection.name(), string);
            }
        }
        return string;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        synchronized (this) {
            this.read.read();
            this.write.clear();
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    public final void serializer(Detection detection) {
        synchronized (this) {
            this.IconCompatParcelizer.IconCompatParcelizer("Closing detection " + detection.name(), new Object[0]);
            IconCompatParcelizer(detection, null);
        }
    }

    public DetectionIdManager(c cVar, parseLonglambda0 parselonglambda0) {
        this.IconCompatParcelizer = parselonglambda0;
        this.read = cVar;
        synchronized (this) {
            for (Detection detection : Detection.values()) {
                this.write.put(detection, this.read.write(detection.name(), (String) null));
            }
        }
    }

    public enum Detection {
        STATIONARY,
        TRIP,
        OTG_EXTERNAL_EVENT,
        OTG_LOCATION_PERMISSION,
        OTG_LOCATION_MODE_DEVICE_ONLY,
        OTG_LOCATION_MODE_BATTERY_SAVING,
        OTG_LOCATION_MODE_OFF,
        OTG_AIRPLANE_MODE,
        OTG_OUTAGE,
        OTG_PLAY_SERVICES,
        OTG_GEOFENCE_TRANSITION_TIMEOUT,
        OTG_DISK_QUOTA_EXCEEDED,
        OTG_NO_ACCURATE_LOCATION_FIXES,
        OTG_LOCATION_ACCESS_ALWAYS,
        OTG_BG_EXECUTION_RESTRICTED,
        OTG_BG_DETECTIONS_NOT_ALLOWED,
        OTG_LOCATION_ACCURACY_REDUCED;

        public static Detection fromOtgReasonConstant(byte b) {
            switch (b) {
                case 1:
                    return OTG_LOCATION_PERMISSION;
                case 2:
                    return OTG_AIRPLANE_MODE;
                case 3:
                    return OTG_EXTERNAL_EVENT;
                case 4:
                    return OTG_LOCATION_ACCESS_ALWAYS;
                case 5:
                    return OTG_LOCATION_MODE_OFF;
                case 6:
                default:
                    return null;
                case 7:
                    return OTG_OUTAGE;
                case 8:
                    return OTG_PLAY_SERVICES;
                case 9:
                    return OTG_NO_ACCURATE_LOCATION_FIXES;
                case 10:
                    return OTG_LOCATION_MODE_BATTERY_SAVING;
                case 11:
                    return OTG_LOCATION_MODE_DEVICE_ONLY;
                case 12:
                    return OTG_GEOFENCE_TRANSITION_TIMEOUT;
                case 13:
                    return OTG_DISK_QUOTA_EXCEEDED;
                case 14:
                    return OTG_BG_EXECUTION_RESTRICTED;
                case 15:
                    return OTG_BG_DETECTIONS_NOT_ALLOWED;
                case 16:
                    return OTG_LOCATION_ACCURACY_REDUCED;
            }
        }
    }

    private void IconCompatParcelizer(Detection detection, String str) {
        synchronized (this) {
            this.read.RemoteActionCompatParcelizer(detection.name(), str);
            this.write.put(detection, str);
        }
    }
}
