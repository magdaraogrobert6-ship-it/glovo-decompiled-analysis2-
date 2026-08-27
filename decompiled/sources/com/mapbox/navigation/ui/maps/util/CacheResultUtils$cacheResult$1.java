package com.mapbox.navigation.ui.maps.util;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import com.braze.Constants;
import com.huawei.agconnect.config.impl.m;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils$initializeLayers$77;
import com.roadrunner.rider.support.implementation.data.RiderSupportBreakRequestLogger;
import io.sentry.CombinedScopeView;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Lambda;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.IconCompatParcelizer;
import o.QueryListener;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.rememberNestedScrollInteropConnection;
import o.removeNodeAtDepth;
import o.setFontSizeR2X_6o;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class CacheResultUtils$cacheResult$1 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $r8$classId;
    public final m handler;
    private static final byte[] $$b = {108, -91, -61, -59};
    private static final int $$c = 172;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    private static char[] read = {2227, 38419, 13701, 54052, 29345, 4130, 49105, 23883, 64766, 37039, 3637, 44464, 19883, 54044, 28805, 38456, 14267, 21861, 64226, 6232, 47593, 57189, 31982, 40335, 8989, 16607, 58993, 1921, 42326, 51922, 26694, 35320, 12155, 19621, 60831, 29442, 37037, 13941, 22440, 62803, 6848, 47185, 55800, 32620, 39957, 15772, 17179, 57528, 1581};
    private static long serializer = -6985091656391391458L;

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$d(byte r6, short r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = com.mapbox.navigation.ui.maps.util.CacheResultUtils$cacheResult$1.$$b
            int r8 = r8 * 3
            int r8 = 98 - r8
            int r6 = r6 * 3
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L2a:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2f:
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.ui.maps.util.CacheResultUtils$cacheResult$1.$$d(byte, short, short):java.lang.String");
    }

    public CacheResultUtils$cacheResult$1() {
        this.$r8$classId = 0;
        this.handler = new m(MapboxRouteLineUtils$initializeLayers$77.INSTANCE$2, 12, new LruCache(1));
    }

    public static void $$a(long j, long j2) throws Throwable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a(View.getDefaultSize(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8, (char) (Color.rgb(0, 0, 0) + 16814434), objArr);
        RiderSupportBreakRequestLogger.class.getField((String) objArr[0]).get(null);
        Object obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj != null) {
                Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                int i4 = RemoteActionCompatParcelizer + 75;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Object[] objArr2 = {Long.valueOf(j3)};
                Object[] objArr3 = new Object[1];
                a((ViewConfiguration.getFadingEdgeLength() >> 16) + 9, 4 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 2382), objArr3);
                Method method = AtomicLong.class.getMethod((String) objArr3[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj2, objArr2);
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr4 = new Object[0];
                Object[] objArr5 = new Object[1];
                a(13 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") + 37, (char) (54379 - View.resolveSize(0, 0)), objArr5);
                Object[] objArr6 = {(String) objArr5[0], objArr4};
                Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                method2.setAccessible(true);
                method2.invoke(obj3, objArr6);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public CacheResultUtils$cacheResult$1(LruCache lruCache) {
        this.$r8$classId = 1;
        this.handler = new m(MapboxRouteLineUtils$initializeLayers$77.INSTANCE$3, 12, lruCache);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(final Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.$r8$classId;
        m mVar = this.handler;
        if (i3 == 0) {
            return mVar.invoke(new CacheResultUtils$CacheResultCall(obj) { // from class: com.mapbox.navigation.ui.maps.util.CacheResultUtils$CacheResultKey1
                public final Object p1;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.mapbox.navigation.ui.maps.util.CacheResultUtils$CacheResultCall
                public final Object invoke(Lambda lambda) {
                    return ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) lambda).invoke(this.p1);
                }

                {
                    this.p1 = obj;
                }

                public final boolean equals(Object obj3) {
                    if (this == obj3) {
                        return true;
                    }
                    if (!(obj3 instanceof CacheResultUtils$CacheResultKey1)) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.p1, ((CacheResultUtils$CacheResultKey1) obj3).p1}, getCieXyz.write())).booleanValue();
                }

                public final String toString() {
                    return IconCompatParcelizer.RemoteActionCompatParcelizer(new StringBuilder("CacheResultKey1(p1="), this.p1, ')');
                }

                public final int hashCode() {
                    Object obj3 = this.p1;
                    if (obj3 == null) {
                        return 0;
                    }
                    return obj3.hashCode();
                }
            });
        }
        final NavigationRoute navigationRoute = (NavigationRoute) obj;
        navigationRoute.getClass();
        Object objInvoke = mVar.invoke(new CacheResultUtils$CacheResultCall(navigationRoute) { // from class: com.mapbox.navigation.ui.maps.util.CacheResultUtils$CacheResultKeyRoute
            public final NavigationRoute route;

            public final int hashCode() {
                return this.route.id.hashCode();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.mapbox.navigation.ui.maps.util.CacheResultUtils$CacheResultCall
            public final Object invoke(Lambda lambda) {
                return ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) lambda).invoke(this.route);
            }

            {
                navigationRoute.getClass();
                this.route = navigationRoute;
            }

            public final String toString() {
                return "CacheResultKeyRoute(route=" + this.route + ')';
            }

            public final boolean equals(Object obj3) {
                if (this == obj3) {
                    return true;
                }
                if (!CacheResultUtils$CacheResultKeyRoute.class.equals(obj3 != null ? obj3.getClass() : null)) {
                    return false;
                }
                obj3.getClass();
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.route.id, ((CacheResultUtils$CacheResultKeyRoute) obj3).route.id}, getCieXyz.write())).booleanValue();
            }
        });
        int i4 = RemoteActionCompatParcelizer + 17;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        rememberNestedScrollInteropConnection remembernestedscrollinteropconnection = new rememberNestedScrollInteropConnection();
        long[] jArr = new long[i2];
        remembernestedscrollinteropconnection.read = 0;
        int i4 = $10 + 61;
        $11 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        while (remembernestedscrollinteropconnection.read < i2) {
            int i6 = $11 + 21;
            $10 = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = remembernestedscrollinteropconnection.read;
            try {
                Object[] objArr2 = {Integer.valueOf(read[i + i8])};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(1215525465);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (50816 - TextUtils.lastIndexOf("", '0')), View.MeasureSpec.getMode(0) + 2087, (KeyEvent.getMaxKeyCode() >> 16) + 14, -1734126664, false, $$d(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(serializer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2040246764);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.indexOf("", "", 0, 0) + 197, 15 - ExpandableListView.getPackedPositionGroup(0L), 1454665717, false, "c", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {remembernestedscrollinteropconnection, remembernestedscrollinteropconnection};
                Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(125004226);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 6915), (ViewConfiguration.getTapTimeout() >> 16) + 159, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 18, -677165021, false, Constants.BRAZE_PUSH_CONTENT_KEY, new Class[]{Object.class, Object.class});
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
        int i9 = $10 + 13;
        $11 = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        while (remembernestedscrollinteropconnection.read < i2) {
            cArr[remembernestedscrollinteropconnection.read] = (char) jArr[remembernestedscrollinteropconnection.read];
            try {
                Object[] objArr5 = {remembernestedscrollinteropconnection, remembernestedscrollinteropconnection};
                Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(125004226);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (6914 - ExpandableListView.getPackedPositionChild(0L)), 158 - TextUtils.lastIndexOf("", '0'), 17 - TextUtils.indexOf("", "", 0), -677165021, false, Constants.BRAZE_PUSH_CONTENT_KEY, new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }
}
