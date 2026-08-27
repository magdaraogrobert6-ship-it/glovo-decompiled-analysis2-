package com.roadrunner.helpcenter.data.bridge;

import androidx.compose.ui.graphics.Fields;
import o.EmojiInputFilterInitCallbackImpl;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class SupportedBridgeMessage$Companion {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 119;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            EmojiInputFilterInitCallbackImpl emojiInputFilterInitCallbackImpl = EmojiInputFilterInitCallbackImpl.serializer;
            throw null;
        }
        EmojiInputFilterInitCallbackImpl emojiInputFilterInitCallbackImpl2 = EmojiInputFilterInitCallbackImpl.serializer;
        int i3 = serializer + 29;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return emojiInputFilterInitCallbackImpl2;
    }
}
