package com.mapbox.common;

import android.os.BaseBundle;
import android.os.Bundle;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.Value;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ValueUtilsKt {
    private static final String TAG = "ValueUtils";

    private static final Value toValue(Object obj) {
        if (obj instanceof Byte) {
            return Value.valueOf(((Number) obj).byteValue());
        }
        if (obj instanceof Integer) {
            return Value.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return Value.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof Float) {
            return Value.valueOf(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return Value.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return Value.valueOf(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return Value.valueOf((String) obj);
        }
        if ((obj instanceof boolean[]) || (obj instanceof byte[]) || (obj instanceof int[]) || (obj instanceof long[]) || (obj instanceof float[]) || (obj instanceof double[])) {
            return arrayToValue(obj);
        }
        if (obj instanceof Bundle) {
            return toValue((BaseBundle) obj);
        }
        Log.warning(TAG, "Type is not supported: " + obj.getClass().getCanonicalName());
        return null;
    }

    public static /* synthetic */ Value toValue$default(Float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return toValue(f, z);
    }

    private static final Value arrayToValue(Object obj) {
        ArrayList arrayList;
        int i = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i < length) {
                arrayList.add(Value.valueOf(zArr[i]));
                i++;
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            arrayList = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i < length2) {
                arrayList.add(Value.valueOf(bArr[i]));
                i++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            arrayList = new ArrayList(iArr.length);
            int length3 = iArr.length;
            while (i < length3) {
                arrayList.add(Value.valueOf(iArr[i]));
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            arrayList = new ArrayList(jArr.length);
            int length4 = jArr.length;
            while (i < length4) {
                arrayList.add(Value.valueOf(jArr[i]));
                i++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            arrayList = new ArrayList(fArr.length);
            int length5 = fArr.length;
            while (i < length5) {
                arrayList.add(Value.valueOf(fArr[i]));
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            arrayList = new ArrayList(dArr.length);
            int length6 = dArr.length;
            while (i < length6) {
                arrayList.add(Value.valueOf(dArr[i]));
                i++;
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        return Value.valueOf(arrayList);
    }

    public static /* synthetic */ Value toValue$default(Double d, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return toValue(d, z);
    }

    public static final Value toValue(String str) {
        if (str != null) {
            Value valueValueOf = Value.valueOf(str);
            valueValueOf.getClass();
            return valueValueOf;
        }
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        return valueNullValue;
    }

    public static final Value toValue(Boolean bool) {
        if (bool != null) {
            Value valueValueOf = Value.valueOf(bool.booleanValue());
            valueValueOf.getClass();
            return valueValueOf;
        }
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        return valueNullValue;
    }

    public static final Value toValue(Integer num) {
        if (num != null) {
            Value valueValueOf = Value.valueOf(num.intValue());
            valueValueOf.getClass();
            return valueValueOf;
        }
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        return valueNullValue;
    }

    public static final Value toValue(Long l) {
        if (l != null) {
            Value valueValueOf = Value.valueOf(l.longValue());
            valueValueOf.getClass();
            return valueValueOf;
        }
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        return valueNullValue;
    }

    public static final Value toValue(Float f, boolean z) {
        if (f != null) {
            float fFloatValue = f.floatValue();
            if (z) {
                float fFloatValue2 = f.floatValue();
                if (Float.isInfinite(fFloatValue2) || Float.isNaN(fFloatValue2)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Value can not be Double.NaN, Double.POSITIVE_INFINITY or Double.NEGATIVE_INFINITY");
                    return null;
                }
            }
            Value valueValueOf = Value.valueOf(fFloatValue);
            valueValueOf.getClass();
            return valueValueOf;
        }
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        return valueNullValue;
    }

    public static final Value toValue(Double d, boolean z) {
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            if (z) {
                double dDoubleValue2 = d.doubleValue();
                if (Double.isInfinite(dDoubleValue2) || Double.isNaN(dDoubleValue2)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Value can not be Float.NaN, Float.POSITIVE_INFINITY or Float.NEGATIVE_INFINITY");
                    return null;
                }
            }
            Value valueValueOf = Value.valueOf(dDoubleValue);
            valueValueOf.getClass();
            return valueValueOf;
        }
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        return valueNullValue;
    }

    public static final Value toValue(List<? extends Value> list) {
        if (list != null) {
            Value valueValueOf = Value.valueOf((List<Value>) list);
            valueValueOf.getClass();
            return valueValueOf;
        }
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        return valueNullValue;
    }

    public static final Value toValue(HashMap<String, Value> map) {
        if (map != null) {
            Value valueValueOf = Value.valueOf(map);
            valueValueOf.getClass();
            return valueValueOf;
        }
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        return valueNullValue;
    }

    public static final Value toValue(BaseBundle baseBundle) {
        baseBundle.getClass();
        HashMap map = new HashMap();
        if (baseBundle.isEmpty()) {
            Value valueValueOf = Value.valueOf((HashMap<String, Value>) map);
            valueValueOf.getClass();
            return valueValueOf;
        }
        for (String str : baseBundle.keySet()) {
            Object obj = baseBundle.get(str);
            if (obj != null) {
                if ((obj instanceof Bundle) && obj.equals(baseBundle)) {
                    Log.warning(TAG, "This bundle contains reference to itself");
                } else {
                    Value value = toValue(obj);
                    if (value != null) {
                    }
                }
            }
        }
        Value valueValueOf2 = Value.valueOf((HashMap<String, Value>) map);
        valueValueOf2.getClass();
        return valueValueOf2;
    }
}
