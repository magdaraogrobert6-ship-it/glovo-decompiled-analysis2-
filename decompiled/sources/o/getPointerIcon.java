package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getPointerIcon implements DelegatingNode {
    public static final getPointerIcon serializer = new getPointerIcon();
    public final getSelfKindSetuiannotations read = new getSelfKindSetuiannotations(new AwaitPointerEventScope());

    public static boolean read() {
        return ((Boolean) AwaitPointerEventScope.serializer.read()).booleanValue();
    }

    @Override // o.DelegatingNode
    public final Object B_() {
        return (AwaitPointerEventScope) this.read.serializer;
    }
}
