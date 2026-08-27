package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import o.ShortNewsContentCardView;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.createFromParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1 implements Flow<Object> {
    public final /* synthetic */ Flow IconCompatParcelizer;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int RemoteActionCompatParcelizer;
        public Object read;
        public /* synthetic */ Object write;

        public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$take$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1(Flow flow) {
        this.IconCompatParcelizer = flow;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        AnonymousClass1 anonymousClass1;
        AbortFlowException e;
        Object obj;
        if (shortNewsContentCardView instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) shortNewsContentCardView;
            int i = anonymousClass1.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
        }
        Object obj2 = anonymousClass1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            Object obj3 = new Object();
            createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01 = new createBrazeUserChangeEventSubscriberlambda01();
            try {
                Flow flow = this.IconCompatParcelizer;
                FlowKt__LimitKt$take$2$1 flowKt__LimitKt$take$2$1 = new FlowKt__LimitKt$take$2$1(createbrazeuserchangeeventsubscriberlambda01, flowCollector, obj3);
                anonymousClass1.read = obj3;
                anonymousClass1.RemoteActionCompatParcelizer = 1;
                if (flow.collect(flowKt__LimitKt$take$2$1, anonymousClass1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (AbortFlowException e2) {
                e = e2;
                obj = obj3;
                if (e.write != obj) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = anonymousClass1.read;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.write != obj) {
                    throw e;
                }
            }
        }
        return createFromParcel.INSTANCE;
    }
}
