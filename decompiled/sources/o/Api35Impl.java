package o;

import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzr;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Api35Impl implements Callable {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public Api35Impl(zzpg zzpgVar, zzr zzrVar) {
        this.RemoteActionCompatParcelizer = 3;
        this.write = zzrVar;
        Objects.requireNonNull(zzpgVar);
        this.serializer = zzpgVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        ApproachMeasureScopeImpl approachMeasureScopeImpl;
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        Object obj2 = this.write;
        if (i != 0) {
            if (i == 1) {
                LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress1 = (LookaheadScopeKtdefaultPlacementApproachInProgress1) obj;
                lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.serializer();
                LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1 = lookaheadScopeKtdefaultPlacementApproachInProgress1.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy1);
                return layoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaSessionCompatQueueItem((String) obj2);
            }
            if (i == 2) {
                LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress2 = (LookaheadScopeKtdefaultPlacementApproachInProgress1) obj;
                lookaheadScopeKtdefaultPlacementApproachInProgress2.serializer.serializer();
                return new zzao(lookaheadScopeKtdefaultPlacementApproachInProgress2.serializer.RemoteActionCompatParcelizer(((zzr) obj2).RatingCompat));
            }
            zzr zzrVar = (zzr) obj2;
            String str = zzrVar.RatingCompat;
            accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
            zzpg zzpgVar = (zzpg) obj;
            getMeasuredWidth getmeasuredwidthSerializer = zzpgVar.serializer(str);
            MeasureScope measureScope = MeasureScope.ANALYTICS_STORAGE;
            if (getmeasuredwidthSerializer.IconCompatParcelizer(measureScope) && getMeasuredWidth.IconCompatParcelizer(100, zzrVar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8).IconCompatParcelizer(measureScope)) {
                return zzpgVar.read(zzrVar).MediaMetadataCompat();
            }
            zzpgVar.RatingCompat().PlaybackStateCompat.RemoteActionCompatParcelizer("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        accessgetCursorBasedcp accessgetcursorbasedcp = (accessgetCursorBasedcp) obj2;
        setRequestedFrameRate setrequestedframerate = (setRequestedFrameRate) obj;
        accessgetcursorbasedcp.getClass();
        HashMap map = ApproachMeasureScopeImpl.IconCompatParcelizer;
        setApproachMeasureRequiredui.RemoteActionCompatParcelizer();
        int i2 = ApproachMeasureScopeImpllayout1.IconCompatParcelizer;
        setApproachMeasureRequiredui.RemoteActionCompatParcelizer();
        if (Boolean.parseBoolean("")) {
            HashMap map2 = ApproachMeasureScopeImpl.IconCompatParcelizer;
            if (map2.get("detectorTaskWithResource#run") == null) {
                map2.put("detectorTaskWithResource#run", new ApproachMeasureScopeImpl("detectorTaskWithResource#run"));
            }
            approachMeasureScopeImpl = (ApproachMeasureScopeImpl) map2.get("detectorTaskWithResource#run");
        } else {
            approachMeasureScopeImpl = getApproachMeasureRequiredui.serializer;
        }
        approachMeasureScopeImpl.RemoteActionCompatParcelizer();
        try {
            List listWrite = accessgetcursorbasedcp.serializer.write(setrequestedframerate);
            approachMeasureScopeImpl.close();
            return listWrite;
        } catch (Throwable th) {
            try {
                approachMeasureScopeImpl.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    public /* synthetic */ Api35Impl(accessgetCursorBasedcp accessgetcursorbasedcp, setRequestedFrameRate setrequestedframerate) {
        this.RemoteActionCompatParcelizer = 0;
        this.write = accessgetcursorbasedcp;
        this.serializer = setrequestedframerate;
    }

    public /* synthetic */ Api35Impl(LookaheadScopeKtdefaultPlacementApproachInProgress1 lookaheadScopeKtdefaultPlacementApproachInProgress1, Object obj, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
        this.serializer = lookaheadScopeKtdefaultPlacementApproachInProgress1;
    }
}
