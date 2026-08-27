package o;

import io.sentry.android.core.SentryLogcatAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetCompositingStrategyNrFUSIjd {
    public final LinkedHashMap serializer;

    public accessgetAmbientShadowColor0d7_KjUjd IconCompatParcelizer() {
        accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = new accessgetAmbientShadowColor0d7_KjUjd(this.serializer);
        Okio.serializer(accessgetambientshadowcolor0d7_kjujd);
        return accessgetambientshadowcolor0d7_kjujd;
    }

    public accessgetRgb565cp serializer(mapMKHz9U mapmkhz9u) {
        LinkedHashMap linkedHashMap = this.serializer;
        Object accessgetrgb565cp = linkedHashMap.get(mapmkhz9u);
        if (accessgetrgb565cp == null) {
            accessgetrgb565cp = new accessgetRgb565cp(mapmkhz9u);
            linkedHashMap.put(mapmkhz9u, accessgetrgb565cp);
        }
        return (accessgetRgb565cp) accessgetrgb565cp;
    }

    public accessgetCompositingStrategyNrFUSIjd(int i) {
        if (i == 1) {
            this.serializer = new LinkedHashMap();
        } else if (i != 2) {
            this.serializer = new LinkedHashMap();
        } else {
            this.serializer = new LinkedHashMap();
        }
    }

    public void write(HashMap map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            IconCompatParcelizer(entry.getValue(), (String) entry.getKey());
        }
    }

    public void write(getBlack0d7_KjUannotations getblack0d7_kjuannotations) {
        getblack0d7_kjuannotations.getClass();
        int i = getblack0d7_kjuannotations.RemoteActionCompatParcelizer;
        int i2 = getblack0d7_kjuannotations.serializer;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.serializer;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i2))) {
            SentryLogcatAdapter.IconCompatParcelizer("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + getblack0d7_kjuannotations);
        }
        treeMap2.put(Integer.valueOf(i2), getblack0d7_kjuannotations);
    }

    public List read(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.serializer;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            Object[] objArr = {((mapMKHz9U) entry.getKey()).RemoteActionCompatParcelizer, str};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((mapMKHz9U) it.next());
        }
        return onContentCardDismissed.PlaybackStateCompat(linkedHashMap.values());
    }

    public void IconCompatParcelizer(Object obj, String str) {
        str.getClass();
        if (obj == null) {
            obj = null;
        } else {
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(obj.getClass());
            if (!r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Boolean.TYPE)) && !r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Byte.TYPE)) && !r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Integer.TYPE)) && !r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Long.TYPE)) && !r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Float.TYPE)) && !r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Double.TYPE)) && !r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(String.class)) && !r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Boolean[].class)) && !r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Byte[].class)) && !r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Integer[].class)) && !r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Long[].class)) && !r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Float[].class)) && !r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Double[].class)) && !r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(String[].class))) {
                if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(boolean[].class))) {
                    obj = accesssetAmbientShadowColor8_81llAjd.write((boolean[]) obj);
                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(byte[].class))) {
                    obj = accesssetAmbientShadowColor8_81llAjd.serializer((byte[]) obj);
                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(int[].class))) {
                    obj = accesssetAmbientShadowColor8_81llAjd.write((int[]) obj);
                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(long[].class))) {
                    obj = accesssetAmbientShadowColor8_81llAjd.read((long[]) obj);
                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(float[].class))) {
                    obj = accesssetAmbientShadowColor8_81llAjd.serializer((float[]) obj);
                } else {
                    if (!r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(double[].class))) {
                        getOffVariationName.read("Key ", str, " has invalid type ", r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer);
                        return;
                    }
                    obj = accesssetAmbientShadowColor8_81llAjd.read((double[]) obj);
                }
            }
        }
        this.serializer.put(str, obj);
    }

    public accessgetRgb565cp read(mapMKHz9U mapmkhz9u) {
        mapmkhz9u.getClass();
        return (accessgetRgb565cp) this.serializer.remove(mapmkhz9u);
    }
}
