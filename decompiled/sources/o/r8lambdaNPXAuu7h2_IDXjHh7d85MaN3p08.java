package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.u$a;
import com.sentiance.okio.ByteString;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08 {
    public static final Pattern ComponentActivity;
    public static final ByteString IconCompatParcelizer;
    public static final ByteString MediaBrowserCompatMediaItem;
    public static final Charset MediaDescriptionCompat;
    public static final Charset MediaMetadataCompat;
    public static final ByteString MediaSessionCompatQueueItem;
    public static final TimeZone MediaSessionCompatResultReceiverWrapper;
    public static final Charset MediaSessionCompatToken;
    public static final Charset ParcelableVolumeInfo;
    public static final setIsHtmlInAppMessageHtmlLinkTargetEnabled PlaybackStateCompat;
    public static final Charset PlaybackStateCompatCustomAction;
    public static final ByteString RatingCompat;
    public static final byte[] RemoteActionCompatParcelizer;
    public static final Method r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public static final String[] read = new String[0];
    public static final ByteString serializer;
    public static final setSmallNotificationIconNameandroid_sdk_base_release write;

    public static int IconCompatParcelizer(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    static {
        Method declaredMethod;
        byte[] bArr = new byte[0];
        RemoteActionCompatParcelizer = bArr;
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
        r8lambdabeyrnr8p6809bwlboro_stans.IconCompatParcelizer(bArr);
        write = new setSmallNotificationIconNameandroid_sdk_base_release(null, 0L, r8lambdabeyrnr8p6809bwlboro_stans, 0);
        serializer = ByteString.RemoteActionCompatParcelizer("efbbbf");
        IconCompatParcelizer = ByteString.RemoteActionCompatParcelizer("feff");
        MediaSessionCompatQueueItem = ByteString.RemoteActionCompatParcelizer("fffe");
        RatingCompat = ByteString.RemoteActionCompatParcelizer("0000ffff");
        MediaBrowserCompatMediaItem = ByteString.RemoteActionCompatParcelizer("ffff0000");
        MediaMetadataCompat = Charset.forName(com.adjust.sdk.Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        MediaDescriptionCompat = Charset.forName("UTF-16BE");
        MediaSessionCompatToken = Charset.forName("UTF-16LE");
        ParcelableVolumeInfo = Charset.forName("UTF-32BE");
        PlaybackStateCompatCustomAction = Charset.forName("UTF-32LE");
        MediaSessionCompatResultReceiverWrapper = TimeZone.getTimeZone("GMT");
        PlaybackStateCompat = new setIsHtmlInAppMessageHtmlLinkTargetEnabled(2);
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            declaredMethod = null;
        }
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = declaredMethod;
        ComponentActivity = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static boolean read(getResourceConfigurationValue getresourceconfigurationvalue, int i) {
        long jNanoTime = System.nanoTime();
        long jIconCompatParcelizer = getresourceconfigurationvalue.IconCompatParcelizer().write() ? getresourceconfigurationvalue.IconCompatParcelizer().IconCompatParcelizer() - jNanoTime : Long.MAX_VALUE;
        getresourceconfigurationvalue.IconCompatParcelizer().IconCompatParcelizer(Math.min(jIconCompatParcelizer, TimeUnit.MILLISECONDS.toNanos(i)) + jNanoTime);
        try {
            r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
            while (getresourceconfigurationvalue.read(r8lambdabeyrnr8p6809bwlboro_stans, 8192L) != -1) {
                r8lambdabeyrnr8p6809bwlboro_stans.serializer();
            }
            if (jIconCompatParcelizer == Long.MAX_VALUE) {
                getresourceconfigurationvalue.IconCompatParcelizer().serializer();
                return true;
            }
            getresourceconfigurationvalue.IconCompatParcelizer().IconCompatParcelizer(jNanoTime + jIconCompatParcelizer);
            return true;
        } catch (InterruptedIOException unused) {
            if (jIconCompatParcelizer == Long.MAX_VALUE) {
                getresourceconfigurationvalue.IconCompatParcelizer().serializer();
                return false;
            }
            getresourceconfigurationvalue.IconCompatParcelizer().IconCompatParcelizer(jNanoTime + jIconCompatParcelizer);
            return false;
        } catch (Throwable th) {
            if (jIconCompatParcelizer == Long.MAX_VALUE) {
                getresourceconfigurationvalue.IconCompatParcelizer().serializer();
            } else {
                getresourceconfigurationvalue.IconCompatParcelizer().IconCompatParcelizer(jNanoTime + jIconCompatParcelizer);
            }
            throw th;
        }
    }

    public static int serializer(int i, int i2, String str) {
        while (true) {
            i2--;
            if (i2 < i) {
                return i;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i2 + 1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5 A[LOOP:1: B:53:0x0098->B:57:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ab A[EDGE_INSN: B:85:0x00ab->B:58:0x00ab BREAK  A[LOOP:1: B:53:0x0098->B:57:0x00a5], SYNTHETIC] */
    public static InetAddress read(int i, int i2, String str) {
        int i3;
        int i4;
        int i5;
        int iIconCompatParcelizer;
        int i6 = 16;
        byte[] bArr = new byte[16];
        int i7 = 0;
        int i8 = i;
        int i9 = 0;
        int i10 = -1;
        int i11 = -1;
        while (i8 < i2) {
            if (i9 == i6) {
                return null;
            }
            int i12 = i8 + 2;
            if (i12 <= i2 && str.regionMatches(i8, "::", i7, 2)) {
                if (i10 != -1) {
                    return null;
                }
                i9 += 2;
                if (i12 == i2) {
                    i10 = i9;
                    break;
                }
                i10 = i9;
                i8 = i12;
                i11 = i8;
                i8 = i11;
                i4 = 0;
                while (i8 < i2) {
                    iIconCompatParcelizer = IconCompatParcelizer(str.charAt(i8));
                    if (iIconCompatParcelizer == -1) {
                        break;
                        break;
                    }
                    i4 = (i4 << 4) + iIconCompatParcelizer;
                    i8++;
                }
                i5 = i8 - i11;
                return i5 == 0 ? null : null;
            }
            if (i9 != 0) {
                if (!str.regionMatches(i8, ":", i7, 1)) {
                    if (!str.regionMatches(i8, ".", i7, 1)) {
                        return null;
                    }
                    int i13 = i9 - 2;
                    int i14 = i13;
                    while (i11 < i2) {
                        if (i14 == i6) {
                            return null;
                        }
                        if (i14 != i13) {
                            if (str.charAt(i11) != '.') {
                                return null;
                            }
                            i11++;
                        }
                        int i15 = i7;
                        int i16 = i11;
                        while (i16 < i2) {
                            char cCharAt = str.charAt(i16);
                            if (cCharAt < '0' || cCharAt > '9') {
                                break;
                            }
                            if ((i15 == 0 && i11 != i16) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                                return null;
                            }
                            i16++;
                        }
                        if (i16 - i11 == 0) {
                            return null;
                        }
                        bArr[i14] = (byte) i15;
                        i14++;
                        i11 = i16;
                        i6 = 16;
                        i7 = 0;
                    }
                    i9 += 2;
                    if (i14 == i9) {
                        break;
                    }
                    return null;
                }
                i8++;
            }
            i11 = i8;
            i8 = i11;
            i4 = 0;
            while (i8 < i2) {
                iIconCompatParcelizer = IconCompatParcelizer(str.charAt(i8));
                if (iIconCompatParcelizer == -1) {
                    break;
                }
                i4 = (i4 << 4) + iIconCompatParcelizer;
                i8++;
            }
            i5 = i8 - i11;
            if (i5 == 0 && i5 <= 4) {
                bArr[i9] = (byte) ((i4 >>> 8) & 255);
                bArr[i9 + 1] = (byte) (i4 & 255);
                i9 += 2;
                i6 = 16;
                i7 = 0;
            }
        }
        if (i9 == 16) {
            i3 = 0;
        } else {
            if (i10 == -1) {
                return null;
            }
            int i17 = i9 - i10;
            System.arraycopy(bArr, i10, bArr, 16 - i17, i17);
            i3 = 0;
            Arrays.fill(bArr, i10, (16 - i9) + i10, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[i3], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
            return null;
        }
    }

    public static boolean write(Comparator comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int RemoteActionCompatParcelizer(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static isEphemeralEventsEnabled IconCompatParcelizer(ArrayList arrayList) {
        u$a u_a = new u$a(0);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            _get_defaultNotificationAccentColor_lambda0 _get_defaultnotificationaccentcolor_lambda0 = (_get_defaultNotificationAccentColor_lambda0) it.next();
            setTriggerActionMinimumTimeIntervalSeconds settriggeractionminimumtimeintervalseconds = setTriggerActionMinimumTimeIntervalSeconds.IconCompatParcelizer;
            String strRatingCompat = _get_defaultnotificationaccentcolor_lambda0.RatingCompat.RatingCompat();
            String strRatingCompat2 = _get_defaultnotificationaccentcolor_lambda0.MediaMetadataCompat.RatingCompat();
            settriggeractionminimumtimeintervalseconds.getClass();
            u_a.serializer(strRatingCompat, strRatingCompat2);
        }
        return new isEphemeralEventsEnabled(u_a);
    }

    public static String write(isHtmlInAppMessageApplyWindowInsetsEnabled ishtmlinappmessageapplywindowinsetsenabled, boolean z) {
        String str = ishtmlinappmessageapplywindowinsetsenabled.write;
        int i = ishtmlinappmessageapplywindowinsetsenabled.MediaMetadataCompat;
        boolean zContains = str.contains(":");
        String strM = ishtmlinappmessageapplywindowinsetsenabled.write;
        if (zContains) {
            strM = ff$$ExternalSyntheticOutline0.m("[", strM, "]");
        }
        if (!z && i == isHtmlInAppMessageApplyWindowInsetsEnabled.write(ishtmlinappmessageapplywindowinsetsenabled.serializer)) {
            return strM;
        }
        return strM + ":" + i;
    }

    public static boolean IconCompatParcelizer(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void serializer(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void write(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!read(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static List read(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static String[] RemoteActionCompatParcelizer(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean read(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static int read(int i, String str, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int read(char c, int i, int i2, String str) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static String read(String str) {
        InetAddress inetAddress;
        int i = -1;
        int i2 = 0;
        if (str.contains(":")) {
            if (str.startsWith("[") && str.endsWith("]")) {
                inetAddress = read(1, str.length() - 1, str);
            } else {
                inetAddress = read(0, str.length(), str);
            }
            if (inetAddress != null) {
                byte[] address = inetAddress.getAddress();
                if (address.length == 16) {
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < address.length) {
                        int i5 = i3;
                        while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                            i5 += 2;
                        }
                        int i6 = i5 - i3;
                        if (i6 > i4 && i6 >= 4) {
                            i = i3;
                            i4 = i6;
                        }
                        i3 = i5 + 2;
                    }
                    r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
                    while (i2 < address.length) {
                        if (i2 == i) {
                            r8lambdabeyrnr8p6809bwlboro_stans.write(58);
                            i2 += i4;
                            if (i2 == 16) {
                                r8lambdabeyrnr8p6809bwlboro_stans.write(58);
                            }
                        } else {
                            if (i2 > 0) {
                                r8lambdabeyrnr8p6809bwlboro_stans.write(58);
                            }
                            r8lambdabeyrnr8p6809bwlboro_stans.MediaMetadataCompat(((address[i2] & 255) << 8) | (address[i2 + 1] & 255));
                            i2 += 2;
                        }
                    }
                    return r8lambdabeyrnr8p6809bwlboro_stans.RemoteActionCompatParcelizer();
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) ff$$ExternalSyntheticOutline0.m("Invalid IPv6 address: '", str, "'"));
                return null;
            }
        } else {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(java.util.Locale.US);
                if (!lowerCase.isEmpty()) {
                    while (i2 < lowerCase.length()) {
                        char cCharAt = lowerCase.charAt(i2);
                        i2 = (cCharAt > 31 && cCharAt < 127 && " #%/:?@[\\]".indexOf(cCharAt) == -1) ? i2 + 1 : 0;
                    }
                    return lowerCase;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static Charset write(r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k r8lambdaoorzolqoybc_uxebbkbnmvlvm7k, Charset charset) {
        ByteString byteString = serializer;
        if (r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.read(byteString)) {
            r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.IconCompatParcelizer(byteString.write());
            return MediaMetadataCompat;
        }
        ByteString byteString2 = IconCompatParcelizer;
        if (r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.read(byteString2)) {
            r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.IconCompatParcelizer(byteString2.write());
            return MediaDescriptionCompat;
        }
        ByteString byteString3 = MediaSessionCompatQueueItem;
        if (r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.read(byteString3)) {
            r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.IconCompatParcelizer(byteString3.write());
            return MediaSessionCompatToken;
        }
        ByteString byteString4 = RatingCompat;
        if (r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.read(byteString4)) {
            r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.IconCompatParcelizer(byteString4.write());
            return ParcelableVolumeInfo;
        }
        ByteString byteString5 = MediaBrowserCompatMediaItem;
        if (!r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.read(byteString5)) {
            return charset;
        }
        r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.IconCompatParcelizer(byteString5.write());
        return PlaybackStateCompatCustomAction;
    }

    public static int read() {
        if (TimeUnit.SECONDS != null) {
            return 60000;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("unit == null");
        return 0;
    }

    public static AssertionError write(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }
}
