package o;

import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: renamed from: o.query, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0197query {
    public static final ContextScope IconCompatParcelizer;
    public static final ConcurrentHashMap RemoteActionCompatParcelizer = new ConcurrentHashMap();
    private static int read = 1;
    private static int write;

    static {
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        IconCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer.limitedParallelism(1).plus(new and(getOnBackInvokedCallback.RemoteActionCompatParcelizer, 5)));
        int i = write + 53;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 47 / 0;
        }
    }
}
