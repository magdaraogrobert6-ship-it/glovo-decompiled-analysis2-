package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$PaymentType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getParameters {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    static {
        int[] iArr = new int[CardCashPaymentTaskUiItem$PaymentType.values().length];
        try {
            iArr[CardCashPaymentTaskUiItem$PaymentType.CASH.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 67;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardCashPaymentTaskUiItem$PaymentType.CARD.ordinal()] = 2;
            int i4 = RemoteActionCompatParcelizer + 65;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        IconCompatParcelizer = iArr;
        int i7 = serializer + 63;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            throw null;
        }
    }
}
