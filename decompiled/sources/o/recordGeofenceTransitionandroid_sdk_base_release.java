package o;

import com.roadrunner.vendor.review.data.database.entity.ReviewState;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class recordGeofenceTransitionandroid_sdk_base_release {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[ReviewState.values().length];
        try {
            iArr[ReviewState.SUBMITTED_NEGATIVE.ordinal()] = 1;
            int i = serializer + 53;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 4 % 4;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReviewState.SUBMITTED_POSITIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
        int i4 = serializer + 119;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
