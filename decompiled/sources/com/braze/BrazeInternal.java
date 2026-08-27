package com.braze;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import bo.app.d0;
import bo.app.g0;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.GeofenceTransitionType;
import com.braze.events.BannerDismissedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.models.IBrazeLocation;
import com.braze.models.push.BrazeNotificationPayload;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeInternal {
    public static final BrazeInternal INSTANCE = new BrazeInternal();

    private BrazeInternal() {
    }

    private final Braze getInstance(Context context) {
        return Braze.Companion.getInstance(context);
    }

    public static final void addSerializedContentCardToStorage(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        INSTANCE.getInstance(context).addSerializedCardJsonToStorage$android_sdk_base_release(str, str2);
    }

    public static final void applyPendingRuntimeConfiguration(Context context) {
        context.getClass();
        INSTANCE.getInstance(context).applyPendingRuntimeConfiguration$android_sdk_base_release();
    }

    public static final void handleInAppMessageTestPush(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        INSTANCE.getInstance(context).handleInAppMessageTestPush$android_sdk_base_release(intent);
    }

    public static final void logLocationRecordedEvent(Context context, IBrazeLocation iBrazeLocation) {
        context.getClass();
        iBrazeLocation.getClass();
        INSTANCE.getInstance(context).logLocationRecordedEventFromLocationUpdate$android_sdk_base_release(iBrazeLocation);
    }

    public static final void recordGeofenceTransition(Context context, String str, GeofenceTransitionType geofenceTransitionType) {
        context.getClass();
        str.getClass();
        geofenceTransitionType.getClass();
        INSTANCE.getInstance(context).recordGeofenceTransition$android_sdk_base_release(str, geofenceTransitionType);
    }

    public static final void refreshBanners(Context context) {
        context.getClass();
        INSTANCE.getInstance(context).handleInternalBannerRefresh$android_sdk_base_release();
    }

    public static final void refreshFeatureFlags(Context context) {
        context.getClass();
        INSTANCE.getInstance(context).refreshFeatureFlags();
    }

    public static final void requestGeofenceRefresh(Context context, IBrazeLocation iBrazeLocation) {
        context.getClass();
        iBrazeLocation.getClass();
        INSTANCE.getInstance(context).requestGeofenceRefresh$android_sdk_base_release(iBrazeLocation);
    }

    public static final void retryInAppMessage(Context context, InAppMessageEvent inAppMessageEvent) {
        context.getClass();
        inAppMessageEvent.getClass();
        INSTANCE.getInstance(context).retryInAppMessage$android_sdk_base_release(inAppMessageEvent);
    }

    public final void addBannerViewMonitor(String str, View view, boolean z) {
        str.getClass();
        view.getClass();
        d0 d0Var = g0.i;
        d0.a(str, view, z);
    }

    public final void deleteRegisteredGeofenceCache(Context context) {
        context.getClass();
        getInstance(context).deleteRegisteredGeofenceCache$android_sdk_base_release();
    }

    public final BrazeConfigurationProvider getConfigurationProvider(Context context) {
        context.getClass();
        return getInstance(context).getConfigurationProviderSafe$android_sdk_base_release(context);
    }

    public final /* synthetic */ void logPushCampaign(Context context, String str) {
        context.getClass();
        str.getClass();
        getInstance(context).logPushMaxCampaign$android_sdk_base_release(str);
    }

    public final /* synthetic */ void logPushDelivery(Context context, String str, long j) {
        context.getClass();
        str.getClass();
        getInstance(context).logPushDelivery$android_sdk_base_release(str, j);
    }

    public final /* synthetic */ void performPushDeliveryFlush(Context context) {
        context.getClass();
        getInstance(context).performPushDeliveryFlush$android_sdk_base_release();
    }

    public final /* synthetic */ void publishBrazePushAction(Context context, BrazePushEventType brazePushEventType, BrazeNotificationPayload brazeNotificationPayload) {
        context.getClass();
        brazePushEventType.getClass();
        brazeNotificationPayload.getClass();
        getInstance(context).publishBrazePushAction$android_sdk_base_release(brazePushEventType, brazeNotificationPayload);
    }

    public final void reenqueueInAppMessage(Context context, InAppMessageEvent inAppMessageEvent) {
        context.getClass();
        inAppMessageEvent.getClass();
        getInstance(context).reenqueueInAppMessage$android_sdk_base_release(inAppMessageEvent);
    }

    public final void subscribeToBannersDismissedEvent(Context context, IEventSubscriber<BannerDismissedEvent> iEventSubscriber) {
        context.getClass();
        iEventSubscriber.getClass();
        getInstance(context).subscribeToBannersDismissedEvent$android_sdk_base_release(iEventSubscriber);
    }

    public final void unsubscribeFromBannersDismissedEvent(Context context, IEventSubscriber<BannerDismissedEvent> iEventSubscriber) {
        context.getClass();
        iEventSubscriber.getClass();
        getInstance(context).unsubscribeFromBannersDismissedEvent$android_sdk_base_release(iEventSubscriber);
    }

    public final /* synthetic */ boolean validateAndStorePushId(Context context, String str) {
        context.getClass();
        str.getClass();
        return getInstance(context).validateAndStorePushId$android_sdk_base_release(str);
    }

    public static final void requestGeofenceRefresh(Context context, boolean z) {
        context.getClass();
        INSTANCE.getInstance(context).requestGeofenceRefresh$android_sdk_base_release(z);
    }
}
