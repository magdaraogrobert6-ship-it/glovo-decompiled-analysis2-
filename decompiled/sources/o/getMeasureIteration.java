package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class getMeasureIteration extends setPlacedByParentui {
    public long IconCompatParcelizer;
    public String MediaMetadataCompat;
    public String RemoteActionCompatParcelizer;
    public byte read;
    public int serializer;
    public long write;

    public final getHasPendingOnPositionedCallbacks serializer() {
        String str;
        if (this.read == 7 && (str = this.MediaMetadataCompat) != null) {
            return new getHasPendingOnPositionedCallbacks(this.IconCompatParcelizer, str, this.RemoteActionCompatParcelizer, this.write, this.serializer);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.read & 1) == 0) {
            sb.append(" pc");
        }
        if (this.MediaMetadataCompat == null) {
            sb.append(" symbol");
        }
        if ((this.read & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.read & 4) == 0) {
            sb.append(" importance");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
        return null;
    }
}
