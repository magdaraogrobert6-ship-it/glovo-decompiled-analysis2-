package o;

import com.sentiance.sdk.DetectionStatus;
import com.sentiance.sdk.SdkStatus;
import com.sentiance.sdk.trip.TransportMode;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class getAccuracy {
    static final /* synthetic */ int[] IconCompatParcelizer;
    static final /* synthetic */ int[] read;
    static final /* synthetic */ int[] serializer;
    static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[SdkStatus.LocationPermission.values().length];
        write = iArr;
        try {
            iArr[SdkStatus.LocationPermission.ALWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[SdkStatus.LocationPermission.ONLY_WHILE_IN_USE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            write[SdkStatus.LocationPermission.NEVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[SdkStatus.QuotaStatus.values().length];
        IconCompatParcelizer = iArr2;
        try {
            iArr2[SdkStatus.QuotaStatus.WARNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            IconCompatParcelizer[SdkStatus.QuotaStatus.EXCEEDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            IconCompatParcelizer[SdkStatus.QuotaStatus.OK.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[DetectionStatus.values().length];
        read = iArr3;
        try {
            iArr3[DetectionStatus.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            read[DetectionStatus.EXPIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            read[DetectionStatus.ENABLED_BUT_BLOCKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            read[DetectionStatus.ENABLED_AND_DETECTING.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        int[] iArr4 = new int[TransportMode.values().length];
        serializer = iArr4;
        try {
            iArr4[TransportMode.CAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            serializer[TransportMode.BICYCLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            serializer[TransportMode.ON_FOOT.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            serializer[TransportMode.TRAIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            serializer[TransportMode.TRAM.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            serializer[TransportMode.BUS.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            serializer[TransportMode.PLANE.ordinal()] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            serializer[TransportMode.BOAT.ordinal()] = 8;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            serializer[TransportMode.METRO.ordinal()] = 9;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            serializer[TransportMode.RUNNING.ordinal()] = 10;
        } catch (NoSuchFieldError unused20) {
        }
    }
}
