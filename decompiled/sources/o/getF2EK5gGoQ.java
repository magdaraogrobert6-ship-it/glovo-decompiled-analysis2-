package o;

import com.google.android.gms.internal.gtm.zzbv;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.util.HashMap;
import java.util.Map;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class getF2EK5gGoQ extends getDirectionDownRightEK5gGoQ {
    public static final getLastChannelEK5gGoQ write = getLastChannelEK5gGoQ.IconCompatParcelizer(4, "GET", "HEAD", "POST", "PUT");
    public final getButton7EK5gGoQ IconCompatParcelizer;

    @Override // o.getDirectionDownRightEK5gGoQ
    public final getFunctionEK5gGoQ IconCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        HashMap map;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 1);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHomeEK5gGoQ);
        getFunctionEK5gGoQ getfunctionek5ggoqIconCompatParcelizer = getfunctionek5ggoqArr[0].IconCompatParcelizer("url");
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqIconCompatParcelizer instanceof getInfoEK5gGoQ);
        String str = ((getInfoEK5gGoQ) getfunctionek5ggoqIconCompatParcelizer).RemoteActionCompatParcelizer;
        getFunctionEK5gGoQ getfunctionek5ggoqIconCompatParcelizer2 = getfunctionek5ggoqArr[0].IconCompatParcelizer("method");
        getHelpEK5gGoQ gethelpek5ggoq = getHelpEK5gGoQ.read;
        if (getfunctionek5ggoqIconCompatParcelizer2 == gethelpek5ggoq) {
            getfunctionek5ggoqIconCompatParcelizer2 = new getInfoEK5gGoQ("GET");
        }
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqIconCompatParcelizer2 instanceof getInfoEK5gGoQ);
        String str2 = ((getInfoEK5gGoQ) getfunctionek5ggoqIconCompatParcelizer2).RemoteActionCompatParcelizer;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(write.contains(str2));
        getFunctionEK5gGoQ getfunctionek5ggoqIconCompatParcelizer3 = getfunctionek5ggoqArr[0].IconCompatParcelizer("uniqueId");
        getHelpEK5gGoQ gethelpek5ggoq2 = getHelpEK5gGoQ.serializer;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqIconCompatParcelizer3 == gethelpek5ggoq || getfunctionek5ggoqIconCompatParcelizer3 == gethelpek5ggoq2 || (getfunctionek5ggoqIconCompatParcelizer3 instanceof getInfoEK5gGoQ));
        String str3 = (getfunctionek5ggoqIconCompatParcelizer3 == gethelpek5ggoq || getfunctionek5ggoqIconCompatParcelizer3 == gethelpek5ggoq2) ? null : ((getInfoEK5gGoQ) getfunctionek5ggoqIconCompatParcelizer3).RemoteActionCompatParcelizer;
        getFunctionEK5gGoQ getfunctionek5ggoqIconCompatParcelizer4 = getfunctionek5ggoqArr[0].IconCompatParcelizer("headers");
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqIconCompatParcelizer4 == gethelpek5ggoq || (getfunctionek5ggoqIconCompatParcelizer4 instanceof getHomeEK5gGoQ));
        HashMap map2 = new HashMap();
        if (getfunctionek5ggoqIconCompatParcelizer4 == gethelpek5ggoq) {
            map = null;
        } else {
            for (Map.Entry entry : ((getHomeEK5gGoQ) getfunctionek5ggoqIconCompatParcelizer4).write.entrySet()) {
                String str4 = (String) entry.getKey();
                getFunctionEK5gGoQ getfunctionek5ggoq = (getFunctionEK5gGoQ) entry.getValue();
                if (getfunctionek5ggoq instanceof getInfoEK5gGoQ) {
                    map2.put(str4, ((getInfoEK5gGoQ) getfunctionek5ggoq).RemoteActionCompatParcelizer);
                } else {
                    getButtonThumbLeftEK5gGoQ.serializer("Ignore the non-string value of header key " + str4 + ".");
                }
            }
            map = map2;
        }
        getFunctionEK5gGoQ getfunctionek5ggoqIconCompatParcelizer5 = getfunctionek5ggoqArr[0].IconCompatParcelizer(com.deliveryhero.chatsdk.util.PushNotificationParserObj.BODY_KEY);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqIconCompatParcelizer5 == gethelpek5ggoq || (getfunctionek5ggoqIconCompatParcelizer5 instanceof getInfoEK5gGoQ));
        String str5 = getfunctionek5ggoqIconCompatParcelizer5 != gethelpek5ggoq ? ((getInfoEK5gGoQ) getfunctionek5ggoqIconCompatParcelizer5).RemoteActionCompatParcelizer : null;
        if ((str2.equals("GET") || str2.equals("HEAD")) && str5 != null) {
            getButtonThumbLeftEK5gGoQ.serializer("Body of " + str2 + " hit will be ignored: " + str5 + ".");
        }
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(str, str2, str3, map, str5);
        String.format("QueueRequest:\n  url = %s,\n  method = %s,\n  uniqueId = %s,\n  headers = %s,\n  body = %s", str, str2, str3, map, str5);
        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
        return gethelpek5ggoq;
    }

    public getF2EK5gGoQ(getButton7EK5gGoQ getbutton7ek5ggoq) {
        this.IconCompatParcelizer = getbutton7ek5ggoq;
    }
}
