package o;

/* JADX INFO: loaded from: classes5.dex */
public class getQuantity extends getCartId {
    private static final OrderPlacedEvent read = new OrderPlacedEvent();

    @Override // o.getCartId
    public final getWireValue serializer() {
        return read;
    }

    @Override // o.getCartId
    public final String RemoteActionCompatParcelizer() {
        return "DrivingInsightsModule";
    }
}
