package o;

import com.roadrunner.delivery.state.pudo.TagColorToken;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r8lambdaDTxTXwYvZoKnyqFMrsPr9CCuDY {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[TagColorToken.values().length];
        try {
            iArr[TagColorToken.SuccessPale.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TagColorToken.AlertPale.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TagColorToken.ActivePale.ordinal()] = 3;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TagColorToken.WhitePale.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TagColorToken.ErrorPale.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TagColorToken.NaturalPale.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TagColorToken.Unknown.ordinal()] = 7;
            int i2 = RemoteActionCompatParcelizer + 53;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused7) {
        }
        write = iArr;
        int i5 = read + 55;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
