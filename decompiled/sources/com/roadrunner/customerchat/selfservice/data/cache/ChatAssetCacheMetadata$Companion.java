package com.roadrunner.customerchat.selfservice.data.cache;

import androidx.compose.ui.graphics.Fields;
import o.hasEqualAnnotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatAssetCacheMetadata$Companion {
    private static int serializer = 0;
    private static int write = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = write + 17;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        hasEqualAnnotations hasequalannotations = hasEqualAnnotations.write;
        int i4 = serializer + 69;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return hasequalannotations;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
