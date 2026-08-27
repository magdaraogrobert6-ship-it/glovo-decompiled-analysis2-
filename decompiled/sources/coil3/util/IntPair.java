package coil3.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.StrictMode;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import o.DrawableTransformation;
import o.TooltipKt;
import o.applyDisplayCutoutMarginsToCloseButtonlambda0;
import o.captureRulersIfNeededui;
import o.findRulerValue;
import o.getAlignmentLinesMap;
import o.getBirthDateFull;
import o.getButtonAEK5gGoQ;
import o.getCommaEK5gGoQ;
import o.getHasMeasureResult;
import o.getNewPassword;
import o.getPositionInRoot;
import o.getPostalCode;
import o.getSupportCompoundDrawablesTintMode;
import o.provideRelativeRulerValue;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeDelayedExecution;
import o.setButtonViews;
import o.setRoundRectOutlineTNW_H78default;

/* JADX INFO: loaded from: classes.dex */
public abstract class IntPair {
    public static volatile getButtonAEK5gGoQ read = null;
    private static int serializer = 0;
    private static int write = 1;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i4 | i6);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i6)) | (~(i7 | i9)) | (~(i9 | i6));
        int i14 = i6 + i2 + i3 + (669352129 * i5) + (266941808 * i);
        int i15 = i14 * i14;
        int i16 = (720661947 * i6) + 1572077568 + ((-1243901369) * i2) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i3) + ((-1100480512) * i5) + ((-1249902592) * i) + ((-491520000) * i15);
        int i17 = (i6 * 1617402437) + 56426783 + (i2 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (i3 * 1617401855) + (i5 * 1244927807) + (i * (-404665712)) + (i15 * (-45350912));
        int i18 = i16 + (i17 * i17 * 1565261824);
        if (i18 == 1) {
            return IconCompatParcelizer(objArr);
        }
        if (i18 == 2) {
            return RemoteActionCompatParcelizer(objArr);
        }
        if (i18 == 3) {
            return write(objArr);
        }
        int i19 = 2 % 2;
        removeDelayedExecution removedelayedexecution = new removeDelayedExecution((String) objArr[0], (String) objArr[1]);
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(removeDelayedExecution.class);
        capturerulersifneededuiWrite.MediaSessionCompatQueueItem = 1;
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = new findRulerValue(0, removedelayedexecution);
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer = capturerulersifneededuiWrite.IconCompatParcelizer();
        int i20 = write + 105;
        serializer = i20 % Fields.SpotShadowColor;
        int i21 = i20 % 2;
        return gethasmeasureresultIconCompatParcelizer;
    }

    public static ExecutorService read(Context context) {
        if (read == null) {
            synchronized (IntPair.class) {
                if (read == null) {
                    read = new getButtonAEK5gGoQ(context, new LinkedBlockingQueue(), new getCommaEK5gGoQ(0));
                }
            }
        }
        return read;
    }

    public static Drawable write(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = write + 97;
        serializer = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            getSupportCompoundDrawablesTintMode.write().RemoteActionCompatParcelizer(context, i);
            throw null;
        }
        Drawable drawableRemoteActionCompatParcelizer = getSupportCompoundDrawablesTintMode.write().RemoteActionCompatParcelizer(context, i);
        int i4 = write + 73;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return drawableRemoteActionCompatParcelizer;
        }
        obj.hashCode();
        throw null;
    }

    public static long read(int i, int i2) {
        long j;
        int i3 = 2 % 2;
        int i4 = write + 97;
        int i5 = i4 % Fields.SpotShadowColor;
        serializer = i5;
        if (i4 % 2 != 0) {
            j = (((long) i2) * 4294967295L) ^ (((long) i) >> 98);
        } else {
            j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        }
        int i6 = i5 + 67;
        write = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public static final void serializer(applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0, String str) {
        int i = 2 % 2;
        int i2 = serializer + 107;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            applydisplaycutoutmarginstoclosebuttonlambda0.IconCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0.maxRequestsPerHost + 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
            throw null;
        }
        applydisplaycutoutmarginstoclosebuttonlambda0.IconCompatParcelizer(applydisplaycutoutmarginstoclosebuttonlambda0.maxRequestsPerHost - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final void write(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = serializer + 23;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (i <= i2) {
            return;
        }
        DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i, i2, "toIndex (", ") is greater than size (", ")."));
        int i6 = write + 35;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 63 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object RemoteActionCompatParcelizer(java.lang.Object[] r5) {
        /*
            r0 = 0
            r5 = r5[r0]
            java.util.concurrent.Executor r5 = (java.util.concurrent.Executor) r5
            r1 = 2
            int r2 = r1 % r1
            boolean r2 = r5 instanceof o.setButtonViews
            r3 = 0
            if (r2 == 0) goto L22
            int r2 = coil3.util.IntPair.write
            int r2 = r2 + 99
            int r4 = r2 % 128
            coil3.util.IntPair.serializer = r4
            int r2 = r2 % r1
            if (r2 != 0) goto L1c
            r3 = r5
            o.setButtonViews r3 = (o.setButtonViews) r3
            goto L2b
        L1c:
            o.setButtonViews r5 = (o.setButtonViews) r5
            r3.hashCode()
            throw r3
        L22:
            int r2 = coil3.util.IntPair.write
            int r2 = r2 + 31
            int r4 = r2 % 128
            coil3.util.IntPair.serializer = r4
            int r2 = r2 % r1
        L2b:
            if (r3 == 0) goto L46
            int r2 = coil3.util.IntPair.serializer
            int r2 = r2 + 119
            int r4 = r2 % 128
            coil3.util.IntPair.write = r4
            int r2 = r2 % r1
            if (r2 != 0) goto L40
            kotlinx.coroutines.CoroutineDispatcher r1 = r3.serializer
            r2 = 73
            int r2 = r2 / r0
            if (r1 != 0) goto L45
            goto L46
        L40:
            kotlinx.coroutines.CoroutineDispatcher r1 = r3.serializer
            if (r1 != 0) goto L45
            goto L46
        L45:
            return r1
        L46:
            kotlinx.coroutines.ExecutorCoroutineDispatcherImpl r0 = new kotlinx.coroutines.ExecutorCoroutineDispatcherImpl
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.util.IntPair.RemoteActionCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    public static final Executor write(CoroutineDispatcher coroutineDispatcher) {
        Executor executor;
        int i = 2 % 2;
        int i2 = serializer + 55;
        write = i2 % Fields.SpotShadowColor;
        ExecutorCoroutineDispatcher executorCoroutineDispatcher = null;
        if (i2 % 2 == 0) {
            boolean z = coroutineDispatcher instanceof ExecutorCoroutineDispatcher;
            executorCoroutineDispatcher.hashCode();
            throw null;
        }
        executorCoroutineDispatcher = coroutineDispatcher instanceof ExecutorCoroutineDispatcher ? (ExecutorCoroutineDispatcher) coroutineDispatcher : null;
        if (executorCoroutineDispatcher == null || (executor = executorCoroutineDispatcher.getExecutor()) == null) {
            return new setButtonViews(coroutineDispatcher);
        }
        int i3 = serializer + 31;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return executor;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        applyDisplayCutoutMarginsToCloseButtonlambda0.RemoteActionCompatParcelizer((applyDisplayCutoutMarginsToCloseButtonlambda0) objArr[0], "Unexpected special floating-point value " + ((Number) objArr[1]) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final float RemoteActionCompatParcelizer(getBirthDateFull getbirthdatefull) {
        int i = 2 % 2;
        int i2 = serializer + 71;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Density density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
        WeakHashMap weakHashMap = TooltipKt.serializer;
        float fMo45toDpu2uoSUM = density.mo45toDpu2uoSUM(setRoundRectOutlineTNW_H78default.read(getpostalcode).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer().write);
        int i4 = write + 37;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
        }
        return fMo45toDpu2uoSUM;
    }

    public static final JsonDecodingException IconCompatParcelizer(CharSequence charSequence, int i, String str) {
        int i2 = 2 % 2;
        charSequence.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\nJSON input: ");
        sb.append(RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1928934327, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{Integer.valueOf(i), charSequence}, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1928934330));
        JsonDecodingException jsonDecodingExceptionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i, sb.toString());
        int i3 = serializer + 17;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return jsonDecodingExceptionRemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getHasMeasureResult IconCompatParcelizer(String str, getAlignmentLinesMap getalignmentlinesmap) {
        int i = 2 % 2;
        captureRulersIfNeededui capturerulersifneededuiWrite = getHasMeasureResult.write(removeDelayedExecution.class);
        capturerulersifneededuiWrite.MediaSessionCompatQueueItem = 1;
        capturerulersifneededuiWrite.write(provideRelativeRulerValue.read(Context.class));
        capturerulersifneededuiWrite.RemoteActionCompatParcelizer = new JankStatsFrameTracker$$ExternalSyntheticLambda3(str, 10, getalignmentlinesmap);
        getHasMeasureResult gethasmeasureresultIconCompatParcelizer = capturerulersifneededuiWrite.IconCompatParcelizer();
        int i2 = serializer + 43;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return gethasmeasureresultIconCompatParcelizer;
    }

    public static final JsonEncodingException write(String str, Number number) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        sb.append(RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1928934327, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{-1, str}, iRemoteActionCompatParcelizer, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1928934330));
        JsonEncodingException jsonEncodingException = new JsonEncodingException(sb.toString());
        int i2 = serializer + 9;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return jsonEncodingException;
    }

    public static final JsonDecodingException RemoteActionCompatParcelizer(int i, String str) {
        int i2 = 2 % 2;
        int i3 = serializer + 125;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        JsonDecodingException jsonDecodingException = new JsonDecodingException(str);
        int i5 = write + 41;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return jsonDecodingException;
        }
        throw null;
    }

    public static final String read(Number number, String str, String str2) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        sb.append(" with key ");
        sb.append(str);
        sb.append(". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: ");
        int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        sb.append(RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1928934327, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{-1, str2}, iRemoteActionCompatParcelizer, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1928934330));
        String string = sb.toString();
        int i2 = write + 11;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return string;
    }

    public static void write(int i, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = serializer + 59;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = 0;
        while (i5 < i) {
            if (objArr[i5] != null) {
                i5++;
                int i6 = write + 9;
                serializer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 3 % 2;
                }
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(d$$ExternalSyntheticOutline0.m(i5, "at index ", new StringBuilder(String.valueOf(i5).length() + 9)));
                return;
            }
        }
    }

    public static final JsonEncodingException RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        int i = 2 % 2;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        JsonEncodingException jsonEncodingException = new JsonEncodingException("Value of type '" + r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
        int i2 = serializer + 29;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return jsonEncodingException;
    }

    public static File IconCompatParcelizer(Context context) {
        int i = 2 % 2;
        int i2 = serializer + 19;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            int i4 = write + 87;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i6 = write + 41;
        serializer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        for (int i8 = 0; i8 < 100; i8++) {
            File file = new File(cacheDir, str + i8);
            try {
                if (file.createNewFile()) {
                    int i9 = write + 125;
                    serializer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r10 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r10 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r11 = coil3.util.IntPair.serializer + 71;
        coil3.util.IntPair.write = r11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if ((r11 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        r0 = r10.getFileDescriptor();
        r11 = o.getActiveFocusTargetNode.serializer(new java.io.FileInputStream(r0), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r4 = r11.getChannel();
        r0 = r4.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0, r4.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        r0.addSuppressed(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        r11.addSuppressed(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r10 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.MappedByteBuffer RemoteActionCompatParcelizer(android.content.Context r10, android.net.Uri r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = coil3.util.IntPair.write
            int r1 = r1 + 75
            int r2 = r1 % 128
            coil3.util.IntPair.serializer = r2
            int r1 = r1 % r0
            java.lang.String r2 = "r"
            r3 = 0
            if (r1 == 0) goto L20
            android.content.ContentResolver r10 = r10.getContentResolver()
            android.os.ParcelFileDescriptor r10 = r10.openFileDescriptor(r11, r2, r3)     // Catch: java.io.IOException -> L77
            r11 = 88
            int r11 = r11 / 0
            if (r10 != 0) goto L3f
            goto L2a
        L20:
            android.content.ContentResolver r10 = r10.getContentResolver()
            android.os.ParcelFileDescriptor r10 = r10.openFileDescriptor(r11, r2, r3)     // Catch: java.io.IOException -> L77
            if (r10 != 0) goto L3f
        L2a:
            if (r10 == 0) goto L77
            int r11 = coil3.util.IntPair.serializer
            int r11 = r11 + 71
            int r1 = r11 % 128
            coil3.util.IntPair.write = r1
            int r11 = r11 % r0
            if (r11 == 0) goto L3b
            r10.close()     // Catch: java.io.IOException -> L77
            return r3
        L3b:
            r10.close()     // Catch: java.io.IOException -> L77
            throw r3
        L3f:
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6d
            java.io.FileDescriptor r0 = r10.getFileDescriptor()     // Catch: java.lang.Throwable -> L6d
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L6d
            java.io.FileInputStream r11 = o.getActiveFocusTargetNode.serializer(r11, r0)     // Catch: java.lang.Throwable -> L6d
            java.nio.channels.FileChannel r4 = r11.getChannel()     // Catch: java.lang.Throwable -> L63
            long r8 = r4.size()     // Catch: java.lang.Throwable -> L63
            java.nio.channels.FileChannel$MapMode r5 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L63
            r6 = 0
            java.nio.MappedByteBuffer r0 = r4.map(r5, r6, r8)     // Catch: java.lang.Throwable -> L63
            r11.close()     // Catch: java.lang.Throwable -> L6d
            r10.close()     // Catch: java.io.IOException -> L77
            return r0
        L63:
            r0 = move-exception
            r11.close()     // Catch: java.lang.Throwable -> L68
            goto L6c
        L68:
            r11 = move-exception
            r0.addSuppressed(r11)     // Catch: java.lang.Throwable -> L6d
        L6c:
            throw r0     // Catch: java.lang.Throwable -> L6d
        L6d:
            r11 = move-exception
            r10.close()     // Catch: java.lang.Throwable -> L72
            goto L76
        L72:
            r10 = move-exception
            r11.addSuppressed(r10)     // Catch: java.io.IOException -> L77
        L76:
            throw r11     // Catch: java.io.IOException -> L77
        L77:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.util.IntPair.RemoteActionCompatParcelizer(android.content.Context, android.net.Uri):java.nio.MappedByteBuffer");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[Catch: IOException -> 0x0082, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x0082, blocks: (B:32:0x0079, B:33:0x007c, B:36:0x007f), top: B:46:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007f A[Catch: IOException -> 0x0082, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x0082, blocks: (B:32:0x0079, B:33:0x007c, B:36:0x007f), top: B:46:0x0077 }] */
    public static boolean serializer(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStreamIconCompatParcelizer;
        int i;
        int i2 = 2 % 2;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            fileOutputStreamIconCompatParcelizer = getPositionInRoot.IconCompatParcelizer(file, new FileOutputStream(file, false), false);
            try {
                try {
                    byte[] bArr = new byte[Fields.RotationZ];
                    while (true) {
                        int i3 = inputStream.read(bArr);
                        if (i3 != -1) {
                            int i4 = write + 7;
                            serializer = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 != 0) {
                                fileOutputStreamIconCompatParcelizer.write(bArr, 1, i3);
                            } else {
                                fileOutputStreamIconCompatParcelizer.write(bArr, 0, i3);
                            }
                            int i5 = serializer + 59;
                            write = i5 % Fields.SpotShadowColor;
                            int i6 = i5 % 2;
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStreamIconCompatParcelizer.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e) {
                    e = e;
                    SentryLogcatAdapter.serializer("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStreamIconCompatParcelizer != null) {
                        try {
                            fileOutputStreamIconCompatParcelizer.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                if (fileOutputStreamIconCompatParcelizer != null) {
                    i = serializer + 105;
                    write = i % Fields.SpotShadowColor;
                    try {
                        if (i % 2 == 0) {
                            fileOutputStreamIconCompatParcelizer.close();
                            throw null;
                        }
                        fileOutputStreamIconCompatParcelizer.close();
                    } catch (IOException unused3) {
                    }
                }
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStreamIconCompatParcelizer = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStreamIconCompatParcelizer = null;
            if (fileOutputStreamIconCompatParcelizer != null) {
                i = serializer + 105;
                write = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    fileOutputStreamIconCompatParcelizer.close();
                    throw null;
                }
                fileOutputStreamIconCompatParcelizer.close();
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CharSequence charSequence = (CharSequence) objArr[1];
        int i = 2 % 2;
        int i2 = write + 77;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        charSequence.getClass();
        if (charSequence.length() < 200) {
            int i4 = serializer + 9;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            String str = ".....";
            if (iIntValue != -1) {
                int i6 = iIntValue - 30;
                int i7 = iIntValue + 30;
                String str2 = i6 <= 0 ? "" : ".....";
                if (i7 >= charSequence.length()) {
                    int i8 = serializer + 13;
                    write = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    str = "";
                }
                StringBuilder sbM = d$$ExternalSyntheticOutline0.m(str2);
                int i9 = i6 >= 0 ? i6 : 0;
                int length = charSequence.length();
                if (i7 > length) {
                    i7 = length;
                }
                sbM.append(charSequence.subSequence(i9, i7).toString());
                sbM.append(str);
                return sbM.toString();
            }
            int i10 = write + 35;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void serializer(applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0, Number number) {
        int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1265782582, iRemoteActionCompatParcelizer2, new Object[]{applydisplaycutoutmarginstoclosebuttonlambda0, number}, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer3, 1265782583);
    }

    public static final CharSequence serializer(int i, CharSequence charSequence) {
        Object[] objArr = {Integer.valueOf(i), charSequence};
        int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        return (CharSequence) RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1928934327, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr, iRemoteActionCompatParcelizer, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1928934330);
    }

    public static final CoroutineDispatcher read(Executor executor) {
        int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        return (CoroutineDispatcher) RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1915506940, iRemoteActionCompatParcelizer2, new Object[]{executor}, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer3, -1915506938);
    }

    public static getHasMeasureResult serializer(String str, String str2) {
        int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        return (getHasMeasureResult) RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1966006283, iRemoteActionCompatParcelizer2, new Object[]{str, str2}, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer3, -1966006283);
    }
}
