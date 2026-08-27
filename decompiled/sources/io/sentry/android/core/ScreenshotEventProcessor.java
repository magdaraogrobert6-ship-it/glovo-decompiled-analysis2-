package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Bitmap;
import com.deliveryhero.fwf_http.ConstantKt;
import io.sentry.SentryEnvelopeItem$$ExternalSyntheticLambda3;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.DelayKt;
import o.BannerViewExternalSyntheticLambda2;
import o.executelambda4;
import o.getIntentArrayWithConfiguredBackStacklambda3;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class ScreenshotEventProcessor implements r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI {
    public final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ IconCompatParcelizer;
    public final SentryAndroidOptions serializer;
    public final io.sentry.android.core.internal.util.MediaDescriptionCompat write;

    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final io.sentry.protocol.accessensureViewModelStore RemoteActionCompatParcelizer(io.sentry.protocol.accessensureViewModelStore accessensureviewmodelstore, executelambda4 executelambda4Var) {
        return accessensureviewmodelstore;
    }

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq) {
        setNativeShader.read(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.serializer = sentryAndroidOptions;
        this.IconCompatParcelizer = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
        this.write = new io.sentry.android.core.internal.util.MediaDescriptionCompat(ConstantKt.DEFAULT_REQUEST_TIMEOUT, 3);
        if (sentryAndroidOptions.isAttachScreenshot()) {
            DelayKt.MediaSessionCompatToken("Screenshot");
        }
    }

    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final BannerViewExternalSyntheticLambda2 read(BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2, executelambda4 executelambda4Var) {
        if (bannerViewExternalSyntheticLambda2.read()) {
            SentryAndroidOptions sentryAndroidOptions = this.serializer;
            if (!sentryAndroidOptions.isAttachScreenshot()) {
                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "attachScreenshot is disabled.", new Object[0]);
                return bannerViewExternalSyntheticLambda2;
            }
            WeakReference weakReference = (WeakReference) r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer.write;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            if (activity != null && !pauseWebviewIfNecessarylambda10.IconCompatParcelizer(executelambda4Var)) {
                boolean zIconCompatParcelizer = this.write.IconCompatParcelizer();
                sentryAndroidOptions.getBeforeScreenshotCaptureCallback();
                if (!zIconCompatParcelizer) {
                    sentryAndroidOptions.getThreadChecker();
                    Bitmap bitmapIconCompatParcelizer = io.sentry.android.core.internal.util.ParcelableVolumeInfo.IconCompatParcelizer(activity, sentryAndroidOptions.getLogger(), this.IconCompatParcelizer);
                    if (bitmapIconCompatParcelizer != null) {
                        executelambda4Var.MediaBrowserCompatMediaItem = new getIntentArrayWithConfiguredBackStacklambda3(new SentryEnvelopeItem$$ExternalSyntheticLambda3(this, 10, bitmapIconCompatParcelizer));
                        executelambda4Var.RemoteActionCompatParcelizer("android:activity", activity);
                    }
                }
            }
        }
        return bannerViewExternalSyntheticLambda2;
    }
}
