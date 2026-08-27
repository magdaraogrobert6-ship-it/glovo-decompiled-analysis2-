package com.deliveryhero.chatsdk.network.http;

import o.InAppMessageModalView;
import o.LayerSnapshotV21;
import o.SimpleItemTouchHelperCallback;
import o.ViewLayerVerificationHelper31;
import o._get_messageWebView_lambda0;
import o._get_messageWebView_lambda1;
import o.getMessageHeaderTextView;
import o.getShortEdge;
import o.isIdentityannotations;
import o.onImageAvailable;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.setOutlineAmbientShadowColor;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpAuthInterceptor implements getShortEdge {
    private final setOutlineAmbientShadowColor chatConfigProvider;
    private final onImageAvailable chatFeatureCallbacks;

    public final String getAuthToken() {
        isIdentityannotations isidentityannotations;
        LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) this.chatConfigProvider).write();
        String str = layerSnapshotV21Write != null ? layerSnapshotV21Write.read().dhAuthToken : null;
        if ((str == null || str.length() == 0) && (isidentityannotations = this.chatFeatureCallbacks.serializer) != null) {
            isidentityannotations.RemoteActionCompatParcelizer("GCC_INVALID_AUTH_TOKEN", SimpleItemTouchHelperCallback.serializer);
        }
        return str == null ? "" : str;
    }

    public HttpAuthInterceptor(setOutlineAmbientShadowColor setoutlineambientshadowcolor, onImageAvailable onimageavailable) {
        setoutlineambientshadowcolor.getClass();
        onimageavailable.getClass();
        this.chatConfigProvider = setoutlineambientshadowcolor;
        this.chatFeatureCallbacks = onimageavailable;
    }

    @Override // o.getShortEdge
    public _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) {
        getmessageheadertextview.getClass();
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = inAppMessageModalView.MediaDescriptionCompat.read();
        _get_messagewebview_lambda0.IconCompatParcelizer("Authorization", getAuthToken());
        return inAppMessageModalView.write(new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0));
    }
}
