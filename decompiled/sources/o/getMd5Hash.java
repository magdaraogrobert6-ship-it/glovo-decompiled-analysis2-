package o;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.text.MessageFormat;
import java.util.logging.Level;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getMd5Hash extends r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc {
    public final WebContentUtils IconCompatParcelizer;
    public final isNullOrEmpty read;

    public static Level RemoteActionCompatParcelizer(optEnum optenum) {
        int i = getSuffixFromUserIdHashAndApiKey.IconCompatParcelizer[optenum.ordinal()];
        if (i == 1 || i == 2) {
            return Level.FINE;
        }
        return i != 3 ? Level.FINEST : Level.FINER;
    }

    @Override // o.r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc
    public final void serializer(optEnum optenum, String str) {
        getPermissionRequestCount getpermissionrequestcount;
        isNullOrEmpty isnullorempty = this.read;
        incrementPermissionRequestCountlambda0 incrementpermissionrequestcountlambda0 = isnullorempty.read;
        Level levelRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(optenum);
        if (isNullOrEmpty.RemoteActionCompatParcelizer.isLoggable(levelRemoteActionCompatParcelizer)) {
            isNullOrEmpty.IconCompatParcelizer(incrementpermissionrequestcountlambda0, levelRemoteActionCompatParcelizer, str);
        }
        if (!serializer(optenum) || optenum == optEnum.DEBUG) {
            return;
        }
        int i = getSuffixFromUserIdHashAndApiKey.IconCompatParcelizer[optenum.ordinal()];
        if (i != 1) {
            getpermissionrequestcount = i != 2 ? getPermissionRequestCount.CT_INFO : getPermissionRequestCount.CT_WARNING;
        } else {
            getpermissionrequestcount = getPermissionRequestCount.CT_ERROR;
        }
        getPermissionRequestCount getpermissionrequestcount2 = getpermissionrequestcount;
        long jWrite = this.IconCompatParcelizer.write();
        TextStreamsKt.serializer(str, "description");
        TextStreamsKt.serializer(getpermissionrequestcount2, "severity");
        new r8lambdaqYSwZub08pyNNYVE4xV_lcKzRA(str, getpermissionrequestcount2, jWrite, null);
        synchronized (isnullorempty.serializer) {
        }
    }

    public getMd5Hash(isNullOrEmpty isnullorempty, WebContentUtils webContentUtils) {
        this.read = isnullorempty;
        TextStreamsKt.serializer(webContentUtils, CrashHianalyticsData.TIME);
        this.IconCompatParcelizer = webContentUtils;
    }

    public final boolean serializer(optEnum optenum) {
        if (optenum == optEnum.DEBUG) {
            return false;
        }
        synchronized (this.read.serializer) {
        }
        return false;
    }

    @Override // o.r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc
    public final void IconCompatParcelizer(optEnum optenum, String str, Object... objArr) {
        serializer(optenum, (serializer(optenum) || isNullOrEmpty.RemoteActionCompatParcelizer.isLoggable(RemoteActionCompatParcelizer(optenum))) ? MessageFormat.format(str, objArr) : null);
    }
}
