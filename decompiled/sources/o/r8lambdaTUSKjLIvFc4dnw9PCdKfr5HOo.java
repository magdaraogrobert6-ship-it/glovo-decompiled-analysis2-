package o;

import android.app.ActivityManager;
import com.deliveryhero.fwf_http.ConstantKt;
import com.sentiance.sdk.services.ServiceForegroundState;
import com.sentiance.sdk.services.ServiceManager;
import com.sentiance.sdk.services.ServiceType;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdaTUSKjLIvFc4dnw9PCdKfr5HOo implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    final /* synthetic */ Object RemoteActionCompatParcelizer;

    public /* synthetic */ r8lambdaTUSKjLIvFc4dnw9PCdKfr5HOo(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Boolean boolValueOf;
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            ((r8lambdaGV766sOYYCl0YYkk8QccVU5zR38) this.RemoteActionCompatParcelizer).IconCompatParcelizer();
            return;
        }
        if (i != 1) {
            if (i != 2) {
                ((r8lambdaVxZSrIVgVkdNY1DpHLobPElLXfE) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
                return;
            }
            ((ServiceManager) setPushUniqueId.read(ServiceManager.class)).read(ServiceType.FOREGROUND);
            ((r8lambdaVxZSrIVgVkdNY1DpHLobPElLXfE) setPushUniqueId.read(r8lambdaVxZSrIVgVkdNY1DpHLobPElLXfE.class)).write(((r8lambdaGV766sOYYCl0YYkk8QccVU5zR38) this.RemoteActionCompatParcelizer).getClass());
            ((ServiceManager) setPushUniqueId.read(ServiceManager.class)).write(":ServiceAbort");
            return;
        }
        synchronized (((r8lambdaGV766sOYYCl0YYkk8QccVU5zR38) this.RemoteActionCompatParcelizer)) {
            if (((r8lambdaGV766sOYYCl0YYkk8QccVU5zR38) this.RemoteActionCompatParcelizer).RatingCompat) {
                return;
            }
            r8lambdaGV766sOYYCl0YYkk8QccVU5zR38 r8lambdagv766soyycl0yykk8qccvu5zr38 = (r8lambdaGV766sOYYCl0YYkk8QccVU5zR38) this.RemoteActionCompatParcelizer;
            migrateBannerStorageToJsonlambda3 migratebannerstoragetojsonlambda3 = (migrateBannerStorageToJsonlambda3) setPushUniqueId.IconCompatParcelizer(migrateBannerStorageToJsonlambda3.class);
            ActivityManager activityManager = (ActivityManager) setPushUniqueId.IconCompatParcelizer(ActivityManager.class);
            if (migratebannerstoragetojsonlambda3 == null || activityManager == null) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(migrateBannerStorageToJsonlambda3.serializer(activityManager, r8lambdagv766soyycl0yykk8qccvu5zr38.getClass()) == ServiceForegroundState.FOREGROUNDED);
            }
            Boolean bool = Boolean.FALSE;
            if (boolValueOf == null) {
                boolValueOf = bool;
            }
            if (boolValueOf.booleanValue()) {
                return;
            }
            ((r8lambdaGV766sOYYCl0YYkk8QccVU5zR38) this.RemoteActionCompatParcelizer).MediaSessionCompatQueueItem();
            containsandroid_sdk_base_release containsandroid_sdk_base_releaseVarWrite = ((readList) setPushUniqueId.read(readList.class)).write();
            synchronized (((r8lambdaGV766sOYYCl0YYkk8QccVU5zR38) this.RemoteActionCompatParcelizer)) {
                if (!((r8lambdaGV766sOYYCl0YYkk8QccVU5zR38) this.RemoteActionCompatParcelizer).RatingCompat) {
                    containsandroid_sdk_base_releaseVarWrite.IconCompatParcelizer(this, ConstantKt.DEFAULT_REQUEST_TIMEOUT);
                }
            }
        }
    }
}
