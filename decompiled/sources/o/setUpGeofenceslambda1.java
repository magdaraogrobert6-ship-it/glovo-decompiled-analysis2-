package o;

import com.sentiance.sdk.drivinginsights.harsheventdetection.HarshEventType;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class setUpGeofenceslambda1 {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[HarshEventType.values().length];
        try {
            iArr[HarshEventType.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HarshEventType.ACCELERATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HarshEventType.BRAKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[HarshEventType.TURN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        IconCompatParcelizer = iArr;
    }
}
