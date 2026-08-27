package com.sentiance.okhttp3;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.collection.ObjectList$toString$1;
import com.google.android.gms.internal.mlkit_vision_face.zzmb;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.navigation.base.utils.DecodeUtils;
import com.mapbox.navigation.base.utils.DecodeUtils$RouteList$AddResult$Added;
import com.mapbox.navigation.base.utils.DecodeUtils$RouteList$AddResult$Reordered;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.CameraUpdateException;
import o.Lab;
import o.absRcpResponse;
import o.accessgetBradfordcp;
import o.accessgetCiecat02cp;
import o.disposeCurrentNodes;
import o.drawOvalAsUm42wdefault;
import o.drawymL40Pk;
import o.encodePointList;
import o.fromLinear;
import o.getColors;
import o.isEphemeralEventsEnabled;
import o.newD50Xyzui_graphics;

/* JADX INFO: loaded from: classes3.dex */
public final class u$a implements absRcpResponse {
    public ArrayList IconCompatParcelizer;

    public fromLinear IconCompatParcelizer(Class cls) {
        synchronized (this) {
            int size = this.IconCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                drawymL40Pk drawyml40pk = (drawymL40Pk) this.IconCompatParcelizer.get(i);
                if (drawyml40pk.write.isAssignableFrom(cls)) {
                    return drawyml40pk.RemoteActionCompatParcelizer;
                }
            }
            return null;
        }
    }

    public ArrayList read(Class cls, Class cls2) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            if (cls2.isAssignableFrom(cls)) {
                arrayList.add(cls2);
                return arrayList;
            }
            for (drawOvalAsUm42wdefault drawovalasum42wdefault : this.IconCompatParcelizer) {
                if (drawovalasum42wdefault.IconCompatParcelizer.isAssignableFrom(cls) && cls2.isAssignableFrom(drawovalasum42wdefault.RemoteActionCompatParcelizer) && !arrayList.contains(drawovalasum42wdefault.RemoteActionCompatParcelizer)) {
                    arrayList.add(drawovalasum42wdefault.RemoteActionCompatParcelizer);
                }
            }
            return arrayList;
        }
    }

    @Override // o.absRcpResponse
    public List serializer() {
        return this.IconCompatParcelizer;
    }

    public static void write(u$a u_a) {
        ArrayList arrayList = new ArrayList();
        Iterator it = u_a.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            arrayList.add(((CameraUpdateException) it.next()).getClass().getSimpleName());
        }
        String.join(" | ", arrayList);
    }

    @Override // o.absRcpResponse
    public boolean IconCompatParcelizer() {
        ArrayList arrayList = this.IconCompatParcelizer;
        return arrayList.size() == 1 && ((Lab) arrayList.get(0)).RemoteActionCompatParcelizer();
    }

    public boolean RemoteActionCompatParcelizer(Class cls) {
        Iterator it = this.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((CameraUpdateException) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public ArrayList serializer(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (CameraUpdateException cameraUpdateException : this.IconCompatParcelizer) {
            if (cls.isAssignableFrom(cameraUpdateException.getClass())) {
                arrayList.add(cameraUpdateException);
            }
        }
        return arrayList;
    }

    public void serializer(Path path) {
        ArrayList arrayList = this.IconCompatParcelizer;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            encodePointList encodepointlist = (encodePointList) arrayList.get(size);
            Matrix matrix = newD50Xyzui_graphics.write;
            if (encodepointlist != null && !encodepointlist.serializer) {
                newD50Xyzui_graphics.serializer(path, encodepointlist.RemoteActionCompatParcelizer.write() / 100.0f, encodepointlist.read.write() / 100.0f, encodepointlist.IconCompatParcelizer.write() / 360.0f);
            }
        }
    }

    public void serializer(String str, String str2) {
        ArrayList arrayList = this.IconCompatParcelizer;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    public u$a(int i) {
        if (i == 2) {
            this.IconCompatParcelizer = new ArrayList();
            return;
        }
        if (i == 9) {
            this.IconCompatParcelizer = new ArrayList();
            return;
        }
        if (i == 13) {
            this.IconCompatParcelizer = new ArrayList(20);
            return;
        }
        if (i == 4) {
            this.IconCompatParcelizer = new ArrayList();
            return;
        }
        if (i == 5) {
            this.IconCompatParcelizer = new ArrayList();
            return;
        }
        if (i == 6) {
            this.IconCompatParcelizer = new ArrayList();
        } else if (i != 7) {
            this.IconCompatParcelizer = new ArrayList(20);
        } else {
            this.IconCompatParcelizer = new ArrayList();
        }
    }

    public void RemoteActionCompatParcelizer(String str, String str2) {
        isEphemeralEventsEnabled.serializer(str);
        isEphemeralEventsEnabled.serializer(str2, str);
        serializer(str, str2);
    }

    public disposeCurrentNodes add(DirectionsRoute directionsRoute, int i) {
        directionsRoute.getClass();
        ArrayList arrayList = this.IconCompatParcelizer;
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            DecodeUtils.CachedRouteInfo cachedRouteInfo = (DecodeUtils.CachedRouteInfo) it.next();
            if (zzmb.isSameRoute(cachedRouteInfo.route, directionsRoute) && cachedRouteInfo.precision == i) {
                break;
            }
            i2++;
        }
        if (i2 < 0) {
            arrayList.add(new DecodeUtils.CachedRouteInfo(directionsRoute, i));
            return new DecodeUtils$RouteList$AddResult$Added(arrayList.size() > 3 ? (DecodeUtils.CachedRouteInfo) arrayList.remove(0) : null);
        }
        if (i2 != arrayList.size() - 1) {
            arrayList.add(arrayList.remove(i2));
        }
        return DecodeUtils$RouteList$AddResult$Reordered.INSTANCE;
    }

    public void read(String str) {
        ArrayList arrayList = this.IconCompatParcelizer;
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    @Override // o.absRcpResponse
    public getColors write() {
        ArrayList arrayList = this.IconCompatParcelizer;
        return ((Lab) arrayList.get(0)).RemoteActionCompatParcelizer() ? new accessgetCiecat02cp(arrayList, 0) : new accessgetBradfordcp(arrayList);
    }

    public ArrayList filter(ObjectList$toString$1 objectList$toString$1) {
        ArrayList arrayList = this.IconCompatParcelizer;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Boolean) objectList$toString$1.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public void IconCompatParcelizer(String str, String str2) {
        isEphemeralEventsEnabled.serializer(str);
        isEphemeralEventsEnabled.serializer(str2, str);
        read(str);
        serializer(str, str2);
    }

    public CameraUpdateException read(Class cls) {
        for (CameraUpdateException cameraUpdateException : this.IconCompatParcelizer) {
            if (cameraUpdateException.getClass() == cls) {
                return cameraUpdateException;
            }
        }
        return null;
    }

    public u$a(List list) {
        this.IconCompatParcelizer = new ArrayList(list);
    }

    public u$a() {
    }
}
