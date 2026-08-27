package o;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.ExpandableListView;
import com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.helpcenter.businessmetrics.BusinessMetricsTracker;
import com.roadrunner.helpcenter.dispatcher_chat.WebDispatcherChat;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.rider.support.implementation.RiderSupportRootedCheckImpl;
import com.roadrunner.rider.support.implementation.data.RiderSupportBreakRequestLogger;
import com.sentiance.core.model.events.H$b;
import io.grpc.internal.SharedResourcePool;
import io.sentry.CombinedScopeView;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.DelayKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class getParentFragmentManager implements getPopExitAnim {
    public final r8lambdaYSi20pxlMiebc1pB9oHakC0OvU IconCompatParcelizer;
    private static final byte[] $$b = {86, 123, -90};
    private static final int $$c = 217;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int serializer = 0;
    private static int read = 1;
    private static char[] RemoteActionCompatParcelizer = {5625, 5526, 5527, 5536, 5536, 5542, 5545, 5541, 5538, 5350, 5351, 5332, 5607, 5523, 5544, 5546, 5541, 5511, 5623, 5546, 5564, 5566, 5537, 5566, 5565, 5529, 5603, 5624, 5523, 5541, 5545, 5544, 5541, 5511, 5513, 5536, 5567, 5508, 5514, 5541, 5541, 5536, 5536, 5547, 5544, 5540, 5567, 5537, 5546};

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$d(int r6, short r7, short r8) {
        /*
            int r6 = r6 + 3
            byte[] r0 = o.getParentFragmentManager.$$b
            int r8 = r8 * 3
            int r8 = 122 - r8
            int r7 = r7 * 2
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getParentFragmentManager.$$d(int, short, short):java.lang.String");
    }

    public getParentFragmentManager(r8lambdaYSi20pxlMiebc1pB9oHakC0OvU r8lambdaysi20pxlmiebc1pb9ohakc0ovu) {
        this.IconCompatParcelizer = r8lambdaysi20pxlmiebc1pb9ohakc0ovu;
    }

    public static void $$a(long j, long j2) throws Throwable {
        int i = 2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a(new int[]{0, 9, 0, 1}, false, new byte[]{0, 1, 0, 0, 1, 1, 1, 1, 0}, objArr);
        RiderSupportBreakRequestLogger.class.getField((String) objArr[0]).get(null);
        Object obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj != null) {
                int i2 = serializer + 51;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                int i4 = read + 85;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    Object[] objArr2 = new Object[0];
                    objArr2[1] = Long.valueOf(j3);
                    Object[] objArr3 = new Object[1];
                    a(new int[]{9, 3, 181, 1}, false, null, objArr3);
                    Method method = AtomicLong.class.getMethod((String) objArr3[0], Long.TYPE);
                    method.setAccessible(true);
                    method.invoke(obj2, objArr2);
                } else {
                    Object[] objArr4 = {Long.valueOf(j3)};
                    Object[] objArr5 = new Object[1];
                    a(new int[]{9, 3, 181, 1}, true, null, objArr5);
                    Method method2 = AtomicLong.class.getMethod((String) objArr5[0], Long.TYPE);
                    method2.setAccessible(true);
                    method2.invoke(obj2, objArr4);
                }
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr6 = new Object[0];
                Object[] objArr7 = new Object[1];
                a(new int[]{12, 37, 0, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1}, objArr7);
                String str = (String) objArr7[0];
                int i5 = read + 7;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    Object[] objArr8 = {objArr6, str};
                    Class[] clsArr = new Class[3];
                    clsArr[1] = String.class;
                    clsArr[0] = Object[].class;
                    Method method3 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", clsArr);
                    method3.setAccessible(false);
                    method3.invoke(obj3, objArr8);
                } else {
                    Method method4 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                    method4.setAccessible(true);
                    method4.invoke(obj3, str, objArr6);
                }
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2;
        int i3 = 2 % 2;
        accessgetScrollAxesk4lQ0M accessgetscrollaxesk4lq0m = new accessgetScrollAxesk4lQ0M();
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = RemoteActionCompatParcelizer;
        long j = 0;
        float f = 0.0f;
        int i9 = -1;
        if (cArr != null) {
            int i10 = $10 + 71;
            $11 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i12 = 0;
            while (i12 < length) {
                try {
                    Object[] objArr2 = new Object[i5];
                    objArr2[0] = Integer.valueOf(cArr[i12]);
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-25206323);
                    if (objRemoteActionCompatParcelizer == null) {
                        char c = (char) (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1));
                        int size = 2752 - View.MeasureSpec.getSize(0);
                        int packedPositionChild = 8 - ExpandableListView.getPackedPositionChild(j);
                        byte b = (byte) i9;
                        byte b2 = (byte) (b + 1);
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c, size, packedPositionChild, 783237164, false, $$d(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i12++;
                    i5 = 1;
                    j = 0;
                    f = 0.0f;
                    i9 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i4, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            accessgetscrollaxesk4lq0m.write = 0;
            char c2 = 0;
            while (accessgetscrollaxesk4lq0m.write < i6) {
                int i13 = $11 + 47;
                $10 = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i13 % 2 == 0 ? bArr[accessgetscrollaxesk4lq0m.write] != 1 : bArr[accessgetscrollaxesk4lq0m.write] != 0) {
                    int i14 = accessgetscrollaxesk4lq0m.write;
                    Object[] objArr3 = {Integer.valueOf(cArr3[accessgetscrollaxesk4lq0m.write]), Integer.valueOf(c2)};
                    Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(340245898);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) android.graphics.Color.green(0), 2547 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 31 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -996696981, false, $$d(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = accessgetscrollaxesk4lq0m.write;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[accessgetscrollaxesk4lq0m.write]), Integer.valueOf(c2)};
                        Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1988698908);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            byte b5 = (byte) (-1);
                            byte b6 = (byte) (b5 + 1);
                            objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (52850 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 1564 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36, -1504115971, false, $$d(b5, b6, (byte) (b6 | 18)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i15] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c2 = cArr4[accessgetscrollaxesk4lq0m.write];
                try {
                    Object[] objArr5 = {accessgetscrollaxesk4lq0m, accessgetscrollaxesk4lq0m};
                    Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1705057313);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 1);
                        objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 15495), 2820 - TextUtils.indexOf((CharSequence) "", '0'), android.graphics.Color.argb(0, 0, 0, 0) + 17, 1250869822, false, $$d(b7, b8, (byte) (b8 | 19)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i16 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i16, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i6];
            accessgetscrollaxesk4lq0m.write = 0;
            while (accessgetscrollaxesk4lq0m.write < i6) {
                int i17 = $11 + 101;
                $10 = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i17 % 2 != 0) {
                    cArr6[accessgetscrollaxesk4lq0m.write] = cArr3[(i6 - accessgetscrollaxesk4lq0m.write) % 1];
                    i2 = accessgetscrollaxesk4lq0m.write - 1;
                } else {
                    cArr6[accessgetscrollaxesk4lq0m.write] = cArr3[(i6 - accessgetscrollaxesk4lq0m.write) - 1];
                    i2 = accessgetscrollaxesk4lq0m.write + 1;
                }
                accessgetscrollaxesk4lq0m.write = i2;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            accessgetscrollaxesk4lq0m.write = 0;
            while (accessgetscrollaxesk4lq0m.write < i6) {
                int i18 = $11 + 51;
                $10 = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i18 % 2 != 0) {
                    cArr3[accessgetscrollaxesk4lq0m.write] = (char) (cArr3[accessgetscrollaxesk4lq0m.write] << iArr[3]);
                    i = accessgetscrollaxesk4lq0m.write;
                } else {
                    cArr3[accessgetscrollaxesk4lq0m.write] = (char) (cArr3[accessgetscrollaxesk4lq0m.write] - iArr[2]);
                    i = accessgetscrollaxesk4lq0m.write + 1;
                }
                accessgetscrollaxesk4lq0m.write = i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public final getLoaderManager serializer(getExitTransition getexittransition) {
        int i = 2 % 2;
        r8lambdaYSi20pxlMiebc1pB9oHakC0OvU r8lambdaysi20pxlmiebc1pb9ohakc0ovu = this.IconCompatParcelizer;
        SemanticsPropertiesContentDescription1 semanticsPropertiesContentDescription1 = (SemanticsPropertiesContentDescription1) ((mergeJsonObjects) r8lambdaysi20pxlmiebc1pb9ohakc0ovu.serializer).write();
        SendTestPushUseCase sendTestPushUseCase = (SendTestPushUseCase) ((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) r8lambdaysi20pxlmiebc1pb9ohakc0ovu.read).write();
        SendTestPushUseCase sendTestPushUseCase2 = new SendTestPushUseCase();
        sendTestPushUseCase2.serializer = DelayKt.serializer(new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(20));
        getLoaderManager getloadermanager = new getLoaderManager(semanticsPropertiesContentDescription1, sendTestPushUseCase, sendTestPushUseCase2, (setTransactionSuccessful) ((mergeJsonObjects) r8lambdaysi20pxlmiebc1pb9ohakc0ovu.IconCompatParcelizer).write(), (RectManager) ((mergeJsonObjects) r8lambdaysi20pxlmiebc1pb9ohakc0ovu.write).write(), new SharedResourcePool(24), (transferSessionPackageI) ((mergeJsonObjects) r8lambdaysi20pxlmiebc1pb9ohakc0ovu.RemoteActionCompatParcelizer).write(), (WebDispatcherChat) ((mergeJsonObjects) r8lambdaysi20pxlmiebc1pb9ohakc0ovu.MediaSessionCompatQueueItem).write(), (setConstraintSet) ((mergeJsonObjects) r8lambdaysi20pxlmiebc1pb9ohakc0ovu.RatingCompat).write(), (BusinessMetricsTracker) ((mergeJsonObjects) r8lambdaysi20pxlmiebc1pb9ohakc0ovu.MediaMetadataCompat).write(), (CustomerChatCommunicatorImpl) ((mergeJsonObjects) r8lambdaysi20pxlmiebc1pb9ohakc0ovu.MediaDescriptionCompat).write(), (OtpLogger) ((executeQuery) r8lambdaysi20pxlmiebc1pb9ohakc0ovu.MediaBrowserCompatMediaItem).write(), (H$b) ((acquire) r8lambdaysi20pxlmiebc1pb9ohakc0ovu.MediaSessionCompatResultReceiverWrapper).write(), (setUdmandroid_sdk_base_release) ((executeQuery) r8lambdaysi20pxlmiebc1pb9ohakc0ovu.ParcelableVolumeInfo).write(), (RiderSupportRootedCheckImpl) ((mergeJsonObjects) r8lambdaysi20pxlmiebc1pb9ohakc0ovu.PlaybackStateCompatCustomAction).write(), (getFragmentManager) ((mergeJsonObjects) r8lambdaysi20pxlmiebc1pb9ohakc0ovu.PlaybackStateCompat).write(), (getExitAnim) ((mergeJsonObjects) r8lambdaysi20pxlmiebc1pb9ohakc0ovu.MediaSessionCompatToken).write(), (setFirstVerticalBias) ((mergeJsonObjects) r8lambdaysi20pxlmiebc1pb9ohakc0ovu.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).write(), (setHorizontalStyle) ((mergeJsonObjects) r8lambdaysi20pxlmiebc1pb9ohakc0ovu.ComponentActivity).write(), getexittransition);
        int i2 = read + 113;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return getloadermanager;
    }
}
