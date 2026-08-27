package o;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticLambda3;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.presentation.compose.AutoAcceptOptionKt$AutoAcceptOption$1$1;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import io.sentry.CombinedScopeView;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;
import kotlin.math.MathKt;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class removeNodeAtDepth {
    private static int read = 1;
    private static int write;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i3);
        int i9 = ~(i7 | i);
        int i10 = i8 | i9;
        int i11 = ~i3;
        int i12 = (~((~i) | i7 | i3)) | (~(i7 | i11 | i));
        int i13 = i9 | (~(i11 | i2));
        int i14 = i2 + i3 + i5 + ((-1696018712) * i6) + (2108813197 * i4);
        int i15 = i14 * i14;
        int i16 = ((212195308 * i2) - 2121662464) + (1221732374 * i3) + (1009537066 * i10) + (i12 * (-504768533)) + ((-504768533) * i13) + (716963840 * i5) + (39845888 * i6) + (227278848 * i4) + ((-1705377792) * i15);
        int i17 = ((i2 * 362004572) - 1408384217) + (i3 * 362004174) + (i10 * (-398)) + (i12 * 199) + (i13 * 199) + (i5 * 362004373) + (i6 * (-1290304248)) + (i4 * 155295761) + (i15 * (-60686336));
        int i18 = i16 + (i17 * i17 * (-1680474112));
        if (i18 == 1) {
            return read(objArr);
        }
        if (i18 == 2) {
            return RemoteActionCompatParcelizer(objArr);
        }
        if (i18 != 3) {
            return i18 != 4 ? IconCompatParcelizer(objArr) : MediaDescriptionCompat(objArr);
        }
        return write(objArr);
    }

    public static void IconCompatParcelizer() {
        int i = 2 % 2;
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final void write(View view, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        int i2 = write + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        view.getClass();
        view.setTag(com.logistics.rider.glovo.R.id.view_tree_lifecycle_owner, accessisrendernodecompatiblecp);
        int i4 = write + 109;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static int read(long j, long j2) {
        int i = 2 % 2;
        int i2 = read + 77;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (j >= j2) {
            return j == j2 ? 0 : 1;
        }
        int i4 = i3 + 23;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return -1;
    }

    public static int serializer(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = read;
        int i5 = i4 + 47;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        if (i >= i2) {
            return i == i2 ? 0 : 1;
        }
        int i7 = i4 + 115;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return -1;
        }
        throw null;
    }

    public static void read() {
        int i = 2 % 2;
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
        RemoteActionCompatParcelizer(kotlinNullPointerException, removeNodeAtDepth.class.getName());
        throw kotlinNullPointerException;
    }

    public static final r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ serializer(Object... objArr) {
        int i = 2 % 2;
        int i2 = read + 67;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq = kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector.RemoteActionCompatParcelizer.read(listAsList);
        int i4 = read + 45;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdaiidsddyirtymdul5lt6pmt2zysq;
    }

    public static String write(Object obj, String str) {
        int i = 2 % 2;
        String str2 = str + obj;
        int i2 = write + 67;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str2;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static void serializer(String str) {
        int i = 2 % 2;
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(ff$$ExternalSyntheticOutline0.m("lateinit property ", str, " has not been initialized"));
        RemoteActionCompatParcelizer(uninitializedPropertyAccessException, removeNodeAtDepth.class.getName());
        throw uninitializedPropertyAccessException;
    }

    public static boolean read(Double d, Double d2) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 49;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (d == null) {
            if (d2 != null) {
                return false;
            }
            int i4 = i2 + 39;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        if (d2 != null) {
            int i5 = i2 + 27;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (d.doubleValue() == d2.doubleValue()) {
                int i7 = write + 89;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return true;
            }
        }
        return false;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 47;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (obj != null) {
            return Boolean.valueOf(obj.equals(obj2));
        }
        if (obj2 != null) {
            return false;
        }
        int i5 = i2 + 59;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }

    public static boolean read(Double d, double d2) {
        int i = 2 % 2;
        if (d != null) {
            int i2 = write + 43;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (d.doubleValue() == d2) {
                int i4 = read + 9;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return true;
            }
        }
        int i6 = write + 121;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean IconCompatParcelizer(Float f, Float f2) {
        int i = 2 % 2;
        if (f == null) {
            if (f2 == null) {
                return true;
            }
            int i2 = write + 67;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (f2 != null) {
            int i3 = read + 31;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                f.floatValue();
                f2.floatValue();
                throw null;
            }
            if (f.floatValue() == f2.floatValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        r6 = o.removeNodeAtDepth.read + 35;
        o.removeNodeAtDepth.write = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        if (r1 == r6) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r1 == r6) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object read(java.lang.Object[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            java.lang.Float r1 = (java.lang.Float) r1
            r2 = 1
            r6 = r6[r2]
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            r3 = 2
            int r4 = r3 % r3
            if (r1 == 0) goto L3a
            int r4 = o.removeNodeAtDepth.read
            int r4 = r4 + 117
            int r5 = r4 % 128
            o.removeNodeAtDepth.write = r5
            int r4 = r4 % r3
            float r1 = r1.floatValue()
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 == 0) goto L2a
            r1 = 85
            int r1 = r1 / r0
            if (r6 != 0) goto L3a
            goto L2c
        L2a:
            if (r6 != 0) goto L3a
        L2c:
            int r6 = o.removeNodeAtDepth.read
            int r6 = r6 + 35
            int r0 = r6 % 128
            o.removeNodeAtDepth.write = r0
            int r6 = r6 % r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        L3a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.removeNodeAtDepth.read(java.lang.Object[]):java.lang.Object");
    }

    public static boolean serializer(float f, Float f2) {
        int i = 2 % 2;
        int i2 = read + 9;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (f2 == null || f != f2.floatValue()) {
            return false;
        }
        int i4 = read + 95;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return true;
    }

    public static final r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ IconCompatParcelizer(String str) {
        int i = 2 % 2;
        r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0 r8lambdakypm98j7wxbu_lrn9agxa8gwnh0Serializer = kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector.RemoteActionCompatParcelizer.serializer();
        int i2 = read + 69;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 3 % 3;
        }
        for (int i4 = 0; i4 < str.length(); i4++) {
            int i5 = write + 23;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            r8lambdakypm98j7wxbu_lrn9agxa8gwnh0Serializer.add(Character.valueOf(str.charAt(i4)));
        }
        return r8lambdakypm98j7wxbu_lrn9agxa8gwnh0Serializer.read();
    }

    public static final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk RemoteActionCompatParcelizer(Iterable iterable) {
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        int i = 2 % 2;
        iterable.getClass();
        Object obj = null;
        if (iterable instanceof r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) {
            int i2 = read + 39;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) iterable;
        } else {
            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = null;
        }
        if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk != null) {
            return r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        }
        int i3 = read + 67;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return read(iterable);
        }
        read(iterable);
        obj.hashCode();
        throw null;
    }

    public static void RemoteActionCompatParcelizer(RuntimeException runtimeException, String str) {
        int i = 2 % 2;
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        int i3 = 0;
        while (i3 < length) {
            int i4 = read + 111;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (str.equals(stackTrace[i3].getClassName())) {
                int i6 = write + 119;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i2 = i3;
            }
            i3++;
            int i7 = read + 115;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static getIntentArrayWithConfiguredBackStacklambda0 write(getIntentArrayWithConfiguredBackStacklambda0 getintentarraywithconfiguredbackstacklambda0, Boolean bool, Double d, Double d2) {
        int i = 2 % 2;
        if (getintentarraywithconfiguredbackstacklambda0 == null) {
            getintentarraywithconfiguredbackstacklambda0 = new getIntentArrayWithConfiguredBackStacklambda0(r8lambdaea88sc6bNzdkREmuTaOF4vcCHI.IconCompatParcelizer);
        }
        if (getintentarraywithconfiguredbackstacklambda0.MediaDescriptionCompat == null) {
            int i2 = read + 23;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Double d3 = getintentarraywithconfiguredbackstacklambda0.MediaSessionCompatQueueItem;
            if (d3 != null) {
                d = d3;
            }
            Double dIconCompatParcelizer = RegexKt.IconCompatParcelizer(bool, d2, d);
            if (getintentarraywithconfiguredbackstacklambda0.serializer) {
                int i4 = read + 47;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    getintentarraywithconfiguredbackstacklambda0.MediaDescriptionCompat = dIconCompatParcelizer;
                } else {
                    getintentarraywithconfiguredbackstacklambda0.MediaDescriptionCompat = dIconCompatParcelizer;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        }
        if (getintentarraywithconfiguredbackstacklambda0.serializer && getintentarraywithconfiguredbackstacklambda0.MediaMetadataCompat) {
            int i5 = write + 63;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            getintentarraywithconfiguredbackstacklambda0.serializer = i5 % 2 == 0;
        }
        return getintentarraywithconfiguredbackstacklambda0;
    }

    public static final r8lambdaKGJqwjLmUs58_kpRh__GGuNRqTQ IconCompatParcelizer(Map map) {
        r8lambdaKGJqwjLmUs58_kpRh__GGuNRqTQ r8lambdakgjqwjlmus58_kprh__ggunrqtq;
        int i = 2 % 2;
        map.getClass();
        r8lambdaKGJqwjLmUs58_kpRh__GGuNRqTQ r8lambdakgjqwjlmus58_kprh__ggunrqtqSerializer = null;
        if (map instanceof r8lambdaKGJqwjLmUs58_kpRh__GGuNRqTQ) {
            r8lambdakgjqwjlmus58_kprh__ggunrqtq = (r8lambdaKGJqwjLmUs58_kpRh__GGuNRqTQ) map;
        } else {
            int i2 = write + 87;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambdakgjqwjlmus58_kprh__ggunrqtq = null;
        }
        if (r8lambdakgjqwjlmus58_kprh__ggunrqtq != null) {
            return r8lambdakgjqwjlmus58_kprh__ggunrqtq;
        }
        r8lambdaCsNx3Lz3M5ehl5yX1aUnmTVsjOg r8lambdacsnx3lz3m5ehl5yx1aunmtvsjog = map instanceof r8lambdaCsNx3Lz3M5ehl5yX1aUnmTVsjOg ? (r8lambdaCsNx3Lz3M5ehl5yX1aUnmTVsjOg) map : null;
        if (r8lambdacsnx3lz3m5ehl5yx1aunmtvsjog != null) {
            int i4 = read + 99;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            r8lambdakgjqwjlmus58_kprh__ggunrqtqSerializer = r8lambdacsnx3lz3m5ehl5yx1aunmtvsjog.serializer();
        }
        if (r8lambdakgjqwjlmus58_kprh__ggunrqtqSerializer == null) {
            addInAppMessageViewToViewGrouplambda20 addinappmessageviewtoviewgrouplambda20 = addInAppMessageViewToViewGrouplambda20.IconCompatParcelizer;
            return quadraticBezierTo.write().RemoteActionCompatParcelizer(map);
        }
        int i6 = read + 35;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return r8lambdakgjqwjlmus58_kprh__ggunrqtqSerializer;
    }

    public static final r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ read(Iterable iterable) {
        int i = 2 % 2;
        iterable.getClass();
        r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq = iterable instanceof r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ ? (r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ) iterable : null;
        if (r8lambdaiidsddyirtymdul5lt6pmt2zysq == null) {
            r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0 r8lambdakypm98j7wxbu_lrn9agxa8gwnh0 = iterable instanceof r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0 ? (r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0) iterable : null;
            if (r8lambdakypm98j7wxbu_lrn9agxa8gwnh0 != null) {
                int i2 = write + 49;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                r8lambdaiidsddyirtymdul5lt6pmt2zysq = r8lambdakypm98j7wxbu_lrn9agxa8gwnh0.read();
                int i4 = write + 47;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                r8lambdaiidsddyirtymdul5lt6pmt2zysq = null;
            }
            if (r8lambdaiidsddyirtymdul5lt6pmt2zysq == null) {
                kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector smallPersistentVector = kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector.RemoteActionCompatParcelizer;
                smallPersistentVector.getClass();
                if (iterable instanceof Collection) {
                    return smallPersistentVector.read((Collection) iterable);
                }
                r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0 r8lambdakypm98j7wxbu_lrn9agxa8gwnh0Serializer = smallPersistentVector.serializer();
                onContentCardDismissed.RemoteActionCompatParcelizer(iterable, (Collection) r8lambdakypm98j7wxbu_lrn9agxa8gwnh0Serializer);
                r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq2 = r8lambdakypm98j7wxbu_lrn9agxa8gwnh0Serializer.read();
                int i6 = write + 63;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return r8lambdaiidsddyirtymdul5lt6pmt2zysq2;
                }
                throw null;
            }
        }
        return r8lambdaiidsddyirtymdul5lt6pmt2zysq;
    }

    public static String RemoteActionCompatParcelizer(String str, String str2) {
        int i = 2 % 2;
        int i2 = write + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        int i4 = 0;
        while (i4 < str.length()) {
            sb.append(str.charAt(i4));
            if (str2.length() > i4) {
                sb.append(str2.charAt(i4));
            }
            i4++;
            int i5 = read + 111;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 4 % 2;
            }
        }
        return sb.toString();
    }

    public static void write(Activity activity) {
        int i = 2 % 2;
        int i2 = read + 53;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ComponentCallbacks2 application = activity.getApplication();
            if (application instanceof convertStringJsonArrayToList) {
                int i3 = write + 67;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                convertStringJsonArrayToList convertstringjsonarraytolist = (convertStringJsonArrayToList) application;
                r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 r8lambdalz7kyob69dcxfwdlkmjr4_8s_34IconCompatParcelizer = convertstringjsonarraytolist.IconCompatParcelizer();
                setNativeShader.IconCompatParcelizer(r8lambdalz7kyob69dcxfwdlkmjr4_8s_34IconCompatParcelizer, "%s.androidInjector() returned null", convertstringjsonarraytolist.getClass());
                r8lambdalz7kyob69dcxfwdlkmjr4_8s_34IconCompatParcelizer.inject(activity);
                return;
            }
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer(af$$ExternalSyntheticOutline0.m(application.getClass().getCanonicalName(), " does not implement ", convertStringJsonArrayToList.class.getCanonicalName()));
            return;
        }
        boolean z = activity.getApplication() instanceof convertStringJsonArrayToList;
        throw null;
    }

    private static /* synthetic */ Object MediaDescriptionCompat(Object[] objArr) throws IOException {
        List list;
        SSLSession sSLSession = (SSLSession) objArr[0];
        int i = 2;
        int i2 = 2 % 2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("cipherSuite == null");
            int i3 = read + 87;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return null;
        }
        int i5 = read + 45;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        getAppropriateImageUrllambda0 getappropriateimageurllambda0Write = getAppropriateImageUrllambda0.Companion.write(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("tlsVersion == null");
            return null;
        }
        if (!"NONE".equals(protocol)) {
            _get_messageWebView_lambda2.Companion.getClass();
            _get_messageWebView_lambda2 _get_messagewebview_lambda2RemoteActionCompatParcelizer = getWebViewViewId.RemoteActionCompatParcelizer(protocol);
            try {
                list = setWebViewContent.read(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                list = instance_delegatelambda0.write;
            }
            return new applyDisplayCutoutMarginsToCloseButton(_get_messagewebview_lambda2RemoteActionCompatParcelizer, getappropriateimageurllambda0Write, setWebViewContent.read(sSLSession.getLocalCertificates()), new c8$$ExternalSyntheticLambda3(list, i));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("tlsVersion == NONE");
        int i7 = write + 61;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp;
        View view = (View) objArr[0];
        int i = 2 % 2;
        view.getClass();
        while (true) {
            Object obj = null;
            if (view == null) {
                return null;
            }
            int i2 = read + 7;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                boolean z = view.getTag(com.logistics.rider.glovo.R.id.view_tree_lifecycle_owner) instanceof accessisRenderNodeCompatiblecp;
                obj.hashCode();
                throw null;
            }
            Object tag = view.getTag(com.logistics.rider.glovo.R.id.view_tree_lifecycle_owner);
            if (tag instanceof accessisRenderNodeCompatiblecp) {
                accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) tag;
            } else {
                int i3 = read + 87;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                accessisrendernodecompatiblecp = null;
            }
            if (accessisrendernodecompatiblecp != null) {
                return accessisrendernodecompatiblecp;
            }
            Object objRemoteActionCompatParcelizer = MathKt.RemoteActionCompatParcelizer(view);
            view = objRemoteActionCompatParcelizer instanceof View ? (View) objRemoteActionCompatParcelizer : null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[PHI: r5
  0x0031: PHI (r5v5 io.sentry.SentryOptions) = (r5v4 io.sentry.SentryOptions), (r5v7 io.sentry.SentryOptions) binds: [B:8:0x002f, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if ((!r11.RatingCompat()) != true) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r11.RatingCompat() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r0 = r11.MediaMetadataCompat();
        r1 = r11.RemoteActionCompatParcelizer(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r5.isPropagateTraceparent() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        r11 = r11.RemoteActionCompatParcelizer();
        r8 = new io.sentry.CombinedScopeView(r11.PlaybackStateCompat, r11.ParcelableVolumeInfo, r0.write, r6);
        r11 = o.removeNodeAtDepth.read + 97;
        o.removeNodeAtDepth.write = r11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        return new io.sentry.CombinedScopeView(r0, r1, r8, r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object write(java.lang.Object[] r11) {
        /*
            r0 = 0
            r1 = r11[r0]
            o.AddToCustomAttributeArrayStep r1 = (o.AddToCustomAttributeArrayStep) r1
            r2 = 1
            r3 = r11[r2]
            java.util.List r3 = (java.util.List) r3
            r4 = 2
            r11 = r11[r4]
            o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r11 = (o.r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0) r11
            int r5 = r4 % r4
            int r5 = o.removeNodeAtDepth.read
            int r5 = r5 + 9
            int r6 = r5 % 128
            o.removeNodeAtDepth.write = r6
            int r5 = r5 % r4
            r6 = 28
            r7 = 29
            r8 = 0
            if (r5 == 0) goto L2b
            io.sentry.SentryOptions r5 = r1.RemoteActionCompatParcelizer()
            r9 = 29
            int r9 = r9 / r0
            if (r11 == 0) goto L78
            goto L31
        L2b:
            io.sentry.SentryOptions r5 = r1.RemoteActionCompatParcelizer()
            if (r11 == 0) goto L78
        L31:
            int r9 = o.removeNodeAtDepth.read
            int r9 = r9 + 95
            int r10 = r9 % 128
            o.removeNodeAtDepth.write = r10
            int r9 = r9 % r4
            if (r9 == 0) goto L46
            boolean r9 = r11.RatingCompat()
            r10 = 2
            int r10 = r10 / r0
            r9 = r9 ^ r2
            if (r9 == r2) goto L4c
            goto L78
        L46:
            boolean r2 = r11.RatingCompat()
            if (r2 != 0) goto L78
        L4c:
            o.r8lambdazCSTvUxnN2DQKjUJw_i0zIaaZj0 r0 = r11.MediaMetadataCompat()
            o.mergeJsonObjectslambda00 r1 = r11.RemoteActionCompatParcelizer(r3)
            boolean r2 = r5.isPropagateTraceparent()
            if (r2 == 0) goto L72
            o.r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r11 = r11.RemoteActionCompatParcelizer()
            io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r2 = r11.PlaybackStateCompat
            o.r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r11 = r11.ParcelableVolumeInfo
            java.lang.Boolean r3 = r0.write
            io.sentry.CombinedScopeView r8 = new io.sentry.CombinedScopeView
            r8.<init>(r2, r11, r3, r6)
            int r11 = o.removeNodeAtDepth.read
            int r11 = r11 + 97
            int r2 = r11 % 128
            o.removeNodeAtDepth.write = r2
            int r11 = r11 % r4
        L72:
            io.sentry.CombinedScopeView r11 = new io.sentry.CombinedScopeView
            r11.<init>(r0, r1, r8, r7)
            return r11
        L78:
            o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release r11 = new o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release
            r2 = 17
            r11.<init>(r2, r0)
            r11.write = r8
            com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3 r0 = new com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3
            r2 = 22
            r0.<init>(r11, r2, r5)
            r1.RemoteActionCompatParcelizer(r0)
            java.lang.Object r11 = r11.write
            o._get_messageWebView_lambda0 r11 = (o._get_messageWebView_lambda0) r11
            if (r11 == 0) goto Lbb
            java.lang.Object r0 = r11.read
            o.getIntentArrayWithConfiguredBackStacklambda0 r0 = (o.getIntentArrayWithConfiguredBackStacklambda0) r0
            java.lang.Object r1 = r11.IconCompatParcelizer
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Object r2 = r11.RemoteActionCompatParcelizer
            o.r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r2 = (o.r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k) r2
            java.lang.Object r11 = r11.write
            io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r11 = (io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) r11
            o.mergeJsonObjectslambda00 r0 = o.mergeJsonObjectslambda00.serializer(r0, r3)
            o.r8lambdazCSTvUxnN2DQKjUJw_i0zIaaZj0 r3 = new o.r8lambdazCSTvUxnN2DQKjUJw_i0zIaaZj0
            r3.<init>(r11, r2, r1)
            boolean r4 = r5.isPropagateTraceparent()
            if (r4 == 0) goto Lb5
            io.sentry.CombinedScopeView r8 = new io.sentry.CombinedScopeView
            r8.<init>(r11, r2, r1, r6)
        Lb5:
            io.sentry.CombinedScopeView r11 = new io.sentry.CombinedScopeView
            r11.<init>(r3, r0, r8, r7)
            return r11
        Lbb:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.removeNodeAtDepth.write(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    public static final void serializer(createFromFile createfromfile, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        boolean z2;
        int i3;
        int i4 = 2 % 2;
        createfromfile.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1826030529);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(createfromfile) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                int i5 = read + 115;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i7 = 0;
        if ((i2 & 19) != 18) {
            int i8 = read + 61;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            getQueryContext getquerycontext = createfromfile.MediaDescriptionCompat;
            boolean z3 = (i2 & 112) == 32;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z3) {
                objComponentActivity = new createFromAssets(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, i7);
                getpostalcode2.write(objComponentActivity);
            } else {
                int i10 = read + 47;
                write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new createFromAssets(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, i7);
                    getpostalcode2.write(objComponentActivity);
                }
            }
            androidx.sqlite.SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode2, 8);
            TypefaceCompatApi26 typefaceCompatApi26 = (TypefaceCompatApi26) coil3.ExtrasKt.write(createfromfile.RemoteActionCompatParcelizer, getpostalcode2, 0).getValue();
            if (typefaceCompatApi26 == null) {
                getpostalcode2.serializer(780780054);
                getpostalcode2.IconCompatParcelizer(false);
                getpostalcode = getpostalcode2;
            } else {
                getpostalcode2.serializer(780780055);
                generatePOSTBodyString generatepostbodystring = new generatePOSTBodyString(typefaceCompatApi26.read, false, typefaceCompatApi26.serializer, typefaceCompatApi26.write, null, null, 120, null);
                int i12 = i2 & 14;
                if (i12 == 4) {
                    z2 = true;
                } else {
                    int i13 = write + 61;
                    read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    z2 = false;
                }
                Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                if (z2) {
                    objComponentActivity2 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(createfromfile, 6);
                    getpostalcode2.write(objComponentActivity2);
                } else {
                    int i15 = read + 25;
                    write = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(createfromfile, 6);
                        getpostalcode2.write(objComponentActivity2);
                    }
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2);
                boolean z4 = i12 == 4;
                Object objComponentActivity3 = getpostalcode2.ComponentActivity();
                if (z4) {
                    objComponentActivity3 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(createfromfile, 7);
                    getpostalcode2.write(objComponentActivity3);
                } else {
                    int i17 = read + 7;
                    write = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    if (objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(createfromfile, 7);
                        getpostalcode2.write(objComponentActivity3);
                    }
                }
                getpostalcode = getpostalcode2;
                MessagePopUpKt.serializer(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3), null, null, null, getpostalcode2, 0, 476);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SizeKt(i, 6, createfromfile, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
        }
    }

    public static CombinedScopeView write(AddToCustomAttributeArrayStep addToCustomAttributeArrayStep, List list, r8lambdaREqVhj3p9OuLe_afn8An0R0tlg0 r8lambdareqvhj3p9oule_afn8an0r0tlg0) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        return (CombinedScopeView) RemoteActionCompatParcelizer(iWrite, -7767772, 7767775, getCieXyz.write(), iWrite2, new Object[]{addToCustomAttributeArrayStep, list, r8lambdareqvhj3p9oule_afn8an0r0tlg0}, iWrite3);
    }

    public static applyDisplayCutoutMarginsToCloseButton serializer(SSLSession sSLSession) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        return (applyDisplayCutoutMarginsToCloseButton) RemoteActionCompatParcelizer(iWrite, -368093095, 368093099, getCieXyz.write(), iWrite2, new Object[]{sSLSession}, iWrite3);
    }

    public static final accessisRenderNodeCompatiblecp RemoteActionCompatParcelizer(View view) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        return (accessisRenderNodeCompatiblecp) RemoteActionCompatParcelizer(iWrite, 1819368283, -1819368281, getCieXyz.write(), iWrite2, new Object[]{view}, iWrite3);
    }

    public static boolean write(Object obj, Object obj2) {
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        return ((Boolean) RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{obj, obj2}, iWrite3)).booleanValue();
    }

    public static boolean write(Float f, float f2) {
        Object[] objArr = {f, Float.valueOf(f2)};
        return ((Boolean) RemoteActionCompatParcelizer(getCieXyz.write(), -531493232, 531493233, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }
}
