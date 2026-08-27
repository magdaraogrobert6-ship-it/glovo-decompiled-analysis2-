package o;

import com.roadrunner.vendor.review.data.database.entity.ReviewState;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class logPushStoryPageClicked {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[ReviewState.values().length];
        try {
            iArr[ReviewState.DISMISSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReviewState.SUBMITTED_NEGATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ReviewState.SUBMITTED_POSITIVE.ordinal()] = 3;
            int i = IconCompatParcelizer + 105;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        write = iArr;
        int i4 = IconCompatParcelizer + 53;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
    }
}
