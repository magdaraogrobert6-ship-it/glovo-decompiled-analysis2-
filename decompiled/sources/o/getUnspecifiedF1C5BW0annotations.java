package o;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class getUnspecifiedF1C5BW0annotations {
    public int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public int read;
    public ByteBuffer write;

    public getUnspecifiedF1C5BW0annotations() {
        if (getIntentArrayWithConfiguredBackStacklambda4.IconCompatParcelizer == null) {
            getIntentArrayWithConfiguredBackStacklambda4.IconCompatParcelizer = new getIntentArrayWithConfiguredBackStacklambda4(2);
        }
    }

    public final int RemoteActionCompatParcelizer(int i) {
        if (i < this.IconCompatParcelizer) {
            return this.write.getShort(this.RemoteActionCompatParcelizer + i);
        }
        return 0;
    }
}
