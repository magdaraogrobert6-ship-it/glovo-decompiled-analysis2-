package com.mapbox.maps.extension.style.utils;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.braze.models.inappmessage.InAppMessageBase;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.JsonPrimitive;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxStyleException;
import com.mapbox.maps.TileCacheBudget;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.generated.LayerProperty;
import com.mapbox.maps.extension.style.sources.SourceUtils$WhenMappings;
import com.mapbox.maps.extension.style.types.StyleTransition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o.accessgetInstancedelegatecp;
import o.getPerformImeActionannotations;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeUtils {
    public static final TypeUtils INSTANCE = new TypeUtils();

    private TypeUtils() {
    }

    public final Value wrapToValue(Object obj) {
        obj.getClass();
        if (obj instanceof Value) {
            return (Value) obj;
        }
        if (obj instanceof Expression) {
            return (Value) obj;
        }
        if (obj instanceof StyleTransition) {
            StyleTransition styleTransition = (StyleTransition) obj;
            HashMap map = new HashMap();
            map.put("delay", new Value(0L));
            map.put(InAppMessageBase.DURATION, new Value(0L));
            Long l = styleTransition.delay;
            if (l != null) {
                map.put("delay", new Value(l.longValue()));
            }
            Long l2 = styleTransition.duration;
            if (l2 != null) {
                map.put(InAppMessageBase.DURATION, new Value(l2.longValue()));
            }
            return new Value((HashMap<String, Value>) map);
        }
        if (obj instanceof LayerProperty) {
            return new Value(((LayerProperty) obj).getValue());
        }
        if (obj instanceof TileCacheBudget) {
            TileCacheBudget tileCacheBudget = (TileCacheBudget) obj;
            HashMap map2 = new HashMap();
            TileCacheBudget.Type typeInfo = tileCacheBudget.getTypeInfo();
            int i = typeInfo == null ? -1 : SourceUtils$WhenMappings.$EnumSwitchMapping$0[typeInfo.ordinal()];
            if (i == 1) {
                map2.put("megabytes", new Value(tileCacheBudget.getTileCacheBudgetInMegabytes().getSize()));
            } else {
                if (i != 2) {
                    throw new MapboxStyleException("Failed to parse TileCacheBudget: " + tileCacheBudget);
                }
                map2.put("tiles", new Value(tileCacheBudget.getTileCacheBudgetInTiles().getSize()));
            }
            return new Value((HashMap<String, Value>) map2);
        }
        if (obj instanceof getPerformImeActionannotations) {
            throw null;
        }
        if (obj instanceof Integer) {
            return new Value(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            return new Value((String) obj);
        }
        if (obj instanceof Boolean) {
            return new Value(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Double) {
            Number number = (Number) obj;
            double dDoubleValue = number.doubleValue();
            if (!Double.isInfinite(dDoubleValue) && !Double.isNaN(dDoubleValue)) {
                return new Value(number.doubleValue());
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Value can not be Double.NaN, Double.POSITIVE_INFINITY or Double.NEGATIVE_INFINITY");
            return null;
        }
        if (obj instanceof Float) {
            Number number2 = (Number) obj;
            float fFloatValue = number2.floatValue();
            if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue)) {
                return new Value(number2.floatValue());
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Value can not be Float.NaN, Float.POSITIVE_INFINITY or Float.NEGATIVE_INFINITY");
            return null;
        }
        if (obj instanceof Long) {
            return new Value(((Number) obj).longValue());
        }
        int i2 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            ArrayList arrayList = new ArrayList(iArr.length);
            int length = iArr.length;
            while (i2 < length) {
                arrayList.add(INSTANCE.wrapToValue(Long.valueOf(iArr[i2])));
                i2++;
            }
            return new Value((List<Value>) arrayList);
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList2 = new ArrayList(zArr.length);
            int length2 = zArr.length;
            while (i2 < length2) {
                arrayList2.add(wrapToValue(Boolean.valueOf(zArr[i2])));
                i2++;
            }
            return new Value((List<Value>) arrayList2);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList3 = new ArrayList(dArr.length);
            int length3 = dArr.length;
            while (i2 < length3) {
                arrayList3.add(wrapToValue(Double.valueOf(dArr[i2])));
                i2++;
            }
            return new Value((List<Value>) arrayList3);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList4 = new ArrayList(fArr.length);
            int length4 = fArr.length;
            while (i2 < length4) {
                arrayList4.add(INSTANCE.wrapToValue(Double.valueOf(fArr[i2])));
                i2++;
            }
            return new Value((List<Value>) arrayList4);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList5 = new ArrayList(jArr.length);
            int length5 = jArr.length;
            while (i2 < length5) {
                arrayList5.add(wrapToValue(Long.valueOf(jArr[i2])));
                i2++;
            }
            return new Value((List<Value>) arrayList5);
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            ArrayList arrayList6 = new ArrayList(objArr.length);
            int length6 = objArr.length;
            while (i2 < length6) {
                Object obj2 = objArr[i2];
                arrayList6.add(obj2 != null ? INSTANCE.wrapToValue(obj2) : null);
                i2++;
            }
            return new Value((List<Value>) arrayList6);
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList7 = new ArrayList(accessgetInstancedelegatecp.write(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                arrayList7.add(next != null ? INSTANCE.wrapToValue(next) : null);
            }
            return new Value((List<Value>) arrayList7);
        }
        if (obj instanceof HashMap) {
            HashMap map3 = new HashMap();
            HashMap map4 = (HashMap) obj;
            Set<String> setKeySet = map4.keySet();
            setKeySet.getClass();
            for (String str : setKeySet) {
                str.getClass();
                TypeUtils typeUtils = INSTANCE;
                Object obj3 = map4.get(str);
                obj3.getClass();
                map3.put(str, typeUtils.wrapToValue(obj3));
            }
            return new Value((HashMap<String, Value>) map3);
        }
        if (!(obj instanceof JsonPrimitive)) {
            throw new UnsupportedOperationException("Wrapping \"" + obj.getClass().getSimpleName() + "\" is not supported.");
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        if (jsonPrimitive.isBoolean()) {
            return new Value(jsonPrimitive.getAsBoolean());
        }
        if (jsonPrimitive.isNumber()) {
            return new Value(jsonPrimitive.getAsDouble());
        }
        if (jsonPrimitive.isString()) {
            return new Value(jsonPrimitive.getAsString());
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m(obj, "Failed to parse JsonPrimitive: "));
        return null;
    }
}
