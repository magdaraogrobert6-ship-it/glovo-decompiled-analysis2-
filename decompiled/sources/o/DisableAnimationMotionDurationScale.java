package o;

import android.util.Log;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DisableAnimationMotionDurationScale {
    public static final Pattern IconCompatParcelizer = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    public static final String[] serializer;

    static {
        String[] strArr = {com.braze.Constants.BRAZE_PUSH_ACCENT_KEY, "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        serializer = strArr;
        Arrays.sort(strArr);
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0300  */
    /* JADX WARN: Code duplicated, block: B:177:0x030d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0318  */
    /* JADX WARN: Code duplicated, block: B:182:0x0320  */
    /* JADX WARN: Code duplicated, block: B:184:0x0326  */
    /* JADX WARN: Code duplicated, block: B:189:0x0333  */
    /* JADX WARN: Code duplicated, block: B:191:0x0339  */
    /* JADX WARN: Code duplicated, block: B:194:0x0340  */
    /* JADX WARN: Code duplicated, block: B:195:0x0342  */
    /* JADX WARN: Code duplicated, block: B:253:0x034f A[EDGE_INSN: B:253:0x034f->B:200:0x034f BREAK  A[LOOP:10: B:156:0x02a3->B:259:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x034d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:? A[LOOP:10: B:156:0x02a3->B:259:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x033b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static final void serializer(X509Certificate x509Certificate, String str) throws SSLException {
        String[] strArr;
        Collection<List<?>> subjectAlternativeNames;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str2;
        char[] cArr;
        char c;
        int i6;
        char c2;
        accessscrollBy accessscrollby = new accessscrollBy(x509Certificate.getSubjectX500Principal(), 0);
        accessscrollby.write = 0;
        accessscrollby.read = 0;
        accessscrollby.IconCompatParcelizer = 0;
        accessscrollby.RatingCompat = 0;
        String str3 = accessscrollby.RemoteActionCompatParcelizer;
        accessscrollby.MediaDescriptionCompat = str3.toCharArray();
        List arrayList = Collections.EMPTY_LIST;
        String strSerializer = accessscrollby.serializer();
        if (strSerializer != null) {
            while (true) {
                int i7 = accessscrollby.write;
                int i8 = accessscrollby.serializer;
                if (i7 >= i8) {
                    break;
                }
                char c3 = accessscrollby.MediaDescriptionCompat[i7];
                char c4 = '\\';
                char c5 = ',';
                if (c3 == '\"') {
                    int i9 = i7 + 1;
                    accessscrollby.write = i9;
                    accessscrollby.read = i9;
                    accessscrollby.IconCompatParcelizer = i9;
                    while (true) {
                        int i10 = accessscrollby.write;
                        if (i10 != i8) {
                            char[] cArr2 = accessscrollby.MediaDescriptionCompat;
                            char c6 = cArr2[i10];
                            if (c6 == '\"') {
                                accessscrollby.write = i10 + 1;
                                while (true) {
                                    int i11 = accessscrollby.write;
                                    if (i11 >= i8 || accessscrollby.MediaDescriptionCompat[i11] != ' ') {
                                        break;
                                    } else {
                                        accessscrollby.write = i11 + 1;
                                    }
                                }
                                char[] cArr3 = accessscrollby.MediaDescriptionCompat;
                                int i12 = accessscrollby.read;
                                str2 = new String(cArr3, i12, accessscrollby.IconCompatParcelizer - i12);
                                break;
                            }
                            int i13 = accessscrollby.IconCompatParcelizer;
                            if (c6 == '\\') {
                                cArr2[i13] = accessscrollby.write();
                            } else {
                                cArr2[i13] = c6;
                            }
                            accessscrollby.write++;
                            accessscrollby.IconCompatParcelizer++;
                            c5 = ',';
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Unexpected end of DN: ".concat(str3));
                            return;
                        }
                    }
                } else if (c3 != '#') {
                    if (c3 == '+' || c3 == ',' || c3 == ';') {
                        str2 = "";
                    } else {
                        accessscrollby.read = i7;
                        accessscrollby.IconCompatParcelizer = i7;
                        while (true) {
                            int i14 = accessscrollby.write;
                            char[] cArr4 = accessscrollby.MediaDescriptionCompat;
                            if (i14 >= i8) {
                                int i15 = accessscrollby.read;
                                str2 = new String(cArr4, i15, accessscrollby.IconCompatParcelizer - i15);
                                break;
                            }
                            char c7 = cArr4[i14];
                            if (c7 != ' ') {
                                if (c7 != ';') {
                                    if (c7 == c4) {
                                        int i16 = accessscrollby.IconCompatParcelizer;
                                        accessscrollby.IconCompatParcelizer = i16 + 1;
                                        cArr4[i16] = accessscrollby.write();
                                        accessscrollby.write++;
                                    } else if (c7 != '+' && c7 != ',') {
                                        int i17 = accessscrollby.IconCompatParcelizer;
                                        accessscrollby.IconCompatParcelizer = i17 + 1;
                                        cArr4[i17] = c7;
                                        accessscrollby.write = i14 + 1;
                                    }
                                    c4 = '\\';
                                }
                                int i18 = accessscrollby.read;
                                str2 = new String(cArr4, i18, accessscrollby.IconCompatParcelizer - i18);
                                break;
                            }
                            int i19 = accessscrollby.IconCompatParcelizer;
                            accessscrollby.RatingCompat = i19;
                            accessscrollby.write = i14 + 1;
                            accessscrollby.IconCompatParcelizer = i19 + 1;
                            cArr4[i19] = ' ';
                            while (true) {
                                i6 = accessscrollby.write;
                                if (i6 >= i8) {
                                    break;
                                }
                                char[] cArr5 = accessscrollby.MediaDescriptionCompat;
                                if (cArr5[i6] != ' ') {
                                    break;
                                }
                                int i20 = accessscrollby.IconCompatParcelizer;
                                accessscrollby.IconCompatParcelizer = i20 + 1;
                                cArr5[i20] = ' ';
                                accessscrollby.write = i6 + 1;
                            }
                            if (i6 == i8 || (c2 = accessscrollby.MediaDescriptionCompat[i6]) == ',' || c2 == '+' || c2 == ';') {
                                char[] cArr6 = accessscrollby.MediaDescriptionCompat;
                                int i21 = accessscrollby.read;
                                str2 = new String(cArr6, i21, accessscrollby.RatingCompat - i21);
                                break;
                            }
                            c4 = '\\';
                        }
                    }
                } else if (i7 + 4 < i8) {
                    accessscrollby.read = i7;
                    accessscrollby.write = i7 + 1;
                    while (true) {
                        int i22 = accessscrollby.write;
                        if (i22 == i8 || (c = (cArr = accessscrollby.MediaDescriptionCompat)[i22]) == '+' || c == ',' || c == ';') {
                            accessscrollby.IconCompatParcelizer = i22;
                            break;
                        }
                        if (c == ' ') {
                            accessscrollby.IconCompatParcelizer = i22;
                            accessscrollby.write = i22 + 1;
                            while (true) {
                                int i23 = accessscrollby.write;
                                if (i23 >= i8 || accessscrollby.MediaDescriptionCompat[i23] != ' ') {
                                    break;
                                } else {
                                    accessscrollby.write = i23 + 1;
                                }
                            }
                        } else {
                            if (c >= 'A' && c <= 'F') {
                                cArr[i22] = (char) (c + ' ');
                            }
                            accessscrollby.write = i22 + 1;
                        }
                    }
                    int i24 = accessscrollby.IconCompatParcelizer;
                    int i25 = accessscrollby.read;
                    int i26 = i24 - i25;
                    if (i26 >= 5 && (i26 & 1) != 0) {
                        int i27 = i26 / 2;
                        byte[] bArr = new byte[i27];
                        int i28 = i25 + 1;
                        for (int i29 = 0; i29 < i27; i29++) {
                            bArr[i29] = (byte) accessscrollby.IconCompatParcelizer(i28);
                            i28 += 2;
                        }
                        str2 = new String(accessscrollby.MediaDescriptionCompat, accessscrollby.read, i26);
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Unexpected end of DN: ".concat(str3));
                        return;
                    }
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Unexpected end of DN: ".concat(str3));
                    return;
                }
                if ("cn".equalsIgnoreCase(strSerializer)) {
                    if (arrayList.isEmpty()) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(str2);
                }
                int i30 = accessscrollby.write;
                if (i30 >= i8) {
                    break;
                }
                char c8 = accessscrollby.MediaDescriptionCompat[i30];
                if (c8 != c5 && c8 != ';' && c8 != '+') {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Malformed DN: ".concat(str3));
                    return;
                }
                accessscrollby.write = i30 + 1;
                strSerializer = accessscrollby.serializer();
                if (strSerializer == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Malformed DN: ".concat(str3));
                    return;
                }
            }
        }
        String[] strArr2 = null;
        if (arrayList.isEmpty()) {
            strArr = null;
        } else {
            String[] strArr3 = new String[arrayList.size()];
            arrayList.toArray(strArr3);
            strArr = strArr3;
        }
        LinkedList linkedList = new LinkedList();
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e) {
            Log.e(scrollTo.write(""), "Error parsing certificate.", e);
            subjectAlternativeNames = null;
        }
        if (subjectAlternativeNames != null) {
            for (List<?> list : subjectAlternativeNames) {
                if (((Integer) list.get(0)).intValue() == 2) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (!linkedList.isEmpty()) {
            strArr2 = new String[linkedList.size()];
            linkedList.toArray(strArr2);
        }
        Arrays.toString(strArr);
        Arrays.toString(strArr2);
        LinkedList linkedList2 = new LinkedList();
        if (strArr == null || strArr.length <= 0) {
            i = 0;
        } else {
            i = 0;
            String str4 = strArr[0];
            if (str4 != null) {
                linkedList2.add(str4);
            }
        }
        if (strArr2 != null) {
            int length = strArr2.length;
            for (int i31 = i; i31 < length; i31++) {
                String str5 = strArr2[i31];
                if (str5 != null) {
                    linkedList2.add(str5);
                }
            }
        }
        if (!linkedList2.isEmpty()) {
            StringBuffer stringBuffer = new StringBuffer();
            String lowerCase = str.trim().toLowerCase(java.util.Locale.ENGLISH);
            Iterator it = linkedList2.iterator();
            ?? Equals = i;
            while (it.hasNext()) {
                String lowerCase2 = ((String) it.next()).toLowerCase(java.util.Locale.ENGLISH);
                stringBuffer.append(" <");
                stringBuffer.append(lowerCase2);
                stringBuffer.append('>');
                if (it.hasNext()) {
                    stringBuffer.append(" OR");
                }
                if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(46, 2) != -1) {
                    int length2 = lowerCase2.length();
                    if (length2 >= 7 && length2 <= 9) {
                        int i32 = length2 - 3;
                        if (lowerCase2.charAt(i32) == '.') {
                            if (Arrays.binarySearch(serializer, lowerCase2.substring(2, i32)) < 0) {
                            }
                            if (Equals != 0) {
                                break;
                                break;
                            }
                        }
                        if (!IconCompatParcelizer.matcher(str).matches()) {
                            Equals = lowerCase.endsWith(lowerCase2.substring(1));
                            if (Equals != 0) {
                                i2 = i;
                                i3 = i2;
                                while (i2 < lowerCase.length()) {
                                    if (lowerCase.charAt(i2) == '.') {
                                        i3++;
                                    }
                                    i2++;
                                }
                                i4 = i;
                                i5 = i4;
                                while (i4 < lowerCase2.length()) {
                                    if (lowerCase2.charAt(i4) == '.') {
                                        i5++;
                                    }
                                    i4++;
                                }
                                if (i3 == i5) {
                                    Equals = 1;
                                } else {
                                    Equals = i;
                                }
                            }
                        }
                        if (Equals != 0) {
                            break;
                            break;
                        }
                    } else {
                        if (!IconCompatParcelizer.matcher(str).matches()) {
                            Equals = lowerCase.endsWith(lowerCase2.substring(1));
                            if (Equals != 0) {
                                i2 = i;
                                i3 = i2;
                                while (i2 < lowerCase.length()) {
                                    if (lowerCase.charAt(i2) == '.') {
                                        i3++;
                                    }
                                    i2++;
                                }
                                i4 = i;
                                i5 = i4;
                                while (i4 < lowerCase2.length()) {
                                    if (lowerCase2.charAt(i4) == '.') {
                                        i5++;
                                    }
                                    i4++;
                                }
                                if (i3 == i5) {
                                    Equals = 1;
                                } else {
                                    Equals = i;
                                }
                            }
                        }
                        if (Equals != 0) {
                            break;
                        }
                    }
                }
                Equals = lowerCase.equals(lowerCase2);
                if (Equals != 0) {
                    break;
                    break;
                }
            }
            if (Equals != 0) {
                return;
            }
            throw new SSLException("hostname in certificate didn't match: <" + str + "> !=" + ((Object) stringBuffer));
        }
        throw new SSLException(ff$$ExternalSyntheticOutline0.m("Certificate for <", str, "> doesn't contain CN or DNS subjectAlt"));
    }
}
