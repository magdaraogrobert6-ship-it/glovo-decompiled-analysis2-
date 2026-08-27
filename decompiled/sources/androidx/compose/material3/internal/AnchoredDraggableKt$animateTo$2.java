package androidx.compose.material3.internal;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.SheetState;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AndroidAutofillType_androidKt;
import o.ShortNewsContentCardView;
import o.TrackpadScrollingLogic;
import o.cancelAutofillForNode;
import o.cancelPendingWebViewPauselambda0;
import o.createFromParcel;
import o.getTextValue;
import o.listValue;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableKt$animateTo$2 extends SuspendLambda implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    public /* synthetic */ listValue IconCompatParcelizer;
    public int RatingCompat;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ AnchoredDraggableState read;
    public /* synthetic */ getTextValue serializer;
    public final /* synthetic */ float write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2(AnchoredDraggableState anchoredDraggableState, float f, ShortNewsContentCardView shortNewsContentCardView) {
        super(4, shortNewsContentCardView);
        this.read = anchoredDraggableState;
        this.write = f;
    }

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.read, this.write, (ShortNewsContentCardView) obj4);
        anchoredDraggableKt$animateTo$2.serializer = (getTextValue) obj;
        anchoredDraggableKt$animateTo$2.IconCompatParcelizer = (listValue) obj2;
        anchoredDraggableKt$animateTo$2.RemoteActionCompatParcelizer = obj3;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.RatingCompat;
        int i2 = 1;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getTextValue gettextvalue = this.serializer;
            float f = this.IconCompatParcelizer.read(this.RemoteActionCompatParcelizer);
            if (!Float.isNaN(f)) {
                cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0 = new cancelPendingWebViewPauselambda0(0);
                AnchoredDraggableState anchoredDraggableState = this.read;
                float fSerializer = Float.isNaN(anchoredDraggableState.serializer()) ? 0.0f : anchoredDraggableState.serializer();
                cancelpendingwebviewpauselambda0.write = fSerializer;
                TrackpadScrollingLogic trackpadScrollingLogic = ((SheetState) ((AndroidAutofillType_androidKt) anchoredDraggableState.IconCompatParcelizer).write).RemoteActionCompatParcelizer;
                cancelAutofillForNode cancelautofillfornode = new cancelAutofillForNode(gettextvalue, cancelpendingwebviewpauselambda0, i2);
                this.serializer = null;
                this.IconCompatParcelizer = null;
                this.RatingCompat = 1;
                if (SuspendAnimationKt.animate(fSerializer, f, this.write, trackpadScrollingLogic, cancelautofillfornode, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createFromParcel.INSTANCE;
    }
}
