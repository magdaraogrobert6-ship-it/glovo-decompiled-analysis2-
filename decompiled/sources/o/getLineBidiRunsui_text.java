package o;

import com.roadrunner.delivery.state.StateV3$AcceptData$BoostedEarningsIcons;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getLineBidiRunsui_text {
    private static int RemoteActionCompatParcelizer = 0;
    public static final /* synthetic */ int[] read;
    private static int write = 1;

    static {
        int[] iArr = new int[StateV3$AcceptData$BoostedEarningsIcons.values().length];
        try {
            iArr[StateV3$AcceptData$BoostedEarningsIcons.TIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StateV3$AcceptData$BoostedEarningsIcons.BOOST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StateV3$AcceptData$BoostedEarningsIcons.BIG_ORDER.ordinal()] = 3;
            int i = RemoteActionCompatParcelizer + 75;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StateV3$AcceptData$BoostedEarningsIcons.BAD_WEATHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        read = iArr;
        int i4 = RemoteActionCompatParcelizer + 93;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
