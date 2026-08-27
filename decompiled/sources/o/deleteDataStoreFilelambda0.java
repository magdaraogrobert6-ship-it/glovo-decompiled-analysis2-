package o;

import android.location.Location;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class deleteDataStoreFilelambda0 implements migrateTriggersReeligibilityToJsonlambda0 {
    private final String IconCompatParcelizer;
    private final long read;
    private final Location write;

    public final Location RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final long read() {
        return this.read;
    }

    public final JSONObject IconCompatParcelizer() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("unique_id", this.IconCompatParcelizer);
        jSONObject.put("failed_at", this.read);
        JSONObject jSONObject2 = new JSONObject();
        Location location = this.write;
        jSONObject2.put("latitude", location.getLatitude());
        jSONObject2.put("longitude", location.getLongitude());
        jSONObject.put("location", jSONObject2);
        return jSONObject;
    }

    public final int hashCode() {
        return Objects.hash(this.IconCompatParcelizer, this.write);
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        return IconCompatParcelizer().toString();
    }

    public deleteDataStoreFilelambda0(JSONObject jSONObject) throws JSONException {
        this.IconCompatParcelizer = jSONObject.getString("unique_id");
        this.read = jSONObject.getLong("failed_at");
        JSONObject jSONObject2 = jSONObject.getJSONObject("location");
        Location location = new Location("");
        location.setLatitude(jSONObject2.getDouble("latitude"));
        location.setLongitude(jSONObject2.getDouble("longitude"));
        this.write = location;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || deleteDataStoreFilelambda0.class != obj.getClass()) {
            return false;
        }
        deleteDataStoreFilelambda0 deletedatastorefilelambda0 = (deleteDataStoreFilelambda0) obj;
        Location location = deletedatastorefilelambda0.write;
        if (!this.IconCompatParcelizer.equals(deletedatastorefilelambda0.IconCompatParcelizer)) {
            return false;
        }
        Location location2 = this.write;
        return location2.getLatitude() == location.getLatitude() && location2.getLongitude() == location.getLongitude();
    }
}
