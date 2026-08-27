package o;

/* JADX INFO: loaded from: classes.dex */
public final class getSmsOtpCode {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object read;

    public /* synthetic */ getSmsOtpCode(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.read = obj;
    }

    public final void RemoteActionCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        Object obj = this.read;
        if (i != 0) {
            ((BlockInnerShadowElement) obj).write++;
        } else {
            ((getPostalCode) obj).MediaSessionCompatQueueItem++;
        }
    }

    public final void read() {
        int i = this.IconCompatParcelizer;
        Object obj = this.read;
        if (i != 0) {
            ((BlockInnerShadowElement) obj).write--;
        } else {
            ((getPostalCode) obj).MediaSessionCompatQueueItem--;
        }
    }
}
