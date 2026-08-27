package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.io.IOException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class performImeAction implements getShortEdge {
    private static int serializer = 1;
    private static int write;
    public final onFillDatadefault read;

    public performImeAction(onFillDatadefault onfilldatadefault) {
        onfilldatadefault.getClass();
        this.read = onfilldatadefault;
    }

    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) {
        int i = 2 % 2;
        onFillDatadefault onfilldatadefault = this.read;
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = ((InAppMessageModalView) getmessageheadertextview).MediaDescriptionCompat;
        String strM = d$$ExternalSyntheticOutline0.m();
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = r8lambday113fdftsr5e4pzj6xssxltpl60.read();
        _get_messagewebview_lambda0.IconCompatParcelizer("mutex_owner", strM);
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl61 = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
        String strRemoteActionCompatParcelizer = coil3.UriKt.RemoteActionCompatParcelizer(r8lambday113fdftsr5e4pzj6xssxltpl61);
        try {
            try {
                _get_messageWebView_lambda1 _get_messagewebview_lambda1Write = ((InAppMessageModalView) getmessageheadertextview).write(r8lambday113fdftsr5e4pzj6xssxltpl61);
                onfilldatadefault.write(strRemoteActionCompatParcelizer);
                return _get_messagewebview_lambda1Write;
            } catch (Exception e) {
                Throwable cause = e;
                while (cause != null) {
                    int i2 = serializer + 1;
                    int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    write = i3;
                    int i4 = i2 % 2;
                    if (cause instanceof IOException) {
                        throw e;
                    }
                    int i5 = i3 + 17;
                    serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    if (cause.getCause() != null) {
                        int i7 = serializer + 107;
                        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i7 % 2 != 0) {
                            ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cause.getCause(), cause}, getCieXyz.write())).booleanValue();
                            throw null;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cause.getCause(), cause}, getCieXyz.write())).booleanValue()) {
                            cause = cause.getCause();
                        }
                    }
                    int i8 = serializer + 113;
                    write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    cause = null;
                }
                Timber.RemoteActionCompatParcelizer.write(new IllegalStateException("Failed to proceed request", e));
                throw e;
            }
        } catch (Throwable th) {
            onfilldatadefault.write(strRemoteActionCompatParcelizer);
            throw th;
        }
    }
}
