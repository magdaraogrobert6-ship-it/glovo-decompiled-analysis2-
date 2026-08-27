package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class MultiSubscriptionSnapshotFlowManager {
    private static int read = 0;
    private static int write = 1;

    public static final AdjustBridgeInstance4 read(getBirthDateFull getbirthdatefull) {
        int i = 2 % 2;
        int i2 = write + 45;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        float fM3673constructorimpl = androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f);
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if (objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = new AdjustBridgeInstance4(fM3673constructorimpl);
            getpostalcode.write(objComponentActivity);
        }
        AdjustBridgeInstance4 adjustBridgeInstance4 = (AdjustBridgeInstance4) objComponentActivity;
        int i4 = read + 3;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return adjustBridgeInstance4;
        }
        throw null;
    }

    public static final int write(androidx.compose.foundation.pager.PagerMeasureResult pagerMeasureResult) {
        long jM96getViewportSizeYbymL2g;
        int i = 2 % 2;
        if (pagerMeasureResult.MediaSessionCompatToken == SelectionHandleIcon.Vertical) {
            jM96getViewportSizeYbymL2g = pagerMeasureResult.m96getViewportSizeYbymL2g() & 4294967295L;
        } else {
            jM96getViewportSizeYbymL2g = pagerMeasureResult.m96getViewportSizeYbymL2g() >> 32;
            int i2 = read + 107;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = (int) jM96getViewportSizeYbymL2g;
        int i5 = write + 109;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }
}
