package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class onContentCardClicked extends coil3.util.IntPair {
    public static void serializer(int[] iArr, int i) {
        int length = iArr.length;
        iArr.getClass();
        Arrays.fill(iArr, 0, length, i);
    }

    public static ensureSubscribedToInAppMessageEventslambda7 RemoteActionCompatParcelizer(int[] iArr) {
        return new ensureSubscribedToInAppMessageEventslambda7(0, iArr.length - 1, 1);
    }

    public static resumeWebviewIfNecessarylambda0 IconCompatParcelizer(Object[] objArr) {
        objArr.getClass();
        return objArr.length == 0 ? requestDisplayInAppMessagelambda8.IconCompatParcelizer : new verifyOrientationStatuslambda2(1, objArr);
    }

    public static Double[] IconCompatParcelizer(double[] dArr) {
        dArr.getClass();
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    public static int MediaBrowserCompatMediaItem(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static Set MediaSessionCompatQueueItem(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return ItemTouchHelperAdapter.serializer;
        }
        if (length == 1) {
            return RangesKt.write(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(onMove.RemoteActionCompatParcelizer(objArr.length));
        read(objArr, (AbstractSet) linkedHashSet);
        return linkedHashSet;
    }

    public static byte[] RemoteActionCompatParcelizer(byte[] bArr, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7) {
        bArr.getClass();
        ensuresubscribedtoinappmessageeventslambda7.getClass();
        return ensuresubscribedtoinappmessageeventslambda7.write() ? new byte[0] : IconCompatParcelizer(bArr, ensuresubscribedtoinappmessageeventslambda7.write, ensuresubscribedtoinappmessageeventslambda7.read + 1);
    }

    public static List read(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return instance_delegatelambda0.write;
        }
        if (length == 1) {
            return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{Integer.valueOf(iArr[0])}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static List read(Object[] objArr) {
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static final void read(Object[] objArr, AbstractSet abstractSet) {
        objArr.getClass();
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    public static boolean read(byte[] bArr, byte b) {
        bArr.getClass();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (b == bArr[i]) {
                if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Object serializer(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        DrawableTransformation.write("Array is empty.");
        return null;
    }

    public static byte[] serializer(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        return bArrCopyOf;
    }

    public static int write(Object[] objArr, Object obj) {
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public static Object write(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static void write(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void write(int i, int i2, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static Object[] write(int i, int i2, Object[] objArr) {
        objArr.getClass();
        coil3.util.IntPair.write(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public static String serializer(Object[] objArr, String str, String str2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        String str3 = (i & 1) != 0 ? ", " : str;
        String str4 = "";
        String str5 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) == 0) {
            str4 = ")";
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (i & 32) != 0 ? null : r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        objArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str5);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str3);
            }
            DelayKt.write(-1980350160, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), 1980350160, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{sb, obj, r8lambdaunavo3sxub_pc9xroryotnrlvsm2});
        }
        sb.append((CharSequence) str4);
        return sb.toString();
    }

    public static Object IconCompatParcelizer(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static ArrayList RemoteActionCompatParcelizer(Object[] objArr) {
        objArr.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int read(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int RemoteActionCompatParcelizer(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static List read(int i, Object[] objArr) {
        objArr.getClass();
        if (i < 0) {
            DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(i, "Requested element count ", " is less than zero."));
            return null;
        }
        int length = objArr.length - i;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(length, "Requested element count ", " is less than zero."));
            return null;
        }
        if (length == 0) {
            return instance_delegatelambda0.write;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return RatingCompat(objArr);
        }
        if (length != 1) {
            List listAsList = Arrays.asList(write(length2 - length, length2, objArr));
            listAsList.getClass();
            return listAsList;
        }
        Object[] objArr2 = {objArr[length2 - 1]};
        int iSerializer = getQueryParameterslambda2.serializer();
        return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr2, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
    }

    public static boolean RemoteActionCompatParcelizer(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!RemoteActionCompatParcelizer((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof ContentCardAdapterCardListDiffCallback) && (obj2 instanceof ContentCardAdapterCardListDiffCallback)) {
                            if (!UArraysKt.read(((ContentCardAdapterCardListDiffCallback) obj).serializer, ((ContentCardAdapterCardListDiffCallback) obj2).serializer)) {
                            }
                        } else if ((obj instanceof DefaultContentCardsUpdateHandlerCompanion) && (obj2 instanceof DefaultContentCardsUpdateHandlerCompanion)) {
                            if (!UArraysKt.write(((DefaultContentCardsUpdateHandlerCompanion) obj).RemoteActionCompatParcelizer, ((DefaultContentCardsUpdateHandlerCompanion) obj2).RemoteActionCompatParcelizer)) {
                            }
                        } else if ((obj instanceof ContentCardAdapterExternalSyntheticLambda6) && (obj2 instanceof ContentCardAdapterExternalSyntheticLambda6)) {
                            if (!UArraysKt.RemoteActionCompatParcelizer(((ContentCardAdapterExternalSyntheticLambda6) obj).write, ((ContentCardAdapterExternalSyntheticLambda6) obj2).write)) {
                            }
                        } else if ((obj instanceof EmptyContentCardsAdapter) && (obj2 instanceof EmptyContentCardsAdapter)) {
                            if (!UArraysKt.RemoteActionCompatParcelizer(((EmptyContentCardsAdapter) obj).write, ((EmptyContentCardsAdapter) obj2).write)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static /* synthetic */ void IconCompatParcelizer(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        write(0, i, i2, objArr, objArr2);
    }

    public static void IconCompatParcelizer(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static void write(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void IconCompatParcelizer(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void IconCompatParcelizer(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void write(float[] fArr, float[] fArr2, int i, int i2, int i3) {
        fArr.getClass();
        fArr2.getClass();
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
    }

    public static /* synthetic */ void IconCompatParcelizer(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        write(bArr, 0, bArr2, i, i2);
    }

    public static byte[] IconCompatParcelizer(byte[] bArr, int i, int i2) {
        bArr.getClass();
        coil3.util.IntPair.write(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    public static /* synthetic */ void read(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        IconCompatParcelizer(iArr, i, iArr2, 0, i2);
    }

    public static int[] read(int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        return iArrCopyOf;
    }

    public static boolean IconCompatParcelizer(Object[] objArr, Object obj) {
        objArr.getClass();
        return read(objArr, obj) >= 0;
    }

    public static boolean write(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                if (i2 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean RemoteActionCompatParcelizer(char[] cArr, char c) {
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (c == cArr[i]) {
                if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List RatingCompat(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return instance_delegatelambda0.write;
        }
        if (length != 1) {
            List listAsList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
            listAsList.getClass();
            return listAsList;
        }
        Object[] objArr2 = {objArr[0]};
        int iSerializer = getQueryParameterslambda2.serializer();
        return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr2, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
    }

    public static List write(float[] fArr) {
        fArr.getClass();
        int length = fArr.length;
        if (length == 0) {
            return instance_delegatelambda0.write;
        }
        if (length != 1) {
            ArrayList arrayList = new ArrayList(fArr.length);
            for (float f : fArr) {
                arrayList.add(Float.valueOf(f));
            }
            return arrayList;
        }
        return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{Float.valueOf(fArr[0])}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
    }

    public static String IconCompatParcelizer(byte[] bArr, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        bArr.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                sb.append((CharSequence) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Byte.valueOf(b)));
            } else {
                sb.append((CharSequence) String.valueOf((int) b));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }
}
