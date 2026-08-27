package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import coil3.util.IntPair;
import com.google.firebase.components.ComponentRegistrar;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.Arrays;
import java.util.List;
import o.LookaheadCapablePlaceableCompaniononCommitAffectingRuler1;
import o.accesscreateAndInsertNodeAsChild;
import o.accessgetButton11cp;
import o.accessgetButton15cp;
import o.accessgetF2cp;
import o.captureRulersIfNeededui;
import o.getHasMeasureResult;
import o.getMeasureResultui;
import o.midPointq5eDKzI;
import o.provideRelativeRulerValue;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ accessgetButton15cp lambda$getComponents$0(getMeasureResultui getmeasureresultui) {
        accessgetF2cp.RemoteActionCompatParcelizer((Context) getmeasureresultui.read(Context.class));
        return accessgetF2cp.read().RemoteActionCompatParcelizer(accessgetButton11cp.IconCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ accessgetButton15cp lambda$getComponents$1(getMeasureResultui getmeasureresultui) {
        accessgetF2cp.RemoteActionCompatParcelizer((Context) getmeasureresultui.read(Context.class));
        return accessgetF2cp.read().RemoteActionCompatParcelizer(accessgetButton11cp.IconCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ accessgetButton15cp lambda$getComponents$2(getMeasureResultui getmeasureresultui) {
        accessgetF2cp.RemoteActionCompatParcelizer((Context) getmeasureresultui.read(Context.class));
        return accessgetF2cp.read().RemoteActionCompatParcelizer(accessgetButton11cp.write);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<getHasMeasureResult> getComponents() {
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(accessgetButton15cp.class);
        capturerulersifneededuiWrite.IconCompatParcelizer = LIBRARY_NAME;
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(Context.class));
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = new Gson$$ExternalSyntheticBUOutline0(6);
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer = capturerulersifneededuiWrite.IconCompatParcelizer();
        captureRulersIfNeededui capturerulersifneededuiRemoteActionCompatParcelizer = getHasMeasureResult.RemoteActionCompatParcelizer(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(midPointq5eDKzI.class, accessgetButton15cp.class));
        capturerulersifneededuiRemoteActionCompatParcelizer.write(provideRelativeRulerValue.read(Context.class));
        capturerulersifneededuiRemoteActionCompatParcelizer.RemoteActionCompatParcelizer = new Gson$$ExternalSyntheticBUOutline0(7);
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer2 = capturerulersifneededuiRemoteActionCompatParcelizer.IconCompatParcelizer();
        captureRulersIfNeededui capturerulersifneededuiRemoteActionCompatParcelizer2 = getHasMeasureResult.RemoteActionCompatParcelizer(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(accesscreateAndInsertNodeAsChild.class, accessgetButton15cp.class));
        capturerulersifneededuiRemoteActionCompatParcelizer2.write(provideRelativeRulerValue.read(Context.class));
        capturerulersifneededuiRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer = new Gson$$ExternalSyntheticBUOutline0(8);
        return Arrays.asList(gethasmeasureresultIconCompatParcelizer, gethasmeasureresultIconCompatParcelizer2, capturerulersifneededuiRemoteActionCompatParcelizer2.IconCompatParcelizer(), (getHasMeasureResult) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{LIBRARY_NAME, "19.0.0"}, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1966006283));
    }
}
