package o;

import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.adapter.internal.BaseCode;
import com.huawei.riemann.location.common.utils.Constant;
import java.lang.reflect.Method;
import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
@getCardAtIndexlambda0
public final class LottieAnimatableImplanimate2 {
    private static final byte[] $$a = {41, -110, -30, 125};
    private static final int $$b = 178;
    private static short[] MediaBrowserCompatMediaItem;
    private static int MediaDescriptionCompat;
    private static int MediaMetadataCompat;
    private static byte[] MediaSessionCompatQueueItem;
    private static final int ParcelableVolumeInfo;
    private static final byte[] PlaybackStateCompatCustomAction;
    private static int RatingCompat;
    private static int RemoteActionCompatParcelizer;
    private static int read;
    private final useSoftwareRendering IconCompatParcelizer;
    private final onViewDetachedFromWindowlambda1 serializer;
    private final RememberLottieCompositionKtrememberLottieComposition3 write;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(short r6, byte r7, short r8) {
        /*
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r6 = r6 + 113
            byte[] r1 = o.LottieAnimatableImplanimate2.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2d
        L16:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2d:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LottieAnimatableImplanimate2.$$c(short, byte, short):java.lang.String");
    }

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public LottieAnimatableImplanimate2(useSoftwareRendering usesoftwarerendering, RememberLottieCompositionKtrememberLottieComposition3 rememberLottieCompositionKtrememberLottieComposition3) {
        usesoftwarerendering.getClass();
        rememberLottieCompositionKtrememberLottieComposition3.getClass();
        this.IconCompatParcelizer = usesoftwarerendering;
        this.write = rememberLottieCompositionKtrememberLottieComposition3;
        this.serializer = new isAdapterPositionOnScreen(new ResourceFileSystem$$ExternalSyntheticLambda0(18, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r5.isEmpty() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r5.isEmpty() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r5 = o.LottieAnimatableImplanimate2.read + 67;
        o.LottieAnimatableImplanimate2.RemoteActionCompatParcelizer = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r5 = r5 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long serializer() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LottieAnimatableImplanimate2.serializer():long");
    }

    private static void b(int i, short s, int i2, byte b, int i3, Object[] objArr) throws Throwable {
        long j;
        toViewVelocity toviewvelocity = new toViewVelocity();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(MediaDescriptionCompat)};
            Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1745204208);
            if (objRemoteActionCompatParcelizer == null) {
                byte b2 = (byte) 1;
                byte b3 = (byte) (b2 - 1);
                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (android.view.KeyEvent.normalizeMetaState(0) + 15495), 2821 - android.graphics.Color.red(0), 17 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1193962993, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i4 = iIntValue == -1 ? 1 : 0;
            if (i4 == 0) {
                j = -565326573115254380L;
            } else {
                byte[] bArr = MediaSessionCompatQueueItem;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i5])};
                        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-748751776);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (4453 - android.view.KeyEvent.normalizeMetaState(0)), 2484 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf("", "", 0, 0) + 18, 59692417, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr2[i5] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = MediaSessionCompatQueueItem;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(MediaMetadataCompat)};
                    Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1745204208);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        byte b6 = (byte) 1;
                        byte b7 = (byte) (b6 - 1);
                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (15495 - android.view.KeyEvent.keyCodeFromString("")), 2820 - TextUtils.lastIndexOf("", '0'), 16 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 1193962993, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ (-565326573115254380L))) + ((int) (((long) MediaDescriptionCompat) ^ (-565326573115254380L))));
                    j = -565326573115254380L;
                } else {
                    j = -565326573115254380L;
                    iIntValue = (short) (((short) (((long) MediaBrowserCompatMediaItem[i2 + ((int) (((long) MediaMetadataCompat) ^ (-565326573115254380L)))]) ^ (-565326573115254380L))) + ((int) (((long) MediaDescriptionCompat) ^ (-565326573115254380L))));
                }
            }
            if (iIntValue > 0) {
                toviewvelocity.RemoteActionCompatParcelizer = ((i2 + iIntValue) - 2) + ((int) (((long) MediaMetadataCompat) ^ j)) + i4;
                Object[] objArr5 = {toviewvelocity, Integer.valueOf(i3), Integer.valueOf(RatingCompat), sb};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1760519764);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                    int tapTimeout = (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2411;
                    int jumpTapTimeout = (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 15;
                    byte b8 = (byte) ($$b & 15);
                    byte b9 = (byte) (b8 - 2);
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c, tapTimeout, jumpTapTimeout, 1203812429, false, $$c(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(toviewvelocity.serializer);
                toviewvelocity.IconCompatParcelizer = toviewvelocity.serializer;
                byte[] bArr4 = MediaSessionCompatQueueItem;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i6 = 0; i6 < length2; i6++) {
                        bArr5[i6] = (byte) (((long) bArr4[i6]) ^ (-565326573115254380L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                toviewvelocity.read = 1;
                while (toviewvelocity.read < iIntValue) {
                    if (z) {
                        byte[] bArr6 = MediaSessionCompatQueueItem;
                        int i7 = toviewvelocity.RemoteActionCompatParcelizer;
                        toviewvelocity.RemoteActionCompatParcelizer = i7 - 1;
                        toviewvelocity.serializer = (char) (toviewvelocity.IconCompatParcelizer + (((byte) (((byte) (((long) bArr6[i7]) ^ (-565326573115254380L))) + s)) ^ b));
                    } else {
                        short[] sArr = MediaBrowserCompatMediaItem;
                        int i8 = toviewvelocity.RemoteActionCompatParcelizer;
                        toviewvelocity.RemoteActionCompatParcelizer = i8 - 1;
                        toviewvelocity.serializer = (char) (toviewvelocity.IconCompatParcelizer + (((short) (((short) (((long) sArr[i8]) ^ (-565326573115254380L))) + s)) ^ b));
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            byte[] r0 = o.LottieAnimatableImplanimate2.PlaybackStateCompatCustomAction
            int r9 = 33 - r9
            int r7 = r7 + 97
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L27:
            int r7 = r7 + r8
            int r7 = r7 + (-5)
            r8 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LottieAnimatableImplanimate2.a(byte, short, byte, java.lang.Object[]):void");
    }

    static void RemoteActionCompatParcelizer() {
        MediaMetadataCompat = 1771841617;
        MediaDescriptionCompat = 2022779111;
        RatingCompat = -1533879518;
        MediaSessionCompatQueueItem = new byte[]{-108, -112, -107, 111, -108, -112, -107, 108, -105, -112, -107, 109, -107, -110, 108, -105, -112, -107, 110, -107, -111, 109, -106, -112, -107, 109, -110, -107, 111, 107, -110, 110, -107, -112, -107, 104, 106, -110, 98, -98, 99, -99, 110, -111, -107, 108, -100, 111, -108, -112, -107, 104, 107, -112, -107, 103, -104, -107, 96, -97, -107, 96, -109, -111, 97, -98, -107, 99, -112, -111, 108, -105, -111, 109, -106, -111, 110, -107, -111, 98, -99, -107, 99, -100, -107, 103, -103, 108, -109, -107, 96, -104, 97, -97, 109, -110, -107, 98, -98, 99, -99, 110, -111, -107, 108, -100, 111, -112, -105, -112, -107, 104, 105, -109, 108, -105, -112, -107, 103, -109, -110, 109, -106, -112, -107, 109, -110, -107, 111, 107, -110, 110, -107, -112, -107, 104, 106, -110, 96, -110, -110, 110, -111, -107, 108, -100, 111, -108, -112, -107, 104, 107, -112, -107, 103, -104, -107, 96, -97, -107, 99, -112, -111, 99, -105, -110, 97, -98, -107, 99, -112, -111, 108, -105, -111, 97, -111, -110, 98, -112, -110, 98, -99, -107, 99, -100, -107, 103, -103, 108, -109, -107, 111, 107, -110, 96, -109, -111, 99, -105, -110, 109, -110, -107, 98, -98, 99, -99, 110, -111, -107, 108, -100, 111, -112, -110, -112, -107, 97, -110, -112, -107, 98, -111, -112, -107, 98, -111, -112, -107, 99, -112, -112, -107, 108, -105, -112, -107, 99, -112, -111, 99, -105, -110, 104, 107, -112, -107, 99, -112, -111, 103, -107, -104, 96, -108, -104, 97, 107, -104, 103, -104, -107, 109, -106, -112, -107, 109, -106, -112, -107, 110, -107, -112, -107, 111, -108, -112, -107, 99, -112, -111, 99, -105, -110, 104, 107, -112, -107, 99, -112, -111, 108, -105, -111, 98, 106, -104, 103, -104, -107, 96, -97, -107, 103, -103, 97, -98, -107, 111, 107, -110, 99, 105, -104, 98, -99, -107, 96, -110, -110, 99, -100, -107, 110, 110, -104, 108, -109, -107, 108, 104, -104, 109, 111, -104, 109, -110, -107, 110, 110, -104, 110, -111, -107, 108, -100, 111, -112, -110, -112, -107, 103, -109, -110, 97, -110, -112, -107, 104, 105, -109, 98, -111, -112, -107, 99, -100, -107, 111, 107, -110, 99, -112, -112, -107, 104, 106, -110, 103, -103, 108, -105, -112, -107, 109, -106, -112, -107, 110, -107, -112, -107, 111, -108, -112, -107, 99, -112, -111, 99, -105, -110, 97, -98, -107, 99, -112, -111, 110, 111, -97, 110, 109, -103, 98, -99, -107, 104, 107, -112, -107, 104, 107, -112, -107, 103, -104, -107, 96, -97, -107, 99, -112, -111, 99, -105, -110, 97, -98, -107, 99, -112, -111, 108, -105, -111, 97, -111, -110, 111, 108, -103, 98, -99, -107, 99, -100, -107, 103, -103, 108, -109, -107, 104, 99, -103, 99, -105, -110, 109, -110, -107, 96, -110, -110, 110, -111, -107, 108, -100, 111, -112};
    }

    static {
        byte[] bArr = new byte[803];
        System.arraycopy(")\u0083«\u0004\u0012û\u0013\u0002ÿ\u0000ÏKö\u0018\u0001¿+\u0016\u0018\u0001æ$ú\b\fú\u0017\u0006Ú*û\u0006\u0018Ü\u001cü\u001aðÒCú\u0012þÌ\u001a*þ\u0016æ\u0017\u0011\tõ\u000eú\u0007\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017Ñ1\u0004ý\b\u0003\u0013\u0002ô\u0018ú\u000b\u0004\u0003\u0014ä\u0015\u0014\u0002\u0002\u0005Ý&\u0006\u0000\u0019ü\rÕ&\fú\u001d\u0012û\u0013\u0002ÿ\u0000Ï>\u0010ô\u0014ý\u0006ÿ\u0015À\u001a1\u0002\b\bú\u0000\u0003\u0014Þ\u0019\u001cö\t\rýÞ+\u0002\nþô\u0014\f\bù\u000b\u0010\n\u0003\u0014Ü\u001f\u0019Þ\u0018\u0010ú\u0001\u0018Õ&\fú\u001d\u0003\u0014Þ\u0019\u001cö\t\rýÜ3ô\u001b÷\nþá#\u0007\n\u0002ó\u001b\u0016ð\nû\u0006\u0018Ü\u001c\u0012û\u0013\u0002ÿ\u0000ÏF\tÀ''\u0002ù\u0007\u0013\u0005\u0003\u0014å\u0019\u000fø\u0001\bñ'ü\u000b\bü\u0010\n\u0003\u0014Þ!\n\u0000\t\rýÞ+\u0002\nþô\u0014\f\bù\u000b\u0010\n\u0003\u0014Û0ý\bé\u0012\u0014é\u001a\tý\u000f\u000b\u0004ü\u001aðÒCú\u0012þÌ*&\u0003ü\nþ\u0002\u0001\u0002\u0010ü\u001aðÒCú\u0012þÌ *\u000bö\u0007\u0003\u0012ð\u0010\u000eõï\u001c\n\u000bç\u0010\u0010\u000eõü\u001aðÒCú\u0012þÌ\u001c8ð\u0007\u0010\tú\u000b\u0004\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017ø\u0013\u0001\u0002\u000fôó\u001b\u0016ðá2ûô&ò\u0018ö\u0003\u0014× \b\n\nþã$\b\u0003ì\u001e\u000eþ\u0012ù\u0003\u0014Õ&\u0006\u0000\u0019ü\rä\u001b\u0016ð\u0003\u0014Ø'\u0000ç.\bá\u0018\u0011ý\u0003\u0014Ô#\u0014\bß'ú\u0006\u0012û\u0013\u0002ÿ\u0000ÏN÷\u0000\b\u0003\u0014¿\u001c8ýö\u0012û\u0002\u0006\u000fþì\"\u000f\u0006ç\u0018\u0001\u0017\u0003\u0014á\u0016\u0007\rÿ\u0004ñ$\tû\u0010ú\u000b\u0004Þ0\u0002\u000b\u0000\u0011à\u001a\u0000\u0012û\u0013\u0002ÿ\u0000ÏF\tÀ*+ÿ\u0006ö\rÛ.\bù\r\u0017\u0002\u0005ø\u000e\u000bå\u0019\u000fø\u0001\bõ\u001a\týí!\b\u0005\u0002\u000f\u0003\u0014à\u001c\u0005\u0012÷\u0014Ó(\u0006\u000e\bø\u0016ú\u0000\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼\"\u001f\u0019Ñ6ô\u000e\u000b\u0003\u0014Þ'ú\n\u0002\b\u0001\u0012à\u001d\u0014ò÷&ò\u0018öí\u0019\u0017ý\u0003\u0014ë\u001a\u0005\u0003Û1\u0004\u000b\u0003\u0002\u0002\fæ\u001a\tý\u000f\u000b\u0004\u0003\u0014á'ø\u0013\u0005÷\u0004ô&ò\u0018öä6\u0002ô\u0018ú\u000b\u0004\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼-\u0018\u0001\u0017².\u001d\u0001\u0017\u0007\u0002øó\"ú\u0003\u0003\u0014ä\u001b\u0016ð\u0003\u0014á\u0016\u0007\rÿ\u0004ñ$\tû\u0010ú\u000b\u0004Ý.\bÖ*\u0006\bý\u0012û\u0013\u0002ÿ\u0000ÏMø\u0001\u0017¼$'\nú\u000b\u0004Ü6ô\u000e\u000b\u001cö\u000fØ1\u0002\u0003ë&\u0003ü\nþü\u001aðÒCú\u0012þÌ%,ýú\b\u0012\b\u0004þô\u0010\u0010\u000eõ\u000f\u000eõù\u000fÿí\u001d\u0001\u0017\u0007\u0002øó\"ú\u0003\u0006\b\u0000ù\u0010\u0002\u0016ðí\u001d\u0014ò÷&ò\u0018ö\u0003\u0014å\u0012\u0014é\u001a\tý\u000f\u000b\u0004\u0003\u0014Ö,ú\u0014\b÷\u0004ä2\nä\u001a\tý".getBytes("ISO-8859-1"), 0, bArr, 0, 803);
        PlaybackStateCompatCustomAction = bArr;
        ParcelableVolumeInfo = Constant.ERROR_GYRO_INVALID;
        RemoteActionCompatParcelizer();
        read = 0;
        RemoteActionCompatParcelizer = 1;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:93:0x05d1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final long IconCompatParcelizer() throws Throwable {
        hasTimeRemaining hastimeremaining;
        hasTimeRemaining hastimeremaining2 = new hasTimeRemaining(this);
        try {
            byte[] bArr = PlaybackStateCompatCustomAction;
            byte b = bArr[9];
            Object[] objArr = new Object[1];
            a(b, (short) (b | 100), bArr[83], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[14], (short) 736, bArr[104], objArr2);
            int iIntValue = ((Integer) cls.getMethod((String) objArr2[0], Integer.TYPE).invoke(null, 0)).intValue() - 1676767468;
            byte b2 = bArr[9];
            Object[] objArr3 = new Object[1];
            a(b2, (short) (b2 | 619), bArr[3], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[24], (short) 739, bArr[4], objArr4);
            short sIntValue = (short) ((Integer) cls2.getMethod((String) objArr4[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue();
            Object[] objArr5 = new Object[1];
            a(bArr[9], bArr[176], bArr[77], objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a(bArr[27], (short) (ParcelableVolumeInfo & 376), bArr[24], objArr6);
            int iIntValue2 = (-1929146472) + (((Integer) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).intValue() >> 16);
            byte b3 = bArr[9];
            Object[] objArr7 = new Object[1];
            a(b3, (short) (b3 | 533), bArr[24], objArr7);
            Class<?> cls4 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a(bArr[99], (short) 753, bArr[218], objArr8);
            byte bIntValue = (byte) ((Integer) cls4.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, 0)).intValue();
            byte b4 = bArr[9];
            Object[] objArr9 = new Object[1];
            a(b4, (short) (b4 | 192), bArr[218], objArr9);
            Class<?> cls5 = Class.forName((String) objArr9[0]);
            short s = (short) 394;
            Object[] objArr10 = new Object[1];
            a(bArr[27], s, bArr[86], objArr10);
            String str = (String) objArr10[0];
            short s2 = (short) 263;
            hasTimeRemaining hastimeremaining3 = hastimeremaining2;
            Object[] objArr11 = new Object[1];
            a(bArr[51], s2, bArr[50], objArr11);
            Object[] objArr12 = new Object[1];
            b(iIntValue, sIntValue, iIntValue2, bIntValue, 1074625910 - ((Integer) cls5.getMethod(str, Class.forName((String) objArr11[0])).invoke(null, "")).intValue(), objArr12);
            String str2 = (String) objArr12[0];
            byte b5 = bArr[9];
            Object[] objArr13 = new Object[1];
            a(b5, (short) (b5 | 192), bArr[218], objArr13);
            Class<?> cls6 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a(bArr[27], s, bArr[86], objArr14);
            String str3 = (String) objArr14[0];
            Object[] objArr15 = new Object[1];
            a(bArr[51], s2, bArr[50], objArr15);
            int iIntValue3 = (-1676767603) - ((Integer) cls6.getMethod(str3, Class.forName((String) objArr15[0])).invoke(null, "")).intValue();
            Object[] objArr16 = new Object[1];
            a(bArr[9], bArr[8], bArr[83], objArr16);
            Class<?> cls7 = Class.forName((String) objArr16[0]);
            byte b6 = bArr[23];
            Object[] objArr17 = new Object[1];
            a(b6, (short) (b6 | 178), bArr[36], objArr17);
            String str4 = (String) objArr17[0];
            Object[] objArr18 = new Object[1];
            a(bArr[51], bArr[381], bArr[83], objArr18);
            Object[] objArr19 = new Object[1];
            a(bArr[51], bArr[381], bArr[83], objArr19);
            short sIntValue2 = (short) ((Integer) cls7.getMethod(str4, Class.forName((String) objArr18[0]), Class.forName((String) objArr19[0]), Integer.TYPE, Integer.TYPE).invoke(null, "", "", 0, 0)).intValue();
            Object[] objArr20 = new Object[1];
            a(bArr[9], bArr[176], bArr[77], objArr20);
            Class<?> cls8 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            a(bArr[27], (short) 770, bArr[86], objArr21);
            int iIntValue4 = (-1929146713) - (((Integer) cls8.getMethod((String) objArr21[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr22 = new Object[1];
            a(bArr[9], bArr[8], bArr[83], objArr22);
            Class<?> cls9 = Class.forName((String) objArr22[0]);
            byte b7 = bArr[23];
            Object[] objArr23 = new Object[1];
            a(b7, (short) (b7 | 178), bArr[36], objArr23);
            String str5 = (String) objArr23[0];
            Object[] objArr24 = new Object[1];
            a(bArr[51], bArr[381], bArr[83], objArr24);
            byte bIntValue2 = (byte) (((Integer) cls9.getMethod(str5, Class.forName((String) objArr24[0]), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, "", '0', 0, 0)).intValue() + 1);
            byte b8 = bArr[9];
            Object[] objArr25 = new Object[1];
            a(b8, (short) (b8 | 192), bArr[218], objArr25);
            Class<?> cls10 = Class.forName((String) objArr25[0]);
            byte b9 = bArr[27];
            Object[] objArr26 = new Object[1];
            a(b9, (short) (b9 | 776), bArr[113], objArr26);
            int i = 1074625911 - (((Long) cls10.getMethod((String) objArr26[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls10.getMethod((String) objArr26[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1));
            Object[] objArr27 = new Object[1];
            b(iIntValue3, sIntValue2, iIntValue4, bIntValue2, i, objArr27);
            Object[] objArr28 = {(String) objArr27[0]};
            Object[] objArr29 = new Object[1];
            a(bArr[51], s2, bArr[50], objArr29);
            Class<?> cls11 = Class.forName((String) objArr29[0]);
            byte b10 = bArr[4];
            Object[] objArr30 = new Object[1];
            a(b10, (short) (b10 | 260), bArr[34], objArr30);
            String str6 = (String) objArr30[0];
            Object[] objArr31 = new Object[1];
            a(bArr[51], s2, bArr[50], objArr31);
            Object[] objArr32 = (Object[]) cls11.getMethod(str6, Class.forName((String) objArr31[0])).invoke(str2, objArr28);
            int[] iArr = new int[objArr32.length];
            for (int i2 = 0; i2 < objArr32.length; i2++) {
                Object[] objArr33 = {objArr32[i2]};
                byte[] bArr2 = PlaybackStateCompatCustomAction;
                short s3 = (short) 282;
                Object[] objArr34 = new Object[1];
                a(bArr2[51], s3, bArr2[113], objArr34);
                Class<?> cls12 = Class.forName((String) objArr34[0]);
                Object[] objArr35 = new Object[1];
                a(bArr2[88], (short) 298, bArr2[36], objArr35);
                String str7 = (String) objArr35[0];
                Object[] objArr36 = new Object[1];
                a(bArr2[51], s2, bArr2[50], objArr36);
                Object objInvoke = cls12.getMethod(str7, Class.forName((String) objArr36[0])).invoke(null, objArr33);
                Object[] objArr37 = new Object[1];
                a(bArr2[51], s3, bArr2[113], objArr37);
                Class<?> cls13 = Class.forName((String) objArr37[0]);
                Object[] objArr38 = new Object[1];
                a(bArr2[23], (short) 304, bArr2[97], objArr38);
                iArr[i2] = ((Integer) cls13.getMethod((String) objArr38[0], null).invoke(objInvoke, null)).intValue();
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                try {
                    hastimeremaining = hastimeremaining3;
                    try {
                        switch (hastimeremaining.read(iArr[i3])) {
                            case -17:
                                i3 = 38;
                                hastimeremaining3 = hastimeremaining;
                                break;
                            case -16:
                                hastimeremaining.read(22);
                                int i5 = hastimeremaining.IconCompatParcelizer;
                                if (i5 == 0 || i5 != 1) {
                                    i4 = 33;
                                    i3 = i4;
                                } else {
                                    i3 = 8;
                                }
                                hastimeremaining3 = hastimeremaining;
                                break;
                            case -15:
                                hastimeremaining.serializer = 1;
                                hastimeremaining.read(1);
                                try {
                                    hastimeremaining.read(2);
                                    hastimeremaining.serializer = hastimeremaining.MediaDescriptionCompat.hashCode();
                                    hastimeremaining.read(11);
                                } catch (Throwable th) {
                                    th = th;
                                    if (i3 >= 34) {
                                    }
                                    throw th;
                                }
                                i3 = i4;
                                hastimeremaining3 = hastimeremaining;
                                break;
                            case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                                hastimeremaining.read(19);
                                throw ((Throwable) hastimeremaining.MediaDescriptionCompat);
                            case -13:
                                i3 = 39;
                                hastimeremaining3 = hastimeremaining;
                                break;
                            case -12:
                                i3 = 41;
                                hastimeremaining3 = hastimeremaining;
                                break;
                            case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                                hastimeremaining.read(17);
                                if (hastimeremaining.IconCompatParcelizer == 0) {
                                    i4 = 31;
                                }
                                i3 = i4;
                                hastimeremaining3 = hastimeremaining;
                                break;
                            case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                                hastimeremaining3 = hastimeremaining;
                                i3 = 1;
                                break;
                            case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                                i3 = 21;
                                hastimeremaining3 = hastimeremaining;
                                break;
                            case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                                hastimeremaining.read(17);
                                if (hastimeremaining.IconCompatParcelizer == 0) {
                                    i4 = 20;
                                }
                                i3 = i4;
                                hastimeremaining3 = hastimeremaining;
                                break;
                            case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                                hastimeremaining.serializer = 1;
                                hastimeremaining.read(1);
                                try {
                                    hastimeremaining.read(16);
                                    RemoteActionCompatParcelizer = hastimeremaining.IconCompatParcelizer;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (i3 >= 34 || i3 >= 38) {
                                        throw th;
                                    }
                                    hastimeremaining.read = th;
                                    hastimeremaining.read(24);
                                    i4 = 32;
                                }
                                i3 = i4;
                                hastimeremaining3 = hastimeremaining;
                                break;
                            case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                                hastimeremaining.serializer = read;
                                hastimeremaining.read(11);
                                i3 = i4;
                                hastimeremaining3 = hastimeremaining;
                                break;
                            case BaseCode.URI_IS_NULL /* -5 */:
                                hastimeremaining.read(10);
                                return hastimeremaining.RemoteActionCompatParcelizer;
                            case BaseCode.NO_SOLUTION /* -4 */:
                                i3 = 10;
                                hastimeremaining3 = hastimeremaining;
                                break;
                            case -3:
                                i3 = 22;
                                hastimeremaining3 = hastimeremaining;
                                break;
                            case -2:
                                hastimeremaining.serializer = 1;
                                hastimeremaining.read(1);
                                hastimeremaining.read(2);
                                hastimeremaining.write = ((LottieAnimatableImplanimate2) hastimeremaining.MediaDescriptionCompat).read();
                                hastimeremaining.read(3);
                                i3 = i4;
                                hastimeremaining3 = hastimeremaining;
                                break;
                            case -1:
                                i3 = 5;
                                hastimeremaining3 = hastimeremaining;
                                break;
                            default:
                                i3 = i4;
                                hastimeremaining3 = hastimeremaining;
                                break;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (i3 >= 34) {
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    hastimeremaining = hastimeremaining3;
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

    /* JADX WARN: Code duplicated, block: B:77:0x05f9  */
    private final long read() throws Throwable {
        hasTimeRemaining hastimeremaining = new hasTimeRemaining(this);
        try {
            char c = 0;
            Object[] objArr = {"", 0};
            byte[] bArr = PlaybackStateCompatCustomAction;
            Object[] objArr2 = new Object[1];
            a(bArr[9], bArr[8], bArr[83], objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            short s = (short) 516;
            Object[] objArr3 = new Object[1];
            a(bArr[27], s, bArr[4], objArr3);
            String str = (String) objArr3[0];
            Object[] objArr4 = new Object[1];
            a(bArr[51], bArr[381], bArr[83], objArr4);
            int iIntValue = (-1676767468) - ((Integer) cls.getMethod(str, Class.forName((String) objArr4[0]), Integer.TYPE).invoke(null, objArr)).intValue();
            try {
                Object[] objArr5 = {0, 0, 0, 0};
                byte b = bArr[9];
                Object[] objArr6 = new Object[1];
                a(b, (short) (b | 100), bArr[83], objArr6);
                Class<?> cls2 = Class.forName((String) objArr6[0]);
                byte b2 = bArr[9];
                Object[] objArr7 = new Object[1];
                a(b2, (short) (b2 | 530), bArr[104], objArr7);
                short sIntValue = (short) ((Integer) cls2.getMethod((String) objArr7[0], Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr5)).intValue();
                try {
                    byte b3 = bArr[9];
                    Object[] objArr8 = new Object[1];
                    a(b3, (short) (b3 | 533), bArr[24], objArr8);
                    Class<?> cls3 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    a(bArr[27], (short) 553, bArr[51], objArr9);
                    int iIntValue2 = (-1929146607) - ((byte) ((Integer) cls3.getMethod((String) objArr9[0], null).invoke(null, null)).intValue());
                    try {
                        Object[] objArr10 = new Object[1];
                        a(bArr[9], bArr[176], bArr[77], objArr10);
                        Class<?> cls4 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        a(bArr[27], (short) 576, bArr[83], objArr11);
                        byte b4 = (byte) ((((Long) cls4.getMethod((String) objArr11[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls4.getMethod((String) objArr11[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 1);
                        try {
                            Object[] objArr12 = new Object[1];
                            a(bArr[9], bArr[176], bArr[77], objArr12);
                            Class<?> cls5 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            a(bArr[27], (short) 597, bArr[140], objArr13);
                            int iIntValue3 = 1074625911 - (((Integer) cls5.getMethod((String) objArr13[0], null).invoke(null, null)).intValue() >> 16);
                            Object[] objArr14 = new Object[1];
                            b(iIntValue, sIntValue, iIntValue2, b4, iIntValue3, objArr14);
                            String str2 = (String) objArr14[0];
                            byte b5 = bArr[9];
                            Object[] objArr15 = new Object[1];
                            a(b5, (short) (b5 | 619), bArr[3], objArr15);
                            Class<?> cls6 = Class.forName((String) objArr15[0]);
                            byte b6 = bArr[27];
                            Object[] objArr16 = new Object[1];
                            a(b6, (short) (b6 | 641), bArr[36], objArr16);
                            int iIntValue4 = (-1676767602) - ((Integer) cls6.getMethod((String) objArr16[0], Integer.TYPE).invoke(null, 0)).intValue();
                            Object[] objArr17 = new Object[1];
                            a(bArr[9], bArr[8], bArr[83], objArr17);
                            Class<?> cls7 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            a(bArr[27], s, bArr[4], objArr18);
                            String str3 = (String) objArr18[0];
                            Object[] objArr19 = new Object[1];
                            a(bArr[51], bArr[381], bArr[83], objArr19);
                            short sIntValue2 = (short) ((Integer) cls7.getMethod(str3, Class.forName((String) objArr19[0]), Integer.TYPE).invoke(null, "", 0)).intValue();
                            byte b7 = bArr[9];
                            byte b8 = b7;
                            Object[] objArr20 = new Object[1];
                            a(b8, (short) (b8 | 416), b7, objArr20);
                            Class<?> cls8 = Class.forName((String) objArr20[0]);
                            Object[] objArr21 = new Object[1];
                            a(bArr[27], (short) 653, bArr[23], objArr21);
                            int i = (((Long) cls8.getMethod((String) objArr21[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).longValue() > 0L ? 1 : (((Long) cls8.getMethod((String) objArr21[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).longValue() == 0L ? 0 : -1)) - 1929146712;
                            byte b9 = bArr[9];
                            Object[] objArr22 = new Object[1];
                            a(b9, (short) (b9 | 192), bArr[218], objArr22);
                            Class<?> cls9 = Class.forName((String) objArr22[0]);
                            Object[] objArr23 = new Object[1];
                            a(bArr[27], (short) (ParcelableVolumeInfo - 5), bArr[113], objArr23);
                            byte bIntValue = (byte) ((((Integer) cls9.getMethod((String) objArr23[0], Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6);
                            byte b10 = bArr[9];
                            Object[] objArr24 = new Object[1];
                            a(b10, (short) (b10 | 677), bArr[51], objArr24);
                            Class<?> cls10 = Class.forName((String) objArr24[0]);
                            byte b11 = bArr[9];
                            Object[] objArr25 = new Object[1];
                            a(b11, (short) (b11 | 700), bArr[6], objArr25);
                            String str4 = (String) objArr25[0];
                            short s2 = (short) 263;
                            Object[] objArr26 = new Object[1];
                            a(bArr[51], s2, bArr[50], objArr26);
                            Object[] objArr27 = new Object[1];
                            b(iIntValue4, sIntValue2, i, bIntValue, ((Integer) cls10.getMethod(str4, Class.forName((String) objArr26[0])).invoke(null, "")).intValue() + 1074625911, objArr27);
                            Object[] objArr28 = {(String) objArr27[0]};
                            Object[] objArr29 = new Object[1];
                            a(bArr[51], s2, bArr[50], objArr29);
                            Class<?> cls11 = Class.forName((String) objArr29[0]);
                            byte b12 = bArr[4];
                            Object[] objArr30 = new Object[1];
                            a(b12, (short) (b12 | 260), bArr[34], objArr30);
                            String str5 = (String) objArr30[0];
                            Object[] objArr31 = new Object[1];
                            a(bArr[51], s2, bArr[50], objArr31);
                            Object[] objArr32 = (Object[]) cls11.getMethod(str5, Class.forName((String) objArr31[0])).invoke(str2, objArr28);
                            int[] iArr = new int[objArr32.length];
                            int i2 = 0;
                            while (i2 < objArr32.length) {
                                Object[] objArr33 = {objArr32[i2]};
                                byte[] bArr2 = PlaybackStateCompatCustomAction;
                                short s3 = (short) 282;
                                Object[] objArr34 = new Object[1];
                                a(bArr2[51], s3, bArr2[113], objArr34);
                                Class<?> cls12 = Class.forName((String) objArr34[c]);
                                Object[] objArr35 = new Object[1];
                                a(bArr2[88], (short) 298, bArr2[36], objArr35);
                                String str6 = (String) objArr35[c];
                                Object[] objArr36 = new Object[1];
                                a(bArr2[51], s2, bArr2[50], objArr36);
                                Object objInvoke = cls12.getMethod(str6, Class.forName((String) objArr36[0])).invoke(null, objArr33);
                                Object[] objArr37 = new Object[1];
                                a(bArr2[51], s3, bArr2[113], objArr37);
                                Class<?> cls13 = Class.forName((String) objArr37[0]);
                                Object[] objArr38 = new Object[1];
                                a(bArr2[23], (short) 304, bArr2[97], objArr38);
                                iArr[i2] = ((Integer) cls13.getMethod((String) objArr38[0], null).invoke(objInvoke, null)).intValue();
                                i2++;
                                c = 0;
                            }
                            int i3 = 0;
                            while (true) {
                                int i4 = i3 + 1;
                                try {
                                    switch (hastimeremaining.read(iArr[i3])) {
                                        case -17:
                                            hastimeremaining.read(19);
                                            throw ((Throwable) hastimeremaining.MediaDescriptionCompat);
                                        case -16:
                                            i3 = 15;
                                            break;
                                        case -15:
                                            i3 = 39;
                                            break;
                                        case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                                            hastimeremaining.read(17);
                                            if (hastimeremaining.IconCompatParcelizer == 0) {
                                                i4 = 38;
                                            }
                                            i3 = i4;
                                            break;
                                        case -13:
                                            i3 = 1;
                                            break;
                                        case -12:
                                            i3 = 27;
                                            break;
                                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                                            hastimeremaining.read(17);
                                            if (hastimeremaining.IconCompatParcelizer == 0) {
                                                i4 = 26;
                                            }
                                            i3 = i4;
                                            break;
                                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                                            hastimeremaining.serializer = 1;
                                            hastimeremaining.read(1);
                                            hastimeremaining.read(16);
                                            RemoteActionCompatParcelizer = hastimeremaining.IconCompatParcelizer;
                                            i3 = i4;
                                            break;
                                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                                            hastimeremaining.serializer = read;
                                            hastimeremaining.read(11);
                                            i3 = i4;
                                            break;
                                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                                            hastimeremaining.read(10);
                                            return hastimeremaining.RemoteActionCompatParcelizer;
                                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                                            i3 = 17;
                                            break;
                                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                                            i3 = 28;
                                            break;
                                        case BaseCode.URI_IS_NULL /* -5 */:
                                            hastimeremaining.serializer = 1;
                                            hastimeremaining.read(1);
                                            hastimeremaining.read(2);
                                            Object obj = hastimeremaining.MediaDescriptionCompat;
                                            try {
                                                byte[] bArr3 = PlaybackStateCompatCustomAction;
                                                byte b13 = bArr3[51];
                                                Object[] objArr39 = new Object[1];
                                                a(b13, (short) (b13 | 704), bArr3[50], objArr39);
                                                Class<?> cls14 = Class.forName((String) objArr39[0]);
                                                try {
                                                    Object[] objArr40 = new Object[1];
                                                    a(bArr3[83], (short) 728, bArr3[13], objArr40);
                                                    try {
                                                        try {
                                                            hastimeremaining.write = ((Long) cls14.getMethod((String) objArr40[0], null).invoke(obj, null)).longValue();
                                                            hastimeremaining.read(3);
                                                            i3 = i4;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            byte[] bArr4 = PlaybackStateCompatCustomAction;
                                                            short s4 = (short) 311;
                                                            Object[] objArr41 = new Object[1];
                                                            a(bArr4[51], s4, bArr4[53], objArr41);
                                                            if (!Class.forName((String) objArr41[0]).isInstance(th) || i3 < 2 || i3 >= 3) {
                                                                Object[] objArr42 = new Object[1];
                                                                a(bArr4[51], s4, bArr4[53], objArr42);
                                                                if (!Class.forName((String) objArr42[0]).isInstance(th) || i3 < 4 || i3 >= 12) {
                                                                    Object[] objArr43 = new Object[1];
                                                                    a(bArr4[51], s4, bArr4[53], objArr43);
                                                                    if (!Class.forName((String) objArr43[0]).isInstance(th) || i3 < 7 || i3 >= 12) {
                                                                        Object[] objArr44 = new Object[1];
                                                                        a(bArr4[51], s4, bArr4[53], objArr44);
                                                                        if (!Class.forName((String) objArr44[0]).isInstance(th) || i3 < 9 || i3 >= 10) {
                                                                            Object[] objArr45 = new Object[1];
                                                                            a(bArr4[51], s4, bArr4[53], objArr45);
                                                                            if (!Class.forName((String) objArr45[0]).isInstance(th) || i3 < 17 || i3 >= 18) {
                                                                                throw th;
                                                                            }
                                                                        }
                                                                        i3 = 40;
                                                                    } else {
                                                                        i3 = 41;
                                                                    }
                                                                }
                                                                i3 = 40;
                                                            } else {
                                                                i3 = 41;
                                                            }
                                                            hastimeremaining.read = th;
                                                            hastimeremaining.read(24);
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                            break;
                                        case BaseCode.NO_SOLUTION /* -4 */:
                                            hastimeremaining.serializer = 1;
                                            hastimeremaining.read(1);
                                            hastimeremaining.read(2);
                                            hastimeremaining.read = hastimeremaining.MediaDescriptionCompat;
                                            hastimeremaining.read(32);
                                            i3 = i4;
                                            break;
                                        case -3:
                                            hastimeremaining.serializer = 1;
                                            hastimeremaining.read(1);
                                            hastimeremaining.read(2);
                                            hastimeremaining.read = ((onViewDetachedFromWindowlambda1) hastimeremaining.MediaDescriptionCompat).MediaSessionCompatResultReceiverWrapper();
                                            hastimeremaining.read(32);
                                            i3 = i4;
                                            break;
                                        case -2:
                                            hastimeremaining.serializer = 1;
                                            hastimeremaining.read(1);
                                            hastimeremaining.read(2);
                                            hastimeremaining.read = ((LottieAnimatableImplanimate2) hastimeremaining.MediaDescriptionCompat).serializer;
                                            hastimeremaining.read(32);
                                            i3 = i4;
                                            break;
                                        case -1:
                                            i3 = 12;
                                            break;
                                        default:
                                            i3 = i4;
                                            break;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            }
                        } catch (Throwable th6) {
                            Throwable cause2 = th6.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th6;
                        }
                    } catch (Throwable th7) {
                        Throwable cause3 = th7.getCause();
                        if (cause3 != null) {
                            throw cause3;
                        }
                        throw th7;
                    }
                } catch (Throwable th8) {
                    Throwable cause4 = th8.getCause();
                    if (cause4 != null) {
                        throw cause4;
                    }
                    throw th8;
                }
            } catch (Throwable th9) {
                Throwable cause5 = th9.getCause();
                if (cause5 != null) {
                    throw cause5;
                }
                throw th9;
            }
        } catch (Throwable th10) {
            Throwable cause6 = th10.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x056e  */
    /* JADX WARN: Code duplicated, block: B:99:0x057c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private static final long RemoteActionCompatParcelizer(LottieAnimatableImplanimate2 lottieAnimatableImplanimate2) throws Throwable {
        hasTimeRemaining hastimeremaining = new hasTimeRemaining(lottieAnimatableImplanimate2);
        try {
            int i = 0;
            byte[] bArr = PlaybackStateCompatCustomAction;
            byte b = bArr[9];
            Object[] objArr = new Object[1];
            a(b, (short) (b | 329), bArr[113], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = bArr[50];
            Object[] objArr2 = new Object[1];
            a(b2, (short) (b2 | 328), bArr[53], objArr2);
            int iIntValue = (-1676767495) - ((Integer) cls.getMethod((String) objArr2[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, 0, 0, 0)).intValue();
            Object[] objArr3 = new Object[1];
            a(bArr[9], bArr[176], bArr[77], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[27], (short) (ParcelableVolumeInfo & 376), bArr[24], objArr4);
            short sIntValue = (short) (((Integer) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr5 = new Object[1];
            a(bArr[9], bArr[176], bArr[77], objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a(bArr[27], (short) 363, bArr[53], objArr6);
            int iIntValue2 = (-1929146713) - (((Integer) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr7 = new Object[1];
            a(bArr[9], bArr[8], bArr[83], objArr7);
            Class<?> cls4 = Class.forName((String) objArr7[0]);
            byte b3 = bArr[23];
            Object[] objArr8 = new Object[1];
            a(b3, (short) (b3 | 178), bArr[36], objArr8);
            String str = (String) objArr8[0];
            char c = '3';
            Object[] objArr9 = new Object[1];
            a(bArr[51], bArr[381], bArr[83], objArr9);
            Object[] objArr10 = new Object[1];
            a(bArr[51], bArr[381], bArr[83], objArr10);
            byte bIntValue = (byte) ((Integer) cls4.getMethod(str, Class.forName((String) objArr9[0]), Class.forName((String) objArr10[0])).invoke(null, "", "")).intValue();
            Object[] objArr11 = {0, 0};
            byte b4 = bArr[9];
            Object[] objArr12 = new Object[1];
            a(b4, (short) (b4 | 329), bArr[113], objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            Object[] objArr13 = new Object[1];
            a(bArr[27], (short) 381, bArr[6], objArr13);
            int iIntValue3 = 1074625911 - ((Integer) cls5.getMethod((String) objArr13[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr11)).intValue();
            Object[] objArr14 = new Object[1];
            b(iIntValue, sIntValue, iIntValue2, bIntValue, iIntValue3, objArr14);
            String str2 = (String) objArr14[0];
            byte b5 = bArr[9];
            Object[] objArr15 = new Object[1];
            a(b5, (short) (b5 | 192), bArr[218], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(bArr[27], (short) 394, bArr[86], objArr16);
            String str3 = (String) objArr16[0];
            short s = (short) 263;
            Object[] objArr17 = new Object[1];
            a(bArr[51], s, bArr[50], objArr17);
            int iIntValue4 = ((Integer) cls6.getMethod(str3, Class.forName((String) objArr17[0])).invoke(null, "")).intValue() - 1676767601;
            Object[] objArr18 = new Object[1];
            a(bArr[9], bArr[8], bArr[83], objArr18);
            Class<?> cls7 = Class.forName((String) objArr18[0]);
            byte b6 = bArr[27];
            Object[] objArr19 = new Object[1];
            a(b6, (short) (b6 | 400), bArr[17], objArr19);
            String str4 = (String) objArr19[0];
            Object[] objArr20 = new Object[1];
            a(bArr[51], bArr[381], bArr[83], objArr20);
            short sIntValue2 = (short) ((Integer) cls7.getMethod(str4, Class.forName((String) objArr20[0]), Integer.TYPE, Integer.TYPE).invoke(null, "", 0, 0)).intValue();
            byte b7 = bArr[9];
            byte b8 = b7;
            Object[] objArr21 = new Object[1];
            a(b8, (short) (b8 | 416), b7, objArr21);
            Class<?> cls8 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            a(bArr[27], (short) 448, bArr[83], objArr22);
            int iIntValue5 = (-1929146713) - ((Integer) cls8.getMethod((String) objArr22[0], Long.TYPE).invoke(null, 0L)).intValue();
            byte b9 = bArr[9];
            Object[] objArr23 = new Object[1];
            a(b9, (short) (b9 | 192), bArr[218], objArr23);
            Class<?> cls9 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            a(bArr[24], (short) 469, bArr[34], objArr24);
            byte bIntValue2 = (byte) (((Integer) cls9.getMethod((String) objArr24[0], null).invoke(null, null)).intValue() >> 22);
            byte b10 = bArr[9];
            Object[] objArr25 = new Object[1];
            a(b10, (short) (b10 | 473), bArr[83], objArr25);
            Class<?> cls10 = Class.forName((String) objArr25[0]);
            byte b11 = bArr[7];
            Object[] objArr26 = new Object[1];
            a(b11, (short) (b11 | 492), bArr[140], objArr26);
            int i2 = (((Long) cls10.getMethod((String) objArr26[0], null).invoke(null, null)).longValue() > (-1L) ? 1 : (((Long) cls10.getMethod((String) objArr26[0], null).invoke(null, null)).longValue() == (-1L) ? 0 : -1)) + 1074625909;
            Object[] objArr27 = new Object[1];
            b(iIntValue4, sIntValue2, iIntValue5, bIntValue2, i2, objArr27);
            Object[] objArr28 = {(String) objArr27[0]};
            Object[] objArr29 = new Object[1];
            a(bArr[51], s, bArr[50], objArr29);
            Class<?> cls11 = Class.forName((String) objArr29[0]);
            byte b12 = bArr[4];
            Object[] objArr30 = new Object[1];
            a(b12, (short) (b12 | 260), bArr[34], objArr30);
            String str5 = (String) objArr30[0];
            Object[] objArr31 = new Object[1];
            a(bArr[51], s, bArr[50], objArr31);
            Object[] objArr32 = (Object[]) cls11.getMethod(str5, Class.forName((String) objArr31[0])).invoke(str2, objArr28);
            int[] iArr = new int[objArr32.length];
            int i3 = 0;
            while (i3 < objArr32.length) {
                Object[] objArr33 = {objArr32[i3]};
                byte[] bArr2 = PlaybackStateCompatCustomAction;
                short s2 = (short) 282;
                Object[] objArr34 = new Object[1];
                a(bArr2[c], s2, bArr2[113], objArr34);
                Class<?> cls12 = Class.forName((String) objArr34[0]);
                Object[] objArr35 = new Object[1];
                a(bArr2[88], (short) 298, bArr2[36], objArr35);
                String str6 = (String) objArr35[0];
                Object[] objArr36 = new Object[1];
                a(bArr2[c], s, bArr2[50], objArr36);
                Object objInvoke = cls12.getMethod(str6, Class.forName((String) objArr36[0])).invoke(null, objArr33);
                Object[] objArr37 = new Object[1];
                a(bArr2[51], s2, bArr2[113], objArr37);
                Class<?> cls13 = Class.forName((String) objArr37[0]);
                Object[] objArr38 = new Object[1];
                a(bArr2[23], (short) 304, bArr2[97], objArr38);
                iArr[i3] = ((Integer) cls13.getMethod((String) objArr38[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                c = '3';
            }
            while (true) {
                int i4 = i + 1;
                try {
                    switch (hastimeremaining.read(iArr[i])) {
                        case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                            i = 31;
                            break;
                        case -13:
                            try {
                                hastimeremaining.read(22);
                                i = hastimeremaining.IconCompatParcelizer != 0 ? 24 : 1;
                            } catch (Throwable th) {
                                th = th;
                                if (i >= 27 || i >= 31) {
                                    throw th;
                                }
                                hastimeremaining.read = th;
                                hastimeremaining.read(24);
                                i = 23;
                            }
                            break;
                        case -12:
                            hastimeremaining.serializer = 1;
                            hastimeremaining.read(1);
                            try {
                                hastimeremaining.read(2);
                                hastimeremaining.serializer = hastimeremaining.MediaDescriptionCompat.hashCode();
                                hastimeremaining.read(11);
                            } catch (Throwable th2) {
                                th = th2;
                                if (i >= 27) {
                                }
                                throw th;
                            }
                            break;
                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                            hastimeremaining.read(19);
                            throw ((Throwable) hastimeremaining.MediaDescriptionCompat);
                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                            i = 32;
                            break;
                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                            i = 34;
                            break;
                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                            hastimeremaining.read(17);
                            i = hastimeremaining.IconCompatParcelizer == 0 ? 22 : i4;
                            break;
                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                            hastimeremaining.serializer = 1;
                            hastimeremaining.read(1);
                            try {
                                hastimeremaining.read(16);
                                RemoteActionCompatParcelizer = hastimeremaining.IconCompatParcelizer;
                            } catch (Throwable th3) {
                                th = th3;
                                if (i >= 27) {
                                }
                                throw th;
                            }
                            break;
                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                            hastimeremaining.serializer = read;
                            hastimeremaining.read(11);
                            break;
                        case BaseCode.URI_IS_NULL /* -5 */:
                            hastimeremaining.read(10);
                            return hastimeremaining.RemoteActionCompatParcelizer;
                        case BaseCode.NO_SOLUTION /* -4 */:
                            i = 12;
                            break;
                        case -3:
                            i = 10;
                            break;
                        case -2:
                            hastimeremaining.serializer = 1;
                            hastimeremaining.read(1);
                            hastimeremaining.read(2);
                            hastimeremaining.write = ((LottieAnimatableImplanimate2) hastimeremaining.MediaDescriptionCompat).serializer();
                            try {
                                hastimeremaining.read(3);
                            } catch (Throwable th4) {
                                th = th4;
                                if (i >= 27) {
                                }
                                throw th;
                            }
                            break;
                        case -1:
                            i = 6;
                            break;
                        default:
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

    public static /* synthetic */ long serializer(LottieAnimatableImplanimate2 lottieAnimatableImplanimate2) throws Throwable {
        hasTimeRemaining hastimeremaining = new hasTimeRemaining(lottieAnimatableImplanimate2);
        try {
            byte[] bArr = PlaybackStateCompatCustomAction;
            Object[] objArr = new Object[1];
            a(bArr[9], bArr[8], bArr[83], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[83], bArr[86], bArr[17], objArr2);
            String str = (String) objArr2[0];
            Object[] objArr3 = new Object[1];
            a(bArr[51], bArr[381], bArr[83], objArr3);
            int iIntValue = ((Integer) cls.getMethod(str, Class.forName((String) objArr3[0]), Character.TYPE).invoke(null, "", '0')).intValue() - 1676767493;
            Object[] objArr4 = new Object[1];
            a(bArr[9], bArr[176], bArr[77], objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            byte b = bArr[27];
            int i = ParcelableVolumeInfo;
            Object[] objArr5 = new Object[1];
            a(b, (short) (i & 376), bArr[24], objArr5);
            short sIntValue = (short) (((Integer) cls2.getMethod((String) objArr5[0], null).invoke(null, null)).intValue() >> 16);
            try {
                Object[] objArr6 = {0, 0, 0};
                byte b2 = bArr[9];
                Object[] objArr7 = new Object[1];
                a(b2, (short) (b2 | 100), bArr[83], objArr7);
                Class<?> cls3 = Class.forName((String) objArr7[0]);
                byte b3 = bArr[50];
                Object[] objArr8 = new Object[1];
                a(b3, (short) (b3 | 104), bArr[381], objArr8);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6)).intValue() - 1912369605;
                try {
                    Object[] objArr9 = new Object[1];
                    a(bArr[9], bArr[176], bArr[77], objArr9);
                    Class<?> cls4 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    a(bArr[27], (short) 123, bArr[140], objArr10);
                    byte bIntValue = (byte) (((Integer) cls4.getMethod((String) objArr10[0], null).invoke(null, null)).intValue() >> 16);
                    try {
                        Object[] objArr11 = new Object[1];
                        a(bArr[9], bArr[176], bArr[77], objArr11);
                        Class<?> cls5 = Class.forName((String) objArr11[0]);
                        char c = 'q';
                        Object[] objArr12 = new Object[1];
                        a(bArr[27], (short) 145, bArr[113], objArr12);
                        int iIntValue3 = 1074625911 - (((Integer) cls5.getMethod((String) objArr12[0], null).invoke(null, null)).intValue() >> 16);
                        Object[] objArr13 = new Object[1];
                        b(iIntValue, sIntValue, iIntValue2, bIntValue, iIntValue3, objArr13);
                        String str2 = (String) objArr13[0];
                        Object[] objArr14 = new Object[1];
                        a(bArr[9], bArr[176], bArr[77], objArr14);
                        Class<?> cls6 = Class.forName((String) objArr14[0]);
                        Object[] objArr15 = new Object[1];
                        a(bArr[27], (short) 161, bArr[55], objArr15);
                        int iIntValue4 = (((Integer) cls6.getMethod((String) objArr15[0], null).invoke(null, null)).intValue() >> 24) - 1676767602;
                        try {
                            Object[] objArr16 = new Object[1];
                            a(bArr[9], bArr[8], bArr[83], objArr16);
                            Class<?> cls7 = Class.forName((String) objArr16[0]);
                            byte b4 = bArr[23];
                            Object[] objArr17 = new Object[1];
                            a(b4, (short) (b4 | 178), bArr[36], objArr17);
                            String str3 = (String) objArr17[0];
                            Object[] objArr18 = new Object[1];
                            a(bArr[51], bArr[381], bArr[83], objArr18);
                            Object[] objArr19 = new Object[1];
                            a(bArr[51], bArr[381], bArr[83], objArr19);
                            short sIntValue2 = (short) ((Integer) cls7.getMethod(str3, Class.forName((String) objArr18[0]), Class.forName((String) objArr19[0])).invoke(null, "", "")).intValue();
                            byte b5 = bArr[9];
                            Object[] objArr20 = new Object[1];
                            a(b5, (short) (b5 | 192), bArr[218], objArr20);
                            Class<?> cls8 = Class.forName((String) objArr20[0]);
                            Object[] objArr21 = new Object[1];
                            a(bArr[27], (short) (i - 5), bArr[113], objArr21);
                            int iIntValue5 = (-1929146713) - ((((Integer) cls8.getMethod((String) objArr21[0], Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6);
                            Object[] objArr22 = new Object[1];
                            a(bArr[9], bArr[176], bArr[77], objArr22);
                            Class<?> cls9 = Class.forName((String) objArr22[0]);
                            Object[] objArr23 = new Object[1];
                            a(bArr[27], (short) 225, bArr[140], objArr23);
                            byte bIntValue2 = (byte) (((Integer) cls9.getMethod((String) objArr23[0], null).invoke(null, null)).intValue() >> 16);
                            Object[] objArr24 = new Object[1];
                            a(bArr[9], bArr[176], bArr[77], objArr24);
                            Class<?> cls10 = Class.forName((String) objArr24[0]);
                            byte b6 = bArr[27];
                            Object[] objArr25 = new Object[1];
                            a(b6, (short) (b6 | 241), bArr[113], objArr25);
                            int iIntValue6 = (((Integer) cls10.getMethod((String) objArr25[0], null).invoke(null, null)).intValue() >> 16) + 1074625910;
                            Object[] objArr26 = new Object[1];
                            b(iIntValue4, sIntValue2, iIntValue5, bIntValue2, iIntValue6, objArr26);
                            Object[] objArr27 = {(String) objArr26[0]};
                            short s = (short) 263;
                            Object[] objArr28 = new Object[1];
                            a(bArr[51], s, bArr[50], objArr28);
                            Class<?> cls11 = Class.forName((String) objArr28[0]);
                            byte b7 = bArr[4];
                            Object[] objArr29 = new Object[1];
                            a(b7, (short) (b7 | 260), bArr[34], objArr29);
                            String str4 = (String) objArr29[0];
                            Object[] objArr30 = new Object[1];
                            a(bArr[51], s, bArr[50], objArr30);
                            Object[] objArr31 = (Object[]) cls11.getMethod(str4, Class.forName((String) objArr30[0])).invoke(str2, objArr27);
                            int[] iArr = new int[objArr31.length];
                            int i2 = 0;
                            while (i2 < objArr31.length) {
                                Object[] objArr32 = {objArr31[i2]};
                                byte[] bArr2 = PlaybackStateCompatCustomAction;
                                short s2 = (short) 282;
                                Object[] objArr33 = new Object[1];
                                a(bArr2[51], s2, bArr2[c], objArr33);
                                Class<?> cls12 = Class.forName((String) objArr33[0]);
                                Object[] objArr34 = new Object[1];
                                a(bArr2[88], (short) 298, bArr2[36], objArr34);
                                String str5 = (String) objArr34[0];
                                Object[] objArr35 = new Object[1];
                                a(bArr2[51], s, bArr2[50], objArr35);
                                Object objInvoke = cls12.getMethod(str5, Class.forName((String) objArr35[0])).invoke(null, objArr32);
                                Object[] objArr36 = new Object[1];
                                a(bArr2[51], s2, bArr2[113], objArr36);
                                Class<?> cls13 = Class.forName((String) objArr36[0]);
                                Object[] objArr37 = new Object[1];
                                a(bArr2[23], (short) 304, bArr2[97], objArr37);
                                iArr[i2] = ((Integer) cls13.getMethod((String) objArr37[0], null).invoke(objInvoke, null)).intValue();
                                i2++;
                                c = 'q';
                            }
                            int i3 = 0;
                            while (true) {
                                int i4 = i3 + 1;
                                try {
                                    switch (hastimeremaining.read(iArr[i3])) {
                                        case androidx.compose.ui.graphics.Float16.MinExponent /* -14 */:
                                            i3 = 30;
                                            break;
                                        case -13:
                                            i4 = 22;
                                            hastimeremaining.read(22);
                                            int i5 = hastimeremaining.IconCompatParcelizer;
                                            i3 = (i5 == 1 || i5 != 91) ? i4 : 1;
                                            break;
                                        case -12:
                                            hastimeremaining.serializer = 1;
                                            hastimeremaining.read(1);
                                            hastimeremaining.read(2);
                                            hastimeremaining.serializer = hastimeremaining.MediaDescriptionCompat.hashCode();
                                            hastimeremaining.read(11);
                                            break;
                                        case BaseCode.NOT_SUPPORT_RESOLUTION /* -11 */:
                                            hastimeremaining.read(19);
                                            throw ((Throwable) hastimeremaining.MediaDescriptionCompat);
                                        case BaseCode.KPMS_UPDATE_FAILED /* -10 */:
                                            i3 = 31;
                                            break;
                                        case BaseCode.NO_AVAILABLE_LIB_ERROR /* -9 */:
                                            i3 = 33;
                                            break;
                                        case BaseCode.SOLUTION_GET_RESPONSE_CODE_ERROR /* -8 */:
                                            hastimeremaining.read(17);
                                            if (hastimeremaining.IconCompatParcelizer == 0) {
                                                i4 = 20;
                                            }
                                            break;
                                        case BaseCode.DATA_NULL_IN_INTENT /* -7 */:
                                            hastimeremaining.serializer = 1;
                                            hastimeremaining.read(1);
                                            hastimeremaining.read(16);
                                            RemoteActionCompatParcelizer = hastimeremaining.IconCompatParcelizer;
                                            break;
                                        case BaseCode.TRANSACTION_IS_NULL /* -6 */:
                                            hastimeremaining.serializer = read;
                                            hastimeremaining.read(11);
                                            break;
                                        case BaseCode.URI_IS_NULL /* -5 */:
                                            hastimeremaining.read(10);
                                            return hastimeremaining.RemoteActionCompatParcelizer;
                                        case BaseCode.NO_SOLUTION /* -4 */:
                                            i3 = 11;
                                            break;
                                        case -3:
                                            i3 = 9;
                                            break;
                                        case -2:
                                            hastimeremaining.serializer = 1;
                                            hastimeremaining.read(1);
                                            hastimeremaining.read(2);
                                            hastimeremaining.write = RemoteActionCompatParcelizer((LottieAnimatableImplanimate2) hastimeremaining.MediaDescriptionCompat);
                                            try {
                                                hastimeremaining.read(3);
                                            } catch (Throwable th) {
                                                th = th;
                                                byte[] bArr3 = PlaybackStateCompatCustomAction;
                                                short s3 = (short) 311;
                                                Object[] objArr38 = new Object[1];
                                                a(bArr3[51], s3, bArr3[53], objArr38);
                                                if (!Class.forName((String) objArr38[0]).isInstance(th) || i3 < 2 || i3 >= 6) {
                                                    Object[] objArr39 = new Object[1];
                                                    a(bArr3[51], s3, bArr3[53], objArr39);
                                                    if (!Class.forName((String) objArr39[0]).isInstance(th) || i3 < 11 || i3 >= 21) {
                                                        Object[] objArr40 = new Object[1];
                                                        a(bArr3[51], s3, bArr3[53], objArr40);
                                                        if (Class.forName((String) objArr40[0]).isInstance(th) && i3 >= 16 && i3 < 21) {
                                                            i3 = 36;
                                                        } else {
                                                            if (i3 < 26 || i3 >= 30) {
                                                                throw th;
                                                            }
                                                            i3 = 21;
                                                        }
                                                    } else {
                                                        i3 = 36;
                                                    }
                                                    hastimeremaining.read = th;
                                                    hastimeremaining.read(24);
                                                } else {
                                                    i3 = 35;
                                                }
                                                hastimeremaining.read = th;
                                                hastimeremaining.read(24);
                                            }
                                            break;
                                        case -1:
                                            i3 = 6;
                                            break;
                                        default:
                                            break;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } catch (Throwable th3) {
                            Throwable cause = th3.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        Throwable cause2 = th4.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th4;
                    }
                } catch (Throwable th5) {
                    Throwable cause3 = th5.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th5;
                }
            } catch (Throwable th6) {
                Throwable cause4 = th6.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th6;
            }
        } catch (Throwable th7) {
            Throwable cause5 = th7.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th7;
        }
    }
}
