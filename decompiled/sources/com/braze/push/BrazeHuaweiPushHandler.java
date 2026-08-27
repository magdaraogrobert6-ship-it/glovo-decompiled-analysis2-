package com.braze.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import java.util.Map;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeHuaweiPushHandler {
    public static final BrazeHuaweiPushHandler INSTANCE = new BrazeHuaweiPushHandler();

    private BrazeHuaweiPushHandler() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleHmsRemoteMessageData$lambda$1() {
        return "Remote message data was null. Remote message did not originate from Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleHmsRemoteMessageData$lambda$2() {
        return "Remote message did not originate from Braze. Not consuming remote message";
    }

    public static final boolean handleHmsRemoteMessageData(Context context, Map<String, String> map) {
        context.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeHuaweiPushHandler brazeHuaweiPushHandler = INSTANCE;
        int i = 0;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeHuaweiPushHandler, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda0(map, i), 6, (Object) null);
        if (map == null || map.isEmpty()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeHuaweiPushHandler, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(i), 6, (Object) null);
            return false;
        }
        Bundle bundle = BundleUtils.toBundle(map);
        if (!bundle.containsKey(Constants.BRAZE_PUSH_BRAZE_KEY) || !"true".equals(bundle.getString(Constants.BRAZE_PUSH_BRAZE_KEY))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeHuaweiPushHandler, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(5), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeHuaweiPushHandler, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda3(bundle, i), 6, (Object) null);
        Intent intent = new Intent(BrazePushReceiver.HMS_PUSH_SERVICE_ROUTING_ACTION);
        intent.putExtras(bundle);
        BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.Companion, context, intent, false, 4, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleHmsRemoteMessageData$lambda$0(Map map) {
        return "Handling Huawei remote message: " + map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleHmsRemoteMessageData$lambda$3(Bundle bundle) {
        return "Got remote message from Huawei: " + bundle;
    }
}
