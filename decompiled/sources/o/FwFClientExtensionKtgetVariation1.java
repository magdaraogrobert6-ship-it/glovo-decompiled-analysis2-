package o;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class FwFClientExtensionKtgetVariation1 implements useEvaluationsCache {
    public final Type RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ FwFClientExtensionKtgetVariation1(int i, Type type) {
        this.read = i;
        this.RemoteActionCompatParcelizer = type;
    }

    @Override // o.useEvaluationsCache
    public final Type RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.useEvaluationsCache
    public final Object write(writeSelffwf_client_release writeselffwf_client_release) {
        if (this.read != 0) {
            Timer timer = new Timer(writeselffwf_client_release);
            writeselffwf_client_release.IconCompatParcelizer(new FwFClientExtensionKtcreate2(timer, 1));
            return timer;
        }
        Timer timer2 = new Timer(writeselffwf_client_release);
        writeselffwf_client_release.IconCompatParcelizer(new FwFClientExtensionKtcreate2(timer2, 0));
        return timer2;
    }
}
