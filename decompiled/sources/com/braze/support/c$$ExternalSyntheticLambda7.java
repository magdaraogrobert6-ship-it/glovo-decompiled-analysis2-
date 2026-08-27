package com.braze.support;

import android.os.SystemClock;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.configuration.CachedConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c$$ExternalSyntheticLambda7 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ c$$ExternalSyntheticLambda7(int i) {
        this.$r8$classId = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return c.c();
            case 1:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$7();
            case 2:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$8();
            case 3:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$9();
            case 4:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$0();
            case 5:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$1();
            case 6:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$2();
            case 7:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$3();
            case 8:
                return BrazeConfigurationProvider._get_brazeApiKey_$lambda$4();
            case 9:
                return CachedConfigurationProvider.readResourceValue$lambda$1();
            case 10:
                return DataStoreKey.keyMap_delegate$lambda$0();
            case 11:
                return BrazeGeofenceManager._init_$lambda$1();
            case 12:
                return BrazeGeofenceManager.retrieveBrazeGeofencesFromLocalStorage$lambda$0();
            case 13:
                return BrazeGeofenceManager.setUpGeofences$lambda$0();
            case 14:
                return BrazeGeofenceManager.setUpGeofences$lambda$2();
            case 15:
                return BrazeGeofenceManager._init_$lambda$0();
            case 16:
                return BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$0();
            case 17:
                return BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$1();
            case 18:
                return BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$2();
            case 19:
                return BrazeLogger.checkForSystemLogLevelProperty$lambda$0();
            case 20:
                return DateTimeUtils.nowInMilliseconds$lambda$0();
            case 21:
                return SystemClock.currentNetworkTimeClock();
            case 22:
                return IntentUtils.random_delegate$lambda$0();
            case 23:
                return StringUtils.getCacheFileSuffix$lambda$0();
            case 24:
                return j.a();
            case 25:
                return BrazeInAppMessageManager.registerInAppMessageManager$lambda$0();
            case 26:
                return BrazeInAppMessageManager.registerInAppMessageManager$lambda$2();
            case 27:
                return BrazeInAppMessageManager.registerInAppMessageManager$lambda$4$0();
            case 28:
                return BrazeInAppMessageManager.registerInAppMessageManager$lambda$5$0();
            default:
                return BrazeInAppMessageManager.registerInAppMessageManager$lambda$7();
        }
    }
}
