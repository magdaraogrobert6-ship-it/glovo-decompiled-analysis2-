package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$PaymentStatus;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class copyDwJknco {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[QrPaymentTaskUiItem$PaymentStatus.values().length];
        try {
            iArr[QrPaymentTaskUiItem$PaymentStatus.SUCCESS.ordinal()] = 1;
            int i = read + 79;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 4 % 5;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QrPaymentTaskUiItem$PaymentStatus.FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
        int i4 = RemoteActionCompatParcelizer + 117;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
