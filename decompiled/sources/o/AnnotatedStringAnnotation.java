package o;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetsDownloadingWorker;
import com.roadrunner.rider.support.implementation.data.RiderSupportBatchRequestLogger;
import io.sentry.CombinedScopeView;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class AnnotatedStringAnnotation extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public getHeightXSAIIZE RemoteActionCompatParcelizer;
    public int serializer;
    public final /* synthetic */ ChatAssetsDownloadingWorker write;
    private static final byte[] $$b = {30, -11, 99, -67};
    private static final int $$c = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int MediaSessionCompatQueueItem = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int[] read = {1920899132, -1514418775, 1957231159, 333318653, -1758746821, 440406801, -877878643, 1913924047, 182324270, -666836748, -1144132571, 1885917168, -1197897676, 1634879558, -20504630, -1267641725, -91800449, -1416109176};

    private static String $$d(byte b, short s, int i) {
        byte[] bArr = $$b;
        int i2 = (b * 2) + 116;
        int i3 = 4 - (s * 2);
        int i4 = i * 2;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i2 = (-i2) + i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i3++;
            i2 = (-bArr[i3]) + i2;
            i6 = i7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotatedStringAnnotation(ChatAssetsDownloadingWorker chatAssetsDownloadingWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = chatAssetsDownloadingWorker;
    }

    public static void $$a(long j, long j2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 99;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "", 0) + 9, new int[]{1963031147, 1160072629, -423954811, 705445671, -1412600042, 691940011}, objArr);
        RiderSupportBatchRequestLogger.class.getField((String) objArr[0]).get(null);
        Object obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj != null) {
                Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                int i4 = MediaBrowserCompatMediaItem + 55;
                MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Object[] objArr2 = {Long.valueOf(j3)};
                Object[] objArr3 = new Object[1];
                a(3 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), new int[]{140534544, 1332879738}, objArr3);
                Method method = AtomicLong.class.getMethod((String) objArr3[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj2, objArr2);
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr4 = new Object[0];
                Object[] objArr5 = new Object[1];
                a(37 - TextUtils.getCapsMode("", 0, 0), new int[]{-1791046565, 1781984128, 925744743, -1258919077, 1136426749, -1971064492, -2105723303, 431561159, -1301288483, 685486106, 1229822837, 1298134466, -1149780320, -1395556589, -1524468504, -1682540134, 1471007083, -1659809145, 575650368, 569258324}, objArr5);
                String str = (String) objArr5[0];
                int i6 = MediaBrowserCompatMediaItem + 63;
                MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                method2.setAccessible(true);
                method2.invoke(obj3, str, objArr4);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objDoWork;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 87;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            objDoWork = this.write.doWork(this);
            int i3 = 18 / 0;
        } else {
            this.IconCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            objDoWork = this.write.doWork(this);
        }
        int i4 = MediaBrowserCompatMediaItem + 61;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objDoWork;
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        ceilAwayFromZero ceilawayfromzero = new ceilAwayFromZero();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = read;
        float f = 0.0f;
        int i4 = -25295696;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 109;
                $10 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i6] = Integer.valueOf(iArr2[i7]);
                        Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(i4);
                        if (objRemoteActionCompatParcelizer == null) {
                            char offsetAfter = (char) TextUtils.getOffsetAfter("", i6);
                            int i9 = (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 2751;
                            int iGreen = android.graphics.Color.green(i6) + 9;
                            byte b = (byte) $$c;
                            byte b2 = b;
                            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(offsetAfter, i9, iGreen, 783164753, false, $$d(b, b2, b2), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                    Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-25295696);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        char windowTouchSlop = (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
                        int scrollBarFadeDuration = (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2752;
                        int i10 = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8;
                        byte b3 = (byte) $$c;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(windowTouchSlop, scrollBarFadeDuration, i10, 783164753, false, $$d(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                }
                i7++;
                i2 = 2;
                f = 0.0f;
                i4 = -25295696;
                i6 = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = read;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $10 + 89;
                $11 = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    try {
                        Object[] objArr4 = new Object[i5];
                        objArr4[0] = Integer.valueOf(iArr5[i11]);
                        Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-25295696);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int iKeyCodeFromString = android.view.KeyEvent.keyCodeFromString("") + 2752;
                            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 9;
                            byte b5 = (byte) $$c;
                            byte b6 = b5;
                            objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(c, iKeyCodeFromString, iIndexOf, 783164753, false, $$d(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        iArr6[i11] = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                        i11 %= 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    length3 = length3;
                    Object[] objArr5 = {Integer.valueOf(iArr5[i11])};
                    Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-25295696);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cRed = (char) android.graphics.Color.red(0);
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 2753;
                        int capsMode = 9 - TextUtils.getCapsMode("", 0, 0);
                        byte b7 = (byte) $$c;
                        byte b8 = b7;
                        objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cRed, iIndexOf2, capsMode, 783164753, false, $$d(b7, b8, b8), new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                    i11++;
                }
                length3 = length3;
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
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                int i15 = $11 + 65;
                $10 = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
                ceilawayfromzero.RemoteActionCompatParcelizer ^= iArr4[i13];
                Object[] objArr6 = {ceilawayfromzero, Integer.valueOf(ceilAwayFromZero.read(ceilawayfromzero.RemoteActionCompatParcelizer)), ceilawayfromzero, ceilawayfromzero};
                Object objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-98334374);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char size = (char) View.MeasureSpec.getSize(0);
                    int iBlue = android.graphics.Color.blue(0) + 1758;
                    int iMakeMeasureSpec = 46 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int i17 = $$c;
                    byte b9 = (byte) (i17 + 1);
                    byte b10 = (byte) i17;
                    objRemoteActionCompatParcelizer5 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(size, iBlue, iMakeMeasureSpec, 720611515, false, $$d(b9, b10, b10), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).intValue();
                ceilawayfromzero.RemoteActionCompatParcelizer = ceilawayfromzero.read;
                ceilawayfromzero.read = iIntValue;
                i13++;
            }
            int i18 = ceilawayfromzero.RemoteActionCompatParcelizer;
            ceilawayfromzero.RemoteActionCompatParcelizer = ceilawayfromzero.read;
            ceilawayfromzero.read = i18;
            ceilawayfromzero.read ^= iArr4[16];
            ceilawayfromzero.RemoteActionCompatParcelizer ^= iArr4[17];
            int i19 = ceilawayfromzero.RemoteActionCompatParcelizer;
            int i20 = ceilawayfromzero.read;
            cArr[0] = (char) (ceilawayfromzero.RemoteActionCompatParcelizer >>> 16);
            cArr[1] = (char) ceilawayfromzero.RemoteActionCompatParcelizer;
            cArr[2] = (char) (ceilawayfromzero.read >>> 16);
            cArr[3] = (char) ceilawayfromzero.read;
            ceilAwayFromZero.RemoteActionCompatParcelizer(iArr4);
            cArr2[ceilawayfromzero.serializer * 2] = cArr[0];
            cArr2[(ceilawayfromzero.serializer * 2) + 1] = cArr[1];
            cArr2[(ceilawayfromzero.serializer * 2) + 2] = cArr[2];
            cArr2[(ceilawayfromzero.serializer * 2) + 3] = cArr[3];
            Object[] objArr7 = {ceilawayfromzero, ceilawayfromzero};
            Object objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(82275544);
            if (objRemoteActionCompatParcelizer6 == null) {
                char jumpTapTimeout = (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16);
                int i21 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1276;
                int scrollDefaultDelay = 28 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i22 = $$c;
                byte b11 = (byte) (i22 + 2);
                byte b12 = (byte) i22;
                objRemoteActionCompatParcelizer6 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(jumpTapTimeout, i21, scrollDefaultDelay, -734573255, false, $$d(b11, b12, b12), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
