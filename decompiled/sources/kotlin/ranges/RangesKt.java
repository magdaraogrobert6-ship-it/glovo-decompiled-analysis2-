package kotlin.ranges;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.datastore.core.SimpleActor$offer$2;
import androidx.fragment.app.FragmentActivity;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.q3$$ExternalSyntheticLambda1;
import coil3.ExtrasKt;
import coil3.util.IntPair;
import coil3.util.UtilsKt;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.annotation.AnnotationConfig;
import com.mapbox.maps.plugin.annotation.AnnotationPluginImpl;
import com.mapbox.maps.plugin.annotation.AnnotationType;
import com.mapbox.maps.plugin.annotation.generated.CircleAnnotationManager;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationManager;
import com.mapbox.maps.plugin.annotation.generated.PolygonAnnotationManager;
import com.mapbox.maps.plugin.annotation.generated.PolylineAnnotationManager;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.startworking.oneclick.navigation.StartWorkingNavigationUiModelImpl;
import curtains.internal.RootViewsSpy$Companion$install$1$1;
import io.grpc.LoadBalancer$Helper;
import io.grpc.Status;
import io.reactivex.subjects.BehaviorSubject;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.RegexKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.Absolutea9UjIt4default;
import o.AndroidAutofillManager;
import o.AndroidContentCaptureManager;
import o.ApiErrorV3Companion;
import o.BackspaceCommand;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.CaptionedImageContentCardView;
import o.CaptionedImageContentCardViewViewHolder;
import o.ContentCardViewHolder;
import o.DefaultInAppMessageModalViewFactory;
import o.DefaultInAppMessageWebViewClientListenerCompanion;
import o.DrawableTransformation;
import o.FocusOrder;
import o.FocusOwnerdispatchRotaryEvent1;
import o.GifDrawableTransformation;
import o.PathIteratorConicEvaluation;
import o.PopulateViewStructure_androidKtpopulate7;
import o.RegistryMissingComponentException;
import o.RequestBuilder;
import o.ShadowCompanion;
import o.ShortNewsContentCardView;
import o.accessgetIntersectcp;
import o.accessgetLayerBlockp;
import o.accessgetReusableRectp;
import o.accessgetchildSerializerscp;
import o.accessisRenderNodeCompatiblecp;
import o.clipRectN_I0legdefault;
import o.component2D9Ej5fM;
import o.copylDy3nrA;
import o.copyqcb84PMdefault;
import o.createFromParcel;
import o.displayIconFromCurrentNodeOrDescendantsWithCursorInBounds;
import o.displayInAppMessagelambda1;
import o.ensureSubscribedToInAppMessageEventslambda5;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getAppropriateModalView;
import o.getAsClause;
import o.getBirthDateFull;
import o.getBlurRadius;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getDeclaredMethodQuietly;
import o.getDisplayingInAppMessageannotations;
import o.getHandleruiannotations;
import o.getInAppMessageViewWrapperFactory;
import o.getInternalPaintui_graphics;
import o.getLookaheadDelegate;
import o.getNewPassword;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getQueryContext;
import o.getStrokeJoinLxFBmk8;
import o.getStrokeWidth;
import o.getStyleTiuSbCo;
import o.getWindowInfoannotations;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isCurrentlyDisplayingInAppMessage;
import o.isItemDismissable;
import o.isRoot;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onMove;
import o.onOtherUrlActionlambda4;
import o.pauseWebviewIfNecessarylambda10;
import o.provideInsetsValuescytEWk0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaXTprrz59IiooUoChp937ds3kuBc;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.safeSetClipToOutline;
import o.setFraction;
import o.setGraphicModalMaxWidthDp;
import o.setInternalPaintui_graphics;
import o.setMaximumYnlvx88;
import o.setOptionalTextView;
import o.unregisterInAppMessageManager;
import o.updatePath;
import o.withTopLeftBottomRight;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RangesKt {
    public static Boolean ParcelableVolumeInfo = null;
    private static int serializer = 1;
    private static int write;

    public abstract Typeface IconCompatParcelizer(Context context, Resources resources, int i, String str);

    public abstract Absolutea9UjIt4default IconCompatParcelizer(component2D9Ej5fM component2d9ej5fm);

    public abstract void IconCompatParcelizer(getDeclaredMethodQuietly getdeclaredmethodquietly);

    public abstract Typeface read(Context context, FocusOrder focusOrder, Resources resources, int i);

    public abstract Typeface read(Context context, FocusOwnerdispatchRotaryEvent1[] focusOwnerdispatchRotaryEvent1Arr, int i);

    public abstract copylDy3nrA read(component2D9Ej5fM component2d9ej5fm);

    public abstract void read(Absolutea9UjIt4default absolutea9UjIt4default, Absolutea9UjIt4default absolutea9UjIt4default2);

    public abstract boolean read(component2D9Ej5fM component2d9ej5fm, Absolutea9UjIt4default absolutea9UjIt4default, Absolutea9UjIt4default absolutea9UjIt4default2);

    public abstract void serializer(Status status);

    public abstract void serializer(Absolutea9UjIt4default absolutea9UjIt4default, Thread thread);

    public abstract boolean serializer(component2D9Ej5fM component2d9ej5fm, Object obj, Object obj2);

    public abstract boolean serializer(component2D9Ej5fM component2d9ej5fm, copylDy3nrA copyldy3nra, copylDy3nrA copyldy3nra2);

    public RangesKt() {
        new ConcurrentHashMap();
    }

    public static Set write(Object obj) {
        int i = 2 % 2;
        int i2 = write + 117;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        int i4 = serializer + 69;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setSingleton;
    }

    public Typeface read(Context context, List list, int i) {
        int i2 = 2 % 2;
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public static final isRoot IconCompatParcelizer(String str) {
        int i = 2 % 2;
        str.getClass();
        isRoot isroot = new isRoot(str);
        int i2 = write + 97;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return isroot;
        }
        throw null;
    }

    private static /* synthetic */ Object MediaDescriptionCompat(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        str.getClass();
        isRoot isroot = new isRoot(str);
        int i2 = write + 27;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
        }
        return isroot;
    }

    public static final isRoot RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        str.getClass();
        isRoot isroot = new isRoot(str);
        int i2 = serializer + 105;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return isroot;
        }
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        str.getClass();
        isRoot isroot = new isRoot(str);
        int i2 = write + 69;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return isroot;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        o.DrawableTransformation.write(r5, "Step must be positive, was: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        if (r4 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r4 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        r1 = r1 + 87;
        kotlin.ranges.RangesKt.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void read(boolean r4, java.lang.Number r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.ranges.RangesKt.write
            int r2 = r1 + 57
            int r3 = r2 % 128
            kotlin.ranges.RangesKt.serializer = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L14
            r2 = 3
            int r2 = r2 / 0
            if (r4 == 0) goto L25
            goto L16
        L14:
            if (r4 == 0) goto L25
        L16:
            int r1 = r1 + 87
            int r4 = r1 % 128
            kotlin.ranges.RangesKt.serializer = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L20
            return
        L20:
            r4 = 0
            r4.hashCode()
            throw r4
        L25:
            java.lang.String r4 = "Step must be positive, was: "
            o.DrawableTransformation.write(r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.RangesKt.read(boolean, java.lang.Number):void");
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        str.getClass();
        isRoot isroot = new isRoot(str);
        int i2 = serializer + 49;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 7 / 0;
        }
        return isroot;
    }

    public static void serializer(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 95;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (obj != null) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Cannot return null from a non-@Nullable @Provides method");
        int i4 = serializer + 47;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final isRoot write(String str) {
        int i = 2 % 2;
        str.getClass();
        isRoot isroot = new isRoot(str);
        int i2 = write + 37;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return isroot;
    }

    public static CaptionedImageContentCardView IconCompatParcelizer(CaptionedImageContentCardView captionedImageContentCardView) {
        int i = 2 % 2;
        int i2 = write + 97;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            safeSetClipToOutline safesetcliptooutline = captionedImageContentCardView.read;
            safesetcliptooutline.IconCompatParcelizer();
            int i3 = safesetcliptooutline.PlaybackStateCompatCustomAction;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        safeSetClipToOutline safesetcliptooutline2 = captionedImageContentCardView.read;
        safesetcliptooutline2.IconCompatParcelizer();
        if (safesetcliptooutline2.PlaybackStateCompatCustomAction <= 0) {
            return CaptionedImageContentCardView.serializer;
        }
        int i4 = write + 29;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return captionedImageContentCardView;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        int i = 2 % 2;
        int i2 = write + 123;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0 ? jLongValue < 0 : jLongValue < 1) {
            unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
            long j = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer;
            int i3 = serializer + 17;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return Long.valueOf(j);
            }
            throw null;
        }
        unregisterInAppMessageManager unregisterinappmessagemanager2 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        return Long.valueOf(BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer);
    }

    public static void serializer(String str, String str2, Exception exc) {
        String strConcat;
        int i = 2 % 2;
        int i2 = write + 5;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            strConcat = "TRuntime.".concat(str);
            if (!Log.isLoggable(strConcat, 105)) {
                return;
            }
        } else {
            strConcat = "TRuntime.".concat(str);
            if (!Log.isLoggable(strConcat, 6)) {
                return;
            }
        }
        int i3 = serializer + 49;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        SentryLogcatAdapter.read(strConcat, str2, exc);
    }

    public static final Object execSQL(clipRectN_I0legdefault cliprectn_i0legdefault, String str, ContinuationImpl continuationImpl) {
        int i = 2 % 2;
        Object objUsePrepared = cliprectn_i0legdefault.usePrepared(str, new accessgetIntersectcp(0), continuationImpl);
        if (objUsePrepared != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return createFromParcel.INSTANCE;
        }
        int i2 = serializer;
        int i3 = i2 + 29;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 53;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objUsePrepared;
    }

    public static final void serializer(getPostalCode getpostalcode, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 7;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            int iWrite = BehaviorSubject.BehaviorDisposable.write();
            int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
            pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{4, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -722072991, 722072991, iWrite2);
            i = 0;
        } else {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            int iWrite3 = BehaviorSubject.BehaviorDisposable.write();
            int iWrite4 = BehaviorSubject.BehaviorDisposable.write();
            pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0}, BehaviorSubject.BehaviorDisposable.write(), iWrite3, -722072991, 722072991, iWrite4);
            i = 1;
        }
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getpostalcode, i);
        int i4 = serializer + 15;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
    }

    public static void serializer(Object obj, String str, String str2) {
        int i = 2 % 2;
        int i2 = serializer + 31;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0 ? !(!Log.isLoggable("TRuntime.".concat(str), 3)) : Log.isLoggable("TRuntime.".concat(str), 4)) {
            String.format(str2, obj);
        }
        int i3 = serializer + 49;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public static int read(int i, int i2, int i3) throws IOException {
        int i4 = 2 % 2;
        if ((i2 & 8) != 0) {
            i--;
            int i5 = write + 9;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        if (i3 > i) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(af$$ExternalSyntheticOutline0.m(i3, "PROTOCOL_ERROR padding ", i, " > remaining length "));
            return 0;
        }
        int i7 = serializer + 19;
        write = i7 % Fields.SpotShadowColor;
        return i7 % 2 != 0 ? i >>> i3 : i - i3;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 23;
        int i4 = i3 % Fields.SpotShadowColor;
        write = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (jLongValue > 2147483647L) {
            int i5 = i4 + 79;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return Integer.MAX_VALUE;
        }
        if (jLongValue < -2147483648L) {
            int i7 = i2 + 45;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return Integer.MIN_VALUE;
        }
        return Integer.valueOf((int) jLongValue);
    }

    private static /* synthetic */ Object MediaSessionCompatQueueItem(Object[] objArr) {
        int i = 2 % 2;
        int i2 = write + 59;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        InvocationHandler invocationHandler = (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, WebView.getWebViewClassLoader()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
        int i4 = serializer + 67;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return invocationHandler;
        }
        throw null;
    }

    public static getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations serializer(int i, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7) {
        boolean z;
        int i2 = 2 % 2;
        ensuresubscribedtoinappmessageeventslambda7.getClass();
        if (i > 0) {
            int i3 = write + 125;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        read(z, Integer.valueOf(i));
        int i5 = ensuresubscribedtoinappmessageeventslambda7.write;
        int i6 = ensuresubscribedtoinappmessageeventslambda7.read;
        if (ensuresubscribedtoinappmessageeventslambda7.serializer <= 0) {
            i = -i;
            int i7 = write + 29;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        return new getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations(i5, i6, i);
    }

    public static int write(copyqcb84PMdefault copyqcb84pmdefault, getBlurRadius getblurradius) {
        int i = 2 % 2;
        if (copyqcb84pmdefault instanceof ShadowCompanion) {
            int i2 = serializer + 43;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return ((ShadowCompanion) copyqcb84pmdefault).serializer;
            }
            int i3 = 25 / 0;
            return ((ShadowCompanion) copyqcb84pmdefault).serializer;
        }
        int i4 = PathIteratorConicEvaluation.read[getblurradius.ordinal()];
        if (i4 == 1) {
            int i5 = write + 1;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 65 / 0;
            }
            return Integer.MIN_VALUE;
        }
        if (i4 != 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return 0;
        }
        int i7 = serializer + 95;
        write = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return Integer.MAX_VALUE;
    }

    public static getAppropriateModalView IconCompatParcelizer(String str, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[] r8lambda92m0p9sit5uf70mvjf4rwmrudaArr) {
        int i = 2 % 2;
        int i2 = serializer + 13;
        write = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
            obj.hashCode();
            throw null;
        }
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Blank serial names are prohibited");
            return null;
        }
        r8lambdaXTprrz59IiooUoChp937ds3kuBc r8lambdaxtprrz59iioouochp937ds3kubc = new r8lambdaXTprrz59IiooUoChp937ds3kuBc(str);
        getAppropriateModalView getappropriatemodalview = new getAppropriateModalView(str, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.IconCompatParcelizer, r8lambdaxtprrz59iioouochp937ds3kubc.serializer.size(), onContentCardClicked.RatingCompat(r8lambda92m0p9sit5uf70mvjf4rwmrudaArr), r8lambdaxtprrz59iioouochp937ds3kubc);
        int i3 = serializer + 81;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return getappropriatemodalview;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        String str = (String) objArr[0];
        List<String> list = (List) objArr[1];
        int i = 2 % 2;
        if (!list.isEmpty()) {
            for (String str2 : list) {
                int i2 = serializer + 25;
                write = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                if (str.contains(str2)) {
                    int i4 = write + 111;
                    serializer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                } else {
                    try {
                        if (str.matches(str2)) {
                        }
                    } catch (Exception unused) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r10.equals(o.r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.IconCompatParcelizer) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r8 = new o.r8lambdaXTprrz59IiooUoChp937ds3kuBc(r9);
        r11 = new o.getAppropriateModalView(r9, r10, r8.serializer.size(), o.onContentCardClicked.RatingCompat(r11), r8);
        r9 = kotlin.ranges.RangesKt.write + 15;
        kotlin.ranges.RangesKt.serializer = r9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r10.equals(o.r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.IconCompatParcelizer) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o.getAppropriateModalView read(java.lang.String r9, kotlin.text.RegexKt r10, o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[] r11) {
        /*
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = o.hideCurrentlyDisplayingInAppMessage.serializer(r9)
            r2 = 0
            if (r1 != 0) goto L51
            int r1 = kotlin.ranges.RangesKt.write
            int r1 = r1 + 13
            int r3 = r1 % 128
            kotlin.ranges.RangesKt.serializer = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L22
            o.r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8 r1 = o.r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.IconCompatParcelizer
            boolean r1 = r10.equals(r1)
            r3 = 51
            int r3 = r3 / 0
            if (r1 != 0) goto L4b
            goto L2a
        L22:
            o.r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8 r1 = o.r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.IconCompatParcelizer
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L4b
        L2a:
            o.r8lambdaXTprrz59IiooUoChp937ds3kuBc r8 = new o.r8lambdaXTprrz59IiooUoChp937ds3kuBc
            r8.<init>(r9)
            java.util.ArrayList r1 = r8.serializer
            int r6 = r1.size()
            java.util.List r7 = o.onContentCardClicked.RatingCompat(r11)
            o.getAppropriateModalView r11 = new o.getAppropriateModalView
            r3 = r11
            r4 = r9
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            int r9 = kotlin.ranges.RangesKt.write
            int r9 = r9 + 15
            int r10 = r9 % 128
            kotlin.ranges.RangesKt.serializer = r10
            int r9 = r9 % r0
            return r11
        L4b:
            java.lang.String r9 = "For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r9)
            return r2
        L51:
            java.lang.String r9 = "Blank serial names are prohibited"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.RangesKt.read(java.lang.String, kotlin.text.RegexKt, o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[]):o.getAppropriateModalView");
    }

    public static String write(int i, int i2, String str) {
        int i3 = 2 % 2;
        int i4 = serializer;
        int i5 = i4 + 7;
        write = i5 % Fields.SpotShadowColor;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (i < 0) {
            return displayIconFromCurrentNodeOrDescendantsWithCursorInBounds.RemoteActionCompatParcelizer("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            int i6 = i4 + 49;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return displayIconFromCurrentNodeOrDescendantsWithCursorInBounds.RemoteActionCompatParcelizer("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i2, "negative size: "));
        int i8 = serializer + 109;
        write = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return null;
    }

    public static boolean serializer(Context context) {
        int i = 2 % 2;
        int i2 = serializer + 23;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        Boolean bool = ParcelableVolumeInfo;
        if (bool != null) {
            int i5 = i3 + 79;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return bool.booleanValue();
        }
        try {
            boolean z = context.getPackageManager().getApplicationInfo(context.getPackageName(), Fields.SpotShadowColor).metaData.getBoolean("firebase_performance_logcat_enabled", false);
            ParcelableVolumeInfo = Boolean.valueOf(z);
            return z;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            getWindowInfoannotations getwindowinfoannotationsWrite = getWindowInfoannotations.write();
            e.getMessage();
            getwindowinfoannotationsWrite.read();
            int i7 = serializer + 49;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
    }

    public static final getAppropriateModalView write(String str, RegexKt regexKt, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[] r8lambda92m0p9sit5uf70mvjf4rwmrudaArr, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = 2 % 2;
        if (!(!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str))) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Blank serial names are prohibited");
            return null;
        }
        int i2 = write + 107;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (regexKt.equals(r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.IconCompatParcelizer)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        r8lambdaXTprrz59IiooUoChp937ds3kuBc r8lambdaxtprrz59iioouochp937ds3kubc = new r8lambdaXTprrz59IiooUoChp937ds3kuBc(str);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(r8lambdaxtprrz59iioouochp937ds3kubc);
        getAppropriateModalView getappropriatemodalview = new getAppropriateModalView(str, regexKt, r8lambdaxtprrz59iioouochp937ds3kubc.serializer.size(), onContentCardClicked.RatingCompat(r8lambda92m0p9sit5uf70mvjf4rwmrudaArr), r8lambdaxtprrz59iioouochp937ds3kubc);
        int i4 = serializer + 123;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return getappropriatemodalview;
        }
        throw null;
    }

    public static final withTopLeftBottomRight IconCompatParcelizer(Throwable th) {
        int i = 2 % 2;
        th.getClass();
        ArrayList arrayList = new ArrayList();
        while (true) {
            Object obj = null;
            if (th == null) {
                break;
            }
            int i2 = write + 39;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                arrayList.contains(th);
                obj.hashCode();
                throw null;
            }
            if (arrayList.contains(th)) {
                break;
            }
            int i3 = serializer + 113;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            arrayList.add(th);
            if (th instanceof HttpException) {
                withTopLeftBottomRight withtopleftbottomright = new withTopLeftBottomRight((HttpException) th, onContentCardDismissed.IconCompatParcelizer(arrayList, "\n-----\n", null, null, new MapApiError$$ExternalSyntheticLambda1(1), 30));
                int i5 = write + 115;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return withtopleftbottomright;
            }
            th = th.getCause();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    public static void write(int i, int i2, int i3) {
        String strWrite;
        int i4 = 2 % 2;
        int i5 = serializer + 125;
        int i6 = i5 % Fields.SpotShadowColor;
        write = i6;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strWrite = write(i, i3, "start index");
            } else if (i2 >= 0) {
                int i7 = i6 + 35;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (i2 <= i3) {
                    strWrite = displayIconFromCurrentNodeOrDescendantsWithCursorInBounds.RemoteActionCompatParcelizer("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
                    int i9 = serializer + 117;
                    write = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                } else {
                    strWrite = write(i2, i3, "end index");
                }
            } else {
                strWrite = write(i2, i3, "end index");
            }
            throw new IndexOutOfBoundsException(strWrite);
        }
    }

    public static LinkedHashSet read(Set set, Iterable iterable) {
        Integer numValueOf;
        int size;
        int i = 2 % 2;
        int i2 = serializer + 5;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        set.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            numValueOf = Integer.valueOf(((Collection) iterable).size());
            int i4 = write + 119;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int i6 = write + 85;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(onMove.RemoteActionCompatParcelizer(size));
        linkedHashSet.addAll(set);
        onContentCardDismissed.RemoteActionCompatParcelizer(iterable, (Collection) linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet RemoteActionCompatParcelizer(Object obj, Set set) {
        int i = 2 % 2;
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(onMove.RemoteActionCompatParcelizer(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        int i2 = serializer + 57;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return linkedHashSet;
    }

    public static final PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer(MutableInteractionSourceImpl mutableInteractionSourceImpl, getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        int i2 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Object objComponentActivity = getpostalcode.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (objComponentActivity == androidContentCaptureManager) {
            objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
            getpostalcode.write(objComponentActivity);
        }
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
        int i3 = 1;
        if ((((i & 14) ^ 6) <= 4 || !getpostalcode.read(mutableInteractionSourceImpl)) && (i & 6) != 4) {
            z = false;
        } else {
            int i4 = serializer + 11;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = true;
        }
        Object objComponentActivity2 = getpostalcode.ComponentActivity();
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (z || objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = new SimpleActor$offer$2(mutableInteractionSourceImpl, populateViewStructure_androidKtpopulate7, shortNewsContentCardView, i3);
            getpostalcode.write(objComponentActivity2);
        }
        getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, mutableInteractionSourceImpl, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
        int i6 = write + 61;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return populateViewStructure_androidKtpopulate7;
        }
        throw null;
    }

    public static void serializer(getLookaheadDelegate getlookaheaddelegate, SQLiteDatabase sQLiteDatabase) {
        int i = 2 % 2;
        int i2 = write + 117;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj = null;
        if (getlookaheaddelegate == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Monitor must not be null");
            int i4 = serializer + 59;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        zzgs zzgsVar = getlookaheaddelegate.MediaSessionCompatQueueItem;
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            int i5 = serializer + 45;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                zzgsVar.RemoteActionCompatParcelizer("Failed to turn off database read permission");
                int i6 = 97 / 0;
            } else {
                zzgsVar.RemoteActionCompatParcelizer("Failed to turn off database read permission");
            }
        }
        if (!file.setWritable(false, false)) {
            int i7 = serializer + 83;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                zzgsVar.RemoteActionCompatParcelizer("Failed to turn off database write permission");
                obj.hashCode();
                throw null;
            }
            zzgsVar.RemoteActionCompatParcelizer("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            int i8 = serializer + 33;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                zzgsVar.RemoteActionCompatParcelizer("Failed to turn on database read permission for owner");
                obj.hashCode();
                throw null;
            }
            zzgsVar.RemoteActionCompatParcelizer("Failed to turn on database read permission for owner");
        }
        if (!(!file.setWritable(true, true))) {
            return;
        }
        zzgsVar.RemoteActionCompatParcelizer("Failed to turn on database write permission for owner");
        int i9 = serializer + 125;
        write = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            int i10 = 5 / 4;
        }
    }

    public static final long IconCompatParcelizer(int i, int i2, accessgetLayerBlockp accessgetlayerblockp, getBlurRadius getblurradius, accessgetLayerBlockp accessgetlayerblockp2) {
        int i3 = 2 % 2;
        Object[] objArr = {accessgetlayerblockp, accessgetLayerBlockp.serializer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            i = write(accessgetlayerblockp.IconCompatParcelizer, getblurradius);
            i2 = write(accessgetlayerblockp.read, getblurradius);
            int i4 = serializer + 103;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 / 2;
            }
        }
        copyqcb84PMdefault copyqcb84pmdefault = accessgetlayerblockp2.IconCompatParcelizer;
        copyqcb84PMdefault copyqcb84pmdefault2 = accessgetlayerblockp2.read;
        if (copyqcb84pmdefault instanceof ShadowCompanion) {
            int i6 = write + 51;
            int i7 = i6 % Fields.SpotShadowColor;
            serializer = i7;
            Object obj = null;
            if (i6 % 2 == 0) {
                throw null;
            }
            if (i != Integer.MIN_VALUE) {
                if (i == Integer.MAX_VALUE) {
                    int i8 = i7 + 77;
                    write = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                } else {
                    int i9 = ((ShadowCompanion) copyqcb84pmdefault).serializer;
                    if (i > i9) {
                        i = i9;
                    }
                }
            }
        }
        if ((copyqcb84pmdefault2 instanceof ShadowCompanion) && i2 != Integer.MIN_VALUE) {
            if (i2 == Integer.MAX_VALUE) {
                int i10 = write + 57;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            } else {
                int i12 = ((ShadowCompanion) copyqcb84pmdefault2).serializer;
                if (i2 > i12) {
                    i2 = i12;
                }
            }
        }
        return IntPair.read(i, i2);
    }

    public static void IconCompatParcelizer(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = serializer;
        int i5 = i4 + 113;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        if (i >= 0) {
            int i7 = i4 + 97;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (i <= i2) {
                return;
            }
        }
        DrawableTransformation.read(write(i, i2, "index"));
        int i9 = write + 45;
        serializer = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b A[PHI: r1
  0x004b: PHI (r1v9 double) = (r1v8 double), (r1v14 double) binds: [B:17:0x0049, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    public static final double write(int i, int i2, int i3, int i4, getBlurRadius getblurradius, accessgetLayerBlockp accessgetlayerblockp) {
        double dMax;
        double d;
        int i5 = 2 % 2;
        double d2 = i;
        double d3 = ((double) i3) / d2;
        double d4 = i2;
        double d5 = ((double) i4) / d4;
        int i6 = PathIteratorConicEvaluation.read[getblurradius.ordinal()];
        if (i6 == 1) {
            dMax = Math.max(d3, d5);
        } else if (i6 == 2) {
            dMax = Math.min(d3, d5);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return 0.0d;
        }
        copyqcb84PMdefault copyqcb84pmdefault = accessgetlayerblockp.IconCompatParcelizer;
        if (copyqcb84pmdefault instanceof ShadowCompanion) {
            int i7 = write + 101;
            serializer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                d = ((double) ((ShadowCompanion) copyqcb84pmdefault).serializer) + d2;
                if (dMax > d) {
                    dMax = d;
                    int i8 = serializer + 69;
                    int i9 = i8 % Fields.SpotShadowColor;
                    write = i9;
                    int i10 = i8 % 2;
                    int i11 = i9 + 51;
                    serializer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                }
            } else {
                d = ((double) ((ShadowCompanion) copyqcb84pmdefault).serializer) / d2;
                if (dMax > d) {
                    dMax = d;
                    int i13 = serializer + 69;
                    int i14 = i13 % Fields.SpotShadowColor;
                    write = i14;
                    int i15 = i13 % 2;
                    int i16 = i14 + 51;
                    serializer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                }
            }
        }
        copyqcb84PMdefault copyqcb84pmdefault2 = accessgetlayerblockp.read;
        if (copyqcb84pmdefault2 instanceof ShadowCompanion) {
            double d6 = ((double) ((ShadowCompanion) copyqcb84pmdefault2).serializer) / d4;
            if (dMax > d6) {
                return d6;
            }
        }
        return dMax;
    }

    public static Set RemoteActionCompatParcelizer(Set set, Iterable iterable) {
        int i = 2 % 2;
        int i2 = write + 53;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        set.getClass();
        iterable.getClass();
        Collection<?> collectionWrite = onContentCardDismissed.write(iterable);
        if (collectionWrite.isEmpty()) {
            return onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(set);
        }
        if (!(collectionWrite instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionWrite);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        int i4 = serializer + 57;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        for (Object obj : set) {
            if (!((Set) collectionWrite).contains(obj)) {
                int i6 = write + 87;
                serializer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    linkedHashSet2.add(obj);
                    int i7 = 53 / 0;
                } else {
                    linkedHashSet2.add(obj);
                }
            }
        }
        return linkedHashSet2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if ((r2 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r1 = o.setUnregisteredInAppMessage.MILLISECONDS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r18.compareTo(r1) >= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r1.getClass();
        r2 = r18.getTimeUnit$kotlin_stdlib().convert(1, r1.getTimeUnit$kotlin_stdlib());
        r8 = o.BrazeInAppMessageManagerExternalSyntheticLambda2.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        return o.BrazeInAppMessageManagerExternalSyntheticLambda2.read(coil3.UriKt.IconCompatParcelizer((r14 / r2) - (r16 / r2), r1), coil3.UriKt.IconCompatParcelizer((r14 % r2) - (r16 % r2), r18));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
    
        return o.BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(((java.lang.Long) read(-903966784, o.BackspaceCommand.write(), o.BackspaceCommand.write(), new java.lang.Object[]{java.lang.Long.valueOf(r6)}, o.BackspaceCommand.write(), 903966784, o.BackspaceCommand.write())).longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0095, code lost:
    
        r18.compareTo(o.setUnregisteredInAppMessage.MILLISECONDS);
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        return coil3.UriKt.IconCompatParcelizer(r6, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (((r6 % r14) | ((r6 - r16) - 1)) < 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (((r6 ^ r14) & (~(r6 ^ r16))) < 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        r2 = r2 + 125;
        kotlin.ranges.RangesKt.serializer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long IconCompatParcelizer(long r14, long r16, o.setUnregisteredInAppMessage r18) {
        /*
            r0 = r18
            r1 = 2
            int r2 = r1 % r1
            int r2 = kotlin.ranges.RangesKt.write
            int r3 = r2 + 125
            int r4 = r3 % 128
            kotlin.ranges.RangesKt.serializer = r4
            int r3 = r3 % r1
            r4 = 0
            if (r3 != 0) goto L21
            long r6 = r14 * r16
            long r8 = r6 % r14
            long r10 = r6 - r16
            r12 = -1
            long r10 = r10 + r12
            long r8 = r8 | r10
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 >= 0) goto L9f
            goto L2d
        L21:
            long r6 = r14 - r16
            long r8 = r6 ^ r14
            long r10 = r6 ^ r16
            long r10 = ~r10
            long r8 = r8 & r10
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 >= 0) goto L9f
        L2d:
            int r2 = r2 + 125
            int r3 = r2 % 128
            kotlin.ranges.RangesKt.serializer = r3
            int r2 = r2 % r1
            if (r2 == 0) goto L95
            o.setUnregisteredInAppMessage r1 = o.setUnregisteredInAppMessage.MILLISECONDS
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L68
            r1.getClass()
            java.util.concurrent.TimeUnit r2 = r18.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r3 = r1.getTimeUnit$kotlin_stdlib()
            r4 = 1
            long r2 = r2.convert(r4, r3)
            long r4 = r14 / r2
            long r6 = r16 / r2
            o.unregisterInAppMessageManager r8 = o.BrazeInAppMessageManagerExternalSyntheticLambda2.write
            long r4 = r4 - r6
            long r4 = coil3.UriKt.IconCompatParcelizer(r4, r1)
            long r6 = r14 % r2
            long r1 = r16 % r2
            long r6 = r6 - r1
            long r0 = coil3.UriKt.IconCompatParcelizer(r6, r0)
            long r0 = o.BrazeInAppMessageManagerExternalSyntheticLambda2.read(r4, r0)
            return r0
        L68:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r0}
            int r7 = o.BackspaceCommand.write()
            int r2 = o.BackspaceCommand.write()
            int r5 = o.BackspaceCommand.write()
            int r3 = o.BackspaceCommand.write()
            r1 = -903966784(0xffffffffca1e8fc0, float:-2597872.0)
            r6 = 903966784(0x35e17040, float:1.6796475E-6)
            java.lang.Object r0 = read(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r0 = o.BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(r0)
            return r0
        L95:
            o.setUnregisteredInAppMessage r1 = o.setUnregisteredInAppMessage.MILLISECONDS
            r0.compareTo(r1)
            r0 = 0
            r0.hashCode()
            throw r0
        L9f:
            long r0 = coil3.UriKt.IconCompatParcelizer(r6, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.RangesKt.IconCompatParcelizer(long, long, o.setUnregisteredInAppMessage):long");
    }

    public static final Object await(Task task, ContinuationImpl continuationImpl) throws Exception {
        int i = 2 % 2;
        if (!task.isComplete()) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(continuationImpl));
            cancellableContinuationImpl.read();
            task.addOnCompleteListener(getInAppMessageViewWrapperFactory.IconCompatParcelizer, new getAsClause(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return result;
        }
        int i2 = write + 37;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        int i4 = write + 75;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            task.isCanceled();
            throw null;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long read(long j, getDisplayingInAppMessageannotations getdisplayinginappmessageannotations) {
        int i = 2 % 2;
        int i2 = write + 51;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = getdisplayinginappmessageannotations instanceof ensureSubscribedToInAppMessageEventslambda5;
            throw null;
        }
        if (getdisplayinginappmessageannotations instanceof ensureSubscribedToInAppMessageEventslambda5) {
            return ((Number) IconCompatParcelizer(Long.valueOf(j), (ensureSubscribedToInAppMessageEventslambda5) getdisplayinginappmessageannotations)).longValue();
        }
        if (getdisplayinginappmessageannotations.write()) {
            DrawableTransformation.write(getdisplayinginappmessageannotations, "Cannot coerce value to an empty range: ");
            return 0L;
        }
        int i3 = serializer + 73;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            ((Number) getdisplayinginappmessageannotations.RemoteActionCompatParcelizer()).longValue();
            obj.hashCode();
            throw null;
        }
        if (j < ((Number) getdisplayinginappmessageannotations.RemoteActionCompatParcelizer()).longValue()) {
            return ((Number) getdisplayinginappmessageannotations.RemoteActionCompatParcelizer()).longValue();
        }
        if (j <= ((Number) getdisplayinginappmessageannotations.IconCompatParcelizer()).longValue()) {
            return j;
        }
        int i4 = write + 37;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return ((Number) getdisplayinginappmessageannotations.IconCompatParcelizer()).longValue();
        }
        ((Number) getdisplayinginappmessageannotations.IconCompatParcelizer()).longValue();
        throw null;
    }

    public static int RemoteActionCompatParcelizer(int i, int i2, int i3) {
        int i4 = 2 % 2;
        if (i2 > i3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
        }
        if (i < i2) {
            int i5 = write + 17;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return i2;
        }
        if (i > i3) {
            return i3;
        }
        int i7 = write + 117;
        serializer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return i;
    }

    public static long IconCompatParcelizer(long j, long j2, long j3) {
        int i = 2 % 2;
        int i2 = serializer + 21;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (j2 > j3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(c8$$ExternalSyntheticOutline0.m(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j2, '.'));
            return 0L;
        }
        if (j < j2) {
            return j2;
        }
        if (j <= j3) {
            return j;
        }
        int i5 = i3 + 51;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return j3;
    }

    public static float write(float f, float f2, float f3) {
        int i = 2 % 2;
        if (f2 > f3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
        }
        int i2 = serializer + 105;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (f < f2) {
            int i5 = i3 + 101;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return f2;
        }
        if (f <= f3) {
            return f;
        }
        int i7 = i3 + 55;
        serializer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return f3;
    }

    public static double read(double d, double d2, double d3) {
        int i = 2 % 2;
        int i2 = serializer + 49;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (d2 > d3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d3, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), d2, '.'));
            return 0.0d;
        }
        if (d < d2) {
            return d2;
        }
        if (d <= d3) {
            return d;
        }
        int i4 = i3 + 53;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return d3;
        }
        obj.hashCode();
        throw null;
    }

    public static Comparable IconCompatParcelizer(Comparable comparable, ensureSubscribedToInAppMessageEventslambda5 ensuresubscribedtoinappmessageeventslambda5) {
        int i = 2 % 2;
        Object obj = null;
        if (ensuresubscribedtoinappmessageeventslambda5.write()) {
            DrawableTransformation.write(ensuresubscribedtoinappmessageeventslambda5, "Cannot coerce value to an empty range: ");
            return null;
        }
        int i2 = write + 125;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (ensuresubscribedtoinappmessageeventslambda5.RemoteActionCompatParcelizer(comparable, ensuresubscribedtoinappmessageeventslambda5.RemoteActionCompatParcelizer())) {
            int i4 = write + 81;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (!ensuresubscribedtoinappmessageeventslambda5.RemoteActionCompatParcelizer(ensuresubscribedtoinappmessageeventslambda5.RemoteActionCompatParcelizer(), comparable)) {
                return ensuresubscribedtoinappmessageeventslambda5.RemoteActionCompatParcelizer();
            }
        }
        if (!ensuresubscribedtoinappmessageeventslambda5.RemoteActionCompatParcelizer(ensuresubscribedtoinappmessageeventslambda5.IconCompatParcelizer(), comparable)) {
            return comparable;
        }
        int i6 = serializer + 23;
        write = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        if (ensuresubscribedtoinappmessageeventslambda5.RemoteActionCompatParcelizer(comparable, ensuresubscribedtoinappmessageeventslambda5.IconCompatParcelizer())) {
            return comparable;
        }
        int i8 = write + 111;
        serializer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return ensuresubscribedtoinappmessageeventslambda5.IconCompatParcelizer();
        }
        ensuresubscribedtoinappmessageeventslambda5.IconCompatParcelizer();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[DONT_INVERT, PHI: r1
  0x0031: PHI (r1v7 int) = (r1v6 int), (r1v18 int) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public static final PointAnnotationManager createPointAnnotationManager(AnnotationPluginImpl annotationPluginImpl, AnnotationConfig annotationConfig) {
        int i;
        MapDelegateProviderImpl mapDelegateProviderImpl;
        Object circleAnnotationManager;
        MapDelegateProviderImpl mapDelegateProviderImpl2;
        MapDelegateProviderImpl mapDelegateProviderImpl3;
        MapDelegateProviderImpl mapDelegateProviderImpl4;
        int i2 = 2 % 2;
        int i3 = write + 33;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            AnnotationType annotationType = AnnotationType.PointAnnotation;
            annotationType.getClass();
            i = AnnotationPluginImpl.WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
            if (i == 0) {
                mapDelegateProviderImpl4 = annotationPluginImpl.delegateProvider;
                if (mapDelegateProviderImpl4 != null) {
                    removeNodeAtDepth.serializer("delegateProvider");
                    throw null;
                }
                circleAnnotationManager = new PolygonAnnotationManager(mapDelegateProviderImpl4, annotationConfig);
            } else if (i != 2) {
                mapDelegateProviderImpl = annotationPluginImpl.delegateProvider;
                if (mapDelegateProviderImpl != null) {
                    removeNodeAtDepth.serializer("delegateProvider");
                    throw null;
                }
                circleAnnotationManager = new CircleAnnotationManager(mapDelegateProviderImpl, annotationConfig);
            } else if (i != 3) {
                mapDelegateProviderImpl2 = annotationPluginImpl.delegateProvider;
                if (mapDelegateProviderImpl2 != null) {
                    removeNodeAtDepth.serializer("delegateProvider");
                    throw null;
                }
                circleAnnotationManager = new PolylineAnnotationManager(mapDelegateProviderImpl2, annotationConfig);
            } else {
                if (i == 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                int i4 = write + 9;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                mapDelegateProviderImpl3 = annotationPluginImpl.delegateProvider;
                if (mapDelegateProviderImpl3 != null) {
                    removeNodeAtDepth.serializer("delegateProvider");
                    throw null;
                }
                circleAnnotationManager = new PointAnnotationManager(mapDelegateProviderImpl3, annotationConfig);
                int i6 = write + 43;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        } else {
            AnnotationType annotationType2 = AnnotationType.PointAnnotation;
            annotationType2.getClass();
            i = AnnotationPluginImpl.WhenMappings.$EnumSwitchMapping$0[annotationType2.ordinal()];
            if (i == 1) {
                mapDelegateProviderImpl4 = annotationPluginImpl.delegateProvider;
                if (mapDelegateProviderImpl4 != null) {
                    removeNodeAtDepth.serializer("delegateProvider");
                    throw null;
                }
                circleAnnotationManager = new PolygonAnnotationManager(mapDelegateProviderImpl4, annotationConfig);
            } else if (i != 2) {
                mapDelegateProviderImpl = annotationPluginImpl.delegateProvider;
                if (mapDelegateProviderImpl != null) {
                    removeNodeAtDepth.serializer("delegateProvider");
                    throw null;
                }
                circleAnnotationManager = new CircleAnnotationManager(mapDelegateProviderImpl, annotationConfig);
            } else if (i != 3) {
                mapDelegateProviderImpl2 = annotationPluginImpl.delegateProvider;
                if (mapDelegateProviderImpl2 != null) {
                    removeNodeAtDepth.serializer("delegateProvider");
                    throw null;
                }
                circleAnnotationManager = new PolylineAnnotationManager(mapDelegateProviderImpl2, annotationConfig);
            } else {
                if (i == 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                int i8 = write + 9;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                mapDelegateProviderImpl3 = annotationPluginImpl.delegateProvider;
                if (mapDelegateProviderImpl3 != null) {
                    removeNodeAtDepth.serializer("delegateProvider");
                    throw null;
                }
                circleAnnotationManager = new PointAnnotationManager(mapDelegateProviderImpl3, annotationConfig);
                int i10 = write + 43;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
        }
        annotationPluginImpl.managerList.add(new WeakReference(circleAnnotationManager));
        PointAnnotationManager pointAnnotationManager = (PointAnnotationManager) circleAnnotationManager;
        int i12 = write + 35;
        serializer = i12 % Fields.SpotShadowColor;
        if (i12 % 2 != 0) {
            return pointAnnotationManager;
        }
        throw null;
    }

    public static Comparable write(Integer num, Integer num2, Integer num3) {
        int i = 2 % 2;
        int i2 = serializer + 57;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (num2 == null || num3 == null) {
            if (num2 != null) {
                int i5 = i3 + 91;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (num.compareTo(num2) < 0) {
                    int i7 = write + 99;
                    serializer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return num2;
                }
            }
            if (num3 != null && num.compareTo(num3) > 0) {
                int i9 = write + 95;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return num3;
            }
        } else if (num2.compareTo(num3) <= 0) {
            if (num.compareTo(num2) < 0) {
                return num2;
            }
            if (num.compareTo(num3) > 0) {
                return num3;
            }
        } else {
            DrawableTransformation.serializer("Cannot coerce value to an empty range: maximum ", num3, " is less than minimum ", num2, 46);
            int i11 = write + 95;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return null;
        }
        int i13 = serializer + 115;
        write = i13 % Fields.SpotShadowColor;
        if (i13 % 2 != 0) {
            int i14 = 79 / 0;
        }
        return num;
    }

    public static final DefaultInAppMessageWebViewClientListenerCompanion read(String str) {
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp;
        int i = 2 % 2;
        DefaultInAppMessageModalViewFactory defaultInAppMessageModalViewFactory = DefaultInAppMessageModalViewFactory.RatingCompat;
        if (!(!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str))) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Blank serial names are prohibited");
            int i2 = serializer + 113;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return null;
        }
        Iterator it = ((ContentCardViewHolder) onOtherUrlActionlambda4.IconCompatParcelizer.values()).iterator();
        do {
            CaptionedImageContentCardViewViewHolder captionedImageContentCardViewViewHolder = (CaptionedImageContentCardViewViewHolder) it;
            if (!captionedImageContentCardViewViewHolder.hasNext()) {
                return new DefaultInAppMessageWebViewClientListenerCompanion(str, defaultInAppMessageModalViewFactory);
            }
            setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) captionedImageContentCardViewViewHolder.next();
        } while (!str.equals(setgraphicmodalmaxwidthdp.getDescriptor().serializer()));
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
        sbM.append(displayInAppMessagelambda1.serializer(setgraphicmodalmaxwidthdp.getClass()).IconCompatParcelizer());
        sbM.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem(sbM.toString()));
        int i4 = write + 85;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final long serializer(GifDrawableTransformation gifDrawableTransformation, RequestBuilder requestBuilder, int i, long j) {
        int i2 = 2;
        int i3 = 2 % 2;
        RegistryMissingComponentException registryMissingComponentException = gifDrawableTransformation.bufferField;
        requestBuilder.getClass();
        long j2 = i;
        setOptionalTextView.RemoteActionCompatParcelizer(requestBuilder.serializer(), 0L, j2);
        if (gifDrawableTransformation.closed) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return 0L;
        }
        long jMax = 0;
        while (true) {
            long jWrite = ApiErrorV3Companion.write(registryMissingComponentException, requestBuilder, jMax, j, i);
            if (jWrite != -1) {
                int i4 = write + 9;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % i2;
                return jWrite;
            }
            long j3 = registryMissingComponentException.size;
            long j4 = (j3 - j2) + 1;
            if (j4 >= j) {
                return -1L;
            }
            if (j3 >= j) {
                int iMax = (int) Math.max(1L, (j3 - j) + 1);
                int iMin = ((int) Math.min(j2, (registryMissingComponentException.size - jMax) + 1)) - 1;
                if (iMax > iMin) {
                    return -1L;
                }
                while (!registryMissingComponentException.read(iMin, registryMissingComponentException.size - ((long) iMin), requestBuilder)) {
                    if (iMin == iMax) {
                        return -1L;
                    }
                    int i6 = write + 5;
                    serializer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    iMin--;
                }
            }
            if (gifDrawableTransformation.source.RemoteActionCompatParcelizer(registryMissingComponentException, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j4);
            int i8 = serializer + 73;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031 A[PHI: r11
  0x0031: PHI (r11v5 o.getPostalCode) = (r11v1 o.getPostalCode), (r11v6 o.getPostalCode) binds: [B:8:0x0023, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0095 A[PHI: r2
  0x0095: PHI (r2v13 boolean) = (r2v12 boolean), (r2v16 boolean) binds: [B:41:0x0093, B:38:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0025 A[PHI: r11
  0x0025: PHI (r11v2 o.getPostalCode) = (r11v1 o.getPostalCode), (r11v6 o.getPostalCode) binds: [B:8:0x0023, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void serializer(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, getStrokeWidth getstrokewidth, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        boolean zIconCompatParcelizer;
        int i4;
        int i5 = 2 % 2;
        int i6 = write + 101;
        serializer = i6 % Fields.SpotShadowColor;
        int i7 = 1;
        if (i6 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(228371534);
            if ((i & 89) == 0) {
                if (!getpostalcode.IconCompatParcelizer(accessisrendernodecompatiblecp)) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(228371534);
            if ((i & 6) == 0) {
                if (!getpostalcode.IconCompatParcelizer(accessisrendernodecompatiblecp)) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(getstrokewidth)) {
                int i8 = write + 59;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i & 384) == 0) {
            int i10 = write + 17;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 256 : Fields.SpotShadowColor;
        }
        boolean z = false;
        if (getpostalcode.write(i3 & 1, (i3 & 147) != 146)) {
            int i12 = write + 69;
            serializer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getstrokewidth);
                if ((i3 & 8652) == 26036) {
                    z = true;
                }
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getstrokewidth);
                if ((i3 & 896) == 256) {
                    z = true;
                }
            }
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(accessisrendernodecompatiblecp);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer2 | zIconCompatParcelizer | z) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new updatePath(accessisrendernodecompatiblecp, getstrokewidth, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i7);
                getpostalcode.write(objComponentActivity);
            }
            getPhoneNumberNational.IconCompatParcelizer(accessisrendernodecompatiblecp, getstrokewidth, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getInternalPaintui_graphics(i, 0, accessisrendernodecompatiblecp, getstrokewidth, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
        int i13 = serializer + 31;
        write = i13 % Fields.SpotShadowColor;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084 A[PHI: r4
  0x0084: PHI (r4v11 boolean) = (r4v10 boolean), (r4v14 boolean) binds: [B:39:0x0082, B:36:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x0094 A[PHI: r4
  0x0094: PHI (r4v13 boolean) = (r4v10 boolean), (r4v14 boolean) binds: [B:39:0x0082, B:36:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void write(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, getStyleTiuSbCo getstyletiusbco, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        int i4 = serializer + 13;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(912823238);
        boolean z2 = true;
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(accessisrendernodecompatiblecp) ^ true ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(getstyletiusbco) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 256 : Fields.SpotShadowColor;
        }
        if ((i2 & 147) != 146) {
            int i6 = write + 25;
            serializer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            int i7 = write + 41;
            serializer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getstyletiusbco);
                if ((i2 & 30063) == 30863) {
                    int i8 = serializer + 71;
                    int i9 = i8 % Fields.SpotShadowColor;
                    write = i9;
                    int i10 = i8 % 2;
                    int i11 = i9 + 1;
                    serializer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                } else {
                    z2 = false;
                }
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getstyletiusbco);
                if ((i2 & 896) == 256) {
                    int i13 = serializer + 71;
                    int i14 = i13 % Fields.SpotShadowColor;
                    write = i14;
                    int i15 = i13 % 2;
                    int i16 = i14 + 1;
                    serializer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                } else {
                    z2 = false;
                }
            }
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(accessisrendernodecompatiblecp);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer2 | z2 | zIconCompatParcelizer) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(accessisrendernodecompatiblecp, getstyletiusbco, r8lambdaunavo3sxub_pc9xroryotnrlvsm, 19);
                getpostalcode.write(objComponentActivity);
                int i18 = serializer + 17;
                write = i18 % Fields.SpotShadowColor;
                if (i18 % 2 != 0) {
                    int i19 = 4 / 3;
                }
            }
            getPhoneNumberNational.IconCompatParcelizer(accessisrendernodecompatiblecp, getstyletiusbco, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 10, accessisrendernodecompatiblecp, getstyletiusbco, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object requestAppUpdateInfo(provideInsetsValuescytEWk0 provideinsetsvaluescytewk0, ContinuationImpl continuationImpl) {
        setMaximumYnlvx88 setmaximumynlvx88;
        int i = 2 % 2;
        if (continuationImpl instanceof setMaximumYnlvx88) {
            setmaximumynlvx88 = (setMaximumYnlvx88) continuationImpl;
            int i2 = setmaximumynlvx88.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setmaximumynlvx88.write = i2 - Integer.MIN_VALUE;
            } else {
                setmaximumynlvx88 = new setMaximumYnlvx88(continuationImpl);
            }
        } else {
            setmaximumynlvx88 = new setMaximumYnlvx88(continuationImpl);
        }
        Object result = setmaximumynlvx88.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = setmaximumynlvx88.write;
        Object obj = null;
        int i4 = 1;
        if (i3 != 0) {
            int i5 = write + 61;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(result);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(result);
            zzw zzwVarRemoteActionCompatParcelizer = provideinsetsvaluescytewk0.RemoteActionCompatParcelizer();
            zzwVarRemoteActionCompatParcelizer.getClass();
            setmaximumynlvx88.write = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(setmaximumynlvx88));
            cancellableContinuationImpl.read();
            cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new RootViewsSpy$Companion$install$1$1(5, setFraction.read));
            if (!zzwVarRemoteActionCompatParcelizer.isComplete()) {
                zzwVarRemoteActionCompatParcelizer.addOnSuccessListener(new accessgetchildSerializerscp(cancellableContinuationImpl, i4));
                zzwVarRemoteActionCompatParcelizer.addOnFailureListener(new getAsClause(cancellableContinuationImpl));
            } else if (!zzwVarRemoteActionCompatParcelizer.isSuccessful()) {
                Exception exception = zzwVarRemoteActionCompatParcelizer.getException();
                exception.getClass();
                cancellableContinuationImpl.resumeWith(new isItemDismissable(exception));
            } else {
                int i7 = write + 113;
                serializer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    cancellableContinuationImpl.resumeWith(zzwVarRemoteActionCompatParcelizer.getResult());
                    obj.hashCode();
                    throw null;
                }
                cancellableContinuationImpl.resumeWith(zzwVarRemoteActionCompatParcelizer.getResult());
            }
            result = cancellableContinuationImpl.getResult();
            if (result == coroutineSingletons) {
                int i8 = write + 61;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return coroutineSingletons;
            }
        }
        result.getClass();
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0048  */
    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:14:0x0055 A[PHI: r5
  0x0055: PHI (r5v8 o.getPostalCode) = (r5v4 o.getPostalCode), (r5v9 o.getPostalCode) binds: [B:8:0x0040, B:5:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0042 A[PHI: r5
  0x0042: PHI (r5v5 o.getPostalCode) = (r5v4 o.getPostalCode), (r5v9 o.getPostalCode) binds: [B:8:0x0040, B:5:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object MediaBrowserCompatMediaItem(Object[] objArr) {
        getPostalCode getpostalcode;
        int i;
        int i2;
        Object obj = objArr[0];
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) objArr[1];
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objArr[2];
        getBirthDateFull getbirthdatefull = (getBirthDateFull) objArr[3];
        int i3 = 4;
        int iIntValue = ((Number) objArr[4]).intValue();
        int i4 = 2 % 2;
        int i5 = write + 27;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1220373486);
            if ((iIntValue & 32) == 0) {
                if (getpostalcode.IconCompatParcelizer(obj)) {
                    int i6 = serializer + 11;
                    write = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                } else {
                    i3 = 2;
                }
                i = i3 | iIntValue;
            } else {
                i = iIntValue;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1220373486);
            if ((iIntValue & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(obj)) {
                    int i8 = serializer + 11;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                } else {
                    i3 = 2;
                }
                i = i3 | iIntValue;
            } else {
                i = iIntValue;
            }
        }
        if ((iIntValue & 48) == 0) {
            i |= 16;
        }
        Object obj2 = null;
        if ((iIntValue & 384) == 0) {
            int i10 = write + 79;
            serializer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                obj2.hashCode();
                throw null;
            }
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i11 = write + 23;
                serializer = i11 % Fields.SpotShadowColor;
                i2 = i11 % 2 == 0 ? 3943 : Fields.RotationX;
            } else {
                i2 = Fields.SpotShadowColor;
            }
            i |= i2;
        }
        if (getpostalcode.write(i & 1, (i & 147) != 146)) {
            int i12 = write + 49;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((iIntValue & 1) == 0 || getpostalcode.PlaybackStateCompat()) {
                accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) getpostalcode.write((getNewPassword) setInternalPaintui_graphics.write);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            getpostalcode.RemoteActionCompatParcelizer();
            boolean z = getpostalcode.read(obj);
            boolean z2 = getpostalcode.read(accessisrendernodecompatiblecp);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z | z2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new getStyleTiuSbCo(accessisrendernodecompatiblecp.getLifecycle());
                getpostalcode.write(objComponentActivity);
            }
            write(accessisrendernodecompatiblecp, (getStyleTiuSbCo) objComponentActivity, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode, i & 896);
            int i14 = write + 29;
            serializer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp2 = accessisrendernodecompatiblecp;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(iIntValue, 9, obj, accessisrendernodecompatiblecp2, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031 A[PHI: r5
  0x0031: PHI (r5v9 o.getPostalCode) = (r5v5 o.getPostalCode), (r5v11 o.getPostalCode) binds: [B:8:0x0024, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[PHI: r5
  0x0026: PHI (r5v6 o.getPostalCode) = (r5v5 o.getPostalCode), (r5v11 o.getPostalCode) binds: [B:8:0x0024, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void RemoteActionCompatParcelizer(Object obj, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i, int i2) {
        getPostalCode getpostalcode;
        int i3;
        int i4;
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp2;
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp3;
        int i5;
        int i6 = 2 % 2;
        int i7 = write + 99;
        serializer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1408314671);
            if ((i & 53) == 0) {
                if (getpostalcode.IconCompatParcelizer(obj)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1408314671);
            if ((i & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(obj)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        }
        if ((i & 48) == 0) {
            int i8 = write + 115;
            int i9 = i8 % Fields.SpotShadowColor;
            serializer = i9;
            int i10 = i8 % 2;
            if ((i2 & 2) == 0) {
                int i11 = i9 + 3;
                write = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    int i12 = 16 / 0;
                    if (getpostalcode.IconCompatParcelizer(accessisrendernodecompatiblecp)) {
                        i5 = 32;
                    } else {
                        i5 = 16;
                    }
                } else if (getpostalcode.IconCompatParcelizer(accessisrendernodecompatiblecp)) {
                    i5 = 32;
                } else {
                    i5 = 16;
                }
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i & 384) == 0) {
            i4 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i4 & 1, (i4 & 147) != 146)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                if ((i2 & 2) != 0) {
                    accessisrendernodecompatiblecp3 = accessisrendernodecompatiblecp;
                    i4 &= -113;
                } else {
                    accessisrendernodecompatiblecp3 = accessisrendernodecompatiblecp;
                }
            } else if ((i2 & 2) != 0) {
                accessisrendernodecompatiblecp3 = (accessisRenderNodeCompatiblecp) getpostalcode.write((getNewPassword) setInternalPaintui_graphics.write);
                i4 &= -113;
            } else {
                accessisrendernodecompatiblecp3 = accessisrendernodecompatiblecp;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            boolean z = getpostalcode.read(obj);
            boolean z2 = getpostalcode.read(accessisrendernodecompatiblecp3);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z | z2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new getStrokeWidth(accessisrendernodecompatiblecp3.getLifecycle());
                getpostalcode.write(objComponentActivity);
            }
            serializer(accessisrendernodecompatiblecp3, (getStrokeWidth) objComponentActivity, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode, (i4 & 896) | ((i4 >> 3) & 14));
            accessisrendernodecompatiblecp2 = accessisrendernodecompatiblecp3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            accessisrendernodecompatiblecp2 = accessisrendernodecompatiblecp;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidAutofillManager(obj, accessisrendernodecompatiblecp2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i, i2, 5);
        }
    }

    public static final void write(Boolean bool, Object obj, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp2;
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp3;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(696924721);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i5 = write + 93;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i7 = write + 61;
            serializer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                throw null;
            }
            if (!getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i3 = Fields.RotationZ;
            } else {
                int i8 = write + 101;
                serializer = i8 % Fields.SpotShadowColor;
                i3 = i8 % 2 == 0 ? 16252 : Fields.CameraDistance;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 1171) != 1170)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0 || getpostalcode.PlaybackStateCompat()) {
                accessisrendernodecompatiblecp3 = (accessisRenderNodeCompatiblecp) getpostalcode.write((getNewPassword) setInternalPaintui_graphics.write);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                accessisrendernodecompatiblecp3 = accessisrendernodecompatiblecp;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            boolean z = getpostalcode.read(bool);
            boolean z2 = getpostalcode.read(obj);
            boolean z3 = getpostalcode.read(accessisrendernodecompatiblecp3);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z | z2 | z3) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new getStrokeWidth(accessisrendernodecompatiblecp3.getLifecycle());
                getpostalcode.write(objComponentActivity);
            }
            serializer(accessisrendernodecompatiblecp3, (getStrokeWidth) objComponentActivity, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode, ((i2 & (-897)) >> 3) & 896);
            accessisrendernodecompatiblecp2 = accessisrendernodecompatiblecp3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            accessisrendernodecompatiblecp2 = accessisrendernodecompatiblecp;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStrokeJoinLxFBmk8(bool, obj, accessisrendernodecompatiblecp2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004c  */
    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    /* JADX WARN: Code duplicated, block: B:14:0x005a A[PHI: r2
  0x005a: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0043, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:9:0x0045 A[PHI: r2
  0x0045: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0043, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void IconCompatParcelizer(StartWorkingNavigationUiModelImpl startWorkingNavigationUiModelImpl, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5 = 2 % 2;
        int i6 = write + 17;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            startWorkingNavigationUiModelImpl.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(515336777);
            if ((i & 65) == 0) {
                if (!getpostalcode.IconCompatParcelizer(startWorkingNavigationUiModelImpl)) {
                    i2 = 2;
                } else {
                    int i7 = serializer + 29;
                    write = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    i2 = 4;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            startWorkingNavigationUiModelImpl.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(515336777);
            if ((i & 6) == 0) {
                if (!getpostalcode.IconCompatParcelizer(startWorkingNavigationUiModelImpl)) {
                    i2 = 2;
                } else {
                    int i9 = serializer + 29;
                    write = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    i2 = 4;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            int i11 = serializer + 55;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                int i13 = serializer + 85;
                write = i13 % Fields.SpotShadowColor;
                i4 = i13 % 2 != 0 ? 22155 : 256;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i3 |= i4;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? 2048 : Fields.RotationZ;
        }
        boolean z2 = false;
        if ((i3 & 1171) != 1170) {
            int i14 = serializer + 19;
            write = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            FragmentActivity fragmentActivityRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
            getQueryContext getquerycontext = startWorkingNavigationUiModelImpl.RemoteActionCompatParcelizer;
            boolean z3 = (i3 & 112) == 32;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer);
            boolean z4 = (i3 & 896) == 256;
            if ((i3 & 7168) == 2048) {
                int i15 = serializer + 125;
                write = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                z2 = true;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z3 | zIconCompatParcelizer | z4 | z2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new q3$$ExternalSyntheticLambda1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, fragmentActivityRemoteActionCompatParcelizer, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, 2);
                getpostalcode.write(objComponentActivity);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 8);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStrokeJoinLxFBmk8(startWorkingNavigationUiModelImpl, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, i, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x011f  */
    public static void RemoteActionCompatParcelizer(getLookaheadDelegate getlookaheaddelegate, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
        Cursor cursorQuery;
        int i = 2 % 2;
        if (getlookaheaddelegate != null) {
            Cursor cursor = null;
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                try {
                    try {
                        boolean zMoveToFirst = cursorQuery.moveToFirst();
                        cursorQuery.close();
                        if (!zMoveToFirst) {
                            sQLiteDatabase.execSQL(str2);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        getlookaheaddelegate.MediaSessionCompatQueueItem.serializer("Error querying for table", str, e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                int i2 = serializer + 39;
                write = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 30 / 0;
                }
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            try {
                HashSet hashSet = new HashSet();
                StringBuilder sb = new StringBuilder(str.length() + 22);
                sb.append("SELECT * FROM ");
                sb.append(str);
                sb.append(" LIMIT 0");
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
                try {
                    Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                    cursorRawQuery.close();
                    for (String str4 : str3.split(",")) {
                        if (!hashSet.remove(str4)) {
                            StringBuilder sb2 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                            sb2.append("Table ");
                            sb2.append(str);
                            sb2.append(" is missing required column: ");
                            sb2.append(str4);
                            throw new SQLiteException(sb2.toString());
                        }
                    }
                    if (strArr != null) {
                        int i4 = serializer + 93;
                        write = i4 % Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                        for (int i6 = 0; i6 < strArr.length; i6 += 2) {
                            if (!hashSet.remove(strArr[i6])) {
                                int i7 = write + 11;
                                serializer = i7 % Fields.SpotShadowColor;
                                int i8 = i7 % 2;
                                sQLiteDatabase.execSQL(strArr[i6 + 1]);
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    getlookaheaddelegate.MediaSessionCompatQueueItem.serializer("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                    return;
                } catch (Throwable th3) {
                    cursorRawQuery.close();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                getlookaheaddelegate.serializer.serializer(str, "Failed to verify columns on table that was just created");
                throw e3;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Monitor must not be null");
    }

    private static /* synthetic */ Object RatingCompat(Object[] objArr) {
        String strRemoteActionCompatParcelizer;
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = serializer + 83;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (iIntValue >= 0) {
            int i5 = i3 + 121;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (iIntValue < iIntValue2) {
                return null;
            }
        }
        if (iIntValue >= 0) {
            int i6 = i3 + 27;
            serializer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (iIntValue2 < 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(iIntValue2, "negative size: "));
                return null;
            }
            strRemoteActionCompatParcelizer = displayIconFromCurrentNodeOrDescendantsWithCursorInBounds.RemoteActionCompatParcelizer("%s (%s) must be less than size (%s)", "index", Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        } else {
            strRemoteActionCompatParcelizer = displayIconFromCurrentNodeOrDescendantsWithCursorInBounds.RemoteActionCompatParcelizer("%s (%s) must not be negative", "index", Integer.valueOf(iIntValue));
        }
        throw new IndexOutOfBoundsException(strRemoteActionCompatParcelizer);
    }

    public static /* synthetic */ Object read(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i6) | i7);
        int i9 = i | i8 | (~(i5 | i6));
        int i10 = (~(i6 | i)) | (~(i7 | i6)) | (~(i7 | i));
        int i11 = i + i5 + i2 + (1351532378 * i4) + (1237199896 * i3);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i) + 1314914304 + ((-491389116) * i5) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i2) + ((-1818230784) * i4) + ((-914358272) * i3) + ((-2051670016) * i12);
        int i14 = ((i * 406040238) - 634933780) + (i5 * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i2 * 406039561) + (i4 * 1283666474) + (i3 * 1712827608) + (i12 * (-77201408));
        switch (i13 + (i14 * i14 * 1831469056)) {
            case 1:
                return read(objArr);
            case 2:
                return serializer(objArr);
            case 3:
                return IconCompatParcelizer(objArr);
            case 4:
                return write(objArr);
            case 5:
                return RatingCompat(objArr);
            case 6:
                return MediaDescriptionCompat(objArr);
            case 7:
                return MediaSessionCompatQueueItem(objArr);
            case 8:
                int iIntValue = ((Number) objArr[0]).intValue();
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i15 = 2 % 2;
                if (iIntValue2 > Integer.MIN_VALUE) {
                    return new ensureSubscribedToInAppMessageEventslambda7(iIntValue, iIntValue2 - 1, 1);
                }
                int i16 = write + 49;
                serializer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = ensureSubscribedToInAppMessageEventslambda7.IconCompatParcelizer;
                ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda8 = ensureSubscribedToInAppMessageEventslambda7.IconCompatParcelizer;
                int i18 = write + 31;
                serializer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                return ensuresubscribedtoinappmessageeventslambda8;
            case 9:
                return MediaBrowserCompatMediaItem(objArr);
            case 10:
                byte bByteValue = ((Byte) objArr[0]).byteValue();
                int i20 = 2 % 2;
                if (bByteValue > -65) {
                    int i21 = write + 83;
                    serializer = i21 % Fields.SpotShadowColor;
                    return i21 % 2 != 0;
                }
                int i22 = serializer + 53;
                write = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                return false;
            default:
                return RemoteActionCompatParcelizer(objArr);
        }
    }

    public static void serializer(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        int iWrite = BackspaceCommand.write();
        read(1259777664, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -1259777659, iWrite);
    }

    public static ensureSubscribedToInAppMessageEventslambda7 RemoteActionCompatParcelizer(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        int iWrite = BackspaceCommand.write();
        return (ensureSubscribedToInAppMessageEventslambda7) read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite);
    }

    public static final isRoot RatingCompat(String str) {
        int iWrite = BackspaceCommand.write();
        int iWrite2 = BackspaceCommand.write();
        int iWrite3 = BackspaceCommand.write();
        return (isRoot) read(220732900, iWrite2, BackspaceCommand.write(), new Object[]{str}, iWrite3, -220732894, iWrite);
    }

    public static int write(long j) {
        Object[] objArr = {Long.valueOf(j)};
        int iWrite = BackspaceCommand.write();
        return ((Integer) read(340022501, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -340022497, iWrite)).intValue();
    }

    public static final isRoot MediaDescriptionCompat(String str) {
        int iWrite = BackspaceCommand.write();
        int iWrite2 = BackspaceCommand.write();
        int iWrite3 = BackspaceCommand.write();
        return (isRoot) read(-1579077835, iWrite2, BackspaceCommand.write(), new Object[]{str}, iWrite3, 1579077836, iWrite);
    }

    public static boolean serializer(byte b) {
        Object[] objArr = {Byte.valueOf(b)};
        int iWrite = BackspaceCommand.write();
        return ((Boolean) read(2010532887, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -2010532877, iWrite)).booleanValue();
    }

    public static final long RemoteActionCompatParcelizer(long j) {
        Object[] objArr = {Long.valueOf(j)};
        int iWrite = BackspaceCommand.write();
        return ((Long) read(-903966784, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), 903966784, iWrite)).longValue();
    }

    public static InvocationHandler write() {
        int iWrite = BackspaceCommand.write();
        int iWrite2 = BackspaceCommand.write();
        int iWrite3 = BackspaceCommand.write();
        return (InvocationHandler) read(-1232401737, iWrite2, BackspaceCommand.write(), new Object[0], iWrite3, 1232401744, iWrite);
    }

    public static boolean write(String str, List list) {
        int iWrite = BackspaceCommand.write();
        int iWrite2 = BackspaceCommand.write();
        int iWrite3 = BackspaceCommand.write();
        return ((Boolean) read(-1658170017, iWrite2, BackspaceCommand.write(), new Object[]{str, list}, iWrite3, 1658170020, iWrite)).booleanValue();
    }

    public static final isRoot serializer(String str) {
        int iWrite = BackspaceCommand.write();
        int iWrite2 = BackspaceCommand.write();
        int iWrite3 = BackspaceCommand.write();
        return (isRoot) read(-293359906, iWrite2, BackspaceCommand.write(), new Object[]{str}, iWrite3, 293359908, iWrite);
    }

    public static final void read(Object obj, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        Object[] objArr = {obj, accessisrendernodecompatiblecp, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getbirthdatefull, Integer.valueOf(i)};
        int iWrite = BackspaceCommand.write();
        read(980236944, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -980236935, iWrite);
    }
}
