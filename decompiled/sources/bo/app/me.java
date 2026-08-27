package bo.app;

import com.braze.models.IPutIntoJson;
import com.braze.support.DateTimeUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class me implements IPutIntoJson {
    public final String a;
    public final long b;

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        return new JSONObject().put("log", this.a).put(CrashHianalyticsData.TIME, this.b);
    }

    public me(String str) {
        str.getClass();
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.a = str;
        this.b = jNowInMilliseconds;
    }
}
