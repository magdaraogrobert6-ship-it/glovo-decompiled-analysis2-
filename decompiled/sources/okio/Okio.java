package okio;

import android.content.Context;
import android.view.KeyEvent;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.play.core.appupdate.zzz;
import com.huawei.riemann.location.common.utils.Constant;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractMap$$ExternalSyntheticLambda0;
import kotlin.ranges.RangesKt;
import kotlin.text.RegexKt;
import o.ApiErrorResponseCompanion;
import o.ApiExceptionSessionExpiredUnauthorized;
import o.BackspaceCommand;
import o.CallbackException;
import o.DrawableTransformation;
import o.GifDrawableTransformation;
import o.ItemSingleChoiceBinding;
import o.RecyclableBufferedInputStreamInvalidMarkException;
import o.accessgetAmbientShadowColor0d7_KjUjd;
import o.accesssetAmbientShadowColor8_81llAjd;
import o.displayInAppMessagelambda1;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getFocusEK5gGoQ;
import o.getNewPassword;
import o.getPostalCode;
import o.getSafeGestures;
import o.handleUrlOverridelambda1;
import o.onContentCardDismissed;
import o.provideInsetsValuescytEWk0;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.removeNodeAtDepth;
import o.setRotationX;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Okio {
    private static int read = 0;
    private static int write = 1;

    public static /* synthetic */ Object IconCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = (~(i7 | i6)) | i5;
        int i9 = ~i6;
        int i10 = ~i5;
        int i11 = (~(i9 | i10)) | i4;
        int i12 = (~(i5 | i9 | i4)) | (~(i7 | i9 | i10)) | (~(i10 | i6 | i4));
        int i13 = i6 + i4 + i2 + ((-104759182) * i3) + ((-453318476) * i);
        int i14 = i13 * i13;
        int i15 = (i6 * 1504131295) + 1805123584 + (1504131295 * i4) + (179255518 * i8) + ((-358511036) * i11) + ((-179255518) * i12) + (1324875776 * i2) + (711983104 * i3) + (1180696576 * i) + (1022754816 * i14);
        int i16 = ((i6 * (-1431886989)) - 1507491630) + (i4 * (-1431886989)) + (i8 * (-122)) + (i11 * Constant.ERROR_GNSS_STATUS_INVALID) + (i12 * 122) + (i2 * (-1431886867)) + (i3 * 722567050) + (i * (-1618605404)) + (i14 * 297664512);
        return i15 + ((i16 * i16) * (-277217280)) != 1 ? serializer(objArr) : read(objArr);
    }

    public abstract int read(byte[] bArr, int i, int i2);

    public abstract int serializer(String str, byte[] bArr, int i, int i2);

    public abstract String write(byte[] bArr, int i, int i2);

    private static /* synthetic */ Object read(Object[] objArr) {
        zzz zzzVar;
        Context context = (Context) objArr[0];
        synchronized (UtilsKt.class) {
            if (UtilsKt.IconCompatParcelizer == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                UtilsKt.IconCompatParcelizer = new zzz(new getFocusEK5gGoQ(context, 5));
            }
            zzzVar = UtilsKt.IconCompatParcelizer;
        }
        return (provideInsetsValuescytEWk0) ((getSafeGestures) zzzVar.serializer).m_();
    }

    public static final GifDrawableTransformation RemoteActionCompatParcelizer(ItemSingleChoiceBinding itemSingleChoiceBinding) {
        int i = 2 % 2;
        itemSingleChoiceBinding.getClass();
        GifDrawableTransformation gifDrawableTransformation = new GifDrawableTransformation(itemSingleChoiceBinding);
        int i2 = write + 47;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 49 / 0;
        }
        return gifDrawableTransformation;
    }

    public static final CallbackException IconCompatParcelizer(Socket socket) throws IOException {
        int i = 2 % 2;
        ApiExceptionSessionExpiredUnauthorized apiExceptionSessionExpiredUnauthorized = new ApiExceptionSessionExpiredUnauthorized(socket);
        InputStream inputStream = socket.getInputStream();
        inputStream.getClass();
        CallbackException callbackException = new CallbackException(apiExceptionSessionExpiredUnauthorized, new CallbackException(inputStream, apiExceptionSessionExpiredUnauthorized));
        int i2 = write + 83;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
        return callbackException;
    }

    public static Expression all(Expression... expressionArr) {
        int i = 2 % 2;
        Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("all");
        int length = expressionArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = write + 59;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                expressionBuilder.addArgument(expressionArr[i2]);
                i2 += 70;
            } else {
                expressionBuilder.addArgument(expressionArr[i2]);
                i2++;
            }
        }
        return expressionBuilder.build();
    }

    public static String serializer(KeyEvent.Callback callback) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 17;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (callback != null) {
            String canonicalName = callback.getClass().getCanonicalName();
            return canonicalName != null ? canonicalName : callback.getClass().getSimpleName();
        }
        int i5 = i2 + 105;
        int i6 = i5 % Fields.SpotShadowColor;
        read = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 125;
        write = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return null;
    }

    public static final RecyclableBufferedInputStreamInvalidMarkException serializer(Socket socket) throws IOException {
        int i = 2 % 2;
        ApiExceptionSessionExpiredUnauthorized apiExceptionSessionExpiredUnauthorized = new ApiExceptionSessionExpiredUnauthorized(socket);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.getClass();
        RecyclableBufferedInputStreamInvalidMarkException recyclableBufferedInputStreamInvalidMarkException = new RecyclableBufferedInputStreamInvalidMarkException(apiExceptionSessionExpiredUnauthorized, 1, new RecyclableBufferedInputStreamInvalidMarkException(outputStream, 0, apiExceptionSessionExpiredUnauthorized));
        int i2 = read + 27;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return recyclableBufferedInputStreamInvalidMarkException;
        }
        throw null;
    }

    public static final CallbackException RemoteActionCompatParcelizer(InputStream inputStream) {
        int i = 2 % 2;
        inputStream.getClass();
        CallbackException callbackException = new CallbackException(inputStream, new ApiErrorResponseCompanion());
        int i2 = read + 69;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return callbackException;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Painter RemoteActionCompatParcelizer(int i, getBirthDateFull getbirthdatefull, int i2) {
        int i3 = 2 % 2;
        int i4 = read + 57;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            ((Boolean) ((getPostalCode) getbirthdatefull).write((getNewPassword) InspectionModeKt.getLocalInspectionMode())).booleanValue();
            throw null;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (!((Boolean) getpostalcode.write((getNewPassword) InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
            getpostalcode.serializer(-883990696);
            getpostalcode.IconCompatParcelizer(false);
            return null;
        }
        getpostalcode.serializer(-884045318);
        Painter painterPainterResource = PainterResources_androidKt.painterResource(i, getpostalcode, i2 & 14);
        getpostalcode.IconCompatParcelizer(false);
        int i5 = write + 61;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return painterPainterResource;
    }

    public static final String write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        int i = 2 % 2;
        String strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer())}, BackspaceCommand.write(), -281231677, BackspaceCommand.write()), ", ", r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer() + '(', ")", new AbstractMap$$ExternalSyntheticLambda0(5, r8lambda92m0p9sit5uf70mvjf4rwmruda), 24);
        int i2 = write + 87;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strIconCompatParcelizer;
        }
        throw null;
    }

    public static Expression color(int i) {
        int i2 = 2 % 2;
        float[] fArr = {(i >> 16) & 255, (i >> 8) & 255, i & 255, ((i >> 24) & 255) / 255.0f};
        Expression[] expressionArr = {new Expression(fArr[0]), new Expression(fArr[1]), new Expression(fArr[2]), new Expression(fArr[3])};
        Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("rgba");
        int i3 = write + 81;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        for (int i5 = 0; i5 < 4; i5++) {
            int i6 = write + 109;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            expressionBuilder.addArgument(expressionArr[i5]);
        }
        return expressionBuilder.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if ((r7 instanceof java.lang.AutoCloseable) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if ((r7 instanceof java.util.concurrent.ExecutorService) == true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if ((r7 instanceof android.content.res.TypedArray) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r2 = r2 + 25;
        okio.Okio.read = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
        ((android.content.res.TypedArray) r7).recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if ((r7 instanceof android.media.MediaMetadataRetriever) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r8 = r8 + 115;
        okio.Okio.write = r8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r8 = r8 % 2;
        ((android.media.MediaMetadataRetriever) r7).release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        o.DrawableTransformation.write();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        r7 = (java.util.concurrent.ExecutorService) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r7 != java.util.concurrent.ForkJoinPool.commonPool()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        r8 = r7.isTerminated();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r8 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        r7.shutdown();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r8 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        r8 = r7.awaitTermination(1, java.util.concurrent.TimeUnit.DAYS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (r3 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        r7.shutdownNow();
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (r3 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        r7 = okio.Okio.read + 113;
        okio.Okio.write = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        if ((r7 % 2) == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        java.lang.Thread.currentThread().interrupt();
        r7 = null;
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if ((r7 instanceof java.lang.AutoCloseable) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RemoteActionCompatParcelizer(java.lang.AutoCloseable r7, java.lang.Throwable r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            if (r7 == 0) goto L9c
            if (r8 != 0) goto L94
            int r8 = okio.Okio.read
            int r1 = r8 + 85
            int r2 = r1 % 128
            okio.Okio.write = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L1b
            boolean r1 = r7 instanceof java.lang.AutoCloseable
            r4 = 38
            int r4 = r4 / r3
            if (r1 == 0) goto L24
            goto L1f
        L1b:
            boolean r1 = r7 instanceof java.lang.AutoCloseable
            if (r1 == 0) goto L24
        L1f:
            r7.close()
            goto L9c
        L24:
            boolean r1 = r7 instanceof java.util.concurrent.ExecutorService
            r4 = 1
            if (r1 == r4) goto L4f
            boolean r1 = r7 instanceof android.content.res.TypedArray
            if (r1 == 0) goto L3a
            int r2 = r2 + 25
            int r8 = r2 % 128
            okio.Okio.read = r8
            int r2 = r2 % r0
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            r7.recycle()
            goto L9c
        L3a:
            boolean r1 = r7 instanceof android.media.MediaMetadataRetriever
            if (r1 == 0) goto L4b
            int r8 = r8 + 115
            int r1 = r8 % 128
            okio.Okio.write = r1
            int r8 = r8 % r0
            android.media.MediaMetadataRetriever r7 = (android.media.MediaMetadataRetriever) r7
            r7.release()
            goto L9c
        L4b:
            o.DrawableTransformation.write()
            return
        L4f:
            java.util.concurrent.ExecutorService r7 = (java.util.concurrent.ExecutorService) r7
            java.util.concurrent.ForkJoinPool r8 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r7 != r8) goto L58
            goto L9c
        L58:
            boolean r8 = r7.isTerminated()
            if (r8 != 0) goto L9c
            r7.shutdown()
        L61:
            if (r8 != 0) goto L73
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L6c
            r5 = 1
            boolean r8 = r7.awaitTermination(r5, r1)     // Catch: java.lang.InterruptedException -> L6c
            goto L61
        L6c:
            if (r3 != 0) goto L61
            r7.shutdownNow()
            r3 = r4
            goto L61
        L73:
            if (r3 == 0) goto L9c
            int r7 = okio.Okio.read
            int r7 = r7 + 113
            int r8 = r7 % 128
            okio.Okio.write = r8
            int r7 = r7 % r0
            if (r7 == 0) goto L88
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
            goto L9c
        L88:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.interrupt()
            r7 = 0
            r7.hashCode()
            throw r7
        L94:
            bo.app.af$$ExternalSyntheticOutline0.m(r7)     // Catch: java.lang.Throwable -> L98
            return
        L98:
            r7 = move-exception
            o.markOnScreenCardsAsReadlambda1.read(r8, r7)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Okio.RemoteActionCompatParcelizer(java.lang.AutoCloseable, java.lang.Throwable):void");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004f A[PHI: r6
  0x004f: PHI (r6v17 java.lang.String) = (r6v16 java.lang.String), (r6v21 java.lang.String) binds: [B:11:0x004d, B:8:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    public static final int IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[] r8lambda92m0p9sit5uf70mvjf4rwmrudaArr) {
        String strSerializer;
        int i = 2 % 2;
        int i2 = read + 45;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = 1;
        r8lambda92m0p9sit5uf70mvjf4rwmrudaArr.getClass();
        int iHashCode2 = r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer().hashCode();
        int iHashCode3 = Arrays.hashCode(r8lambda92m0p9sit5uf70mvjf4rwmrudaArr);
        int iIconCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer();
        int i4 = 1;
        while (true) {
            int iHashCode4 = 0;
            if (iIconCompatParcelizer <= 0) {
                break;
            }
            int i5 = write + 71;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                strSerializer = r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer() << iIconCompatParcelizer).serializer();
                if (strSerializer != null) {
                    iHashCode4 = strSerializer.hashCode();
                }
            } else {
                strSerializer = r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer() - iIconCompatParcelizer).serializer();
                if (strSerializer != null) {
                    iHashCode4 = strSerializer.hashCode();
                }
            }
            i4 = (i4 * 31) + iHashCode4;
            iIconCompatParcelizer--;
        }
        for (int iIconCompatParcelizer2 = r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer(); iIconCompatParcelizer2 > 0; iIconCompatParcelizer2--) {
            int i6 = write + 5;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            RegexKt regexKtRemoteActionCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer() - iIconCompatParcelizer2).RemoteActionCompatParcelizer();
            iHashCode = (iHashCode * 31) + (regexKtRemoteActionCompatParcelizer != null ? regexKtRemoteActionCompatParcelizer.hashCode() : 0);
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + i4) * 31) + iHashCode;
    }

    public static byte[] serializer(accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd) {
        int i = 2 % 2;
        accessgetambientshadowcolor0d7_kjujd.getClass();
        HashMap map = accessgetambientshadowcolor0d7_kjujd.RemoteActionCompatParcelizer;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    int i2 = read + 7;
                    write = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        Map.Entry entry = (Map.Entry) it.next();
                        IconCompatParcelizer(dataOutputStream, (String) entry.getKey(), entry.getValue());
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Map.Entry entry2 = (Map.Entry) it.next();
                    IconCompatParcelizer(dataOutputStream, (String) entry2.getKey(), entry2.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                int i3 = read + 19;
                write = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    dataOutputStream.close();
                    byteArray.getClass();
                    return byteArray;
                }
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray2.getClass();
                int i4 = 71 / 0;
                return byteArray2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    int i5 = sourceInformationContextOfdefault.read();
                    int i6 = sourceInformationContextOfdefault.read();
                    int i7 = sourceInformationContextOfdefault.read();
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i5, i6, -871780639, sourceInformationContextOfdefault.read(), new Object[]{dataOutputStream, th}, i7);
                    throw th2;
                }
            }
        } catch (IOException e) {
            setRotationX.read().IconCompatParcelizer(accesssetAmbientShadowColor8_81llAjd.IconCompatParcelizer, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        boolean z;
        int i = 0;
        byte[] bArr = (byte[]) objArr[0];
        int i2 = 2 % 2;
        int i3 = write + 95;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        bArr.getClass();
        if (bArr.length > 10240) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return accessgetAmbientShadowColor0d7_KjUjd.write;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            if (bArr2[0] == -84 && bArr2[1] == -19) {
                int i5 = write + 13;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i7 = objectInputStream.readInt();
                    while (i < i7) {
                        int i8 = write + 21;
                        read = i8 % Fields.SpotShadowColor;
                        if (i8 % 2 != 0) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i += 65;
                        } else {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i++;
                        }
                    }
                    objectInputStream.close();
                    int i9 = read + 59;
                    write = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{objectInputStream, th}, sourceInformationContextOfdefault.read());
                        throw th2;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s = dataInputStream.readShort();
                    if (s == -21521) {
                        short s2 = dataInputStream.readShort();
                        if (s2 != 1) {
                            DrawableTransformation.read((Object) c8$$ExternalSyntheticOutline0.m(s2, "Unsupported version number: "));
                        }
                    } else {
                        DrawableTransformation.read((Object) c8$$ExternalSyntheticOutline0.m(s, "Magic number doesn't match: "));
                    }
                    int i11 = dataInputStream.readInt();
                    while (i < i11) {
                        int i12 = read + 79;
                        write = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        linkedHashMap.put(dataInputStream.readUTF(), IconCompatParcelizer(dataInputStream, dataInputStream.readByte()));
                        i++;
                    }
                    dataInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{dataInputStream, th3}, sourceInformationContextOfdefault.read());
                        throw th4;
                    }
                }
            }
        } catch (IOException e) {
            setRotationX.read().IconCompatParcelizer(accesssetAmbientShadowColor8_81llAjd.IconCompatParcelizer, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            setRotationX.read().IconCompatParcelizer(accesssetAmbientShadowColor8_81llAjd.IconCompatParcelizer, "Error in Data#fromByteArray: ", e2);
        }
        return new accessgetAmbientShadowColor0d7_KjUjd(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable IconCompatParcelizer(DataInputStream dataInputStream, byte b) throws IOException {
        int i = 2 % 2;
        if (b == 0) {
            return null;
        }
        if (b == 1) {
            int i2 = write + 103;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        int i4 = 0;
        if (b == 4) {
            int i5 = read + 107;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 2 / 0;
                return Long.valueOf(dataInputStream.readLong());
            }
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b == 5) {
            int i7 = read + 79;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 99 / 0;
                return Float.valueOf(dataInputStream.readFloat());
            }
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b == 7) {
            int i9 = write + 103;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return dataInputStream.readUTF();
        }
        if (b == 8) {
            int i11 = read + 31;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            int i13 = dataInputStream.readInt();
            ?? r1 = new Boolean[i13];
            while (i4 < i13) {
                int i14 = write + 93;
                read = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    r1[i4] = Boolean.valueOf(dataInputStream.readBoolean());
                    i4 += 32;
                } else {
                    r1[i4] = Boolean.valueOf(dataInputStream.readBoolean());
                    i4++;
                }
            }
            return r1;
        }
        if (b == 9) {
            int i15 = dataInputStream.readInt();
            ?? r2 = new Byte[i15];
            while (i4 < i15) {
                int i16 = write + 57;
                read = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    r2[i4] = Byte.valueOf(dataInputStream.readByte());
                    i4 += 61;
                } else {
                    r2[i4] = Byte.valueOf(dataInputStream.readByte());
                    i4++;
                }
            }
            return r2;
        }
        if (b == 10) {
            int i17 = dataInputStream.readInt();
            ?? r3 = new Integer[i17];
            while (i4 < i17) {
                int i18 = read + 75;
                write = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                r3[i4] = Integer.valueOf(dataInputStream.readInt());
                i4++;
            }
            return r3;
        }
        if (b == 11) {
            int i20 = dataInputStream.readInt();
            ?? r0 = new Long[i20];
            while (i4 < i20) {
                r0[i4] = Long.valueOf(dataInputStream.readLong());
                i4++;
            }
            return r0;
        }
        if (b == 12) {
            int i21 = dataInputStream.readInt();
            ?? r4 = new Float[i21];
            while (i4 < i21) {
                r4[i4] = Float.valueOf(dataInputStream.readFloat());
                i4++;
            }
            return r4;
        }
        if (b == 13) {
            int i22 = dataInputStream.readInt();
            ?? r5 = new Double[i22];
            while (i4 < i22) {
                int i23 = read + 17;
                write = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                r5[i4] = Double.valueOf(dataInputStream.readDouble());
                i4++;
            }
            return r5;
        }
        if (b == 14) {
            int i25 = dataInputStream.readInt();
            ?? r6 = new String[i25];
            while (i4 < i25) {
                int i26 = write + 73;
                read = i26 % Fields.SpotShadowColor;
                if (i26 % 2 == 0) {
                    String utf = dataInputStream.readUTF();
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d"}, getCieXyz.write())).booleanValue()) {
                        utf = null;
                    }
                    r6[i4] = utf;
                    i4++;
                } else {
                    ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{dataInputStream.readUTF(), "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d"}, getCieXyz.write())).booleanValue();
                    throw null;
                }
            }
            return r6;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m(b, "Unsupported type "));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e2  */
    public static final void IconCompatParcelizer(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i;
        float fFloatValue;
        Long l;
        long jLongValue;
        boolean zBooleanValue;
        int i2 = 2 % 2;
        if (obj == null) {
            int i3 = write + 69;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            int i5 = read + 73;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            int i7 = write + 51;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                dataOutputStream.writeByte(0);
            } else {
                dataOutputStream.writeByte(6);
            }
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(displayInAppMessagelambda1.serializer(obj.getClass()).IconCompatParcelizer(), "Unsupported value type ");
                return;
            }
            Object[] objArr = (Object[]) obj;
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(objArr.getClass());
            int i8 = 8;
            if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Boolean[].class))) {
                int i9 = write + 3;
                read = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    i = 13;
                } else {
                    i = 8;
                }
            } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Byte[].class))) {
                i = 9;
            } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Integer[].class))) {
                i = 10;
            } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Long[].class))) {
                i = 11;
            } else if (!(true ^ r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Float[].class)))) {
                int i10 = read + 107;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i = 12;
            } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Double[].class))) {
                i = 13;
            } else {
                if (!r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(String[].class))) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(displayInAppMessagelambda1.serializer(objArr.getClass()).RemoteActionCompatParcelizer(), "Unsupported value type ");
                    return;
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            int length = objArr.length;
            int i12 = 0;
            while (i12 < length) {
                Object obj2 = objArr[i12];
                String str2 = null;
                Float f = null;
                if (i == i8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    if (bool != null) {
                        int i13 = read + 53;
                        write = i13 % Fields.SpotShadowColor;
                        if (i13 % 2 == 0) {
                            bool.booleanValue();
                            throw null;
                        }
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    dataOutputStream.writeBoolean(zBooleanValue);
                } else if (i == 9) {
                    Byte b = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    if (obj2 instanceof Long) {
                        int i14 = write + 23;
                        read = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        l = (Long) obj2;
                    } else {
                        l = null;
                    }
                    if (l != null) {
                        int i16 = read + 101;
                        write = i16 % Fields.SpotShadowColor;
                        if (i16 % 2 == 0) {
                            l.longValue();
                            throw null;
                        }
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    dataOutputStream.writeLong(jLongValue);
                } else if (i == 12) {
                    if (obj2 instanceof Float) {
                        int i17 = read + 99;
                        write = i17 % Fields.SpotShadowColor;
                        if (i17 % 2 == 0) {
                            str2.hashCode();
                            throw null;
                        }
                        f = (Float) obj2;
                    }
                    if (f != null) {
                        int i18 = read + 53;
                        write = i18 % Fields.SpotShadowColor;
                        if (i18 % 2 == 0) {
                            fFloatValue = f.floatValue();
                            int i19 = 84 / 0;
                        } else {
                            fFloatValue = f.floatValue();
                        }
                    } else {
                        fFloatValue = 0.0f;
                    }
                    dataOutputStream.writeFloat(fFloatValue);
                } else {
                    if (i == 13) {
                        Double d = obj2 instanceof Double ? (Double) obj2 : null;
                        dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                    } else if (i == 14) {
                        str2 = obj2 instanceof String ? (String) obj2 : null;
                        if (str2 == null) {
                            str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                        }
                        dataOutputStream.writeUTF(str2);
                    }
                    i12++;
                    i8 = 8;
                }
                i12++;
                i8 = 8;
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static accessgetAmbientShadowColor0d7_KjUjd IconCompatParcelizer(byte[] bArr) {
        int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        return (accessgetAmbientShadowColor0d7_KjUjd) IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{bArr}, iRemoteActionCompatParcelizer2, iRemoteActionCompatParcelizer3, -2102996089, iRemoteActionCompatParcelizer, 2102996089);
    }

    public static provideInsetsValuescytEWk0 serializer(Context context) {
        int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        return (provideInsetsValuescytEWk0) IconCompatParcelizer(handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{context}, iRemoteActionCompatParcelizer2, iRemoteActionCompatParcelizer3, 842332784, iRemoteActionCompatParcelizer, -842332783);
    }
}
