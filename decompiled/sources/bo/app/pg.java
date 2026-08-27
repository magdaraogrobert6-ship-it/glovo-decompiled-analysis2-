package bo.app;

import android.util.Base64;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import com.huawei.hms.framework.common.BundleUtil;

/* JADX INFO: loaded from: classes.dex */
public abstract class pg implements da {
    public static final String d = BrazeLogger.getBrazeLogTag((Class<?>) pg.class);
    public final long a;
    public final long b;
    public g9 c;

    public pg() {
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        this.b = jNowInMilliseconds;
        this.a = jNowInMilliseconds / 1000;
    }

    public static String a(String str) {
        if (StringUtils.isNullOrBlank(str)) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0)).split(BundleUtil.UNDERLINE_TAG)[0];
        } catch (Exception e) {
            BrazeLogger.e(d, "Unexpected error decoding Base64 encoded campaign Id " + str, e);
            return null;
        }
    }
}
