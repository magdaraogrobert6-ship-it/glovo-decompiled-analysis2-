package androidx.compose.ui.text.font;

import androidx.collection.LruCache;
import androidx.compose.ui.text.platform.SynchronizedObject;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.IconCompatParcelizer;
import o.ShortNewsContentCardView;
import o.detectDragGestures;
import o.getCieXyz;
import o.onRemeasuredozmzZPI;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AsyncTypefaceCache {
    public static final int $stable = 8;
    private final SynchronizedObject cacheLock;
    private final onRemeasuredozmzZPI permanentCache;
    private final Object PermanentFailure = AsyncTypefaceResult.m3145constructorimpl(null);
    private final LruCache resultCache = new LruCache(16);

    @r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc
    public static final class AsyncTypefaceResult {
        private final Object result;

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static Object m3145constructorimpl(Object obj) {
            return obj;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3147equalsimpl0(Object obj, Object obj2) {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{obj, obj2}, iWrite3)).booleanValue();
        }

        /* JADX INFO: renamed from: isPermanentFailure-impl, reason: not valid java name */
        public static final boolean m3149isPermanentFailureimpl(Object obj) {
            return obj == null;
        }

        public final Object getResult() {
            return this.result;
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Object m3151unboximpl() {
            return this.result;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ AsyncTypefaceResult m3144boximpl(Object obj) {
            return new AsyncTypefaceResult(obj);
        }

        public boolean equals(Object obj) {
            return m3146equalsimpl(this.result, obj);
        }

        public int hashCode() {
            return m3148hashCodeimpl(this.result);
        }

        public String toString() {
            return m3150toStringimpl(this.result);
        }

        private /* synthetic */ AsyncTypefaceResult(Object obj) {
            this.result = obj;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3148hashCodeimpl(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3150toStringimpl(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3146equalsimpl(Object obj, Object obj2) {
            if (!(obj2 instanceof AsyncTypefaceResult)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, ((AsyncTypefaceResult) obj2).m3151unboximpl()}, getCieXyz.write())).booleanValue();
        }
    }

    public static final class Key {
        public static final int $stable = 8;
        private final Font font;
        private final Object loaderKey;

        public final Font component1() {
            return this.font;
        }

        public final Object component2() {
            return this.loaderKey;
        }

        public final Font getFont() {
            return this.font;
        }

        public final Object getLoaderKey() {
            return this.loaderKey;
        }

        public final Key copy(Font font, Object obj) {
            return new Key(font, obj);
        }

        public int hashCode() {
            int iHashCode = this.font.hashCode();
            Object obj = this.loaderKey;
            return (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
        }

        public Key(Font font, Object obj) {
            this.font = font;
            this.loaderKey = obj;
        }

        public static /* synthetic */ Key copy$default(Key key, Font font, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                font = key.font;
            }
            if ((i & 2) != 0) {
                obj = key.loaderKey;
            }
            return key.copy(font, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.font, key.font}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.loaderKey, key.loaderKey}, getCieXyz.write())).booleanValue();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Key(font=");
            sb.append(this.font);
            sb.append(", loaderKey=");
            return IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.loaderKey, ')');
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AsyncTypefaceCache.this.runCached(null, null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: get-1ASDuI8, reason: not valid java name */
    public final AsyncTypefaceResult m3143get1ASDuI8(Font font, PlatformFontLoader platformFontLoader) {
        AsyncTypefaceResult asyncTypefaceResult;
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            asyncTypefaceResult = (AsyncTypefaceResult) this.resultCache.get(key);
            if (asyncTypefaceResult == null) {
                asyncTypefaceResult = (AsyncTypefaceResult) this.permanentCache.MediaBrowserCompatMediaItem(key);
            }
        }
        return asyncTypefaceResult;
    }

    public final void put(Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z) {
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            try {
                if (obj == null) {
                    this.permanentCache.write(key, AsyncTypefaceResult.m3144boximpl(this.PermanentFailure));
                } else if (z) {
                    this.permanentCache.write(key, AsyncTypefaceResult.m3144boximpl(AsyncTypefaceResult.m3145constructorimpl(obj)));
                } else {
                    this.resultCache.put(key, AsyncTypefaceResult.m3144boximpl(AsyncTypefaceResult.m3145constructorimpl(obj)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AsyncTypefaceCache() {
        long[] jArr = detectDragGestures.write;
        this.permanentCache = new onRemeasuredozmzZPI();
        this.cacheLock = new SynchronizedObject();
    }

    public final Object runCachedBlocking(Font font, PlatformFontLoader platformFontLoader, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        synchronized (this.cacheLock) {
            Key key = new Key(font, platformFontLoader.getCacheKey());
            AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceResult) this.resultCache.get(key);
            if (asyncTypefaceResult == null) {
                asyncTypefaceResult = (AsyncTypefaceResult) this.permanentCache.MediaBrowserCompatMediaItem(key);
            }
            if (asyncTypefaceResult != null) {
                return asyncTypefaceResult.m3151unboximpl();
            }
            Object objInvoke = r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            put$default(this, font, platformFontLoader, objInvoke, false, 8, null);
            return objInvoke;
        }
    }

    public static /* synthetic */ void put$default(AsyncTypefaceCache asyncTypefaceCache, Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            z = false;
        }
        asyncTypefaceCache.put(font, platformFontLoader, obj, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object runCached(Font font, PlatformFontLoader platformFontLoader, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView<Object> shortNewsContentCardView) {
        AnonymousClass1 anonymousClass1;
        Key key;
        if (shortNewsContentCardView instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) shortNewsContentCardView;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
        }
        Object obj = anonymousClass1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Key key2 = new Key(font, platformFontLoader.getCacheKey());
            synchronized (this.cacheLock) {
                AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceResult) this.resultCache.get(key2);
                if (asyncTypefaceResult == null) {
                    asyncTypefaceResult = (AsyncTypefaceResult) this.permanentCache.MediaBrowserCompatMediaItem(key2);
                }
                if (asyncTypefaceResult != null) {
                    return asyncTypefaceResult.m3151unboximpl();
                }
                anonymousClass1.L$0 = key2;
                anonymousClass1.Z$0 = z;
                anonymousClass1.label = 1;
                Object objInvoke = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(anonymousClass1);
                if (objInvoke == obj2) {
                    return obj2;
                }
                obj = objInvoke;
                key = key2;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = anonymousClass1.Z$0;
            key = (Key) anonymousClass1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        synchronized (this.cacheLock) {
            try {
                if (obj == null) {
                    this.permanentCache.write(key, AsyncTypefaceResult.m3144boximpl(this.PermanentFailure));
                } else if (z) {
                    this.permanentCache.write(key, AsyncTypefaceResult.m3144boximpl(AsyncTypefaceResult.m3145constructorimpl(obj)));
                } else {
                    this.resultCache.put(key, AsyncTypefaceResult.m3144boximpl(AsyncTypefaceResult.m3145constructorimpl(obj)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
