package com.deliveryhero.chatsdk.network.http;

import android.app.Application;
import android.content.pm.PackageManager;
import com.mapbox.common.HttpHeaders;
import o.AndroidShadowContext;
import o.InAppMessageModalView;
import o._get_messageWebView_lambda0;
import o._get_messageWebView_lambda1;
import o.applyLayoutDirection;
import o.getMessageHeaderTextView;
import o.getShortEdge;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;

/* JADX INFO: loaded from: classes2.dex */
public final class UserAgentHeaderInterceptor implements getShortEdge {
    private final applyLayoutDirection deviceUtils;
    private final onViewDetachedFromWindowlambda1 hostAppUserAgent$delegate;

    private final String getHostAppUserAgent() {
        return (String) this.hostAppUserAgent$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    public UserAgentHeaderInterceptor(applyLayoutDirection applylayoutdirection) {
        applylayoutdirection.getClass();
        this.deviceUtils = applylayoutdirection;
        this.hostAppUserAgent$delegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.chatsdk.network.http.UserAgentHeaderInterceptor$hostAppUserAgent$2
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final String invoke() {
                StringBuilder sb = new StringBuilder("ANDROID/7.3.52/");
                this.this$0.deviceUtils.getClass();
                String packageName = ((AndroidShadowContext) this.this$0.deviceUtils).read.getPackageName();
                packageName.getClass();
                sb.append(packageName);
                sb.append("/");
                sb.append(((AndroidShadowContext) this.this$0.deviceUtils).write());
                sb.append("/");
                Object objValueOf = -1;
                Application application = ((AndroidShadowContext) this.this$0.deviceUtils).read;
                try {
                    objValueOf = Long.valueOf(application.getPackageManager().getPackageInfo(application.getPackageName(), 0).getLongVersionCode());
                } catch (PackageManager.NameNotFoundException | Exception unused) {
                }
                sb.append(objValueOf.toString());
                return sb.toString();
            }
        });
    }

    @Override // o.getShortEdge
    public _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) {
        getmessageheadertextview.getClass();
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = inAppMessageModalView.MediaDescriptionCompat.read();
        _get_messagewebview_lambda0.IconCompatParcelizer(HttpHeaders.USER_AGENT, getHostAppUserAgent());
        return inAppMessageModalView.write(new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0));
    }
}
