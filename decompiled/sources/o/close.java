package o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class close {
    public static final ArrayList RemoteActionCompatParcelizer(Map map, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            addArcRad addarcrad = (addArcRad) entry.getValue();
            Boolean boolValueOf = addarcrad != null ? Boolean.valueOf(addarcrad.IconCompatParcelizer) : null;
            boolValueOf.getClass();
            if (!boolValueOf.booleanValue() && !addarcrad.serializer) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
