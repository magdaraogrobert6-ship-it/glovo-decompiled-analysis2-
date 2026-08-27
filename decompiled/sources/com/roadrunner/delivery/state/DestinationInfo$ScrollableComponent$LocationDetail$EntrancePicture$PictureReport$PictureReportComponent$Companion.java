package com.roadrunner.delivery.state;

import androidx.compose.ui.graphics.Fields;
import java.lang.annotation.Annotation;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.displayInAppMessagelambda1;
import o.getUnregisteredInAppMessageannotations;
import o.onNestedScrollAccepted;
import o.onStopNestedScroll;
import o.onWindowVisibilityChanged;
import o.remeasure;
import o.setGraphicModalMaxWidthDp;
import o.setLifecycleOwner;

/* JADX INFO: loaded from: classes3.dex */
public final class DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureReport$PictureReportComponent$Companion {
    public static final /* synthetic */ DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureReport$PictureReportComponent$Companion IconCompatParcelizer = new DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureReport$PictureReportComponent$Companion();
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = write + 67;
        serializer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        DefaultInAppMessageHtmlFullViewFactory defaultInAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.state.DestinationInfo.ScrollableComponent.LocationDetail.EntrancePicture.PictureReport.PictureReportComponent", displayInAppMessagelambda1.serializer(onWindowVisibilityChanged.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(onNestedScrollAccepted.class), displayInAppMessagelambda1.serializer(remeasure.class)}, new setGraphicModalMaxWidthDp[]{onStopNestedScroll.read, setLifecycleOwner.write}, new Annotation[0]);
        int i2 = RemoteActionCompatParcelizer + 41;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return defaultInAppMessageHtmlFullViewFactory;
        }
        throw null;
    }
}
