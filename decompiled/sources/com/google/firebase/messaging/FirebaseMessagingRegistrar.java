package com.google.firebase.messaging;

import androidx.annotation.Keep;
import coil3.util.IntPair;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.Arrays;
import java.util.List;
import o.LookaheadCapablePlaceableCompaniononCommitAffectingRuler1;
import o.OwnerOnLayoutCompletedListener;
import o.accesscreateAndInsertNodeAsChild;
import o.accessgetButton15cp;
import o.accessgetResendMotionEventRunnablep;
import o.accesssetInstancecp;
import o.captureRulersIfNeededui;
import o.getHasMeasureResult;
import o.getMeasureResultui;
import o.hasui;
import o.isAppSetIdReadingEnabled;
import o.provideRelativeRulerValue;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.requestFocusCurrent;
import o.setShowLayoutBounds;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, getMeasureResultui getmeasureresultui) {
        FirebaseApp firebaseApp = (FirebaseApp) getmeasureresultui.read(FirebaseApp.class);
        if (getmeasureresultui.read(OwnerOnLayoutCompletedListener.class) == null) {
            return new FirebaseMessaging(firebaseApp, null, getmeasureresultui.write(requestFocusCurrent.class), getmeasureresultui.write(setShowLayoutBounds.class), (accesssetInstancecp) getmeasureresultui.read(accesssetInstancecp.class), getmeasureresultui.IconCompatParcelizer(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1), (hasui) getmeasureresultui.read(hasui.class));
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<getHasMeasureResult> getComponents() {
        LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1 = new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(accesscreateAndInsertNodeAsChild.class, accessgetButton15cp.class);
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(FirebaseMessaging.class);
        capturerulersifneededuiWrite.IconCompatParcelizer = LIBRARY_NAME;
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(FirebaseApp.class));
        capturerulersifneededuiWrite.write(new provideRelativeRulerValue(0, 0, OwnerOnLayoutCompletedListener.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.IconCompatParcelizer(requestFocusCurrent.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.IconCompatParcelizer(setShowLayoutBounds.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(accesssetInstancecp.class));
        capturerulersifneededuiWrite.write(new provideRelativeRulerValue(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, 0, 1));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(hasui.class));
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = new accessgetResendMotionEventRunnablep(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, 2);
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer(1);
        return Arrays.asList(capturerulersifneededuiWrite.IconCompatParcelizer(), (getHasMeasureResult) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{LIBRARY_NAME, "25.0.1"}, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1966006283));
    }
}
