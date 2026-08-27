package com.roadrunner.helpcenter.data.bridge;

import androidx.compose.ui.graphics.Fields;
import o.CodedInputStreamReader;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraBridgeMessage$Companion {
    private static int read = 0;
    private static int serializer = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = serializer + 17;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            CodedInputStreamReader codedInputStreamReader = CodedInputStreamReader.read;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CodedInputStreamReader codedInputStreamReader2 = CodedInputStreamReader.read;
        int i3 = read + 25;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 16 / 0;
        }
        return codedInputStreamReader2;
    }
}
