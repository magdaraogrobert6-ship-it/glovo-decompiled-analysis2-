package o;

import android.os.Message;
import com.sentiance.sdk.services.ServiceManager;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r8lambda8wKuPcR_AXiuhWt7hIFuyEzjeWw implements writeData {
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ r8lambda8wKuPcR_AXiuhWt7hIFuyEzjeWw(int i, Object obj) {
        this.serializer = i;
        this.read = obj;
    }

    @Override // o.writeData
    public final void handleMessage(Message message) {
        int i = this.serializer;
        Object obj = this.read;
        if (i != 0) {
            ServiceManager.RemoteActionCompatParcelizer((ServiceManager) obj, message);
        } else {
            r8lambdaNFajLtzW3BPOO80Rlt2TGeVAl4.read((r8lambdaNFajLtzW3BPOO80Rlt2TGeVAl4) obj, message);
        }
    }
}
