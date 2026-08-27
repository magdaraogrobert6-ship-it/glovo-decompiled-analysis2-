package androidx.work.impl;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.SentryEnvelopeItem$$ExternalSyntheticLambda3;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import o.ImageBitmapx__hDU;
import o.ImageBitmapx__hDUdefault;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.onAnimationEndlambda0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.requirePrecondition;
import o.setRotationX;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerWrapper$launch$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ WorkerWrapper write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkerWrapper$launch$1(WorkerWrapper workerWrapper, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.write = workerWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.read;
        WorkerWrapper workerWrapper = this.write;
        return i != 0 ? new WorkerWrapper$launch$1(workerWrapper, shortNewsContentCardView, 1) : new WorkerWrapper$launch$1(workerWrapper, shortNewsContentCardView, 0);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((WorkerWrapper$launch$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((WorkerWrapper$launch$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object imageBitmapx__hDUdefault;
        int i = this.read;
        WorkerWrapper workerWrapper = this.write;
        int i2 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.RemoteActionCompatParcelizer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                Object objAccess$runWorker = WorkerWrapper.access$runWorker(workerWrapper, this);
                return objAccess$runWorker == coroutineSingletons ? coroutineSingletons : objAccess$runWorker;
            }
            if (i3 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.RemoteActionCompatParcelizer;
        try {
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                onAnimationEndlambda0 onanimationendlambda0 = workerWrapper.PlaybackStateCompat;
                WorkerWrapper$launch$1 workerWrapper$launch$1 = new WorkerWrapper$launch$1(workerWrapper, shortNewsContentCardView, i2);
                this.RemoteActionCompatParcelizer = 1;
                obj = BuildersKt.withContext(onanimationendlambda0, workerWrapper$launch$1, this);
                if (obj == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
            } else {
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            imageBitmapx__hDUdefault = (ImageBitmapx__hDU) obj;
        } catch (WorkerStoppedException e) {
            imageBitmapx__hDUdefault = new requirePrecondition(e.serializer);
        } catch (CancellationException unused) {
            imageBitmapx__hDUdefault = new ImageBitmapx__hDUdefault();
        } catch (Throwable th) {
            setRotationX.read().IconCompatParcelizer(WorkerWrapperKt.RemoteActionCompatParcelizer, "Unexpected error in WorkerWrapper", th);
            imageBitmapx__hDUdefault = new ImageBitmapx__hDUdefault();
        }
        Object objRunInTransaction = workerWrapper.MediaDescriptionCompat.runInTransaction(new SentryEnvelopeItem$$ExternalSyntheticLambda3(imageBitmapx__hDUdefault, 1, workerWrapper));
        objRunInTransaction.getClass();
        return objRunInTransaction;
    }
}
