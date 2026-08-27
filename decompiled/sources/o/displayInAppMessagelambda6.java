package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class displayInAppMessagelambda6 extends displayInAppMessagelambda9 implements Serializable {
    @Override // o.displayInAppMessagelambda9
    public final long write(long j, long j2) {
        throw null;
    }

    @Override // o.displayInAppMessagelambda9
    public final int IconCompatParcelizer(int i) {
        return displayInAppMessagelambda9.serializer.IconCompatParcelizer(i);
    }

    @Override // o.displayInAppMessagelambda9
    public final long read() {
        return displayInAppMessagelambda9.serializer.read();
    }

    @Override // o.displayInAppMessagelambda9
    public final int serializer() {
        return displayInAppMessagelambda9.serializer.serializer();
    }

    @Override // o.displayInAppMessagelambda9
    public final double write() {
        return displayInAppMessagelambda9.serializer.write();
    }

    @Override // o.displayInAppMessagelambda9
    public final int RemoteActionCompatParcelizer(int i) {
        return displayInAppMessagelambda9.serializer.RemoteActionCompatParcelizer(i);
    }

    @Override // o.displayInAppMessagelambda9
    public final int RemoteActionCompatParcelizer(int i, int i2) {
        return displayInAppMessagelambda9.serializer.RemoteActionCompatParcelizer(i, i2);
    }
}
