package com.roadrunner.inappnotifications.data;

import androidx.compose.ui.graphics.Fields;
import java.lang.annotation.Annotation;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.displayInAppMessagelambda1;
import o.getUnregisteredInAppMessageannotations;
import o.onPointerUp;
import o.processDataSetCompletelyChanged;
import o.recordAnimationInfoIfBouncedHiddenView;
import o.releaseVerticalGlow1;
import o.removeItemDecoration;
import o.requestChildOnScreen;
import o.setGraphicModalMaxWidthDp;
import o.setRecycledViewPool;
import o.setRecyclerListener;
import o.setScrollState;
import o.smoothScrollBy1;
import o.startInterceptRequestLayout;
import o.startNestedScrollForType;

/* JADX INFO: loaded from: classes3.dex */
public final class RowChildComponent$Companion {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ RowChildComponent$Companion RemoteActionCompatParcelizer = new RowChildComponent$Companion();
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        int i = serializer + 11;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 25 / 0;
        }
    }

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        DefaultInAppMessageHtmlFullViewFactory defaultInAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.inappnotifications.data.RowChildComponent", displayInAppMessagelambda1.serializer(setRecyclerListener.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(onPointerUp.class), displayInAppMessagelambda1.serializer(processDataSetCompletelyChanged.class), displayInAppMessagelambda1.serializer(requestChildOnScreen.class), displayInAppMessagelambda1.serializer(setScrollState.class), displayInAppMessagelambda1.serializer(startNestedScrollForType.class)}, new setGraphicModalMaxWidthDp[]{recordAnimationInfoIfBouncedHiddenView.serializer, releaseVerticalGlow1.read, removeItemDecoration.IconCompatParcelizer, startInterceptRequestLayout.read, smoothScrollBy1.serializer}, new Annotation[]{new setRecycledViewPool("component")});
        int i2 = read + 9;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return defaultInAppMessageHtmlFullViewFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
