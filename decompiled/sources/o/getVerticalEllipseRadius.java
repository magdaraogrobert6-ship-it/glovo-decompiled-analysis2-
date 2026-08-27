package o;

import com.deliveryhero.persistence.cache.CacheData;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class getVerticalEllipseRadius {
    public ConcurrentHashMap write;

    public final Object write(String str) {
        ConcurrentHashMap concurrentHashMap = this.write;
        CacheData cacheData = (CacheData) concurrentHashMap.get(str);
        if (cacheData != null && cacheData.RemoteActionCompatParcelizer()) {
            concurrentHashMap.remove(str);
        }
        if (cacheData == null || cacheData.RemoteActionCompatParcelizer()) {
            return null;
        }
        return cacheData.read();
    }

    public final void serializer(Object obj, String str) {
        this.write.put(str, new CacheData(0L, obj));
    }
}
