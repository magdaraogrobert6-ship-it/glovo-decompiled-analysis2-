package com.roadrunner.delivery.state;

import androidx.compose.ui.graphics.Fields;
import java.lang.annotation.Annotation;
import o.AndroidPopup_androidKtPopup1;
import o.AndroidPopup_androidKtPopup21;
import o.AndroidPopup_androidKtPopup21invokeinlinedonDispose1;
import o.AndroidPopup_androidKtPopup31;
import o.AndroidPopup_androidKtPopup41invokeinlinedonDispose1;
import o.AndroidPopup_androidKtPopup51;
import o.AndroidPopup_androidKtPopup511;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.displayInAppMessagelambda1;
import o.getUnregisteredInAppMessageannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class StateV3$ExternalComponents$Companion {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public static final /* synthetic */ StateV3$ExternalComponents$Companion write = new StateV3$ExternalComponents$Companion();

    static {
        int i = serializer + 121;
        read = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        DefaultInAppMessageHtmlFullViewFactory defaultInAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.state.StateV3.ExternalComponents", displayInAppMessagelambda1.serializer(AndroidPopup_androidKtPopup31.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(AndroidPopup_androidKtPopup1.class), displayInAppMessagelambda1.serializer(AndroidPopup_androidKtPopup21invokeinlinedonDispose1.class), displayInAppMessagelambda1.serializer(AndroidPopup_androidKtPopup41invokeinlinedonDispose1.class)}, new setGraphicModalMaxWidthDp[]{AndroidPopup_androidKtPopup21.IconCompatParcelizer, AndroidPopup_androidKtPopup511.RemoteActionCompatParcelizer, AndroidPopup_androidKtPopup51.serializer}, new Annotation[0]);
        int i2 = IconCompatParcelizer + 73;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return defaultInAppMessageHtmlFullViewFactory;
    }
}
