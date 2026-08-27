package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getGEK5gGoQ extends getFunctionEK5gGoQ {
    public static final Map RemoteActionCompatParcelizer;
    public final Double serializer;

    @Override // o.getFunctionEK5gGoQ
    public final /* synthetic */ Object read() {
        return this.serializer;
    }

    static {
        HashMap map = new HashMap();
        map.put("hasOwnProperty", getDirectionUpRightEK5gGoQ.serializer);
        map.put("toString", new getDirectionUpEK5gGoQ(0));
        RemoteActionCompatParcelizer = Collections.unmodifiableMap(map);
    }

    @Override // o.getFunctionEK5gGoQ
    public final boolean RemoteActionCompatParcelizer(String str) {
        return RemoteActionCompatParcelizer.containsKey(str);
    }

    @Override // o.getFunctionEK5gGoQ
    public final getDirectionDownEK5gGoQ read(String str) {
        Map map = RemoteActionCompatParcelizer;
        if (map.containsKey(str)) {
            return (getDirectionDownEK5gGoQ) map.get(str);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(ff$$ExternalSyntheticOutline0.m("Native Method ", str, " is not defined for type DoubleWrapper."));
        return null;
    }

    @Override // o.getFunctionEK5gGoQ
    /* JADX INFO: renamed from: toString */
    public final String read() {
        return this.serializer.toString();
    }

    public getGEK5gGoQ(Double d) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(d);
        this.serializer = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getGEK5gGoQ)) {
            return false;
        }
        return this.serializer.equals(((getGEK5gGoQ) obj).serializer);
    }
}
