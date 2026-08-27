package o;

import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class accessgetHuecp {
    public static final byte[] RemoteActionCompatParcelizer = {112, 114, 111, 0};
    public static final byte[] write = {112, 114, 109, 0};

    public static accessgetDstcp[] read(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, accessgetDstcp[] accessgetdstcpArr) throws IOException {
        byte[] bArr3 = accessgetHardlightcp.RemoteActionCompatParcelizer;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, accessgetHardlightcp.read)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Unsupported meta version");
                return null;
            }
            int i = (int) accessgetDifferencecp.read(2, fileInputStream);
            byte[] bArrSerializer = accessgetDifferencecp.serializer(fileInputStream, (int) accessgetDifferencecp.read(4, fileInputStream), (int) accessgetDifferencecp.read(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrSerializer);
            try {
                accessgetDstcp[] accessgetdstcpArrWrite = write(byteArrayInputStream, bArr2, i, accessgetdstcpArr);
                byteArrayInputStream.close();
                return accessgetdstcpArrWrite;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(accessgetHardlightcp.MediaBrowserCompatMediaItem, bArr2)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Unsupported meta version");
            return null;
        }
        int i2 = (int) accessgetDifferencecp.read(1, fileInputStream);
        byte[] bArrSerializer2 = accessgetDifferencecp.serializer(fileInputStream, (int) accessgetDifferencecp.read(4, fileInputStream), (int) accessgetDifferencecp.read(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrSerializer2);
        try {
            accessgetDstcp[] accessgetdstcpArrSerializer = serializer(byteArrayInputStream2, i2, accessgetdstcpArr);
            byteArrayInputStream2.close();
            return accessgetdstcpArrSerializer;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static String serializer(byte[] bArr, String str, String str2) {
        byte[] bArr2 = accessgetHardlightcp.serializer;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = accessgetHardlightcp.IconCompatParcelizer;
        String str3 = ":";
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sbM = d$$ExternalSyntheticOutline0.m(str);
                if (!Arrays.equals(bArr, bArr2) && !Arrays.equals(bArr, bArr3)) {
                    str3 = "!";
                }
                return ff$$ExternalSyntheticOutline0.m(sbM, str3, str2);
            }
        }
        return str2;
    }

    public static void serializer(ByteArrayOutputStream byteArrayOutputStream, accessgetDstcp accessgetdstcp, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        accessgetDifferencecp.write(byteArrayOutputStream, str.getBytes(charset).length);
        accessgetDifferencecp.write(byteArrayOutputStream, accessgetdstcp.write);
        accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, accessgetdstcp.MediaMetadataCompat, 4);
        accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, accessgetdstcp.IconCompatParcelizer, 4);
        accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, accessgetdstcp.MediaDescriptionCompat, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static accessgetDstcp[] serializer(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, accessgetHardlightcp.RatingCompat)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Unsupported version");
            return null;
        }
        int i = (int) accessgetDifferencecp.read(1, fileInputStream);
        byte[] bArrSerializer = accessgetDifferencecp.serializer(fileInputStream, (int) accessgetDifferencecp.read(4, fileInputStream), (int) accessgetDifferencecp.read(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrSerializer);
        try {
            accessgetDstcp[] accessgetdstcpArrWrite = write(byteArrayInputStream, str, i);
            byteArrayInputStream.close();
            return accessgetdstcpArrWrite;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void write(ByteArrayOutputStream byteArrayOutputStream, accessgetDstcp accessgetdstcp) throws IOException {
        int i = 0;
        for (Map.Entry entry : accessgetdstcp.MediaSessionCompatQueueItem.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                accessgetDifferencecp.write(byteArrayOutputStream, iIntValue - i);
                accessgetDifferencecp.write(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static void serializer(ByteArrayOutputStream byteArrayOutputStream, accessgetDstcp accessgetdstcp) throws IOException {
        write(byteArrayOutputStream, accessgetdstcp);
        int i = accessgetdstcp.MediaDescriptionCompat;
        int[] iArr = accessgetdstcp.serializer;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            accessgetDifferencecp.write(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : accessgetdstcp.MediaSessionCompatQueueItem.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void read(ByteArrayOutputStream byteArrayOutputStream, int i, accessgetDstcp accessgetdstcp) throws IOException {
        int i2 = accessgetdstcp.MediaDescriptionCompat;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : accessgetdstcp.MediaSessionCompatQueueItem.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static accessgetDstcp[] write(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new accessgetDstcp[0];
        }
        accessgetDstcp[] accessgetdstcpArr = new accessgetDstcp[i];
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = (int) accessgetDifferencecp.read(2, byteArrayInputStream);
            int i5 = (int) accessgetDifferencecp.read(2, byteArrayInputStream);
            accessgetdstcpArr[i3] = new accessgetDstcp(str, new String(accessgetDifferencecp.RemoteActionCompatParcelizer(i4, byteArrayInputStream), StandardCharsets.UTF_8), accessgetDifferencecp.read(4, byteArrayInputStream), i5, (int) accessgetDifferencecp.read(4, byteArrayInputStream), (int) accessgetDifferencecp.read(4, byteArrayInputStream), new int[i5], new TreeMap());
        }
        int i6 = 0;
        while (i6 < i) {
            accessgetDstcp accessgetdstcp = accessgetdstcpArr[i6];
            int iAvailable = byteArrayInputStream.available();
            int i7 = accessgetdstcp.MediaMetadataCompat;
            int i8 = accessgetdstcp.MediaDescriptionCompat;
            TreeMap treeMap = accessgetdstcp.MediaSessionCompatQueueItem;
            int i9 = iAvailable - i7;
            int i10 = i2;
            while (byteArrayInputStream.available() > i9) {
                i10 += (int) accessgetDifferencecp.read(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(i10), 1);
                int i11 = (int) accessgetDifferencecp.read(2, byteArrayInputStream);
                while (i11 > 0) {
                    accessgetDifferencecp.read(2, byteArrayInputStream);
                    int i12 = (int) accessgetDifferencecp.read(1, byteArrayInputStream);
                    if (i12 != 6 && i12 != 7) {
                        while (i12 > 0) {
                            accessgetDifferencecp.read(1, byteArrayInputStream);
                            int i13 = i6;
                            for (int i14 = (int) accessgetDifferencecp.read(1, byteArrayInputStream); i14 > 0; i14--) {
                                accessgetDifferencecp.read(2, byteArrayInputStream);
                            }
                            i12--;
                            i6 = i13;
                        }
                    }
                    i11--;
                    i6 = i6;
                }
            }
            int i15 = i6;
            if (byteArrayInputStream.available() == i9) {
                accessgetdstcp.serializer = IconCompatParcelizer(byteArrayInputStream, accessgetdstcp.write);
                BitSet bitSetValueOf = BitSet.valueOf(accessgetDifferencecp.RemoteActionCompatParcelizer((((i8 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
                for (int i16 = 0; i16 < i8; i16++) {
                    int i17 = bitSetValueOf.get(i16) ? 2 : 0;
                    if (bitSetValueOf.get(i16 + i8)) {
                        i17 |= 4;
                    }
                    if (i17 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i16));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i16), Integer.valueOf(i17 | num.intValue()));
                    }
                }
                i6 = i15 + 1;
                i2 = 0;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Read too much data during profile line parse");
                return null;
            }
        }
        return accessgetdstcpArr;
    }

    public static boolean read(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, accessgetDstcp[] accessgetdstcpArr) throws IOException {
        int length;
        byte[] bArr2 = accessgetHardlightcp.MediaBrowserCompatMediaItem;
        int i = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                accessgetDifferencecp.write(byteArrayOutputStream2, accessgetdstcpArr.length);
                int i2 = 2;
                int i3 = 2;
                for (accessgetDstcp accessgetdstcp : accessgetdstcpArr) {
                    accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream2, accessgetdstcp.IconCompatParcelizer, 4);
                    accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream2, accessgetdstcp.MediaBrowserCompatMediaItem, 4);
                    accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream2, accessgetdstcp.MediaDescriptionCompat, 4);
                    String strSerializer = serializer(bArr2, accessgetdstcp.read, accessgetdstcp.RemoteActionCompatParcelizer);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = strSerializer.getBytes(charset).length;
                    accessgetDifferencecp.write(byteArrayOutputStream2, length2);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream2.write(strSerializer.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 == byteArray.length) {
                    accessgetLuminositycp accessgetluminositycp = new accessgetLuminositycp(accessgetDstAtopcp.DEX_FILES, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList.add(accessgetluminositycp);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < accessgetdstcpArr.length) {
                        try {
                            accessgetDstcp accessgetdstcp2 = accessgetdstcpArr[i4];
                            accessgetDifferencecp.write(byteArrayOutputStream3, i4);
                            accessgetDifferencecp.write(byteArrayOutputStream3, accessgetdstcp2.write);
                            i5 = i5 + 4 + (accessgetdstcp2.write * 2);
                            int[] iArr = accessgetdstcp2.serializer;
                            int length3 = iArr.length;
                            int i6 = i;
                            int i7 = i6;
                            while (i6 < length3) {
                                int i8 = iArr[i6];
                                accessgetDifferencecp.write(byteArrayOutputStream3, i8 - i7);
                                i6++;
                                i7 = i8;
                            }
                            i4++;
                            i = 0;
                        } catch (Throwable th) {
                            try {
                                byteArrayOutputStream3.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i5 == byteArray2.length) {
                        accessgetLuminositycp accessgetluminositycp2 = new accessgetLuminositycp(accessgetDstAtopcp.CLASSES, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList.add(accessgetluminositycp2);
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < accessgetdstcpArr.length) {
                            try {
                                accessgetDstcp accessgetdstcp3 = accessgetdstcpArr[i9];
                                Iterator it = accessgetdstcp3.MediaSessionCompatQueueItem.entrySet().iterator();
                                int iIntValue = 0;
                                while (it.hasNext()) {
                                    iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                try {
                                    read(byteArrayOutputStream5, iIntValue, accessgetdstcp3);
                                    byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                                    byteArrayOutputStream5.close();
                                    ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                                    try {
                                        write(byteArrayOutputStream6, accessgetdstcp3);
                                        byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                                        byteArrayOutputStream6.close();
                                        accessgetDifferencecp.write(byteArrayOutputStream4, i9);
                                        int length4 = byteArray3.length + i2 + byteArray4.length;
                                        accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream4, length4, 4);
                                        accessgetDifferencecp.write(byteArrayOutputStream4, iIntValue);
                                        byteArrayOutputStream4.write(byteArray3);
                                        byteArrayOutputStream4.write(byteArray4);
                                        i10 = i10 + 6 + length4;
                                        i9++;
                                        i2 = 2;
                                    } catch (Throwable th3) {
                                        try {
                                            byteArrayOutputStream6.close();
                                            throw th3;
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                            throw th3;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    try {
                                        byteArrayOutputStream5.close();
                                        throw th5;
                                    } catch (Throwable th6) {
                                        th5.addSuppressed(th6);
                                        throw th5;
                                    }
                                }
                            } catch (Throwable th7) {
                                try {
                                    byteArrayOutputStream4.close();
                                    throw th7;
                                } catch (Throwable th8) {
                                    th7.addSuppressed(th8);
                                    throw th7;
                                }
                            }
                        }
                        byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
                        if (i10 == byteArray5.length) {
                            accessgetLuminositycp accessgetluminositycp3 = new accessgetLuminositycp(accessgetDstAtopcp.METHODS, byteArray5, true);
                            byteArrayOutputStream4.close();
                            arrayList.add(accessgetluminositycp3);
                            long size = ((long) (arrayList.size() * 16)) + 12;
                            accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, arrayList.size(), 4);
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                accessgetLuminositycp accessgetluminositycp4 = (accessgetLuminositycp) arrayList.get(i11);
                                accessgetDstAtopcp accessgetdstatopcp = accessgetluminositycp4.write;
                                byte[] bArr3 = accessgetluminositycp4.read;
                                accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, accessgetdstatopcp.getValue(), 4);
                                accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, size, 4);
                                if (accessgetluminositycp4.serializer) {
                                    long length5 = bArr3.length;
                                    byte[] bArrWrite = accessgetDifferencecp.write(bArr3);
                                    arrayList2.add(bArrWrite);
                                    accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, bArrWrite.length, 4);
                                    accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, length5, 4);
                                    length = bArrWrite.length;
                                } else {
                                    arrayList2.add(bArr3);
                                    accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, bArr3.length, 4);
                                    accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += (long) length;
                            }
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                byteArrayOutputStream.write((byte[]) arrayList2.get(i12));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th9) {
                try {
                    byteArrayOutputStream2.close();
                    throw th9;
                } catch (Throwable th10) {
                    th9.addSuppressed(th10);
                    throw th9;
                }
            }
        }
        byte[] bArr4 = accessgetHardlightcp.RatingCompat;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] bArrSerializer = serializer(accessgetdstcpArr, bArr4);
            accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, accessgetdstcpArr.length, 1);
            accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, bArrSerializer.length, 4);
            byte[] bArrWrite2 = accessgetDifferencecp.write(bArrSerializer);
            accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, bArrWrite2.length, 4);
            byteArrayOutputStream.write(bArrWrite2);
            return true;
        }
        byte[] bArr5 = accessgetHardlightcp.IconCompatParcelizer;
        if (Arrays.equals(bArr, bArr5)) {
            accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, accessgetdstcpArr.length, 1);
            for (accessgetDstcp accessgetdstcp4 : accessgetdstcpArr) {
                int size2 = accessgetdstcp4.MediaSessionCompatQueueItem.size();
                String strSerializer2 = serializer(bArr5, accessgetdstcp4.read, accessgetdstcp4.RemoteActionCompatParcelizer);
                Charset charset2 = StandardCharsets.UTF_8;
                accessgetDifferencecp.write(byteArrayOutputStream, strSerializer2.getBytes(charset2).length);
                accessgetDifferencecp.write(byteArrayOutputStream, accessgetdstcp4.serializer.length);
                accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, size2 * 4, 4);
                accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, accessgetdstcp4.IconCompatParcelizer, 4);
                byteArrayOutputStream.write(strSerializer2.getBytes(charset2));
                Iterator it2 = accessgetdstcp4.MediaSessionCompatQueueItem.keySet().iterator();
                while (it2.hasNext()) {
                    accessgetDifferencecp.write(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                    accessgetDifferencecp.write(byteArrayOutputStream, 0);
                }
                for (int i13 : accessgetdstcp4.serializer) {
                    accessgetDifferencecp.write(byteArrayOutputStream, i13);
                }
            }
            return true;
        }
        byte[] bArr6 = accessgetHardlightcp.write;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] bArrSerializer2 = serializer(accessgetdstcpArr, bArr6);
            accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, accessgetdstcpArr.length, 1);
            accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, bArrSerializer2.length, 4);
            byte[] bArrWrite3 = accessgetDifferencecp.write(bArrSerializer2);
            accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, bArrWrite3.length, 4);
            byteArrayOutputStream.write(bArrWrite3);
            return true;
        }
        byte[] bArr7 = accessgetHardlightcp.serializer;
        if (!Arrays.equals(bArr, bArr7)) {
            return false;
        }
        accessgetDifferencecp.write(byteArrayOutputStream, accessgetdstcpArr.length);
        for (accessgetDstcp accessgetdstcp5 : accessgetdstcpArr) {
            String str = accessgetdstcp5.read;
            TreeMap treeMap = accessgetdstcp5.MediaSessionCompatQueueItem;
            String strSerializer3 = serializer(bArr7, str, accessgetdstcp5.RemoteActionCompatParcelizer);
            Charset charset3 = StandardCharsets.UTF_8;
            accessgetDifferencecp.write(byteArrayOutputStream, strSerializer3.getBytes(charset3).length);
            accessgetDifferencecp.write(byteArrayOutputStream, treeMap.size());
            accessgetDifferencecp.write(byteArrayOutputStream, accessgetdstcp5.serializer.length);
            accessgetDifferencecp.IconCompatParcelizer(byteArrayOutputStream, accessgetdstcp5.IconCompatParcelizer, 4);
            byteArrayOutputStream.write(strSerializer3.getBytes(charset3));
            Iterator it3 = treeMap.keySet().iterator();
            while (it3.hasNext()) {
                accessgetDifferencecp.write(byteArrayOutputStream, ((Integer) it3.next()).intValue());
            }
            for (int i14 : accessgetdstcp5.serializer) {
                accessgetDifferencecp.write(byteArrayOutputStream, i14);
            }
        }
        return true;
    }

    public static byte[] serializer(accessgetDstcp[] accessgetdstcpArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (accessgetDstcp accessgetdstcp : accessgetdstcpArr) {
            length += ((((accessgetdstcp.MediaDescriptionCompat * 2) + 7) & (-8)) / 8) + (accessgetdstcp.write * 2) + serializer(bArr, accessgetdstcp.read, accessgetdstcp.RemoteActionCompatParcelizer).getBytes(StandardCharsets.UTF_8).length + 16 + accessgetdstcp.MediaMetadataCompat;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, accessgetHardlightcp.write)) {
            int length2 = accessgetdstcpArr.length;
            while (i < length2) {
                accessgetDstcp accessgetdstcp2 = accessgetdstcpArr[i];
                serializer(byteArrayOutputStream, accessgetdstcp2, serializer(bArr, accessgetdstcp2.read, accessgetdstcp2.RemoteActionCompatParcelizer));
                serializer(byteArrayOutputStream, accessgetdstcp2);
                i++;
            }
        } else {
            for (accessgetDstcp accessgetdstcp3 : accessgetdstcpArr) {
                serializer(byteArrayOutputStream, accessgetdstcp3, serializer(bArr, accessgetdstcp3.read, accessgetdstcp3.RemoteActionCompatParcelizer));
            }
            int length3 = accessgetdstcpArr.length;
            while (i < length3) {
                serializer(byteArrayOutputStream, accessgetdstcpArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static int[] IconCompatParcelizer(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) accessgetDifferencecp.read(2, byteArrayInputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static accessgetDstcp[] serializer(ByteArrayInputStream byteArrayInputStream, int i, accessgetDstcp[] accessgetdstcpArr) {
        if (byteArrayInputStream.available() == 0) {
            return new accessgetDstcp[0];
        }
        if (i != accessgetdstcpArr.length) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (int) accessgetDifferencecp.read(2, byteArrayInputStream);
            iArr[i2] = (int) accessgetDifferencecp.read(2, byteArrayInputStream);
            strArr[i2] = new String(accessgetDifferencecp.RemoteActionCompatParcelizer(i3, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i; i4++) {
            accessgetDstcp accessgetdstcp = accessgetdstcpArr[i4];
            if (!accessgetdstcp.RemoteActionCompatParcelizer.equals(strArr[i4])) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            accessgetdstcp.write = i5;
            accessgetdstcp.serializer = IconCompatParcelizer(byteArrayInputStream, i5);
        }
        return accessgetdstcpArr;
    }

    public static accessgetDstcp[] write(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, accessgetDstcp[] accessgetdstcpArr) throws IOException {
        accessgetDstcp accessgetdstcp;
        if (byteArrayInputStream.available() == 0) {
            return new accessgetDstcp[0];
        }
        if (i != accessgetdstcpArr.length) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            accessgetDifferencecp.read(2, byteArrayInputStream);
            String str = new String(accessgetDifferencecp.RemoteActionCompatParcelizer((int) accessgetDifferencecp.read(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long j = accessgetDifferencecp.read(4, byteArrayInputStream);
            int i3 = (int) accessgetDifferencecp.read(2, byteArrayInputStream);
            if (accessgetdstcpArr.length <= 0) {
                accessgetdstcp = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i4 = 0;
            while (true) {
                if (i4 >= accessgetdstcpArr.length) {
                    accessgetdstcp = null;
                    break;
                }
                if (accessgetdstcpArr[i4].RemoteActionCompatParcelizer.equals(strSubstring)) {
                    accessgetdstcp = accessgetdstcpArr[i4];
                    break;
                }
                i4++;
            }
            if (accessgetdstcp == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing profile key: ".concat(str));
                return null;
            }
            accessgetdstcp.MediaBrowserCompatMediaItem = j;
            int[] iArrIconCompatParcelizer = IconCompatParcelizer(byteArrayInputStream, i3);
            if (Arrays.equals(bArr, accessgetHardlightcp.serializer)) {
                accessgetdstcp.write = i3;
                accessgetdstcp.serializer = iArrIconCompatParcelizer;
            }
        }
        return accessgetdstcpArr;
    }
}
