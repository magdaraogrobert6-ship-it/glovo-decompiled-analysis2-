package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class setShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release extends r8lambda0S3kvX2wuurB_sOm2dk25CPetL8 {
    public final /* synthetic */ setSessionTimeoutandroid_sdk_base_release serializer;
    public final r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release(setSessionTimeoutandroid_sdk_base_release setsessiontimeoutandroid_sdk_base_release, r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ r8lambda2qd0wtxyngtmhspveumb06dloaq) {
        super("OkHttp %s", setsessiontimeoutandroid_sdk_base_release.read());
        this.serializer = setsessiontimeoutandroid_sdk_base_release;
        this.write = r8lambda2qd0wtxyngtmhspveumb06dloaq;
    }

    @Override // o.r8lambda0S3kvX2wuurB_sOm2dk25CPetL8
    public final void RemoteActionCompatParcelizer() {
        boolean z;
        IOException e;
        r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ r8lambda2qd0wtxyngtmhspveumb06dloaq = this.write;
        setSessionTimeoutandroid_sdk_base_release setsessiontimeoutandroid_sdk_base_release = this.serializer;
        setsessiontimeoutandroid_sdk_base_release.RemoteActionCompatParcelizer.MediaMetadataCompat();
        boolean z2 = false;
        try {
            try {
                z = true;
                try {
                    r8lambda2qd0wtxyngtmhspveumb06dloaq.RemoteActionCompatParcelizer(setsessiontimeoutandroid_sdk_base_release, setsessiontimeoutandroid_sdk_base_release.IconCompatParcelizer());
                    setsessiontimeoutandroid_sdk_base_release.read.IconCompatParcelizer.RemoteActionCompatParcelizer(this);
                } catch (IOException e2) {
                    e = e2;
                    IOException iOExceptionIconCompatParcelizer = setsessiontimeoutandroid_sdk_base_release.IconCompatParcelizer(e);
                    if (z) {
                        getLoggerInitialLogLevel getloggerinitialloglevel = getLoggerInitialLogLevel.RatingCompat;
                        StringBuilder sb = new StringBuilder();
                        sb.append(setsessiontimeoutandroid_sdk_base_release.IconCompatParcelizer.IconCompatParcelizer ? "canceled " : "");
                        sb.append("call to ");
                        sb.append(setsessiontimeoutandroid_sdk_base_release.read());
                        getloggerinitialloglevel.read(4, "Callback failure for ".concat(sb.toString()), iOExceptionIconCompatParcelizer);
                    } else {
                        setsessiontimeoutandroid_sdk_base_release.write.getClass();
                        r8lambda2qd0wtxyngtmhspveumb06dloaq.RemoteActionCompatParcelizer(setsessiontimeoutandroid_sdk_base_release, iOExceptionIconCompatParcelizer);
                    }
                    setsessiontimeoutandroid_sdk_base_release.read.IconCompatParcelizer.RemoteActionCompatParcelizer(this);
                } catch (Throwable th) {
                    th = th;
                    z2 = true;
                    setsessiontimeoutandroid_sdk_base_release.serializer();
                    if (!z2) {
                        r8lambda2qd0wtxyngtmhspveumb06dloaq.RemoteActionCompatParcelizer(setsessiontimeoutandroid_sdk_base_release, new IOException("canceled due to " + th));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                setsessiontimeoutandroid_sdk_base_release.read.IconCompatParcelizer.RemoteActionCompatParcelizer(this);
                throw th2;
            }
        } catch (IOException e3) {
            z = false;
            e = e3;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
