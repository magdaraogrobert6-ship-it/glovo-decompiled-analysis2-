package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaAdNMoUKA2dYkpy5uQLS8giqo implements Runnable {
    public final /* synthetic */ r8lambdasOoFVAVrS_IfmvnUsbXqKnKCa0 read;
    public final /* synthetic */ int write;

    public /* synthetic */ r8lambdaAdNMoUKA2dYkpy5uQLS8giqo(r8lambdasOoFVAVrS_IfmvnUsbXqKnKCa0 r8lambdasoofvavrs_ifmvnusbxqknkca0, int i) {
        this.write = i;
        this.read = r8lambdasoofvavrs_ifmvnusbxqknkca0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        r8lambdasOoFVAVrS_IfmvnUsbXqKnKCa0 r8lambdasoofvavrs_ifmvnusbxqknkca0 = this.read;
        if (i != 0) {
            r8lambdasoofvavrs_ifmvnusbxqknkca0.serializer();
        } else {
            r8lambdasoofvavrs_ifmvnusbxqknkca0.write();
        }
    }
}
