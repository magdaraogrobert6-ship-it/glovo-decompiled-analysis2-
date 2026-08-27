package androidx.compose.ui.input.pointer;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.instance_delegatelambda0;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
public final class PointerInputChange {
    public static final int $stable = 0;
    private ConsumedData _consumed;
    private List<HistoricalChange> _historical;
    private PointerInputChange consumedDelegate;
    private boolean downChange;
    private final long id;
    private long originalEventPosition;
    private final long panOffset;
    private final long position;
    private boolean positionChange;
    private final boolean pressed;
    private final float pressure;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final float scaleFactor;
    private final long scrollDelta;
    private final int type;
    private final long uptimeMillis;

    @onItemDismisslambda0
    public static /* synthetic */ void getConsumed$annotations() {
    }

    private static /* synthetic */ void get_consumed$annotations() {
    }

    public final PointerInputChange getConsumedDelegate$ui() {
        return this.consumedDelegate;
    }

    public final boolean getDownChange$ui() {
        return this.downChange;
    }

    /* JADX INFO: renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m2068getIdJ3iCeTQ() {
        return this.id;
    }

    /* JADX INFO: renamed from: getOriginalEventPosition-F1C5BW0$ui, reason: not valid java name */
    public final long m2069getOriginalEventPositionF1C5BW0$ui() {
        return this.originalEventPosition;
    }

    /* JADX INFO: renamed from: getPanOffset-F1C5BW0, reason: not valid java name */
    public final long m2070getPanOffsetF1C5BW0() {
        return this.panOffset;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m2071getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPositionChange$ui() {
        return this.positionChange;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* JADX INFO: renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name */
    public final long m2072getPreviousPositionF1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    /* JADX INFO: renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m2073getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m2074getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final void setConsumedDelegate$ui(PointerInputChange pointerInputChange) {
        this.consumedDelegate = pointerInputChange;
    }

    public final void setDownChange$ui(boolean z) {
        this.downChange = z;
    }

    /* JADX INFO: renamed from: setOriginalEventPosition-k-4lQ0M$ui, reason: not valid java name */
    public final void m2075setOriginalEventPositionk4lQ0M$ui(long j) {
        this.originalEventPosition = j;
    }

    public final void setPositionChange$ui(boolean z) {
        this.positionChange = z;
    }

    /* JADX INFO: renamed from: copy-JKmWfYY, reason: not valid java name */
    public final PointerInputChange m2063copyJKmWfYY(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, long j6) {
        PointerInputChange pointerInputChangeM2067copywbzehF4 = m2067copywbzehF4(j, j2, j3, z, this.pressure, j4, j5, z2, i, getHistorical(), j6);
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            pointerInputChange = this;
        }
        pointerInputChangeM2067copywbzehF4.consumedDelegate = pointerInputChange;
        return pointerInputChangeM2067copywbzehF4;
    }

    @ExperimentalComposeUiApi
    /* JADX INFO: renamed from: copy-OHpmEuE, reason: not valid java name */
    public final PointerInputChange m2064copyOHpmEuE(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List<HistoricalChange> list, long j6) {
        PointerInputChange pointerInputChangeM2067copywbzehF4 = m2067copywbzehF4(j, j2, j3, z, this.pressure, j4, j5, z2, i, list, j6);
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            pointerInputChange = this;
        }
        pointerInputChangeM2067copywbzehF4.consumedDelegate = pointerInputChange;
        return pointerInputChangeM2067copywbzehF4;
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: copy-0GkPj7c, reason: not valid java name */
    public final PointerInputChange m2061copy0GkPj7c(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, long j6) {
        PointerInputChange pointerInputChange = new PointerInputChange(j, j2, j3, z, this.pressure, j4, j5, z2, consumedData.getDownChange() || consumedData.getPositionChange(), i, getHistorical(), j6, this.scaleFactor, this.panOffset, this.originalEventPosition, null);
        pointerInputChange.positionChange = this.positionChange;
        pointerInputChange.downChange = this.downChange;
        return pointerInputChange;
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: copy-Ezr-O64, reason: not valid java name */
    public final /* synthetic */ PointerInputChange m2062copyEzrO64(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i) {
        PointerInputChange pointerInputChange = new PointerInputChange(j, j2, j3, z, this.pressure, j4, j5, z2, consumedData.getDownChange() || consumedData.getPositionChange(), i, getHistorical(), this.scrollDelta, this.scaleFactor, this.panOffset, this.originalEventPosition, null);
        pointerInputChange.positionChange = this.positionChange;
        pointerInputChange.downChange = this.downChange;
        return pointerInputChange;
    }

    /* JADX INFO: renamed from: copy-Tn9QgHE, reason: not valid java name */
    public final PointerInputChange m2065copyTn9QgHE(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, long j6) {
        PointerInputChange pointerInputChange = new PointerInputChange(j, j2, j3, z, f, j4, j5, z2, false, i, getHistorical(), j6, this.scaleFactor, this.panOffset, this.originalEventPosition, null);
        PointerInputChange pointerInputChange2 = this.consumedDelegate;
        if (pointerInputChange2 == null) {
            pointerInputChange2 = this;
        }
        pointerInputChange.consumedDelegate = pointerInputChange2;
        return pointerInputChange;
    }

    /* JADX INFO: renamed from: copy-lGhnTh8, reason: not valid java name */
    public final PointerInputChange m2066copylGhnTh8(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List<HistoricalChange> list, long j6, float f2, long j7) {
        PointerInputChange pointerInputChange = new PointerInputChange(j, j2, j3, z, f, j4, j5, z2, false, i, list, j6, f2, j7, this.originalEventPosition, null);
        PointerInputChange pointerInputChange2 = this.consumedDelegate;
        if (pointerInputChange2 == null) {
            pointerInputChange2 = this;
        }
        pointerInputChange.consumedDelegate = pointerInputChange2;
        return pointerInputChange;
    }

    /* JADX INFO: renamed from: copy-wbzehF4, reason: not valid java name */
    public final PointerInputChange m2067copywbzehF4(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List<HistoricalChange> list, long j6) {
        PointerInputChange pointerInputChange = new PointerInputChange(j, j2, j3, z, f, j4, j5, z2, false, i, list, j6, this.scaleFactor, this.panOffset, this.originalEventPosition, null);
        PointerInputChange pointerInputChange2 = this.consumedDelegate;
        if (pointerInputChange2 == null) {
            pointerInputChange2 = this;
        }
        pointerInputChange.consumedDelegate = pointerInputChange2;
        return pointerInputChange;
    }

    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> list = this._historical;
        return list == null ? instance_delegatelambda0.write : list;
    }

    public final boolean isConsumed() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange != null) {
            return pointerInputChange.isConsumed();
        }
        return this.downChange || this.positionChange;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.m2052toStringimpl(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m485toStringimpl(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.m485toStringimpl(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + isConsumed() + ", type=" + ((Object) PointerType.m2148toStringimpl(this.type)) + ", historical=" + getHistorical() + ", scrollDelta=" + ((Object) Offset.m485toStringimpl(this.scrollDelta)) + ", scaleFactor=" + this.scaleFactor + ", panOffset=" + ((Object) Offset.m485toStringimpl(this.panOffset)) + ')';
    }

    public final void consume() {
        PointerInputChange pointerInputChange = this.consumedDelegate;
        if (pointerInputChange == null) {
            this.downChange = true;
            this.positionChange = true;
        } else if (pointerInputChange != null) {
            pointerInputChange.consume();
        }
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, (i2 & Fields.RotationY) != 0 ? PointerType.Companion.m2153getTouchT8wyACA() : i, (i2 & Fields.RotationZ) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j6, (i2 & Fields.CameraDistance) != 0 ? 1.0f : f2, (i2 & Fields.TransformOrigin) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j7, (DefaultConstructorMarker) null);
    }

    public final ConsumedData getConsumed() {
        if (this._consumed == null) {
            this._consumed = new ConsumedData(this);
        }
        ConsumedData consumedData = this._consumed;
        consumedData.getClass();
        return consumedData;
    }

    @onItemDismisslambda0
    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, float f2, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, (List<HistoricalChange>) list, j6, f2, j7, j8);
    }

    @onItemDismisslambda0
    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, consumedData, i);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6, f, j7);
    }

    @onItemDismisslambda0
    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.id = j;
        this.uptimeMillis = j2;
        this.position = j3;
        this.pressed = z;
        this.pressure = f;
        this.previousUptimeMillis = j4;
        this.previousPosition = j5;
        this.previousPressed = z2;
        this.type = i;
        this.scrollDelta = j6;
        this.scaleFactor = f2;
        this.panOffset = j7;
        this.originalEventPosition = Offset.Companion.m493getZeroF1C5BW0();
        this.downChange = z3;
        this.positionChange = z3;
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, f2, j7);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f, long j7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, z3, (i2 & Fields.RotationX) != 0 ? PointerType.Companion.m2153getTouchT8wyACA() : i, (i2 & Fields.RotationY) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j6, (i2 & Fields.RotationZ) != 0 ? 1.0f : f, (i2 & Fields.CameraDistance) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j7, (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f, long j7) {
        this(j, j2, j3, z, 1.0f, j4, j5, z2, z3, i, j6, f, j7, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, (i2 & Fields.RotationY) != 0 ? PointerType.Companion.m2153getTouchT8wyACA() : i, (i2 & Fields.RotationZ) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j6, (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, 0.0f, 0L, 6144, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, z3, (i2 & Fields.RotationX) != 0 ? PointerType.Companion.m2153getTouchT8wyACA() : i, (i2 & Fields.RotationY) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j6, (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6, 0.0f, 0L, 3072, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, j4, j5, z2, consumedData, (i2 & Fields.RotationX) != 0 ? PointerType.Companion.m2153getTouchT8wyACA() : i, (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ConsumedData consumedData, int i) {
        this(j, j2, j3, z, 1.0f, j4, j5, z2, consumedData.getDownChange() || consumedData.getPositionChange(), i, Offset.Companion.m493getZeroF1C5BW0(), 0.0f, 0L, 6144, (DefaultConstructorMarker) null);
    }

    private PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List<HistoricalChange> list, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, f2, j7, (DefaultConstructorMarker) null);
        this._historical = list;
        this.originalEventPosition = j8;
    }
}
