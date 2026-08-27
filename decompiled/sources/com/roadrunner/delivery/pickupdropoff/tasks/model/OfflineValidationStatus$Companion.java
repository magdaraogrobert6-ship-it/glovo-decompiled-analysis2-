package com.roadrunner.delivery.pickupdropoff.tasks.model;

import androidx.compose.ui.graphics.Fields;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.EnumSerializer;
import o.AndroidUiModes;
import o.DefaultInAppMessageHtmlFullViewFactory;
import o.Device;
import o.Devices;
import o.displayInAppMessagelambda1;
import o.getUnregisteredInAppMessageannotations;
import o.getWEAR_OS_LARGE_ROUNDannotations;
import o.getWEAR_OS_RECTannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class OfflineValidationStatus$Companion {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ OfflineValidationStatus$Companion RemoteActionCompatParcelizer = new OfflineValidationStatus$Companion();
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        int i = write + 117;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        DefaultInAppMessageHtmlFullViewFactory defaultInAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.pickupdropoff.tasks.model.OfflineValidationStatus", displayInAppMessagelambda1.serializer(getWEAR_OS_LARGE_ROUNDannotations.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(AndroidUiModes.class), displayInAppMessagelambda1.serializer(getWEAR_OS_RECTannotations.class), displayInAppMessagelambda1.serializer(Devices.class), displayInAppMessagelambda1.serializer(Device.class)}, new setGraphicModalMaxWidthDp[]{new EnumSerializer("com.roadrunner.delivery.pickupdropoff.tasks.model.OfflineValidationStatus.Active", AndroidUiModes.INSTANCE, new Annotation[0]), new EnumSerializer("com.roadrunner.delivery.pickupdropoff.tasks.model.OfflineValidationStatus.InvalidPinError", getWEAR_OS_RECTannotations.INSTANCE, new Annotation[0]), new EnumSerializer("com.roadrunner.delivery.pickupdropoff.tasks.model.OfflineValidationStatus.MaxAttemptsError", Devices.INSTANCE, new Annotation[0]), new EnumSerializer("com.roadrunner.delivery.pickupdropoff.tasks.model.OfflineValidationStatus.Success", Device.INSTANCE, new Annotation[0])}, new Annotation[0]);
        int i2 = read + 9;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 11 / 0;
        }
        return defaultInAppMessageHtmlFullViewFactory;
    }
}
