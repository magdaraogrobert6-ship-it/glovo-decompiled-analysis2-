package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;
import o.ShortNewsContentCardView;
import o.cancelPendingWebViewPause;
import o.createFromParcel;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public cancelPendingWebViewPause IconCompatParcelizer;
        public /* synthetic */ Object RemoteActionCompatParcelizer;
        public FlowCollector read;
        public Object serializer;
        public int write;

        public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.this.collect(null, this);
            return createFromParcel.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Throwable th;
        SafeCollector safeCollector;
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
        Object obj = anonymousClass1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
            cancelpendingwebviewpause.IconCompatParcelizer = true;
            anonymousClass1.serializer = this;
            anonymousClass1.read = flowCollector;
            anonymousClass1.IconCompatParcelizer = cancelpendingwebviewpause;
            anonymousClass1.write = 1;
            throw null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            safeCollector = (SafeCollector) anonymousClass1.serializer;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                safeCollector.releaseIntercepted();
                return createFromParcel.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                safeCollector.releaseIntercepted();
                throw th;
            }
        }
        cancelPendingWebViewPause cancelpendingwebviewpause2 = anonymousClass1.IconCompatParcelizer;
        FlowCollector flowCollector2 = anonymousClass1.read;
        FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1) anonymousClass1.serializer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (cancelpendingwebviewpause2.IconCompatParcelizer) {
            SafeCollector safeCollector2 = new SafeCollector(flowCollector2, anonymousClass1.getContext());
            try {
                flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.getClass();
                anonymousClass1.serializer = safeCollector2;
                anonymousClass1.read = null;
                anonymousClass1.IconCompatParcelizer = null;
                anonymousClass1.write = 2;
                throw null;
            } catch (Throwable th3) {
                th = th3;
                safeCollector = safeCollector2;
                safeCollector.releaseIntercepted();
                throw th;
            }
        }
        return createFromParcel.INSTANCE;
    }
}
