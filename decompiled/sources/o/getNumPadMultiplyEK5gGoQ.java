package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.measurement.zzz;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface getNumPadMultiplyEK5gGoQ {
    void RemoteActionCompatParcelizer(String str, getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq);

    boolean RemoteActionCompatParcelizer(String str);

    getNumPadMoveHomeEK5gGoQ serializer(String str);

    static getNumPadMoveHomeEK5gGoQ serializer(getNumPadMultiplyEK5gGoQ getnumpadmultiplyek5ggoq, getNumPadSubtractEK5gGoQ getnumpadsubtractek5ggoq, androidx.transition.TransitionValuesMaps transitionValuesMaps, ArrayList arrayList) {
        String str = getnumpadsubtractek5ggoq.write;
        if (getnumpadmultiplyek5ggoq.RemoteActionCompatParcelizer(str)) {
            getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqSerializer = getnumpadmultiplyek5ggoq.serializer(str);
            if (getnumpadmovehomeek5ggoqSerializer instanceof getNumPadInsertEK5gGoQ) {
                return ((getNumPadInsertEK5gGoQ) getnumpadmovehomeek5ggoqSerializer).RemoteActionCompatParcelizer(transitionValuesMaps, arrayList);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            getTvInputComposite2EK5gGoQ.serializer(arrayList, 1, "hasOwnProperty");
            return getnumpadmultiplyek5ggoq.RemoteActionCompatParcelizer(((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0)).IconCompatParcelizer()) ? getNumPadMoveHomeEK5gGoQ.PlaybackStateCompatCustomAction : getNumPadMoveHomeEK5gGoQ.MediaSessionCompatToken;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Object has no function ", str));
        return null;
    }
}
