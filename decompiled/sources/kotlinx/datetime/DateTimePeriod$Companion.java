package kotlinx.datetime;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.TuplesKt;
import o.getShouldNextUnregisterBeSkipped;
import o.setBackButtonDismissesInAppMessageView;
import o.setCarryoverInAppMessage;
import o.setClickOutsideModalViewDismissInAppMessageView;
import o.setGraphicModalMaxHeightDp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
public final class DateTimePeriod$Companion {
    public final setGraphicModalMaxWidthDp serializer() {
        return setGraphicModalMaxHeightDp.read;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:118:0x0201  */
    /* JADX WARN: Code duplicated, block: B:123:0x0213  */
    /* JADX WARN: Code duplicated, block: B:125:0x0217  */
    /* JADX WARN: Code duplicated, block: B:127:0x021a  */
    /* JADX WARN: Code duplicated, block: B:129:0x021e  */
    /* JADX WARN: Code duplicated, block: B:132:0x022c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0231  */
    /* JADX WARN: Code duplicated, block: B:138:0x023f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0243  */
    /* JADX WARN: Code duplicated, block: B:142:0x0246  */
    /* JADX WARN: Code duplicated, block: B:145:0x0252  */
    /* JADX WARN: Code duplicated, block: B:147:0x0256  */
    /* JADX WARN: Code duplicated, block: B:149:0x0259  */
    /* JADX WARN: Code duplicated, block: B:152:0x026a  */
    /* JADX WARN: Code duplicated, block: B:154:0x026e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0281  */
    /* JADX WARN: Code duplicated, block: B:163:0x0287  */
    /* JADX WARN: Code duplicated, block: B:169:0x029a  */
    /* JADX WARN: Code duplicated, block: B:176:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:186:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:188:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:222:0x0341 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0325 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:186:0x02c9, please report this as an issue */
    public static setBackButtonDismissesInAppMessageView write(String str) {
        int i;
        int i2;
        int i3;
        char cCharAt;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        char upperCase;
        int i8;
        int i9;
        int i10;
        char c;
        char cCharAt2;
        char c2;
        char cCharAt3;
        int i11;
        str.getClass();
        int i12 = 0;
        int i13 = 0;
        char c3 = 0;
        int iRemoteActionCompatParcelizer = 0;
        int iRemoteActionCompatParcelizer2 = 0;
        int i14 = 0;
        int iRemoteActionCompatParcelizer3 = 0;
        int iRemoteActionCompatParcelizer4 = 0;
        int iRemoteActionCompatParcelizer5 = 0;
        int iRemoteActionCompatParcelizer6 = 0;
        int iRemoteActionCompatParcelizer7 = 0;
        int i15 = 1;
        while (i13 < str.length()) {
            if (c3 == 0) {
                i = i13 + 1;
                if (i >= str.length() && (str.charAt(i13) == '+' || str.charAt(i13) == '-')) {
                    serializer(i13, "Unexpected end of string; 'P' designator is required");
                    throw null;
                }
                char cCharAt4 = str.charAt(i13);
                if (cCharAt4 == '+' || cCharAt4 == '-') {
                    if (str.charAt(i13) == '-') {
                        i15 = -1;
                    }
                    if (str.charAt(i) != 'P') {
                        serializer(i, "Expected 'P', got '" + str.charAt(i) + '\'');
                        throw null;
                    }
                    i = i13 + 2;
                } else if (cCharAt4 != 'P') {
                    serializer(i13, "Expected '+', '-', 'P', got '" + str.charAt(i13) + '\'');
                    throw null;
                }
                c3 = 1;
            } else {
                char cCharAt5 = str.charAt(i13);
                if (cCharAt5 == '+' || cCharAt5 == '-') {
                    i2 = str.charAt(i13) == '-' ? i15 * (-1) : i15;
                    i3 = i13 + 1;
                    if (i3 >= str.length() || '0' > (cCharAt = str.charAt(i3)) || cCharAt >= ':') {
                        serializer(i3, "A number expected after '" + str.charAt(i3) + '\'');
                        throw null;
                    }
                    i4 = iRemoteActionCompatParcelizer2;
                    i5 = iRemoteActionCompatParcelizer;
                    long jAddExact = 0;
                    while (true) {
                        if (i3 < str.length()) {
                            i6 = i15;
                            break;
                        }
                        cCharAt3 = str.charAt(i3);
                        i6 = i15;
                        if ('0' > cCharAt3) {
                            break;
                        }
                        break;
                        break;
                        i3++;
                        i14 = i11;
                        i15 = i6;
                    }
                    i7 = i14;
                    j = jAddExact * ((long) i2);
                    if (i3 != str.length()) {
                        serializer(i3, "Expected a designator after the numerical value");
                        throw null;
                    }
                    upperCase = Character.toUpperCase(str.charAt(i3));
                    if (upperCase == 'Y') {
                        c2 = 2;
                        if (c3 < 2) {
                            serializer(i3, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                            throw null;
                        }
                        iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(j, i13, 'Y');
                        iRemoteActionCompatParcelizer2 = i4;
                    } else {
                        if (upperCase == 'M') {
                            if (c3 >= 6) {
                                if (c3 < '\b') {
                                    serializer(i3, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                    throw null;
                                }
                                c = '\b';
                                iRemoteActionCompatParcelizer6 = RemoteActionCompatParcelizer(j, i13, 'M');
                            } else {
                                if (c3 < 3) {
                                    serializer(i3, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                    throw null;
                                }
                                c = 3;
                                iRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(j, i13, 'M');
                            }
                        } else if (upperCase == 'W') {
                            if (upperCase == 'D') {
                                if (upperCase == 'H') {
                                    if (c3 < 7) {
                                    }
                                    serializer(i3, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                    throw null;
                                }
                                if (upperCase == 'S') {
                                    if (c3 < '\t') {
                                    }
                                    serializer(i3, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                    throw null;
                                }
                                if (upperCase != '.') {
                                    serializer(i3, "Expected a designator after the numerical value");
                                    throw null;
                                }
                                i8 = i3 + 1;
                                if (i8 < str.length()) {
                                    serializer(i8, "Expected designator 'S' after " + str.charAt(i3));
                                    throw null;
                                }
                                i9 = i8;
                                while (i9 < str.length()) {
                                    i9++;
                                }
                                i10 = i9 - i8;
                                if (i10 <= 9) {
                                    serializer(i8, "Only the nanosecond fractions of a second are supported");
                                    throw null;
                                }
                                String str2 = str.substring(i8, i9) + setCarryoverInAppMessage.RemoteActionCompatParcelizer(9 - i10, "0");
                                TuplesKt.RemoteActionCompatParcelizer(10);
                                int i16 = Integer.parseInt(str2, 10);
                                if (str.charAt(i9) == 'S') {
                                    serializer(i9, "Expected the 'S' designator after a fraction");
                                    throw null;
                                }
                                if (c3 < '\t') {
                                }
                                serializer(i9, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                throw null;
                                c2 = c;
                                iRemoteActionCompatParcelizer = i5;
                            } else {
                                if (c3 < 5) {
                                    serializer(i3, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                    throw null;
                                }
                                iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(j, i13, 'D');
                                c2 = 5;
                                i14 = i7;
                            }
                            iRemoteActionCompatParcelizer2 = i4;
                            c3 = c2;
                            i = i3 + 1;
                            i15 = i6;
                        } else {
                            if (c3 < 4) {
                                serializer(i3, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                throw null;
                            }
                            iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(j, i13, 'W');
                            c2 = 4;
                        }
                        i14 = i7;
                        c2 = c;
                        iRemoteActionCompatParcelizer = i5;
                        iRemoteActionCompatParcelizer2 = i4;
                        c3 = c2;
                        i = i3 + 1;
                        i15 = i6;
                    }
                    iRemoteActionCompatParcelizer = i5;
                    i14 = i7;
                    c3 = c2;
                    i = i3 + 1;
                    i15 = i6;
                } else if (('0' <= cCharAt5 && cCharAt5 < ':') || cCharAt5 != 'T') {
                    i3 = i13;
                    i2 = i15;
                    i4 = iRemoteActionCompatParcelizer2;
                    i5 = iRemoteActionCompatParcelizer;
                    long jAddExact2 = 0;
                    while (true) {
                        if (i3 < str.length()) {
                            i6 = i15;
                            break;
                        }
                        cCharAt3 = str.charAt(i3);
                        i6 = i15;
                        if ('0' > cCharAt3 || cCharAt3 >= ':') {
                            break;
                        }
                        i11 = i14;
                        try {
                            jAddExact2 = Math.addExact(Math.multiplyExact(jAddExact2, 10L), str.charAt(i3) - '0');
                            i3++;
                            i14 = i11;
                            i15 = i6;
                        } catch (ArithmeticException unused) {
                            serializer(i13, "The number is too large");
                            throw null;
                        }
                    }
                    i7 = i14;
                    j = jAddExact2 * ((long) i2);
                    if (i3 != str.length()) {
                        serializer(i3, "Expected a designator after the numerical value");
                        throw null;
                    }
                    upperCase = Character.toUpperCase(str.charAt(i3));
                    if (upperCase == 'Y') {
                        c2 = 2;
                        if (c3 < 2) {
                            serializer(i3, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                            throw null;
                        }
                        iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(j, i13, 'Y');
                        iRemoteActionCompatParcelizer2 = i4;
                    } else {
                        if (upperCase == 'M') {
                            if (c3 >= 6) {
                                if (c3 < '\b') {
                                    serializer(i3, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                    throw null;
                                }
                                c = '\b';
                                iRemoteActionCompatParcelizer6 = RemoteActionCompatParcelizer(j, i13, 'M');
                            } else {
                                if (c3 < 3) {
                                    serializer(i3, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                    throw null;
                                }
                                c = 3;
                                iRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(j, i13, 'M');
                            }
                        } else if (upperCase == 'W') {
                            if (upperCase == 'D') {
                                if (upperCase == 'H') {
                                    if (c3 < 7 || c3 < 6) {
                                        serializer(i3, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                        throw null;
                                    }
                                    iRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(j, i13, 'H');
                                    c = 7;
                                } else if (upperCase == 'S') {
                                    if (c3 < '\t' || c3 < 6) {
                                        serializer(i3, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                        throw null;
                                    }
                                    c = '\t';
                                    i14 = i7;
                                    iRemoteActionCompatParcelizer7 = RemoteActionCompatParcelizer(j, i13, 'S');
                                } else {
                                    if (upperCase != '.' && upperCase != ',') {
                                        serializer(i3, "Expected a designator after the numerical value");
                                        throw null;
                                    }
                                    i8 = i3 + 1;
                                    if (i8 < str.length()) {
                                        serializer(i8, "Expected designator 'S' after " + str.charAt(i3));
                                        throw null;
                                    }
                                    i9 = i8;
                                    while (i9 < str.length() && '0' <= (cCharAt2 = str.charAt(i9)) && cCharAt2 < ':') {
                                        i9++;
                                    }
                                    i10 = i9 - i8;
                                    if (i10 <= 9) {
                                        serializer(i8, "Only the nanosecond fractions of a second are supported");
                                        throw null;
                                    }
                                    String str3 = str.substring(i8, i9) + setCarryoverInAppMessage.RemoteActionCompatParcelizer(9 - i10, "0");
                                    TuplesKt.RemoteActionCompatParcelizer(10);
                                    int i17 = Integer.parseInt(str3, 10);
                                    if (str.charAt(i9) == 'S') {
                                        serializer(i9, "Expected the 'S' designator after a fraction");
                                        throw null;
                                    }
                                    if (c3 < '\t' || c3 < 6) {
                                        serializer(i9, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                        throw null;
                                    }
                                    iRemoteActionCompatParcelizer7 = RemoteActionCompatParcelizer(j, i13, 'S');
                                    i3 = i9;
                                    c = '\t';
                                    i14 = i17 * i2;
                                }
                                c2 = c;
                                iRemoteActionCompatParcelizer = i5;
                            } else {
                                if (c3 < 5) {
                                    serializer(i3, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                    throw null;
                                }
                                iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(j, i13, 'D');
                                c2 = 5;
                                i14 = i7;
                            }
                            iRemoteActionCompatParcelizer2 = i4;
                            c3 = c2;
                            i = i3 + 1;
                            i15 = i6;
                        } else {
                            if (c3 < 4) {
                                serializer(i3, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                throw null;
                            }
                            iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(j, i13, 'W');
                            c2 = 4;
                        }
                        i14 = i7;
                        c2 = c;
                        iRemoteActionCompatParcelizer = i5;
                        iRemoteActionCompatParcelizer2 = i4;
                        c3 = c2;
                        i = i3 + 1;
                        i15 = i6;
                    }
                    iRemoteActionCompatParcelizer = i5;
                    i14 = i7;
                    c3 = c2;
                    i = i3 + 1;
                    i15 = i6;
                } else {
                    if (c3 >= 6) {
                        serializer(i13, "Only one 'T' designator is allowed");
                        throw null;
                    }
                    i13++;
                    i12 = 0;
                    c3 = 6;
                }
            }
            i13 = i;
            i12 = 0;
        }
        if (c3 == 0) {
            serializer(i13, "Unexpected end of input; 'P' designator is required");
            throw null;
        }
        if (c3 == 6) {
            serializer(i13, "Unexpected end of input; at least one time component is required after 'T'");
            throw null;
        }
        long j2 = ((long) iRemoteActionCompatParcelizer) + ((long) (iRemoteActionCompatParcelizer2 * 7));
        if (-2147483648L > j2 || j2 > 2147483647L) {
            serializer(i12, "The total number of days under 'D' and 'W' designators should fit into an Int");
            throw null;
        }
        int i18 = (int) j2;
        long j3 = i14;
        long j4 = (((long) iRemoteActionCompatParcelizer3) * 12) + ((long) iRemoteActionCompatParcelizer4);
        if (-2147483648L > j4 || j4 > 2147483647L) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer4, "The total number of months in ", " years and ", " months overflows an Int"));
            return null;
        }
        int i19 = (int) j4;
        long j5 = (j3 / 1000000000) + (((((long) iRemoteActionCompatParcelizer5) * 60) + ((long) iRemoteActionCompatParcelizer6)) * 60) + ((long) iRemoteActionCompatParcelizer7);
        try {
            long j6 = j3 % 1000000000;
            if (j5 > 0 && j6 < 0) {
                j5--;
                j6 += 1000000000;
            } else if (j5 < 0 && j6 > 0) {
                j5++;
                j6 -= 1000000000;
            }
            long jAddExact3 = Math.addExact(Math.multiplyExact(j5, 1000000000L), j6);
            return jAddExact3 != 0 ? new getShouldNextUnregisterBeSkipped(i19, i18, jAddExact3) : new setClickOutsideModalViewDismissInAppMessageView(i19, i18);
        } catch (ArithmeticException unused2) {
            StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(iRemoteActionCompatParcelizer5, iRemoteActionCompatParcelizer6, "The total number of nanoseconds in ", " hours, ", " minutes, ");
            sbM.append(iRemoteActionCompatParcelizer7);
            sbM.append(" seconds, and ");
            sbM.append(j3);
            sbM.append(" nanoseconds overflows a Long");
            throw new IllegalArgumentException(sbM.toString());
        }
    }

    public static final void serializer(int i, String str) {
        throw new DateTimeFormatException("Parse error at char " + i + ": " + str);
    }

    public static final int RemoteActionCompatParcelizer(long j, int i, char c) {
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        serializer(i, "Value " + j + " does not fit into an Int, which is required for component '" + c + '\'');
        throw null;
    }
}
