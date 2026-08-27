package androidx.compose.ui.input.indirect;

import android.view.MotionEvent;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidIndirectPointerEvent implements PlatformIndirectPointerEvent {
    public static final int $stable = 8;
    private final List<IndirectPointerInputChange> changes;
    private final MotionEvent nativeEvent;
    private final int primaryDirectionalMotionAxis;
    private final int type;

    @Override // androidx.compose.ui.input.indirect.IndirectPointerEvent
    public List<IndirectPointerInputChange> getChanges() {
        return this.changes;
    }

    public final MotionEvent getNativeEvent$ui() {
        return this.nativeEvent;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerEvent
    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxis-nZO2Niw, reason: not valid java name */
    public int mo1548getPrimaryDirectionalMotionAxisnZO2Niw() {
        return this.primaryDirectionalMotionAxis;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerEvent
    /* JADX INFO: renamed from: getType-4ZHQPSE, reason: not valid java name */
    public int mo1549getType4ZHQPSE() {
        return this.type;
    }

    private AndroidIndirectPointerEvent(List<IndirectPointerInputChange> list, int i, int i2, MotionEvent motionEvent) {
        this.changes = list;
        this.type = i;
        this.primaryDirectionalMotionAxis = i2;
        this.nativeEvent = motionEvent;
        if (getChanges().isEmpty()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("changes cannot be empty");
            throw null;
        }
    }

    public /* synthetic */ AndroidIndirectPointerEvent(List list, int i, int i2, MotionEvent motionEvent, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, i2, motionEvent);
    }
}
