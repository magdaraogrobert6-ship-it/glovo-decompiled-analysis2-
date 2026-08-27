package com.roadrunner.web.model;

import androidx.compose.ui.graphics.Fields;
import java.lang.annotation.Annotation;
import o.BrazeExternalSyntheticLambda0;
import o.BrazeExternalSyntheticLambda148;
import o.BrazeExternalSyntheticLambda17;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.displayInAppMessagelambda1;
import o.getUnregisteredInAppMessageannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class IncomingBridgeMessage$Companion {
    private static int IconCompatParcelizer = 0;
    public static final /* synthetic */ IncomingBridgeMessage$Companion RemoteActionCompatParcelizer = new IncomingBridgeMessage$Companion();
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 89;
        write = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        DefaultInAppMessageHtmlFullViewFactory defaultInAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.web.model.IncomingBridgeMessage", displayInAppMessagelambda1.serializer(BrazeExternalSyntheticLambda17.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(BrazeExternalSyntheticLambda0.class)}, new setGraphicModalMaxWidthDp[]{BrazeExternalSyntheticLambda148.serializer}, new Annotation[0]);
        int i2 = read + 83;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 41 / 0;
        }
        return defaultInAppMessageHtmlFullViewFactory;
    }
}
