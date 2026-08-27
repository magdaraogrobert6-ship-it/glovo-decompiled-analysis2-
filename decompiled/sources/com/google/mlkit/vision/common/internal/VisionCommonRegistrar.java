package com.google.mlkit.vision.common.internal;

import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import o.BeyondBoundsLayout;
import o.captureRulersIfNeededui;
import o.getHasMeasureResult;
import o.getHasMoreContent;
import o.getNone4UtRPd4;
import o.provideRelativeRulerValue;
import o.toLookaheadCoordinates;

/* JADX INFO: loaded from: classes4.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(getNone4UtRPd4.class);
        capturerulersifneededuiWrite.write(new provideRelativeRulerValue(2, 0, ExtrasKt.class));
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = getNone4UtRPd4.IconCompatParcelizer;
        Object[] objArr = {capturerulersifneededuiWrite.IconCompatParcelizer()};
        for (int i = 0; i < 1; i++) {
            toLookaheadCoordinates tolookaheadcoordinates = BeyondBoundsLayout.read;
            if (objArr[i] == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "at index "));
                return null;
            }
        }
        toLookaheadCoordinates tolookaheadcoordinates2 = BeyondBoundsLayout.read;
        return new getHasMoreContent(1, objArr);
    }
}
