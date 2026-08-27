package o;

import android.content.Context;
import androidx.datastore.preferences.core.PreferencesKt$edit$2;
import bo.app.af$$ExternalSyntheticOutline0;
import io.grpc.LoadBalancer$Helper;
import io.reactivex.subjects.BehaviorSubject;
import java.io.InterruptedIOException;
import java.lang.reflect.Type;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;
import kotlinx.coroutines.BuildersKt;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pauseWebviewIfNecessarylambda10 {
    public static Context IconCompatParcelizer = null;
    public static boolean RemoteActionCompatParcelizer = false;
    private static int read = 0;
    public static String serializer = null;
    private static int write = 1;

    public static /* synthetic */ Object read(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = (~(i7 | i5)) | i4;
        int i9 = ~i4;
        int i10 = ~(i9 | i5 | i3);
        int i11 = (~(i3 | i9)) | i5 | (~(i7 | i4));
        int i12 = i5 + i4 + i6 + ((-381402339) * i) + ((-2062754392) * i2);
        int i13 = i12 * i12;
        int i14 = (1317609343 * i5) + 1063714816 + (1288888451 * i4) + (i8 * 14360446) + (14360446 * i10) + ((-14360446) * i11) + (1303248896 * i6) + (1454768128 * i) + (808452096 * i2) + ((-1790509056) * i13);
        int i15 = ((i5 * (-1355236691)) - 921838429) + (i4 * (-1355236103)) + (i8 * (-294)) + (i10 * (-294)) + (i11 * 294) + (i6 * (-1355236397)) + (i * (-1583251481)) + (i2 * 1682205048) + (i13 * (-427491328));
        int i16 = i14 + (i15 * i15 * 844169216);
        if (i16 == 1) {
            return serializer(objArr);
        }
        if (i16 != 2) {
            return i16 != 3 ? write(objArr) : IconCompatParcelizer(objArr);
        }
        return read(objArr);
    }

    public static executelambda4 IconCompatParcelizer(Object obj) {
        int i = 2 % 2;
        executelambda4 executelambda4Var = new executelambda4();
        executelambda4Var.RemoteActionCompatParcelizer("sentry:typeCheckHint", obj);
        int i2 = read + 91;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return executelambda4Var;
    }

    public static boolean RemoteActionCompatParcelizer(executelambda4 executelambda4Var, Class cls) {
        int i = 2 % 2;
        int i2 = write + 25;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zIsInstance = cls.isInstance(executelambda4Var.read("sentry:typeCheckHint"));
        int i4 = write + 9;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zIsInstance;
    }

    public static final Object serializer(performCustomExitMxy_nc0 performcustomexitmxy_nc0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        Object objUpdateData = performcustomexitmxy_nc0.updateData(new PreferencesKt$edit$2(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (ShortNewsContentCardView) null, 0), shortNewsContentCardView);
        int i2 = read + 97;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objUpdateData;
    }

    public static boolean IconCompatParcelizer(executelambda4 executelambda4Var) {
        int i = 2 % 2;
        int i2 = read + 47;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zEquals = Boolean.TRUE.equals(executelambda4Var.read(Boolean.class, "sentry:isFromHybridSdk"));
        int i4 = read + 85;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zEquals;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1 = (AndroidContentCaptureManagercurrentSemanticsNodes1) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        if (androidContentCaptureManagercurrentSemanticsNodes1 == null) {
            androidContentCaptureManagercurrentSemanticsNodes1 = null;
        }
        if (androidContentCaptureManagercurrentSemanticsNodes1 == null) {
            getCreditCardExpirationDay.IconCompatParcelizer("Inconsistent composition");
            DrawableTransformation.read();
            return null;
        }
        int i2 = read;
        int i3 = i2 + 111;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 45;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return androidContentCaptureManagercurrentSemanticsNodes1;
    }

    public static int IconCompatParcelizer(int i) {
        int i2 = 2 % 2;
        int i3 = write + 25;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iRotateLeft = (int) (i3 % 2 != 0 ? ((long) Integer.rotateLeft((int) (((long) i) - (-862048943)), 47)) - 461845907 : ((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
        int i4 = read + 23;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iRotateLeft;
        }
        throw null;
    }

    public static final void RemoteActionCompatParcelizer(List list, LinkedHashSet linkedHashSet) {
        int i = 2 % 2;
        int i2 = write + 11;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            syncClientfwf_client_release syncclientfwf_client_release = (syncClientfwf_client_release) it.next();
            linkedHashSet.add(syncclientfwf_client_release);
            RemoteActionCompatParcelizer(syncclientfwf_client_release.RemoteActionCompatParcelizer, linkedHashSet);
            int i4 = write + 59;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int i6 = read + 61;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 62 / 0;
        }
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        Object obj = objArr[1];
        int i = 2 % 2;
        if (obj != null) {
            if (!write(iIntValue, obj)) {
                read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{obj, "kotlin.jvm.functions.Function" + iIntValue}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -1325843615, 1325843617, BehaviorSubject.BehaviorDisposable.write());
                throw null;
            }
            int i2 = write + 63;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = read + 67;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    public static Collection RemoteActionCompatParcelizer(Object obj) {
        int i = 2 % 2;
        int i2 = write + 33;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            int i4 = 6 / 0;
            if (obj instanceof displayInAppMessagelambda121) {
                if (obj instanceof displayInAppMessagelambda12) {
                    int iWrite = BehaviorSubject.BehaviorDisposable.write();
                    int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
                    read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{obj, "kotlin.collections.MutableCollection"}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -1325843615, 1325843617, iWrite2);
                    throw null;
                }
                int i5 = i3 + 85;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        } else if (obj instanceof displayInAppMessagelambda121) {
            if (obj instanceof displayInAppMessagelambda12) {
                int iWrite3 = BehaviorSubject.BehaviorDisposable.write();
                int iWrite4 = BehaviorSubject.BehaviorDisposable.write();
                read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{obj, "kotlin.collections.MutableCollection"}, BehaviorSubject.BehaviorDisposable.write(), iWrite3, -1325843615, 1325843617, iWrite4);
                throw null;
            }
            int i7 = i3 + 85;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            removeNodeAtDepth.RemoteActionCompatParcelizer(e, pauseWebviewIfNecessarylambda10.class.getName());
            throw e;
        }
    }

    public static Map serializer(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 45;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (obj instanceof displayInAppMessagelambda121) {
            if (!(obj instanceof displayInAppMessagelambda120)) {
                int iWrite = BehaviorSubject.BehaviorDisposable.write();
                int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
                read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{obj, "kotlin.collections.MutableMap"}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -1325843615, 1325843617, iWrite2);
                throw null;
            }
            int i5 = i2 + 51;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            removeNodeAtDepth.RemoteActionCompatParcelizer(e, pauseWebviewIfNecessarylambda10.class.getName());
            throw e;
        }
    }

    public static Set write(Object obj) {
        int i = 2 % 2;
        int i2 = read + 45;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            boolean z = obj instanceof displayInAppMessagelambda121;
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof displayInAppMessagelambda121) {
            if (!(obj instanceof displayInAppMessagelambda11)) {
                int iWrite = BehaviorSubject.BehaviorDisposable.write();
                int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
                read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{obj, "kotlin.collections.MutableSet"}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -1325843615, 1325843617, iWrite2);
                throw null;
            }
            int i4 = i3 + 55;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            removeNodeAtDepth.RemoteActionCompatParcelizer(e, pauseWebviewIfNecessarylambda10.class.getName());
            throw e;
        }
    }

    public static final setGraphicModalMaxWidthDp RemoteActionCompatParcelizer(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations) {
        int i = 2 % 2;
        int i2 = write + 31;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getunregisteredinappmessageannotations.getClass();
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = coil3.ExtrasKt.RemoteActionCompatParcelizer(Options.Companion.read(getunregisteredinappmessageannotations), (setGraphicModalMaxWidthDp[]) Arrays.copyOf(new setGraphicModalMaxWidthDp[0], 0));
        if (setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer != null) {
            int i4 = read + 87;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer;
        }
        int i6 = write + 103;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return (setGraphicModalMaxWidthDp) onOtherUrlActionlambda4.IconCompatParcelizer.get(getunregisteredinappmessageannotations);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void RemoteActionCompatParcelizer(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, Object obj) {
        int i = 2 % 2;
        int i2 = read + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!r8lambdaucgighn8fiyv_vccodeafjfpedk.read(obj)) {
            throw new ClassCastException("Value cannot be cast to " + r8lambdaucgighn8fiyv_vccodeafjfpedk.RemoteActionCompatParcelizer());
        }
        int i4 = write + 7;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        obj.getClass();
        int i6 = read + 27;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = (prepareInAppMessageWithZippedAssetHtml) objArr[0];
        Type type = (Type) objArr[1];
        int i = 2 % 2;
        prepareinappmessagewithzippedassethtml.getClass();
        type.getClass();
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = LoadBalancer$Helper.RemoteActionCompatParcelizer(prepareinappmessagewithzippedassethtml, type, true);
        Object obj = null;
        if (setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer != null) {
            int i2 = write + 49;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer;
            }
            obj.hashCode();
            throw null;
        }
        Class clsIconCompatParcelizer = LoadBalancer$Helper.IconCompatParcelizer(type);
        clsIconCompatParcelizer.getClass();
        DrawableTransformation.serializer(r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho.read(displayInAppMessagelambda1.serializer(clsIconCompatParcelizer)));
        int i3 = read + 85;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        String name;
        Object obj = objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = read + 91;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (obj != null) {
            name = obj.getClass().getName();
            int i3 = read + 71;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            name = "null";
        }
        ClassCastException classCastException = new ClassCastException(af$$ExternalSyntheticOutline0.m(name, " cannot be cast to ", str));
        removeNodeAtDepth.RemoteActionCompatParcelizer(classCastException, pauseWebviewIfNecessarylambda10.class.getName());
        throw classCastException;
    }

    public static final setGraphicModalMaxWidthDp IconCompatParcelizer(prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml, registerInAppMessageManagerlambda50 registerinappmessagemanagerlambda50) {
        int i = 2 % 2;
        int i2 = read + 107;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        prepareinappmessagewithzippedassethtml.getClass();
        registerinappmessagemanagerlambda50.getClass();
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = BuildersKt.read(prepareinappmessagewithzippedassethtml, registerinappmessagemanagerlambda50, true);
        if (setgraphicmodalmaxwidthdp != null) {
            int i4 = read + 1;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdp;
        }
        DrawableTransformation.serializer(r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho.read(r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho.read(registerinappmessagemanagerlambda50)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    public static final boolean IconCompatParcelizer(Throwable th) {
        Throwable cause;
        int i = 2 % 2;
        int i2 = write + 67;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        th.getClass();
        if ((!(th instanceof SSLHandshakeException)) && !(th instanceof InterruptedIOException) && !(th instanceof UnknownHostException)) {
            int i4 = write + 21;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 23 / 0;
                if (!(th instanceof ConnectException)) {
                    cause = th.getCause();
                    if (cause != null) {
                        int i6 = write + 69;
                        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        if (IconCompatParcelizer(cause)) {
                            int i8 = read + 19;
                            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i9 = i8 % 2;
                        }
                    }
                    return false;
                }
            } else if (!(th instanceof ConnectException)) {
                cause = th.getCause();
                if (cause != null) {
                    int i10 = write + 69;
                    read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    if (IconCompatParcelizer(cause)) {
                        int i12 = read + 19;
                        write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    public static boolean RemoteActionCompatParcelizer(executelambda4 executelambda4Var) {
        int i = 2 % 2;
        if (!(!io.sentry.hints.serializer.class.isInstance(executelambda4Var.read("sentry:typeCheckHint")))) {
            if (!io.sentry.android.core.addObserverForBackInvoker.class.isInstance(executelambda4Var.read("sentry:typeCheckHint"))) {
                int i2 = read + 103;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
        } else {
            int i4 = write + 105;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (io.sentry.hints.write.class.isInstance(executelambda4Var.read("sentry:typeCheckHint"))) {
                if (!io.sentry.android.core.addObserverForBackInvoker.class.isInstance(executelambda4Var.read("sentry:typeCheckHint"))) {
                    int i6 = read + 103;
                    write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    public static long read(boolean z, int i, GraphicsLayerScope graphicsLayerScope, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        long jScalb;
        int i3 = 2 % 2;
        graphicsLayerScope.getClass();
        Object obj = null;
        if (j6 != Long.MAX_VALUE && z2) {
            int i4 = read + 9;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i2 != 0) {
                long j7 = 900000 + j2;
                if (j6 < j7) {
                    return j7;
                }
            }
            return j6;
        }
        if (z) {
            int i5 = write + 63;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 87 / 0;
                if (graphicsLayerScope == GraphicsLayerScope.LINEAR) {
                    jScalb = ((long) i) * j;
                    int i7 = write + 31;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                } else {
                    jScalb = (long) Math.scalb(j, i - 1);
                }
            } else if (graphicsLayerScope == GraphicsLayerScope.LINEAR) {
                jScalb = ((long) i) * j;
                int i9 = write + 31;
                read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                jScalb = (long) Math.scalb(j, i - 1);
            }
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return jScalb + j2;
        }
        if (z2) {
            int i11 = read + 27;
            write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                throw null;
            }
            long j8 = i2 == 0 ? j2 + j3 : j2 + j5;
            return (j4 == j5 || i2 != 0) ? j8 : (j5 - j4) + j8;
        }
        if (j2 == -1) {
            int i12 = read + 35;
            write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                return Long.MAX_VALUE;
            }
            throw null;
        }
        long j9 = j2 + j3;
        int i13 = write + 105;
        read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i13 % 2 != 0) {
            int i14 = 54 / 0;
        }
        return j9;
    }

    public static final ArrayList IconCompatParcelizer(prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml, List list, boolean z) {
        int i = 2 % 2;
        prepareinappmessagewithzippedassethtml.getClass();
        list.getClass();
        if (z) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(IconCompatParcelizer(prepareinappmessagewithzippedassethtml, (registerInAppMessageManagerlambda50) it.next()));
            }
            return arrayList;
        }
        List<registerInAppMessageManagerlambda50> list3 = list;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
        for (registerInAppMessageManagerlambda50 registerinappmessagemanagerlambda50 : list3) {
            int i2 = write + 85;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            registerinappmessagemanagerlambda50.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = BuildersKt.read(prepareinappmessagewithzippedassethtml, registerinappmessagemanagerlambda50, false);
            if (setgraphicmodalmaxwidthdp == null) {
                int i4 = write + 55;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return null;
                }
                int i5 = 88 / 0;
                return null;
            }
            arrayList2.add(setgraphicmodalmaxwidthdp);
        }
        return arrayList2;
    }

    public static boolean write(int i, Object obj) {
        int arity = 2;
        int i2 = 2 % 2;
        if (obj instanceof isInvalidIndex) {
            if (obj instanceof r8lambdauprfjTiZ1Df0OcO00NrhbN7_a0) {
                arity = ((r8lambdauprfjTiZ1Df0OcO00NrhbN7_a0) obj).getArity();
            } else if (obj instanceof r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) {
                int i3 = read;
                int i4 = i3 + 67;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i3 + 69;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                arity = 0;
            } else if (obj instanceof r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) {
                arity = 1;
            } else if (!(obj instanceof r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0)) {
                if (obj instanceof r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) {
                    int i8 = read + 79;
                    write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    arity = 3;
                } else if (obj instanceof r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) {
                    int i10 = write + 113;
                    read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    arity = 4;
                } else if (obj instanceof r8lambdagdus9EWsajL31FKA79xR2Pb0c4E) {
                    arity = 5;
                } else {
                    int i12 = 7;
                    if (obj instanceof r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM) {
                        int i13 = read + 7;
                        write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        arity = i13 % 2 == 0 ? 72 : 6;
                    } else {
                        if (obj instanceof r8lambdai4uHhuxI_lBaIwBHW2e2KANuhE) {
                            int i14 = read + 33;
                            write = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i15 = i14 % 2;
                        } else if (obj instanceof r8lambdam6kPPA3z8dHTentc0gq2uQ_Iyco) {
                            arity = 8;
                        } else if (obj instanceof r8lambdaqPv61rwIX7fwpHZY40hphRHQpZ8) {
                            arity = 9;
                        } else if (obj instanceof r8lambdaVqRQRvr3UKPhHK_x9arK0s264) {
                            arity = 10;
                        } else {
                            i12 = 11;
                            if (!(obj instanceof r8lambdaSQFu6AOFqpylmZRPZ50Z2TfR8UU)) {
                                if (obj instanceof r8lambdaScekM2iB8lXAlFjjGbW7nu5ca8) {
                                    int i16 = write + 95;
                                    read = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    arity = i16 % 2 != 0 ? 18 : 13;
                                } else if (obj instanceof r8lambdaWdJYQE7cd1YBN9rgKqoaFXB53ZM) {
                                    int i17 = write + 123;
                                    read = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    arity = i17 % 2 != 0 ? 89 : 14;
                                } else if (obj instanceof r8lambdaW56WpyG3s7kCZVcDp3X2mz4mIY) {
                                    int i18 = write + 65;
                                    read = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i19 = i18 % 2;
                                    arity = 15;
                                } else if (obj instanceof r8lambdaZx3OXZoJJt1_BxZ4i_bdHj3NXM) {
                                    arity = 16;
                                } else if (obj instanceof r8lambdaWQlfmPfdJgpWJx7DDyi7sXvAlE) {
                                    arity = 17;
                                } else if (obj instanceof r8lambdaXQ9HBHyk0gHyCZjWaVGo09mEILs) {
                                    int i20 = read + 11;
                                    write = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i21 = i20 % 2;
                                } else if (obj instanceof r8lambdad2q08SPBZCTm0GxNUbGIRJJROyA) {
                                    arity = 19;
                                } else if (obj instanceof r8lambdadYjcH1_xGPFG3XH7gbXy_OXfQ) {
                                    arity = 20;
                                } else {
                                    arity = obj instanceof r8lambdafVx7XI7bO6Xm15vIIzhK9Uk9E ? 21 : -1;
                                }
                            }
                        }
                        arity = i12;
                    }
                }
            }
            if (arity == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x018f  */
    /* JADX WARN: Code duplicated, block: B:52:0x01af  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bb  */
    public static final setGraphicModalMaxWidthDp RemoteActionCompatParcelizer(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations, ArrayList arrayList, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        setGraphicModalMaxWidthDp setwasclosemessagecalled;
        setGraphicModalMaxWidthDp beforeopened;
        int i = 2 % 2;
        getunregisteredinappmessageannotations.getClass();
        if (!(!getunregisteredinappmessageannotations.equals(displayInAppMessagelambda1.serializer(Collection.class)))) {
            setwasclosemessagecalled = new setWasCloseMessageCalled((setGraphicModalMaxWidthDp) arrayList.get(0), 0);
        } else {
            int i2 = read + 3;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (getunregisteredinappmessageannotations.equals(displayInAppMessagelambda1.serializer(List.class)) || getunregisteredinappmessageannotations.equals(displayInAppMessagelambda1.serializer(List.class)) || getunregisteredinappmessageannotations.equals(displayInAppMessagelambda1.serializer(ArrayList.class))) {
                setwasclosemessagecalled = new setWasCloseMessageCalled((setGraphicModalMaxWidthDp) arrayList.get(0), 0);
            } else if (getunregisteredinappmessageannotations.equals(displayInAppMessagelambda1.serializer(HashSet.class))) {
                setwasclosemessagecalled = new performClickActionlambda0((setGraphicModalMaxWidthDp) arrayList.get(0));
            } else if (getunregisteredinappmessageannotations.equals(displayInAppMessagelambda1.serializer(Set.class))) {
                setwasclosemessagecalled = new setWasCloseMessageCalled((setGraphicModalMaxWidthDp) arrayList.get(0), 1);
            } else {
                int i4 = read + 7;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                if (getunregisteredinappmessageannotations.equals(displayInAppMessagelambda1.serializer(Set.class))) {
                    setwasclosemessagecalled = new setWasCloseMessageCalled((setGraphicModalMaxWidthDp) arrayList.get(0), 1);
                } else {
                    int i6 = write + 95;
                    read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    setGraphicModalMaxWidthDp afterinappmessageviewopened = null;
                    if (i6 % 2 != 0) {
                        getunregisteredinappmessageannotations.equals(displayInAppMessagelambda1.serializer(LinkedHashSet.class));
                        afterinappmessageviewopened.hashCode();
                        throw null;
                    }
                    if (getunregisteredinappmessageannotations.equals(displayInAppMessagelambda1.serializer(LinkedHashSet.class))) {
                        setwasclosemessagecalled = new setWasCloseMessageCalled((setGraphicModalMaxWidthDp) arrayList.get(0), 1);
                    } else {
                        if (getunregisteredinappmessageannotations.equals(displayInAppMessagelambda1.serializer(HashMap.class))) {
                            beforeopened = new onButtonClickedlambda0((setGraphicModalMaxWidthDp) arrayList.get(0), (setGraphicModalMaxWidthDp) arrayList.get(1));
                        } else if (getunregisteredinappmessageannotations.equals(displayInAppMessagelambda1.serializer(Map.class))) {
                            beforeopened = new beforeOpened((setGraphicModalMaxWidthDp) arrayList.get(0), (setGraphicModalMaxWidthDp) arrayList.get(1));
                        } else {
                            int i7 = write + 29;
                            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                            if ((!getunregisteredinappmessageannotations.equals(displayInAppMessagelambda1.serializer(Map.class))) && !getunregisteredinappmessageannotations.equals(displayInAppMessagelambda1.serializer(LinkedHashMap.class))) {
                                if (getunregisteredinappmessageannotations.equals(displayInAppMessagelambda1.serializer(Map.Entry.class))) {
                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) arrayList.get(0);
                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = (setGraphicModalMaxWidthDp) arrayList.get(1);
                                    setgraphicmodalmaxwidthdp.getClass();
                                    setgraphicmodalmaxwidthdp2.getClass();
                                    afterinappmessageviewopened = new r8lambdaahdGH7R8GNMD2vmKUAaBjuE6gGE(setgraphicmodalmaxwidthdp, setgraphicmodalmaxwidthdp2, 1);
                                } else if (getunregisteredinappmessageannotations.equals(displayInAppMessagelambda1.serializer(onViewAttachedToWindowlambda0.class))) {
                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp3 = (setGraphicModalMaxWidthDp) arrayList.get(0);
                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp4 = (setGraphicModalMaxWidthDp) arrayList.get(1);
                                    setgraphicmodalmaxwidthdp3.getClass();
                                    setgraphicmodalmaxwidthdp4.getClass();
                                    beforeopened = new r8lambdaahdGH7R8GNMD2vmKUAaBjuE6gGE(setgraphicmodalmaxwidthdp3, setgraphicmodalmaxwidthdp4, 0);
                                    int i9 = write + 103;
                                    read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i10 = i9 % 2;
                                } else if (getunregisteredinappmessageannotations.equals(displayInAppMessagelambda1.serializer(ContentCardAdapterExternalSyntheticLambda0.class))) {
                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp5 = (setGraphicModalMaxWidthDp) arrayList.get(0);
                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp6 = (setGraphicModalMaxWidthDp) arrayList.get(1);
                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp7 = (setGraphicModalMaxWidthDp) arrayList.get(2);
                                    setgraphicmodalmaxwidthdp5.getClass();
                                    setgraphicmodalmaxwidthdp6.getClass();
                                    setgraphicmodalmaxwidthdp7.getClass();
                                    afterinappmessageviewopened = new afterInAppMessageViewOpened(setgraphicmodalmaxwidthdp5, setgraphicmodalmaxwidthdp6, setgraphicmodalmaxwidthdp7);
                                } else if (Options.Companion.read(getunregisteredinappmessageannotations).isArray()) {
                                    Object objInvoke = r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                                    objInvoke.getClass();
                                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp8 = (setGraphicModalMaxWidthDp) arrayList.get(0);
                                    setgraphicmodalmaxwidthdp8.getClass();
                                    beforeopened = new onCustomEventActionlambda1((getUnregisteredInAppMessageannotations) objInvoke, setgraphicmodalmaxwidthdp8);
                                }
                                setwasclosemessagecalled = afterinappmessageviewopened;
                            } else {
                                beforeopened = new beforeOpened((setGraphicModalMaxWidthDp) arrayList.get(0), (setGraphicModalMaxWidthDp) arrayList.get(1));
                            }
                        }
                        setwasclosemessagecalled = beforeopened;
                    }
                }
            }
        }
        if (setwasclosemessagecalled != null) {
            return setwasclosemessagecalled;
        }
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = (setGraphicModalMaxWidthDp[]) arrayList.toArray(new setGraphicModalMaxWidthDp[0]);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr2 = (setGraphicModalMaxWidthDp[]) Arrays.copyOf(setgraphicmodalmaxwidthdpArr, setgraphicmodalmaxwidthdpArr.length);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = coil3.ExtrasKt.RemoteActionCompatParcelizer(Options.Companion.read(getunregisteredinappmessageannotations), (setGraphicModalMaxWidthDp[]) Arrays.copyOf(setgraphicmodalmaxwidthdpArr2, setgraphicmodalmaxwidthdpArr2.length));
        int i11 = write + 35;
        read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer;
    }

    public static void RemoteActionCompatParcelizer(Object obj, String str) {
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
        read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{obj, str}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -1325843615, 1325843617, iWrite2);
    }

    public static final setGraphicModalMaxWidthDp IconCompatParcelizer(prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml, Type type) {
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
        return (setGraphicModalMaxWidthDp) read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{prepareinappmessagewithzippedassethtml, type}, BehaviorSubject.BehaviorDisposable.write(), iWrite, 1430528806, -1430528805, iWrite2);
    }

    public static void RemoteActionCompatParcelizer(int i, Object obj) {
        read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{Integer.valueOf(i), obj}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -722072991, 722072991, BehaviorSubject.BehaviorDisposable.write());
    }

    public static final AndroidContentCaptureManagercurrentSemanticsNodes1 serializer(AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1) {
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
        return (AndroidContentCaptureManagercurrentSemanticsNodes1) read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{androidContentCaptureManagercurrentSemanticsNodes1}, BehaviorSubject.BehaviorDisposable.write(), iWrite, 314989417, -314989414, iWrite2);
    }
}
