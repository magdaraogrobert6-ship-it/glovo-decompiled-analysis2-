package o;

/* JADX INFO: loaded from: classes2.dex */
public enum accessgetOnCommitAffectingLayercp {
    ASCENDING(1),
    DESCENDING(-1);

    private final int comparisonModifier;

    public int getComparisonModifier() {
        return this.comparisonModifier;
    }

    accessgetOnCommitAffectingLayercp(int i) {
        this.comparisonModifier = i;
    }
}
