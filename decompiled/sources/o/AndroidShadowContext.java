package o;

import android.app.Application;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidShadowContext implements applyLayoutDirection {
    public final Application read;

    public final String write() {
        String str;
        Application application = this.read;
        try {
            str = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        str.getClass();
        return str;
    }

    public AndroidShadowContext(Application application) {
        this.read = application;
    }
}
