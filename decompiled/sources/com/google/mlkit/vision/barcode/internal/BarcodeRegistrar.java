package com.google.mlkit.vision.barcode.internal;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.components.ComponentRegistrar;
import io.sentry.util.MediaBrowserCompatMediaItem;
import java.util.List;
import o.AndroidUriHandler;
import o.AndroidViewConfiguration;
import o.Api29Impl;
import o.HoverIconModifierNodefindDescendantNodeWithCursorInBounds1;
import o.MatrixPositionCalculator;
import o.captureRulersIfNeededui;
import o.clearPrimaryClip;
import o.getHasMeasureResult;
import o.getMotionEvent;
import o.isMainThread;
import o.provideRelativeRulerValue;

/* JADX INFO: loaded from: classes4.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(Api29Impl.class);
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(AndroidUriHandler.class));
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = new isMainThread(1);
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer = capturerulersifneededuiWrite.IconCompatParcelizer();
        captureRulersIfNeededui capturerulersifneededuiWrite2 = getHasMeasureResult.write(clearPrimaryClip.class);
        capturerulersifneededuiWrite2.write(provideRelativeRulerValue.read(Api29Impl.class));
        capturerulersifneededuiWrite2.write(provideRelativeRulerValue.read(AndroidViewConfiguration.class));
        capturerulersifneededuiWrite2.write(provideRelativeRulerValue.read(AndroidUriHandler.class));
        capturerulersifneededuiWrite2.RemoteActionCompatParcelizer = new MediaBrowserCompatMediaItem(2);
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer2 = capturerulersifneededuiWrite2.IconCompatParcelizer();
        HoverIconModifierNodefindDescendantNodeWithCursorInBounds1 hoverIconModifierNodefindDescendantNodeWithCursorInBounds1 = getMotionEvent.RemoteActionCompatParcelizer;
        Object[] objArr = {gethasmeasureresultIconCompatParcelizer, gethasmeasureresultIconCompatParcelizer2};
        for (int i = 0; i < 2; i++) {
            if (objArr[i] == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "at index "));
                return null;
            }
        }
        return new MatrixPositionCalculator(2, objArr);
    }
}
