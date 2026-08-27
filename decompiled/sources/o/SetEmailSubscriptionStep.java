package o;

/* JADX INFO: loaded from: classes4.dex */
public final class SetEmailSubscriptionStep implements RemoveFromSubscriptionGroupStep {
    public final Object serializer;

    @Override // o.RemoveFromSubscriptionGroupStep
    public final Object RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    public SetEmailSubscriptionStep(Object obj) {
        this.serializer = obj;
    }
}
