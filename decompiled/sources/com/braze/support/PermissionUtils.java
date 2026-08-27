package com.braze.support;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import bo.app.bc;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.d4$$ExternalSyntheticLambda6;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda0;
import kotlinx.coroutines.BuildersKt;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionUtils {
    private static final String NOTIFICATION_PERMISSION = "android.permission.POST_NOTIFICATIONS";
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("PermissionUtils");

    /* JADX INFO: Access modifiers changed from: private */
    public static final String hasPermission$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failure checking permission ", str);
    }

    public static final void requestPushPermissionPrompt(Activity activity) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str = TAG;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, str, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(2), 12, (Object) null);
        if (activity == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(3), 14, (Object) null);
            return;
        }
        if (!wouldPushPermissionPromptDisplay(activity) || Build.VERSION.SDK_INT < 33) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(5), 14, (Object) null);
            return;
        }
        incrementPermissionRequestCount(activity, NOTIFICATION_PERMISSION);
        BrazeLogger.brazelog$default(brazeLogger, str, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(4), 12, (Object) null);
        activity.requestPermissions(new String[]{NOTIFICATION_PERMISSION}, IntentUtils.getRequestCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$0() {
        return "Attempting to execute requestPushPermissionPrompt()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$1() {
        return "Cannot request push permission with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$2() {
        return "Permission prompt would not display, not attempting to request push permission prompt.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermissionPrompt$lambda$3() {
        return "Requesting push permission from system.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$0() {
        return "Cannot request push permission with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$3() {
        return "Notification permission already granted, doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$5() {
        return "Push Prompt can be shown on this device, within a reasonable confidence.";
    }

    public static final int getPermissionRequestCount(Context context, String str) {
        context.getClass();
        str.getClass();
        return new com.braze.storage.i(context).a(str);
    }

    public static final void incrementPermissionRequestCount(Context context, String str) {
        context.getClass();
        str.getClass();
        BuildersKt.write(new bc(new com.braze.storage.i(context), str, null));
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str, 20), 12, (Object) null);
    }

    public static final boolean wouldPushPermissionPromptDisplay(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(6), 14, (Object) null);
            return false;
        }
        if (Build.VERSION.SDK_INT < 33) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(7), 12, (Object) null);
            return false;
        }
        int i = activity.getApplicationInfo().targetSdkVersion;
        if (i < 33) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(i, 26), 12, (Object) null);
            return false;
        }
        if (hasPermission(activity, NOTIFICATION_PERMISSION)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(8), 12, (Object) null);
            return false;
        }
        int permissionRequestCount = getPermissionRequestCount(activity, NOTIFICATION_PERMISSION);
        if (permissionRequestCount >= 2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(permissionRequestCount, 25), 12, (Object) null);
            return activity.shouldShowRequestPermissionRationale(NOTIFICATION_PERMISSION);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda0(1), 12, (Object) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String incrementPermissionRequestCount$lambda$0(String str) {
        return ff$$ExternalSyntheticOutline0.m("Incremented permission request counter for ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$2(int i) {
        return d$$ExternalSyntheticOutline0.m(i, "App Target API version of ", " is too low to display push permission prompt.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$4(int i) {
        return d$$ExternalSyntheticOutline0.m(i, "Notification permission request count is ", ". Returning value of 'shouldShowRequestPermissionRationale(NOTIFICATION_PERMISSION)'");
    }

    public static final boolean hasPermission(Context context, String str) {
        str.getClass();
        if (context == null) {
            return false;
        }
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(str, 21), 8, (Object) null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wouldPushPermissionPromptDisplay$lambda$1() {
        return d$$ExternalSyntheticOutline0.m(Build.VERSION.SDK_INT, "Device API version of ", " is too low to display push permission prompt.");
    }
}
