package o;

import com.roadrunner.delivery.state.pudo.ButtonTypeToken;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class logErrorui_toolingdefault {
    private static int RemoteActionCompatParcelizer = 0;
    public static final /* synthetic */ int[] serializer;
    private static int write = 1;

    static {
        int[] iArr = new int[ButtonTypeToken.values().length];
        try {
            iArr[ButtonTypeToken.SecondaryButton.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ButtonTypeToken.Unknown.ordinal()] = 2;
            int i = write + 37;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ButtonTypeToken.WarningButton.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ButtonTypeToken.PrimaryButton.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ButtonTypeToken.TertiaryButton.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ButtonTypeToken.SecondaryButtonInverted.ordinal()] = 6;
            int i4 = RemoteActionCompatParcelizer + 39;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused6) {
        }
        serializer = iArr;
    }
}
