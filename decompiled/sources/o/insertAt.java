package o;

import android.view.View;
import android.view.Window;
import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.hms.framework.common.ContainerUtils;
import io.sentry.metrics.MetricsBatchProcessor;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class insertAt {
    public static volatile insertAt RemoteActionCompatParcelizer;
    public static final setRoundRectOutlineTNW_H78default serializer = new setRoundRectOutlineTNW_H78default(7);
    public final setInvalidateListenerui IconCompatParcelizer;
    public final androidx.emoji2.text.EmojiProcessor MediaSessionCompatQueueItem;
    public final getTintColor0d7_KjU read;
    public final AtomicInteger write = new AtomicInteger(0);

    public static void RemoteActionCompatParcelizer(View view, String str) {
        if (view != null) {
            View rootView = view.getRootView();
            Object tag = rootView.getTag(com.logistics.rider.glovo.R.id.metricsStateHolder);
            if (tag == null) {
                tag = new setNativeStrokeMiterLimit();
                rootView.setTag(com.logistics.rider.glovo.R.id.metricsStateHolder, tag);
            }
            MetricsBatchProcessor metricsBatchProcessor = ((setNativeStrokeMiterLimit) tag).serializer;
            if (metricsBatchProcessor != null) {
                metricsBatchProcessor.RemoteActionCompatParcelizer(str, (ArrayList) metricsBatchProcessor.RemoteActionCompatParcelizer, System.nanoTime());
            }
        }
    }

    public insertAt(setInvalidateListenerui setinvalidatelistenerui, requestFocusBypassUnfocusableComposeView requestfocusbypassunfocusablecomposeview, getTintColor0d7_KjU gettintcolor0d7_kju, androidx.emoji2.text.EmojiProcessor emojiProcessor, FlingCancellationException flingCancellationException, io.sentry.hints.PlaybackStateCompatCustomAction playbackStateCompatCustomAction) {
        this.IconCompatParcelizer = setinvalidatelistenerui;
        this.read = gettintcolor0d7_kju;
        this.MediaSessionCompatQueueItem = emojiProcessor;
        setinvalidatelistenerui.read.add(new setClipPathData(this));
    }

    public final void RemoteActionCompatParcelizer(String str, String str2, Window window, View view) {
        setInvalidateListenerui setinvalidatelistenerui = this.IconCompatParcelizer;
        if (window != null) {
            setinvalidatelistenerui.serializer(window);
        }
        if (view != null) {
            View rootView = view.getRootView();
            Object tag = rootView.getTag(com.logistics.rider.glovo.R.id.metricsStateHolder);
            if (tag == null) {
                tag = new setNativeStrokeMiterLimit();
                rootView.setTag(com.logistics.rider.glovo.R.id.metricsStateHolder, tag);
            }
            MetricsBatchProcessor metricsBatchProcessor = ((setNativeStrokeMiterLimit) tag).serializer;
            if (metricsBatchProcessor == null) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(af$$ExternalSyntheticOutline0.m("Cannot put ", str, ContainerUtils.KEY_VALUE_DELIMITER, str2), new Object[0]);
                return;
            }
            synchronized (((ArrayList) metricsBatchProcessor.serializer)) {
                long jNanoTime = System.nanoTime();
                metricsBatchProcessor.RemoteActionCompatParcelizer(str, (ArrayList) metricsBatchProcessor.RemoteActionCompatParcelizer, jNanoTime);
                ((ArrayList) metricsBatchProcessor.RemoteActionCompatParcelizer).add(metricsBatchProcessor.RemoteActionCompatParcelizer(jNanoTime, new setNativePathEffect(str, str2)));
            }
        }
    }
}
