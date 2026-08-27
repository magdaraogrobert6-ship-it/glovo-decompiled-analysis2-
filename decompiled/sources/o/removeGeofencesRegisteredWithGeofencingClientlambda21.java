package o;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class removeGeofencesRegisteredWithGeofencingClientlambda21 implements migrateTriggersReeligibilityToJsonlambda0, r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU {
    private Byte RemoteActionCompatParcelizer;
    final /* synthetic */ removeGeofencesRegisteredWithGeofencingClientlambda00 read;
    private byte serializer;
    private Byte write;

    public removeGeofencesRegisteredWithGeofencingClientlambda21(removeGeofencesRegisteredWithGeofencingClientlambda00 removegeofencesregisteredwithgeofencingclientlambda00, byte b, Byte b2, Byte b3) {
        this.read = removegeofencesregisteredwithgeofencingclientlambda00;
        this.serializer = b;
        this.RemoteActionCompatParcelizer = b2;
        this.write = b3;
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("level")) {
                this.serializer = (byte) jSONObject.getInt("level");
            }
            if (jSONObject.has("chargingState") && !jSONObject.isNull("chargingState")) {
                this.RemoteActionCompatParcelizer = Byte.valueOf((byte) jSONObject.getInt("chargingState"));
            }
            if (!jSONObject.has("chargingMethod") || jSONObject.isNull("chargingMethod")) {
                return;
            }
            this.write = Byte.valueOf((byte) jSONObject.getInt("chargingMethod"));
        } catch (JSONException e) {
            this.read.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Error parsing json ", str), new Object[0]);
        }
    }

    public removeGeofencesRegisteredWithGeofencingClientlambda21(removeGeofencesRegisteredWithGeofencingClientlambda00 removegeofencesregisteredwithgeofencingclientlambda00, String str) {
        this.read = removegeofencesregisteredwithgeofencingclientlambda00;
        RemoteActionCompatParcelizer(str);
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("level", (int) this.serializer);
            jSONObject.put("chargingState", this.RemoteActionCompatParcelizer);
            jSONObject.put("chargingMethod", this.write);
            return jSONObject.toString();
        } catch (JSONException e) {
            this.read.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Error parsing to json", new Object[0]);
            return "";
        }
    }
}
