package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem$PaymentType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getSp {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[TapToPayTaskUiItem$PaymentType.values().length];
        try {
            iArr[TapToPayTaskUiItem$PaymentType.CASH.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 71;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 4;
            } else {
                int i3 = 2 % 2;
            }
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TapToPayTaskUiItem$PaymentType.CARD.ordinal()] = 2;
            int i4 = IconCompatParcelizer + 85;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        serializer = iArr;
    }
}
