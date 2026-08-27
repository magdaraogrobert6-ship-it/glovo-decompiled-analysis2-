package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import coil3.util.IntPair;
import com.google.firebase.components.ComponentRegistrar;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.Arrays;
import java.util.List;
import o.LayoutTreeConsistencyChecker;
import o.captureRulersIfNeededui;
import o.getAlignmentLinesMap;
import o.getHasMeasureResult;
import o.getMeasureResultui;
import o.logTree;
import o.provideRelativeRulerValue;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<getHasMeasureResult> getComponents() {
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(LayoutTreeConsistencyChecker.class);
        capturerulersifneededuiWrite.IconCompatParcelizer = LIBRARY_NAME;
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(Context.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.IconCompatParcelizer(logTree.class));
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = new getAlignmentLinesMap(21);
        return Arrays.asList(capturerulersifneededuiWrite.IconCompatParcelizer(), (getHasMeasureResult) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{LIBRARY_NAME, "21.1.1"}, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1966006283));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ LayoutTreeConsistencyChecker lambda$getComponents$0(getMeasureResultui getmeasureresultui) {
        return new LayoutTreeConsistencyChecker((Context) getmeasureresultui.read(Context.class), getmeasureresultui.write(logTree.class));
    }
}
