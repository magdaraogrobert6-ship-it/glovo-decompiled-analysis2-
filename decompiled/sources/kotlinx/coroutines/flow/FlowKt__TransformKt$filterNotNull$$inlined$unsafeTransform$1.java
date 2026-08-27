package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 implements Flow<Object> {
    public final /* synthetic */ Flow serializer;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ FlowCollector read;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public /* synthetic */ Object IconCompatParcelizer;
            public int serializer;

            public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
                super(shortNewsContentCardView);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.IconCompatParcelizer = obj;
                this.serializer |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector) {
            this.read = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            AnonymousClass1 anonymousClass1;
            if (shortNewsContentCardView instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) shortNewsContentCardView;
                int i = anonymousClass1.serializer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.serializer = i - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
            }
            Object obj2 = anonymousClass1.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = anonymousClass1.serializer;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                if (obj != null) {
                    anonymousClass1.serializer = 1;
                    if (this.read.emit(obj, anonymousClass1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            }
            return createFromParcel.INSTANCE;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCollect = this.serializer.collect(new AnonymousClass2(flowCollector), shortNewsContentCardView);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : createFromParcel.INSTANCE;
    }

    public FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(Flow flow) {
        this.serializer = flow;
    }
}
