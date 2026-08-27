package o;

/* JADX INFO: loaded from: classes4.dex */
public final class UserNotRegisteredException extends getHostAppUserAgent {
    public byte[] IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public byte[] read;
    public ChatCryptoException serializer;

    @Override // o.getHostAppUserAgent, o.logErrordefault
    public final provideRequest RatingCompat() {
        extractTokenFromHeader extracttokenfromheader = new extractTokenFromHeader();
        extracttokenfromheader.write(new accessgetDeviceUtilsp(this.RemoteActionCompatParcelizer));
        extracttokenfromheader.write(new UrlBuilderKt(this.IconCompatParcelizer, 0));
        extracttokenfromheader.write(new UrlBuilderKt(this.read, 0));
        ChatCryptoException chatCryptoException = this.serializer;
        if (chatCryptoException != null) {
            byte[] bArrRemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(chatCryptoException.read);
            byte[] bArrRemoteActionCompatParcelizer2 = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(chatCryptoException.write);
            ChatCryptoException chatCryptoException2 = new ChatCryptoException();
            chatCryptoException2.read = bArrRemoteActionCompatParcelizer;
            chatCryptoException2.write = bArrRemoteActionCompatParcelizer2;
            extracttokenfromheader.write(chatCryptoException2);
        }
        DeliveryInfoCompanion deliveryInfoCompanion = new DeliveryInfoCompanion(extracttokenfromheader, false);
        deliveryInfoCompanion.serializer = -1;
        return deliveryInfoCompanion;
    }
}
