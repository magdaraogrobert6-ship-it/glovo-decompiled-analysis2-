package o;

/* JADX INFO: loaded from: classes5.dex */
public class getVariantId extends getCartId {
    private static final getProductName serializer = new getProductName();

    @Override // o.getCartId
    public final getWireValue serializer() {
        return serializer;
    }

    @Override // o.getCartId
    public final String RemoteActionCompatParcelizer() {
        return "UserContextModule";
    }
}
