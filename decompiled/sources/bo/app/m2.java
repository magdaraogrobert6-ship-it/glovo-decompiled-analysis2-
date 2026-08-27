package bo.app;

import com.huawei.hms.android.SystemUtils;

/* JADX INFO: loaded from: classes.dex */
public enum m2 {
    SESSION_START("ss"),
    DUST_INITIATED("di"),
    CLIENT_INITIATED("ci"),
    UNKNOWN(SystemUtils.UNKNOWN);

    public final String a;

    m2(String str) {
        this.a = str;
    }
}
