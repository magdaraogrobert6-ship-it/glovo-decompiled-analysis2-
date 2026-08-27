package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import io.sentry.SentryUUID;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getLongEdge implements InAppMessageBaseView, getMessageWebView {
    public static final getLongEdge NO_COOKIES = new getLongEdge();
    public static final getLongEdge SYSTEM = new getLongEdge();

    public static final void RemoteActionCompatParcelizer(List list, StringBuilder sb) {
        Object[] objArr = {0, Integer.valueOf(list.size())};
        int iWrite = BackspaceCommand.write();
        getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer = RangesKt.serializer(2, (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite));
        int i = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.write;
        int i2 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.read;
        int i3 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotationsSerializer.serializer;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    @Override // o.InAppMessageBaseView
    public r8lambday113fDFTSR5e4PZj6XsSXLtpL60 authenticate(setWebViewContentdefault setwebviewcontentdefault, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        return null;
    }

    public getAppropriateImageUrllambda0 write(String str) {
        getAppropriateImageUrllambda0 getappropriateimageurllambda0;
        String strConcat;
        synchronized (this) {
            str.getClass();
            LinkedHashMap linkedHashMap = getAppropriateImageUrllambda0.INSTANCES;
            getappropriateimageurllambda0 = (getAppropriateImageUrllambda0) linkedHashMap.get(str);
            if (getappropriateimageurllambda0 == null) {
                if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "TLS_", false)) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str;
                }
                getappropriateimageurllambda0 = (getAppropriateImageUrllambda0) linkedHashMap.get(strConcat);
                if (getappropriateimageurllambda0 == null) {
                    getappropriateimageurllambda0 = new getAppropriateImageUrllambda0(str);
                }
                linkedHashMap.put(str, getappropriateimageurllambda0);
            }
        }
        return getappropriateimageurllambda0;
    }

    public static final getAppropriateImageUrllambda0 IconCompatParcelizer(getLongEdge getlongedge, String str) {
        getAppropriateImageUrllambda0 getappropriateimageurllambda0 = new getAppropriateImageUrllambda0(str);
        getAppropriateImageUrllambda0.INSTANCES.put(str, getappropriateimageurllambda0);
        return getappropriateimageurllambda0;
    }

    public static _get_messageWebView_lambda4 RemoteActionCompatParcelizer(String str) {
        _get_messageWebView_lambda4 _get_messagewebview_lambda4 = _get_messageWebView_lambda3.EMPTY;
        str.getClass();
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0Serializer = SentryUUID.serializer((InAppMessageHtmlBaseView) null);
        Charset charset = (Charset) onviewattachedtowindowlambda0Serializer.serializer;
        InAppMessageHtmlBaseView inAppMessageHtmlBaseView = (InAppMessageHtmlBaseView) onviewattachedtowindowlambda0Serializer.write;
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        charset.getClass();
        int length = str.length();
        str.getClass();
        charset.getClass();
        if (length < 0) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(length, "endIndex < beginIndex: ", 0, " < "));
        } else if (length > str.length()) {
            DrawableTransformation.write(str.length(), ff$$ExternalSyntheticOutline0.m(length, "endIndex > string.length: ", " > "));
        } else if (charset.equals(ensureSubscribedToInAppMessageEvents.write)) {
            registryMissingComponentException.IconCompatParcelizer(0, length, str);
        } else {
            byte[] bytes = str.substring(0, length).getBytes(charset);
            bytes.getClass();
            registryMissingComponentException.write(bytes, 0, bytes.length);
        }
        return new _get_messageWebView_lambda4(inAppMessageHtmlBaseView, registryMissingComponentException.size, registryMissingComponentException);
    }
}
