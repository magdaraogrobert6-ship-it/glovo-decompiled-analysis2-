package o;

/* JADX INFO: loaded from: classes3.dex */
final class onNewToken implements BrazeAmazonDeviceMessagingReceiver {
    final /* synthetic */ onMessageReceived IconCompatParcelizer;
    private BrazeFirebaseMessagingService serializer = null;

    public onNewToken(onMessageReceived onmessagereceived) {
        this.IconCompatParcelizer = onmessagereceived;
    }

    public final void read(BrazeFirebaseMessagingService brazeFirebaseMessagingService) {
        BrazeFirebaseMessagingService brazeFirebaseMessagingService2 = this.serializer;
        if (brazeFirebaseMessagingService2 == null || !brazeFirebaseMessagingService2.equals(brazeFirebaseMessagingService)) {
            onMessageReceived onmessagereceived = this.IconCompatParcelizer;
            r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmmSerializer = onMessageReceived.serializer(onmessagereceived, brazeFirebaseMessagingService);
            if (r8lambdaoa7yoh60jzy3mr0pmwypzah5bmmSerializer != null) {
                onMessageReceived.write(onmessagereceived, r8lambdaoa7yoh60jzy3mr0pmwypzah5bmmSerializer);
            }
            this.serializer = brazeFirebaseMessagingService;
        }
    }
}
