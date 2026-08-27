package bo.app;

import android.content.Context;
import android.net.Uri;
import com.braze.Constants;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o.createInAppMessageEventSubscriber;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isRoot;
import o.onContentCardClicked;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class hg {
    public final void a(File file, ConcurrentHashMap concurrentHashMap, LinkedHashMap linkedHashMap) {
        file.getClass();
        concurrentHashMap.getClass();
        linkedHashMap.getClass();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda0(14, fileArrListFiles), 6, (Object) null);
        try {
            ArrayList arrayList = new ArrayList();
            for (File file2 : fileArrListFiles) {
                if (!concurrentHashMap.containsValue(file2.getPath())) {
                    arrayList.add(file2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (!linkedHashMap.containsValue(((File) obj).getPath())) {
                    arrayList2.add(obj);
                }
            }
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                File file3 = (File) obj2;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) ig.e, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda1(file3, 0), 7, (Object) null);
                file3.getClass();
                BrazeFileUtils.deleteFileOrDirectory(file3);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda1(25), 4, (Object) null);
        }
    }

    public final String b(String str) {
        int iSerializer;
        str.getClass();
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        createinappmessageeventsubscriber.IconCompatParcelizer = "";
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (lastPathSegment != null && lastPathSegment.length() != 0 && (iSerializer = hideCurrentlyDisplayingInAppMessage.serializer('.', 0, 6, lastPathSegment)) > -1) {
            createinappmessageeventsubscriber.IconCompatParcelizer = lastPathSegment.substring(iSerializer);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda9(createinappmessageeventsubscriber, str), 6, (Object) null);
        }
        int requestCode = IntentUtils.getRequestCode();
        Object obj = createinappmessageeventsubscriber.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder();
        sb.append(requestCode);
        sb.append(obj);
        return sb.toString();
    }

    public static final String c(File file) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Deleting triggers directory at: ", file.getAbsolutePath());
    }

    public static final String b() {
        return "Failed to retrieve local assets from DataStore";
    }

    public static final String b(File file) {
        return ff$$ExternalSyntheticOutline0.m("Deleting obsolete asset '", file.getPath(), "' from filesystem.");
    }

    public final void a(Context context) {
        context.getClass();
        File file = new File(context.getCacheDir(), Constants.TRIGGERS_ASSETS_FOLDER);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda1(file, 1), 6, (Object) null);
        BrazeFileUtils.deleteFileOrDirectory(file);
    }

    public static final String a(Object obj, isRoot isroot) {
        return "Retrieving trigger local asset path '" + obj + "' from DataStore for remote path '" + isroot.IconCompatParcelizer + "'";
    }

    public static final String a(File[] fileArr) {
        return "Local triggered asset directory contains files: ".concat(onContentCardClicked.serializer(fileArr, " , ", null, new hg$$ExternalSyntheticLambda5(0), 30));
    }

    public static final CharSequence a(File file) {
        String name = file.getName();
        name.getClass();
        return name;
    }

    public static final String a() {
        return "Exception while deleting obsolete assets from filesystem.";
    }

    public final ConcurrentHashMap a(com.braze.storage.s sVar) {
        sVar.getClass();
        try {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Map.Entry<isRoot, Object> entry : sVar.readAllData().entrySet()) {
                isRoot key = entry.getKey();
                Object value = entry.getValue();
                if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) key.IconCompatParcelizer) && (value instanceof String) && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) value)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda2((String) value, 8, key), 7, (Object) null);
                    concurrentHashMap.put(key.IconCompatParcelizer, value);
                }
            }
            return concurrentHashMap;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(16), 4, (Object) null);
            return new ConcurrentHashMap();
        }
    }

    public final LinkedHashSet a(ConcurrentHashMap concurrentHashMap, Set set, LinkedHashMap linkedHashMap) {
        concurrentHashMap.getClass();
        set.getClass();
        linkedHashMap.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = new HashSet(concurrentHashMap.keySet()).iterator();
        it.getClass();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (linkedHashMap.containsKey(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 28), 7, (Object) null);
            } else if (!set.contains(str)) {
                String str2 = (String) concurrentHashMap.remove(str);
                str.getClass();
                linkedHashSet.add(str);
                if (str2 != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda1(str2, str, 2), 7, (Object) null);
                    BrazeFileUtils.deleteFileOrDirectory(new File(str2));
                }
            }
        }
        return linkedHashSet;
    }

    public static final String a(String str) {
        return ff$$ExternalSyntheticOutline0.m("Not removing local path for remote path ", str, " from cache because it is being preserved until the end of the app run.");
    }

    public static final String a(String str, String str2) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Removing obsolete local path ", str, " for obsolete remote path ", str2, " from cache.");
    }

    public final onViewAttachedToWindowlambda0 a(List list) {
        list.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ga gaVar = (ga) it.next();
            int i = 0;
            if (!((ah) gaVar).c) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda6(gaVar, 0), 7, (Object) null);
            } else {
                ArrayList arrayListA = gaVar.a();
                int size = arrayListA.size();
                while (i < size) {
                    Object obj = arrayListA.get(i);
                    i++;
                    fd fdVar = (fd) obj;
                    String str = fdVar.b;
                    if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(gaVar, 3, str), 7, (Object) null);
                        linkedHashSet.add(fdVar);
                        linkedHashSet2.add(str);
                    }
                }
            }
        }
        return new onViewAttachedToWindowlambda0(linkedHashSet, linkedHashSet2);
    }

    public static final String a(ga gaVar) {
        return ff$$ExternalSyntheticOutline0.m("Pre-fetch off for triggered action ", ((ah) gaVar).a, ". Not pre-fetching assets.");
    }

    public static final String a(ga gaVar, String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Received new remote path for triggered action ", ((ah) gaVar).a, " at ", str, ".");
    }

    public static final String a(createInAppMessageEventSubscriber createinappmessageeventsubscriber, String str) {
        return "Using file extension " + createinappmessageeventsubscriber.IconCompatParcelizer + " for remote asset url: " + str;
    }
}
