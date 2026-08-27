package o;

import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class isGeofencesEnabledFromEnvironment {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[SafetyScoreType.values().length];
        try {
            iArr[SafetyScoreType.SMOOTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SafetyScoreType.FOCUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SafetyScoreType.CALL_WHILE_MOVING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SafetyScoreType.LEGAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SafetyScoreType.OVERALL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SafetyScoreType.HARSH_BRAKING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SafetyScoreType.HARSH_TURNING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[SafetyScoreType.HARSH_ACCELERATION.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[SafetyScoreType.WRONG_WAY_DRIVING.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[SafetyScoreType.ATTENTION.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        read = iArr;
    }
}
