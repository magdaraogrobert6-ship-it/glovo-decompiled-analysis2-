package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: loaded from: classes.dex */
public final class PointerInputEventProcessor {
    public static final int $stable = 8;
    private final HitPathTracker hitPathTracker;
    private boolean isProcessing;
    private final LayoutNode root;
    private final PointerInputChangeEventProducer pointerInputChangeEventProducer = new PointerInputChangeEventProducer();
    private final HitTestResult hitResult = new HitTestResult();

    public final LayoutNode getRoot() {
        return this.root;
    }

    public final void clearPreviouslyHitModifierNodes() {
        this.hitPathTracker.clearPreviouslyHitModifierNodeCache();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d2 A[Catch: all -> 0x00ee, TryCatch #0 {all -> 0x00ee, blocks: (B:7:0x000d, B:9:0x0024, B:11:0x0034, B:14:0x003b, B:17:0x0041, B:19:0x004c, B:21:0x0058, B:26:0x008e, B:23:0x005e, B:25:0x007a, B:27:0x0091, B:39:0x00c7, B:41:0x00d2, B:46:0x00e7, B:44:0x00e3, B:30:0x00a0, B:32:0x00ab, B:34:0x00bb, B:37:0x00c3), top: B:52:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3 A[Catch: all -> 0x00ee, LOOP:2: B:40:0x00d0->B:44:0x00e3, LOOP_END, TryCatch #0 {all -> 0x00ee, blocks: (B:7:0x000d, B:9:0x0024, B:11:0x0034, B:14:0x003b, B:17:0x0041, B:19:0x004c, B:21:0x0058, B:26:0x008e, B:23:0x005e, B:25:0x007a, B:27:0x0091, B:39:0x00c7, B:41:0x00d2, B:46:0x00e7, B:44:0x00e3, B:30:0x00a0, B:32:0x00ab, B:34:0x00bb, B:37:0x00c3), top: B:52:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: process-BIzXfog, reason: not valid java name */
    public final int m2094processBIzXfog(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        int iIconCompatParcelizer;
        int i2;
        if (this.isProcessing) {
            return PointerInputEventProcessorKt.ProcessResult(false, false, false);
        }
        boolean z4 = true;
        try {
            this.isProcessing = true;
            InternalPointerEvent internalPointerEventProduce = this.pointerInputChangeEventProducer.produce(pointerInputEvent, positionCalculator);
            int iIconCompatParcelizer2 = internalPointerEventProduce.getChanges().IconCompatParcelizer();
            while (true) {
                if (i >= iIconCompatParcelizer2) {
                    z2 = true;
                    break;
                }
                PointerInputChange pointerInputChange = (PointerInputChange) internalPointerEventProduce.getChanges().write(i);
                i = (pointerInputChange.getPressed() || pointerInputChange.getPreviousPressed()) ? 0 : i + 1;
                z2 = false;
                break;
            }
            int iIconCompatParcelizer3 = internalPointerEventProduce.getChanges().IconCompatParcelizer();
            for (int i3 = 0; i3 < iIconCompatParcelizer3; i3++) {
                PointerInputChange pointerInputChange2 = (PointerInputChange) internalPointerEventProduce.getChanges().write(i3);
                if (z2 || PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2)) {
                    LayoutNode.m2442hitTest6fMxITs$ui$default(this.root, pointerInputChange2.m2071getPositionF1C5BW0(), this.hitResult, pointerInputChange2.m2074getTypeT8wyACA(), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.m1972addHitPathQJqDSyo(pointerInputChange2.m2068getIdJ3iCeTQ(), this.hitResult, PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2));
                        this.hitResult.clear();
                    }
                }
            }
            boolean zDispatchChanges = this.hitPathTracker.dispatchChanges(internalPointerEventProduce, z);
            if (!internalPointerEventProduce.getSuppressMovementConsumption()) {
                int iIconCompatParcelizer4 = internalPointerEventProduce.getChanges().IconCompatParcelizer();
                int i4 = 0;
                while (true) {
                    if (i4 < iIconCompatParcelizer4) {
                        PointerInputChange pointerInputChange3 = (PointerInputChange) internalPointerEventProduce.getChanges().write(i4);
                        if (PointerEventKt.positionChangedIgnoreConsumed(pointerInputChange3) && pointerInputChange3.isConsumed()) {
                            z3 = true;
                            break;
                        }
                        i4++;
                    }
                }
                iIconCompatParcelizer = internalPointerEventProduce.getChanges().IconCompatParcelizer();
                i2 = 0;
                while (true) {
                    if (i2 < iIconCompatParcelizer) {
                        z4 = false;
                        break;
                    }
                    if (((PointerInputChange) internalPointerEventProduce.getChanges().write(i2)).isConsumed()) {
                        break;
                    }
                    i2++;
                }
                return PointerInputEventProcessorKt.ProcessResult(zDispatchChanges, z3, z4);
            }
            z3 = false;
            iIconCompatParcelizer = internalPointerEventProduce.getChanges().IconCompatParcelizer();
            i2 = 0;
            while (true) {
                if (i2 < iIconCompatParcelizer) {
                    z4 = false;
                    break;
                }
                if (((PointerInputChange) internalPointerEventProduce.getChanges().write(i2)).isConsumed()) {
                    break;
                    break;
                }
                i2++;
            }
            return PointerInputEventProcessorKt.ProcessResult(zDispatchChanges, z3, z4);
        } finally {
            this.isProcessing = false;
        }
    }

    public PointerInputEventProcessor(LayoutNode layoutNode) {
        this.root = layoutNode;
        this.hitPathTracker = new HitPathTracker(layoutNode.getCoordinates());
    }

    public final void processCancel() {
        if (this.isProcessing) {
            return;
        }
        this.pointerInputChangeEventProducer.clear();
        this.hitPathTracker.processCancel();
    }

    /* JADX INFO: renamed from: process-BIzXfog$default, reason: not valid java name */
    public static /* synthetic */ int m2093processBIzXfog$default(PointerInputEventProcessor pointerInputEventProcessor, PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return pointerInputEventProcessor.m2094processBIzXfog(pointerInputEvent, positionCalculator, z);
    }
}
