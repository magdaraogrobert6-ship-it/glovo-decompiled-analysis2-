package com.braze.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import android.widget.ImageView;
import bo.app.a5$$ExternalSyntheticLambda4;
import bo.app.m0;
import bo.app.n$$ExternalSyntheticLambda2;
import bo.app.n0;
import bo.app.s4;
import bo.app.t4;
import bo.app.u4;
import bo.app.x4;
import com.braze.BrazeUser$$ExternalSyntheticLambda1;
import com.braze.BrazeUser$$ExternalSyntheticLambda3;
import com.braze.R;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.FeatureFlag;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.b$$ExternalSyntheticLambda1;
import com.braze.ui.actions.UriAction$$ExternalSyntheticLambda4;
import com.mapbox.common.HttpHeaders;
import java.io.File;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.BuildersKt;
import o.SweepGradientShader9KIMszodefault;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultBrazeImageLoader implements IBrazeImageLoader {
    public static final String BRAZE_LRU_CACHE_FOLDER = "appboy.imageloader.lru.cache";
    private static final String CACHE_PARAMETER_KEY = "cache";
    private static final int DISK_CACHE_SIZE = 52428800;
    private final ReentrantLock diskCacheLock;
    private n0 diskLruCache;
    private boolean isDiskCacheStarting;
    private final AtomicBoolean isOffline;
    private final LruCache<String, Bitmap> memoryCache;
    public static final t4 Companion = new t4();
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) DefaultBrazeImageLoader.class);

    public final LruCache<String, Bitmap> getMemoryCache() {
        return this.memoryCache;
    }

    public final boolean isDiskCacheStarting() {
        return this.isDiskCacheStarting;
    }

    public static final void deleteStoredData(Context context) {
        Companion.a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromCache$lambda$1$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Got bitmap from disk cache for key ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromCache$lambda$2(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("No cache hit for bitmap: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromDiskCache$lambda$0$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Disk cache still starting. Cannot retrieve key from disk cache: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromDiskCache$lambda$0$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Getting bitmap from disk cache for key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromUrl$lambda$0() {
        return "Cannot retrieve bitmap with blank image url";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromUrl$lambda$2() {
        return "Cache is currently in offline mode. Not downloading bitmap.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromUrl$lambda$3(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to get bitmap from url. Url: ", str);
    }

    public static final File getDiskCacheDir(Context context, String str) {
        Companion.getClass();
        return t4.a(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String putBitmapIntoCache$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Adding bitmap to mem cache for key ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String putBitmapIntoCache$lambda$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Skipping disk cache for key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String putBitmapIntoCache$lambda$2$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Adding bitmap to disk cache for key ", str);
    }

    private final Bitmap putBitmapIntoMemCache(String str, Bitmap bitmap) {
        return this.memoryCache.put(str, bitmap);
    }

    private final void renderUrlIntoView(Context context, String str, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(22), 7, (Object) null);
            return;
        }
        try {
            renderUrlIntoViewTask$android_sdk_base_release(context, imageView, brazeViewBounds, str);
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 27), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderUrlIntoView$lambda$0() {
        return "Cannot retrieve bitmap with a blank image url";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderUrlIntoView$lambda$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to render url into view. Url: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String shouldSkipCaching$lambda$0(Uri uri) {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "Image url specifies that it should not be cached. Not caching ");
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void setOffline(boolean z) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda4(z, 6), 6, (Object) null);
        this.isOffline.set(z);
    }

    public final boolean shouldSkipCaching(Uri uri, Map<String, ? extends List<String>> map) {
        uri.getClass();
        int i = 1;
        if (!uri.getBooleanQueryParameter(CACHE_PARAMETER_KEY, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new UriAction$$ExternalSyntheticLambda4(i, uri), 7, (Object) null);
            return true;
        }
        if (map == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            if (setCarryoverInAppMessage.serializer(entry.getKey(), HttpHeaders.CACHE_CONTROL, true)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Iterable<String> iterable = (Iterable) entry2.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (String str : iterable) {
                    if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "no-cache", true) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "max-age=0", true)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(entry2, 20, uri), 7, (Object) null);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public DefaultBrazeImageLoader(Context context) {
        context.getClass();
        this.diskCacheLock = new ReentrantLock();
        this.isDiskCacheStarting = true;
        this.isOffline = new AtomicBoolean(false);
        this.memoryCache = new s4(BrazeImageUtils.getImageLoaderCacheSize());
        initDiskCacheTask(context);
    }

    public final m0 downloadBitmapFromUrl(Context context, Uri uri, BrazeViewBounds brazeViewBounds) {
        context.getClass();
        uri.getClass();
        if (brazeViewBounds == null) {
            brazeViewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return BrazeImageUtils.getBitmap(context, uri, brazeViewBounds);
    }

    public final Bitmap getBitmapFromCache(String str) {
        str.getClass();
        Bitmap bitmap = this.memoryCache.get(str);
        if (bitmap != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(str, 19, this), 6, (Object) null);
            return bitmap;
        }
        Bitmap bitmapFromDiskCache = getBitmapFromDiskCache(str);
        if (bitmapFromDiskCache == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str, 2), 7, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str, 1), 6, (Object) null);
        putBitmapIntoMemCache(str, bitmapFromDiskCache);
        return bitmapFromDiskCache;
    }

    public final Bitmap getBitmapFromDiskCache(String str) {
        str.getClass();
        ReentrantLock reentrantLock = this.diskCacheLock;
        reentrantLock.lock();
        try {
            if (this.isDiskCacheStarting) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 26), 6, (Object) null);
            } else {
                n0 n0Var = this.diskLruCache;
                if (n0Var == null) {
                    removeNodeAtDepth.serializer("diskLruCache");
                    throw null;
                }
                if (n0Var.a(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 29), 6, (Object) null);
                    n0 n0Var2 = this.diskLruCache;
                    if (n0Var2 == null) {
                        removeNodeAtDepth.serializer("diskLruCache");
                        throw null;
                    }
                    Bitmap bitmapB = n0Var2.b(str);
                    reentrantLock.unlock();
                    return bitmapB;
                }
            }
            reentrantLock.unlock();
            return null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Bitmap getBitmapFromMemCache(String str) {
        str.getClass();
        return this.memoryCache.get(str);
    }

    public final Bitmap getBitmapFromUrl(Context context, String str, BrazeViewBounds brazeViewBounds) {
        context.getClass();
        str.getClass();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(23), 7, (Object) null);
            return null;
        }
        try {
            Bitmap bitmapFromCache = getBitmapFromCache(str);
            if (bitmapFromCache != null) {
                return bitmapFromCache;
            }
            if (this.isOffline.get()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(24), 7, (Object) null);
                return null;
            }
            Uri uri = Uri.parse(str);
            m0 m0VarDownloadBitmapFromUrl = downloadBitmapFromUrl(context, uri, brazeViewBounds);
            if (m0VarDownloadBitmapFromUrl.a == null) {
                return null;
            }
            if (!shouldSkipCaching(uri, m0VarDownloadBitmapFromUrl.b)) {
                putBitmapIntoCache(str, m0VarDownloadBitmapFromUrl.a, BrazeFileUtils.isLocalUri(uri));
            }
            return m0VarDownloadBitmapFromUrl.a;
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(str, 28), 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getInAppMessageBitmapFromUrl(Context context, IInAppMessage iInAppMessage, String str, BrazeViewBounds brazeViewBounds) {
        context.getClass();
        iInAppMessage.getClass();
        str.getClass();
        return getBitmapFromUrl(context, str, brazeViewBounds);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getPushBitmapFromUrl(Context context, Bundle bundle, String str, BrazeViewBounds brazeViewBounds) {
        context.getClass();
        str.getClass();
        return getBitmapFromUrl(context, str, brazeViewBounds);
    }

    public final void putBitmapIntoCache(String str, Bitmap bitmap, boolean z) {
        str.getClass();
        bitmap.getClass();
        if (getBitmapFromMemCache(str) == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str, 3), 7, (Object) null);
            this.memoryCache.put(str, bitmap);
        }
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str, 4), 7, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.diskCacheLock;
        reentrantLock.lock();
        try {
            if (!this.isDiskCacheStarting) {
                n0 n0Var = this.diskLruCache;
                if (n0Var == null) {
                    removeNodeAtDepth.serializer("diskLruCache");
                    throw null;
                }
                if (!n0Var.a(str)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str, 5), 7, (Object) null);
                    n0 n0Var2 = this.diskLruCache;
                    if (n0Var2 == null) {
                        removeNodeAtDepth.serializer("diskLruCache");
                        throw null;
                    }
                    n0Var2.a(str, bitmap);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void renderUrlIntoCardView(Context context, Card card, String str, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        context.getClass();
        card.getClass();
        str.getClass();
        imageView.getClass();
        renderUrlIntoView(context, str, imageView, brazeViewBounds);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void renderUrlIntoInAppMessageView(Context context, IInAppMessage iInAppMessage, String str, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        context.getClass();
        iInAppMessage.getClass();
        str.getClass();
        imageView.getClass();
        renderUrlIntoView(context, str, imageView, brazeViewBounds);
    }

    public final void renderUrlIntoViewTask$android_sdk_base_release(Context context, ImageView imageView, BrazeViewBounds brazeViewBounds, String str) {
        context.getClass();
        imageView.getClass();
        str.getClass();
        imageView.setTag(R.string.com_braze_image_lru_cache_image_url_key, str);
        BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new x4(this, context, str, brazeViewBounds, imageView, null), 3);
    }

    public static /* synthetic */ m0 downloadBitmapFromUrl$default(DefaultBrazeImageLoader defaultBrazeImageLoader, Context context, Uri uri, BrazeViewBounds brazeViewBounds, int i, Object obj) {
        if ((i & 4) != 0) {
            brazeViewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return defaultBrazeImageLoader.downloadBitmapFromUrl(context, uri, brazeViewBounds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setOffline$lambda$0(boolean z) {
        String str;
        if (z) {
            str = "disabled";
        } else {
            str = FeatureFlag.ENABLED;
        }
        return "DefaultBrazeImageLoader outbound network requests are now ".concat(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String shouldSkipCaching$lambda$2$1(Map.Entry entry, Uri uri) {
        return "Headers specify that this image should not be cached (" + entry + "). Not caching " + uri;
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void shutdown() {
        super.shutdown();
        setOffline(true);
        n0 n0Var = this.diskLruCache;
        if (n0Var != null) {
            n0Var.a();
        }
    }

    private final void initDiskCacheTask(Context context) {
        BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new u4(context, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBitmapFromCache$lambda$0$0(String str, DefaultBrazeImageLoader defaultBrazeImageLoader) {
        return "Got bitmap from mem cache for key " + str + "\nMemory cache stats: " + defaultBrazeImageLoader.memoryCache;
    }
}
