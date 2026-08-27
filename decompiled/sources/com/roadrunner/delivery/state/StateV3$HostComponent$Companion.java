package com.roadrunner.delivery.state;

import androidx.compose.ui.graphics.Fields;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.EnumSerializer;
import o.AndroidPopup_androidKtPopup811;
import o.AndroidPopup_androidKtPopuppopupId11;
import o.AndroidPopup_androidKtPopuppopupLayout1111;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.displayInAppMessagelambda1;
import o.getUnregisteredInAppMessageannotations;
import o.setFitInsetsTypes;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class StateV3$HostComponent$Companion {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static final /* synthetic */ StateV3$HostComponent$Companion serializer = new StateV3$HostComponent$Companion();
    private static int write = 1;

    static {
        int i = RemoteActionCompatParcelizer + 79;
        write = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        DefaultInAppMessageHtmlFullViewFactory defaultInAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.state.StateV3.HostComponent", displayInAppMessagelambda1.serializer(AndroidPopup_androidKtPopup811.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(AndroidPopup_androidKtPopuppopupLayout1111.class), displayInAppMessagelambda1.serializer(setFitInsetsTypes.class)}, new setGraphicModalMaxWidthDp[]{AndroidPopup_androidKtPopuppopupId11.serializer, new EnumSerializer("last_stop", setFitInsetsTypes.INSTANCE, new Annotation[0])}, new Annotation[0]);
        int i2 = IconCompatParcelizer + 53;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return defaultInAppMessageHtmlFullViewFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
