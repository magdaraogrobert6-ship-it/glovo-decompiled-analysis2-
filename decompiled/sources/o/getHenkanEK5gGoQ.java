package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getHenkanEK5gGoQ extends getFunctionEK5gGoQ {
    public static final Map read;
    public final ArrayList serializer;

    @Override // o.getFunctionEK5gGoQ
    public final /* synthetic */ Object read() {
        return this.serializer;
    }

    static {
        HashMap map = new HashMap();
        int i = 0;
        map.put("concat", new getDirectionLeftEK5gGoQ(i));
        map.put("every", new getDirectionLeftEK5gGoQ(1));
        map.put("filter", new getDirectionLeftEK5gGoQ(2));
        map.put("forEach", new getDirectionLeftEK5gGoQ(3));
        map.put("indexOf", new getDirectionLeftEK5gGoQ(4));
        map.put("hasOwnProperty", getDirectionUpRightEK5gGoQ.serializer);
        map.put("join", new getDirectionLeftEK5gGoQ(5));
        map.put("lastIndexOf", new getDirectionLeftEK5gGoQ(6));
        map.put("map", new getDirectionLeftEK5gGoQ(7));
        map.put("pop", new getDirectionLeftEK5gGoQ(8));
        map.put(com.adjust.sdk.Constants.PUSH, new getDirectionLeftEK5gGoQ(9));
        map.put("reduce", new getDirectionLeftEK5gGoQ(10));
        map.put("reduceRight", new getDirectionLeftEK5gGoQ(11));
        map.put("reverse", new getDirectionLeftEK5gGoQ(12));
        map.put("shift", new getDirectionLeftEK5gGoQ(13));
        map.put("slice", new getDirectionLeftEK5gGoQ(14));
        map.put("some", new getDirectionLeftEK5gGoQ(15));
        map.put("sort", new getDirectionLeftEK5gGoQ(16));
        map.put("splice", new getDirectionLeftEK5gGoQ(17));
        map.put("toString", new getDirectionUpEK5gGoQ(i));
        map.put("unshift", new getDirectionLeftEK5gGoQ(18));
        read = Collections.unmodifiableMap(map);
    }

    public final boolean RemoteActionCompatParcelizer(int i) {
        if (i < 0) {
            return false;
        }
        ArrayList arrayList = this.serializer;
        return i < arrayList.size() && arrayList.get(i) != null;
    }

    @Override // o.getFunctionEK5gGoQ
    public final boolean RemoteActionCompatParcelizer(String str) {
        return read.containsKey(str);
    }

    @Override // o.getFunctionEK5gGoQ
    public final getDirectionDownEK5gGoQ read(String str) {
        Map map = read;
        if (map.containsKey(str)) {
            return (getDirectionDownEK5gGoQ) map.get(str);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(ff$$ExternalSyntheticOutline0.m("Native Method ", str, " is not defined for type ListWrapper."));
        return null;
    }

    public final getFunctionEK5gGoQ read(int i) {
        getFunctionEK5gGoQ getfunctionek5ggoq;
        if (i >= 0) {
            ArrayList arrayList = this.serializer;
            if (i < arrayList.size() && (getfunctionek5ggoq = (getFunctionEK5gGoQ) arrayList.get(i)) != null) {
                return getfunctionek5ggoq;
            }
        }
        return getHelpEK5gGoQ.read;
    }

    @Override // o.getFunctionEK5gGoQ
    /* JADX INFO: renamed from: toString */
    public final String read() {
        return this.serializer.toString();
    }

    public getHenkanEK5gGoQ(List list) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(list);
        this.serializer = new ArrayList(list);
    }

    @Override // o.getFunctionEK5gGoQ
    public final Iterator write() {
        return new getHeadsetHookEK5gGoQ(new CommonDomainCompanion(1, this), serializer());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getHenkanEK5gGoQ)) {
            return false;
        }
        ArrayList arrayList = ((getHenkanEK5gGoQ) obj).serializer;
        ArrayList arrayList2 = this.serializer;
        if (arrayList2.size() != arrayList.size()) {
            return false;
        }
        boolean zEquals = true;
        for (int i = 0; i < arrayList2.size(); i++) {
            if (arrayList2.get(i) == null) {
                zEquals = arrayList.get(i) == null;
            } else {
                zEquals = ((getFunctionEK5gGoQ) arrayList2.get(i)).equals(arrayList.get(i));
            }
            if (!zEquals) {
                break;
            }
        }
        return zEquals;
    }

    public final void IconCompatParcelizer(int i) {
        accessgetSystemNavigationDowncp.write("Invalid array length", i >= 0);
        ArrayList arrayList = this.serializer;
        if (arrayList.size() == i) {
            return;
        }
        if (arrayList.size() < i) {
            arrayList.ensureCapacity(i);
            for (int size = arrayList.size(); size < i; size++) {
                arrayList.add(null);
            }
            return;
        }
        arrayList.subList(i, arrayList.size()).clear();
    }
}
