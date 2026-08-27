package o;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class isHtmlInAppMessageApplyWindowInsetsEnabled {
    public static final char[] IconCompatParcelizer = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final List RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public final String toString() {
        return this.MediaBrowserCompatMediaItem;
    }

    public static ArrayList serializer(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    public final String IconCompatParcelizer() {
        int length = this.serializer.length();
        String str = this.MediaBrowserCompatMediaItem;
        int iIndexOf = str.indexOf(47, length + 3);
        return str.substring(iIndexOf, r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(iIndexOf, str, str.length(), "?#"));
    }

    public final URI MediaMetadataCompat() {
        String strSubstring;
        isGeofencesEnabled isgeofencesenabled = new isGeofencesEnabled();
        String str = this.serializer;
        isgeofencesenabled.IconCompatParcelizer = str;
        isgeofencesenabled.write = read();
        isgeofencesenabled.serializer = serializer();
        isgeofencesenabled.read = this.write;
        int iWrite = write(str);
        int i = this.MediaMetadataCompat;
        if (i == iWrite) {
            i = -1;
        }
        isgeofencesenabled.RemoteActionCompatParcelizer = i;
        ArrayList arrayList = isgeofencesenabled.MediaMetadataCompat;
        arrayList.clear();
        arrayList.addAll(RemoteActionCompatParcelizer());
        String strWrite = write();
        isgeofencesenabled.MediaDescriptionCompat = strWrite != null ? serializer(write(strWrite, 0, strWrite.length(), " \"'<>#", true, false, true, true)) : null;
        if (this.MediaDescriptionCompat == null) {
            strSubstring = null;
        } else {
            String str2 = this.MediaBrowserCompatMediaItem;
            strSubstring = str2.substring(str2.indexOf(35) + 1);
        }
        isgeofencesenabled.MediaBrowserCompatMediaItem = strSubstring;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str3 = (String) arrayList.get(i2);
            arrayList.set(i2, write(str3, 0, str3.length(), "[]", true, true, false, true));
        }
        ArrayList arrayList2 = isgeofencesenabled.MediaDescriptionCompat;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str4 = (String) isgeofencesenabled.MediaDescriptionCompat.get(i3);
                if (str4 != null) {
                    isgeofencesenabled.MediaDescriptionCompat.set(i3, write(str4, 0, str4.length(), "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str5 = isgeofencesenabled.MediaBrowserCompatMediaItem;
        if (str5 != null) {
            isgeofencesenabled.MediaBrowserCompatMediaItem = write(str5, 0, str5.length(), " \"#<>\\^`{|}", true, true, false, false);
        }
        String string = isgeofencesenabled.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                DrawableTransformation.read((Throwable) e);
                return null;
            }
        }
    }

    public final ArrayList RemoteActionCompatParcelizer() {
        int length = this.serializer.length();
        String str = this.MediaBrowserCompatMediaItem;
        int iIndexOf = str.indexOf(47, length + 3);
        int i = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(iIndexOf, str, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < i) {
            int i2 = iIndexOf + 1;
            int i3 = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read('/', i2, i, str);
            arrayList.add(str.substring(i2, i3));
            iIndexOf = i3;
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.MediaBrowserCompatMediaItem.hashCode();
    }

    public final String read() {
        if (this.read.isEmpty()) {
            return "";
        }
        int length = this.serializer.length() + 3;
        String str = this.MediaBrowserCompatMediaItem;
        return str.substring(length, r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(length, str, str.length(), ":@"));
    }

    public final String serializer() {
        if (this.RemoteActionCompatParcelizer.isEmpty()) {
            return "";
        }
        int length = this.serializer.length();
        String str = this.MediaBrowserCompatMediaItem;
        return str.substring(str.indexOf(58, length + 3) + 1, str.indexOf(64));
    }

    public isHtmlInAppMessageApplyWindowInsetsEnabled(isGeofencesEnabled isgeofencesenabled) {
        this.serializer = isgeofencesenabled.IconCompatParcelizer;
        String str = isgeofencesenabled.write;
        this.read = read(str, false, 0, str.length());
        String str2 = isgeofencesenabled.serializer;
        this.RemoteActionCompatParcelizer = read(str2, false, 0, str2.length());
        this.write = isgeofencesenabled.read;
        int i = isgeofencesenabled.RemoteActionCompatParcelizer;
        this.MediaMetadataCompat = i == -1 ? write(isgeofencesenabled.IconCompatParcelizer) : i;
        write(isgeofencesenabled.MediaMetadataCompat, false);
        ArrayList arrayList = isgeofencesenabled.MediaDescriptionCompat;
        this.RatingCompat = arrayList != null ? write(arrayList, true) : null;
        String str3 = isgeofencesenabled.MediaBrowserCompatMediaItem;
        this.MediaDescriptionCompat = str3 != null ? read(str3, false, 0, str3.length()) : null;
        this.MediaBrowserCompatMediaItem = isgeofencesenabled.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof isHtmlInAppMessageApplyWindowInsetsEnabled) && ((isHtmlInAppMessageApplyWindowInsetsEnabled) obj).MediaBrowserCompatMediaItem.equals(this.MediaBrowserCompatMediaItem);
    }

    public final String write() {
        if (this.RatingCompat == null) {
            return null;
        }
        String str = this.MediaBrowserCompatMediaItem;
        int iIndexOf = str.indexOf(63) + 1;
        return str.substring(iIndexOf, r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read('#', iIndexOf, str.length(), str));
    }

    public static String write(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        String str3;
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z4) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z && (!z2 || read(iCharCount, i2, str)))) && (iCodePointAt != 43 || !z3)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
                r8lambdabeyrnr8p6809bwlboro_stans.RemoteActionCompatParcelizer(i, iCharCount, str);
                r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans2 = null;
                while (iCharCount < i2) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z3) {
                            if (z) {
                                str3 = "+";
                            } else {
                                str3 = "%2B";
                            }
                            r8lambdabeyrnr8p6809bwlboro_stans.RemoteActionCompatParcelizer(0, str3.length(), str3);
                        } else if (iCodePointAt2 >= 32 && iCodePointAt2 != 127 && ((iCodePointAt2 < 128 || !z4) && str2.indexOf(iCodePointAt2) == -1 && (iCodePointAt2 != 37 || (z && (!z2 || read(iCharCount, i2, str)))))) {
                            r8lambdabeyrnr8p6809bwlboro_stans.serializer(iCodePointAt2);
                        } else {
                            if (r8lambdabeyrnr8p6809bwlboro_stans2 == null) {
                                r8lambdabeyrnr8p6809bwlboro_stans2 = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
                            }
                            r8lambdabeyrnr8p6809bwlboro_stans2.serializer(iCodePointAt2);
                            while (!r8lambdabeyrnr8p6809bwlboro_stans2.MediaSessionCompatResultReceiverWrapper()) {
                                byte bMediaBrowserCompatMediaItem = r8lambdabeyrnr8p6809bwlboro_stans2.MediaBrowserCompatMediaItem();
                                r8lambdabeyrnr8p6809bwlboro_stans.write(37);
                                char[] cArr = IconCompatParcelizer;
                                r8lambdabeyrnr8p6809bwlboro_stans.write((int) cArr[((bMediaBrowserCompatMediaItem & 255) >> 4) & 15]);
                                r8lambdabeyrnr8p6809bwlboro_stans.write((int) cArr[bMediaBrowserCompatMediaItem & 15]);
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return r8lambdabeyrnr8p6809bwlboro_stans.RemoteActionCompatParcelizer();
            }
        }
        return str.substring(i, i2);
    }

    public static List write(ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            arrayList2.add(str != null ? read(str, z, 0, str.length()) : null);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    public static String read(String str, boolean z, int i, int i2) {
        int i3;
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
                r8lambdabeyrnr8p6809bwlboro_stans.RemoteActionCompatParcelizer(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i3 = iCharCount + 2) < i2) {
                        int iIconCompatParcelizer = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.IconCompatParcelizer(str.charAt(iCharCount + 1));
                        int iIconCompatParcelizer2 = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.IconCompatParcelizer(str.charAt(i3));
                        if (iIconCompatParcelizer != -1 && iIconCompatParcelizer2 != -1) {
                            r8lambdabeyrnr8p6809bwlboro_stans.write((iIconCompatParcelizer << 4) + iIconCompatParcelizer2);
                            iCharCount = i3;
                        } else {
                            r8lambdabeyrnr8p6809bwlboro_stans.serializer(iCodePointAt);
                        }
                    } else if (iCodePointAt == 43 && z) {
                        r8lambdabeyrnr8p6809bwlboro_stans.write(32);
                    } else {
                        r8lambdabeyrnr8p6809bwlboro_stans.serializer(iCodePointAt);
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                return r8lambdabeyrnr8p6809bwlboro_stans.RemoteActionCompatParcelizer();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    public static boolean read(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.IconCompatParcelizer(str.charAt(i + 1)) != -1 && r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.IconCompatParcelizer(str.charAt(i3)) != -1;
    }

    public static int write(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(com.adjust.sdk.Constants.SCHEME) ? 443 : -1;
    }
}
