package o;

import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SubcomposeLayoutKtSubcomposeLayout2 {
    public static void serializer(View view, SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        accessgetPausePausedcp accessgetpausepausedcp = subcomposeSlotReusePolicy.getLifecycle.write;
        if (accessgetpausepausedcp == null || !accessgetpausepausedcp.MediaBrowserCompatMediaItem) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            elevation += ((View) parent).getElevation();
        }
        accessgetReusedSlotIdp accessgetreusedslotidp = subcomposeSlotReusePolicy.getLifecycle;
        if (accessgetreusedslotidp.MediaSessionCompatQueueItem != elevation) {
            accessgetreusedslotidp.MediaSessionCompatQueueItem = elevation;
            subcomposeSlotReusePolicy.ComponentActivity();
        }
    }

    public static timesUQTWf7w read(int i) {
        if (i == 0) {
            return new accessgetUnspecifiedSlotIdp();
        }
        if (i != 1) {
            return new accessgetUnspecifiedSlotIdp();
        }
        return new timesmw2e94();
    }
}
