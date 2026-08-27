package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.measurement.zzz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FwFClientevaluateFeature1 {
    public static String RemoteActionCompatParcelizer(FwFClientcache2 fwFClientcache2) {
        switch (FwFClientevaluateFeatures1.serializer[fwFClientcache2.ordinal()]) {
            case 1:
                return "float";
            case 2:
                return "int";
            case 3:
                return "short";
            case 4:
            case 5:
                return "byte";
            case 6:
                return com.adjust.sdk.Constants.LONG;
            case 7:
                return "bool";
            case 8:
                return "string";
            default:
                DrawableTransformation.IconCompatParcelizer("DataType error: DataType ", fwFClientcache2, " is not supported yet");
                return null;
        }
    }

    public static getNumPadDirectionUpEK5gGoQ RemoteActionCompatParcelizer(getNumPadDirectionUpEK5gGoQ getnumpaddirectionupek5ggoq, androidx.transition.TransitionValuesMaps transitionValuesMaps, getNumPadMoveEndEK5gGoQ getnumpadmoveendek5ggoq, Boolean bool, Boolean bool2) {
        getNumPadDirectionUpEK5gGoQ getnumpaddirectionupek5ggoq2 = new getNumPadDirectionUpEK5gGoQ();
        Iterator itMediaBrowserCompatMediaItem = getnumpaddirectionupek5ggoq.MediaBrowserCompatMediaItem();
        while (itMediaBrowserCompatMediaItem.hasNext()) {
            int iIntValue = ((Integer) itMediaBrowserCompatMediaItem.next()).intValue();
            if (getnumpaddirectionupek5ggoq.read(iIntValue)) {
                getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer = getnumpadmoveendek5ggoq.RemoteActionCompatParcelizer(transitionValuesMaps, Arrays.asList(getnumpaddirectionupek5ggoq.IconCompatParcelizer(iIntValue), new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(iIntValue)), getnumpaddirectionupek5ggoq));
                if (getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer.serializer().equals(bool)) {
                    break;
                }
                if (bool2 == null || getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer.serializer().equals(bool2)) {
                    getnumpaddirectionupek5ggoq2.RemoteActionCompatParcelizer(iIntValue, getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer);
                }
            }
        }
        return getnumpaddirectionupek5ggoq2;
    }

    public static getNumPadMoveHomeEK5gGoQ write(getNumPadDirectionUpEK5gGoQ getnumpaddirectionupek5ggoq, androidx.transition.TransitionValuesMaps transitionValuesMaps, ArrayList arrayList, boolean z) {
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer;
        getTvInputComposite2EK5gGoQ.read(arrayList, 1, "reduce");
        getTvInputComposite2EK5gGoQ.IconCompatParcelizer(2, "reduce", arrayList);
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(0));
        if (getnumpadmovehomeek5ggoqWrite instanceof getNumPadInsertEK5gGoQ) {
            if (arrayList.size() == 2) {
                getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer = ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) arrayList.get(1));
                if (getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer instanceof getNumPadEqualsEK5gGoQ) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed to parse initial value");
                    return null;
                }
            } else {
                if (getnumpaddirectionupek5ggoq.MediaSessionCompatQueueItem() == 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Empty array with no initial value error");
                    return null;
                }
                getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer = null;
            }
            getNumPadInsertEK5gGoQ getnumpadinsertek5ggoq = (getNumPadInsertEK5gGoQ) getnumpadmovehomeek5ggoqWrite;
            int iMediaSessionCompatQueueItem = getnumpaddirectionupek5ggoq.MediaSessionCompatQueueItem();
            int i = z ? 0 : iMediaSessionCompatQueueItem - 1;
            int i2 = z ? iMediaSessionCompatQueueItem - 1 : 0;
            int i3 = true == z ? 1 : -1;
            if (getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer == null) {
                getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer = getnumpaddirectionupek5ggoq.IconCompatParcelizer(i);
                i += i3;
            }
            while ((i2 - i) * i3 >= 0) {
                if (getnumpaddirectionupek5ggoq.read(i)) {
                    getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer = getnumpadinsertek5ggoq.RemoteActionCompatParcelizer(transitionValuesMaps, Arrays.asList(getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer, getnumpaddirectionupek5ggoq.IconCompatParcelizer(i), new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(i)), getnumpaddirectionupek5ggoq));
                    if (getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer instanceof getNumPadEqualsEK5gGoQ) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Reduce operation failed");
                        return null;
                    }
                    i += i3;
                } else {
                    i += i3;
                }
            }
            return getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Callback should be a method");
        return null;
    }
}
