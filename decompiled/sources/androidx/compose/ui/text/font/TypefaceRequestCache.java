package androidx.compose.ui.text.font;

import androidx.collection.LruCache;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.ui.text.platform.SynchronizedObject;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import o.createFromParcel;
import o.onViewAttachedToWindow;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class TypefaceRequestCache {
    public static final int $stable = 8;
    private final SynchronizedObject lock = new SynchronizedObject();
    private final LruCache resultCache = new LruCache(16);

    public final SynchronizedObject getLock$ui_text() {
        return this.lock;
    }

    public final void preWarmCache(List<TypefaceRequest> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        TypefaceResult typefaceResult;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            TypefaceRequest typefaceRequest = list.get(i);
            synchronized (this.lock) {
                typefaceResult = (TypefaceResult) this.resultCache.get(typefaceRequest);
            }
            if (typefaceResult == null) {
                try {
                    TypefaceResult typefaceResult2 = (TypefaceResult) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(typefaceRequest);
                    if (typefaceResult2 instanceof TypefaceResult.Async) {
                        continue;
                    }
                } catch (Exception e) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Could not load font", e);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final createFromParcel runCached$lambda$1(TypefaceRequestCache typefaceRequestCache, TypefaceRequest typefaceRequest, TypefaceResult typefaceResult) {
        synchronized (typefaceRequestCache.lock) {
            boolean cacheable = typefaceResult.getCacheable();
            LruCache lruCache = typefaceRequestCache.resultCache;
            if (cacheable) {
            }
        }
        return createFromParcel.INSTANCE;
    }

    public final TypefaceResult get$ui_text(TypefaceRequest typefaceRequest) {
        TypefaceResult typefaceResult;
        synchronized (this.lock) {
            typefaceResult = (TypefaceResult) this.resultCache.get(typefaceRequest);
        }
        return typefaceResult;
    }

    public final int getSize$ui_text() {
        int i;
        synchronized (this.lock) {
            LruCache lruCache = this.resultCache;
            synchronized (lruCache.IconCompatParcelizer) {
                i = lruCache.MediaMetadataCompat;
            }
        }
        return i;
    }

    public final onViewAttachedToWindow runCached(TypefaceRequest typefaceRequest, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        synchronized (this.lock) {
            TypefaceResult typefaceResult = (TypefaceResult) this.resultCache.get(typefaceRequest);
            if (typefaceResult != null) {
                if (typefaceResult.getCacheable()) {
                    return typefaceResult;
                }
            }
            try {
                TypefaceResult typefaceResult2 = (TypefaceResult) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new Recomposer$$ExternalSyntheticLambda4(this, 11, typefaceRequest));
                synchronized (this.lock) {
                    if (this.resultCache.get(typefaceRequest) == null && typefaceResult2.getCacheable()) {
                        this.resultCache.put(typefaceRequest, typefaceResult2);
                    }
                }
                return typefaceResult2;
            } catch (Exception e) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Could not load font", e);
                return null;
            }
        }
    }
}
