package o;

import com.sentiance.sdk.payload.batching.PayloadBatcher;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getNotificationPriority {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[PayloadBatcher.TripState.values().length];
        read = iArr;
        try {
            iArr[PayloadBatcher.TripState.FORCED_MOVING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            read[PayloadBatcher.TripState.STOPPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            read[PayloadBatcher.TripState.MOVING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
