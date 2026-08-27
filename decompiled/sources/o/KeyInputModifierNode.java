package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.measurement.zzz;
import java.util.ArrayList;
import java.util.HashMap;
import kotlinx.coroutines.rx2.RxCompletableKt;

/* JADX INFO: loaded from: classes2.dex */
public final class KeyInputModifierNode extends getNumPadPageUpEK5gGoQ {
    public final accessgetTvTeletextcp read;

    public KeyInputModifierNode(accessgetTvTeletextcp accessgettvteletextcp) {
        this.read = accessgettvteletextcp;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.getNumPadPageUpEK5gGoQ, o.getNumPadMoveHomeEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ read(String str, androidx.transition.TransitionValuesMaps transitionValuesMaps, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        accessgetTvTeletextcp accessgettvteletextcp = this.read;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, "getEventName");
                    return new getNumPadSubtractEK5gGoQ(((getNumPadDivideEK5gGoQ) accessgettvteletextcp.serializer).RemoteActionCompatParcelizer);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, "getTimestamp");
                    return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(((getNumPadDivideEK5gGoQ) accessgettvteletextcp.serializer).write));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    getTvInputComposite2EK5gGoQ.serializer(arrayList, 1, "getParamValue");
                    String strIconCompatParcelizer = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer();
                    HashMap map = ((getNumPadDivideEK5gGoQ) accessgettvteletextcp.serializer).serializer;
                    return RxCompletableKt.RemoteActionCompatParcelizer(map.containsKey(strIconCompatParcelizer) ? map.get(strIconCompatParcelizer) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    getTvInputComposite2EK5gGoQ.serializer(arrayList, 0, "getParams");
                    HashMap map2 = ((getNumPadDivideEK5gGoQ) accessgettvteletextcp.serializer).serializer;
                    getNumPadPageUpEK5gGoQ getnumpadpageupek5ggoq = new getNumPadPageUpEK5gGoQ();
                    for (String str2 : map2.keySet()) {
                        getnumpadpageupek5ggoq.RemoteActionCompatParcelizer(str2, RxCompletableKt.RemoteActionCompatParcelizer(map2.get(str2)));
                    }
                    return getnumpadpageupek5ggoq;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    getTvInputComposite2EK5gGoQ.serializer(arrayList, 2, "setParamValue");
                    String strIconCompatParcelizer2 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer();
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1));
                    getNumPadDivideEK5gGoQ getnumpaddivideek5ggoq = (getNumPadDivideEK5gGoQ) accessgettvteletextcp.serializer;
                    Object objSerializer = getTvInputComposite2EK5gGoQ.serializer(getnumpadmovehomeek5ggoqWrite);
                    HashMap map3 = getnumpaddivideek5ggoq.serializer;
                    if (objSerializer == null) {
                        map3.remove(strIconCompatParcelizer2);
                        return getnumpadmovehomeek5ggoqWrite;
                    }
                    map3.put(strIconCompatParcelizer2, getNumPadDivideEK5gGoQ.write(strIconCompatParcelizer2, map3.get(strIconCompatParcelizer2), objSerializer));
                    return getnumpadmovehomeek5ggoqWrite;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    getTvInputComposite2EK5gGoQ.serializer(arrayList, 1, "setEventName");
                    getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite2 = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0));
                    if (getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem.equals(getnumpadmovehomeek5ggoqWrite2) || getNumPadMoveHomeEK5gGoQ.MediaDescriptionCompat.equals(getnumpadmovehomeek5ggoqWrite2)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Illegal event name");
                        return null;
                    }
                    ((getNumPadDivideEK5gGoQ) accessgettvteletextcp.serializer).RemoteActionCompatParcelizer = getnumpadmovehomeek5ggoqWrite2.IconCompatParcelizer();
                    return new getNumPadSubtractEK5gGoQ(getnumpadmovehomeek5ggoqWrite2.IconCompatParcelizer());
                }
                break;
        }
        return super.read(str, transitionValuesMaps, arrayList);
    }
}
