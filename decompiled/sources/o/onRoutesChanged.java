package o;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import com.huawei.hms.adapter.internal.BaseCode;
import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.secure.certificate.GetAuthSessionTokenShaImpl$invoke$2;
import java.lang.reflect.Method;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class onRoutesChanged implements setDefaultEventToken {
    private static final byte[] $$a = {97, -62, 62, -95};
    private static final int $$b = 34;
    private static final int MediaBrowserCompatMediaItem;
    private static final byte[] MediaDescriptionCompat;
    private static int MediaMetadataCompat;
    private static int MediaSessionCompatQueueItem;
    private static int write;
    private final LottieAnimatableImplanimate2 IconCompatParcelizer;
    private final isOpenInternalroom_runtime RemoteActionCompatParcelizer;
    private final lottieComposition read;
    private final SystemLifecycleSystemLifecycleCallback serializer;

    private static String $$c(int i, short s, int i2) {
        byte[] bArr = $$a;
        int i3 = 112 - (i * 3);
        int i4 = 3 - (s * 2);
        int i5 = i2 * 4;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + (-i4);
            i4 = i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i4 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i3 += -bArr[i8];
            i4 = i8;
            i6 = i7;
        }
    }

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public onRoutesChanged(LottieAnimatableImplanimate2 lottieAnimatableImplanimate2, lottieComposition lottiecomposition, SystemLifecycleSystemLifecycleCallback systemLifecycleSystemLifecycleCallback, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        lottieAnimatableImplanimate2.getClass();
        lottiecomposition.getClass();
        systemLifecycleSystemLifecycleCallback.getClass();
        isopeninternalroom_runtime.getClass();
        this.IconCompatParcelizer = lottieAnimatableImplanimate2;
        this.read = lottiecomposition;
        this.serializer = systemLifecycleSystemLifecycleCallback;
        this.RemoteActionCompatParcelizer = isopeninternalroom_runtime;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x014a  */
    /* JADX WARN: Code duplicated, block: B:33:0x014b  */
    private static void b(int i, int i2, int i3, boolean z, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        accesstoViewTypeGyEprt8 accesstoviewtypegyeprt8 = new accesstoViewTypeGyEprt8();
        char[] cArr2 = new char[i2];
        accesstoviewtypegyeprt8.write = 0;
        while (true) {
            i4 = 907743172;
            if (accesstoviewtypegyeprt8.write >= i2) {
                break;
            }
            accesstoviewtypegyeprt8.read = cArr[accesstoviewtypegyeprt8.write];
            cArr2[accesstoviewtypegyeprt8.write] = (char) (i3 + accesstoviewtypegyeprt8.read);
            int i5 = accesstoviewtypegyeprt8.write;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(MediaMetadataCompat)};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1543552341);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) android.graphics.Color.blue(0), 175 - TextUtils.indexOf((CharSequence) "", '0', 0), 20 - TextUtils.indexOf((CharSequence) "", '0', 0), 1932485450, false, com.braze.Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {accesstoviewtypegyeprt8, accesstoviewtypegyeprt8};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(907743172);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 20062), View.MeasureSpec.makeMeasureSpec(0, 0) + 2838, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16, -422891995, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i > 0) {
            accesstoviewtypegyeprt8.serializer = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - accesstoviewtypegyeprt8.serializer, accesstoviewtypegyeprt8.serializer);
            System.arraycopy(cArr3, accesstoviewtypegyeprt8.serializer, cArr2, 0, i2 - accesstoviewtypegyeprt8.serializer);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            accesstoviewtypegyeprt8.write = 0;
            while (accesstoviewtypegyeprt8.write < i2) {
                cArr4[accesstoviewtypegyeprt8.write] = cArr2[(i2 - accesstoviewtypegyeprt8.write) - 1];
                Object[] objArr4 = {accesstoviewtypegyeprt8, accesstoviewtypegyeprt8};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(i4);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (ExpandableListView.getPackedPositionChild(0L) + 20064), 2838 - TextUtils.getTrimmedLength(""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 17, -422891995, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                i4 = 907743172;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.onRoutesChanged.MediaDescriptionCompat
            int r6 = r6 + 4
            int r1 = r8 + 3
            int r7 = r7 + 97
            byte[] r1 = new byte[r1]
            int r8 = r8 + 2
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r6 = r6 + 1
            r3 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r5
        L29:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-5)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onRoutesChanged.a(short, int, short, java.lang.Object[]):void");
    }

    static void read() {
        MediaMetadataCompat = 1417631058;
    }

    static {
        byte[] bArr = new byte[595];
        System.arraycopy("\"\u008et\u0091î\u0005íþ\u0001\u00001³\bÿéDÓèÿé/Ïü\u0003øýíþ\fè\u0006õüýì\"ßö\u0000÷ó\u0003\"Õþö\u0002\fìôø\u0007õðöî\u0005íþ\u0001\u00001³\bÿéDÜÙö\u0006õü$Ê\fòõä\nñ(Ïþý\u0015Úý\u0004ö\u0002\u0004æ\u0010.½\u0006î\u00024ÖÚý\u0004ö\u0002î\u0005íþ\u0001\u00001µ\nèÿAÕêèÿ\u001aÜ\u0006øôö\u0005úè$ä\u0004æ\u0010.½\u0006î\u00024æÖ\u0002ê\u001aéï÷\u000bò\u0006ùî\u0005íþ\u0001\u00001Âð\fì\u0003ú\u0001ë@æÏþøøð÷\u0003\u0002î\u0005íþ\u0001\u00001³\bÿéDÓèÿéNÒãÿéùþ\b\rÞ\u0006ýýì\"Ù\u0006úî\u0005íþ\u0001\u00001º÷@ÙÙþ\u0007ùíûï$â\u0000þÿþð\u0004æ\u0010.½\u0006î\u00024àÖõ\nùýî\u0010ðò\u000b\u0011äöõ\u0019ððò\u000b\u0004æ\u0010.½\u0006î\u00024äÈ\u0010ùð÷\u0006õüî\u0005íþ\u0001\u00001¼\u0003üö\u0003.èÇ\föõ\u0016Ý\fùóýì\"çä\u001dâþò\u0003\u0003î\u0005íþ\u0001\u00001³\bÿéDÞáç/Ê\fòõýì\"Ù\u0006öþøÿî ãì\u000e\tÚ\u000eè\n\u0013çé\u0003\u0006\u0000î\u0005íþ\u0001\u00001´ü\u0006ø9ÕÖ\u0004\u0006ü\tððò\u000bïýøÿ\u0002è\u001fà$Õø\tè\u0006éú&Ö\u0005úè$äýì\u001cëìþþû%Üê'àøú\u001cÊþ\fè\u0006õüî\u0005íþ\u0001\u00001µ\nô\u0002ð\u0003ôüðFÆúò\u0007.æÚò\u0007\u0019Ùôû\u001bØ\u0007ýè\u0006õüïüó\fîù\u001e×\u000fêù\u001céý\nà&Úý\u001aÚùð\bûíýì#Øü\u0002\u0012Ù\bíû\u001aæ÷\u0003ñõüî\u0005íþ\u0001\u00001º÷@ÖÕ\u0001ú\nó%Òø\u0007óéþû\bòõ\u001bçñ\bÿø\u000bæ÷\u0003\u0013ßøûþñýì\"çä\n÷ó\u0003\"Õþö\u0002\fìôø\u0007õðöýì\u001cëìþþû!Ï\u0004\u0001ê\u0006õü".getBytes("ISO-8859-1"), 0, bArr, 0, 595);
        MediaDescriptionCompat = bArr;
        MediaBrowserCompatMediaItem = 33;
        read();
        write = 0;
        MediaSessionCompatQueueItem = 1;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0464 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0455  */
    @Override // o.setDefaultEventToken
    public Object serializer(String str, ShortNewsContentCardView<? super String> shortNewsContentCardView) throws Throwable {
        DropShadowEffect dropShadowEffect = new DropShadowEffect(this, str, shortNewsContentCardView);
        try {
            int i = MediaBrowserCompatMediaItem;
            byte[] bArr = MediaDescriptionCompat;
            Object[] objArr = new Object[1];
            a((short) (i | 394), bArr[9], bArr[73], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((short) 465, bArr[46], (byte) (-bArr[17]), objArr2);
            int i2 = (((Double) cls.getMethod((String) objArr2[0], Integer.TYPE).invoke(null, 0)).doubleValue() > 0.0d ? 1 : (((Double) cls.getMethod((String) objArr2[0], Integer.TYPE).invoke(null, 0)).doubleValue() == 0.0d ? 0 : -1)) + 15;
            Object[] objArr3 = new Object[1];
            a(bArr[13], bArr[9], bArr[462], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((short) (i | 458), bArr[30], bArr[93], objArr4);
            int iIntValue = 151 - (((Integer) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr5 = new Object[1];
            a((short) (i | 476), bArr[9], bArr[358], objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a((short) 530, bArr[46], (byte) (-bArr[34]), objArr6);
            Object[] objArr7 = new Object[1];
            b(i2, iIntValue, 112 - (((Long) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).longValue() > (-1L) ? 1 : (((Long) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).longValue() == (-1L) ? 0 : -1)), true, new char[]{1, 65532, 3, 65533, 65532, 5, 3, 65532, 2, 65533, 65532, 1, 65532, 1, 65533, 0, 2, 65533, 65532, '\b', 4, 65532, 0, 2, 65533, 65532, 7, 4, 65532, '\t', 1, 65533, 65532, 2, 1, 65533, 65532, 6, 4, 65532, '\t', 65532, '\b', 1, 65533, 65532, 7, 1, 65533, 65532, 6, 1, 65533, 65532, 5, 1, 65533, 65532, 3, 2, 65532, 2, 2, 65532, 4, 1, 65533, 65532, 4, 1, 65532, 5, 4, 65532, 3, 1, 65533, 65532, 2, 1, 65533, 65532, '\t', 65532, 1, 1, 65533, 65532, 4, 4, 65532, 2, 2, 65532, 2, 2, 65532, 0, 1, 65533, 65532, 3, 4, 65532, 2, 4, 65532, '\t', 65533, 65532, 1, 4, 65532, 0, 4, 65532, '\b', 65533, 65532, '\t', 3, 65532, '\b', 3, 65532, 6, 3, 65532, 7, 65533, 65532, 7, 65532, 6, 65533, 65532, 7, 3, 65532, 6, 3, 65532, 5, 65533, 65532, 5, 3, 65532, 4, 65533, 65532}, objArr7);
            String str2 = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            a(bArr[13], bArr[9], bArr[462], objArr8);
            Class<?> cls4 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a((short) 552, bArr[30], (byte) (-bArr[34]), objArr9);
            int iIntValue2 = (((Integer) cls4.getMethod((String) objArr9[0], null).invoke(null, null)).intValue() >> 16) + 1;
            Object[] objArr10 = new Object[1];
            a(bArr[13], bArr[9], bArr[462], objArr10);
            Class<?> cls5 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a((short) 574, bArr[30], bArr[352], objArr11);
            int i3 = (((Float) cls5.getMethod((String) objArr11[0], null).invoke(null, null)).floatValue() > 0.0f ? 1 : (((Float) cls5.getMethod((String) objArr11[0], null).invoke(null, null)).floatValue() == 0.0f ? 0 : -1));
            Object[] objArr12 = {"", '0', 0};
            Object[] objArr13 = new Object[1];
            a((short) (i | 68), bArr[9], bArr[358], objArr13);
            Class<?> cls6 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a((short) 122, bArr[12], bArr[88], objArr14);
            String str3 = (String) objArr14[0];
            Object[] objArr15 = new Object[1];
            a((short) androidx.compose.ui.graphics.Fields.SpotShadowColor, bArr[353], bArr[358], objArr15);
            Object[] objArr16 = new Object[1];
            b(iIntValue2, i3, 106 - ((Integer) cls6.getMethod(str3, Class.forName((String) objArr15[0]), Character.TYPE, Integer.TYPE).invoke(null, objArr12)).intValue(), false, new char[]{0}, objArr16);
            Object[] objArr17 = {(String) objArr16[0]};
            short s = (short) 86;
            char c = 203;
            Object[] objArr18 = new Object[1];
            a(s, bArr[353], bArr[203], objArr18);
            Class<?> cls7 = Class.forName((String) objArr18[0]);
            Object[] objArr19 = new Object[1];
            a((short) (i | 196), bArr[502], bArr[46], objArr19);
            String str4 = (String) objArr19[0];
            Object[] objArr20 = new Object[1];
            a(s, bArr[353], bArr[203], objArr20);
            Object[] objArr21 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr20[0])).invoke(str2, objArr17);
            int[] iArr = new int[objArr21.length];
            int i4 = 0;
            while (i4 < objArr21.length) {
                Object[] objArr22 = {objArr21[i4]};
                int i5 = MediaBrowserCompatMediaItem;
                byte[] bArr2 = MediaDescriptionCompat;
                Object[] objArr23 = new Object[1];
                a((short) (i5 | 200), bArr2[353], bArr2[352], objArr23);
                Class<?> cls8 = Class.forName((String) objArr23[0]);
                Object[] objArr24 = new Object[1];
                a((short) (i5 | Constant.ERROR_GYRO_JUMP), bArr2[85], bArr2[88], objArr24);
                String str5 = (String) objArr24[0];
                byte b = bArr2[353];
                byte b2 = bArr2[c];
                Object[] objArr25 = new Object[1];
                a(s, b, b2, objArr25);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr25[0])).invoke(null, objArr22);
                Object[] objArr26 = new Object[1];
                a((short) (i5 | 200), bArr2[353], bArr2[352], objArr26);
                Class<?> cls9 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                a((short) (i5 | Constant.ERROR_WSS_LOW_FREQ), bArr2[12], bArr2[5], objArr27);
                iArr[i4] = ((Integer) cls9.getMethod((String) objArr27[0], null).invoke(objInvoke, null)).intValue();
                i4++;
                c = 203;
            }
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                try {
                    switch (dropShadowEffect.read(iArr[i6])) {
                        case -20:
                            i6 = 43;
                            break;
                        case -19:
                            try {
                                dropShadowEffect.read(30);
                                i7 = dropShadowEffect.serializer != 13 ? 28 : 40;
                                i6 = i7;
                            } catch (Throwable th) {
                                th = th;
                                if (i6 >= 41) {
                                }
                                throw th;
                            }
                            break;
                        case -18:
                            dropShadowEffect.read(8);
                            throw ((Throwable) dropShadowEffect.read);
                        case -17:
                            i6 = 44;
                            break;
                        case -16:
                            i6 = 46;
                            break;
                        case -15:
                            dropShadowEffect.read(18);
                            if (dropShadowEffect.serializer == 0) {
                                i7 = 38;
                            }
                            i6 = i7;
                            break;
                        case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                            try {
                                dropShadowEffect.write = 1;
                                try {
                                    dropShadowEffect.read(2);
                                    dropShadowEffect.read(13);
                                    write = dropShadowEffect.serializer;
                                    i6 = i7;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (i6 >= 41 || i6 >= 43) {
                                        throw th;
                                    }
                                    dropShadowEffect.IconCompatParcelizer = th;
                                    dropShadowEffect.read(19);
                                    i6 = 39;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (i6 >= 41) {
                                }
                                throw th;
                            }
                            break;
                        case -13:
                            dropShadowEffect.write = MediaSessionCompatQueueItem;
                            dropShadowEffect.read(10);
                            i6 = i7;
                            break;
                        case -12:
                            dropShadowEffect.read(8);
                            return dropShadowEffect.read;
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            i6 = 1;
                            break;
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            i6 = 30;
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            try {
                                dropShadowEffect.write = 3;
                                dropShadowEffect.read(2);
                                dropShadowEffect.read(3);
                                TextAnnouncementContentCardView textAnnouncementContentCardView = (TextAnnouncementContentCardView) dropShadowEffect.read;
                                dropShadowEffect.read(3);
                                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) dropShadowEffect.read;
                                dropShadowEffect.read(3);
                                dropShadowEffect.IconCompatParcelizer = BuildersKt.withContext(textAnnouncementContentCardView, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (ShortNewsContentCardView) dropShadowEffect.read);
                                dropShadowEffect.read(4);
                                i6 = i7;
                            } catch (Throwable th4) {
                                th = th4;
                                if (i6 >= 41) {
                                }
                                throw th;
                            }
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            dropShadowEffect.write = 3;
                            dropShadowEffect.read(2);
                            dropShadowEffect.read(3);
                            onRoutesChanged onrouteschanged = (onRoutesChanged) dropShadowEffect.read;
                            dropShadowEffect.read(3);
                            String str6 = (String) dropShadowEffect.read;
                            dropShadowEffect.read(3);
                            dropShadowEffect.IconCompatParcelizer = new GetAuthSessionTokenShaImpl$invoke$2(onrouteschanged, str6, (ShortNewsContentCardView) dropShadowEffect.read);
                            dropShadowEffect.read(4);
                            i6 = i7;
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            dropShadowEffect.IconCompatParcelizer = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                            dropShadowEffect.read(4);
                            i6 = i7;
                            break;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            dropShadowEffect.write = 1;
                            dropShadowEffect.read(2);
                            dropShadowEffect.read(3);
                            dropShadowEffect.IconCompatParcelizer = dropShadowEffect.read.getClass();
                            dropShadowEffect.read(4);
                            i6 = i7;
                            break;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            dropShadowEffect.write = 1;
                            dropShadowEffect.read(2);
                            dropShadowEffect.read(3);
                            dropShadowEffect.IconCompatParcelizer = (inCompatibilityMode) dropShadowEffect.read;
                            dropShadowEffect.read(4);
                            i6 = i7;
                            break;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            dropShadowEffect.write = 1;
                            dropShadowEffect.read(2);
                            dropShadowEffect.read(3);
                            dropShadowEffect.IconCompatParcelizer = ((onRoutesChanged) dropShadowEffect.read).RemoteActionCompatParcelizer;
                            dropShadowEffect.read(4);
                            i6 = i7;
                            break;
                        case -3:
                            dropShadowEffect.write = 1;
                            dropShadowEffect.read(2);
                            dropShadowEffect.read(3);
                            ((SystemLifecycleSystemLifecycleCallback) dropShadowEffect.read).write();
                            i6 = i7;
                            break;
                        case -2:
                            dropShadowEffect.write = 1;
                            dropShadowEffect.read(2);
                            dropShadowEffect.read(3);
                            dropShadowEffect.IconCompatParcelizer = ((onRoutesChanged) dropShadowEffect.read).serializer;
                            dropShadowEffect.read(4);
                            i6 = i7;
                            break;
                        case -1:
                            i6 = 24;
                            break;
                        default:
                            i6 = i7;
                            break;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (Throwable th6) {
            Throwable cause = th6.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x047b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0498  */
    /* JADX WARN: Code duplicated, block: B:108:0x04a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:114:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:116:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:174:0x04c3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x046e A[ADDED_TO_REGION] */
    public static final /* synthetic */ lottieComposition serializer(onRoutesChanged onrouteschanged) throws Throwable {
        short s;
        byte[] bArr;
        Object[] objArr;
        Object[] objArr2;
        DropShadowEffect dropShadowEffect = new DropShadowEffect(onrouteschanged);
        short s2 = (short) 280;
        try {
            byte[] bArr2 = MediaDescriptionCompat;
            Object[] objArr3 = new Object[1];
            a(s2, bArr2[9], bArr2[85], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            int i = MediaBrowserCompatMediaItem;
            Object[] objArr4 = new Object[1];
            a((short) (i | 270), bArr2[30], bArr2[353], objArr4);
            int i2 = 150 - (((Float) cls.getMethod((String) objArr4[0], null).invoke(null, null)).floatValue() > 0.0f ? 1 : (((Float) cls.getMethod((String) objArr4[0], null).invoke(null, null)).floatValue() == 0.0f ? 0 : -1));
            Object[] objArr5 = new Object[1];
            a((short) 314, bArr2[9], bArr2[502], objArr5);
            Class<?> cls2 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a((short) 334, bArr2[30], bArr2[85], objArr6);
            int iIntValue = 165 - ((byte) ((Integer) cls2.getMethod((String) objArr6[0], null).invoke(null, null)).intValue());
            Object[] objArr7 = {0, 0, 0};
            Object[] objArr8 = new Object[1];
            a((short) 149, bArr2[9], bArr2[358], objArr8);
            Class<?> cls3 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a((short) (i | 324), bArr2[258], bArr2[9], objArr9);
            Object[] objArr10 = new Object[1];
            b(i2, iIntValue, ((Integer) cls3.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7)).intValue() + 16777326, true, new char[]{65534, 65533, 4, 4, 65533, '\b', 2, 65534, 65533, 7, 2, 65534, 65533, 3, 4, 65533, 7, 2, 65534, 65533, 2, 4, 65533, 6, 2, 65534, 65533, 4, 65534, 65533, '\b', 65533, '\n', 3, 65533, 2, 65533, 6, 65533, 3, 65534, 65533, 2, 65533, 2, 2, 65534, 65533, 5, 2, 65534, 65533, 4, 2, 65534, 65533, 3, 2, 65534, 65533, 6, 2, 65533, '\b', 65534, 65533, 4, 3, 65533, '\t', 3, 65533, '\b', 3, 65533, 7, 65534, 65533, 6, 65534, 65533, 7, 3, 65533, 6, 3, 65533, 5, 3, 65533, '\n', 65533, 2, 2, 65534, 65533, 1, 2, 65534, 65533, '\n', 65534, 65533, '\t', 65534, 65533, 4, 3, 65533, 3, 3, 65533, '\b', 65534, 65533, 5, 2, 65533, 2, 3, 65533, 7, 65534, 65533, 6, 65534, 65533, '\n', 65533, 5, 65534, 65533, '\b', 65533, 7, 65533, 4, 65534, 65533, 1, 3, 65533, 3, 65534, 65533, 2, 65533, 2, 65534, 2, 2, 65534, 65533, 2, 2, 65534, 65533, '\t', 2, 65534, 65533, 5, 4, 65533, '\t', 2}, objArr10);
            String str = (String) objArr10[0];
            Object[] objArr11 = {0};
            Object[] objArr12 = new Object[1];
            a((short) (i | 326), bArr2[9], (byte) (-bArr2[34]), objArr12);
            Class<?> cls4 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            a((short) (i | 348), bArr2[46], bArr2[150], objArr13);
            int i3 = (((Float) cls4.getMethod((String) objArr13[0], Integer.TYPE).invoke(null, objArr11)).floatValue() > 0.0f ? 1 : (((Float) cls4.getMethod((String) objArr13[0], Integer.TYPE).invoke(null, objArr11)).floatValue() == 0.0f ? 0 : -1)) + 1;
            Object[] objArr14 = {"", '0', 0, 0};
            Object[] objArr15 = new Object[1];
            a((short) (i | 68), bArr2[9], bArr2[358], objArr15);
            Class<?> cls5 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a((short) 394, bArr2[150], bArr2[12], objArr16);
            String str2 = (String) objArr16[0];
            Object[] objArr17 = new Object[1];
            a((short) androidx.compose.ui.graphics.Fields.SpotShadowColor, bArr2[353], bArr2[358], objArr17);
            int i4 = -((Integer) cls5.getMethod(str2, Class.forName((String) objArr17[0]), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14)).intValue();
            try {
                Object[] objArr18 = new Object[1];
                a(bArr2[13], bArr2[9], bArr2[462], objArr18);
                Class<?> cls6 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                a((short) 404, bArr2[30], bArr2[85], objArr19);
                Object[] objArr20 = new Object[1];
                b(i3, i4, (((Integer) cls6.getMethod((String) objArr19[0], null).invoke(null, null)).intValue() >> 16) + 107, false, new char[]{0}, objArr20);
                Object[] objArr21 = {(String) objArr20[0]};
                short s3 = (short) 86;
                char c = 203;
                Object[] objArr22 = new Object[1];
                a(s3, bArr2[353], bArr2[203], objArr22);
                Class<?> cls7 = Class.forName((String) objArr22[0]);
                Object[] objArr23 = new Object[1];
                a((short) (i | 196), bArr2[502], bArr2[46], objArr23);
                String str3 = (String) objArr23[0];
                Object[] objArr24 = new Object[1];
                a(s3, bArr2[353], bArr2[203], objArr24);
                Object[] objArr25 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr24[0])).invoke(str, objArr21);
                int[] iArr = new int[objArr25.length];
                int i5 = 0;
                while (i5 < objArr25.length) {
                    try {
                        Object[] objArr26 = {objArr25[i5]};
                        int i6 = MediaBrowserCompatMediaItem;
                        byte[] bArr3 = MediaDescriptionCompat;
                        Object[] objArr27 = new Object[1];
                        a((short) (i6 | 200), bArr3[353], bArr3[352], objArr27);
                        Class<?> cls8 = Class.forName((String) objArr27[0]);
                        Object[] objArr28 = new Object[1];
                        a((short) (i6 | Constant.ERROR_GYRO_JUMP), bArr3[85], bArr3[88], objArr28);
                        String str4 = (String) objArr28[0];
                        byte b = bArr3[353];
                        byte b2 = bArr3[c];
                        Object[] objArr29 = new Object[1];
                        a(s3, b, b2, objArr29);
                        Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr29[0])).invoke(null, objArr26);
                        try {
                            Object[] objArr30 = new Object[1];
                            a((short) (i6 | 200), bArr3[353], bArr3[352], objArr30);
                            Class<?> cls9 = Class.forName((String) objArr30[0]);
                            Object[] objArr31 = new Object[1];
                            a((short) (i6 | Constant.ERROR_WSS_LOW_FREQ), bArr3[12], bArr3[5], objArr31);
                            iArr[i5] = ((Integer) cls9.getMethod((String) objArr31[0], null).invoke(objInvoke, null)).intValue();
                            i5++;
                            c = 203;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    try {
                        switch (dropShadowEffect.read(iArr[i7])) {
                            case -18:
                                i7 = 47;
                                break;
                            case -17:
                                try {
                                    dropShadowEffect.read(30);
                                    int i9 = dropShadowEffect.serializer;
                                    if (i9 != 0 && i9 == 1) {
                                        i8 = 20;
                                        i7 = i8;
                                    } else {
                                        i7 = 8;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    s = (short) 262;
                                    bArr = MediaDescriptionCompat;
                                    objArr = new Object[1];
                                    a(s, bArr[353], bArr[93], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        byte b3 = bArr[353];
                                        byte b4 = bArr[93];
                                        objArr2 = new Object[1];
                                        a(s, b3, b4, objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i7 < 21) {
                                            if (i7 >= 39) {
                                            }
                                            throw th;
                                        }
                                        if (i7 >= 39) {
                                        }
                                        throw th;
                                    }
                                    byte b5 = bArr[353];
                                    byte b6 = bArr[93];
                                    objArr2 = new Object[1];
                                    a(s, b5, b6, objArr2);
                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                        break;
                                    }
                                    if (i7 < 21) {
                                        if (i7 >= 39) {
                                        }
                                        throw th;
                                    }
                                    if (i7 >= 39) {
                                    }
                                    throw th;
                                    dropShadowEffect.IconCompatParcelizer = th;
                                    dropShadowEffect.read(19);
                                }
                                break;
                            case -16:
                                i7 = 42;
                                break;
                            case -15:
                                dropShadowEffect.read(30);
                                if (dropShadowEffect.serializer != 14) {
                                    i8 = 35;
                                    i7 = i8;
                                } else {
                                    i7 = 1;
                                }
                                break;
                            case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                                i7 = 43;
                                break;
                            case -13:
                                i7 = 45;
                                break;
                            case -12:
                                try {
                                    dropShadowEffect.read(16);
                                    i7 = dropShadowEffect.serializer;
                                    if (i7 == 0) {
                                        i8 = 33;
                                    }
                                    i7 = i8;
                                } catch (Throwable th4) {
                                    th = th4;
                                    s = (short) 262;
                                    bArr = MediaDescriptionCompat;
                                    objArr = new Object[1];
                                    a(s, bArr[353], bArr[93], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th) || i7 < 10 || i7 >= 19) {
                                        byte b7 = bArr[353];
                                        byte b8 = bArr[93];
                                        objArr2 = new Object[1];
                                        a(s, b7, b8, objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th) && i7 >= 13 && i7 < 14) {
                                            i7 = 52;
                                        } else if (i7 < 21 && i7 < 25) {
                                            i7 = 19;
                                        } else {
                                            if (i7 >= 39 || i7 >= 42) {
                                                throw th;
                                            }
                                            i7 = 34;
                                        }
                                    } else {
                                        i7 = 53;
                                    }
                                    dropShadowEffect.IconCompatParcelizer = th;
                                    dropShadowEffect.read(19);
                                }
                                break;
                            case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                                dropShadowEffect.read(8);
                                throw ((Throwable) dropShadowEffect.read);
                            case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                                i7 = 48;
                                break;
                            case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                                i7 = 50;
                                break;
                            case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                                dropShadowEffect.read(16);
                                if (dropShadowEffect.serializer == 0) {
                                    i8 = 18;
                                }
                                i7 = i8;
                                break;
                            case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                                dropShadowEffect.write = 1;
                                try {
                                    dropShadowEffect.read(2);
                                    dropShadowEffect.read(13);
                                    MediaSessionCompatQueueItem = dropShadowEffect.serializer;
                                    i7 = i8;
                                } catch (Throwable th5) {
                                    th = th5;
                                    s = (short) 262;
                                    bArr = MediaDescriptionCompat;
                                    objArr = new Object[1];
                                    a(s, bArr[353], bArr[93], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        byte b9 = bArr[353];
                                        byte b10 = bArr[93];
                                        objArr2 = new Object[1];
                                        a(s, b9, b10, objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i7 < 21) {
                                            if (i7 >= 39) {
                                            }
                                            throw th;
                                        }
                                        if (i7 >= 39) {
                                        }
                                        throw th;
                                    }
                                    byte b11 = bArr[353];
                                    byte b12 = bArr[93];
                                    objArr2 = new Object[1];
                                    a(s, b11, b12, objArr2);
                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                        break;
                                    }
                                    if (i7 < 21) {
                                        if (i7 >= 39) {
                                        }
                                        throw th;
                                    }
                                    if (i7 >= 39) {
                                    }
                                    throw th;
                                    dropShadowEffect.IconCompatParcelizer = th;
                                    dropShadowEffect.read(19);
                                }
                                break;
                            case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                                dropShadowEffect.write = write;
                                dropShadowEffect.read(10);
                                i7 = i8;
                                break;
                            case BaseCode.URI_IS_NULL /* -5 */:
                                dropShadowEffect.read(8);
                                return (lottieComposition) dropShadowEffect.read;
                            case BaseCode.NO_SOLUTION /* -4 */:
                                i7 = 25;
                                break;
                            case -3:
                                i7 = 10;
                                break;
                            case -2:
                                dropShadowEffect.write = 1;
                                dropShadowEffect.read(2);
                                try {
                                    dropShadowEffect.read(3);
                                    dropShadowEffect.IconCompatParcelizer = ((onRoutesChanged) dropShadowEffect.read).read;
                                    try {
                                        dropShadowEffect.read(4);
                                        i7 = i8;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        s = (short) 262;
                                        bArr = MediaDescriptionCompat;
                                        objArr = new Object[1];
                                        a(s, bArr[353], bArr[93], objArr);
                                        if (Class.forName((String) objArr[0]).isInstance(th)) {
                                            byte b13 = bArr[353];
                                            byte b14 = bArr[93];
                                            objArr2 = new Object[1];
                                            a(s, b13, b14, objArr2);
                                            if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                                break;
                                            }
                                            if (i7 < 21) {
                                                if (i7 >= 39) {
                                                }
                                                throw th;
                                            }
                                            if (i7 >= 39) {
                                            }
                                            throw th;
                                        }
                                        byte b15 = bArr[353];
                                        byte b16 = bArr[93];
                                        objArr2 = new Object[1];
                                        a(s, b15, b16, objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i7 < 21) {
                                            if (i7 >= 39) {
                                            }
                                            throw th;
                                        }
                                        if (i7 >= 39) {
                                        }
                                        throw th;
                                        dropShadowEffect.IconCompatParcelizer = th;
                                        dropShadowEffect.read(19);
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    s = (short) 262;
                                    bArr = MediaDescriptionCompat;
                                    objArr = new Object[1];
                                    a(s, bArr[353], bArr[93], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        byte b17 = bArr[353];
                                        byte b18 = bArr[93];
                                        objArr2 = new Object[1];
                                        a(s, b17, b18, objArr2);
                                        if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                            break;
                                        }
                                        if (i7 < 21) {
                                            if (i7 >= 39) {
                                            }
                                            throw th;
                                        }
                                        if (i7 >= 39) {
                                        }
                                        throw th;
                                    }
                                    byte b19 = bArr[353];
                                    byte b110 = bArr[93];
                                    objArr2 = new Object[1];
                                    a(s, b19, b110, objArr2);
                                    if (!Class.forName((String) objArr2[0]).isInstance(th)) {
                                        break;
                                    }
                                    if (i7 < 21) {
                                        if (i7 >= 39) {
                                        }
                                        throw th;
                                    }
                                    if (i7 >= 39) {
                                    }
                                    throw th;
                                    dropShadowEffect.IconCompatParcelizer = th;
                                    dropShadowEffect.read(19);
                                }
                                break;
                            case -1:
                                i7 = 5;
                                break;
                            default:
                                i7 = i8;
                                break;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                }
            } catch (Throwable th9) {
                Throwable cause3 = th9.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th9;
            }
        } catch (Throwable th10) {
            Throwable cause4 = th10.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x043c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0401  */
    /* JADX WARN: Code duplicated, block: B:76:0x040d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0428  */
    public static final /* synthetic */ LottieAnimatableImplanimate2 write(onRoutesChanged onrouteschanged) throws Throwable {
        short s;
        byte[] bArr;
        Object[] objArr;
        Object[] objArr2;
        int i;
        DropShadowEffect dropShadowEffect = new DropShadowEffect(onrouteschanged);
        try {
            byte[] bArr2 = MediaDescriptionCompat;
            Object[] objArr3 = new Object[1];
            a(bArr2[13], bArr2[9], bArr2[462], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr2[411], bArr2[30], (byte) (-bArr2[34]), objArr4);
            int iIntValue = 43 - (((Integer) cls.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr5 = new Object[1];
            a((short) (bArr2[10] + 1), bArr2[9], bArr2[85], objArr5);
            Class<?> cls2 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a((short) 73, bArr2[9], bArr2[150], objArr6);
            String str = (String) objArr6[0];
            short s2 = (short) 86;
            Object[] objArr7 = new Object[1];
            a(s2, bArr2[353], bArr2[203], objArr7);
            int iIntValue2 = ((Integer) cls2.getMethod(str, Class.forName((String) objArr7[0])).invoke(null, "")).intValue() + 103;
            Object[] objArr8 = {"", '0'};
            int i2 = MediaBrowserCompatMediaItem;
            Object[] objArr9 = new Object[1];
            a((short) (i2 | 68), bArr2[9], bArr2[358], objArr9);
            Class<?> cls3 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a((short) 122, bArr2[12], bArr2[88], objArr10);
            String str2 = (String) objArr10[0];
            Object[] objArr11 = new Object[1];
            a((short) androidx.compose.ui.graphics.Fields.SpotShadowColor, bArr2[353], bArr2[358], objArr11);
            Object[] objArr12 = new Object[1];
            b(iIntValue, iIntValue2, 109 - ((Integer) cls3.getMethod(str2, Class.forName((String) objArr11[0]), Character.TYPE).invoke(null, objArr8)).intValue(), true, new char[]{2, 65533, '\b', 65534, 65533, 5, 2, 65533, 3, 2, 65533, 2, 2, 65533, 7, 65534, 65533, 6, 65534, 65533, '\n', 65533, 5, 65534, 65533, '\b', 65533, 7, 65533, 4, 65534, 65533, 2, 65533, 6, 65533, 3, 65534, 65533, 2, 65533, 2, 65534, 7, 2, 65534, 65533, 7, 2, 65534, 65533, 6, 2, 65534, 65533, 6, 2, 65534, 65533, 5, 2, 65534, 65533, 4, 2, 65534, 65533, 6, 2, 65533, 3, 2, 65534, 65533, 5, 2, 65533, 3, 2, 65533, '\b', 2, 65533, 2, 2, 65534, 65533, 1, 2, 65534, 65533, 1, 2, 65534, 65533, '\n', 65534, 65533, '\t', 65534, 65533, 6}, objArr12);
            String str3 = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            a((short) 149, bArr2[9], bArr2[358], objArr13);
            Class<?> cls4 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a((short) 170, bArr2[9], bArr2[46], objArr14);
            int iIntValue3 = 1 - ((Integer) cls4.getMethod((String) objArr14[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr15 = new Object[1];
            a((short) 174, bArr2[9], bArr2[122], objArr15);
            Class<?> cls5 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a((short) 202, bArr2[30], bArr2[88], objArr16);
            int iIntValue4 = ((Integer) cls5.getMethod((String) objArr16[0], Integer.TYPE).invoke(null, 0)).intValue() + 1;
            Object[] objArr17 = new Object[1];
            a((short) 208, bArr2[9], bArr2[478], objArr17);
            Class<?> cls6 = Class.forName((String) objArr17[0]);
            Object[] objArr18 = new Object[1];
            a((short) (i2 | 192), bArr2[28], bArr2[46], objArr18);
            Object[] objArr19 = new Object[1];
            b(iIntValue3, iIntValue4, (((Integer) cls6.getMethod((String) objArr18[0], null).invoke(null, null)).intValue() >> 22) + 107, false, new char[]{0}, objArr19);
            Object[] objArr20 = {(String) objArr19[0]};
            Object[] objArr21 = new Object[1];
            a(s2, bArr2[353], bArr2[203], objArr21);
            Class<?> cls7 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            a((short) (i2 | 196), bArr2[502], bArr2[46], objArr22);
            String str4 = (String) objArr22[0];
            Object[] objArr23 = new Object[1];
            a(s2, bArr2[353], bArr2[203], objArr23);
            Object[] objArr24 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr23[0])).invoke(str3, objArr20);
            int[] iArr = new int[objArr24.length];
            for (int i3 = 0; i3 < objArr24.length; i3++) {
                Object[] objArr25 = {objArr24[i3]};
                int i4 = MediaBrowserCompatMediaItem;
                byte[] bArr3 = MediaDescriptionCompat;
                Object[] objArr26 = new Object[1];
                a((short) (i4 | 200), bArr3[353], bArr3[352], objArr26);
                Class<?> cls8 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                a((short) (i4 | Constant.ERROR_GYRO_JUMP), bArr3[85], bArr3[88], objArr27);
                String str5 = (String) objArr27[0];
                Object[] objArr28 = new Object[1];
                a(s2, bArr3[353], bArr3[203], objArr28);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr28[0])).invoke(null, objArr25);
                Object[] objArr29 = new Object[1];
                a((short) (i4 | 200), bArr3[353], bArr3[352], objArr29);
                Class<?> cls9 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                a((short) (i4 | Constant.ERROR_WSS_LOW_FREQ), bArr3[12], bArr3[5], objArr30);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr30[0], null).invoke(objInvoke, null)).intValue();
            }
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                try {
                    switch (dropShadowEffect.read(iArr[i5])) {
                        case -16:
                            dropShadowEffect.read(8);
                            throw ((Throwable) dropShadowEffect.read);
                        case -15:
                            i5 = 9;
                            break;
                        case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                            i5 = 30;
                            break;
                        case -13:
                            dropShadowEffect.read(18);
                            if (dropShadowEffect.serializer == 0) {
                                i6 = 29;
                            }
                            i5 = i6;
                            break;
                        case -12:
                            dropShadowEffect.write = 1;
                            try {
                                dropShadowEffect.read(2);
                                try {
                                    dropShadowEffect.read(13);
                                    write = dropShadowEffect.serializer;
                                    i5 = i6;
                                } catch (Throwable th) {
                                    th = th;
                                    s = (short) 262;
                                    bArr = MediaDescriptionCompat;
                                    objArr = new Object[1];
                                    a(s, bArr[353], bArr[93], objArr);
                                    if (Class.forName((String) objArr[0]).isInstance(th)) {
                                        objArr2 = new Object[1];
                                        a(s, bArr[353], bArr[93], objArr2);
                                        if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                        }
                                        throw th;
                                    }
                                    objArr2 = new Object[1];
                                    a(s, bArr[353], bArr[93], objArr2);
                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                    }
                                    throw th;
                                    i5 = i;
                                    dropShadowEffect.IconCompatParcelizer = th;
                                    dropShadowEffect.read(19);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                s = (short) 262;
                                bArr = MediaDescriptionCompat;
                                objArr = new Object[1];
                                a(s, bArr[353], bArr[93], objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                    objArr2 = new Object[1];
                                    a(s, bArr[353], bArr[93], objArr2);
                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                objArr2 = new Object[1];
                                a(s, bArr[353], bArr[93], objArr2);
                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                }
                                throw th;
                                i5 = i;
                                dropShadowEffect.IconCompatParcelizer = th;
                                dropShadowEffect.read(19);
                            }
                            break;
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            dropShadowEffect.write = MediaSessionCompatQueueItem;
                            try {
                                dropShadowEffect.read(10);
                                i5 = i6;
                            } catch (Throwable th3) {
                                th = th3;
                                s = (short) 262;
                                bArr = MediaDescriptionCompat;
                                objArr = new Object[1];
                                a(s, bArr[353], bArr[93], objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th)) {
                                    objArr2 = new Object[1];
                                    a(s, bArr[353], bArr[93], objArr2);
                                    if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                    }
                                    throw th;
                                }
                                objArr2 = new Object[1];
                                a(s, bArr[353], bArr[93], objArr2);
                                if (Class.forName((String) objArr2[0]).isInstance(th)) {
                                }
                                throw th;
                                i5 = i;
                                dropShadowEffect.IconCompatParcelizer = th;
                                dropShadowEffect.read(19);
                            }
                            break;
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            i5 = 1;
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            i5 = 20;
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            try {
                                dropShadowEffect.read(16);
                                if (dropShadowEffect.serializer == 0) {
                                    i6 = 19;
                                }
                                i5 = i6;
                            } catch (Throwable th4) {
                                th = th4;
                                s = (short) 262;
                                bArr = MediaDescriptionCompat;
                                objArr = new Object[1];
                                a(s, bArr[353], bArr[93], objArr);
                                if (Class.forName((String) objArr[0]).isInstance(th) || i5 < 21 || i5 >= 22) {
                                    objArr2 = new Object[1];
                                    a(s, bArr[353], bArr[93], objArr2);
                                    if (Class.forName((String) objArr2[0]).isInstance(th) || i5 < 25 || i5 >= 26) {
                                        throw th;
                                    }
                                    i = 32;
                                } else {
                                    i = 31;
                                }
                                i5 = i;
                                dropShadowEffect.IconCompatParcelizer = th;
                                dropShadowEffect.read(19);
                            }
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            dropShadowEffect.write = 1;
                            dropShadowEffect.read(2);
                            dropShadowEffect.read(13);
                            MediaSessionCompatQueueItem = dropShadowEffect.serializer;
                            i5 = i6;
                            break;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            dropShadowEffect.write = write;
                            dropShadowEffect.read(10);
                            i5 = i6;
                            break;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            dropShadowEffect.read(8);
                            return (LottieAnimatableImplanimate2) dropShadowEffect.read;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            i5 = 11;
                            break;
                        case -3:
                            i5 = 21;
                            break;
                        case -2:
                            dropShadowEffect.write = 1;
                            dropShadowEffect.read(2);
                            dropShadowEffect.read(3);
                            dropShadowEffect.IconCompatParcelizer = ((onRoutesChanged) dropShadowEffect.read).IconCompatParcelizer;
                            dropShadowEffect.read(4);
                            i5 = i6;
                            break;
                        case -1:
                            i5 = 6;
                            break;
                        default:
                            i5 = i6;
                            break;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (Throwable th6) {
            Throwable cause = th6.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th6;
        }
    }
}
