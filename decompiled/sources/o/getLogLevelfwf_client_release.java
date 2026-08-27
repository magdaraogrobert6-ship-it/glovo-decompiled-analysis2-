package o;

import com.huawei.hmf.tasks.a.i$d;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class getLogLevelfwf_client_release extends LinkedHashMap {
    public final /* synthetic */ int IconCompatParcelizer = 0;

    public getLogLevelfwf_client_release() {
        super(64, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (this.IconCompatParcelizer != 0) {
            return size() > 100;
        }
        return size() > 32;
    }

    public getLogLevelfwf_client_release(i$d.a aVar, int i) {
        super(i, 0.75f, true);
    }
}
