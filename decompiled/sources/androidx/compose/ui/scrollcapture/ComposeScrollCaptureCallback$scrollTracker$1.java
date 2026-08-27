package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsProperties;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class ComposeScrollCaptureCallback$scrollTracker$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    /* synthetic */ float F$0;
    boolean Z$0;
    int label;
    final /* synthetic */ ComposeScrollCaptureCallback this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.this$0, shortNewsContentCardView);
        composeScrollCaptureCallback$scrollTracker$1.F$0 = ((Number) obj).floatValue();
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            float f = this.F$0;
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 scrollCaptureScrollByAction = ScrollCapture_androidKt.getScrollCaptureScrollByAction(this.this$0.node);
            if (scrollCaptureScrollByAction == null) {
                throw c8$$ExternalSyntheticOutline0.m("Required value was null.");
            }
            boolean reverseScrolling = ((ScrollAxisRange) this.this$0.node.getUnmergedConfig$ui().get(SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())).getReverseScrolling();
            if (reverseScrolling) {
                f = -f;
            }
            Offset offsetM466boximpl = Offset.m466boximpl(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L)));
            this.Z$0 = reverseScrolling;
            this.label = 1;
            obj = scrollCaptureScrollByAction.invoke(offsetM466boximpl, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            z = reverseScrolling;
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.Z$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        long jM487unboximpl = ((Offset) obj).m487unboximpl();
        return new Float(z ? -Float.intBitsToFloat((int) (jM487unboximpl & 4294967295L)) : Float.intBitsToFloat((int) (jM487unboximpl & 4294967295L)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, ShortNewsContentCardView<? super ComposeScrollCaptureCallback$scrollTracker$1> shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.this$0 = composeScrollCaptureCallback;
    }

    public final Object invoke(float f, ShortNewsContentCardView<? super Float> shortNewsContentCardView) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(f), shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).floatValue(), (ShortNewsContentCardView<? super Float>) obj2);
    }
}
