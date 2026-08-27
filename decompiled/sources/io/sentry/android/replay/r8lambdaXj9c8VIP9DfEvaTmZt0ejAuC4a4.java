package io.sentry.android.replay;

import android.view.View;
import android.view.ViewTreeObserver;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.SentryOptions;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import o.getWhite0d7_KjUannotations;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 implements ViewTreeObserver.OnDrawListener {
    public WeakReference IconCompatParcelizer;
    public final AtomicBoolean RemoteActionCompatParcelizer;
    public final io.sentry.android.replay.screenshot.read read;
    public final AtomicBoolean serializer = new AtomicBoolean(true);
    public final SentryOptions write;

    public final void IconCompatParcelizer(View view) {
        this.write.getReplayController().getClass();
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(this);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.serializer.get()) {
            WeakReference weakReference = this.IconCompatParcelizer;
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.write.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.RemoteActionCompatParcelizer.set(true);
                this.read.read();
            }
        }
    }

    public final void write() {
        SentryOptions sentryOptions = this.write;
        boolean z = sentryOptions.getSessionReplay().RemoteActionCompatParcelizer;
        AtomicBoolean atomicBoolean = this.serializer;
        if (z) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(atomicBoolean.get()));
        }
        if (!atomicBoolean.get()) {
            if (sentryOptions.getSessionReplay().RemoteActionCompatParcelizer) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        boolean z2 = sentryOptions.getSessionReplay().RemoteActionCompatParcelizer;
        io.sentry.android.replay.screenshot.read readVar = this.read;
        AtomicBoolean atomicBoolean2 = this.RemoteActionCompatParcelizer;
        if (z2) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(atomicBoolean2.get()), Boolean.valueOf(readVar.IconCompatParcelizer()));
        }
        if (!atomicBoolean2.get()) {
            readVar.RemoteActionCompatParcelizer();
            return;
        }
        WeakReference weakReference = this.IconCompatParcelizer;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (getWhite0d7_KjUannotations.IconCompatParcelizer(view) == null) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            atomicBoolean2.set(false);
            readVar.IconCompatParcelizer(view);
        } catch (Throwable th) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to capture replay recording", th);
        }
    }

    public r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4(SentryOptions sentryOptions, ReplayIntegration replayIntegration, r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq) {
        io.sentry.android.replay.screenshot.read writeVar;
        this.write = sentryOptions;
        io.sentry.android.replay.util.serializer serializerVar = new io.sentry.android.replay.util.serializer();
        this.RemoteActionCompatParcelizer = new AtomicBoolean(false);
        int i = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.RemoteActionCompatParcelizer[sentryOptions.getSessionReplay().MediaSessionCompatToken.ordinal()];
        if (i == 1) {
            writeVar = new io.sentry.android.replay.screenshot.write(sentryOptions, replayIntegration, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq);
        } else {
            if (i != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                throw null;
            }
            writeVar = new r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg(r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, replayIntegration, sentryOptions, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, serializerVar);
        }
        this.read = writeVar;
    }

    public final void write(View view) {
        view.getClass();
        WeakReference weakReference = this.IconCompatParcelizer;
        IconCompatParcelizer(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.IconCompatParcelizer;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.IconCompatParcelizer = new WeakReference(view);
        if (view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
            try {
                view.getViewTreeObserver().addOnDrawListener(this);
            } catch (IllegalStateException unused) {
            }
        }
        this.RemoteActionCompatParcelizer.set(true);
        this.read.read();
    }
}
