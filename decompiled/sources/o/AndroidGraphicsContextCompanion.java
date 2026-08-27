package o;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidGraphicsContextCompanion implements unregisterComponentCallback {
    public int RemoteActionCompatParcelizer = -1;
    public final unregisterComponentCallback read;
    public final accessunregisterComponentCallback write;

    public final void RemoteActionCompatParcelizer() {
        this.write.RemoteActionCompatParcelizer((unregisterComponentCallback) this);
    }

    @Override // o.unregisterComponentCallback
    public final void RemoteActionCompatParcelizer(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.write.ResultReceiver;
        if (i != i2) {
            this.RemoteActionCompatParcelizer = i2;
            this.read.RemoteActionCompatParcelizer(obj);
        }
    }

    public AndroidGraphicsContextCompanion(accessunregisterComponentCallback accessunregistercomponentcallback, unregisterComponentCallback unregistercomponentcallback) {
        this.write = accessunregistercomponentcallback;
        this.read = unregistercomponentcallback;
    }
}
