package o;

import com.sentiance.sdk.feedback.api.OccupantRoleFeedback;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class getImageDownloadSuccessfulannotations {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[OccupantRoleFeedback.values().length];
        try {
            iArr[OccupantRoleFeedback.DRIVER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OccupantRoleFeedback.PASSENGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        serializer = iArr;
    }
}
