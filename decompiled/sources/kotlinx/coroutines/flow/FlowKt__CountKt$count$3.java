package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createBrazeUserChangeEventSubscriberlambda01;

/* JADX INFO: loaded from: classes5.dex */
final class FlowKt__CountKt$count$3<T> extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public createBrazeUserChangeEventSubscriberlambda01 RemoteActionCompatParcelizer;
    public int read;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.read = (this.read | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.read;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.RemoteActionCompatParcelizer = new createBrazeUserChangeEventSubscriberlambda01();
            this.read = 1;
            throw null;
        }
        if (i != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01 = this.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return new Integer(createbrazeuserchangeeventsubscriberlambda01.read);
    }

    public FlowKt__CountKt$count$3(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
