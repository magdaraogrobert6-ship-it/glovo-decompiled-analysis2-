package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setHeightOnViewLayoutParams {
    public static final char[] read = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final boolean RemoteActionCompatParcelizer(int i, int i2, String str) {
        str.getClass();
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(str.charAt(i + 1)) != -1 && InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(str.charAt(i3)) != -1;
    }

    public static String serializer(String str, int i, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        str.getClass();
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
                registryMissingComponentException.IconCompatParcelizer(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iRemoteActionCompatParcelizer = InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(str.charAt(iCharCount + 1));
                        int iRemoteActionCompatParcelizer2 = InAppMessageHtmlBaseViewCompanion.RemoteActionCompatParcelizer(str.charAt(i4));
                        if (iRemoteActionCompatParcelizer != -1 && iRemoteActionCompatParcelizer2 != -1) {
                            registryMissingComponentException.read((iRemoteActionCompatParcelizer << 4) + iRemoteActionCompatParcelizer2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        } else {
                            registryMissingComponentException.RatingCompat(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    } else if (iCodePointAt == 43 && z) {
                        registryMissingComponentException.read(32);
                        iCharCount++;
                    } else {
                        registryMissingComponentException.RatingCompat(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return registryMissingComponentException.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    public static String RemoteActionCompatParcelizer(String str, int i, int i2, int i3, String str2) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        int i5 = i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        str.getClass();
        return write(str, i4, i5, str2, z, z2, z3, z4, androidx.compose.ui.graphics.Fields.SpotShadowColor);
    }

    public static String write(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 64) == 0 ? z4 : false;
        str.getClass();
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 43;
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || z7) && !hideCurrentlyDisplayingInAppMessage.read(str2, (char) iCodePointAt) && ((iCodePointAt != 37 || (z5 && (!z6 || RemoteActionCompatParcelizer(iCharCount, length, str)))) && (iCodePointAt != 43 || !z3)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
                registryMissingComponentException.IconCompatParcelizer(i4, iCharCount, str);
                RegistryMissingComponentException registryMissingComponentException2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        String str3 = "+";
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            registryMissingComponentException.IconCompatParcelizer("+");
                        } else if (iCodePointAt2 == i5 && z3) {
                            if (!z5) {
                                str3 = "%2B";
                            }
                            registryMissingComponentException.IconCompatParcelizer(str3);
                        } else if (iCodePointAt2 >= 32 && iCodePointAt2 != 127 && ((iCodePointAt2 < 128 || z7) && !hideCurrentlyDisplayingInAppMessage.read(str2, (char) iCodePointAt2) && (iCodePointAt2 != 37 || (z5 && (!z6 || RemoteActionCompatParcelizer(iCharCount, length, str)))))) {
                            registryMissingComponentException.RatingCompat(iCodePointAt2);
                        } else {
                            if (registryMissingComponentException2 == null) {
                                registryMissingComponentException2 = new RegistryMissingComponentException();
                            }
                            registryMissingComponentException2.RatingCompat(iCodePointAt2);
                            while (!registryMissingComponentException2.RatingCompat()) {
                                byte bMediaBrowserCompatMediaItem = registryMissingComponentException2.MediaBrowserCompatMediaItem();
                                registryMissingComponentException.read(37);
                                char[] cArr = read;
                                registryMissingComponentException.read((int) cArr[((bMediaBrowserCompatMediaItem & 255) >> 4) & 15]);
                                registryMissingComponentException.read((int) cArr[bMediaBrowserCompatMediaItem & 15]);
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 43;
                }
                return registryMissingComponentException.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            }
        }
        return str.substring(i4, length);
    }
}
