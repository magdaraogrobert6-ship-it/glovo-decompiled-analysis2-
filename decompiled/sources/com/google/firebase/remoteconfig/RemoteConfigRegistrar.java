package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import coil3.util.IntPair;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import o.LayoutTreeConsistencyChecker;
import o.LookaheadCapablePlaceableCompaniononCommitAffectingRuler1;
import o.accessgetResendMotionEventRunnablep;
import o.accessremoveNotificationForSysPropsChange;
import o.accesssetInstancecp;
import o.captureRulersIfNeededui;
import o.findAncestorRulerDefiner;
import o.getHasMeasureResult;
import o.getMeasureResultui;
import o.logTree;
import o.provideRelativeRulerValue;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RemoteConfigComponent lambda$getComponents$0(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, getMeasureResultui getmeasureresultui) {
        return new RemoteConfigComponent((Context) getmeasureresultui.read(Context.class), (ScheduledExecutorService) getmeasureresultui.write(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1), (FirebaseApp) getmeasureresultui.read(FirebaseApp.class), (accesssetInstancecp) getmeasureresultui.read(accesssetInstancecp.class), ((LayoutTreeConsistencyChecker) getmeasureresultui.read(LayoutTreeConsistencyChecker.class)).write("frc"), getmeasureresultui.write(logTree.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<getHasMeasureResult> getComponents() {
        LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1 = new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(findAncestorRulerDefiner.class, ScheduledExecutorService.class);
        captureRulersIfNeededui capturerulersifneededui = new captureRulersIfNeededui(RemoteConfigComponent.class, new Class[]{accessremoveNotificationForSysPropsChange.class});
        capturerulersifneededui.IconCompatParcelizer = LIBRARY_NAME;
        capturerulersifneededui.write(provideRelativeRulerValue.read(Context.class));
        capturerulersifneededui.write(new provideRelativeRulerValue(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, 1, 0));
        capturerulersifneededui.write(provideRelativeRulerValue.read(FirebaseApp.class));
        capturerulersifneededui.write(provideRelativeRulerValue.read(accesssetInstancecp.class));
        capturerulersifneededui.write(provideRelativeRulerValue.read(LayoutTreeConsistencyChecker.class));
        capturerulersifneededui.write(provideRelativeRulerValue.IconCompatParcelizer(logTree.class));
        capturerulersifneededui.RemoteActionCompatParcelizer = new accessgetResendMotionEventRunnablep(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, 3);
        capturerulersifneededui.RemoteActionCompatParcelizer(2);
        return Arrays.asList(capturerulersifneededui.IconCompatParcelizer(), (getHasMeasureResult) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{LIBRARY_NAME, "23.0.1"}, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1966006283));
    }
}
