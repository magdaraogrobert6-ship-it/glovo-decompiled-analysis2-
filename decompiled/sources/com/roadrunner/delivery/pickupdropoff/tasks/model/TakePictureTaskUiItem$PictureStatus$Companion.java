package com.roadrunner.delivery.pickupdropoff.tasks.model;

import androidx.compose.ui.graphics.Fields;
import java.lang.annotation.Annotation;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.displayInAppMessagelambda1;
import o.getFocusIndeximpl;
import o.getHasBoundedWidthimpl;
import o.getHasFixedHeightannotations;
import o.getHasFixedWidthannotations;
import o.getHasFixedWidthimpl;
import o.getMaxWidthimpl;
import o.getMinHeightimpl;
import o.getUnregisteredInAppMessageannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class TakePictureTaskUiItem$PictureStatus$Companion {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final /* synthetic */ TakePictureTaskUiItem$PictureStatus$Companion serializer = new TakePictureTaskUiItem$PictureStatus$Companion();
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 43;
        read = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 68 / 0;
        }
    }

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        DefaultInAppMessageHtmlFullViewFactory defaultInAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem.PictureStatus", displayInAppMessagelambda1.serializer(getFocusIndeximpl.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(getHasBoundedWidthimpl.class), displayInAppMessagelambda1.serializer(getHasFixedWidthimpl.class), displayInAppMessagelambda1.serializer(getMinHeightimpl.class)}, new setGraphicModalMaxWidthDp[]{getHasFixedHeightannotations.serializer, getHasFixedWidthannotations.read, getMaxWidthimpl.IconCompatParcelizer}, new Annotation[0]);
        int i2 = IconCompatParcelizer + 97;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return defaultInAppMessageHtmlFullViewFactory;
    }
}
