package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import o.AnchoredDraggableKtanimateToWithDecay2;
import o.ContextMenuColumn;
import o.ShortNewsContentCardView;
import o.getMinSizeToFitDisappearingItemsYbymL2g;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public final class CombinedClickableNode extends AbstractClickableNode {
    public boolean _init_lambda1;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU _init_lambda2;
    public boolean _init_lambda3;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU _init_lambda4;
    public final AnchoredDraggableKtanimateToWithDecay2 accessensureViewModelStore;
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 addObserverForBackInvokerlambda0;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU createFullyDrawnExecutor;
    public boolean defaultViewModelProviderFactory_delegatelambda0;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU ensureViewModelStore;
    public boolean r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public PointerInputChange r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final AnchoredDraggableKtanimateToWithDecay2 r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public boolean r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public IndirectPointerInputChange r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public boolean r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public long r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public boolean r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void IconCompatParcelizer() {
        serializer();
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public final void onCancelIndirectPointerInput() {
        serializer(true);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0048 A[LOOP:0: B:5:0x0016->B:15:0x0048, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x004b A[EDGE_INSN: B:37:0x004b->B:16:0x004b BREAK  A[LOOP:0: B:5:0x0016->B:15:0x0048], SYNTHETIC] */
    public final void serializer() {
        AnchoredDraggableKtanimateToWithDecay2 anchoredDraggableKtanimateToWithDecay2 = this.accessensureViewModelStore;
        Object[] objArr = anchoredDraggableKtanimateToWithDecay2.MediaDescriptionCompat;
        long[] jArr = anchoredDraggableKtanimateToWithDecay2.read;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j & 255) < 128) {
                            ((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) objArr[(i << 3) + i3]).write(null);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        anchoredDraggableKtanimateToWithDecay2.write();
        AnchoredDraggableKtanimateToWithDecay2 anchoredDraggableKtanimateToWithDecay3 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        Object[] objArr2 = anchoredDraggableKtanimateToWithDecay3.MediaDescriptionCompat;
        long[] jArr2 = anchoredDraggableKtanimateToWithDecay3.read;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j2 = jArr2[i4];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j2 & 255) < 128) {
                            ((getMinSizeToFitDisappearingItemsYbymL2g) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j2 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length2) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        anchoredDraggableKtanimateToWithDecay3.write();
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public final void onIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass) {
        super.onIndirectPointerEvent(indirectPointerEvent, pointerEventPass);
        int i = 0;
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 == null || this._init_lambda1) {
                return;
            }
            List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
            int size = changes.size();
            while (i < size) {
                IndirectPointerInputChange indirectPointerInputChange = changes.get(i);
                if (indirectPointerInputChange.isConsumed() && indirectPointerInputChange != this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) {
                    serializer(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 == null) {
            List<IndirectPointerInputChange> changes2 = indirectPointerEvent.getChanges();
            int size2 = changes2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (IndirectPointerInputDragCycleDetectorKt.RemoteActionCompatParcelizer(changes2.get(i2))) {
                    IndirectPointerInputChange indirectPointerInputChange2 = indirectPointerEvent.getChanges().get(0);
                    indirectPointerInputChange2.consume();
                    this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = indirectPointerInputChange2;
                    if (this.IconCompatParcelizer) {
                        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this._init_lambda2;
                        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null && r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.I_()) {
                            if (indirectPointerInputChange2.getUptimeMillis() - this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ < ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration())).getDoubleTapMinTimeMillis()) {
                                this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = true;
                                return;
                            }
                            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = true;
                            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = this._init_lambda2;
                            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                            }
                            this._init_lambda2 = null;
                        }
                        this._init_lambda1 = false;
                        IconCompatParcelizer(indirectPointerInputChange2);
                        if (this.addObserverForBackInvokerlambda0 != null) {
                            this._init_lambda4 = BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new CombinedClickableNode$handleDownEvent$2(this, null), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this._init_lambda1) {
            List<IndirectPointerInputChange> changes3 = indirectPointerEvent.getChanges();
            int size3 = changes3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                IndirectPointerInputChange indirectPointerInputChange3 = changes3.get(i3);
                if (!indirectPointerInputChange3.getPreviousPressed() || indirectPointerInputChange3.getPressed()) {
                    List<IndirectPointerInputChange> changes4 = indirectPointerEvent.getChanges();
                    int size4 = changes4.size();
                    while (i < size4) {
                        changes4.get(i).consume();
                        i++;
                    }
                    return;
                }
            }
            IndirectPointerInputChange indirectPointerInputChange4 = indirectPointerEvent.getChanges().get(0);
            indirectPointerInputChange4.consume();
            long uptimeMillis = indirectPointerInputChange4.getUptimeMillis();
            IndirectPointerInputChange indirectPointerInputChange5 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            indirectPointerInputChange5.getClass();
            read(uptimeMillis, indirectPointerInputChange5);
            return;
        }
        List<IndirectPointerInputChange> changes5 = indirectPointerEvent.getChanges();
        int size5 = changes5.size();
        for (int i4 = 0; i4 < size5; i4++) {
            IndirectPointerInputChange indirectPointerInputChange6 = changes5.get(i4);
            if (indirectPointerInputChange6.isConsumed() || !indirectPointerInputChange6.getPreviousPressed() || indirectPointerInputChange6.getPressed()) {
                float touchSlop = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration())).getTouchSlop();
                List<IndirectPointerInputChange> changes6 = indirectPointerEvent.getChanges();
                int size6 = changes6.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    IndirectPointerInputChange indirectPointerInputChange7 = changes6.get(i5);
                    long jM1574getPositionF1C5BW0 = indirectPointerInputChange7.m1574getPositionF1C5BW0();
                    IndirectPointerInputChange indirectPointerInputChange8 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                    indirectPointerInputChange8.getClass();
                    boolean z = Math.abs(Offset.m475getDistanceimpl(Offset.m481minusMKHz9U(jM1574getPositionF1C5BW0, indirectPointerInputChange8.m1574getPositionF1C5BW0()))) > touchSlop;
                    if (indirectPointerInputChange7.isConsumed() || z) {
                        serializer(true);
                        return;
                    }
                }
                return;
            }
        }
        IndirectPointerInputChange indirectPointerInputChange9 = indirectPointerEvent.getChanges().get(0);
        indirectPointerInputChange9.consume();
        long uptimeMillis2 = indirectPointerInputChange9.getUptimeMillis();
        IndirectPointerInputChange indirectPointerInputChange10 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        indirectPointerInputChange10.getClass();
        read(uptimeMillis2, indirectPointerInputChange10);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public final void mo11onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        super.mo11onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == null || this.defaultViewModelProviderFactory_delegatelambda0) {
                return;
            }
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                PointerInputChange pointerInputChange = changes.get(i);
                if (pointerInputChange.isConsumed() && pointerInputChange != this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) {
                    serializer(false);
                    return;
                }
            }
            return;
        }
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == null) {
            if (TapGestureDetectorKt.isChangedToDown$default(pointerEvent, true)) {
                PointerInputChange pointerInputChange2 = pointerEvent.getChanges().get(0);
                pointerInputChange2.consume();
                this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = pointerInputChange2;
                if (this.IconCompatParcelizer) {
                    r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.ensureViewModelStore;
                    if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null && r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.I_()) {
                        if (pointerInputChange2.getUptimeMillis() - this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM < ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration())).getDoubleTapMinTimeMillis()) {
                            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = true;
                            return;
                        }
                        this._init_lambda3 = true;
                        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = this.ensureViewModelStore;
                        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
                        }
                        this.ensureViewModelStore = null;
                    }
                    this.defaultViewModelProviderFactory_delegatelambda0 = false;
                    RemoteActionCompatParcelizer(pointerInputChange2);
                    if (this.addObserverForBackInvokerlambda0 != null) {
                        this.createFullyDrawnExecutor = BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new CombinedClickableNode$handleDownEvent$1(this, null), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (pointerEvent.getClassification() == 2 && !this.defaultViewModelProviderFactory_delegatelambda0 && this.IconCompatParcelizer && this.addObserverForBackInvokerlambda0 != null) {
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3 = this.createFullyDrawnExecutor;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3 != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3.write((CancellationException) null);
            }
            this.createFullyDrawnExecutor = null;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.addObserverForBackInvokerlambda0;
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            }
            if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                ((HapticFeedback) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalHapticFeedback())).mo1501performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m1514getLongPress5zf0vsI());
            }
            this.defaultViewModelProviderFactory_delegatelambda0 = true;
        }
        if (this.defaultViewModelProviderFactory_delegatelambda0) {
            List<PointerInputChange> changes2 = pointerEvent.getChanges();
            int size2 = changes2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!PointerEventKt.changedToUpIgnoreConsumed(changes2.get(i2))) {
                    List<PointerInputChange> changes3 = pointerEvent.getChanges();
                    int size3 = changes3.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        changes3.get(i3).consume();
                    }
                    return;
                }
            }
            PointerInputChange pointerInputChange3 = pointerEvent.getChanges().get(0);
            pointerInputChange3.consume();
            long uptimeMillis = pointerInputChange3.getUptimeMillis();
            PointerInputChange pointerInputChange4 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            pointerInputChange4.getClass();
            serializer(pointerInputChange4, uptimeMillis);
            return;
        }
        List<PointerInputChange> changes4 = pointerEvent.getChanges();
        int size4 = changes4.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!PointerEventKt.changedToUp(changes4.get(i4))) {
                long jM9getExtendedTouchPaddinghWWAJMo = m9getExtendedTouchPaddinghWWAJMo(j);
                List<PointerInputChange> changes5 = pointerEvent.getChanges();
                int size5 = changes5.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    PointerInputChange pointerInputChange5 = changes5.get(i5);
                    if (pointerInputChange5.isConsumed() || PointerEventKt.m2007isOutOfBoundsjwHxaWs(pointerInputChange5, j, jM9getExtendedTouchPaddinghWWAJMo)) {
                        serializer(false);
                        return;
                    }
                }
                return;
            }
        }
        PointerInputChange pointerInputChange6 = pointerEvent.getChanges().get(0);
        pointerInputChange6.consume();
        long uptimeMillis2 = pointerInputChange6.getUptimeMillis();
        PointerInputChange pointerInputChange7 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        pointerInputChange7.getClass();
        serializer(pointerInputChange7, uptimeMillis2);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        super.onReset();
        serializer();
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void IconCompatParcelizer(KeyEvent keyEvent) {
        boolean z;
        long jM1901getKeyZmokQxo = KeyEvent_androidKt.m1901getKeyZmokQxo(keyEvent);
        AnchoredDraggableKtanimateToWithDecay2 anchoredDraggableKtanimateToWithDecay2 = this.accessensureViewModelStore;
        if (anchoredDraggableKtanimateToWithDecay2.serializer(jM1901getKeyZmokQxo) != null) {
            setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) anchoredDraggableKtanimateToWithDecay2.serializer(jM1901getKeyZmokQxo);
            if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 == null) {
                z = false;
            } else if (setallviewgroupchildrenasnonaccessibilityimportantlambda0.I_()) {
                setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
                z = false;
            } else {
                z = true;
            }
            anchoredDraggableKtanimateToWithDecay2.IconCompatParcelizer(jM1901getKeyZmokQxo);
            if (z) {
                return;
            }
        }
        this.ParcelableVolumeInfo.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    @Override // androidx.compose.foundation.AbstractClickableNode
    public final boolean RemoteActionCompatParcelizer(KeyEvent keyEvent) {
        boolean z;
        long jM1901getKeyZmokQxo = KeyEvent_androidKt.m1901getKeyZmokQxo(keyEvent);
        if (this.addObserverForBackInvokerlambda0 != null) {
            AnchoredDraggableKtanimateToWithDecay2 anchoredDraggableKtanimateToWithDecay2 = this.accessensureViewModelStore;
            if (anchoredDraggableKtanimateToWithDecay2.serializer(jM1901getKeyZmokQxo) == null) {
                anchoredDraggableKtanimateToWithDecay2.read(jM1901getKeyZmokQxo, BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new BlockRunner$cancel$1(this, (ShortNewsContentCardView) null, 2), 3));
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        super.onCancelPointerInput();
        serializer(false);
    }

    public final void read(long j, IndirectPointerInputChange indirectPointerInputChange) {
        if (this.IconCompatParcelizer && !this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) {
            RemoteActionCompatParcelizer(indirectPointerInputChange.m1574getPositionF1C5BW0(), true);
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = j;
            if (!this._init_lambda1 && !this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) {
                this.ParcelableVolumeInfo.invoke();
            }
        }
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = null;
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = false;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = false;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this._init_lambda4;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this._init_lambda4 = null;
        this._init_lambda1 = false;
    }

    public final void serializer(boolean z) {
        if (z) {
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = null;
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this._init_lambda4;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            }
            this._init_lambda4 = null;
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = this._init_lambda2;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
            }
            this._init_lambda2 = null;
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = false;
            this._init_lambda1 = false;
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = -1L;
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = false;
        } else {
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3 = this.createFullyDrawnExecutor;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3 != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu3.write((CancellationException) null);
            }
            this.createFullyDrawnExecutor = null;
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu4 = this.ensureViewModelStore;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu4 != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu4.write((CancellationException) null);
            }
            this.ensureViewModelStore = null;
            this._init_lambda3 = false;
            this.defaultViewModelProviderFactory_delegatelambda0 = false;
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = -1L;
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = false;
        }
        RemoteActionCompatParcelizer(z);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void RemoteActionCompatParcelizer(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.addObserverForBackInvokerlambda0 != null) {
            SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, null, new CoroutineLiveData$$ExternalSyntheticLambda0(5, this));
        }
    }

    public CombinedClickableNode(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z2, boolean z3) {
        super(mutableInteractionSourceImpl, null, z2, z3, null, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        this.addObserverForBackInvokerlambda0 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = z;
        int i = ContextMenuColumn.serializer;
        this.accessensureViewModelStore = new AnchoredDraggableKtanimateToWithDecay2(6);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new AnchoredDraggableKtanimateToWithDecay2(6);
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = -1L;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = -1L;
    }

    public final void serializer(PointerInputChange pointerInputChange, long j) {
        if (this.IconCompatParcelizer && !this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
            RemoteActionCompatParcelizer(pointerInputChange.m2071getPositionF1C5BW0(), false);
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = j;
            if (!this.defaultViewModelProviderFactory_delegatelambda0 && !this._init_lambda3) {
                this.ParcelableVolumeInfo.invoke();
            }
        }
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = false;
        this._init_lambda3 = false;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.createFullyDrawnExecutor;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.createFullyDrawnExecutor = null;
        this.defaultViewModelProviderFactory_delegatelambda0 = false;
    }
}
