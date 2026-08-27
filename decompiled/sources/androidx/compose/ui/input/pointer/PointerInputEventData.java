package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class PointerInputEventData {
    public static final int $stable = 8;
    private final boolean activeHover;
    private final boolean down;
    private final List<HistoricalChange> historical;
    private final long id;
    private final long originalEventPosition;
    private final long panGestureOffset;
    private final long position;
    private final long positionOnScreen;
    private final float pressure;
    private final float scaleGestureFactor;
    private final long scrollDelta;
    private final int type;
    private final long uptime;

    /* JADX INFO: renamed from: component1-J3iCeTQ, reason: not valid java name */
    public final long m2078component1J3iCeTQ() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10-F1C5BW0, reason: not valid java name */
    public final long m2079component10F1C5BW0() {
        return this.scrollDelta;
    }

    public final float component11() {
        return this.scaleGestureFactor;
    }

    /* JADX INFO: renamed from: component12-F1C5BW0, reason: not valid java name */
    public final long m2080component12F1C5BW0() {
        return this.panGestureOffset;
    }

    /* JADX INFO: renamed from: component13-F1C5BW0, reason: not valid java name */
    public final long m2081component13F1C5BW0() {
        return this.originalEventPosition;
    }

    public final long component2() {
        return this.uptime;
    }

    /* JADX INFO: renamed from: component3-F1C5BW0, reason: not valid java name */
    public final long m2082component3F1C5BW0() {
        return this.positionOnScreen;
    }

    /* JADX INFO: renamed from: component4-F1C5BW0, reason: not valid java name */
    public final long m2083component4F1C5BW0() {
        return this.position;
    }

    public final boolean component5() {
        return this.down;
    }

    public final float component6() {
        return this.pressure;
    }

    /* JADX INFO: renamed from: component7-T8wyACA, reason: not valid java name */
    public final int m2084component7T8wyACA() {
        return this.type;
    }

    public final boolean component8() {
        return this.activeHover;
    }

    public final List<HistoricalChange> component9() {
        return this.historical;
    }

    public final boolean getActiveHover() {
        return this.activeHover;
    }

    public final boolean getDown() {
        return this.down;
    }

    public final List<HistoricalChange> getHistorical() {
        return this.historical;
    }

    /* JADX INFO: renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m2086getIdJ3iCeTQ() {
        return this.id;
    }

    /* JADX INFO: renamed from: getOriginalEventPosition-F1C5BW0, reason: not valid java name */
    public final long m2087getOriginalEventPositionF1C5BW0() {
        return this.originalEventPosition;
    }

    /* JADX INFO: renamed from: getPanGestureOffset-F1C5BW0, reason: not valid java name */
    public final long m2088getPanGestureOffsetF1C5BW0() {
        return this.panGestureOffset;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m2089getPositionF1C5BW0() {
        return this.position;
    }

    /* JADX INFO: renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m2090getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    public final float getPressure() {
        return this.pressure;
    }

    public final float getScaleGestureFactor() {
        return this.scaleGestureFactor;
    }

    /* JADX INFO: renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m2091getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m2092getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptime() {
        return this.uptime;
    }

    public int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(PointerId.m2051hashCodeimpl(this.id) * 31, 31, this.uptime);
        int iM479hashCodeimpl = Offset.m479hashCodeimpl(this.positionOnScreen);
        int iM2 = af$$ExternalSyntheticOutline1.m(this.pressure, d$$ExternalSyntheticOutline0.m((Offset.m479hashCodeimpl(this.position) + ((iM479hashCodeimpl + iM) * 31)) * 31, 31, this.down), 31);
        int iM3 = c8$$ExternalSyntheticOutline0.m(this.historical, d$$ExternalSyntheticOutline0.m((PointerType.m2147hashCodeimpl(this.type) + iM2) * 31, 31, this.activeHover), 31);
        int iM4 = af$$ExternalSyntheticOutline1.m(this.scaleGestureFactor, (Offset.m479hashCodeimpl(this.scrollDelta) + iM3) * 31, 31);
        return Offset.m479hashCodeimpl(this.originalEventPosition) + ((Offset.m479hashCodeimpl(this.panGestureOffset) + iM4) * 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        if (!PointerId.m2050equalsimpl0(this.id, pointerInputEventData.id) || this.uptime != pointerInputEventData.uptime || !Offset.m474equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) || !Offset.m474equalsimpl0(this.position, pointerInputEventData.position) || this.down != pointerInputEventData.down || Float.compare(this.pressure, pointerInputEventData.pressure) != 0 || !PointerType.m2146equalsimpl0(this.type, pointerInputEventData.type) || this.activeHover != pointerInputEventData.activeHover) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.historical, pointerInputEventData.historical}, getCieXyz.write())).booleanValue() && Offset.m474equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta) && Float.compare(this.scaleGestureFactor, pointerInputEventData.scaleGestureFactor) == 0 && Offset.m474equalsimpl0(this.panGestureOffset, pointerInputEventData.panGestureOffset) && Offset.m474equalsimpl0(this.originalEventPosition, pointerInputEventData.originalEventPosition);
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m2052toStringimpl(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) Offset.m485toStringimpl(this.positionOnScreen)) + ", position=" + ((Object) Offset.m485toStringimpl(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) PointerType.m2148toStringimpl(this.type)) + ", activeHover=" + this.activeHover + ", historical=" + this.historical + ", scrollDelta=" + ((Object) Offset.m485toStringimpl(this.scrollDelta)) + ", scaleGestureFactor=" + this.scaleGestureFactor + ", panGestureOffset=" + ((Object) Offset.m485toStringimpl(this.panGestureOffset)) + ", originalEventPosition=" + ((Object) Offset.m485toStringimpl(this.originalEventPosition)) + ')';
    }

    public /* synthetic */ PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, float f2, long j6, long j7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z, f, i, (i2 & Fields.SpotShadowColor) != 0 ? false : z2, (i2 & Fields.RotationX) != 0 ? new ArrayList() : list, (i2 & Fields.RotationY) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j5, f2, j6, (i2 & Fields.TransformOrigin) != 0 ? Offset.Companion.m493getZeroF1C5BW0() : j7, null);
    }

    /* JADX INFO: renamed from: copy-hf9UmOk, reason: not valid java name */
    public final PointerInputEventData m2085copyhf9UmOk(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List<HistoricalChange> list, long j5, float f2, long j6, long j7) {
        return new PointerInputEventData(j, j2, j3, j4, z, f, i, z2, list, j5, f2, j6, j7, null);
    }

    private PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List<HistoricalChange> list, long j5, float f2, long j6, long j7) {
        this.id = j;
        this.uptime = j2;
        this.positionOnScreen = j3;
        this.position = j4;
        this.down = z;
        this.pressure = f;
        this.type = i;
        this.activeHover = z2;
        this.historical = list;
        this.scrollDelta = j5;
        this.scaleGestureFactor = f2;
        this.panGestureOffset = j6;
        this.originalEventPosition = j7;
    }

    public /* synthetic */ PointerInputEventData(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, float f2, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z, f, i, z2, list, j5, f2, j6, j7);
    }
}
