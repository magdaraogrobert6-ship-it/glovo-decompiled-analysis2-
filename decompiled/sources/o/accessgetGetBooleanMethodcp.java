package o;

/* JADX INFO: loaded from: classes2.dex */
public enum accessgetGetBooleanMethodcp implements syncAggregateChildKindSet {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);

    private final int number_;

    @Override // o.syncAggregateChildKindSet
    public int getNumber() {
        return this.number_;
    }

    accessgetGetBooleanMethodcp(int i) {
        this.number_ = i;
    }
}
