package o;

import com.roadrunner.delivery.state.pudo.TagToken;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class processViewInfoslambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[TagToken.values().length];
        try {
            iArr[TagToken.SuccessBold.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TagToken.AlertBold.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TagToken.NaturalBold.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TagToken.Unknown.ordinal()] = 4;
            int i = read + 73;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        write = iArr;
        int i4 = RemoteActionCompatParcelizer + 81;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
