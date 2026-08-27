package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
public final class RulerKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    public static final float mergeRulerValues(Placeable.PlacementScope placementScope, boolean z, Ruler[] rulerArr, float f) {
        float f2 = Float.NaN;
        for (Ruler ruler : rulerArr) {
            float fCurrent = placementScope.current(ruler, Float.NaN);
            if (Float.isNaN(f2)) {
                f2 = fCurrent;
            } else if (z == (fCurrent > f2)) {
                f2 = fCurrent;
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }
}
