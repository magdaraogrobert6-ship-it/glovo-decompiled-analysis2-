package com.roadrunner.delivery.state;

import androidx.compose.ui.graphics.Fields;
import java.lang.annotation.Annotation;
import o.AndroidViewHolderCompanion;
import o.AndroidViewHolderCompanionOnCommitAffectingUpdate1;
import o.C0199requestDisallowInterceptTouchEvent;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.displayInAppMessagelambda1;
import o.getUnregisteredInAppMessageannotations;
import o.insetValue;
import o.onNestedPreScroll;
import o.onStartNestedScroll;
import o.setGraphicModalMaxWidthDp;
import o.setOnDensityChangedui;

/* JADX INFO: loaded from: classes3.dex */
public final class DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$GuidanceComponent$Companion {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public static final /* synthetic */ DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$GuidanceComponent$Companion write = new DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$GuidanceComponent$Companion();

    static {
        int i = serializer + 75;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        DefaultInAppMessageHtmlFullViewFactory defaultInAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.state.DestinationInfo.ScrollableComponent.LocationDetail.EntrancePicture.GuidanceComponent", displayInAppMessagelambda1.serializer(insetValue.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(onNestedPreScroll.class), displayInAppMessagelambda1.serializer(C0199requestDisallowInterceptTouchEvent.class), displayInAppMessagelambda1.serializer(AndroidViewHolderCompanionOnCommitAffectingUpdate1.class)}, new setGraphicModalMaxWidthDp[]{onStartNestedScroll.read, setOnDensityChangedui.write, AndroidViewHolderCompanion.RemoteActionCompatParcelizer}, new Annotation[0]);
        int i2 = read + 125;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
        return defaultInAppMessageHtmlFullViewFactory;
    }
}
