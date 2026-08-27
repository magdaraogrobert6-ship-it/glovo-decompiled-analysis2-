package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.measurement.zzz;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.location.Vw$Vw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlinx.coroutines.rx2.RxCompletableKt;

/* JADX INFO: loaded from: classes2.dex */
public final class KeyEvent_androidKt extends getNumPadInsertEK5gGoQ {
    public final /* synthetic */ int RemoteActionCompatParcelizer = 4;
    public final Object write;

    public KeyEvent_androidKt(PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1) {
        super("internal.logger");
        this.write = pinnableContainerKtLocalPinnableContainer1;
        this.IconCompatParcelizer.put("log", new setPositionChange(this, false, true));
        this.IconCompatParcelizer.put("silent", new dispatchPreFlingQWom1Mo("silent", 1));
        ((getNumPadInsertEK5gGoQ) this.IconCompatParcelizer.get("silent")).RemoteActionCompatParcelizer("log", new setPositionChange(this, true, true));
        this.IconCompatParcelizer.put("unmonitored", new dispatchPreFlingQWom1Mo("unmonitored", 2));
        ((getNumPadInsertEK5gGoQ) this.IconCompatParcelizer.get("unmonitored")).RemoteActionCompatParcelizer("log", new setPositionChange(this, false, false));
    }

    @Override // o.getNumPadInsertEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ RemoteActionCompatParcelizer(androidx.transition.TransitionValuesMaps transitionValuesMaps, List list) {
        TreeMap treeMap;
        int i = this.RemoteActionCompatParcelizer;
        String str = this.serializer;
        getOEK5gGoQ getoek5ggoq = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
        Object obj = this.write;
        String str2 = null;
        if (i == 0) {
            getTvInputComposite2EK5gGoQ.serializer(list, 3, str);
            String strIconCompatParcelizer = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) list.get(0)).IconCompatParcelizer();
            getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq = (getNumPadMoveHomeEK5gGoQ) list.get(1);
            zzz zzzVar = (zzz) transitionValuesMaps.MediaDescriptionCompat;
            long jSerializer = (long) getTvInputComposite2EK5gGoQ.serializer(zzzVar.write(transitionValuesMaps, getnumpadmovehomeek5ggoq).write().doubleValue());
            getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite = zzzVar.write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) list.get(2));
            HashMap map = getnumpadmovehomeek5ggoqWrite instanceof getNumPadPageUpEK5gGoQ ? getTvInputComposite2EK5gGoQ.read((getNumPadPageUpEK5gGoQ) getnumpadmovehomeek5ggoqWrite) : new HashMap();
            accessgetTvTeletextcp accessgettvteletextcp = (accessgetTvTeletextcp) obj;
            accessgettvteletextcp.getClass();
            HashMap map2 = new HashMap();
            for (String str3 : map.keySet()) {
                HashMap map3 = ((getNumPadDivideEK5gGoQ) accessgettvteletextcp.RemoteActionCompatParcelizer).serializer;
                map2.put(str3, getNumPadDivideEK5gGoQ.write(str3, map3.containsKey(str3) ? map3.get(str3) : null, map.get(str3)));
            }
            ((ArrayList) accessgettvteletextcp.write).add(new getNumPadDivideEK5gGoQ(strIconCompatParcelizer, jSerializer, map2));
            return getoek5ggoq;
        }
        if (i == 1) {
            getTvInputComposite2EK5gGoQ.serializer(list, 2, "getValue");
            getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite2 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) list.get(0));
            getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite3 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) list.get(1));
            String strIconCompatParcelizer2 = getnumpadmovehomeek5ggoqWrite2.IconCompatParcelizer();
            Vw$Vw vw$Vw = (Vw$Vw) obj;
            Map map4 = (Map) ((lookaheadScopeCoordinates) vw$Vw.IconCompatParcelizer).MediaMetadataCompat.get((String) vw$Vw.serializer);
            if (map4 != null && map4.containsKey(strIconCompatParcelizer2)) {
                str2 = (String) map4.get(strIconCompatParcelizer2);
            }
            return str2 != null ? new getNumPadSubtractEK5gGoQ(str2) : getnumpadmovehomeek5ggoqWrite3;
        }
        if (i == 2) {
            return getoek5ggoq;
        }
        if (i == 3) {
            try {
                return RxCompletableKt.RemoteActionCompatParcelizer(((approachLayout) obj).call());
            } catch (Exception unused) {
                return getoek5ggoq;
            }
        }
        getTvInputComposite2EK5gGoQ.serializer(list, 3, str);
        ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) list.get(0)).IconCompatParcelizer();
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq2 = (getNumPadMoveHomeEK5gGoQ) list.get(1);
        zzz zzzVar2 = (zzz) transitionValuesMaps.MediaDescriptionCompat;
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite4 = zzzVar2.write(transitionValuesMaps, getnumpadmovehomeek5ggoq2);
        if (getnumpadmovehomeek5ggoqWrite4 instanceof getNumPadMoveEndEK5gGoQ) {
            getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite5 = zzzVar2.write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) list.get(2));
            if (getnumpadmovehomeek5ggoqWrite5 instanceof getNumPadPageUpEK5gGoQ) {
                getNumPadPageUpEK5gGoQ getnumpadpageupek5ggoq = (getNumPadPageUpEK5gGoQ) getnumpadmovehomeek5ggoqWrite5;
                HashMap map5 = getnumpadpageupek5ggoq.RemoteActionCompatParcelizer;
                if (map5.containsKey("type")) {
                    String strIconCompatParcelizer3 = getnumpadpageupek5ggoq.serializer("type").IconCompatParcelizer();
                    int iWrite = map5.containsKey(RemoteMessageConst.Notification.PRIORITY) ? getTvInputComposite2EK5gGoQ.write(getnumpadpageupek5ggoq.serializer(RemoteMessageConst.Notification.PRIORITY).write().doubleValue()) : 1000;
                    zzz zzzVar3 = (zzz) obj;
                    getNumPadMoveEndEK5gGoQ getnumpadmoveendek5ggoq = (getNumPadMoveEndEK5gGoQ) getnumpadmovehomeek5ggoqWrite4;
                    zzzVar3.getClass();
                    if ("create".equals(strIconCompatParcelizer3)) {
                        treeMap = (TreeMap) zzzVar3.write;
                    } else if ("edit".equals(strIconCompatParcelizer3)) {
                        treeMap = (TreeMap) zzzVar3.IconCompatParcelizer;
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Unknown callback type: ".concat(String.valueOf(strIconCompatParcelizer3)));
                    }
                    if (treeMap.containsKey(Integer.valueOf(iWrite))) {
                        iWrite = ((Integer) treeMap.lastKey()).intValue() + 1;
                    }
                    treeMap.put(Integer.valueOf(iWrite), getnumpadmoveendek5ggoq);
                    return getoek5ggoq;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Undefined rule type");
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid callback params");
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid callback type");
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyEvent_androidKt(dispatchPreFlingQWom1Mo dispatchpreflingqwom1mo, Vw$Vw vw$Vw) {
        super("getValue");
        this.write = vw$Vw;
    }

    public KeyEvent_androidKt(zzz zzzVar) {
        super("internal.registerCallback");
        this.write = zzzVar;
    }

    public KeyEvent_androidKt(approachLayout approachlayout) {
        super("internal.appMetadata");
        this.write = approachlayout;
    }

    public KeyEvent_androidKt(accessgetTvTeletextcp accessgettvteletextcp) {
        super("internal.eventLogger");
        this.write = accessgettvteletextcp;
    }
}
