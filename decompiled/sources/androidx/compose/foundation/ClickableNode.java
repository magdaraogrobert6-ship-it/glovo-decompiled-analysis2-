package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import java.util.List;
import o.PagerMeasurePolicyKtrememberPagerMeasurePolicy11;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public class ClickableNode extends AbstractClickableNode {
    public IndirectPointerInputChange r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public PointerInputChange r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final boolean RemoteActionCompatParcelizer(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public final void onCancelIndirectPointerInput() {
        read(true);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void IconCompatParcelizer(KeyEvent keyEvent) {
        this.ParcelableVolumeInfo.invoke();
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public final void onIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass) {
        super.onIndirectPointerEvent(indirectPointerEvent, pointerEventPass);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == null) {
                return;
            }
            List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                IndirectPointerInputChange indirectPointerInputChange = changes.get(i);
                if (indirectPointerInputChange.isConsumed() && indirectPointerInputChange != this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                    read(true);
                    return;
                }
            }
            return;
        }
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == null) {
            List<IndirectPointerInputChange> changes2 = indirectPointerEvent.getChanges();
            int size2 = changes2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (IndirectPointerInputDragCycleDetectorKt.RemoteActionCompatParcelizer(changes2.get(i2))) {
                    IndirectPointerInputChange indirectPointerInputChange2 = indirectPointerEvent.getChanges().get(0);
                    indirectPointerInputChange2.consume();
                    this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = indirectPointerInputChange2;
                    if (this.IconCompatParcelizer) {
                        IconCompatParcelizer(indirectPointerInputChange2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        List<IndirectPointerInputChange> changes3 = indirectPointerEvent.getChanges();
        int size3 = changes3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            IndirectPointerInputChange indirectPointerInputChange3 = changes3.get(i3);
            if (indirectPointerInputChange3.isConsumed() || !indirectPointerInputChange3.getPreviousPressed() || indirectPointerInputChange3.getPressed()) {
                float touchSlop = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration())).getTouchSlop();
                List<IndirectPointerInputChange> changes4 = indirectPointerEvent.getChanges();
                int size4 = changes4.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    IndirectPointerInputChange indirectPointerInputChange4 = changes4.get(i4);
                    long jM1574getPositionF1C5BW0 = indirectPointerInputChange4.m1574getPositionF1C5BW0();
                    IndirectPointerInputChange indirectPointerInputChange5 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    indirectPointerInputChange5.getClass();
                    boolean z = Math.abs(Offset.m475getDistanceimpl(Offset.m481minusMKHz9U(jM1574getPositionF1C5BW0, indirectPointerInputChange5.m1574getPositionF1C5BW0()))) > touchSlop;
                    if (indirectPointerInputChange4.isConsumed() || z) {
                        read(true);
                        return;
                    }
                }
                return;
            }
        }
        indirectPointerEvent.getChanges().get(0).consume();
        if (this.IconCompatParcelizer) {
            IndirectPointerInputChange indirectPointerInputChange6 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            indirectPointerInputChange6.getClass();
            RemoteActionCompatParcelizer(indirectPointerInputChange6.m1574getPositionF1C5BW0(), true);
            this.ParcelableVolumeInfo.invoke();
        }
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = null;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public final void mo11onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        super.mo11onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == null) {
                return;
            }
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                PointerInputChange pointerInputChange = changes.get(i);
                if (pointerInputChange.isConsumed() && pointerInputChange != this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
                    read(false);
                    return;
                }
            }
            return;
        }
        if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == null) {
            if (TapGestureDetectorKt.isChangedToDown$default(pointerEvent, true)) {
                PointerInputChange pointerInputChange2 = pointerEvent.getChanges().get(0);
                pointerInputChange2.consume();
                this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = pointerInputChange2;
                if (this.IconCompatParcelizer) {
                    RemoteActionCompatParcelizer(pointerInputChange2);
                    return;
                }
                return;
            }
            return;
        }
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!PointerEventKt.changedToUp(changes2.get(i2))) {
                long jM9getExtendedTouchPaddinghWWAJMo = m9getExtendedTouchPaddinghWWAJMo(j);
                List<PointerInputChange> changes3 = pointerEvent.getChanges();
                int size3 = changes3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    PointerInputChange pointerInputChange3 = changes3.get(i3);
                    if (pointerInputChange3.isConsumed() || PointerEventKt.m2007isOutOfBoundsjwHxaWs(pointerInputChange3, j, jM9getExtendedTouchPaddinghWWAJMo)) {
                        read(false);
                        return;
                    }
                }
                return;
            }
        }
        pointerEvent.getChanges().get(0).consume();
        if (this.IconCompatParcelizer) {
            PointerInputChange pointerInputChange4 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            pointerInputChange4.getClass();
            RemoteActionCompatParcelizer(pointerInputChange4.m2071getPositionF1C5BW0(), false);
            this.ParcelableVolumeInfo.invoke();
        }
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = null;
    }

    public final void read(boolean z) {
        if (z) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = null;
        } else {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = null;
        }
        RemoteActionCompatParcelizer(z);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        super.onCancelPointerInput();
        read(false);
    }

    public ClickableNode(MutableInteractionSourceImpl mutableInteractionSourceImpl, PagerMeasurePolicyKtrememberPagerMeasurePolicy11 pagerMeasurePolicyKtrememberPagerMeasurePolicy11, boolean z, boolean z2, String str, Role role, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        super(mutableInteractionSourceImpl, pagerMeasurePolicyKtrememberPagerMeasurePolicy11, z, z2, str, role, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }
}
