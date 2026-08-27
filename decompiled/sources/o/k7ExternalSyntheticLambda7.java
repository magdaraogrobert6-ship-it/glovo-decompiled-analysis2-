package o;

import com.mapbox.maps.plugin.PuckBearing;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class k7ExternalSyntheticLambda7 {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    static {
        int[] iArr = new int[PuckBearing.values().length];
        try {
            iArr[PuckBearing.HEADING.ordinal()] = 1;
            int i = write + 121;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PuckBearing.COURSE.ordinal()] = 2;
            int i4 = RemoteActionCompatParcelizer + 113;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        } catch (NoSuchFieldError unused2) {
        }
        IconCompatParcelizer = iArr;
    }
}
