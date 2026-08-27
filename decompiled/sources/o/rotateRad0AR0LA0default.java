package o;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class rotateRad0AR0LA0default {
    public final Serializable IconCompatParcelizer;
    public long RemoteActionCompatParcelizer;
    public final long read;

    public Object IconCompatParcelizer(Object obj) {
        Object obj2;
        synchronized (this) {
            EmptyCanvas emptyCanvas = (EmptyCanvas) ((LinkedHashMap) this.IconCompatParcelizer).get(obj);
            obj2 = emptyCanvas != null ? emptyCanvas.RemoteActionCompatParcelizer : null;
        }
        return obj2;
    }

    public int RemoteActionCompatParcelizer(Object obj) {
        return 1;
    }

    public void serializer(long j) {
        synchronized (this) {
            while (this.RemoteActionCompatParcelizer > j) {
                Iterator it = ((LinkedHashMap) this.IconCompatParcelizer).entrySet().iterator();
                Map.Entry entry = (Map.Entry) it.next();
                EmptyCanvas emptyCanvas = (EmptyCanvas) entry.getValue();
                this.RemoteActionCompatParcelizer -= (long) emptyCanvas.IconCompatParcelizer;
                Object key = entry.getKey();
                it.remove();
                serializer(key, emptyCanvas.RemoteActionCompatParcelizer);
            }
        }
    }

    public void serializer(Object obj, Object obj2) {
    }

    public Object write(Object obj, Object obj2) {
        synchronized (this) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(obj2);
            long j = iRemoteActionCompatParcelizer;
            if (j >= this.read) {
                serializer(obj, obj2);
                return null;
            }
            if (obj2 != null) {
                this.RemoteActionCompatParcelizer += j;
            }
            EmptyCanvas emptyCanvas = (EmptyCanvas) ((LinkedHashMap) this.IconCompatParcelizer).put(obj, obj2 == null ? null : new EmptyCanvas(iRemoteActionCompatParcelizer, obj2));
            if (emptyCanvas != null) {
                this.RemoteActionCompatParcelizer -= (long) emptyCanvas.IconCompatParcelizer;
                if (!emptyCanvas.RemoteActionCompatParcelizer.equals(obj2)) {
                    serializer(obj, emptyCanvas.RemoteActionCompatParcelizer);
                }
            }
            serializer(this.read);
            return emptyCanvas != null ? emptyCanvas.RemoteActionCompatParcelizer : null;
        }
    }

    public rotateRad0AR0LA0default(long j) {
        this.IconCompatParcelizer = new LinkedHashMap(100, 0.75f, true);
        this.read = j;
    }

    public rotateRad0AR0LA0default(long j, long j2, TimeUnit timeUnit) {
        this.read = j;
        this.RemoteActionCompatParcelizer = j2;
        this.IconCompatParcelizer = timeUnit;
    }
}
