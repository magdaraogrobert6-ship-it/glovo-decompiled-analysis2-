package com.braze;

import com.braze.configuration.BrazeConfig;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.configuration.CachedConfigurationProvider;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.location.BrazeActionReceiver;
import com.braze.location.BrazeInternalLocationApi;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeUser$$ExternalSyntheticLambda3 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BrazeUser$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return BrazeUser.removeFromSubscriptionGroup$lambda$0();
            case 1:
                return BrazeUser.unsetLocationCustomAttribute$lambda$0();
            case 2:
                return BrazeUser.setLastName$lambda$0();
            case 3:
                return BrazeUser.setHomeCity$lambda$0();
            case 4:
                return BrazeUser.setAttributionData$lambda$0();
            case 5:
                return BrazeUser.setLastKnownLocation$lambda$0();
            case 6:
                return BrazeUser.setLineId$lambda$0();
            case 7:
                return BrazeUser.addAlias$lambda$0();
            case 8:
                return BrazeUser.addAlias$lambda$1();
            case 9:
                return BrazeUser.setEmail$lambda$0();
            case 10:
                return BrazeUser.removeFromCustomAttributeArray$lambda$0();
            case 11:
                return BrazeConfig.Builder.setFirebaseCloudMessagingSenderIdKey$lambda$0();
            case 12:
                return BrazeConfig.Builder.setApiKey$lambda$0();
            case 13:
                return BrazeConfig.Builder.setDefaultNotificationChannelName$lambda$0();
            case 14:
                return BrazeConfig.Builder.setDefaultNotificationChannelDescription$lambda$0();
            case 15:
                return BrazeConfigurationProvider._get_versionCode_$lambda$0();
            case 16:
                return BrazeConfigurationProvider._get_defaultNotificationAccentColor_$lambda$0();
            case 17:
                return BrazeConfigurationProvider._get_ephemeralEventKeys_$lambda$0();
            case 18:
                return BrazeConfigurationProvider._get_sdkFlavor_$lambda$0();
            case 19:
                return CachedConfigurationProvider.resetCache$lambda$0();
            case 20:
                return RuntimeAppConfigurationProvider.clearAllConfigurationValues$lambda$0();
            case 21:
                return BrazeCoroutineScope.cancelChildren$lambda$0();
            case 22:
                return DefaultBrazeImageLoader.renderUrlIntoView$lambda$0();
            case 23:
                return DefaultBrazeImageLoader.getBitmapFromUrl$lambda$0();
            case 24:
                return DefaultBrazeImageLoader.getBitmapFromUrl$lambda$2();
            case 25:
                return BrazeActionReceiver.onReceive$lambda$0();
            case 26:
                return BrazeActionReceiver.onReceive$lambda$1();
            case 27:
                return BrazeActionReceiver.ActionReceiver.performWork$lambda$1();
            case 28:
                return BrazeActionReceiver.ActionReceiver.Companion.handleSingleLocationUpdate$lambda$0();
            default:
                return BrazeInternalLocationApi.requestSingleLocationUpdate$lambda$0();
        }
    }
}
