package o;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import com.huawei.hms.adapter.internal.BaseCode;
import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.secure.certificate.GetRefreshSessionTokenShaImpl$invoke$2;
import java.lang.reflect.Method;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class accesspreviewRoutesInternal implements toNativeBlendMode {
    private static final byte[] $$a = {94, -68, 1, -105};
    private static final int $$b = 126;
    private static int MediaBrowserCompatMediaItem;
    private static int MediaDescriptionCompat;
    private static byte[] MediaMetadataCompat;
    private static int MediaSessionCompatQueueItem;
    private static final int MediaSessionCompatResultReceiverWrapper;
    private static final byte[] MediaSessionCompatToken;
    private static short[] PlaybackStateCompat;
    private static int RatingCompat;
    private static int serializer;
    private final lottieComposition IconCompatParcelizer;
    private final isOpenInternalroom_runtime RemoteActionCompatParcelizer;
    private final LottieAnimatableImplanimate2 read;
    private final SystemLifecycleSystemLifecycleCallback write;

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(short r6, byte r7, int r8) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r8 = r8 + 4
            int r7 = r7 + 113
            byte[] r1 = o.accesspreviewRoutesInternal.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L20:
            int r8 = r8 + 1
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L27:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accesspreviewRoutesInternal.$$c(short, byte, int):java.lang.String");
    }

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public accesspreviewRoutesInternal(LottieAnimatableImplanimate2 lottieAnimatableImplanimate2, lottieComposition lottiecomposition, SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        lottieAnimatableImplanimate2.getClass();
        lottiecomposition.getClass();
        systemLifecycleSystemLifecycleCallback.getClass();
        isopeninternalroom_runtime.getClass();
        this.read = lottieAnimatableImplanimate2;
        this.IconCompatParcelizer = lottiecomposition;
        this.write = systemLifecycleSystemLifecycleCallback;
        this.RemoteActionCompatParcelizer = isopeninternalroom_runtime;
    }

    private static void b(int i, int i2, byte b, short s, int i3, Object[] objArr) throws Throwable {
        long j;
        toViewVelocity toviewvelocity = new toViewVelocity();
        StringBuilder sb = new StringBuilder();
        char c = 2;
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(MediaDescriptionCompat)};
            Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1745204208);
            if (objRemoteActionCompatParcelizer == null) {
                char c2 = (char) (15496 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int maximumFlingVelocity = 2821 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int i4 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17;
                byte b2 = $$a[2];
                byte b3 = (byte) (b2 - 1);
                byte b4 = b2;
                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c2, maximumFlingVelocity, i4, 1193962993, false, $$c(b3, b4, (byte) (-b4)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 == 0) {
                j = -565326573115254380L;
            } else {
                byte[] bArr = MediaMetadataCompat;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-748751776);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 4453);
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 2484;
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 18;
                            byte b5 = $$a[c];
                            byte b6 = (byte) (b5 - 1);
                            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cIndexOf, offsetBefore, absoluteGravity, 59692417, false, $$c(b6, b6, (byte) (-b5)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i6++;
                        c = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = MediaMetadataCompat;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(MediaSessionCompatQueueItem)};
                    Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1745204208);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 15496);
                        int i7 = 2821 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int iResolveSize = View.resolveSize(0, 0) + 17;
                        byte b7 = $$a[2];
                        byte b8 = (byte) (b7 - 1);
                        byte b9 = b7;
                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(gidForName, i7, iResolveSize, 1193962993, false, $$c(b8, b9, (byte) (-b9)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ (-565326573115254380L))) + ((int) (((long) MediaDescriptionCompat) ^ (-565326573115254380L))));
                    j = -565326573115254380L;
                } else {
                    j = -565326573115254380L;
                    iIntValue = (short) (((short) (((long) PlaybackStateCompat[i + ((int) (((long) MediaSessionCompatQueueItem) ^ (-565326573115254380L)))]) ^ (-565326573115254380L))) + ((int) (((long) MediaDescriptionCompat) ^ (-565326573115254380L))));
                }
            }
            if (iIntValue > 0) {
                toviewvelocity.RemoteActionCompatParcelizer = ((i + iIntValue) - 2) + ((int) (((long) MediaSessionCompatQueueItem) ^ j)) + i5;
                Object[] objArr5 = {toviewvelocity, Integer.valueOf(i3), Integer.valueOf(MediaBrowserCompatMediaItem), sb};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1760519764);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char jumpTapTimeout = (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 2411;
                    int iAlpha = android.graphics.Color.alpha(0) + 15;
                    byte b10 = $$a[2];
                    byte b11 = (byte) (b10 - 1);
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(jumpTapTimeout, threadPriority, iAlpha, 1203812429, false, $$c(b11, (byte) (b11 + 2), (byte) (-b10)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(toviewvelocity.serializer);
                toviewvelocity.IconCompatParcelizer = toviewvelocity.serializer;
                byte[] bArr4 = MediaMetadataCompat;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i8 = 0; i8 < length2; i8++) {
                        bArr5[i8] = (byte) (((long) bArr4[i8]) ^ (-565326573115254380L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                toviewvelocity.read = 1;
                while (toviewvelocity.read < iIntValue) {
                    if (z) {
                        byte[] bArr6 = MediaMetadataCompat;
                        int i9 = toviewvelocity.RemoteActionCompatParcelizer;
                        toviewvelocity.RemoteActionCompatParcelizer = i9 - 1;
                        toviewvelocity.serializer = (char) (toviewvelocity.IconCompatParcelizer + (((byte) (((byte) (((long) bArr6[i9]) ^ (-565326573115254380L))) + s)) ^ b));
                    } else {
                        short[] sArr = PlaybackStateCompat;
                        int i10 = toviewvelocity.RemoteActionCompatParcelizer;
                        toviewvelocity.RemoteActionCompatParcelizer = i10 - 1;
                        toviewvelocity.serializer = (char) (toviewvelocity.IconCompatParcelizer + (((short) (((short) (((long) sArr[i10]) ^ (-565326573115254380L))) + s)) ^ b));
                    }
                    sb.append(toviewvelocity.serializer);
                    toviewvelocity.IconCompatParcelizer = toviewvelocity.serializer;
                    toviewvelocity.read++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = o.accesspreviewRoutesInternal.MediaSessionCompatToken
            int r7 = r7 + 97
            int r9 = r9 + 4
            int r8 = r8 + 5
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r4 = r2
            goto L28
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L28:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-5)
            r9 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accesspreviewRoutesInternal.a(byte, short, short, java.lang.Object[]):void");
    }

    static void read() {
        MediaSessionCompatQueueItem = 1364943507;
        MediaDescriptionCompat = -1583376727;
        MediaBrowserCompatMediaItem = 1818980394;
        MediaMetadataCompat = new byte[]{-128, -121, -116, 53, -128, -121, -116, 54, -121, -121, -116, 54, -121, -121, -116, 59, -126, -121, -116, 36, -127, -121, -116, 54, -121, -128, 48, -123, -128, 57, -116, -121, -116, 54, -121, -128, 59, -126, -128, 36, -127, -128, 57, -116, -128, 50, -117, -128, 58, -125, -121, -116, 63, 62, -121, -116, 63, 62, -121, -116, 50, -113, -116, 55, -118, -116, 54, -121, -128, 48, -123, -128, 48, -119, -116, 54, -121, -128, 59, -126, -128, 36, -127, -128, 57, -116, -128, 58, -125, -128, 53, -76, -116, 54, -117, -116, 55, -113, 59, -122, -116, 48, -118, 53, -119, 36, -123, -116, 59, -117, 54, -76, 57, -128, -116, 59, -117, 58, -121, 5, 6, 25, 116, 5, 6, 25, 118, 27, 6, 25, 126, 125, 27, 118, 27, 6, 25, 79, 27, 4, 117, 4, 6, 25, 113, 4, 25, 117, 7, 117, 5, 4, 114, 2, 75, 1, 112, 5, 25, 114, 2, 116, 5, 6, 25, 75, 6, 6, 25, 114, 31, 6, 25, 113, 24, 6, 25, 75, 31, 4, 112, 25, 6, 25, 114, 24, 4, 113, 24, 5, 112, 25, 5, 116, 6, 4, 119, 26, 6, 25, 126, 115, 6, 25, 126, 115, 6, 25, 79, 14, 25, 118, 7, 25, 75, 31, 4, 117, 0, 25, 114, 24, 4, 113, 25, 4, 116, 1, 25, 75, 2, 25, 118, 14, 114, 27, 25, 117, 7, 116, 0, 113, 4, 25, 112, 26, 4, 112, 5, 25, 114, 2, 119, 6, 61, -102, -122, 51, 50, -124, 51, 61, -102, -122, 48, -124, -123, 48, -113, -101, -122, 57, -122, -101, -122, 62, 60, -113, 57, 61, -113, 11, -125, 11, -124, -101, -122, 10, -123, -101, -122, 53, -102, -101, -122, 52, -101, -101, -122, 52, -101, -102, 10, -123, -102, 63, -128, -101, -122, 63, -127, -123, 56, 50, -113, 51, 51, -113, 62, -127, -101, -122, 57, -122, -101, -122, 11, -125, 56, -121, -101, -122, 10, -120, 53, -119, 51, 60, -101, -122, 48, -123, -124, 11, -102, -124, 48, -125, -122, 10, -101, -124, 53, -128, -124, 11, -120, -122, 52, -127, -124, 63, -122, -124, 10, -119, -122, 10, -120, 53, -114, -122, 57, 60, -124, 56, 61, -124, 52, -113, -122, 62, -121, -124, 63, -124, -122, 63, -113, 62, -123, -122, 57, 60, -124, 56, 61, -124, 57, -102, -122, 63, -113, 56, -101};
    }

    static {
        byte[] bArr = new byte[775];
        System.arraycopy("'\u0016¤Üî\u0005íþ\u0001\u00001µ\nèÿAÕêèÿ\u001aÜ\u0006øôö\u0005úè$ä\u0004æ\u0010.½\u0006î\u00024æÖ\u0002ê\u001aéï÷\u000bò\u0006ùî\u0005íþ\u0001\u00001³\bÿéDÓèÿé/Ïü\u0003øýíþ\fè\u0006õüýì\"ßö\u0000÷ó\u0003\"Õþö\u0002\fìôø\u0007õðöî\u0005íþ\u0001\u00001º÷@ÖÕ\u0001ú\nó%Òø\u0007óéþû\bòõ\u001bçñ\bÿø\u000bæ÷\u0003\u0013ßøûþñî\u0005íþ\u0001\u00001³\bÿéDÓèÿéNÒãÿéùþ\b\rÞ\u0006ýýì\"Ù\u0006úýì$áç\"èð\u0006ÿè+Úô\u0006ãî\u0005íþ\u0001\u00001³\bÿéDÞáç/Ê\fòõýì+Úÿø\u001cÖ\u0002êýì%Ð\u0003ø\u0017îì\u0017æ÷\u0003ñõüî\u0005íþ\u0001\u00001º÷@ÙÙþ\u0007ùíûýì*Ô\u0006ìø\tü\u001cÎö\u001cæ÷\u0003ýì\u0015æûý%Ïüõýþþô\u001aæ÷\u0003ñõüýì\u0018éö\u0005ðó\u001eàõ\rö\u0010âøú\u0004æ\u0010.½\u0006î\u00024ÖÚý\u0004ö\u0002þÿþð\u0004æ\u0010.½\u0006î\u00024àÖõ\nùýî\u0010ðò\u000b\u0011äöõ\u0019ððò\u000b\u0004æ\u0010.½\u0006î\u00024äÈ\u0010ùð÷\u0006õüýì\"çä\n÷ó\u0003\"Õþö\u0002\fìôø\u0007õðöýì\"çä(áç1Ï\u0006úî\u0005íþ\u0001\u00001³\bÿéDÓèÿéïý\u0006ôö\u0004\u0013ãÿéùþ\bü\fÚ\u000eè\níýì\u001cëìþþû!Ï\u0004\u0001ê\u0006õüúø\u0000\u0007ðþê\u0010\u0013ãì\u000e\tÚ\u000eè\nî\u0005íþ\u0001\u00001µ\nô\u0002ð\u0003ôüðFÆúò\u0007.æÚò\u0007\u0019Ùôû\u001bØ\u0007ýè\u0006õüïüó\fîù\u001e×\u000fêù\u001céý\nà&Úý\u001aÚùð\bûíî\u0005íþ\u0001\u00001²\t\u0000øýìAäÈ\u0003\nî\u0005þúñ\u0002\u0014Þñú\u0019èÿéýì\u001fêùó\u0001ü\u000fÜ÷\u0005ð\u0006õü#Òø&Ðþõ\u0000ýì(Ù\u0000\u0019Òø\u001fèï\u0003\bíÿþñ\f\råê\u0010\u001fÎ\u0005\fÚ\u000eè\nï æ\u0000î\u0005íþ\u0001\u00001Âð\fì\u0003ú\u0001ë@ÙÜ\u0001öõ)\u0002ò\u0002î\u0007ýì\u001fêùó\u0001ü\u000fÜ÷\u0005ð\u0006õü#Òø*Öúø\u0003ýì\u001bîì\u0017æ÷\u0003ñõüýì\u001fêùó\u0001ü\u000fÜ÷\u0005ð\u0006õü\"Ðþõ\u0000ýì äûî\tì-Øúòø\bî\u0005íþ\u0001\u00001Âð\fì\u0003ú\u0001ë@à×\u0007õý\u001aÒø\u0000\u0007èýì-Ôðü\u001eæî\u001dâì\u000eô".getBytes("ISO-8859-1"), 0, bArr, 0, 775);
        MediaSessionCompatToken = bArr;
        MediaSessionCompatResultReceiverWrapper = 10;
        read();
        serializer = 0;
        RatingCompat = 1;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0688 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x067a  */
    @Override // o.toNativeBlendMode
    public Object IconCompatParcelizer(String str, ShortNewsContentCardView<? super String> shortNewsContentCardView) throws Throwable {
        logEvent logevent;
        int i;
        char c;
        logEvent logevent2 = new logEvent(this, str, shortNewsContentCardView);
        try {
            byte[] bArr = MediaSessionCompatToken;
            Object[] objArr = new Object[1];
            a(bArr[9], bArr[76], (short) 408, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[352], bArr[445], (short) 609, objArr2);
            int iIntValue = (-1245395465) - ((Integer) cls.getMethod((String) objArr2[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, 0, 0, 0)).intValue();
            Object[] objArr3 = new Object[1];
            a(bArr[9], bArr[356], bArr[68], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            byte b = bArr[22];
            byte b2 = bArr[352];
            int i2 = MediaSessionCompatResultReceiverWrapper;
            Object[] objArr4 = new Object[1];
            a(b, b2, (short) (i2 | 260), objArr4);
            int i3 = 1157640540 - (((Long) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1));
            byte b3 = bArr[9];
            byte b4 = bArr[170];
            Object[] objArr5 = new Object[1];
            a(b3, b4, (short) (b4 | 224), objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            byte b5 = bArr[76];
            byte b6 = bArr[9];
            Object[] objArr6 = new Object[1];
            a(b5, b6, (short) (b6 | 627), objArr6);
            byte bIntValue = (byte) ((((Integer) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).intValue() >> 22) - 75);
            Object[] objArr7 = {Float.valueOf(0.0f), Float.valueOf(0.0f)};
            byte b7 = bArr[9];
            byte b8 = (byte) (-bArr[4]);
            Object[] objArr8 = new Object[1];
            a(b7, b8, (short) (b8 | 613), objArr8);
            Class<?> cls4 = Class.forName((String) objArr8[0]);
            byte b9 = bArr[48];
            byte b10 = bArr[8];
            Object[] objArr9 = new Object[1];
            a(b9, b10, (short) (b10 | 652), objArr9);
            short s = (short) ((-94) - (((Float) cls4.getMethod((String) objArr9[0], Float.TYPE, Float.TYPE).invoke(null, objArr7)).floatValue() > 0.0f ? 1 : (((Float) cls4.getMethod((String) objArr9[0], Float.TYPE, Float.TYPE).invoke(null, objArr7)).floatValue() == 0.0f ? 0 : -1)));
            Object[] objArr10 = {"", "", 0};
            Object[] objArr11 = new Object[1];
            a(bArr[9], bArr[352], bArr[14], objArr11);
            Class<?> cls5 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            a(bArr[60], bArr[38], bArr[570], objArr12);
            String str2 = (String) objArr12[0];
            logEvent logevent3 = logevent2;
            Object[] objArr13 = new Object[1];
            a(bArr[266], bArr[352], bArr[20], objArr13);
            Object[] objArr14 = new Object[1];
            a(bArr[266], bArr[352], bArr[20], objArr14);
            Object[] objArr15 = new Object[1];
            b(iIntValue, i3, bIntValue, s, ((Integer) cls5.getMethod(str2, Class.forName((String) objArr13[0]), Class.forName((String) objArr14[0]), Integer.TYPE).invoke(null, objArr10)).intValue() - 1997220241, objArr15);
            String str3 = (String) objArr15[0];
            byte b11 = bArr[9];
            byte b12 = bArr[222];
            Object[] objArr16 = new Object[1];
            a(b11, b12, (short) (b12 | 513), objArr16);
            Class<?> cls6 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            a(bArr[22], bArr[570], (short) 658, objArr17);
            int i4 = (((Long) cls6.getMethod((String) objArr17[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).longValue() > 0L ? 1 : (((Long) cls6.getMethod((String) objArr17[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).longValue() == 0L ? 0 : -1)) - 1245395599;
            Object[] objArr18 = new Object[1];
            a(bArr[9], bArr[356], bArr[68], objArr18);
            Class<?> cls7 = Class.forName((String) objArr18[0]);
            byte b13 = bArr[22];
            byte b14 = bArr[60];
            Object[] objArr19 = new Object[1];
            a(b13, b14, (short) (b14 | 674), objArr19);
            int iIntValue2 = 1157640388 - (((Integer) cls7.getMethod((String) objArr19[0], null).invoke(null, null)).intValue() >> 16);
            byte b15 = bArr[9];
            byte b16 = bArr[222];
            Object[] objArr20 = new Object[1];
            a(b15, b16, (short) (b16 | 513), objArr20);
            Class<?> cls8 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            a(bArr[22], bArr[352], (short) 694, objArr21);
            byte bIntValue2 = (byte) (((Integer) cls8.getMethod((String) objArr21[0], Long.TYPE).invoke(null, 0L)).intValue() - 61);
            Object[] objArr22 = new Object[1];
            a(bArr[9], bArr[352], bArr[14], objArr22);
            Class<?> cls9 = Class.forName((String) objArr22[0]);
            byte b17 = (byte) i2;
            Object[] objArr23 = new Object[1];
            a(bArr[22], b17, (short) (b17 | 705), objArr23);
            String str4 = (String) objArr23[0];
            Object[] objArr24 = new Object[1];
            a(bArr[266], bArr[352], bArr[20], objArr24);
            short sIntValue = (short) (((Integer) cls9.getMethod(str4, Class.forName((String) objArr24[0]), Integer.TYPE).invoke(null, "", 0)).intValue() - 70);
            Object[] objArr25 = {0};
            Object[] objArr26 = new Object[1];
            a(bArr[9], bArr[232], (short) 729, objArr26);
            Class<?> cls10 = Class.forName((String) objArr26[0]);
            Object[] objArr27 = new Object[1];
            a(bArr[22], (byte) i2, (short) 756, objArr27);
            Object[] objArr28 = new Object[1];
            b(i4, iIntValue2, bIntValue2, sIntValue, (-1997220243) - ((Integer) cls10.getMethod((String) objArr27[0], Integer.TYPE).invoke(null, objArr25)).intValue(), objArr28);
            Object[] objArr29 = {(String) objArr28[0]};
            short s2 = (short) 308;
            Object[] objArr30 = new Object[1];
            a(bArr[266], bArr[48], s2, objArr30);
            Class<?> cls11 = Class.forName((String) objArr30[0]);
            byte b18 = (byte) (-bArr[4]);
            byte b19 = bArr[9];
            Object[] objArr31 = new Object[1];
            a(b18, b19, (short) (b19 | 323), objArr31);
            String str5 = (String) objArr31[0];
            Object[] objArr32 = new Object[1];
            a(bArr[266], bArr[48], s2, objArr32);
            Object[] objArr33 = (Object[]) cls11.getMethod(str5, Class.forName((String) objArr32[0])).invoke(str3, objArr29);
            int[] iArr = new int[objArr33.length];
            for (int i5 = 0; i5 < objArr33.length; i5++) {
                Object[] objArr34 = {objArr33[i5]};
                byte[] bArr2 = MediaSessionCompatToken;
                short s3 = (short) 327;
                Object[] objArr35 = new Object[1];
                a(bArr2[266], bArr2[76], s3, objArr35);
                Class<?> cls12 = Class.forName((String) objArr35[0]);
                byte b20 = bArr2[277];
                byte b21 = bArr2[38];
                Object[] objArr36 = new Object[1];
                a(b20, b21, (short) (b21 | 341), objArr36);
                String str6 = (String) objArr36[0];
                Object[] objArr37 = new Object[1];
                a(bArr2[266], bArr2[48], s2, objArr37);
                Object objInvoke = cls12.getMethod(str6, Class.forName((String) objArr37[0])).invoke(null, objArr34);
                Object[] objArr38 = new Object[1];
                a(bArr2[266], bArr2[76], s3, objArr38);
                Class<?> cls13 = Class.forName((String) objArr38[0]);
                Object[] objArr39 = new Object[1];
                a(bArr2[60], bArr2[71], (short) 349, objArr39);
                iArr[i5] = ((Integer) cls13.getMethod((String) objArr39[0], null).invoke(objInvoke, null)).intValue();
            }
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                try {
                    logevent = logevent3;
                    try {
                        switch (logevent.write(iArr[i6])) {
                            case -20:
                                i6 = 44;
                                logevent3 = logevent;
                                break;
                            case -19:
                                try {
                                    logevent.write(28);
                                    i7 = logevent.write != 0 ? 40 : 27;
                                } catch (Throwable th) {
                                    th = th;
                                    if (i6 >= 41) {
                                    }
                                    throw th;
                                }
                                logevent3 = logevent;
                                break;
                            case -18:
                                logevent.write(9);
                                throw ((Throwable) logevent.serializer);
                            case -17:
                                i6 = 45;
                                logevent3 = logevent;
                                break;
                            case -16:
                                i6 = 47;
                                logevent3 = logevent;
                                break;
                            case -15:
                                try {
                                    logevent.write(20);
                                    i6 = logevent.write == 0 ? 38 : i7;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (i6 >= 41 || i6 >= 44) {
                                        throw th;
                                    }
                                    logevent.RemoteActionCompatParcelizer = th;
                                    logevent.write(21);
                                    i6 = 39;
                                }
                                logevent3 = logevent;
                                break;
                            case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                                logevent.IconCompatParcelizer = 1;
                                logevent.write(1);
                                logevent.write(16);
                                serializer = logevent.write;
                                logevent3 = logevent;
                                break;
                            case -13:
                                logevent.IconCompatParcelizer = RatingCompat;
                                logevent.write(10);
                                logevent3 = logevent;
                                break;
                            case -12:
                                logevent.write(9);
                                return logevent.serializer;
                            case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                                logevent3 = logevent;
                                i6 = 1;
                                break;
                            case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                                i6 = 29;
                                logevent3 = logevent;
                                break;
                            case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                                logevent.IconCompatParcelizer = 3;
                                logevent.write(1);
                                try {
                                    logevent.write(2);
                                    TextAnnouncementContentCardView textAnnouncementContentCardView = (TextAnnouncementContentCardView) logevent.serializer;
                                    logevent.write(2);
                                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) logevent.serializer;
                                    logevent.write(2);
                                    logevent.RemoteActionCompatParcelizer = BuildersKt.withContext(textAnnouncementContentCardView, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (ShortNewsContentCardView) logevent.serializer);
                                    try {
                                        logevent.write(3);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (i6 >= 41) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (i6 >= 41) {
                                    }
                                    throw th;
                                }
                                logevent3 = logevent;
                                break;
                            case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                                logevent.IconCompatParcelizer = 3;
                                logevent.write(1);
                                logevent.write(2);
                                accesspreviewRoutesInternal accesspreviewroutesinternal = (accesspreviewRoutesInternal) logevent.serializer;
                                logevent.write(2);
                                String str7 = (String) logevent.serializer;
                                logevent.write(2);
                                logevent.RemoteActionCompatParcelizer = new GetRefreshSessionTokenShaImpl$invoke$2(accesspreviewroutesinternal, str7, (ShortNewsContentCardView) logevent.serializer);
                                i = 3;
                                logevent.write(i);
                                logevent3 = logevent;
                                break;
                            case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                                try {
                                    logevent.RemoteActionCompatParcelizer = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                                    c = 3;
                                    try {
                                        logevent.write(3);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        if (i6 >= 41) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    c = 3;
                                }
                                logevent3 = logevent;
                                break;
                            case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                                logevent.IconCompatParcelizer = 1;
                                logevent.write(1);
                                logevent.write(2);
                                logevent.RemoteActionCompatParcelizer = logevent.serializer.getClass();
                                i = 3;
                                logevent.write(i);
                                logevent3 = logevent;
                                break;
                            case BaseCode.URI_IS_NULL /* -5 */:
                                logevent.IconCompatParcelizer = 1;
                                logevent.write(1);
                                logevent.write(2);
                                logevent.RemoteActionCompatParcelizer = (inCompatibilityMode) logevent.serializer;
                                i = 3;
                                logevent.write(i);
                                logevent3 = logevent;
                                break;
                            case BaseCode.NO_SOLUTION /* -4 */:
                                logevent.IconCompatParcelizer = 1;
                                logevent.write(1);
                                logevent.write(2);
                                logevent.RemoteActionCompatParcelizer = ((accesspreviewRoutesInternal) logevent.serializer).RemoteActionCompatParcelizer;
                                i = 3;
                                logevent.write(i);
                                logevent3 = logevent;
                                break;
                            case -3:
                                logevent.IconCompatParcelizer = 1;
                                logevent.write(1);
                                logevent.write(2);
                                ((SystemLifecycleSystemLifecycleCallback) logevent.serializer).write();
                                logevent3 = logevent;
                                break;
                            case -2:
                                logevent.IconCompatParcelizer = 1;
                                logevent.write(1);
                                logevent.write(2);
                                logevent.RemoteActionCompatParcelizer = ((accesspreviewRoutesInternal) logevent.serializer).write;
                                i = 3;
                                logevent.write(i);
                                logevent3 = logevent;
                                break;
                            case -1:
                                i6 = 24;
                                logevent3 = logevent;
                                break;
                            default:
                                logevent3 = logevent;
                                break;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        if (i6 >= 41) {
                        }
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    logevent = logevent3;
                }
            }
        } catch (Throwable th9) {
            Throwable cause = th9.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th9;
        }
    }

    public static final /* synthetic */ lottieComposition IconCompatParcelizer(accesspreviewRoutesInternal accesspreviewroutesinternal) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i;
        logEvent logevent = new logEvent(accesspreviewroutesinternal);
        try {
            byte[] bArr = MediaSessionCompatToken;
            Object[] objArr3 = new Object[1];
            a(bArr[9], bArr[356], bArr[68], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[22];
            byte b2 = (byte) (-bArr[4]);
            Object[] objArr4 = new Object[1];
            a(b, b2, (short) (b2 | 356), objArr4);
            int iIntValue = (((Integer) cls.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 16) - 1245395600;
            byte b3 = bArr[9];
            byte b4 = bArr[33];
            Object[] objArr5 = new Object[1];
            a(b3, b4, (short) (b4 | 175), objArr5);
            Class<?> cls2 = Class.forName((String) objArr5[0]);
            byte b5 = bArr[22];
            byte b6 = bArr[60];
            Object[] objArr6 = new Object[1];
            a(b5, b6, (short) (b6 | 388), objArr6);
            int iIntValue2 = (((Integer) cls2.getMethod((String) objArr6[0], null).invoke(null, null)).intValue() >> 16) + 1157640523;
            Object[] objArr7 = new Object[1];
            a(bArr[9], bArr[76], (short) 408, objArr7);
            Class<?> cls3 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a(bArr[38], bArr[33], (short) 424, objArr8);
            byte bIntValue = (byte) (((Integer) cls3.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue() - 45);
            Object[] objArr9 = new Object[1];
            a(bArr[9], bArr[356], bArr[68], objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            byte b7 = bArr[22];
            byte b8 = bArr[76];
            Object[] objArr10 = new Object[1];
            a(b7, b8, (short) (b8 | 432), objArr10);
            short s = (short) (70 - (((Float) cls4.getMethod((String) objArr10[0], null).invoke(null, null)).floatValue() > 0.0f ? 1 : (((Float) cls4.getMethod((String) objArr10[0], null).invoke(null, null)).floatValue() == 0.0f ? 0 : -1)));
            Object[] objArr11 = {0};
            byte b9 = bArr[9];
            byte b10 = bArr[33];
            Object[] objArr12 = new Object[1];
            a(b9, b10, (short) (b10 | 175), objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            byte b11 = bArr[170];
            Object[] objArr13 = new Object[1];
            a(b11, b11, (short) 460, objArr13);
            int iIntValue3 = (-1997220241) - ((Integer) cls5.getMethod((String) objArr13[0], Integer.TYPE).invoke(null, objArr11)).intValue();
            Object[] objArr14 = new Object[1];
            b(iIntValue, iIntValue2, bIntValue, s, iIntValue3, objArr14);
            String str = (String) objArr14[0];
            Object[] objArr15 = new Object[1];
            a(bArr[9], bArr[83], (short) 477, objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(bArr[38], bArr[1], (short) 515, objArr16);
            int i2 = (((Double) cls6.getMethod((String) objArr16[0], Integer.TYPE).invoke(null, 0)).doubleValue() > 0.0d ? 1 : (((Double) cls6.getMethod((String) objArr16[0], Integer.TYPE).invoke(null, 0)).doubleValue() == 0.0d ? 0 : -1)) - 1245395600;
            Object[] objArr17 = new Object[1];
            a(bArr[9], bArr[352], (short) 98, objArr17);
            Class<?> cls7 = Class.forName((String) objArr17[0]);
            byte b12 = bArr[38];
            byte b13 = (byte) (-bArr[4]);
            Object[] objArr18 = new Object[1];
            a(b12, b13, (short) (b13 | 101), objArr18);
            int i3 = 1157640389 - (((Long) cls7.getMethod((String) objArr18[0], null).invoke(null, null)).longValue() > (-1L) ? 1 : (((Long) cls7.getMethod((String) objArr18[0], null).invoke(null, null)).longValue() == (-1L) ? 0 : -1));
            byte b14 = bArr[9];
            byte b15 = bArr[33];
            Object[] objArr19 = new Object[1];
            a(b14, b15, (short) (b15 | 175), objArr19);
            Class<?> cls8 = Class.forName((String) objArr19[0]);
            byte b16 = bArr[22];
            byte b17 = bArr[60];
            Object[] objArr20 = new Object[1];
            a(b16, b17, (short) (b17 | 388), objArr20);
            byte bIntValue2 = (byte) ((((Integer) cls8.getMethod((String) objArr20[0], null).invoke(null, null)).intValue() >> 16) - 61);
            Object[] objArr21 = {0};
            byte b18 = bArr[9];
            byte b19 = bArr[222];
            Object[] objArr22 = new Object[1];
            a(b18, b19, (short) (b19 | 513), objArr22);
            Class<?> cls9 = Class.forName((String) objArr22[0]);
            byte b20 = bArr[22];
            byte b21 = bArr[570];
            Object[] objArr23 = new Object[1];
            a(b20, b21, (short) (b21 | 553), objArr23);
            short s2 = (short) ((-70) - (((Long) cls9.getMethod((String) objArr23[0], Integer.TYPE).invoke(null, objArr21)).longValue() > 0L ? 1 : (((Long) cls9.getMethod((String) objArr23[0], Integer.TYPE).invoke(null, objArr21)).longValue() == 0L ? 0 : -1)));
            try {
                byte b22 = bArr[9];
                byte b23 = bArr[170];
                Object[] objArr24 = new Object[1];
                a(b22, b23, (short) (b23 | 224), objArr24);
                Class<?> cls10 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                a(bArr[22], bArr[60], (short) 597, objArr25);
                String str2 = (String) objArr25[0];
                short s3 = (short) 308;
                Object[] objArr26 = new Object[1];
                a(bArr[266], bArr[48], s3, objArr26);
                int iIntValue4 = ((Integer) cls10.getMethod(str2, Class.forName((String) objArr26[0])).invoke(null, "")).intValue() - 1997220241;
                Object[] objArr27 = new Object[1];
                b(i2, i3, bIntValue2, s2, iIntValue4, objArr27);
                Object[] objArr28 = {(String) objArr27[0]};
                Object[] objArr29 = new Object[1];
                a(bArr[266], bArr[48], s3, objArr29);
                Class<?> cls11 = Class.forName((String) objArr29[0]);
                byte b24 = (byte) (-bArr[4]);
                byte b25 = bArr[9];
                Object[] objArr30 = new Object[1];
                a(b24, b25, (short) (b25 | 323), objArr30);
                String str3 = (String) objArr30[0];
                Object[] objArr31 = new Object[1];
                a(bArr[266], bArr[48], s3, objArr31);
                Object[] objArr32 = (Object[]) cls11.getMethod(str3, Class.forName((String) objArr31[0])).invoke(str, objArr28);
                int[] iArr = new int[objArr32.length];
                for (int i4 = 0; i4 < objArr32.length; i4++) {
                    Object[] objArr33 = {objArr32[i4]};
                    byte[] bArr2 = MediaSessionCompatToken;
                    short s4 = (short) 327;
                    Object[] objArr34 = new Object[1];
                    a(bArr2[266], bArr2[76], s4, objArr34);
                    Class<?> cls12 = Class.forName((String) objArr34[0]);
                    byte b26 = bArr2[277];
                    byte b27 = bArr2[38];
                    Object[] objArr35 = new Object[1];
                    a(b26, b27, (short) (b27 | 341), objArr35);
                    String str4 = (String) objArr35[0];
                    Object[] objArr36 = new Object[1];
                    a(bArr2[266], bArr2[48], s3, objArr36);
                    Object objInvoke = cls12.getMethod(str4, Class.forName((String) objArr36[0])).invoke(null, objArr33);
                    Object[] objArr37 = new Object[1];
                    a(bArr2[266], bArr2[76], s4, objArr37);
                    Class<?> cls13 = Class.forName((String) objArr37[0]);
                    Object[] objArr38 = new Object[1];
                    a(bArr2[60], bArr2[71], (short) 349, objArr38);
                    iArr[i4] = ((Integer) cls13.getMethod((String) objArr38[0], null).invoke(objInvoke, null)).intValue();
                }
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    try {
                        switch (logevent.write(iArr[i5])) {
                            case -18:
                                i5 = 37;
                                break;
                            case -17:
                                try {
                                    logevent.write(28);
                                    if (logevent.write != 0) {
                                        i6 = 30;
                                        i5 = i6;
                                    } else {
                                        i5 = 1;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    byte[] bArr3 = MediaSessionCompatToken;
                                    short s5 = (short) 356;
                                    objArr = new Object[1];
                                    a(bArr3[266], bArr3[445], s5, objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        break;
                                    }
                                    if (i5 >= 34) {
                                        break;
                                    }
                                    objArr2 = new Object[1];
                                    a(bArr3[266], bArr3[445], s5, objArr2);
                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                break;
                            case -16:
                                logevent.write(9);
                                throw ((Throwable) logevent.serializer);
                            case -15:
                                i5 = 38;
                                break;
                            case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                                i5 = 40;
                                break;
                            case -13:
                                logevent.write(18);
                                if (logevent.write == 0) {
                                    i6 = 28;
                                }
                                i5 = i6;
                                break;
                            case -12:
                                logevent.IconCompatParcelizer = 1;
                                logevent.write(1);
                                try {
                                    logevent.write(16);
                                    RatingCompat = logevent.write;
                                    i5 = i6;
                                } catch (Throwable th2) {
                                    th = th2;
                                    byte[] bArr4 = MediaSessionCompatToken;
                                    short s6 = (short) 356;
                                    objArr = new Object[1];
                                    a(bArr4[266], bArr4[445], s6, objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th) || i5 < 2 || i5 >= 5) {
                                        if (i5 >= 34 || i5 >= 37) {
                                            objArr2 = new Object[1];
                                            a(bArr4[266], bArr4[445], s6, objArr2);
                                            if (Class.forName((String) objArr2[0]).isInstance(th) || i5 < 31 || i5 >= 32) {
                                                throw th;
                                            }
                                            i5 = 43;
                                        } else {
                                            i = 29;
                                        }
                                        logevent.RemoteActionCompatParcelizer = th;
                                        logevent.write(21);
                                    } else {
                                        i = 43;
                                    }
                                    i5 = i;
                                    logevent.RemoteActionCompatParcelizer = th;
                                    logevent.write(21);
                                }
                                break;
                            case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                                logevent.IconCompatParcelizer = serializer;
                                logevent.write(10);
                                i5 = i6;
                                break;
                            case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                                i5 = 8;
                                break;
                            case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                                i5 = 18;
                                break;
                            case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                                logevent.write(20);
                                if (logevent.write == 0) {
                                    i6 = 17;
                                }
                                i5 = i6;
                                break;
                            case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                                logevent.IconCompatParcelizer = 1;
                                logevent.write(1);
                                logevent.write(16);
                                serializer = logevent.write;
                                i5 = i6;
                                break;
                            case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                                logevent.IconCompatParcelizer = RatingCompat;
                                logevent.write(10);
                                i5 = i6;
                                break;
                            case BaseCode.URI_IS_NULL /* -5 */:
                                logevent.write(9);
                                return (lottieComposition) logevent.serializer;
                            case BaseCode.NO_SOLUTION /* -4 */:
                                i5 = 19;
                                break;
                            case -3:
                                i5 = 10;
                                break;
                            case -2:
                                logevent.IconCompatParcelizer = 1;
                                logevent.write(1);
                                logevent.write(2);
                                logevent.RemoteActionCompatParcelizer = ((accesspreviewRoutesInternal) logevent.serializer).IconCompatParcelizer;
                                logevent.write(3);
                                i5 = i6;
                                break;
                            case -1:
                                i5 = 5;
                                break;
                            default:
                                i5 = i6;
                                break;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (Throwable th4) {
                Throwable cause = th4.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th4;
            }
        } catch (Throwable th5) {
            Throwable cause2 = th5.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x051d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x050c  */
    public static final /* synthetic */ LottieAnimatableImplanimate2 write(accesspreviewRoutesInternal accesspreviewroutesinternal) throws Throwable {
        Object[] objArr;
        logEvent logevent = new logEvent(accesspreviewroutesinternal);
        try {
            byte[] bArr = MediaSessionCompatToken;
            Object[] objArr2 = new Object[1];
            a(bArr[9], bArr[352], bArr[14], objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            a(bArr[60], bArr[38], bArr[570], objArr3);
            String str = (String) objArr3[0];
            Object[] objArr4 = new Object[1];
            a(bArr[266], bArr[352], bArr[20], objArr4);
            Object[] objArr5 = new Object[1];
            a(bArr[266], bArr[352], bArr[20], objArr5);
            int iIntValue = (-1245395719) - ((Integer) cls.getMethod(str, Class.forName((String) objArr4[0]), Class.forName((String) objArr5[0]), Integer.TYPE, Integer.TYPE).invoke(null, "", "", 0, 0)).intValue();
            Object[] objArr6 = new Object[1];
            a(bArr[9], bArr[356], bArr[68], objArr6);
            Class<?> cls2 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a(bArr[22], (byte) (-bArr[4]), (short) 76, objArr7);
            int iIntValue2 = 1157640507 - (((Integer) cls2.getMethod((String) objArr7[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr8 = new Object[1];
            a(bArr[9], bArr[352], (short) 98, objArr8);
            Class<?> cls3 = Class.forName((String) objArr8[0]);
            byte b = bArr[38];
            byte b2 = (byte) (-bArr[4]);
            Object[] objArr9 = new Object[1];
            a(b, b2, (short) (b2 | 101), objArr9);
            byte b3 = (byte) ((((Long) cls3.getMethod((String) objArr9[0], null).invoke(null, null)).longValue() > (-1L) ? 1 : (((Long) cls3.getMethod((String) objArr9[0], null).invoke(null, null)).longValue() == (-1L) ? 0 : -1)) - 75);
            Object[] objArr10 = new Object[1];
            a(bArr[9], bArr[298], (short) 141, objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a(bArr[22], bArr[38], (short) 169, objArr11);
            short sIntValue = (short) (((Integer) cls4.getMethod((String) objArr11[0], Integer.TYPE).invoke(null, 0)).intValue() - 97);
            Object[] objArr12 = new Object[1];
            a(bArr[9], bArr[356], bArr[68], objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            byte b4 = bArr[22];
            byte b5 = bArr[76];
            Object[] objArr13 = new Object[1];
            a(b4, b5, (short) (b5 | 163), objArr13);
            int iIntValue3 = (((Integer) cls5.getMethod((String) objArr13[0], null).invoke(null, null)).intValue() >> 16) - 1997220241;
            Object[] objArr14 = new Object[1];
            b(iIntValue, iIntValue2, b3, sIntValue, iIntValue3, objArr14);
            String str2 = (String) objArr14[0];
            byte b6 = bArr[9];
            byte b7 = bArr[33];
            Object[] objArr15 = new Object[1];
            a(b6, b7, (short) (b7 | 175), objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            byte b8 = bArr[22];
            Object[] objArr16 = new Object[1];
            a(b8, b8, (short) Constant.ERROR_GYRO_NO_DATA, objArr16);
            int iIntValue4 = (-1245395600) - ((Integer) cls6.getMethod((String) objArr16[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue();
            Object[] objArr17 = new Object[1];
            a(bArr[9], bArr[356], bArr[68], objArr17);
            Class<?> cls7 = Class.forName((String) objArr17[0]);
            byte b9 = bArr[22];
            byte b10 = bArr[76];
            Object[] objArr18 = new Object[1];
            a(b9, b10, (short) (b10 | 209), objArr18);
            int iIntValue5 = (((Integer) cls7.getMethod((String) objArr18[0], null).invoke(null, null)).intValue() >> 16) + 1157640388;
            byte b11 = bArr[9];
            byte b12 = bArr[170];
            Object[] objArr19 = new Object[1];
            a(b11, b12, (short) (b12 | 224), objArr19);
            Class<?> cls8 = Class.forName((String) objArr19[0]);
            byte b13 = bArr[22];
            byte b14 = bArr[76];
            Object[] objArr20 = new Object[1];
            a(b13, b14, (short) (b14 | 242), objArr20);
            byte b15 = (byte) ((((Long) cls8.getMethod((String) objArr20[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls8.getMethod((String) objArr20[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 62);
            Object[] objArr21 = new Object[1];
            a(bArr[9], bArr[356], bArr[68], objArr21);
            Class<?> cls9 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            a(bArr[22], bArr[352], (short) (MediaSessionCompatResultReceiverWrapper | 260), objArr22);
            short s = (short) ((-69) - (((Long) cls9.getMethod((String) objArr22[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls9.getMethod((String) objArr22[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)));
            Object[] objArr23 = new Object[1];
            a(bArr[9], bArr[356], bArr[68], objArr23);
            Class<?> cls10 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            a(bArr[22], bArr[170], (short) 291, objArr24);
            Object[] objArr25 = new Object[1];
            b(iIntValue4, iIntValue5, b15, s, (-1997220242) - (((Integer) cls10.getMethod((String) objArr24[0], null).invoke(null, null)).intValue() >> 8), objArr25);
            Object[] objArr26 = {(String) objArr25[0]};
            char c = '0';
            short s2 = (short) 308;
            Object[] objArr27 = new Object[1];
            a(bArr[266], bArr[48], s2, objArr27);
            Class<?> cls11 = Class.forName((String) objArr27[0]);
            byte b16 = (byte) (-bArr[4]);
            byte b17 = bArr[9];
            Object[] objArr28 = new Object[1];
            a(b16, b17, (short) (b17 | 323), objArr28);
            String str3 = (String) objArr28[0];
            Object[] objArr29 = new Object[1];
            a(bArr[266], bArr[48], s2, objArr29);
            Object[] objArr30 = (Object[]) cls11.getMethod(str3, Class.forName((String) objArr29[0])).invoke(str2, objArr26);
            int[] iArr = new int[objArr30.length];
            int i = 0;
            while (i < objArr30.length) {
                Object[] objArr31 = {objArr30[i]};
                byte[] bArr2 = MediaSessionCompatToken;
                short s3 = (short) 327;
                Object[] objArr32 = new Object[1];
                a(bArr2[266], bArr2[76], s3, objArr32);
                Class<?> cls12 = Class.forName((String) objArr32[0]);
                byte b18 = bArr2[277];
                byte b19 = bArr2[38];
                Object[] objArr33 = new Object[1];
                a(b18, b19, (short) (b19 | 341), objArr33);
                String str4 = (String) objArr33[0];
                byte b20 = bArr2[266];
                byte b21 = bArr2[c];
                Object[] objArr34 = new Object[1];
                a(b20, b21, s2, objArr34);
                Object objInvoke = cls12.getMethod(str4, Class.forName((String) objArr34[0])).invoke(null, objArr31);
                Object[] objArr35 = new Object[1];
                a(bArr2[266], bArr2[76], s3, objArr35);
                Class<?> cls13 = Class.forName((String) objArr35[0]);
                Object[] objArr36 = new Object[1];
                a(bArr2[60], bArr2[71], (short) 349, objArr36);
                iArr[i] = ((Integer) cls13.getMethod((String) objArr36[0], null).invoke(objInvoke, null)).intValue();
                i++;
                c = '0';
            }
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                try {
                    switch (logevent.write(iArr[i2])) {
                        case -16:
                            try {
                                logevent.write(9);
                                throw ((Throwable) logevent.serializer);
                            } catch (Throwable th) {
                                th = th;
                                byte[] bArr3 = MediaSessionCompatToken;
                                objArr = new Object[1];
                                a(bArr3[266], bArr3[445], (short) 356, objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                }
                                throw th;
                            }
                        case -15:
                            i2 = 9;
                            break;
                        case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                            i2 = 36;
                            break;
                        case -13:
                            try {
                                logevent.write(20);
                                if (logevent.write == 0) {
                                    i3 = 35;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                byte[] bArr4 = MediaSessionCompatToken;
                                objArr = new Object[1];
                                a(bArr4[266], bArr4[445], (short) 356, objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th) || i2 < 2 || i2 >= 3) {
                                    throw th;
                                }
                                logevent.RemoteActionCompatParcelizer = th;
                                logevent.write(21);
                                i2 = 38;
                            }
                            break;
                        case -12:
                            logevent.IconCompatParcelizer = 1;
                            logevent.write(1);
                            try {
                                logevent.write(16);
                                serializer = logevent.write;
                            } catch (Throwable th3) {
                                th = th3;
                                byte[] bArr5 = MediaSessionCompatToken;
                                objArr = new Object[1];
                                a(bArr5[266], bArr5[445], (short) 356, objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                }
                                throw th;
                            }
                            break;
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            logevent.IconCompatParcelizer = RatingCompat;
                            logevent.write(10);
                            break;
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            i2 = 1;
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            i2 = 23;
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            logevent.write(18);
                            i2 = logevent.write == 0 ? 22 : i3;
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            logevent.IconCompatParcelizer = 1;
                            logevent.write(1);
                            logevent.write(16);
                            RatingCompat = logevent.write;
                            break;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            logevent.IconCompatParcelizer = serializer;
                            logevent.write(10);
                            break;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            logevent.write(9);
                            return (LottieAnimatableImplanimate2) logevent.serializer;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            i2 = 11;
                            break;
                        case -3:
                            i2 = 24;
                            break;
                        case -2:
                            logevent.IconCompatParcelizer = 1;
                            logevent.write(1);
                            logevent.write(2);
                            logevent.RemoteActionCompatParcelizer = ((accesspreviewRoutesInternal) logevent.serializer).read;
                            logevent.write(3);
                            break;
                        case -1:
                            i2 = 6;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            Throwable cause = th5.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th5;
        }
    }
}
