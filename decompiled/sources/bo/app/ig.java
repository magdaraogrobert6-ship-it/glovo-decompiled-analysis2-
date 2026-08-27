package bo.app;

import android.content.Context;
import android.net.Uri;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o.SimpleItemTouchHelperCallback;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class ig {
    public static final hg e = new hg();
    public final com.braze.storage.s a;
    public final ConcurrentHashMap b;
    public final LinkedHashMap c;
    public final File d;

    public static final String b(ga gaVar) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Prefetch is turned off for this triggered action. Not retrieving local asset paths. Action id: ", ((ah) gaVar).a);
    }

    public static final String e(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to add new local path for remote path ", str);
    }

    public static final String f(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Removed from DataStore: ", str);
    }

    public ig(Context context, String str) {
        context.getClass();
        str.getClass();
        com.braze.storage.s sVar = new com.braze.storage.s(context, str);
        this.a = sVar;
        this.b = e.a(sVar);
        this.c = new LinkedHashMap();
        this.d = new File(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(context.getCacheDir().getPath(), "/ab_triggers"));
    }

    public final String a(fd fdVar) {
        Long lA;
        fdVar.getClass();
        String str = fdVar.b;
        int iOrdinal = fdVar.a.ordinal();
        if (iOrdinal == 0) {
            String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(this.d, str);
            if (localHtmlUrlFromRemoteUrl == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) localHtmlUrlFromRemoteUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 29), 7, (Object) null);
                return null;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda1(localHtmlUrlFromRemoteUrl, str, 3), 6, (Object) null);
            return localHtmlUrlFromRemoteUrl;
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        String strB = e.b(str);
        try {
            String string = this.d.toString();
            string.getClass();
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0DownloadFileToPath$default = BrazeFileUtils.downloadFileToPath$default(string, str, strB, null, 8, null);
            File file = (File) onviewattachedtowindowlambda0DownloadFileToPath$default.serializer;
            Map map = (Map) onviewattachedtowindowlambda0DownloadFileToPath$default.write;
            String str2 = (String) map.get("expires");
            if (str2 != null && (lA = com.braze.support.h.a(str2)) != null && lA.longValue() <= 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(str, 4, map), 7, (Object) null);
                return null;
            }
            Uri uriFromFile = Uri.fromFile(file);
            if (uriFromFile != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda7(0, uriFromFile, str), 6, (Object) null);
                return uriFromFile.getPath();
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2(str, 3), 7, (Object) null);
            return null;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2(str, 4), 4, (Object) null);
            return null;
        }
    }

    public static final String d(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("Added to DataStore: ", str, " -> ", str2);
    }

    public static final String c(String str, String str2) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Adding new local path '", str, "' for remote path '", str2, "' to cache.");
    }

    public static final String d(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Could not find local asset for remote path ", str);
    }

    public static final String c(ga gaVar) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("No local assets found for action id: ", ((ah) gaVar).a);
    }

    public static final String b(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("Found local asset at path ", str, " for remote asset at path: ", str2);
    }

    public static final String b(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Could not download ", str);
    }

    public static final String c(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to store asset for remote path ", str, ". Not storing local asset");
    }

    public final void a(List list, fh fhVar, List list2) {
        list.getClass();
        list2.getClass();
        hg hgVar = e;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0A = hgVar.a(list);
        Set set = (Set) onviewattachedtowindowlambda0A.serializer;
        LinkedHashSet linkedHashSetA = hgVar.a(this.b, (Set) onviewattachedtowindowlambda0A.write, this.c);
        hgVar.a(this.d, this.b, this.c);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!this.b.containsKey(((fd) obj).b)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fd fdVar = (fd) arrayList.get(i);
            String str = fdVar.b;
            try {
                String strA = a(fdVar);
                if (strA != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strA)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda1(strA, str, 5), 7, (Object) null);
                    this.b.put(str, strA);
                    linkedHashMap.put(str, strA);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2(str, 2), 4, (Object) null);
            }
        }
        a(linkedHashMap, linkedHashSetA);
    }

    public final Map a(ga gaVar) {
        gaVar.getClass();
        if (!((ah) gaVar).c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda6(gaVar, 1), 7, (Object) null);
            return SimpleItemTouchHelperCallback.serializer;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayListA = gaVar.a();
        int size = arrayListA.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            String str = ((fd) arrayListA.get(i2)).b;
            String str2 = (String) this.b.get(str);
            if (str2 != null && new File(str2).exists()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda1(str2, str, i), 7, (Object) null);
                this.c.put(str, str2);
                linkedHashMap.put(str, str2);
                i = 0;
            } else {
                i = 0;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2(str, 0), 6, (Object) null);
            }
        }
        if (linkedHashMap.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda6(gaVar, 2), 6, (Object) null);
        }
        return linkedHashMap;
    }

    public static final String a(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("Storing local triggered action html zip asset at local path ", str, " for remote path ", str2);
    }

    public static final String a(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to store html zip asset for remote path ", str, ". Not storing local asset");
    }

    public static final String a(String str, Map map) {
        return "Not caching " + str + " due to headers " + map;
    }

    public static final String a(Uri uri, String str) {
        return af$$ExternalSyntheticOutline0.m("Storing local triggered action asset at local path ", uri.getPath(), " for remote path ", str);
    }

    public final void a(LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet) {
        linkedHashMap.getClass();
        linkedHashSet.getClass();
        if (linkedHashMap.isEmpty() && linkedHashSet.isEmpty()) {
            return;
        }
        try {
            this.a.batchUpdate(linkedHashMap, linkedHashSet);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda1((String) entry.getKey(), (String) entry.getValue(), 4), 7, (Object) null);
            }
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2((String) it.next(), 1), 7, (Object) null);
            }
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(29), 4, (Object) null);
        }
    }

    public static final String a() {
        return "Failed to update DataStore";
    }
}
