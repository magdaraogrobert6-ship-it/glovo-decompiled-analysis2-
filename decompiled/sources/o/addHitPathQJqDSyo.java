package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.logic.zp;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class addHitPathQJqDSyo implements Map, Serializable {
    public static final addHitPathQJqDSyo serializer = new addHitPathQJqDSyo(0, null, new Object[0]);
    public final transient Object[] IconCompatParcelizer;
    public transient removePointerInputModifierNode MediaDescriptionCompat;
    public final transient int RatingCompat;
    public transient removeInvalidPointerIdsAndChanges RemoteActionCompatParcelizer;
    public final transient Object read;
    public transient dispatchChangesdefault write;

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final int size() {
        return this.RatingCompat;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public addHitPathQJqDSyo(int i, Object obj, Object[] objArr) {
        this.read = obj;
        this.IconCompatParcelizer = objArr;
        this.RatingCompat = i;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        removePointerInputModifierNode removepointerinputmodifiernode = this.MediaDescriptionCompat;
        if (removepointerinputmodifiernode == null) {
            removePointerInputModifierNode removepointerinputmodifiernode2 = new removePointerInputModifierNode(1, this.RatingCompat, this.IconCompatParcelizer);
            this.MediaDescriptionCompat = removepointerinputmodifiernode2;
            removepointerinputmodifiernode = removepointerinputmodifiernode2;
        }
        return removepointerinputmodifiernode.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        dispatchChangesdefault dispatchchangesdefault = this.write;
        if (dispatchchangesdefault != null) {
            return dispatchchangesdefault;
        }
        dispatchChangesdefault dispatchchangesdefault2 = new dispatchChangesdefault(this, this.IconCompatParcelizer, this.RatingCompat);
        this.write = dispatchchangesdefault2;
        return dispatchchangesdefault2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        dispatchChangesdefault dispatchchangesdefault = this.write;
        if (dispatchchangesdefault == null) {
            dispatchChangesdefault dispatchchangesdefault2 = new dispatchChangesdefault(this, this.IconCompatParcelizer, this.RatingCompat);
            this.write = dispatchchangesdefault2;
            dispatchchangesdefault = dispatchchangesdefault2;
        }
        Iterator it = dispatchchangesdefault.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final Set keySet() {
        removeInvalidPointerIdsAndChanges removeinvalidpointeridsandchanges = this.RemoteActionCompatParcelizer;
        if (removeinvalidpointeridsandchanges != null) {
            return removeinvalidpointeridsandchanges;
        }
        removeInvalidPointerIdsAndChanges removeinvalidpointeridsandchanges2 = new removeInvalidPointerIdsAndChanges(this, new removePointerInputModifierNode(0, this.RatingCompat, this.IconCompatParcelizer));
        this.RemoteActionCompatParcelizer = removeinvalidpointeridsandchanges2;
        return removeinvalidpointeridsandchanges2;
    }

    @Override // java.util.Map
    public final Collection values() {
        removePointerInputModifierNode removepointerinputmodifiernode = this.MediaDescriptionCompat;
        if (removepointerinputmodifiernode != null) {
            return removepointerinputmodifiernode;
        }
        removePointerInputModifierNode removepointerinputmodifiernode2 = new removePointerInputModifierNode(1, this.RatingCompat, this.IconCompatParcelizer);
        this.MediaDescriptionCompat = removepointerinputmodifiernode2;
        return removepointerinputmodifiernode2;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i = this.RatingCompat;
            Object[] objArr = this.IconCompatParcelizer;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.read;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length;
                    int iSerializer = displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon.serializer(obj.hashCode());
                    while (true) {
                        int i2 = iSerializer & (length - 1);
                        int i3 = bArr[i2] & 255;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                        } else {
                            iSerializer = i2 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length;
                    int iSerializer2 = displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon.serializer(obj.hashCode());
                    while (true) {
                        int i4 = iSerializer2 & (length2 - 1);
                        char c = (char) sArr[i4];
                        if (c == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                        } else {
                            iSerializer2 = i4 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length;
                    int iSerializer3 = displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon.serializer(obj.hashCode());
                    while (true) {
                        int i5 = iSerializer3 & (length3 - 1);
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iSerializer3 = i5 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0186  */
    /* JADX WARN: Code duplicated, block: B:81:0x018e  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static addHitPathQJqDSyo read(int i, Object[] objArr, zp zpVar) {
        int iHighestOneBit;
        byte[] bArr;
        short[] sArr;
        boolean z;
        ?? r8;
        Object[] objArr2;
        accessremovePointerInputModifierNode accessremovepointerinputmodifiernode;
        int i2 = i;
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return serializer;
        }
        accessremovePointerInputModifierNode accessremovepointerinputmodifiernode2 = null;
        ?? r4 = 0;
        accessremovePointerInputModifierNode accessremovepointerinputmodifiernode3 = null;
        accessremovePointerInputModifierNode accessremovepointerinputmodifiernode4 = null;
        if (i2 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new addHitPathQJqDSyo(1, null, objArrCopyOf);
        }
        RangesKt.IconCompatParcelizer(i2, objArrCopyOf.length >> 1);
        int iMax = Math.max(i2, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("collection too large");
                return null;
            }
        }
        if (i2 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            i2 = 1;
        } else {
            int i3 = iHighestOneBit - 1;
            byte b = -1;
            if (iHighestOneBit <= 128) {
                bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i4 + i4;
                    int i7 = i5 + i5;
                    Object obj = objArrCopyOf[i7];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i7 ^ 1];
                    Objects.requireNonNull(obj2);
                    int iSerializer = displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon.serializer(obj.hashCode());
                    while (true) {
                        int i8 = iSerializer & i3;
                        int i9 = bArr[i8] & 255;
                        if (i9 == 255) {
                            bArr[i8] = (byte) i6;
                            if (i4 < i5) {
                                objArrCopyOf[i6] = obj;
                                objArrCopyOf[i6 ^ 1] = obj2;
                            }
                            i4++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i9 == true ? 1 : 0])) {
                            int i10 = ~i9;
                            Object obj3 = objArrCopyOf[i10 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            accessremovePointerInputModifierNode accessremovepointerinputmodifiernode5 = new accessremovePointerInputModifierNode(obj, obj2, obj3);
                            objArrCopyOf[i10 == true ? 1 : 0] = obj2;
                            accessremovepointerinputmodifiernode3 = accessremovepointerinputmodifiernode5;
                            break;
                        }
                        iSerializer = i8 + 1;
                    }
                }
                if (i4 != i2) {
                    sArr = new Object[]{bArr, Integer.valueOf(i4), accessremovepointerinputmodifiernode3};
                }
            } else if (iHighestOneBit <= 32768) {
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i11 = 0;
                for (int i12 = 0; i12 < i2; i12++) {
                    int i13 = i11 + i11;
                    int i14 = i12 + i12;
                    Object obj4 = objArrCopyOf[i14];
                    Objects.requireNonNull(obj4);
                    Object obj5 = objArrCopyOf[i14 ^ 1];
                    Objects.requireNonNull(obj5);
                    int iSerializer2 = displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon.serializer(obj4.hashCode());
                    while (true) {
                        int i15 = iSerializer2 & i3;
                        char c = (char) sArr[i15];
                        if (c == 65535) {
                            sArr[i15] = (short) i13;
                            if (i11 < i12) {
                                objArrCopyOf[i13] = obj4;
                                objArrCopyOf[i13 ^ 1] = obj5;
                            }
                            i11++;
                            break;
                        }
                        if (obj4.equals(objArrCopyOf[c])) {
                            int i16 = c ^ 1;
                            Object obj6 = objArrCopyOf[i16 == true ? 1 : 0];
                            Objects.requireNonNull(obj6);
                            accessremovePointerInputModifierNode accessremovepointerinputmodifiernode6 = new accessremovePointerInputModifierNode(obj4, obj5, obj6);
                            objArrCopyOf[i16 == true ? 1 : 0] = obj5;
                            accessremovepointerinputmodifiernode4 = accessremovepointerinputmodifiernode6;
                            break;
                        }
                        iSerializer2 = i15 + 1;
                    }
                }
                r4 = i11 == i2 ? sArr : new Object[]{sArr, Integer.valueOf(i11), accessremovepointerinputmodifiernode4};
            } else {
                bArr = new int[iHighestOneBit];
                Arrays.fill((int[]) bArr, -1);
                int i17 = 0;
                int i18 = 0;
                while (i17 < i2) {
                    int i19 = i18 + i18;
                    int i20 = i17 + i17;
                    Object obj7 = objArrCopyOf[i20];
                    Objects.requireNonNull(obj7);
                    Object obj8 = objArrCopyOf[i20 ^ 1];
                    Objects.requireNonNull(obj8);
                    int iSerializer3 = displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon.serializer(obj7.hashCode());
                    while (true) {
                        int i21 = iSerializer3 & i3;
                        ?? r15 = bArr[i21];
                        if (r15 == b) {
                            bArr[i21] = i19;
                            if (i18 < i17) {
                                objArrCopyOf[i19] = obj7;
                                objArrCopyOf[i19 ^ 1] = obj8;
                            }
                            i18++;
                            break;
                        }
                        if (obj7.equals(objArrCopyOf[r15])) {
                            int i22 = r15 ^ 1;
                            Object obj9 = objArrCopyOf[i22 == true ? 1 : 0];
                            Objects.requireNonNull(obj9);
                            accessremovePointerInputModifierNode accessremovepointerinputmodifiernode7 = new accessremovePointerInputModifierNode(obj7, obj8, obj9);
                            objArrCopyOf[i22 == true ? 1 : 0] = obj8;
                            accessremovepointerinputmodifiernode2 = accessremovepointerinputmodifiernode7;
                            break;
                        }
                        iSerializer3 = i21 + 1;
                        b = -1;
                    }
                    i17++;
                    b = -1;
                }
                if (i18 != i2) {
                    bArr = new Object[]{bArr, Integer.valueOf(i18), accessremovepointerinputmodifiernode2};
                }
            }
            z = bArr instanceof Object[];
            r8 = bArr;
            if (z) {
                objArr2 = (Object[]) bArr;
                accessremovepointerinputmodifiernode = (accessremovePointerInputModifierNode) objArr2[2];
                if (zpVar != null) {
                    zpVar.IconCompatParcelizer = accessremovepointerinputmodifiernode;
                    Object obj10 = objArr2[0];
                    int iIntValue = ((Integer) objArr2[1]).intValue();
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                    r8 = obj10;
                    i2 = iIntValue;
                } else {
                    throw accessremovepointerinputmodifiernode.write();
                }
            }
            return new addHitPathQJqDSyo(i2, r8, objArrCopyOf);
        }
        bArr = r4;
        z = bArr instanceof Object[];
        r8 = bArr;
        if (z) {
            objArr2 = (Object[]) bArr;
            accessremovepointerinputmodifiernode = (accessremovePointerInputModifierNode) objArr2[2];
            if (zpVar != null) {
                zpVar.IconCompatParcelizer = accessremovepointerinputmodifiernode;
                Object obj11 = objArr2[0];
                int iIntValue2 = ((Integer) objArr2[1]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
                r8 = obj11;
                i2 = iIntValue2;
            } else {
                throw accessremovepointerinputmodifiernode.write();
            }
        }
        return new addHitPathQJqDSyo(i2, r8, objArrCopyOf);
    }

    public final String toString() {
        int i = this.RatingCompat;
        if (i < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "size cannot be negative but was: "));
            return null;
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : (dispatchChangesdefault) entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
