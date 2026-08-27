package o;

import bo.app.af$$ExternalSyntheticOutline0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class getWidthannotations {
    public final byte[] IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int serializer;
    public final long write;

    public static getWidthannotations write(String str) {
        byte[] bytes = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(takeOrElse3MmeM6k.serializer);
        return new getWidthannotations(bytes, 2, bytes.length);
    }

    public getWidthannotations(long j, byte[] bArr, int i, int i2) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.write = j;
        this.IconCompatParcelizer = bArr;
    }

    public static getWidthannotations RemoteActionCompatParcelizer(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[takeOrElse3MmeM6k.r8lambda54BeH8ZsBru0CXI2CCSP2syNys[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i : iArr) {
            byteBufferWrap.putShort((short) i);
        }
        return new getWidthannotations(byteBufferWrap.array(), 3, iArr.length);
    }

    public static getWidthannotations read(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[takeOrElse3MmeM6k.r8lambda54BeH8ZsBru0CXI2CCSP2syNys[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j : jArr) {
            byteBufferWrap.putInt((int) j);
        }
        return new getWidthannotations(byteBufferWrap.array(), 4, jArr.length);
    }

    public static getWidthannotations write(isEmptyannotations[] isemptyannotationsArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[takeOrElse3MmeM6k.r8lambda54BeH8ZsBru0CXI2CCSP2syNys[5] * isemptyannotationsArr.length]);
        byteBufferWrap.order(byteOrder);
        for (isEmptyannotations isemptyannotations : isemptyannotationsArr) {
            byteBufferWrap.putInt((int) isemptyannotations.write);
            byteBufferWrap.putInt((int) isemptyannotations.serializer);
        }
        return new getWidthannotations(byteBufferWrap.array(), 5, isemptyannotationsArr.length);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(takeOrElse3MmeM6k.ResultReceiver[this.serializer]);
        sb.append(", data length:");
        return af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.length, ")", sb);
    }

    public final int IconCompatParcelizer(ByteOrder byteOrder) {
        Object objWrite = write(byteOrder);
        if (objWrite == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objWrite instanceof String) {
            return Integer.parseInt((String) objWrite);
        }
        if (objWrite instanceof long[]) {
            long[] jArr = (long[]) objWrite;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objWrite instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objWrite;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final double RemoteActionCompatParcelizer(ByteOrder byteOrder) {
        Object objWrite = write(byteOrder);
        if (objWrite == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objWrite instanceof String) {
            return Double.parseDouble((String) objWrite);
        }
        if (objWrite instanceof long[]) {
            long[] jArr = (long[]) objWrite;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objWrite instanceof int[]) {
            int[] iArr = (int[]) objWrite;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objWrite instanceof double[]) {
            double[] dArr = (double[]) objWrite;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objWrite instanceof isEmptyannotations[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        isEmptyannotations[] isemptyannotationsArr = (isEmptyannotations[]) objWrite;
        if (isemptyannotationsArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        isEmptyannotations isemptyannotations = isemptyannotationsArr[0];
        return isemptyannotations.write / isemptyannotations.serializer;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x011d: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:85:0x011d */
    /* JADX WARN: Type inference failed for: r14v25, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [long[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [o.isEmptyannotations[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [o.isEmptyannotations[]] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v32, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v33, types: [double[]] */
    public final Serializable write(ByteOrder byteOrder) throws Throwable {
        getSizeNHjbRcannotations getsizenhjbrcannotations;
        InputStream inputStream;
        String str;
        byte b;
        ?? r14;
        byte[] bArr = this.IconCompatParcelizer;
        InputStream inputStream2 = null;
        try {
            try {
                getsizenhjbrcannotations = new getSizeNHjbRcannotations(bArr);
                try {
                    getsizenhjbrcannotations.IconCompatParcelizer = byteOrder;
                    int i = this.serializer;
                    int i2 = this.RemoteActionCompatParcelizer;
                    int length = 0;
                    switch (i) {
                        case 1:
                        case 6:
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str = new String(bArr, takeOrElse3MmeM6k.serializer);
                                try {
                                    getsizenhjbrcannotations.close();
                                    return str;
                                } catch (IOException e) {
                                    SentryLogcatAdapter.read("ExifInterface", "IOException occurred while closing InputStream", e);
                                    return str;
                                }
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                getsizenhjbrcannotations.close();
                                return str2;
                            } catch (IOException e2) {
                                SentryLogcatAdapter.read("ExifInterface", "IOException occurred while closing InputStream", e2);
                                return str2;
                            }
                        case 2:
                        case 7:
                            if (i2 >= takeOrElse3MmeM6k.MediaMetadataCompat.length) {
                                int i3 = 0;
                                while (true) {
                                    byte[] bArr2 = takeOrElse3MmeM6k.MediaMetadataCompat;
                                    if (i3 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i3] == bArr2[i3]) {
                                        i3++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < i2) {
                                byte b2 = bArr[length];
                                if (b2 == 0) {
                                    str = sb.toString();
                                    getsizenhjbrcannotations.close();
                                    return str;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            str = sb.toString();
                            getsizenhjbrcannotations.close();
                            return str;
                        case 3:
                            r14 = new int[i2];
                            while (length < i2) {
                                r14[length] = getsizenhjbrcannotations.readUnsignedShort();
                                length++;
                            }
                            try {
                                getsizenhjbrcannotations.close();
                                return r14;
                            } catch (IOException e3) {
                                SentryLogcatAdapter.read("ExifInterface", "IOException occurred while closing InputStream", e3);
                                return r14;
                            }
                        case 4:
                            r14 = new long[i2];
                            while (length < i2) {
                                r14[length] = ((long) getsizenhjbrcannotations.readInt()) & 4294967295L;
                                length++;
                            }
                            getsizenhjbrcannotations.close();
                            return r14;
                        case 5:
                            r14 = new isEmptyannotations[i2];
                            while (length < i2) {
                                r14[length] = new isEmptyannotations(((long) getsizenhjbrcannotations.readInt()) & 4294967295L, ((long) getsizenhjbrcannotations.readInt()) & 4294967295L);
                                length++;
                            }
                            getsizenhjbrcannotations.close();
                            return r14;
                        case 8:
                            r14 = new int[i2];
                            while (length < i2) {
                                r14[length] = getsizenhjbrcannotations.readShort();
                                length++;
                            }
                            getsizenhjbrcannotations.close();
                            return r14;
                        case 9:
                            r14 = new int[i2];
                            while (length < i2) {
                                r14[length] = getsizenhjbrcannotations.readInt();
                                length++;
                            }
                            getsizenhjbrcannotations.close();
                            return r14;
                        case 10:
                            r14 = new isEmptyannotations[i2];
                            while (length < i2) {
                                r14[length] = new isEmptyannotations(getsizenhjbrcannotations.readInt(), getsizenhjbrcannotations.readInt());
                                length++;
                            }
                            getsizenhjbrcannotations.close();
                            return r14;
                        case 11:
                            r14 = new double[i2];
                            while (length < i2) {
                                r14[length] = getsizenhjbrcannotations.readFloat();
                                length++;
                            }
                            getsizenhjbrcannotations.close();
                            return r14;
                        case 12:
                            r14 = new double[i2];
                            while (length < i2) {
                                r14[length] = getsizenhjbrcannotations.readDouble();
                                length++;
                            }
                            getsizenhjbrcannotations.close();
                            return r14;
                        default:
                            try {
                                getsizenhjbrcannotations.close();
                                return null;
                            } catch (IOException e4) {
                                SentryLogcatAdapter.read("ExifInterface", "IOException occurred while closing InputStream", e4);
                                return null;
                            }
                    }
                } catch (IOException e5) {
                    e = e5;
                    SentryLogcatAdapter.write("ExifInterface", "IOException occurred during reading a value", e);
                    if (getsizenhjbrcannotations != null) {
                        try {
                            getsizenhjbrcannotations.close();
                        } catch (IOException e6) {
                            SentryLogcatAdapter.read("ExifInterface", "IOException occurred while closing InputStream", e6);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e7) {
                        SentryLogcatAdapter.read("ExifInterface", "IOException occurred while closing InputStream", e7);
                    }
                }
                throw th;
            }
        } catch (IOException e8) {
            e = e8;
            getsizenhjbrcannotations = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public static getWidthannotations serializer(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new getWidthannotations(new byte[]{(byte) (str.charAt(0) - '0')}, 1, 1);
        }
        byte[] bytes = str.getBytes(takeOrElse3MmeM6k.serializer);
        return new getWidthannotations(bytes, 1, bytes.length);
    }

    public final String read(ByteOrder byteOrder) {
        Object objWrite = write(byteOrder);
        if (objWrite == null) {
            return null;
        }
        if (objWrite instanceof String) {
            return (String) objWrite;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objWrite instanceof long[]) {
            long[] jArr = (long[]) objWrite;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objWrite instanceof int[]) {
            int[] iArr = (int[]) objWrite;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objWrite instanceof double[]) {
            double[] dArr = (double[]) objWrite;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objWrite instanceof isEmptyannotations[])) {
            return null;
        }
        isEmptyannotations[] isemptyannotationsArr = (isEmptyannotations[]) objWrite;
        while (i < isemptyannotationsArr.length) {
            sb.append(isemptyannotationsArr[i].write);
            sb.append('/');
            sb.append(isemptyannotationsArr[i].serializer);
            i++;
            if (i != isemptyannotationsArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public getWidthannotations(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }

    public static getWidthannotations RemoteActionCompatParcelizer(int i, ByteOrder byteOrder) {
        return RemoteActionCompatParcelizer(new int[]{i}, byteOrder);
    }

    public static getWidthannotations RemoteActionCompatParcelizer(long j, ByteOrder byteOrder) {
        return read(new long[]{j}, byteOrder);
    }
}
