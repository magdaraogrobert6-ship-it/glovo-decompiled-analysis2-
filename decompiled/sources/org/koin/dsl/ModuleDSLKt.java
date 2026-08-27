package org.koin.dsl;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.calculator.PerformanceClassCalculatorImpl;
import com.mapbox.geojson.Point;
import curtains.internal.RootViewsSpy$Companion$install$1$1;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.exception.SentryHttpClientException;
import io.sentry.protocol.ParcelableVolumeInfo;
import io.sentry.protocol.ResultReceiver;
import io.sentry.protocol.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
import io.sentry.util.ComponentActivity;
import io.sentry.util.UrlUtils;
import io.sentry.util.read;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.AddToCustomAttributeArrayStep;
import o.AndroidContentCaptureManagerCompanion;
import o.BackgroundInAppMessagePreparer;
import o.BannerViewExternalSyntheticLambda2;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageViewWrapperFactory;
import o.DragAndDropTargetModifierNode;
import o.IconKt;
import o._get_messageWebView_lambda1;
import o._get_messageWebView_lambda3;
import o.displayInAppMessagelambda0;
import o.displayInAppMessagelambda1;
import o.executelambda4;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.lerpNonNull;
import o.mapMKHz9U;
import o.obtainTint8_81llA;
import o.onContentCardClicked;
import o.onReceive;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.registerInAppMessageManagerlambda40;
import o.requestDisplayInAppMessagelambda2;
import o.resetMessageMarginslambda00;
import o.setFrom58bKbWc;
import o.setTouchListener;
import o.syncClientfwf_client_release;
import okhttp3.RequestBody;
import okio.Options;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ModuleDSLKt {
    private static int IconCompatParcelizer = 0;
    public static lerpNonNull RemoteActionCompatParcelizer = null;
    private static int write = 1;

    public static /* synthetic */ Object serializer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i5);
        int i11 = (~i5) | i7;
        int i12 = i10 | (~(i11 | i4));
        int i13 = (~(i5 | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i2));
        int i15 = i2 + i4 + i3 + (783392123 * i6) + ((-786872706) * i);
        int i16 = i15 * i15;
        int i17 = ((-1525980173) * i2) + 1729888256 + (218870266 * i4) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i3) + ((-1731985408) * i6) + ((-471334912) * i) + ((-600899584) * i16);
        int i18 = (i2 * 375823119) + 1642083618 + (i4 * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (i3 * 375824245) + (i6 * (-117547465)) + (i * 763984278) + (i16 * (-763691008));
        int i19 = i17 + (i18 * i18 * 1830354944);
        if (i19 != 1) {
            return i19 != 2 ? serializer(objArr) : RemoteActionCompatParcelizer(objArr);
        }
        return write(objArr);
    }

    public static final boolean RemoteActionCompatParcelizer(Application application) {
        boolean z;
        synchronized (ModuleDSLKt.class) {
            application.getClass();
            lerpNonNull lerpnonnull = read(application);
            lerpnonnull.getClass();
            z = lerpnonnull == lerpNonNull.LOW;
        }
        return z;
    }

    public static final lerpNonNull read(Application application) {
        synchronized (ModuleDSLKt.class) {
            application.getClass();
            lerpNonNull lerpnonnull = RemoteActionCompatParcelizer;
            if (lerpnonnull != null) {
                return lerpnonnull;
            }
            Object systemService = application.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            if (activityManager == null) {
                return lerpNonNull.LOW;
            }
            lerpNonNull lerpnonnull2 = (activityManager.isLowRamDevice() || activityManager.getMemoryClass() < 128 || Runtime.getRuntime().availableProcessors() < 4) ? lerpNonNull.LOW : (lerpNonNull) new PerformanceClassCalculatorImpl(application).serializer.MediaSessionCompatResultReceiverWrapper();
            RemoteActionCompatParcelizer = lerpnonnull2;
            return lerpnonnull2;
        }
    }

    public static final int RemoteActionCompatParcelizer(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer + 25;
        write = i4 % Fields.SpotShadowColor;
        return i4 % 2 == 0 ? (i >>> i2) & 13 : (i >> i2) & 31;
    }

    public static registerInAppMessageManagerlambda40 IconCompatParcelizer(displayInAppMessagelambda0 displayinappmessagelambda0) {
        int i = 2 % 2;
        registerInAppMessageManagerlambda40 registerinappmessagemanagerlambda40 = new registerInAppMessageManagerlambda40(requestDisplayInAppMessagelambda2.INVARIANT, displayinappmessagelambda0);
        int i2 = IconCompatParcelizer + 3;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return registerinappmessagemanagerlambda40;
    }

    public static syncClientfwf_client_release RemoteActionCompatParcelizer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = 2 % 2;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        syncClientfwf_client_release syncclientfwf_client_release = new syncClientfwf_client_release();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(syncclientfwf_client_release);
        int i2 = IconCompatParcelizer + 77;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
        return syncclientfwf_client_release;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        setFrom58bKbWc setfrom58bkbwc = (setFrom58bKbWc) objArr[0];
        int i = 2 % 2;
        setfrom58bkbwc.getClass();
        mapMKHz9U mapmkhz9u = new mapMKHz9U(setfrom58bkbwc.RatingCompat, setfrom58bkbwc.MediaDescriptionCompat);
        int i2 = write + 55;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
        return mapmkhz9u;
    }

    public static final Object[] IconCompatParcelizer(int i, Object[] objArr) {
        Object[] objArr2;
        int i2 = 2 % 2;
        int i3 = write + 121;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            objArr2 = new Object[objArr.length >>> 2];
            onContentCardClicked.IconCompatParcelizer(0, i, 89, objArr, objArr2);
            onContentCardClicked.write(i, i >> 5, objArr.length, objArr, objArr2);
        } else {
            objArr2 = new Object[objArr.length - 2];
            onContentCardClicked.IconCompatParcelizer(0, i, 6, objArr, objArr2);
            onContentCardClicked.write(i, i + 2, objArr.length, objArr, objArr2);
        }
        int i4 = write + 103;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objArr2;
    }

    public static final Object[] read(int i, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = write + 119;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object[] objArr2 = new Object[objArr.length >>> 1];
            onContentCardClicked.IconCompatParcelizer(0, i, 82, objArr, objArr2);
            onContentCardClicked.write(i, i >>> 1, objArr.length, objArr, objArr2);
            return objArr2;
        }
        Object[] objArr3 = new Object[objArr.length - 1];
        onContentCardClicked.IconCompatParcelizer(0, i, 6, objArr, objArr3);
        onContentCardClicked.write(i, i + 1, objArr.length, objArr, objArr3);
        return objArr3;
    }

    public static final Object[] serializer(int i, Object obj, Object obj2, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = write + 45;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Object[] objArr2 = new Object[objArr.length + 2];
        onContentCardClicked.IconCompatParcelizer(0, i, 6, objArr, objArr2);
        onContentCardClicked.write(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        int i5 = write + 29;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objArr2;
    }

    public static final setTouchListener RemoteActionCompatParcelizer(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        defaultInAppMessageModalViewFactoryCompanion.getClass();
        Object obj = null;
        setTouchListener settouchlistener = !((defaultInAppMessageModalViewFactoryCompanion instanceof setTouchListener) ^ true) ? (setTouchListener) defaultInAppMessageModalViewFactoryCompanion : null;
        if (settouchlistener == null) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(displayInAppMessagelambda1.serializer(defaultInAppMessageModalViewFactoryCompanion.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
            return null;
        }
        int i4 = IconCompatParcelizer + 93;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return settouchlistener;
        }
        obj.hashCode();
        throw null;
    }

    public static final BackgroundInAppMessagePreparer read(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory) {
        BackgroundInAppMessagePreparer backgroundInAppMessagePreparer;
        int i = 2 % 2;
        defaultInAppMessageViewWrapperFactory.getClass();
        if (defaultInAppMessageViewWrapperFactory instanceof BackgroundInAppMessagePreparer) {
            int i2 = write + 37;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                throw null;
            }
            backgroundInAppMessagePreparer = (BackgroundInAppMessagePreparer) defaultInAppMessageViewWrapperFactory;
        } else {
            backgroundInAppMessagePreparer = null;
        }
        if (backgroundInAppMessagePreparer == null) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(displayInAppMessagelambda1.serializer(defaultInAppMessageViewWrapperFactory.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
            return null;
        }
        int i3 = IconCompatParcelizer + 81;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 42 / 0;
        }
        return backgroundInAppMessagePreparer;
    }

    public static final void RemoteActionCompatParcelizer(Context context, Boolean bool) {
        obtainTint8_81llA obtaintint8_81lla;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        context.getClass();
        Object obj = context;
        while ((obj instanceof ContextWrapper) && !(obj instanceof Activity)) {
            Context baseContext = ((ContextWrapper) obj).getBaseContext();
            baseContext.getClass();
            obj = baseContext;
        }
        if (obj instanceof obtainTint8_81llA) {
            obtaintint8_81lla = (obtainTint8_81llA) obj;
            int i4 = IconCompatParcelizer + 23;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            obtaintint8_81lla = null;
        }
        if (obtaintint8_81lla == null) {
            int i6 = write + 51;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("This can be called in the context of a PerformanceMeasurableScreen", Timber.RemoteActionCompatParcelizer);
            return;
        }
        ExtrasKt.write(obtaintint8_81lla, bool);
        int i8 = write + 27;
        IconCompatParcelizer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 1;
        write = i2 % Fields.SpotShadowColor;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
                throw null;
            }
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                Set set = Collections.EMPTY_SET;
                int i3 = write + 121;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i4 = 51 / 0;
                }
                return set;
            }
            Set set2 = (Set) objInvoke;
            Iterator it = set2.iterator();
            while (!(!it.hasNext())) {
                int i5 = write + 7;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (!(it.next() instanceof int[])) {
                    set2 = Collections.EMPTY_SET;
                    int i7 = IconCompatParcelizer + 83;
                    write = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    break;
                }
            }
            int i9 = write + 59;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                return set2;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0068 A[PHI: r4
  0x0068: PHI (r4v7 java.lang.String) = (r4v3 java.lang.String), (r4v8 java.lang.String) binds: [B:17:0x0065, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    public static LinkedHashMap serializer(AddToCustomAttributeArrayStep addToCustomAttributeArrayStep, resetMessageMarginslambda00 resetmessagemarginslambda00) {
        String strSerializer;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 67;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().isSendDefaultPii()) {
            int i4 = IconCompatParcelizer + 17;
            write = i4 % Fields.SpotShadowColor;
            Object obj = null;
            if (i4 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iRemoteActionCompatParcelizer = resetmessagemarginslambda00.RemoteActionCompatParcelizer();
        int i5 = 0;
        while (i5 < iRemoteActionCompatParcelizer) {
            int i6 = write + 107;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                strSerializer = resetmessagemarginslambda00.serializer(i5);
                int i7 = 54 / 0;
                if (!read.read.contains(strSerializer.toUpperCase(Locale.ROOT))) {
                    linkedHashMap.put(strSerializer, resetmessagemarginslambda00.read(i5));
                }
            } else {
                strSerializer = resetmessagemarginslambda00.serializer(i5);
                if (!read.read.contains(strSerializer.toUpperCase(Locale.ROOT))) {
                    linkedHashMap.put(strSerializer, resetmessagemarginslambda00.read(i5));
                }
            }
            i5++;
            int i8 = write + 41;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        return linkedHashMap;
    }

    public static final void IconCompatParcelizer(DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(330315249);
        if ((i & 6) == 0) {
            int i5 = IconCompatParcelizer + 97;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode);
                throw null;
            }
            i2 = (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            AndroidContentCaptureManagerCompanion.read(onReceive.serializer.write(null), dragAndDropTargetModifierNode, getpostalcode, ((i2 << 3) & 112) | 8);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i6 = IconCompatParcelizer + 105;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new IconKt(dragAndDropTargetModifierNode, i, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r1 >= 360.0d) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        r4 = r4 + 35;
        org.koin.dsl.ModuleDSLKt.write = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if ((r4 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        r1 = r9.longitude();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r9.longitude() <= 0.0d) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        r3 = org.koin.dsl.ModuleDSLKt.IconCompatParcelizer + 57;
        org.koin.dsl.ModuleDSLKt.write = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r10.longitude() >= 0.0d) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r1 = r1 - 360.0d;
        r10 = org.koin.dsl.ModuleDSLKt.IconCompatParcelizer + 93;
        org.koin.dsl.ModuleDSLKt.write = r10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r9.longitude() >= 0.0d) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if (r10.longitude() <= 0.0d) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        r10 = org.koin.dsl.ModuleDSLKt.IconCompatParcelizer;
        r3 = r10 + 43;
        org.koin.dsl.ModuleDSLKt.write = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
        r1 = r1 + 360.0d;
        r10 = r10 + 63;
        org.koin.dsl.ModuleDSLKt.write = r10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if ((r10 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        r10 = 4 % 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        r9 = com.mapbox.geojson.Point.fromLngLat(r1, r9.latitude());
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        if (r1 >= 360.0d) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.mapbox.geojson.Point unwrapForShortestPath(com.mapbox.geojson.Point r9, com.mapbox.geojson.Point r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r9.getClass()
            r10.getClass()
            double r1 = r10.longitude()
            double r3 = r9.longitude()
            double r1 = r1 - r3
            double r1 = java.lang.Math.abs(r1)
            r3 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto La2
            int r3 = org.koin.dsl.ModuleDSLKt.write
            int r3 = r3 + 83
            int r4 = r3 % 128
            org.koin.dsl.ModuleDSLKt.IconCompatParcelizer = r4
            int r3 = r3 % r0
            r5 = 4645040803167600640(0x4076800000000000, double:360.0)
            if (r3 == 0) goto L38
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r2 = 29
            int r2 = r2 / 0
            if (r1 < 0) goto L48
            goto L3c
        L38:
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 < 0) goto L48
        L3c:
            int r4 = r4 + 35
            int r10 = r4 % 128
            org.koin.dsl.ModuleDSLKt.write = r10
            int r4 = r4 % r0
            if (r4 == 0) goto L46
            goto La2
        L46:
            r9 = 0
            throw r9
        L48:
            double r1 = r9.longitude()
            double r3 = r9.longitude()
            r7 = 0
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto L72
            int r3 = org.koin.dsl.ModuleDSLKt.IconCompatParcelizer
            int r3 = r3 + 57
            int r4 = r3 % 128
            org.koin.dsl.ModuleDSLKt.write = r4
            int r3 = r3 % r0
            double r3 = r10.longitude()
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L72
            double r1 = r1 - r5
            int r10 = org.koin.dsl.ModuleDSLKt.IconCompatParcelizer
            int r10 = r10 + 93
            int r3 = r10 % 128
            org.koin.dsl.ModuleDSLKt.write = r3
            int r10 = r10 % r0
            goto L97
        L72:
            double r3 = r9.longitude()
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L97
            double r3 = r10.longitude()
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 <= 0) goto L97
            int r10 = org.koin.dsl.ModuleDSLKt.IconCompatParcelizer
            int r3 = r10 + 43
            int r4 = r3 % 128
            org.koin.dsl.ModuleDSLKt.write = r4
            int r3 = r3 % r0
            double r1 = r1 + r5
            int r10 = r10 + 63
            int r3 = r10 % 128
            org.koin.dsl.ModuleDSLKt.write = r3
            int r10 = r10 % r0
            if (r10 != 0) goto L97
            r10 = 4
            int r10 = r10 % r10
        L97:
            double r9 = r9.latitude()
            com.mapbox.geojson.Point r9 = com.mapbox.geojson.Point.fromLngLat(r1, r9)
            r9.getClass()
        La2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.dsl.ModuleDSLKt.unwrapForShortestPath(com.mapbox.geojson.Point, com.mapbox.geojson.Point):com.mapbox.geojson.Point");
    }

    public static Point wrapCoordinate(Point point) {
        int i = 2 % 2;
        point.getClass();
        double dLongitude = point.longitude();
        double d = dLongitude - 180.0d;
        if (Math.abs(d) < 1.0E-6d) {
            dLongitude = -180.0d;
        } else {
            double d2 = dLongitude + 180.0d;
            if ((d2 > 1.0E-6d || Math.abs(d2) < 1.0E-6d) && d < -1.0E-6d) {
                int i2 = IconCompatParcelizer + 45;
                write = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 4;
                }
            } else {
                double d3 = (d2 % 360.0d) - 180.0d;
                if (dLongitude < -180.0d) {
                    int i4 = write + 5;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    dLongitude = i4 % 2 != 0 ? d3 / 360.0d : d3 + 360.0d;
                } else {
                    int i5 = IconCompatParcelizer + 81;
                    write = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    dLongitude = d3;
                }
            }
        }
        if (!Double.isNaN(dLongitude)) {
            Point pointFromLngLat = Point.fromLngLat(dLongitude, point.latitude());
            pointFromLngLat.getClass();
            return pointFromLngLat;
        }
        int i7 = write + 109;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        Point pointFromLngLat2 = Point.fromLngLat(point.longitude(), point.latitude());
        pointFromLngLat2.getClass();
        return pointFromLngLat2;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        int iIndexOf;
        String string;
        int i = 0;
        String str = (String) objArr[0];
        Object[] objArr2 = (Object[]) objArr[1];
        int i2 = 2 % 2;
        String strValueOf = String.valueOf(str);
        for (int i3 = 0; i3 < objArr2.length; i3++) {
            int i4 = write + 101;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                Object obj = objArr2[i3];
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object obj3 = objArr2[i3];
            if (obj3 == null) {
                string = "null";
            } else {
                try {
                    string = obj3.toString();
                } catch (Exception e) {
                    String str2 = obj3.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj3));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("<", str2, " threw ");
                    sbM.append(e.getClass().getName());
                    sbM.append(">");
                    string = sbM.toString();
                }
            }
            objArr2[i3] = string;
        }
        StringBuilder sb = new StringBuilder((objArr2.length * 16) + strValueOf.length());
        int i5 = 0;
        while (i < objArr2.length && (iIndexOf = strValueOf.indexOf("%s", i5)) != -1) {
            sb.append((CharSequence) strValueOf, i5, iIndexOf);
            sb.append(objArr2[i]);
            i5 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i5, strValueOf.length());
        if (i < objArr2.length) {
            sb.append(" [");
            sb.append(objArr2[i]);
            for (int i6 = i + 1; i6 < objArr2.length; i6++) {
                sb.append(", ");
                sb.append(objArr2[i6]);
            }
            sb.append(']');
        }
        String string2 = sb.toString();
        int i7 = write + 31;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return string2;
    }

    public static void read(AddToCustomAttributeArrayStep addToCustomAttributeArrayStep, r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        String strWrite;
        int i = 2 % 2;
        addToCustomAttributeArrayStep.getClass();
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        resetMessageMarginslambda00 resetmessagemarginslambda00 = r8lambday113fdftsr5e4pzj6xssxltpl60.headers;
        _get_messagewebview_lambda1.getClass();
        resetMessageMarginslambda00 resetmessagemarginslambda01 = _get_messagewebview_lambda1.headers;
        ComponentActivity componentActivityIconCompatParcelizer = UrlUtils.IconCompatParcelizer(r8lambday113fdftsr5e4pzj6xssxltpl60.url.url);
        ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
        parcelableVolumeInfo.MediaDescriptionCompat = "SentryOkHttpInterceptor";
        StringBuilder sb = new StringBuilder("HTTP Client Error with status code: ");
        int i2 = _get_messagewebview_lambda1.code;
        sb.append(i2);
        BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2 = new BannerViewExternalSyntheticLambda2(new ExceptionMechanismException(parcelableVolumeInfo, new SentryHttpClientException(sb.toString()), Thread.currentThread(), true));
        executelambda4 executelambda4Var = new executelambda4();
        executelambda4Var.RemoteActionCompatParcelizer("okHttp:request", r8lambday113fdftsr5e4pzj6xssxltpl60);
        executelambda4Var.RemoteActionCompatParcelizer("okHttp:response", _get_messagewebview_lambda1);
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7ijbvrn0shyidcazufwejfc7yy = new r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        r8lambda7ijbvrn0shyidcazufwejfc7yy.PlaybackStateCompatCustomAction = (String) componentActivityIconCompatParcelizer.serializer;
        r8lambda7ijbvrn0shyidcazufwejfc7yy.MediaSessionCompatQueueItem = (String) componentActivityIconCompatParcelizer.write;
        r8lambda7ijbvrn0shyidcazufwejfc7yy.RatingCompat = (String) componentActivityIconCompatParcelizer.read;
        Long lValueOf = null;
        r8lambda7ijbvrn0shyidcazufwejfc7yy.IconCompatParcelizer = addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().isSendDefaultPii() ? resetmessagemarginslambda00.write("Cookie") : null;
        r8lambda7ijbvrn0shyidcazufwejfc7yy.MediaBrowserCompatMediaItem = r8lambday113fdftsr5e4pzj6xssxltpl60.method;
        r8lambda7ijbvrn0shyidcazufwejfc7yy.MediaDescriptionCompat = Options.Companion.RemoteActionCompatParcelizer(serializer(addToCustomAttributeArrayStep, resetmessagemarginslambda00));
        RequestBody requestBody = r8lambday113fdftsr5e4pzj6xssxltpl60.body;
        Long lValueOf2 = requestBody != null ? Long.valueOf(requestBody.contentLength()) : null;
        RootViewsSpy$Companion$install$1$1 rootViewsSpy$Companion$install$1$1 = new RootViewsSpy$Companion$install$1$1(12, r8lambda7ijbvrn0shyidcazufwejfc7yy);
        if (lValueOf2 != null && lValueOf2.longValue() != -1) {
            int i3 = write + 43;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                rootViewsSpy$Companion$install$1$1.invoke(lValueOf2);
                throw null;
            }
            rootViewsSpy$Companion$install$1$1.invoke(lValueOf2);
        }
        ResultReceiver resultReceiver = new ResultReceiver();
        if (addToCustomAttributeArrayStep.RemoteActionCompatParcelizer().isSendDefaultPii()) {
            int i4 = write + 75;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            strWrite = resetmessagemarginslambda01.write("Set-Cookie");
        } else {
            strWrite = null;
        }
        resultReceiver.write = strWrite;
        resultReceiver.read = Options.Companion.RemoteActionCompatParcelizer(serializer(addToCustomAttributeArrayStep, resetmessagemarginslambda01));
        resultReceiver.serializer = Integer.valueOf(i2);
        _get_messageWebView_lambda3 _get_messagewebview_lambda3 = _get_messagewebview_lambda1.body;
        if (_get_messagewebview_lambda3 != null) {
            int i6 = IconCompatParcelizer + 87;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            lValueOf = Long.valueOf(_get_messagewebview_lambda3.IconCompatParcelizer());
        }
        RootViewsSpy$Companion$install$1$1 rootViewsSpy$Companion$install$1$2 = new RootViewsSpy$Companion$install$1$1(13, resultReceiver);
        if (lValueOf != null && lValueOf.longValue() != -1) {
            rootViewsSpy$Companion$install$1$2.invoke(lValueOf);
        }
        bannerViewExternalSyntheticLambda2.MediaBrowserCompatMediaItem = r8lambda7ijbvrn0shyidcazufwejfc7yy;
        bannerViewExternalSyntheticLambda2.read.read(resultReceiver);
        addToCustomAttributeArrayStep.RemoteActionCompatParcelizer(bannerViewExternalSyntheticLambda2, executelambda4Var);
    }

    public static String IconCompatParcelizer(String str, Object... objArr) {
        int iWrite = MaybeObserveOn.write();
        int iWrite2 = MaybeObserveOn.write();
        int iWrite3 = MaybeObserveOn.write();
        return (String) serializer(MaybeObserveOn.write(), 1556036116, iWrite2, -1556036116, iWrite, new Object[]{str, objArr}, iWrite3);
    }

    public static Set write() {
        int iWrite = MaybeObserveOn.write();
        int iWrite2 = MaybeObserveOn.write();
        int iWrite3 = MaybeObserveOn.write();
        return (Set) serializer(MaybeObserveOn.write(), 96616552, iWrite2, -96616550, iWrite, new Object[0], iWrite3);
    }

    public static final mapMKHz9U write(setFrom58bKbWc setfrom58bkbwc) {
        int iWrite = MaybeObserveOn.write();
        int iWrite2 = MaybeObserveOn.write();
        int iWrite3 = MaybeObserveOn.write();
        return (mapMKHz9U) serializer(MaybeObserveOn.write(), -1836924254, iWrite2, 1836924255, iWrite, new Object[]{setfrom58bkbwc}, iWrite3);
    }
}
