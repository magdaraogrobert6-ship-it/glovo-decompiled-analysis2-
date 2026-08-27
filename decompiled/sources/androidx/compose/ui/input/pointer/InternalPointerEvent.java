package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;
import o.ContextMenuSpec;

/* JADX INFO: loaded from: classes.dex */
public final class InternalPointerEvent {
    public static final int $stable = 8;
    private final ContextMenuSpec changes;
    private final PointerInputEvent pointerInputEvent;
    private boolean suppressMovementConsumption;

    public final ContextMenuSpec getChanges() {
        return this.changes;
    }

    public final PointerInputEvent getPointerInputEvent() {
        return this.pointerInputEvent;
    }

    public final boolean getSuppressMovementConsumption() {
        return this.suppressMovementConsumption;
    }

    public final void setSuppressMovementConsumption(boolean z) {
        this.suppressMovementConsumption = z;
    }

    /* JADX INFO: renamed from: activeHoverEvent-0FcD4WY, reason: not valid java name */
    public final boolean m1976activeHoverEvent0FcD4WY(long j) {
        PointerInputEventData pointerInputEventData;
        List<PointerInputEventData> pointers = this.pointerInputEvent.getPointers();
        int size = pointers.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputEventData = null;
                break;
            }
            pointerInputEventData = pointers.get(i);
            if (PointerId.m2050equalsimpl0(pointerInputEventData.m2086getIdJ3iCeTQ(), j)) {
                break;
            }
            i++;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            return pointerInputEventData2.getActiveHover();
        }
        return false;
    }

    public final MotionEvent getMotionEvent() {
        return this.pointerInputEvent.getMotionEvent();
    }

    public InternalPointerEvent(ContextMenuSpec contextMenuSpec, PointerInputEvent pointerInputEvent) {
        this.changes = contextMenuSpec;
        this.pointerInputEvent = pointerInputEvent;
    }
}
