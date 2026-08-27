package o;

import android.text.TextUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 {
    public String RemoteActionCompatParcelizer;
    public String serializer;
    public String write;

    public String RemoteActionCompatParcelizer() throws UcsException {
        if (TextUtils.isEmpty(this.serializer) || TextUtils.isEmpty(this.write)) {
            MapboxMap$$ExternalSyntheticLambda0.m(2001L, "Get AppAuthtication signStr error");
            return null;
        }
        return this.serializer + "." + this.write;
    }

    public String write() throws UcsException {
        if (TextUtils.isEmpty(this.serializer) || TextUtils.isEmpty(this.write) || TextUtils.isEmpty(this.RemoteActionCompatParcelizer)) {
            MapboxMap$$ExternalSyntheticLambda0.m(2001L, "get  AppAuthtication JWS is empty...");
            return null;
        }
        return RemoteActionCompatParcelizer() + "." + this.RemoteActionCompatParcelizer;
    }

    public r8lambdaR6dAybf4g5pc5sZkFujTnBDSk IconCompatParcelizer() {
        if (this.serializer != null) {
            if (this.write != null) {
                return new r8lambdaR6dAybf4g5pc5sZkFujTnBDSk(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'version' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'name' is missing");
        return null;
    }

    public getAdmMessagingRegistrationEnabledandroid_sdk_base_release serializer() {
        if (this.serializer != null) {
            if (this.write != null) {
                return new getAdmMessagingRegistrationEnabledandroid_sdk_base_release(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'version' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'name' is missing");
        return null;
    }

    public getFirebaseCloudMessagingSenderIdKeyandroid_sdk_base_release read() {
        if (this.serializer != null) {
            if (this.write != null) {
                return new getFirebaseCloudMessagingSenderIdKeyandroid_sdk_base_release(this);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'version' is missing");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'name' is missing");
        return null;
    }
}
