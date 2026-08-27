package com.braze.push;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.ig$$ExternalSyntheticLambda1;
import bo.app.n$$ExternalSyntheticLambda0;
import bo.app.n$$ExternalSyntheticLambda2;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import o.FocusListener;
import o.displayInAppMessagelambda6;
import o.displayInAppMessagelambda9;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public class BrazePushReceiver extends BroadcastReceiver {
    private static final String ADM_ERROR_DESCRIPTION_KEY = "error_description";
    private static final String ADM_ERROR_KEY = "error";
    private static final String ADM_RECEIVE_INTENT_ACTION = "com.amazon.device.messaging.intent.RECEIVE";
    private static final String ADM_REGISTRATION_ID_KEY = "registration_id";
    private static final String ADM_REGISTRATION_INTENT_ACTION = "com.amazon.device.messaging.intent.REGISTRATION";
    private static final String ADM_UNREGISTERED_KEY = "unregistered";
    public static final Companion Companion = new Companion(null);
    private static final String DELETED_MESSAGES_KEY = "deleted_messages";
    public static final String FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION = "firebase_messaging_service_routing_action";
    public static final String HMS_PUSH_SERVICE_ROUTING_ACTION = "hms_push_service_routing_action";
    private static final String MESSAGE_TYPE_KEY = "message_type";
    private static final String NUMBER_OF_MESSAGES_DELETED_KEY = "total_deleted";

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$1() {
            return "ADM enabled in braze.xml. Continuing to process ADM registration intent.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$2() {
            return "ADM not enabled in braze.xml. Ignoring ADM registration intent. Note: you must set com_braze_push_adm_messaging_registration_enabled to true in your braze.xml to enable ADM.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$1(String str) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Registering for ADM messages with registrationId: ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$2(String str) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("The device was un-registered from ADM: ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$3() {
            return "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.";
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
        
            if (r10.equals(com.braze.push.BrazePushReceiver.HMS_PUSH_SERVICE_ROUTING_ACTION) == false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (r10.equals(com.braze.push.BrazePushReceiver.ADM_RECEIVE_INTENT_ACTION) == false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
        
            if (r10.equals(com.braze.Constants.BRAZE_STORY_TRAVERSE_CLICKED_ACTION) == false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
        
            if (r10.equals(com.braze.push.BrazePushReceiver.FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION) == false) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
        
            r9.handlePushNotificationPayload(r11, r12);
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static final void handlePush$performWork(java.lang.String r10, android.content.Context r11, android.content.Intent r12, android.content.Context r13) {
            /*
                Method dump skipped, instruction units count: 250
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.push.BrazePushReceiver.Companion.handlePush$performWork(java.lang.String, android.content.Context, android.content.Intent, android.content.Context):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$performWork$lambda$2() {
            return "Received a message not sent from Braze. Ignoring the message.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$0() {
            return "Not handling non-Braze push message.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$10() {
            return "Notification created by notification factory was null. Not displaying notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$12() {
            return "POST_NOTIFICATIONS permission has not been granted. Not posting notification.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$14() {
            return "Received silent push notification";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$3() {
            return "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$5() {
            return "Bypassing push display due to test in-app message presence and eager test in-app message display configuration setting.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$6() {
            return "Received visible push notification";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$7() {
            return "Push stories not supported on Amazon devices.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$8() {
            return "Received the initial Push Story notification.";
        }

        public final boolean handleAdmRegistrationIntent(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
            String stringExtra = intent.getStringExtra("error");
            String stringExtra2 = intent.getStringExtra(BrazePushReceiver.ADM_ERROR_DESCRIPTION_KEY);
            String stringExtra3 = intent.getStringExtra(BrazePushReceiver.ADM_REGISTRATION_ID_KEY);
            String stringExtra4 = intent.getStringExtra(BrazePushReceiver.ADM_UNREGISTERED_KEY);
            int i = 1;
            if (stringExtra != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda1(stringExtra, stringExtra2, 27), 6, (Object) null);
            } else if (stringExtra3 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(stringExtra3, 20), 6, (Object) null);
                Braze.Companion.getInstance(context).setRegisteredPushToken(stringExtra3);
            } else {
                if (stringExtra4 == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazePushReceiver$Companion$$ExternalSyntheticLambda1(i), 6, (Object) null);
                    return false;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(stringExtra4, 21), 6, (Object) null);
            }
            return true;
        }

        public final BrazeNotificationPayload createPayload(Context context, BrazeConfigurationProvider brazeConfigurationProvider, Bundle bundle, Bundle bundle2) {
            context.getClass();
            brazeConfigurationProvider.getClass();
            bundle.getClass();
            bundle2.getClass();
            return Constants.isAmazonDevice() ? new BrazeNotificationPayload(bundle, BrazeNotificationPayload.Companion.getAttachedBrazeExtras(bundle), context, brazeConfigurationProvider) : new BrazeNotificationPayload(bundle, bundle2, context, brazeConfigurationProvider);
        }

        public final boolean handleAdmRegistrationEventIfEnabled(BrazeConfigurationProvider brazeConfigurationProvider, Context context, Intent intent) {
            brazeConfigurationProvider.getClass();
            context.getClass();
            intent.getClass();
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda2(2, intent), 6, (Object) null);
            if (!Constants.isAmazonDevice() || !brazeConfigurationProvider.isAdmMessagingRegistrationEnabled()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(29), 6, (Object) null);
                return false;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(28), 7, (Object) null);
            handleAdmRegistrationIntent(context, intent);
            return true;
        }

        public final void handleReceivedIntent(Context context, Intent intent, boolean z) {
            context.getClass();
            intent.getClass();
            if (z) {
                BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new BrazePushReceiver$Companion$handleReceivedIntent$1(context, intent, null), 3);
            } else {
                handlePush(context, intent);
            }
        }

        public final void logNotificationMetadata$android_sdk_ui_release(Context context, BrazeNotificationPayload brazeNotificationPayload) {
            String campaignId;
            context.getClass();
            brazeNotificationPayload.getClass();
            if (brazeNotificationPayload.isPushDeliveryEnabled() && (campaignId = brazeNotificationPayload.getCampaignId()) != null) {
                long flushMinMinutes = brazeNotificationPayload.getFlushMinMinutes();
                if (flushMinMinutes < 0) {
                    flushMinMinutes = 0;
                }
                long flushMaxMinutes = brazeNotificationPayload.getFlushMaxMinutes();
                if (flushMaxMinutes < flushMinMinutes) {
                    flushMaxMinutes = flushMinMinutes;
                }
                TimeUnit timeUnit = TimeUnit.MINUTES;
                long millis = timeUnit.toMillis(flushMinMinutes);
                if (flushMaxMinutes > flushMinMinutes) {
                    displayInAppMessagelambda6 displayinappmessagelambda6 = displayInAppMessagelambda9.write;
                    millis = displayInAppMessagelambda9.serializer.write(millis, timeUnit.toMillis(flushMaxMinutes));
                }
                BrazeInternal.INSTANCE.logPushDelivery(context, campaignId, millis);
            }
            String campaignId2 = brazeNotificationPayload.getCampaignId();
            if (campaignId2 != null) {
                BrazeInternal.INSTANCE.logPushCampaign(context, campaignId2);
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationEventIfEnabled$lambda$0(Intent intent) {
            return "Received ADM registration. Message: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleAdmRegistrationIntent$lambda$0(String str, String str2) {
            return af$$ExternalSyntheticOutline0.m("Error during ADM registration: ", str, " description: ", str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handlePush(Context context, Intent intent) {
            Context applicationContext = context.getApplicationContext();
            String action = intent.getAction();
            try {
                handlePush$performWork(action, applicationContext, intent, context);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(action, 22, intent), 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$lambda$3(String str, Intent intent) {
            return "Caught exception while performing the push notification handling work. Action: " + str + " Intent: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$performWork$lambda$0(Intent intent) {
            return "Received broadcast message. Message: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePush$performWork$lambda$1(Intent intent) {
            return "Push action is null. Not handling intent: " + intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$1(int i) {
            return d$$ExternalSyntheticOutline0.m(i, "Firebase messaging 'total_deleted' reports ", " messages.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$2(Bundle bundle) {
            return "Push message payload received: " + bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$4$0(String str) {
            return ff$$ExternalSyntheticOutline0.m("Push with identifier '", str, "' has already been seen. Not displaying or forwarding push.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$9(BrazeNotificationPayload brazeNotificationPayload) {
            return "Creating notification with payload:\n" + brazeNotificationPayload;
        }

        /* JADX WARN: Code duplicated, block: B:45:0x017c  */
        public final boolean handlePushNotificationPayload(Context context, Intent intent) {
            int i;
            context.getClass();
            intent.getClass();
            int i2 = 24;
            if (!BrazeNotificationUtils.isBrazePushMessage(intent)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(i2), 7, (Object) null);
                return false;
            }
            if (BrazePushReceiver.DELETED_MESSAGES_KEY.equals(intent.getStringExtra("message_type"))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(intent.getIntExtra(BrazePushReceiver.NUMBER_OF_MESSAGES_DELETED_KEY, -1), i2), 6, (Object) null);
                return false;
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return false;
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.I;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda3(extras, 2), 6, (Object) null);
            Bundle attachedBrazeExtras = BrazeNotificationPayload.Companion.getAttachedBrazeExtras(extras);
            extras.putBundle(Constants.BRAZE_PUSH_EXTRAS_KEY, attachedBrazeExtras);
            if (!extras.containsKey(Constants.BRAZE_PUSH_RECEIVED_TIMESTAMP_MILLIS)) {
                extras.putLong(Constants.BRAZE_PUSH_RECEIVED_TIMESTAMP_MILLIS, DateTimeUtils.nowInMilliseconds());
            }
            BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
            BrazeConfigurationProvider configurationProvider = brazeInternal.getConfigurationProvider(context);
            BrazeNotificationPayload brazeNotificationPayloadCreatePayload = createPayload(context, configurationProvider, extras, attachedBrazeExtras);
            int i3 = 5;
            if (brazeNotificationPayloadCreatePayload.isUninstallTrackingPush()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazePushReceiver$Companion$$ExternalSyntheticLambda1(i3), 6, (Object) null);
                return false;
            }
            String pushUniqueId = brazeNotificationPayloadCreatePayload.getPushUniqueId();
            if (pushUniqueId != null && !brazeInternal.validateAndStorePushId(context, pushUniqueId)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) BrazePushReceiver.Companion, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(pushUniqueId, 22), 6, (Object) null);
                return false;
            }
            BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent(brazeNotificationPayloadCreatePayload);
            BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate(brazeNotificationPayloadCreatePayload);
            BrazeNotificationUtils.refreshBannersIfAppropriate(brazeNotificationPayloadCreatePayload);
            if (brazeNotificationPayloadCreatePayload.getShouldFetchTestTriggers() && configurationProvider.isInAppMessageTestPushEagerDisplayEnabled() && BrazeInAppMessageManager.Companion.getInstance().getActivity() != null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazePushReceiver$Companion$$ExternalSyntheticLambda1(6), 7, (Object) null);
                BrazeInternal.handleInAppMessageTestPush(context, intent);
                return false;
            }
            if (BrazeNotificationUtils.isNotificationMessage(intent)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(25), 7, (Object) null);
                int notificationId = BrazeNotificationUtils.getNotificationId(brazeNotificationPayloadCreatePayload);
                extras.putInt(Constants.BRAZE_PUSH_NOTIFICATION_ID, notificationId);
                if (brazeNotificationPayloadCreatePayload.isPushStory()) {
                    if (Constants.isAmazonDevice()) {
                        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(26), 7, (Object) null);
                        return false;
                    }
                    if (!extras.containsKey(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED)) {
                        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda4(27), 7, (Object) null);
                        extras.putBoolean(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED, true);
                    }
                }
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda34(brazeNotificationPayloadCreatePayload, 2), 6, (Object) null);
                Notification notificationCreateNotification = BrazeNotificationUtils.getActiveNotificationFactory().createNotification(brazeNotificationPayloadCreatePayload);
                if (notificationCreateNotification == null) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazePushReceiver$Companion$$ExternalSyntheticLambda1(0), 7, (Object) null);
                    return false;
                }
                NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
                notificationManagerCompatFrom.getClass();
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda7(5, notificationManagerCompatFrom), 7, (Object) null);
                if (FocusListener.write(context, "android.permission.POST_NOTIFICATIONS") == 0) {
                    notificationManagerCompatFrom.notify(Constants.BRAZE_PUSH_NOTIFICATION_TAG, notificationId, notificationCreateNotification);
                    i = notificationId;
                } else {
                    i = notificationId;
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazePushReceiver$Companion$$ExternalSyntheticLambda1(3), 7, (Object) null);
                }
                BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, brazeNotificationPayloadCreatePayload);
                BrazeNotificationUtils.wakeScreenIfAppropriate(context, configurationProvider, extras);
                Integer pushDuration = brazeNotificationPayloadCreatePayload.getPushDuration();
                if (pushDuration != null) {
                    BrazeNotificationUtils.setNotificationDurationAlarm(context, BrazePushReceiver.class, i, pushDuration.intValue());
                }
                logNotificationMetadata$android_sdk_ui_release(context, brazeNotificationPayloadCreatePayload);
                return true;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazePushReceiver$Companion$$ExternalSyntheticLambda1(4), 7, (Object) null);
            BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, brazeNotificationPayloadCreatePayload);
            return false;
        }

        public static /* synthetic */ void handleReceivedIntent$default(Companion companion, Context context, Intent intent, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            companion.handleReceivedIntent(context, intent, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handlePushNotificationPayload$lambda$11(NotificationManagerCompat notificationManagerCompat) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Value of notificationManager.areNotificationsEnabled() = ", notificationManagerCompat.areNotificationsEnabled());
        }

        public final void handleReceivedIntent(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
            handleReceivedIntent$default(this, context, intent, false, 4, null);
        }
    }

    public static final BrazeNotificationPayload createPayload(Context context, BrazeConfigurationProvider brazeConfigurationProvider, Bundle bundle, Bundle bundle2) {
        return Companion.createPayload(context, brazeConfigurationProvider, bundle, bundle2);
    }

    public static final boolean handleAdmRegistrationEventIfEnabled(BrazeConfigurationProvider brazeConfigurationProvider, Context context, Intent intent) {
        return Companion.handleAdmRegistrationEventIfEnabled(brazeConfigurationProvider, context, intent);
    }

    public static final boolean handleAdmRegistrationIntent(Context context, Intent intent) {
        return Companion.handleAdmRegistrationIntent(context, intent);
    }

    public static final boolean handlePushNotificationPayload(Context context, Intent intent) {
        return Companion.handlePushNotificationPayload(context, intent);
    }

    public static final void handleReceivedIntent(Context context, Intent intent) {
        Companion.handleReceivedIntent(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        Companion.handleReceivedIntent$default(Companion, context, intent, false, 4, null);
    }

    public static final void handleReceivedIntent(Context context, Intent intent, boolean z) {
        Companion.handleReceivedIntent(context, intent, z);
    }
}
