package o;

import io.socket.emitter.Emitter;
import io.socket.engineio.client.Socket$2;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class networkUnavailablelambda0 extends Emitter {
    public static final java.util.logging.Logger write = java.util.logging.Logger.getLogger(networkUnavailablelambda0.class.getName());
    public final r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM IconCompatParcelizer;
    public final ConcurrentLinkedQueue MediaBrowserCompatMediaItem;
    public contentCardsUpdatelambda1 MediaDescriptionCompat;
    public final ConcurrentLinkedQueue MediaMetadataCompat;
    public final ConcurrentLinkedQueue MediaSessionCompatQueueItem;
    public final ConcurrentLinkedQueue RatingCompat;
    public volatile boolean RemoteActionCompatParcelizer;
    public final ConcurrentHashMap read;
    public final String serializer;

    public networkUnavailablelambda0(r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM r8lambdach50szxgsvgzrle_f5bmf0a81gm, String str) {
        super(0);
        this.read = new ConcurrentHashMap();
        this.RatingCompat = new ConcurrentLinkedQueue();
        this.MediaSessionCompatQueueItem = new ConcurrentLinkedQueue();
        this.MediaMetadataCompat = new ConcurrentLinkedQueue();
        this.MediaBrowserCompatMediaItem = new ConcurrentLinkedQueue();
        this.IconCompatParcelizer = r8lambdach50szxgsvgzrle_f5bmf0a81gm;
        this.serializer = str;
    }

    public final void read() {
        this.RemoteActionCompatParcelizer = true;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.MediaSessionCompatQueueItem;
        ConcurrentLinkedQueue concurrentLinkedQueue2 = this.RatingCompat;
        while (true) {
            List list = (List) concurrentLinkedQueue2.poll();
            if (list == null) {
                break;
            } else {
                write((String) list.get(0), list.toArray());
            }
        }
        concurrentLinkedQueue2.clear();
        while (true) {
            r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ r8lambdaa1ganccjs3o2sewhmv3kuv99jq = (r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ) concurrentLinkedQueue.poll();
            if (r8lambdaa1ganccjs3o2sewhmv3kuv99jq == null) {
                concurrentLinkedQueue.clear();
                write("connect", new Object[0]);
                return;
            }
            RemoteActionCompatParcelizer(r8lambdaa1ganccjs3o2sewhmv3kuv99jq);
        }
    }

    static {
        ViewRootForInspectorDefaultImpls viewRootForInspectorDefaultImpls = new ViewRootForInspectorDefaultImpls();
        viewRootForInspectorDefaultImpls.put("connect", 1);
        viewRootForInspectorDefaultImpls.put("connect_error", 1);
        viewRootForInspectorDefaultImpls.put("disconnect", 1);
        viewRootForInspectorDefaultImpls.put("disconnecting", 1);
        viewRootForInspectorDefaultImpls.put("newListener", 1);
        viewRootForInspectorDefaultImpls.put("removeListener", 1);
    }

    public final void IconCompatParcelizer(String str) {
        java.util.logging.Logger logger = write;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("close (" + str + ")");
        }
        this.RemoteActionCompatParcelizer = false;
        write("disconnect", str);
        ConcurrentHashMap concurrentHashMap = this.read;
        for (getContentCardsRecyclerView getcontentcardsrecyclerview : concurrentHashMap.values()) {
        }
        concurrentHashMap.clear();
    }

    public static Object[] RemoteActionCompatParcelizer(JSONArray jSONArray) {
        Object obj;
        int length = jSONArray.length();
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            Object obj2 = null;
            try {
                obj = jSONArray.get(i);
            } catch (JSONException e) {
                write.log(Level.WARNING, "An error occured while retrieving data from JSONArray", (Throwable) e);
                obj = null;
            }
            if (!JSONObject.NULL.equals(obj)) {
                obj2 = obj;
            }
            objArr[i] = obj2;
        }
        return objArr;
    }

    public final void write() {
        contentCardsUpdatelambda1 contentcardsupdatelambda1 = this.MediaDescriptionCompat;
        if (contentcardsupdatelambda1 != null) {
            Iterator<E> it = contentcardsupdatelambda1.iterator();
            while (it.hasNext()) {
                ((attachSwipeHelperCallback) it.next()).IconCompatParcelizer();
            }
            this.MediaDescriptionCompat = null;
        }
        r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM r8lambdach50szxgsvgzrle_f5bmf0a81gm = this.IconCompatParcelizer;
        synchronized (r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaSessionCompatQueueItem) {
            Iterator it2 = r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaSessionCompatQueueItem.values().iterator();
            while (it2.hasNext()) {
                if (((networkUnavailablelambda0) it2.next()).MediaDescriptionCompat != null) {
                    r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM.serializer.fine("socket is still active, skipping close");
                    return;
                }
            }
            r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM.serializer.fine("disconnect");
            r8lambdach50szxgsvgzrle_f5bmf0a81gm.PlaybackStateCompat = true;
            r8lambdach50szxgsvgzrle_f5bmf0a81gm.PlaybackStateCompatCustomAction = false;
            if (r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaSessionCompatResultReceiverWrapper != r8lambdaQOeiRMDgQ8InorYSjl29WHDetbc.OPEN) {
                r8lambdach50szxgsvgzrle_f5bmf0a81gm.write();
            }
            r8lambdach50szxgsvgzrle_f5bmf0a81gm.RemoteActionCompatParcelizer.serializer = 0;
            r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaSessionCompatResultReceiverWrapper = r8lambdaQOeiRMDgQ8InorYSjl29WHDetbc.CLOSED;
            contentCardsUpdatelambda0 contentcardsupdatelambda0 = r8lambdach50szxgsvgzrle_f5bmf0a81gm.MediaMetadataCompat;
            if (contentcardsupdatelambda0 != null) {
                r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new Socket$2(contentcardsupdatelambda0, 4));
            }
        }
    }

    public final void RemoteActionCompatParcelizer(r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ r8lambdaa1ganccjs3o2sewhmv3kuv99jq) {
        if (r8lambdaa1ganccjs3o2sewhmv3kuv99jq.read == 2) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.MediaBrowserCompatMediaItem;
            if (!concurrentLinkedQueue.isEmpty()) {
                Object[] objArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((JSONArray) r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer);
                Iterator it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    ((getContentCardsViewBindingHandler) it.next()).RemoteActionCompatParcelizer(objArrRemoteActionCompatParcelizer);
                }
            }
        }
        r8lambdaa1ganccjs3o2sewhmv3kuv99jq.write = this.serializer;
        this.IconCompatParcelizer.write(r8lambdaa1ganccjs3o2sewhmv3kuv99jq);
    }
}
