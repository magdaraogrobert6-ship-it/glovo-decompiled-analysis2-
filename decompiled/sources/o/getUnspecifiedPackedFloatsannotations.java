package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class getUnspecifiedPackedFloatsannotations {
    public static final getUnspecifiedPackedFloatsannotations RemoteActionCompatParcelizer = new getUnspecifiedPackedFloatsannotations(0, new int[0], new Object[0], false);
    public boolean IconCompatParcelizer;
    public int[] RatingCompat;
    public Object[] read;
    public int serializer;
    public int write = -1;

    public getUnspecifiedPackedFloatsannotations(int i, int[] iArr, Object[] objArr, boolean z) {
        this.serializer = i;
        this.RatingCompat = iArr;
        this.read = objArr;
        this.IconCompatParcelizer = z;
    }

    public static getUnspecifiedPackedFloatsannotations RemoteActionCompatParcelizer() {
        return new getUnspecifiedPackedFloatsannotations(0, new int[8], new Object[8], true);
    }

    public final void RemoteActionCompatParcelizer(int i, Object obj) {
        if (!this.IconCompatParcelizer) {
            getAlignmentLinesMap.write();
            return;
        }
        int i2 = this.serializer;
        int[] iArr = this.RatingCompat;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.RatingCompat = Arrays.copyOf(iArr, i3);
            this.read = Arrays.copyOf(this.read, i3);
        }
        int[] iArr2 = this.RatingCompat;
        int i4 = this.serializer;
        iArr2[i4] = i;
        this.read[i4] = obj;
        this.serializer = i4 + 1;
    }

    public final void serializer(copyOHQCggkdefault copyohqcggkdefault) {
        if (this.serializer == 0) {
            return;
        }
        copyohqcggkdefault.getClass();
        getMaxDimension getmaxdimension = getMaxDimension.ASCENDING;
        for (int i = 0; i < this.serializer; i++) {
            int i2 = this.RatingCompat[i];
            Object obj = this.read[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                copyohqcggkdefault.RemoteActionCompatParcelizer(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                copyohqcggkdefault.IconCompatParcelizer(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                copyohqcggkdefault.read(i3, (moveFocusInChildren3ESFkO8) obj);
            } else if (i4 == 3) {
                RequestChildFocusKt requestChildFocusKt = (RequestChildFocusKt) copyohqcggkdefault.read;
                getMaxDimension getmaxdimension2 = getMaxDimension.ASCENDING;
                requestChildFocusKt.RemoteActionCompatParcelizer(i3, 3);
                ((getUnspecifiedPackedFloatsannotations) obj).serializer(copyohqcggkdefault);
                requestChildFocusKt.RemoteActionCompatParcelizer(i3, 4);
            } else {
                if (i4 != 5) {
                    DrawableTransformation.read((Throwable) androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.RemoteActionCompatParcelizer());
                    return;
                }
                copyohqcggkdefault.IconCompatParcelizer(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final int hashCode() {
        int i = this.serializer;
        int[] iArr = this.RatingCompat;
        int iHashCode = 17;
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        Object[] objArr = this.read;
        int i4 = this.serializer;
        for (int i5 = 0; i5 < i4; i5++) {
            iHashCode = (iHashCode * 31) + objArr[i5].hashCode();
        }
        return ((((i + 527) * 31) + i2) * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof getUnspecifiedPackedFloatsannotations)) {
            return false;
        }
        getUnspecifiedPackedFloatsannotations getunspecifiedpackedfloatsannotations = (getUnspecifiedPackedFloatsannotations) obj;
        int i = this.serializer;
        if (i == getunspecifiedpackedfloatsannotations.serializer) {
            int[] iArr = this.RatingCompat;
            int[] iArr2 = getunspecifiedpackedfloatsannotations.RatingCompat;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.read;
            Object[] objArr2 = getunspecifiedpackedfloatsannotations.read;
            int i3 = this.serializer;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int serializer() {
        int iSerializer;
        int iIconCompatParcelizer;
        int iIconCompatParcelizer2;
        int i = this.write;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.serializer; i3++) {
            int i4 = this.RatingCompat[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.read[i3]).getClass();
                    iIconCompatParcelizer2 = RequestChildFocusKt.IconCompatParcelizer(i5);
                } else if (i6 == 2) {
                    iIconCompatParcelizer2 = RequestChildFocusKt.write(i5, (moveFocusInChildren3ESFkO8) this.read[i3]);
                } else if (i6 == 3) {
                    iSerializer = RequestChildFocusKt.serializer(i5) * 2;
                    iIconCompatParcelizer = ((getUnspecifiedPackedFloatsannotations) this.read[i3]).serializer();
                } else {
                    if (i6 != 5) {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.RemoteActionCompatParcelizer());
                        return 0;
                    }
                    ((Integer) this.read[i3]).getClass();
                    iIconCompatParcelizer2 = RequestChildFocusKt.read(i5);
                }
                i2 = iIconCompatParcelizer2 + i2;
            } else {
                long jLongValue = ((Long) this.read[i3]).longValue();
                iSerializer = RequestChildFocusKt.serializer(i5);
                iIconCompatParcelizer = RequestChildFocusKt.IconCompatParcelizer(jLongValue);
            }
            i2 = iIconCompatParcelizer + iSerializer + i2;
        }
        this.write = i2;
        return i2;
    }
}
