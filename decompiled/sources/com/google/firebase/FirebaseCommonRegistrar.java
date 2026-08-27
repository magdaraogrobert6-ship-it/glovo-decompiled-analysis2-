package com.google.firebase;

import android.content.Context;
import android.os.Build;
import coil3.util.IntPair;
import com.google.firebase.components.ComponentRegistrar;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import o.LookaheadCapablePlaceableCompaniononCommitAffectingRuler1;
import o.accessgetResendMotionEventRunnablep;
import o.accessgetRulerScope;
import o.captureRulersIfNeededui;
import o.getAlignmentLinesMap;
import o.getHasMeasureResult;
import o.markOnScreenCardsAsReadlambda0;
import o.onSemanticsChange;
import o.provideRelativeRulerValue;
import o.registerOnEndApplyChangesListener;
import o.removeDelayedExecution;
import o.requestFocusCurrent;
import o.setRoundRectOutlineTNW_H78default;
import o.setShowLayoutBounds;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(requestFocusCurrent.class);
        capturerulersifneededuiWrite.write(new provideRelativeRulerValue(2, 0, removeDelayedExecution.class));
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = new Gson$$ExternalSyntheticBUOutline0(21);
        arrayList.add(capturerulersifneededuiWrite.IconCompatParcelizer());
        LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1 = new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(accessgetRulerScope.class, Executor.class);
        captureRulersIfNeededui capturerulersifneededui = new captureRulersIfNeededui(onSemanticsChange.class, new Class[]{registerOnEndApplyChangesListener.class, setShowLayoutBounds.class});
        capturerulersifneededui.write(provideRelativeRulerValue.read(Context.class));
        capturerulersifneededui.write(provideRelativeRulerValue.read(FirebaseApp.class));
        capturerulersifneededui.write(new provideRelativeRulerValue(2, 0, setRoundRectOutlineTNW_H78default.class));
        capturerulersifneededui.write(new provideRelativeRulerValue(1, 1, requestFocusCurrent.class));
        capturerulersifneededui.write(new provideRelativeRulerValue(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, 1, 0));
        capturerulersifneededui.RemoteActionCompatParcelizer = new accessgetResendMotionEventRunnablep(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, 1);
        arrayList.add(capturerulersifneededui.IconCompatParcelizer());
        Object[] objArr = {"fire-android", String.valueOf(Build.VERSION.SDK_INT)};
        int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        arrayList.add((getHasMeasureResult) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr, iRemoteActionCompatParcelizer, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1966006283));
        int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer4 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        arrayList.add((getHasMeasureResult) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, iRemoteActionCompatParcelizer3, new Object[]{"fire-core", "22.0.1"}, iRemoteActionCompatParcelizer2, iRemoteActionCompatParcelizer4, -1966006283));
        Object[] objArr2 = {"device-name", serializer(Build.PRODUCT)};
        int iRemoteActionCompatParcelizer5 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        arrayList.add((getHasMeasureResult) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr2, iRemoteActionCompatParcelizer5, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1966006283));
        Object[] objArr3 = {"device-model", serializer(Build.DEVICE)};
        int iRemoteActionCompatParcelizer6 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        arrayList.add((getHasMeasureResult) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr3, iRemoteActionCompatParcelizer6, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1966006283));
        Object[] objArr4 = {"device-brand", serializer(Build.BRAND)};
        int iRemoteActionCompatParcelizer7 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        arrayList.add((getHasMeasureResult) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr4, iRemoteActionCompatParcelizer7, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1966006283));
        arrayList.add(IntPair.IconCompatParcelizer("android-target-sdk", new getAlignmentLinesMap(17)));
        arrayList.add(IntPair.IconCompatParcelizer("android-min-sdk", new getAlignmentLinesMap(18)));
        arrayList.add(IntPair.IconCompatParcelizer("android-platform", new getAlignmentLinesMap(19)));
        arrayList.add(IntPair.IconCompatParcelizer("android-installer", new getAlignmentLinesMap(20)));
        try {
            markOnScreenCardsAsReadlambda0.serializer.getClass();
            str = "2.3.21";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            int iRemoteActionCompatParcelizer8 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer9 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer10 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            arrayList.add((getHasMeasureResult) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, iRemoteActionCompatParcelizer9, new Object[]{"kotlin", str}, iRemoteActionCompatParcelizer8, iRemoteActionCompatParcelizer10, -1966006283));
        }
        return arrayList;
    }

    public static String serializer(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }
}
