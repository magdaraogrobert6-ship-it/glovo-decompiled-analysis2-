package kotlinx.coroutines.reactive;

import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import o.DrawableTransformation;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;
import o.IInAppMessageViewWrapper;
import o.logUnregisterActivity;
import o.onBackCancelled;
import o.removeNodeAtDepth;
import o.resolveUnregisterDisplayedMessagelambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class ReactiveSubscriber implements FwFClientaddFeatureKeysfeaturesUpdated1 {
    public final long IconCompatParcelizer;
    public FwFClientclose11 RemoteActionCompatParcelizer;
    public final BufferedChannel write;

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onNext(Object obj) {
        BufferedChannel bufferedChannel = this.write;
        if (bufferedChannel.b_(obj) instanceof resolveUnregisterDisplayedMessagelambda0) {
            DrawableTransformation.serializer("Element ", obj, " was not added to channel because it was full, ", bufferedChannel);
        }
    }

    public ReactiveSubscriber(int i, IInAppMessageViewWrapper iInAppMessageViewWrapper, long j) {
        this.IconCompatParcelizer = j;
        this.write = SQLite.IconCompatParcelizer(i == 0 ? 1 : i, 4, iInAppMessageViewWrapper);
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onComplete() {
        this.write.IconCompatParcelizer((Throwable) null);
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onError(Throwable th) {
        this.write.read(th, false);
    }

    @Override // o.FwFClientaddFeatureKeysfeaturesUpdated1
    public final void onSubscribe(FwFClientclose11 fwFClientclose11) {
        this.RemoteActionCompatParcelizer = fwFClientclose11;
        if (fwFClientclose11 != null) {
            fwFClientclose11.request(this.IconCompatParcelizer);
        } else {
            removeNodeAtDepth.serializer("subscription");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object takeNextOrNull(ContinuationImpl continuationImpl) throws Throwable {
        onBackCancelled onbackcancelled;
        Object objM5146receiveCatchingJP2dKIU$suspendImpl;
        if (continuationImpl instanceof onBackCancelled) {
            onbackcancelled = (onBackCancelled) continuationImpl;
            int i = onbackcancelled.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                onbackcancelled.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                onbackcancelled = new onBackCancelled(this, continuationImpl);
            }
        } else {
            onbackcancelled = new onBackCancelled(this, continuationImpl);
        }
        Object obj = onbackcancelled.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = onbackcancelled.IconCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            onbackcancelled.IconCompatParcelizer = 1;
            BufferedChannel bufferedChannel = this.write;
            bufferedChannel.getClass();
            objM5146receiveCatchingJP2dKIU$suspendImpl = BufferedChannel.m5146receiveCatchingJP2dKIU$suspendImpl(bufferedChannel, onbackcancelled);
            if (objM5146receiveCatchingJP2dKIU$suspendImpl == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM5146receiveCatchingJP2dKIU$suspendImpl = ((logUnregisterActivity) obj).RemoteActionCompatParcelizer;
        }
        Throwable thWrite = logUnregisterActivity.write(objM5146receiveCatchingJP2dKIU$suspendImpl);
        if (thWrite != null) {
            throw thWrite;
        }
        if (objM5146receiveCatchingJP2dKIU$suspendImpl instanceof resolveUnregisterDisplayedMessagelambda0) {
            return null;
        }
        return objM5146receiveCatchingJP2dKIU$suspendImpl;
    }
}
