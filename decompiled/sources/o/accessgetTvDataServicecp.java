package o;

import android.util.Log;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetTvDataServicecp {
    public int IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public String read;
    public final /* synthetic */ int write;

    public accessgetTvDataServicecp(String str, String[] strArr) {
        String string;
        this.write = 0;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.read = string;
        this.RemoteActionCompatParcelizer = str;
        accessgetSystemNavigationDowncp.serializer(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.RemoteActionCompatParcelizer, i)) {
            i++;
        }
        this.IconCompatParcelizer = i;
    }

    public void write() {
        this.RemoteActionCompatParcelizer = com.adjust.sdk.Constants.SCHEME;
    }

    public setGenderlambda1 RemoteActionCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("scheme == null");
            return null;
        }
        if (this.read != null) {
            return new setGenderlambda1(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("host == null");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0159  */
    /* JADX WARN: Code duplicated, block: B:105:0x0162  */
    /* JADX WARN: Code duplicated, block: B:108:0x0168  */
    /* JADX WARN: Code duplicated, block: B:110:0x016b  */
    /* JADX WARN: Code duplicated, block: B:117:0x017e  */
    /* JADX WARN: Code duplicated, block: B:122:0x018e  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:132:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:151:0x0229 A[EDGE_INSN: B:151:0x0229->B:152:0x022a BREAK  A[LOOP:9: B:139:0x0208->B:149:0x0224]] */
    /* JADX WARN: Code duplicated, block: B:177:0x011e A[EDGE_INSN: B:177:0x011e->B:88:0x011e BREAK  A[LOOP:3: B:83:0x010b->B:87:0x0118], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x019a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:84:0x010d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0118 A[LOOP:3: B:83:0x010b->B:87:0x0118, LOOP_END] */
    public void serializer(String str) {
        String strSubstring;
        String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i;
        InetAddress byAddress;
        byte[] address;
        int i2;
        int i3;
        int i4;
        int i5;
        RegistryMissingComponentException registryMissingComponentException;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iWrite;
        int i11;
        if (str != null) {
            int length = str.length();
            int i12 = 0;
            int iCharCount = 0;
            while (true) {
                if (iCharCount < length) {
                    if (str.charAt(iCharCount) == '%') {
                        RegistryMissingComponentException registryMissingComponentException2 = new RegistryMissingComponentException();
                        registryMissingComponentException2.IconCompatParcelizer(0, iCharCount, str);
                        while (iCharCount < length) {
                            int iCodePointAt = str.codePointAt(iCharCount);
                            if (iCodePointAt == 37 && (i11 = iCharCount + 2) < length) {
                                int iWrite2 = setGenderlambda1.write(str.charAt(iCharCount + 1));
                                int iWrite3 = setGenderlambda1.write(str.charAt(i11));
                                if (iWrite2 != -1 && iWrite3 != -1) {
                                    registryMissingComponentException2.read((iWrite2 << 4) + iWrite3);
                                    iCharCount = i11;
                                } else {
                                    registryMissingComponentException2.RatingCompat(iCodePointAt);
                                }
                            } else {
                                registryMissingComponentException2.RatingCompat(iCodePointAt);
                            }
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                        strSubstring = registryMissingComponentException2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                        break;
                    }
                    iCharCount++;
                } else {
                    strSubstring = str.substring(0, length);
                    break;
                }
            }
            if (strSubstring.startsWith("[") && strSubstring.endsWith("]")) {
                int length2 = strSubstring.length() - 1;
                int i13 = 16;
                byte[] bArr = new byte[16];
                int i14 = 0;
                int i15 = -1;
                int i16 = -1;
                int i17 = 1;
                while (true) {
                    try {
                        if (i17 < length2) {
                            if (i14 != i13) {
                                int i18 = i17 + 2;
                                if (i18 > length2 || !strSubstring.regionMatches(i17, "::", i12, 2)) {
                                    if (i14 != 0) {
                                        if (strSubstring.regionMatches(i17, ":", i12, 1)) {
                                            i17++;
                                        } else if (strSubstring.regionMatches(i17, ".", i12, 1)) {
                                            int i19 = i14 - 2;
                                            int i20 = i19;
                                            while (true) {
                                                if (i16 >= length2) {
                                                    i14 += 2;
                                                    if (i20 == i14) {
                                                        i = 16;
                                                    }
                                                } else if (i20 != i13) {
                                                    if (i20 != i19) {
                                                        if (strSubstring.charAt(i16) == '.') {
                                                            i16++;
                                                        }
                                                    }
                                                    int i21 = i12;
                                                    int i22 = i16;
                                                    while (true) {
                                                        if (i22 < length2) {
                                                            char cCharAt = strSubstring.charAt(i22);
                                                            if (cCharAt >= '0' && cCharAt <= '9') {
                                                                if ((i21 != 0 || i16 == i22) && (i21 = ((i21 * 10) + cCharAt) - 48) <= 255) {
                                                                    i22++;
                                                                }
                                                            }
                                                        }
                                                        if (i22 - i16 != 0) {
                                                            bArr[i20] = (byte) i21;
                                                            i20++;
                                                            i16 = i22;
                                                            i12 = 0;
                                                            i13 = 16;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i16 = i17;
                                    i17 = i16;
                                    i9 = 0;
                                    while (i17 < length2) {
                                        iWrite = setGenderlambda1.write(strSubstring.charAt(i17));
                                        if (iWrite == -1) {
                                            break;
                                        }
                                        i9 = (i9 << 4) + iWrite;
                                        i17++;
                                    }
                                    i10 = i17 - i16;
                                    if (i10 == 0 && i10 <= 4) {
                                        bArr[i14] = (byte) ((i9 >>> 8) & 255);
                                        bArr[i14 + 1] = (byte) (i9 & 255);
                                        i14 += 2;
                                        i12 = 0;
                                        i13 = 16;
                                    }
                                } else if (i15 == -1) {
                                    i14 += 2;
                                    if (i18 == length2) {
                                        i = i13;
                                        i15 = i14;
                                    } else {
                                        i15 = i14;
                                        i16 = i18;
                                        i17 = i16;
                                        i9 = 0;
                                        while (i17 < length2) {
                                            iWrite = setGenderlambda1.write(strSubstring.charAt(i17));
                                            if (iWrite == -1) {
                                                break;
                                                break;
                                            } else {
                                                i9 = (i9 << 4) + iWrite;
                                                i17++;
                                            }
                                        }
                                        i10 = i17 - i16;
                                        if (i10 == 0) {
                                        }
                                    }
                                }
                            }
                            byAddress = null;
                            if (byAddress == null) {
                                strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                                break;
                            }
                            address = byAddress.getAddress();
                            i2 = 16;
                            if (address.length == 16) {
                                i3 = -1;
                                i4 = 0;
                                i5 = 0;
                                while (i4 < address.length) {
                                    i7 = i4;
                                    while (i7 < i2 && address[i7] == 0 && address[i7 + 1] == 0) {
                                        i7 += 2;
                                        i2 = 16;
                                    }
                                    i8 = i7 - i4;
                                    if (i8 > i5) {
                                        i3 = i4;
                                        i5 = i8;
                                    }
                                    i4 = i7 + 2;
                                    i2 = 16;
                                }
                                registryMissingComponentException = new RegistryMissingComponentException();
                                i6 = 0;
                                while (i6 < address.length) {
                                    if (i6 == i3) {
                                        registryMissingComponentException.read(58);
                                        i6 += i5;
                                        if (i6 == 16) {
                                            registryMissingComponentException.read(58);
                                        }
                                    } else {
                                        if (i6 > 0) {
                                            registryMissingComponentException.read(58);
                                        }
                                        registryMissingComponentException.MediaSessionCompatResultReceiverWrapper(((address[i6] & 255) << 8) | (address[i6 + 1] & 255));
                                        i6 += 2;
                                    }
                                }
                                strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = registryMissingComponentException.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                            } else {
                                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
                                return;
                            }
                        } else {
                            i = i13;
                        }
                        if (i14 != i) {
                            if (i15 == -1) {
                                byAddress = null;
                            } else {
                                int i23 = i14 - i15;
                                System.arraycopy(bArr, i15, bArr, 16 - i23, i23);
                                Arrays.fill(bArr, i15, (16 - i14) + i15, (byte) 0);
                            }
                            if (byAddress == null) {
                                strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                                break;
                            }
                            address = byAddress.getAddress();
                            i2 = 16;
                            if (address.length == 16) {
                                i3 = -1;
                                i4 = 0;
                                i5 = 0;
                                while (i4 < address.length) {
                                    i7 = i4;
                                    while (i7 < i2) {
                                        i7 += 2;
                                        i2 = 16;
                                    }
                                    i8 = i7 - i4;
                                    if (i8 > i5) {
                                        i3 = i4;
                                        i5 = i8;
                                    }
                                    i4 = i7 + 2;
                                    i2 = 16;
                                }
                                registryMissingComponentException = new RegistryMissingComponentException();
                                i6 = 0;
                                while (i6 < address.length) {
                                    if (i6 == i3) {
                                        registryMissingComponentException.read(58);
                                        i6 += i5;
                                        if (i6 == 16) {
                                            registryMissingComponentException.read(58);
                                        }
                                    } else {
                                        if (i6 > 0) {
                                            registryMissingComponentException.read(58);
                                        }
                                        registryMissingComponentException.MediaSessionCompatResultReceiverWrapper(((address[i6] & 255) << 8) | (address[i6 + 1] & 255));
                                        i6 += 2;
                                    }
                                }
                                strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = registryMissingComponentException.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                            } else {
                                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
                                return;
                            }
                        }
                        byAddress = InetAddress.getByAddress(bArr);
                        if (byAddress == null) {
                            strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                            break;
                        }
                        address = byAddress.getAddress();
                        i2 = 16;
                        if (address.length == 16) {
                            i3 = -1;
                            i4 = 0;
                            i5 = 0;
                            while (i4 < address.length) {
                                i7 = i4;
                                while (i7 < i2) {
                                    i7 += 2;
                                    i2 = 16;
                                }
                                i8 = i7 - i4;
                                if (i8 > i5) {
                                    i3 = i4;
                                    i5 = i8;
                                }
                                i4 = i7 + 2;
                                i2 = 16;
                            }
                            registryMissingComponentException = new RegistryMissingComponentException();
                            i6 = 0;
                            while (i6 < address.length) {
                                if (i6 == i3) {
                                    registryMissingComponentException.read(58);
                                    i6 += i5;
                                    if (i6 == 16) {
                                        registryMissingComponentException.read(58);
                                    }
                                } else {
                                    if (i6 > 0) {
                                        registryMissingComponentException.read(58);
                                    }
                                    registryMissingComponentException.MediaSessionCompatResultReceiverWrapper(((address[i6] & 255) << 8) | (address[i6 + 1] & 255));
                                    i6 += 2;
                                }
                            }
                            strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = registryMissingComponentException.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                        } else {
                            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
                            return;
                        }
                    } catch (UnknownHostException unused) {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
                        return;
                    }
                }
            } else {
                try {
                    String lowerCase = IDN.toASCII(strSubstring).toLowerCase(java.util.Locale.US);
                    if (!lowerCase.isEmpty()) {
                        while (true) {
                            if (i12 >= lowerCase.length()) {
                                strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = lowerCase;
                                break;
                            } else {
                                char cCharAt2 = lowerCase.charAt(i12);
                                i12 = (cCharAt2 > 31 && cCharAt2 < 127 && " #%/:?@[\\]".indexOf(cCharAt2) == -1) ? i12 + 1 : 0;
                            }
                        }
                    }
                } catch (IllegalArgumentException unused2) {
                }
                strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                break;
            }
            if (strR8lambda54BeH8ZsBru0CXI2CCSP2syNys != null) {
                this.read = strR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                return;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("unexpected host: ".concat(str));
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("host == null");
    }

    public String toString() {
        if (this.write != 1) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("://");
        int i = -1;
        if (this.read.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.read);
            sb.append(']');
        } else {
            sb.append(this.read);
        }
        int i2 = this.IconCompatParcelizer;
        if (i2 == -1) {
            String str = this.RemoteActionCompatParcelizer;
            if (str.equals("http")) {
                i2 = 80;
            } else {
                i2 = str.equals(com.adjust.sdk.Constants.SCHEME) ? 443 : -1;
            }
        }
        String str2 = this.RemoteActionCompatParcelizer;
        if (str2.equals("http")) {
            i = 80;
        } else if (str2.equals(com.adjust.sdk.Constants.SCHEME)) {
            i = 443;
        }
        if (i2 != i) {
            sb.append(':');
            sb.append(i2);
        }
        return sb.toString();
    }

    public void RemoteActionCompatParcelizer(int i) {
        if (i > 0 && i <= 65535) {
            this.IconCompatParcelizer = i;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "unexpected port: "));
        }
    }

    public accessgetTvDataServicecp() {
        this.write = 1;
        this.IconCompatParcelizer = -1;
    }
}
