package o;

import com.roadrunner.delivery.repository.api.DeliveryInformation$ScreenDataType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class drawLeadingMargin {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[DeliveryInformation$ScreenDataType.values().length];
        try {
            iArr[DeliveryInformation$ScreenDataType.ACCEPT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryInformation$ScreenDataType.ON_THE_WAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeliveryInformation$ScreenDataType.DELIVERY_DETAILS.ordinal()] = 3;
            int i = IconCompatParcelizer + 9;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        write = iArr;
        int i3 = read + 31;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}
