package androidx.compose.foundation.text.selection;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import java.util.List;
import o.getNodeannotations;
import o.seekAnimationsanimation_core;

/* JADX INFO: loaded from: classes.dex */
public abstract class SelectionGestures_androidKt {
    public static final seekAnimationsanimation_core RemoteActionCompatParcelizer = getNodeannotations.RatingCompat;

    public static final boolean isMouseOrTouchPad(PointerEvent pointerEvent) {
        MotionEvent motionEvent;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (!PointerType.m2146equalsimpl0(changes.get(i).m2074getTypeT8wyACA(), PointerType.Companion.m2151getMouseT8wyACA())) {
                MotionEvent motionEvent2 = pointerEvent.getMotionEvent();
                if ((motionEvent2 == null || !motionEvent2.isFromSource(8194)) && ((motionEvent = pointerEvent.getMotionEvent()) == null || !motionEvent.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
