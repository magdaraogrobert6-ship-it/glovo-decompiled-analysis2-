package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.huawei.hms.framework.common.ExceptionCode;
import kotlin.time.InstantParseResult$Failure;
import o.accesscontainsPushPermissionPrompt;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class containsPushPermissionPrompt {
    public static final int[] write = {1, 10, 100, 1000, 10000, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength, 1000000, ExceptionCode.CRASH_EXCEPTION, 100000000, 1000000000};
    public static final int[] serializer = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] IconCompatParcelizer = {3, 6};
    public static final int[] RemoteActionCompatParcelizer = {1, 2, 4, 5, 7, 8};

    public static final BrazeInAppMessageManagerunregisterInAppMessageManager2 serializer(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        char cCharAt;
        char cCharAt2;
        if (str.length() == 0) {
            return new InstantParseResult$Failure("An empty string is not a valid Instant", str);
        }
        int i7 = 0;
        char cCharAt3 = str.charAt(0);
        if (cCharAt3 == '+' || cCharAt3 == '-') {
            i = 1;
        } else {
            i = 0;
            cCharAt3 = ' ';
        }
        int iCharAt = 0;
        int i8 = i;
        while (i8 < str.length() && '0' <= (cCharAt2 = str.charAt(i8)) && cCharAt2 < ':') {
            iCharAt = (iCharAt * 10) + (str.charAt(i8) - '0');
            i8++;
        }
        int i9 = i8 - i;
        if (i9 > 10) {
            return read(str, "Expected at most 10 digits for the year number, got " + i9 + " digits");
        }
        if (i9 == 10 && removeNodeAtDepth.serializer(str.charAt(i), 50) >= 0) {
            return read(str, "Expected at most 9 digits for the year number or year 1000000000, got " + i9 + " digits");
        }
        if (i9 < 4) {
            return read(str, "The year number must be padded to 4 digits, got " + i9 + " digits");
        }
        if (cCharAt3 == '+' && i9 == 4) {
            return read(str, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (cCharAt3 == ' ' && i9 != 4) {
            return read(str, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        if (cCharAt3 == '-') {
            iCharAt = -iCharAt;
        }
        int i10 = i8 + 16;
        if (str.length() < i10) {
            return read(str, "The input string is too short");
        }
        InstantParseResult$Failure instantParseResult$FailureRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str, "'-'", i8, new BrazeInAppMessageManagerExternalSyntheticLambda45(i7));
        if (instantParseResult$FailureRemoteActionCompatParcelizer != null) {
            return instantParseResult$FailureRemoteActionCompatParcelizer;
        }
        InstantParseResult$Failure instantParseResult$FailureRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(str, "'-'", i8 + 3, new BrazeInAppMessageManagerExternalSyntheticLambda45(26));
        if (instantParseResult$FailureRemoteActionCompatParcelizer2 != null) {
            return instantParseResult$FailureRemoteActionCompatParcelizer2;
        }
        InstantParseResult$Failure instantParseResult$FailureRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(str, "'T' or 't'", i8 + 6, new BrazeInAppMessageManagerExternalSyntheticLambda45(27));
        if (instantParseResult$FailureRemoteActionCompatParcelizer3 != null) {
            return instantParseResult$FailureRemoteActionCompatParcelizer3;
        }
        InstantParseResult$Failure instantParseResult$FailureRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(str, "':'", i8 + 9, new BrazeInAppMessageManagerExternalSyntheticLambda45(28));
        if (instantParseResult$FailureRemoteActionCompatParcelizer4 != null) {
            return instantParseResult$FailureRemoteActionCompatParcelizer4;
        }
        InstantParseResult$Failure instantParseResult$FailureRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(str, "':'", i8 + 12, new BrazeInAppMessageManagerExternalSyntheticLambda45(29));
        if (instantParseResult$FailureRemoteActionCompatParcelizer5 != null) {
            return instantParseResult$FailureRemoteActionCompatParcelizer5;
        }
        int i11 = 0;
        while (i11 < 10) {
            InstantParseResult$Failure instantParseResult$FailureRemoteActionCompatParcelizer6 = RemoteActionCompatParcelizer(str, "an ASCII digit", serializer[i11] + i8, new BrazeInAppMessageManagerCompanion(i7));
            if (instantParseResult$FailureRemoteActionCompatParcelizer6 != null) {
                return instantParseResult$FailureRemoteActionCompatParcelizer6;
            }
            i11++;
            i7 = 0;
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i8 + 1, str);
        int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(i8 + 4, str);
        int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(i8 + 7, str);
        int iRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(i8 + 10, str);
        int iRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(i8 + 13, str);
        int i12 = i8 + 15;
        if (str.charAt(i12) == '.') {
            i12 = i10;
            int iCharAt2 = 0;
            while (i12 < str.length() && '0' <= (cCharAt = str.charAt(i12)) && cCharAt < ':') {
                iCharAt2 = (iCharAt2 * 10) + (str.charAt(i12) - '0');
                i12++;
            }
            int i13 = i12 - i10;
            if (1 > i13 || i13 >= 10) {
                return read(str, "1..9 digits are supported for the fraction of the second, got " + i13 + " digits");
            }
            i2 = iCharAt2 * write[9 - i13];
        } else {
            i2 = 0;
        }
        if (i12 >= str.length()) {
            return read(str, "The UTC offset at the end of the string is missing");
        }
        char cCharAt4 = str.charAt(i12);
        if (cCharAt4 == '+' || cCharAt4 == '-') {
            int length = str.length() - i12;
            if (length > 9) {
                return read(str, "The UTC offset string \"" + serializer(16, str.subSequence(i12, str.length()).toString()) + "\" is too long");
            }
            if (length % 3 != 0) {
                return read(str, "Invalid UTC offset string \"" + str.subSequence(i12, str.length()).toString() + '\"');
            }
            int i14 = 0;
            for (int i15 = 2; i14 < i15; i15 = 2) {
                int i16 = i12 + IconCompatParcelizer[i14];
                if (i16 >= str.length()) {
                    break;
                }
                if (str.charAt(i16) != ':') {
                    StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i16, "Expected ':' at index ", ", got '");
                    sbM.append(str.charAt(i16));
                    sbM.append('\'');
                    return read(str, sbM.toString());
                }
                i14++;
            }
            for (int i17 = 0; i17 < 6 && (i5 = RemoteActionCompatParcelizer[i17] + i12) < str.length(); i17++) {
                char cCharAt5 = str.charAt(i5);
                if ('0' > cCharAt5 || cCharAt5 >= ':') {
                    StringBuilder sbM2 = ff$$ExternalSyntheticOutline0.m(i5, "Expected an ASCII digit at index ", ", got '");
                    sbM2.append(str.charAt(i5));
                    sbM2.append('\'');
                    return read(str, sbM2.toString());
                }
            }
            int iRemoteActionCompatParcelizer6 = RemoteActionCompatParcelizer(i12 + 1, str);
            int iRemoteActionCompatParcelizer7 = length > 3 ? RemoteActionCompatParcelizer(i12 + 4, str) : 0;
            int iRemoteActionCompatParcelizer8 = length > 6 ? RemoteActionCompatParcelizer(i12 + 7, str) : 0;
            if (iRemoteActionCompatParcelizer7 > 59) {
                return read(str, "Expected offset-minute-of-hour in 0..59, got " + iRemoteActionCompatParcelizer7);
            }
            if (iRemoteActionCompatParcelizer8 > 59) {
                return read(str, "Expected offset-second-of-minute in 0..59, got " + iRemoteActionCompatParcelizer8);
            }
            if (iRemoteActionCompatParcelizer6 > 17 && (iRemoteActionCompatParcelizer6 != 18 || iRemoteActionCompatParcelizer7 != 0 || iRemoteActionCompatParcelizer8 != 0)) {
                return read(str, "Expected an offset in -18:00..+18:00, got " + str.subSequence(i12, str.length()).toString());
            }
            i3 = ((iRemoteActionCompatParcelizer7 * 60) + (iRemoteActionCompatParcelizer6 * DateTimeConstants.SECONDS_PER_HOUR) + iRemoteActionCompatParcelizer8) * (cCharAt4 == '-' ? -1 : 1);
            i4 = 1;
        } else {
            if (cCharAt4 != 'Z' && cCharAt4 != 'z') {
                return read(str, "Expected the UTC offset at position " + i12 + ", got '" + cCharAt4 + '\'');
            }
            int i18 = i12 + 1;
            if (str.length() != i18) {
                return read(str, "Extra text after the instant at position " + i18);
            }
            i4 = 1;
            i3 = 0;
        }
        if (i4 > iRemoteActionCompatParcelizer || iRemoteActionCompatParcelizer >= 13) {
            return read(str, "Expected a month number in 1..12, got " + iRemoteActionCompatParcelizer);
        }
        if (i4 <= iRemoteActionCompatParcelizer2) {
            int i19 = iCharAt & 3;
            if (i19 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) {
                i6 = 2;
                z = false;
            } else {
                i6 = 2;
                z = true;
            }
            if (iRemoteActionCompatParcelizer2 <= (iRemoteActionCompatParcelizer != i6 ? (iRemoteActionCompatParcelizer == 4 || iRemoteActionCompatParcelizer == 6 || iRemoteActionCompatParcelizer == 9 || iRemoteActionCompatParcelizer == 11) ? 30 : 31 : z ? 29 : 28)) {
                if (iRemoteActionCompatParcelizer3 > 23) {
                    return read(str, "Expected hour in 0..23, got " + iRemoteActionCompatParcelizer3);
                }
                if (iRemoteActionCompatParcelizer4 > 59) {
                    return read(str, "Expected minute-of-hour in 0..59, got " + iRemoteActionCompatParcelizer4);
                }
                if (iRemoteActionCompatParcelizer5 > 59) {
                    return read(str, "Expected second-of-minute in 0..59, got " + iRemoteActionCompatParcelizer5);
                }
                long j = iCharAt;
                long j2 = 365 * j;
                final int i20 = i2;
                long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (((iRemoteActionCompatParcelizer * 367) - 362) / 12)) + ((long) (iRemoteActionCompatParcelizer2 - 1));
                if (iRemoteActionCompatParcelizer > 2) {
                    j3 = (i19 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? j3 - 2 : j3 - 1;
                }
                final long j4 = (((j3 - 719528) * ConstantsKt.DEFAULT_PROFILE_TTL) + ((long) (((iRemoteActionCompatParcelizer4 * 60) + (iRemoteActionCompatParcelizer3 * DateTimeConstants.SECONDS_PER_HOUR)) + iRemoteActionCompatParcelizer5))) - ((long) i3);
                return new BrazeInAppMessageManagerunregisterInAppMessageManager2(j4, i20) { // from class: kotlin.time.InstantParseResult$Success
                    public final long IconCompatParcelizer;
                    public final int serializer;

                    @Override // o.BrazeInAppMessageManagerunregisterInAppMessageManager2
                    public final accesscontainsPushPermissionPrompt IconCompatParcelizer() {
                        accesscontainsPushPermissionPrompt accesscontainspushpermissionprompt = accesscontainsPushPermissionPrompt.RemoteActionCompatParcelizer;
                        accesscontainsPushPermissionPrompt accesscontainspushpermissionprompt2 = accesscontainsPushPermissionPrompt.RemoteActionCompatParcelizer;
                        long j5 = accesscontainspushpermissionprompt2.IconCompatParcelizer;
                        long j6 = this.IconCompatParcelizer;
                        if (j6 >= j5) {
                            accesscontainsPushPermissionPrompt accesscontainspushpermissionprompt3 = accesscontainsPushPermissionPrompt.write;
                            if (j6 <= accesscontainspushpermissionprompt3.IconCompatParcelizer) {
                                long j7 = this.serializer;
                                long j8 = j7 / 1000000000;
                                if ((j7 ^ 1000000000) < 0 && j8 * 1000000000 != j7) {
                                    j8--;
                                }
                                long j9 = j6 + j8;
                                if ((j6 ^ j9) < 0 && (j8 ^ j6) >= 0) {
                                    return j6 > 0 ? accesscontainspushpermissionprompt3 : accesscontainspushpermissionprompt2;
                                }
                                if (j9 >= -31557014167219200L) {
                                    if (j9 <= 31556889864403199L) {
                                        long j10 = j7 % 1000000000;
                                        return new accesscontainsPushPermissionPrompt(j9, (int) (j10 + (((((-j10) | j10) & (j10 ^ 1000000000)) >> 63) & 1000000000)));
                                    }
                                }
                            }
                        }
                        throw new InstantFormatException("The parsed date is outside the range representable by Instant (Unix epoch second " + j6 + ')');
                    }

                    {
                        this.IconCompatParcelizer = j4;
                        this.serializer = i20;
                    }
                };
            }
        }
        StringBuilder sbM3 = m1$$ExternalSyntheticOutline0.m(iRemoteActionCompatParcelizer, iCharAt, "Expected a valid day-of-month for month ", " of year ", ", got ");
        sbM3.append(iRemoteActionCompatParcelizer2);
        return read(str, sbM3.toString());
    }

    public static final String read(accesscontainsPushPermissionPrompt accesscontainspushpermissionprompt) {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        accesscontainspushpermissionprompt.getClass();
        long j2 = accesscontainspushpermissionprompt.IconCompatParcelizer;
        long j3 = j2 / ConstantsKt.DEFAULT_PROFILE_TTL;
        if ((j2 ^ ConstantsKt.DEFAULT_PROFILE_TTL) < 0 && j3 * ConstantsKt.DEFAULT_PROFILE_TTL != j2) {
            j3--;
        }
        long j4 = j2 % ConstantsKt.DEFAULT_PROFILE_TTL;
        int i = (int) (j4 + (ConstantsKt.DEFAULT_PROFILE_TTL & ((((-j4) | j4) & (j4 ^ ConstantsKt.DEFAULT_PROFILE_TTL)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((j5 * 400) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (j7 * 365)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i2 = (int) j8;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 * 306) + 5) / 10;
        int i5 = (int) (j7 + j + ((long) (i3 / 10)));
        int i6 = i / DateTimeConstants.SECONDS_PER_HOUR;
        int i7 = i - (i6 * DateTimeConstants.SECONDS_PER_HOUR);
        int i8 = i7 / 60;
        int i9 = accesscontainspushpermissionprompt.serializer;
        int i10 = 0;
        if (Math.abs(i5) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i5 >= 0) {
                sb2.append(i5 + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i5 - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i5 >= 10000) {
                sb.append('+');
            }
            sb.append(i5);
        }
        sb.append('-');
        write(sb, sb, ((i3 + 2) % 12) + 1);
        sb.append('-');
        write(sb, sb, (i2 - i4) + 1);
        sb.append('T');
        write(sb, sb, i6);
        sb.append(':');
        write(sb, sb, i8);
        sb.append(':');
        write(sb, sb, i7 - (i8 * 60));
        if (i9 != 0) {
            sb.append('.');
            while (true) {
                int i11 = i10 + 1;
                iArr = write;
                if (i9 % iArr[i11] != 0) {
                    break;
                }
                i10 = i11;
            }
            int i12 = i10 - (i10 % 3);
            String strValueOf = String.valueOf((i9 / iArr[i12]) + iArr[9 - i12]);
            strValueOf.getClass();
            sb.append(strValueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }

    public static final InstantParseResult$Failure read(String str, String str2) {
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(str2, " when parsing an Instant from \"");
        sbM.append(serializer(64, str));
        sbM.append('\"');
        return new InstantParseResult$Failure(sbM.toString(), str);
    }

    public static final String serializer(int i, String str) {
        if (str.length() <= i) {
            return str.toString();
        }
        return str.subSequence(0, i).toString() + "...";
    }

    public static final void write(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }

    public static final InstantParseResult$Failure RemoteActionCompatParcelizer(String str, String str2, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        char cCharAt = str.charAt(i);
        if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return read(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i);
    }

    public static final int RemoteActionCompatParcelizer(int i, String str) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }
}
