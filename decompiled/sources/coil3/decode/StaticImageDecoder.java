package coil3.decode;

import android.graphics.ImageDecoder;
import bo.app.h$$ExternalSyntheticLambda0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.InterruptibleKt$runInterruptible$2;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import o.PathKt;
import o.accessgetUnioncp;
import o.accessiteratorjd;
import o.calculateSizedefault;
import o.cancelPendingWebViewPause;
import o.getBlurRadiusannotations;
import o.getDefaultInAppMessageViewFactory;
import o.getDifferenceannotations;
import o.getInAppMessageManagerListener;
import o.getIntersectannotations;
import o.getReverseDifferenceb3I0S0c;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class StaticImageDecoder {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final getInAppMessageManagerListener read;
    public final getBlurRadiusannotations serializer;
    public final Object write;

    public StaticImageDecoder(getReverseDifferenceb3I0S0c getreversedifferenceb3i0s0c, getBlurRadiusannotations getblurradiusannotations, getInAppMessageManagerListener getinappmessagemanagerlistener, accessgetUnioncp accessgetunioncp) {
        this.IconCompatParcelizer = getreversedifferenceb3i0s0c;
        this.serializer = getblurradiusannotations;
        this.read = getinappmessagemanagerlistener;
        this.write = accessgetunioncp;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16, types: [o.getDefaultInAppMessageViewFactory] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r1v3, types: [o.getDefaultInAppMessageViewFactory] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final Object decode(ContinuationImpl continuationImpl) {
        getDifferenceannotations getdifferenceannotations;
        getInAppMessageManagerListener getinappmessagemanagerlistener;
        calculateSizedefault calculatesizedefault;
        ?? r1;
        ?? r0;
        int i = this.RemoteActionCompatParcelizer;
        getInAppMessageManagerListener getinappmessagemanagerlistener2 = this.read;
        if (i == 0) {
            if (continuationImpl instanceof getDifferenceannotations) {
                getdifferenceannotations = (getDifferenceannotations) continuationImpl;
                int i2 = getdifferenceannotations.write;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    getdifferenceannotations.write = i2 - Integer.MIN_VALUE;
                } else {
                    getdifferenceannotations = new getDifferenceannotations(this, continuationImpl);
                }
            } else {
                getdifferenceannotations = new getDifferenceannotations(this, continuationImpl);
            }
            Object obj = getdifferenceannotations.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = getdifferenceannotations.write;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getdifferenceannotations.IconCompatParcelizer = getinappmessagemanagerlistener2;
                getdifferenceannotations.write = 1;
                if (getinappmessagemanagerlistener2.acquire(getdifferenceannotations) == coroutineSingletons) {
                    getinappmessagemanagerlistener = getinappmessagemanagerlistener2;
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                getInAppMessageManagerListener getinappmessagemanagerlistener3 = getdifferenceannotations.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getinappmessagemanagerlistener = getinappmessagemanagerlistener3;
            }
            try {
                getinappmessagemanagerlistener = getinappmessagemanagerlistener2;
                AutoCloseable autoCloseable = (AutoCloseable) this.write;
                try {
                    cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
                    PathKt pathKt = new PathKt(new accessiteratorjd(ImageDecoder.decodeBitmap((ImageDecoder.Source) this.IconCompatParcelizer, new getIntersectannotations(this, cancelpendingwebviewpause))), cancelpendingwebviewpause.IconCompatParcelizer);
                    Okio.RemoteActionCompatParcelizer(autoCloseable, null);
                    getinappmessagemanagerlistener.IconCompatParcelizer();
                    return pathKt;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        Okio.RemoteActionCompatParcelizer(autoCloseable, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                getinappmessagemanagerlistener.IconCompatParcelizer();
                throw th3;
            }
        }
        if (continuationImpl instanceof calculateSizedefault) {
            calculatesizedefault = (calculateSizedefault) continuationImpl;
            int i4 = calculatesizedefault.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                calculatesizedefault.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                calculatesizedefault = new calculateSizedefault(this, continuationImpl);
            }
        } else {
            calculatesizedefault = new calculateSizedefault(this, continuationImpl);
        }
        Object objWithContext = calculatesizedefault.write;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = calculatesizedefault.RemoteActionCompatParcelizer;
        try {
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                calculatesizedefault.IconCompatParcelizer = getinappmessagemanagerlistener2;
                calculatesizedefault.RemoteActionCompatParcelizer = 1;
                if (getinappmessagemanagerlistener2.acquire(calculatesizedefault) != coroutineSingletons2) {
                }
                r1 = getinappmessagemanagerlistener2;
                return coroutineSingletons2;
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r0 = calculatesizedefault.IconCompatParcelizer;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                    r0 = r0;
                    PathKt pathKt2 = (PathKt) objWithContext;
                    ((SemaphoreAndMutexImpl) r0).IconCompatParcelizer();
                    return pathKt2;
                } catch (Throwable th4) {
                    th = th4;
                    r1 = r0;
                    ((SemaphoreAndMutexImpl) r1).IconCompatParcelizer();
                    throw th;
                }
            }
            getDefaultInAppMessageViewFactory getdefaultinappmessageviewfactory = calculatesizedefault.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            r1 = getdefaultinappmessageviewfactory;
            r1 = getinappmessagemanagerlistener2;
            h$$ExternalSyntheticLambda0 h__externalsyntheticlambda0 = new h$$ExternalSyntheticLambda0(28, this);
            calculatesizedefault.IconCompatParcelizer = r1;
            calculatesizedefault.RemoteActionCompatParcelizer = 2;
            objWithContext = BuildersKt.withContext(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, new InterruptibleKt$runInterruptible$2(h__externalsyntheticlambda0, null), calculatesizedefault);
            if (objWithContext != coroutineSingletons2) {
                r0 = r1;
                PathKt pathKt3 = (PathKt) objWithContext;
                ((SemaphoreAndMutexImpl) r0).IconCompatParcelizer();
                return pathKt3;
            }
            r1 = getinappmessagemanagerlistener2;
            return coroutineSingletons2;
        } catch (Throwable th5) {
            th = th5;
            ((SemaphoreAndMutexImpl) r1).IconCompatParcelizer();
            throw th;
        }
    }

    public StaticImageDecoder(ImageDecoder.Source source, AutoCloseable autoCloseable, getBlurRadiusannotations getblurradiusannotations, getInAppMessageManagerListener getinappmessagemanagerlistener) {
        this.IconCompatParcelizer = source;
        this.write = autoCloseable;
        this.serializer = getblurradiusannotations;
        this.read = getinappmessagemanagerlistener;
    }
}
