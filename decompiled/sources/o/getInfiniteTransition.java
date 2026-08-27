package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$PaymentType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getInfiniteTransition {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int read = 0;
    private static int serializer = 1;

    static {
        int[] iArr = new int[CardCashPaymentTaskUiItem$PaymentType.values().length];
        try {
            iArr[CardCashPaymentTaskUiItem$PaymentType.CASH.ordinal()] = 1;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardCashPaymentTaskUiItem$PaymentType.CARD.ordinal()] = 2;
            int i2 = serializer + 111;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        IconCompatParcelizer = iArr;
        int i5 = read + 93;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
