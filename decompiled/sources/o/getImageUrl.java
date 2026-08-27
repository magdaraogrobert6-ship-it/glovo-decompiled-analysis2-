package o;

import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class getImageUrl {
    static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[TransportChangeType.values().length];
        IconCompatParcelizer = iArr;
        try {
            iArr[TransportChangeType.OFF_THE_GRID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IconCompatParcelizer[TransportChangeType.TRANSPORT_UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            IconCompatParcelizer[TransportChangeType.STATIONARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            IconCompatParcelizer[TransportChangeType.TRANSPORT_BIKING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            IconCompatParcelizer[TransportChangeType.TRANSPORT_CAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            IconCompatParcelizer[TransportChangeType.TRANSPORT_TRAIN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            IconCompatParcelizer[TransportChangeType.TRANSPORT_TRAM.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            IconCompatParcelizer[TransportChangeType.TRANSPORT_WALKING.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            IconCompatParcelizer[TransportChangeType.TRANSPORT_RUNNING.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            IconCompatParcelizer[TransportChangeType.TRANSPORT_BUS.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            IconCompatParcelizer[TransportChangeType.TRANSPORT_ON_FOOT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            IconCompatParcelizer[TransportChangeType.TRANSPORT_VEHICLE.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            IconCompatParcelizer[TransportChangeType.TRANSPORT_RAIL.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            IconCompatParcelizer[TransportChangeType.TRANSPORT_MOTORCYCLE.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            IconCompatParcelizer[TransportChangeType.TRANSPORT_IDLE.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
    }
}
