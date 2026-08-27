package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getHomeEK5gGoQ extends getFunctionEK5gGoQ {
    public static final Map RemoteActionCompatParcelizer;
    public boolean read = false;

    @Override // o.getFunctionEK5gGoQ
    public final /* synthetic */ Object read() {
        return this.write;
    }

    @Override // o.getFunctionEK5gGoQ
    public final Iterator write() {
        return serializer();
    }

    static {
        HashMap map = new HashMap();
        map.put("hasOwnProperty", getDirectionUpRightEK5gGoQ.serializer);
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
        ScreenStartObserver$$ExternalSyntheticLambda0.write(ff$$ExternalSyntheticOutline0.m("Native Method ", str, " is not defined for type ListWrapper."));
        return null;
    }

    @Override // o.getFunctionEK5gGoQ
    /* JADX INFO: renamed from: toString */
    public final String read() {
        return this.write.toString();
    }

    public getHomeEK5gGoQ(HashMap map) {
        this.write = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getHomeEK5gGoQ) {
            return this.write.entrySet().equals(((getHomeEK5gGoQ) obj).write.entrySet());
        }
        return false;
    }

    @Override // o.getFunctionEK5gGoQ
    public final getFunctionEK5gGoQ IconCompatParcelizer(String str) {
        getFunctionEK5gGoQ getfunctionek5ggoqIconCompatParcelizer = super.IconCompatParcelizer(str);
        return getfunctionek5ggoqIconCompatParcelizer == null ? getHelpEK5gGoQ.read : getfunctionek5ggoqIconCompatParcelizer;
    }
}
