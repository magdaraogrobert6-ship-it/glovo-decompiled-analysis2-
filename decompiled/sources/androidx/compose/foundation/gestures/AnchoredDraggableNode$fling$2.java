package androidx.compose.foundation.gestures;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.CoreTextFieldKtTextFieldCursorHandle21;
import o.HeightInLinesNode;
import o.ShortNewsContentCardView;
import o.cancelPendingWebViewPauselambda0;
import o.constructorimpl;
import o.createFromParcel;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableNode$fling$2 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public final /* synthetic */ AnchoredDraggableNode IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ cancelPendingWebViewPauselambda0 serializer;
    public final /* synthetic */ float write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$fling$2(AnchoredDraggableNode anchoredDraggableNode, cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0, float f, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.IconCompatParcelizer = anchoredDraggableNode;
        this.serializer = cancelpendingwebviewpauselambda0;
        this.write = f;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0 = this.serializer;
        float f = this.write;
        AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(this.IconCompatParcelizer, cancelpendingwebviewpauselambda0, f, (ShortNewsContentCardView) obj3);
        anchoredDraggableNode$fling$2.RemoteActionCompatParcelizer = (HeightInLinesNode) obj;
        return anchoredDraggableNode$fling$2.invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.read;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            HeightInLinesNode heightInLinesNode = (HeightInLinesNode) this.RemoteActionCompatParcelizer;
            AnchoredDraggableNode anchoredDraggableNode = this.IconCompatParcelizer;
            CoreTextFieldKtTextFieldCursorHandle21 coreTextFieldKtTextFieldCursorHandle21 = new CoreTextFieldKtTextFieldCursorHandle21(anchoredDraggableNode, heightInLinesNode);
            constructorimpl constructorimplVar = anchoredDraggableNode.write;
            if (constructorimplVar == null) {
                removeNodeAtDepth.serializer("resolvedFlingBehavior");
                throw null;
            }
            cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda1 = this.serializer;
            this.RemoteActionCompatParcelizer = cancelpendingwebviewpauselambda1;
            this.read = 1;
            obj = constructorimplVar.performFling(coreTextFieldKtTextFieldCursorHandle21, this.write, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            cancelpendingwebviewpauselambda0 = cancelpendingwebviewpauselambda1;
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cancelpendingwebviewpauselambda0 = (cancelPendingWebViewPauselambda0) this.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        cancelpendingwebviewpauselambda0.write = ((Number) obj).floatValue();
        return createFromParcel.INSTANCE;
    }
}
