package com.braze.push;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import androidx.core.graphics.drawable.IconCompat;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.ig$$ExternalSyntheticLambda1;
import bo.app.n$$ExternalSyntheticLambda0;
import coil3.util.UtilsKt;
import com.braze.Braze;
import com.braze.Braze$$ExternalSyntheticLambda48;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.Channel;
import com.braze.events.BrazePushEvent;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import com.braze.support.PermissionUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.support.UriUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.getEnterdhqQ8s;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeNotificationUtils {
    private static final String SOURCE_KEY = "source";
    public static final BrazeNotificationUtils INSTANCE = new BrazeNotificationUtils();
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BrazeNotificationUtils.class);

    private BrazeNotificationUtils() {
    }

    public static final boolean isValidNotificationVisibility(int i) {
        return i == -1 || i == 0 || i == 1;
    }

    public enum BrazeNotificationBroadcastType {
        OPENED(BrazePushEventType.NOTIFICATION_OPENED),
        RECEIVED(BrazePushEventType.NOTIFICATION_RECEIVED),
        DELETED(BrazePushEventType.NOTIFICATION_DELETED);

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
        private final BrazePushEventType brazePushEventType;

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }

        public final BrazePushEventType getBrazePushEventType() {
            return this.brazePushEventType;
        }

        BrazeNotificationBroadcastType(BrazePushEventType brazePushEventType) {
            this.brazePushEventType = brazePushEventType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cancelNotification$lambda$0(int i) {
        return c8$$ExternalSyntheticOutline0.m(i, "Cancelling notification action with id: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cancelNotification$lambda$1() {
        return "Exception occurred attempting to cancel notification.";
    }

    public static final IBrazeNotificationFactory getActiveNotificationFactory() {
        IBrazeNotificationFactory customBrazeNotificationFactory = Braze.Companion.getCustomBrazeNotificationFactory();
        return customBrazeNotificationFactory == null ? BrazeNotificationFactory.Companion.getInstance() : customBrazeNotificationFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNotificationId$lambda$3(int i) {
        return c8$$ExternalSyntheticOutline0.m(i, "Message without notification id provided in the extras bundle received. Using a hash of the message: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOrCreateNotificationChannelId$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Found notification channel in extras with id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOrCreateNotificationChannelId$lambda$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Notification channel from extras is invalid. No channel found with id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOrCreateNotificationChannelId$lambda$2() {
        return "Braze default notification channel does not exist on device. Creating default channel.";
    }

    private final PendingIntent getPushActionPendingIntent(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(str).setClass(context, NotificationTrampolineActivity.class);
        intent.getClass();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824);
        activity.getClass();
        return activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$0() {
        return "Notification extras bundle was null. Could not find a valid notification channel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Found notification channel in extras with id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$2(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Notification channel from extras is invalid, no channel found with id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getValidNotificationChannel$lambda$3() {
        return "Braze default notification channel does not exist on device.";
    }

    public static final void handleCancelNotificationAction(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        try {
            if (intent.hasExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID)) {
                int intExtra = intent.getIntExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, -1);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(intExtra, 23), 7, (Object) null);
                Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
                systemService.getClass();
                ((NotificationManager) systemService).cancel(Constants.BRAZE_PUSH_NOTIFICATION_TAG, intExtra);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(19), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCancelNotificationAction$lambda$0(int i) {
        return c8$$ExternalSyntheticOutline0.m(i, "Cancelling notification action with id: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCancelNotificationAction$lambda$1() {
        return "Exception occurred handling cancel notification intent.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationDeleted$lambda$0() {
        return "Sending notification deleted broadcast";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationDeleted$lambda$1() {
        return "Exception occurred attempting to handle notification delete intent.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationOpened$lambda$0() {
        return "Not handling deep links automatically, skipping deep link handling";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleNotificationOpened$lambda$1() {
        return "Exception occurred attempting to handle notification opened intent.";
    }

    public static final void handlePushStoryPageClicked(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        try {
            Braze.Companion.getInstance(context).logPushStoryPageClicked(intent.getStringExtra(Constants.BRAZE_CAMPAIGN_ID), intent.getStringExtra(Constants.BRAZE_STORY_PAGE_ID));
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            int intExtra = intent.getIntExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, 0);
            if (configurationProvider.getDoesPushStoryDismissOnClick() && intExtra != 0) {
                cancelNotification(context, intExtra);
            }
            String stringExtra = intent.getStringExtra(Constants.BRAZE_ACTION_URI_KEY);
            if (stringExtra == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) stringExtra)) {
                intent.removeExtra("uri");
            } else {
                intent.putExtra("uri", intent.getStringExtra(Constants.BRAZE_ACTION_URI_KEY));
                String stringExtra2 = intent.getStringExtra(Constants.BRAZE_ACTION_USE_WEBVIEW_KEY);
                if (stringExtra2 != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) stringExtra2)) {
                    intent.putExtra(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY, stringExtra2);
                }
            }
            sendNotificationOpenedBroadcast(context, intent);
            if (configurationProvider.getDoesHandlePushDeepLinksAutomatically()) {
                routeUserWithNotificationOpenedIntent(context, intent);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(stringExtra, 16), 6, (Object) null);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(19), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handlePushStoryPageClicked$lambda$1() {
        return "Caught exception while handling story click.";
    }

    public static final boolean isUninstallTrackingPush(Bundle bundle) {
        bundle.getClass();
        try {
            if (bundle.containsKey(Constants.BRAZE_PUSH_UNINSTALL_TRACKING_KEY)) {
                return true;
            }
            Bundle bundle2 = bundle.getBundle(Constants.BRAZE_PUSH_EXTRAS_KEY);
            if (bundle2 != null) {
                return bundle2.containsKey(Constants.BRAZE_PUSH_UNINSTALL_TRACKING_KEY);
            }
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(18), 4, (Object) null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isUninstallTrackingPush$lambda$0() {
        return "Failed to determine if push is uninstall tracking. Returning false.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logBaiduNotificationClick$lambda$0() {
        return "customContentString was null. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logBaiduNotificationClick$lambda$1() {
        return "Cannot log baidu click with null context. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logBaiduNotificationClick$lambda$2(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Caught an exception processing customContentString: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prefetchBitmapsIfNewlyReceivedStoryPush$lambda$1$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Pre-fetching bitmap at URL: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshBannersIfAppropriate$lambda$0() {
        return "Banners refresh key was true. Refreshing Banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshBannersIfAppropriate$lambda$1() {
        return "Banners refresh key not included in push payload or false. Not refreshing banners.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlagsIfAppropriate$lambda$0() {
        return "Feature flag refresh key was true. Refreshing feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String refreshFeatureFlagsIfAppropriate$lambda$1() {
        return "Feature flag refresh key not included in push payload or false. Not refreshing feature flags.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$0() {
        return "routeUserWithNotificationOpenedIntent called with Intent";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$1() {
        return "routeUserWithNotificationOpenedIntent called with BrazePushEvent";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendNotificationOpenedBroadcast$lambda$0() {
        return "Sending notification opened broadcast";
    }

    private final void sendPushActionIntent(Context context, BrazeNotificationBroadcastType brazeNotificationBroadcastType, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload) {
        Intent intent;
        int i = WhenMappings.$EnumSwitchMapping$0[brazeNotificationBroadcastType.ordinal()];
        int i2 = 1;
        if (i == 1) {
            intent = new Intent(Constants.BRAZE_PUSH_INTENT_NOTIFICATION_OPENED).setPackage(context.getPackageName());
            intent.getClass();
        } else if (i == 2) {
            intent = new Intent(Constants.BRAZE_PUSH_INTENT_NOTIFICATION_RECEIVED).setPackage(context.getPackageName());
            intent.getClass();
        } else if (i != 3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return;
        } else {
            intent = new Intent(Constants.BRAZE_PUSH_INTENT_NOTIFICATION_DELETED).setPackage(context.getPackageName());
            intent.getClass();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda7(i2, brazeNotificationBroadcastType), 6, (Object) null);
        sendPushActionIntent(context, intent, bundle);
        if (brazeNotificationPayload != null) {
            BrazeInternal.INSTANCE.publishBrazePushAction(context, brazeNotificationBroadcastType.getBrazePushEventType(), brazeNotificationPayload);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendPushMessageReceivedBroadcast$lambda$0() {
        return "Sending push message received broadcast";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAccentColorIfPresentAndSupported$lambda$0() {
        return "Using accent color for notification from extras bundle";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAccentColorIfPresentAndSupported$lambda$1$0() {
        return "Using default accent color for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCategoryIfPresentAndSupported$lambda$0() {
        return "Setting category for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCategoryIfPresentAndSupported$lambda$1() {
        return "Category not present in notification extras. Not setting category for notification.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setContentIfPresent$lambda$0() {
        return "Setting content for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setContentIntentIfPresent$lambda$0() {
        return "Error setting content intent.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDeleteIntent$lambda$0() {
        return "Error setting delete intent.";
    }

    public static final boolean setLargeIconIfPresentAndSupported(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
        BrazeConfigurationProvider configurationProvider;
        getenterdhqq8s.getClass();
        brazeNotificationPayload.getClass();
        if (brazeNotificationPayload.isPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(13), 7, (Object) null);
            return false;
        }
        Context context = brazeNotificationPayload.getContext();
        if (context == null || (configurationProvider = brazeNotificationPayload.getConfigurationProvider()) == null) {
            return false;
        }
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(14), 7, (Object) null);
            String largeIcon = brazeNotificationPayload.getLargeIcon();
            IconCompat iconCompat = null;
            if (largeIcon != null) {
                Bitmap pushBitmapFromUrl = Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, null, largeIcon, BrazeViewBounds.NOTIFICATION_LARGE_ICON);
                if (pushBitmapFromUrl != null) {
                    iconCompat = new IconCompat(1);
                    iconCompat.IconCompatParcelizer = pushBitmapFromUrl;
                }
                getenterdhqq8s.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = iconCompat;
                return true;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(15), 7, (Object) null);
            int largeNotificationIconResourceId = configurationProvider.getLargeNotificationIconResourceId();
            if (largeNotificationIconResourceId == 0) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(16), 7, (Object) null);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(18), 7, (Object) null);
                return false;
            }
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), largeNotificationIconResourceId);
            if (bitmapDecodeResource != null) {
                iconCompat = new IconCompat(1);
                iconCompat.IconCompatParcelizer = bitmapDecodeResource;
            }
            getenterdhqq8s.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = iconCompat;
            return true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(17), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$0() {
        return "Large icon not supported in story push.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$1() {
        return "Setting large icon for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$3() {
        return "Large icon bitmap url not present in extras. Attempting to use resource id instead.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$4() {
        return "Large icon resource id not present for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$5() {
        return "Error setting large notification icon";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargeIconIfPresentAndSupported$lambda$6() {
        return "Large icon not set for notification";
    }

    private static final String setNotificationBadgeNumberIfPresent$lambda$0() {
        return "Notification badge number not supported on this android version. Not setting badge number for notification.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPriorityIfPresentAndSupported$lambda$0() {
        return "Setting priority for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSetShowWhen$lambda$0() {
        return "Set show when not supported in story push.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSmallIcon$lambda$0() {
        return "Small notification icon resource was not found. Will use the app icon when displaying notifications.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSmallIcon$lambda$1() {
        return "Setting small icon for notification via resource id";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSoundIfPresentAndSupported$lambda$0() {
        return "Setting default sound for notification.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSoundIfPresentAndSupported$lambda$1() {
        return "Setting sound for notification via uri.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSummaryTextIfPresentAndSupported$lambda$0() {
        return "Setting summary text for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSummaryTextIfPresentAndSupported$lambda$1() {
        return "Summary text not present. Not setting summary text for notification.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setTickerIfPresent$lambda$0() {
        return "Setting ticker for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setTitleIfPresent$lambda$0() {
        return "Setting title for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setVisibilityIfPresentAndSupported$lambda$0() {
        return "Setting visibility for notification";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$0() {
        return "Not waking this TV UI mode device";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$1() {
        return "Failed to check for TV status during screen wake. Continuing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$2() {
        return "Not waking screen on Android O+ device, could not find notification channel.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$4() {
        return "Waking screen for notification";
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrazeNotificationBroadcastType.values().length];
            try {
                iArr[BrazeNotificationBroadcastType.OPENED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrazeNotificationBroadcastType.RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrazeNotificationBroadcastType.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void cancelNotification(Context context, int i) {
        context.getClass();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(i, 22), 7, (Object) null);
            Intent intent = new Intent(Constants.BRAZE_CANCEL_NOTIFICATION_ACTION).setClass(context, getNotificationReceiverClass());
            intent.getClass();
            intent.setPackage(context.getPackageName());
            intent.putExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, i);
            IntentUtils.addComponentAndSendBroadcast(context, intent);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(6), 4, (Object) null);
        }
    }

    public static final int getNotificationId(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.getClass();
        Integer customNotificationId = brazeNotificationPayload.getCustomNotificationId();
        if (customNotificationId != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda14(customNotificationId, 0), 7, (Object) null);
            return customNotificationId.intValue();
        }
        String titleText = brazeNotificationPayload.getTitleText();
        if (titleText == null) {
            titleText = "";
        }
        String contentText = brazeNotificationPayload.getContentText();
        if (contentText != null) {
            titleText = ((Object) titleText) + contentText;
        }
        int iHashCode = titleText.hashCode();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(iHashCode, 20), 7, (Object) null);
        return iHashCode;
    }

    public static final int getNotificationPriority(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.getClass();
        Integer notificationPriorityInt = brazeNotificationPayload.getNotificationPriorityInt();
        Integer notificationPriorityInt2 = brazeNotificationPayload.getNotificationPriorityInt();
        if (notificationPriorityInt2 == null) {
            return 0;
        }
        int iIntValue = notificationPriorityInt2.intValue();
        if (-2 <= iIntValue && iIntValue < 3) {
            return iIntValue;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda14(notificationPriorityInt, 1), 6, (Object) null);
        return 0;
    }

    public static final String getOrCreateNotificationChannelId(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.getClass();
        String notificationChannelId = brazeNotificationPayload.getNotificationChannelId();
        Context context = brazeNotificationPayload.getContext();
        BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
        Object systemService = context != null ? context.getSystemService(RemoteMessageConst.NOTIFICATION) : null;
        systemService.getClass();
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationChannelId != null) {
            if (notificationManager.getNotificationChannel(notificationChannelId) != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(notificationChannelId, 18), 7, (Object) null);
                return notificationChannelId;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(notificationChannelId, 19), 7, (Object) null);
        }
        if (notificationManager.getNotificationChannel(Constants.BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID) == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(21), 7, (Object) null);
            NotificationChannel notificationChannel = new NotificationChannel(Constants.BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID, configurationProvider != null ? configurationProvider.getDefaultNotificationChannelName() : null, 3);
            notificationChannel.setDescription(configurationProvider != null ? configurationProvider.getDefaultNotificationChannelDescription() : null);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return Constants.BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID;
    }

    public static final void handleContentCardsSerializedCardIfPresent(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.getClass();
        String contentCardSyncData = brazeNotificationPayload.getContentCardSyncData();
        String contentCardSyncUserId = brazeNotificationPayload.getContentCardSyncUserId();
        Context context = brazeNotificationPayload.getContext();
        if (contentCardSyncData == null || context == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda1(contentCardSyncUserId, contentCardSyncData, 26), 7, (Object) null);
        BrazeInternal.addSerializedContentCardToStorage(context, contentCardSyncData, contentCardSyncUserId);
    }

    public static final void handleNotificationDeleted(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(28), 7, (Object) null);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.DELETED, extras, null, 8, null);
            } else {
                brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.DELETED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(29), 4, (Object) null);
        }
    }

    public static final void handleNotificationOpened(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        try {
            Braze.Companion.getInstance(context).logPushNotificationOpened(intent);
            sendNotificationOpenedBroadcast(context, intent);
            if (BrazeInternal.INSTANCE.getConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                routeUserWithNotificationOpenedIntent(context, intent);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(2), 6, (Object) null);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(3), 4, (Object) null);
        }
    }

    public static final boolean isBrazePushMessage(Intent intent) {
        intent.getClass();
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        return "true".equalsIgnoreCase(extras.getString(Constants.BRAZE_PUSH_BRAZE_KEY));
    }

    public static final boolean isNotificationMessage(Intent intent) {
        intent.getClass();
        Bundle extras = intent.getExtras();
        return extras != null && extras.containsKey(Constants.BRAZE_PUSH_TITLE_KEY) && extras.containsKey(Constants.BRAZE_PUSH_CONTENT_KEY);
    }

    public static final void prefetchBitmapsIfNewlyReceivedStoryPush(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.getClass();
        Context context = brazeNotificationPayload.getContext();
        if (context != null && brazeNotificationPayload.isPushStory() && brazeNotificationPayload.isNewlyReceivedPushStory()) {
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = brazeNotificationPayload.getPushStoryPages();
            ArrayList<String> arrayList = new ArrayList();
            Iterator<T> it = pushStoryPages.iterator();
            while (it.hasNext()) {
                String bitmapUrl = ((BrazeNotificationPayload.PushStoryPage) it.next()).getBitmapUrl();
                if (bitmapUrl != null) {
                    arrayList.add(bitmapUrl);
                }
            }
            for (String str : arrayList) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(str, 17), 6, (Object) null);
                Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, brazeNotificationPayload.getBrazeExtras(), str, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            }
            brazeNotificationPayload.setNewlyReceivedPushStory(false);
        }
    }

    public static final boolean refreshBannersIfAppropriate(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.getClass();
        Context context = brazeNotificationPayload.getContext();
        if (!brazeNotificationPayload.getShouldRefreshBanners() || context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(22), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(21), 7, (Object) null);
        BrazeInternal.refreshBanners(context);
        return true;
    }

    public static final boolean refreshFeatureFlagsIfAppropriate(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.getClass();
        Context context = brazeNotificationPayload.getContext();
        if (!brazeNotificationPayload.getShouldRefreshFeatureFlags() || context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(13), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(12), 7, (Object) null);
        BrazeInternal.refreshFeatureFlags(context);
        return true;
    }

    public static final void routeUserWithNotificationOpenedIntent(Context context, BrazePushEvent brazePushEvent) {
        context.getClass();
        brazePushEvent.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(20), 7, (Object) null);
        Bundle brazeExtras = brazePushEvent.getNotificationPayload().getBrazeExtras();
        brazeExtras.putString(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, brazePushEvent.getNotificationPayload().getCampaignId());
        brazeExtras.putString(SOURCE_KEY, "Appboy");
        String deeplink = brazePushEvent.getNotificationPayload().getDeeplink();
        Boolean useWebView = brazePushEvent.getNotificationPayload().getUseWebView();
        brazeNotificationUtils.routeUserWithNotificationOpenedIntent$android_sdk_ui_release(context, brazeExtras, deeplink, useWebView != null ? useWebView.booleanValue() : false);
    }

    public static final void sendNotificationOpenedBroadcast(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(6), 7, (Object) null);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.OPENED, extras, null, 8, null);
        } else {
            brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.OPENED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
        }
    }

    public static final void sendPushMessageReceivedBroadcast(Context context, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload) {
        context.getClass();
        bundle.getClass();
        brazeNotificationPayload.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(24), 7, (Object) null);
        brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.RECEIVED, bundle, brazeNotificationPayload);
    }

    public static final void setAccentColorIfPresentAndSupported(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
        getenterdhqq8s.getClass();
        brazeNotificationPayload.getClass();
        Integer accentColor = brazeNotificationPayload.getAccentColor();
        if (accentColor != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(7), 7, (Object) null);
            getenterdhqq8s.MediaSessionCompatQueueItem = accentColor.intValue();
            return;
        }
        BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
        if (configurationProvider != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(8), 7, (Object) null);
            getenterdhqq8s.MediaSessionCompatQueueItem = configurationProvider.getDefaultNotificationAccentColor();
        }
    }

    public static final void setCategoryIfPresentAndSupported(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
        getenterdhqq8s.getClass();
        brazeNotificationPayload.getClass();
        String notificationCategory = brazeNotificationPayload.getNotificationCategory();
        if (notificationCategory == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(26), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(25), 7, (Object) null);
            getenterdhqq8s.read = notificationCategory;
        }
    }

    public static final void setContentIfPresent(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
        BrazeConfigurationProvider configurationProvider;
        getenterdhqq8s.getClass();
        brazeNotificationPayload.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(23), 7, (Object) null);
        String contentText = brazeNotificationPayload.getContentText();
        if (contentText == null || (configurationProvider = brazeNotificationPayload.getConfigurationProvider()) == null) {
            return;
        }
        getenterdhqq8s.RemoteActionCompatParcelizer(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
    }

    public static final void setContentIntentIfPresent(Context context, getEnterdhqQ8s getenterdhqq8s, Bundle bundle) {
        context.getClass();
        getenterdhqq8s.getClass();
        try {
            getenterdhqq8s.MediaMetadataCompat = INSTANCE.getPushActionPendingIntent(context, Constants.BRAZE_PUSH_CLICKED_ACTION, bundle);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(9), 4, (Object) null);
        }
    }

    public static final void setDeleteIntent(Context context, getEnterdhqQ8s getenterdhqq8s, Bundle bundle) {
        context.getClass();
        getenterdhqq8s.getClass();
        try {
            Intent intent = new Intent(Constants.BRAZE_PUSH_DELETED_ACTION).setClass(context, getNotificationReceiverClass());
            intent.getClass();
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            getenterdhqq8s.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.deleteIntent = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(0), 4, (Object) null);
        }
    }

    public static final void setNotificationBadgeNumberIfPresent(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
        getenterdhqq8s.getClass();
        brazeNotificationPayload.getClass();
        Integer notificationBadgeNumber = brazeNotificationPayload.getNotificationBadgeNumber();
        if (notificationBadgeNumber != null) {
            getenterdhqq8s.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = notificationBadgeNumber.intValue();
        }
    }

    public static final void setPriorityIfPresentAndSupported(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
        getenterdhqq8s.getClass();
        brazeNotificationPayload.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(23), 7, (Object) null);
        getenterdhqq8s.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = getNotificationPriority(brazeNotificationPayload);
    }

    public static final void setPublicVersionIfPresentAndSupported(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
        getenterdhqq8s.getClass();
        brazeNotificationPayload.getClass();
        Context context = brazeNotificationPayload.getContext();
        BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
        if (context == null || brazeNotificationPayload.getPublicNotificationExtras() == null || configurationProvider == null) {
            return;
        }
        String orCreateNotificationChannelId = getOrCreateNotificationChannelId(brazeNotificationPayload);
        Bundle jsonObjectIntoBundle = JsonUtils.parseJsonObjectIntoBundle(brazeNotificationPayload.getPublicNotificationExtras());
        if (jsonObjectIntoBundle.isEmpty()) {
            return;
        }
        BrazeNotificationPayload brazeNotificationPayload2 = new BrazeNotificationPayload(jsonObjectIntoBundle, null, context, configurationProvider, 2, null);
        getEnterdhqQ8s getenterdhqq8s2 = new getEnterdhqQ8s(context, orCreateNotificationChannelId);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda34(brazeNotificationPayload2, 0), 7, (Object) null);
        setContentIfPresent(getenterdhqq8s2, brazeNotificationPayload2);
        setTitleIfPresent(getenterdhqq8s2, brazeNotificationPayload2);
        setSummaryTextIfPresentAndSupported(getenterdhqq8s2, brazeNotificationPayload2);
        setSmallIcon(configurationProvider, getenterdhqq8s2);
        setAccentColorIfPresentAndSupported(getenterdhqq8s2, brazeNotificationPayload2);
        getenterdhqq8s.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getenterdhqq8s2.write();
    }

    public static final void setSetShowWhen(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
        getenterdhqq8s.getClass();
        brazeNotificationPayload.getClass();
        if (brazeNotificationPayload.isPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(9), 7, (Object) null);
            getenterdhqq8s.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = false;
        }
    }

    public static final int setSmallIcon(BrazeConfigurationProvider brazeConfigurationProvider, getEnterdhqQ8s getenterdhqq8s) {
        brazeConfigurationProvider.getClass();
        getenterdhqq8s.getClass();
        int smallNotificationIconResourceId = brazeConfigurationProvider.getSmallNotificationIconResourceId();
        if (smallNotificationIconResourceId == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(7), 7, (Object) null);
            smallNotificationIconResourceId = brazeConfigurationProvider.getApplicationIconResourceId();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(8), 7, (Object) null);
        }
        getenterdhqq8s.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.icon = smallNotificationIconResourceId;
        return smallNotificationIconResourceId;
    }

    public static final void setSoundIfPresentAndSupported(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
        getenterdhqq8s.getClass();
        brazeNotificationPayload.getClass();
        String notificationSound = brazeNotificationPayload.getNotificationSound();
        if (notificationSound == null) {
            return;
        }
        if (notificationSound.equals(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(16), 7, (Object) null);
            getenterdhqq8s.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.defaults = 1;
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(17), 7, (Object) null);
            getenterdhqq8s.write(Uri.parse(notificationSound));
        }
    }

    public static final void setSummaryTextIfPresentAndSupported(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
        getenterdhqq8s.getClass();
        brazeNotificationPayload.getClass();
        String summaryText = brazeNotificationPayload.getSummaryText();
        if (summaryText == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(5), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(4), 7, (Object) null);
            getenterdhqq8s.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = getEnterdhqQ8s.serializer((CharSequence) summaryText);
        }
    }

    public static final void setTickerIfPresent(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
        getenterdhqq8s.getClass();
        brazeNotificationPayload.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(1), 7, (Object) null);
        String titleText = brazeNotificationPayload.getTitleText();
        if (titleText == null) {
            return;
        }
        getenterdhqq8s.serializer(titleText);
    }

    public static final void setTitleIfPresent(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
        BrazeConfigurationProvider configurationProvider;
        getenterdhqq8s.getClass();
        brazeNotificationPayload.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(10), 7, (Object) null);
        String titleText = brazeNotificationPayload.getTitleText();
        if (titleText == null || (configurationProvider = brazeNotificationPayload.getConfigurationProvider()) == null) {
            return;
        }
        getenterdhqq8s.read(HtmlUtils.getHtmlSpannedTextIfEnabled(titleText, configurationProvider));
    }

    public static final void setVisibilityIfPresentAndSupported(getEnterdhqQ8s getenterdhqq8s, BrazeNotificationPayload brazeNotificationPayload) {
        getenterdhqq8s.getClass();
        brazeNotificationPayload.getClass();
        Integer notificationVisibility = brazeNotificationPayload.getNotificationVisibility();
        if (notificationVisibility != null) {
            if (!isValidNotificationVisibility(notificationVisibility.intValue())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda14(notificationVisibility, 2), 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(27), 7, (Object) null);
                getenterdhqq8s.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = notificationVisibility.intValue();
            }
        }
    }

    @SuppressLint
    public static final boolean wakeScreenIfAppropriate(BrazeNotificationPayload brazeNotificationPayload) {
        BrazeConfigurationProvider configurationProvider;
        brazeNotificationPayload.getClass();
        Context context = brazeNotificationPayload.getContext();
        int i = 0;
        if (context != null && (configurationProvider = brazeNotificationPayload.getConfigurationProvider()) != null) {
            Bundle notificationExtras = brazeNotificationPayload.getNotificationExtras();
            if (PermissionUtils.hasPermission(context, "android.permission.WAKE_LOCK") && configurationProvider.isPushWakeScreenForNotificationEnabled()) {
                try {
                    Object systemService = context.getSystemService("uimode");
                    systemService.getClass();
                    if (((UiModeManager) systemService).getCurrentModeType() == 4) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(i), 7, (Object) null);
                        return false;
                    }
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(12), 4, (Object) null);
                }
                Object systemService2 = context.getSystemService(RemoteMessageConst.NOTIFICATION);
                systemService2.getClass();
                NotificationChannel validNotificationChannel = getValidNotificationChannel((NotificationManager) systemService2, notificationExtras);
                if (validNotificationChannel == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(20), 7, (Object) null);
                    return false;
                }
                if (validNotificationChannel.getImportance() == 1) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda7(i, validNotificationChannel), 7, (Object) null);
                    return false;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(22), 7, (Object) null);
                Object systemService3 = context.getSystemService("power");
                systemService3.getClass();
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService3).newWakeLock(268435482, TAG);
                wakeLockNewWakeLock.acquire();
                wakeLockNewWakeLock.release();
                return true;
            }
        }
        return false;
    }

    public final void routeUserWithNotificationOpenedIntent$android_sdk_ui_release(Context context, Bundle bundle, String str, boolean z) {
        context.getClass();
        bundle.getClass();
        Braze.Companion companion = Braze.Companion;
        if (companion.isDelayedInitializationEnabled() || str == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            Intent mainActivityIntent = UriUtils.getMainActivityIntent(context, bundle);
            context.startActivity(mainActivityIntent);
            int i = 0;
            if (companion.isDelayedInitializationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(str, i), 7, (Object) null);
                return;
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda2(i, mainActivityIntent), 7, (Object) null);
                return;
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$$ExternalSyntheticLambda48(str, 2, z), 7, (Object) null);
        bundle.putString("uri", str);
        bundle.putBoolean(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY, z);
        BrazeDeeplinkHandler.Companion companion2 = BrazeDeeplinkHandler.Companion;
        UriAction uriActionCreateUriActionFromUrlString = companion2.getInstance().createUriActionFromUrlString(str, bundle, z, Channel.PUSH);
        if (uriActionCreateUriActionFromUrlString != null) {
            companion2.getInstance().gotoUri(context, uriActionCreateUriActionFromUrlString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNotificationId$lambda$0(Integer num) {
        return "Using notification id provided in the message's extras bundle: " + num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getNotificationPriority$lambda$0$0(Integer num) {
        return "Received invalid notification priority " + num;
    }

    @TargetApi
    public static final NotificationChannel getValidNotificationChannel(NotificationManager notificationManager, Bundle bundle) {
        notificationManager.getClass();
        int i = 14;
        if (bundle == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(i), 7, (Object) null);
            return null;
        }
        String string = bundle.getString(Constants.BRAZE_PUSH_NOTIFICATION_CHANNEL_ID_KEY, null);
        int i2 = 15;
        if (string != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string)) {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(string);
            if (notificationChannel != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(string, i), 7, (Object) null);
                return notificationChannel;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(string, i2), 7, (Object) null);
        }
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(Constants.BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID);
        if (notificationChannel2 != null) {
            return notificationChannel2;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(i2), 7, (Object) null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleContentCardsSerializedCardIfPresent$lambda$0(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("Push contains associated Content Cards card. User id: ", str, " Card data: ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handlePushStoryPageClicked$lambda$0(String str) {
        return ff$$ExternalSyntheticOutline0.m("Not handling deep links automatically, skipping deep link handling for '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$2(String str) {
        return ff$$ExternalSyntheticOutline0.m("Delayed initialization is enabled. Deep link:", str, " will not be handled.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$3(Intent intent) {
        return "Push notification had no deep link. Opening main activity:" + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String routeUserWithNotificationOpenedIntent$lambda$4(String str, boolean z) {
        return "Found a deep link:" + str + ". Use webview set to:" + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendPushActionIntent$lambda$0(BrazeNotificationBroadcastType brazeNotificationBroadcastType) {
        return "Sending Braze broadcast receiver intent for " + brazeNotificationBroadcastType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sendPushActionIntent$lambda$1(Intent intent) {
        return "Sending push action intent: " + intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setNotificationDurationAlarm$lambda$0(int i) {
        return d$$ExternalSyntheticOutline0.m(i, "Setting Notification duration alarm for ", " ms");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPublicVersionIfPresentAndSupported$lambda$0(BrazeNotificationPayload brazeNotificationPayload) {
        return "Setting public version of notification with payload: " + brazeNotificationPayload;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setVisibilityIfPresentAndSupported$lambda$1(Integer num) {
        return "Received invalid notification visibility " + num;
    }

    public static /* synthetic */ void sendPushActionIntent$default(BrazeNotificationUtils brazeNotificationUtils, Context context, BrazeNotificationBroadcastType brazeNotificationBroadcastType, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload, int i, Object obj) {
        if ((i & 8) != 0) {
            brazeNotificationPayload = null;
        }
        brazeNotificationUtils.sendPushActionIntent(context, brazeNotificationBroadcastType, bundle, brazeNotificationPayload);
    }

    public static final void setNotificationDurationAlarm(Context context, Class<?> cls, int i, int i2) {
        context.getClass();
        Intent intent = new Intent(context, cls);
        intent.setAction(Constants.BRAZE_CANCEL_NOTIFICATION_ACTION);
        intent.putExtra(Constants.BRAZE_PUSH_NOTIFICATION_ID, i);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 134217728);
        Object systemService = context.getSystemService("alarm");
        systemService.getClass();
        AlarmManager alarmManager = (AlarmManager) systemService;
        if (i2 >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(i2, 21), 7, (Object) null);
            alarmManager.set(3, SystemClock.elapsedRealtime() + ((long) i2), broadcast);
        }
    }

    public static final void logBaiduNotificationClick(Context context, String str) {
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(10), 6, (Object) null);
            return;
        }
        if (context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda0(11), 6, (Object) null);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optionalString = JsonUtils.getOptionalString(jSONObject, SOURCE_KEY);
            String optionalString2 = JsonUtils.getOptionalString(jSONObject, Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
            if (optionalString == null || !optionalString.equals("Appboy") || optionalString2 == null) {
                return;
            }
            Braze.Companion.getInstance(context).logPushNotificationOpened(optionalString2);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(str, 13), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wakeScreenIfAppropriate$lambda$3(NotificationChannel notificationChannel) {
        return c8$$ExternalSyntheticOutline0.m(notificationChannel.getImportance(), "Not acquiring wake-lock for Android O+ notification with importance: ");
    }

    public static final Class<?> getNotificationReceiverClass() {
        return Constants.isAmazonDevice() ? BrazeAmazonDeviceMessagingReceiver.class : BrazePushReceiver.class;
    }

    public static final void routeUserWithNotificationOpenedIntent(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(11), 7, (Object) null);
        Bundle bundleExtra = intent.getBundleExtra(Constants.BRAZE_PUSH_EXTRAS_KEY);
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        bundleExtra.putString(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, intent.getStringExtra(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY));
        bundleExtra.putString(SOURCE_KEY, "Appboy");
        brazeNotificationUtils.routeUserWithNotificationOpenedIntent$android_sdk_ui_release(context, bundleExtra, intent.getStringExtra("uri"), "true".equalsIgnoreCase(intent.getStringExtra(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY)));
    }

    private final void sendPushActionIntent(Context context, Intent intent, Bundle bundle) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda2(1, intent), 6, (Object) null);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        IntentUtils.addComponentAndSendBroadcast(context, intent);
    }

    public static final boolean wakeScreenIfAppropriate(Context context, BrazeConfigurationProvider brazeConfigurationProvider, Bundle bundle) {
        context.getClass();
        brazeConfigurationProvider.getClass();
        return wakeScreenIfAppropriate(new BrazeNotificationPayload(bundle, null, context, brazeConfigurationProvider, 2, null));
    }
}
