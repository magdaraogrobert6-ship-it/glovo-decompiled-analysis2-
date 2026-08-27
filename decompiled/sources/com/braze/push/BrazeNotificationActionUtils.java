package com.braze.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import java.util.List;
import o.CacheDrawModifierNodeImpl1;
import o.getEnterdhqQ8s;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeNotificationActionUtils {
    public static final BrazeNotificationActionUtils INSTANCE = new BrazeNotificationActionUtils();

    private BrazeNotificationActionUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$0() {
        return "Cannot add notification action with null context from payload";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationActions$lambda$0() {
        return "Context cannot be null when adding notification buttons.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationActions$lambda$1() {
        return "No action buttons present. Not adding notification actions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$0() {
        return "Notification action button type was blank or null. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$1() {
        return "Not handling deep links automatically, skipping deep link handling";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$2() {
        return "Unknown notification action button clicked. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationActionClicked$lambda$3() {
        return "Caught exception while handling notification action button click.";
    }

    public static final void addNotificationActions(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
        getenterdhqq8s.getClass();
        brazeNotificationPayload.getClass();
        if (brazeNotificationPayload.getContext() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(10), 7, (Object) null);
            return;
        }
        List<BrazeNotificationPayload.ActionButton> actionButtons = brazeNotificationPayload.getActionButtons();
        if (actionButtons.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(11), 7, (Object) null);
            return;
        }
        for (BrazeNotificationPayload.ActionButton actionButton : actionButtons) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationActionUtils brazeNotificationActionUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationActionUtils, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda7(3, actionButton), 6, (Object) null);
            brazeNotificationActionUtils.addNotificationAction(getenterdhqq8s, brazeNotificationPayload, actionButton);
        }
    }

    public final void addNotificationAction(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload, BrazeNotificationPayload.ActionButton actionButton) {
        PendingIntent activity;
        getenterdhqq8s.getClass();
        brazeNotificationPayload.getClass();
        actionButton.getClass();
        Context context = brazeNotificationPayload.getContext();
        if (context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(12), 7, (Object) null);
            return;
        }
        Bundle bundle = new Bundle(brazeNotificationPayload.getNotificationExtras());
        actionButton.putIntoBundle(bundle);
        String type = actionButton.getType();
        int immutablePendingIntentFlags = IntentUtils.getImmutablePendingIntentFlags() | 134217728;
        if (Constants.BRAZE_PUSH_ACTION_TYPE_NONE.equals(type)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(type, 10), 6, (Object) null);
            Intent intent = new Intent(Constants.BRAZE_ACTION_CLICKED_ACTION).setClass(context, BrazeNotificationUtils.getNotificationReceiverClass());
            intent.getClass();
            intent.putExtras(bundle);
            activity = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, immutablePendingIntentFlags);
            activity.getClass();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(type, 11), 6, (Object) null);
            Intent intent2 = new Intent(Constants.BRAZE_ACTION_CLICKED_ACTION).setClass(context, NotificationTrampolineActivity.class);
            intent2.getClass();
            intent2.setFlags(intent2.getFlags() | BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK));
            intent2.putExtras(bundle);
            activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent2, immutablePendingIntentFlags);
            activity.getClass();
        }
        CacheDrawModifierNodeImpl1 cacheDrawModifierNodeImpl1 = new CacheDrawModifierNodeImpl1(null, actionButton.getText(), activity, new Bundle());
        ((Bundle) cacheDrawModifierNodeImpl1.RatingCompat).putAll(new Bundle(bundle));
        getenterdhqq8s.serializer.add(cacheDrawModifierNodeImpl1.IconCompatParcelizer());
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda3(bundle, 1), 6, (Object) null);
    }

    public final void logNotificationActionClicked(Context context, Intent intent, String str) {
        context.getClass();
        intent.getClass();
        Braze.Companion.getInstance(context).logPushNotificationActionClicked(intent.getStringExtra(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY), intent.getStringExtra(Constants.BRAZE_ACTION_ID_KEY), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$2(String str) {
        return ff$$ExternalSyntheticOutline0.m("Adding notification action with type: ", str, " Setting intent class to trampoline activity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$3(Bundle bundle) {
        return "Added action with bundle: " + bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationActions$lambda$2(BrazeNotificationPayload.ActionButton actionButton) {
        return "Adding action button: " + actionButton;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0091 A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:3:0x000a, B:5:0x0012, B:8:0x001a, B:10:0x0028, B:18:0x003f, B:29:0x005c, B:32:0x0067, B:34:0x006d, B:36:0x0074, B:38:0x0081, B:40:0x0087, B:42:0x0094, B:44:0x00a3, B:46:0x00a7, B:41:0x0091, B:21:0x0048, B:24:0x0051, B:26:0x0055, B:48:0x00b9, B:50:0x00cc), top: B:55:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3 A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:3:0x000a, B:5:0x0012, B:8:0x001a, B:10:0x0028, B:18:0x003f, B:29:0x005c, B:32:0x0067, B:34:0x006d, B:36:0x0074, B:38:0x0081, B:40:0x0087, B:42:0x0094, B:44:0x00a3, B:46:0x00a7, B:41:0x0091, B:21:0x0048, B:24:0x0051, B:26:0x0055, B:48:0x00b9, B:50:0x00cc), top: B:55:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7 A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:3:0x000a, B:5:0x0012, B:8:0x001a, B:10:0x0028, B:18:0x003f, B:29:0x005c, B:32:0x0067, B:34:0x006d, B:36:0x0074, B:38:0x0081, B:40:0x0087, B:42:0x0094, B:44:0x00a3, B:46:0x00a7, B:41:0x0091, B:21:0x0048, B:24:0x0051, B:26:0x0055, B:48:0x00b9, B:50:0x00cc), top: B:55:0x000a }] */
    public static final void handleNotificationActionClicked(Context context, Intent intent) {
        Bundle extras;
        context.getClass();
        intent.getClass();
        try {
            String stringExtra = intent.getStringExtra(Constants.BRAZE_ACTION_TYPE_KEY);
            if (stringExtra != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) stringExtra)) {
                int intExtra = intent.getIntExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, -1);
                BrazeNotificationActionUtils brazeNotificationActionUtils = INSTANCE;
                brazeNotificationActionUtils.logNotificationActionClicked(context, intent, stringExtra);
                if (stringExtra != null) {
                    int iHashCode = stringExtra.hashCode();
                    if (iHashCode == -1424488370) {
                        if (!stringExtra.equals(Constants.BRAZE_PUSH_ACTION_TYPE_URI)) {
                        }
                        BrazeNotificationUtils.cancelNotification(context, intExtra);
                        if (stringExtra.equals(Constants.BRAZE_PUSH_ACTION_TYPE_URI)) {
                            intent.removeExtra("uri");
                        } else {
                            intent.removeExtra("uri");
                        }
                        BrazeNotificationUtils.sendNotificationOpenedBroadcast(context, intent);
                        if (BrazeInternal.INSTANCE.getConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                            BrazeNotificationUtils.routeUserWithNotificationOpenedIntent(context, intent);
                            return;
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeNotificationActionUtils, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(7), 6, (Object) null);
                            return;
                        }
                    }
                    if (iHashCode != -1209677674) {
                        if (iHashCode == -1209647192 && stringExtra.equals(Constants.BRAZE_PUSH_ACTION_TYPE_OPEN)) {
                            BrazeNotificationUtils.cancelNotification(context, intExtra);
                            if (stringExtra.equals(Constants.BRAZE_PUSH_ACTION_TYPE_URI) || (extras = intent.getExtras()) == null || !extras.containsKey(Constants.BRAZE_ACTION_URI_KEY)) {
                                intent.removeExtra("uri");
                            } else {
                                intent.putExtra("uri", intent.getStringExtra(Constants.BRAZE_ACTION_URI_KEY));
                                Bundle extras2 = intent.getExtras();
                                if (extras2 != null && extras2.containsKey(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY)) {
                                    intent.putExtra(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY, intent.getStringExtra(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY));
                                }
                            }
                            BrazeNotificationUtils.sendNotificationOpenedBroadcast(context, intent);
                            if (BrazeInternal.INSTANCE.getConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                                BrazeNotificationUtils.routeUserWithNotificationOpenedIntent(context, intent);
                                return;
                            } else {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeNotificationActionUtils, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(7), 6, (Object) null);
                                return;
                            }
                        }
                    } else if (stringExtra.equals(Constants.BRAZE_PUSH_ACTION_TYPE_NONE)) {
                        BrazeNotificationUtils.cancelNotification(context, intExtra);
                        return;
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeNotificationActionUtils, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(8), 6, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(6), 6, (Object) null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(9), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addNotificationAction$lambda$1(String str) {
        return "Adding notification action with type: " + str + "Setting intent class to notification receiver: " + BrazeNotificationUtils.getNotificationReceiverClass();
    }
}
