package com.sentiance.sdk.crashdetection.api;

import android.location.Location;
import com.sentiance.sdk.DontObfuscate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class VehicleCrashEvent {
    private final int mConfidence;
    private final float mDeltaV;
    private final Location mLocation;
    private final float mMagnitude;
    private final List<Location> mPrecedingLocations;
    private final float mSpeedAtImpact;
    private final long mTime;
    private final VehicleCrashDetectorMode mVehicleCrashDetectorMode;
    private final VehicleCrashSeverity mVehicleCrashSeverity;

    public int getConfidence() {
        return this.mConfidence;
    }

    public float getDeltaV() {
        return this.mDeltaV;
    }

    public VehicleCrashDetectorMode getDetectorMode() {
        return this.mVehicleCrashDetectorMode;
    }

    public Location getLocation() {
        return this.mLocation;
    }

    public float getMagnitude() {
        return this.mMagnitude;
    }

    public List<Location> getPrecedingLocations() {
        return this.mPrecedingLocations;
    }

    public VehicleCrashSeverity getSeverity() {
        return this.mVehicleCrashSeverity;
    }

    public float getSpeedAtImpact() {
        return this.mSpeedAtImpact;
    }

    public long getTime() {
        return this.mTime;
    }

    public static class write {
        private final long IconCompatParcelizer;
        private float RemoteActionCompatParcelizer;
        private int read;
        private float serializer;
        private float write;
        private Location MediaDescriptionCompat = new Location("");
        private List<Location> RatingCompat = new ArrayList();
        private VehicleCrashSeverity MediaMetadataCompat = VehicleCrashSeverity.UNAVAILABLE;
        private VehicleCrashDetectorMode MediaSessionCompatQueueItem = VehicleCrashDetectorMode.UNKNOWN;

        public final void IconCompatParcelizer(float f) {
            this.write = f;
        }

        public final void read(Location location) {
            this.MediaDescriptionCompat = location;
        }

        public final void serializer(float f) {
            this.RemoteActionCompatParcelizer = f;
        }

        public final void write(float f) {
            this.serializer = f;
        }

        public final void write(int i) {
            this.read = i;
        }

        public final void serializer(List list) {
            this.RatingCompat = list;
        }

        public write(long j) {
            this.IconCompatParcelizer = j;
        }

        public final void write(VehicleCrashSeverity vehicleCrashSeverity) {
            this.MediaMetadataCompat = vehicleCrashSeverity;
        }

        public final void IconCompatParcelizer(VehicleCrashDetectorMode vehicleCrashDetectorMode) {
            this.MediaSessionCompatQueueItem = vehicleCrashDetectorMode;
        }
    }

    public VehicleCrashEvent(write writeVar) {
        this.mTime = writeVar.IconCompatParcelizer;
        this.mLocation = writeVar.MediaDescriptionCompat;
        this.mMagnitude = writeVar.write;
        this.mSpeedAtImpact = writeVar.RemoteActionCompatParcelizer;
        this.mDeltaV = writeVar.serializer;
        this.mConfidence = writeVar.read;
        this.mPrecedingLocations = writeVar.RatingCompat;
        this.mVehicleCrashSeverity = writeVar.MediaMetadataCompat;
        this.mVehicleCrashDetectorMode = writeVar.MediaSessionCompatQueueItem;
    }

    public String toString() {
        return "VehicleCrashEvent{mTime=" + this.mTime + ", mMagnitude=" + this.mMagnitude + ", mSpeedAtImpact=" + this.mSpeedAtImpact + ", mDeltaV=" + this.mDeltaV + ", mConfidence=" + this.mConfidence + ", mLocation=" + this.mLocation + ", mPrecedingLocations=" + this.mPrecedingLocations + ", mVehicleCrashSeverity=" + this.mVehicleCrashSeverity + ", mVehicleCrashDetectorMode=" + this.mVehicleCrashDetectorMode + '}';
    }

    public int hashCode() {
        long j = this.mTime;
        float f = this.mMagnitude;
        float f2 = this.mSpeedAtImpact;
        float f3 = this.mDeltaV;
        int i = this.mConfidence;
        return Objects.hash(Long.valueOf(j), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i), this.mLocation, this.mPrecedingLocations, this.mVehicleCrashSeverity, this.mVehicleCrashDetectorMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VehicleCrashEvent vehicleCrashEvent = (VehicleCrashEvent) obj;
        return this.mTime == vehicleCrashEvent.mTime && Float.compare(this.mMagnitude, vehicleCrashEvent.mMagnitude) == 0 && Float.compare(this.mSpeedAtImpact, vehicleCrashEvent.mSpeedAtImpact) == 0 && Float.compare(this.mDeltaV, vehicleCrashEvent.mDeltaV) == 0 && this.mConfidence == vehicleCrashEvent.mConfidence && Objects.equals(this.mLocation, vehicleCrashEvent.mLocation) && Objects.equals(this.mPrecedingLocations, vehicleCrashEvent.mPrecedingLocations) && this.mVehicleCrashSeverity == vehicleCrashEvent.mVehicleCrashSeverity && this.mVehicleCrashDetectorMode == vehicleCrashEvent.mVehicleCrashDetectorMode;
    }
}
