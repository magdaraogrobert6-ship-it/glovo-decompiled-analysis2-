package o;

import com.huawei.riemann.location.common.utils.Constant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class migrateBlocklistedListlambda2 {
    public static ArrayList serializer(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            arrayList2.add(it.next());
            if (i > 0 && i % Constant.ERROR_UNKNOWN == 0) {
                arrayList.add(arrayList2);
                arrayList2 = new ArrayList();
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(arrayList2);
        }
        return arrayList;
    }
}
