package o;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class isConvexannotations extends asAndroidPathEffect {
    public final /* synthetic */ int IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ isConvexannotations(boolean z, int i) {
        super(z);
        this.IconCompatParcelizer = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [o.instance_delegatelambda0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    @Override // o.asAndroidPathEffect
    public final Object serializer(Bundle bundle, String str) {
        int i = this.IconCompatParcelizer;
        ?? arrayList = instance_delegatelambda0.write;
        int i2 = 0;
        switch (i) {
            case 0:
                bundle.getClass();
                if (!bundle.containsKey(str) || getCyan0d7_KjU.RemoteActionCompatParcelizer(bundle, str)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return onContentCardClicked.read(intArray);
                }
                accessbootstrapIfNeeded.write(str);
                throw null;
            case 1:
                bundle.getClass();
                if (!bundle.containsKey(str) || getCyan0d7_KjU.RemoteActionCompatParcelizer(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                accessbootstrapIfNeeded.write(str);
                throw null;
            case 2:
                bundle.getClass();
                if (!bundle.containsKey(str) || getCyan0d7_KjU.RemoteActionCompatParcelizer(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(str);
                if (booleanArray2 == null) {
                    accessbootstrapIfNeeded.write(str);
                    throw null;
                }
                booleanArray2.getClass();
                int length = booleanArray2.length;
                if (length != 0) {
                    if (length != 1) {
                        arrayList = new ArrayList(booleanArray2.length);
                        int length2 = booleanArray2.length;
                        while (i2 < length2) {
                            arrayList.add(Boolean.valueOf(booleanArray2[i2]));
                            i2++;
                        }
                    } else {
                        Object[] objArr = {Boolean.valueOf(booleanArray2[0])};
                        int iSerializer = getQueryParameterslambda2.serializer();
                        arrayList = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
                    }
                }
                return arrayList;
            case 3:
                bundle.getClass();
                if (!bundle.containsKey(str) || getCyan0d7_KjU.RemoteActionCompatParcelizer(bundle, str)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                accessbootstrapIfNeeded.write(str);
                throw null;
            case 4:
                bundle.getClass();
                if (!bundle.containsKey(str) || getCyan0d7_KjU.RemoteActionCompatParcelizer(bundle, str)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(str);
                if (floatArray2 != null) {
                    return onContentCardClicked.write(floatArray2);
                }
                accessbootstrapIfNeeded.write(str);
                throw null;
            case 5:
                bundle.getClass();
                if (!bundle.containsKey(str) || getCyan0d7_KjU.RemoteActionCompatParcelizer(bundle, str)) {
                    return null;
                }
                int[] intArray2 = bundle.getIntArray(str);
                if (intArray2 != null) {
                    return intArray2;
                }
                accessbootstrapIfNeeded.write(str);
                throw null;
            case 6:
                bundle.getClass();
                if (!bundle.containsKey(str) || getCyan0d7_KjU.RemoteActionCompatParcelizer(bundle, str)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                accessbootstrapIfNeeded.write(str);
                throw null;
            case 7:
                bundle.getClass();
                if (!bundle.containsKey(str) || getCyan0d7_KjU.RemoteActionCompatParcelizer(bundle, str)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(str);
                if (longArray2 == null) {
                    accessbootstrapIfNeeded.write(str);
                    throw null;
                }
                longArray2.getClass();
                int length3 = longArray2.length;
                if (length3 != 0) {
                    if (length3 != 1) {
                        arrayList = new ArrayList(longArray2.length);
                        int length4 = longArray2.length;
                        while (i2 < length4) {
                            arrayList.add(Long.valueOf(longArray2[i2]));
                            i2++;
                        }
                    } else {
                        Object[] objArr2 = {Long.valueOf(longArray2[0])};
                        int iSerializer2 = getQueryParameterslambda2.serializer();
                        arrayList = (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr2, getQueryParameterslambda2.serializer(), -516583649, iSerializer2);
                    }
                }
                return arrayList;
            case 8:
                bundle.getClass();
                if (!bundle.containsKey(str) || getCyan0d7_KjU.RemoteActionCompatParcelizer(bundle, str)) {
                    return null;
                }
                String[] stringArray = bundle.getStringArray(str);
                if (stringArray != null) {
                    return stringArray;
                }
                accessbootstrapIfNeeded.write(str);
                throw null;
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || getCyan0d7_KjU.RemoteActionCompatParcelizer(bundle, str)) {
                    return null;
                }
                String[] stringArray2 = bundle.getStringArray(str);
                if (stringArray2 != null) {
                    return onContentCardClicked.RatingCompat(stringArray2);
                }
                accessbootstrapIfNeeded.write(str);
                throw null;
        }
    }

    @Override // o.asAndroidPathEffect
    public final boolean IconCompatParcelizer(Object obj, Object obj2) {
        Boolean[] boolArr;
        Float[] fArr;
        Integer[] numArr;
        Long[] lArr;
        int i = 0;
        Object[] objArr = null;
        switch (this.IconCompatParcelizer) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                return onContentCardClicked.RemoteActionCompatParcelizer(list != null ? (Integer[]) list.toArray(new Integer[0]) : null, list2 != null ? (Integer[]) list2.toArray(new Integer[0]) : null);
            case 1:
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                if (zArr != null) {
                    boolArr = new Boolean[zArr.length];
                    int length = zArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        boolArr[i2] = Boolean.valueOf(zArr[i2]);
                    }
                } else {
                    boolArr = null;
                }
                if (zArr2 != null) {
                    objArr = new Boolean[zArr2.length];
                    int length2 = zArr2.length;
                    while (i < length2) {
                        objArr[i] = Boolean.valueOf(zArr2[i]);
                        i++;
                    }
                }
                return onContentCardClicked.RemoteActionCompatParcelizer(boolArr, objArr);
            case 2:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                return onContentCardClicked.RemoteActionCompatParcelizer(list3 != null ? (Boolean[]) list3.toArray(new Boolean[0]) : null, list4 != null ? (Boolean[]) list4.toArray(new Boolean[0]) : null);
            case 3:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                if (fArr2 != null) {
                    fArr = new Float[fArr2.length];
                    int length3 = fArr2.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        fArr[i3] = Float.valueOf(fArr2[i3]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    objArr = new Float[fArr3.length];
                    int length4 = fArr3.length;
                    while (i < length4) {
                        objArr[i] = Float.valueOf(fArr3[i]);
                        i++;
                    }
                }
                return onContentCardClicked.RemoteActionCompatParcelizer(fArr, objArr);
            case 4:
                List list5 = (List) obj;
                List list6 = (List) obj2;
                return onContentCardClicked.RemoteActionCompatParcelizer(list5 != null ? (Float[]) list5.toArray(new Float[0]) : null, list6 != null ? (Float[]) list6.toArray(new Float[0]) : null);
            case 5:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                if (iArr != null) {
                    numArr = new Integer[iArr.length];
                    int length5 = iArr.length;
                    for (int i4 = 0; i4 < length5; i4++) {
                        numArr[i4] = Integer.valueOf(iArr[i4]);
                    }
                } else {
                    numArr = null;
                }
                if (iArr2 != null) {
                    objArr = new Integer[iArr2.length];
                    int length6 = iArr2.length;
                    while (i < length6) {
                        objArr[i] = Integer.valueOf(iArr2[i]);
                        i++;
                    }
                }
                return onContentCardClicked.RemoteActionCompatParcelizer(numArr, objArr);
            case 6:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                if (jArr != null) {
                    lArr = new Long[jArr.length];
                    int length7 = jArr.length;
                    for (int i5 = 0; i5 < length7; i5++) {
                        lArr[i5] = Long.valueOf(jArr[i5]);
                    }
                } else {
                    lArr = null;
                }
                if (jArr2 != null) {
                    objArr = new Long[jArr2.length];
                    int length8 = jArr2.length;
                    while (i < length8) {
                        objArr[i] = Long.valueOf(jArr2[i]);
                        i++;
                    }
                }
                return onContentCardClicked.RemoteActionCompatParcelizer(lArr, objArr);
            case 7:
                List list7 = (List) obj;
                List list8 = (List) obj2;
                return onContentCardClicked.RemoteActionCompatParcelizer(list7 != null ? (Long[]) list7.toArray(new Long[0]) : null, list8 != null ? (Long[]) list8.toArray(new Long[0]) : null);
            case 8:
                return onContentCardClicked.RemoteActionCompatParcelizer((String[]) obj, (String[]) obj2);
            default:
                List list9 = (List) obj;
                List list10 = (List) obj2;
                return onContentCardClicked.RemoteActionCompatParcelizer(list9 != null ? (String[]) list9.toArray(new String[0]) : null, list10 != null ? (String[]) list10.toArray(new String[0]) : null);
        }
    }

    @Override // o.asAndroidPathEffect
    public final Object read(Object obj, String str) {
        switch (this.IconCompatParcelizer) {
            case 0:
                List list = (List) obj;
                AndroidPaint_androidKtWhenMappings androidPaint_androidKtWhenMappings = asAndroidPathEffect.MediaSessionCompatQueueItem;
                if (list != null) {
                    return onContentCardDismissed.IconCompatParcelizer((List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{androidPaint_androidKtWhenMappings.IconCompatParcelizer(str)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), list);
                }
                return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{androidPaint_androidKtWhenMappings.IconCompatParcelizer(str)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            case 1:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return write(str);
                }
                boolean[] zArrWrite = write(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrWrite, 0, zArrCopyOf, length, 1);
                return zArrCopyOf;
            case 2:
                List list2 = (List) obj;
                AndroidPaint_androidKtWhenMappings androidPaint_androidKtWhenMappings2 = asAndroidPathEffect.RemoteActionCompatParcelizer;
                if (list2 != null) {
                    return onContentCardDismissed.IconCompatParcelizer((List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{androidPaint_androidKtWhenMappings2.IconCompatParcelizer(str)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), list2);
                }
                return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{androidPaint_androidKtWhenMappings2.IconCompatParcelizer(str)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            case 3:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return new float[]{Float.parseFloat(str)};
                }
                float[] fArr2 = {Float.parseFloat(str)};
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArr2, 0, fArrCopyOf, length2, 1);
                return fArrCopyOf;
            case 4:
                List list3 = (List) obj;
                if (list3 != null) {
                    return onContentCardDismissed.IconCompatParcelizer((List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{Float.valueOf(Float.parseFloat(str))}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), list3);
                }
                return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{Float.valueOf(Float.parseFloat(str))}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            case 5:
                int[] iArr = (int[]) obj;
                int[] iArrSerializer = serializer(str);
                return iArr != null ? onContentCardClicked.read(iArr, iArrSerializer) : iArrSerializer;
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return RemoteActionCompatParcelizer(str);
                }
                long[] jArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
                int length3 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length3 + 1);
                System.arraycopy(jArrRemoteActionCompatParcelizer, 0, jArrCopyOf, length3, 1);
                return jArrCopyOf;
            case 7:
                List list4 = (List) obj;
                AndroidPaint_androidKtWhenMappings androidPaint_androidKtWhenMappings3 = asAndroidPathEffect.MediaSessionCompatResultReceiverWrapper;
                if (list4 != null) {
                    return onContentCardDismissed.IconCompatParcelizer((List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{androidPaint_androidKtWhenMappings3.IconCompatParcelizer(str)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), list4);
                }
                return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{androidPaint_androidKtWhenMappings3.IconCompatParcelizer(str)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                int length4 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length4 + 1);
                System.arraycopy(new String[]{str}, 0, objArrCopyOf, length4, 1);
                return (String[]) objArrCopyOf;
            default:
                List list5 = (List) obj;
                if (list5 != null) {
                    return onContentCardDismissed.IconCompatParcelizer((List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{str}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), list5);
                }
                return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{str}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
        }
    }

    @Override // o.asAndroidPathEffect
    public final void read(String str, Bundle bundle, Object obj) {
        int i = 0;
        switch (this.IconCompatParcelizer) {
            case 0:
                List list = (List) obj;
                str.getClass();
                if (list != null) {
                    bundle.putIntArray(str, onContentCardDismissed.RemoteActionCompatParcelizer((Collection) list));
                }
                break;
            case 1:
                boolean[] zArr = (boolean[]) obj;
                str.getClass();
                if (zArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putBooleanArray(str, zArr);
                }
                break;
            case 2:
                List list2 = (List) obj;
                str.getClass();
                if (list2 == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putBooleanArray(str, onContentCardDismissed.read((Collection) list2));
                }
                break;
            case 3:
                float[] fArr = (float[]) obj;
                str.getClass();
                if (fArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putFloatArray(str, fArr);
                }
                break;
            case 4:
                List list3 = (List) obj;
                str.getClass();
                if (list3 == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putFloatArray(str, onContentCardDismissed.serializer((Collection) list3));
                }
                break;
            case 5:
                int[] iArr = (int[]) obj;
                str.getClass();
                if (iArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putIntArray(str, iArr);
                }
                break;
            case 6:
                long[] jArr = (long[]) obj;
                str.getClass();
                if (jArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putLongArray(str, jArr);
                }
                break;
            case 7:
                List list4 = (List) obj;
                str.getClass();
                if (list4 == null) {
                    bundle.putString(str, null);
                } else {
                    List list5 = list4;
                    long[] jArr2 = new long[list5.size()];
                    Iterator it = list5.iterator();
                    while (it.hasNext()) {
                        jArr2[i] = ((Number) it.next()).longValue();
                        i++;
                    }
                    bundle.putLongArray(str, jArr2);
                }
                break;
            case 8:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putStringArray(str, strArr);
                }
                break;
            default:
                List list6 = (List) obj;
                str.getClass();
                if (list6 == null) {
                    bundle.putString(str, null);
                } else {
                    String[] strArr2 = (String[]) list6.toArray(new String[0]);
                    strArr2.getClass();
                    bundle.putStringArray(str, strArr2);
                }
                break;
        }
    }

    @Override // o.asAndroidPathEffect
    public final String serializer() {
        switch (this.IconCompatParcelizer) {
            case 0:
                return "List<Int>";
            case 1:
                return "boolean[]";
            case 2:
                return "List<Boolean>";
            case 3:
                return "float[]";
            case 4:
                return "List<Float>";
            case 5:
                return "integer[]";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    public static int[] serializer(String str) {
        str.getClass();
        return new int[]{((Number) asAndroidPathEffect.MediaSessionCompatQueueItem.IconCompatParcelizer(str)).intValue()};
    }

    public static long[] RemoteActionCompatParcelizer(String str) {
        str.getClass();
        return new long[]{((Number) asAndroidPathEffect.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer(str)).longValue()};
    }

    public static boolean[] write(String str) {
        str.getClass();
        return new boolean[]{((Boolean) asAndroidPathEffect.RemoteActionCompatParcelizer.IconCompatParcelizer(str)).booleanValue()};
    }

    @Override // o.asAndroidPathEffect
    public final Object IconCompatParcelizer(String str) {
        switch (this.IconCompatParcelizer) {
            case 0:
                str.getClass();
                return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{asAndroidPathEffect.MediaSessionCompatQueueItem.IconCompatParcelizer(str)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            case 1:
                return write(str);
            case 2:
                str.getClass();
                return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{asAndroidPathEffect.RemoteActionCompatParcelizer.IconCompatParcelizer(str)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            case 3:
                str.getClass();
                return new float[]{Float.parseFloat(str)};
            case 4:
                str.getClass();
                return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{Float.valueOf(Float.parseFloat(str))}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            case 5:
                return serializer(str);
            case 6:
                return RemoteActionCompatParcelizer(str);
            case 7:
                str.getClass();
                return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{asAndroidPathEffect.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer(str)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
            case 8:
                str.getClass();
                return new String[]{str};
            default:
                str.getClass();
                int iSerializer = getQueryParameterslambda2.serializer();
                return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{str}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
        }
    }
}
