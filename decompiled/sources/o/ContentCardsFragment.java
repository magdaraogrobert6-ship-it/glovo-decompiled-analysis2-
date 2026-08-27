package o;

import fwfd.com.fwfsdk.constant.FWFConstants;
import io.socket.parser.DecodingException;
import io.socket.parser.IOParser$Decoder;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentCardsFragment implements getContentCardsViewBindingHandler {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM serializer;

    public /* synthetic */ ContentCardsFragment(r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM r8lambdach50szxgsvgzrle_f5bmf0a81gm, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = r8lambdach50szxgsvgzrle_f5bmf0a81gm;
    }

    @Override // o.getContentCardsViewBindingHandler
    public final void RemoteActionCompatParcelizer(Object... objArr) {
        int i = this.RemoteActionCompatParcelizer;
        r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM r8lambdach50szxgsvgzrle_f5bmf0a81gm = this.serializer;
        if (i == 0) {
            IOParser$Decoder iOParser$Decoder = r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaDescriptionCompat;
            Object obj = objArr[0];
            try {
                if (obj instanceof String) {
                    iOParser$Decoder.read((String) obj);
                } else if (obj instanceof byte[]) {
                    iOParser$Decoder.write((byte[]) obj);
                }
                return;
            } catch (DecodingException e) {
                r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM.serializer.fine("error while decoding the packet: " + e.getMessage());
                return;
            }
        }
        if (i == 1) {
            r8lambdach50szxgsvgzrle_f5bmf0a81gm.write("transport", objArr);
            return;
        }
        if (i == 2) {
            Exception exc = (Exception) objArr[0];
            r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM.serializer.log(Level.FINE, FWFConstants.EXPLANATION_TYPE_ERROR, (Throwable) exc);
            r8lambdach50szxgsvgzrle_f5bmf0a81gm.write(FWFConstants.EXPLANATION_TYPE_ERROR, exc);
            return;
        }
        String str = (String) objArr[0];
        r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM.serializer.fine("onclose");
        r8lambdach50szxgsvgzrle_f5bmf0a81gm.write();
        r8lambdach50szxgsvgzrle_f5bmf0a81gm.RemoteActionCompatParcelizer.serializer = 0;
        r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaSessionCompatResultReceiverWrapper = r8lambdaQOeiRMDgQ8InorYSjl29WHDetbc.CLOSED;
        r8lambdach50szxgsvgzrle_f5bmf0a81gm.write("close", str);
        if (!r8lambdach50szxgsvgzrle_f5bmf0a81gm.read || r8lambdach50szxgsvgzrle_f5bmf0a81gm.PlaybackStateCompat) {
            return;
        }
        r8lambdach50szxgsvgzrle_f5bmf0a81gm.serializer();
    }
}
