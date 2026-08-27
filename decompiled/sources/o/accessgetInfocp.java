package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.incognia.internal.pNP$$ExternalSyntheticLambda0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class accessgetInfocp extends BroadcastReceiver {
    public static final /* synthetic */ int serializer = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(com.braze.models.inappmessage.InAppMessageBase.EXTRAS);
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter(RemoteMessageConst.Notification.PRIORITY)).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        accessgetF2cp.RemoteActionCompatParcelizer(context);
        accessgetEqualscp accessgetequalscpWrite = accessgetEightcp.write();
        if (queryParameter == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null backendName");
            return;
        }
        accessgetequalscpWrite.write = queryParameter;
        accessgetequalscpWrite.RemoteActionCompatParcelizer = accessgetMediaPlayPausecp.write(iIntValue);
        if (queryParameter2 != null) {
            accessgetequalscpWrite.IconCompatParcelizer = Base64.decode(queryParameter2, 0);
        }
        access500 access500Var = accessgetF2cp.read().IconCompatParcelizer;
        ((Executor) access500Var.write).execute(new accessgetKcp(access500Var, accessgetequalscpWrite.RemoteActionCompatParcelizer(), i, new pNP$$ExternalSyntheticLambda0(5)));
    }
}
