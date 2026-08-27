package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdakDxe1DGrl5W1RX_YXRXHlRlsI implements r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU, migrateTriggersReeligibilityToJsonlambda0 {
    private List<r8lambdagnzQTYlH7GTe3VzlAdVC8k00Gg> serializer;

    public static final class serializer {
        public serializer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final List<r8lambdagnzQTYlH7GTe3VzlAdVC8k00Gg> serializer() {
        return this.serializer;
    }

    static {
        new serializer(null);
    }

    public /* synthetic */ r8lambdakDxe1DGrl5W1RX_YXRXHlRlsI(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? instance_delegatelambda0.write : list);
    }

    public final String toString() {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(new StringBuilder("SdkInitConfig(actions="), (List) this.serializer, ')');
    }

    @Override // o.r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU
    public final void RemoteActionCompatParcelizer(String str) throws JSONException {
        str.getClass();
        JSONArray jSONArray = new JSONObject(str).getJSONArray("actions");
        Object[] objArr = {0, Integer.valueOf(jSONArray.length())};
        int iWrite = BackspaceCommand.write();
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite);
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(ensuresubscribedtoinappmessageeventslambda7, 10));
        getInAppMessageStackannotations it = ensuresubscribedtoinappmessageeventslambda7.iterator();
        while (it.RemoteActionCompatParcelizer) {
            arrayList.add((r8lambdagnzQTYlH7GTe3VzlAdVC8k00Gg) r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.serializer(r8lambdagnzQTYlH7GTe3VzlAdVC8k00Gg.class, jSONArray.getJSONObject(it.RemoteActionCompatParcelizer()).toString()));
        }
        this.serializer = arrayList;
    }

    public r8lambdakDxe1DGrl5W1RX_YXRXHlRlsI(List<r8lambdagnzQTYlH7GTe3VzlAdVC8k00Gg> list) {
        list.getClass();
        this.serializer = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r8lambdakDxe1DGrl5W1RX_YXRXHlRlsI() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // o.migrateTriggersReeligibilityToJsonlambda0
    public final String write() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.serializer.iterator();
        while (it.hasNext()) {
            jSONArray.put(new JSONObject(((r8lambdagnzQTYlH7GTe3VzlAdVC8k00Gg) it.next()).write()));
        }
        jSONObject.put("actions", jSONArray);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }
}
