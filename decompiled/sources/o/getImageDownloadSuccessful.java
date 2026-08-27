package o;

import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleFeedbackInternal;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class getImageDownloadSuccessful {
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[OccupantRoleFeedbackInternal.values().length];
        try {
            iArr[OccupantRoleFeedbackInternal.DRIVER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OccupantRoleFeedbackInternal.PASSENGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OccupantRoleFeedbackInternal.UNSET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        read = iArr;
    }
}
