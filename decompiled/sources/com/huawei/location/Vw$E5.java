package com.huawei.location;

import android.util.Log;
import com.huawei.riemann.location.SdmLocationAlgoWrapper;
import fwfd.com.fwfsdk.constant.FWFConstants;
import io.socket.client.SocketIOException;
import io.socket.engineio.client.Socket$2;
import o.contentCardsUpdate;
import o.contentCardsUpdatelambda0;
import o.getCustomContentCardsViewBindingHandler;
import o.getViewRoot;
import o.r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM;
import o.r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw;

/* JADX INFO: loaded from: classes2.dex */
public final class Vw$E5 implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final Object read;
    public final long serializer;
    public final /* synthetic */ Object write;

    public Vw$E5(getViewRoot getviewroot, long j, byte[] bArr) {
        this.write = getviewroot;
        this.serializer = j;
        this.read = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        Object obj2 = this.read;
        long j = this.serializer;
        if (i != 0) {
            r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM.serializer.fine(String.format("connect attempt timed out after %d", Long.valueOf(j)));
            ((contentCardsUpdate) obj2).IconCompatParcelizer();
            getCustomContentCardsViewBindingHandler getcustomcontentcardsviewbindinghandler = (getCustomContentCardsViewBindingHandler) obj;
            getcustomcontentcardsviewbindinghandler.getClass();
            r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new Socket$2(getcustomcontentcardsviewbindinghandler, 4));
            getcustomcontentcardsviewbindinghandler.write(FWFConstants.EXPLANATION_TYPE_ERROR, new SocketIOException("timeout"));
            return;
        }
        SdmLocationAlgoWrapper sdmLocationAlgoWrapper = ((getViewRoot) obj).MediaDescriptionCompat;
        if (sdmLocationAlgoWrapper == null || !sdmLocationAlgoWrapper.serializer) {
            Log.e("SdmLocationManager", "wp is null");
        } else {
            sdmLocationAlgoWrapper.sdmUpdateTileById(j, (byte[]) obj2);
        }
    }

    public Vw$E5(long j, contentCardsUpdate contentcardsupdate, contentCardsUpdatelambda0 contentcardsupdatelambda0) {
        this.serializer = j;
        this.read = contentcardsupdate;
        this.write = contentcardsupdatelambda0;
    }
}
