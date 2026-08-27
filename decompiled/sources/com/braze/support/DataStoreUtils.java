package com.braze.support;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.SimpleItemTouchHelperCallback;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.prepareInAppMessageWithZippedAssetHtml;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import o.resetTransientState;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreUtils {
    public static final DataStoreUtils INSTANCE = new DataStoreUtils();

    public static final class a implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ff$$ExternalSyntheticOutline0.m("Failed to parse JSON list: '", this.a, "'");
        }
    }

    public static final class b implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ff$$ExternalSyntheticOutline0.m("Failed to parse JSON map: '", this.a, "'");
        }
    }

    public static final class d implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        final /* synthetic */ String a;

        public d(String str) {
            this.a = str;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ff$$ExternalSyntheticOutline0.m("Failed to parse string to map: '", this.a, "'");
        }
    }

    public static final class e implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        public static final e a = new e();

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to serialize data to JSON";
        }
    }

    private DataStoreUtils() {
    }

    public final <T> String toJsonString(T t) {
        try {
            prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = resetTransientState.read.RemoteActionCompatParcelizer;
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) e.a, 4, (Object) null);
            return (!(t instanceof Map) && (t instanceof List)) ? "[]" : "{}";
        }
    }

    public static final class c implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        public static final c a = new c();

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        }
    }

    public final <T> List<T> jsonStringToList(String str) {
        str.getClass();
        boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (zSerializer) {
            return instance_delegatelambda0Var;
        }
        Object[] objArr = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString(), "null"};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return instance_delegatelambda0Var;
        }
        try {
            prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = resetTransientState.read.RemoteActionCompatParcelizer;
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a(str), 4, (Object) null);
            return instance_delegatelambda0Var;
        }
    }

    public final <T> Map<String, T> jsonStringToStringMap(String str) {
        str.getClass();
        boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
        if (zSerializer) {
            return simpleItemTouchHelperCallback;
        }
        Object[] objArr = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString(), "null"};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return simpleItemTouchHelperCallback;
        }
        try {
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b(str), 4, (Object) null);
            return simpleItemTouchHelperCallback;
        }
    }

    public final <T> Map<String, T> stringToMap(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            return SimpleItemTouchHelperCallback.serializer;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer(str, new String[]{str2}, 6);
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listSerializer, 10));
            Iterator<T> it = listSerializer.iterator();
            while (it.hasNext()) {
                arrayList.add(hideCurrentlyDisplayingInAppMessage.read((CharSequence) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            if (!it2.hasNext()) {
                return linkedHashMap;
            }
            List listSerializer2 = hideCurrentlyDisplayingInAppMessage.serializer((String) it2.next(), new String[]{str3}, 2);
            ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(listSerializer2, 10));
            Iterator<T> it3 = listSerializer2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(hideCurrentlyDisplayingInAppMessage.read((CharSequence) it3.next()).toString());
            }
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d(str), 4, (Object) null);
            return linkedHashMap;
        }
    }

    public static Map stringToMap$default(DataStoreUtils dataStoreUtils, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = ",";
        }
        if ((i & 4) != 0) {
            str3 = ":";
        }
        str.getClass();
        str2.getClass();
        str3.getClass();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            return SimpleItemTouchHelperCallback.serializer;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer(str, new String[]{str2}, 6);
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listSerializer, 10));
            Iterator it = listSerializer.iterator();
            while (it.hasNext()) {
                arrayList.add(hideCurrentlyDisplayingInAppMessage.read((CharSequence) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                if (((String) obj2).length() > 0) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.size() <= 0) {
                return linkedHashMap;
            }
            List listSerializer2 = hideCurrentlyDisplayingInAppMessage.serializer((String) arrayList2.get(0), new String[]{str3}, 2);
            ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(listSerializer2, 10));
            Iterator it2 = listSerializer2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(hideCurrentlyDisplayingInAppMessage.read((CharSequence) it2.next()).toString());
            }
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d(str), 4, (Object) null);
            return linkedHashMap;
        }
    }
}
