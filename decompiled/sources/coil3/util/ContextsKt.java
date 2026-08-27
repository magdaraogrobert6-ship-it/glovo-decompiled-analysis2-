package coil3.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SingleProcessDataStore$data$1;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.common.Coroutines$Companion$enqueue$1;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.protobuf.CodedInputStream;
import com.huawei.riemann.location.common.utils.Constant;
import com.mapbox.bindgen.Value;
import io.reactivex.plugins.RxJavaPlugins;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;
import o.DrawableTransformation;
import o.IInAppMessageAnimationFactory;
import o.IndirectPointerNavigationGestureDetectorgestureDetector1;
import o.ShortNewsContentCardView;
import o.SizeKt;
import o.TextAnnouncementContentCardView;
import o.UpdatableAnimationState;
import o.accessdisplayPreparedInAppMessage;
import o.calculateCentroidSize;
import o.createFromAssets;
import o.getBirthDateFull;
import o.getCacheParamsui;
import o.getCreditCardExpirationMonth;
import o.getGraphicsContext;
import o.getGraphicsContextProviderui;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.getQueryContext;
import o.getQueryParameterslambda2;
import o.getViewportWidth;
import o.isItemDismissable;
import o.logImpressionlambda2;
import o.markOnScreenCardsAsReadlambda1;
import o.onScroll;
import o.onShowPress;
import o.onShowTranslationui;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44;
import o.requiredWidth3ABfNKs;
import o.setTimerStart;

/* JADX INFO: loaded from: classes.dex */
public abstract class ContextsKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i7 | i5));
        int i10 = ~(i | i5);
        int i11 = ~i5;
        int i12 = (~(i4 | i7 | i11)) | i10;
        int i13 = i7 | (~(i8 | i11));
        int i14 = i + i5 + i3 + ((-1570926368) * i6) + ((-1409401439) * i2);
        int i15 = i14 * i14;
        int i16 = (((-543990125) * i) - 657981440) + (821186744 * i5) + ((-1953193618) * i9) + ((-976596809) * i12) + (976596809 * i13) + (1797783552 * i3) + (1124073472 * i6) + ((-332922880) * i2) + ((-1182662656) * i15);
        int i17 = (i * 1410161459) + 847508490 + (i5 * 1410159032) + (i9 * (-1618)) + (i12 * (-809)) + (i13 * 809) + (i3 * 1410159841) + (i6 * 1126552800) + (i2 * (-1948647807)) + (i15 * (-1287520256));
        int i18 = i16 + (i17 * i17 * (-1577189376));
        if (i18 == 1) {
            return read(objArr);
        }
        if (i18 == 2) {
            return serializer(objArr);
        }
        byte[] bArr = (byte[]) objArr[0];
        int i19 = 2 % 2;
        int i20 = read + 59;
        RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
        if (i20 % 2 == 0 ? bArr.length != 16 : bArr.length != 55) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("value must be a block.");
            return null;
        }
        byte[] bArr2 = new byte[16];
        for (int i21 = 0; i21 < 16; i21++) {
            byte b = (byte) ((bArr[i21] << 1) & Constant.ERROR_ROAD_AREA_INVALID);
            bArr2[i21] = b;
            if (i21 < 15) {
                bArr2[i21] = (byte) (((byte) ((bArr[i21 + 1] >> 7) & 1)) | b);
                int i22 = RemoteActionCompatParcelizer + 111;
                read = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
            }
        }
        bArr2[15] = (byte) (bArr2[15] ^ ((byte) ((bArr[0] >> 7) & 135)));
        return bArr2;
    }

    public abstract boolean IconCompatParcelizer(getGraphicsContext getgraphicscontext, getGraphicsContextProviderui getgraphicscontextproviderui, getGraphicsContextProviderui getgraphicscontextproviderui2);

    public abstract boolean RemoteActionCompatParcelizer();

    public abstract void read(getGraphicsContextProviderui getgraphicscontextproviderui, Thread thread);

    public abstract void read(boolean z);

    public abstract boolean read(getGraphicsContext getgraphicscontext, Object obj, Object obj2);

    public abstract void serializer(getGraphicsContextProviderui getgraphicscontextproviderui, getGraphicsContextProviderui getgraphicscontextproviderui2);

    public abstract boolean serializer(getGraphicsContext getgraphicscontext, getCacheParamsui getcacheparamsui, getCacheParamsui getcacheparamsui2);

    public abstract void write(boolean z);

    public static final r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44 write(Object[] objArr) {
        int i = 2 % 2;
        objArr.getClass();
        r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44 r8lambdaorcgh_zecjpqysbjv51vn1ttu44 = new r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44(objArr);
        int i2 = read + 27;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdaorcgh_zecjpqysbjv51vn1ttu44;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final byte read(char c) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 7;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (c >= '~') {
            return (byte) 0;
        }
        int i5 = i2 + 75;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return accessdisplayPreparedInAppMessage.serializer[c];
    }

    public static final Object RemoteActionCompatParcelizer(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        int i = 2 % 2;
        Thread.interrupted();
        Object objSerializer = BuildersKt.serializer(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, new SingleProcessDataStore$data$1.AnonymousClass1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, null, 2));
        int i2 = read + 19;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 66 / 0;
        }
        return objSerializer;
    }

    public static final void read(TextAnnouncementContentCardView textAnnouncementContentCardView, Throwable th) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 83;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            boolean z = th instanceof CancellationException;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (th instanceof CancellationException) {
            int i4 = i2 + 15;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            try {
                RxJavaPlugins.IconCompatParcelizer(th);
            } catch (Throwable th2) {
                markOnScreenCardsAsReadlambda1.read(th, th2);
                TimeoutKt.read(textAnnouncementContentCardView, th);
            }
        }
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        Context context = (Context) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        Drawable drawableWrite = IntPair.write(context, iIntValue);
        if (drawableWrite != null) {
            int i2 = RemoteActionCompatParcelizer + 89;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return drawableWrite;
        }
        DrawableTransformation.read((Object) c8$$ExternalSyntheticOutline0.m(iIntValue, "Invalid resource ID: "));
        int i4 = read + 5;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }

    public static void serializer(int i, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = 0;
        while (i3 < i) {
            if (objArr[i3] == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i3, "at index "));
                break;
            }
            int i4 = RemoteActionCompatParcelizer;
            int i5 = i4 + 119;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i3++;
            int i7 = i4 + 107;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        int i9 = RemoteActionCompatParcelizer + 17;
        read = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void IconCompatParcelizer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = 2 % 2;
        getViewportWidth.read.b_(BuildersKt.RemoteActionCompatParcelizer(getViewportWidth.serializer, null, CoroutineStart.LAZY, new Coroutines$Companion$enqueue$1(0, null, r8lambdaunavo3sxub_pc9xroryotnrlvsm), 1));
        int i2 = RemoteActionCompatParcelizer + 5;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public static UpdatableAnimationState RemoteActionCompatParcelizer(float f, float f2, int i) {
        int i2 = 2 % 2;
        int i3 = read;
        int i4 = i3 + 55;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 13;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            f2 = 0.0f;
        }
        return new UpdatableAnimationState(requiredWidth3ABfNKs.read, Float.valueOf(f), new calculateCentroidSize(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static CopyOnWriteArrayList RemoteActionCompatParcelizer(CopyOnWriteArrayList copyOnWriteArrayList) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (copyOnWriteArrayList != null) {
            int i2 = RemoteActionCompatParcelizer + 55;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                copyOnWriteArrayList.iterator().hasNext();
                throw null;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it);
            }
            int i3 = RemoteActionCompatParcelizer + 29;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        return new CopyOnWriteArrayList(arrayList);
    }

    public static float[] colorToRgbaArray(int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer;
        int i4 = i3 + 119;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        float[] fArr = {(i >> 16) & 255, (i >> 8) & 255, i & 255, ((i >> 24) & 255) / 255.0f};
        int i6 = i3 + 41;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return fArr;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Class cls = (Class) objArr[0];
        String str = (String) objArr[1];
        zzbv[] zzbvVarArr = (zzbv[]) objArr[2];
        int i = 2 % 2;
        int length = zzbvVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr2 = new Object[length];
        for (int i2 = 0; i2 < zzbvVarArr.length; i2++) {
            int i3 = read + 95;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            zzbv zzbvVar = zzbvVarArr[i2];
            zzbvVar.getClass();
            clsArr[i2] = (Class) zzbvVar.write;
            objArr2[i2] = zzbvVarArr[i2].RemoteActionCompatParcelizer;
        }
        Object obj = null;
        Object objInvoke = cls.getDeclaredMethod(str, clsArr).invoke(null, objArr2);
        int i5 = read + 57;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return objInvoke;
        }
        obj.hashCode();
        throw null;
    }

    public static UpdatableAnimationState read(UpdatableAnimationState updatableAnimationState, float f, float f2, int i) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = read + 19;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            f = ((Number) ((onShowTranslationui) updatableAnimationState.write).getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((calculateCentroidSize) updatableAnimationState.MediaSessionCompatQueueItem).read;
            int i5 = read + 67;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        long j = updatableAnimationState.RemoteActionCompatParcelizer;
        long j2 = updatableAnimationState.IconCompatParcelizer;
        boolean z = updatableAnimationState.read;
        return new UpdatableAnimationState(updatableAnimationState.serializer, Float.valueOf(f), new calculateCentroidSize(f2), j, j2, z);
    }

    public static ArrayList buildRGBAExpression(float[] fArr) {
        int i = 2 % 2;
        ArrayList arrayListWrite = SQLite.write(new Value("rgba"), new Value(fArr[0]), new Value(fArr[1]), new Value(fArr[2]), new Value(fArr[3]));
        int i2 = RemoteActionCompatParcelizer + 123;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return arrayListWrite;
    }

    public static boolean serializer(String str) {
        int i = 2 % 2;
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str)) {
            int i2 = read + 123;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                "Proxy-Authenticate".equalsIgnoreCase(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str)) {
                int i3 = read + 91;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                if (!"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str)) {
                    int i5 = read + 63;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    if (!"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
                        return true;
                    }
                }
            }
        }
        int i7 = RemoteActionCompatParcelizer + 29;
        read = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }

    public static final String serializer(byte b) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 61;
        int i4 = i3 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        if (i3 % 2 != 0) {
            if (b == 1) {
                return "quotation mark '\"'";
            }
        } else if (b == 1) {
            return "quotation mark '\"'";
        }
        if (b == 2) {
            return "string escape sequence '\\'";
        }
        if (b == 4) {
            return "comma ','";
        }
        if (b == 5) {
            return "colon ':'";
        }
        Object obj = null;
        if (b == 6) {
            int i5 = i4 + 99;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return "start of the object '{'";
            }
            obj.hashCode();
            throw null;
        }
        if (b == 7) {
            return "end of the object '}'";
        }
        if (b == 8) {
            return "start of the array '['";
        }
        if (b == 9) {
            int i6 = i2 + 51;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return "end of the array ']'";
            }
            throw null;
        }
        if (b == 10) {
            return "end of the input";
        }
        if (b != 127) {
            return "valid token";
        }
        int i7 = i4 + 119;
        read = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        int i9 = i4 + 125;
        read = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            return "invalid token";
        }
        throw null;
    }

    public static final void RemoteActionCompatParcelizer(CancellableContinuationImpl cancellableContinuationImpl, ShortNewsContentCardView shortNewsContentCardView, boolean z) {
        Object isitemdismissable;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = cancellableContinuationImpl.RemoteActionCompatParcelizer();
        Throwable thIconCompatParcelizer = cancellableContinuationImpl.IconCompatParcelizer(objRemoteActionCompatParcelizer);
        if (thIconCompatParcelizer != null) {
            isitemdismissable = new isItemDismissable(thIconCompatParcelizer);
            int i2 = RemoteActionCompatParcelizer + 21;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            isitemdismissable = cancellableContinuationImpl.read(objRemoteActionCompatParcelizer);
            int i4 = read + 7;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        if (!z) {
            shortNewsContentCardView.resumeWith(isitemdismissable);
            return;
        }
        shortNewsContentCardView.getClass();
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) shortNewsContentCardView;
        ShortNewsContentCardView shortNewsContentCardView2 = dispatchedContinuation.RemoteActionCompatParcelizer;
        Object obj = dispatchedContinuation.serializer;
        TextAnnouncementContentCardView context = shortNewsContentCardView2.getContext();
        Object objSerializer = ThreadContextKt.serializer(context, obj);
        IInAppMessageAnimationFactory iInAppMessageAnimationFactory = null;
        if (objSerializer != ThreadContextKt.IconCompatParcelizer) {
            int i6 = read + 59;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int iSerializer = getQueryParameterslambda2.serializer();
                throw null;
            }
            int iSerializer2 = getQueryParameterslambda2.serializer();
            iInAppMessageAnimationFactory = (IInAppMessageAnimationFactory) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 391625664, new Object[]{shortNewsContentCardView2, context, objSerializer}, getQueryParameterslambda2.serializer(), -391625664, iSerializer2);
        }
        try {
            shortNewsContentCardView2.resumeWith(isitemdismissable);
            if (iInAppMessageAnimationFactory != null) {
                int i7 = RemoteActionCompatParcelizer + 105;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (!iInAppMessageAnimationFactory.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()) {
                }
            }
        } finally {
            if (iInAppMessageAnimationFactory == null || !(!iInAppMessageAnimationFactory.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY())) {
                ThreadContextKt.write(context, objSerializer);
            }
        }
    }

    public static final void IconCompatParcelizer(setTimerStart settimerstart, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        settimerstart.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1282507154);
        if ((i & 6) == 0) {
            if (getpostalcode.read(settimerstart)) {
                int i5 = RemoteActionCompatParcelizer;
                int i6 = i5 + 5;
                read = i6 % Fields.SpotShadowColor;
                i3 = i6 % 2 == 0 ? 5 : 4;
                int i7 = i5 + 57;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? 32 : 16;
        }
        int i9 = 1;
        if ((i2 & 19) != 18) {
            int i10 = RemoteActionCompatParcelizer + 89;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            getQueryContext getquerycontext = settimerstart.write;
            boolean z2 = (i2 & 112) == 32;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z2 || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new createFromAssets(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, i9);
                getpostalcode.write(objComponentActivity);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 8);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SizeKt(i, 12, settimerstart, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
        }
    }

    public static Object RemoteActionCompatParcelizer(CodedInputStream codedInputStream, onScroll onscroll, onShowPress onshowpress) {
        int i = 2 % 2;
        int i2 = read + 41;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj = null;
        switch (IndirectPointerNavigationGestureDetectorgestureDetector1.RemoteActionCompatParcelizer[onscroll.ordinal()]) {
            case 1:
                return Double.valueOf(codedInputStream.MediaMetadataCompat());
            case 2:
                return Float.valueOf(codedInputStream.MediaSessionCompatResultReceiverWrapper());
            case 3:
                return Long.valueOf(codedInputStream.PlaybackStateCompatCustomAction());
            case 4:
                return Long.valueOf(codedInputStream.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM());
            case 5:
                return Integer.valueOf(codedInputStream.ParcelableVolumeInfo());
            case 6:
                return Long.valueOf(codedInputStream.MediaDescriptionCompat());
            case 7:
                return Integer.valueOf(codedInputStream.RatingCompat());
            case 8:
                return Boolean.valueOf(codedInputStream.serializer());
            case 9:
                return codedInputStream.MediaBrowserCompatMediaItem();
            case 10:
                return Integer.valueOf(codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8());
            case 11:
                return Integer.valueOf(codedInputStream.PlaybackStateCompat());
            case 12:
                return Long.valueOf(codedInputStream.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus());
            case 13:
                return Integer.valueOf(codedInputStream.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            case 14:
                Long lValueOf = Long.valueOf(codedInputStream.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                int i4 = RemoteActionCompatParcelizer + 125;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return lValueOf;
                }
                obj.hashCode();
                throw null;
            case 15:
                return onshowpress.readString(codedInputStream);
            case 16:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("readPrimitiveField() cannot handle nested groups.");
                return null;
            case 17:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("readPrimitiveField() cannot handle embedded messages.");
                return null;
            case 18:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("readPrimitiveField() cannot handle enums.");
                return null;
            default:
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("There is no way to get here, but the compiler thinks otherwise.");
                return null;
        }
    }

    public static Object write(Class cls, String str, zzbv... zzbvVarArr) {
        int i = logImpressionlambda2.read();
        int i2 = logImpressionlambda2.read();
        int i3 = logImpressionlambda2.read();
        return IconCompatParcelizer(1456356990, logImpressionlambda2.read(), new Object[]{cls, str, zzbvVarArr}, i2, i, -1456356988, i3);
    }

    public static final Drawable read(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        int i2 = logImpressionlambda2.read();
        return (Drawable) IconCompatParcelizer(-1479691464, logImpressionlambda2.read(), objArr, logImpressionlambda2.read(), i2, 1479691465, logImpressionlambda2.read());
    }

    public static byte[] IconCompatParcelizer(byte[] bArr) {
        int i = logImpressionlambda2.read();
        int i2 = logImpressionlambda2.read();
        int i3 = logImpressionlambda2.read();
        return (byte[]) IconCompatParcelizer(-1906265295, logImpressionlambda2.read(), new Object[]{bArr}, i2, i, 1906265295, i3);
    }
}
