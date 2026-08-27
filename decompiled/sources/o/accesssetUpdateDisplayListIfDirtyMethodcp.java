package o;

import android.content.Context;
import android.util.Log;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class accesssetUpdateDisplayListIfDirtyMethodcp {
    public static ArrayList IconCompatParcelizer;
    public static final HashMap RemoteActionCompatParcelizer = new HashMap();
    public static String serializer;
    public final accessgetHandwritingSlopjd write;

    public static void read(Context context, onStateChanged onstatechanged) {
        synchronized (accesssetUpdateDisplayListIfDirtyMethodcp.class) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                Log.w("AGC_Instance", "context.getApplicationContext null");
            } else {
                context = applicationContext;
            }
            boolean z = false;
            accesssetShouldUseDispatchDrawcp accesssetshouldusedispatchdrawcp = new accesssetShouldUseDispatchDrawcp(0);
            HashMap map = ViewConfiguration.RemoteActionCompatParcelizer;
            map.put("/agcgw/url", accesssetshouldusedispatchdrawcp);
            map.put("/agcgw/backurl", new accesssetShouldUseDispatchDrawcp(1));
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new accesssetHasRetrievedMethodcp(context, z).write();
            }
            write(onstatechanged, true);
            serializer = "DEFAULT_INSTANCE";
            Iterator it = getManualClipPath.read.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public accesssetUpdateDisplayListIfDirtyMethodcp(accessgetHandwritingSlopjd accessgethandwritingslopjd) {
        ArrayList arrayList;
        this.write = accessgethandwritingslopjd;
        if (IconCompatParcelizer == null) {
            Log.e("AGC_Instance", "please call `initialize()` first");
        }
        new setCameraDistancePx(IconCompatParcelizer);
        new setCameraDistancePx(null);
        if (!(accessgethandwritingslopjd instanceof accessgetMinimumFlingVelocityjd) || (arrayList = ((accessgetMinimumFlingVelocityjd) accessgethandwritingslopjd).MediaDescriptionCompat) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it);
        }
    }

    public static accesssetUpdateDisplayListIfDirtyMethodcp IconCompatParcelizer(String str) {
        accesssetUpdateDisplayListIfDirtyMethodcp accesssetupdatedisplaylistifdirtymethodcp;
        String str2;
        String str3;
        synchronized (accesssetUpdateDisplayListIfDirtyMethodcp.class) {
            accesssetupdatedisplaylistifdirtymethodcp = (accesssetUpdateDisplayListIfDirtyMethodcp) RemoteActionCompatParcelizer.get(str);
            if (accesssetupdatedisplaylistifdirtymethodcp == null) {
                if ("DEFAULT_INSTANCE".equals(str)) {
                    str2 = "AGC_Instance";
                    str3 = "please call `initialize()` first";
                } else {
                    str2 = "AGC_Instance";
                    str3 = "not find instance for : " + str;
                }
                Log.w(str2, str3);
            }
        }
        return accesssetupdatedisplaylistifdirtymethodcp;
    }

    public static accesssetUpdateDisplayListIfDirtyMethodcp write(accessgetHandwritingSlopjd accessgethandwritingslopjd, boolean z) {
        accesssetUpdateDisplayListIfDirtyMethodcp accesssetupdatedisplaylistifdirtymethodcp;
        synchronized (accesssetUpdateDisplayListIfDirtyMethodcp.class) {
            HashMap map = RemoteActionCompatParcelizer;
            accesssetupdatedisplaylistifdirtymethodcp = (accesssetUpdateDisplayListIfDirtyMethodcp) map.get(accessgethandwritingslopjd.serializer());
            if (accesssetupdatedisplaylistifdirtymethodcp == null || z) {
                accesssetupdatedisplaylistifdirtymethodcp = new accesssetUpdateDisplayListIfDirtyMethodcp(accessgethandwritingslopjd);
                map.put(accessgethandwritingslopjd.serializer(), accesssetupdatedisplaylistifdirtymethodcp);
            }
        }
        return accesssetupdatedisplaylistifdirtymethodcp;
    }
}
