package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import coil3.util.IntPair;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentRegistrar;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.Arrays;
import java.util.List;
import o.FlingCancellationException;
import o.LookaheadCapablePlaceable;
import o.accessgetSystemNavigationDowncp;
import o.captureRulersIfNeededui;
import o.getHasMeasureResult;
import o.getMeasureResultui;
import o.getSoftRightEK5gGoQ;
import o.hasui;
import o.logTree;
import o.provideRelativeRulerValue;
import o.setMeasurementConstraintsBRTryo0;
import o.setPlacedUnderMotionFrameOfReference;
import o.setRoundRectOutlineTNW_H78default;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static logTree lambda$getComponents$0(getMeasureResultui getmeasureresultui) {
        FirebaseApp firebaseApp = (FirebaseApp) getmeasureresultui.read(FirebaseApp.class);
        Context context = (Context) getmeasureresultui.read(Context.class);
        hasui hasuiVar = (hasui) getmeasureresultui.read(hasui.class);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(firebaseApp);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(hasuiVar);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(context.getApplicationContext());
        if (LookaheadCapablePlaceable.read == null) {
            synchronized (LookaheadCapablePlaceable.class) {
                if (LookaheadCapablePlaceable.read == null) {
                    Bundle bundle = new Bundle(1);
                    firebaseApp.IconCompatParcelizer();
                    if ("[DEFAULT]".equals(firebaseApp.ParcelableVolumeInfo)) {
                        ((setPlacedUnderMotionFrameOfReference) hasuiVar).write(setMeasurementConstraintsBRTryo0.read, setRoundRectOutlineTNW_H78default.MediaSessionCompatQueueItem);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.RemoteActionCompatParcelizer());
                    }
                    LookaheadCapablePlaceable.read = new LookaheadCapablePlaceable(getSoftRightEK5gGoQ.write(context, bundle).read);
                }
            }
        }
        return LookaheadCapablePlaceable.read;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint
    public List<getHasMeasureResult> getComponents() {
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(logTree.class);
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(FirebaseApp.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(Context.class));
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(hasui.class));
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = FlingCancellationException.MediaDescriptionCompat;
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer(2);
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer = capturerulersifneededuiWrite.IconCompatParcelizer();
        int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        return Arrays.asList(gethasmeasureresultIconCompatParcelizer, (getHasMeasureResult) IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{"fire-analytics", "23.0.0"}, iRemoteActionCompatParcelizer, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1966006283));
    }
}
