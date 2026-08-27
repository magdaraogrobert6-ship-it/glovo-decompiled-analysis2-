package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutNodeAlignmentLines extends LayoutNodeUsageByParent {
    @Override // o.LayoutNodeUsageByParent
    public final void IconCompatParcelizer(long j, Object obj) {
        ((setGloballyPositionedObservers) ((LayoutNodeCompanionErrorMeasurePolicy1) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, obj))).IconCompatParcelizer = false;
    }

    @Override // o.LayoutNodeUsageByParent
    public final void IconCompatParcelizer(long j, Object obj, Object obj2) {
        getLookaheadCoordinatesAccessedDuringModifierPlacement getlookaheadcoordinatesaccessedduringmodifierplacement = getLastLookaheadConstraintsDWUhwKw.read;
        LayoutNodeCompanionErrorMeasurePolicy1 layoutNodeCompanionErrorMeasurePolicy1 = (LayoutNodeCompanionErrorMeasurePolicy1) getlookaheadcoordinatesaccessedduringmodifierplacement.MediaSessionCompatQueueItem(j, obj);
        LayoutNodeCompanionErrorMeasurePolicy1 layoutNodeCompanionErrorMeasurePolicy2 = (LayoutNodeCompanionErrorMeasurePolicy1) getlookaheadcoordinatesaccessedduringmodifierplacement.MediaSessionCompatQueueItem(j, obj2);
        int size = layoutNodeCompanionErrorMeasurePolicy1.size();
        int size2 = layoutNodeCompanionErrorMeasurePolicy2.size();
        if (size > 0 && size2 > 0) {
            if (!((setGloballyPositionedObservers) layoutNodeCompanionErrorMeasurePolicy1).IconCompatParcelizer) {
                layoutNodeCompanionErrorMeasurePolicy1 = layoutNodeCompanionErrorMeasurePolicy1.read(size2 + size);
            }
            layoutNodeCompanionErrorMeasurePolicy1.addAll(layoutNodeCompanionErrorMeasurePolicy2);
        }
        if (size > 0) {
            layoutNodeCompanionErrorMeasurePolicy2 = layoutNodeCompanionErrorMeasurePolicy1;
        }
        getLastLookaheadConstraintsDWUhwKw.write(j, obj, layoutNodeCompanionErrorMeasurePolicy2);
    }

    @Override // o.LayoutNodeUsageByParent
    public final List RemoteActionCompatParcelizer(long j, Object obj) {
        LayoutNodeCompanionErrorMeasurePolicy1 layoutNodeCompanionErrorMeasurePolicy1 = (LayoutNodeCompanionErrorMeasurePolicy1) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, obj);
        if (((setGloballyPositionedObservers) layoutNodeCompanionErrorMeasurePolicy1).IconCompatParcelizer) {
            return layoutNodeCompanionErrorMeasurePolicy1;
        }
        int size = layoutNodeCompanionErrorMeasurePolicy1.size();
        LayoutNodeCompanionErrorMeasurePolicy1 layoutNodeCompanionErrorMeasurePolicy2 = layoutNodeCompanionErrorMeasurePolicy1.read(size == 0 ? 10 : size * 2);
        getLastLookaheadConstraintsDWUhwKw.write(j, obj, layoutNodeCompanionErrorMeasurePolicy2);
        return layoutNodeCompanionErrorMeasurePolicy2;
    }
}
