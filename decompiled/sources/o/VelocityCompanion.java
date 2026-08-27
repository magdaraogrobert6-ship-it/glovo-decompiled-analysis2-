package o;

import com.roadrunner.delivery.state.pudo.TagColorToken;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class VelocityCompanion {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[TagColorToken.values().length];
        try {
            iArr[TagColorToken.SuccessPale.ordinal()] = 1;
            int i = RemoteActionCompatParcelizer + 47;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 3 / 4;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TagColorToken.AlertPale.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TagColorToken.ActivePale.ordinal()] = 3;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TagColorToken.NaturalPale.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TagColorToken.Unknown.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TagColorToken.WhitePale.ordinal()] = 6;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TagColorToken.ErrorPale.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        write = iArr;
        int i6 = RemoteActionCompatParcelizer + 107;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }
}
