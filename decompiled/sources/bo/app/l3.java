package bo.app;

import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes.dex */
public enum l3 {
    INTEGER("integer"),
    COLOR(RemoteMessageConst.Notification.COLOR),
    BOOLEAN("bool"),
    STRING("string"),
    DRAWABLE_IDENTIFIER("drawable"),
    STRING_ARRAY("array");

    public final String a;

    l3(String str) {
        this.a = str;
    }
}
