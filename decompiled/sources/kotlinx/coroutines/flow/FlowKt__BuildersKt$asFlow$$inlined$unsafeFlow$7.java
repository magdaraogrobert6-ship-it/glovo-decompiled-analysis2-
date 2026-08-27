package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7 implements Flow<Integer> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int IconCompatParcelizer;
        public FlowCollector RemoteActionCompatParcelizer;
        public int read;
        public int[] serializer;
        public /* synthetic */ Object write;

        public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7.this.collect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        AnonymousClass1 anonymousClass1;
        Integer num;
        if (shortNewsContentCardView instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) shortNewsContentCardView;
            int i = anonymousClass1.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
        }
        Object obj = anonymousClass1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.IconCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            throw null;
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = anonymousClass1.read;
        int[] iArr = anonymousClass1.serializer;
        FlowCollector flowCollector2 = anonymousClass1.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        do {
            i3++;
            if (i3 >= 0) {
                return createFromParcel.INSTANCE;
            }
            num = new Integer(iArr[i3]);
            anonymousClass1.RemoteActionCompatParcelizer = flowCollector2;
            anonymousClass1.serializer = iArr;
            anonymousClass1.read = i3;
            anonymousClass1.IconCompatParcelizer = 1;
        } while (flowCollector2.emit(num, anonymousClass1) != coroutineSingletons);
        return coroutineSingletons;
    }
}
