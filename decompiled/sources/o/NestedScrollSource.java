package o;

/* JADX INFO: loaded from: classes2.dex */
public final class NestedScrollSource implements DelegatingNode {
    public static final NestedScrollSource read = new NestedScrollSource();
    public final getSelfKindSetuiannotations write = new getSelfKindSetuiannotations(new NestedScrollSourceCompanion());

    public static boolean IconCompatParcelizer() {
        return ((Boolean) NestedScrollSourceCompanion.read.read()).booleanValue();
    }

    public static boolean read() {
        return ((Boolean) NestedScrollSourceCompanion.RemoteActionCompatParcelizer.read()).booleanValue();
    }

    @Override // o.DelegatingNode
    public final Object B_() {
        return (NestedScrollSourceCompanion) this.write.serializer;
    }
}
