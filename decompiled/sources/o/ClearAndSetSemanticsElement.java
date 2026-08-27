package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ClearAndSetSemanticsElement implements CollectionInfo {
    public long IconCompatParcelizer;
    public final LinkedHashMap read = new LinkedHashMap();

    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer = System.nanoTime();
        this.read.put("callTime", String.valueOf(System.currentTimeMillis()));
    }

    public final void IconCompatParcelizer(String str) {
        this.read.put("errorMsg", str);
    }

    public final void write(String str) {
        this.read.put("apiName", str);
    }

    public final void read(int i) {
        this.read.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(i));
    }
}
