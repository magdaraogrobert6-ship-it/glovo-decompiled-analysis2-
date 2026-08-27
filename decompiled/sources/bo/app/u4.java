package bo.app;

import android.content.Context;
import coil3.ExtrasKt;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class u4 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ DefaultBrazeImageLoader b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(Context context, DefaultBrazeImageLoader defaultBrazeImageLoader, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.a = context;
        this.b = defaultBrazeImageLoader;
    }

    public static final String a() {
        return "Initializing disk cache";
    }

    public static final String b() {
        return "Disk cache initialized";
    }

    public static final String c() {
        return "Image loader was replaced. Disk cache shut down";
    }

    public static final String d() {
        return "Caught exception creating new disk cache. Unable to create new disk cache";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new u4(this.a, this.b, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return new u4(this.a, this.b, (ShortNewsContentCardView) obj2).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        t4 t4Var = DefaultBrazeImageLoader.Companion;
        Context context = this.a;
        t4Var.getClass();
        File fileA = t4.a(context, DefaultBrazeImageLoader.BRAZE_LRU_CACHE_FOLDER);
        ReentrantLock reentrantLock = this.b.diskCacheLock;
        DefaultBrazeImageLoader defaultBrazeImageLoader = this.b;
        reentrantLock.lock();
        try {
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(21), 14, (Object) null);
                defaultBrazeImageLoader.diskLruCache = new n0(fileA);
                if (defaultBrazeImageLoader.isOffline.get()) {
                    BrazeLogger.brazelog$default(brazeLogger, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(23), 14, (Object) null);
                    n0 n0Var = defaultBrazeImageLoader.diskLruCache;
                    if (n0Var == null) {
                        removeNodeAtDepth.serializer("diskLruCache");
                        throw null;
                    }
                    n0Var.a();
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(22), 14, (Object) null);
                    defaultBrazeImageLoader.isDiskCacheStarting = false;
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DefaultBrazeImageLoader.TAG, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o8$$ExternalSyntheticLambda6(24), 8, (Object) null);
            }
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            reentrantLock.unlock();
            return createfromparcel;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
