package com.google.flatbuffers;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import o.accessnoLocalProvidedFor;
import o.getLocalContext;
import o.getLocalImageVectorCache;
import o.getLocalLifecycleOwner;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Table {
    private int IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    public ByteBuffer read;
    public int serializer;
    getLocalContext write;

    public ByteBuffer getByteBuffer() {
        return this.read;
    }

    public int keysCompare(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    public void sortTables(int[] iArr, ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        Arrays.sort(numArr, new accessnoLocalProvidedFor(this, byteBuffer));
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
    }

    public int __indirect(int i) {
        return this.read.getInt(i) + i;
    }

    public Table() {
        if (getLocalContext.RemoteActionCompatParcelizer == null) {
            getLocalContext.RemoteActionCompatParcelizer = new getLocalLifecycleOwner();
        }
        this.write = getLocalContext.RemoteActionCompatParcelizer;
    }

    public int __vector(int i) {
        int i2 = i + this.serializer;
        return this.read.getInt(i2) + i2 + 4;
    }

    public int __vector_len(int i) {
        int i2 = i + this.serializer;
        return this.read.getInt(this.read.getInt(i2) + i2);
    }

    public static Table __union(Table table, int i, ByteBuffer byteBuffer) {
        table.__reset(__indirect(i, byteBuffer), byteBuffer);
        return table;
    }

    public void __reset(int i, ByteBuffer byteBuffer) {
        this.read = byteBuffer;
        if (byteBuffer == null) {
            this.serializer = 0;
            this.RemoteActionCompatParcelizer = 0;
            this.IconCompatParcelizer = 0;
        } else {
            this.serializer = i;
            int i2 = i - byteBuffer.getInt(i);
            this.RemoteActionCompatParcelizer = i2;
            this.IconCompatParcelizer = this.read.getShort(i2);
        }
    }

    public static String __string(int i, ByteBuffer byteBuffer, getLocalContext getlocalcontext) {
        int i2 = byteBuffer.getInt(i) + i;
        int i3 = byteBuffer.getInt(i2);
        int i4 = i2 + 4;
        ((getLocalLifecycleOwner) getlocalcontext).getClass();
        if (!byteBuffer.hasArray()) {
            if ((((byteBuffer.limit() - i4) - i3) | i4 | i3) < 0) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i4), Integer.valueOf(i3)});
                return null;
            }
            int i5 = i4 + i3;
            char[] cArr = new char[i3];
            int i6 = 0;
            while (i4 < i5) {
                byte b = byteBuffer.get(i4);
                if (b < 0) {
                    break;
                }
                i4++;
                cArr[i6] = (char) b;
                i6++;
            }
            int i7 = i6;
            while (i4 < i5) {
                int i8 = i4 + 1;
                byte b2 = byteBuffer.get(i4);
                if (b2 >= 0) {
                    cArr[i7] = (char) b2;
                    i7++;
                    i4 = i8;
                    while (i4 < i5) {
                        byte b3 = byteBuffer.get(i4);
                        if (b3 < 0) {
                            break;
                        }
                        i4++;
                        cArr[i7] = (char) b3;
                        i7++;
                    }
                } else if (b2 < -32) {
                    if (i8 >= i5) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid UTF-8");
                        return null;
                    }
                    i4 += 2;
                    getLocalImageVectorCache.serializer(b2, byteBuffer.get(i8), cArr, i7);
                    i7++;
                } else if (b2 < -16) {
                    if (i8 >= i5 - 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid UTF-8");
                        return null;
                    }
                    getLocalImageVectorCache.IconCompatParcelizer(b2, byteBuffer.get(i8), byteBuffer.get(i4 + 2), cArr, i7);
                    i7++;
                    i4 += 3;
                } else {
                    if (i8 >= i5 - 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid UTF-8");
                        return null;
                    }
                    getLocalImageVectorCache.write(b2, byteBuffer.get(i8), byteBuffer.get(i4 + 2), byteBuffer.get(i4 + 3), cArr, i7);
                    i7 += 2;
                    i4 += 4;
                }
            }
            return new String(cArr, 0, i7);
        }
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset() + i4;
        if ((((bArrArray.length - iArrayOffset) - i3) | iArrayOffset | i3) < 0) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArrArray.length), Integer.valueOf(iArrayOffset), Integer.valueOf(i3)});
            return null;
        }
        int i9 = iArrayOffset + i3;
        char[] cArr2 = new char[i3];
        int i10 = 0;
        while (iArrayOffset < i9) {
            byte b4 = bArrArray[iArrayOffset];
            if (b4 < 0) {
                break;
            }
            iArrayOffset++;
            cArr2[i10] = (char) b4;
            i10++;
        }
        int i11 = i10;
        while (iArrayOffset < i9) {
            int i12 = iArrayOffset + 1;
            byte b5 = bArrArray[iArrayOffset];
            if (b5 >= 0) {
                cArr2[i11] = (char) b5;
                i11++;
                iArrayOffset = i12;
                while (iArrayOffset < i9) {
                    byte b6 = bArrArray[iArrayOffset];
                    if (b6 < 0) {
                        break;
                    }
                    iArrayOffset++;
                    cArr2[i11] = (char) b6;
                    i11++;
                }
            } else if (b5 < -32) {
                if (i12 >= i9) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid UTF-8");
                    return null;
                }
                iArrayOffset += 2;
                getLocalImageVectorCache.serializer(b5, bArrArray[i12], cArr2, i11);
                i11++;
            } else if (b5 < -16) {
                if (i12 >= i9 - 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid UTF-8");
                    return null;
                }
                getLocalImageVectorCache.IconCompatParcelizer(b5, bArrArray[i12], bArrArray[iArrayOffset + 2], cArr2, i11);
                i11++;
                iArrayOffset += 3;
            } else {
                if (i12 >= i9 - 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid UTF-8");
                    return null;
                }
                getLocalImageVectorCache.write(b5, bArrArray[i12], bArrArray[iArrayOffset + 2], bArrArray[iArrayOffset + 3], cArr2, i11);
                i11 += 2;
                iArrayOffset += 4;
            }
        }
        return new String(cArr2, 0, i11);
    }

    public static int compareStrings(int i, int i2, ByteBuffer byteBuffer) {
        int i3 = byteBuffer.getInt(i) + i;
        int i4 = byteBuffer.getInt(i2) + i2;
        int i5 = byteBuffer.getInt(i3);
        int i6 = byteBuffer.getInt(i4);
        int iMin = Math.min(i5, i6);
        for (int i7 = 0; i7 < iMin; i7++) {
            int i8 = i3 + 4 + i7;
            int i9 = i4 + 4 + i7;
            if (byteBuffer.get(i8) != byteBuffer.get(i9)) {
                return byteBuffer.get(i8) - byteBuffer.get(i9);
            }
        }
        return i5 - i6;
    }

    public static int __offset(int i, int i2, ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity() - i2;
        return byteBuffer.getShort((i + iCapacity) - byteBuffer.getInt(iCapacity)) + iCapacity;
    }

    public static int __indirect(int i, ByteBuffer byteBuffer) {
        return byteBuffer.getInt(i) + i;
    }

    public Table __union(Table table, int i) {
        return __union(table, i, this.read);
    }

    public ByteBuffer __vector_as_bytebuffer(int i, int i2) {
        int i__offset = __offset(i);
        if (i__offset == 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = this.read.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int i__vector = __vector(i__offset);
        byteBufferOrder.position(i__vector);
        byteBufferOrder.limit((__vector_len(i__offset) * i2) + i__vector);
        return byteBufferOrder;
    }

    public ByteBuffer __vector_in_bytebuffer(ByteBuffer byteBuffer, int i, int i2) {
        int i__offset = __offset(i);
        if (i__offset == 0) {
            return null;
        }
        int i__vector = __vector(i__offset);
        byteBuffer.rewind();
        byteBuffer.limit((__vector_len(i__offset) * i2) + i__vector);
        byteBuffer.position(i__vector);
        return byteBuffer;
    }

    public static boolean __has_identifier(ByteBuffer byteBuffer, String str) {
        if (str.length() != 4) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "FlatBuffers: file identifier must be length 4");
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (str.charAt(i) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i))) {
                return false;
            }
        }
        return true;
    }

    public int __offset(int i) {
        if (i < this.IconCompatParcelizer) {
            return this.read.getShort(this.RemoteActionCompatParcelizer + i);
        }
        return 0;
    }

    public void __reset() {
        __reset(0, null);
    }

    public static int compareStrings(int i, byte[] bArr, ByteBuffer byteBuffer) {
        int i2 = byteBuffer.getInt(i) + i;
        int i3 = byteBuffer.getInt(i2);
        int length = bArr.length;
        int iMin = Math.min(i3, length);
        for (int i4 = 0; i4 < iMin; i4++) {
            int i5 = i2 + 4 + i4;
            if (byteBuffer.get(i5) != bArr[i4]) {
                return byteBuffer.get(i5) - bArr[i4];
            }
        }
        return i3 - length;
    }

    public String __string(int i) {
        return __string(i, this.read, this.write);
    }
}
