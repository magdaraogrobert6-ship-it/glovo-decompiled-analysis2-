package io.sentry.android.core.internal.util;

import android.view.PixelCopy;
import android.view.View;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import io.sentry.SentryOptions;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import o.dispatchKeyEventYhN2O0wdefault;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class MediaSessionCompatResultReceiverWrapper implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ MediaSessionCompatResultReceiverWrapper(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        int i2 = this.serializer;
        Object obj = this.RemoteActionCompatParcelizer;
        Object obj2 = this.IconCompatParcelizer;
        if (i2 == 0) {
            CountDownLatch countDownLatch = (CountDownLatch) obj;
            ((AtomicBoolean) obj2).set(i == 0);
            countDownLatch.countDown();
            return;
        }
        r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg r8lambdauosl1ojcz1lncaiooglfrbn5pcg = (r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg) obj2;
        View view = (View) obj;
        AtomicBoolean atomicBoolean = (AtomicBoolean) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.ParcelableVolumeInfo;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaSessionCompatToken;
        SentryOptions sentryOptions = (SentryOptions) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.serializer;
        if (atomicBoolean.get()) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "PixelCopyStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i != 0) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i));
            atomicBoolean2.set(false);
        } else if (((AtomicBoolean) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaSessionCompatResultReceiverWrapper).get()) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
            atomicBoolean2.set(false);
        } else {
            io.sentry.android.replay.viewhierarchy.IconCompatParcelizer iconCompatParcelizerWrite = dispatchKeyEventYhN2O0wdefault.write(view, null, sentryOptions);
            io.sentry.android.replay.util.MediaSessionCompatToken.read(view, iconCompatParcelizerWrite, sentryOptions);
            ((ScheduledExecutorService) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.RemoteActionCompatParcelizer).submit(new io.sentry.android.replay.util.IconCompatParcelizer(new Scopes$$ExternalSyntheticLambda0(r8lambdauosl1ojcz1lncaiooglfrbn5pcg, iconCompatParcelizerWrite, view), "screenshot_recorder.mask"));
        }
    }
}
