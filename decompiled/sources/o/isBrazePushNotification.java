package o;

/* JADX INFO: loaded from: classes4.dex */
final class isBrazePushNotification implements Runnable {
    final /* synthetic */ onMessageReceived serializer;

    @Override // java.lang.Runnable
    public final void run() {
        onMessageReceived onmessagereceived = this.serializer;
        onmessagereceived.serializer.IconCompatParcelizer("Request timed out", new Object[0]);
        onmessagereceived.write();
    }

    public isBrazePushNotification(onMessageReceived onmessagereceived) {
        this.serializer = onmessagereceived;
    }
}
