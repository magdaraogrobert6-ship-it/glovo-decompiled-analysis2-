package o;

import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;
import com.sentiance.sdk.ondevice.api.event.TransportMode;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AttributionData {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[TransportMode.values().length];
        read = iArr;
        try {
            iArr[TransportMode.BICYCLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            read[TransportMode.WALKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            read[TransportMode.RUNNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            read[TransportMode.TRAM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            read[TransportMode.TRAIN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            read[TransportMode.CAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            read[TransportMode.BUS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            read[TransportMode.MOTORCYCLE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            read[TransportMode.IDLE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        int[] iArr2 = new int[ClassifiedTransportMode.values().length];
        IconCompatParcelizer = iArr2;
        try {
            iArr2[ClassifiedTransportMode.VEHICLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            IconCompatParcelizer[ClassifiedTransportMode.TRAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            IconCompatParcelizer[ClassifiedTransportMode.TRAM.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            IconCompatParcelizer[ClassifiedTransportMode.CAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            IconCompatParcelizer[ClassifiedTransportMode.BUS.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            IconCompatParcelizer[ClassifiedTransportMode.RAIL.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            IconCompatParcelizer[ClassifiedTransportMode.MOTORCYCLE.ordinal()] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            IconCompatParcelizer[ClassifiedTransportMode.IDLE.ordinal()] = 8;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            IconCompatParcelizer[ClassifiedTransportMode.WALKING.ordinal()] = 9;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            IconCompatParcelizer[ClassifiedTransportMode.BIKING.ordinal()] = 10;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            IconCompatParcelizer[ClassifiedTransportMode.RUNNING.ordinal()] = 11;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            IconCompatParcelizer[ClassifiedTransportMode.UNKNOWN.ordinal()] = 12;
        } catch (NoSuchFieldError unused21) {
        }
    }
}
