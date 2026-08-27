package com.mapbox.common.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.ui.graphics.Fields;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.MapboxSDKCommonInitializer;
import com.roadrunner.rider.support.implementation.data.RiderSupportBreakRequestLogger;
import io.sentry.CombinedScopeView;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DrawableTransformation;
import o.QueryListener;
import o.accesstoOffsetmoWRBKg;
import o.displayInAppMessagelambda121;
import o.getCieXyz;
import o.removeNodeAtDepth;
import o.resetAfterInAppMessageCloselambda2;
import o.setFontSizeR2X_6o;
import o.setToSaturationimpl;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationUpdatesReceiver extends BroadcastReceiver {
    public static final String ACTION_PROCESS_LOCATION_UPDATES = "com.mapbox.common.location.action.PROCESS_LOCATION_UPDATES";
    public static final String LOCATION_PROVIDER_ID_KEY = "com.mapbox.common.location.DeviceLocationProvider.ID";
    private static final String TAG = "LUReceiver";
    public static final Companion Companion = new Companion(null);
    private static final ExecutorService backgroundExecutor = Executors.newSingleThreadExecutor();
    private static final ConcurrentHashMap<Integer, CircularArray<Intent>> pendingIntents = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Integer, WeakReference<BaseDeviceLocationProvider>> backgroundDeviceLocationProviders = new ConcurrentHashMap<>();

    public static final class CircularArray<T> implements Iterable<T>, displayInAppMessagelambda121 {
        private final T[] arr;
        private int currentSize;
        private int tail = -1;
        private static final byte[] $$b = {53, 114, -40, -92};
        private static final int $$c = 135;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int serializer = 0;
        private static int read = 1;
        private static long IconCompatParcelizer = -7009568347796326538L;
        private static int write = -658032778;
        private static char RemoteActionCompatParcelizer = 26157;

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$d(short r6, int r7, byte r8) {
            /*
                int r8 = r8 * 3
                int r0 = 1 - r8
                int r6 = 111 - r6
                byte[] r1 = com.mapbox.common.location.LocationUpdatesReceiver.CircularArray.$$b
                int r7 = r7 * 3
                int r7 = 3 - r7
                byte[] r0 = new byte[r0]
                r2 = 0
                int r8 = 0 - r8
                if (r1 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L2d
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r7 = r7 + 1
                if (r3 != r8) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L24:
                r4 = r1[r7]
                int r3 = r3 + 1
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2d:
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.common.location.LocationUpdatesReceiver.CircularArray.$$d(short, int, byte):java.lang.String");
        }

        public final int getSize() {
            int i = 2 % 2;
            int i2 = read;
            int i3 = i2 + 93;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = this.currentSize;
            int i6 = i2 + 59;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return i5;
        }

        public CircularArray(int i) {
            this.arr = (T[]) new Object[i];
        }

        public static void $$a(long j, long j2) throws Throwable {
            int i = 2 % 2;
            long j3 = j ^ (j2 << 32);
            Object[] objArr = new Object[1];
            a(View.getDefaultSize(0, 0) - 2098364712, (char) View.resolveSizeAndState(0, 0, 0), new char[]{55412, 60798, 4226, 24145}, new char[]{0, 0, 0, 0}, new char[]{62808, 4671, 27612, 58682, 49322, 48256, 33081, 42688, 45570}, objArr);
            RiderSupportBreakRequestLogger.class.getField((String) objArr[0]).get(null);
            Object obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
            try {
                if (obj != null) {
                    int i2 = serializer + 33;
                    read = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                    int i4 = serializer + 89;
                    read = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    Object[] objArr2 = {Long.valueOf(j3)};
                    Object[] objArr3 = new Object[1];
                    a(1518 - AndroidCharacter.getMirror('0'), (char) (AndroidCharacter.getMirror('0') + 15531), new char[]{48839, 56069, 56200, 1340}, new char[]{0, 0, 0, 0}, new char[]{35858, 31173, 40146}, objArr3);
                    Method method = AtomicLong.class.getMethod((String) objArr3[0], Long.TYPE);
                    method.setAccessible(true);
                    method.invoke(obj2, objArr2);
                } else {
                    Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                    Object[] objArr4 = new Object[0];
                    Object[] objArr5 = new Object[1];
                    a(1231222584 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{14479, 25335, 29513, 61875}, new char[]{0, 0, 0, 0}, new char[]{54926, 34023, 182, 11661, 12700, 44768, 40708, 42124, 188, 2533, 20910, 28981, 8084, 23444, 42911, 5634, 8337, 15156, 38886, 20731, 62453, 37909, 3170, 46248, 33497, 38290, 44424, 25450, 36447, 55941, 30164, 39767, 18075, 7225, 61534, 12187, 44640}, objArr5);
                    Object[] objArr6 = {(String) objArr5[0], objArr4};
                    Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                    method2.setAccessible(true);
                    method2.invoke(obj3, objArr6);
                    int i6 = read + 103;
                    serializer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        int i7 = 2 / 2;
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

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            int i = 2 % 2;
            LocationUpdatesReceiver$CircularArray$iterator$1 locationUpdatesReceiver$CircularArray$iterator$1 = new LocationUpdatesReceiver$CircularArray$iterator$1(this);
            int i2 = serializer + 43;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 90 / 0;
            }
            return locationUpdatesReceiver$CircularArray$iterator$1;
        }

        public final List<T> toList() {
            int i = 2 % 2;
            int i2 = serializer + 59;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                resetAfterInAppMessageCloselambda2.read(resetAfterInAppMessageCloselambda2.serializer(iterator()));
                throw null;
            }
            List<T> list = resetAfterInAppMessageCloselambda2.read(resetAfterInAppMessageCloselambda2.serializer(iterator()));
            int i3 = read + 117;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return list;
            }
            throw null;
        }

        private final int getHead() {
            int i = 2 % 2;
            int i2 = read;
            int i3 = i2 + 123;
            int i4 = i3 % Fields.SpotShadowColor;
            serializer = i4;
            int i5 = i3 % 2;
            int i6 = this.currentSize;
            if (i6 == this.arr.length) {
                int i7 = i2 + 53;
                serializer = i7 % Fields.SpotShadowColor;
                return i7 % 2 != 0 ? this.tail * i6 : (this.tail + 1) % i6;
            }
            int i8 = i4 + 97;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return 0;
        }

        public final void add(T t) {
            int i = 2 % 2;
            int i2 = read + 113;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            t.getClass();
            int i4 = this.tail;
            T[] tArr = this.arr;
            int length = (i4 + 1) % tArr.length;
            this.tail = length;
            tArr[length] = t;
            int i5 = this.currentSize;
            if (i5 < tArr.length) {
                int i6 = read + 65;
                serializer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    i5++;
                }
                this.currentSize = i5;
            }
        }

        public final T get(int i) {
            T t;
            int i2 = 2 % 2;
            int i3 = read + 33;
            int i4 = i3 % Fields.SpotShadowColor;
            serializer = i4;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = this.currentSize;
            if (i5 != 0 && i < i5) {
                int i6 = i4 + 15;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (i >= 0) {
                    int i7 = i4 + 85;
                    read = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        int length = this.arr.length;
                        obj.hashCode();
                        throw null;
                    }
                    T[] tArr = this.arr;
                    if (i5 == tArr.length) {
                        t = tArr[(getHead() + i) % this.arr.length];
                    } else {
                        t = tArr[i];
                    }
                    t.getClass();
                    return t;
                }
            }
            DrawableTransformation.read(String.valueOf(i));
            return null;
        }

        private static void a(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            accesstoOffsetmoWRBKg accesstooffsetmowrbkg = new accesstoOffsetmoWRBKg();
            int length = cArr.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            int i3 = 0;
            System.arraycopy(cArr, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr3.length;
            char[] cArr6 = new char[length3];
            accesstooffsetmowrbkg.IconCompatParcelizer = 0;
            while (accesstooffsetmowrbkg.IconCompatParcelizer < length3) {
                int i4 = $11 + 47;
                $10 = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                try {
                    Object[] objArr2 = {accesstooffsetmowrbkg};
                    Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-2056078218);
                    if (objRemoteActionCompatParcelizer == null) {
                        char cArgb = (char) Color.argb(i3, i3, i3, i3);
                        int iMyPid = 231 - (Process.myPid() >> 22);
                        int i6 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 20;
                        Class[] clsArr = new Class[1];
                        clsArr[i3] = Object.class;
                        objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cArgb, iMyPid, i6, 1436720535, false, "j", clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {accesstooffsetmowrbkg};
                    Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(729107336);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", i3, i3);
                        int scrollDefaultDelay = 2546 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 31;
                        byte b = (byte) i3;
                        String str$$d = $$d((byte) ($$c & 31), b, b);
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i3] = Object.class;
                        objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cIndexOf, scrollDefaultDelay, iLastIndexOf, -73045399, false, str$$d, clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    int i7 = cArr4[accesstooffsetmowrbkg.IconCompatParcelizer % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                    objArr4[1] = Integer.valueOf(i7);
                    objArr4[i3] = accesstooffsetmowrbkg;
                    Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(245609149);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 887 - (ViewConfiguration.getScrollBarSize() >> 8), (ExpandableListView.getPackedPositionForChild(i3, i3) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == 0L ? 0 : -1)) + 61, -562850980, false, $$d(b2, b3, b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1101373148);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 65451);
                        int i8 = 1244 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iMyPid2 = (Process.myPid() >> 22) + 33;
                        byte b4 = (byte) ($$c & 11);
                        byte b5 = (byte) (b4 - 3);
                        objRemoteActionCompatParcelizer4 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(cLastIndexOf, i8, iMyPid2, 1854554309, false, $$d(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = accesstooffsetmowrbkg.write;
                    cArr6[accesstooffsetmowrbkg.IconCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[accesstooffsetmowrbkg.IconCompatParcelizer])) ^ (IconCompatParcelizer ^ (-7009568347796326538L))) ^ ((long) ((int) (((long) write) ^ (-7009568347796326538L))))) ^ ((long) ((char) (((long) RemoteActionCompatParcelizer) ^ (-7009568347796326538L)))));
                    accesstooffsetmowrbkg.IconCompatParcelizer++;
                    int i9 = $10 + 45;
                    $11 = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    i3 = 0;
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

        private static /* synthetic */ void getArr$annotations() {
            int i = 2 % 2;
            int i2 = serializer + 119;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logError(String str) {
            try {
                MapboxCommonLogger.INSTANCE.logE$common_release(LocationUpdatesReceiver.TAG, str);
            } catch (Throwable unused) {
                SentryLogcatAdapter.serializer(LocationUpdatesReceiver.TAG, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logWarning(String str) {
            try {
                MapboxCommonLogger.INSTANCE.logW$common_release(LocationUpdatesReceiver.TAG, str);
            } catch (Throwable unused) {
                SentryLogcatAdapter.IconCompatParcelizer(LocationUpdatesReceiver.TAG, str);
            }
        }

        private Companion() {
        }

        public final void addDeviceLocationProvider$common_release(int i, BaseDeviceLocationProvider baseDeviceLocationProvider) {
            baseDeviceLocationProvider.getClass();
            LocationUpdatesReceiver.backgroundDeviceLocationProviders.put(Integer.valueOf(i), new WeakReference(baseDeviceLocationProvider));
            CircularArray circularArray = (CircularArray) LocationUpdatesReceiver.pendingIntents.remove(Integer.valueOf(i));
            if (circularArray != null) {
                Iterator it = circularArray.toList().iterator();
                while (it.hasNext()) {
                    List<Location> listExtractResult = baseDeviceLocationProvider.extractResult((Intent) it.next());
                    if (!listExtractResult.isEmpty()) {
                        baseDeviceLocationProvider.notifyLocationUpdate(listExtractResult);
                    }
                }
            }
        }

        public final void removeDeviceLocationProvider$common_release(int i) {
            LocationUpdatesReceiver.backgroundDeviceLocationProviders.remove(Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceive$lambda$2(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        CircularArray<Intent> circularArrayPutIfAbsent;
        try {
            if (!intent.hasExtra(LOCATION_PROVIDER_ID_KEY)) {
                Companion.logWarning("Missing location provider persistent id");
                return;
            }
            int intExtra = intent.getIntExtra(LOCATION_PROVIDER_ID_KEY, 0);
            WeakReference<BaseDeviceLocationProvider> weakReference = backgroundDeviceLocationProviders.get(Integer.valueOf(intExtra));
            if (weakReference == null) {
                ConcurrentHashMap<Integer, CircularArray<Intent>> concurrentHashMap = pendingIntents;
                Integer numValueOf = Integer.valueOf(intExtra);
                CircularArray<Intent> circularArray = concurrentHashMap.get(numValueOf);
                if (circularArray == null && (circularArrayPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (circularArray = new CircularArray<>(5)))) != null) {
                    circularArray = circularArrayPutIfAbsent;
                }
                circularArray.add(intent);
                Companion.logError("DeviceLocationProvider with id " + intExtra + " not found.");
            } else {
                BaseDeviceLocationProvider baseDeviceLocationProvider = weakReference.get();
                if (baseDeviceLocationProvider != null) {
                    List<Location> listExtractResult = baseDeviceLocationProvider.extractResult(intent);
                    if (!listExtractResult.isEmpty()) {
                        baseDeviceLocationProvider.notifyLocationUpdate(listExtractResult);
                    }
                }
            }
        } finally {
            pendingResult.finish();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        context.getClass();
        if (intent != null) {
            Object[] objArr = {intent.getAction(), ACTION_PROCESS_LOCATION_UPDATES};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                setToSaturationimpl.IconCompatParcelizer(context).read(MapboxSDKCommonInitializer.class);
                backgroundExecutor.execute(new BaseLocationProvider$$ExternalSyntheticLambda0(intent, 1, goAsync()));
            }
        }
    }
}
