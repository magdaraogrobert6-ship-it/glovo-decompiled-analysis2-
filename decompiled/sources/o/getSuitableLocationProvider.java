package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class getSuitableLocationProvider extends setShouldOptInWhenPushAuthorizedandroid_sdk_base_release {
    final /* synthetic */ File write;

    @Override // o.setShouldOptInWhenPushAuthorizedandroid_sdk_base_release
    public final void read(r8lambdaMIqXXOzLMUUicX7GG348aw6pQE r8lambdamiqxxozlmuuicx7gg348aw6pqe) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(this.write);
        try {
            migrateMetadataToJson.IconCompatParcelizer(fileInputStream, r8lambdamiqxxozlmuuicx7gg348aw6pqe.PlaybackStateCompat());
            fileInputStream.close();
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.setShouldOptInWhenPushAuthorizedandroid_sdk_base_release
    public final isHtmlInAppMessageHtmlLinkTargetEnabled serializer() {
        try {
            return isHtmlInAppMessageHtmlLinkTargetEnabled.IconCompatParcelizer("application/octet-stream");
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public getSuitableLocationProvider(File file) {
        this.write = file;
    }

    @Override // o.setShouldOptInWhenPushAuthorizedandroid_sdk_base_release
    public final long write() {
        return this.write.length();
    }
}
