package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.MapboxServices;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getInfoEK5gGoQ extends getFunctionEK5gGoQ {
    public static final Map IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;

    @Override // o.getFunctionEK5gGoQ
    public final /* synthetic */ Object read() {
        return this.RemoteActionCompatParcelizer;
    }

    static {
        HashMap map = new HashMap();
        map.put("charAt", new getDvrEK5gGoQ(17));
        map.put("concat", new getDvrEK5gGoQ(18));
        map.put("hasOwnProperty", getDirectionUpRightEK5gGoQ.serializer);
        map.put("indexOf", new getDvrEK5gGoQ(19));
        map.put("lastIndexOf", new getDvrEK5gGoQ(20));
        map.put("match", new getDvrEK5gGoQ(21));
        map.put("replace", new getDvrEK5gGoQ(22));
        map.put(MapboxServices.SEARCH, new getDvrEK5gGoQ(23));
        map.put("slice", new getDvrEK5gGoQ(24));
        map.put("split", new getDvrEK5gGoQ(25));
        map.put("substring", new getDvrEK5gGoQ(26));
        map.put("toLocaleLowerCase", new getDvrEK5gGoQ(27));
        map.put("toLocaleUpperCase", new getDvrEK5gGoQ(28));
        map.put("toLowerCase", new getDvrEK5gGoQ(29));
        map.put("toUpperCase", new getDirectionUpEK5gGoQ(1));
        map.put("toString", new getDirectionUpEK5gGoQ(0));
        map.put("trim", new getDirectionUpEK5gGoQ(2));
        IconCompatParcelizer = Collections.unmodifiableMap(map);
    }

    @Override // o.getFunctionEK5gGoQ
    public final boolean RemoteActionCompatParcelizer(String str) {
        return IconCompatParcelizer.containsKey(str);
    }

    @Override // o.getFunctionEK5gGoQ
    public final getDirectionDownEK5gGoQ read(String str) {
        Map map = IconCompatParcelizer;
        if (map.containsKey(str)) {
            return (getDirectionDownEK5gGoQ) map.get(str);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(ff$$ExternalSyntheticOutline0.m("Native Method ", str, " is not defined for type ListWrapper."));
        return null;
    }

    @Override // o.getFunctionEK5gGoQ
    /* JADX INFO: renamed from: toString */
    public final String read() {
        return this.RemoteActionCompatParcelizer.toString();
    }

    public getInfoEK5gGoQ(String str) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
        this.RemoteActionCompatParcelizer = str;
    }

    @Override // o.getFunctionEK5gGoQ
    public final Iterator write() {
        return new CommonDomainCompanion(2, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getInfoEK5gGoQ)) {
            return false;
        }
        return this.RemoteActionCompatParcelizer.equals(((getInfoEK5gGoQ) obj).RemoteActionCompatParcelizer);
    }
}
