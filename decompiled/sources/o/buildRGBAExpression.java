package o;

/* JADX INFO: loaded from: classes3.dex */
public final class buildRGBAExpression {
    public Boolean read;
    public final decode serializer;

    public final void IconCompatParcelizer() {
        synchronized (this) {
            Boolean bool = this.read;
            Boolean bool2 = Boolean.TRUE;
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{bool, bool2}, iWrite3)).booleanValue()) {
                return;
            }
            this.read = bool2;
            this.serializer.logEvent("ble_permission_granted", null);
        }
    }

    public final void read() {
        synchronized (this) {
            Boolean bool = this.read;
            Boolean bool2 = Boolean.FALSE;
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{bool, bool2}, iWrite3)).booleanValue()) {
                return;
            }
            this.read = bool2;
            this.serializer.logEvent("ble_permission_denied", null);
        }
    }

    public buildRGBAExpression(decode decodeVar) {
        decodeVar.getClass();
        this.serializer = decodeVar;
    }
}
