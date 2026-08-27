package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
public final class HistoricalChange {
    public static final int $stable = 0;
    private long originalEventPosition;
    private final long panOffset;
    private final long position;
    private final float scaleFactor;
    private final long uptimeMillis;

    /* JADX INFO: renamed from: getOriginalEventPosition-F1C5BW0$ui, reason: not valid java name */
    public final long m1968getOriginalEventPositionF1C5BW0$ui() {
        return this.originalEventPosition;
    }

    /* JADX INFO: renamed from: getPanOffset-F1C5BW0, reason: not valid java name */
    public final long m1969getPanOffsetF1C5BW0() {
        return this.panOffset;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m1970getPositionF1C5BW0() {
        return this.position;
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m485toStringimpl(this.position)) + ", scaleFactor=" + this.scaleFactor + ", panOffset=" + ((Object) Offset.m485toStringimpl(this.panOffset)) + ')';
    }

    public /* synthetic */ HistoricalChange(long j, long j2, float f, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? 1.0f : f, (i & 8) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j3, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ HistoricalChange(long j, long j2, float f, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f, j3);
    }

    @onItemDismisslambda0
    public /* synthetic */ HistoricalChange(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    private HistoricalChange(long j, long j2, float f, long j3) {
        this.uptimeMillis = j;
        this.position = j2;
        this.scaleFactor = f;
        this.panOffset = j3;
        this.originalEventPosition = Offset.Companion.m493getZeroF1C5BW0();
    }

    public /* synthetic */ HistoricalChange(long j, long j2, float f, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f, j3, j4);
    }

    private HistoricalChange(long j, long j2) {
        this(j, j2, 1.0f, Offset.Companion.m493getZeroF1C5BW0(), (DefaultConstructorMarker) null);
    }

    private HistoricalChange(long j, long j2, float f, long j3, long j4) {
        this(j, j2, f, j3, (DefaultConstructorMarker) null);
        this.originalEventPosition = j4;
    }
}
