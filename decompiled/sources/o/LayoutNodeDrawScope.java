package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutNodeDrawScope extends LayoutNodeUsageByParent {
    public static final Class IconCompatParcelizer = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List IconCompatParcelizer(long j, int i, Object obj) {
        List arrayList;
        List list = (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, obj);
        if (list.isEmpty()) {
            if (list instanceof LayoutNodeNoIntrinsicsMeasurePolicy) {
                arrayList = new LayoutNodeLayoutState(i);
            } else {
                arrayList = ((list instanceof LayoutNodeLayoutDelegate) && (list instanceof LayoutNodeCompanionErrorMeasurePolicy1)) ? ((LayoutNodeCompanionErrorMeasurePolicy1) list).read(i) : new ArrayList(i);
            }
            getLastLookaheadConstraintsDWUhwKw.write(j, obj, arrayList);
            return arrayList;
        }
        if (IconCompatParcelizer.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            getLastLookaheadConstraintsDWUhwKw.write(j, obj, arrayList2);
            return arrayList2;
        }
        if (list instanceof getLastConstraintsDWUhwKw) {
            getLastConstraintsDWUhwKw getlastconstraintsdwuhwkw = (getLastConstraintsDWUhwKw) list;
            LayoutNodeLayoutState layoutNodeLayoutState = new LayoutNodeLayoutState(getlastconstraintsdwuhwkw.size() + i);
            layoutNodeLayoutState.addAll(getlastconstraintsdwuhwkw);
            getLastLookaheadConstraintsDWUhwKw.write(j, obj, layoutNodeLayoutState);
            return layoutNodeLayoutState;
        }
        if ((list instanceof LayoutNodeLayoutDelegate) && (list instanceof LayoutNodeCompanionErrorMeasurePolicy1)) {
            LayoutNodeCompanionErrorMeasurePolicy1 layoutNodeCompanionErrorMeasurePolicy1 = (LayoutNodeCompanionErrorMeasurePolicy1) list;
            if (!((setGloballyPositionedObservers) layoutNodeCompanionErrorMeasurePolicy1).IconCompatParcelizer) {
                LayoutNodeCompanionErrorMeasurePolicy1 layoutNodeCompanionErrorMeasurePolicy2 = layoutNodeCompanionErrorMeasurePolicy1.read(list.size() + i);
                getLastLookaheadConstraintsDWUhwKw.write(j, obj, layoutNodeCompanionErrorMeasurePolicy2);
                return layoutNodeCompanionErrorMeasurePolicy2;
            }
        }
        return list;
    }

    @Override // o.LayoutNodeUsageByParent
    public final void IconCompatParcelizer(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, obj);
        if (list instanceof LayoutNodeNoIntrinsicsMeasurePolicy) {
            objUnmodifiableList = ((LayoutNodeNoIntrinsicsMeasurePolicy) list).write();
        } else {
            if (IconCompatParcelizer.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof LayoutNodeLayoutDelegate) && (list instanceof LayoutNodeCompanionErrorMeasurePolicy1)) {
                setGloballyPositionedObservers setgloballypositionedobservers = (setGloballyPositionedObservers) ((LayoutNodeCompanionErrorMeasurePolicy1) list);
                if (setgloballypositionedobservers.IconCompatParcelizer) {
                    setgloballypositionedobservers.IconCompatParcelizer = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        getLastLookaheadConstraintsDWUhwKw.write(j, obj, objUnmodifiableList);
    }

    @Override // o.LayoutNodeUsageByParent
    public final void IconCompatParcelizer(long j, Object obj, Object obj2) {
        List list = (List) getLastLookaheadConstraintsDWUhwKw.read.MediaSessionCompatQueueItem(j, obj2);
        List listIconCompatParcelizer = IconCompatParcelizer(j, list.size(), obj);
        int size = listIconCompatParcelizer.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listIconCompatParcelizer.addAll(list);
        }
        if (size > 0) {
            list = listIconCompatParcelizer;
        }
        getLastLookaheadConstraintsDWUhwKw.write(j, obj, list);
    }

    @Override // o.LayoutNodeUsageByParent
    public final List RemoteActionCompatParcelizer(long j, Object obj) {
        return IconCompatParcelizer(j, 10, obj);
    }
}
