package o;

import com.sentiance.sdk.eventtimeline.timelines.creators.HarshDrivingEntryType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getAnimateIn {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[HarshDrivingEntryType.values().length];
        try {
            iArr[HarshDrivingEntryType.TURN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HarshDrivingEntryType.BRAKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HarshDrivingEntryType.ACCELERATING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        read = iArr;
    }
}
