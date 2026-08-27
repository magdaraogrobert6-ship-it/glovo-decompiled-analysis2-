package com.google.mlkit.vision.face.internal;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import o.AndroidUriHandler;
import o.AndroidViewConfiguration;
import o.CalculateMatrixToWindowApi29;
import o.accessgetInterceptor;
import o.captureRulersIfNeededui;
import o.getCrop;
import o.getFillWidth;
import o.getFitannotations;
import o.getHasMeasureResult;
import o.preConcattUYjHk;
import o.provideRelativeRulerValue;

/* JADX INFO: loaded from: classes4.dex */
public class FaceRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(accessgetInterceptor.class);
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(AndroidUriHandler.class));
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = CalculateMatrixToWindowApi29.RemoteActionCompatParcelizer;
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer = capturerulersifneededuiWrite.IconCompatParcelizer();
        captureRulersIfNeededui capturerulersifneededuiWrite2 = getHasMeasureResult.write(preConcattUYjHk.class);
        capturerulersifneededuiWrite2.write(provideRelativeRulerValue.read(accessgetInterceptor.class));
        capturerulersifneededuiWrite2.write(provideRelativeRulerValue.read(AndroidViewConfiguration.class));
        capturerulersifneededuiWrite2.RemoteActionCompatParcelizer = CalculateMatrixToWindowApi29.IconCompatParcelizer;
        Object[] objArr = {gethasmeasureresultIconCompatParcelizer, capturerulersifneededuiWrite2.IconCompatParcelizer()};
        for (int i = 0; i < 2; i++) {
            getFitannotations getfitannotations = getCrop.RemoteActionCompatParcelizer;
            if (objArr[i] == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "at index "));
                return null;
            }
        }
        getFitannotations getfitannotations2 = getCrop.RemoteActionCompatParcelizer;
        return new getFillWidth(2, objArr);
    }
}
