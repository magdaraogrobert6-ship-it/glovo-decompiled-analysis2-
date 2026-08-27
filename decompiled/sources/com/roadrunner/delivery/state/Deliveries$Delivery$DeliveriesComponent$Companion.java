package com.roadrunner.delivery.state;

import androidx.compose.ui.graphics.Fields;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.EnumSerializer;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.MathHelpersKt;
import o.displayInAppMessagelambda1;
import o.fastAny;
import o.fastCbrt;
import o.fastCoerceAtLeast;
import o.fastFirstOrNull;
import o.fastFlatMap;
import o.fastFold;
import o.fastForEachReversed;
import o.fastJoinToStringdefault;
import o.fastJoinTodefault;
import o.fastMap;
import o.fastMaxBy;
import o.fastMaxOfOrDefault;
import o.fastMaxOfOrNull;
import o.fastMinByOrNull;
import o.fastReduce;
import o.fastSumBy;
import o.fastZip;
import o.getUnregisteredInAppMessageannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class Deliveries$Delivery$DeliveriesComponent$Companion {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ Deliveries$Delivery$DeliveriesComponent$Companion RemoteActionCompatParcelizer = new Deliveries$Delivery$DeliveriesComponent$Companion();
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = serializer + 45;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        DefaultInAppMessageHtmlFullViewFactory defaultInAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.state.Deliveries.Delivery.DeliveriesComponent", displayInAppMessagelambda1.serializer(fastAny.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(fastFlatMap.class), displayInAppMessagelambda1.serializer(fastFold.class), displayInAppMessagelambda1.serializer(fastForEachReversed.class), displayInAppMessagelambda1.serializer(fastMap.class), displayInAppMessagelambda1.serializer(fastMaxOfOrDefault.class), displayInAppMessagelambda1.serializer(fastMaxOfOrNull.class), displayInAppMessagelambda1.serializer(MathHelpersKt.class), displayInAppMessagelambda1.serializer(fastSumBy.class), displayInAppMessagelambda1.serializer(fastCoerceAtLeast.class)}, new setGraphicModalMaxWidthDp[]{fastFirstOrNull.serializer, fastJoinTodefault.RemoteActionCompatParcelizer, fastJoinToStringdefault.IconCompatParcelizer, fastMaxBy.read, fastReduce.IconCompatParcelizer, fastMinByOrNull.write, fastZip.read, fastCbrt.serializer, new EnumSerializer("vendor_review", fastCoerceAtLeast.INSTANCE, new Annotation[0])}, new Annotation[0]);
        int i2 = write + 57;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return defaultInAppMessageHtmlFullViewFactory;
        }
        throw null;
    }
}
