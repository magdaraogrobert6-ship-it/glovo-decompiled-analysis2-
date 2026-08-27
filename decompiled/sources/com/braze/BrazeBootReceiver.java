package com.braze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bo.app.g1;
import com.braze.support.BrazeLogger;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public class BrazeBootReceiver extends BroadcastReceiver {
    private static final String BOOT_COMPLETE_ACTION = "android.intent.action.BOOT_COMPLETED";
    public static final g1 Companion = new g1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleIncomingIntent$lambda$1() {
        return "Boot complete intent received. Initializing.";
    }

    public final boolean handleIncomingIntent(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.I;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda99(2, intent), 6, (Object) null);
        if (!BOOT_COMPLETE_ACTION.equals(intent.getAction())) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda99(3, intent), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda0(22), 6, (Object) null);
        Braze.Companion.getInstance(context);
        BrazeInternal.INSTANCE.deleteRegisteredGeofenceCache(context);
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        try {
            handleIncomingIntent(context, intent);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda99(1, intent), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleIncomingIntent$lambda$0(Intent intent) {
        return "Received broadcast message. Message: " + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleIncomingIntent$lambda$2(Intent intent) {
        return "Unknown intent " + intent + " received. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onReceive$lambda$0(Intent intent) {
        return "Failed to process incoming intent " + intent;
    }
}
