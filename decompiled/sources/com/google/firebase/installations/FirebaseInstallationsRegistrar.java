package com.google.firebase.installations;

import androidx.annotation.Keep;
import coil3.util.IntPair;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.LookaheadCapablePlaceableCompaniononCommitAffectingRuler1;
import o.LookaheadDelegate;
import o.accessgetRulerScope;
import o.accesssetInstancecp;
import o.captureRulersIfNeededui;
import o.findAncestorRulerDefiner;
import o.findRulerValue;
import o.getHasMeasureResult;
import o.getMeasureResultui;
import o.provideRelativeRulerValue;
import o.registerOnEndApplyChangesListener;
import o.setRoundRectOutlineTNW_H78default;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<getHasMeasureResult> getComponents() {
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(accesssetInstancecp.class);
        capturerulersifneededuiWrite.IconCompatParcelizer = LIBRARY_NAME;
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(FirebaseApp.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.IconCompatParcelizer(registerOnEndApplyChangesListener.class));
        capturerulersifneededuiWrite.write(new provideRelativeRulerValue(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(accessgetRulerScope.class, ExecutorService.class), 1, 0));
        capturerulersifneededuiWrite.write(new provideRelativeRulerValue(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(findAncestorRulerDefiner.class, Executor.class), 1, 0));
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = new Gson$$ExternalSyntheticBUOutline0(18);
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer = capturerulersifneededuiWrite.IconCompatParcelizer();
        setRoundRectOutlineTNW_H78default setroundrectoutlinetnw_h78default = new setRoundRectOutlineTNW_H78default(1);
        captureRulersIfNeededui capturerulersifneededuiWrite2 = getHasMeasureResult.write(setRoundRectOutlineTNW_H78default.class);
        capturerulersifneededuiWrite2.MediaSessionCompatQueueItem = 1;
        capturerulersifneededuiWrite2.RemoteActionCompatParcelizer = new findRulerValue(0, setroundrectoutlinetnw_h78default);
        return Arrays.asList(gethasmeasureresultIconCompatParcelizer, capturerulersifneededuiWrite2.IconCompatParcelizer(), (getHasMeasureResult) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{LIBRARY_NAME, "19.1.0"}, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1966006283));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static accesssetInstancecp lambda$getComponents$0(getMeasureResultui getmeasureresultui) {
        return new FirebaseInstallations((FirebaseApp) getmeasureresultui.read(FirebaseApp.class), getmeasureresultui.write(registerOnEndApplyChangesListener.class), (ExecutorService) getmeasureresultui.write(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(accessgetRulerScope.class, ExecutorService.class)), new LookaheadDelegate((Executor) getmeasureresultui.write(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(findAncestorRulerDefiner.class, Executor.class))));
    }
}
