package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class measureAndLayout extends MeasurePassDelegateperformMeasureBlock1 {
    public String IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public byte read;
    public int serializer;
    public int write;

    public final getUncaughtExceptionHandlerui read() {
        String str;
        if (this.read == 7 && (str = this.IconCompatParcelizer) != null) {
            return new getUncaughtExceptionHandlerui(str, this.RemoteActionCompatParcelizer, this.write, this.serializer);
        }
        StringBuilder sb = new StringBuilder();
        if (this.IconCompatParcelizer == null) {
            sb.append(" processName");
        }
        if ((this.read & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.read & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.read & 4) == 0) {
            sb.append(" defaultProcess");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
        return null;
    }
}
