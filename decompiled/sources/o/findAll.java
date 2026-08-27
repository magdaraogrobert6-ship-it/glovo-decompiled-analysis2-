package o;

import com.roadrunner.delivery.state.pudo.MessageBoxTypeToken;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class findAll {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int read;

    static {
        int[] iArr = new int[MessageBoxTypeToken.values().length];
        try {
            iArr[MessageBoxTypeToken.Neutral.ordinal()] = 1;
            int i = IconCompatParcelizer + 103;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessageBoxTypeToken.Unknown.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MessageBoxTypeToken.Success.ordinal()] = 3;
            int i4 = read + 15;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MessageBoxTypeToken.Alert.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MessageBoxTypeToken.Error.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}
