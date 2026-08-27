package com.braze.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import bo.app.n$$ExternalSyntheticLambda2;
import java.util.List;
import java.util.Random;
import kotlin.LazyKt__LazyJVMKt;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class IntentUtils {
    private static final int REQUEST_CODE_MAX = 1073741823;
    private static final int REQUEST_CODE_MIN = 100000;
    public static final IntentUtils INSTANCE = new IntentUtils();
    private static final onViewDetachedFromWindowlambda1 random$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new c$$ExternalSyntheticLambda7(22));

    private IntentUtils() {
    }

    public static final int getImmutablePendingIntentFlags() {
        return 67108864;
    }

    public static final int getMutablePendingIntentFlags() {
        return Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    private final Random getRandom() {
        return (Random) random$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    public static final int getRequestCode() {
        return INSTANCE.getRandom().nextInt(REQUEST_CODE_MAX) + 100000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Random random_delegate$lambda$0() {
        return new Random();
    }

    public static final void addComponentAndSendBroadcast(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        List<ResolveInfo> listQueryBroadcastReceivers = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryBroadcastReceivers(intent, PackageManager.ResolveInfoFlags.of(0L)) : context.getPackageManager().queryBroadcastReceivers(intent, 0);
        listQueryBroadcastReceivers.getClass();
        for (ResolveInfo resolveInfo : listQueryBroadcastReceivers) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setComponent(componentName);
            context.sendBroadcast(intent2);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(componentName, 26, intent2), 6, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addComponentAndSendBroadcast$lambda$0$0(ComponentName componentName, Intent intent) {
        return "Sent intent with component " + componentName + " and explicit intent " + intent;
    }
}
