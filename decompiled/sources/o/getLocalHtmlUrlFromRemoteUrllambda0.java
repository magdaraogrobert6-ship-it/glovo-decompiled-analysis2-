package o;

import java.text.MessageFormat;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class getLocalHtmlUrlFromRemoteUrllambda0 extends r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc {
    public incrementPermissionRequestCountlambda0 read;

    @Override // o.r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc
    public final void IconCompatParcelizer(optEnum optenum, String str, Object... objArr) {
        incrementPermissionRequestCountlambda0 incrementpermissionrequestcountlambda0 = this.read;
        Level levelRemoteActionCompatParcelizer = getMd5Hash.RemoteActionCompatParcelizer(optenum);
        if (isNullOrEmpty.RemoteActionCompatParcelizer.isLoggable(levelRemoteActionCompatParcelizer)) {
            isNullOrEmpty.IconCompatParcelizer(incrementpermissionrequestcountlambda0, levelRemoteActionCompatParcelizer, MessageFormat.format(str, objArr));
        }
    }

    @Override // o.r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc
    public final void serializer(optEnum optenum, String str) {
        incrementPermissionRequestCountlambda0 incrementpermissionrequestcountlambda0 = this.read;
        Level levelRemoteActionCompatParcelizer = getMd5Hash.RemoteActionCompatParcelizer(optenum);
        if (isNullOrEmpty.RemoteActionCompatParcelizer.isLoggable(levelRemoteActionCompatParcelizer)) {
            isNullOrEmpty.IconCompatParcelizer(incrementpermissionrequestcountlambda0, levelRemoteActionCompatParcelizer, str);
        }
    }
}
