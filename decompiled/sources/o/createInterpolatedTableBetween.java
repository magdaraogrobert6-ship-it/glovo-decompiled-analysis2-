package o;

import com.roadrunner.delivery.state.pudo.TypographyToken;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class createInterpolatedTableBetween {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    static {
        int[] iArr = new int[TypographyToken.values().length];
        try {
            iArr[TypographyToken.HeadlineBig.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TypographyToken.HeadlineMedium.ordinal()] = 2;
            int i = serializer + 57;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TypographyToken.HeadlineSmall.ordinal()] = 3;
            int i4 = RemoteActionCompatParcelizer + 93;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TypographyToken.SubtitleMedium.ordinal()] = 4;
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
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[TypographyToken.BodySmall.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[TypographyToken.Unknown.ordinal()] = 9;
            int i8 = RemoteActionCompatParcelizer + 33;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        } catch (NoSuchFieldError unused9) {
        }
        IconCompatParcelizer = iArr;
    }
}
