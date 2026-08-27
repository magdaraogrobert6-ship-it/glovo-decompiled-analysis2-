package kotlinx.coroutines;

import coil3.ExtrasKt;
import fwfd.com.fwfsdk.constant.FWFConstants;
import io.grpc.LoadBalancer$Helper;
import io.socket.engineio.client.EngineIOException;
import io.socket.engineio.client.transports.WebSocket$1;
import java.io.Serializable;
import java.util.TreeMap;
import java.util.logging.Logger;
import o.ContentCardsFragmentcontentCardsUpdate5;
import o.RequestBuilder;
import o.ViewRootForInspectorDefaultImpls;
import o.getAttribute;
import o.onRefresh;
import o.setContentCardsUpdatedSubscriber;
import o.swapRecyclerViewAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class ResumeUndispatchedRunnable implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object read;
    public final Object write;

    public /* synthetic */ ResumeUndispatchedRunnable(WebSocket$1 webSocket$1, Serializable serializable, int i) {
        this.IconCompatParcelizer = i;
        this.read = webSocket$1;
        this.write = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        Object obj = this.read;
        Object obj2 = this.write;
        if (i == 0) {
            ((CancellableContinuationImpl) obj).read((CoroutineDispatcher) obj2);
            return;
        }
        if (i == 1) {
            setContentCardsUpdatedSubscriber setcontentcardsupdatedsubscriber = ((WebSocket$1) obj).read;
            setcontentcardsupdatedsubscriber.write("responseHeaders", (TreeMap) obj2);
            setcontentcardsupdatedsubscriber.RatingCompat = onRefresh.OPEN;
            setcontentcardsupdatedsubscriber.MediaSessionCompatToken = true;
            setcontentcardsupdatedsubscriber.write("open", new Object[0]);
            return;
        }
        if (i == 2) {
            setContentCardsUpdatedSubscriber setcontentcardsupdatedsubscriber2 = ((WebSocket$1) obj).read;
            Logger logger = setContentCardsUpdatedSubscriber.ParcelableVolumeInfo;
            setcontentcardsupdatedsubscriber2.write("packet", swapRecyclerViewAdapter.write((String) obj2));
        } else {
            if (i == 3) {
                setContentCardsUpdatedSubscriber setcontentcardsupdatedsubscriber3 = ((WebSocket$1) obj).read;
                byte[] bArrMediaDescriptionCompat = ((RequestBuilder) obj2).MediaDescriptionCompat();
                Logger logger2 = setContentCardsUpdatedSubscriber.ParcelableVolumeInfo;
                ViewRootForInspectorDefaultImpls viewRootForInspectorDefaultImpls = swapRecyclerViewAdapter.read;
                setcontentcardsupdatedsubscriber3.write("packet", new ContentCardsFragmentcontentCardsUpdate5("message", bArrMediaDescriptionCompat));
                return;
            }
            if (i != 4) {
                LoadBalancer$Helper.intercepted((getAttribute) obj2).resumeWith(ExtrasKt.IconCompatParcelizer((Throwable) obj));
                return;
            }
            setContentCardsUpdatedSubscriber setcontentcardsupdatedsubscriber4 = ((WebSocket$1) obj).read;
            Logger logger3 = setContentCardsUpdatedSubscriber.ParcelableVolumeInfo;
            setcontentcardsupdatedsubscriber4.write(FWFConstants.EXPLANATION_TYPE_ERROR, new EngineIOException("websocket error", (Exception) obj2));
        }
    }

    public /* synthetic */ ResumeUndispatchedRunnable(Object obj, int i, Object obj2) {
        this.IconCompatParcelizer = i;
        this.write = obj;
        this.read = obj2;
    }
}
