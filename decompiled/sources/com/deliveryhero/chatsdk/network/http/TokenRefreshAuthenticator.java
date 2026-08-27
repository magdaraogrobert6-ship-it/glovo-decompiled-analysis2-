package com.deliveryhero.chatsdk.network.http;

import androidx.compose.ui.graphics.Fields;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.customerchat.internal.ChatTokenProvider$requestAuthTokenRefresh$1;
import kotlinx.coroutines.BuildersKt;
import o.InAppMessageBaseView;
import o.LayerSnapshotV21;
import o.LayerSnapshotV22;
import o.ViewLayerVerificationHelper31;
import o._get_messageWebView_lambda0;
import o._get_messageWebView_lambda1;
import o.getCieXyz;
import o.isIdentityannotations;
import o.onImageAvailable;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;
import o.setOutlineAmbientShadowColor;
import o.setWebViewContentdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class TokenRefreshAuthenticator implements InAppMessageBaseView {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    private final setOutlineAmbientShadowColor chatConfigProvider;
    private final onImageAvailable chatFeatureCallbacks;

    @Override // o.InAppMessageBaseView
    public r8lambday113fDFTSR5e4PZj6XsSXLtpL60 authenticate(setWebViewContentdefault setwebviewcontentdefault, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60TryRefreshToken;
        _get_messagewebview_lambda1.getClass();
        LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) this.chatConfigProvider).write();
        if (layerSnapshotV21Write != null && !layerSnapshotV21Write.MediaSessionCompatResultReceiverWrapper) {
            logInfo("Token Refresh is disabled");
            return null;
        }
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = _get_messagewebview_lambda1.request;
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        String strExtractTokenFromHeader = extractTokenFromHeader(r8lambday113fdftsr5e4pzj6xssxltpl60.headers.write("Authorization"));
        synchronized (this) {
            String strRemoteActionCompatParcelizer = layerSnapshotV21Write != null ? layerSnapshotV21Write.RemoteActionCompatParcelizer() : null;
            if (shouldRetryWithExistingToken(strExtractTokenFromHeader, strRemoteActionCompatParcelizer)) {
                logInfo("Token is different from the one used in the failed request in web chat, retrying");
                _get_messageWebView_lambda0 _get_messagewebview_lambda0 = _get_messagewebview_lambda1.request.read();
                _get_messagewebview_lambda0.IconCompatParcelizer("Authorization", "Bearer " + strRemoteActionCompatParcelizer);
                r8lambday113fdftsr5e4pzj6xssxltpl60TryRefreshToken = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
            } else {
                r8lambday113fdftsr5e4pzj6xssxltpl60TryRefreshToken = tryRefreshToken(_get_messagewebview_lambda1, strExtractTokenFromHeader);
            }
        }
        return r8lambday113fdftsr5e4pzj6xssxltpl60TryRefreshToken;
    }

    public TokenRefreshAuthenticator(setOutlineAmbientShadowColor setoutlineambientshadowcolor, onImageAvailable onimageavailable) {
        setoutlineambientshadowcolor.getClass();
        onimageavailable.getClass();
        this.chatConfigProvider = setoutlineambientshadowcolor;
        this.chatFeatureCallbacks = onimageavailable;
    }

    public static /* synthetic */ void logError$default(TokenRefreshAuthenticator tokenRefreshAuthenticator, String str, Throwable th, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 123;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 3) != 0) {
            th = null;
        }
        tokenRefreshAuthenticator.logError(str, th);
        int i4 = IconCompatParcelizer + 75;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
    }

    private final void logError(String str, Throwable th) {
        isIdentityannotations isidentityannotations;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            isidentityannotations = this.chatFeatureCallbacks.serializer;
            int i3 = 71 / 0;
            if (isidentityannotations == null) {
                return;
            }
        } else {
            isidentityannotations = this.chatFeatureCallbacks.serializer;
            if (isidentityannotations == null) {
                return;
            }
        }
        int i4 = RemoteActionCompatParcelizer + 51;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            isidentityannotations.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "WEB_CHAT", str, th);
            return;
        }
        isidentityannotations.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "WEB_CHAT", str, th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void logInfo(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 27;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        isIdentityannotations isidentityannotations = this.chatFeatureCallbacks.serializer;
        if (isidentityannotations != null) {
            int i4 = IconCompatParcelizer + 47;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                isidentityannotations.RemoteActionCompatParcelizer(LayerSnapshotV22.INFO, "WEB_CHAT", str, null);
            } else {
                isidentityannotations.RemoteActionCompatParcelizer(LayerSnapshotV22.INFO, "WEB_CHAT", str, null);
                throw null;
            }
        }
    }

    private final String extractTokenFromHeader(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
            if (str == null) {
                return null;
            }
        } else if (str == null) {
            return null;
        }
        if (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "Bearer ", true)) {
            return str;
        }
        int i4 = RemoteActionCompatParcelizer + 113;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        return str.substring(i4 % 2 == 0 ? 27 : 7);
    }

    private final boolean shouldRetryWithExistingToken(String str, String str2) {
        int i = 2 % 2;
        if (str == null || str2 == null || str2.length() == 0 || !(!str.equals(str2))) {
            int i2 = RemoteActionCompatParcelizer + 37;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = RemoteActionCompatParcelizer + 101;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }

    private final r8lambday113fDFTSR5e4PZj6XsSXLtpL60 tryRefreshToken(_get_messageWebView_lambda1 _get_messagewebview_lambda1, String str) {
        String str2;
        int i = 2 % 2;
        try {
            logInfo("Requesting new token for web chat");
            ProtobufEncoder protobufEncoder = this.chatFeatureCallbacks.RemoteActionCompatParcelizer;
            if (protobufEncoder != null) {
                str2 = (String) BuildersKt.serializer(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, new ChatTokenProvider$requestAuthTokenRefresh$1(protobufEncoder, null, 1));
            } else {
                str2 = null;
            }
            if (str2 != null && str2.length() != 0) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, str2}, getCieXyz.write())).booleanValue()) {
                    logInfo("Retrying request with new token received");
                    _get_messageWebView_lambda0 _get_messagewebview_lambda0 = _get_messagewebview_lambda1.request.read();
                    _get_messagewebview_lambda0.IconCompatParcelizer("Authorization", "Bearer ".concat(str2));
                    return new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
                }
                int i2 = IconCompatParcelizer + 45;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    logError$default(this, "Token refresh returned same token", null, 5, null);
                    return null;
                }
                logError$default(this, "Token refresh returned same token", null, 2, null);
                return null;
            }
            logError$default(this, "Token received is null or empty", null, 2, null);
            return null;
        } catch (Exception e) {
            logError("Token Refresh failed with exception", e);
            int i3 = IconCompatParcelizer + 55;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return null;
        }
    }
}
