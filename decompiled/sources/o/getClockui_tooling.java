package o;

import com.roadrunner.delivery.state.pudo.TypographyToken;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getClockui_tooling {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[TypographyToken.values().length];
        try {
            iArr[TypographyToken.HeadlineBig.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TypographyToken.HeadlineMedium.ordinal()] = 2;
            int i = read + 11;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TypographyToken.HeadlineSmall.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TypographyToken.SubtitleMedium.ordinal()] = 4;
            int i3 = RemoteActionCompatParcelizer + 29;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TypographyToken.SubtitleSmall.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TypographyToken.BodyBig.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TypographyToken.BodyMedium.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[TypographyToken.BodySmall.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[TypographyToken.Unknown.ordinal()] = 9;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused9) {
        }
        write = iArr;
    }
}
