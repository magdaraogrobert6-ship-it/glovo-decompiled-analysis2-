package o;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.roadrunner.rider.support.implementation.data.RiderSupportBatchRequestLogger;
import io.sentry.CombinedScopeView;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
final class PrimitiveResources_androidKt extends TypeToken<List<loadVectorResource>> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    private static long write = -1196611445406516500L;

    public static void $$a(long j, long j2) throws Throwable {
        int i = 2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a(TextUtils.lastIndexOf("", '0') + 62130, new char[]{58331, 4422, 1687, 15355, 10557, 24195, 21463, 16672, 30334}, objArr);
        RiderSupportBatchRequestLogger.class.getField((String) objArr[0]).get(null);
        Object obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj != null) {
                Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                Object[] objArr2 = {Long.valueOf(j3)};
                Object[] objArr3 = new Object[1];
                a(20046 - TextUtils.lastIndexOf("", '0', 0), new char[]{58347, 44466, 32626}, objArr3);
                Method method = AtomicLong.class.getMethod((String) objArr3[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj2, objArr2);
                int i2 = serializer + 9;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr4 = new Object[0];
                Object[] objArr5 = new Object[1];
                a(58512 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{58314, 1918, 10978, 20048, 29142, 38259, 47249, 56324, 51088, 60143, 3681, 12751, 21848, 30945, 40042, 34741, 43783, 52864, 61937, 5472, 14534, 23555, 18364, 27438, 36484, 45647, 54647, 63715, 7253, 2015, 11059, 20136, 29204, 38302, 47388, 56432, 51168}, objArr5);
                String str = (String) objArr5[0];
                int i4 = serializer + 39;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    Object[] objArr6 = new Object[3];
                    objArr6[0] = objArr4;
                    objArr6[0] = str;
                    Class[] clsArr = new Class[3];
                    clsArr[0] = String.class;
                    clsArr[1] = Object[].class;
                    Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", clsArr);
                    method2.setAccessible(true);
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

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        accesstoViewVelocity accesstoviewvelocity = new accesstoViewVelocity();
        accesstoviewvelocity.IconCompatParcelizer = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        accesstoviewvelocity.write = 0;
        int i3 = $10 + 67;
        $11 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 4 % 5;
        }
        while (accesstoviewvelocity.write < cArr.length) {
            int i5 = accesstoviewvelocity.write;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[accesstoviewvelocity.write]), accesstoviewvelocity, accesstoviewvelocity};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1166805757);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (TextUtils.getTrimmedLength("") + 45251), 2179 - TextUtils.indexOf("", "", 0, 0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 14, 1789121762, false, com.braze.Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (write ^ 7879248456549226868L);
                Object[] objArr3 = {accesstoviewvelocity, accesstoviewvelocity};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-692485407);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) TextUtils.getTrimmedLength(""), 231 - android.graphics.Color.red(0), 21 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 107586304, false, "e", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        accesstoviewvelocity.write = 0;
        while (accesstoviewvelocity.write < cArr.length) {
            int i6 = $10 + 33;
            $11 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                cArr2[accesstoviewvelocity.write] = (char) jArr[accesstoviewvelocity.write];
                Object[] objArr4 = {accesstoviewvelocity, accesstoviewvelocity};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-692485407);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((Process.getThreadPriority(0) + 20) >> 6), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 231, 21 - android.graphics.Color.red(0), 107586304, false, "e", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i7 = 47 / 0;
            } else {
                cArr2[accesstoviewvelocity.write] = (char) jArr[accesstoviewvelocity.write];
                Object[] objArr5 = {accesstoviewvelocity, accesstoviewvelocity};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-692485407);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 231 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20, 107586304, false, "e", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
        }
        objArr[0] = new String(cArr2);
    }
}
