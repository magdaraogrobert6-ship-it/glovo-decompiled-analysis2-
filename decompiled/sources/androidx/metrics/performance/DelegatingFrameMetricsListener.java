package androidx.metrics.performance;

import android.os.Handler;
import android.view.FrameMetrics;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class DelegatingFrameMetricsListener implements Window.OnFrameMetricsAvailableListener {
    public static Handler RemoteActionCompatParcelizer;
    public final ArrayList read;

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        synchronized (this) {
            Iterator it = this.read.iterator();
            while (it.hasNext()) {
                ((Window.OnFrameMetricsAvailableListener) it.next()).onFrameMetricsAvailable(window, frameMetrics, i);
            }
        }
    }

    public DelegatingFrameMetricsListener(ArrayList arrayList) {
        this.read = arrayList;
    }
}
