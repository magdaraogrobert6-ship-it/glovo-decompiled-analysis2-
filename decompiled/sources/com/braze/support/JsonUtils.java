package com.braze.support;

import android.os.Bundle;
import bo.app.c$$ExternalSyntheticLambda0;
import com.braze.models.IPutIntoJson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.SimpleItemTouchHelperCallback;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getContentCardsActionListener;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.resetAfterInAppMessageCloselambda2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class JsonUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("JsonUtils");

    public static final class a implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        final /* synthetic */ JSONArray a;

        public a(JSONArray jSONArray) {
            this.a = jSONArray;
        }

        public final Boolean a(int i) {
            this.a.opt(i);
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class b implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        final /* synthetic */ JSONArray a;

        public b(JSONArray jSONArray) {
            this.a = jSONArray;
        }

        public final T a(int i) throws JSONException {
            this.a.get(i);
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public static final class c implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        final /* synthetic */ JSONObject a;

        public c(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String str) {
            this.a.opt(str);
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        }
    }

    public static final class d implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        final /* synthetic */ JSONObject a;

        public d(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke(String str) throws JSONException {
            this.a.get(str);
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        }
    }

    public static final boolean isEqualTo(JSONObject jSONObject, JSONObject jSONObject2) {
        return areJsonObjectsEqual(jSONObject, jSONObject2);
    }

    public static final Map<String, String> convertJSONObjectToMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return SimpleItemTouchHelperCallback.serializer;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, jSONObject.getString(next));
        }
        return linkedHashMap;
    }

    public static final List<String> convertStringJsonArrayToList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArray.getString(i);
                    string.getClass();
                    arrayList.add(string);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda0(i, jSONArray, 1), 8, (Object) null);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getColorIntegerOrNull$lambda$0() {
        return "Failed to retrieve color integer from JSON";
    }

    public static final String getPrettyPrintedString(JSONArray jSONArray) {
        if (jSONArray == null) {
            return "";
        }
        try {
            String string = jSONArray.toString(2);
            string.getClass();
            return string;
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(27), 8, (Object) null);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getPrettyPrintedString$lambda$0() {
        return "Caught Throwable while generating pretty printed json. Returning blank string.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getPrettyPrintedString$lambda$1() {
        return "Caught Throwable while generating pretty printed json. Returning blank string.";
    }

    public static final <T> Iterator<T> iterator(JSONArray jSONArray) {
        if (jSONArray == null) {
            return getContentCardsActionListener.IconCompatParcelizer;
        }
        Object[] objArr = {0, Integer.valueOf(jSONArray.length())};
        int iWrite = BackspaceCommand.write();
        onContentCardDismissed.read((ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite));
        removeNodeAtDepth.IconCompatParcelizer();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mergeJsonObjects$lambda$0$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Caught exception merging JSON for old key ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mergeJsonObjects$lambda$1$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Caught exception merging JSON for new key ", str);
    }

    public static final Bundle parseJsonObjectIntoBundle(String str) {
        Bundle bundle = new Bundle();
        if (str != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(26), 8, (Object) null);
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseJsonObjectIntoBundle$lambda$0() {
        return "Unable parse JSON into a bundle.";
    }

    public static final Double getDoubleOrNull(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return Double.valueOf(jSONObject.optDouble(str));
    }

    public static final String getOptionalString(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public static final JSONObject mergeJsonObjects(JSONObject jSONObject, JSONObject jSONObject2) {
        jSONObject.getClass();
        jSONObject2.getClass();
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                jSONObject3.put(next, jSONObject.get(next));
            } catch (JSONException e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(next, 18), 8, (Object) null);
            }
        }
        Iterator<String> itKeys2 = jSONObject2.keys();
        itKeys2.getClass();
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            try {
                jSONObject3.put(next2, jSONObject2.get(next2));
            } catch (JSONException e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(next2, 19), 8, (Object) null);
            }
        }
        return jSONObject3;
    }

    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jSONObject, String str, Class<TargetEnum> cls, TargetEnum targetenum) {
        jSONObject.getClass();
        str.getClass();
        cls.getClass();
        try {
            String string = jSONObject.getString(str);
            string.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = string.toUpperCase(locale);
            upperCase.getClass();
            TargetEnum targetenum2 = (TargetEnum) Enum.valueOf(cls, upperCase);
            return targetenum2 == null ? targetenum : targetenum2;
        } catch (Exception unused) {
        }
    }

    public static final JSONObject plus(JSONObject jSONObject, JSONObject jSONObject2) {
        jSONObject.getClass();
        jSONObject2.getClass();
        return mergeJsonObjects(jSONObject, jSONObject2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String convertStringJsonArrayToList$lambda$0(int i, JSONArray jSONArray) {
        return "Failed to get string for item at index: " + i + " and array: " + jSONArray;
    }

    public static final <T> JSONArray constructJsonArray(Collection<? extends IPutIntoJson<T>> collection) {
        collection.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends IPutIntoJson<T>> it = collection.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().forJsonPut());
        }
        return jSONArray;
    }

    public static final JSONObject deepcopy(JSONObject jSONObject) {
        jSONObject.getClass();
        return new JSONObject(jSONObject.toString());
    }

    public static final Integer getColorIntegerOrNull(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        if (str == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(28), 8, (Object) null);
            return null;
        }
    }

    public static final boolean areJsonObjectsEqual(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null || jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                return false;
            }
            Object objOpt = jSONObject.opt(next);
            Object objOpt2 = jSONObject2.opt(next);
            if ((objOpt instanceof JSONObject) && (objOpt2 instanceof JSONObject)) {
                if (!isEqualTo((JSONObject) objOpt, (JSONObject) objOpt2)) {
                    return false;
                }
            } else if (objOpt != null && objOpt2 != null && !objOpt.equals(objOpt2)) {
                return false;
            }
        }
        return true;
    }

    public static final <T> Iterator<T> iterator(JSONObject jSONObject) {
        jSONObject.getClass();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        resetAfterInAppMessageCloselambda2.serializer(itKeys);
        removeNodeAtDepth.IconCompatParcelizer();
        throw null;
    }

    public static final <T> JSONArray constructJsonArray(T[] tArr) {
        tArr.getClass();
        JSONArray jSONArray = new JSONArray();
        for (T t : tArr) {
            jSONArray.put(t);
        }
        return jSONArray;
    }

    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jSONObject, String str, TargetEnum targetenum) {
        jSONObject.getClass();
        str.getClass();
        targetenum.getClass();
        try {
            com.braze.support.d dVar = com.braze.support.d.a;
            String string = jSONObject.getString(str);
            string.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            string.toUpperCase(locale).getClass();
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        } catch (Exception unused) {
            return targetenum;
        }
    }

    public static final String getPrettyPrintedString(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        try {
            String string = jSONObject.toString(2);
            string.getClass();
            return string;
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new JsonUtils$$ExternalSyntheticLambda1(0), 8, (Object) null);
            return "";
        }
    }

    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(JSONObject jSONObject, String str) {
        jSONObject.getClass();
        str.getClass();
        try {
            com.braze.support.d dVar = com.braze.support.d.a;
            String string = jSONObject.getString(str);
            string.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            string.toUpperCase(locale).getClass();
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }
}
