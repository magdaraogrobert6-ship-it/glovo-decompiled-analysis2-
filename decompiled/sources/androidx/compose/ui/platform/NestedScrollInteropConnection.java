package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import java.util.WeakHashMap;
import o.FocusPropertiesNode;
import o.FocusPropertiesonExit1;
import o.ShortNewsContentCardView;
import o.onContentCardClicked;

/* JADX INFO: loaded from: classes.dex */
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    public static final int $stable = 8;
    private final int[] consumedScrollCache;
    private final float minFlingVelocity;
    private final FocusPropertiesonExit1 nestedScrollChildHelper;
    private final View view;

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo55onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!this.nestedScrollChildHelper.serializer(NestedScrollInteropConnectionKt.m2774getScrollAxesk4lQ0M(j2), NestedScrollInteropConnectionKt.m2777toViewTypeGyEprt8(i))) {
            return Offset.Companion.m493getZeroF1C5BW0();
        }
        onContentCardClicked.serializer(this.consumedScrollCache, 0);
        int iComposeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j2 >> 32)));
        int iComposeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j2 & 4294967295L)));
        this.nestedScrollChildHelper.serializer(NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j >> 32))), NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (4294967295L & j))), iComposeToViewOffset, iComposeToViewOffset2, null, NestedScrollInteropConnectionKt.m2777toViewTypeGyEprt8(i), this.consumedScrollCache);
        return NestedScrollInteropConnectionKt.m2776toOffsetmoWRBKg(iComposeToViewOffset, iComposeToViewOffset2, this.consumedScrollCache, j2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public Object mo123onPreFlingQWom1Mo(long j, ShortNewsContentCardView<? super Velocity> shortNewsContentCardView) {
        if (!this.nestedScrollChildHelper.serializer(NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m3911getXimpl(j)), NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m3912getYimpl(j))) && !this.nestedScrollChildHelper.serializer(NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m3911getXimpl(j)), NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m3912getYimpl(j)), true)) {
            j = Velocity.Companion.m3922getZero9UxMQ8M();
        }
        return Velocity.m3902boximpl(j);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo93onPreScrollOzD1aCk(long j, int i) {
        if (!this.nestedScrollChildHelper.serializer(NestedScrollInteropConnectionKt.m2774getScrollAxesk4lQ0M(j), NestedScrollInteropConnectionKt.m2777toViewTypeGyEprt8(i))) {
            return Offset.Companion.m493getZeroF1C5BW0();
        }
        onContentCardClicked.serializer(this.consumedScrollCache, 0);
        int iComposeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (j >> 32)));
        int iComposeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Float.intBitsToFloat((int) (4294967295L & j)));
        this.nestedScrollChildHelper.serializer(this.consumedScrollCache, iComposeToViewOffset, null, iComposeToViewOffset2, NestedScrollInteropConnectionKt.m2777toViewTypeGyEprt8(i));
        return NestedScrollInteropConnectionKt.m2776toOffsetmoWRBKg(iComposeToViewOffset, iComposeToViewOffset2, this.consumedScrollCache, j);
    }

    public NestedScrollInteropConnection(View view, float f) {
        this.view = view;
        this.minFlingVelocity = f;
        FocusPropertiesonExit1 focusPropertiesonExit1 = new FocusPropertiesonExit1(view);
        focusPropertiesonExit1.write(true);
        this.nestedScrollChildHelper = focusPropertiesonExit1;
        this.consumedScrollCache = new int[2];
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        view.setNestedScrollingEnabled(true);
    }

    private final void stopNestedScrolls() {
        if (this.nestedScrollChildHelper.read(0)) {
            this.nestedScrollChildHelper.serializer(0);
        }
        if (this.nestedScrollChildHelper.read(1)) {
            this.nestedScrollChildHelper.serializer(1);
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo54onPostFlingRZ2iAVY(long j, long j2, ShortNewsContentCardView<? super Velocity> shortNewsContentCardView) {
        stopNestedScrolls();
        return Velocity.m3902boximpl(Velocity.Companion.m3922getZero9UxMQ8M());
    }
}
