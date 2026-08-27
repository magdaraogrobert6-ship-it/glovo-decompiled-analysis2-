package com.roadrunner.delivery.state;

import androidx.compose.ui.graphics.Fields;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.EnumSerializer;
import o.AndroidViewBindingKt;
import o.AndroidViewBindinglambda00;
import o.AndroidViewBindinglambda9;
import o.AndroidViewHolderlayoutNode15measure1;
import o.AndroidViewHolderlayoutNode1coreModifier3;
import o.Api33ImplExternalSyntheticLambda0;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.displayInAppMessagelambda1;
import o.fastAll;
import o.fastCoerceIn;
import o.fastDistinctBy;
import o.getUnregisteredInAppMessageannotations;
import o.normalizedAngleCos;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveriesDetailComponent$Companion {
    public static final /* synthetic */ DeliveriesDetailComponent$Companion IconCompatParcelizer = new DeliveriesDetailComponent$Companion();
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 75;
        write = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        DefaultInAppMessageHtmlFullViewFactory defaultInAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.state.DeliveriesDetailComponent", displayInAppMessagelambda1.serializer(fastCoerceIn.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(fastAll.class), displayInAppMessagelambda1.serializer(AndroidViewBindingKt.class), displayInAppMessagelambda1.serializer(AndroidViewBindinglambda00.class), displayInAppMessagelambda1.serializer(AndroidViewHolderlayoutNode1coreModifier3.class), displayInAppMessagelambda1.serializer(Api33ImplExternalSyntheticLambda0.class)}, new setGraphicModalMaxWidthDp[]{fastDistinctBy.write, normalizedAngleCos.write, AndroidViewBindinglambda9.read, AndroidViewHolderlayoutNode15measure1.write, new EnumSerializer("com.roadrunner.delivery.state.UnknownComponent", Api33ImplExternalSyntheticLambda0.INSTANCE, new Annotation[0])}, new Annotation[0]);
        int i2 = read + 85;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return defaultInAppMessageHtmlFullViewFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
