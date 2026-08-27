package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.view.Window;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeFilterQuality50PEsBU;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class SentryFrameMetricsCollector$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ Window RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ SentryFrameMetricsCollector write;

    public /* synthetic */ SentryFrameMetricsCollector$$ExternalSyntheticLambda0(SentryFrameMetricsCollector sentryFrameMetricsCollector, Window window, int i) {
        this.serializer = i;
        this.write = sentryFrameMetricsCollector;
        this.RemoteActionCompatParcelizer = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        Window window = this.RemoteActionCompatParcelizer;
        SentryFrameMetricsCollector sentryFrameMetricsCollector = this.write;
        if (i != 0) {
            try {
                if (sentryFrameMetricsCollector.ParcelableVolumeInfo.remove(window)) {
                    serializer serializerVar = sentryFrameMetricsCollector.MediaSessionCompatToken;
                    setNativeFilterQuality50PEsBU setnativefilterquality50pesbu = sentryFrameMetricsCollector.read;
                    serializerVar.getClass();
                    if (setnativefilterquality50pesbu == null) {
                        return;
                    }
                    window.removeOnFrameMetricsAvailableListener(setnativefilterquality50pesbu);
                    return;
                }
                return;
            } catch (Throwable th) {
                sentryFrameMetricsCollector.PlaybackStateCompatCustomAction.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to remove frameMetricsAvailableListener", th);
                return;
            }
        }
        if (sentryFrameMetricsCollector.ParcelableVolumeInfo.add(window)) {
            try {
                serializer serializerVar2 = sentryFrameMetricsCollector.MediaSessionCompatToken;
                setNativeFilterQuality50PEsBU setnativefilterquality50pesbu2 = sentryFrameMetricsCollector.read;
                Handler handler = sentryFrameMetricsCollector.MediaSessionCompatQueueItem;
                serializerVar2.getClass();
                if (setnativefilterquality50pesbu2 == null) {
                    return;
                }
                window.addOnFrameMetricsAvailableListener(setnativefilterquality50pesbu2, handler);
            } catch (Throwable th2) {
                sentryFrameMetricsCollector.PlaybackStateCompatCustomAction.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to add frameMetricsAvailableListener", th2);
            }
        }
    }
}
