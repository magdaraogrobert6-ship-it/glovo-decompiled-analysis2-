package com.roadrunner.customerchat.selfservice.domain;

import androidx.compose.ui.graphics.Fields;

/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterInitServiceInvalidChatUrlException extends IllegalStateException {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final HelpCenterInitServiceInvalidChatUrlException write = new HelpCenterInitServiceInvalidChatUrlException("Helpcenter Init endpoint returned invalid Chat URL. Please try again.");

    static {
        int i = RemoteActionCompatParcelizer + 73;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public HelpCenterInitServiceInvalidChatUrlException(String str) {
        super(str);
    }
}
