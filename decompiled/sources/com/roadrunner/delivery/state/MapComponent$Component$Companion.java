package com.roadrunner.delivery.state;

import androidx.compose.ui.graphics.Fields;
import java.lang.annotation.Annotation;
import o.AndroidViewHolderlayoutNode15measure2;
import o.AndroidViewHolderlayoutNode1coreModifier4;
import o.AndroidViewHolderonNestedPreFling1;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.displayInAppMessagelambda1;
import o.getUnregisteredInAppMessageannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class MapComponent$Component$Companion {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    public static final /* synthetic */ MapComponent$Component$Companion read = new MapComponent$Component$Companion();
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = write + 53;
        serializer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        DefaultInAppMessageHtmlFullViewFactory defaultInAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.state.MapComponent.Component", displayInAppMessagelambda1.serializer(AndroidViewHolderlayoutNode15measure2.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(AndroidViewHolderlayoutNode1coreModifier4.class)}, new setGraphicModalMaxWidthDp[]{AndroidViewHolderonNestedPreFling1.RemoteActionCompatParcelizer}, new Annotation[0]);
        int i2 = IconCompatParcelizer + 19;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return defaultInAppMessageHtmlFullViewFactory;
    }
}
