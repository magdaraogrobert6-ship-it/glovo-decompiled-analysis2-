package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import o.SelectionHandleIcon;
import o.ShortNewsContentCardView;
import o.getContentCaptureSessionui;
import o.populate;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 implements NestedScrollConnection {
    public final /* synthetic */ SelectionHandleIcon IconCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final /* synthetic */ SheetState write;

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo54onPostFlingRZ2iAVY(long j, long j2, ShortNewsContentCardView shortNewsContentCardView) {
        this.serializer.invoke(new Float(this.IconCompatParcelizer == SelectionHandleIcon.Horizontal ? Velocity.m3911getXimpl(j2) : Velocity.m3912getYimpl(j2)));
        return Velocity.m3902boximpl(j2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo55onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!NestedScrollSource.m1926equalsimpl0(i, NestedScrollSource.Companion.m1938getUserInputWNlRxjI())) {
            return Offset.Companion.m493getZeroF1C5BW0();
        }
        AnchoredDraggableState anchoredDraggableState = this.write.IconCompatParcelizer;
        float fRemoteActionCompatParcelizer = anchoredDraggableState.RemoteActionCompatParcelizer(Float.intBitsToFloat((int) (this.IconCompatParcelizer == SelectionHandleIcon.Horizontal ? j2 >> 32 : j2 & 4294967295L)));
        float fSerializer = Float.isNaN(anchoredDraggableState.serializer()) ? 0.0f : anchoredDraggableState.serializer();
        ((getContentCaptureSessionui) ((populate) anchoredDraggableState.PlaybackStateCompatCustomAction)).IconCompatParcelizer(fRemoteActionCompatParcelizer);
        return toOffset(fRemoteActionCompatParcelizer - fSerializer);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public final Object mo123onPreFlingQWom1Mo(long j, ShortNewsContentCardView shortNewsContentCardView) {
        float fM3911getXimpl = this.IconCompatParcelizer == SelectionHandleIcon.Horizontal ? Velocity.m3911getXimpl(j) : Velocity.m3912getYimpl(j);
        SheetState sheetState = this.write;
        float f = sheetState.IconCompatParcelizer.read();
        float f2 = sheetState.IconCompatParcelizer.RemoteActionCompatParcelizer().read();
        if (fM3911getXimpl >= 0.0f || f <= f2) {
            j = Velocity.Companion.m3922getZero9UxMQ8M();
        } else {
            this.serializer.invoke(new Float(fM3911getXimpl));
        }
        return Velocity.m3902boximpl(j);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo93onPreScrollOzD1aCk(long j, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.IconCompatParcelizer == SelectionHandleIcon.Horizontal ? j >> 32 : j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || !NestedScrollSource.m1926equalsimpl0(i, NestedScrollSource.Companion.m1938getUserInputWNlRxjI())) {
            return Offset.Companion.m493getZeroF1C5BW0();
        }
        AnchoredDraggableState anchoredDraggableState = this.write.IconCompatParcelizer;
        float fRemoteActionCompatParcelizer = anchoredDraggableState.RemoteActionCompatParcelizer(fIntBitsToFloat);
        float fSerializer = Float.isNaN(anchoredDraggableState.serializer()) ? 0.0f : anchoredDraggableState.serializer();
        ((getContentCaptureSessionui) ((populate) anchoredDraggableState.PlaybackStateCompatCustomAction)).IconCompatParcelizer(fRemoteActionCompatParcelizer);
        return toOffset(fRemoteActionCompatParcelizer - fSerializer);
    }

    public SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(SheetState sheetState, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, SelectionHandleIcon selectionHandleIcon) {
        this.write = sheetState;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = selectionHandleIcon;
    }

    public final long toOffset(float f) {
        SelectionHandleIcon selectionHandleIcon = SelectionHandleIcon.Horizontal;
        SelectionHandleIcon selectionHandleIcon2 = this.IconCompatParcelizer;
        float f2 = selectionHandleIcon2 == selectionHandleIcon ? f : 0.0f;
        if (selectionHandleIcon2 != SelectionHandleIcon.Vertical) {
            f = 0.0f;
        }
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }
}
