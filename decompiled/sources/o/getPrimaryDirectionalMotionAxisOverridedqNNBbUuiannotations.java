package o;

import com.google.firebase.perf.v1.ApplicationInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class getPrimaryDirectionalMotionAxisOverridedqNNBbUuiannotations extends handleMotionEvent8iAsVTc {
    public static final getWindowInfoannotations write = getWindowInfoannotations.write();
    public final ApplicationInfo RemoteActionCompatParcelizer;

    @Override // o.handleMotionEvent8iAsVTc
    public final boolean read() {
        getWindowInfoannotations getwindowinfoannotations = write;
        ApplicationInfo applicationInfo = this.RemoteActionCompatParcelizer;
        if (applicationInfo == null) {
            getwindowinfoannotations.read("ApplicationInfo is null");
        } else if (!applicationInfo.hasGoogleAppId()) {
            getwindowinfoannotations.read("GoogleAppId is null");
        } else if (!applicationInfo.hasAppInstanceId()) {
            getwindowinfoannotations.read("AppInstanceId is null");
        } else if (!applicationInfo.hasApplicationProcessState()) {
            getwindowinfoannotations.read("ApplicationProcessState is null");
        } else {
            if (!applicationInfo.hasAndroidAppInfo()) {
                return true;
            }
            if (!applicationInfo.getAndroidAppInfo().hasPackageName()) {
                getwindowinfoannotations.read("AndroidAppInfo.packageName is null");
            } else {
                if (applicationInfo.getAndroidAppInfo().hasSdkVersion()) {
                    return true;
                }
                getwindowinfoannotations.read("AndroidAppInfo.sdkVersion is null");
            }
        }
        getwindowinfoannotations.read("ApplicationInfo is invalid");
        return false;
    }

    public getPrimaryDirectionalMotionAxisOverridedqNNBbUuiannotations(ApplicationInfo applicationInfo) {
        this.RemoteActionCompatParcelizer = applicationInfo;
    }
}
