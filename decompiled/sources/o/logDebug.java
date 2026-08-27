package o;

import com.roadrunner.delivery.state.pudo.TagColorToken;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class logDebug {
    private static int IconCompatParcelizer = 0;
    public static final /* synthetic */ int[] serializer;
    private static int write = 1;

    static {
        int[] iArr = new int[TagColorToken.values().length];
        try {
            iArr[TagColorToken.NaturalPale.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TagColorToken.Unknown.ordinal()] = 2;
            int i = write + 29;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 4;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TagColorToken.SuccessPale.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TagColorToken.AlertPale.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TagColorToken.ActivePale.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TagColorToken.WhitePale.ordinal()] = 6;
            int i4 = write + 45;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TagColorToken.ErrorPale.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        serializer = iArr;
    }
}
