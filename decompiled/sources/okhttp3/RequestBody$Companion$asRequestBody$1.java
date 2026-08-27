package okhttp3;

import java.io.File;
import java.io.FileInputStream;
import o.ApiErrorResponseCompanion;
import o.CallbackException;
import o.InAppMessageHtmlBaseView;
import o.RegistryNoImageHeaderParserException;
import o.getActiveFocusTargetNode;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {
    public final /* synthetic */ File IconCompatParcelizer;
    public final /* synthetic */ InAppMessageHtmlBaseView RemoteActionCompatParcelizer;

    @Override // okhttp3.RequestBody
    public final InAppMessageHtmlBaseView contentType() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.IconCompatParcelizer.length();
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(RegistryNoImageHeaderParserException registryNoImageHeaderParserException) {
        File file = this.IconCompatParcelizer;
        file.getClass();
        CallbackException callbackException = new CallbackException(getActiveFocusTargetNode.write(file, new FileInputStream(file)), ApiErrorResponseCompanion.PlaybackStateCompat);
        try {
            registryNoImageHeaderParserException.IconCompatParcelizer(callbackException);
            callbackException.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                int i = sourceInformationContextOfdefault.read();
                int i2 = sourceInformationContextOfdefault.read();
                int i3 = sourceInformationContextOfdefault.read();
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{callbackException, th}, i3);
                throw th2;
            }
        }
    }

    public RequestBody$Companion$asRequestBody$1(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, File file) {
        this.RemoteActionCompatParcelizer = inAppMessageHtmlBaseView;
        this.IconCompatParcelizer = file;
    }
}
