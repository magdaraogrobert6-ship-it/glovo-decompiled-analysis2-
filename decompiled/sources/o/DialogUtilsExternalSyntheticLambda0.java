package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DialogUtilsExternalSyntheticLambda0 {
    public static final ChatConfigurationDataStoreHelperImpl RemoteActionCompatParcelizer;
    public static final DeliveryInfoCompanion read;

    static {
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion();
        deliveryInfoCompanion.serializer = -1;
        read = deliveryInfoCompanion;
        ChatConfigurationDataStoreHelperImpl chatConfigurationDataStoreHelperImpl = new ChatConfigurationDataStoreHelperImpl();
        chatConfigurationDataStoreHelperImpl.IconCompatParcelizer = -1;
        RemoteActionCompatParcelizer = chatConfigurationDataStoreHelperImpl;
    }

    public static ChatConfigurationDataStoreHelperImpl serializer(extractTokenFromHeader extracttokenfromheader) {
        if (extracttokenfromheader.RemoteActionCompatParcelizer < 1) {
            return RemoteActionCompatParcelizer;
        }
        ChatConfigurationDataStoreHelperImpl chatConfigurationDataStoreHelperImpl = new ChatConfigurationDataStoreHelperImpl(extracttokenfromheader);
        chatConfigurationDataStoreHelperImpl.IconCompatParcelizer = -1;
        return chatConfigurationDataStoreHelperImpl;
    }

    public static DeliveryInfoCompanion write(extractTokenFromHeader extracttokenfromheader) {
        if (extracttokenfromheader.RemoteActionCompatParcelizer < 1) {
            return read;
        }
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader, 0);
        deliveryInfoCompanion.serializer = -1;
        return deliveryInfoCompanion;
    }
}
