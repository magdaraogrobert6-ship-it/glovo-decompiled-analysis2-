package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.node.PointerInputModifierNode;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import o.ButtonKt;
import o.LazyLayoutPagerKt;
import o.LazyLayoutPagerKtdragDirectionDetector1;
import o.ShortNewsContentCardView;
import o.copyjRlVdoo;
import o.createFromParcel;

/* JADX INFO: loaded from: classes.dex */
public final class HoverableNode extends Modifier.Node implements PointerInputModifierNode {
    public ButtonKt IconCompatParcelizer;
    public MutableInteractionSourceImpl write;

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        serializer();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        serializer();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public final void mo11onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.Main) {
            int iM2004getType7fucELk = pointerEvent.m2004getType7fucELk();
            PointerEventType.Companion companion = PointerEventType.Companion;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (PointerEventType.m2011equalsimpl0(iM2004getType7fucELk, companion.m2015getEnter7fucELk())) {
                BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new HoverableNode$onPointerEvent$1(this, shortNewsContentCardView, 0), 3);
            } else if (PointerEventType.m2011equalsimpl0(iM2004getType7fucELk, companion.m2016getExit7fucELk())) {
                BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new HoverableNode$onPointerEvent$1(this, shortNewsContentCardView, 1), 3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$emitEnter(HoverableNode hoverableNode, ContinuationImpl continuationImpl) {
        LazyLayoutPagerKtdragDirectionDetector1 lazyLayoutPagerKtdragDirectionDetector1;
        ButtonKt buttonKt;
        if (continuationImpl instanceof LazyLayoutPagerKtdragDirectionDetector1) {
            lazyLayoutPagerKtdragDirectionDetector1 = (LazyLayoutPagerKtdragDirectionDetector1) continuationImpl;
            int i = lazyLayoutPagerKtdragDirectionDetector1.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                lazyLayoutPagerKtdragDirectionDetector1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                lazyLayoutPagerKtdragDirectionDetector1 = new LazyLayoutPagerKtdragDirectionDetector1(hoverableNode, continuationImpl);
            }
        } else {
            lazyLayoutPagerKtdragDirectionDetector1 = new LazyLayoutPagerKtdragDirectionDetector1(hoverableNode, continuationImpl);
        }
        Object obj = lazyLayoutPagerKtdragDirectionDetector1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lazyLayoutPagerKtdragDirectionDetector1.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (hoverableNode.IconCompatParcelizer == null) {
                ButtonKt buttonKt2 = new ButtonKt();
                MutableInteractionSourceImpl mutableInteractionSourceImpl = hoverableNode.write;
                lazyLayoutPagerKtdragDirectionDetector1.read = buttonKt2;
                lazyLayoutPagerKtdragDirectionDetector1.RemoteActionCompatParcelizer = 1;
                if (mutableInteractionSourceImpl.emit(buttonKt2, lazyLayoutPagerKtdragDirectionDetector1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                buttonKt = buttonKt2;
            }
            return createFromParcel.INSTANCE;
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        buttonKt = lazyLayoutPagerKtdragDirectionDetector1.read;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        hoverableNode.IconCompatParcelizer = buttonKt;
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$emitExit(HoverableNode hoverableNode, ContinuationImpl continuationImpl) {
        LazyLayoutPagerKt lazyLayoutPagerKt;
        if (continuationImpl instanceof LazyLayoutPagerKt) {
            lazyLayoutPagerKt = (LazyLayoutPagerKt) continuationImpl;
            int i = lazyLayoutPagerKt.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                lazyLayoutPagerKt.read = i - Integer.MIN_VALUE;
            } else {
                lazyLayoutPagerKt = new LazyLayoutPagerKt(hoverableNode, continuationImpl);
            }
        } else {
            lazyLayoutPagerKt = new LazyLayoutPagerKt(hoverableNode, continuationImpl);
        }
        Object obj = lazyLayoutPagerKt.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lazyLayoutPagerKt.read;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ButtonKt buttonKt = hoverableNode.IconCompatParcelizer;
            if (buttonKt != null) {
                copyjRlVdoo copyjrlvdoo = new copyjRlVdoo(buttonKt);
                MutableInteractionSourceImpl mutableInteractionSourceImpl = hoverableNode.write;
                lazyLayoutPagerKt.read = 1;
                if (mutableInteractionSourceImpl.emit(copyjrlvdoo, lazyLayoutPagerKt) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return createFromParcel.INSTANCE;
        }
        if (i2 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        hoverableNode.IconCompatParcelizer = null;
        return createFromParcel.INSTANCE;
    }

    public final void serializer() {
        ButtonKt buttonKt = this.IconCompatParcelizer;
        if (buttonKt != null) {
            this.write.write(new copyjRlVdoo(buttonKt));
            this.IconCompatParcelizer = null;
        }
    }
}
