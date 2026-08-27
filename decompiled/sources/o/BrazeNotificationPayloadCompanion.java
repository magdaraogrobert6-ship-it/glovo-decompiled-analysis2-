package o;

/* JADX INFO: loaded from: classes3.dex */
final class BrazeNotificationPayloadCompanion implements Runnable {
    final /* synthetic */ r8lambda7xdj8Hz3fhe1sOrYgyl0CHrOnM serializer;
    final /* synthetic */ r8lambdaZQ8uyXmhlaXDpUbPCryPXeoi9E write;

    @Override // java.lang.Runnable
    public final void run() {
        ((populateNotificationBuilderlambda1) this.write).read(this.serializer.MediaMetadataCompat);
    }

    public BrazeNotificationPayloadCompanion(r8lambda7xdj8Hz3fhe1sOrYgyl0CHrOnM r8lambda7xdj8hz3fhe1sorygyl0chronm, r8lambdaZQ8uyXmhlaXDpUbPCryPXeoi9E r8lambdazq8uyxmhlaxdpubpcrypxeoi9e) {
        this.serializer = r8lambda7xdj8hz3fhe1sorygyl0chronm;
        this.write = r8lambdazq8uyxmhlaxdpubpcrypxeoi9e;
    }
}
