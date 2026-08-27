package o;

import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;

/* JADX INFO: loaded from: classes2.dex */
public final class updatePlacedUnderMotionFrameOfReference implements AbstractComposeViewExternalSyntheticLambda0 {
    public volatile AbstractComposeViewExternalSyntheticLambda0 RemoteActionCompatParcelizer;
    public AccessibilityIteratorsAbstractTextSegmentIterator read;
    public static final getAlignmentLinesMap write = new getAlignmentLinesMap(23);
    public static final invalidateAlignmentLinesFromPositionChange IconCompatParcelizer = new invalidateAlignmentLinesFromPositionChange(1);

    public final void IconCompatParcelizer(AccessibilityIteratorsAbstractTextSegmentIterator accessibilityIteratorsAbstractTextSegmentIterator) {
        AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0;
        AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda1;
        AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda2 = this.RemoteActionCompatParcelizer;
        invalidateAlignmentLinesFromPositionChange invalidatealignmentlinesfrompositionchange = IconCompatParcelizer;
        if (abstractComposeViewExternalSyntheticLambda2 != invalidatealignmentlinesfrompositionchange) {
            accessibilityIteratorsAbstractTextSegmentIterator.RemoteActionCompatParcelizer(abstractComposeViewExternalSyntheticLambda2);
            return;
        }
        synchronized (this) {
            abstractComposeViewExternalSyntheticLambda0 = this.RemoteActionCompatParcelizer;
            if (abstractComposeViewExternalSyntheticLambda0 != invalidatealignmentlinesfrompositionchange) {
                abstractComposeViewExternalSyntheticLambda1 = abstractComposeViewExternalSyntheticLambda0;
            } else {
                this.read = new JankStatsFrameTracker$$ExternalSyntheticLambda3(this.read, 5, accessibilityIteratorsAbstractTextSegmentIterator);
                abstractComposeViewExternalSyntheticLambda1 = null;
            }
        }
        if (abstractComposeViewExternalSyntheticLambda1 != null) {
            accessibilityIteratorsAbstractTextSegmentIterator.RemoteActionCompatParcelizer(abstractComposeViewExternalSyntheticLambda0);
        }
    }

    @Override // o.AbstractComposeViewExternalSyntheticLambda0
    public final Object write() {
        return this.RemoteActionCompatParcelizer.write();
    }

    public updatePlacedUnderMotionFrameOfReference(getAlignmentLinesMap getalignmentlinesmap, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0) {
        this.read = getalignmentlinesmap;
        this.RemoteActionCompatParcelizer = abstractComposeViewExternalSyntheticLambda0;
    }
}
