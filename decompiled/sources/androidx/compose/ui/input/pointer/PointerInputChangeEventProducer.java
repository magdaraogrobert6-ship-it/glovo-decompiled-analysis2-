package androidx.compose.ui.input.pointer;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ContextMenuSpec;

/* JADX INFO: loaded from: classes.dex */
final class PointerInputChangeEventProducer {
    private final ContextMenuSpec previousPointerInputData = new ContextMenuSpec((Object) null);

    public static final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final long uptime;

        public final boolean getDown() {
            return this.down;
        }

        /* JADX INFO: renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
        public final long m2076getPositionOnScreenF1C5BW0() {
            return this.positionOnScreen;
        }

        public final long getUptime() {
            return this.uptime;
        }

        private PointerInputData(long j, long j2, boolean z) {
            this.uptime = j;
            this.positionOnScreen = j2;
            this.down = z;
        }

        public /* synthetic */ PointerInputData(long j, long j2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z);
        }
    }

    public final void clear() {
        this.previousPointerInputData.RemoteActionCompatParcelizer();
    }

    public final InternalPointerEvent produce(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator) {
        long uptime;
        boolean down;
        long jMo2156screenToLocalMKHz9U;
        ContextMenuSpec contextMenuSpec = new ContextMenuSpec(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i = 0; i < size; i++) {
            PointerInputEventData pointerInputEventData = pointers.get(i);
            PointerInputData pointerInputData = (PointerInputData) this.previousPointerInputData.write(pointerInputEventData.m2086getIdJ3iCeTQ());
            if (pointerInputData == null) {
                down = false;
                uptime = pointerInputEventData.getUptime();
                jMo2156screenToLocalMKHz9U = pointerInputEventData.m2089getPositionF1C5BW0();
            } else {
                uptime = pointerInputData.getUptime();
                down = pointerInputData.getDown();
                jMo2156screenToLocalMKHz9U = positionCalculator.mo2156screenToLocalMKHz9U(pointerInputData.m2076getPositionOnScreenF1C5BW0());
            }
            contextMenuSpec.read(pointerInputEventData.m2086getIdJ3iCeTQ(), new PointerInputChange(pointerInputEventData.m2086getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m2089getPositionF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), uptime, jMo2156screenToLocalMKHz9U, down, false, pointerInputEventData.m2092getTypeT8wyACA(), pointerInputEventData.getHistorical(), pointerInputEventData.m2091getScrollDeltaF1C5BW0(), pointerInputEventData.getScaleGestureFactor(), pointerInputEventData.m2088getPanGestureOffsetF1C5BW0(), pointerInputEventData.m2087getOriginalEventPositionF1C5BW0(), null));
            boolean down2 = pointerInputEventData.getDown();
            ContextMenuSpec contextMenuSpec2 = this.previousPointerInputData;
            if (down2) {
                contextMenuSpec2.read(pointerInputEventData.m2086getIdJ3iCeTQ(), new PointerInputData(pointerInputEventData.getUptime(), pointerInputEventData.m2090getPositionOnScreenF1C5BW0(), pointerInputEventData.getDown(), null));
            } else {
                contextMenuSpec2.IconCompatParcelizer(pointerInputEventData.m2086getIdJ3iCeTQ());
            }
        }
        return new InternalPointerEvent(contextMenuSpec, pointerInputEvent);
    }
}
