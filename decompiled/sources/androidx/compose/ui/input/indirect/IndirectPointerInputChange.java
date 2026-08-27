package androidx.compose.ui.input.indirect;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerId;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes.dex */
public final class IndirectPointerInputChange {
    public static final int $stable = 8;
    private final long id;
    private boolean isConsumed;
    private final long position;
    private final boolean pressed;
    private final float pressure;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final long uptimeMillis;

    public final void consume() {
        this.isConsumed = true;
    }

    /* JADX INFO: renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m1573getIdJ3iCeTQ() {
        return this.id;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m1574getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* JADX INFO: renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name */
    public final long m1575getPreviousPositionF1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean isConsumed() {
        return this.isConsumed;
    }

    private IndirectPointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.id = j;
        this.uptimeMillis = j2;
        this.position = j3;
        this.pressed = z;
        this.pressure = f;
        this.previousUptimeMillis = j4;
        this.previousPosition = j5;
        this.previousPressed = z2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IndirectPointerInputChange(id=");
        sb.append((Object) PointerId.m2052toStringimpl(this.id));
        sb.append(", uptimeMillis=");
        sb.append(this.uptimeMillis);
        sb.append(", position=");
        sb.append((Object) Offset.m485toStringimpl(this.position));
        sb.append(", pressed=");
        sb.append(this.pressed);
        sb.append(", pressure=");
        sb.append(this.pressure);
        sb.append(", previousUptimeMillis=");
        sb.append(this.previousUptimeMillis);
        sb.append(", previousPosition=");
        sb.append((Object) Offset.m485toStringimpl(this.previousPosition));
        sb.append(", previousPressed=");
        sb.append(this.previousPressed);
        sb.append(", isConsumed=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.isConsumed, ')');
    }

    public /* synthetic */ IndirectPointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2);
    }
}
