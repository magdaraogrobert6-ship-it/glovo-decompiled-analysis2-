package com.roadrunner.delivery.common.data.model.tasks;

import androidx.compose.ui.graphics.Fields;
import java.lang.annotation.Annotation;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.FontF3nL8kk;
import o.FontFamilyResolverKt;
import o.FontFamilyTypefaceAdapter;
import o.displayInAppMessagelambda1;
import o.getGlobalAsyncTypefaceCache;
import o.getGlobalTypefaceRequestCache;
import o.getUnregisteredInAppMessageannotations;
import o.resolveAsTypefaceWqqsr6A;
import o.resolveAsTypefaceWqqsr6Adefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class OverlayComponent$Companion {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public static final /* synthetic */ OverlayComponent$Companion write = new OverlayComponent$Companion();

    static {
        int i = RemoteActionCompatParcelizer + 35;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 38 / 0;
        }
    }

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        DefaultInAppMessageHtmlFullViewFactory defaultInAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.common.data.model.tasks.OverlayComponent", displayInAppMessagelambda1.serializer(FontFamilyResolverKt.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(getGlobalTypefaceRequestCache.class), displayInAppMessagelambda1.serializer(resolveAsTypefaceWqqsr6A.class), displayInAppMessagelambda1.serializer(resolveAsTypefaceWqqsr6Adefault.class)}, new setGraphicModalMaxWidthDp[]{getGlobalAsyncTypefaceCache.IconCompatParcelizer, FontFamilyTypefaceAdapter.IconCompatParcelizer, FontF3nL8kk.RemoteActionCompatParcelizer}, new Annotation[0]);
        int i2 = read + 81;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return defaultInAppMessageHtmlFullViewFactory;
        }
        throw null;
    }
}
