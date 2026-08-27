package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.EOFException;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ApiErrorV3Companion {
    public static final long[] read;
    public static final byte[] serializer;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(ensureSubscribedToInAppMessageEvents.write);
        bytes.getClass();
        serializer = bytes;
        read = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final boolean RemoteActionCompatParcelizer(SVGParseException sVGParseException, int i, byte[] bArr, int i2, int i3) {
        int i4 = sVGParseException.limit;
        byte[] bArr2 = sVGParseException.data;
        while (i2 < i3) {
            if (i == i4) {
                sVGParseException = sVGParseException.next;
                sVGParseException.getClass();
                byte[] bArr3 = sVGParseException.data;
                bArr2 = bArr3;
                i = sVGParseException.pos;
                i4 = sVGParseException.limit;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x009e A[LOOP:0: B:8:0x001c->B:51:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x009d A[SYNTHETIC] */
    public static final int RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, Options options, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        options.getClass();
        SVGParseException sVGParseException = registryMissingComponentException.head;
        if (sVGParseException == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = sVGParseException.data;
        int i5 = sVGParseException.pos;
        int i6 = sVGParseException.limit;
        int[] iArr = options.RemoteActionCompatParcelizer;
        SVGParseException sVGParseException2 = sVGParseException;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = iArr[i8];
            int i10 = i8 + 2;
            int i11 = iArr[i8 + 1];
            if (i11 != -1) {
                i7 = i11;
            }
            if (sVGParseException2 == null) {
                break;
            }
            if (i9 >= 0) {
                int i12 = i5 + 1;
                byte b = bArr[i5];
                for (int i13 = i10; i13 != i10 + i9; i13++) {
                    if ((b & 255) == iArr[i13]) {
                        i = iArr[i13 + i9];
                        if (i12 == i6) {
                            sVGParseException2 = sVGParseException2.next;
                            sVGParseException2.getClass();
                            int i14 = sVGParseException2.pos;
                            byte[] bArr2 = sVGParseException2.data;
                            i2 = sVGParseException2.limit;
                            if (sVGParseException2 == sVGParseException) {
                                sVGParseException2 = null;
                            }
                            i3 = i14;
                            bArr = bArr2;
                        } else {
                            i2 = i6;
                            i3 = i12;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        i8 = -i;
                        i5 = i3;
                        i6 = i2;
                    }
                }
                return i7;
            }
            int i15 = i10;
            while (true) {
                int i16 = i5 + 1;
                int i17 = i15 + 1;
                if ((bArr[i5] & 255) == iArr[i15]) {
                    boolean z2 = i17 == (i9 * (-1)) + i10;
                    if (i16 == i6) {
                        sVGParseException2.getClass();
                        SVGParseException sVGParseException3 = sVGParseException2.next;
                        sVGParseException3.getClass();
                        i3 = sVGParseException3.pos;
                        byte[] bArr3 = sVGParseException3.data;
                        i4 = sVGParseException3.limit;
                        if (sVGParseException3 != sVGParseException) {
                            sVGParseException2 = sVGParseException3;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            sVGParseException2 = null;
                        }
                    } else {
                        i4 = i6;
                        i3 = i16;
                    }
                    if (z2) {
                        i = iArr[i17];
                        i2 = i4;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    i15 = i17;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            i8 = -i;
            i5 = i3;
            i6 = i2;
        }
        if (z) {
            return -2;
        }
        return i7;
    }

    public static final long write(RegistryMissingComponentException registryMissingComponentException, RequestBuilder requestBuilder, long j, long j2, int i) {
        SVGParseException sVGParseException;
        long j3 = j;
        long j4 = j2;
        requestBuilder.getClass();
        long j5 = i;
        setOptionalTextView.RemoteActionCompatParcelizer(requestBuilder.serializer(), 0L, j5);
        if (i <= 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("byteCount == 0");
            return 0L;
        }
        if (j3 < 0) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j3, "fromIndex < 0: "));
            return 0L;
        }
        if (j3 <= j4) {
            long j6 = registryMissingComponentException.size;
            if (j4 > j6) {
                j4 = j6;
            }
            if (j3 == j4 || (sVGParseException = registryMissingComponentException.head) == null) {
                return -1L;
            }
            if (j6 - j3 < j3) {
                while (j6 > j3) {
                    sVGParseException = sVGParseException.prev;
                    sVGParseException.getClass();
                    j6 -= (long) (sVGParseException.limit - sVGParseException.pos);
                }
                byte[] bArrRemoteActionCompatParcelizer = requestBuilder.RemoteActionCompatParcelizer();
                byte b = bArrRemoteActionCompatParcelizer[0];
                long jMin = Math.min(j4, (registryMissingComponentException.size - j5) + 1);
                while (j6 < jMin) {
                    byte[] bArr = sVGParseException.data;
                    int iMin = (int) Math.min(sVGParseException.limit, (((long) sVGParseException.pos) + jMin) - j6);
                    for (int i2 = (int) ((((long) sVGParseException.pos) + j3) - j6); i2 < iMin; i2++) {
                        if (bArr[i2] == b && RemoteActionCompatParcelizer(sVGParseException, i2 + 1, bArrRemoteActionCompatParcelizer, 1, i)) {
                            return ((long) (i2 - sVGParseException.pos)) + j6;
                        }
                    }
                    j6 += (long) (sVGParseException.limit - sVGParseException.pos);
                    sVGParseException = sVGParseException.next;
                    sVGParseException.getClass();
                    j3 = j6;
                }
                return -1L;
            }
            long j7 = 0;
            while (true) {
                long j8 = ((long) (sVGParseException.limit - sVGParseException.pos)) + j7;
                if (j8 > j3) {
                    break;
                }
                sVGParseException = sVGParseException.next;
                sVGParseException.getClass();
                j7 = j8;
            }
            byte[] bArrRemoteActionCompatParcelizer2 = requestBuilder.RemoteActionCompatParcelizer();
            byte b2 = bArrRemoteActionCompatParcelizer2[0];
            long jMin2 = Math.min(j4, (registryMissingComponentException.size - j5) + 1);
            while (j7 < jMin2) {
                byte[] bArr2 = sVGParseException.data;
                int iMin2 = (int) Math.min(sVGParseException.limit, (((long) sVGParseException.pos) + jMin2) - j7);
                for (int i3 = (int) ((((long) sVGParseException.pos) + j3) - j7); i3 < iMin2; i3++) {
                    if (bArr2[i3] == b2 && RemoteActionCompatParcelizer(sVGParseException, i3 + 1, bArrRemoteActionCompatParcelizer2, 1, i)) {
                        return ((long) (i3 - sVGParseException.pos)) + j7;
                    }
                }
                j7 += (long) (sVGParseException.limit - sVGParseException.pos);
                sVGParseException = sVGParseException.next;
                sVGParseException.getClass();
                j3 = j7;
            }
            return -1L;
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j3, "fromIndex > toIndex: ", " > ");
        sbM.append(j4);
        throw new IllegalArgumentException(sbM.toString().toString());
    }

    public static final String RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (registryMissingComponentException.IconCompatParcelizer(j2) == 13) {
                String str = registryMissingComponentException.read(j2, ensureSubscribedToInAppMessageEvents.write);
                registryMissingComponentException.RatingCompat(2L);
                return str;
            }
        }
        String str2 = registryMissingComponentException.read(j, ensureSubscribedToInAppMessageEvents.write);
        registryMissingComponentException.RatingCompat(1L);
        return str2;
    }
}
