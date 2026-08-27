package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowKt__TransformKt$filterIsInstance$$inlined$filter$1 implements Flow<Object> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object RemoteActionCompatParcelizer;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            throw null;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public /* synthetic */ Object serializer;
            public int write;

            public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
                super(shortNewsContentCardView);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.serializer = obj;
                this.write |= Integer.MIN_VALUE;
                AnonymousClass2.this.emit(null, this);
                return createFromParcel.INSTANCE;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            AnonymousClass1 anonymousClass1;
            if (shortNewsContentCardView instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) shortNewsContentCardView;
                int i = anonymousClass1.write;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.write = i - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
            }
            Object obj2 = anonymousClass1.serializer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = anonymousClass1.write;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                removeNodeAtDepth.IconCompatParcelizer();
                throw null;
            }
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                return createFromParcel.INSTANCE;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        removeNodeAtDepth.IconCompatParcelizer();
        throw null;
    }
}
