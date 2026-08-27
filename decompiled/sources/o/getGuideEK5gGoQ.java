package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getGuideEK5gGoQ extends getFunctionEK5gGoQ {
    public static final Map read;
    public final Boolean RemoteActionCompatParcelizer;

    @Override // o.getFunctionEK5gGoQ
    public final /* synthetic */ Object read() {
        return this.RemoteActionCompatParcelizer;
    }

    static {
        HashMap map = new HashMap();
        map.put("hasOwnProperty", getDirectionUpRightEK5gGoQ.serializer);
        map.put("toString", new getDirectionUpEK5gGoQ(0));
        read = Collections.unmodifiableMap(map);
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
        ScreenStartObserver$$ExternalSyntheticLambda0.write(ff$$ExternalSyntheticOutline0.m("Native Method ", str, " is not defined for type BooleanWrapper."));
        return null;
    }

    @Override // o.getFunctionEK5gGoQ
    /* JADX INFO: renamed from: toString */
    public final String read() {
        return this.RemoteActionCompatParcelizer.toString();
    }

    public getGuideEK5gGoQ(Boolean bool) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(bool);
        this.RemoteActionCompatParcelizer = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getGuideEK5gGoQ) {
            return ((getGuideEK5gGoQ) obj).RemoteActionCompatParcelizer.equals(this.RemoteActionCompatParcelizer);
        }
        return false;
    }
}
