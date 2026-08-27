package o;

import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
public final class BannerJavascriptInterface extends createBannerWebViewClientListenerandroid_sdk_ui_release {
    public final Instant serializer = Instant.now();

    @Override // o.createBannerWebViewClientListenerandroid_sdk_ui_release
    public final long read() {
        Instant instant = this.serializer;
        return (instant.getEpochSecond() * 1000000000) + ((long) instant.getNano());
    }
}
