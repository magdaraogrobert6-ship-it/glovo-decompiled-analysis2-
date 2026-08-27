package o;

import com.sentiance.sdk.trip.TripType;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class migrateFeatureFlagStorageToJsonlambda4 {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[TripType.values().length];
        write = iArr;
        try {
            iArr[TripType.EXTERNAL_TRIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[TripType.SDK_TRIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
