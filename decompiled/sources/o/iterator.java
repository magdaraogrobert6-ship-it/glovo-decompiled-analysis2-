package o;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class iterator extends ConnectivityManager.NetworkCallback {
    public static boolean RemoteActionCompatParcelizer;
    public static NetworkCapabilities read;
    public static Boolean serializer;
    public static final iterator IconCompatParcelizer = new iterator();
    public static final Object MediaDescriptionCompat = new Object();
    public static final LinkedHashMap write = new LinkedHashMap();

    public static void RemoteActionCompatParcelizer() {
        ArrayList<onViewAttachedToWindowlambda0> arrayList = new ArrayList();
        synchronized (MediaDescriptionCompat) {
            if (RemoteActionCompatParcelizer && serializer != null) {
                for (Map.Entry entry : write.entrySet()) {
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) entry.getKey();
                    NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                    iterator iteratorVar = IconCompatParcelizer;
                    NetworkCapabilities networkCapabilities = read;
                    iteratorVar.getClass();
                    arrayList.add(new onViewAttachedToWindowlambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, RemoteActionCompatParcelizer(networkRequest, networkCapabilities) ? rotateRight.read : new rebalance(7)));
                }
                for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : arrayList) {
                    ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) onviewattachedtowindowlambda0.serializer).invoke((forEachui_graphicsdefault) onviewattachedtowindowlambda0.write);
                }
                return;
            }
            setRotationX setrotationx = setRotationX.read();
            int i = forEachui_graphics.IconCompatParcelizer;
            setrotationx.getClass();
        }
    }

    public static boolean RemoteActionCompatParcelizer(NetworkRequest networkRequest, NetworkCapabilities networkCapabilities) {
        Boolean bool = serializer;
        bool.getClass();
        return !bool.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        setRotationX setrotationx = setRotationX.read();
        int i = forEachui_graphics.IconCompatParcelizer;
        setrotationx.getClass();
        synchronized (MediaDescriptionCompat) {
            Object[] objArr = {serializer, Boolean.valueOf(z)};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return;
            }
            serializer = Boolean.valueOf(z);
            RemoteActionCompatParcelizer();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        setRotationX setrotationx = setRotationX.read();
        int i = forEachui_graphics.IconCompatParcelizer;
        setrotationx.getClass();
        synchronized (MediaDescriptionCompat) {
            read = networkCapabilities;
            RemoteActionCompatParcelizer = true;
        }
        RemoteActionCompatParcelizer();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        setRotationX setrotationx = setRotationX.read();
        int i = forEachui_graphics.IconCompatParcelizer;
        setrotationx.getClass();
        synchronized (MediaDescriptionCompat) {
            read = null;
            Iterator it = write.keySet().iterator();
            while (it.hasNext()) {
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it.next()).invoke(new rebalance(7));
            }
        }
    }
}
