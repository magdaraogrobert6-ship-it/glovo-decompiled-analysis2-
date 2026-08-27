package o;

import com.roadrunner.auth.api.tokens.SessionInvalidException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class onImeAction9UiTYpYdefault implements getShortEdge {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final getInputText RemoteActionCompatParcelizer;
    public final String read;
    public final pageLeft write;

    public onImeAction9UiTYpYdefault(getInputText getinputtext, pageLeft pageleft, setTransactionSuccessful settransactionsuccessful) {
        getinputtext.getClass();
        pageleft.getClass();
        settransactionsuccessful.getClass();
        this.RemoteActionCompatParcelizer = getinputtext;
        this.write = pageleft;
        this.read = settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.all_error_message);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x005e  */
    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) throws SessionInvalidException {
        String strConcat;
        int i = 2 % 2;
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = inAppMessageModalView.MediaDescriptionCompat;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = r8lambday113fdftsr5e4pzj6xssxltpl60.read();
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        setInAppMessageImageViewAttributes setinappmessageimageviewattributes = r8lambday113fdftsr5e4pzj6xssxltpl60.url;
        forest.IconCompatParcelizer("Intercepting " + setinappmessageimageviewattributes, new Object[0]);
        boolean z = ((getInputTextdelegate) this.RemoteActionCompatParcelizer).read("AuthorizationInterceptorImpl");
        String str = this.read;
        if (!(!z)) {
            forest.write(new Throwable("API call " + setinappmessageimageviewattributes + " was unsuccessful due logout being in progress"));
            throw new SessionInvalidException(str);
        }
        getTraversalIndexdelegate gettraversalindexdelegateRemoteActionCompatParcelizer = this.write.IconCompatParcelizer.serializer.RemoteActionCompatParcelizer();
        if (gettraversalindexdelegateRemoteActionCompatParcelizer != null) {
            int i2 = serializer + 11;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            String str2 = gettraversalindexdelegateRemoteActionCompatParcelizer.accessToken;
            if (str2 != null) {
                int i4 = IconCompatParcelizer + 101;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                strConcat = "Bearer ".concat(str2);
            } else {
                strConcat = null;
            }
        } else {
            strConcat = null;
        }
        if (strConcat == null) {
            forest.write(new Throwable("API call " + setinappmessageimageviewattributes + " was unsuccessful due to null access token"));
            throw new SessionInvalidException(str);
        }
        _get_messagewebview_lambda0.IconCompatParcelizer("Authorization", strConcat);
        _get_messageWebView_lambda1 _get_messagewebview_lambda1Write = inAppMessageModalView.write(new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0));
        int i6 = serializer + 105;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 12 / 0;
        }
        return _get_messagewebview_lambda1Write;
    }
}
