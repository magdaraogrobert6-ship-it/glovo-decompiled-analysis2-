package bo.app;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a4 {
    public final long a;
    public final long b;
    public final boolean c;
    public final JSONArray d;

    public a4(JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject.optLong("last_card_updated_at", -1L);
        this.b = jSONObject.optLong("last_full_sync_at", -1L);
        this.c = jSONObject.optBoolean("full_sync", false);
        this.d = jSONObject.optJSONArray("cards");
    }

    public a4(String str) {
        str.getClass();
        this.c = false;
        this.a = -1L;
        this.b = -1L;
        this.d = new JSONArray().put(new JSONObject(str));
    }
}
