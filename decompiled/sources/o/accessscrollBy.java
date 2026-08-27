package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes2.dex */
public final class accessscrollBy {
    public int IconCompatParcelizer;
    public char[] MediaDescriptionCompat;
    public int RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public int read;
    public final int serializer;
    public int write;

    public String read() {
        String str;
        char[] cArr;
        char c;
        int i;
        char c2;
        this.write = 0;
        this.read = 0;
        this.IconCompatParcelizer = 0;
        this.RatingCompat = 0;
        String str2 = this.RemoteActionCompatParcelizer;
        this.MediaDescriptionCompat = str2.toCharArray();
        String strIconCompatParcelizer = IconCompatParcelizer();
        if (strIconCompatParcelizer != null) {
            do {
                int i2 = this.write;
                int i3 = this.serializer;
                if (i2 != i3) {
                    char c3 = this.MediaDescriptionCompat[i2];
                    if (c3 == '\"') {
                        int i4 = i2 + 1;
                        this.write = i4;
                        this.read = i4;
                        this.IconCompatParcelizer = i4;
                        while (true) {
                            int i5 = this.write;
                            if (i5 == i3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Unexpected end of DN: ".concat(str2));
                                return null;
                            }
                            char[] cArr2 = this.MediaDescriptionCompat;
                            char c4 = cArr2[i5];
                            if (c4 == '\"') {
                                this.write = i5 + 1;
                                while (true) {
                                    int i6 = this.write;
                                    if (i6 >= i3 || this.MediaDescriptionCompat[i6] != ' ') {
                                        break;
                                    }
                                    this.write = i6 + 1;
                                }
                                char[] cArr3 = this.MediaDescriptionCompat;
                                int i7 = this.read;
                                str = new String(cArr3, i7, this.IconCompatParcelizer - i7);
                                break;
                            }
                            int i8 = this.IconCompatParcelizer;
                            if (c4 == '\\') {
                                cArr2[i8] = RemoteActionCompatParcelizer();
                            } else {
                                cArr2[i8] = c4;
                            }
                            this.write++;
                            this.IconCompatParcelizer++;
                        }
                    } else if (c3 == '#') {
                        if (i2 + 4 >= i3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Unexpected end of DN: ".concat(str2));
                            return null;
                        }
                        this.read = i2;
                        this.write = i2 + 1;
                        while (true) {
                            int i9 = this.write;
                            if (i9 == i3 || (c = (cArr = this.MediaDescriptionCompat)[i9]) == '+' || c == ',' || c == ';') {
                                this.IconCompatParcelizer = i9;
                                break;
                            }
                            if (c == ' ') {
                                this.IconCompatParcelizer = i9;
                                this.write = i9 + 1;
                                while (true) {
                                    int i10 = this.write;
                                    if (i10 >= i3 || this.MediaDescriptionCompat[i10] != ' ') {
                                        break;
                                    }
                                    this.write = i10 + 1;
                                }
                            } else {
                                if (c >= 'A' && c <= 'F') {
                                    cArr[i9] = (char) (c + ' ');
                                }
                                this.write = i9 + 1;
                            }
                        }
                        int i11 = this.IconCompatParcelizer;
                        int i12 = this.read;
                        int i13 = i11 - i12;
                        if (i13 < 5 || (i13 & 1) == 0) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Unexpected end of DN: ".concat(str2));
                            return null;
                        }
                        int i14 = i13 / 2;
                        byte[] bArr = new byte[i14];
                        int i15 = i12 + 1;
                        for (int i16 = 0; i16 < i14; i16++) {
                            bArr[i16] = (byte) serializer(i15);
                            i15 += 2;
                        }
                        str = new String(this.MediaDescriptionCompat, this.read, i13);
                    } else if (c3 != '+' && c3 != ',' && c3 != ';') {
                        this.read = i2;
                        this.IconCompatParcelizer = i2;
                        while (true) {
                            int i17 = this.write;
                            char[] cArr4 = this.MediaDescriptionCompat;
                            if (i17 >= i3) {
                                int i18 = this.read;
                                str = new String(cArr4, i18, this.IconCompatParcelizer - i18);
                                break;
                            }
                            char c5 = cArr4[i17];
                            if (c5 != ' ') {
                                if (c5 != ';') {
                                    if (c5 == '\\') {
                                        int i19 = this.IconCompatParcelizer;
                                        this.IconCompatParcelizer = i19 + 1;
                                        cArr4[i19] = RemoteActionCompatParcelizer();
                                        this.write++;
                                    } else if (c5 != '+' && c5 != ',') {
                                        int i20 = this.IconCompatParcelizer;
                                        this.IconCompatParcelizer = i20 + 1;
                                        cArr4[i20] = c5;
                                        this.write = i17 + 1;
                                    }
                                }
                                int i21 = this.read;
                                str = new String(cArr4, i21, this.IconCompatParcelizer - i21);
                                break;
                            }
                            int i22 = this.IconCompatParcelizer;
                            this.RatingCompat = i22;
                            this.write = i17 + 1;
                            this.IconCompatParcelizer = i22 + 1;
                            cArr4[i22] = ' ';
                            while (true) {
                                i = this.write;
                                if (i >= i3) {
                                    break;
                                }
                                char[] cArr5 = this.MediaDescriptionCompat;
                                if (cArr5[i] != ' ') {
                                    break;
                                }
                                int i23 = this.IconCompatParcelizer;
                                this.IconCompatParcelizer = i23 + 1;
                                cArr5[i23] = ' ';
                                this.write = i + 1;
                            }
                            if (i == i3 || (c2 = this.MediaDescriptionCompat[i]) == ',' || c2 == '+' || c2 == ';') {
                                char[] cArr6 = this.MediaDescriptionCompat;
                                int i24 = this.read;
                                str = new String(cArr6, i24, this.RatingCompat - i24);
                                break;
                            }
                        }
                    } else {
                        str = "";
                    }
                    if ("cn".equalsIgnoreCase(strIconCompatParcelizer)) {
                        return str;
                    }
                    int i25 = this.write;
                    if (i25 < i3) {
                        char c6 = this.MediaDescriptionCompat[i25];
                        if (c6 != ',' && c6 != ';' && c6 != '+') {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Malformed DN: ".concat(str2));
                            return null;
                        }
                        this.write = i25 + 1;
                        strIconCompatParcelizer = IconCompatParcelizer();
                    }
                }
            } while (strIconCompatParcelizer != null);
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Malformed DN: ".concat(str2));
            return null;
        }
        return null;
    }

    public accessscrollBy(X500Principal x500Principal, int i) {
        if (i != 1) {
            String name = x500Principal.getName("RFC2253");
            this.RemoteActionCompatParcelizer = name;
            this.serializer = name.length();
        } else {
            String name2 = x500Principal.getName("RFC2253");
            this.RemoteActionCompatParcelizer = name2;
            this.serializer = name2.length();
        }
    }

    public int IconCompatParcelizer(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        int i5 = this.serializer;
        String str = this.RemoteActionCompatParcelizer;
        if (i4 >= i5) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(str, "Malformed DN: ");
            return 0;
        }
        char[] cArr = this.MediaDescriptionCompat;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(str, "Malformed DN: ");
                return 0;
            }
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(str, "Malformed DN: ");
                return 0;
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    public String IconCompatParcelizer() {
        int i;
        int i2;
        int i3;
        char c;
        char c2;
        char c3;
        int i4;
        char c4;
        char c5;
        while (true) {
            i = this.write;
            i2 = this.serializer;
            if (i >= i2 || this.MediaDescriptionCompat[i] != ' ') {
                break;
            }
            this.write = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.read = i;
        this.write = i + 1;
        while (true) {
            i3 = this.write;
            if (i3 >= i2 || (c5 = this.MediaDescriptionCompat[i3]) == '=' || c5 == ' ') {
                break;
            }
            this.write = i3 + 1;
        }
        String str = this.RemoteActionCompatParcelizer;
        if (i3 < i2) {
            this.IconCompatParcelizer = i3;
            if (this.MediaDescriptionCompat[i3] == ' ') {
                while (true) {
                    i4 = this.write;
                    if (i4 >= i2 || (c4 = this.MediaDescriptionCompat[i4]) == '=' || c4 != ' ') {
                        break;
                    }
                    this.write = i4 + 1;
                }
                if (this.MediaDescriptionCompat[i4] != '=' || i4 == i2) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(str, "Unexpected end of DN: ");
                }
            }
            this.write++;
            while (true) {
                int i5 = this.write;
                if (i5 >= i2 || this.MediaDescriptionCompat[i5] != ' ') {
                    break;
                }
                this.write = i5 + 1;
            }
            int i6 = this.IconCompatParcelizer;
            int i7 = this.read;
            if (i6 - i7 > 4) {
                char[] cArr = this.MediaDescriptionCompat;
                if (cArr[i7 + 3] == '.' && (((c = cArr[i7]) == 'O' || c == 'o') && (((c2 = cArr[i7 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i7 + 2]) == 'D' || c3 == 'd')))) {
                    this.read = i7 + 4;
                }
            }
            char[] cArr2 = this.MediaDescriptionCompat;
            int i8 = this.read;
            return new String(cArr2, i8, i6 - i8);
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(str, "Unexpected end of DN: ");
        return null;
    }

    public int serializer(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        int i5 = this.serializer;
        String str = this.RemoteActionCompatParcelizer;
        if (i4 >= i5) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(str, "Malformed DN: ");
            return 0;
        }
        char[] cArr = this.MediaDescriptionCompat;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(str, "Malformed DN: ");
                return 0;
            }
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(str, "Malformed DN: ");
                return 0;
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    public String serializer() {
        int i;
        int i2;
        int i3;
        char c;
        char c2;
        char c3;
        int i4;
        char c4;
        char c5;
        while (true) {
            i = this.write;
            i2 = this.serializer;
            if (i >= i2 || this.MediaDescriptionCompat[i] != ' ') {
                break;
            }
            this.write = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.read = i;
        this.write = i + 1;
        while (true) {
            i3 = this.write;
            if (i3 >= i2 || (c5 = this.MediaDescriptionCompat[i3]) == '=' || c5 == ' ') {
                break;
            }
            this.write = i3 + 1;
        }
        String str = this.RemoteActionCompatParcelizer;
        if (i3 >= i2) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(str, "Unexpected end of DN: ");
            return null;
        }
        this.IconCompatParcelizer = i3;
        if (this.MediaDescriptionCompat[i3] == ' ') {
            while (true) {
                i4 = this.write;
                if (i4 >= i2 || (c4 = this.MediaDescriptionCompat[i4]) == '=' || c4 != ' ') {
                    break;
                }
                this.write = i4 + 1;
            }
            if (this.MediaDescriptionCompat[i4] != '=' || i4 == i2) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(str, "Unexpected end of DN: ");
                return null;
            }
        }
        this.write++;
        while (true) {
            int i5 = this.write;
            if (i5 >= i2 || this.MediaDescriptionCompat[i5] != ' ') {
                break;
            }
            this.write = i5 + 1;
        }
        int i6 = this.IconCompatParcelizer;
        int i7 = this.read;
        if (i6 - i7 > 4) {
            char[] cArr = this.MediaDescriptionCompat;
            if (cArr[i7 + 3] == '.' && (((c = cArr[i7]) == 'O' || c == 'o') && (((c2 = cArr[i7 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i7 + 2]) == 'D' || c3 == 'd')))) {
                this.read = i7 + 4;
            }
        }
        char[] cArr2 = this.MediaDescriptionCompat;
        int i8 = this.read;
        return new String(cArr2, i8, i6 - i8);
    }

    public char RemoteActionCompatParcelizer() {
        int i;
        int i2;
        int i3 = this.write + 1;
        this.write = i3;
        int i4 = this.serializer;
        if (i3 == i4) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(this.RemoteActionCompatParcelizer, "Unexpected end of DN: ");
            return (char) 0;
        }
        char c = this.MediaDescriptionCompat[i3];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                        case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                            break;
                        default:
                            int iSerializer = serializer(i3);
                            this.write++;
                            if (iSerializer < 128) {
                                return (char) iSerializer;
                            }
                            if (iSerializer < 192 || iSerializer > 247) {
                                return '?';
                            }
                            if (iSerializer <= 223) {
                                i = iSerializer & 31;
                                i2 = 1;
                            } else if (iSerializer <= 239) {
                                i = iSerializer & 15;
                                i2 = 2;
                            } else {
                                i = iSerializer & 7;
                                i2 = 3;
                            }
                            for (int i5 = 0; i5 < i2; i5++) {
                                int i6 = this.write;
                                int i7 = i6 + 1;
                                this.write = i7;
                                if (i7 == i4 || this.MediaDescriptionCompat[i7] != '\\') {
                                    return '?';
                                }
                                int i8 = i6 + 2;
                                this.write = i8;
                                int iSerializer2 = serializer(i8);
                                this.write++;
                                if ((iSerializer2 & 192) != 128) {
                                    return '?';
                                }
                                i = (i << 6) + (iSerializer2 & 63);
                            }
                            return (char) i;
                    }
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case '+':
                case ',':
                    return c;
            }
        }
        return c;
    }

    public char write() {
        int i;
        int i2;
        int i3 = this.write + 1;
        this.write = i3;
        int i4 = this.serializer;
        if (i3 == i4) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(this.RemoteActionCompatParcelizer, "Unexpected end of DN: ");
            return (char) 0;
        }
        char c = this.MediaDescriptionCompat[i3];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                        case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                            break;
                        default:
                            int iIconCompatParcelizer = IconCompatParcelizer(i3);
                            this.write++;
                            if (iIconCompatParcelizer < 128) {
                                return (char) iIconCompatParcelizer;
                            }
                            if (iIconCompatParcelizer < 192 || iIconCompatParcelizer > 247) {
                                return '?';
                            }
                            if (iIconCompatParcelizer <= 223) {
                                i = iIconCompatParcelizer & 31;
                                i2 = 1;
                            } else if (iIconCompatParcelizer <= 239) {
                                i = iIconCompatParcelizer & 15;
                                i2 = 2;
                            } else {
                                i = iIconCompatParcelizer & 7;
                                i2 = 3;
                            }
                            for (int i5 = 0; i5 < i2; i5++) {
                                int i6 = this.write;
                                int i7 = i6 + 1;
                                this.write = i7;
                                if (i7 == i4 || this.MediaDescriptionCompat[i7] != '\\') {
                                    return '?';
                                }
                                int i8 = i6 + 2;
                                this.write = i8;
                                int iIconCompatParcelizer2 = IconCompatParcelizer(i8);
                                this.write++;
                                if ((iIconCompatParcelizer2 & 192) != 128) {
                                    return '?';
                                }
                                i = (i << 6) + (iIconCompatParcelizer2 & 63);
                            }
                            return (char) i;
                    }
                case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                case '+':
                case ',':
                    return c;
            }
        }
        return c;
    }
}
