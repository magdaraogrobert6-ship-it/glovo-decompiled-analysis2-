package o;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ExpandableListView;
import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.accept.earnings.domain.ObserveMultiplier$invoke$$inlined$map$1$2;
import com.roadrunner.rider.support.implementation.data.RiderSupportFeature;
import com.roadrunner.rider.support.implementation.data.RiderSupportFeature$Companion$logIn$1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class LayoutCompat_androidKt extends ContinuationImpl {
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ ObserveMultiplier$invoke$$inlined$map$1$2 read;
    public int write;
    private static final byte[] $$b = {85, -79, -103, -49};
    private static final int $$c = 191;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    private static char[] IconCompatParcelizer = {27655, 56111, 528, 18718, 45156, 65368, 9739, 28066, 54424, 926, 19182, 45521, 63692, 8292, 39423};
    private static long serializer = -8860373359972307321L;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$d(int r5, int r6, short r7) {
        /*
            byte[] r0 = o.LayoutCompat_androidKt.$$b
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r5 = r5 * 4
            int r5 = r5 + 4
            int r7 = r7 * 2
            int r7 = r7 + 98
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r0[r5]
        L28:
            int r7 = r7 + r4
            int r5 = r5 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LayoutCompat_androidKt.$$d(int, int, short):java.lang.String");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutCompat_androidKt(ObserveMultiplier$invoke$$inlined$map$1$2 observeMultiplier$invoke$$inlined$map$1$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = observeMultiplier$invoke$$inlined$map$1$2;
    }

    public static void $$a(Context context, long j, long j2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 59;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j3 = j ^ (j2 << 32);
        RiderSupportFeature.Companion companion = RiderSupportFeature.Companion;
        Object obj = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
        Object[] objArr = new Object[1];
        a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.graphics.Color.rgb(0, 0, 0) + 16777230, (char) (62967 - AndroidCharacter.getMirror('0')), objArr);
        try {
            Object[] objArr2 = {Long.valueOf(j3), (String) objArr[0]};
            Object[] objArr3 = new Object[1];
            a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, -TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((-1) - Process.getGidForName("")), objArr3);
            Method method = af$$ExternalSyntheticOutline0.class.getMethod((String) objArr3[0], Long.TYPE, String.class);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, objArr2);
            int i4 = MediaMetadataCompat + 81;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Object[] objArr4 = {objInvoke, 10};
            Constructor declaredConstructor = accessstartTrackingTable.class.getDeclaredConstructor(String.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            Object[] objArr5 = {declaredConstructor.newInstance(objArr4)};
            Method method2 = Timber.Forest.class.getMethod("write", Throwable.class);
            method2.setAccessible(true);
            method2.invoke(obj, objArr5);
            getContentViewGroupParentLayout getcontentviewgroupparentlayoutAccess$getCoroutineScope$cp = RiderSupportFeature.access$getCoroutineScope$cp();
            int i6 = MediaBrowserCompatMediaItem + 33;
            MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 5 % 5;
            }
            Constructor declaredConstructor2 = RiderSupportFeature$Companion$logIn$1.class.getDeclaredConstructor(Context.class, ShortNewsContentCardView.class);
            declaredConstructor2.setAccessible(true);
            Object[] objArr6 = {getcontentviewgroupparentlayoutAccess$getCoroutineScope$cp, null, null, declaredConstructor2.newInstance(context, null), 3};
            Method method3 = BuildersKt.class.getMethod("RemoteActionCompatParcelizer", getContentViewGroupParentLayout.class, TextAnnouncementContentCardView.class, CoroutineStart.class, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0.class, Integer.TYPE);
            method3.setAccessible(true);
            method3.invoke(null, objArr6);
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
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 47;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return this.read.emit(null, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        this.read.emit(null, this);
        obj2.hashCode();
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        rememberNestedScrollInteropConnection remembernestedscrollinteropconnection = new rememberNestedScrollInteropConnection();
        long[] jArr = new long[i2];
        remembernestedscrollinteropconnection.read = 0;
        int i4 = $11 + 69;
        $10 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        while (remembernestedscrollinteropconnection.read < i2) {
            int i6 = $11 + 97;
            $10 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = remembernestedscrollinteropconnection.read;
            try {
                Object[] objArr2 = {Integer.valueOf(IconCompatParcelizer[i + i8])};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1215525465);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (50818 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2087, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 14, -1734126664, false, $$d(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(serializer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2040246764);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 197 - View.MeasureSpec.getSize(0), 15 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 1454665717, false, "c", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {remembernestedscrollinteropconnection, remembernestedscrollinteropconnection};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(125004226);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (ExpandableListView.getPackedPositionChild(0L) + 6916), 159 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18, -677165021, false, com.braze.Constants.BRAZE_PUSH_CONTENT_KEY, new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        remembernestedscrollinteropconnection.read = 0;
        while (remembernestedscrollinteropconnection.read < i2) {
            int i9 = $10 + 57;
            $11 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            cArr[remembernestedscrollinteropconnection.read] = (char) jArr[remembernestedscrollinteropconnection.read];
            Object[] objArr5 = {remembernestedscrollinteropconnection, remembernestedscrollinteropconnection};
            Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(125004226);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (View.getDefaultSize(0, 0) + 6915), 159 - android.graphics.Color.red(0), MotionEvent.axisFromString("") + 18, -677165021, false, com.braze.Constants.BRAZE_PUSH_CONTENT_KEY, new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            int i11 = $10 + 89;
            $11 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        objArr[0] = new String(cArr);
    }
}
