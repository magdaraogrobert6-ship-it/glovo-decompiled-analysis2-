package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class resumeWebviewIfNecessaryandroid_sdk_ui_release extends requestDisplayInAppMessage {
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    public static final boolean MediaBrowserCompatMediaItem(String str) {
        boolean z;
        int i;
        boolean z2;
        String str2;
        int i2;
        boolean z3;
        int length = str.length() - 1;
        int i3 = 0;
        while (i3 <= length && str.charAt(i3) <= ' ') {
            i3++;
        }
        if (i3 > length) {
            return false;
        }
        while (length > i3 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i3) == '+' || str.charAt(i3) == '-') {
            i3++;
        }
        if (i3 > length) {
            return false;
        }
        if (str.charAt(i3) != '0') {
            z = false;
        } else {
            int i4 = i3 + 1;
            if (i4 > length) {
                return true;
            }
            if ((str.charAt(i4) | ' ') == 120) {
                int i5 = i3 + 2;
                int i6 = i5;
                while (i6 <= length) {
                    char cCharAt = str.charAt(i6);
                    if (((cCharAt - '0') & 65535) >= 10 && (((cCharAt | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i6++;
                }
                boolean z4 = i5 != i6;
                if (i6 <= length) {
                    if (str.charAt(i6) == '.') {
                        int i7 = i6 + 1;
                        i2 = i7;
                        while (i2 <= length) {
                            char cCharAt2 = str.charAt(i2);
                            if (((cCharAt2 - '0') & 65535) >= 10 && (((cCharAt2 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i2++;
                        }
                        if (i7 != i2) {
                            z3 = true;
                        }
                        if (!z4 || z3) {
                            i3 = i2;
                        } else {
                            i3 = -1;
                        }
                    } else {
                        i2 = i6;
                    }
                    z3 = false;
                    if (z4) {
                    }
                    i3 = i2;
                } else {
                    i3 = -1;
                }
                if (i3 == -1 || i3 > length) {
                    return false;
                }
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            int i8 = i3;
            while (i8 <= length && ((str.charAt(i8) - '0') & 65535) < 10) {
                i8++;
            }
            boolean z5 = i3 != i8;
            if (i8 > length) {
                i3 = i8;
            } else {
                if (str.charAt(i8) == '.') {
                    int i9 = i8 + 1;
                    i = i9;
                    while (i <= length && ((str.charAt(i) - '0') & 65535) < 10) {
                        i++;
                    }
                    if (i9 != i) {
                        z2 = true;
                    } else {
                        i8 = i;
                        i = i8;
                        z2 = false;
                    }
                } else {
                    i = i8;
                    z2 = false;
                }
                if (z5 || z2) {
                    i3 = i;
                } else {
                    if (length == i + 2) {
                        str2 = "NaN";
                    } else {
                        str2 = length == i + 7 ? "Infinity" : null;
                    }
                    i3 = (str2 != null && hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer((CharSequence) str, str2, i, false) == i) ? length + 1 : -1;
                }
            }
            if (i3 == -1) {
                return false;
            }
            if (i3 > length) {
                return true;
            }
        }
        int i10 = i3 + 1;
        int iCharAt = str.charAt(i3) | ' ';
        if (iCharAt != (z ? 112 : 101)) {
            return !z && (iCharAt == 102 || iCharAt == 100) && i10 > length;
        }
        if (i10 > length) {
            return false;
        }
        if ((str.charAt(i10) == '+' || str.charAt(i10) == '-') && (i10 = i3 + 2) > length) {
            return false;
        }
        while (i10 <= length && ((str.charAt(i10) - '0') & 65535) < 10) {
            i10++;
        }
        if (i10 > length) {
            return true;
        }
        if (i10 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i10) | ' ';
        return iCharAt2 == 102 || iCharAt2 == 100;
    }

    public static Double MediaMetadataCompat(String str) {
        str.getClass();
        try {
            if (MediaBrowserCompatMediaItem(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
