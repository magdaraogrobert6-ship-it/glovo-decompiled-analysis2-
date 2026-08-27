package kotlinx.coroutines.rx2;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import io.reactivex.internal.operators.completable.CompletableCreate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineDispatcher;
import o.DrawableTransformation;
import o.getNumPadDirectionUpEK5gGoQ;
import o.getNumPadEnterEK5gGoQ;
import o.getNumPadLeftParenthesisEK5gGoQ;
import o.getNumPadMoveHomeEK5gGoQ;
import o.getNumPadPageUpEK5gGoQ;
import o.getNumPadRightParenthesisEK5gGoQ;
import o.getNumPadSubtractEK5gGoQ;
import o.getZEK5gGoQ;
import o.onAnimationEndlambda1;
import o.r8lambda8edyMsNhZZLVj0T9bGZ00KrYkuE;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RxCompletableKt {
    public static final CompletableCreate RemoteActionCompatParcelizer(CoroutineDispatcher coroutineDispatcher, ClearDataUseCaseImpl$invoke$2 clearDataUseCaseImpl$invoke$2) {
        if (coroutineDispatcher.get(onAnimationEndlambda1.RemoteActionCompatParcelizer) == null) {
            return new CompletableCreate(new r8lambda8edyMsNhZZLVj0T9bGZ00KrYkuE(coroutineDispatcher, 4, clearDataUseCaseImpl$invoke$2));
        }
        DrawableTransformation.serializer(coroutineDispatcher, "Completable context cannot contain job in it. Its lifecycle should be managed via Disposable handle. Had ");
        return null;
    }

    public static getNumPadMoveHomeEK5gGoQ RemoteActionCompatParcelizer(Object obj) {
        if (obj == null) {
            return getNumPadMoveHomeEK5gGoQ.MediaDescriptionCompat;
        }
        if (obj instanceof String) {
            return new getNumPadSubtractEK5gGoQ((String) obj);
        }
        if (obj instanceof Double) {
            return new getNumPadLeftParenthesisEK5gGoQ((Double) obj);
        }
        if (obj instanceof Long) {
            return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new getNumPadEnterEK5gGoQ((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid value type");
                return null;
            }
            getNumPadDirectionUpEK5gGoQ getnumpaddirectionupek5ggoq = new getNumPadDirectionUpEK5gGoQ();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                getnumpaddirectionupek5ggoq.RemoteActionCompatParcelizer(getnumpaddirectionupek5ggoq.MediaSessionCompatQueueItem(), RemoteActionCompatParcelizer(it.next()));
            }
            return getnumpaddirectionupek5ggoq;
        }
        getNumPadPageUpEK5gGoQ getnumpadpageupek5ggoq = new getNumPadPageUpEK5gGoQ();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                getnumpadpageupek5ggoq.RemoteActionCompatParcelizer((String) string, getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer);
            }
        }
        return getnumpadpageupek5ggoq;
    }

    public static getNumPadMoveHomeEK5gGoQ write(getZEK5gGoQ getzek5ggoq) {
        if (getzek5ggoq == null) {
            return getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
        }
        int iRatingCompat = getzek5ggoq.RatingCompat() - 1;
        if (iRatingCompat == 1) {
            return getzek5ggoq.serializer() ? new getNumPadSubtractEK5gGoQ(getzek5ggoq.RemoteActionCompatParcelizer()) : getNumPadMoveHomeEK5gGoQ.PlaybackStateCompat;
        }
        if (iRatingCompat == 2) {
            return getzek5ggoq.MediaSessionCompatQueueItem() ? new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(getzek5ggoq.MediaDescriptionCompat())) : new getNumPadLeftParenthesisEK5gGoQ(null);
        }
        if (iRatingCompat == 3) {
            return getzek5ggoq.write() ? new getNumPadEnterEK5gGoQ(Boolean.valueOf(getzek5ggoq.MediaMetadataCompat())) : new getNumPadEnterEK5gGoQ(null);
        }
        if (iRatingCompat != 4) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unknown type found. Cannot convert entity");
            return null;
        }
        List list = getzek5ggoq.read();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(write((getZEK5gGoQ) it.next()));
        }
        return new getNumPadRightParenthesisEK5gGoQ(getzek5ggoq.IconCompatParcelizer(), arrayList);
    }
}
