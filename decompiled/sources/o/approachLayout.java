package o;

import com.google.android.gms.measurement.internal.zzpg;
import com.huawei.location.Vw$Vw;
import fwfd.com.fwfsdk.util.FWFHelper;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class approachLayout implements Callable {
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ lookaheadScopeCoordinates RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ approachLayout(lookaheadScopeCoordinates lookaheadscopecoordinates, String str, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = lookaheadscopecoordinates;
        this.IconCompatParcelizer = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        int i = this.serializer;
        String str = this.IconCompatParcelizer;
        lookaheadScopeCoordinates lookaheadscopecoordinates = this.RemoteActionCompatParcelizer;
        int i2 = 1;
        if (i == 0) {
            return new KeyEvent_androidKt(new approachLayout(lookaheadscopecoordinates, str, i2));
        }
        if (i != 1) {
            Vw$Vw vw$Vw = new Vw$Vw(lookaheadscopecoordinates, str, false, 4);
            dispatchPreFlingQWom1Mo dispatchpreflingqwom1mo = new dispatchPreFlingQWom1Mo("internal.remoteConfig", 0);
            dispatchpreflingqwom1mo.IconCompatParcelizer.put("getValue", new KeyEvent_androidKt(dispatchpreflingqwom1mo, vw$Vw));
            return dispatchpreflingqwom1mo;
        }
        LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1 = lookaheadscopecoordinates.MediaSessionCompatToken.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        zzpg.serializer(layoutNodeSubcompositionsStatecreateMeasurePolicy1);
        localLookaheadPositionOfauaQtcdefault locallookaheadpositionofauaqtcdefaultMediaMetadataCompat = layoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaMetadataCompat(str);
        HashMap map = new HashMap();
        map.put("platform", FWFHelper.fwfDeviceOS);
        map.put("package_name", str);
        ((LookaheadScopeKtLookaheadScope221) lookaheadscopecoordinates.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompat.read();
        map.put("gmp_version", 133005L);
        if (locallookaheadpositionofauaqtcdefaultMediaMetadataCompat != null) {
            String strPlaybackStateCompatCustomAction = locallookaheadpositionofauaqtcdefaultMediaMetadataCompat.PlaybackStateCompatCustomAction();
            if (strPlaybackStateCompatCustomAction != null) {
                map.put("app_version", strPlaybackStateCompatCustomAction);
            }
            map.put("app_version_int", Long.valueOf(locallookaheadpositionofauaqtcdefaultMediaMetadataCompat.MediaSessionCompatToken()));
            map.put("dynamite_version", Long.valueOf(locallookaheadpositionofauaqtcdefaultMediaMetadataCompat.read()));
        }
        return map;
    }
}
