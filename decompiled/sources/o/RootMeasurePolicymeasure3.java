package o;

/* JADX INFO: loaded from: classes4.dex */
public final class RootMeasurePolicymeasure3 extends setPlacementApproachInProgress {
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ RootMeasurePolicymeasure3(int i, Object obj) {
        this.write = i;
        this.serializer = obj;
    }

    @Override // o.setPlacementApproachInProgress
    public final void serializer(android.graphics.Typeface typeface, boolean z) {
        int i = this.write;
        Object obj = this.serializer;
        if (i == 0) {
            RootMeasurePolicy rootMeasurePolicy = (RootMeasurePolicy) obj;
            RulerScope rulerScope = rootMeasurePolicy.RatingCompat;
            rootMeasurePolicy.setText(rulerScope.addOnMultiWindowModeChangedListener ? rulerScope.addOnNewIntentListener : rootMeasurePolicy.getText());
            rootMeasurePolicy.requestLayout();
            rootMeasurePolicy.invalidate();
            return;
        }
        if (z) {
            return;
        }
        getApplyPausedNjRlDlw getapplypausednjrldlw = (getApplyPausedNjRlDlw) obj;
        getapplypausednjrldlw.RemoteActionCompatParcelizer = true;
        RulerScope rulerScope2 = (RulerScope) getapplypausednjrldlw.IconCompatParcelizer.get();
        if (rulerScope2 != null) {
            rulerScope2.RemoteActionCompatParcelizer();
            rulerScope2.invalidateSelf();
        }
    }

    @Override // o.setPlacementApproachInProgress
    public final void RemoteActionCompatParcelizer(int i) {
        if (this.write != 0) {
            getApplyPausedNjRlDlw getapplypausednjrldlw = (getApplyPausedNjRlDlw) this.serializer;
            getapplypausednjrldlw.RemoteActionCompatParcelizer = true;
            RulerScope rulerScope = (RulerScope) getapplypausednjrldlw.IconCompatParcelizer.get();
            if (rulerScope != null) {
                rulerScope.RemoteActionCompatParcelizer();
                rulerScope.invalidateSelf();
            }
        }
    }
}
