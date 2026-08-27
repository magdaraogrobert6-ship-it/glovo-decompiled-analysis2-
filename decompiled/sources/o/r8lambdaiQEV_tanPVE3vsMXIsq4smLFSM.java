package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM {
    public static ArrayList RemoteActionCompatParcelizer(Class cls, String str, String str2) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = str2 == null ? new JSONArray(str) : new JSONObject(str).getJSONArray(str2);
            for (int i = 0; i < jSONArray.length(); i++) {
                r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU r8lambdajk0nsmilrf0udmer4qeoujidfqu = (r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU) cls.newInstance();
                r8lambdajk0nsmilrf0udmer4qeoujidfqu.RemoteActionCompatParcelizer(jSONArray.getJSONObject(i).toString());
                arrayList.add(r8lambdajk0nsmilrf0udmer4qeoujidfqu);
            }
            return arrayList;
        } catch (IllegalAccessException | InstantiationException e) {
            throw new JSONException(e.getClass().getSimpleName());
        }
    }

    public static r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU serializer(Class cls, String str) throws JSONException {
        try {
            r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU r8lambdajk0nsmilrf0udmer4qeoujidfqu = (r8lambdajk0NsMIlrF0UDMeR4qeouJidFQU) cls.newInstance();
            r8lambdajk0nsmilrf0udmer4qeoujidfqu.RemoteActionCompatParcelizer(str);
            return r8lambdajk0nsmilrf0udmer4qeoujidfqu;
        } catch (IllegalAccessException | InstantiationException e) {
            throw new JSONException(e.getClass().getSimpleName());
        }
    }

    public static String write(List list) throws JSONException {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(((migrateTriggersReeligibilityToJsonlambda0) it.next()).write());
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }
}
