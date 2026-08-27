package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class updateRootConstraintsBRTryo0 extends MeasuredSizeAwareModifierNode {
    public byte IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public String read;
    public String serializer;
    public boolean write;

    public final setDuringMeasureLayoutui read() {
        String str;
        String str2;
        if (this.IconCompatParcelizer == 3 && (str = this.read) != null && (str2 = this.serializer) != null) {
            return new setDuringMeasureLayoutui(this.RemoteActionCompatParcelizer, str, str2, this.write);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.IconCompatParcelizer & 1) == 0) {
            sb.append(" platform");
        }
        if (this.read == null) {
            sb.append(" version");
        }
        if (this.serializer == null) {
            sb.append(" buildVersion");
        }
        if ((this.IconCompatParcelizer & 2) == 0) {
            sb.append(" jailbroken");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
        return null;
    }
}
