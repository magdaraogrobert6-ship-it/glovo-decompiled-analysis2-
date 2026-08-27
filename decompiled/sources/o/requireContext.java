package o;

import com.roadrunner.delivery.repository.api.DeliveryInformation$ScreenDataType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class requireContext {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int read = 0;
    public static final /* synthetic */ int[] serializer;
    private static int write = 1;

    static {
        int[] iArr = new int[isTrackingEnabled.values().length];
        try {
            iArr[isTrackingEnabled.NOT_WORKING.ordinal()] = 1;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[isTrackingEnabled.AVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[isTrackingEnabled.SUSPENDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[isTrackingEnabled.ON_BREAK.ordinal()] = 4;
            int i = read + 99;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[isTrackingEnabled.ON_PAID_BREAK.ordinal()] = 5;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[isTrackingEnabled.STARTING.ordinal()] = 6;
            int i5 = write + 47;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[isTrackingEnabled.LATE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[isTrackingEnabled.READY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[isTrackingEnabled.WORKING.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[isTrackingEnabled.ENDING.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        IconCompatParcelizer = iArr;
        int[] iArr2 = new int[DeliveryInformation$ScreenDataType.values().length];
        try {
            iArr2[DeliveryInformation$ScreenDataType.ACCEPT.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[DeliveryInformation$ScreenDataType.DELIVERY_DETAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[DeliveryInformation$ScreenDataType.ON_THE_WAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[DeliveryInformation$ScreenDataType.NO_DELIVERIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[DeliveryInformation$ScreenDataType.AUTO_ACCEPT.ordinal()] = 5;
            int i8 = write + 3;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[DeliveryInformation$ScreenDataType.LIST.ordinal()] = 6;
            int i11 = 2 % 2;
        } catch (NoSuchFieldError unused16) {
        }
        serializer = iArr2;
    }
}
