package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$PaymentType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getHeightD9Ej5fMannotations {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    private static int serializer;

    static {
        int[] iArr = new int[QrPaymentTaskUiItem$PaymentType.values().length];
        try {
            iArr[QrPaymentTaskUiItem$PaymentType.QR_CODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QrPaymentTaskUiItem$PaymentType.CASH.ordinal()] = 2;
            int i = serializer + 23;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        read = iArr;
        int i4 = IconCompatParcelizer + 99;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
    }
}
