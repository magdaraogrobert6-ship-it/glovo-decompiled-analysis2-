package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import coil3.util.IntPair;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.Arrays;
import java.util.List;
import o.captureRulersIfNeededui;
import o.createLayerdefault;
import o.getHasMeasureResult;
import o.getMeasureResultui;
import o.getRulerScope;
import o.isLayoutNodeAncestor;
import o.isTreeConsistent;
import o.provideRelativeRulerValue;
import o.requestFocusCurrent;
import o.setShowLayoutBounds;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<getHasMeasureResult> getComponents() {
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(FirestoreMultiDbComponent.class);
        capturerulersifneededuiWrite.IconCompatParcelizer = LIBRARY_NAME;
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(FirebaseApp.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(Context.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.IconCompatParcelizer(setShowLayoutBounds.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.IconCompatParcelizer(requestFocusCurrent.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.write(isLayoutNodeAncestor.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.write(getRulerScope.class));
        capturerulersifneededuiWrite.write(new provideRelativeRulerValue(0, 0, isTreeConsistent.class));
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = new Gson$$ExternalSyntheticBUOutline0(9);
        return Arrays.asList(capturerulersifneededuiWrite.IconCompatParcelizer(), (getHasMeasureResult) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{LIBRARY_NAME, "26.1.1"}, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1966006283));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirestoreMultiDbComponent lambda$getComponents$0(getMeasureResultui getmeasureresultui) {
        return new FirestoreMultiDbComponent((Context) getmeasureresultui.read(Context.class), (FirebaseApp) getmeasureresultui.read(FirebaseApp.class), getmeasureresultui.serializer(isLayoutNodeAncestor.class), getmeasureresultui.serializer(getRulerScope.class), new createLayerdefault(getmeasureresultui.write(requestFocusCurrent.class), getmeasureresultui.write(setShowLayoutBounds.class), (isTreeConsistent) getmeasureresultui.read(isTreeConsistent.class)));
    }
}
