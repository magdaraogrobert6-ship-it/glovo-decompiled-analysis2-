package com.mapbox.common;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.Window;
import androidx.metrics.performance.DelegatingFrameMetricsListener;
import androidx.sqlite.SQLite;
import java.util.ArrayList;
import o.getQueryParameterslambda2;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setNativeFilterQuality50PEsBU;
import o.setNativeShader;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class LifecycleUtils$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ LifecycleUtils$$ExternalSyntheticLambda4(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z) {
        this.f$0 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.f$1 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.$r8$classId == 0) {
            LifecycleUtils.hasServiceRunningInForeground$lambda$15$lambda$14$lambda$13((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.f$0, this.f$1);
            return;
        }
        boolean z = this.f$1;
        setNativeShader setnativeshader = (setNativeShader) this.f$0;
        if (!z) {
            Window window = setnativeshader.PlaybackStateCompatCustomAction;
            setNativeFilterQuality50PEsBU setnativefilterquality50pesbu = setnativeshader.RatingCompat;
            window.getClass();
            setnativefilterquality50pesbu.getClass();
            DelegatingFrameMetricsListener delegatingFrameMetricsListener = (DelegatingFrameMetricsListener) window.getDecorView().getTag(com.logistics.rider.glovo.R.id.metricsDelegator);
            if (delegatingFrameMetricsListener != null) {
                synchronized (delegatingFrameMetricsListener) {
                    delegatingFrameMetricsListener.read.remove(setnativefilterquality50pesbu);
                }
                if (delegatingFrameMetricsListener.read.isEmpty()) {
                    try {
                        window.removeOnFrameMetricsAvailableListener(delegatingFrameMetricsListener);
                    } catch (IllegalArgumentException unused) {
                    }
                    window.getDecorView().setTag(com.logistics.rider.glovo.R.id.metricsDelegator, null);
                }
            }
            setnativeshader.MediaMetadataCompat = 0L;
            return;
        }
        if (setnativeshader.MediaMetadataCompat == 0) {
            Window window2 = setnativeshader.PlaybackStateCompatCustomAction;
            setNativeFilterQuality50PEsBU setnativefilterquality50pesbu2 = setnativeshader.RatingCompat;
            window2.getClass();
            setnativefilterquality50pesbu2.getClass();
            if (window2.getDecorView().isHardwareAccelerated()) {
                DelegatingFrameMetricsListener delegatingFrameMetricsListener2 = (DelegatingFrameMetricsListener) window2.getDecorView().getTag(com.logistics.rider.glovo.R.id.metricsDelegator);
                if (delegatingFrameMetricsListener2 == null) {
                    int iSerializer = getQueryParameterslambda2.serializer();
                    int iSerializer2 = getQueryParameterslambda2.serializer();
                    DelegatingFrameMetricsListener delegatingFrameMetricsListener3 = new DelegatingFrameMetricsListener((ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -866125098, new Object[]{new Window.OnFrameMetricsAvailableListener[]{setnativefilterquality50pesbu2}}, getQueryParameterslambda2.serializer(), 866125100, iSerializer));
                    if (DelegatingFrameMetricsListener.RemoteActionCompatParcelizer == null) {
                        HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                        handlerThread.start();
                        DelegatingFrameMetricsListener.RemoteActionCompatParcelizer = new Handler(handlerThread.getLooper());
                    }
                    window2.getDecorView().setTag(com.logistics.rider.glovo.R.id.metricsDelegator, delegatingFrameMetricsListener3);
                    window2.addOnFrameMetricsAvailableListener(delegatingFrameMetricsListener3, DelegatingFrameMetricsListener.RemoteActionCompatParcelizer);
                } else {
                    synchronized (delegatingFrameMetricsListener2) {
                        delegatingFrameMetricsListener2.read.add(setnativefilterquality50pesbu2);
                    }
                }
                setnativeshader.MediaMetadataCompat = System.nanoTime();
            }
        }
    }

    public /* synthetic */ LifecycleUtils$$ExternalSyntheticLambda4(boolean z, setNativeShader setnativeshader) {
        this.f$1 = z;
        this.f$0 = setnativeshader;
    }
}
