package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import io.sentry.util.UrlUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import o.LookaheadCapablePlaceableCompaniononCommitAffectingRuler1;
import o.accessgetRulerScope;
import o.captureRulersIfNeeded;
import o.captureRulersIfNeededui;
import o.findAncestorRulerDefiner;
import o.getAlignmentLinesMap;
import o.getHasMeasureResult;
import o.invalidateAlignmentLinesFromPositionChange;
import o.notifyRulerValueChange;
import o.provideRulerValue;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final provideRulerValue serializer = new provideRulerValue(new invalidateAlignmentLinesFromPositionChange(2));
    public static final provideRulerValue read = new provideRulerValue(new invalidateAlignmentLinesFromPositionChange(3));
    public static final provideRulerValue IconCompatParcelizer = new provideRulerValue(new invalidateAlignmentLinesFromPositionChange(4));
    public static final provideRulerValue write = new provideRulerValue(new invalidateAlignmentLinesFromPositionChange(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1 = new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(accessgetRulerScope.class, ScheduledExecutorService.class);
        LookaheadCapablePlaceableCompaniononCommitAffectingRuler1[] lookaheadCapablePlaceableCompaniononCommitAffectingRuler1Arr = {new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(accessgetRulerScope.class, ExecutorService.class), new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(accessgetRulerScope.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);
        for (int i = 0; i < 2; i++) {
            UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 1390870901, -1390870897, trackEventI.IconCompatParcelizer(), new Object[]{lookaheadCapablePlaceableCompaniononCommitAffectingRuler1Arr[i], "Null interface"});
        }
        Collections.addAll(hashSet, lookaheadCapablePlaceableCompaniononCommitAffectingRuler1Arr);
        getHasMeasureResult gethasmeasureresult = new getHasMeasureResult(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new getAlignmentLinesMap(25), hashSet3);
        LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler2 = new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(findAncestorRulerDefiner.class, ScheduledExecutorService.class);
        LookaheadCapablePlaceableCompaniononCommitAffectingRuler1[] lookaheadCapablePlaceableCompaniononCommitAffectingRuler1Arr2 = {new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(findAncestorRulerDefiner.class, ExecutorService.class), new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(findAncestorRulerDefiner.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(lookaheadCapablePlaceableCompaniononCommitAffectingRuler2);
        for (int i2 = 0; i2 < 2; i2++) {
            UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 1390870901, -1390870897, trackEventI.IconCompatParcelizer(), new Object[]{lookaheadCapablePlaceableCompaniononCommitAffectingRuler1Arr2[i2], "Null interface"});
        }
        Collections.addAll(hashSet4, lookaheadCapablePlaceableCompaniononCommitAffectingRuler1Arr2);
        getHasMeasureResult gethasmeasureresult2 = new getHasMeasureResult(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new getAlignmentLinesMap(26), hashSet6);
        LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler3 = new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(captureRulersIfNeeded.class, ScheduledExecutorService.class);
        LookaheadCapablePlaceableCompaniononCommitAffectingRuler1[] lookaheadCapablePlaceableCompaniononCommitAffectingRuler1Arr3 = {new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(captureRulersIfNeeded.class, ExecutorService.class), new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(captureRulersIfNeeded.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(lookaheadCapablePlaceableCompaniononCommitAffectingRuler3);
        for (int i3 = 0; i3 < 2; i3++) {
            UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 1390870901, -1390870897, trackEventI.IconCompatParcelizer(), new Object[]{lookaheadCapablePlaceableCompaniononCommitAffectingRuler1Arr3[i3], "Null interface"});
        }
        Collections.addAll(hashSet7, lookaheadCapablePlaceableCompaniononCommitAffectingRuler1Arr3);
        getHasMeasureResult gethasmeasureresult3 = new getHasMeasureResult(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new getAlignmentLinesMap(27), hashSet9);
        captureRulersIfNeededui capturerulersifneededuiRemoteActionCompatParcelizer = getHasMeasureResult.RemoteActionCompatParcelizer(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(notifyRulerValueChange.class, Executor.class));
        capturerulersifneededuiRemoteActionCompatParcelizer.RemoteActionCompatParcelizer = new getAlignmentLinesMap(28);
        return Arrays.asList(gethasmeasureresult, gethasmeasureresult2, gethasmeasureresult3, capturerulersifneededuiRemoteActionCompatParcelizer.IconCompatParcelizer());
    }
}
