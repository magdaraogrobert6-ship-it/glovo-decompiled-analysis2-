package io.sentry.android.core;

import android.app.Activity;
import androidx.core.app.FrameMetricsAggregator;
import androidx.work.impl.WorkerWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RemoteActionCompatParcelizer implements Runnable {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ WorkerWrapper.Builder read;
    public final /* synthetic */ Activity write;

    public /* synthetic */ RemoteActionCompatParcelizer(WorkerWrapper.Builder builder, Activity activity, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = builder;
        this.write = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RemoteActionCompatParcelizer;
        Activity activity = this.write;
        WorkerWrapper.Builder builder = this.read;
        if (i != 0) {
            ((FrameMetricsAggregator) ((io.sentry.util.MediaMetadataCompat) builder.write).IconCompatParcelizer()).RemoteActionCompatParcelizer(activity);
        } else {
            ((FrameMetricsAggregator) ((io.sentry.util.MediaMetadataCompat) builder.write).IconCompatParcelizer()).IconCompatParcelizer(activity);
        }
    }
}
