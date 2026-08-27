package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PointerInputEvent {
    public static final int $stable = 8;
    private MotionEvent motionEvent;
    private final List<PointerInputEventData> pointers;
    private final long uptime;

    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    public final List<PointerInputEventData> getPointers() {
        return this.pointers;
    }

    public final long getUptime() {
        return this.uptime;
    }

    public final void setMotionEvent(MotionEvent motionEvent) {
        this.motionEvent = motionEvent;
    }

    public PointerInputEvent(long j, List<PointerInputEventData> list, MotionEvent motionEvent) {
        this.uptime = j;
        this.pointers = list;
        this.motionEvent = motionEvent;
    }
}
