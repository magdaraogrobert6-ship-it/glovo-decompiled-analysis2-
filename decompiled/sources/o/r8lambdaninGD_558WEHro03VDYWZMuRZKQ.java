package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaninGD_558WEHro03VDYWZMuRZKQ implements r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU, migrateTriggersReeligibilityToJsonlambda0 {
    private r8lambdaeD9byxNVlFNFerv0pUjy_LuGI IconCompatParcelizer;

    public static final class RemoteActionCompatParcelizer {
        public RemoteActionCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final r8lambdaeD9byxNVlFNFerv0pUjy_LuGI RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        r8lambdaeD9byxNVlFNFerv0pUjy_LuGI r8lambdaed9byxnvlfnferv0pujy_lugi = this.IconCompatParcelizer;
        if (r8lambdaed9byxnvlfnferv0pujy_lugi == null) {
            String string = jSONObject.toString();
            string.getClass();
            return string;
        }
        if (r8lambdaed9byxnvlfnferv0pujy_lugi instanceof r8lambda_LVHdsEDcH1gnImtxbHCK_OJoU) {
            jSONObject.put("type", "pause");
        } else if (r8lambdaed9byxnvlfnferv0pujy_lugi instanceof r8lambdaeD9byxNVlFNFerv0pUjy_LuGI.RemoteActionCompatParcelizer) {
            jSONObject.put("type", "config_update");
            jSONObject.put("min_config_modif_time_millis", ((r8lambdaeD9byxNVlFNFerv0pUjy_LuGI.RemoteActionCompatParcelizer) r8lambdaed9byxnvlfnferv0pujy_lugi).serializer());
        }
        String string2 = jSONObject.toString();
        string2.getClass();
        return string2;
    }

    static {
        new RemoteActionCompatParcelizer(null);
    }

    public final String toString() {
        return "ActionHolder(action=" + this.IconCompatParcelizer + ')';
    }

    public /* synthetic */ r8lambdaninGD_558WEHro03VDYWZMuRZKQ(r8lambdaeD9byxNVlFNFerv0pUjy_LuGI r8lambdaed9byxnvlfnferv0pujy_lugi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : r8lambdaed9byxnvlfnferv0pujy_lugi);
    }

    public r8lambdaninGD_558WEHro03VDYWZMuRZKQ(r8lambdaeD9byxNVlFNFerv0pUjy_LuGI r8lambdaed9byxnvlfnferv0pujy_lugi) {
        this.IconCompatParcelizer = r8lambdaed9byxnvlfnferv0pujy_lugi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r8lambdaninGD_558WEHro03VDYWZMuRZKQ() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        r8lambdaeD9byxNVlFNFerv0pUjy_LuGI remoteActionCompatParcelizer;
        str.getClass();
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("type");
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{string, "pause"}, getCieXyz.write())).booleanValue()) {
            remoteActionCompatParcelizer = r8lambda_LVHdsEDcH1gnImtxbHCK_OJoU.read;
        } else {
            remoteActionCompatParcelizer = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{string, "config_update"}, getCieXyz.write())).booleanValue() ? new r8lambdaeD9byxNVlFNFerv0pUjy_LuGI.RemoteActionCompatParcelizer(jSONObject.getLong("min_config_modif_time_millis")) : null;
        }
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
    }
}
