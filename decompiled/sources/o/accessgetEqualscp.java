package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetEqualscp extends accessgetF10cp {
    public byte[] IconCompatParcelizer;
    public accessgetBrowsercp RemoteActionCompatParcelizer;
    public String write;

    public final accessgetEightcp RemoteActionCompatParcelizer() {
        String strConcat = this.write == null ? " backendName" : "";
        if (this.RemoteActionCompatParcelizer == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new accessgetEightcp(this.write, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
        return null;
    }
}
