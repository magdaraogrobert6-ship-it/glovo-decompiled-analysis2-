package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getCtrlRightEK5gGoQ {
    public static final HashMap RemoteActionCompatParcelizer;

    static {
        HashMap map = new HashMap();
        map.put(getButton15EK5gGoQ.CONTAINS.toString(), new getDEK5gGoQ("contains"));
        map.put(getButton15EK5gGoQ.ENDS_WITH.toString(), new getDEK5gGoQ("endsWith"));
        map.put(getButton15EK5gGoQ.EQUALS.toString(), new getDEK5gGoQ("equals"));
        map.put(getButton15EK5gGoQ.GREATER_EQUALS.toString(), new getDEK5gGoQ("greaterEquals"));
        map.put(getButton15EK5gGoQ.GREATER_THAN.toString(), new getDEK5gGoQ("greaterThan"));
        map.put(getButton15EK5gGoQ.LESS_EQUALS.toString(), new getDEK5gGoQ("lessEquals"));
        map.put(getButton15EK5gGoQ.LESS_THAN.toString(), new getDEK5gGoQ("lessThan"));
        map.put(getButton15EK5gGoQ.REGEX.toString(), new getDEK5gGoQ(new String[]{getButtonL1EK5gGoQ.ARG0.toString(), getButtonL1EK5gGoQ.ARG1.toString(), getButtonL1EK5gGoQ.IGNORE_CASE.toString()}));
        map.put(getButton15EK5gGoQ.STARTS_WITH.toString(), new getDEK5gGoQ("startsWith"));
        RemoteActionCompatParcelizer = map;
    }

    public static getIEK5gGoQ read(String str, HashMap map) {
        HashMap map2 = RemoteActionCompatParcelizer;
        if (!map2.containsKey(str)) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(ff$$ExternalSyntheticOutline0.m("Fail to convert ", str, " to the internal representation"));
            return null;
        }
        getDEK5gGoQ getdek5ggoq = (getDEK5gGoQ) map2.get(str);
        String[] strArr = getdek5ggoq.serializer;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            if (map.containsKey(strArr[i])) {
                arrayList.add((getFunctionEK5gGoQ) map.get(strArr[i]));
            } else {
                arrayList.add(getHelpEK5gGoQ.read);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new getInfoEK5gGoQ("gtmUtils"));
        getIEK5gGoQ getiek5ggoq = new getIEK5gGoQ("15", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(getiek5ggoq);
        arrayList3.add(new getInfoEK5gGoQ("mobile"));
        getIEK5gGoQ getiek5ggoq2 = new getIEK5gGoQ("17", arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(getiek5ggoq2);
        arrayList4.add(new getInfoEK5gGoQ(getdek5ggoq.write));
        arrayList4.add(new getHenkanEK5gGoQ(arrayList));
        return new getIEK5gGoQ("2", arrayList4);
    }
}
