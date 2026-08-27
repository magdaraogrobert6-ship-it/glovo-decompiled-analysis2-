package o;

import com.sentiance.sdk.eventtimeline.timelines.creators.HarshDrivingEntryType;
import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleInternal;
import com.sentiance.sdk.ondevicecommon.CrashSeverityInternal;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class r8lambdaOGOAh5mtMGjkWWFJnaZg117J230 {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;
    public static final /* synthetic */ int[] serializer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[TransportChangeType.values().length];
        try {
            iArr[TransportChangeType.TRANSPORT_UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransportChangeType.TRANSPORT_BIKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransportChangeType.TRANSPORT_WALKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransportChangeType.TRANSPORT_RUNNING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TransportChangeType.TRANSPORT_TRAM.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TransportChangeType.TRANSPORT_TRAIN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TransportChangeType.TRANSPORT_CAR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[TransportChangeType.TRANSPORT_BUS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[TransportChangeType.TRANSPORT_MOTORCYCLE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[TransportChangeType.TRANSPORT_RAIL.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[TransportChangeType.TRANSPORT_VEHICLE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[TransportChangeType.TRANSPORT_ON_FOOT.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[TransportChangeType.TRANSPORT_IDLE.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        IconCompatParcelizer = iArr;
        int[] iArr2 = new int[SafetyScoreType.values().length];
        try {
            iArr2[SafetyScoreType.SMOOTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[SafetyScoreType.LEGAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[SafetyScoreType.OVERALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[SafetyScoreType.FOCUS.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[SafetyScoreType.CALL_WHILE_MOVING.ordinal()] = 5;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[SafetyScoreType.WRONG_WAY_DRIVING.ordinal()] = 6;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[SafetyScoreType.ATTENTION.ordinal()] = 7;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[SafetyScoreType.HARSH_BRAKING.ordinal()] = 8;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[SafetyScoreType.HARSH_TURNING.ordinal()] = 9;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[SafetyScoreType.HARSH_ACCELERATION.ordinal()] = 10;
        } catch (NoSuchFieldError unused23) {
        }
        write = iArr2;
        int[] iArr3 = new int[CrashSeverityInternal.values().length];
        try {
            iArr3[CrashSeverityInternal.HIGH.ordinal()] = 1;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr3[CrashSeverityInternal.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr3[CrashSeverityInternal.LOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused26) {
        }
        read = iArr3;
        int[] iArr4 = new int[HarshDrivingEntryType.values().length];
        try {
            iArr4[HarshDrivingEntryType.ACCELERATING.ordinal()] = 1;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr4[HarshDrivingEntryType.BRAKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr4[HarshDrivingEntryType.TURN.ordinal()] = 3;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr4[HarshDrivingEntryType.NO_EVENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused30) {
        }
        serializer = iArr4;
        int[] iArr5 = new int[OccupantRoleInternal.values().length];
        try {
            iArr5[OccupantRoleInternal.DRIVER.ordinal()] = 1;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr5[OccupantRoleInternal.PASSENGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr5[OccupantRoleInternal.UNAVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused33) {
        }
        RemoteActionCompatParcelizer = iArr5;
    }
}
