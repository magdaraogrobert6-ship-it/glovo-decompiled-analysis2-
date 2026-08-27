package o;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class requestSingleLocationUpdatelambda5 extends setShouldOptInWhenPushAuthorizedandroid_sdk_base_release {
    final /* synthetic */ InputStream RemoteActionCompatParcelizer;
    final /* synthetic */ boolean serializer;

    @Override // o.setShouldOptInWhenPushAuthorizedandroid_sdk_base_release
    public final void read(r8lambdaMIqXXOzLMUUicX7GG348aw6pQE r8lambdamiqxxozlmuuicx7gg348aw6pqe) throws IOException {
        InputStream inputStream = this.RemoteActionCompatParcelizer;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedOutputStream = this.serializer ? new BufferedOutputStream(r8lambdamiqxxozlmuuicx7gg348aw6pqe.PlaybackStateCompat()) : new BufferedOutputStream(new GZIPOutputStream(r8lambdamiqxxozlmuuicx7gg348aw6pqe.PlaybackStateCompat(), 8192));
            migrateMetadataToJson.IconCompatParcelizer(inputStream, bufferedOutputStream);
            migrateMetadataToJson.write(inputStream);
            migrateMetadataToJson.write(bufferedOutputStream);
        } catch (Throwable th) {
            migrateMetadataToJson.write(inputStream);
            migrateMetadataToJson.write(bufferedOutputStream);
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

    public requestSingleLocationUpdatelambda5(requestSingleLocationUpdatelambda4 requestsinglelocationupdatelambda4, InputStream inputStream, boolean z) {
        this.RemoteActionCompatParcelizer = inputStream;
        this.serializer = z;
    }
}
