package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.measurement.zzz;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class getPositionChangeannotations extends getNumPadInsertEK5gGoQ {
    public final getZenkakuHankaruEK5gGoQ RemoteActionCompatParcelizer;
    public final HashMap write;

    public getPositionChangeannotations(getZenkakuHankaruEK5gGoQ getzenkakuhankaruek5ggoq) {
        super("require");
        this.write = new HashMap();
        this.RemoteActionCompatParcelizer = getzenkakuhankaruek5ggoq;
    }

    @Override // o.getNumPadInsertEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ RemoteActionCompatParcelizer(androidx.transition.TransitionValuesMaps transitionValuesMaps, List list) {
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq;
        getTvInputComposite2EK5gGoQ.serializer(list, 1, "require");
        String strIconCompatParcelizer = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) list.get(0)).IconCompatParcelizer();
        HashMap map = this.write;
        if (map.containsKey(strIconCompatParcelizer)) {
            return (getNumPadMoveHomeEK5gGoQ) map.get(strIconCompatParcelizer);
        }
        HashMap map2 = (HashMap) this.RemoteActionCompatParcelizer.write;
        if (map2.containsKey(strIconCompatParcelizer)) {
            try {
                getnumpadmovehomeek5ggoq = (getNumPadMoveHomeEK5gGoQ) ((Callable) map2.get(strIconCompatParcelizer)).call();
            } catch (Exception unused) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Failed to create API implementation: ".concat(String.valueOf(strIconCompatParcelizer)));
                return null;
            }
        } else {
            getnumpadmovehomeek5ggoq = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
        }
        if (getnumpadmovehomeek5ggoq instanceof getNumPadInsertEK5gGoQ) {
            map.put(strIconCompatParcelizer, (getNumPadInsertEK5gGoQ) getnumpadmovehomeek5ggoq);
        }
        return getnumpadmovehomeek5ggoq;
    }
}
