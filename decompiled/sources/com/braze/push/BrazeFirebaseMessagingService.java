package com.braze.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.ig$$ExternalSyntheticLambda1;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ImageKt;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public class BrazeFirebaseMessagingService extends FirebaseMessagingService {
    private static final String CONTEXT_ATTACH_METHOD = "attachBaseContext";
    public static final Companion Companion = new Companion(null);
    private static final String FCM_SERVICE_OMR_METHOD = "onMessageReceived";

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$1(String str) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Fallback FCM service enabled. Attempting to use fallback class at ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$2() {
            return "Fallback FCM service enabled but classpath is null. Not routing to any fallback service.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$3() {
            return "FallbackFirebaseMessagingService is not enabled";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleOnNewToken$lambda$0(String str) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("No configured API key, not registering token in handleOnNewToken. Token: ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleOnNewToken$lambda$1(String str) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Automatic FirebaseMessagingService.onNewToken() registration disabled, not registering token: ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleOnNewToken$lambda$2(String str) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Registering Firebase push token in handleOnNewToken. Token: ", str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$3() {
            return "Could not find attachBaseContext. Not doing anything.";
        }

        public final void invokeFallbackFirebaseService$android_sdk_ui_release(String str, RemoteMessage remoteMessage, Context context) {
            str.getClass();
            remoteMessage.getClass();
            context.getClass();
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            Object objConstructObjectQuietly$default = ReflectionUtils.constructObjectQuietly$default(reflectionUtils, str, null, null, 6, null);
            if (objConstructObjectQuietly$default == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(str, 7), 7, (Object) null);
                return;
            }
            Method declaredMethodQuietly = reflectionUtils.getDeclaredMethodQuietly(str, BrazeFirebaseMessagingService.CONTEXT_ATTACH_METHOD, Context.class);
            if (declaredMethodQuietly == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(4), 7, (Object) null);
                return;
            }
            int i = 1;
            declaredMethodQuietly.setAccessible(true);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(str, 8), 7, (Object) null);
            if (!((Boolean) ReflectionUtils.invokeMethodQuietly(objConstructObjectQuietly$default, declaredMethodQuietly, context).serializer).booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(str, 9), 7, (Object) null);
                return;
            }
            Method methodQuietly = ReflectionUtils.getMethodQuietly(str, BrazeFirebaseMessagingService.FCM_SERVICE_OMR_METHOD, (Class<?>[]) new Class[]{RemoteMessage.class});
            if (methodQuietly == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(str, i), 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(str, 2), 7, (Object) null);
                ((Boolean) ReflectionUtils.invokeMethodQuietly(objConstructObjectQuietly$default, methodQuietly, remoteMessage).serializer).getClass();
            }
        }

        public final boolean isBrazePushNotification(RemoteMessage remoteMessage) {
            remoteMessage.getClass();
            Map map = remoteMessage.read();
            map.getClass();
            return "true".equals(((ImageKt) map).get(Constants.BRAZE_PUSH_BRAZE_KEY));
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$0(RemoteMessage remoteMessage) {
            return "Remote message did not originate from Braze. Not consuming remote message: " + remoteMessage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$4(Map map) {
            return "Got remote message from FCM: " + map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String handleBrazeRemoteMessage$lambda$5(String str, String str2) {
            return af$$ExternalSyntheticOutline0.m("Adding bundle item from FCM remote data with key: ", str, " and value: ", str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$0(String str) {
            return ff$$ExternalSyntheticOutline0.m("Fallback firebase messaging service ", str, " could not be constructed. Not routing fallback RemoteMessage.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$1(String str) {
            return ff$$ExternalSyntheticOutline0.m("Attempting to call ", str, " attachBaseContext");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$2(String str) {
            return ff$$ExternalSyntheticOutline0.m("Failure invoking ", str, ".attachBaseContext. Not doing anything.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$4(String str) {
            return ff$$ExternalSyntheticOutline0.m("Fallback firebase messaging service method ", str, ".onMessageReceived could not be retrieved. Not routing fallback RemoteMessage.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeFallbackFirebaseService$lambda$5(String str) {
            return ff$$ExternalSyntheticOutline0.m("Attempting to invoke firebase messaging fallback service ", str, ".onMessageReceived");
        }

        public final boolean handleBrazeRemoteMessage(Context context, RemoteMessage remoteMessage) {
            context.getClass();
            remoteMessage.getClass();
            if (!isBrazePushNotification(remoteMessage)) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.I;
                int i = 2;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda7(i, remoteMessage), 6, (Object) null);
                BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
                if (configurationProvider.isFallbackFirebaseMessagingServiceEnabled()) {
                    String fallbackFirebaseMessagingServiceClasspath = configurationProvider.getFallbackFirebaseMessagingServiceClasspath();
                    if (fallbackFirebaseMessagingServiceClasspath != null) {
                        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(fallbackFirebaseMessagingServiceClasspath, 6), 6, (Object) null);
                        invokeFallbackFirebaseService$android_sdk_ui_release(fallbackFirebaseMessagingServiceClasspath, remoteMessage, context);
                        return false;
                    }
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(i), 7, (Object) null);
                    return false;
                }
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(3), 7, (Object) null);
                return false;
            }
            Map map = remoteMessage.read();
            map.getClass();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda0(map, 1), 6, (Object) null);
            Intent intent = new Intent(BrazePushReceiver.FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION);
            Bundle bundle = new Bundle();
            for (Map.Entry entry : ((ImageKt) map).entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda1(str, str2, 25), 6, (Object) null);
                bundle.putString(str, str2);
            }
            intent.putExtras(bundle);
            BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.Companion, context, intent, false, 4, null);
            return true;
        }

        public final void handleOnNewToken(Context context, String str) {
            context.getClass();
            str.getClass();
            BrazeInternal.applyPendingRuntimeConfiguration(context);
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            Braze.Companion companion = Braze.Companion;
            String configuredApiKey = companion.getConfiguredApiKey(configurationProvider);
            if (configuredApiKey != null && configuredApiKey.length() != 0) {
                if (!configurationProvider.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(str, 4), 6, (Object) null);
                    return;
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(str, 5), 6, (Object) null);
                    companion.getInstance(context).setRegisteredPushToken(str);
                    return;
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda1(str, 3), 6, (Object) null);
        }
    }

    public static final boolean handleBrazeRemoteMessage(Context context, RemoteMessage remoteMessage) {
        return Companion.handleBrazeRemoteMessage(context, remoteMessage);
    }

    public static final void handleOnNewToken(Context context, String str) {
        Companion.handleOnNewToken(context, str);
    }

    public static final boolean isBrazePushNotification(RemoteMessage remoteMessage) {
        return Companion.isBrazePushNotification(remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        remoteMessage.getClass();
        Companion.handleBrazeRemoteMessage(this, remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        str.getClass();
        Companion.handleOnNewToken(this, str);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
