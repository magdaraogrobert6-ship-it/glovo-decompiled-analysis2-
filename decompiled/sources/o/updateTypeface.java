package o;

import android.app.Application;
import android.app.NotificationManager;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes3.dex */
public abstract class updateTypeface {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    public static NotificationManager read(Application application) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object systemService = application.getSystemService(RemoteMessageConst.NOTIFICATION);
        systemService.getClass();
        NotificationManager notificationManager = (NotificationManager) systemService;
        int i4 = RemoteActionCompatParcelizer + 63;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return notificationManager;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
