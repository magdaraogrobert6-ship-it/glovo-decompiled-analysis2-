package o;

import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.ondevice.api.event.TransportMode;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class Card {
    public static final /* synthetic */ int[] read;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[TransportMode.values().length];
        write = iArr;
        try {
            iArr[TransportMode.BICYCLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[TransportMode.RUNNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            write[TransportMode.WALKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            write[TransportMode.TRAIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            write[TransportMode.TRAM.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            write[TransportMode.MOTORCYCLE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            write[TransportMode.CAR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            write[TransportMode.BUS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            write[TransportMode.UNKNOWN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            write[TransportMode.IDLE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        int[] iArr2 = new int[TransportChangeType.values().length];
        read = iArr2;
        try {
            iArr2[TransportChangeType.TRANSPORT_CAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            read[TransportChangeType.TRANSPORT_BUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            read[TransportChangeType.TRANSPORT_VEHICLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            read[TransportChangeType.TRANSPORT_MOTORCYCLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            read[TransportChangeType.TRANSPORT_BIKING.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            read[TransportChangeType.TRANSPORT_TRAM.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            read[TransportChangeType.TRANSPORT_TRAIN.ordinal()] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            read[TransportChangeType.TRANSPORT_WALKING.ordinal()] = 8;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            read[TransportChangeType.TRANSPORT_RUNNING.ordinal()] = 9;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            read[TransportChangeType.TRANSPORT_ON_FOOT.ordinal()] = 10;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            read[TransportChangeType.TRANSPORT_RAIL.ordinal()] = 11;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            read[TransportChangeType.TRANSPORT_UNKNOWN.ordinal()] = 12;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            read[TransportChangeType.TRANSPORT_IDLE.ordinal()] = 13;
        } catch (NoSuchFieldError unused23) {
        }
    }
}
