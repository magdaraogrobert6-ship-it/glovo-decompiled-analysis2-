package com.google.firebase.crashlytics;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import coil3.util.IntPair;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.sync.MutexImpl;
import o.LookaheadCapablePlaceableCompaniononCommitAffectingRuler1;
import o.accessgetAccessibilityFocusedVirtualViewIdp;
import o.accessgetCurrentlyAccessibilityFocusedANIp;
import o.accessgetRulerScope;
import o.accessremoveNotificationForSysPropsChange;
import o.accesssetInstancecp;
import o.captureRulersIfNeeded;
import o.captureRulersIfNeededui;
import o.findAncestorRulerDefiner;
import o.getCachedAlignmentLinesMap;
import o.getHasMeasureResult;
import o.logTree;
import o.provideRelativeRulerValue;
import o.set_measureResult;

/* JADX INFO: loaded from: classes4.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int write = 0;
    public final LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 RemoteActionCompatParcelizer = new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(accessgetRulerScope.class, ExecutorService.class);
    public final LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 serializer = new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(findAncestorRulerDefiner.class, ExecutorService.class);
    public final LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 IconCompatParcelizer = new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(captureRulersIfNeeded.class, ExecutorService.class);

    static {
        accessgetCurrentlyAccessibilityFocusedANIp accessgetcurrentlyaccessibilityfocusedanip = accessgetCurrentlyAccessibilityFocusedANIp.CRASHLYTICS;
        FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.read;
        accessgetcurrentlyaccessibilityfocusedanip.getClass();
        Map map = FirebaseSessionsDependencies.RemoteActionCompatParcelizer;
        if (map.containsKey(accessgetcurrentlyaccessibilityfocusedanip)) {
            accessgetcurrentlyaccessibilityfocusedanip.toString();
        } else {
            map.put(accessgetcurrentlyaccessibilityfocusedanip, new accessgetAccessibilityFocusedVirtualViewIdp(new MutexImpl(true)));
            accessgetcurrentlyaccessibilityfocusedanip.toString();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(set_measureResult.class);
        capturerulersifneededuiWrite.IconCompatParcelizer = "fire-cls";
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(FirebaseApp.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(accesssetInstancecp.class));
        capturerulersifneededuiWrite.write(new provideRelativeRulerValue(this.RemoteActionCompatParcelizer, 1, 0));
        capturerulersifneededuiWrite.write(new provideRelativeRulerValue(this.serializer, 1, 0));
        capturerulersifneededuiWrite.write(new provideRelativeRulerValue(this.IconCompatParcelizer, 1, 0));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.write(getCachedAlignmentLinesMap.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.write(logTree.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.write(accessremoveNotificationForSysPropsChange.class));
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(21, this);
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer(2);
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer = capturerulersifneededuiWrite.IconCompatParcelizer();
        int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        return Arrays.asList(gethasmeasureresultIconCompatParcelizer, (getHasMeasureResult) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{"fire-cls", "20.0.4"}, iRemoteActionCompatParcelizer, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1966006283));
    }
}
