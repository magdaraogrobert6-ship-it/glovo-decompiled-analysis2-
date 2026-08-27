package com.deliveryhero.customerchat.service;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import androidx.room.Room;
import com.deliveryhero.selfServiceChat.data.chat.url.datastore.ChatIdCacheHelper;
import com.deliveryhero.selfServiceChat.ui.WebViewManager;
import io.sentry.util.UrlUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.Set;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.TextAnnouncementContentCardView;
import o.accesstoOffsetmoWRBKg;
import o.getContentViewGroupParentLayout;
import o.getDefaultTintBlendMode;
import o.onBackInvokedlambda0;
import o.onImageAvailable;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaCsFeV_dc3Vpb_LOEOUqdR772I1A;
import o.rgbEqualOWjLjI;
import o.setFontSizeR2X_6o;
import o.setOutlineAmbientShadowColor;
import o.setOutlineSpotShadowColor;

/* JADX INFO: loaded from: classes2.dex */
public final class ChatService implements getContentViewGroupParentLayout {
    public final ChatIdCacheHelper IconCompatParcelizer;
    public final WebViewManager MediaDescriptionCompat;
    public final getDefaultTintBlendMode MediaSessionCompatQueueItem;
    public final /* synthetic */ ContextScope RemoteActionCompatParcelizer;
    public final onImageAvailable read;
    public final setOutlineAmbientShadowColor serializer;
    public final rgbEqualOWjLjI write;
    private static final byte[] $$c = {93, 65, 116, -71};
    private static final int $$d = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {20, 111, -65, 89, 26, 12, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13, 19, 8, 2, 5, -15, -36, 34, 17, -11, 6, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13, -14, 13, -9, -8, 11, -3, 17, -21, 13, 3, -7, -13, -4, 3};
    private static final int $$b = 135;
    private static int PlaybackStateCompat = 0;
    private static int MediaSessionCompatToken = 1;
    private static long RatingCompat = -7009568347796326538L;
    private static int MediaMetadataCompat = -658032778;
    private static char MediaBrowserCompatMediaItem = 44350;

    private static String $$e(int i, byte b, byte b2) {
        int i2 = (b2 * 4) + 4;
        byte[] bArr = $$c;
        int i3 = b + 104;
        int i4 = i * 2;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3 += -i5;
            i2++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i3 += -bArr[i2];
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 61 - r7
            byte[] r0 = com.deliveryhero.customerchat.service.ChatService.$$a
            int r8 = r8 + 73
            int r1 = 28 - r6
            byte[] r1 = new byte[r1]
            int r6 = 27 - r6
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.customerchat.service.ChatService.a(byte, short, int, java.lang.Object[]):void");
    }

    public ChatService(setOutlineAmbientShadowColor setoutlineambientshadowcolor, onImageAvailable onimageavailable, rgbEqualOWjLjI rgbequalowjlji, setOutlineSpotShadowColor setoutlinespotshadowcolor, WebViewManager webViewManager, getDefaultTintBlendMode getdefaulttintblendmode, ChatIdCacheHelper chatIdCacheHelper) {
        this.serializer = setoutlineambientshadowcolor;
        this.read = onimageavailable;
        this.write = rgbequalowjlji;
        this.MediaDescriptionCompat = webViewManager;
        this.MediaSessionCompatQueueItem = getdefaulttintblendmode;
        this.IconCompatParcelizer = chatIdCacheHelper;
        onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, MainDispatcherLoader.read));
    }

    @Override // o.getContentViewGroupParentLayout
    public final TextAnnouncementContentCardView getCoroutineContext() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 101;
        MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TextAnnouncementContentCardView textAnnouncementContentCardView = this.RemoteActionCompatParcelizer.serializer;
        int i4 = MediaSessionCompatToken + 67;
        PlaybackStateCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return textAnnouncementContentCardView;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (o.hideCurrentlyDisplayingInAppMessage.serializer((java.lang.CharSequence) r7.globalEntityID) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        if (o.hideCurrentlyDisplayingInAppMessage.serializer((java.lang.CharSequence) r7.globalEntityID) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        r7 = r6.write;
        r1.IconCompatParcelizer = r6;
        r1.serializer = 1;
        r8 = ((com.deliveryhero.selfServiceChat.data.repository.ChatRepositoryImpl) r7).fetchHelpCenterRegion(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        if (r8 != r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$getHelpcenterRegionConfig(com.deliveryhero.customerchat.service.ChatService r6, o.LayerSnapshot_androidKt r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.deliveryhero.customerchat.service.ChatService.MediaSessionCompatToken
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.deliveryhero.customerchat.service.ChatService.PlaybackStateCompat = r2
            int r1 = r1 % r0
            boolean r1 = r8 instanceof o.AndroidShadowContextShadowKey
            if (r1 == 0) goto L1f
            r1 = r8
            o.AndroidShadowContextShadowKey r1 = (o.AndroidShadowContextShadowKey) r1
            int r2 = r1.serializer
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r2 = r2 + r3
            r1.serializer = r2
            goto L24
        L1f:
            o.AndroidShadowContextShadowKey r1 = new o.AndroidShadowContextShadowKey
            r1.<init>(r6, r8)
        L24:
            java.lang.Object r8 = r1.read
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.serializer
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L4c
            int r6 = com.deliveryhero.customerchat.service.ChatService.PlaybackStateCompat
            int r6 = r6 + 125
            int r7 = r6 % 128
            com.deliveryhero.customerchat.service.ChatService.MediaSessionCompatToken = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L3c
            if (r3 != 0) goto L46
            goto L3e
        L3c:
            if (r3 != r4) goto L46
        L3e:
            com.deliveryhero.customerchat.service.ChatService r6 = r1.IconCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)     // Catch: java.lang.Throwable -> L44
            goto L8f
        L44:
            r7 = move-exception
            goto L92
        L46:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r6)
            return r5
        L4c:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            if (r7 == 0) goto L54
            o.rebuildOutline r8 = r7.dhEnvironment
            goto L5e
        L54:
            int r8 = com.deliveryhero.customerchat.service.ChatService.MediaSessionCompatToken
            int r8 = r8 + 105
            int r3 = r8 % 128
            com.deliveryhero.customerchat.service.ChatService.PlaybackStateCompat = r3
            int r8 = r8 % r0
            r8 = r5
        L5e:
            if (r8 == 0) goto Laf
            int r8 = com.deliveryhero.customerchat.service.ChatService.PlaybackStateCompat
            int r8 = r8 + 43
            int r3 = r8 % 128
            com.deliveryhero.customerchat.service.ChatService.MediaSessionCompatToken = r3
            int r8 = r8 % r0
            if (r8 != 0) goto L78
            java.lang.String r7 = r7.globalEntityID
            boolean r7 = o.hideCurrentlyDisplayingInAppMessage.serializer(r7)
            r8 = 26
            int r8 = r8 / 0
            if (r7 != 0) goto Laf
            goto L80
        L78:
            java.lang.String r7 = r7.globalEntityID
            boolean r7 = o.hideCurrentlyDisplayingInAppMessage.serializer(r7)
            if (r7 != 0) goto Laf
        L80:
            o.rgbEqualOWjLjI r7 = r6.write     // Catch: java.lang.Throwable -> L44
            r1.IconCompatParcelizer = r6     // Catch: java.lang.Throwable -> L44
            r1.serializer = r4     // Catch: java.lang.Throwable -> L44
            com.deliveryhero.selfServiceChat.data.repository.ChatRepositoryImpl r7 = (com.deliveryhero.selfServiceChat.data.repository.ChatRepositoryImpl) r7     // Catch: java.lang.Throwable -> L44
            java.lang.Object r8 = r7.fetchHelpCenterRegion(r1)     // Catch: java.lang.Throwable -> L44
            if (r8 != r2) goto L8f
            return r2
        L8f:
            com.deliveryhero.selfServiceChat.data.config.HelpcenterEntityConfigEndpointResponse$GlobalEntityConfig r8 = (com.deliveryhero.selfServiceChat.data.config.HelpcenterEntityConfigEndpointResponse.GlobalEntityConfig) r8     // Catch: java.lang.Throwable -> L44
            return r8
        L92:
            o.onImageAvailable r6 = r6.read
            o.isIdentityannotations r6 = r6.serializer
            if (r6 == 0) goto Laf
            o.LayerSnapshotV22 r8 = o.LayerSnapshotV22.ERROR
            java.lang.String r1 = "FETCH_HC_REGION_EVENT"
            java.lang.String r2 = "Fetching Help center region config failed"
            r6.RemoteActionCompatParcelizer(r8, r1, r2, r7)
            int r6 = com.deliveryhero.customerchat.service.ChatService.PlaybackStateCompat
            int r6 = r6 + 89
            int r7 = r6 % 128
            com.deliveryhero.customerchat.service.ChatService.MediaSessionCompatToken = r7
            int r6 = r6 % r0
            if (r6 != 0) goto Laf
            r6 = 5
            int r6 = r6 / 3
        Laf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.customerchat.service.ChatService.access$getHelpcenterRegionConfig(com.deliveryhero.customerchat.service.ChatService, o.LayerSnapshot_androidKt, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    private static void b(int i, char[] cArr, char c, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        accesstoOffsetmoWRBKg accesstooffsetmowrbkg = new accesstoOffsetmoWRBKg();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        accesstooffsetmowrbkg.IconCompatParcelizer = 0;
        while (accesstooffsetmowrbkg.IconCompatParcelizer < length3) {
            int i4 = $11 + 29;
            $10 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {accesstooffsetmowrbkg};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2056078218);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) Drawable.resolveOpacity(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 231, 21 - (ViewConfiguration.getScrollBarSize() >> 8), 1436720535, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {accesstooffsetmowrbkg};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(729107336);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2546, (ViewConfiguration.getFadingEdgeLength() >> 16) + 30, -73045399, false, $$e(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {accesstooffsetmowrbkg, Integer.valueOf(cArr4[accesstooffsetmowrbkg.IconCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(245609149);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b3 = (byte) 0;
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 887 - KeyEvent.keyCodeFromString(""), 60 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -562850980, false, $$e(b3, (byte) (b3 | 7), b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1101373148);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char modifierMetaStateMask = (char) (65449 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int iAlpha = 1244 - Color.alpha(0);
                    int i6 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33;
                    byte length4 = (byte) $$c.length;
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(modifierMetaStateMask, iAlpha, i6, 1854554309, false, $$e((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = accesstooffsetmowrbkg.write;
                cArr6[accesstooffsetmowrbkg.IconCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[accesstooffsetmowrbkg.IconCompatParcelizer])) ^ (RatingCompat ^ (-7009568347796326538L))) ^ ((long) ((int) (((long) MediaMetadataCompat) ^ (-7009568347796326538L))))) ^ ((long) ((char) (((long) MediaBrowserCompatMediaItem) ^ (-7009568347796326538L)))));
                accesstooffsetmowrbkg.IconCompatParcelizer++;
                int i7 = $11 + 73;
                $10 = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x033b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0327  */
    /* JADX WARN: Code duplicated, block: B:45:0x032d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0341  */
    /* JADX WARN: Code duplicated, block: B:51:0x0350 A[Catch: Exception -> 0x06c6, TRY_ENTER, TryCatch #2 {Exception -> 0x06c6, blocks: (B:46:0x033b, B:51:0x0350, B:53:0x0372, B:55:0x03c9, B:62:0x044f, B:52:0x0361), top: B:116:0x033b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0361 A[Catch: Exception -> 0x06c6, TryCatch #2 {Exception -> 0x06c6, blocks: (B:46:0x033b, B:51:0x0350, B:53:0x0372, B:55:0x03c9, B:62:0x044f, B:52:0x0361), top: B:116:0x033b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x03fb A[Catch: all -> 0x04fd, TryCatch #5 {all -> 0x04fd, blocks: (B:57:0x03ee, B:59:0x03fb, B:60:0x043e), top: B:122:0x03ee, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0508 A[Catch: Exception -> 0x06c8, TRY_LEAVE, TryCatch #0 {Exception -> 0x06c8, blocks: (B:64:0x0499, B:66:0x04fe, B:68:0x0506, B:69:0x0507, B:70:0x0508, B:72:0x05a1, B:77:0x06a9, B:83:0x06be, B:85:0x06c4, B:86:0x06c5, B:73:0x0647, B:75:0x0654, B:76:0x06a2, B:57:0x03ee, B:59:0x03fb, B:60:0x043e), top: B:113:0x033f, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0654 A[Catch: all -> 0x06bd, TryCatch #4 {all -> 0x06bd, blocks: (B:73:0x0647, B:75:0x0654, B:76:0x06a2), top: B:120:0x0647, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:81:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:91:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:92:0x06f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v10 */
    /* JADX WARN: Type inference failed for: r31v11 */
    /* JADX WARN: Type inference failed for: r31v12 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r31v6 */
    /* JADX WARN: Type inference failed for: r31v7 */
    /* JADX WARN: Type inference failed for: r31v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    public static Object[] IconCompatParcelizer(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        ?? r31;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ?? r32;
        int i13;
        int i14;
        int i15;
        String str;
        Object[] objArr;
        Object objRemoteActionCompatParcelizer;
        int i16;
        int i17;
        char[] cArr;
        int i18;
        Object objRemoteActionCompatParcelizer2;
        Object[] objArr2;
        Method method;
        int i19;
        int i20;
        int i21 = 2 % 2;
        int i22 = MediaSessionCompatToken;
        int i23 = ((i22 | 107) << 1) - (i22 ^ 107);
        int i24 = i23 % Fields.SpotShadowColor;
        PlaybackStateCompat = i24;
        if (i23 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (context != 0) {
            int i25 = i24 + 125;
            MediaSessionCompatToken = i25 % Fields.SpotShadowColor;
            int i26 = i25 % 2;
            try {
                Object[] objArr3 = new Object[1];
                b(83733787 - (~(-KeyEvent.keyCodeFromString(""))), new char[]{42256, 22205, 48279, 24361, 28025, 47169, 20735, 42015, 9959, 22956, 59025, 31127, 21892, 23264, 16863, 3211, 45360, 63802, 11115, 3050, 15111, 55103, 25665}, (char) (Color.rgb(0, 0, 0) + 16777216), new char[]{7188, 64941, 3844, 46021}, new char[]{0, 0, 0, 0}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                char[] cArr2 = {44451, 39674, 63538, 53129, 22693, 49099, 57918, 38226, 52736, 45602, 3086, 61365, 21418, 34075, 52681, 18487, 10831, 61765};
                int i27 = MediaSessionCompatToken;
                int i28 = ((i27 | 105) << 1) - (i27 ^ 105);
                PlaybackStateCompat = i28 % Fields.SpotShadowColor;
                int i29 = i28 % 2;
                int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0);
                int i30 = r8lambdaCsFeV_dc3Vpb_LOEOUqdR772I1A.read();
                int i31 = iNormalizeMetaState2 * 51;
                int i32 = ((((i31 | (-2168152)) << 1) - (i31 ^ (-2168152))) - (~(((iNormalizeMetaState2 ^ i30) | (iNormalizeMetaState2 & i30)) * (-50)))) - 1;
                int i33 = PlaybackStateCompat;
                int i34 = ((i33 | 3) << 1) - (i33 ^ 3);
                MediaSessionCompatToken = i34 % Fields.SpotShadowColor;
                int i35 = i34 % 2;
                int i36 = ~iNormalizeMetaState2;
                int i37 = (i36 ^ (-44249)) | (i36 & (-44249));
                int i38 = ~((i37 ^ i30) | (i37 & i30));
                int i39 = ~i30;
                int i40 = ~((-44249) | i39 | iNormalizeMetaState2);
                int i41 = (i32 - (~(-(-(50 * ((i38 ^ i40) | (i38 & i40))))))) - 1;
                int i42 = (i33 ^ 43) + ((i33 & 43) << 1);
                MediaSessionCompatToken = i42 % Fields.SpotShadowColor;
                if (i42 % 2 == 0) {
                    int i43 = ~(((-44249) ^ i39) | ((-44249) & i39));
                    int i44 = ~(((-44249) & iNormalizeMetaState2) | ((-44249) ^ iNormalizeMetaState2));
                    int i45 = (i43 & i44) | (i43 ^ i44);
                    int i46 = ~(i39 | iNormalizeMetaState2);
                    char c = (char) (i41 >>> (50 - ((i45 & i46) | (i45 ^ i46))));
                    Object[] objArr4 = new Object[1];
                    b(iNormalizeMetaState, cArr2, c, new char[]{16029, 9802, 55476, 53420}, new char[]{0, 0, 0, 0}, objArr4);
                    objArr2 = null;
                    method = cls.getMethod((String) objArr4[0], null);
                } else {
                    int i47 = ~(((-44249) ^ i39) | ((-44249) & i39));
                    int i48 = ~(((-44249) & iNormalizeMetaState2) | ((-44249) ^ iNormalizeMetaState2));
                    int i49 = (i47 & i48) | (i47 ^ i48);
                    int i50 = ~((i39 ^ iNormalizeMetaState2) | (i39 & iNormalizeMetaState2));
                    int i51 = -(-(((i49 & i50) | (i49 ^ i50)) * 50));
                    Object[] objArr5 = new Object[1];
                    b(iNormalizeMetaState, cArr2, (char) ((i41 ^ i51) + ((i41 & i51) << 1)), new char[]{16029, 9802, 55476, 53420}, new char[]{0, 0, 0, 0}, objArr5);
                    objArr2 = null;
                    method = cls.getMethod((String) objArr5[0], null);
                }
                Object objInvoke = method.invoke(context, objArr2);
                Object[] objArr6 = new Object[1];
                b(ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{21942, 28342, 38473, 61366, 28424, 6204, 9564, 34572, 3025, 60476, 2774, 49052, 8818, 55418, 28226, 48060, 42954, 36698, 3861, 58801, 62187, 9003, 49834, 8090, 27737, 36582, 39583, 7898, 9887, 16802, 18881, 6334, 18972, 63049}, (char) Color.argb(0, 0, 0, 0), new char[]{4222, 13820, 32415, 51706}, new char[]{0, 0, 0, 0}, objArr6);
                Class<?> cls2 = Class.forName((String) objArr6[0]);
                int i52 = -(ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                int i53 = PlaybackStateCompat + 91;
                MediaSessionCompatToken = i53 % Fields.SpotShadowColor;
                int i54 = i53 % 2;
                int i55 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                Object[] objArr7 = new Object[1];
                b((i52 ^ 1062907146) + ((i52 & 1062907146) << 1), new char[]{50263, 54450, 58928, 62178, 17459}, (char) (((31008 | i55) << 1) - (i55 ^ 31008)), new char[]{2535, 23213, 8255, 44665}, new char[]{0, 0, 0, 0}, objArr7);
                int i56 = cls2.getField((String) objArr7[0]).getInt(objInvoke) & 2;
                int i57 = PlaybackStateCompat + 75;
                int i58 = i57 % Fields.SpotShadowColor;
                MediaSessionCompatToken = i58;
                int i59 = i57 % 2;
                int i60 = (i56 | (-i56)) >> 31;
                int i61 = (~i60) & i;
                int i62 = i60 & (i ^ 1);
                int i63 = (i62 & i61) | (i61 ^ i62);
                int i64 = (~i) & i;
                int i65 = i64 | i64;
                int i66 = i58 + 97;
                PlaybackStateCompat = i66 % Fields.SpotShadowColor;
                int i67 = -i65;
                if (i66 % 2 != 0) {
                    int i68 = (i65 & i67) | (i65 ^ i67);
                    int i69 = ((i68 | (-7)) << 1) - (i68 ^ (-7));
                    i19 = i63 & (~i69);
                    i20 = i & i69;
                } else {
                    int i70 = ((i65 & i67) | (i65 ^ i67)) >> 31;
                    i19 = i63 & (~i70);
                    i20 = i70 & i;
                }
                i4 = (i19 & i20) | (i19 ^ i20);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            i4 = i;
        }
        try {
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(2120081762);
            if (objRemoteActionCompatParcelizer3 == null) {
                char cRed = (char) Color.red(0);
                int i71 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2192;
                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 28;
                byte[] bArr = $$a;
                byte b = bArr[24];
                Object[] objArr8 = new Object[1];
                a(b, (byte) (b | 49), (byte) (bArr[6] + 1), objArr8);
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cRed, i71, iIndexOf, -1366441853, false, (String) objArr8[0], new Class[0]);
            }
            Set set = (Set) ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
            Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-298760278);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cRed2 = (char) Color.red(0);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 2194;
                int i72 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27;
                byte[] bArr2 = $$a;
                byte b2 = (byte) (bArr2[6] + 1);
                Object[] objArr9 = new Object[1];
                a(b2, (byte) (b2 | 38), (byte) (-bArr2[52]), objArr9);
                objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cRed2, iLastIndexOf, i72, 1054959179, false, (String) objArr9[0], null);
            }
            if (!set.contains(((Field) objRemoteActionCompatParcelizer4).get(null))) {
                int i73 = MediaSessionCompatToken;
                int i74 = (i73 ^ 47) + ((i73 & 47) << 1);
                PlaybackStateCompat = i74 % Fields.SpotShadowColor;
                int i75 = i74 % 2;
                Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1109429865);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int keyRepeatDelay = 2193 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 28;
                    byte[] bArr3 = $$a;
                    Object[] objArr10 = new Object[1];
                    a((byte) (bArr3[12] - 1), bArr3[54], (byte) 42, objArr10);
                    objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(scrollBarSize, keyRepeatDelay, tapTimeout, 1829720182, false, (String) objArr10[0], null);
                }
                if (!set.contains(((Field) objRemoteActionCompatParcelizer5).get(null))) {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i76 = MediaSessionCompatToken;
                        i16 = (i76 & 15) + (i76 | 15);
                        PlaybackStateCompat = i16 % Fields.SpotShadowColor;
                        if (i16 % 2 != 0) {
                            i17 = (-1) << (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            cArr = new char[]{7181, 22016, 36673, 35864, 58987, 330, 296, 38001, 59386, 55548, 4920, 24995, 15420, 8681, 25617, 16248, 13562, 34170, 65501, 43642, 56995, 15951, 44291, 27544, 54373, 28121, 3632, 25253};
                            i18 = 0;
                        } else {
                            i17 = (-2) - ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) ^ (-1));
                            cArr = new char[]{7181, 22016, 36673, 35864, 58987, 330, 296, 38001, 59386, 55548, 4920, 24995, 15420, 8681, 25617, 16248, 13562, 34170, 65501, 43642, 56995, 15951, 44291, 27544, 54373, 28121, 3632, 25253};
                            i18 = 0;
                        }
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, i18);
                        int i77 = i17;
                        char[] cArr3 = cArr;
                        int i78 = MediaSessionCompatToken + 53;
                        int i79 = i78 % Fields.SpotShadowColor;
                        PlaybackStateCompat = i79;
                        int i80 = i78 % 2;
                        int i81 = (iMakeMeasureSpec * (-159)) - 7812306;
                        int i82 = -(-(((~iMakeMeasureSpec) | 49134) * 160));
                        int i83 = (i81 ^ i82) + ((i81 & i82) << 1);
                        int i84 = ~i;
                        int i85 = ~((i84 ^ iMakeMeasureSpec) | (i84 & iMakeMeasureSpec));
                        int i86 = ((i79 | 29) << 1) - (i79 ^ 29);
                        MediaSessionCompatToken = i86 % Fields.SpotShadowColor;
                        int i87 = i86 % 2;
                        int i88 = ~(49134 | iMakeMeasureSpec);
                        int i89 = (i83 - (~(-(-((-160) * ((i85 & i88) | (i85 ^ i88))))))) - 1;
                        int i90 = -(-(((~((i84 & (-49135)) | ((-49135) ^ i84))) | iMakeMeasureSpec) * 160));
                        Object[] objArr11 = new Object[1];
                        b(i77, cArr3, (char) ((i89 & i90) + (i90 | i89)), new char[]{64094, 10152, 60970, 61119}, new char[]{0, 0, 0, 0}, objArr11);
                        String str2 = (String) objArr11[0];
                        int i91 = MediaSessionCompatToken + 125;
                        PlaybackStateCompat = i91 % Fields.SpotShadowColor;
                        int i92 = i91 % 2;
                        Object[] objArr12 = {str2};
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1794492419);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            char cAlpha = (char) Color.alpha(0);
                            int packedPositionType = 2645 - ExpandableListView.getPackedPositionType(0L);
                            int iRgb = Color.rgb(0, 0, 0) + 16777238;
                            byte b3 = (byte) ($$a[6] + 1);
                            Object[] objArr13 = new Object[1];
                            a((byte) 24, b3, (byte) (b3 | 41), objArr13);
                            objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cAlpha, packedPositionType, iRgb, 1171920412, false, (String) objArr13[0], new Class[]{String.class});
                        }
                        long jLongValue = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr12)).longValue();
                        long j = 773382652;
                        long j2 = (((long) 477) * j) + (((long) (-475)) * jLongValue);
                        r32 = i4;
                        long j3 = -1;
                        long j4 = ((j ^ j3) | jLongValue) ^ j3;
                        long j5 = jLongValue ^ j3;
                        long jNextInt = new Random().nextInt(2004346257);
                        long j6 = ((j5 | j) | jNextInt) ^ j3;
                        long j7 = j2 + (((long) (-476)) * (j4 | j6)) + (((long) 952) * j6) + (((long) 476) * (j3 ^ ((j5 | (jNextInt ^ j3)) | j))) + ((long) 320067998);
                        int i93 = (int) (j7 >> 32);
                        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                        int i94 = ~iFreeMemory;
                        int i95 = i93 & ((-771501342) + (((~(803913606 | i94)) | 633312804) * (-328)) + ((633312804 | iFreeMemory) * 164) + (((~(iFreeMemory | (-803913607))) | 631936516 | (~(i94 | 805289894))) * 164));
                        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                        i12 = i95 | (((int) j7) & ((-768267661) + (((~(657133720 | iMaxMemory)) | (-2147448539)) * (-140)) + ((~((-1490314819) | iMaxMemory)) * 70) + (((~(iMaxMemory | (-2094360131))) | (-1543403227)) * 70)));
                    } else {
                        context = i4;
                        int i96 = -KeyEvent.normalizeMetaState(0);
                        int i97 = r8lambdaCsFeV_dc3Vpb_LOEOUqdR772I1A.read();
                        int i98 = i96 * 284;
                        int i99 = (i98 ^ 1221516644) + ((i98 & 1221516644) << 1);
                        int i100 = ~i96;
                        int i101 = ~((163202566 & i100) | (i100 ^ 163202566));
                        int i102 = ~(i100 | i97);
                        int i103 = ((i99 - (~(((i102 & i101) | (i101 ^ i102)) * (-283)))) - 1) + ((~(((-163202567) & i96) | ((-163202567) ^ i96))) * 283);
                        int i104 = ~i96;
                        int i105 = (i104 & (-163202567)) | (i104 ^ (-163202567));
                        int i106 = (i103 - (~((~((i105 & i97) | (i105 ^ i97))) * 283))) - 1;
                        char[] cArr4 = {30508};
                        int i107 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                        int i108 = r8lambdaCsFeV_dc3Vpb_LOEOUqdR772I1A.read();
                        int i109 = PlaybackStateCompat + 61;
                        MediaSessionCompatToken = i109 % Fields.SpotShadowColor;
                        int i110 = i109 % 2;
                        int i111 = (15481 ^ i108) | (15481 & i108);
                        int i112 = ~i107;
                        int i113 = (i107 * 628) + 9722068 + (((i111 & i112) | (i111 ^ i112)) * (-627));
                        int i114 = ~(((-15482) & i108) | ((-15482) ^ i108));
                        int i115 = i113 + (((i114 & i107) | (i107 ^ i114)) * (-627));
                        int i116 = ((~((i107 & i108) | (i107 ^ i108))) | (~(15481 | (~i108)))) * 627;
                        Object[] objArr14 = new Object[1];
                        b(i106, cArr4, (char) ((i115 ^ i116) + ((i116 & i115) << 1)), new char[]{1751, 47686, 30985, 43324}, new char[]{0, 0, 0, 0}, objArr14);
                        str = (String) objArr14[0];
                        int i117 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i118 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int i119 = r8lambdaCsFeV_dc3Vpb_LOEOUqdR772I1A.read();
                        int i120 = (i118 * 71) - 3094581;
                        int i121 = ~i118;
                        int i122 = ~((i121 & 44849) | (i121 ^ 44849));
                        int i123 = ~((i119 ^ 44849) | (i119 & 44849));
                        int i124 = -(-(((i122 & i123) | (i122 ^ i123)) * (-140)));
                        int i125 = ((i120 | i124) << 1) - (i120 ^ i124);
                        int i126 = (~((i118 ^ 44849) | (i118 & 44849) | i119)) * 70;
                        int i127 = (i125 ^ i126) + ((i126 & i125) << 1);
                        int i128 = ~((~i118) | 44849);
                        int i129 = ~(((-44850) & i118) | ((-44850) ^ i118));
                        int i130 = (i128 & i129) | (i128 ^ i129);
                        int i131 = i118 ^ i119;
                        Object[] objArr15 = new Object[1];
                        b((i117 & (-1113887425)) + (i117 | (-1113887425)), new char[]{61085, 9263, 25284, 42267, 49294, 48272, 16269, 61348, 14527, 47537, 17143, 31204, 49897}, (char) (i127 + (((~((i118 & i119) | i131)) | i130) * 70)), new char[]{16282, 39789, 12989, 38831}, new char[]{0, 0, 0, 0}, objArr15);
                        objArr = new Object[]{(String) objArr15[0]};
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
                        if (objRemoteActionCompatParcelizer == null) {
                            char c2 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 58126);
                            int i132 = 947 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i133 = 28 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            byte[] bArr4 = $$a;
                            Object[] objArr16 = new Object[1];
                            a((byte) (bArr4[4] - 1), bArr4[17], (byte) 41, objArr16);
                            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c2, i132, i133, 2024488889, false, (String) objArr16[0], new Class[]{String.class});
                        }
                        if (!str.equals(((Method) objRemoteActionCompatParcelizer).invoke(null, objArr))) {
                            int i134 = MediaSessionCompatToken + 73;
                            PlaybackStateCompat = i134 % Fields.SpotShadowColor;
                            int i135 = i134 % 2;
                            i12 = 0;
                            r32 = context;
                        } else {
                            i12 = 1;
                            r32 = context;
                        }
                    }
                    int i136 = (i12 | (-i12)) >> 31;
                    int i137 = (i136 & ((i & (-11)) | ((~i) & 10))) | ((~i136) & i);
                    int i138 = i2 & 32;
                    int i139 = -i138;
                    i13 = (i138 & i139) | (i138 ^ i139);
                    int i140 = MediaSessionCompatToken;
                    i14 = (i140 ^ 7) + ((i140 & 7) << 1);
                    PlaybackStateCompat = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0) {
                        i15 = i13 - 31;
                    } else {
                        i15 = i13 >> 31;
                    }
                    int i141 = i137 & (~i15);
                    int i142 = i15 & i;
                    i5 = (i141 & i142) | (i141 ^ i142);
                    r31 = r32;
                } else if (Build.VERSION.SDK_INT == 30) {
                    int i143 = MediaSessionCompatToken + 21;
                    PlaybackStateCompat = i143 % Fields.SpotShadowColor;
                    int i144 = i143 % 2;
                    i5 = i;
                    r31 = i4;
                } else {
                    try {
                        try {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i710 = MediaSessionCompatToken;
                                i16 = (i710 & 15) + (i710 | 15);
                                PlaybackStateCompat = i16 % Fields.SpotShadowColor;
                                if (i16 % 2 != 0) {
                                    i17 = (-1) << (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                    cArr = new char[]{7181, 22016, 36673, 35864, 58987, 330, 296, 38001, 59386, 55548, 4920, 24995, 15420, 8681, 25617, 16248, 13562, 34170, 65501, 43642, 56995, 15951, 44291, 27544, 54373, 28121, 3632, 25253};
                                    i18 = 0;
                                } else {
                                    i17 = (-2) - ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) ^ (-1));
                                    cArr = new char[]{7181, 22016, 36673, 35864, 58987, 330, 296, 38001, 59386, 55548, 4920, 24995, 15420, 8681, 25617, 16248, 13562, 34170, 65501, 43642, 56995, 15951, 44291, 27544, 54373, 28121, 3632, 25253};
                                    i18 = 0;
                                }
                                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i18, i18);
                                int i711 = i17;
                                char[] cArr5 = cArr;
                                int i712 = MediaSessionCompatToken + 53;
                                int i713 = i712 % Fields.SpotShadowColor;
                                PlaybackStateCompat = i713;
                                int i810 = i712 % 2;
                                int i811 = (iMakeMeasureSpec2 * (-159)) - 7812306;
                                int i812 = -(-(((~iMakeMeasureSpec2) | 49134) * 160));
                                int i813 = (i811 ^ i812) + ((i811 & i812) << 1);
                                int i814 = ~i;
                                int i815 = ~((i814 ^ iMakeMeasureSpec2) | (i814 & iMakeMeasureSpec2));
                                int i816 = ((i713 | 29) << 1) - (i713 ^ 29);
                                MediaSessionCompatToken = i816 % Fields.SpotShadowColor;
                                int i817 = i816 % 2;
                                int i818 = ~(49134 | iMakeMeasureSpec2);
                                int i819 = (i813 - (~(-(-((-160) * ((i815 & i818) | (i815 ^ i818))))))) - 1;
                                int i910 = -(-(((~((i814 & (-49135)) | ((-49135) ^ i814))) | iMakeMeasureSpec2) * 160));
                                Object[] objArr17 = new Object[1];
                                b(i711, cArr5, (char) ((i819 & i910) + (i910 | i819)), new char[]{64094, 10152, 60970, 61119}, new char[]{0, 0, 0, 0}, objArr17);
                                String str3 = (String) objArr17[0];
                                int i911 = MediaSessionCompatToken + 125;
                                PlaybackStateCompat = i911 % Fields.SpotShadowColor;
                                int i912 = i911 % 2;
                                try {
                                    Object[] objArr18 = {str3};
                                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1794492419);
                                    if (objRemoteActionCompatParcelizer2 == null) {
                                        char cAlpha2 = (char) Color.alpha(0);
                                        int packedPositionType2 = 2645 - ExpandableListView.getPackedPositionType(0L);
                                        int iRgb2 = Color.rgb(0, 0, 0) + 16777238;
                                        byte b4 = (byte) ($$a[6] + 1);
                                        Object[] objArr19 = new Object[1];
                                        a((byte) 24, b4, (byte) (b4 | 41), objArr19);
                                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cAlpha2, packedPositionType2, iRgb2, 1171920412, false, (String) objArr19[0], new Class[]{String.class});
                                    }
                                    long jLongValue2 = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr18)).longValue();
                                    long j8 = 773382652;
                                    long j9 = (((long) 477) * j8) + (((long) (-475)) * jLongValue2);
                                    r32 = i4;
                                    long j10 = -1;
                                    long j11 = ((j8 ^ j10) | jLongValue2) ^ j10;
                                    long j12 = jLongValue2 ^ j10;
                                    long jNextInt2 = new Random().nextInt(2004346257);
                                    long j13 = ((j12 | j8) | jNextInt2) ^ j10;
                                    long j14 = j9 + (((long) (-476)) * (j11 | j13)) + (((long) 952) * j13) + (((long) 476) * (j10 ^ ((j12 | (jNextInt2 ^ j10)) | j8))) + ((long) 320067998);
                                    int i913 = (int) (j14 >> 32);
                                    int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                                    int i914 = ~iFreeMemory2;
                                    int i915 = i913 & ((-771501342) + (((~(803913606 | i914)) | 633312804) * (-328)) + ((633312804 | iFreeMemory2) * 164) + (((~(iFreeMemory2 | (-803913607))) | 631936516 | (~(i914 | 805289894))) * 164));
                                    int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                    i12 = i915 | (((int) j14) & ((-768267661) + (((~(657133720 | iMaxMemory2)) | (-2147448539)) * (-140)) + ((~((-1490314819) | iMaxMemory2)) * 70) + (((~(iMaxMemory2 | (-2094360131))) | (-1543403227)) * 70)));
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } else {
                                context = i4;
                                int i916 = -KeyEvent.normalizeMetaState(0);
                                int i917 = r8lambdaCsFeV_dc3Vpb_LOEOUqdR772I1A.read();
                                int i918 = i916 * 284;
                                int i919 = (i918 ^ 1221516644) + ((i918 & 1221516644) << 1);
                                int i1010 = ~i916;
                                int i1011 = ~((163202566 & i1010) | (i1010 ^ 163202566));
                                int i1012 = ~(i1010 | i917);
                                int i1013 = ((i919 - (~(((i1012 & i1011) | (i1011 ^ i1012)) * (-283)))) - 1) + ((~(((-163202567) & i916) | ((-163202567) ^ i916))) * 283);
                                int i1014 = ~i916;
                                int i1015 = (i1014 & (-163202567)) | (i1014 ^ (-163202567));
                                int i1016 = (i1013 - (~((~((i1015 & i917) | (i1015 ^ i917))) * 283))) - 1;
                                char[] cArr6 = {30508};
                                int i1017 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                int i1018 = r8lambdaCsFeV_dc3Vpb_LOEOUqdR772I1A.read();
                                int i1019 = PlaybackStateCompat + 61;
                                MediaSessionCompatToken = i1019 % Fields.SpotShadowColor;
                                int i1110 = i1019 % 2;
                                int i1111 = (15481 ^ i1018) | (15481 & i1018);
                                int i1112 = ~i1017;
                                int i1113 = (i1017 * 628) + 9722068 + (((i1111 & i1112) | (i1111 ^ i1112)) * (-627));
                                int i1114 = ~(((-15482) & i1018) | ((-15482) ^ i1018));
                                int i1115 = i1113 + (((i1114 & i1017) | (i1017 ^ i1114)) * (-627));
                                int i1116 = ((~((i1017 & i1018) | (i1017 ^ i1018))) | (~(15481 | (~i1018)))) * 627;
                                Object[] objArr110 = new Object[1];
                                b(i1016, cArr6, (char) ((i1115 ^ i1116) + ((i1116 & i1115) << 1)), new char[]{1751, 47686, 30985, 43324}, new char[]{0, 0, 0, 0}, objArr110);
                                str = (String) objArr110[0];
                                int i1117 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                int i1118 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                int i1119 = r8lambdaCsFeV_dc3Vpb_LOEOUqdR772I1A.read();
                                int i1210 = (i1118 * 71) - 3094581;
                                int i1211 = ~i1118;
                                int i1212 = ~((i1211 & 44849) | (i1211 ^ 44849));
                                int i1213 = ~((i1119 ^ 44849) | (i1119 & 44849));
                                int i1214 = -(-(((i1212 & i1213) | (i1212 ^ i1213)) * (-140)));
                                int i1215 = ((i1210 | i1214) << 1) - (i1210 ^ i1214);
                                int i1216 = (~((i1118 ^ 44849) | (i1118 & 44849) | i1119)) * 70;
                                int i1217 = (i1215 ^ i1216) + ((i1216 & i1215) << 1);
                                int i1218 = ~((~i1118) | 44849);
                                int i1219 = ~(((-44850) & i1118) | ((-44850) ^ i1118));
                                int i1310 = (i1218 & i1219) | (i1218 ^ i1219);
                                int i1311 = i1118 ^ i1119;
                                Object[] objArr111 = new Object[1];
                                b((i1117 & (-1113887425)) + (i1117 | (-1113887425)), new char[]{61085, 9263, 25284, 42267, 49294, 48272, 16269, 61348, 14527, 47537, 17143, 31204, 49897}, (char) (i1217 + (((~((i1118 & i1119) | i1311)) | i1310) * 70)), new char[]{16282, 39789, 12989, 38831}, new char[]{0, 0, 0, 0}, objArr111);
                                try {
                                    objArr = new Object[]{(String) objArr111[0]};
                                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
                                    if (objRemoteActionCompatParcelizer == null) {
                                        char c3 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 58126);
                                        int i1312 = 947 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i1313 = 28 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                        byte[] bArr5 = $$a;
                                        Object[] objArr112 = new Object[1];
                                        a((byte) (bArr5[4] - 1), bArr5[17], (byte) 41, objArr112);
                                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c3, i1312, i1313, 2024488889, false, (String) objArr112[0], new Class[]{String.class});
                                    }
                                    if (!str.equals(((Method) objRemoteActionCompatParcelizer).invoke(null, objArr))) {
                                        int i1314 = MediaSessionCompatToken + 73;
                                        PlaybackStateCompat = i1314 % Fields.SpotShadowColor;
                                        int i1315 = i1314 % 2;
                                        i12 = 0;
                                        r32 = context;
                                    } else {
                                        i12 = 1;
                                        r32 = context;
                                    }
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        context = i4;
                    }
                    int i1316 = (i12 | (-i12)) >> 31;
                    int i1317 = (i1316 & ((i & (-11)) | ((~i) & 10))) | ((~i1316) & i);
                    int i1318 = i2 & 32;
                    int i1319 = -i1318;
                    i13 = (i1318 & i1319) | (i1318 ^ i1319);
                    int i145 = MediaSessionCompatToken;
                    i14 = (i145 ^ 7) + ((i145 & 7) << 1);
                    PlaybackStateCompat = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0) {
                        i15 = i13 - 31;
                    } else {
                        i15 = i13 >> 31;
                    }
                    int i146 = i1317 & (~i15);
                    int i147 = i15 & i;
                    i5 = (i146 & i147) | (i146 ^ i147);
                    r31 = r32;
                }
            } else if (Build.VERSION.SDK_INT == 30) {
                int i148 = MediaSessionCompatToken + 21;
                PlaybackStateCompat = i148 % Fields.SpotShadowColor;
                int i149 = i148 % 2;
                i5 = i;
                r31 = i4;
            } else {
                if (Build.VERSION.SDK_INT > 33) {
                    int i714 = MediaSessionCompatToken;
                    i16 = (i714 & 15) + (i714 | 15);
                    PlaybackStateCompat = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 != 0) {
                        i17 = (-1) << (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        cArr = new char[]{7181, 22016, 36673, 35864, 58987, 330, 296, 38001, 59386, 55548, 4920, 24995, 15420, 8681, 25617, 16248, 13562, 34170, 65501, 43642, 56995, 15951, 44291, 27544, 54373, 28121, 3632, 25253};
                        i18 = 0;
                    } else {
                        i17 = (-2) - ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) ^ (-1));
                        cArr = new char[]{7181, 22016, 36673, 35864, 58987, 330, 296, 38001, 59386, 55548, 4920, 24995, 15420, 8681, 25617, 16248, 13562, 34170, 65501, 43642, 56995, 15951, 44291, 27544, 54373, 28121, 3632, 25253};
                        i18 = 0;
                    }
                    int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i18, i18);
                    int i715 = i17;
                    char[] cArr7 = cArr;
                    int i716 = MediaSessionCompatToken + 53;
                    int i717 = i716 % Fields.SpotShadowColor;
                    PlaybackStateCompat = i717;
                    int i8110 = i716 % 2;
                    int i8111 = (iMakeMeasureSpec3 * (-159)) - 7812306;
                    int i8112 = -(-(((~iMakeMeasureSpec3) | 49134) * 160));
                    int i8113 = (i8111 ^ i8112) + ((i8111 & i8112) << 1);
                    int i8114 = ~i;
                    int i8115 = ~((i8114 ^ iMakeMeasureSpec3) | (i8114 & iMakeMeasureSpec3));
                    int i8116 = ((i717 | 29) << 1) - (i717 ^ 29);
                    MediaSessionCompatToken = i8116 % Fields.SpotShadowColor;
                    int i8117 = i8116 % 2;
                    int i8118 = ~(49134 | iMakeMeasureSpec3);
                    int i8119 = (i8113 - (~(-(-((-160) * ((i8115 & i8118) | (i8115 ^ i8118))))))) - 1;
                    int i9110 = -(-(((~((i8114 & (-49135)) | ((-49135) ^ i8114))) | iMakeMeasureSpec3) * 160));
                    Object[] objArr113 = new Object[1];
                    b(i715, cArr7, (char) ((i8119 & i9110) + (i9110 | i8119)), new char[]{64094, 10152, 60970, 61119}, new char[]{0, 0, 0, 0}, objArr113);
                    String str4 = (String) objArr113[0];
                    int i9111 = MediaSessionCompatToken + 125;
                    PlaybackStateCompat = i9111 % Fields.SpotShadowColor;
                    int i9112 = i9111 % 2;
                    Object[] objArr114 = {str4};
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1794492419);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        char cAlpha3 = (char) Color.alpha(0);
                        int packedPositionType3 = 2645 - ExpandableListView.getPackedPositionType(0L);
                        int iRgb3 = Color.rgb(0, 0, 0) + 16777238;
                        byte b5 = (byte) ($$a[6] + 1);
                        Object[] objArr115 = new Object[1];
                        a((byte) 24, b5, (byte) (b5 | 41), objArr115);
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cAlpha3, packedPositionType3, iRgb3, 1171920412, false, (String) objArr115[0], new Class[]{String.class});
                    }
                    long jLongValue3 = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr114)).longValue();
                    long j15 = 773382652;
                    long j16 = (((long) 477) * j15) + (((long) (-475)) * jLongValue3);
                    r32 = i4;
                    long j17 = -1;
                    long j18 = ((j15 ^ j17) | jLongValue3) ^ j17;
                    long j19 = jLongValue3 ^ j17;
                    long jNextInt3 = new Random().nextInt(2004346257);
                    long j110 = ((j19 | j15) | jNextInt3) ^ j17;
                    long j111 = j16 + (((long) (-476)) * (j18 | j110)) + (((long) 952) * j110) + (((long) 476) * (j17 ^ ((j19 | (jNextInt3 ^ j17)) | j15))) + ((long) 320067998);
                    int i9113 = (int) (j111 >> 32);
                    int iFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
                    int i9114 = ~iFreeMemory3;
                    int i9115 = i9113 & ((-771501342) + (((~(803913606 | i9114)) | 633312804) * (-328)) + ((633312804 | iFreeMemory3) * 164) + (((~(iFreeMemory3 | (-803913607))) | 631936516 | (~(i9114 | 805289894))) * 164));
                    int iMaxMemory3 = (int) Runtime.getRuntime().maxMemory();
                    i12 = i9115 | (((int) j111) & ((-768267661) + (((~(657133720 | iMaxMemory3)) | (-2147448539)) * (-140)) + ((~((-1490314819) | iMaxMemory3)) * 70) + (((~(iMaxMemory3 | (-2094360131))) | (-1543403227)) * 70)));
                } else {
                    context = i4;
                    int i9116 = -KeyEvent.normalizeMetaState(0);
                    int i9117 = r8lambdaCsFeV_dc3Vpb_LOEOUqdR772I1A.read();
                    int i9118 = i9116 * 284;
                    int i9119 = (i9118 ^ 1221516644) + ((i9118 & 1221516644) << 1);
                    int i10110 = ~i9116;
                    int i10111 = ~((163202566 & i10110) | (i10110 ^ 163202566));
                    int i10112 = ~(i10110 | i9117);
                    int i10113 = ((i9119 - (~(((i10112 & i10111) | (i10111 ^ i10112)) * (-283)))) - 1) + ((~(((-163202567) & i9116) | ((-163202567) ^ i9116))) * 283);
                    int i10114 = ~i9116;
                    int i10115 = (i10114 & (-163202567)) | (i10114 ^ (-163202567));
                    int i10116 = (i10113 - (~((~((i10115 & i9117) | (i10115 ^ i9117))) * 283))) - 1;
                    char[] cArr8 = {30508};
                    int i10117 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                    int i10118 = r8lambdaCsFeV_dc3Vpb_LOEOUqdR772I1A.read();
                    int i10119 = PlaybackStateCompat + 61;
                    MediaSessionCompatToken = i10119 % Fields.SpotShadowColor;
                    int i11110 = i10119 % 2;
                    int i11111 = (15481 ^ i10118) | (15481 & i10118);
                    int i11112 = ~i10117;
                    int i11113 = (i10117 * 628) + 9722068 + (((i11111 & i11112) | (i11111 ^ i11112)) * (-627));
                    int i11114 = ~(((-15482) & i10118) | ((-15482) ^ i10118));
                    int i11115 = i11113 + (((i11114 & i10117) | (i10117 ^ i11114)) * (-627));
                    int i11116 = ((~((i10117 & i10118) | (i10117 ^ i10118))) | (~(15481 | (~i10118)))) * 627;
                    Object[] objArr116 = new Object[1];
                    b(i10116, cArr8, (char) ((i11115 ^ i11116) + ((i11116 & i11115) << 1)), new char[]{1751, 47686, 30985, 43324}, new char[]{0, 0, 0, 0}, objArr116);
                    str = (String) objArr116[0];
                    int i11117 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i11118 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int i11119 = r8lambdaCsFeV_dc3Vpb_LOEOUqdR772I1A.read();
                    int i12110 = (i11118 * 71) - 3094581;
                    int i12111 = ~i11118;
                    int i12112 = ~((i12111 & 44849) | (i12111 ^ 44849));
                    int i12113 = ~((i11119 ^ 44849) | (i11119 & 44849));
                    int i12114 = -(-(((i12112 & i12113) | (i12112 ^ i12113)) * (-140)));
                    int i12115 = ((i12110 | i12114) << 1) - (i12110 ^ i12114);
                    int i12116 = (~((i11118 ^ 44849) | (i11118 & 44849) | i11119)) * 70;
                    int i12117 = (i12115 ^ i12116) + ((i12116 & i12115) << 1);
                    int i12118 = ~((~i11118) | 44849);
                    int i12119 = ~(((-44850) & i11118) | ((-44850) ^ i11118));
                    int i13110 = (i12118 & i12119) | (i12118 ^ i12119);
                    int i13111 = i11118 ^ i11119;
                    Object[] objArr117 = new Object[1];
                    b((i11117 & (-1113887425)) + (i11117 | (-1113887425)), new char[]{61085, 9263, 25284, 42267, 49294, 48272, 16269, 61348, 14527, 47537, 17143, 31204, 49897}, (char) (i12117 + (((~((i11118 & i11119) | i13111)) | i13110) * 70)), new char[]{16282, 39789, 12989, 38831}, new char[]{0, 0, 0, 0}, objArr117);
                    objArr = new Object[]{(String) objArr117[0]};
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1468326312);
                    if (objRemoteActionCompatParcelizer == null) {
                        char c4 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 58126);
                        int i13112 = 947 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i13113 = 28 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte[] bArr6 = $$a;
                        Object[] objArr118 = new Object[1];
                        a((byte) (bArr6[4] - 1), bArr6[17], (byte) 41, objArr118);
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c4, i13112, i13113, 2024488889, false, (String) objArr118[0], new Class[]{String.class});
                    }
                    if (!str.equals(((Method) objRemoteActionCompatParcelizer).invoke(null, objArr))) {
                        int i13114 = MediaSessionCompatToken + 73;
                        PlaybackStateCompat = i13114 % Fields.SpotShadowColor;
                        int i13115 = i13114 % 2;
                        i12 = 0;
                        r32 = context;
                    } else {
                        i12 = 1;
                        r32 = context;
                    }
                }
                int i13116 = (i12 | (-i12)) >> 31;
                int i13117 = (i13116 & ((i & (-11)) | ((~i) & 10))) | ((~i13116) & i);
                int i13118 = i2 & 32;
                int i13119 = -i13118;
                i13 = (i13118 & i13119) | (i13118 ^ i13119);
                int i1410 = MediaSessionCompatToken;
                i14 = (i1410 ^ 7) + ((i1410 & 7) << 1);
                PlaybackStateCompat = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    i15 = i13 - 31;
                } else {
                    i15 = i13 >> 31;
                }
                int i1411 = i13117 & (~i15);
                int i1412 = i15 & i;
                i5 = (i1411 & i1412) | (i1411 ^ i1412);
                r31 = r32;
            }
            ?? r3 = i ^ r31;
            int i150 = -(r3 == true ? 1 : 0);
            int i151 = (((r3 == true ? 1 : 0) & i150) | ((r3 == true ? 1 : 0) ^ i150)) >> 31;
            int i152 = (i5 & (~i151)) | (r31 & i151);
            Object[] objArr20 = {new int[]{i152}, null, new int[]{i}, new int[1]};
            int i153 = MediaSessionCompatToken;
            int i154 = (i153 ^ 21) + ((i153 & 21) << 1);
            int i155 = i154 % Fields.SpotShadowColor;
            PlaybackStateCompat = i155;
            int i156 = i154 % 2;
            int i157 = i ^ i152;
            int i158 = -i157;
            int i159 = (((i157 & i158) | (i157 ^ i158)) >> 31) & 16;
            int i160 = (i155 ^ 13) + ((i155 & 13) << 1);
            MediaSessionCompatToken = i160 % Fields.SpotShadowColor;
            int i161 = i160 % 2;
            int iMyUid = Process.myUid();
            int i162 = ~iMyUid;
            int i163 = (-1513090303) + (((~((-690708454) | i162)) | 690504704 | (~((-958948377) | i162)) | (~(959152125 | iMyUid))) * (-84));
            int i164 = (~(iMyUid | (-958948377))) | 690708453;
            int i165 = ~(i162 | 958948376);
            int i166 = i163 + ((i164 | i165) * (-84)) + (((-959152126) | i165) * 84);
            int i167 = MediaSessionCompatToken;
            int i168 = (i167 & 77) + (i167 | 77);
            PlaybackStateCompat = i168 % Fields.SpotShadowColor;
            if (i168 % 2 != 0) {
                i6 = i166 % i159;
                i7 = r8lambdaCsFeV_dc3Vpb_LOEOUqdR772I1A.read();
                int i169 = -(-i3);
                i8 = ((i6 + 868) - (~(-(-((i169 ^ 868) + ((i169 & 868) << 1)))))) - 1;
            } else {
                i6 = (i166 & i159) + (i166 | i159);
                i7 = r8lambdaCsFeV_dc3Vpb_LOEOUqdR772I1A.read();
                int i170 = i6 * 868;
                int i171 = i3 * 868;
                i8 = ((i170 & i171) << 1) + (i170 ^ i171);
            }
            int i172 = ~i6;
            int i173 = ~i7;
            int i174 = ~((i172 & i173) | (i172 ^ i173));
            int i175 = PlaybackStateCompat;
            int i176 = (i175 & 105) + (i175 | 105);
            int i177 = i176 % Fields.SpotShadowColor;
            MediaSessionCompatToken = i177;
            if (i176 % 2 == 0) {
                i9 = ~i3;
                int i178 = ~i7;
                i10 = i8 % ((-867) >>> (i174 | (~((i178 & i9) | (i9 ^ i178)))));
                int i179 = ~i6;
                i11 = (~((i179 & i9) | (i179 ^ i9))) | (~((~i6) | i7));
            } else {
                i9 = ~i3;
                int i180 = ~i7;
                int i181 = ~((i180 & i9) | (i9 ^ i180));
                i10 = (i8 - (~((-867) * ((i174 & i181) | (i174 ^ i181))))) - 1;
                int i182 = ~i6;
                int i183 = ~i3;
                int i184 = ~((i182 & i183) | (i182 ^ i183));
                int i185 = ~i6;
                int i186 = ~((i185 & i7) | (i185 ^ i7));
                i11 = (i184 & i186) | (i184 ^ i186);
            }
            int i187 = (-1734) * (i11 | (~((i9 & i7) | (i9 ^ i7))));
            int i188 = ((i10 | i187) << 1) - (i10 ^ i187);
            int i189 = ~i6;
            int i190 = ~i3;
            int i191 = i189 | i190;
            int i192 = ~i7;
            int i193 = ~((i191 & i192) | (i191 ^ i192));
            int i194 = ~i6;
            int i195 = (i3 & i194) | (i194 ^ i3);
            int i196 = i193 | (~((i195 & i7) | (i195 ^ i7)));
            int i197 = (i190 ^ i6) | (i190 & i6);
            int i198 = ~((i7 & i197) | (i197 ^ i7));
            int i199 = i188 + (((i198 & i196) | (i196 ^ i198)) * 867);
            int i200 = (i199 << 13) ^ i199;
            int i201 = i200 >>> 17;
            int i202 = (i200 | i201) & (~(i200 & i201));
            ((int[]) objArr20[3])[0] = i202 ^ (i202 << 5);
            int i203 = i177 + 93;
            PlaybackStateCompat = i203 % Fields.SpotShadowColor;
            int i204 = i203 % 2;
            return objArr20;
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }
}
