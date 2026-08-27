package com.deliveryhero.selfServiceChat.data.chat;

import androidx.compose.ui.text.android.LayoutCompat;
import o.IconCompatParcelizer;
import o.getDensityDpi;
import o.getImageLoaderCacheSize;

/* JADX INFO: loaded from: classes2.dex */
@getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
public final class GetChatIDEndpointResponse {
    public final String chatId;
    public final boolean translationSupported;

    public final int hashCode() {
        return Boolean.hashCode(this.translationSupported) + (this.chatId.hashCode() * 31);
    }

    public GetChatIDEndpointResponse(@getDensityDpi(serializer = "chat_id") String str, @getDensityDpi(serializer = "translation_supported") boolean z) {
        str.getClass();
        this.chatId = str;
        this.translationSupported = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetChatIDEndpointResponse)) {
            return false;
        }
        GetChatIDEndpointResponse getChatIDEndpointResponse = (GetChatIDEndpointResponse) obj;
        return this.chatId.equals(getChatIDEndpointResponse.chatId) && this.translationSupported == getChatIDEndpointResponse.translationSupported;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetChatIDEndpointResponse(chatId=");
        sb.append(this.chatId);
        sb.append(", translationSupported=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.translationSupported, ')');
    }
}
