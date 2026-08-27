package o;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.ExpandableListView;
import com.huawei.hms.location.LocationRequest;
import com.mapbox.common.LogConfiguration;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class invalidateConsumersOfNodeForKey implements dataAvailable {
    private static short[] MediaDescriptionCompat;
    public final /* synthetic */ int read;
    private static final byte[] $$c = {30, -11, 99, -67};
    private static final int $$d = 225;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {64, 25, 20, 54, 8, -1, -8};
    private static final int $$b = 171;
    private static int MediaSessionCompatQueueItem = 0;
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer = -1849589064;
    private static int serializer = 459299221;
    private static int IconCompatParcelizer = 1947301175;
    private static byte[] write = {15, 1, -31, 14, 7, -16, 15, -36, 33, -3, 14, -16, 2, -29, 13, -47, 33, -6, -18, 29, -29, 17, -16, 30, -62, 49, -32, -54, 60, 26, -26, 22, -24, -21, 9, -45, 50, -36, 0, 55, -102, 37, 96, -21, -38, -37, -36, 47, -41, 44, 31, 16, 16, -3, -20, 7, -7, 20, 27, -31, 18, -17, 0, 38, -38, -21, 23, 20, 16, -3, -20, 87, -38, -32, 1, -17, 19, 39, -47, 21, -27, -18, 31, -24, 46, -82, -24, 20, 86, -18, -18, 125, 123, -120, -125, 113, -117, -124, 120, -128, -128, 109, 124, -116, -75, 65, -123, 117, 126, -113, 120, -66, 62, 120, -124, -58, 78, 118, 127, -128, -61, 1, -18, 6, 7, -5, -8, -4, 17, 0, -69, 54, 7, -5, -8, -4, 17, 0, -69, 54, 12, -19, 3, -1, -53, 61, -7, 9, 2, -13, 4, -62, 66, 4, -8, -70, -108, -108, -108, -108, -108, -108, -108, -108};

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r7, byte r8, int r9) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r0 = o.invalidateConsumersOfNodeForKey.$$c
            int r9 = r9 + 4
            int r7 = 115 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r4 = r2
            goto L28
        L13:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r7]
        L28:
            int r3 = -r3
            int r9 = r9 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.invalidateConsumersOfNodeForKey.$$e(short, byte, int):java.lang.String");
    }

    private static void b(short s, int i, int i2, Object[] objArr) {
        int i3 = 4 - (s * 3);
        int i4 = i2 * 3;
        int i5 = (i * 4) + 114;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 4];
        int i6 = i4 + 3;
        int i7 = -1;
        if (bArr == null) {
            int i8 = i6 + (-i3);
            i3++;
            i5 = i8 - 5;
            i7 = -1;
        }
        while (true) {
            int i9 = i7 + 1;
            bArr2[i9] = (byte) i5;
            if (i9 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i10 = i5;
            int i11 = i3;
            int i12 = i10 + (-bArr[i3]);
            i3 = i11 + 1;
            i5 = i12 - 5;
            i7 = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return o.insertedProvider.forNumber(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r3.read != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r3.read != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r4 = o.setUsedByModifierLayoutui.forNumber(r4);
        r1 = o.invalidateConsumersOfNodeForKey.MediaMetadataCompat + 59;
        o.invalidateConsumersOfNodeForKey.MediaSessionCompatQueueItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    @Override // o.dataAvailable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ifDebug IconCompatParcelizer(int r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.invalidateConsumersOfNodeForKey.MediaSessionCompatQueueItem
            int r1 = r1 + 79
            int r2 = r1 % 128
            o.invalidateConsumersOfNodeForKey.MediaMetadataCompat = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            int r1 = r3.read
            r2 = 73
            int r2 = r2 / 0
            if (r1 == 0) goto L29
            goto L1b
        L17:
            int r1 = r3.read
            if (r1 == 0) goto L29
        L1b:
            o.setUsedByModifierLayoutui r4 = o.setUsedByModifierLayoutui.forNumber(r4)
            int r1 = o.invalidateConsumersOfNodeForKey.MediaMetadataCompat
            int r1 = r1 + 59
            int r2 = r1 % 128
            o.invalidateConsumersOfNodeForKey.MediaSessionCompatQueueItem = r2
            int r1 = r1 % r0
            return r4
        L29:
            o.insertedProvider r4 = o.insertedProvider.forNumber(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.invalidateConsumersOfNodeForKey.IconCompatParcelizer(int):o.ifDebug");
    }

    private static void a(byte b, int i, short s, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        toViewVelocity toviewvelocity = new toViewVelocity();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(serializer)};
            Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1745204208);
            if (objRemoteActionCompatParcelizer == null) {
                char cResolveSize = (char) (15495 - View.resolveSize(0, 0));
                int iResolveOpacity = 2821 - Drawable.resolveOpacity(0, 0);
                int pressedStateDuration = 17 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16);
                byte b2 = (byte) ($$d & 7);
                byte b3 = (byte) (b2 - 1);
                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cResolveSize, iResolveOpacity, pressedStateDuration, 1193962993, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            float f = 0.0f;
            if (!(!z)) {
                byte[] bArr = write;
                char c = '0';
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                        Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-748751776);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            char mirror = (char) (4501 - AndroidCharacter.getMirror(c));
                            int i8 = (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 2483;
                            int i9 = (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 17;
                            byte b4 = (byte) i5;
                            byte b5 = (byte) (b4 - 2);
                            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(mirror, i8, i9, 59692417, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i7] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i7++;
                        int i10 = $10 + 121;
                        $11 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        i5 = 2;
                        c = '0';
                        f = 0.0f;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = write;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(RemoteActionCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1745204208);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        char cIndexOf = (char) (15494 - TextUtils.indexOf((CharSequence) "", '0'));
                        int size = 2821 - View.MeasureSpec.getSize(0);
                        int minimumFlingVelocity = (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17;
                        byte b6 = (byte) ($$d & 7);
                        byte b7 = (byte) (b6 - 1);
                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cIndexOf, size, minimumFlingVelocity, 1193962993, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ (-565326573115254380L))) + ((int) (((long) serializer) ^ (-565326573115254380L))));
                    j = -565326573115254380L;
                } else {
                    j = -565326573115254380L;
                    iIntValue = (short) (((short) (((long) MediaDescriptionCompat[i + ((int) (((long) RemoteActionCompatParcelizer) ^ (-565326573115254380L)))]) ^ (-565326573115254380L))) + ((int) (((long) serializer) ^ (-565326573115254380L))));
                }
            } else {
                j = -565326573115254380L;
            }
            if (iIntValue > 0) {
                int i12 = ((i + iIntValue) - 2) + ((int) (((long) RemoteActionCompatParcelizer) ^ j));
                if (z) {
                    int i13 = $10 + 117;
                    $11 = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                toviewvelocity.RemoteActionCompatParcelizer = i12 + i4;
                Object[] objArr5 = {toviewvelocity, Integer.valueOf(i3), Integer.valueOf(IconCompatParcelizer), sb};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1760519764);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2411 - ExpandableListView.getPackedPositionGroup(0L), 15 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 1203812429, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(toviewvelocity.serializer);
                toviewvelocity.IconCompatParcelizer = toviewvelocity.serializer;
                byte[] bArr4 = write;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i15 = 0; i15 < length2; i15++) {
                        bArr5[i15] = (byte) (((long) bArr4[i15]) ^ (-565326573115254380L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                toviewvelocity.read = 1;
                while (toviewvelocity.read < iIntValue) {
                    if (z2) {
                        int i16 = $11 + 109;
                        $10 = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                        byte[] bArr6 = write;
                        int i18 = toviewvelocity.RemoteActionCompatParcelizer;
                        toviewvelocity.RemoteActionCompatParcelizer = i18 - 1;
                        toviewvelocity.serializer = (char) (toviewvelocity.IconCompatParcelizer + (((byte) (((byte) (((long) bArr6[i18]) ^ (-565326573115254380L))) + s)) ^ b));
                    } else {
                        short[] sArr = MediaDescriptionCompat;
                        int i19 = toviewvelocity.RemoteActionCompatParcelizer;
                        toviewvelocity.RemoteActionCompatParcelizer = i19 - 1;
                        toviewvelocity.serializer = (char) (toviewvelocity.IconCompatParcelizer + (((short) (((short) (((long) sArr[i19]) ^ (-565326573115254380L))) + s)) ^ b));
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

    /* JADX WARN: Code duplicated, block: B:109:0x07f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0714  */
    /* JADX WARN: Code duplicated, block: B:49:0x0716 A[Catch: Exception -> 0x0a87, TRY_LEAVE, TryCatch #5 {Exception -> 0x0a87, blocks: (B:46:0x05e2, B:49:0x0716, B:53:0x07ed, B:87:0x0a80, B:88:0x0a86, B:50:0x0720, B:52:0x07c6), top: B:110:0x05e2, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:58:0x08d6 A[Catch: Exception -> 0x0a37, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0a37, blocks: (B:55:0x07f5, B:58:0x08d6, B:74:0x0a0e, B:80:0x0a30, B:81:0x0a36, B:59:0x08e0, B:61:0x08f7, B:65:0x0965, B:67:0x0989, B:69:0x09e5, B:73:0x09ff, B:77:0x0a1f, B:66:0x096a), top: B:109:0x07f5, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0946  */
    /* JADX WARN: Code duplicated, block: B:66:0x096a A[Catch: all -> 0x0a2f, TryCatch #7 {all -> 0x0a2f, blocks: (B:59:0x08e0, B:61:0x08f7, B:65:0x0965, B:67:0x0989, B:69:0x09e5, B:73:0x09ff, B:77:0x0a1f, B:66:0x096a), top: B:113:0x08e0, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x09fb  */
    /* JADX WARN: Code duplicated, block: B:76:0x0a15  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v139 */
    /* JADX WARN: Type inference failed for: r7v100 */
    /* JADX WARN: Type inference failed for: r7v101 */
    /* JADX WARN: Type inference failed for: r7v115 */
    /* JADX WARN: Type inference failed for: r7v125, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v184 */
    /* JADX WARN: Type inference failed for: r7v185 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.CharSequence] */
    public static Object[] serializer(int i, int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        ?? r7;
        String line;
        char c;
        Object[] objArr;
        File file;
        int i6;
        FileReader fileReader;
        BufferedReader bufferedReader;
        boolean zEquals;
        boolean zEquals2;
        File file2;
        FileReader fileReader2;
        BufferedReader bufferedReader2;
        String line2;
        int i7;
        int iIconCompatParcelizer;
        int i8;
        int i9;
        int i10;
        byte b;
        int i11;
        int defaultSize;
        short edgeSlop;
        int i12;
        int tapTimeout;
        int i13;
        ?? r8;
        int i14 = 2 % 2;
        int i15 = MediaSessionCompatQueueItem + 9;
        MediaMetadataCompat = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i16 = i15 % 2;
        try {
            String[] strArr = new String[2];
            byte b2 = (byte) (99 - (~android.view.KeyEvent.getDeadChar(0, 0)));
            int iAlpha = android.graphics.Color.alpha(0);
            int i17 = iAlpha * 714;
            int i18 = (i17 & (-1842769312)) + (i17 | (-1842769312));
            int i19 = ~iAlpha;
            int i20 = ~i;
            int i21 = ~(i19 | i20);
            int i22 = ~((i19 ^ 1969104084) | (i19 & 1969104084));
            int i23 = (i21 ^ i22) | (i21 & i22);
            int i24 = ((-1969104085) ^ iAlpha) | ((-1969104085) & iAlpha);
            int i25 = ~((i24 ^ i) | (i24 & i));
            int i26 = ((i23 & i25) | (i23 ^ i25)) * (-713);
            int i27 = ((i18 | i26) << 1) - (i18 ^ i26);
            int i28 = MediaSessionCompatQueueItem;
            int i29 = ((i28 | 3) << 1) - (i28 ^ 3);
            MediaMetadataCompat = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i30 = i29 % 2;
            int i31 = (-1969104085) | iAlpha;
            int i32 = i27 + (1426 * (~((i31 & i) | (i31 ^ i))));
            int i33 = ~i;
            int i34 = (~(((-1969104085) ^ i33) | ((-1969104085) & i33))) * 713;
            int i35 = ((i32 | i34) << 1) - (i32 ^ i34);
            short sResolveSizeAndState = (short) View.resolveSizeAndState(0, 0, 0);
            int modifierMetaStateMask = 17 - ((byte) android.view.KeyEvent.getModifierMetaStateMask());
            int i36 = -TextUtils.indexOf("", "", 0);
            int i37 = (i36 ^ (-1869687866)) + ((i36 & (-1869687866)) << 1);
            Object[] objArr2 = new Object[1];
            a(b2, i35, sResolveSizeAndState, modifierMetaStateMask, i37, objArr2);
            strArr[0] = (String) objArr2[0];
            int i38 = MediaMetadataCompat + 41;
            MediaSessionCompatQueueItem = i38 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i39 = i38 % 2;
            byte bLastIndexOf = (byte) (118 - TextUtils.lastIndexOf("", '0', 0));
            int threadPriority = Process.getThreadPriority(0);
            int i40 = -(((threadPriority & 20) + (threadPriority | 20)) >> 6);
            int iIconCompatParcelizer2 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
            int i41 = i40 * (-344);
            int i42 = ((i41 | 1233021680) << 1) - (i41 ^ 1233021680);
            int i43 = ~i40;
            int i44 = ~((i43 ^ (-1969104103)) | (i43 & (-1969104103)));
            int i45 = ~i40;
            int i46 = (i42 - (~(-(-((i44 | (~((i45 ^ iIconCompatParcelizer2) | (i45 & iIconCompatParcelizer2)))) * 345))))) - 1;
            int i47 = ~((~iIconCompatParcelizer2) | i43);
            int i48 = ~(((-1969104103) ^ i40) | (i40 & (-1969104103)));
            int i49 = (i46 - (~(-(-(((i48 & i47) | (i47 ^ i48)) * 345))))) - 1;
            int i50 = MediaMetadataCompat;
            int i51 = (i50 ^ 89) + ((i50 & 89) << 1);
            MediaSessionCompatQueueItem = i51 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i52 = i51 % 2;
            int i53 = 345 * (~((i45 & (-1969104103)) | (i45 ^ (-1969104103)) | iIconCompatParcelizer2));
            int i54 = ((i49 | i53) << 1) - (i49 ^ i53);
            short sAlpha = (short) android.graphics.Color.alpha(0);
            int i55 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int iIconCompatParcelizer3 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
            int i56 = i55 * 615;
            int i57 = (i56 ^ (-9808)) + ((i56 & (-9808)) << 1);
            int i58 = ~i55;
            int i59 = MediaSessionCompatQueueItem;
            int i60 = (i59 ^ 115) + ((i59 & 115) << 1);
            MediaMetadataCompat = i60 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i61 = i60 % 2;
            int i62 = ~((i58 ^ 16) | (i58 & 16));
            int i63 = (iIconCompatParcelizer3 ^ i62) | (iIconCompatParcelizer3 & i62);
            int i64 = ~(((-17) ^ i55) | ((-17) & i55));
            int i65 = -(-(((i63 ^ i64) | (i64 & i63)) * 614));
            int i66 = (i57 & i65) + (i65 | i57);
            int i67 = ~i55;
            int i68 = ~iIconCompatParcelizer3;
            int i69 = ~(i67 | i68);
            int i70 = (i69 ^ i62) | (i62 & i69);
            int i71 = ~(i68 | 16);
            int i72 = -(-(((i70 & i71) | (i70 ^ i71)) * (-1228)));
            int i73 = ((i66 | i72) << 1) - (i72 ^ i66);
            int i74 = i59 + 121;
            MediaMetadataCompat = i74 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i75 = i74 % 2;
            int i76 = (i58 ^ (-17)) | (i58 & (-17));
            int i77 = ~iIconCompatParcelizer3;
            int i78 = (i55 & i77) | (i77 ^ i55);
            int i79 = i73 + (((~((i76 & i77) | (i76 ^ i77))) | (~((i78 & 16) | (i78 ^ 16)))) * 614);
            int packedPositionType = ExpandableListView.getPackedPositionType(0L);
            int i80 = (packedPositionType ^ (-1869687852)) + ((packedPositionType & (-1869687852)) << 1);
            Object[] objArr3 = new Object[1];
            a(bLastIndexOf, i54, sAlpha, i79, i80, objArr3);
            int i81 = 0;
            strArr[1] = (String) objArr3[0];
            int i82 = 0;
            while (true) {
                if (i82 >= 2) {
                    i5 = i;
                    break;
                }
                String str = strArr[i82];
                byte bRgb = (byte) ((-16777291) - android.graphics.Color.rgb(i81, i81, i81));
                int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop() >> 8;
                int iIconCompatParcelizer4 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                int i83 = windowTouchSlop * (-337);
                int i84 = (i83 ^ 1806365461) + ((i83 & 1806365461) << 1);
                int i85 = ~windowTouchSlop;
                int i86 = ~iIconCompatParcelizer4;
                int i87 = ~((i86 & i85) | (i85 ^ i86));
                int i88 = ~(((-1969104120) & windowTouchSlop) | ((-1969104120) ^ windowTouchSlop));
                int i89 = -(-(((i87 & i88) | (i87 ^ i88) | (~((windowTouchSlop ^ iIconCompatParcelizer4) | (windowTouchSlop & iIconCompatParcelizer4)))) * (-338)));
                int i90 = (((i84 | i89) << 1) - (i89 ^ i84)) + ((~((i85 ^ 1969104119) | (i85 & 1969104119))) * 338);
                int i91 = (windowTouchSlop & 1969104119) | (windowTouchSlop ^ 1969104119);
                int i92 = ((~((i91 & iIconCompatParcelizer4) | (i91 ^ iIconCompatParcelizer4))) | (~(i85 | (~iIconCompatParcelizer4)))) * 338;
                int i93 = (i90 ^ i92) + ((i92 & i90) << 1);
                short keyRepeatTimeout = (short) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i94 = -View.getDefaultSize(0, 0);
                int iIconCompatParcelizer5 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                int i95 = i94 * (-751);
                int i96 = ((i95 | (-11265)) << 1) - (i95 ^ (-11265));
                int i97 = ~i94;
                int i98 = ~((i97 ^ (-16)) | (i97 & (-16)));
                int i99 = ~i94;
                String[] strArr2 = strArr;
                int i100 = ~((i99 ^ iIconCompatParcelizer5) | (i99 & iIconCompatParcelizer5));
                int i101 = ((i98 ^ i100) | (i100 & i98)) * 1504;
                int i102 = (i96 ^ i101) + ((i101 & i96) << 1);
                int i103 = -(-((~(i99 | 15 | iIconCompatParcelizer5)) * (-1504)));
                int i104 = (i102 ^ i103) + ((i103 & i102) << 1);
                int i105 = ~((i97 ^ 15) | (i97 & 15));
                int i106 = ~((i94 & (-16)) | ((-16) ^ i94));
                int i107 = i104 + (((i105 & i106) | (i105 ^ i106)) * 752);
                int i108 = -View.resolveSizeAndState(0, 0, 0);
                int i109 = (i108 * (-209)) - 77258270;
                int i110 = ~i108;
                int i111 = (~((i110 ^ 1869687873) | (i110 & 1869687873))) * 210;
                int i112 = (i109 & i111) + (i109 | i111);
                int i113 = ~(1869687873 | i33);
                int i114 = ~(i110 | i);
                int i115 = (i112 - (~(((i113 & i114) | (i113 ^ i114)) * 210))) - 1;
                int i116 = ~i108;
                int i117 = (i116 & i33) | (i116 ^ i33);
                int i118 = (i108 & 1869687873) | (1869687873 ^ i108);
                int i119 = ((~((i118 & i) | (i118 ^ i))) | (~((i117 & (-1869687874)) | (i117 ^ (-1869687874))))) * 210;
                int i120 = (i115 ^ i119) + ((i119 & i115) << 1);
                Object[] objArr4 = new Object[1];
                a(bRgb, i93, keyRepeatTimeout, i107, i120, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                if (!(!((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue())) {
                    i3 = i & (-2);
                    i4 = i20 & 1;
                    i5 = i3 | i4;
                    break;
                }
                int i121 = (i82 ^ 77) + ((i82 & 77) << 1);
                i82 = ((i121 | (-76)) << 1) - (i121 ^ (-76));
                strArr = strArr2;
                i81 = 0;
            }
        } catch (Exception unused) {
            i3 = i & (-3);
            i4 = (~i) & 2;
        }
        try {
            Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(2102551967);
            if (objRemoteActionCompatParcelizer == null) {
                char cRed = (char) android.graphics.Color.red(0);
                int fadingEdgeLength = (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 543;
                int iCombineMeasuredStates = 35 - View.combineMeasuredStates(0, 0);
                byte b3 = (byte) ($$a[5] + 1);
                byte b4 = b3;
                Object[] objArr5 = new Object[1];
                b(b3, b4, b4, objArr5);
                objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cRed, fadingEdgeLength, iCombineMeasuredStates, -1383971714, false, (String) objArr5[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, null)).longValue();
            long j = -1658316434;
            long j2 = (((long) 450) * j) + (((long) (-448)) * jLongValue);
            long j3 = 449;
            long j4 = -1;
            long j5 = ((j ^ j4) | jLongValue) ^ j4;
            long j6 = jLongValue ^ j4;
            long jMyPid = Process.myPid();
            int i122 = i5;
            long j7 = j2 + ((j5 | (((j6 | j) | jMyPid) ^ j4)) * j3) + (((long) (-1347)) * j5) + (j3 * (((((jMyPid ^ j4) | j6) | j) ^ j4) | j5)) + ((long) (-485033404));
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i123 = ~iFreeMemory;
            int i124 = ((int) (j7 >> 32)) & (((((~(i123 | 1286306337)) | ((~((-150920074) | i123)) | 5538184)) * (-397)) - 538213366) + ((iFreeMemory | 1146462632) * 397));
            int i125 = ~i;
            int i126 = ((int) j7) & ((((((~(1351142138 | i125)) | (~(86084271 | i))) | (~(i125 | (-86084272)))) * 959) - 1855642860) + (((~(1351142138 | i)) | (~(86084271 | i125)) | (~((-86084272) | i))) * 959));
            int i127 = (i124 & i126) | (i124 ^ i126);
            int i128 = (i127 & (-2)) | ((~i127) & 1);
            int i129 = MediaMetadataCompat + 39;
            MediaSessionCompatQueueItem = i129 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i130 = i129 % 2;
            int i131 = -i128;
            int i132 = ((i128 & i131) | (i128 ^ i131)) >> 31;
            int i133 = (i ^ 10) & (~i132);
            int i134 = i132 & i;
            int i135 = (i134 & i133) | (i133 ^ i134);
            int i136 = i ^ i122;
            int i137 = -i136;
            int i138 = ((i136 & i137) | (i136 ^ i137)) >> 31;
            int i139 = i135 & (~i138);
            int i140 = i122 & i138;
            int i141 = (i139 ^ i140) | (i139 & i140);
            try {
                int i142 = -(Process.myPid() >> 22);
                int i143 = i142 * (-159);
                int i144 = (i143 ^ 19398) + ((i143 & 19398) << 1);
                int i145 = ~i142;
                int i146 = ((i145 & (-122)) | (i145 ^ (-122))) * 160;
                int i147 = (i144 & i146) + (i146 | i144) + (((~((i125 ^ i142) | (i125 & i142))) | (~((i142 ^ (-122)) | (i142 & (-122))))) * (-160));
                int i148 = ~(121 | i125);
                byte b5 = (byte) ((i147 - (~(((i142 & i148) | (i142 ^ i148)) * 160))) - 1);
                int i149 = -(android.view.ViewConfiguration.getEdgeSlop() >> 16);
                int iIconCompatParcelizer6 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                int i150 = i149 * 141;
                int i151 = (i150 ^ 1172432318) + ((i150 & 1172432318) << 1);
                int i152 = ~i149;
                int i153 = ~(i152 | 1969104134);
                int i154 = ~((i152 ^ iIconCompatParcelizer6) | (i152 & iIconCompatParcelizer6));
                int i155 = ((i153 & i154) | (i153 ^ i154)) * (-280);
                int i156 = (i151 ^ i155) + ((i151 & i155) << 1);
                int i157 = -(-(((~(((-1969104135) ^ iIconCompatParcelizer6) | ((-1969104135) & iIconCompatParcelizer6))) | i154) * 140));
                int i158 = (i156 & i157) + (i157 | i156);
                int i159 = (i152 & (-1969104135)) | (i152 ^ (-1969104135));
                int i160 = ~((i159 & iIconCompatParcelizer6) | (i159 ^ iIconCompatParcelizer6));
                int i161 = ~i149;
                int i162 = ~iIconCompatParcelizer6;
                int i163 = (i161 & i162) | (i161 ^ i162);
                int i164 = ~((1969104134 & i163) | (i163 ^ 1969104134));
                int i165 = (i160 & i164) | (i160 ^ i164);
                int i166 = ~iIconCompatParcelizer6;
                r8 = (-1969104135) ^ i166;
                int i167 = -(-(((~(i149 | (((i166 & (-1969104135)) | r8) == true ? 1 : 0))) | i165) * 140));
                Object[] objArr6 = new Object[1];
                a(b5, (i158 ^ i167) + ((i167 & i158) << 1), (short) ExpandableListView.getPackedPositionType(0L), 39 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (-1869687925) - (~(-View.combineMeasuredStates(0, 0))), objArr6);
                File file3 = new File((String) objArr6[0]);
                try {
                    if (file3.canRead()) {
                        try {
                            FileReader fileReader3 = new FileReader(file3);
                            BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                            try {
                                line = bufferedReader3.readLine();
                                byte b6 = (byte) (122 - (~(-(-android.graphics.Color.blue(0)))));
                                int iRgb = android.graphics.Color.rgb(0, 0, 0);
                                int iIconCompatParcelizer7 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                                int i168 = (iRgb * 375) - 1689680463;
                                int i169 = ~((~iRgb) | 1985881389);
                                int i170 = ~iIconCompatParcelizer7;
                                int i171 = ~((i170 & iRgb) | (i170 ^ iRgb));
                                int i172 = ((i169 & i171) | (i169 ^ i171)) * (-374);
                                int i173 = (((i168 & i172) + (i168 | i172)) - (~(-(-((~((-1985881390) | iRgb)) * 748))))) - 1;
                                int i174 = ~iRgb;
                                int i175 = ~(((-1985881390) & i174) | (i174 ^ (-1985881390)));
                                int i176 = ~iIconCompatParcelizer7;
                                int i177 = ~((iRgb & i176) | (i176 ^ iRgb));
                                int i178 = -(-(((i177 & i175) | (i175 ^ i177)) * 374));
                                int i179 = (i173 & i178) + (i178 | i173);
                                short maxKeyCode = (short) (android.view.KeyEvent.getMaxKeyCode() >> 16);
                                int i180 = -(-android.view.KeyEvent.normalizeMetaState(0));
                                r8 = "";
                                try {
                                    Object[] objArr7 = new Object[1];
                                    a(b6, i179, maxKeyCode, ((i180 | 2) << 1) - (i180 ^ 2), (-1869687861) - TextUtils.indexOf((CharSequence) r8, (CharSequence) r8), objArr7);
                                    if (line.equals((String) objArr7[0])) {
                                        fileReader3.close();
                                        bufferedReader3.close();
                                    } else {
                                        int i181 = MediaSessionCompatQueueItem;
                                        int i182 = (i181 ^ 15) + ((i181 & 15) << 1);
                                        MediaMetadataCompat = i182 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i183 = i182 % 2;
                                        fileReader3.close();
                                        bufferedReader3.close();
                                        r7 = r8;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Exception unused2) {
                        }
                        byte mirror = (byte) (AndroidCharacter.getMirror('0') - 26);
                        int edgeSlop2 = android.view.ViewConfiguration.getEdgeSlop() >> 16;
                        int iIconCompatParcelizer8 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                        int i184 = edgeSlop2 * 398;
                        int i185 = (i184 ^ 1918794572) + ((i184 & 1918794572) << 1);
                        int i186 = ~edgeSlop2;
                        int i187 = ~iIconCompatParcelizer8;
                        int i188 = ~((i186 ^ i187) | (i186 & i187));
                        int i189 = ~(i186 | 1969104175);
                        int i190 = (i188 ^ i189) | (i188 & i189);
                        int i191 = ~((i187 & 1969104175) | (i187 ^ 1969104175));
                        int i192 = i185 + (((i191 & i190) | (i190 ^ i191)) * (-397));
                        int i193 = -(-((~((i186 & 1969104175) | (i186 ^ 1969104175))) * (-397)));
                        int i194 = (i192 & i193) + (i193 | i192);
                        int i195 = ~edgeSlop2;
                        int i196 = ~((i195 & 1969104175) | (i195 ^ 1969104175));
                        int i197 = (iIconCompatParcelizer8 & i196) | (iIconCompatParcelizer8 ^ i196);
                        int i198 = ~((edgeSlop2 & (-1969104176)) | ((-1969104176) ^ edgeSlop2));
                        int i199 = i194 + (((i198 & i197) | (i197 ^ i198)) * 397);
                        short sResolveSize = (short) View.resolveSize(0, 0);
                        int iIndexOf = TextUtils.indexOf((CharSequence) r7, '0');
                        int i200 = iIndexOf * 1773;
                        int i201 = (i200 ^ (-27435)) + ((i200 & (-27435)) << 1);
                        int i202 = ~iIndexOf;
                        int i203 = (~((i202 & (-32)) | (i202 ^ (-32)))) | (~((-32) | i));
                        i6 = ~i;
                        int i204 = i6 | iIndexOf;
                        int i205 = ~((i204 & 31) | (i204 ^ 31));
                        int i206 = ((i203 & i205) | (i203 ^ i205)) * 886;
                        int i207 = ((i201 | i206) << 1) - (i206 ^ i201);
                        int i208 = ~(i125 | 31);
                        int i209 = ((i208 & iIndexOf) | (iIndexOf ^ i208)) * (-1772);
                        int i210 = (((i207 & i209) + (i209 | i207)) - (~(-(-((~((i6 ^ iIndexOf) | (iIndexOf & i6))) * 886))))) - 1;
                        int i211 = -TextUtils.indexOf((CharSequence) r7, '0', 0, 0);
                        int i212 = i211 * (-523);
                        int i213 = (i212 & (-2101652531)) + (i212 | (-2101652531));
                        int i214 = ~i211;
                        int i215 = ~((i214 ^ (-1869687925)) | (i214 & (-1869687925)));
                        int i216 = ~(1869687924 | i211);
                        int i217 = i215 | i216;
                        int i218 = ~((1869687924 ^ i) | (1869687924 & i));
                        int i219 = ((i217 ^ i218) | (i217 & i218)) * 262;
                        int i220 = (i213 & i219) + (i219 | i213);
                        int i221 = (~((1869687924 & i211) | (1869687924 ^ i211))) * (-786);
                        int i222 = ((i220 | i221) << 1) - (i221 ^ i220);
                        int i223 = ~((1869687924 ^ i125) | (1869687924 & i125));
                        int i224 = ~i211;
                        int i225 = ~((i224 ^ (-1869687925)) | (i224 & (-1869687925)));
                        int i226 = (i225 & i223) | (i223 ^ i225);
                        int i227 = (i222 - (~(-(-(((i216 & i226) | (i226 ^ i216)) * 262))))) - 1;
                        Object[] objArr8 = new Object[1];
                        a(mirror, i199, sResolveSize, i210, i227, objArr8);
                        file = new File((String) objArr8[0]);
                        if (!file.canRead()) {
                            fileReader = new FileReader(file);
                            bufferedReader = new BufferedReader(fileReader);
                            try {
                                String line3 = bufferedReader.readLine();
                                int i228 = -(-TextUtils.indexOf((CharSequence) r7, (CharSequence) r7, 0, 0));
                                byte b7 = (byte) ((i228 ^ (-43)) + ((i228 & (-43)) << 1));
                                int i229 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int i230 = MediaSessionCompatQueueItem;
                                int i231 = (i230 ^ 29) + ((i230 & 29) << 1);
                                int i232 = i231 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                MediaMetadataCompat = i232;
                                int i233 = i231 % 2;
                                int i234 = (i229 * 615) - 175067489;
                                int i235 = ((i232 | 89) << 1) - (i232 ^ 89);
                                MediaSessionCompatQueueItem = i235 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i236 = i235 % 2;
                                int i237 = ~i229;
                                int i238 = ~((i237 & 1969104205) | (i237 ^ 1969104205));
                                int i239 = -(-(((i238 & i) | (i ^ i238) | (~((-1969104206) | i229))) * 614));
                                int i240 = (i234 & i239) + (i234 | i239);
                                int i241 = ~i229;
                                int i242 = (~((i241 ^ i125) | (i241 & i125))) | (~((i241 ^ 1969104205) | (i241 & 1969104205)));
                                int i243 = ~((i125 ^ 1969104205) | (i125 & 1969104205));
                                int i244 = i240 + (((i242 ^ i243) | (i242 & i243)) * (-1228));
                                int i245 = (i241 & (-1969104206)) | (i241 ^ (-1969104206));
                                int i246 = ~((i245 & i6) | (i245 ^ i6));
                                int i247 = i229 | i125;
                                int i248 = ((i232 | 21) << 1) - (i232 ^ 21);
                                MediaSessionCompatQueueItem = i248 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i249 = i248 % 2;
                                int i250 = ~((i247 & 1969104205) | (i247 ^ 1969104205));
                                int i251 = -(-(((i250 & i246) | (i246 ^ i250)) * 614));
                                Object[] objArr9 = new Object[1];
                                a(b7, ((i244 | i251) << 1) - (i251 ^ i244), (short) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.view.ViewConfiguration.getPressedStateDuration() >> 16, (-1869687922) - android.graphics.Color.blue(0), objArr9);
                                zEquals = line3.equals((String) objArr9[0]);
                                fileReader.close();
                                bufferedReader.close();
                                if (zEquals) {
                                    try {
                                        int i252 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                        int iIconCompatParcelizer9 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                                        int i253 = ~i252;
                                        int i254 = ~((i253 ^ 107) | (i253 & 107));
                                        int i255 = ~iIconCompatParcelizer9;
                                        int i256 = ~((i255 ^ 107) | (i255 & 107));
                                        int i257 = (((i252 * (-183)) + 19795) - (~(-(-(((i254 & i256) | (i254 ^ i256)) * 184))))) - 1;
                                        int i258 = ~((i252 & (-108)) | ((-108) ^ i252));
                                        int i259 = -(-(((i258 & iIconCompatParcelizer9) | (iIconCompatParcelizer9 ^ i258)) * (-184)));
                                        byte b8 = (byte) ((((i257 | i259) << 1) - (i259 ^ i257)) + ((~(i253 | i255)) * 184));
                                        int iGreen = android.graphics.Color.green(0);
                                        int i260 = (iGreen ^ 1969104205) + ((iGreen & 1969104205) << 1);
                                        short deadChar = (short) android.view.KeyEvent.getDeadChar(0, 0);
                                        int i261 = -Gravity.getAbsoluteGravity(0, 0);
                                        int i262 = (i261 * 471) + 16485;
                                        int i263 = -(-(((i261 ^ 35) | (i261 & 35)) * (-470)));
                                        int i264 = (i262 ^ i263) + ((i262 & i263) << 1);
                                        int i265 = ~((~i261) | (-36));
                                        int i266 = ~(((-36) ^ i) | ((-36) & i));
                                        int i267 = (i265 & i266) | (i265 ^ i266);
                                        int i268 = (i125 ^ i261) | (i125 & i261);
                                        int i269 = -(-((i267 | (~((i268 & 35) | (i268 ^ 35)))) * (-470)));
                                        int i270 = ((i264 | i269) << 1) - (i269 ^ i264);
                                        int i271 = ~((-36) | i261 | i);
                                        int i272 = (i261 & i125) | (i125 ^ i261);
                                        int i273 = ~((i272 & 35) | (i272 ^ 35));
                                        int i274 = (i270 - (~(((i273 & i271) | (i271 ^ i273)) * 470))) - 1;
                                        int i275 = -(-android.graphics.Color.rgb(0, 0, 0));
                                        int i276 = (i275 & (-1852910708)) + (i275 | (-1852910708));
                                        Object[] objArr10 = new Object[1];
                                        a(b8, i260, deadChar, i274, i276, objArr10);
                                        file2 = new File((String) objArr10[0]);
                                        if (file2.canRead()) {
                                            fileReader2 = new FileReader(file2);
                                            bufferedReader2 = new BufferedReader(fileReader2);
                                            try {
                                                line2 = bufferedReader2.readLine();
                                                int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
                                                int i277 = MediaMetadataCompat;
                                                int i278 = (i277 & 3) + (i277 | 3);
                                                MediaSessionCompatQueueItem = i278 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                int i279 = i278 % 2;
                                                i7 = doubleTapTimeout >> 16;
                                                iIconCompatParcelizer = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                                                int i280 = i7 * (-830);
                                                int i281 = ((i280 | (-35776)) << 1) - (i280 ^ (-35776));
                                                i8 = ~iIconCompatParcelizer;
                                                int i282 = ~((42 ^ i8) | (42 & i8));
                                                int i283 = (i7 ^ (-43)) | (i7 & (-43));
                                                int i284 = ~((i283 & iIconCompatParcelizer) | (i283 ^ iIconCompatParcelizer));
                                                int i285 = ((i282 & i284) | (i282 ^ i284)) * (-831);
                                                int i286 = ((i281 | i285) << 1) - (i281 ^ i285);
                                                int i287 = (42 & i7) | (42 ^ i7);
                                                int i288 = (~((i287 & iIconCompatParcelizer) | (i287 ^ iIconCompatParcelizer))) * (-1662);
                                                i9 = (i286 ^ i288) + ((i288 & i286) << 1);
                                                int i289 = MediaSessionCompatQueueItem;
                                                i10 = ((i289 | 29) << 1) - (i289 ^ 29);
                                                MediaMetadataCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                if (i10 % 2 == 0) {
                                                    int i290 = ~i7;
                                                    int i291 = ~((i8 & i290) | (i290 ^ i8));
                                                    int i292 = ~((i7 & iIconCompatParcelizer) | (i7 ^ iIconCompatParcelizer));
                                                    int i293 = (i292 & i291) | (i291 ^ i292);
                                                    int i294 = ~((iIconCompatParcelizer & (-43)) | (iIconCompatParcelizer ^ (-43)));
                                                    int i295 = -((i293 & i294) | (i293 ^ i294));
                                                    b = (byte) (i9 % ((i295 & 831) + (i295 | 831)));
                                                    i11 = 1;
                                                } else {
                                                    int i296 = ~i7;
                                                    int i297 = ~iIconCompatParcelizer;
                                                    int i298 = (~((i7 & iIconCompatParcelizer) | (i7 ^ iIconCompatParcelizer))) | (~((i296 & i297) | (i296 ^ i297)));
                                                    int i299 = ~(iIconCompatParcelizer | (-43));
                                                    int i300 = ((i298 & i299) | (i298 ^ i299)) * 831;
                                                    b = (byte) (((i9 | i300) << 1) - (i300 ^ i9));
                                                    i11 = 0;
                                                }
                                                defaultSize = 1969104205 - View.getDefaultSize(i11, 0);
                                                edgeSlop = (short) (android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                                int i301 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                int i302 = MediaMetadataCompat + 35;
                                                int i303 = i302 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                MediaSessionCompatQueueItem = i303;
                                                int i304 = i302 % 2;
                                                int i305 = 284 * i301;
                                                int i306 = ((i305 | 282) << 1) - (i305 ^ 282);
                                                int i307 = ~i301;
                                                int i308 = ~((i307 ^ (-1)) | i307);
                                                int i309 = ~i301;
                                                int i310 = ~((i309 ^ i) | (i309 & i));
                                                int i311 = i303 + 65;
                                                MediaMetadataCompat = i311 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                int i312 = i311 % 2;
                                                int i313 = ((i306 + (((i308 ^ i310) | (i308 & i310)) * (-283))) - (~(283 * (~i301)))) - 1;
                                                int i314 = (~((i307 & i) | (i307 ^ i))) * 283;
                                                i12 = ((i313 | i314) << 1) - (i313 ^ i314);
                                                tapTimeout = android.view.ViewConfiguration.getTapTimeout();
                                                int i315 = MediaMetadataCompat;
                                                i13 = (i315 & 113) + (i315 | 113);
                                                MediaSessionCompatQueueItem = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                if (i13 % 2 != 0) {
                                                    Object[] objArr11 = new Object[1];
                                                    a(b, defaultSize, edgeSlop, i12, (-1869687922) * (tapTimeout - 57), objArr11);
                                                    zEquals2 = line2.equals((String) objArr11[0]);
                                                } else {
                                                    int i316 = -(tapTimeout >> 16);
                                                    int i317 = ((i316 | (-1869687922)) << 1) - (i316 ^ (-1869687922));
                                                    Object[] objArr12 = new Object[1];
                                                    a(b, defaultSize, edgeSlop, i12, i317, objArr12);
                                                    zEquals2 = line2.equals((String) objArr12[0]);
                                                }
                                                fileReader2.close();
                                                bufferedReader2.close();
                                            } catch (Throwable th3) {
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                throw th3;
                                            }
                                        } else {
                                            int i318 = MediaSessionCompatQueueItem + 15;
                                            MediaMetadataCompat = i318 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i319 = i318 % 2;
                                            zEquals2 = false;
                                        }
                                    } catch (Exception unused3) {
                                    }
                                    if (!zEquals2 && line != null) {
                                        int i320 = MediaSessionCompatQueueItem;
                                        int i321 = i320 + 21;
                                        MediaMetadataCompat = i321 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i322 = i321 % 2;
                                        int i323 = ((i320 | 49) << 1) - (i320 ^ 49);
                                        int i324 = i323 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        MediaMetadataCompat = i324;
                                        int i325 = i323 % 2;
                                        int i326 = (i324 & 19) + (i324 | 19);
                                        int i327 = i326 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        MediaSessionCompatQueueItem = i327;
                                        int i328 = i326 % 2;
                                        objArr = new Object[]{new int[]{(i & (-21)) | (i125 & 20)}, new String[]{line}};
                                        int i329 = i327 + 1;
                                        MediaMetadataCompat = i329 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i330 = i329 % 2;
                                        c = 0;
                                    }
                                }
                                int i331 = ((int[]) objArr[c])[c];
                                int i332 = ((~i141) & i) | (i141 & i125);
                                int i333 = -i332;
                                int i334 = ((i332 & i333) | (i332 ^ i333)) >> 31;
                                int i335 = (~i334) & i331;
                                int i336 = MediaMetadataCompat;
                                int i337 = (i336 ^ 41) + ((i336 & 41) << 1);
                                MediaSessionCompatQueueItem = i337 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i338 = i337 % 2;
                                int i339 = i141 & i334;
                                int i340 = (i339 & i335) | (i335 ^ i339);
                                String[] strArr3 = (String[]) objArr[1];
                                Object[] objArr13 = new Object[2];
                                int i341 = (i331 & i125) | ((~i331) & i);
                                int i342 = ((i341 | (-i341)) >> 31) & 1;
                                int i343 = (~(((-i342) | i342) >> 31)) & 1;
                                objArr13[i342] = null;
                                objArr13[i343] = strArr3;
                                Object[] objArr14 = {new int[]{i340}, (String[]) objArr13[0], new int[]{i}, new int[1]};
                                int i344 = (~(i & i340)) & (i | i340);
                                int i345 = -i344;
                                int i346 = (((i344 & i345) | (i344 ^ i345)) >> 31) & 16;
                                int i347 = (-1258966375) + (((~((-697750895) | i125)) | 951905935) * (-602)) + (((~((-697750895) | i)) | 680838158 | (~(968818671 | i125))) * (-301)) + ((~(i125 | 951905935)) * LocationRequest.PRIORITY_MAG_POSITION);
                                int iIconCompatParcelizer10 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                                LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                                LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                                int i348 = (i346 * 881) + (i347 * 881);
                                int i349 = ~i346;
                                int i350 = ~i347;
                                int i351 = ~(i349 | i350);
                                int i352 = ~i346;
                                int i353 = ~((i352 ^ iIconCompatParcelizer10) | (i352 & iIconCompatParcelizer10));
                                int i354 = (i351 & i353) | (i351 ^ i353);
                                int i355 = ~((i350 & iIconCompatParcelizer10) | (i350 ^ iIconCompatParcelizer10));
                                int i356 = ((i354 & i355) | (i354 ^ i355)) * (-880);
                                int i357 = ((i348 | i356) << 1) - (i348 ^ i356);
                                int i358 = ~iIconCompatParcelizer10;
                                int i359 = ~((i358 & i352) | (i352 ^ i358));
                                int i360 = (i359 & i347) | (i347 ^ i359);
                                int i361 = ~(i346 | iIconCompatParcelizer10);
                                int i362 = -(-(((i360 & i361) | (i360 ^ i361)) * (-880)));
                                int i363 = (i357 & i362) + (i362 | i357);
                                int i364 = MediaMetadataCompat;
                                int i365 = (i364 ^ 95) + ((i364 & 95) << 1);
                                int i366 = i365 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                MediaSessionCompatQueueItem = i366;
                                int i367 = i365 % 2;
                                int i368 = 880 * (~((iIconCompatParcelizer10 & i346) | (i346 ^ iIconCompatParcelizer10)));
                                int i369 = ((i363 | i368) << 1) - (i363 ^ i368);
                                int i370 = ~i369;
                                int i371 = ~i2;
                                int i372 = i369 | i371;
                                int i373 = ((((i369 * (-183)) + (i2 * 185)) + (((i2 ^ i370) | (i2 & i370)) * (-368))) - (~(((i372 & i125) | (i372 ^ i125)) * 184))) - 1;
                                int i374 = i366 + 67;
                                MediaMetadataCompat = i374 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i375 = i374 % 2;
                                int i376 = (~(i370 | i371)) | (~((i125 & i369) | (i125 ^ i369)));
                                int i377 = ~((i369 & i2) | (i369 ^ i2));
                                int i378 = (i373 - (~(184 * ((i377 & i376) | (i376 ^ i377))))) - 1;
                                int i379 = i378 << 13;
                                int i380 = (i379 & (~i378)) | ((~i379) & i378);
                                int i381 = i380 >>> 17;
                                int i382 = ((~i380) & i381) | ((~i381) & i380);
                                int i383 = i382 << 5;
                                ((int[]) objArr14[3])[0] = (i382 | i383) & (~(i382 & i383));
                                return objArr14;
                            } catch (Throwable th4) {
                                fileReader.close();
                                bufferedReader.close();
                                throw th4;
                            }
                        }
                        c = 0;
                        objArr = new Object[]{new int[]{i}, new String[0]};
                        int i3310 = ((int[]) objArr[c])[c];
                        int i3311 = ((~i141) & i) | (i141 & i125);
                        int i3312 = -i3311;
                        int i3313 = ((i3311 & i3312) | (i3311 ^ i3312)) >> 31;
                        int i3314 = (~i3313) & i3310;
                        int i3315 = MediaMetadataCompat;
                        int i3316 = (i3315 ^ 41) + ((i3315 & 41) << 1);
                        MediaSessionCompatQueueItem = i3316 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i3317 = i3316 % 2;
                        int i3318 = i141 & i3313;
                        int i3410 = (i3318 & i3314) | (i3314 ^ i3318);
                        String[] strArr4 = (String[]) objArr[1];
                        Object[] objArr15 = new Object[2];
                        int i3411 = (i3310 & i125) | ((~i3310) & i);
                        int i3412 = ((i3411 | (-i3411)) >> 31) & 1;
                        int i3413 = (~(((-i3412) | i3412) >> 31)) & 1;
                        objArr15[i3412] = null;
                        objArr15[i3413] = strArr4;
                        Object[] objArr16 = {new int[]{i3410}, (String[]) objArr15[0], new int[]{i}, new int[1]};
                        int i3414 = (~(i & i3410)) & (i | i3410);
                        int i3415 = -i3414;
                        int i3416 = (((i3414 & i3415) | (i3414 ^ i3415)) >> 31) & 16;
                        int i3417 = (-1258966375) + (((~((-697750895) | i125)) | 951905935) * (-602)) + (((~((-697750895) | i)) | 680838158 | (~(968818671 | i125))) * (-301)) + ((~(i125 | 951905935)) * LocationRequest.PRIORITY_MAG_POSITION);
                        int iIconCompatParcelizer11 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                        LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                        LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                        int i3418 = (i3416 * 881) + (i3417 * 881);
                        int i3419 = ~i3416;
                        int i3510 = ~i3417;
                        int i3511 = ~(i3419 | i3510);
                        int i3512 = ~i3416;
                        int i3513 = ~((i3512 ^ iIconCompatParcelizer11) | (i3512 & iIconCompatParcelizer11));
                        int i3514 = (i3511 & i3513) | (i3511 ^ i3513);
                        int i3515 = ~((i3510 & iIconCompatParcelizer11) | (i3510 ^ iIconCompatParcelizer11));
                        int i3516 = ((i3514 & i3515) | (i3514 ^ i3515)) * (-880);
                        int i3517 = ((i3418 | i3516) << 1) - (i3418 ^ i3516);
                        int i3518 = ~iIconCompatParcelizer11;
                        int i3519 = ~((i3518 & i3512) | (i3512 ^ i3518));
                        int i3610 = (i3519 & i3417) | (i3417 ^ i3519);
                        int i3611 = ~(i3416 | iIconCompatParcelizer11);
                        int i3612 = -(-(((i3610 & i3611) | (i3610 ^ i3611)) * (-880)));
                        int i3613 = (i3517 & i3612) + (i3612 | i3517);
                        int i3614 = MediaMetadataCompat;
                        int i3615 = (i3614 ^ 95) + ((i3614 & 95) << 1);
                        int i3616 = i3615 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        MediaSessionCompatQueueItem = i3616;
                        int i3617 = i3615 % 2;
                        int i3618 = 880 * (~((iIconCompatParcelizer11 & i3416) | (i3416 ^ iIconCompatParcelizer11)));
                        int i3619 = ((i3613 | i3618) << 1) - (i3613 ^ i3618);
                        int i3710 = ~i3619;
                        int i3711 = ~i2;
                        int i3712 = i3619 | i3711;
                        int i3713 = ((((i3619 * (-183)) + (i2 * 185)) + (((i2 ^ i3710) | (i2 & i3710)) * (-368))) - (~(((i3712 & i125) | (i3712 ^ i125)) * 184))) - 1;
                        int i3714 = i3616 + 67;
                        MediaMetadataCompat = i3714 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i3715 = i3714 % 2;
                        int i3716 = (~(i3710 | i3711)) | (~((i125 & i3619) | (i125 ^ i3619)));
                        int i3717 = ~((i3619 & i2) | (i3619 ^ i2));
                        int i3718 = (i3713 - (~(184 * ((i3717 & i3716) | (i3716 ^ i3717))))) - 1;
                        int i3719 = i3718 << 13;
                        int i384 = (i3719 & (~i3718)) | ((~i3719) & i3718);
                        int i385 = i384 >>> 17;
                        int i386 = ((~i384) & i385) | ((~i385) & i384);
                        int i387 = i386 << 5;
                        ((int[]) objArr16[3])[0] = (i386 | i387) & (~(i386 & i387));
                        return objArr16;
                    }
                    r8 = "";
                    byte mirror2 = (byte) (AndroidCharacter.getMirror('0') - 26);
                    int edgeSlop3 = android.view.ViewConfiguration.getEdgeSlop() >> 16;
                    int iIconCompatParcelizer12 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                    int i1810 = edgeSlop3 * 398;
                    int i1811 = (i1810 ^ 1918794572) + ((i1810 & 1918794572) << 1);
                    int i1812 = ~edgeSlop3;
                    int i1813 = ~iIconCompatParcelizer12;
                    int i1814 = ~((i1812 ^ i1813) | (i1812 & i1813));
                    int i1815 = ~(i1812 | 1969104175);
                    int i1910 = (i1814 ^ i1815) | (i1814 & i1815);
                    int i1911 = ~((i1813 & 1969104175) | (i1813 ^ 1969104175));
                    int i1912 = i1811 + (((i1911 & i1910) | (i1910 ^ i1911)) * (-397));
                    int i1913 = -(-((~((i1812 & 1969104175) | (i1812 ^ 1969104175))) * (-397)));
                    int i1914 = (i1912 & i1913) + (i1913 | i1912);
                    int i1915 = ~edgeSlop3;
                    int i1916 = ~((i1915 & 1969104175) | (i1915 ^ 1969104175));
                    int i1917 = (iIconCompatParcelizer12 & i1916) | (iIconCompatParcelizer12 ^ i1916);
                    int i1918 = ~((edgeSlop3 & (-1969104176)) | ((-1969104176) ^ edgeSlop3));
                    int i1919 = i1914 + (((i1918 & i1917) | (i1917 ^ i1918)) * 397);
                    short sResolveSize2 = (short) View.resolveSize(0, 0);
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) r7, '0');
                    int i2010 = iIndexOf2 * 1773;
                    int i2011 = (i2010 ^ (-27435)) + ((i2010 & (-27435)) << 1);
                    int i2012 = ~iIndexOf2;
                    int i2013 = (~((i2012 & (-32)) | (i2012 ^ (-32)))) | (~((-32) | i));
                    i6 = ~i;
                    int i2014 = i6 | iIndexOf2;
                    int i2015 = ~((i2014 & 31) | (i2014 ^ 31));
                    int i2016 = ((i2013 & i2015) | (i2013 ^ i2015)) * 886;
                    int i2017 = ((i2011 | i2016) << 1) - (i2016 ^ i2011);
                    int i2018 = ~(i125 | 31);
                    int i2019 = ((i2018 & iIndexOf2) | (iIndexOf2 ^ i2018)) * (-1772);
                    int i2110 = (((i2017 & i2019) + (i2019 | i2017)) - (~(-(-((~((i6 ^ iIndexOf2) | (iIndexOf2 & i6))) * 886))))) - 1;
                    int i2111 = -TextUtils.indexOf((CharSequence) r7, '0', 0, 0);
                    int i2112 = i2111 * (-523);
                    int i2113 = (i2112 & (-2101652531)) + (i2112 | (-2101652531));
                    int i2114 = ~i2111;
                    int i2115 = ~((i2114 ^ (-1869687925)) | (i2114 & (-1869687925)));
                    int i2116 = ~(1869687924 | i2111);
                    int i2117 = i2115 | i2116;
                    int i2118 = ~((1869687924 ^ i) | (1869687924 & i));
                    int i2119 = ((i2117 ^ i2118) | (i2117 & i2118)) * 262;
                    int i2210 = (i2113 & i2119) + (i2119 | i2113);
                    int i2211 = (~((1869687924 & i2111) | (1869687924 ^ i2111))) * (-786);
                    int i2212 = ((i2210 | i2211) << 1) - (i2211 ^ i2210);
                    int i2213 = ~((1869687924 ^ i125) | (1869687924 & i125));
                    int i2214 = ~i2111;
                    int i2215 = ~((i2214 ^ (-1869687925)) | (i2214 & (-1869687925)));
                    int i2216 = (i2215 & i2213) | (i2213 ^ i2215);
                    int i2217 = (i2212 - (~(-(-(((i2116 & i2216) | (i2216 ^ i2116)) * 262))))) - 1;
                    Object[] objArr17 = new Object[1];
                    a(mirror2, i1919, sResolveSize2, i2110, i2217, objArr17);
                    file = new File((String) objArr17[0]);
                    if (!file.canRead()) {
                        fileReader = new FileReader(file);
                        bufferedReader = new BufferedReader(fileReader);
                        String line4 = bufferedReader.readLine();
                        int i2218 = -(-TextUtils.indexOf((CharSequence) r7, (CharSequence) r7, 0, 0));
                        byte b9 = (byte) ((i2218 ^ (-43)) + ((i2218 & (-43)) << 1));
                        int i2219 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i2310 = MediaSessionCompatQueueItem;
                        int i2311 = (i2310 ^ 29) + ((i2310 & 29) << 1);
                        int i2312 = i2311 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        MediaMetadataCompat = i2312;
                        int i2313 = i2311 % 2;
                        int i2314 = (i2219 * 615) - 175067489;
                        int i2315 = ((i2312 | 89) << 1) - (i2312 ^ 89);
                        MediaSessionCompatQueueItem = i2315 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i2316 = i2315 % 2;
                        int i2317 = ~i2219;
                        int i2318 = ~((i2317 & 1969104205) | (i2317 ^ 1969104205));
                        int i2319 = -(-(((i2318 & i) | (i ^ i2318) | (~((-1969104206) | i2219))) * 614));
                        int i2410 = (i2314 & i2319) + (i2314 | i2319);
                        int i2411 = ~i2219;
                        int i2412 = (~((i2411 ^ i125) | (i2411 & i125))) | (~((i2411 ^ 1969104205) | (i2411 & 1969104205)));
                        int i2413 = ~((i125 ^ 1969104205) | (i125 & 1969104205));
                        int i2414 = i2410 + (((i2412 ^ i2413) | (i2412 & i2413)) * (-1228));
                        int i2415 = (i2411 & (-1969104206)) | (i2411 ^ (-1969104206));
                        int i2416 = ~((i2415 & i6) | (i2415 ^ i6));
                        int i2417 = i2219 | i125;
                        int i2418 = ((i2312 | 21) << 1) - (i2312 ^ 21);
                        MediaSessionCompatQueueItem = i2418 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i2419 = i2418 % 2;
                        int i2510 = ~((i2417 & 1969104205) | (i2417 ^ 1969104205));
                        int i2511 = -(-(((i2510 & i2416) | (i2416 ^ i2510)) * 614));
                        Object[] objArr18 = new Object[1];
                        a(b9, ((i2414 | i2511) << 1) - (i2511 ^ i2414), (short) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.view.ViewConfiguration.getPressedStateDuration() >> 16, (-1869687922) - android.graphics.Color.blue(0), objArr18);
                        zEquals = line4.equals((String) objArr18[0]);
                        fileReader.close();
                        bufferedReader.close();
                        if (zEquals) {
                            int i2512 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                            int iIconCompatParcelizer13 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                            int i2513 = ~i2512;
                            int i2514 = ~((i2513 ^ 107) | (i2513 & 107));
                            int i2515 = ~iIconCompatParcelizer13;
                            int i2516 = ~((i2515 ^ 107) | (i2515 & 107));
                            int i2517 = (((i2512 * (-183)) + 19795) - (~(-(-(((i2514 & i2516) | (i2514 ^ i2516)) * 184))))) - 1;
                            int i2518 = ~((i2512 & (-108)) | ((-108) ^ i2512));
                            int i2519 = -(-(((i2518 & iIconCompatParcelizer13) | (iIconCompatParcelizer13 ^ i2518)) * (-184)));
                            byte b10 = (byte) ((((i2517 | i2519) << 1) - (i2519 ^ i2517)) + ((~(i2513 | i2515)) * 184));
                            int iGreen2 = android.graphics.Color.green(0);
                            int i2610 = (iGreen2 ^ 1969104205) + ((iGreen2 & 1969104205) << 1);
                            short deadChar2 = (short) android.view.KeyEvent.getDeadChar(0, 0);
                            int i2611 = -Gravity.getAbsoluteGravity(0, 0);
                            int i2612 = (i2611 * 471) + 16485;
                            int i2613 = -(-(((i2611 ^ 35) | (i2611 & 35)) * (-470)));
                            int i2614 = (i2612 ^ i2613) + ((i2612 & i2613) << 1);
                            int i2615 = ~((~i2611) | (-36));
                            int i2616 = ~(((-36) ^ i) | ((-36) & i));
                            int i2617 = (i2615 & i2616) | (i2615 ^ i2616);
                            int i2618 = (i125 ^ i2611) | (i125 & i2611);
                            int i2619 = -(-((i2617 | (~((i2618 & 35) | (i2618 ^ 35)))) * (-470)));
                            int i2710 = ((i2614 | i2619) << 1) - (i2619 ^ i2614);
                            int i2711 = ~((-36) | i2611 | i);
                            int i2712 = (i2611 & i125) | (i125 ^ i2611);
                            int i2713 = ~((i2712 & 35) | (i2712 ^ 35));
                            int i2714 = (i2710 - (~(((i2713 & i2711) | (i2711 ^ i2713)) * 470))) - 1;
                            int i2715 = -(-android.graphics.Color.rgb(0, 0, 0));
                            int i2716 = (i2715 & (-1852910708)) + (i2715 | (-1852910708));
                            Object[] objArr19 = new Object[1];
                            a(b10, i2610, deadChar2, i2714, i2716, objArr19);
                            file2 = new File((String) objArr19[0]);
                            if (file2.canRead()) {
                                int i3110 = MediaSessionCompatQueueItem + 15;
                                MediaMetadataCompat = i3110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i3111 = i3110 % 2;
                                zEquals2 = false;
                            } else {
                                fileReader2 = new FileReader(file2);
                                bufferedReader2 = new BufferedReader(fileReader2);
                                line2 = bufferedReader2.readLine();
                                int doubleTapTimeout2 = android.view.ViewConfiguration.getDoubleTapTimeout();
                                int i2717 = MediaMetadataCompat;
                                int i2718 = (i2717 & 3) + (i2717 | 3);
                                MediaSessionCompatQueueItem = i2718 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i2719 = i2718 % 2;
                                i7 = doubleTapTimeout2 >> 16;
                                iIconCompatParcelizer = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                                int i2810 = i7 * (-830);
                                int i2811 = ((i2810 | (-35776)) << 1) - (i2810 ^ (-35776));
                                i8 = ~iIconCompatParcelizer;
                                int i2812 = ~((42 ^ i8) | (42 & i8));
                                int i2813 = (i7 ^ (-43)) | (i7 & (-43));
                                int i2814 = ~((i2813 & iIconCompatParcelizer) | (i2813 ^ iIconCompatParcelizer));
                                int i2815 = ((i2812 & i2814) | (i2812 ^ i2814)) * (-831);
                                int i2816 = ((i2811 | i2815) << 1) - (i2811 ^ i2815);
                                int i2817 = (42 & i7) | (42 ^ i7);
                                int i2818 = (~((i2817 & iIconCompatParcelizer) | (i2817 ^ iIconCompatParcelizer))) * (-1662);
                                i9 = (i2816 ^ i2818) + ((i2818 & i2816) << 1);
                                int i2819 = MediaSessionCompatQueueItem;
                                i10 = ((i2819 | 29) << 1) - (i2819 ^ 29);
                                MediaMetadataCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i10 % 2 == 0) {
                                    int i2910 = ~i7;
                                    int i2911 = ~((i8 & i2910) | (i2910 ^ i8));
                                    int i2912 = ~((i7 & iIconCompatParcelizer) | (i7 ^ iIconCompatParcelizer));
                                    int i2913 = (i2912 & i2911) | (i2911 ^ i2912);
                                    int i2914 = ~((iIconCompatParcelizer & (-43)) | (iIconCompatParcelizer ^ (-43)));
                                    int i2915 = -((i2913 & i2914) | (i2913 ^ i2914));
                                    b = (byte) (i9 % ((i2915 & 831) + (i2915 | 831)));
                                    i11 = 1;
                                } else {
                                    int i2916 = ~i7;
                                    int i2917 = ~iIconCompatParcelizer;
                                    int i2918 = (~((i7 & iIconCompatParcelizer) | (i7 ^ iIconCompatParcelizer))) | (~((i2916 & i2917) | (i2916 ^ i2917)));
                                    int i2919 = ~(iIconCompatParcelizer | (-43));
                                    int i3010 = ((i2918 & i2919) | (i2918 ^ i2919)) * 831;
                                    b = (byte) (((i9 | i3010) << 1) - (i3010 ^ i9));
                                    i11 = 0;
                                }
                                defaultSize = 1969104205 - View.getDefaultSize(i11, 0);
                                edgeSlop = (short) (android.view.ViewConfiguration.getEdgeSlop() >> 16);
                                int i3011 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                int i3012 = MediaMetadataCompat + 35;
                                int i3013 = i3012 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                MediaSessionCompatQueueItem = i3013;
                                int i3014 = i3012 % 2;
                                int i3015 = 284 * i3011;
                                int i3016 = ((i3015 | 282) << 1) - (i3015 ^ 282);
                                int i3017 = ~i3011;
                                int i3018 = ~((i3017 ^ (-1)) | i3017);
                                int i3019 = ~i3011;
                                int i3112 = ~((i3019 ^ i) | (i3019 & i));
                                int i3113 = i3013 + 65;
                                MediaMetadataCompat = i3113 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i3114 = i3113 % 2;
                                int i3115 = ((i3016 + (((i3018 ^ i3112) | (i3018 & i3112)) * (-283))) - (~(283 * (~i3011)))) - 1;
                                int i3116 = (~((i3017 & i) | (i3017 ^ i))) * 283;
                                i12 = ((i3115 | i3116) << 1) - (i3115 ^ i3116);
                                tapTimeout = android.view.ViewConfiguration.getTapTimeout();
                                int i3117 = MediaMetadataCompat;
                                i13 = (i3117 & 113) + (i3117 | 113);
                                MediaSessionCompatQueueItem = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i13 % 2 != 0) {
                                    Object[] objArr110 = new Object[1];
                                    a(b, defaultSize, edgeSlop, i12, (-1869687922) * (tapTimeout - 57), objArr110);
                                    zEquals2 = line2.equals((String) objArr110[0]);
                                } else {
                                    int i3118 = -(tapTimeout >> 16);
                                    int i3119 = ((i3118 | (-1869687922)) << 1) - (i3118 ^ (-1869687922));
                                    Object[] objArr111 = new Object[1];
                                    a(b, defaultSize, edgeSlop, i12, i3119, objArr111);
                                    zEquals2 = line2.equals((String) objArr111[0]);
                                }
                                fileReader2.close();
                                bufferedReader2.close();
                            }
                            if (!zEquals2) {
                            }
                        }
                        int i3319 = ((int[]) objArr[c])[c];
                        int i33110 = ((~i141) & i) | (i141 & i125);
                        int i33111 = -i33110;
                        int i33112 = ((i33110 & i33111) | (i33110 ^ i33111)) >> 31;
                        int i33113 = (~i33112) & i3319;
                        int i33114 = MediaMetadataCompat;
                        int i33115 = (i33114 ^ 41) + ((i33114 & 41) << 1);
                        MediaSessionCompatQueueItem = i33115 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i33116 = i33115 % 2;
                        int i33117 = i141 & i33112;
                        int i34110 = (i33117 & i33113) | (i33113 ^ i33117);
                        String[] strArr5 = (String[]) objArr[1];
                        Object[] objArr112 = new Object[2];
                        int i34111 = (i3319 & i125) | ((~i3319) & i);
                        int i34112 = ((i34111 | (-i34111)) >> 31) & 1;
                        int i34113 = (~(((-i34112) | i34112) >> 31)) & 1;
                        objArr112[i34112] = null;
                        objArr112[i34113] = strArr5;
                        Object[] objArr113 = {new int[]{i34110}, (String[]) objArr112[0], new int[]{i}, new int[1]};
                        int i34114 = (~(i & i34110)) & (i | i34110);
                        int i34115 = -i34114;
                        int i34116 = (((i34114 & i34115) | (i34114 ^ i34115)) >> 31) & 16;
                        int i34117 = (-1258966375) + (((~((-697750895) | i125)) | 951905935) * (-602)) + (((~((-697750895) | i)) | 680838158 | (~(968818671 | i125))) * (-301)) + ((~(i125 | 951905935)) * LocationRequest.PRIORITY_MAG_POSITION);
                        int iIconCompatParcelizer14 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                        LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                        LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
                        int i34118 = (i34116 * 881) + (i34117 * 881);
                        int i34119 = ~i34116;
                        int i35110 = ~i34117;
                        int i35111 = ~(i34119 | i35110);
                        int i35112 = ~i34116;
                        int i35113 = ~((i35112 ^ iIconCompatParcelizer14) | (i35112 & iIconCompatParcelizer14));
                        int i35114 = (i35111 & i35113) | (i35111 ^ i35113);
                        int i35115 = ~((i35110 & iIconCompatParcelizer14) | (i35110 ^ iIconCompatParcelizer14));
                        int i35116 = ((i35114 & i35115) | (i35114 ^ i35115)) * (-880);
                        int i35117 = ((i34118 | i35116) << 1) - (i34118 ^ i35116);
                        int i35118 = ~iIconCompatParcelizer14;
                        int i35119 = ~((i35118 & i35112) | (i35112 ^ i35118));
                        int i36110 = (i35119 & i34117) | (i34117 ^ i35119);
                        int i36111 = ~(i34116 | iIconCompatParcelizer14);
                        int i36112 = -(-(((i36110 & i36111) | (i36110 ^ i36111)) * (-880)));
                        int i36113 = (i35117 & i36112) + (i36112 | i35117);
                        int i36114 = MediaMetadataCompat;
                        int i36115 = (i36114 ^ 95) + ((i36114 & 95) << 1);
                        int i36116 = i36115 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        MediaSessionCompatQueueItem = i36116;
                        int i36117 = i36115 % 2;
                        int i36118 = 880 * (~((iIconCompatParcelizer14 & i34116) | (i34116 ^ iIconCompatParcelizer14)));
                        int i36119 = ((i36113 | i36118) << 1) - (i36113 ^ i36118);
                        int i37110 = ~i36119;
                        int i37111 = ~i2;
                        int i37112 = i36119 | i37111;
                        int i37113 = ((((i36119 * (-183)) + (i2 * 185)) + (((i2 ^ i37110) | (i2 & i37110)) * (-368))) - (~(((i37112 & i125) | (i37112 ^ i125)) * 184))) - 1;
                        int i37114 = i36116 + 67;
                        MediaMetadataCompat = i37114 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i37115 = i37114 % 2;
                        int i37116 = (~(i37110 | i37111)) | (~((i125 & i36119) | (i125 ^ i36119)));
                        int i37117 = ~((i36119 & i2) | (i36119 ^ i2));
                        int i37118 = (i37113 - (~(184 * ((i37117 & i37116) | (i37116 ^ i37117))))) - 1;
                        int i37119 = i37118 << 13;
                        int i388 = (i37119 & (~i37118)) | ((~i37119) & i37118);
                        int i389 = i388 >>> 17;
                        int i3810 = ((~i388) & i389) | ((~i389) & i388);
                        int i3811 = i3810 << 5;
                        ((int[]) objArr113[3])[0] = (i3810 | i3811) & (~(i3810 & i3811));
                        return objArr113;
                    }
                } catch (Exception unused4) {
                }
            } catch (Exception unused5) {
            }
            line = null;
            r7 = r8;
            c = 0;
            objArr = new Object[]{new int[]{i}, new String[0]};
            int i33118 = ((int[]) objArr[c])[c];
            int i33119 = ((~i141) & i) | (i141 & i125);
            int i331110 = -i33119;
            int i331111 = ((i33119 & i331110) | (i33119 ^ i331110)) >> 31;
            int i331112 = (~i331111) & i33118;
            int i331113 = MediaMetadataCompat;
            int i331114 = (i331113 ^ 41) + ((i331113 & 41) << 1);
            MediaSessionCompatQueueItem = i331114 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i331115 = i331114 % 2;
            int i331116 = i141 & i331111;
            int i341110 = (i331116 & i331112) | (i331112 ^ i331116);
            String[] strArr6 = (String[]) objArr[1];
            Object[] objArr114 = new Object[2];
            int i341111 = (i33118 & i125) | ((~i33118) & i);
            int i341112 = ((i341111 | (-i341111)) >> 31) & 1;
            int i341113 = (~(((-i341112) | i341112) >> 31)) & 1;
            objArr114[i341112] = null;
            objArr114[i341113] = strArr6;
            Object[] objArr115 = {new int[]{i341110}, (String[]) objArr114[0], new int[]{i}, new int[1]};
            int i341114 = (~(i & i341110)) & (i | i341110);
            int i341115 = -i341114;
            int i341116 = (((i341114 & i341115) | (i341114 ^ i341115)) >> 31) & 16;
            int i341117 = (-1258966375) + (((~((-697750895) | i125)) | 951905935) * (-602)) + (((~((-697750895) | i)) | 680838158 | (~(968818671 | i125))) * (-301)) + ((~(i125 | 951905935)) * LocationRequest.PRIORITY_MAG_POSITION);
            int iIconCompatParcelizer15 = LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
            LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
            LogConfiguration.LogConfigurationPeerCleaner.IconCompatParcelizer();
            int i341118 = (i341116 * 881) + (i341117 * 881);
            int i341119 = ~i341116;
            int i351110 = ~i341117;
            int i351111 = ~(i341119 | i351110);
            int i351112 = ~i341116;
            int i351113 = ~((i351112 ^ iIconCompatParcelizer15) | (i351112 & iIconCompatParcelizer15));
            int i351114 = (i351111 & i351113) | (i351111 ^ i351113);
            int i351115 = ~((i351110 & iIconCompatParcelizer15) | (i351110 ^ iIconCompatParcelizer15));
            int i351116 = ((i351114 & i351115) | (i351114 ^ i351115)) * (-880);
            int i351117 = ((i341118 | i351116) << 1) - (i341118 ^ i351116);
            int i351118 = ~iIconCompatParcelizer15;
            int i351119 = ~((i351118 & i351112) | (i351112 ^ i351118));
            int i361110 = (i351119 & i341117) | (i341117 ^ i351119);
            int i361111 = ~(i341116 | iIconCompatParcelizer15);
            int i361112 = -(-(((i361110 & i361111) | (i361110 ^ i361111)) * (-880)));
            int i361113 = (i351117 & i361112) + (i361112 | i351117);
            int i361114 = MediaMetadataCompat;
            int i361115 = (i361114 ^ 95) + ((i361114 & 95) << 1);
            int i361116 = i361115 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaSessionCompatQueueItem = i361116;
            int i361117 = i361115 % 2;
            int i361118 = 880 * (~((iIconCompatParcelizer15 & i341116) | (i341116 ^ iIconCompatParcelizer15)));
            int i361119 = ((i361113 | i361118) << 1) - (i361113 ^ i361118);
            int i371110 = ~i361119;
            int i371111 = ~i2;
            int i371112 = i361119 | i371111;
            int i371113 = ((((i361119 * (-183)) + (i2 * 185)) + (((i2 ^ i371110) | (i2 & i371110)) * (-368))) - (~(((i371112 & i125) | (i371112 ^ i125)) * 184))) - 1;
            int i371114 = i361116 + 67;
            MediaMetadataCompat = i371114 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i371115 = i371114 % 2;
            int i371116 = (~(i371110 | i371111)) | (~((i125 & i361119) | (i125 ^ i361119)));
            int i371117 = ~((i361119 & i2) | (i361119 ^ i2));
            int i371118 = (i371113 - (~(184 * ((i371117 & i371116) | (i371116 ^ i371117))))) - 1;
            int i371119 = i371118 << 13;
            int i3812 = (i371119 & (~i371118)) | ((~i371119) & i371118);
            int i3813 = i3812 >>> 17;
            int i3814 = ((~i3812) & i3813) | ((~i3813) & i3812);
            int i3815 = i3814 << 5;
            ((int[]) objArr115[3])[0] = (i3814 | i3815) & (~(i3814 & i3815));
            return objArr115;
        } catch (Throwable th5) {
            Throwable cause = th5.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th5;
        }
    }
}
