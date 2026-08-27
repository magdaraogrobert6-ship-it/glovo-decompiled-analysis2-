package o;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.support.implementation.data.RiderSupportBreakRequestLogger;
import io.sentry.CombinedScopeView;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import kotlinx.coroutines.flow.FlowCollector;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class getFireAdvertisingIdAsync implements FlowCollector {
    private static final byte[] $$b = {18, -47, -52, 27};
    private static final int $$c = 172;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1417631078;
    public final /* synthetic */ getConnectivityType RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$d(byte r6, short r7, short r8) {
        /*
            int r6 = r6 * 2
            int r6 = 112 - r6
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = r8 * 3
            int r0 = 1 - r8
            byte[] r1 = o.getFireAdvertisingIdAsync.$$b
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2f:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getFireAdvertisingIdAsync.$$d(byte, short, short):java.lang.String");
    }

    public /* synthetic */ getFireAdvertisingIdAsync(getConnectivityType getconnectivitytype, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = getconnectivitytype;
    }

    public static void $$a(long j, long j2) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a(Process.getGidForName("") + 8, 9 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 115, false, new char[]{6, '\t', 65530, 7, 2, '\b', 7, 65500, '\b'}, objArr);
        RiderSupportBreakRequestLogger.class.getField((String) objArr[0]).get(null);
        Object obj = DefaultContentCardsUpdateHandlerCompanionCREATOR1.class.getField("IconCompatParcelizer").get(null);
        try {
            if (obj != null) {
                Object obj2 = QueryListener.class.getField("serializer").get((QueryListener) CombinedScopeView.class.getField("write").get(obj));
                int i4 = IconCompatParcelizer + 71;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Object[] objArr2 = {Long.valueOf(j3)};
                Object[] objArr3 = new Object[1];
                a(2 - android.view.KeyEvent.keyCodeFromString(""), 2 - TextUtils.lastIndexOf("", '0', 0, 0), 121 - (Process.myTid() >> 22), false, new char[]{65527, 6, 5}, objArr3);
                Method method = AtomicLong.class.getMethod((String) objArr3[0], Long.TYPE);
                method.setAccessible(true);
                method.invoke(obj2, objArr2);
            } else {
                Object obj3 = Timber.class.getField("RemoteActionCompatParcelizer").get(null);
                Object[] objArr4 = new Object[0];
                Object[] objArr5 = new Object[1];
                a(TextUtils.getOffsetAfter("", 0) + 25, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 38, 107 - android.graphics.Color.red(0), true, new char[]{20, 15, 14, 65472, 18, 5, 7, 7, 15, 65516, 65472, 65498, 20, 18, 15, 16, 16, 21, 65523, 65472, 18, 5, 4, '\t', 65522, 4, 5, 26, '\t', '\f', 1, '\t', 20, '\t', 14, '\t', 65472}, objArr5);
                Object[] objArr6 = {(String) objArr5[0], objArr4};
                Method method2 = Timber.Forest.class.getMethod("RemoteActionCompatParcelizer", String.class, Object[].class);
                method2.setAccessible(true);
                method2.invoke(obj3, objArr6);
            }
            int i6 = read + 101;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void a(int i, int i2, int i3, boolean z, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        accesstoViewTypeGyEprt8 accesstoviewtypegyeprt8 = new accesstoViewTypeGyEprt8();
        char[] cArr2 = new char[i2];
        accesstoviewtypegyeprt8.write = 0;
        while (true) {
            i4 = 907743172;
            if (accesstoviewtypegyeprt8.write >= i2) {
                break;
            }
            int i6 = $10 + 5;
            $11 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            accesstoviewtypegyeprt8.read = cArr[accesstoviewtypegyeprt8.write];
            cArr2[accesstoviewtypegyeprt8.write] = (char) (i3 + accesstoviewtypegyeprt8.read);
            int i8 = accesstoviewtypegyeprt8.write;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(write)};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1543552341);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) android.graphics.Color.alpha(0), 176 - TextUtils.getOffsetBefore("", 0), 21 - (Process.myPid() >> 22), 1932485450, false, com.braze.Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {accesstoviewtypegyeprt8, accesstoviewtypegyeprt8};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(907743172);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 20063), 16780054 + android.graphics.Color.rgb(0, 0, 0), 17 - android.view.KeyEvent.normalizeMetaState(0), -422891995, false, $$d(b, b2, b2), new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            int i9 = $11 + 67;
            $10 = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            accesstoviewtypegyeprt8.serializer = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - accesstoviewtypegyeprt8.serializer, accesstoviewtypegyeprt8.serializer);
            System.arraycopy(cArr3, accesstoviewtypegyeprt8.serializer, cArr2, 0, i2 - accesstoviewtypegyeprt8.serializer);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            accesstoviewtypegyeprt8.write = 0;
            while (accesstoviewtypegyeprt8.write < i2) {
                int i11 = $10 + 61;
                $11 = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                cArr4[accesstoviewtypegyeprt8.write] = cArr2[(i2 - accesstoviewtypegyeprt8.write) - 1];
                try {
                    Object[] objArr4 = {accesstoviewtypegyeprt8, accesstoviewtypegyeprt8};
                    Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(i4);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) (20064 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), View.MeasureSpec.getMode(0) + 2838, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, -422891995, false, $$d(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                    i4 = 907743172;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i13 = $11 + 55;
            $10 = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                int i14 = 3 / 4;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0097  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00df  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e7 A[EDGE_INSN: B:35:0x00e7->B:41:0x011d BREAK  A[LOOP:0: B:20:0x008e->B:60:?]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:38:0x0101  */
    /* JADX WARN: Code duplicated, block: B:39:0x0106  */
    /* JADX WARN: Code duplicated, block: B:58:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[LOOP:0: B:20:0x008e->B:60:?, LOOP_END, SYNTHETIC] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        Iterator it;
        int i;
        Long l;
        long jLongValue;
        Long l2;
        long jIconCompatParcelizer;
        int i2 = 2 % 2;
        int i3 = this.serializer;
        getConnectivityType getconnectivitytype = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = null;
        if (i3 == 0) {
            getFailureResponseData getfailureresponsedata = (getFailureResponseData) obj;
            getconnectivitytype.MediaBrowserCompatMediaItem.IconCompatParcelizer(getfailureresponsedata.RemoteActionCompatParcelizer);
            Set set = getconnectivitytype.RemoteActionCompatParcelizer;
            isTrackingEnabled istrackingenabled = getfailureresponsedata.RemoteActionCompatParcelizer;
            if (set.contains(istrackingenabled)) {
                int i4 = IconCompatParcelizer + 59;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    getFireTrackingEnabled getfiretrackingenabled = getconnectivitytype.read;
                    long j = getfailureresponsedata.write;
                    throw null;
                }
                getFireTrackingEnabled getfiretrackingenabled2 = getconnectivitytype.read;
                long j2 = getfailureresponsedata.write;
                EventMetadata eventMetadata = getconnectivitytype.MediaMetadataCompat;
                Long l3 = (Long) eventMetadata.IconCompatParcelizer.get();
                long jIconCompatParcelizer2 = getfiretrackingenabled2.IconCompatParcelizer(j2, l3 != null ? l3.longValue() : eventMetadata.IconCompatParcelizer());
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("RiderStatusPolling scheduling work. status=" + istrackingenabled + ", delay=" + jIconCompatParcelizer2 + "ms", new Object[0]);
                getConnectivityType.serializer(getconnectivitytype, jIconCompatParcelizer2);
            } else {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("RiderStatusPolling cancelling work. status=" + istrackingenabled, new Object[0]);
                androidx.work.impl.WorkManagerImpl workManagerImpl = getconnectivitytype.MediaSessionCompatToken;
                getClipannotations getclipannotations = workManagerImpl.write.PlaybackStateCompatCustomAction;
                String strConcat = "CancelWorkByName_".concat("rider_state_polling_work");
                getDifferencertfAjoo getdifferencertfajoo = workManagerImpl.MediaSessionCompatToken.RemoteActionCompatParcelizer;
                getdifferencertfajoo.getClass();
                setNativeShader.RemoteActionCompatParcelizer(getclipannotations, strConcat, getdifferencertfajoo, new ImageBitmapKt(workManagerImpl, 1));
            }
            return createfromparcel;
        }
        List list = (List) obj;
        transferSessionPackageI transfersessionpackagei = getconnectivitytype.RatingCompat;
        final EventMetadata eventMetadata2 = getconnectivitytype.MediaMetadataCompat;
        AtomicReference atomicReference = eventMetadata2.IconCompatParcelizer;
        if (((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), -1762727220, com.mapbox.navigator.R.serializer(), com.mapbox.navigator.R.serializer(), new Object[]{(FirebaseRemoteConfigImpl) transfersessionpackagei, updateAdidI.IS_ADAPTIVE_SMART_POLLING_KILLSWITCH_ENABLED})).booleanValue()) {
            int i5 = IconCompatParcelizer + 11;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("RiderStatusPolling adaptive retry-on-failure killswitch enabled; skipping reschedule", new Object[1]);
            } else {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("RiderStatusPolling adaptive retry-on-failure killswitch enabled; skipping reschedule", new Object[0]);
            }
        } else {
            List list2 = list;
            if (list2 instanceof Collection) {
                int i6 = IconCompatParcelizer + 87;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    list2.isEmpty();
                    obj2.hashCode();
                    throw null;
                }
                if (!list2.isEmpty()) {
                    it = list2.iterator();
                    while (!(!it.hasNext())) {
                        i = IconCompatParcelizer + 109;
                        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            ((GraphicsLayerScopeDefaultImpls) it.next()).RemoteActionCompatParcelizer();
                            setTranslationX settranslationx = setTranslationX.FAILED;
                            obj2.hashCode();
                            throw null;
                        }
                        if (((GraphicsLayerScopeDefaultImpls) it.next()).RemoteActionCompatParcelizer() == setTranslationX.FAILED) {
                            if (onContentCardDismissed.write(getconnectivitytype.RemoteActionCompatParcelizer, getconnectivitytype.MediaBrowserCompatMediaItem.read())) {
                                break;
                            }
                            int i7 = read + 41;
                            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                            l = (Long) atomicReference.get();
                            if (l != null) {
                                int i9 = read + 19;
                                IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i10 = i9 % 2;
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            if (jLongValue >= 600) {
                                atomicReference.updateAndGet(new UnaryOperator() { // from class: o.getMcc
                                    private static int read = 0;
                                    private static int serializer = 1;

                                    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
                                    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
                                    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r6
  0x001b: PHI (r6v2 java.lang.Long) = (r6v1 java.lang.Long), (r6v10 java.lang.Long) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        Long l4;
                                        long jLongValue2;
                                        int i11;
                                        int i12 = 2 % 2;
                                        int i13 = serializer + 99;
                                        read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        if (i13 % 2 != 0) {
                                            l4 = (Long) obj3;
                                            int i14 = 31 / 0;
                                            if (l4 != null) {
                                                jLongValue2 = l4.longValue();
                                                i11 = read + 125;
                                                serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                if (i11 % 2 == 0) {
                                                    int i15 = 5 / 4;
                                                }
                                            } else {
                                                jLongValue2 = eventMetadata2.IconCompatParcelizer();
                                            }
                                        } else {
                                            l4 = (Long) obj3;
                                            if (l4 != null) {
                                                jLongValue2 = l4.longValue();
                                                i11 = read + 125;
                                                serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                if (i11 % 2 == 0) {
                                                    int i16 = 5 / 4;
                                                }
                                            } else {
                                                jLongValue2 = eventMetadata2.IconCompatParcelizer();
                                            }
                                        }
                                        return Long.valueOf(Math.min(jLongValue2 * 2, 600L));
                                    }
                                });
                                l2 = (Long) atomicReference.get();
                                if (l2 != null) {
                                    jIconCompatParcelizer = l2.longValue();
                                } else {
                                    jIconCompatParcelizer = eventMetadata2.IconCompatParcelizer();
                                }
                                long j3 = jIconCompatParcelizer * 1000;
                                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m(j3, "RiderStatusPolling rescheduling after failure. backoffDelay=", "ms"), new Object[0]);
                                getConnectivityType.serializer(getconnectivitytype, j3);
                                break;
                            }
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("RiderStatusPolling backoff exhausted at max; not rescheduling until next refresh", new Object[0]);
                            break;
                        }
                    }
                }
            } else {
                it = list2.iterator();
                while (!(!it.hasNext())) {
                    i = IconCompatParcelizer + 109;
                    read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        ((GraphicsLayerScopeDefaultImpls) it.next()).RemoteActionCompatParcelizer();
                        setTranslationX settranslationx2 = setTranslationX.FAILED;
                        obj2.hashCode();
                        throw null;
                    }
                    if (((GraphicsLayerScopeDefaultImpls) it.next()).RemoteActionCompatParcelizer() == setTranslationX.FAILED) {
                        if (onContentCardDismissed.write(getconnectivitytype.RemoteActionCompatParcelizer, getconnectivitytype.MediaBrowserCompatMediaItem.read())) {
                            break;
                        }
                        int i11 = read + 41;
                        IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        l = (Long) atomicReference.get();
                        if (l != null) {
                            int i13 = read + 19;
                            IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i14 = i13 % 2;
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        if (jLongValue >= 600) {
                            atomicReference.updateAndGet(new UnaryOperator() { // from class: o.getMcc
                                private static int read = 0;
                                private static int serializer = 1;

                                /* JADX WARN: Code duplicated, block: B:11:0x002a  */
                                /* JADX WARN: Code duplicated, block: B:12:0x002e  */
                                /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r6
  0x001b: PHI (r6v2 java.lang.Long) = (r6v1 java.lang.Long), (r6v10 java.lang.Long) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    Long l4;
                                    long jLongValue2;
                                    int i15;
                                    int i16 = 2 % 2;
                                    int i17 = serializer + 99;
                                    read = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i17 % 2 != 0) {
                                        l4 = (Long) obj3;
                                        int i18 = 31 / 0;
                                        if (l4 != null) {
                                            jLongValue2 = l4.longValue();
                                            i15 = read + 125;
                                            serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            if (i15 % 2 == 0) {
                                                int i19 = 5 / 4;
                                            }
                                        } else {
                                            jLongValue2 = eventMetadata2.IconCompatParcelizer();
                                        }
                                    } else {
                                        l4 = (Long) obj3;
                                        if (l4 != null) {
                                            jLongValue2 = l4.longValue();
                                            i15 = read + 125;
                                            serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            if (i15 % 2 == 0) {
                                                int i110 = 5 / 4;
                                            }
                                        } else {
                                            jLongValue2 = eventMetadata2.IconCompatParcelizer();
                                        }
                                    }
                                    return Long.valueOf(Math.min(jLongValue2 * 2, 600L));
                                }
                            });
                            l2 = (Long) atomicReference.get();
                            if (l2 != null) {
                                jIconCompatParcelizer = l2.longValue();
                            } else {
                                jIconCompatParcelizer = eventMetadata2.IconCompatParcelizer();
                            }
                            long j4 = jIconCompatParcelizer * 1000;
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m(j4, "RiderStatusPolling rescheduling after failure. backoffDelay=", "ms"), new Object[0]);
                            getConnectivityType.serializer(getconnectivitytype, j4);
                            break;
                        }
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("RiderStatusPolling backoff exhausted at max; not rescheduling until next refresh", new Object[0]);
                        break;
                    }
                }
            }
        }
        return createfromparcel;
    }
}
