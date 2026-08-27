package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;

/* JADX INFO: loaded from: classes.dex */
public interface LookaheadScope {
    LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope);

    /* JADX INFO: renamed from: localLookaheadPositionOf-au-aQtc, reason: not valid java name */
    default long m2242localLookaheadPositionOfauaQtc(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j, boolean z) {
        return LookaheadScopeKt.m2243localLookaheadPositionOfFgt4K4Q(this, layoutCoordinates, layoutCoordinates2, j, z);
    }

    LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates);

    /* JADX INFO: renamed from: localLookaheadPositionOf-au-aQtc$default, reason: not valid java name */
    static /* synthetic */ long m2241localLookaheadPositionOfauaQtc$default(LookaheadScope lookaheadScope, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = Offset.Companion.m493getZeroF1C5BW0();
            }
            long j2 = j;
            if ((i & 4) != 0) {
                z = true;
            }
            return lookaheadScope.m2242localLookaheadPositionOfauaQtc(layoutCoordinates, layoutCoordinates2, j2, z);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: localLookaheadPositionOf-au-aQtc");
        return 0L;
    }
}
