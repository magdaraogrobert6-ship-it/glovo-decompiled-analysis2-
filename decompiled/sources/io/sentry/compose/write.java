package io.sentry.compose;

import io.sentry.android.navigation.SentryNavigationListener;
import o.getPersonMiddleInitial;
import o.relativeMoveTo;
import o.supportsColorMatrixQuery;
import o.toAndroidTileMode0vamqd0;

/* JADX INFO: loaded from: classes4.dex */
public final class write implements getPersonMiddleInitial {
    public final /* synthetic */ IconCompatParcelizer RemoteActionCompatParcelizer;
    public final /* synthetic */ supportsColorMatrixQuery read;

    @Override // o.getPersonMiddleInitial
    public final void dispose() {
        IconCompatParcelizer iconCompatParcelizer = this.RemoteActionCompatParcelizer;
        relativeMoveTo relativemoveto = iconCompatParcelizer.serializer;
        SentryNavigationListener sentryNavigationListener = iconCompatParcelizer.read;
        sentryNavigationListener.getClass();
        toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = relativemoveto.read;
        toandroidtilemode0vamqd0.getClass();
        toandroidtilemode0vamqd0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.remove(sentryNavigationListener);
        this.read.read(iconCompatParcelizer);
    }

    public write(IconCompatParcelizer iconCompatParcelizer, supportsColorMatrixQuery supportscolormatrixquery) {
        this.RemoteActionCompatParcelizer = iconCompatParcelizer;
        this.read = supportscolormatrixquery;
    }
}
