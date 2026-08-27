package o;

import android.annotation.SuppressLint;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public final class parsePayloadFieldsFromBundleparseNotificationMetadata implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    private TransportChangeType IconCompatParcelizer;
    private Byte MediaSessionCompatQueueItem;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final com.sentiance.sdk.util.c read;
    private String serializer;
    private String write;

    public final Byte IconCompatParcelizer() {
        return this.MediaSessionCompatQueueItem;
    }

    public final void MediaBrowserCompatMediaItem() {
        synchronized (this) {
            String strWrite = this.read.write("state", (String) null);
            if (strWrite == null) {
                return;
            }
            try {
                RemoteActionCompatParcelizer(strWrite);
            } catch (JSONException e) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Error loading the state: %s", strWrite);
            }
        }
    }

    public final void MediaDescriptionCompat() {
        this.write = null;
        this.serializer = null;
        this.IconCompatParcelizer = null;
        this.MediaSessionCompatQueueItem = null;
        RatingCompat();
    }

    public final String RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    public final TransportChangeType read() {
        return this.IconCompatParcelizer;
    }

    public final String serializer() {
        return this.write;
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    @SuppressLint
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("ongoing_session_id")) {
            this.write = jSONObject.getString("ongoing_session_id");
        }
        if (jSONObject.has("last_processed_transport_change_entry_id")) {
            this.serializer = jSONObject.getString("last_processed_transport_change_entry_id");
        }
        if (jSONObject.has("last_processed_transport_change_type")) {
            this.IconCompatParcelizer = TransportChangeType.valueOf(jSONObject.getString("last_processed_transport_change_type"));
        }
        if (jSONObject.has("last_processed_classified_transport_mode")) {
            this.MediaSessionCompatQueueItem = Byte.valueOf((byte) jSONObject.getInt("last_processed_classified_transport_mode"));
        }
    }

    public parsePayloadFieldsFromBundleparseNotificationMetadata(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0) {
        this.read = cVar;
        this.RemoteActionCompatParcelizer = parselonglambda0;
    }

    public final void read(String str) {
        this.serializer = str;
    }

    public final void serializer(String str) {
        this.write = str;
    }

    public final void RatingCompat() {
        try {
            this.read.RemoteActionCompatParcelizer("state", write());
        } catch (JSONException e) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Error saving the state", new Object[0]);
        }
    }

    public final void IconCompatParcelizer(Byte b) {
        this.MediaSessionCompatQueueItem = b;
    }

    public final void read(TransportChangeType transportChangeType) {
        this.IconCompatParcelizer = transportChangeType;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.write;
        if (str != null) {
            jSONObject.put("ongoing_session_id", str);
        }
        String str2 = this.serializer;
        if (str2 != null) {
            jSONObject.put("last_processed_transport_change_entry_id", str2);
        }
        TransportChangeType transportChangeType = this.IconCompatParcelizer;
        if (transportChangeType != null) {
            jSONObject.put("last_processed_transport_change_type", transportChangeType);
        }
        Byte b = this.MediaSessionCompatQueueItem;
        if (b != null) {
            jSONObject.put("last_processed_classified_transport_mode", (int) b.byteValue());
        }
        return jSONObject.toString();
    }
}
