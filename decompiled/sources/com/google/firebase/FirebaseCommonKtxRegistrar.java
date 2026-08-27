package com.google.firebase;

import androidx.annotation.Keep;
import androidx.sqlite.SQLite;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import o.LookaheadCapablePlaceableCompaniononCommitAffectingRuler1;
import o.accessgetRulerScope;
import o.captureRulersIfNeeded;
import o.captureRulersIfNeededui;
import o.consistentLayoutState;
import o.findAncestorRulerDefiner;
import o.getHasMeasureResult;
import o.notifyRulerValueChange;
import o.provideRelativeRulerValue;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<getHasMeasureResult> getComponents() {
        captureRulersIfNeededui capturerulersifneededuiRemoteActionCompatParcelizer = getHasMeasureResult.RemoteActionCompatParcelizer(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(accessgetRulerScope.class, CoroutineDispatcher.class));
        capturerulersifneededuiRemoteActionCompatParcelizer.write(new provideRelativeRulerValue(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(accessgetRulerScope.class, Executor.class), 1, 0));
        capturerulersifneededuiRemoteActionCompatParcelizer.RemoteActionCompatParcelizer = consistentLayoutState.read;
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer = capturerulersifneededuiRemoteActionCompatParcelizer.IconCompatParcelizer();
        captureRulersIfNeededui capturerulersifneededuiRemoteActionCompatParcelizer2 = getHasMeasureResult.RemoteActionCompatParcelizer(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(captureRulersIfNeeded.class, CoroutineDispatcher.class));
        capturerulersifneededuiRemoteActionCompatParcelizer2.write(new provideRelativeRulerValue(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(captureRulersIfNeeded.class, Executor.class), 1, 0));
        capturerulersifneededuiRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer = consistentLayoutState.RemoteActionCompatParcelizer;
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer2 = capturerulersifneededuiRemoteActionCompatParcelizer2.IconCompatParcelizer();
        captureRulersIfNeededui capturerulersifneededuiRemoteActionCompatParcelizer3 = getHasMeasureResult.RemoteActionCompatParcelizer(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(findAncestorRulerDefiner.class, CoroutineDispatcher.class));
        capturerulersifneededuiRemoteActionCompatParcelizer3.write(new provideRelativeRulerValue(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(findAncestorRulerDefiner.class, Executor.class), 1, 0));
        capturerulersifneededuiRemoteActionCompatParcelizer3.RemoteActionCompatParcelizer = consistentLayoutState.serializer;
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer3 = capturerulersifneededuiRemoteActionCompatParcelizer3.IconCompatParcelizer();
        captureRulersIfNeededui capturerulersifneededuiRemoteActionCompatParcelizer4 = getHasMeasureResult.RemoteActionCompatParcelizer(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(notifyRulerValueChange.class, CoroutineDispatcher.class));
        capturerulersifneededuiRemoteActionCompatParcelizer4.write(new provideRelativeRulerValue(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(notifyRulerValueChange.class, Executor.class), 1, 0));
        capturerulersifneededuiRemoteActionCompatParcelizer4.RemoteActionCompatParcelizer = consistentLayoutState.write;
        return SQLite.read(gethasmeasureresultIconCompatParcelizer, gethasmeasureresultIconCompatParcelizer2, gethasmeasureresultIconCompatParcelizer3, capturerulersifneededuiRemoteActionCompatParcelizer4.IconCompatParcelizer());
    }
}
