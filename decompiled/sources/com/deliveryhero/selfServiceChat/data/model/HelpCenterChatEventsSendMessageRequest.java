package com.deliveryhero.selfServiceChat.data.model;

import androidx.compose.ui.text.android.LayoutCompat;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;
import o.getDensityDpi;
import o.getImageLoaderCacheSize;

/* JADX INFO: loaded from: classes2.dex */
@getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
public final class HelpCenterChatEventsSendMessageRequest {
    public final List events;

    public final int hashCode() {
        return this.events.hashCode();
    }

    public HelpCenterChatEventsSendMessageRequest(@getDensityDpi(serializer = "events") List<TextEvent> list) {
        list.getClass();
        this.events = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HelpCenterChatEventsSendMessageRequest) && this.events.equals(((HelpCenterChatEventsSendMessageRequest) obj).events);
    }

    public final String toString() {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(new StringBuilder("HelpCenterChatEventsSendMessageRequest(events="), this.events, ')');
    }
}
