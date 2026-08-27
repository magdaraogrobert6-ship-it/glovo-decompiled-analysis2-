package o;

import com.mapbox.common.LoggingLevel;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class k5 {
    private static int IconCompatParcelizer = 0;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    private static int read = 1;

    static {
        int[] iArr = new int[LoggingLevel.values().length];
        try {
            iArr[LoggingLevel.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LoggingLevel.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LoggingLevel.WARNING.ordinal()] = 3;
            int i = IconCompatParcelizer + 43;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LoggingLevel.ERROR.ordinal()] = 4;
            int i4 = read + 97;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused4) {
        }
        RemoteActionCompatParcelizer = iArr;
    }
}
