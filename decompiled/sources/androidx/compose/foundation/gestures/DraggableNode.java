package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2;
import coil3.RealImageLoader;
import com.roadrunner.nafath.NafathTimerManager$observeCountdown$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import o.FloatingTextActionModeCallback;
import o.SelectionHandleIcon;
import o.ShortNewsContentCardView;
import o.accessgetGreencp;
import o.applyMeasureResultfoundation;
import o.coerceMinLinesOh53vG4foundation;
import o.createFromParcel;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class DraggableNode extends DragGestureNode {
    public r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public accessgetGreencp r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public boolean r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY read;
    public SelectionHandleIcon write;

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean RemoteActionCompatParcelizer() {
        return this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object drag(DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1, DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$2) {
        accessgetGreencp accessgetgreencp = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        Object objAnchoredDrag = ((androidx.compose.material3.internal.AnchoredDraggableState) accessgetgreencp.write).anchoredDrag(applyMeasureResultfoundation.UserInput, new AnchoredDraggableState$draggableState$1$drag$2(accessgetgreencp, new RealImageLoader.AnonymousClass2(dragGestureNode$startListeningForEvents$1, this, (ShortNewsContentCardView) null, 8), null), dragGestureNode$startListeningForEvents$2);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (objAnchoredDrag != coroutineSingletons) {
            objAnchoredDrag = createfromparcel;
        }
        return objAnchoredDrag == coroutineSingletons ? objAnchoredDrag : createfromparcel;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void IconCompatParcelizer(long j) {
        if (isAttached()) {
            Object[] objArr = {this.IconCompatParcelizer, coerceMinLinesOh53vG4foundation.IconCompatParcelizer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return;
            }
            BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new NafathTimerManager$observeCountdown$1(this, j, null, 2), 1);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void serializer(FloatingTextActionModeCallback floatingTextActionModeCallback) {
        if (isAttached()) {
            Object[] objArr = {this.read, coerceMinLinesOh53vG4foundation.write};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return;
            }
            BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new RealImageLoader.AnonymousClass2(this, floatingTextActionModeCallback, (ShortNewsContentCardView) null, 9), 1);
        }
    }

    public DraggableNode(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, SelectionHandleIcon selectionHandleIcon) {
        super(r8lambdaunavo3sxub_pc9xroryotnrlvsm, z, mutableInteractionSourceImpl, selectionHandleIcon);
    }
}
