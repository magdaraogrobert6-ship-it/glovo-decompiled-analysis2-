package o;

import android.os.Build;
import android.os.Trace;
import androidx.datastore.core.SimpleActor$offer$2;
import androidx.datastore.core.SingleProcessDataStore$file$2;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.internal.EnumSerializer;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw {
    public static Method MediaBrowserCompatMediaItem = null;
    public static Method MediaDescriptionCompat = null;
    public static Method MediaMetadataCompat = null;
    public static long MediaSessionCompatQueueItem = 0;
    public static volatile DelegatableNode_androidKt MediaSessionCompatResultReceiverWrapper = null;
    public static Method RatingCompat = null;
    private static int read = 0;
    private static int serializer = 1;

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = i4 | i2;
        int i8 = ~((~i2) | i4);
        int i9 = ~i4;
        int i10 = i8 | (~(i9 | i | i2));
        int i11 = (~(i2 | i9)) | i;
        int i12 = i4 + i + i3 + (2127773517 * i6) + (1026174006 * i5);
        int i13 = i12 * i12;
        int i14 = (i4 * (-484454144)) + 743702528 + ((-484454144) * i) + (i7 * (-1605095679)) + (1605095679 * i10) + ((-1605095679) * i11) + ((-2089549824) * i3) + (367263744 * i6) + ((-1434976256) * i5) + (1105526784 * i13);
        int i15 = (i4 * 21308160) + 1622758390 + (i * 21308160) + (i7 * 947) + (i10 * (-947)) + (i11 * 947) + (i3 * 21309107) + (i6 * 1708896471) + (i5 * 664464834) + (i13 * 287244288);
        int i16 = i14 + (i15 * i15 * 966983680);
        if (i16 != 1) {
            return i16 != 2 ? serializer(objArr) : IconCompatParcelizer(objArr);
        }
        return RemoteActionCompatParcelizer(objArr);
    }

    public String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 79;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public String serializer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 111;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 11;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return null;
    }

    public static final void read(String str) {
        int i = 2 % 2;
        int i2 = read + 61;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        Trace.beginSection(write(str));
        int i4 = read + 51;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final int IconCompatParcelizer(int i, String str) {
        int iCharAt;
        int i2 = 2 % 2;
        int i3 = serializer + 73;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            char cCharAt = str.charAt(i);
            iCharAt = (cCharAt >>> 'V') - str.charAt(i % 1);
        } else {
            char cCharAt2 = str.charAt(i);
            iCharAt = (cCharAt2 << 7) + str.charAt(i + 1);
        }
        int i4 = read + 21;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iCharAt;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) throws IOException {
        Closeable closeable = (Closeable) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = serializer + 21;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return null;
            }
            try {
                closeable.close();
                return null;
            } catch (Throwable th2) {
                markOnScreenCardsAsReadlambda1.read(th, th2);
            }
        }
        int i4 = serializer + 53;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }

    public static void serializer(Exception exc) throws Throwable {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 103;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            boolean z = exc instanceof InvocationTargetException;
            throw null;
        }
        if (exc instanceof InvocationTargetException) {
            int i4 = i2 + 93;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Throwable cause = ((InvocationTargetException) exc).getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            }
            DrawableTransformation.read(cause);
        }
    }

    public static String write(String str) {
        String str2;
        int i = 2 % 2;
        int i2 = serializer + 21;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (str.length() <= 127) {
            int i4 = serializer + 19;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            str2 = str;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return str.substring(0, 127);
        }
        int i6 = serializer + 97;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return str2;
    }

    public static void write(int i, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = 0;
        while (i3 < i) {
            if (objArr[i3] == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i3, "at index "));
                break;
            }
            int i4 = serializer + 17;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i5;
            i3 = i4 % 2 != 0 ? i3 + 98 : i3 + 1;
            int i6 = i5 + 95;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        int i8 = read + 17;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        performCustomEnterMxy_nc0 speculativehit = (accessgetAlwayscp) objArr[0];
        List list = (List) objArr[1];
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objArr[2];
        int i = 3;
        SingleProcessDataStore$file$2 singleProcessDataStore$file$2 = (SingleProcessDataStore$file$2) objArr[3];
        int i2 = 2 % 2;
        int i3 = serializer + 7;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 % 2 != 0) {
            androidx.datastore.preferences.core.PreferencesSerializer preferencesSerializer = androidx.datastore.preferences.core.PreferencesSerializer.IconCompatParcelizer;
            getcontentviewgroupparentlayout.getClass();
            throw null;
        }
        androidx.datastore.preferences.core.PreferencesSerializer preferencesSerializer2 = androidx.datastore.preferences.core.PreferencesSerializer.IconCompatParcelizer;
        getcontentviewgroupparentlayout.getClass();
        if (speculativehit == null) {
            speculativehit = new speculativeHit(i);
            int i4 = read + 97;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        performCustomEnterMxy_nc0 performcustomentermxy_nc0 = speculativehit;
        Object[] objArr2 = {new SimpleActor$offer$2(list, shortNewsContentCardView, 4)};
        int iSerializer = getQueryParameterslambda2.serializer();
        return new androidx.datastore.core.SingleProcessDataStore(singleProcessDataStore$file$2, preferencesSerializer2, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr2, getQueryParameterslambda2.serializer(), -516583649, iSerializer), performcustomentermxy_nc0, getcontentviewgroupparentlayout);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public static final void write(AnchoredDraggableKt anchoredDraggableKt, int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 5;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 15 / 0;
            if (anchoredDraggableKt.RemoteActionCompatParcelizer != 0) {
                if (anchoredDraggableKt.RemoteActionCompatParcelizer(0) != i) {
                    return;
                }
                int i5 = read + 9;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (anchoredDraggableKt.RemoteActionCompatParcelizer(anchoredDraggableKt.RemoteActionCompatParcelizer - 1) == i) {
                    return;
                }
            }
        } else if (anchoredDraggableKt.RemoteActionCompatParcelizer != 0) {
            if (anchoredDraggableKt.RemoteActionCompatParcelizer(0) != i) {
                return;
            }
            int i7 = read + 9;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (anchoredDraggableKt.RemoteActionCompatParcelizer(anchoredDraggableKt.RemoteActionCompatParcelizer - 1) == i) {
                return;
            }
        }
        int i9 = anchoredDraggableKt.RemoteActionCompatParcelizer;
        anchoredDraggableKt.IconCompatParcelizer(i);
        while (i9 > 0) {
            int i10 = ((i9 + 1) >>> 1) - 1;
            int iRemoteActionCompatParcelizer = anchoredDraggableKt.RemoteActionCompatParcelizer(i10);
            if (i <= iRemoteActionCompatParcelizer) {
                break;
            }
            anchoredDraggableKt.write(i9, iRemoteActionCompatParcelizer);
            i9 = i10;
        }
        anchoredDraggableKt.write(i9, i);
    }

    public static OnGoogleAdIdReadListener serializer(String str) {
        int i = 2 % 2;
        int i2 = read + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        try {
            if (i2 % 2 == 0) {
                r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = getModulateAlphake2Ky5w.serializer;
                r8lambda3kmch7yklpui_5smgazrgczhglc.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(OnGoogleAdIdReadListener.Companion.serializer());
                throw null;
            }
            r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc2 = getModulateAlphake2Ky5w.serializer;
            r8lambda3kmch7yklpui_5smgazrgczhglc2.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = LazyKt__LazyJVMKt.read(OnGoogleAdIdReadListener.Companion.serializer());
            OnGoogleAdIdReadListener onGoogleAdIdReadListener = (OnGoogleAdIdReadListener) r8lambda3kmch7yklpui_5smgazrgczhglc2.serializer(str, setgraphicmodalmaxwidthdp2);
            int i3 = read + 13;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 92 / 0;
            }
            return onGoogleAdIdReadListener;
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.write(new Throwable(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                         |Error in deserializing the JSON data in type converter\n                         |json value = " + str + "\n                        "), e));
            return null;
        }
    }

    public static final EnumSerializer serializer(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        int i = 2 % 2;
        enumArr.getClass();
        r8lambdazCd1z82txJou5vkO0oL_06hVCA r8lambdazcd1z82txjou5vko0ol_06hvca = new r8lambdazCd1z82txJou5vkO0oL_06hVCA(str, enumArr.length);
        int length = enumArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = read + 13;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Enum r6 = enumArr[i2];
            String strName = (String) onContentCardClicked.IconCompatParcelizer(i3, strArr);
            if (strName == null) {
                strName = r6.name();
            }
            r8lambdazcd1z82txjou5vko0ol_06hvca.read(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) onContentCardClicked.IconCompatParcelizer(i3, annotationArr);
            if (annotationArr2 != null) {
                int i6 = serializer + 65;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                for (Annotation annotation : annotationArr2) {
                    r8lambdazcd1z82txjou5vko0ol_06hvca.IconCompatParcelizer(annotation);
                }
            }
            i2++;
            i3++;
        }
        EnumSerializer enumSerializer = new EnumSerializer(str, enumArr);
        enumSerializer.write = r8lambdazcd1z82txjou5vko0ol_06hvca;
        return enumSerializer;
    }

    public static final void read(int i, String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = serializer + 91;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (Build.VERSION.SDK_INT >= 29) {
            invoke0d7_KjU.RemoteActionCompatParcelizer(i, write(str));
            return;
        }
        String strWrite = write(str);
        try {
            if (MediaBrowserCompatMediaItem == null) {
                int i5 = read + 67;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                MediaBrowserCompatMediaItem = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                int i7 = serializer + 17;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
            Method method = MediaBrowserCompatMediaItem;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(MediaSessionCompatQueueItem), strWrite, Integer.valueOf(i));
            int i9 = serializer + 81;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                throw null;
            }
        } catch (Exception e) {
            serializer(e);
        }
    }

    public static final int RemoteActionCompatParcelizer(AnchoredDraggableKt anchoredDraggableKt) {
        int i;
        int iRemoteActionCompatParcelizer;
        int i2 = 2 % 2;
        int i3 = anchoredDraggableKt.RemoteActionCompatParcelizer;
        int iRemoteActionCompatParcelizer2 = anchoredDraggableKt.RemoteActionCompatParcelizer(0);
        while (anchoredDraggableKt.RemoteActionCompatParcelizer != 0 && anchoredDraggableKt.RemoteActionCompatParcelizer(0) == iRemoteActionCompatParcelizer2) {
            int i4 = read + 33;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                anchoredDraggableKt.write(1, anchoredDraggableKt.read());
                i = anchoredDraggableKt.RemoteActionCompatParcelizer >>> 1;
            } else {
                anchoredDraggableKt.write(0, anchoredDraggableKt.read());
                i = anchoredDraggableKt.RemoteActionCompatParcelizer - 1;
            }
            anchoredDraggableKt.read(i);
            int i5 = anchoredDraggableKt.RemoteActionCompatParcelizer;
            int i6 = 0;
            while (i6 < (i5 >>> 1)) {
                int iRemoteActionCompatParcelizer3 = anchoredDraggableKt.RemoteActionCompatParcelizer(i6);
                int i7 = (i6 + 1) * 2;
                int i8 = i7 - 1;
                int iRemoteActionCompatParcelizer4 = anchoredDraggableKt.RemoteActionCompatParcelizer(i8);
                if (i7 < i5 && (iRemoteActionCompatParcelizer = anchoredDraggableKt.RemoteActionCompatParcelizer(i7)) > iRemoteActionCompatParcelizer4) {
                    if (iRemoteActionCompatParcelizer <= iRemoteActionCompatParcelizer3) {
                        break;
                    }
                    anchoredDraggableKt.write(i6, iRemoteActionCompatParcelizer);
                    anchoredDraggableKt.write(i7, iRemoteActionCompatParcelizer3);
                    i6 = i7;
                } else {
                    if (iRemoteActionCompatParcelizer4 <= iRemoteActionCompatParcelizer3) {
                        break;
                    }
                    anchoredDraggableKt.write(i6, iRemoteActionCompatParcelizer4);
                    anchoredDraggableKt.write(i8, iRemoteActionCompatParcelizer3);
                    i6 = i8;
                }
            }
        }
        int i9 = serializer + 91;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return iRemoteActionCompatParcelizer2;
        }
        throw null;
    }

    public static final void RemoteActionCompatParcelizer(int i, String str) throws Throwable {
        int i2 = 2 % 2;
        str.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            invoke0d7_KjU.serializer(i, write(str));
            return;
        }
        String strWrite = write(str);
        try {
            if (RatingCompat == null) {
                int i3 = serializer + 83;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                RatingCompat = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            Method method = RatingCompat;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            method.invoke(null, Long.valueOf(MediaSessionCompatQueueItem), strWrite, Integer.valueOf(i));
            int i5 = read + 15;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } catch (Exception e) {
            serializer(e);
        }
    }

    public static final void write(int i, String str) throws Throwable {
        int i2 = 2 % 2;
        str.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            int i3 = serializer + 11;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            invoke0d7_KjU.IconCompatParcelizer(i, write(str));
            return;
        }
        String strWrite = write(str);
        try {
            if (MediaDescriptionCompat == null) {
                MediaDescriptionCompat = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                int i5 = serializer + 115;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            Method method = MediaDescriptionCompat;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int i7 = read + 51;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                method.invoke(null, Long.valueOf(MediaSessionCompatQueueItem), strWrite, Integer.valueOf(i));
                return;
            }
            Object[] objArr = new Object[5];
            objArr[1] = Long.valueOf(MediaSessionCompatQueueItem);
            objArr[0] = strWrite;
            objArr[3] = Integer.valueOf(i);
            method.invoke(null, objArr);
        } catch (Exception e) {
            serializer(e);
        }
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) throws Throwable {
        int i = 2 % 2;
        int i2 = serializer + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0 ? Build.VERSION.SDK_INT >= 29 : Build.VERSION.SDK_INT >= 69) {
            int i3 = serializer + 39;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return Boolean.valueOf(invoke0d7_KjU.RemoteActionCompatParcelizer());
            }
            invoke0d7_KjU.RemoteActionCompatParcelizer();
            throw null;
        }
        try {
            if (MediaMetadataCompat == null) {
                int i4 = read + 91;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                MediaSessionCompatQueueItem = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                MediaMetadataCompat = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            Method method = MediaMetadataCompat;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object objInvoke = method.invoke(null, Long.valueOf(MediaSessionCompatQueueItem));
            objInvoke.getClass();
            return Boolean.valueOf(((Boolean) objInvoke).booleanValue());
        } catch (Exception e) {
            serializer(e);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    public static List RemoteActionCompatParcelizer(Class cls, Iterable iterable, ClassLoader classLoader, r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks) {
        ?? Load;
        int i = 2 % 2;
        try {
            Class.forName("android.app.Application", false, classLoader);
            Load = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                int i2 = read + 9;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                Class cls2 = (Class) it.next();
                Object objNewInstance = null;
                try {
                    objNewInstance = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                    int i4 = read + 21;
                    serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                } catch (ClassCastException unused) {
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (objNewInstance != null) {
                    Load.add(objNewInstance);
                }
            }
        } catch (Exception unused2) {
            Load = ServiceLoader.load(cls, classLoader);
            if (!Load.iterator().hasNext()) {
                Load = ServiceLoader.load(cls);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : Load) {
            int i6 = r8lambdakctilwmporjfcawe8asdqv1ks.RemoteActionCompatParcelizer;
            if (i6 == 6) {
                ((wouldPushPermissionPromptDisplaylambda3) obj).getClass();
            } else if (i6 != 7) {
                ((getDeclaredMethodQuietlylambda0) obj).getClass();
            } else {
                ((wouldPushPermissionPromptDisplaylambda5) obj).getClass();
                int i7 = serializer + 97;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
            arrayList.add(obj);
        }
        Collections.sort(arrayList, Collections.reverseOrder(new getMethodQuietlylambda0(r8lambdakctilwmporjfcawe8asdqv1ks)));
        return Collections.unmodifiableList(arrayList);
    }

    public static final boolean MediaMetadataCompat() {
        int i = sourceInformationContextOfdefault.read();
        int i2 = sourceInformationContextOfdefault.read();
        int i3 = sourceInformationContextOfdefault.read();
        return ((Boolean) IconCompatParcelizer(-1240730099, i, i2, 1240730100, sourceInformationContextOfdefault.read(), new Object[0], i3)).booleanValue();
    }

    public static androidx.datastore.core.SingleProcessDataStore IconCompatParcelizer(accessgetAlwayscp accessgetalwayscp, List list, getContentViewGroupParentLayout getcontentviewgroupparentlayout, SingleProcessDataStore$file$2 singleProcessDataStore$file$2) {
        int i = sourceInformationContextOfdefault.read();
        int i2 = sourceInformationContextOfdefault.read();
        int i3 = sourceInformationContextOfdefault.read();
        return (androidx.datastore.core.SingleProcessDataStore) IconCompatParcelizer(-756067223, i, i2, 756067223, sourceInformationContextOfdefault.read(), new Object[]{accessgetalwayscp, list, getcontentviewgroupparentlayout, singleProcessDataStore$file$2}, i3);
    }

    public static final void serializer(Closeable closeable, Throwable th) {
        int i = sourceInformationContextOfdefault.read();
        int i2 = sourceInformationContextOfdefault.read();
        int i3 = sourceInformationContextOfdefault.read();
        IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{closeable, th}, i3);
    }
}
