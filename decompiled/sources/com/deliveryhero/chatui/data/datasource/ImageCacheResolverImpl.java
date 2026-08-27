package com.deliveryhero.chatui.data.datasource;

import android.app.Application;
import android.net.Uri;
import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import coil3.ExtrasKt;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.SentryUUID;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.GraphicsLayertoImageBitmap1;
import o.ShortNewsContentCardView;
import o.SweepGradientShader9KIMszodefault;
import o.clearFocusdefault;
import o.getHasDisplayList;
import o.getPositionInRoot;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setOutlineSpotShadowColor;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageCacheResolverImpl implements getHasDisplayList {
    public final Application read;

    public final String write(Uri uri, String str) throws IOException {
        String strRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, ".jpg");
        Application application = this.read;
        File file = new File(application.getCacheDir(), strRemoteActionCompatParcelizer);
        InputStream inputStreamOpenInputStream = application.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "Cannot open input stream for uri: "));
            return null;
        }
        try {
            FileOutputStream fileOutputStreamWrite = getPositionInRoot.write(new FileOutputStream(file), file);
            try {
                SentryUUID.RemoteActionCompatParcelizer(inputStreamOpenInputStream, fileOutputStreamWrite);
                fileOutputStreamWrite.close();
                inputStreamOpenInputStream.close();
                String string = clearFocusdefault.write(application, file, application.getPackageName() + ".com.deliveryhero.customerchat.image.provider").toString();
                string.getClass();
                return string;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileOutputStreamWrite, th}, sourceInformationContextOfdefault.read());
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{inputStreamOpenInputStream, th3}, sourceInformationContextOfdefault.read());
                throw th4;
            }
        }
    }

    public ImageCacheResolverImpl(Application application, setOutlineSpotShadowColor setoutlinespotshadowcolor) {
        this.read = application;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object cacheImageFile(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        GraphicsLayertoImageBitmap1 graphicsLayertoImageBitmap1;
        Uri uri;
        ImageCacheResolverImpl imageCacheResolverImpl;
        ImageCacheResolverImpl imageCacheResolverImpl2;
        String str3;
        Uri uri2;
        if (continuationImpl instanceof GraphicsLayertoImageBitmap1) {
            graphicsLayertoImageBitmap1 = (GraphicsLayertoImageBitmap1) continuationImpl;
            int i = graphicsLayertoImageBitmap1.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                graphicsLayertoImageBitmap1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                graphicsLayertoImageBitmap1 = new GraphicsLayertoImageBitmap1(this, continuationImpl);
            }
        } else {
            graphicsLayertoImageBitmap1 = new GraphicsLayertoImageBitmap1(this, continuationImpl);
        }
        Object objWithContext = graphicsLayertoImageBitmap1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = graphicsLayertoImageBitmap1.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                uri = Uri.parse(str2);
                uri.getClass();
                graphicsLayertoImageBitmap1.IconCompatParcelizer = this;
                graphicsLayertoImageBitmap1.read = str;
                graphicsLayertoImageBitmap1.write = uri;
                graphicsLayertoImageBitmap1.RemoteActionCompatParcelizer = 1;
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new FlowLiveDataConversions$asFlow$1$1(this, uri, shortNewsContentCardView, 4), graphicsLayertoImageBitmap1);
                if (objWithContext != coroutineSingletons) {
                    imageCacheResolverImpl = this;
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                Uri uri3 = graphicsLayertoImageBitmap1.write;
                String str4 = graphicsLayertoImageBitmap1.read;
                imageCacheResolverImpl = graphicsLayertoImageBitmap1.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                uri = uri3;
                str = str4;
            } else {
                if (i2 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uri2 = graphicsLayertoImageBitmap1.write;
                str3 = graphicsLayertoImageBitmap1.read;
                imageCacheResolverImpl2 = graphicsLayertoImageBitmap1.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            }
            imageCacheResolverImpl = imageCacheResolverImpl2;
            String str5 = str3;
            uri = uri2;
            str = str5;
            return imageCacheResolverImpl.write(uri, str);
            Long l = (Long) objWithContext;
            if (l != null) {
                if (imageCacheResolverImpl.read.getCacheDir().getFreeSpace() < l.longValue()) {
                    graphicsLayertoImageBitmap1.IconCompatParcelizer = imageCacheResolverImpl;
                    graphicsLayertoImageBitmap1.read = str;
                    graphicsLayertoImageBitmap1.write = uri;
                    graphicsLayertoImageBitmap1.RemoteActionCompatParcelizer = 2;
                    DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    if (BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new DiskLruCache$launchCleanup$1(imageCacheResolverImpl, shortNewsContentCardView, 3), graphicsLayertoImageBitmap1) != coroutineSingletons) {
                        imageCacheResolverImpl2 = imageCacheResolverImpl;
                        Uri uri4 = uri;
                        str3 = str;
                        uri2 = uri4;
                        imageCacheResolverImpl = imageCacheResolverImpl2;
                        String str6 = str3;
                        uri = uri2;
                        str = str6;
                    }
                    return coroutineSingletons;
                }
            }
            return imageCacheResolverImpl.write(uri, str);
        } catch (Exception unused) {
            return null;
        }
    }
}
