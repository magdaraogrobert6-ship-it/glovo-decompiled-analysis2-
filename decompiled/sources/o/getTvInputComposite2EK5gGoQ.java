package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getTvInputComposite2EK5gGoQ {
    public static HashMap read(getNumPadPageUpEK5gGoQ getnumpadpageupek5ggoq) {
        HashMap map = new HashMap();
        for (String str : new ArrayList(getnumpadpageupek5ggoq.RemoteActionCompatParcelizer.keySet())) {
            Object objSerializer = serializer(getnumpadpageupek5ggoq.serializer(str));
            if (objSerializer != null) {
                map.put(str, objSerializer);
            }
        }
        return map;
    }

    public static Object serializer(getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq) {
        if (getNumPadMoveHomeEK5gGoQ.MediaDescriptionCompat.equals(getnumpadmovehomeek5ggoq)) {
            return null;
        }
        if (getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem.equals(getnumpadmovehomeek5ggoq)) {
            return "";
        }
        if (getnumpadmovehomeek5ggoq instanceof getNumPadPageUpEK5gGoQ) {
            return read((getNumPadPageUpEK5gGoQ) getnumpadmovehomeek5ggoq);
        }
        if (!(getnumpadmovehomeek5ggoq instanceof getNumPadDirectionUpEK5gGoQ)) {
            return !getnumpadmovehomeek5ggoq.write().isNaN() ? getnumpadmovehomeek5ggoq.write() : getnumpadmovehomeek5ggoq.IconCompatParcelizer();
        }
        ArrayList arrayList = new ArrayList();
        getNumPadDirectionUpEK5gGoQ getnumpaddirectionupek5ggoq = (getNumPadDirectionUpEK5gGoQ) getnumpadmovehomeek5ggoq;
        for (int i = 0; i < getnumpaddirectionupek5ggoq.MediaSessionCompatQueueItem(); i++) {
            if (i >= getnumpaddirectionupek5ggoq.MediaSessionCompatQueueItem()) {
                DrawableTransformation.write(d$$ExternalSyntheticOutline0.m(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
                return null;
            }
            Object objSerializer = serializer(getnumpaddirectionupek5ggoq.IconCompatParcelizer(i));
            if (objSerializer != null) {
                arrayList.add(objSerializer);
            }
        }
        return arrayList;
    }

    public static void write(androidx.transition.TransitionValuesMaps transitionValuesMaps) {
        int iWrite = write(transitionValuesMaps.IconCompatParcelizer("runtime.counter").write().doubleValue() + 1.0d);
        if (iWrite <= 1000000) {
            transitionValuesMaps.RemoteActionCompatParcelizer("runtime.counter", new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(iWrite)));
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Instructions allowed exceeded");
        }
    }

    public static getPasteEK5gGoQ RemoteActionCompatParcelizer(String str) {
        getPasteEK5gGoQ getpasteek5ggoqZza = (str == null || str.isEmpty()) ? null : getPasteEK5gGoQ.zza(Integer.parseInt(str));
        if (getpasteek5ggoqZza != null) {
            return getpasteek5ggoqZza;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Unsupported commandId ", str));
        return null;
    }

    public static boolean serializer(getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq, getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq2) {
        if (!getnumpadmovehomeek5ggoq.getClass().equals(getnumpadmovehomeek5ggoq2.getClass())) {
            return false;
        }
        if ((getnumpadmovehomeek5ggoq instanceof getOEK5gGoQ) || (getnumpadmovehomeek5ggoq instanceof getNumPadPageDownEK5gGoQ)) {
            return true;
        }
        if (getnumpadmovehomeek5ggoq instanceof getNumPadLeftParenthesisEK5gGoQ) {
            if (Double.isNaN(getnumpadmovehomeek5ggoq.write().doubleValue()) || Double.isNaN(getnumpadmovehomeek5ggoq2.write().doubleValue())) {
                return false;
            }
            return getnumpadmovehomeek5ggoq.write().equals(getnumpadmovehomeek5ggoq2.write());
        }
        if (getnumpadmovehomeek5ggoq instanceof getNumPadSubtractEK5gGoQ) {
            return getnumpadmovehomeek5ggoq.IconCompatParcelizer().equals(getnumpadmovehomeek5ggoq2.IconCompatParcelizer());
        }
        if (getnumpadmovehomeek5ggoq instanceof getNumPadEnterEK5gGoQ) {
            return getnumpadmovehomeek5ggoq.serializer().equals(getnumpadmovehomeek5ggoq2.serializer());
        }
        return getnumpadmovehomeek5ggoq == getnumpadmovehomeek5ggoq2;
    }

    public static boolean write(getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq) {
        if (getnumpadmovehomeek5ggoq == null) {
            return false;
        }
        Double dWrite = getnumpadmovehomeek5ggoq.write();
        return !dWrite.isNaN() && dWrite.doubleValue() >= 0.0d && dWrite.equals(Double.valueOf(Math.floor(dWrite.doubleValue())));
    }

    public static int write(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static void IconCompatParcelizer(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        FieldType$$ExternalSyntheticBUOutline0.serializer(i, arrayList.size(), str, " operation requires at most ", " parameters found ");
    }

    public static void read(List list, int i, String str) {
        if (list.size() >= i) {
            return;
        }
        FieldType$$ExternalSyntheticBUOutline0.serializer(i, list.size(), str, " operation requires at least ", " parameters found ");
    }

    public static void serializer(List list, int i, String str) {
        if (list.size() == i) {
            return;
        }
        FieldType$$ExternalSyntheticBUOutline0.serializer(i, list.size(), str, " operation requires ", " parameters found ");
    }

    public static double serializer(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return ((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d));
    }
}
