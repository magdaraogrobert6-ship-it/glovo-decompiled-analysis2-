package com.braze;

import android.app.Activity;
import android.content.Intent;
import bo.app.i0;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.BrazePushEvent;
import com.braze.events.BrazeSdkAuthenticationErrorEvent;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IValueCallback;
import com.braze.events.InAppMessageEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.events.SessionStateChangedEvent;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.Banner;
import com.braze.models.FeatureFlag;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.recommended.ecommerce.EcommerceEvent;
import java.math.BigDecimal;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface IBraze {
    <T> void addSingleSynchronousSubscription(IEventSubscriber<T> iEventSubscriber, Class<T> cls);

    void changeUser(String str);

    void changeUser(String str, String str2);

    void closeSession(Activity activity);

    Card deserializeContentCard(String str);

    Card deserializeContentCard(JSONObject jSONObject);

    IInAppMessage deserializeInAppMessageString(String str);

    void dismissBanner(String str);

    List<FeatureFlag> getAllFeatureFlags();

    Banner getBanner(String str);

    List<Card> getCachedContentCards();

    int getContentCardCount();

    int getContentCardUnviewedCount();

    long getContentCardsLastUpdatedInSecondsFromEpoch();

    BrazeUser getCurrentUser();

    void getCurrentUser(IValueCallback<BrazeUser> iValueCallback);

    String getDeviceId();

    void getDeviceIdAsync(IValueCallback<String> iValueCallback);

    FeatureFlag getFeatureFlag(String str);

    IBrazeImageLoader getImageLoader();

    String getRegisteredPushToken();

    void logBannerClick(String str, String str2);

    boolean logBannerImpression(String str);

    void logCustomEvent(String str);

    void logCustomEvent(String str, BrazeProperties brazeProperties);

    void logEcommerceEvent(EcommerceEvent ecommerceEvent);

    void logFeatureFlagImpression(String str);

    void logPurchase(String str, String str2, BigDecimal bigDecimal);

    void logPurchase(String str, String str2, BigDecimal bigDecimal, int i);

    void logPurchase(String str, String str2, BigDecimal bigDecimal, int i, BrazeProperties brazeProperties);

    void logPurchase(String str, String str2, BigDecimal bigDecimal, BrazeProperties brazeProperties);

    void logPushNotificationActionClicked(String str, String str2, String str3);

    void logPushNotificationOpened(Intent intent);

    void logPushNotificationOpened(String str);

    void logPushStoryPageClicked(String str, String str2);

    void openSession(Activity activity);

    void refreshFeatureFlags();

    <T> void removeSingleSubscription(IEventSubscriber<T> iEventSubscriber, Class<T> cls);

    void requestBannersRefresh(List<String> list);

    void requestBannersRefresh(List<String> list, IValueCallback<BannersUpdatedEvent> iValueCallback);

    void requestContentCardsRefresh();

    void requestContentCardsRefreshFromCache();

    void requestGeofences(double d, double d2);

    void requestImmediateDataFlush();

    void requestLocationInitialization();

    void setGoogleAdvertisingId(String str, boolean z);

    void setImageLoader(IBrazeImageLoader iBrazeImageLoader);

    void setRegisteredPushToken(String str);

    void setSdkAuthenticationSignature(String str);

    void subscribeToBannersErrors(IEventSubscriber<i0> iEventSubscriber);

    void subscribeToBannersUpdates(IEventSubscriber<BannersUpdatedEvent> iEventSubscriber);

    void subscribeToChangeUserEvents(IEventSubscriber<BrazeUserChangeEvent> iEventSubscriber);

    void subscribeToContentCardsUpdates(IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber);

    void subscribeToFeatureFlagsUpdates(IEventSubscriber<FeatureFlagsUpdatedEvent> iEventSubscriber);

    void subscribeToNetworkFailures(IEventSubscriber<BrazeNetworkFailureEvent> iEventSubscriber);

    void subscribeToNewInAppMessages(IEventSubscriber<InAppMessageEvent> iEventSubscriber);

    void subscribeToNoMatchingTriggerForEvent(IEventSubscriber<NoMatchingTriggerEvent> iEventSubscriber);

    void subscribeToPushNotificationEvents(IEventSubscriber<BrazePushEvent> iEventSubscriber);

    void subscribeToSdkAuthenticationFailures(IEventSubscriber<BrazeSdkAuthenticationErrorEvent> iEventSubscriber);

    void subscribeToSessionUpdates(IEventSubscriber<SessionStateChangedEvent> iEventSubscriber);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void requestBannersRefresh$default(IBraze iBraze, List list, IValueCallback iValueCallback, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                iValueCallback = null;
            }
            iBraze.requestBannersRefresh(list, iValueCallback);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: requestBannersRefresh");
    }

    static /* synthetic */ void logPurchase$default(IBraze iBraze, String str, String str2, BigDecimal bigDecimal, int i, BrazeProperties brazeProperties, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 8) != 0) {
                i = 1;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                brazeProperties = null;
            }
            iBraze.logPurchase(str, str2, bigDecimal, i3, brazeProperties);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: logPurchase");
    }
}
