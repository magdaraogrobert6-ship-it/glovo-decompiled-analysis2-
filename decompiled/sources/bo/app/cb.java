package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class cb implements n9 {
    public static final String b = BrazeLogger.getBrazeLogTag((Class<?>) cb.class);
    public final ArrayList a;

    @Override // com.braze.models.IPutIntoJson
    public final JSONArray forJsonPut() {
        JSONArray jSONArray = new JSONArray();
        try {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put(((n9) obj).forJsonPut());
            }
            return jSONArray;
        } catch (Exception e) {
            BrazeLogger.e(b, "Caught exception creating Json.", e);
            return jSONArray;
        }
    }

    public cb(ArrayList arrayList) {
        this.a = arrayList;
    }
}
