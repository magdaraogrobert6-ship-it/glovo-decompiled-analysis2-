package o;

import android.app.Activity;
import android.os.SystemClock;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.SharedFlowImpl;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumChildren {
    public static final getNumChildren IconCompatParcelizer = new getNumChildren();
    public static final LinkedHashMap read = new LinkedHashMap();

    public static void IconCompatParcelizer(String str) {
        LinkedHashMap linkedHashMap = read;
        getClipPathData getclippathdata = (getClipPathData) linkedHashMap.get(str);
        if (getclippathdata != null && getclippathdata.IconCompatParcelizer != null) {
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            forest.RemoteActionCompatParcelizer("TimeToInteractive");
            forest.read("Cannot start TTI metric for " + str + ",metric is already running for this screen!", new Object[0]);
            return;
        }
        if (getclippathdata == null) {
            if (linkedHashMap.size() >= 64) {
                Set setEntrySet = linkedHashMap.entrySet();
                setEntrySet.getClass();
                Map.Entry entry = (Map.Entry) onContentCardDismissed.serializer((Iterable) setEntrySet);
                if (entry != null) {
                    linkedHashMap.remove(entry.getKey());
                    Object value = entry.getValue();
                    value.getClass();
                    IconCompatParcelizer((getClipPathData) value);
                    if (((getClipPathData) entry.getValue()).serializer) {
                        SharedFlowImpl sharedFlowImpl = drawIntodefault.RemoteActionCompatParcelizer;
                        updateParamsFromOutline updateparamsfromoutline = updateParamsFromOutline.STOPPED;
                        Object key = entry.getKey();
                        key.getClass();
                        drawIntodefault.RemoteActionCompatParcelizer.write(new DrawCache(updateparamsfromoutline, new setMCachedImage((String) key)));
                    }
                    Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                    forest2.RemoteActionCompatParcelizer("TimeToInteractive");
                    forest2.RemoteActionCompatParcelizer(af$$ExternalSyntheticOutline0.m(entry.getKey(), "Evicted oldest TTI metric state for ", " after reaching 64 tracked screens."), new Object[0]);
                }
            }
            getclippathdata = new getClipPathData();
            getclippathdata.read = 0L;
            getclippathdata.IconCompatParcelizer = null;
            getclippathdata.serializer = false;
            linkedHashMap.put(str, getclippathdata);
        }
        write(getclippathdata, str);
    }

    public static Long write(String str) {
        getClipPathData getclippathdata = (getClipPathData) read.remove(str);
        if (getclippathdata == null) {
            return null;
        }
        IconCompatParcelizer(getclippathdata);
        if (!getclippathdata.serializer) {
            return null;
        }
        SharedFlowImpl sharedFlowImpl = drawIntodefault.RemoteActionCompatParcelizer;
        drawIntodefault.RemoteActionCompatParcelizer.write(new DrawCache(updateParamsFromOutline.STOPPED, new setMCachedImage(str)));
        return Long.valueOf(getclippathdata.read);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void write(obtainTint8_81llA obtaintint8_81lla) {
        String simpleName;
        obtaintint8_81lla.getClass();
        if (obtaintint8_81lla instanceof Activity) {
            simpleName = ((Activity) obtaintint8_81lla).getClass().getSimpleName();
        } else {
            if (!(obtaintint8_81lla instanceof androidx.fragment.app.Fragment)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Only Activities and Fragments should implement PerformanceMeasurableScreen");
                return;
            }
            simpleName = ((androidx.fragment.app.Fragment) obtaintint8_81lla).getClass().getSimpleName();
        }
        if (read.containsKey(simpleName)) {
            write(simpleName);
        }
    }

    public static void IconCompatParcelizer(getClipPathData getclippathdata) {
        Long l = getclippathdata.IconCompatParcelizer;
        if (l != null) {
            long jLongValue = l.longValue();
            getclippathdata.read = (SystemClock.uptimeMillis() - jLongValue) + getclippathdata.read;
            getclippathdata.IconCompatParcelizer = null;
        }
    }

    public static void read(String str, Boolean bool, Long l) {
        if (l != null) {
            long jLongValue = l.longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            AndroidShadowContext_androidKt androidShadowContext_androidKt = AndroidShadowContext_androidKt.MILLISECONDS;
            androidShadowContext_androidKt.getClass();
            getInvalidateListenerui.RemoteActionCompatParcelizer(str, "timeToInteractiveMs", new markNotTintable(jLongValue, onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("stop", Long.valueOf(jCurrentTimeMillis)), new onViewAttachedToWindowlambda0("start", Long.valueOf(jCurrentTimeMillis - jLongValue))), androidShadowContext_androidKt));
            if (bool != null) {
                getInvalidateListenerui.RemoteActionCompatParcelizer(str, "screenAvailable", String.valueOf(bool.booleanValue()));
                return;
            }
            return;
        }
        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("TimeToInteractive");
    }

    public static boolean read(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        fragmentActivityRequireActivity.getClass();
        return read.containsKey(fragmentActivityRequireActivity.getClass().getSimpleName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void serializer(obtainTint8_81llA obtaintint8_81lla, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (obtaintint8_81lla instanceof Activity) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((Activity) obtaintint8_81lla).getClass().getSimpleName());
            return;
        }
        if (!(obtaintint8_81lla instanceof androidx.fragment.app.Fragment)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Only Activities and Fragments should implement PerformanceMeasurableScreen");
            return;
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obtaintint8_81lla;
        if (read(fragment)) {
            return;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(fragment.getClass().getSimpleName());
    }

    public static void write(getClipPathData getclippathdata, String str) {
        getclippathdata.IconCompatParcelizer = Long.valueOf(SystemClock.uptimeMillis());
        if (getclippathdata.serializer) {
            return;
        }
        getclippathdata.serializer = true;
        SharedFlowImpl sharedFlowImpl = drawIntodefault.RemoteActionCompatParcelizer;
        drawIntodefault.RemoteActionCompatParcelizer.write(new DrawCache(updateParamsFromOutline.STARTED, new setMCachedImage(str)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void RemoteActionCompatParcelizer(obtainTint8_81llA obtaintint8_81lla) {
        if (obtaintint8_81lla instanceof Activity) {
            IconCompatParcelizer(((Activity) obtaintint8_81lla).getClass().getSimpleName());
            return;
        }
        if (obtaintint8_81lla instanceof androidx.fragment.app.Fragment) {
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obtaintint8_81lla;
            if (read(fragment)) {
                return;
            }
            IconCompatParcelizer(fragment.getClass().getSimpleName());
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Only Activities and Fragments should implement PerformanceMeasurableScreen");
    }
}
