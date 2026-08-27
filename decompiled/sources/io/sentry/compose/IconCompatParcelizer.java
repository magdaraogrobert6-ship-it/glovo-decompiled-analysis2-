package io.sentry.compose;

import io.sentry.android.navigation.SentryNavigationListener;
import kotlinx.coroutines.DelayKt;
import o.AndroidColorSpace_androidKt;
import o.BannerViewcreateBannerWebViewClientListener1;
import o.BrazeContentCardsManager;
import o.accessisRenderNodeCompatiblecp;
import o.cubicTo;
import o.relativeMoveTo;
import o.toAndroidColorSpace;
import o.toAndroidTileMode0vamqd0;

/* JADX INFO: loaded from: classes4.dex */
public final class IconCompatParcelizer implements toAndroidColorSpace {
    public final SentryNavigationListener read;
    public final relativeMoveTo serializer;

    @Override // o.toAndroidColorSpace
    public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        toAndroidTileMode0vamqd0 toandroidtilemode0vamqd0 = this.serializer.read;
        AndroidColorSpace_androidKt androidColorSpace_androidKt2 = AndroidColorSpace_androidKt.ON_RESUME;
        SentryNavigationListener sentryNavigationListener = this.read;
        if (androidColorSpace_androidKt != androidColorSpace_androidKt2) {
            if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_PAUSE) {
                sentryNavigationListener.getClass();
                toandroidtilemode0vamqd0.getClass();
                toandroidtilemode0vamqd0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.remove(sentryNavigationListener);
                return;
            }
            return;
        }
        sentryNavigationListener.getClass();
        toandroidtilemode0vamqd0.getClass();
        toandroidtilemode0vamqd0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.add(sentryNavigationListener);
        BrazeContentCardsManager brazeContentCardsManager = toandroidtilemode0vamqd0.MediaSessionCompatQueueItem;
        if (brazeContentCardsManager.isEmpty()) {
            return;
        }
        cubicTo cubicto = (cubicTo) brazeContentCardsManager.serializer();
        sentryNavigationListener.write(toandroidtilemode0vamqd0.ResultReceiver, cubicto.IconCompatParcelizer, cubicto.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer());
    }

    public IconCompatParcelizer(relativeMoveTo relativemoveto, SentryNavigationListener sentryNavigationListener) {
        sentryNavigationListener.getClass();
        this.serializer = relativemoveto;
        this.read = sentryNavigationListener;
        DelayKt.MediaSessionCompatToken("ComposeNavigation");
    }

    static {
        BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().IconCompatParcelizer("maven:io.sentry:sentry-compose", "8.32.0");
    }
}
