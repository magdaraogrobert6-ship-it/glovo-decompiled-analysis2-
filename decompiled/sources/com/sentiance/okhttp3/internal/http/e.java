package com.sentiance.okhttp3.internal.http;

import com.sentiance.okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import com.sentiance.okio.ByteString;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import o.getLoggerInitialLogLevel;
import o.isAutomaticLocationCollectionEnabled;
import o.isEphemeralEventsEnabled;
import o.isHtmlInAppMessageApplyWindowInsetsEnabled;
import o.r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08;
import o.setShouldPersistWebViewWhenBackgroundingApp;
import o.setTriggerActionMinimumTimeIntervalSeconds;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    static {
        ByteString.IconCompatParcelizer("\"\\");
        ByteString.IconCompatParcelizer("\t ,=");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0 A[PHI: r27
  0x00c0: PHI (r27v1 java.util.List) = (r27v3 java.util.List), (r27v4 java.util.List) binds: [B:43:0x00be, B:32:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2 A[PHI: r27
  0x00c2: PHI (r27v2 java.util.List) = (r27v1 java.util.List), (r27v3 java.util.List), (r27v3 java.util.List), (r27v3 java.util.List), (r27v3 java.util.List) binds: [B:44:0x00c0, B:120:0x01f5, B:122:0x0205, B:124:0x0211, B:213:0x0355] A[DONT_GENERATE, DONT_INLINE]] */
    public static void write(setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds, isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled, isEphemeralEventsEnabled isephemeraleventsenabled) {
        List list;
        String strSubstring;
        String str;
        isAutomaticLocationCollectionEnabled isautomaticlocationcollectionenabled;
        String str2;
        String str3;
        String str4;
        String[] strArrSplit;
        int i;
        int length;
        int length2;
        String string;
        String strSubstring2;
        if (settriggeractionminimumtimeintervalseconds == setTriggerActionMinimumTimeIntervalSeconds.write) {
            return;
        }
        Pattern pattern = isAutomaticLocationCollectionEnabled.write;
        int iIconCompatParcelizer = isephemeraleventsenabled.IconCompatParcelizer();
        int i2 = 0;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < iIconCompatParcelizer; i3++) {
            if ("Set-Cookie".equalsIgnoreCase(isephemeraleventsenabled.read(i3))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(isephemeraleventsenabled.write(i3));
            }
        }
        List listUnmodifiableList = arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
        int size = listUnmodifiableList.size();
        int i4 = 0;
        ArrayList arrayList2 = null;
        while (i4 < size) {
            String str5 = (String) listUnmodifiableList.get(i4);
            long jCurrentTimeMillis = System.currentTimeMillis();
            int length3 = str5.length();
            int i5 = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(';', i2, length3, str5);
            int i6 = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read('=', i2, i5, str5);
            if (i6 == i5) {
                list = listUnmodifiableList;
                isautomaticlocationcollectionenabled = null;
            } else {
                int iRemoteActionCompatParcelizer = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer(i2, i6, str5);
                String strSubstring3 = str5.substring(iRemoteActionCompatParcelizer, r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.serializer(iRemoteActionCompatParcelizer, i6, str5));
                if (strSubstring3.isEmpty()) {
                    list = listUnmodifiableList;
                } else {
                    int length4 = strSubstring3.length();
                    while (true) {
                        if (i2 < length4) {
                            list = listUnmodifiableList;
                            char cCharAt = strSubstring3.charAt(i2);
                            if (cCharAt > 31 && cCharAt < 127) {
                                i2++;
                                listUnmodifiableList = list;
                            } else if (i2 != -1) {
                                i2 = 0;
                            }
                        } else {
                            list = listUnmodifiableList;
                        }
                        int iRemoteActionCompatParcelizer2 = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer(i6 + 1, i5, str5);
                        String strSubstring4 = str5.substring(iRemoteActionCompatParcelizer2, r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.serializer(iRemoteActionCompatParcelizer2, i5, str5));
                        int length5 = strSubstring4.length();
                        int i7 = 0;
                        while (true) {
                            if (i7 < length5) {
                                char cCharAt2 = strSubstring4.charAt(i7);
                                if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                                    if (i7 != -1) {
                                    }
                                    i2 = 0;
                                } else {
                                    i7++;
                                }
                            }
                            int i8 = i5 + 1;
                            boolean z = true;
                            long j = -1;
                            long jSerializer = 253402300799999L;
                            boolean z2 = false;
                            boolean z3 = false;
                            boolean z4 = false;
                            String str6 = null;
                            String str7 = null;
                            while (true) {
                                long j2 = Long.MIN_VALUE;
                                if (i8 < length3) {
                                    int i9 = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(';', i8, length3, str5);
                                    int i10 = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read('=', i8, i9, str5);
                                    int iRemoteActionCompatParcelizer3 = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer(i8, i10, str5);
                                    String strSubstring5 = str5.substring(iRemoteActionCompatParcelizer3, r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.serializer(iRemoteActionCompatParcelizer3, i10, str5));
                                    if (i10 < i9) {
                                        int iRemoteActionCompatParcelizer4 = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer(i10 + 1, i9, str5);
                                        strSubstring2 = str5.substring(iRemoteActionCompatParcelizer4, r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.serializer(iRemoteActionCompatParcelizer4, i9, str5));
                                    } else {
                                        strSubstring2 = "";
                                    }
                                    if (strSubstring5.equalsIgnoreCase("expires")) {
                                        try {
                                            jSerializer = isAutomaticLocationCollectionEnabled.serializer(strSubstring2.length(), strSubstring2);
                                            z4 = true;
                                        } catch (NumberFormatException | IllegalArgumentException unused) {
                                        }
                                    } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                                        try {
                                            long j3 = Long.parseLong(strSubstring2);
                                            j = j3 <= 0 ? j2 : j3;
                                        } catch (NumberFormatException e) {
                                            if (!strSubstring2.matches("-?\\d+")) {
                                                throw e;
                                            }
                                            if (!strSubstring2.startsWith("-")) {
                                                j2 = Long.MAX_VALUE;
                                            }
                                        }
                                        z4 = true;
                                    } else if (strSubstring5.equalsIgnoreCase("domain")) {
                                        if (strSubstring2.endsWith(".")) {
                                            throw new IllegalArgumentException();
                                        }
                                        if (strSubstring2.startsWith(".")) {
                                            strSubstring2 = strSubstring2.substring(1);
                                        }
                                        String str8 = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(strSubstring2);
                                        if (str8 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str6 = str8;
                                        z = false;
                                    } else if (strSubstring5.equalsIgnoreCase("path")) {
                                        str7 = strSubstring2;
                                    } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                        z2 = true;
                                    } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                        z3 = true;
                                    }
                                    i8 = i9 + 1;
                                } else {
                                    if (j == Long.MIN_VALUE) {
                                        jSerializer = Long.MIN_VALUE;
                                    } else if (j != -1) {
                                        long j4 = jCurrentTimeMillis + (j <= 9223372036854775L ? j * 1000 : Long.MAX_VALUE);
                                        if (j4 < jCurrentTimeMillis || j4 > 253402300799999L) {
                                            jSerializer = 253402300799999L;
                                        } else {
                                            jSerializer = j4;
                                        }
                                    }
                                    String str9 = ishtmlinappmessageapplywindowinsetsenabled.write;
                                    String str10 = str6;
                                    if (str10 == null) {
                                        str10 = str9;
                                    } else {
                                        if (str9.equals(str10) || (str9.endsWith(str10) && str9.charAt((str9.length() - str10.length()) - 1) == '.' && !r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.ComponentActivity.matcher(str9).matches())) {
                                        }
                                        i2 = 0;
                                    }
                                    if (str9.length() != str10.length()) {
                                        PublicSuffixDatabase publicSuffixDatabase = PublicSuffixDatabase.IconCompatParcelizer;
                                        publicSuffixDatabase.getClass();
                                        String[] strArrSplit2 = IDN.toUnicode(str10).split("\\.");
                                        if (publicSuffixDatabase.RemoteActionCompatParcelizer.get() || !publicSuffixDatabase.RemoteActionCompatParcelizer.compareAndSet(false, true)) {
                                            try {
                                                publicSuffixDatabase.RatingCompat.await();
                                            } catch (InterruptedException unused2) {
                                                Thread.currentThread().interrupt();
                                            }
                                        } else {
                                            boolean z5 = false;
                                            while (true) {
                                                try {
                                                    try {
                                                        publicSuffixDatabase.serializer();
                                                        break;
                                                    } catch (Throwable th) {
                                                        if (z5) {
                                                            Thread.currentThread().interrupt();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (InterruptedIOException unused3) {
                                                    Thread.interrupted();
                                                    z5 = true;
                                                } catch (IOException e2) {
                                                    getLoggerInitialLogLevel.RatingCompat.read(5, "Failed to read public suffix list", e2);
                                                    if (z5) {
                                                        Thread.currentThread().interrupt();
                                                    }
                                                }
                                            }
                                            if (z5) {
                                                Thread.currentThread().interrupt();
                                            }
                                        }
                                        synchronized (publicSuffixDatabase) {
                                            if (publicSuffixDatabase.MediaBrowserCompatMediaItem == null) {
                                                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
                                            }
                                        }
                                        int length6 = strArrSplit2.length;
                                        byte[][] bArr = new byte[length6][];
                                        for (int i11 = 0; i11 < strArrSplit2.length; i11++) {
                                            bArr[i11] = strArrSplit2[i11].getBytes(r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.MediaMetadataCompat);
                                        }
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 >= length6) {
                                                str2 = null;
                                                break;
                                            }
                                            str2 = PublicSuffixDatabase.read(publicSuffixDatabase.MediaBrowserCompatMediaItem, bArr, i12);
                                            if (str2 != null) {
                                                break;
                                            } else {
                                                i12++;
                                            }
                                        }
                                        if (length6 <= 1) {
                                            str3 = null;
                                            break;
                                        }
                                        byte[][] bArr2 = (byte[][]) bArr.clone();
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 >= bArr2.length - 1) {
                                                str3 = null;
                                                break;
                                            }
                                            bArr2[i13] = PublicSuffixDatabase.read;
                                            str3 = PublicSuffixDatabase.read(publicSuffixDatabase.MediaBrowserCompatMediaItem, bArr2, i13);
                                            if (str3 != null) {
                                                break;
                                            } else {
                                                i13++;
                                            }
                                        }
                                        if (str3 == null) {
                                            str4 = null;
                                            break;
                                        }
                                        int i14 = 0;
                                        while (true) {
                                            if (i14 >= length6 - 1) {
                                                str4 = null;
                                                break;
                                            }
                                            str4 = PublicSuffixDatabase.read(publicSuffixDatabase.MediaMetadataCompat, bArr, i14);
                                            if (str4 != null) {
                                                break;
                                            } else {
                                                i14++;
                                            }
                                        }
                                        if (str4 != null) {
                                            strArrSplit = "!".concat(str4).split("\\.");
                                        } else if (str2 == null && str3 == null) {
                                            strArrSplit = PublicSuffixDatabase.serializer;
                                        } else {
                                            strArrSplit = str2 != null ? str2.split("\\.") : PublicSuffixDatabase.write;
                                            String[] strArrSplit3 = str3 != null ? str3.split("\\.") : PublicSuffixDatabase.write;
                                            if (strArrSplit.length <= strArrSplit3.length) {
                                                strArrSplit = strArrSplit3;
                                            }
                                        }
                                        if (strArrSplit2.length == strArrSplit.length) {
                                            i = 0;
                                            if (strArrSplit[0].charAt(0) != '!') {
                                                string = null;
                                            }
                                            if (string == null) {
                                                i2 = 0;
                                            }
                                        } else {
                                            i = 0;
                                        }
                                        if (strArrSplit[i].charAt(i) == '!') {
                                            length = strArrSplit2.length;
                                            length2 = strArrSplit.length;
                                        } else {
                                            length = strArrSplit2.length;
                                            length2 = strArrSplit.length + 1;
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        String[] strArrSplit4 = str10.split("\\.");
                                        for (int i15 = length - length2; i15 < strArrSplit4.length; i15++) {
                                            sb.append(strArrSplit4[i15]);
                                            sb.append('.');
                                        }
                                        sb.deleteCharAt(sb.length() - 1);
                                        string = sb.toString();
                                        if (string == null) {
                                            i2 = 0;
                                        }
                                    }
                                    String str11 = str7;
                                    if (str11 == null || !str11.startsWith("/")) {
                                        String strIconCompatParcelizer = ishtmlinappmessageapplywindowinsetsenabled.IconCompatParcelizer();
                                        int iLastIndexOf = strIconCompatParcelizer.lastIndexOf(47);
                                        if (iLastIndexOf != 0) {
                                            i2 = 0;
                                            strSubstring = strIconCompatParcelizer.substring(0, iLastIndexOf);
                                        } else {
                                            i2 = 0;
                                            strSubstring = "/";
                                        }
                                        str = strSubstring;
                                    } else {
                                        str = str11;
                                        i2 = 0;
                                    }
                                    isautomaticlocationcollectionenabled = new isAutomaticLocationCollectionEnabled(strSubstring3, strSubstring4, jSerializer, str10, str, z2, z3, z, z4);
                                }
                            }
                        }
                    }
                }
                isautomaticlocationcollectionenabled = null;
            }
            if (isautomaticlocationcollectionenabled != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(isautomaticlocationcollectionenabled);
            }
            i4++;
            listUnmodifiableList = list;
        }
        if ((arrayList2 != null ? Collections.unmodifiableList(arrayList2) : Collections.EMPTY_LIST).isEmpty()) {
            return;
        }
        settriggeractionminimumtimeintervalseconds.getClass();
    }

    public static boolean write(setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp) {
        if (setshouldpersistwebviewwhenbackgroundingapp.write.serializer.equals("HEAD")) {
            return false;
        }
        int i = setshouldpersistwebviewwhenbackgroundingapp.serializer;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && RemoteActionCompatParcelizer(setshouldpersistwebviewwhenbackgroundingapp) == -1 && !"chunked".equalsIgnoreCase(setshouldpersistwebviewwhenbackgroundingapp.read("Transfer-Encoding", null))) ? false : true;
    }

    public static long RemoteActionCompatParcelizer(setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp) {
        String strRemoteActionCompatParcelizer = setshouldpersistwebviewwhenbackgroundingapp.RatingCompat.RemoteActionCompatParcelizer("Content-Length");
        if (strRemoteActionCompatParcelizer == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strRemoteActionCompatParcelizer);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static int IconCompatParcelizer(int i, String str, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int write(String str, int i) {
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
