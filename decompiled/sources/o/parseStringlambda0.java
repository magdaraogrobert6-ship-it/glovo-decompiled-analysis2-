package o;

import android.content.Context;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Environment;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.huawei.riemann.location.common.utils.Constant;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class parseStringlambda0 {
    private static File read;
    private final String IconCompatParcelizer;
    private readandroid_sdk_base_release MediaSessionCompatQueueItem;
    private final Context RemoteActionCompatParcelizer;
    private final r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0 serializer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI write;
    private static final byte[] $$a = {50, -98, 13, 63};
    private static final int $$b = 83;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int MediaDescriptionCompat = 0;
    private static int PlaybackStateCompat = 1;
    private static char[] MediaBrowserCompatMediaItem = {39377, 10155, 58689, 41654, 24608, 8613, 61226, 44220, 27203, 11225, 59668, 46795, 29795, 13819, 62309, 45324, 32462, 15418, 65009, 47878, 30896, 1589, 51162, 34124, 17107, 'i', 49576, 36700, 19627, 2748, 51251, 39416, 10116, 58634, 41622, 24630, 8687, 61227, 44214, 27209, 11208, 59718, 46822, 29810, 13792, 62270, 45322, 32407, 15361, 64932, 47977, 30886, 1636, 51096, 34067, 17044, 'U', 49585, 36655, 19622, 2745, 51218, 35218, 22300, 5286, 53813, 37799, 20815, 7885, 63159, 18622, 35407, 52674, 3844, 20200, 32771, 50164, 1314, 17599, 34336, 55686, 6921, 23195, 40026, 56910, 4554, 21294, 37611, 54351, 6108, 26949, 43169, 59948, 11704, 28491, 44710, 57372, 9106, 26106, 42849, 39411, 10123, 58648, 41605, 24609, 8616, 61244, 44285, 27209, 11218, 59738, 46843, 29795, 13815, 62308, 45381, 32417, 15386, 64930, 47923, 30907, 1577, 51164, 13859, 34907, 19144, 3413, 53233, 36472, 16620, 813, 50585, 33794, 18058, 6443, 56243, 39463, 23732, 7829, 53570, 37832, 21042, 5319, 55151, 43490, 26643, 10898, 60685, 44984, 28185, 8366, 58152, 42328, 26583, 9806, 63696, 7587, 41890, 24864, 9902, 58398, 37861, 11673, 61207, 43147, 27261, 11183, 58656, 42669, 24642, 8658, 58176, 48358, 32354, 16298, 63854, 47891, 29837, 13852, 63487, 45337, 29350, 3134, 52673, 36695, 18625, 2681, 52218, 34147, 18175, 145, 49723, 33671, 23820, 7852, 55342, 39352, 23370, 39416, 10116, 58634, 41622, 24672, 8626, 61245, 44208, 27231, 11215, 59741, 46843, 29823, 13751, 62323, 45326, 32400, 15361, 64994, 47903, 30955, 1633, 51089, 34144, 17119, 127, 49648, 36726, 19696, 2688, 51203, 35226, 22278, 5280};
    private static long MediaMetadataCompat = -6011024819071014939L;
    private static int[] RatingCompat = {364747634, -1362551898, -2095090125, 229843422, -1054061478, 342736081, 568594215, -395306373, 1366474498, -2010581383, 488895991, 1546108110, 981660484, 361919989, 1145041344, -1157239792, -1933760257, -672341557};

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(int r6, byte r7, short r8) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r6 = r6 * 2
            int r6 = r6 + 98
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = o.parseStringlambda0.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.parseStringlambda0.$$c(int, byte, short):java.lang.String");
    }

    public final void read(String str) {
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar;
        synchronized (this) {
            if (this.MediaSessionCompatQueueItem == null) {
                this.MediaSessionCompatQueueItem = (readandroid_sdk_base_release) setPushUniqueId.read(readandroid_sdk_base_release.class);
            }
            readandroid_sdk_base_releaseVar = this.MediaSessionCompatQueueItem;
        }
        readandroid_sdk_base_releaseVar.RemoteActionCompatParcelizer(new Scopes$$ExternalSyntheticLambda0(this, 10, str));
    }

    public static File IconCompatParcelizer(Context context) {
        File file;
        synchronized (parseStringlambda0.class) {
            if (read == null) {
                File file2 = new File(context.getNoBackupFilesDir(), "sentiance-logs");
                read = file2;
                if (!file2.exists()) {
                    read.mkdir();
                }
                if (Environment.getExternalStorageState().equals("mounted")) {
                    serializer(new File(context.getExternalFilesDir(null), "logs"), read);
                }
                serializer(new File(context.getNoBackupFilesDir(), "logs"), read);
            }
            file = read;
        }
        return file;
    }

    public parseStringlambda0(Context context, String str, r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0 r8lambdabeyxiieovxeplp1oh2wlzr3abd0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.RemoteActionCompatParcelizer = context;
        this.IconCompatParcelizer = str;
        this.write = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.serializer = r8lambdabeyxiieovxeplp1oh2wlzr3abd0;
    }

    private static void serializer(File file, File file2) {
        int i = 2 % 2;
        if (file.exists()) {
            for (File file3 : migrateSealedSessionsMapToJsonlambda0.IconCompatParcelizer(file, true)) {
                int i2 = PlaybackStateCompat + 37;
                MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                if (r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0.IconCompatParcelizer(file3.getName())) {
                    try {
                        migrateSealedSessionsMapToJsonlambda0.IconCompatParcelizer(file3, new File(file2, file3.getName()));
                    } catch (IOException unused) {
                    }
                    file3.delete();
                } else {
                    int i4 = PlaybackStateCompat + 103;
                    MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                }
            }
            if (migrateSealedSessionsMapToJsonlambda0.IconCompatParcelizer(file, false).isEmpty()) {
                file.delete();
                int i6 = PlaybackStateCompat + 87;
                MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        Object obj;
        int i3 = 2 % 2;
        rememberNestedScrollInteropConnection remembernestedscrollinteropconnection = new rememberNestedScrollInteropConnection();
        long[] jArr = new long[i];
        remembernestedscrollinteropconnection.read = 0;
        while (true) {
            obj = null;
            if (remembernestedscrollinteropconnection.read >= i) {
                break;
            }
            int i4 = remembernestedscrollinteropconnection.read;
            try {
                Object[] objArr2 = {Integer.valueOf(MediaBrowserCompatMediaItem[i2 + i4])};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1215525465);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 50817), 2087 - TextUtils.getTrimmedLength(""), 14 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), -1734126664, false, $$c(b, b2, b2), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(MediaMetadataCompat), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2040246764);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) TextUtils.getTrimmedLength(""), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 196, ImageFormat.getBitsPerPixel(0) + 16, 1454665717, false, "c", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {remembernestedscrollinteropconnection, remembernestedscrollinteropconnection};
                        Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(125004226);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6914), 159 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), View.resolveSize(0, 0) + 17, -677165021, false, com.braze.Constants.BRAZE_PUSH_CONTENT_KEY, new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i];
        remembernestedscrollinteropconnection.read = 0;
        while (remembernestedscrollinteropconnection.read < i) {
            cArr[remembernestedscrollinteropconnection.read] = (char) jArr[remembernestedscrollinteropconnection.read];
            try {
                Object[] objArr5 = {remembernestedscrollinteropconnection, remembernestedscrollinteropconnection};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(125004226);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (6915 - TextUtils.indexOf("", "", 0)), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 159, 16 - TextUtils.lastIndexOf("", '0'), -677165021, false, com.braze.Constants.BRAZE_PUSH_CONTENT_KEY, new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                int i5 = $11 + 109;
                $10 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 4 % 5;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr);
        int i7 = $10 + 1;
        $11 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    public static void write(parseStringlambda0 parsestringlambda0, String str) {
        int i = 2 % 2;
        parsestringlambda0.getClass();
        File fileIconCompatParcelizer = IconCompatParcelizer(parsestringlambda0.RemoteActionCompatParcelizer);
        StringBuilder sb = new StringBuilder();
        sb.append(parsestringlambda0.IconCompatParcelizer);
        sb.append("-");
        parsestringlambda0.write.getClass();
        sb.append(com.sentiance.sdk.util.x.serializer(System.currentTimeMillis(), "yyyyMMdd"));
        File file = new File(fileIconCompatParcelizer, sb.toString());
        boolean zExists = file.exists();
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
            try {
                printWriter.println(str);
                printWriter.close();
            } catch (Throwable th) {
                try {
                    printWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            Log.w("RotatedFileLogger", "Cannot write log to file", e);
        }
        if (!zExists) {
            parsestringlambda0.serializer.IconCompatParcelizer();
            int i2 = MediaDescriptionCompat + 111;
            PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 2 / 2;
            }
        }
        int i4 = PlaybackStateCompat + 63;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        ceilAwayFromZero ceilawayfromzero = new ceilAwayFromZero();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = RatingCompat;
        int i3 = -25295696;
        int i4 = 9;
        char c = '0';
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $11 + 123;
            $10 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr3[i8]);
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(i3);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) i4;
                        byte b2 = (byte) i6;
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((-1) - TextUtils.indexOf("", c, i6)), 2752 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getOffsetAfter("", i6) + 9, 783164753, false, $$c(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr2[i8] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i8++;
                    int i9 = $11 + 25;
                    $10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    i3 = -25295696;
                    i4 = 9;
                    c = '0';
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = RatingCompat;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr3 = new Object[i5];
                objArr3[0] = Integer.valueOf(iArr5[i11]);
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-25295696);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b3 = (byte) 0;
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 2752 - View.getDefaultSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 10, 783164753, false, $$c((byte) 9, b3, b3), new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                i11++;
                iArr5 = iArr5;
                i5 = 1;
            }
            iArr5 = iArr6;
        }
        char c2 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        ceilawayfromzero.serializer = 0;
        while (ceilawayfromzero.serializer < iArr.length) {
            cArr[c2] = (char) (iArr[ceilawayfromzero.serializer] >> 16);
            cArr[1] = (char) iArr[ceilawayfromzero.serializer];
            cArr[2] = (char) (iArr[ceilawayfromzero.serializer + 1] >> 16);
            cArr[3] = (char) iArr[ceilawayfromzero.serializer + 1];
            ceilawayfromzero.RemoteActionCompatParcelizer = (cArr[0] << 16) + cArr[1];
            ceilawayfromzero.read = (cArr[2] << 16) + cArr[3];
            ceilAwayFromZero.RemoteActionCompatParcelizer(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                int i14 = $10 + 81;
                $11 = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i15 = i14 % 2;
                ceilawayfromzero.RemoteActionCompatParcelizer ^= iArr4[i12];
                try {
                    Object[] objArr4 = {ceilawayfromzero, Integer.valueOf(ceilAwayFromZero.read(ceilawayfromzero.RemoteActionCompatParcelizer)), ceilawayfromzero, ceilawayfromzero};
                    Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-98334374);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        byte b4 = (byte) 0;
                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ('0' - AndroidCharacter.getMirror('0')), TextUtils.lastIndexOf("", '0', 0) + 1759, android.view.KeyEvent.getDeadChar(0, 0) + 46, 720611515, false, $$c((byte) 10, b4, b4), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                    ceilawayfromzero.RemoteActionCompatParcelizer = ceilawayfromzero.read;
                    ceilawayfromzero.read = iIntValue;
                    i12++;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i16 = ceilawayfromzero.RemoteActionCompatParcelizer;
            ceilawayfromzero.RemoteActionCompatParcelizer = ceilawayfromzero.read;
            ceilawayfromzero.read = i16;
            ceilawayfromzero.read ^= iArr4[16];
            ceilawayfromzero.RemoteActionCompatParcelizer ^= iArr4[17];
            int i17 = ceilawayfromzero.RemoteActionCompatParcelizer;
            int i18 = ceilawayfromzero.read;
            cArr[0] = (char) (ceilawayfromzero.RemoteActionCompatParcelizer >>> 16);
            cArr[1] = (char) ceilawayfromzero.RemoteActionCompatParcelizer;
            cArr[2] = (char) (ceilawayfromzero.read >>> 16);
            cArr[3] = (char) ceilawayfromzero.read;
            ceilAwayFromZero.RemoteActionCompatParcelizer(iArr4);
            cArr2[ceilawayfromzero.serializer * 2] = cArr[0];
            cArr2[(ceilawayfromzero.serializer * 2) + 1] = cArr[1];
            cArr2[(ceilawayfromzero.serializer * 2) + 2] = cArr[2];
            cArr2[(ceilawayfromzero.serializer * 2) + 3] = cArr[3];
            Object[] objArr5 = {ceilawayfromzero, ceilawayfromzero};
            Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(82275544);
            if (objRemoteActionCompatParcelizer4 == null) {
                byte b5 = (byte) 0;
                objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) android.graphics.Color.blue(0), View.resolveSizeAndState(0, 0, 0) + 1277, android.graphics.Color.red(0) + 28, -734573255, false, $$c((byte) 11, b5, b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0d02  */
    /* JADX WARN: Code duplicated, block: B:167:0x0d21  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v105 */
    /* JADX WARN: Type inference failed for: r2v107, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v108, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v130 */
    /* JADX WARN: Type inference failed for: r2v133, types: [int] */
    /* JADX WARN: Type inference failed for: r2v154 */
    /* JADX WARN: Type inference failed for: r2v155 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r6v69, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v88, types: [java.lang.reflect.Method] */
    public static Object[] read(Context context, int i, int i2) {
        Object obj;
        Object[] objArr;
        int iMyPid;
        int iSerializer;
        int i3;
        int i4;
        int i5;
        int packedPositionType;
        int i6;
        int i7;
        int i8;
        int i9;
        int iNormalizeMetaState;
        int i10;
        Object[] objArr2;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        ?? Invoke = i2;
        int i23 = 2 % 2;
        if (context != null) {
            try {
                int gidForName = Process.getGidForName("");
                int i24 = (gidForName ^ 32) + ((gidForName & 32) << 1);
                float fComplexToFraction = TypedValue.complexToFraction(0, 0.0f, 0.0f);
                int i25 = PlaybackStateCompat + 35;
                MediaDescriptionCompat = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i25 % 2 != 0) {
                    Object[] objArr3 = new Object[1];
                    a(i24, (fComplexToFraction > 2.0f ? 1 : (fComplexToFraction == 2.0f ? 0 : -1)), (char) (Process.myTid() / 48), objArr3);
                    obj = objArr3[0];
                } else {
                    Object[] objArr4 = new Object[1];
                    a(i24, (fComplexToFraction > 0.0f ? 1 : (fComplexToFraction == 0.0f ? 0 : -1)), (char) (Process.myTid() >> 22), objArr4);
                    obj = objArr4[0];
                }
                try {
                    int i26 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                    int i27 = i26 * (-716);
                    int i28 = ((i27 | 53095) << 1) - (i27 ^ 53095);
                    int i29 = ~i26;
                    int i30 = ((i29 ^ 37) | (i29 & 37)) * (-1434);
                    int i31 = (i28 ^ i30) + ((i28 & i30) << 1);
                    int i32 = ~i;
                    int i33 = ~((i32 ^ 37) | (i32 & 37));
                    int i34 = ~((i26 ^ 37) | (i26 & 37));
                    int i35 = (i33 ^ i34) | (i34 & i33);
                    int i36 = (i29 ^ (-38)) | (i29 & (-38));
                    int i37 = (i35 | (~((i36 & i) | (i36 ^ i)))) * 717;
                    int i38 = (i31 ^ i37) + ((i31 & i37) << 1);
                    int i39 = ~i26;
                    int i40 = (i39 & (-38)) | (i39 ^ (-38));
                    int i41 = (~((i40 & i32) | (i40 ^ i32))) | (~(i26 | 37));
                    int i42 = (i ^ 37) | (i & 37);
                    int i43 = ~i42;
                    Object[] objArr5 = new Object[1];
                    a(i38 + (((i41 ^ i43) | (i41 & i43)) * 717), 31 - (~(-(-Process.getGidForName("")))), (char) ExpandableListView.getPackedPositionType(0L), objArr5);
                    Object objNewInstance = Class.forName((String) objArr5[0]).getDeclaredConstructor(String.class).newInstance((String) obj);
                    int i44 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int i45 = ((i44 | 32) << 1) - (i44 ^ 32);
                    int scrollDefaultDelay = 69 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int i46 = -MotionEvent.axisFromString("");
                    char c = (char) ((i46 ^ 28517) + ((i46 & 28517) << 1));
                    Object[] objArr6 = new Object[1];
                    a(i45, scrollDefaultDelay, c, objArr6);
                    try {
                        Object[] objArr7 = {(String) objArr6[0]};
                        int i47 = -ExpandableListView.getPackedPositionGroup(0L);
                        int iSerializer2 = AndroidViewConfiguration.serializer();
                        int i48 = i47 * 1773;
                        int i49 = ((i48 | (-33630)) << 1) - (i48 ^ (-33630));
                        int i50 = MediaDescriptionCompat;
                        int i51 = (i50 & 61) + (i50 | 61);
                        PlaybackStateCompat = i51 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i51 % 2 == 0) {
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        int i52 = ~i47;
                        int i53 = ~((i52 & (-39)) | (i52 ^ (-39)));
                        int i54 = ~(((-39) ^ iSerializer2) | ((-39) & iSerializer2));
                        int i55 = (i53 ^ i54) | (i53 & i54);
                        int i56 = ~iSerializer2;
                        int i57 = (i56 ^ i47) | (i56 & i47);
                        int i58 = ~((i57 ^ 38) | (i57 & 38));
                        int i59 = (i49 - (~(886 * ((i55 ^ i58) | (i58 & i55))))) - 1;
                        int i60 = ((i50 | 49) << 1) - (i50 ^ 49);
                        PlaybackStateCompat = i60 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i61 = i60 % 2;
                        int i62 = ~iSerializer2;
                        int i63 = ~((i62 & 38) | (i62 ^ 38));
                        int i64 = -(-((-1772) * ((i47 & i63) | (i47 ^ i63))));
                        int i65 = (i59 ^ i64) + ((i59 & i64) << 1);
                        int i66 = -(-((~i57) * 886));
                        int i67 = (i65 & i66) + (i66 | i65);
                        int i68 = -(android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        Object[] objArr8 = new Object[1];
                        a(i67, (i68 & 31) + (i68 | 31), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), objArr8);
                        Constructor<?> declaredConstructor = Class.forName((String) objArr8[0]).getDeclaredConstructor(String.class);
                        int i69 = PlaybackStateCompat;
                        int i70 = (i69 & 19) + (i69 | 19);
                        MediaDescriptionCompat = i70 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i71 = i70 % 2;
                        Object objNewInstance2 = declaredConstructor.newInstance(objArr7);
                        int i72 = MediaDescriptionCompat - (-13);
                        PlaybackStateCompat = i72 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i73 = i72 % 2;
                        try {
                            int i74 = -TextUtils.lastIndexOf("", '0', 0);
                            int iSerializer3 = AndroidViewConfiguration.serializer();
                            int i75 = i74 * 503;
                            int i76 = ((i75 | 11066) << 1) - (i75 ^ 11066);
                            int i77 = -(-((i74 | 22) * (-502)));
                            int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
                            int i79 = ~i74;
                            int i80 = ~((i79 & (-23)) | (i79 ^ (-23)));
                            int i81 = ~i74;
                            int i82 = (~((~iSerializer3) | i81)) | i80;
                            int i83 = (i74 & 22) | (i74 ^ 22);
                            int i84 = ~((i83 & iSerializer3) | (i83 ^ iSerializer3));
                            int i85 = i78 + (((i82 & i84) | (i82 ^ i84)) * (-502));
                            int i86 = ~iSerializer3;
                            int i87 = (i86 & i81) | (i81 ^ i86);
                            int i88 = ~((i87 & 22) | (i87 ^ 22));
                            int i89 = ((i84 & i88) | (i88 ^ i84)) * 502;
                            int i90 = ((i85 | i89) << 1) - (i89 ^ i85);
                            int mode = View.MeasureSpec.getMode(0);
                            int iSerializer4 = AndroidViewConfiguration.serializer();
                            int i91 = mode * (-51);
                            int i92 = ((i91 | 5300) << 1) - (i91 ^ 5300);
                            int i93 = ~iSerializer4;
                            int i94 = i93 | mode;
                            int i95 = -(-((~((i94 ^ 100) | (i94 & 100))) * 52));
                            int i96 = ((i92 | i95) << 1) - (i92 ^ i95);
                            int i97 = ~iSerializer4;
                            int i98 = ~(((-101) ^ i97) | ((-101) & i97));
                            int i99 = ~(((-101) ^ mode) | ((-101) & mode));
                            int i100 = -(-(((~((i97 & mode) | (i97 ^ mode))) | (i98 ^ i99) | (i99 & i98)) * (-52)));
                            int i101 = (i96 & i100) + (i96 | i100);
                            int i102 = ~mode;
                            int i103 = ~((i102 & i93) | (i102 ^ i93));
                            int i104 = ~mode;
                            int i105 = ~((i104 & 100) | (i104 ^ 100));
                            int i106 = ((i103 & i105) | (i103 ^ i105)) * 52;
                            Object[] objArr9 = new Object[1];
                            a(i90, (i101 & i106) + (i106 | i101), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr9);
                            Class<?> cls = Class.forName((String) objArr9[0]);
                            int i107 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            Object[] objArr10 = new Object[1];
                            b((i107 ^ 16) + ((i107 & 16) << 1), new int[]{-268988196, 1023920910, -788143397, 874718440, -1001623203, 1396079348, 711544284, -1660960884, -1219678536, 1265045161}, objArr10);
                            Object objInvoke = cls.getMethod((String) objArr10[0], null).invoke(context, null);
                            try {
                                int i108 = -(-(android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                int i109 = (i108 ^ 23) + ((i108 & 23) << 1);
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 101;
                                int i110 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                int iSerializer5 = AndroidViewConfiguration.serializer();
                                int i111 = (i110 * Constant.ERROR_WSS_NO_DATA) - 219;
                                int i112 = ~i110;
                                int i113 = ~((i112 ^ (-2)) | (i112 & (-2)));
                                int i114 = ~iSerializer5;
                                int i115 = i114 | i110;
                                int i116 = ((~((i115 ^ 1) | (i115 & 1))) | i113) * 220;
                                int i117 = (i111 & i116) + (i116 | i111);
                                int i118 = ~((i114 ^ 1) | (i114 & 1));
                                int i119 = ((i118 & i110) | (i110 ^ i118)) * (-440);
                                int i120 = (i117 & i119) + (i119 | i117);
                                int i121 = (i110 | 1 | iSerializer5) * 220;
                                try {
                                    Object[] objArr11 = new Object[1];
                                    a(i109, iLastIndexOf, (char) (((i120 | i121) << 1) - (i121 ^ i120)), objArr11);
                                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                                    int i122 = (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    int iSerializer6 = AndroidViewConfiguration.serializer();
                                    int i123 = (i122 ^ 13) | (i122 & 13);
                                    int i124 = (i122 * 503) + 6539 + (i123 * (-502));
                                    int i125 = ~i122;
                                    int i126 = ~((i125 ^ (-14)) | (i125 & (-14)));
                                    int i127 = ~i122;
                                    int i128 = ~iSerializer6;
                                    int i129 = ~((i127 ^ i128) | (i127 & i128));
                                    int i130 = (i129 & i126) | (i126 ^ i129);
                                    int i131 = ~((i123 ^ iSerializer6) | (i123 & iSerializer6));
                                    int i132 = i124 + (((i130 & i131) | (i130 ^ i131)) * (-502));
                                    int i133 = ~iSerializer6;
                                    int i134 = (i133 & i125) | (i125 ^ i133);
                                    Object[] objArr12 = new Object[1];
                                    b((i132 - (~(((~((i134 & 13) | (i134 ^ 13))) | (~(iSerializer6 | i123))) * 502))) - 1, new int[]{-268988196, 1023920910, -788143397, 874718440, 1040851505, 707142048, 1637641789, -2022916617}, objArr12);
                                    Object objInvoke2 = cls2.getMethod((String) objArr12[0], null).invoke(context, null);
                                    int i135 = ((-1890618519) & i) | ((-1890618519) ^ i);
                                    int i136 = ~i135;
                                    int i137 = ((i136 & 452462781) | (452462781 ^ i136)) * (-220);
                                    int i138 = ~i135;
                                    int i139 = (((((-1626422419) | i137) << 1) - (i137 ^ (-1626422419))) - (~(-(-(((i138 & 279971988) | (279971988 ^ i138)) * 220))))) - 1423390087;
                                    int iSerializer7 = AndroidViewConfiguration.serializer();
                                    int i140 = ~(((-66674350) & iSerializer7) | ((-66674350) ^ iSerializer7));
                                    int i141 = 852500626 + (((i140 & 62938792) | (62938792 ^ i140)) * (-566));
                                    int i142 = ((i141 | (-726292768)) << 1) - ((-726292768) ^ i141);
                                    int i143 = -(-((~(iSerializer7 | (-3735558))) * 566));
                                    int i144 = (i142 & i143) + (i143 | i142);
                                    Invoke = 64;
                                    try {
                                        if (i139 <= i144) {
                                            objArr = new Object[4];
                                            objArr[1] = 64;
                                            objArr[1] = objInvoke2;
                                            iMyPid = Process.myPid() >> 64;
                                            iSerializer = AndroidViewConfiguration.serializer();
                                            i3 = 673 << iMyPid;
                                            i4 = 91;
                                        } else {
                                            objArr = new Object[]{objInvoke2, 64};
                                            iMyPid = Process.myPid() >> 22;
                                            iSerializer = AndroidViewConfiguration.serializer();
                                            i3 = iMyPid * 673;
                                            i4 = 33;
                                        }
                                        int i145 = (-1343) * i4;
                                        int i146 = ((i3 | i145) << 1) - (i3 ^ i145);
                                        int i147 = ~((iMyPid ^ iSerializer) | (iMyPid & iSerializer));
                                        int i148 = -(-(((i147 & i4) | (i4 ^ i147)) * 672));
                                        int i149 = ((i146 | i148) << 1) - (i148 ^ i146);
                                        int i150 = ~iMyPid;
                                        int i151 = ~iSerializer;
                                        int i152 = ~((i150 & i151) | (i150 ^ i151));
                                        int i153 = ~(iSerializer | i4);
                                        int i154 = -(-(((i153 & i152) | (i152 ^ i153)) * (-672)));
                                        int i155 = ((i149 | i154) << 1) - (i154 ^ i149);
                                        int i156 = ~i4;
                                        int i157 = ~((i156 ^ i151) | (i156 & i151));
                                        int i158 = ~((iMyPid & i156) | (i156 ^ iMyPid));
                                        int i159 = ((i158 & i157) | (i157 ^ i158)) * 672;
                                        int i160 = ((i155 | i159) << 1) - (i159 ^ i155);
                                        int iAlpha = 123 - android.graphics.Color.alpha(0);
                                        int i161 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                        Object[] objArr13 = new Object[1];
                                        a(i160, iAlpha, (char) ((i161 & 45007) + (i161 | 45007)), objArr13);
                                        Class<?> cls3 = Class.forName((String) objArr13[0]);
                                        int i162 = -(android.view.ViewConfiguration.getKeyRepeatDelay() >> 16);
                                        int iSerializer8 = AndroidViewConfiguration.serializer();
                                        int i163 = i162 * (-919);
                                        int i164 = (i163 ^ (-12866)) + ((i163 & (-12866)) << 1);
                                        int i165 = ~i162;
                                        int i166 = (i165 ^ (-15)) | (i165 & (-15));
                                        int i167 = MediaDescriptionCompat;
                                        int i168 = ((i167 | 31) << 1) - (i167 ^ 31);
                                        Object obj4 = objNewInstance2;
                                        PlaybackStateCompat = i168 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i169 = i168 % 2;
                                        int i170 = ~((i166 & iSerializer8) | (i166 ^ iSerializer8));
                                        int i171 = ~iSerializer8;
                                        int i172 = i164 + (920 * (i170 | (~(((-15) ^ i171) | ((-15) & i171) | i162))));
                                        int i173 = ((~((i165 ^ (-15)) | (i165 & (-15)))) | (~((i171 & i165) | (i165 ^ i171)))) * 920;
                                        int i174 = (i167 & 91) + (i167 | 91);
                                        PlaybackStateCompat = i174 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i175 = i174 % 2;
                                        int i176 = i172 + i173;
                                        int i177 = ~((i165 ^ (-15)) | (i165 & (-15)) | (~iSerializer8));
                                        int i178 = (i165 & 14) | (i165 ^ 14);
                                        int i179 = ~((i178 & iSerializer8) | (i178 ^ iSerializer8));
                                        int i180 = (i177 & i179) | (i177 ^ i179);
                                        int i181 = (i162 & (-15)) | ((-15) ^ i162);
                                        int i182 = ~((i181 & iSerializer8) | (i181 ^ iSerializer8));
                                        int i183 = i176 + (((i182 & i180) | (i180 ^ i182)) * 920);
                                        Object[] objArr14 = new Object[1];
                                        b(i183, new int[]{-268988196, 1023920910, -788143397, 874718440, -1224792096, 1626804891, -571563138, -400872372}, objArr14);
                                        Invoke = 0;
                                        Object objInvoke3 = cls3.getMethod((String) objArr14[0], String.class, Integer.TYPE).invoke(objInvoke, objArr);
                                        try {
                                            int mode2 = View.MeasureSpec.getMode(0);
                                            Object[] objArr15 = new Object[1];
                                            b(((mode2 | 30) << 1) - (mode2 ^ 30), new int[]{-879813300, 1126216838, -1023652280, -450469427, -784383114, -909283928, -1823866968, -1349703154, 1784620241, -2049633063, -788143397, 874718440, -1224792096, 1626804891, -571563138, -400872372}, objArr15);
                                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                                            int i184 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                            Object[] objArr16 = new Object[1];
                                            b(((i184 | 9) << 1) - (i184 ^ 9), new int[]{799359167, -1295915654, 1052150444, -337219789, 953372830, 2126551565}, objArr16);
                                            Object[] objArr17 = (Object[]) cls4.getField((String) objArr16[0]).get(objInvoke3);
                                            int i185 = 0;
                                            Invoke = objArr17.length;
                                            while (true) {
                                                if (i185 < Invoke) {
                                                    Object obj5 = objArr17[i185];
                                                    int i186 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                    AndroidViewConfiguration.serializer();
                                                    int i187 = -i186;
                                                    int i188 = (4 & i187) + (i187 | 4);
                                                    int i189 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + ModuleDescriptor.MODULE_VERSION;
                                                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0');
                                                    int iSerializer9 = AndroidViewConfiguration.serializer();
                                                    int i190 = (iLastIndexOf2 * 284) - 9559236;
                                                    int i191 = ~iLastIndexOf2;
                                                    int i192 = ~((i191 ^ 33898) | (33898 & i191));
                                                    int i193 = ~((i191 ^ iSerializer9) | (i191 & iSerializer9));
                                                    int i194 = -(-(((i192 ^ i193) | (i193 & i192)) * (-283)));
                                                    int i195 = (i190 & i194) + (i190 | i194);
                                                    int i196 = -(-((~(((-33899) & iLastIndexOf2) | ((-33899) ^ iLastIndexOf2))) * 283));
                                                    int i197 = (i195 & i196) + (i196 | i195);
                                                    int i198 = ~iLastIndexOf2;
                                                    int i199 = -(-((~(iSerializer9 | (i198 & (-33899)) | (i198 ^ (-33899)))) * 283));
                                                    Object[] objArr18 = new Object[1];
                                                    a(i188, i189, (char) ((i197 & i199) + (i199 | i197)), objArr18);
                                                    String str = (String) objArr18[0];
                                                    int i200 = MediaDescriptionCompat;
                                                    int i201 = ((i200 | 29) << 1) - (i200 ^ 29);
                                                    PlaybackStateCompat = i201 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                    int i202 = i201 % 2;
                                                    try {
                                                        Object[] objArr19 = {str};
                                                        int mode3 = View.MeasureSpec.getMode(0) + 37;
                                                        int pressedStateDuration = android.view.ViewConfiguration.getPressedStateDuration();
                                                        int i203 = MediaDescriptionCompat + 83;
                                                        PlaybackStateCompat = i203 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                        if (i203 % 2 == 0) {
                                                            i5 = 161 / (((pressedStateDuration | (-22)) << 1) - (pressedStateDuration ^ (-22)));
                                                            packedPositionType = ExpandableListView.getPackedPositionType(0L);
                                                            i6 = 22199;
                                                        } else {
                                                            i5 = 160 - (~(pressedStateDuration >> 16));
                                                            packedPositionType = ExpandableListView.getPackedPositionType(0L);
                                                            i6 = 2589;
                                                        }
                                                        int i204 = -(-packedPositionType);
                                                        Object[] objArr20 = new Object[1];
                                                        a(mode3, i5, (char) ((i6 & i204) + (i204 | i6)), objArr20);
                                                        Class<?> cls5 = Class.forName((String) objArr20[0]);
                                                        Object[] objArr21 = new Object[1];
                                                        b(10 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), new int[]{-1776597605, -243268417, 2041363333, 1096966264, -782616647, 1165410460}, objArr21);
                                                        Object objInvoke4 = cls5.getMethod((String) objArr21[0], String.class).invoke(null, objArr19);
                                                        try {
                                                            int i205 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                                            Object[] objArr22 = new Object[1];
                                                            b((i205 ^ 28) + ((i205 & 28) << 1), new int[]{-879813300, 1126216838, -1023652280, -450469427, -784383114, -909283928, -1823866968, -1349703154, 1960211749, 813277611, 1191180563, -14261013, -760121297, 960925038}, objArr22);
                                                            Class<?> cls6 = Class.forName((String) objArr22[0]);
                                                            int i206 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                            int i207 = i206 * 868;
                                                            int i208 = ((i207 | 10416) << 1) - (i207 ^ 10416);
                                                            int i209 = ~i206;
                                                            int i210 = ~(i209 | i32);
                                                            Object[] objArr23 = objArr17;
                                                            int i211 = ~i;
                                                            ?? r26 = Invoke;
                                                            int i212 = ~(((-13) ^ i211) | ((-13) & i211));
                                                            int i213 = -(-(((i210 ^ i212) | (i212 & i210)) * (-867)));
                                                            int i214 = (i208 ^ i213) + ((i213 & i208) << 1);
                                                            int i215 = ~i206;
                                                            int i216 = ~((i215 ^ (-13)) | (i215 & (-13)));
                                                            int i217 = ~((i209 ^ i) | (i209 & i));
                                                            int i218 = (i216 ^ i217) | (i217 & i216);
                                                            int i219 = ~(((-13) ^ i) | ((-13) & i));
                                                            int i220 = ((i218 ^ i219) | (i218 & i219)) * (-1734);
                                                            int i221 = (i214 & i220) + (i220 | i214);
                                                            int i222 = ~((i215 ^ (-13)) | (i215 & (-13)) | i211);
                                                            int i223 = ~(i215 | 12 | i);
                                                            int i224 = (i222 ^ i223) | (i223 & i222);
                                                            int i225 = ((-13) ^ i206) | (i206 & (-13));
                                                            int i226 = ~((i225 ^ i) | (i225 & i));
                                                            int i227 = ((i224 ^ i226) | (i224 & i226)) * 867;
                                                            Object[] objArr24 = new Object[1];
                                                            b((i221 ^ i227) + ((i227 & i221) << 1), new int[]{304230328, 1031699810, 410705275, -2012828735, -393242742, -703336657}, objArr24);
                                                            Invoke = 0;
                                                            Invoke = 0;
                                                            try {
                                                                Invoke = new Object[]{new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr24[0], null).invoke(obj5, null))};
                                                                int i228 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                                                int i229 = i228 * (-381);
                                                                int i230 = PlaybackStateCompat;
                                                                int i231 = (i230 & 9) + (i230 | 9);
                                                                MediaDescriptionCompat = i231 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                if (i231 % 2 != 0) {
                                                                    int i232 = (i229 >>> 5) / ((~i228) - 191);
                                                                    int i233 = ~i42;
                                                                    int i234 = -(((i233 & i228) | (i228 ^ i233)) + 191);
                                                                    i7 = ((i232 | i234) << 1) - (i232 ^ i234);
                                                                    int i235 = ~i228;
                                                                    i8 = (i235 & 37) | (i235 ^ 37);
                                                                } else {
                                                                    int i236 = ((i229 | 7104) << 1) - (i229 ^ 7104);
                                                                    int i237 = ~i228;
                                                                    int i238 = i237 * (-191);
                                                                    int i239 = ((i236 | i238) << 1) - (i236 ^ i238);
                                                                    int i240 = ~(i | 37);
                                                                    int i241 = -(-(((i228 & i240) | (i228 ^ i240)) * 191));
                                                                    i7 = ((i239 | i241) << 1) - (i241 ^ i239);
                                                                    i8 = (i237 ^ 37) | (i237 & 37);
                                                                }
                                                                int i242 = 191 * ((~i8) | (~((i211 ^ 37) | (i211 & 37))));
                                                                int i243 = ((i7 | i242) << 1) - (i242 ^ i7);
                                                                int iNormalizeMetaState2 = android.view.KeyEvent.normalizeMetaState(0);
                                                                int iSerializer10 = AndroidViewConfiguration.serializer();
                                                                int i244 = iNormalizeMetaState2 * 934;
                                                                int i245 = ~iNormalizeMetaState2;
                                                                int i246 = ~iSerializer10;
                                                                int i247 = ((((i244 | (-150052)) << 1) - (i244 ^ (-150052))) - (~(-(-(((~(i245 | i246)) | (-162)) * (-933)))))) - 1;
                                                                int i248 = ~((i246 & (-162)) | ((-162) ^ i246));
                                                                int i249 = MediaDescriptionCompat + 23;
                                                                PlaybackStateCompat = i249 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                int i250 = i249 % 2;
                                                                int i251 = ~((-162) | iNormalizeMetaState2);
                                                                if (i250 == 0) {
                                                                    int i252 = i247 + (((i248 & i251) | (i248 ^ i251)) * 933);
                                                                    int i253 = 933 % (~((iNormalizeMetaState2 ^ 161) | (iNormalizeMetaState2 & 161)));
                                                                    i9 = (i252 & i253) + (i252 | i253);
                                                                    iNormalizeMetaState = android.view.KeyEvent.normalizeMetaState(1);
                                                                    i10 = 21290;
                                                                } else {
                                                                    int i254 = ((i248 & i251) | (i248 ^ i251)) * 933;
                                                                    int i255 = (i247 ^ i254) + ((i247 & i254) << 1);
                                                                    int i256 = -(-((~((iNormalizeMetaState2 ^ 161) | (iNormalizeMetaState2 & 161))) * 933));
                                                                    i9 = ((i255 | i256) << 1) - (i256 ^ i255);
                                                                    iNormalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
                                                                    i10 = 2589;
                                                                }
                                                                int i257 = MediaDescriptionCompat + 81;
                                                                PlaybackStateCompat = i257 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                int i258 = i257 % 2;
                                                                int i259 = (-1965) * iNormalizeMetaState;
                                                                int i260 = -(-(i10 * 984));
                                                                int i261 = (i259 ^ i260) + ((i259 & i260) << 1);
                                                                int i262 = ((~i10) | iNormalizeMetaState) * 983;
                                                                int i263 = ((i261 | i262) << 1) - (i261 ^ i262);
                                                                int i264 = ~iNormalizeMetaState;
                                                                int i265 = ~i10;
                                                                int i266 = ~((i265 ^ i32) | (i265 & i32));
                                                                int i267 = ((i264 ^ i266) | (i264 & i266)) * (-983);
                                                                int i268 = ~iNormalizeMetaState;
                                                                char c2 = (char) ((i263 & i267) + (i263 | i267) + (((~(i10 | i268)) | (~(i268 | i32))) * 983));
                                                                Object[] objArr25 = new Object[1];
                                                                a(i243, i9, c2, objArr25);
                                                                Class<?> cls7 = Class.forName((String) objArr25[0]);
                                                                int i269 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                                Object[] objArr26 = new Object[1];
                                                                b((i269 & 19) + (i269 | 19), new int[]{-1089538572, -307021392, -595055220, -749407554, 846207780, -2024116170, 368112083, -188086717, 284499753, -1773505542}, objArr26);
                                                                Invoke = cls7.getMethod((String) objArr26[0], InputStream.class).invoke(objInvoke4, Invoke);
                                                                try {
                                                                    int i270 = -android.graphics.Color.blue(0);
                                                                    int iSerializer11 = AndroidViewConfiguration.serializer();
                                                                    int i271 = i270 * (-129);
                                                                    int i272 = ((i271 | 4454) << 1) - (i271 ^ 4454);
                                                                    int i273 = ~iSerializer11;
                                                                    int i274 = (i273 & (-35)) | ((-35) ^ i273);
                                                                    int i275 = -(-((~((i274 & i270) | (i274 ^ i270))) * 130));
                                                                    int i276 = (((i272 ^ i275) + ((i275 & i272) << 1)) - (~((~((-35) | i270)) * (-260)))) - 1;
                                                                    int i277 = ~i270;
                                                                    int i278 = ~((i277 & 34) | (i277 ^ 34));
                                                                    int i279 = ~((i270 & (-35)) | ((-35) ^ i270) | iSerializer11);
                                                                    int i280 = i276 + (((i279 & i278) | (i278 ^ i279)) * 130);
                                                                    int i281 = -ExpandableListView.getPackedPositionType(0L);
                                                                    Object[] objArr27 = new Object[1];
                                                                    a(i280, (i281 ^ 198) + ((i281 & 198) << 1), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr27);
                                                                    Class<?> cls8 = Class.forName((String) objArr27[0]);
                                                                    Object[] objArr28 = new Object[1];
                                                                    b(22 - (~ExpandableListView.getPackedPositionType(0L)), new int[]{184673662, 1022993448, 425575275, 414356961, 1973031392, 181894438, -924903918, 1201560115, -1441995877, -130515928, 2006324876, 123012321}, objArr28);
                                                                    if (!objNewInstance.equals(cls8.getMethod((String) objArr28[0], null).invoke(Invoke, null))) {
                                                                        int i282 = MediaDescriptionCompat;
                                                                        int i283 = (i282 ^ 95) + ((i282 & 95) << 1);
                                                                        PlaybackStateCompat = i283 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                        int i284 = i283 % 2;
                                                                        try {
                                                                            int i285 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                                                            int iSerializer12 = AndroidViewConfiguration.serializer();
                                                                            int i286 = (i285 * (-405)) + 13838;
                                                                            int i287 = ~(((-35) ^ iSerializer12) | ((-35) & iSerializer12));
                                                                            int i288 = ~iSerializer12;
                                                                            int i289 = (i288 ^ i285) | (i288 & i285);
                                                                            int i290 = ~((i289 ^ 34) | (i289 & 34));
                                                                            int i291 = -(-(((i287 ^ i290) | (i287 & i290)) * (-406)));
                                                                            int i292 = (i286 ^ i291) + ((i286 & i291) << 1);
                                                                            int i293 = ((-35) ^ i288) | ((-35) & i288);
                                                                            int i294 = (~((i293 & i285) | (i293 ^ i285))) * (-406);
                                                                            int i295 = (i292 ^ i294) + ((i294 & i292) << 1);
                                                                            int i296 = ~i285;
                                                                            int i297 = PlaybackStateCompat;
                                                                            int i298 = (i297 ^ 85) + ((i297 & 85) << 1);
                                                                            MediaDescriptionCompat = i298 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                            int i299 = i298 % 2;
                                                                            int i300 = ~(i296 | iSerializer12);
                                                                            int i301 = ~iSerializer12;
                                                                            int i302 = -(-(406 * (i300 | (~((i301 & 34) | (i301 ^ 34))))));
                                                                            int i303 = (i295 & i302) + (i302 | i295);
                                                                            int i304 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                                            int i305 = i304 * 592;
                                                                            int i306 = MediaDescriptionCompat;
                                                                            int i307 = ((i306 | 57) << 1) - (i306 ^ 57);
                                                                            PlaybackStateCompat = i307 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                            int i308 = i307 % 2;
                                                                            int i309 = (i305 & (-116230)) + (i305 | (-116230));
                                                                            int i310 = ~i304;
                                                                            int i311 = i309 + ((~((i310 & 197) | (i310 ^ 197))) * (-1182));
                                                                            int i312 = ~i304;
                                                                            int i313 = i312 | (-198);
                                                                            int i314 = (i311 - (~(((~((i304 & 197) | (i304 ^ 197))) | (~((i313 & i211) | (i313 ^ i211)))) * (-591)))) - 1;
                                                                            int i315 = (i ^ i312) | (i312 & i);
                                                                            int i316 = -(-(((i315 & (-198)) | (i315 ^ (-198))) * 591));
                                                                            Object[] objArr29 = new Object[1];
                                                                            a(i303, (i314 & i316) + (i316 | i314), (char) ((-2) - (~(-TextUtils.lastIndexOf("", '0')))), objArr29);
                                                                            Class<?> cls9 = Class.forName((String) objArr29[0]);
                                                                            int i317 = PlaybackStateCompat;
                                                                            int i318 = ((i317 | 77) << 1) - (i317 ^ 77);
                                                                            MediaDescriptionCompat = i318 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                            if (i318 % 2 != 0) {
                                                                                i13 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                                i14 = ((-711) >>> i13) * 1686110208;
                                                                            } else {
                                                                                i13 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                                                                i14 = (i13 * (-711)) + 16399;
                                                                            }
                                                                            int i319 = ~(((-24) ^ i13) | ((-24) & i13));
                                                                            int i320 = ~((i211 ^ i13) | (i211 & i13));
                                                                            int i321 = i14 + ((-712) * ((i319 ^ i320) | (i320 & i319)));
                                                                            int i322 = ((-24) ^ i211) | ((-24) & i211);
                                                                            int i323 = ~((i322 & i13) | (i322 ^ i13));
                                                                            int i324 = (i13 ^ 23) | (i13 & 23);
                                                                            int i325 = ~((i324 ^ i) | (i324 & i));
                                                                            int i326 = -(-(((i323 ^ i325) | (i323 & i325)) * (-712)));
                                                                            int i327 = (i321 & i326) + (i326 | i321);
                                                                            int i328 = PlaybackStateCompat;
                                                                            int i329 = (i328 & 63) + (i328 | 63);
                                                                            MediaDescriptionCompat = i329 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                            if (i329 % 2 != 0) {
                                                                                int i330 = -(-((~((i32 ^ i13) | (i32 & i13))) | (-24)));
                                                                                int i331 = -((i330 & 712) + (i330 | 712));
                                                                                Object[] objArr30 = new Object[1];
                                                                                b((i327 ^ i331) + ((i331 & i327) << 1), new int[]{184673662, 1022993448, 425575275, 414356961, 1973031392, 181894438, -924903918, 1201560115, -1441995877, -130515928, 2006324876, 123012321}, objArr30);
                                                                                obj2 = obj4;
                                                                                if (!obj2.equals(cls9.getMethod((String) objArr30[0], null).invoke(Invoke, null))) {
                                                                                    i185++;
                                                                                    objArr17 = objArr23;
                                                                                    obj4 = obj2;
                                                                                    Invoke = r26 == true ? 1 : 0;
                                                                                }
                                                                            } else {
                                                                                obj2 = obj4;
                                                                                int i332 = ~(i211 | i13);
                                                                                int i333 = -(-(((i332 & (-24)) | ((-24) ^ i332)) * 712));
                                                                                Object[] objArr31 = new Object[1];
                                                                                b((i327 & i333) + (i333 | i327), new int[]{184673662, 1022993448, 425575275, 414356961, 1973031392, 181894438, -924903918, 1201560115, -1441995877, -130515928, 2006324876, 123012321}, objArr31);
                                                                                if (!obj2.equals(cls9.getMethod((String) objArr31[0], null).invoke(Invoke, null))) {
                                                                                    i185++;
                                                                                    objArr17 = objArr23;
                                                                                    obj4 = obj2;
                                                                                    Invoke = r26 == true ? 1 : 0;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            Throwable cause = th.getCause();
                                                                            if (cause != null) {
                                                                                throw cause;
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    int i334 = (i & (-2)) | (i32 & 1);
                                                                    objArr2 = new Object[4];
                                                                    int[] iArr = new int[1];
                                                                    objArr2[0] = iArr;
                                                                    objArr2[2] = new int[]{i};
                                                                    objArr2[3] = new int[1];
                                                                    int i335 = PlaybackStateCompat + 9;
                                                                    MediaDescriptionCompat = i335 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                    if (i335 % 2 != 0) {
                                                                        iArr[1] = i334;
                                                                        objArr2[1] = null;
                                                                    } else {
                                                                        iArr[0] = i334;
                                                                        objArr2[1] = null;
                                                                    }
                                                                    int iNextInt = new Random().nextInt(576924126);
                                                                    int i336 = (~((-891523826) | iNextInt)) | 622858240;
                                                                    int i337 = ~((~iNextInt) | 1026798589);
                                                                    int i338 = (-1959713795) + ((i336 | i337) * (-470)) + (((~(iNextInt | (-268665586))) | i337) * 470);
                                                                    int i339 = (i338 & 16) + (16 | i338) + i2;
                                                                    int i340 = MediaDescriptionCompat;
                                                                    int i341 = (i340 & 3) + (i340 | 3);
                                                                    int i342 = i341 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                    PlaybackStateCompat = i342;
                                                                    if (i341 % 2 == 0) {
                                                                        int i343 = i339 << 56;
                                                                        int i344 = ((~i339) & i343) | ((~i343) & i339);
                                                                        i11 = i344 ^ (i344 - 44);
                                                                        i12 = 2;
                                                                    } else {
                                                                        int i345 = i339 << 13;
                                                                        int i346 = ((~i339) & i345) | ((~i345) & i339);
                                                                        int i347 = i346 >>> 17;
                                                                        i11 = (i346 | i347) & (~(i346 & i347));
                                                                        i12 = 5;
                                                                    }
                                                                    int i348 = ((i342 | 23) << 1) - (i342 ^ 23);
                                                                    int i349 = i348 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                    MediaDescriptionCompat = i349;
                                                                    int i350 = i348 % 2;
                                                                    int i351 = i11 << i12;
                                                                    ((int[]) objArr2[3])[0] = ((~i11) & i351) | ((~i351) & i11);
                                                                    int i352 = (i349 & 87) + (i349 | 87);
                                                                    PlaybackStateCompat = i352 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                                    int i353 = i352 % 2;
                                                                } catch (Throwable th2) {
                                                                    Throwable cause2 = th2.getCause();
                                                                    if (cause2 != null) {
                                                                        throw cause2;
                                                                    }
                                                                    throw th2;
                                                                }
                                                            } catch (Throwable th3) {
                                                                Throwable cause3 = th3.getCause();
                                                                if (cause3 != null) {
                                                                    throw cause3;
                                                                }
                                                                throw th3;
                                                            }
                                                        } catch (Throwable th4) {
                                                            Throwable cause4 = th4.getCause();
                                                            if (cause4 != null) {
                                                                throw cause4;
                                                            }
                                                            throw th4;
                                                        }
                                                    } catch (Throwable th5) {
                                                        Throwable cause5 = th5.getCause();
                                                        if (cause5 != null) {
                                                            throw cause5;
                                                        }
                                                        throw th5;
                                                    }
                                                } else {
                                                    Invoke = i2;
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    } catch (Throwable th6) {
                                        Throwable cause6 = th6.getCause();
                                        if (cause6 != null) {
                                            throw cause6;
                                        }
                                        throw th6;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    Throwable cause7 = th.getCause();
                                    if (cause7 != null) {
                                        throw cause7;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                            }
                        } catch (Throwable th9) {
                            Throwable cause8 = th9.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th9;
                        }
                        objArr2 = new Object[]{new int[]{i}, null, new int[]{i}, new int[1]};
                        int iNextInt2 = new Random().nextInt();
                        int i354 = 566420615 + ((436354041 | iNextInt2) * 614);
                        int i355 = ~iNextInt2;
                        int i356 = i354 + (((~((-1009315411) | i355)) | 402664016 | (~(640341419 | i355))) * (-1228)) + (((~(i355 | 1043005435)) | (~((-606651395) | i355))) * 614);
                        int iSerializer13 = AndroidViewConfiguration.serializer();
                        int i357 = PlaybackStateCompat;
                        int i358 = ((i357 | 81) << 1) - (i357 ^ 81);
                        int i359 = i358 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        MediaDescriptionCompat = i359;
                        int i360 = i358 % 2;
                        int i361 = ~i356;
                        int i362 = ~iSerializer13;
                        int i363 = ~((i361 ^ i362) | (i361 & i362));
                        int i364 = ~i362;
                        int i365 = (((i356 * (-958)) - (~(-(-(959 * ((i364 & i363) | (i363 ^ i364))))))) - 1) + ((~i356) * (-959));
                        int i366 = ~iSerializer13;
                        int i367 = (~(i366 | ((-1) ^ i366))) | (~((i361 & iSerializer13) | (i361 ^ iSerializer13)));
                        int i368 = ~iSerializer13;
                        int i369 = ((i368 & i367) | (i367 ^ i368)) * 959;
                        i15 = (i365 ^ i369) + ((i369 & i365) << 1);
                        int i370 = (i15 * (-519)) + (Invoke * 521);
                        int i371 = ~i15;
                        i16 = ~Invoke;
                        i17 = ~i;
                        int i372 = ((~(i371 | i16 | i17)) | (~((Invoke ^ i) | (Invoke & i)))) * 520;
                        i18 = ((i370 | i372) << 1) - (i370 ^ i372);
                        i19 = i359 + 105;
                        PlaybackStateCompat = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i19 % 2 == 0) {
                            int i373 = ~((i16 ^ i17) | (i16 & i17));
                            i20 = (i & i15) | (i15 ^ i);
                            int i374 = ~i20;
                            i21 = i18 % ((-1040) >>> ((i373 & i374) | (i373 ^ i374)));
                            int i375 = ~i15;
                            i22 = (~((i375 & i17) | (i375 ^ i17))) | (~((i16 ^ i15) | (i16 & i15)));
                        } else {
                            i20 = (i & i15) | (i15 ^ i);
                            int i376 = -(-(((~((i16 ^ i17) | (i16 & i17))) | (~i20)) * (-1040)));
                            i21 = (i18 ^ i376) + ((i376 & i18) << 1);
                            int i377 = ~((~i15) | i17);
                            int i378 = ~Invoke;
                            int i379 = ~((i378 & i15) | (i378 ^ i15));
                            i22 = (i377 & i379) | (i377 ^ i379);
                        }
                        int i380 = ~i20;
                        int i381 = 520 * ((i22 & i380) | (i22 ^ i380));
                        int i382 = (i21 ^ i381) + ((i381 & i21) << 1);
                        int i383 = i382 << 13;
                        int i384 = ((~i382) & i383) | ((~i383) & i382);
                        int i385 = i384 >>> 17;
                        int i386 = ((~i384) & i385) | ((~i385) & i384);
                        ((int[]) objArr2[3])[0] = i386 ^ (i386 << 5);
                    } catch (Throwable th10) {
                        Throwable cause9 = th10.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th10;
                    }
                } catch (Throwable th11) {
                    Throwable cause10 = th11.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th11;
                }
            } catch (Throwable unused2) {
            }
        } else {
            objArr2 = new Object[]{new int[]{i}, null, new int[]{i}, new int[1]};
            int iNextInt3 = new Random().nextInt();
            int i3510 = 566420615 + ((436354041 | iNextInt3) * 614);
            int i3511 = ~iNextInt3;
            int i3512 = i3510 + (((~((-1009315411) | i3511)) | 402664016 | (~(640341419 | i3511))) * (-1228)) + (((~(i3511 | 1043005435)) | (~((-606651395) | i3511))) * 614);
            int iSerializer14 = AndroidViewConfiguration.serializer();
            int i3513 = PlaybackStateCompat;
            int i3514 = ((i3513 | 81) << 1) - (i3513 ^ 81);
            int i3515 = i3514 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaDescriptionCompat = i3515;
            int i3610 = i3514 % 2;
            int i3611 = ~i3512;
            int i3612 = ~iSerializer14;
            int i3613 = ~((i3611 ^ i3612) | (i3611 & i3612));
            int i3614 = ~i3612;
            int i3615 = (((i3512 * (-958)) - (~(-(-(959 * ((i3614 & i3613) | (i3613 ^ i3614))))))) - 1) + ((~i3512) * (-959));
            int i3616 = ~iSerializer14;
            int i3617 = (~(i3616 | ((-1) ^ i3616))) | (~((i3611 & iSerializer14) | (i3611 ^ iSerializer14)));
            int i3618 = ~iSerializer14;
            int i3619 = ((i3618 & i3617) | (i3617 ^ i3618)) * 959;
            i15 = (i3615 ^ i3619) + ((i3619 & i3615) << 1);
            int i3710 = (i15 * (-519)) + (Invoke * 521);
            int i3711 = ~i15;
            i16 = ~Invoke;
            i17 = ~i;
            int i3712 = ((~(i3711 | i16 | i17)) | (~((Invoke ^ i) | (Invoke & i)))) * 520;
            i18 = ((i3710 | i3712) << 1) - (i3710 ^ i3712);
            i19 = i3515 + 105;
            PlaybackStateCompat = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i19 % 2 == 0) {
                int i3713 = ~((i16 ^ i17) | (i16 & i17));
                i20 = (i & i15) | (i15 ^ i);
                int i3714 = ~i20;
                i21 = i18 % ((-1040) >>> ((i3713 & i3714) | (i3713 ^ i3714)));
                int i3715 = ~i15;
                i22 = (~((i3715 & i17) | (i3715 ^ i17))) | (~((i16 ^ i15) | (i16 & i15)));
            } else {
                i20 = (i & i15) | (i15 ^ i);
                int i3716 = -(-(((~((i16 ^ i17) | (i16 & i17))) | (~i20)) * (-1040)));
                i21 = (i18 ^ i3716) + ((i3716 & i18) << 1);
                int i3717 = ~((~i15) | i17);
                int i3718 = ~Invoke;
                int i3719 = ~((i3718 & i15) | (i3718 ^ i15));
                i22 = (i3717 & i3719) | (i3717 ^ i3719);
            }
            int i387 = ~i20;
            int i388 = 520 * ((i22 & i387) | (i22 ^ i387));
            int i389 = (i21 ^ i388) + ((i388 & i21) << 1);
            int i3810 = i389 << 13;
            int i3811 = ((~i389) & i3810) | ((~i3810) & i389);
            int i3812 = i3811 >>> 17;
            int i3813 = ((~i3811) & i3812) | ((~i3812) & i3811);
            ((int[]) objArr2[3])[0] = i3813 ^ (i3813 << 5);
        }
        return objArr2;
    }
}
