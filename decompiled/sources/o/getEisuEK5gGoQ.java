package o;

import android.net.Uri;
import com.google.android.gms.internal.gtm.zzbv;
import io.grpc.LoadBalancer$Helper;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.util.HashMap;
import java.util.Map;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class getEisuEK5gGoQ extends getDirectionDownRightEK5gGoQ {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Object write;

    public /* synthetic */ getEisuEK5gGoQ(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
    }

    @Override // o.getDirectionDownRightEK5gGoQ
    public final getFunctionEK5gGoQ IconCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        getFunctionEK5gGoQ getfunctionek5ggoq;
        int i = this.RemoteActionCompatParcelizer;
        getHelpEK5gGoQ gethelpek5ggoq = getHelpEK5gGoQ.read;
        Object obj = this.write;
        if (i == 0) {
            int length = getfunctionek5ggoqArr.length;
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(length > 0);
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getInfoEK5gGoQ);
            String str = ((getInfoEK5gGoQ) getfunctionek5ggoqArr[0]).RemoteActionCompatParcelizer;
            HashMap map = new HashMap();
            if (length >= 2 && (getfunctionek5ggoq = getfunctionek5ggoqArr[1]) != gethelpek5ggoq) {
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq instanceof getHomeEK5gGoQ);
                for (Map.Entry entry : ((getHomeEK5gGoQ) getfunctionek5ggoqArr[1]).write.entrySet()) {
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(!(entry.getValue() instanceof getIEK5gGoQ));
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(!androidx.room.Room.RemoteActionCompatParcelizer((getFunctionEK5gGoQ) entry.getValue()));
                    map.put((String) entry.getKey(), ((getFunctionEK5gGoQ) entry.getValue()).read());
                }
            }
            return androidx.room.Room.IconCompatParcelizer(((getDirectionRightEK5gGoQ) obj).serializer(str, map));
        }
        int length2 = getfunctionek5ggoqArr.length;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(length2 > 0);
        getFunctionEK5gGoQ getfunctionek5ggoq2 = getfunctionek5ggoqArr[0];
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(!(getfunctionek5ggoq2 instanceof getHelpEK5gGoQ));
        getFunctionEK5gGoQ getfunctionek5ggoq3 = length2 > 1 ? getfunctionek5ggoqArr[1] : gethelpek5ggoq;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq3 == gethelpek5ggoq || (getfunctionek5ggoq3 instanceof getHenkanEK5gGoQ));
        getFunctionEK5gGoQ getfunctionek5ggoq4 = length2 > 2 ? getfunctionek5ggoqArr[2] : gethelpek5ggoq;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq4 == gethelpek5ggoq || !(getfunctionek5ggoq4 instanceof getHelpEK5gGoQ));
        Uri.Builder builderBuildUpon = Uri.parse(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq2)).buildUpon();
        if (getfunctionek5ggoq3 != gethelpek5ggoq) {
            for (getFunctionEK5gGoQ getfunctionek5ggoq5 : ((getHenkanEK5gGoQ) getfunctionek5ggoq3).serializer) {
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq5 instanceof getHomeEK5gGoQ);
                for (Map.Entry entry2 : ((getHomeEK5gGoQ) getfunctionek5ggoq5).write.entrySet()) {
                    builderBuildUpon.appendQueryParameter(((String) entry2.getKey()).toString(), LoadBalancer$Helper.IconCompatParcelizer(androidx.room.Room.RemoteActionCompatParcelizer(zzbvVar, (getFunctionEK5gGoQ) entry2.getValue())));
                }
            }
        }
        String string = builderBuildUpon.build().toString();
        if (getfunctionek5ggoq4 == gethelpek5ggoq) {
            ((getButton7EK5gGoQ) obj).RemoteActionCompatParcelizer(string, null, null, null, null);
            "SendPixel: url = ".concat(String.valueOf(string));
            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
        } else {
            ((getButton7EK5gGoQ) obj).RemoteActionCompatParcelizer(string, null, LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq4), null, null);
            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
        }
        return gethelpek5ggoq;
    }
}
