package o;

import com.roadrunner.delivery.state.pudo.TagColorToken;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class takeOrElseJpAxnlU {
    private static int read = 1;
    private static int serializer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[TagColorToken.values().length];
        try {
            iArr[TagColorToken.NaturalPale.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TagColorToken.SuccessPale.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TagColorToken.AlertPale.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TagColorToken.ActivePale.ordinal()] = 4;
            int i = serializer + 93;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TagColorToken.WhitePale.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TagColorToken.ErrorPale.ordinal()] = 6;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TagColorToken.Unknown.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        write = iArr;
        int i5 = read + 115;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
    }
}
