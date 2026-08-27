package io.sentry.android.replay.gestures;

import android.view.View;
import android.view.Window;
import io.sentry.SentryOptions;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
import io.sentry.android.replay.write;
import io.sentry.util.RemoteActionCompatParcelizer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.UriActionExternalSyntheticLambda4;
import o.getWhite0d7_KjUannotations;
import o.onContentCardDismissed;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer implements write {
    public final SentryOptions IconCompatParcelizer;
    public final ReplayIntegration read;
    public final ArrayList RemoteActionCompatParcelizer = new ArrayList();
    public final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer();

    public final void RemoteActionCompatParcelizer() {
        ArrayList arrayList = this.RemoteActionCompatParcelizer;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.write.serializer();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    RemoteActionCompatParcelizer(view);
                }
            }
            arrayList.clear();
            Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                throw th2;
            }
        }
    }

    public serializer(SentryOptions sentryOptions, ReplayIntegration replayIntegration) {
        this.IconCompatParcelizer = sentryOptions;
        this.read = replayIntegration;
    }

    @Override // io.sentry.android.replay.write
    public final void IconCompatParcelizer(View view, boolean z) {
        view.getClass();
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.write.serializer();
        ArrayList arrayList = this.RemoteActionCompatParcelizer;
        try {
            if (z) {
                arrayList.add(new WeakReference(view));
                SentryOptions sentryOptions = this.IconCompatParcelizer;
                Window windowIconCompatParcelizer = getWhite0d7_KjUannotations.IconCompatParcelizer(view);
                if (windowIconCompatParcelizer == null) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
                } else {
                    Window.Callback callback = windowIconCompatParcelizer.getCallback();
                    if (!(callback instanceof GestureRecorder$SentryReplayGestureRecorder)) {
                        windowIconCompatParcelizer.setCallback(new GestureRecorder$SentryReplayGestureRecorder(sentryOptions, this.read, callback));
                    }
                }
            } else {
                RemoteActionCompatParcelizer(view);
                onContentCardDismissed.write((List) arrayList, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw(1, view));
            }
            Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                throw th2;
            }
        }
    }

    public final void RemoteActionCompatParcelizer(View view) {
        Window windowIconCompatParcelizer = getWhite0d7_KjUannotations.IconCompatParcelizer(view);
        if (windowIconCompatParcelizer == null) {
            this.IconCompatParcelizer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = windowIconCompatParcelizer.getCallback();
        if (callback instanceof GestureRecorder$SentryReplayGestureRecorder) {
            windowIconCompatParcelizer.setCallback(((GestureRecorder$SentryReplayGestureRecorder) callback).IconCompatParcelizer);
        }
    }
}
