package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.view.MotionEvent;
import androidx.compose.ui.ComposeUiFlags;
import java.util.ArrayList;
import java.util.List;
import o.ContextMenuSpec;

/* JADX INFO: loaded from: classes.dex */
public final class PointerEvent {
    public static final int $stable = 8;
    private final int buttons;
    private final List<PointerInputChange> changes;
    private final int classification;
    private final InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    public final List<PointerInputChange> component1() {
        return this.changes;
    }

    /* JADX INFO: renamed from: getButtons-ry648PA, reason: not valid java name */
    public final int m2002getButtonsry648PA() {
        return this.buttons;
    }

    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    public final int getClassification() {
        return this.classification;
    }

    public final InternalPointerEvent getInternalPointerEvent$ui() {
        return this.internalPointerEvent;
    }

    /* JADX INFO: renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public final int m2003getKeyboardModifiersk7X9c1A() {
        return this.keyboardModifiers;
    }

    /* JADX INFO: renamed from: getType-7fucELk, reason: not valid java name */
    public final int m2004getType7fucELk() {
        return this.type;
    }

    /* JADX INFO: renamed from: setType-EhbLWgg$ui, reason: not valid java name */
    public final void m2005setTypeEhbLWgg$ui(int i) {
        this.type = i;
    }

    public PointerEvent(List<PointerInputChange> list, InternalPointerEvent internalPointerEvent) {
        MotionEvent motionEvent;
        this.changes = list;
        this.internalPointerEvent = internalPointerEvent;
        this.classification = (Build.VERSION.SDK_INT < 29 || (motionEvent = getMotionEvent()) == null) ? 0 : motionEvent.getClassification();
        MotionEvent motionEvent2 = getMotionEvent();
        this.buttons = PointerButtons.m1995constructorimpl(motionEvent2 != null ? motionEvent2.getButtonState() : 0);
        MotionEvent motionEvent3 = getMotionEvent();
        this.keyboardModifiers = PointerKeyboardModifiers.m2137constructorimpl(motionEvent3 != null ? motionEvent3.getMetaState() : 0);
        this.type = m2001calculatePointerEventType7fucELk();
    }

    public final MotionEvent getMotionEvent() {
        InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (internalPointerEvent != null) {
            return internalPointerEvent.getMotionEvent();
        }
        return null;
    }

    /* JADX INFO: renamed from: calculatePointerEventType-7fucELk, reason: not valid java name */
    private final int m2001calculatePointerEventType7fucELk() {
        MotionEvent motionEvent = getMotionEvent();
        int i = 0;
        if (motionEvent == null) {
            List<PointerInputChange> list = this.changes;
            int size = list.size();
            while (i < size) {
                PointerInputChange pointerInputChange = list.get(i);
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    return PointerEventType.Companion.m2022getRelease7fucELk();
                }
                if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                    return PointerEventType.Companion.m2021getPress7fucELk();
                }
                i++;
            }
            return PointerEventType.Companion.m2017getMove7fucELk();
        }
        int i2 = Build.VERSION.SDK_INT;
        boolean z = i2 >= 29 && motionEvent.getClassification() == 3;
        if (i2 >= 29 && motionEvent.getClassification() == 5) {
            i = 1;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (z && ComposeUiFlags.isTrackpadGestureHandlingEnabled) {
                return PointerEventType.Companion.m2020getPanStart7fucELk();
            }
            return (i == 0 || !ComposeUiFlags.isTrackpadGestureHandlingEnabled) ? PointerEventType.Companion.m2021getPress7fucELk() : PointerEventType.Companion.m2025getScaleStart7fucELk();
        }
        if (actionMasked == 1) {
            if (z && ComposeUiFlags.isTrackpadGestureHandlingEnabled) {
                return PointerEventType.Companion.m2018getPanEnd7fucELk();
            }
            return (i == 0 || !ComposeUiFlags.isTrackpadGestureHandlingEnabled) ? PointerEventType.Companion.m2022getRelease7fucELk() : PointerEventType.Companion.m2024getScaleEnd7fucELk();
        }
        if (actionMasked != 2) {
            switch (actionMasked) {
                case 5:
                    if (z && ComposeUiFlags.isTrackpadGestureHandlingEnabled) {
                        return PointerEventType.Companion.m2020getPanStart7fucELk();
                    }
                    return (i == 0 || !ComposeUiFlags.isTrackpadGestureHandlingEnabled) ? PointerEventType.Companion.m2021getPress7fucELk() : PointerEventType.Companion.m2023getScaleChange7fucELk();
                case 6:
                    if (z && ComposeUiFlags.isTrackpadGestureHandlingEnabled) {
                        return PointerEventType.Companion.m2018getPanEnd7fucELk();
                    }
                    return (i == 0 || !ComposeUiFlags.isTrackpadGestureHandlingEnabled) ? PointerEventType.Companion.m2022getRelease7fucELk() : PointerEventType.Companion.m2023getScaleChange7fucELk();
                case 7:
                    break;
                case 8:
                    return PointerEventType.Companion.m2026getScroll7fucELk();
                case 9:
                    return PointerEventType.Companion.m2015getEnter7fucELk();
                case 10:
                    return PointerEventType.Companion.m2016getExit7fucELk();
                default:
                    return PointerEventType.Companion.m2027getUnknown7fucELk();
            }
        }
        if (z && ComposeUiFlags.isTrackpadGestureHandlingEnabled) {
            return PointerEventType.Companion.m2019getPanMove7fucELk();
        }
        return (i == 0 || !ComposeUiFlags.isTrackpadGestureHandlingEnabled) ? PointerEventType.Companion.m2017getMove7fucELk() : PointerEventType.Companion.m2023getScaleChange7fucELk();
    }

    public final PointerEvent copy(List<PointerInputChange> list, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return new PointerEvent(list, null);
        }
        if (motionEvent.equals(getMotionEvent())) {
            return new PointerEvent(list, this.internalPointerEvent);
        }
        ContextMenuSpec contextMenuSpec = new ContextMenuSpec(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = list.get(i);
            contextMenuSpec.read(pointerInputChange.m2068getIdJ3iCeTQ(), pointerInputChange);
            long jM2068getIdJ3iCeTQ = pointerInputChange.m2068getIdJ3iCeTQ();
            long uptimeMillis = pointerInputChange.getUptimeMillis();
            long jM2071getPositionF1C5BW0 = pointerInputChange.m2071getPositionF1C5BW0();
            long jM2071getPositionF1C5BW1 = pointerInputChange.m2071getPositionF1C5BW0();
            boolean pressed = pointerInputChange.getPressed();
            float pressure = pointerInputChange.getPressure();
            int iM2074getTypeT8wyACA = pointerInputChange.m2074getTypeT8wyACA();
            InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
            arrayList.add(new PointerInputEventData(jM2068getIdJ3iCeTQ, uptimeMillis, jM2071getPositionF1C5BW0, jM2071getPositionF1C5BW1, pressed, pressure, iM2074getTypeT8wyACA, internalPointerEvent != null && internalPointerEvent.m1976activeHoverEvent0FcD4WY(pointerInputChange.m2068getIdJ3iCeTQ()), null, 0L, pointerInputChange.getScaleFactor(), pointerInputChange.m2070getPanOffsetF1C5BW0(), 0L, 4864, null));
        }
        return new PointerEvent(list, new InternalPointerEvent(contextMenuSpec, new PointerInputEvent(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    public PointerEvent(List<PointerInputChange> list) {
        this(list, null);
    }
}
