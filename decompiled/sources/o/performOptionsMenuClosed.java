package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.login.logging.RouterLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class performOptionsMenuClosed {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read;
    public final getHeadingrAG3T2k IconCompatParcelizer;
    public final requestPermissions RemoteActionCompatParcelizer;
    public final performViewCreated serializer;
    public final RouterLogger write;

    public performOptionsMenuClosed(performViewCreated performviewcreated, requestPermissions requestpermissions, getHeadingrAG3T2k getheadingrag3t2k, RouterLogger routerLogger) {
        this.serializer = performviewcreated;
        this.RemoteActionCompatParcelizer = requestpermissions;
        this.IconCompatParcelizer = getheadingrag3t2k;
        this.write = routerLogger;
    }

    public static performDestroyView read(requireParentFragment requireparentfragment, boolean z) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 65;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        switch (performMultiWindowModeChanged.write[requireparentfragment.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return performDestroyView.DF_ENABLED_WORKING;
            case 5:
                return z ? performDestroyView.DF_ENABLED_STACKED_DELIVERY_LIST : performDestroyView.DF_ENABLED_WORKING;
            case 6:
                return performDestroyView.DF_ENABLED_PAUSED;
            case 7:
            case 8:
            case 9:
                performDestroyView performdestroyview = performDestroyView.DEFAULT;
                int i4 = read + 113;
                MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return performdestroyview;
            case 10:
                return performDestroyView.LAST_STOP;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
        }
    }
}
