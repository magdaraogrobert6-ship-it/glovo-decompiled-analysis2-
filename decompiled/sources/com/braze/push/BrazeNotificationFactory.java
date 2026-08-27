package com.braze.push;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getEnterdhqQ8s;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public class BrazeNotificationFactory implements IBrazeNotificationFactory {
    public static final Companion Companion = new Companion(null);
    private static final BrazeNotificationFactory internalInstance = new BrazeNotificationFactory();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final BrazeNotificationFactory getInstance() {
            return BrazeNotificationFactory.internalInstance;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populateNotificationBuilder$lambda$1() {
            return "BrazeNotificationPayload has null context. Not creating notification";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populateNotificationBuilder$lambda$2() {
            return "BrazeNotificationPayload has null app configuration provider. Not creating notification";
        }

        public final getEnterdhqQ8s populateNotificationBuilder(BrazeNotificationPayload brazeNotificationPayload) {
            brazeNotificationPayload.getClass();
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeNotificationUtils$$ExternalSyntheticLambda34(brazeNotificationPayload, 1), 6, (Object) null);
            Context context = brazeNotificationPayload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(14), 7, (Object) null);
                return null;
            }
            BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
            if (configurationProvider == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(15), 7, (Object) null);
                return null;
            }
            Bundle notificationExtras = brazeNotificationPayload.getNotificationExtras();
            BrazeNotificationUtils.prefetchBitmapsIfNewlyReceivedStoryPush(brazeNotificationPayload);
            getEnterdhqQ8s getenterdhqq8s = new getEnterdhqQ8s(context, BrazeNotificationUtils.getOrCreateNotificationChannelId(brazeNotificationPayload));
            getenterdhqq8s.write(16, true);
            BrazeNotificationUtils.setTitleIfPresent(getenterdhqq8s, brazeNotificationPayload);
            BrazeNotificationUtils.setContentIfPresent(getenterdhqq8s, brazeNotificationPayload);
            BrazeNotificationUtils.setTickerIfPresent(getenterdhqq8s, brazeNotificationPayload);
            BrazeNotificationUtils.setSetShowWhen(getenterdhqq8s, brazeNotificationPayload);
            BrazeNotificationUtils.setContentIntentIfPresent(context, getenterdhqq8s, notificationExtras);
            BrazeNotificationUtils.setDeleteIntent(context, getenterdhqq8s, notificationExtras);
            BrazeNotificationUtils.setSmallIcon(configurationProvider, getenterdhqq8s);
            BrazeNotificationUtils.setLargeIconIfPresentAndSupported(getenterdhqq8s, brazeNotificationPayload);
            BrazeNotificationUtils.setSoundIfPresentAndSupported(getenterdhqq8s, brazeNotificationPayload);
            BrazeNotificationUtils.setSummaryTextIfPresentAndSupported(getenterdhqq8s, brazeNotificationPayload);
            BrazeNotificationUtils.setPriorityIfPresentAndSupported(getenterdhqq8s, brazeNotificationPayload);
            BrazeNotificationStyleFactory.Companion.setStyleIfSupported(getenterdhqq8s, brazeNotificationPayload);
            BrazeNotificationActionUtils.addNotificationActions(getenterdhqq8s, brazeNotificationPayload);
            BrazeNotificationUtils.setAccentColorIfPresentAndSupported(getenterdhqq8s, brazeNotificationPayload);
            BrazeNotificationUtils.setCategoryIfPresentAndSupported(getenterdhqq8s, brazeNotificationPayload);
            BrazeNotificationUtils.setVisibilityIfPresentAndSupported(getenterdhqq8s, brazeNotificationPayload);
            BrazeNotificationUtils.setPublicVersionIfPresentAndSupported(getenterdhqq8s, brazeNotificationPayload);
            BrazeNotificationUtils.setNotificationBadgeNumberIfPresent(getenterdhqq8s, brazeNotificationPayload);
            return getenterdhqq8s;
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String populateNotificationBuilder$lambda$0(BrazeNotificationPayload brazeNotificationPayload) {
            return "Using BrazeNotificationPayload: " + brazeNotificationPayload;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createNotification$lambda$0() {
        return "Notification could not be built. Returning null as created notification";
    }

    public static final BrazeNotificationFactory getInstance() {
        return Companion.getInstance();
    }

    public final getEnterdhqQ8s populateNotificationBuilder(BrazeConfigurationProvider brazeConfigurationProvider, Context context, Bundle bundle, Bundle bundle2) {
        return Companion.populateNotificationBuilder(new BrazeNotificationPayload(bundle, bundle2, context, brazeConfigurationProvider));
    }

    @Override // com.braze.IBrazeNotificationFactory
    public Notification createNotification(BrazeNotificationPayload brazeNotificationPayload) {
        brazeNotificationPayload.getClass();
        getEnterdhqQ8s getenterdhqq8sPopulateNotificationBuilder = Companion.populateNotificationBuilder(brazeNotificationPayload);
        if (getenterdhqq8sPopulateNotificationBuilder != null) {
            return getenterdhqq8sPopulateNotificationBuilder.write();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeHuaweiPushHandler$$ExternalSyntheticLambda1(13), 6, (Object) null);
        return null;
    }

    public static final getEnterdhqQ8s populateNotificationBuilder(BrazeNotificationPayload brazeNotificationPayload) {
        return Companion.populateNotificationBuilder(brazeNotificationPayload);
    }

    public final Notification createNotification(BrazeConfigurationProvider brazeConfigurationProvider, Context context, Bundle bundle, Bundle bundle2) {
        return createNotification(new BrazeNotificationPayload(bundle, bundle2, context, brazeConfigurationProvider));
    }
}
