package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.agconnect.core.ServiceDiscovery;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class accesssetHasRetrievedMethodcp implements MutableRecttz77jQw {
    public final Context serializer;

    public boolean read(ArrayList arrayList) {
        PackageManager packageManager = this.serializer.getPackageManager();
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                packageManager.getPackageInfo(str, 0);
                r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg.read(str + " ROOT management app detected!");
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    public ArrayList write() {
        Bundle bundle;
        StringBuilder sb;
        String string;
        String strConcat;
        ArrayList<String> arrayList = new ArrayList();
        Context context = this.serializer;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            bundle = null;
        } else {
            try {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ServiceDiscovery.class), androidx.compose.ui.graphics.Fields.SpotShadowColor);
                if (serviceInfo == null) {
                    Log.e("AGC_Registrar", "Can not found ServiceDiscovery service.");
                    bundle = null;
                } else {
                    bundle = serviceInfo.metaData;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AGC_Registrar", "get ServiceDiscovery exception." + e.getLocalizedMessage());
            }
        }
        if (bundle != null) {
            HashMap map = new HashMap(10);
            for (String str : bundle.keySet()) {
                if ("com.huawei.agconnect.core.ServiceRegistrar".equals(bundle.getString(str))) {
                    String[] strArrSplit = str.split(":");
                    if (strArrSplit.length == 2) {
                        try {
                            map.put(strArrSplit[0], Integer.valueOf(strArrSplit[1]));
                        } catch (NumberFormatException e2) {
                            strConcat = "registrar configuration format error:" + e2.getMessage();
                            Log.e("AGC_Registrar", strConcat);
                        }
                    } else if (strArrSplit.length == 1) {
                        map.put(strArrSplit[0], 1000);
                    } else {
                        strConcat = "registrar configuration error, ".concat(str);
                        Log.e("AGC_Registrar", strConcat);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(map.entrySet());
            Collections.sort(arrayList2, new accesssetRecreateDisplayListcp(0));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Map.Entry) it.next()).getKey());
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (String str2 : arrayList) {
            try {
                Class<?> cls = Class.forName(str2);
                if (accessgetOutlineResolverp.class.isAssignableFrom(cls)) {
                    m1$$ExternalSyntheticOutline0.m(Class.forName(str2).newInstance());
                } else {
                    Log.e("AGC_Registrar", cls + " must extends from ServiceRegistrar.");
                }
            } catch (ClassNotFoundException e3) {
                string = "Can not found service class, " + e3.getMessage();
                Log.e("AGC_Registrar", string);
            } catch (IllegalAccessException e4) {
                e = e4;
                sb = new StringBuilder("instantiate service class exception ");
                sb.append(e.getLocalizedMessage());
                string = sb.toString();
                Log.e("AGC_Registrar", string);
            } catch (InstantiationException e5) {
                e = e5;
                sb = new StringBuilder("instantiate service class exception ");
                sb.append(e.getLocalizedMessage());
                string = sb.toString();
                Log.e("AGC_Registrar", string);
            }
        }
        arrayList3.size();
        return arrayList3;
    }

    public accesssetHasRetrievedMethodcp(Context context) {
        this.serializer = context.getApplicationContext();
    }

    public static boolean IconCompatParcelizer(String str) {
        boolean z = false;
        for (String str2 : r8lambdaNT8L1_Fcnjr9pKZ3qUchXpitvQY.serializer()) {
            String strRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str2, str);
            if (new File(str2, str).exists()) {
                r8lambdaPetcymL03j3fMaX9gYfmzmaOBPg.IconCompatParcelizer(strRemoteActionCompatParcelizer.concat(" binary detected!"));
                z = true;
            }
        }
        return z;
    }

    @Override // o.MutableRecttz77jQw
    public void write(DefaultContentCardsUpdateHandlerCompanionCREATOR1 defaultContentCardsUpdateHandlerCompanionCREATOR1) {
        translate translateVar = new translate("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), translateVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new accessgetAlpha8cp(this, defaultContentCardsUpdateHandlerCompanionCREATOR1, threadPoolExecutor, 1));
    }

    public /* synthetic */ accesssetHasRetrievedMethodcp(Context context, boolean z) {
        this.serializer = context;
    }
}
