package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class requestSingleLocationUpdatelambda40 extends setShouldOptInWhenPushAuthorizedandroid_sdk_base_release {
    final /* synthetic */ requestSingleLocationUpdatelambda6 IconCompatParcelizer;
    final /* synthetic */ File read;

    @Override // o.setShouldOptInWhenPushAuthorizedandroid_sdk_base_release
    public final void read(r8lambdaMIqXXOzLMUUicX7GG348aw6pQE r8lambdamiqxxozlmuuicx7gg348aw6pqe) {
        requestSingleLocationUpdatelambda6 requestsinglelocationupdatelambda6 = this.IconCompatParcelizer;
        File file = this.read;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[androidx.compose.ui.graphics.Fields.ColorFilter];
                for (int i = fileInputStream.read(bArr); i > 0; i = fileInputStream.read(bArr)) {
                    r8lambdamiqxxozlmuuicx7gg348aw6pqe.RemoteActionCompatParcelizer(i, bArr);
                }
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            requestsinglelocationupdatelambda6.MediaSessionCompatQueueItem.IconCompatParcelizer(false, e, "Failed to upload %s", file.getName());
        }
        requestsinglelocationupdatelambda6.MediaSessionCompatQueueItem.IconCompatParcelizer("Closing the output stream", new Object[0]);
        migrateMetadataToJson.write(r8lambdamiqxxozlmuuicx7gg348aw6pqe);
    }

    @Override // o.setShouldOptInWhenPushAuthorizedandroid_sdk_base_release
    public final isHtmlInAppMessageHtmlLinkTargetEnabled serializer() {
        try {
            return isHtmlInAppMessageHtmlLinkTargetEnabled.IconCompatParcelizer("application/octet-stream");
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public requestSingleLocationUpdatelambda40(requestSingleLocationUpdatelambda6 requestsinglelocationupdatelambda6, File file) {
        this.IconCompatParcelizer = requestsinglelocationupdatelambda6;
        this.read = file;
    }
}
