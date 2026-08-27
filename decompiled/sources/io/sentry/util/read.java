package io.sentry.util;

import com.huawei.riemann.location.common.utils.Constant;
import java.util.Arrays;
import java.util.List;
import o.getBrazeActionVersionAndJsonandroid_sdk_ui_release;

/* JADX INFO: loaded from: classes4.dex */
public abstract class read {
    public static final getBrazeActionVersionAndJsonandroid_sdk_ui_release IconCompatParcelizer;
    public static final getBrazeActionVersionAndJsonandroid_sdk_ui_release RemoteActionCompatParcelizer;
    public static final List read = Arrays.asList("X-FORWARDED-FOR", "AUTHORIZATION", "COOKIE", "SET-COOKIE", "X-API-KEY", "X-REAL-IP", "REMOTE-ADDR", "FORWARDED", "PROXY-AUTHORIZATION", "X-CSRF-TOKEN", "X-CSRFTOKEN", "X-XSRF-TOKEN");

    static {
        Arrays.asList("JSESSIONID", "JSESSIONIDSSO", "JSSOSESSIONID", "SESSIONID", "SID", "CSRFTOKEN", "XSRF-TOKEN");
        RemoteActionCompatParcelizer = new getBrazeActionVersionAndJsonandroid_sdk_ui_release(400, 499);
        IconCompatParcelizer = new getBrazeActionVersionAndJsonandroid_sdk_ui_release(Constant.ERROR_UNKNOWN, 599);
    }
}
