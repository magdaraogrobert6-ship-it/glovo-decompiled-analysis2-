package o;

import android.text.TextUtils;
import android.view.View;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rider.support.implementation.data.RiderSupportBreakRequestLogger;
import io.sentry.CombinedScopeView;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.instance.SingleInstanceFactory$get$1;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class getSerializerfwf_client_release extends getLoggerfwf_client_release {
    public Object RemoteActionCompatParcelizer;
    private static final byte[] $$b = {118, -2, 102, 97};
    private static final int $$c = 71;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int MediaDescriptionCompat = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static char IconCompatParcelizer = 20575;
    private static char read = 63664;
    private static char serializer = 43163;
    private static char MediaSessionCompatQueueItem = 28687;

    private static String $$d(int i, int i2, int i3) {
        byte[] bArr = $$b;
        int i4 = i2 * 4;
        int i5 = 4 - (i * 2);
        int i6 = 109 - (i3 * 2);
        byte[] bArr2 = new byte[i4 + 1];
        int i7 = -1;
        if (bArr == null) {
            i6 += i4;
            i5++;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i6;
            if (i7 == i4) {
                return new String(bArr2, 0);
            }
            i6 += bArr[i5];
            i5++;
        }
    }

    @Override // o.getLoggerfwf_client_release
    public final Object serializer(io.sentry.util.ComponentActivity componentActivity) {
        SingleInstanceFactory$get$1 singleInstanceFactory$get$1 = new SingleInstanceFactory$get$1(this, 0, componentActivity);
        synchronized (this) {
            singleInstanceFactory$get$1.invoke();
        }
        Object obj = this.RemoteActionCompatParcelizer;
        if (obj != null) {
            return obj;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Single instance created couldn't return value");
        return null;
    }

    public static void $$a(long j, long j2) throws Throwable {
        Object obj;
        int i = 2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a(View.combineMeasuredStates(0, 0) + 9, new char[]{5830, 17585, 39724, 6358, 59016, 16216, 44227, 62006, 65279, 63270}, objArr);
        RiderSupportBreakRequestLogger.class.getField((String) objArr[0]).get(null);
        Object obj2 = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj2 != null) {
                int i2 = MediaDescriptionCompat + 49;
                MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    obj = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj2));
                    int i3 = 35 / 0;
                } else {
                    obj = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj2));
                }
                Object[] objArr2 = {Long.valueOf(j3)};
                Object[] objArr3 = new Object[1];
                a(3 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{29547, 30905, 59371, 16209}, objArr3);
                Method method = AtomicLong.class.getMethod((String) objArr3[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj, objArr2);
                int i4 = MediaDescriptionCompat + 87;
                MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr4 = new Object[0];
                Object[] objArr5 = new Object[1];
                a((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36, new char[]{30789, 62463, 19832, 20441, 63252, 44779, 65035, 19942, 3458, 56403, 14290, 7391, 58972, 46388, 25508, 17012, 47595, 63125, 64369, 21971, 63252, 44779, 16870, 16035, 13048, 21402, 15116, 39567, 31179, 4812, 5411, 21981, 50084, 52612, 400, 37763, 39714, 29090}, objArr5);
                String str = (String) objArr5[0];
                int i6 = MediaDescriptionCompat;
                int i7 = i6 + 123;
                MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                int i9 = i6 + 93;
                MediaBrowserCompatMediaItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    Object[] objArr6 = new Object[3];
                    objArr6[1] = objArr4;
                    objArr6[0] = str;
                    Class[] clsArr = new Class[3];
                    clsArr[0] = String.class;
                    clsArr[0] = Object[].class;
                    Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", clsArr);
                    method2.setAccessible(false);
                    method2.invoke(obj3, objArr6);
                } else {
                    Method method3 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                    method3.setAccessible(true);
                    method3.invoke(obj3, str, objArr4);
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

    @Override // o.getLoggerfwf_client_release
    public final Object read(io.sentry.util.ComponentActivity componentActivity) throws InstanceCreationException {
        int i = 2 % 2;
        Object obj = this.RemoteActionCompatParcelizer;
        Object obj2 = null;
        if (obj == null) {
            int i2 = MediaDescriptionCompat + 59;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return super.read(componentActivity);
            }
            super.read(componentActivity);
            obj2.hashCode();
            throw null;
        }
        if (obj == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Single instance created couldn't return value");
            return null;
        }
        int i3 = MediaBrowserCompatMediaItem + 35;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        composeToViewOffset composetoviewoffset = new composeToViewOffset();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        composetoviewoffset.RemoteActionCompatParcelizer = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 57;
        $11 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        while (composetoviewoffset.RemoteActionCompatParcelizer < cArr.length) {
            cArr3[i3] = cArr[composetoviewoffset.RemoteActionCompatParcelizer];
            cArr3[1] = cArr[composetoviewoffset.RemoteActionCompatParcelizer + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 75;
                $10 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                char[] cArr4 = cArr3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i6) ^ ((c2 << 4) + ((char) (((long) serializer) ^ 7962313315467514595L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(MediaSessionCompatQueueItem)};
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-925634939);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 65450), 1244 - View.MeasureSpec.getSize(0), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33, 402902884, false, $$d(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) IconCompatParcelizer) ^ 7962313315467514595L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(read)};
                    Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-925634939);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (65450 - View.resolveSizeAndState(0, 0, 0)), 1244 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 33 - TextUtils.getCapsMode("", 0, 0), 402902884, false, $$d(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[composetoviewoffset.RemoteActionCompatParcelizer] = cArr5[0];
            cArr2[composetoviewoffset.RemoteActionCompatParcelizer + 1] = cArr5[1];
            Object[] objArr4 = {composetoviewoffset, composetoviewoffset};
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(547433723);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) View.resolveSizeAndState(0, 0, 0), 2546 - View.MeasureSpec.getSize(0), TextUtils.getCapsMode("", 0, 0) + 30, -261026534, false, $$d(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i10 = $11 + 111;
        $10 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    public getSerializerfwf_client_release(getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release) {
        super(getexposurehandlerfwf_client_release);
    }
}
