package o;

import com.huawei.hmf.tasks.a.d$a;
import fwfd.com.fwfsdk.constant.FWFConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.contentCardsUpdatelambda1;
import o.getContentCardsRecyclerView;
import o.getContentCardsViewBindingHandler;
import o.networkUnavailablelambda0;
import o.r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ;
import o.r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class contentCardsUpdatelambda1 extends LinkedList {
    public final /* synthetic */ networkUnavailablelambda0 serializer;

    public contentCardsUpdatelambda1(networkUnavailablelambda0 networkunavailablelambda0, r8lambdaCh50SzXGsvGzrLe_F5BmF0A81gM r8lambdach50szxgsvgzrle_f5bmf0a81gm) {
        this.serializer = networkunavailablelambda0;
        final int i = 0;
        getContentCardsViewBindingHandler getcontentcardsviewbindinghandler = new getContentCardsViewBindingHandler(this) { // from class: io.socket.client.Socket$2$1
            public final /* synthetic */ contentCardsUpdatelambda1 IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.getContentCardsViewBindingHandler
            public final void RemoteActionCompatParcelizer(Object... objArr) {
                int i2 = i;
                if (i2 == 0) {
                    networkUnavailablelambda0 networkunavailablelambda1 = this.IconCompatParcelizer.serializer;
                    networkUnavailablelambda0.write.fine("transport is open - connecting");
                    networkunavailablelambda1.RemoteActionCompatParcelizer(new r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ(0));
                    return;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (this.IconCompatParcelizer.serializer.RemoteActionCompatParcelizer) {
                            return;
                        }
                        this.IconCompatParcelizer.serializer.write("connect_error", objArr[0]);
                        return;
                    } else {
                        networkUnavailablelambda0 networkunavailablelambda2 = this.IconCompatParcelizer.serializer;
                        String str = objArr.length > 0 ? (String) objArr[0] : null;
                        Logger logger = networkUnavailablelambda0.write;
                        networkunavailablelambda2.IconCompatParcelizer(str);
                    }
                }
                networkUnavailablelambda0 networkunavailablelambda3 = this.IconCompatParcelizer.serializer;
                r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ r8lambdaa1ganccjs3o2sewhmv3kuv99jq = (r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ) objArr[0];
                if (networkunavailablelambda3.serializer.equals(r8lambdaa1ganccjs3o2sewhmv3kuv99jq.write)) {
                    switch (r8lambdaa1ganccjs3o2sewhmv3kuv99jq.read) {
                        case 0:
                            Object obj = r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer;
                            if ((obj instanceof JSONObject) && ((JSONObject) obj).has("sid")) {
                                try {
                                    ((JSONObject) r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer).getString("sid");
                                    networkunavailablelambda3.read();
                                } catch (JSONException unused) {
                                    return;
                                }
                            } else {
                                networkunavailablelambda3.write("connect_error", new SocketIOException("It seems you are trying to reach a Socket.IO server in v2.x with a v3.x client, which is not possible"));
                            }
                            break;
                        case 1:
                            Logger logger2 = networkUnavailablelambda0.write;
                            if (logger2.isLoggable(Level.FINE)) {
                                logger2.fine("server disconnect (" + networkunavailablelambda3.serializer + ")");
                            }
                            networkunavailablelambda3.write();
                            networkunavailablelambda3.IconCompatParcelizer("io server disconnect");
                            break;
                        case 2:
                        case 5:
                            ArrayList arrayList = new ArrayList(Arrays.asList(networkUnavailablelambda0.RemoteActionCompatParcelizer((JSONArray) r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer)));
                            Logger logger3 = networkUnavailablelambda0.write;
                            if (logger3.isLoggable(Level.FINE)) {
                                logger3.fine(String.format("emitting event %s", arrayList));
                            }
                            if (r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer >= 0) {
                                logger3.fine("attaching ack callback to event");
                                arrayList.add(new getContentCardsRecyclerView(new boolean[]{false}, r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer, networkunavailablelambda3));
                            }
                            if (!networkunavailablelambda3.RemoteActionCompatParcelizer) {
                                networkunavailablelambda3.RatingCompat.add(arrayList);
                                break;
                            } else if (!arrayList.isEmpty()) {
                                if (!networkunavailablelambda3.MediaMetadataCompat.isEmpty()) {
                                    Object[] array = arrayList.toArray();
                                    Iterator it = networkunavailablelambda3.MediaMetadataCompat.iterator();
                                    while (it.hasNext()) {
                                        ((getContentCardsViewBindingHandler) it.next()).RemoteActionCompatParcelizer(array);
                                    }
                                }
                                networkunavailablelambda3.write(arrayList.remove(0).toString(), arrayList.toArray());
                                break;
                            }
                            break;
                        case 3:
                        case 6:
                            Logger logger4 = networkUnavailablelambda0.write;
                            getContentCardsRecyclerView getcontentcardsrecyclerview = (getContentCardsRecyclerView) networkunavailablelambda3.read.remove(Integer.valueOf(r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer));
                            if (getcontentcardsrecyclerview != null) {
                                if (logger4.isLoggable(Level.FINE)) {
                                    logger4.fine(String.format("calling ack %s with %s", Integer.valueOf(r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer), r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer));
                                }
                                r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a(getcontentcardsrecyclerview, 19, networkUnavailablelambda0.RemoteActionCompatParcelizer((JSONArray) r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer)));
                            } else if (logger4.isLoggable(Level.FINE)) {
                                logger4.fine("bad ack " + r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer);
                            }
                            break;
                        case 4:
                            networkunavailablelambda3.write();
                            networkunavailablelambda3.write("connect_error", r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer);
                            break;
                    }
                }
            }
        };
        r8lambdach50szxgsvgzrle_f5bmf0a81gm.read("open", getcontentcardsviewbindinghandler);
        add(new contentCardsUpdate(r8lambdach50szxgsvgzrle_f5bmf0a81gm, "open", getcontentcardsviewbindinghandler));
        final int i2 = 1;
        getContentCardsViewBindingHandler getcontentcardsviewbindinghandler2 = new getContentCardsViewBindingHandler(this) { // from class: io.socket.client.Socket$2$1
            public final /* synthetic */ contentCardsUpdatelambda1 IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.getContentCardsViewBindingHandler
            public final void RemoteActionCompatParcelizer(Object... objArr) {
                int i3 = i2;
                if (i3 == 0) {
                    networkUnavailablelambda0 networkunavailablelambda1 = this.IconCompatParcelizer.serializer;
                    networkUnavailablelambda0.write.fine("transport is open - connecting");
                    networkunavailablelambda1.RemoteActionCompatParcelizer(new r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ(0));
                    return;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (this.IconCompatParcelizer.serializer.RemoteActionCompatParcelizer) {
                            return;
                        }
                        this.IconCompatParcelizer.serializer.write("connect_error", objArr[0]);
                        return;
                    } else {
                        networkUnavailablelambda0 networkunavailablelambda2 = this.IconCompatParcelizer.serializer;
                        String str = objArr.length > 0 ? (String) objArr[0] : null;
                        Logger logger = networkUnavailablelambda0.write;
                        networkunavailablelambda2.IconCompatParcelizer(str);
                    }
                }
                networkUnavailablelambda0 networkunavailablelambda3 = this.IconCompatParcelizer.serializer;
                r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ r8lambdaa1ganccjs3o2sewhmv3kuv99jq = (r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ) objArr[0];
                if (networkunavailablelambda3.serializer.equals(r8lambdaa1ganccjs3o2sewhmv3kuv99jq.write)) {
                    switch (r8lambdaa1ganccjs3o2sewhmv3kuv99jq.read) {
                        case 0:
                            Object obj = r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer;
                            if ((obj instanceof JSONObject) && ((JSONObject) obj).has("sid")) {
                                try {
                                    ((JSONObject) r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer).getString("sid");
                                    networkunavailablelambda3.read();
                                } catch (JSONException unused) {
                                    return;
                                }
                            } else {
                                networkunavailablelambda3.write("connect_error", new SocketIOException("It seems you are trying to reach a Socket.IO server in v2.x with a v3.x client, which is not possible"));
                            }
                            break;
                        case 1:
                            Logger logger2 = networkUnavailablelambda0.write;
                            if (logger2.isLoggable(Level.FINE)) {
                                logger2.fine("server disconnect (" + networkunavailablelambda3.serializer + ")");
                            }
                            networkunavailablelambda3.write();
                            networkunavailablelambda3.IconCompatParcelizer("io server disconnect");
                            break;
                        case 2:
                        case 5:
                            ArrayList arrayList = new ArrayList(Arrays.asList(networkUnavailablelambda0.RemoteActionCompatParcelizer((JSONArray) r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer)));
                            Logger logger3 = networkUnavailablelambda0.write;
                            if (logger3.isLoggable(Level.FINE)) {
                                logger3.fine(String.format("emitting event %s", arrayList));
                            }
                            if (r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer >= 0) {
                                logger3.fine("attaching ack callback to event");
                                arrayList.add(new getContentCardsRecyclerView(new boolean[]{false}, r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer, networkunavailablelambda3));
                            }
                            if (!networkunavailablelambda3.RemoteActionCompatParcelizer) {
                                networkunavailablelambda3.RatingCompat.add(arrayList);
                                break;
                            } else if (!arrayList.isEmpty()) {
                                if (!networkunavailablelambda3.MediaMetadataCompat.isEmpty()) {
                                    Object[] array = arrayList.toArray();
                                    Iterator it = networkunavailablelambda3.MediaMetadataCompat.iterator();
                                    while (it.hasNext()) {
                                        ((getContentCardsViewBindingHandler) it.next()).RemoteActionCompatParcelizer(array);
                                    }
                                }
                                networkunavailablelambda3.write(arrayList.remove(0).toString(), arrayList.toArray());
                                break;
                            }
                            break;
                        case 3:
                        case 6:
                            Logger logger4 = networkUnavailablelambda0.write;
                            getContentCardsRecyclerView getcontentcardsrecyclerview = (getContentCardsRecyclerView) networkunavailablelambda3.read.remove(Integer.valueOf(r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer));
                            if (getcontentcardsrecyclerview != null) {
                                if (logger4.isLoggable(Level.FINE)) {
                                    logger4.fine(String.format("calling ack %s with %s", Integer.valueOf(r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer), r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer));
                                }
                                r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a(getcontentcardsrecyclerview, 19, networkUnavailablelambda0.RemoteActionCompatParcelizer((JSONArray) r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer)));
                            } else if (logger4.isLoggable(Level.FINE)) {
                                logger4.fine("bad ack " + r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer);
                            }
                            break;
                        case 4:
                            networkunavailablelambda3.write();
                            networkunavailablelambda3.write("connect_error", r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer);
                            break;
                    }
                }
            }
        };
        r8lambdach50szxgsvgzrle_f5bmf0a81gm.read("packet", getcontentcardsviewbindinghandler2);
        add(new contentCardsUpdate(r8lambdach50szxgsvgzrle_f5bmf0a81gm, "packet", getcontentcardsviewbindinghandler2));
        final int i3 = 2;
        getContentCardsViewBindingHandler getcontentcardsviewbindinghandler3 = new getContentCardsViewBindingHandler(this) { // from class: io.socket.client.Socket$2$1
            public final /* synthetic */ contentCardsUpdatelambda1 IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.getContentCardsViewBindingHandler
            public final void RemoteActionCompatParcelizer(Object... objArr) {
                int i4 = i3;
                if (i4 == 0) {
                    networkUnavailablelambda0 networkunavailablelambda1 = this.IconCompatParcelizer.serializer;
                    networkUnavailablelambda0.write.fine("transport is open - connecting");
                    networkunavailablelambda1.RemoteActionCompatParcelizer(new r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ(0));
                    return;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        if (this.IconCompatParcelizer.serializer.RemoteActionCompatParcelizer) {
                            return;
                        }
                        this.IconCompatParcelizer.serializer.write("connect_error", objArr[0]);
                        return;
                    } else {
                        networkUnavailablelambda0 networkunavailablelambda2 = this.IconCompatParcelizer.serializer;
                        String str = objArr.length > 0 ? (String) objArr[0] : null;
                        Logger logger = networkUnavailablelambda0.write;
                        networkunavailablelambda2.IconCompatParcelizer(str);
                    }
                }
                networkUnavailablelambda0 networkunavailablelambda3 = this.IconCompatParcelizer.serializer;
                r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ r8lambdaa1ganccjs3o2sewhmv3kuv99jq = (r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ) objArr[0];
                if (networkunavailablelambda3.serializer.equals(r8lambdaa1ganccjs3o2sewhmv3kuv99jq.write)) {
                    switch (r8lambdaa1ganccjs3o2sewhmv3kuv99jq.read) {
                        case 0:
                            Object obj = r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer;
                            if ((obj instanceof JSONObject) && ((JSONObject) obj).has("sid")) {
                                try {
                                    ((JSONObject) r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer).getString("sid");
                                    networkunavailablelambda3.read();
                                } catch (JSONException unused) {
                                    return;
                                }
                            } else {
                                networkunavailablelambda3.write("connect_error", new SocketIOException("It seems you are trying to reach a Socket.IO server in v2.x with a v3.x client, which is not possible"));
                            }
                            break;
                        case 1:
                            Logger logger2 = networkUnavailablelambda0.write;
                            if (logger2.isLoggable(Level.FINE)) {
                                logger2.fine("server disconnect (" + networkunavailablelambda3.serializer + ")");
                            }
                            networkunavailablelambda3.write();
                            networkunavailablelambda3.IconCompatParcelizer("io server disconnect");
                            break;
                        case 2:
                        case 5:
                            ArrayList arrayList = new ArrayList(Arrays.asList(networkUnavailablelambda0.RemoteActionCompatParcelizer((JSONArray) r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer)));
                            Logger logger3 = networkUnavailablelambda0.write;
                            if (logger3.isLoggable(Level.FINE)) {
                                logger3.fine(String.format("emitting event %s", arrayList));
                            }
                            if (r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer >= 0) {
                                logger3.fine("attaching ack callback to event");
                                arrayList.add(new getContentCardsRecyclerView(new boolean[]{false}, r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer, networkunavailablelambda3));
                            }
                            if (!networkunavailablelambda3.RemoteActionCompatParcelizer) {
                                networkunavailablelambda3.RatingCompat.add(arrayList);
                                break;
                            } else if (!arrayList.isEmpty()) {
                                if (!networkunavailablelambda3.MediaMetadataCompat.isEmpty()) {
                                    Object[] array = arrayList.toArray();
                                    Iterator it = networkunavailablelambda3.MediaMetadataCompat.iterator();
                                    while (it.hasNext()) {
                                        ((getContentCardsViewBindingHandler) it.next()).RemoteActionCompatParcelizer(array);
                                    }
                                }
                                networkunavailablelambda3.write(arrayList.remove(0).toString(), arrayList.toArray());
                                break;
                            }
                            break;
                        case 3:
                        case 6:
                            Logger logger4 = networkUnavailablelambda0.write;
                            getContentCardsRecyclerView getcontentcardsrecyclerview = (getContentCardsRecyclerView) networkunavailablelambda3.read.remove(Integer.valueOf(r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer));
                            if (getcontentcardsrecyclerview != null) {
                                if (logger4.isLoggable(Level.FINE)) {
                                    logger4.fine(String.format("calling ack %s with %s", Integer.valueOf(r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer), r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer));
                                }
                                r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a(getcontentcardsrecyclerview, 19, networkUnavailablelambda0.RemoteActionCompatParcelizer((JSONArray) r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer)));
                            } else if (logger4.isLoggable(Level.FINE)) {
                                logger4.fine("bad ack " + r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer);
                            }
                            break;
                        case 4:
                            networkunavailablelambda3.write();
                            networkunavailablelambda3.write("connect_error", r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer);
                            break;
                    }
                }
            }
        };
        r8lambdach50szxgsvgzrle_f5bmf0a81gm.read(FWFConstants.EXPLANATION_TYPE_ERROR, getcontentcardsviewbindinghandler3);
        add(new contentCardsUpdate(r8lambdach50szxgsvgzrle_f5bmf0a81gm, FWFConstants.EXPLANATION_TYPE_ERROR, getcontentcardsviewbindinghandler3));
        final int i4 = 3;
        getContentCardsViewBindingHandler getcontentcardsviewbindinghandler4 = new getContentCardsViewBindingHandler(this) { // from class: io.socket.client.Socket$2$1
            public final /* synthetic */ contentCardsUpdatelambda1 IconCompatParcelizer;

            {
                this.IconCompatParcelizer = this;
            }

            @Override // o.getContentCardsViewBindingHandler
            public final void RemoteActionCompatParcelizer(Object... objArr) {
                int i5 = i4;
                if (i5 == 0) {
                    networkUnavailablelambda0 networkunavailablelambda1 = this.IconCompatParcelizer.serializer;
                    networkUnavailablelambda0.write.fine("transport is open - connecting");
                    networkunavailablelambda1.RemoteActionCompatParcelizer(new r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ(0));
                    return;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        if (this.IconCompatParcelizer.serializer.RemoteActionCompatParcelizer) {
                            return;
                        }
                        this.IconCompatParcelizer.serializer.write("connect_error", objArr[0]);
                        return;
                    } else {
                        networkUnavailablelambda0 networkunavailablelambda2 = this.IconCompatParcelizer.serializer;
                        String str = objArr.length > 0 ? (String) objArr[0] : null;
                        Logger logger = networkUnavailablelambda0.write;
                        networkunavailablelambda2.IconCompatParcelizer(str);
                    }
                }
                networkUnavailablelambda0 networkunavailablelambda3 = this.IconCompatParcelizer.serializer;
                r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ r8lambdaa1ganccjs3o2sewhmv3kuv99jq = (r8lambdaA1GAncCJS3O2SeWHmV3KUv99JQ) objArr[0];
                if (networkunavailablelambda3.serializer.equals(r8lambdaa1ganccjs3o2sewhmv3kuv99jq.write)) {
                    switch (r8lambdaa1ganccjs3o2sewhmv3kuv99jq.read) {
                        case 0:
                            Object obj = r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer;
                            if ((obj instanceof JSONObject) && ((JSONObject) obj).has("sid")) {
                                try {
                                    ((JSONObject) r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer).getString("sid");
                                    networkunavailablelambda3.read();
                                } catch (JSONException unused) {
                                    return;
                                }
                            } else {
                                networkunavailablelambda3.write("connect_error", new SocketIOException("It seems you are trying to reach a Socket.IO server in v2.x with a v3.x client, which is not possible"));
                            }
                            break;
                        case 1:
                            Logger logger2 = networkUnavailablelambda0.write;
                            if (logger2.isLoggable(Level.FINE)) {
                                logger2.fine("server disconnect (" + networkunavailablelambda3.serializer + ")");
                            }
                            networkunavailablelambda3.write();
                            networkunavailablelambda3.IconCompatParcelizer("io server disconnect");
                            break;
                        case 2:
                        case 5:
                            ArrayList arrayList = new ArrayList(Arrays.asList(networkUnavailablelambda0.RemoteActionCompatParcelizer((JSONArray) r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer)));
                            Logger logger3 = networkUnavailablelambda0.write;
                            if (logger3.isLoggable(Level.FINE)) {
                                logger3.fine(String.format("emitting event %s", arrayList));
                            }
                            if (r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer >= 0) {
                                logger3.fine("attaching ack callback to event");
                                arrayList.add(new getContentCardsRecyclerView(new boolean[]{false}, r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer, networkunavailablelambda3));
                            }
                            if (!networkunavailablelambda3.RemoteActionCompatParcelizer) {
                                networkunavailablelambda3.RatingCompat.add(arrayList);
                                break;
                            } else if (!arrayList.isEmpty()) {
                                if (!networkunavailablelambda3.MediaMetadataCompat.isEmpty()) {
                                    Object[] array = arrayList.toArray();
                                    Iterator it = networkunavailablelambda3.MediaMetadataCompat.iterator();
                                    while (it.hasNext()) {
                                        ((getContentCardsViewBindingHandler) it.next()).RemoteActionCompatParcelizer(array);
                                    }
                                }
                                networkunavailablelambda3.write(arrayList.remove(0).toString(), arrayList.toArray());
                                break;
                            }
                            break;
                        case 3:
                        case 6:
                            Logger logger4 = networkUnavailablelambda0.write;
                            getContentCardsRecyclerView getcontentcardsrecyclerview = (getContentCardsRecyclerView) networkunavailablelambda3.read.remove(Integer.valueOf(r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer));
                            if (getcontentcardsrecyclerview != null) {
                                if (logger4.isLoggable(Level.FINE)) {
                                    logger4.fine(String.format("calling ack %s with %s", Integer.valueOf(r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer), r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer));
                                }
                                r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new d$a(getcontentcardsrecyclerview, 19, networkUnavailablelambda0.RemoteActionCompatParcelizer((JSONArray) r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer)));
                            } else if (logger4.isLoggable(Level.FINE)) {
                                logger4.fine("bad ack " + r8lambdaa1ganccjs3o2sewhmv3kuv99jq.RemoteActionCompatParcelizer);
                            }
                            break;
                        case 4:
                            networkunavailablelambda3.write();
                            networkunavailablelambda3.write("connect_error", r8lambdaa1ganccjs3o2sewhmv3kuv99jq.IconCompatParcelizer);
                            break;
                    }
                }
            }
        };
        r8lambdach50szxgsvgzrle_f5bmf0a81gm.read("close", getcontentcardsviewbindinghandler4);
        add(new contentCardsUpdate(r8lambdach50szxgsvgzrle_f5bmf0a81gm, "close", getcontentcardsviewbindinghandler4));
    }
}
