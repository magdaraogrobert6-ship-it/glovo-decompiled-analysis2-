package kotlinx.coroutines.flow;

import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1 implements Flow<List<Object>> {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object IconCompatParcelizer;
        public createInAppMessageEventSubscriber RemoteActionCompatParcelizer;
        public FlowCollector read;
        public int write;

        public AnonymousClass1(ShortNewsContentCardView shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
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
        Object obj = anonymousClass1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.write;
        if (i2 == 0) {
            createInAppMessageEventSubscriber createinappmessageeventsubscriberM3979m = c8$$ExternalSyntheticOutline0.m3979m(obj);
            anonymousClass1.read = flowCollector;
            anonymousClass1.RemoteActionCompatParcelizer = createinappmessageeventsubscriberM3979m;
            anonymousClass1.write = 1;
            throw null;
        }
        if (i2 == 1) {
            createInAppMessageEventSubscriber createinappmessageeventsubscriber = anonymousClass1.RemoteActionCompatParcelizer;
            FlowCollector flowCollector2 = anonymousClass1.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ArrayList arrayList = (ArrayList) createinappmessageeventsubscriber.IconCompatParcelizer;
            if (arrayList != null) {
                anonymousClass1.read = null;
                anonymousClass1.RemoteActionCompatParcelizer = null;
                anonymousClass1.write = 2;
                if (flowCollector2.emit(arrayList, anonymousClass1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createFromParcel.INSTANCE;
    }
}
