package o;

import coil3.ImageLoader$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fireOnDismissCallback {
    public static getInternalPath IconCompatParcelizer(getFilterQualityfv9h1I getfilterqualityfv9h1i) {
        getfilterqualityfv9h1i.getClass();
        AndroidPaint_androidKt androidPaint_androidKt = getBounds.RemoteActionCompatParcelizer;
        setPathEffect setpatheffect = setPathEffect.IconCompatParcelizer;
        androidPaint_androidKt.getClass();
        setpatheffect.getClass();
        ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(getfilterqualityfv9h1i, androidPaint_androidKt, setpatheffect);
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(getInternalPath.class);
        String strRemoteActionCompatParcelizer = r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer != null) {
            return (getInternalPath) imageLoader$Builder.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strRemoteActionCompatParcelizer));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static getAllUris RemoteActionCompatParcelizer(io.sentry.util.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        Class clsRemoteActionCompatParcelizer;
        if (!io.sentry.util.PlaybackStateCompatCustomAction.serializer) {
            r8lambdaea88sc6bNzdkREmuTaOF4vcCHI r8lambdaea88sc6bnzdkremutaof4vcchi = r8lambdaea88sc6bNzdkREmuTaOF4vcCHI.IconCompatParcelizer;
            if (io.sentry.util.MediaBrowserCompatMediaItem.write(r8lambdaea88sc6bnzdkremutaof4vcchi, "io.sentry.opentelemetry.OtelContextScopesStorage") && (clsRemoteActionCompatParcelizer = io.sentry.util.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(r8lambdaea88sc6bnzdkremutaof4vcchi, "io.sentry.opentelemetry.OtelContextScopesStorage")) != null) {
                try {
                    Object objNewInstance = clsRemoteActionCompatParcelizer.getDeclaredConstructor(null).newInstance(null);
                    if (objNewInstance != null && (objNewInstance instanceof getAllUris)) {
                        return (getAllUris) objNewInstance;
                    }
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
        }
        return new openUriWithWebViewActivityFromPush();
    }
}
