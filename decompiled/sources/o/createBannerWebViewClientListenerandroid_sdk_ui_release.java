package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class createBannerWebViewClientListenerandroid_sdk_ui_release implements Comparable {
    public abstract long read();

    public long write(createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release) {
        return (createbannerwebviewclientlistenerandroid_sdk_ui_release == null || compareTo(createbannerwebviewclientlistenerandroid_sdk_ui_release) >= 0) ? read() : createbannerwebviewclientlistenerandroid_sdk_ui_release.read();
    }

    public long read(createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release) {
        return read() - createbannerwebviewclientlistenerandroid_sdk_ui_release.read();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public int compareTo(createBannerWebViewClientListenerandroid_sdk_ui_release createbannerwebviewclientlistenerandroid_sdk_ui_release) {
        return Long.valueOf(read()).compareTo(Long.valueOf(createbannerwebviewclientlistenerandroid_sdk_ui_release.read()));
    }
}
