package com.google.mlkit.common.internal;

import coil3.Extras$Key;
import com.google.android.gms.dynamite.zzj;
import com.google.firebase.components.ComponentRegistrar;
import io.sentry.util.MediaBrowserCompatMediaItem;
import java.util.List;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.AndroidUiFrameClock;
import o.AndroidUiFrameClockwithFrameNanos21;
import o.AndroidUiFrameClockwithFrameNanos22;
import o.AndroidUriHandler;
import o.AndroidViewConfiguration;
import o.AndroidViewConfigurationApi34;
import o.ImageHeaderParserImageType;
import o.accessgetWcp;
import o.accessisMainThread;
import o.captureRulersIfNeededui;
import o.getActionViewIntentlambda0;
import o.getHasMeasureResult;
import o.getMaximumFlingVelocity;
import o.getOriginalEventPositionF1C5BW0ui;
import o.getPanOffsetF1C5BW0;
import o.isMainThread;
import o.provideRelativeRulerValue;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.setDownChange;
import o.speculativeHit;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes4.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        getHasMeasureResult gethasmeasureresult = AndroidViewConfigurationApi34.read;
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(accessgetWcp.class);
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(AndroidUriHandler.class));
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = new AndroidUiDispatcherCompanioncurrentThread1(0);
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer = capturerulersifneededuiWrite.IconCompatParcelizer();
        captureRulersIfNeededui capturerulersifneededuiWrite2 = getHasMeasureResult.write(getMaximumFlingVelocity.class);
        capturerulersifneededuiWrite2.RemoteActionCompatParcelizer = new isMainThread(0);
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer2 = capturerulersifneededuiWrite2.IconCompatParcelizer();
        captureRulersIfNeededui capturerulersifneededuiWrite3 = getHasMeasureResult.write(Extras$Key.class);
        capturerulersifneededuiWrite3.write(new provideRelativeRulerValue(2, 0, AndroidUiFrameClockwithFrameNanos21.class));
        capturerulersifneededuiWrite3.RemoteActionCompatParcelizer = new MediaBrowserCompatMediaItem(1);
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer3 = capturerulersifneededuiWrite3.IconCompatParcelizer();
        captureRulersIfNeededui capturerulersifneededuiWrite4 = getHasMeasureResult.write(AndroidViewConfiguration.class);
        capturerulersifneededuiWrite4.write(new provideRelativeRulerValue(1, 1, getMaximumFlingVelocity.class));
        capturerulersifneededuiWrite4.RemoteActionCompatParcelizer = new ImageHeaderParserImageType();
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer4 = capturerulersifneededuiWrite4.IconCompatParcelizer();
        captureRulersIfNeededui capturerulersifneededuiWrite5 = getHasMeasureResult.write(AndroidUiFrameClockwithFrameNanos22.class);
        capturerulersifneededuiWrite5.RemoteActionCompatParcelizer = new Path$Companion();
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer5 = capturerulersifneededuiWrite5.IconCompatParcelizer();
        captureRulersIfNeededui capturerulersifneededuiWrite6 = getHasMeasureResult.write(zzj.class);
        capturerulersifneededuiWrite6.write(provideRelativeRulerValue.read(AndroidUiFrameClockwithFrameNanos22.class));
        capturerulersifneededuiWrite6.RemoteActionCompatParcelizer = new accessisMainThread();
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer6 = capturerulersifneededuiWrite6.IconCompatParcelizer();
        captureRulersIfNeededui capturerulersifneededuiWrite7 = getHasMeasureResult.write(speculativeHit.class);
        capturerulersifneededuiWrite7.write(provideRelativeRulerValue.read(AndroidUriHandler.class));
        capturerulersifneededuiWrite7.RemoteActionCompatParcelizer = new AndroidUiFrameClock();
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer7 = capturerulersifneededuiWrite7.IconCompatParcelizer();
        captureRulersIfNeededui capturerulersifneededuiWrite8 = getHasMeasureResult.write(AndroidUiFrameClockwithFrameNanos21.class);
        capturerulersifneededuiWrite8.MediaSessionCompatQueueItem = 1;
        capturerulersifneededuiWrite8.write(new provideRelativeRulerValue(1, 1, speculativeHit.class));
        capturerulersifneededuiWrite8.RemoteActionCompatParcelizer = new getActionViewIntentlambda0();
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer8 = capturerulersifneededuiWrite8.IconCompatParcelizer();
        setDownChange setdownchange = getOriginalEventPositionF1C5BW0ui.write;
        Object[] objArr = {gethasmeasureresult, gethasmeasureresultIconCompatParcelizer, gethasmeasureresultIconCompatParcelizer2, gethasmeasureresultIconCompatParcelizer3, gethasmeasureresultIconCompatParcelizer4, gethasmeasureresultIconCompatParcelizer5, gethasmeasureresultIconCompatParcelizer6, gethasmeasureresultIconCompatParcelizer7, gethasmeasureresultIconCompatParcelizer8};
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.write(9, objArr);
        return new getPanOffsetF1C5BW0(9, objArr);
    }
}
