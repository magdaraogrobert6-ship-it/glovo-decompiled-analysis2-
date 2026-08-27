package com.braze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bo.app.u1;
import com.braze.support.BrazeLogger;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public class BrazeFlushPushDeliveryReceiver extends BroadcastReceiver {
    public static final u1 Companion = new u1();
    public static final String FLUSH_BRAZE_PUSH_DELIVERIES_ACTION = "com.braze.FLUSH_PUSH_DELIVERY";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda99(4, intent), 7, (Object) null);
        Object[] objArr = {intent.getAction(), FLUSH_BRAZE_PUSH_DELIVERIES_ACTION};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            BrazeInternal.INSTANCE.performPushDeliveryFlush(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onReceive$lambda$0(Intent intent) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("BrazeFlushPushDeliveryReceiver received intent: ", intent.getAction());
    }
}
