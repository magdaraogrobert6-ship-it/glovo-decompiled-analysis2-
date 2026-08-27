package o;

import android.content.Context;
import android.net.ConnectivityManager;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.ui.common.widget.LoadingDialogFullScreen;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public abstract class enableVerboseLogging {
    public static GraphicsLayerV23Companion IconCompatParcelizer(Context context) {
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        GraphicsLayerV23Companion graphicsLayerV23Companion = new GraphicsLayerV23Companion((ConnectivityManager) systemService);
        new findOverlaps(1, graphicsLayerV23Companion);
        return graphicsLayerV23Companion;
    }

    public static LoadingDialogFullScreen serializer(div7Ah8Wj8 div7ah8wj8) {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = div7ah8wj8.findFragmentByTag("LoadingDialogFullScreen");
        if (fragmentFindFragmentByTag != null) {
            if (fragmentFindFragmentByTag instanceof LoadingDialogFullScreen) {
                return (LoadingDialogFullScreen) fragmentFindFragmentByTag;
            }
            Timber.RemoteActionCompatParcelizer.write(new IllegalStateException(c8$$ExternalSyntheticOutline0.m("we expected LoadingDialogFullScreen but got ", fragmentFindFragmentByTag, " for the tag LoadingDialogFullScreen")));
        }
        return new LoadingDialogFullScreen();
    }
}
