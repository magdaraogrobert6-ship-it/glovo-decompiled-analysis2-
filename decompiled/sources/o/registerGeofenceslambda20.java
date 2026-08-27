package o;

import com.sentiance.sdk.drivinginsights.api.SafetyScoreRequestParameters;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class registerGeofenceslambda20 {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[SafetyScoreRequestParameters.Period.values().length];
        write = iArr;
        try {
            iArr[SafetyScoreRequestParameters.Period.LAST_7_DAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[SafetyScoreRequestParameters.Period.LAST_14_DAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            write[SafetyScoreRequestParameters.Period.LAST_30_DAYS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
