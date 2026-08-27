package o;

import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class requestPushPermissionlambda0 extends createBannerWebViewClientListenerandroid_sdk_ui_release {
    public final long serializer;
    public final Date write;

    @Override // o.createBannerWebViewClientListenerandroid_sdk_ui_release
    public final long read() {
        return this.write.getTime() * 1000000;
    }

    @Override // o.createBannerWebViewClientListenerandroid_sdk_ui_release
    public final long write(createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release) {
        if (createbannerwebviewclientlistenerandroid_sdk_ui_release == null || !(createbannerwebviewclientlistenerandroid_sdk_ui_release instanceof requestPushPermissionlambda0)) {
            return super.write(createbannerwebviewclientlistenerandroid_sdk_ui_release);
        }
        requestPushPermissionlambda0 requestpushpermissionlambda0 = (requestPushPermissionlambda0) createbannerwebviewclientlistenerandroid_sdk_ui_release;
        long j = requestpushpermissionlambda0.serializer;
        int iCompareTo = compareTo(createbannerwebviewclientlistenerandroid_sdk_ui_release);
        long j2 = this.serializer;
        return iCompareTo < 0 ? read() + (j - j2) : requestpushpermissionlambda0.read() + (j2 - j);
    }

    public requestPushPermissionlambda0() {
        this(setNativeShader.serializer(), System.nanoTime());
    }

    @Override // o.createBannerWebViewClientListenerandroid_sdk_ui_release, java.lang.Comparable
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final int compareTo(createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release) {
        if (!(createbannerwebviewclientlistenerandroid_sdk_ui_release instanceof requestPushPermissionlambda0)) {
            return super.compareTo(createbannerwebviewclientlistenerandroid_sdk_ui_release);
        }
        requestPushPermissionlambda0 requestpushpermissionlambda0 = (requestPushPermissionlambda0) createbannerwebviewclientlistenerandroid_sdk_ui_release;
        long time = this.write.getTime();
        long time2 = requestpushpermissionlambda0.write.getTime();
        if (time != time2) {
            return Long.valueOf(time).compareTo(Long.valueOf(time2));
        }
        return Long.valueOf(this.serializer).compareTo(Long.valueOf(requestpushpermissionlambda0.serializer));
    }

    @Override // o.createBannerWebViewClientListenerandroid_sdk_ui_release
    public final long read(createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release) {
        return createbannerwebviewclientlistenerandroid_sdk_ui_release instanceof requestPushPermissionlambda0 ? this.serializer - ((requestPushPermissionlambda0) createbannerwebviewclientlistenerandroid_sdk_ui_release).serializer : super.read(createbannerwebviewclientlistenerandroid_sdk_ui_release);
    }

    public requestPushPermissionlambda0(Date date, long j) {
        this.write = date;
        this.serializer = j;
    }
}
