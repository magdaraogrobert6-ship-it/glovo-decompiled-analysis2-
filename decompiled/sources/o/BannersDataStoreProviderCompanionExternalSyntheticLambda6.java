package o;

import android.app.ActivityManager;
import android.app.ApplicationStartInfo;
import android.os.Build;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BannersDataStoreProviderCompanionExternalSyntheticLambda6 {
    private final ActivityManager RemoteActionCompatParcelizer;

    public BannersDataStoreProviderCompanionExternalSyntheticLambda6(ActivityManager activityManager) {
        activityManager.getClass();
        this.RemoteActionCompatParcelizer = activityManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public final migrateContentCardsStorageToJson read() {
        int reason;
        int startType;
        if (Build.VERSION.SDK_INT >= 35) {
            List historicalProcessStartReasons = this.RemoteActionCompatParcelizer.getHistoricalProcessStartReasons(1);
            historicalProcessStartReasons.getClass();
            if (historicalProcessStartReasons.isEmpty()) {
                reason = -1;
                startType = -1;
            } else {
                ApplicationStartInfo applicationStartInfoCk_ = ActivityLifecycleIntegration$$ExternalSyntheticLambda1.ck_(historicalProcessStartReasons.get(0));
                reason = applicationStartInfoCk_.getReason();
                startType = applicationStartInfoCk_.getStartType();
            }
        } else {
            reason = -1;
            startType = -1;
        }
        return new migrateContentCardsStorageToJson(reason, startType);
    }
}
