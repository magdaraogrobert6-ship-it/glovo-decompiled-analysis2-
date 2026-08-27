package o;

/* JADX INFO: loaded from: classes2.dex */
public enum accessgetComposeAccessibilityDelegatep implements syncAggregateChildKindSet {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    private final int number_;

    @Override // o.syncAggregateChildKindSet
    public int getNumber() {
        return this.number_;
    }

    accessgetComposeAccessibilityDelegatep(int i) {
        this.number_ = i;
    }
}
