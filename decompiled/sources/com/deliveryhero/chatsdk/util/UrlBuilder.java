package com.deliveryhero.chatsdk.util;

import android.net.Uri;
import bo.app.ff$$ExternalSyntheticOutline0;
import o.rebuildOutline;

/* JADX INFO: loaded from: classes2.dex */
public final class UrlBuilder {
    public static final UrlBuilder INSTANCE = new UrlBuilder();

    private UrlBuilder() {
    }

    public final String buildChatIDEndpointUrl(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        String string = Uri.parse(str + "/chat-api/v1/p2p/" + str2).buildUpon().appendQueryParameter("user_language", str3).toString();
        string.getClass();
        return string;
    }

    public final String buildHelpCenterChatAPAIServiceUrl(rebuildOutline rebuildoutline, String str) {
        rebuildoutline.getClass();
        str.getClass();
        return rebuildoutline == rebuildOutline.PRODUCTION ? ff$$ExternalSyntheticOutline0.m("https://helpcenter-", str, ".usehurrier.com") : "https://helpcenter-stg.usehurrier.com";
    }

    public final String buildHelpCenterRegionServiceUrl(rebuildOutline rebuildoutline) {
        rebuildoutline.getClass();
        return rebuildoutline == rebuildOutline.PRODUCTION ? "https://service-prd-client-configs.usehurrier.com" : "https://service-stg-client-configs.usehurrier.com";
    }

    public final String buildHttpUrl(String str, rebuildOutline rebuildoutline) {
        str.getClass();
        rebuildoutline.getClass();
        StringBuilder sb = new StringBuilder("https://chat-");
        sb.append(rebuildoutline.getBackendName$customerchat_release());
        sb.append('-');
        sb.append(str);
        sb.append(".deliveryhero.io/");
        return ff$$ExternalSyntheticOutline0.m(sb, str, '/');
    }
}
