package o;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaHwO05NdmjcLLA4pGTycR0dyf3yA extends r8lambdaH0T6quLH6fi2CuKlbOttZKYSBc {
    public boolean RemoteActionCompatParcelizer;

    @Override // o.r8lambdaH0T6quLH6fi2CuKlbOttZKYSBc
    public final File read() {
        if (this.RemoteActionCompatParcelizer) {
            return null;
        }
        this.RemoteActionCompatParcelizer = true;
        return this.MediaDescriptionCompat;
    }

    public r8lambdaHwO05NdmjcLLA4pGTycR0dyf3yA(File file) {
        super(file);
    }
}
