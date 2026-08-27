package o;

import android.app.Application;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getConfigurationProviderandroid_sdk_base_release {
    private static int IconCompatParcelizer = 0;
    private static int MediaMetadataCompat = 1;
    public static final /* synthetic */ registerInAppMessageManagerlambda2[] RemoteActionCompatParcelizer = {new accessgetInstanceLockcp(getConfigurationProviderandroid_sdk_base_release.class, "reviewConfigDataStore", "getReviewConfigDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};
    public static final FocusTransactionsKt read = DelayKt.write("vendor_review_config", null, null, 14);
    private static int serializer = 1;
    private static int write;

    static {
        int i = serializer + 15;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static final performCustomExitMxy_nc0 RemoteActionCompatParcelizer(Application application) {
        registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2;
        FocusTransactionsKt focusTransactionsKt;
        int i = 2 % 2;
        int i2 = write + 39;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            registerinappmessagemanagerlambda2 = RemoteActionCompatParcelizer[1];
            focusTransactionsKt = read;
        } else {
            registerinappmessagemanagerlambda2 = RemoteActionCompatParcelizer[0];
            focusTransactionsKt = read;
        }
        return (performCustomExitMxy_nc0) focusTransactionsKt.getValue(application, registerinappmessagemanagerlambda2);
    }
}
