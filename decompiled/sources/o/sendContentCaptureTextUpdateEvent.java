package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sendContentCaptureTextUpdateEvent implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ sendContentCaptureAppearEvents RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ sendContentCaptureTextUpdateEvent(sendContentCaptureAppearEvents sendcontentcaptureappearevents, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = sendcontentcaptureappearevents;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        sendContentCaptureAppearEvents sendcontentcaptureappearevents = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            sendcontentcaptureappearevents.ComponentActivity();
            return createfromparcel;
        }
        sendcontentcaptureappearevents.ComponentActivity();
        return createfromparcel;
    }
}
