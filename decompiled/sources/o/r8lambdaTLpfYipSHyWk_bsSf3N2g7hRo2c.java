package o;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c implements migrateTriggersReeligibilityToJsonlambda0 {
    private final boolean IconCompatParcelizer;
    private final long read;
    private final byte serializer;

    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int hashCode() {
        return this.serializer;
    }

    public final byte read() {
        return this.serializer;
    }

    public final long serializer() {
        return this.read;
    }

    public final JSONObject RemoteActionCompatParcelizer() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("reason", (int) this.serializer);
        jSONObject.put("event_time", this.read);
        jSONObject.put(com.braze.models.FeatureFlag.ENABLED, this.IconCompatParcelizer);
        return jSONObject;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnoozedOffTheGrid{mReason=");
        sb.append((int) this.serializer);
        sb.append(", mEventTime=");
        sb.append(this.read);
        sb.append(", mIsEnabled=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.IconCompatParcelizer, '}');
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        return RemoteActionCompatParcelizer().toString();
    }

    public r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c(JSONObject jSONObject) throws JSONException {
        this.serializer = (byte) jSONObject.getInt("reason");
        this.read = jSONObject.getLong("event_time");
        this.IconCompatParcelizer = jSONObject.getBoolean(com.braze.models.FeatureFlag.ENABLED);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c.class == obj.getClass() && this.serializer == ((r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c) obj).serializer;
    }

    public r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c(r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c r8lambdatlpfyipshywk_bssf3n2g7hro2c) {
        this.serializer = r8lambdatlpfyipshywk_bssf3n2g7hro2c.serializer;
        this.read = r8lambdatlpfyipshywk_bssf3n2g7hro2c.read;
        this.IconCompatParcelizer = r8lambdatlpfyipshywk_bssf3n2g7hro2c.IconCompatParcelizer;
    }

    public r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c(byte b, long j, boolean z) {
        this.serializer = b;
        this.read = j;
        this.IconCompatParcelizer = z;
    }
}
