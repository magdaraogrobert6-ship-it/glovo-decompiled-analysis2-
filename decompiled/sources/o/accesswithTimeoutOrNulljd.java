package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accesswithTimeoutOrNulljd implements DelegatingNode {
    public static final accesswithTimeoutOrNulljd serializer = new accesswithTimeoutOrNulljd();
    public final getSelfKindSetuiannotations RemoteActionCompatParcelizer = new getSelfKindSetuiannotations(new withTimeoutsuspendImpl());

    public static boolean read() {
        return ((Boolean) withTimeoutsuspendImpl.RemoteActionCompatParcelizer.read()).booleanValue();
    }

    @Override // o.DelegatingNode
    public final Object B_() {
        return (withTimeoutsuspendImpl) this.RemoteActionCompatParcelizer.serializer;
    }
}
