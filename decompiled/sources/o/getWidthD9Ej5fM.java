package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$QrPaymentType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getWidthD9Ej5fM {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    static {
        int[] iArr = new int[QrPaymentTaskUiItem$QrPaymentType.values().length];
        try {
            iArr[QrPaymentTaskUiItem$QrPaymentType.CODE.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 15;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QrPaymentTaskUiItem$QrPaymentType.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        IconCompatParcelizer = iArr;
        int i4 = RemoteActionCompatParcelizer + 121;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
