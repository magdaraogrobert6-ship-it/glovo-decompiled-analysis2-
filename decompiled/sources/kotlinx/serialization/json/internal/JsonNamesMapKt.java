package kotlinx.serialization.json.internal;

import io.sentry.logger.serializer;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;
import kotlinx.serialization.SerializationException;
import o.SwipeDismissTouchListener1;
import o.getCieXyz;
import o.handleLocalImagelambda1;
import o.onMove;
import o.r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaG0Ej0SDzZu2fLTdYcztwvWE3AE;
import o.r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8;
import o.removeNodeAtDepth;
import o.resetTransientState;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JsonNamesMapKt {
    public static final handleLocalImagelambda1 IconCompatParcelizer = new handleLocalImagelambda1();

    public static final boolean IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, resetTransientState resettransientstate) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        resettransientstate.getClass();
        if (resettransientstate.IconCompatParcelizer.MediaDescriptionCompat) {
            return true;
        }
        List list = r8lambda92m0p9sit5uf70mvjf4rwmruda.read();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof r8lambdaG0Ej0SDzZu2fLTdYcztwvWE3AE) {
                return true;
            }
        }
        return false;
    }

    public static final int read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, resetTransientState resettransientstate, String str, String str2) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        resettransientstate.getClass();
        str.getClass();
        int iSerializer = serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, resettransientstate, str);
        if (iSerializer != -3) {
            return iSerializer;
        }
        throw new SerializationException(r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final int serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, resetTransientState resettransientstate, String str) {
        Object objInvoke;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        resettransientstate.getClass();
        serializer serializerVar = resettransientstate.write;
        str.getClass();
        SwipeDismissTouchListener1 swipeDismissTouchListener1 = resettransientstate.IconCompatParcelizer;
        boolean z = swipeDismissTouchListener1.serializer;
        handleLocalImagelambda1 handlelocalimagelambda1 = IconCompatParcelizer;
        int i = 21;
        if (z) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(), r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                SealedClassSerializer$$ExternalSyntheticLambda0 sealedClassSerializer$$ExternalSyntheticLambda0 = new SealedClassSerializer$$ExternalSyntheticLambda0(r8lambda92m0p9sit5uf70mvjf4rwmruda, i, resettransientstate);
                serializerVar.getClass();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) serializerVar.scopes;
                Map map = (Map) concurrentHashMap.get(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                Object obj = map != null ? map.get(handlelocalimagelambda1) : null;
                objInvoke = obj != null ? obj : null;
                if (objInvoke == null) {
                    objInvoke = sealedClassSerializer$$ExternalSyntheticLambda0.invoke();
                    Object concurrentHashMap2 = concurrentHashMap.get(r8lambda92m0p9sit5uf70mvjf4rwmruda);
                    if (concurrentHashMap2 == null) {
                        concurrentHashMap2 = new ConcurrentHashMap(2);
                        concurrentHashMap.put(r8lambda92m0p9sit5uf70mvjf4rwmruda, concurrentHashMap2);
                    }
                    ((Map) concurrentHashMap2).put(handlelocalimagelambda1, objInvoke);
                }
                Integer num = (Integer) ((Map) objInvoke).get(lowerCase);
                if (num != null) {
                    return num.intValue();
                }
                return -3;
            }
        }
        write(r8lambda92m0p9sit5uf70mvjf4rwmruda, resettransientstate);
        int i2 = r8lambda92m0p9sit5uf70mvjf4rwmruda.read(str);
        if (i2 != -3 || !swipeDismissTouchListener1.ParcelableVolumeInfo) {
            return i2;
        }
        SealedClassSerializer$$ExternalSyntheticLambda0 sealedClassSerializer$$ExternalSyntheticLambda1 = new SealedClassSerializer$$ExternalSyntheticLambda0(r8lambda92m0p9sit5uf70mvjf4rwmruda, i, resettransientstate);
        serializerVar.getClass();
        ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) serializerVar.scopes;
        Map map2 = (Map) concurrentHashMap3.get(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        Object obj2 = map2 != null ? map2.get(handlelocalimagelambda1) : null;
        objInvoke = obj2 != null ? obj2 : null;
        if (objInvoke == null) {
            objInvoke = sealedClassSerializer$$ExternalSyntheticLambda1.invoke();
            Object concurrentHashMap4 = concurrentHashMap3.get(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            if (concurrentHashMap4 == null) {
                concurrentHashMap4 = new ConcurrentHashMap(2);
                concurrentHashMap3.put(r8lambda92m0p9sit5uf70mvjf4rwmruda, concurrentHashMap4);
            }
            ((Map) concurrentHashMap4).put(handlelocalimagelambda1, objInvoke);
        }
        Integer num2 = (Integer) ((Map) objInvoke).get(str);
        if (num2 != null) {
            return num2.intValue();
        }
        return -3;
    }

    public static final void write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, resetTransientState resettransientstate) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        resettransientstate.getClass();
        Object[] objArr = {r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(), r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.IconCompatParcelizer};
        ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public static final void serializer(LinkedHashMap linkedHashMap, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, String str, int i) {
        String str2 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(), r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw.IconCompatParcelizer}, getCieXyz.write())).booleanValue() ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer(i) + " is already one of the names for " + str2 + ' ' + r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer(((Number) onMove.read(linkedHashMap, str)).intValue()) + " in " + r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }
}
