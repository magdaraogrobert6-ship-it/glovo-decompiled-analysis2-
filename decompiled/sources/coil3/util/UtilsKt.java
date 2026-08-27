package coil3.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.sqlite.SQLite;
import androidx.work.impl.WorkDatabase;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.hg$$ExternalSyntheticLambda5;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.request.NullRequestDataException;
import com.braze.Constants;
import com.deliveryhero.fwf_cache.UtilKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.play.core.appupdate.zzz;
import com.mapbox.geojson.Point;
import com.mapbox.navigation.core.telemetry.events.FeedbackEvent;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import io.sentry.SentryBaseEvent;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.metrics.MetricsBatchProcessor;
import io.sentry.okhttp.RemoteActionCompatParcelizer;
import io.sentry.util.network.NetworkBody;
import io.sentry.util.network.serializer;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;
import kotlin.TuplesKt;
import kotlin.enums.EnumEntriesList;
import o.AndroidContentCaptureManagerCompanion;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.DefaultInAppMessageHtmlViewFactory;
import o.DragAndDropTargetModifierNode;
import o.DrawableTransformation;
import o.GifDrawableTransformation;
import o.ImageBitmapConfigCompanion;
import o.ImageHeaderParserImageType;
import o.ImageShaderF49vj9s;
import o.ImageShaderF49vj9sdefault;
import o.ItemTouchHelperAdapter;
import o.ModalBottomSheetDialogsW7UJKQ;
import o.RegistryMissingComponentException;
import o.RequestBuilder;
import o.Rstyleable;
import o.SecureFlagPolicy;
import o.SecureFlagPolicy_androidKtWhenMappings;
import o.ShaderKt;
import o.TransformGestureDetectorKtdetectTransformGestures2;
import o.UncheckedColordefault;
import o._get_messageWebView_lambda1;
import o.accessgetNumPad4cp;
import o.accessgetNumPadDeletecp;
import o.accessgetScp;
import o.accessrewindjd;
import o.addOnNewIntentListener;
import o.equalString;
import o.getBirthDateFull;
import o.getDistanceSquaredimpl;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getOpenHelper;
import o.getPostalCode;
import o.getQueryParameterslambda2;
import o.getUnregisteredInAppMessageannotations;
import o.graphicsLayerpANQ8Wgdefault;
import o.hideCurrentlyDisplayingInAppMessage;
import o.minusMKHz9U;
import o.obtainShadowContext;
import o.onContentCardDismissed;
import o.onDrawBehind;
import o.onDrawWithContent;
import o.onOtherUrlActionlambda2;
import o.performMeasureDjhGOtQ;
import o.r8lambda2Ry1yAKqA4iCisjdmcRrZcmPec;
import o.r8lambda6UXcBXySJ5vMglOROvN5C2o2M;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdadeOzq815xUUwmlLYYvm_QV79QY;
import o.r8lambdakcTilwmporjFCAWe8ASdQv1Ks;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.resetMessageMarginslambda00;
import o.scheduleInvalidationForOwner;
import o.setContentDrawScopeui;
import o.setInAppMessageImageViewAttributes;
import o.setRotationY;
import o.translateimpldefault;
import o.wouldPushPermissionPromptDisplaylambda2;
import o.wouldPushPermissionPromptDisplaylambda5;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes.dex */
public abstract class UtilsKt {
    public static zzz IconCompatParcelizer = null;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = (~(i | i4)) | i3;
        int i8 = i4 | i | i3;
        int i9 = ~i;
        int i10 = i + i3 + i2 + ((-421447895) * i5) + ((-859425246) * i6);
        int i11 = i10 * i10;
        int i12 = (i * (-629045104)) + 1817116672 + ((-629045104) * i3) + (i7 * (-1407420559)) + ((-1407420559) * i8) + (1407420559 * i9) + ((-2036465664) * i2) + ((-2125594624) * i5) + (888930304 * i6) + (441384960 * i11);
        int i13 = (i * 1303038832) + 2077918271 + (i3 * 1303038832) + (i7 * (-49)) + (i8 * (-49)) + (i9 * 49) + (i2 * 1303038783) + (i5 * 1583617559) + (i6 * (-1102559138)) + (i11 * 510722048);
        int i14 = i12 + (i13 * i13 * 607191040);
        if (i14 != 1) {
            if (i14 == 2) {
                return read(objArr);
            }
            if (i14 != 3) {
                return i14 != 4 ? write(objArr) : RemoteActionCompatParcelizer(objArr);
            }
            return IconCompatParcelizer(objArr);
        }
        ComposeView composeView = (ComposeView) objArr[0];
        final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        final DragAndDropTargetModifierNode dragAndDropTargetModifierNode = (DragAndDropTargetModifierNode) objArr[2];
        int i15 = 2 % 2;
        composeView.getClass();
        composeView.setContent(new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getRequiredAutoMigrationSpecClasses
            private static int RemoteActionCompatParcelizer = 0;
            private static int serializer = 1;

            /* JADX WARN: Code duplicated, block: B:10:0x0035 A[PHI: r6 r7
  0x0035: PHI (r6v6 o.getBirthDateFull) = (r6v1 o.getBirthDateFull), (r6v7 o.getBirthDateFull) binds: [B:8:0x0028, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r7v11 int) = (r7v2 int), (r7v13 int) binds: [B:8:0x0028, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:9:0x002a A[PHI: r6 r7
  0x002a: PHI (r6v2 o.getBirthDateFull) = (r6v1 o.getBirthDateFull), (r6v7 o.getBirthDateFull) binds: [B:8:0x0028, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x002a: PHI (r7v3 int) = (r7v2 int), (r7v13 int) binds: [B:8:0x0028, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) {
                getBirthDateFull getbirthdatefull;
                int iIntValue;
                boolean z;
                int i16 = 2 % 2;
                int i17 = RemoteActionCompatParcelizer + 79;
                serializer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    getbirthdatefull = (getBirthDateFull) obj;
                    iIntValue = ((Integer) obj2).intValue();
                    if ((iIntValue & 3) != 3) {
                        int i18 = serializer + 117;
                        RemoteActionCompatParcelizer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                        z = true;
                    } else {
                        int i20 = RemoteActionCompatParcelizer + 23;
                        serializer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i21 = i20 % 2;
                        z = false;
                    }
                } else {
                    getbirthdatefull = (getBirthDateFull) obj;
                    iIntValue = ((Integer) obj2).intValue();
                    if ((iIntValue & 3) != 2) {
                        int i110 = serializer + 117;
                        RemoteActionCompatParcelizer = i110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i111 = i110 % 2;
                        z = true;
                    } else {
                        int i22 = RemoteActionCompatParcelizer + 23;
                        serializer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i23 = i22 % 2;
                        z = false;
                    }
                }
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (getpostalcode.write(iIntValue & 1, z)) {
                    int i24 = RemoteActionCompatParcelizer + 33;
                    serializer = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i25 = i24 % 2;
                    coil3.util.UtilsKt.serializer(zBooleanValue, dragAndDropTargetModifierNode, getpostalcode, 0);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createFromParcel.INSTANCE;
            }
        }, true, 1468913189));
        int i16 = read + 9;
        RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
        int i17 = i16 % 2;
        return null;
    }

    public abstract wouldPushPermissionPromptDisplaylambda2 read();

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        r8lambda6UXcBXySJ5vMglOROvN5C2o2M r8lambda6uxcbxysj5vmglorovn5c2o2m;
        List list;
        String str = (String) objArr[0];
        Logger logger = r8lambda6UXcBXySJ5vMglOROvN5C2o2M.RemoteActionCompatParcelizer;
        synchronized (r8lambda6UXcBXySJ5vMglOROvN5C2o2M.class) {
            if (r8lambda6UXcBXySJ5vMglOROvN5C2o2M.write == null) {
                List<wouldPushPermissionPromptDisplaylambda5> listRemoteActionCompatParcelizer = r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.RemoteActionCompatParcelizer(wouldPushPermissionPromptDisplaylambda5.class, r8lambda6UXcBXySJ5vMglOROvN5C2o2M.RemoteActionCompatParcelizer(), wouldPushPermissionPromptDisplaylambda5.class.getClassLoader(), new r8lambdakcTilwmporjFCAWe8ASdQv1Ks(7));
                r8lambda6UXcBXySJ5vMglOROvN5C2o2M.write = new r8lambda6UXcBXySJ5vMglOROvN5C2o2M();
                for (wouldPushPermissionPromptDisplaylambda5 wouldpushpermissionpromptdisplaylambda5 : listRemoteActionCompatParcelizer) {
                    r8lambda6UXcBXySJ5vMglOROvN5C2o2M.RemoteActionCompatParcelizer.fine("Service loader found " + wouldpushpermissionpromptdisplaylambda5);
                    r8lambda6UXcBXySJ5vMglOROvN5C2o2M r8lambda6uxcbxysj5vmglorovn5c2o2m2 = r8lambda6UXcBXySJ5vMglOROvN5C2o2M.write;
                    synchronized (r8lambda6uxcbxysj5vmglorovn5c2o2m2) {
                        wouldpushpermissionpromptdisplaylambda5.getClass();
                        r8lambda6uxcbxysj5vmglorovn5c2o2m2.IconCompatParcelizer.add(wouldpushpermissionpromptdisplaylambda5);
                    }
                }
                r8lambda6UXcBXySJ5vMglOROvN5C2o2M r8lambda6uxcbxysj5vmglorovn5c2o2m3 = r8lambda6UXcBXySJ5vMglOROvN5C2o2M.write;
                synchronized (r8lambda6uxcbxysj5vmglorovn5c2o2m3) {
                    ArrayList arrayList = new ArrayList(r8lambda6uxcbxysj5vmglorovn5c2o2m3.IconCompatParcelizer);
                    Collections.sort(arrayList, Collections.reverseOrder(new r8lambda2Ry1yAKqA4iCisjdmcRrZcmPec()));
                    r8lambda6uxcbxysj5vmglorovn5c2o2m3.serializer = Collections.unmodifiableList(arrayList);
                }
            }
            r8lambda6uxcbxysj5vmglorovn5c2o2m = r8lambda6UXcBXySJ5vMglOROvN5C2o2M.write;
        }
        synchronized (r8lambda6uxcbxysj5vmglorovn5c2o2m) {
            list = r8lambda6uxcbxysj5vmglorovn5c2o2m.serializer;
        }
        if ((list.isEmpty() ? null : (wouldPushPermissionPromptDisplaylambda5) list.get(0)) != null) {
            return new Rstyleable(str);
        }
        throw new RuntimeException() { // from class: io.grpc.ManagedChannelProvider$ProviderNotFoundException
        };
    }

    public static final int RemoteActionCompatParcelizer(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = read + 89;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        return i4 % 2 == 0 ? (i % i2) & 11 : (i >> i2) & 31;
    }

    public static final int read(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = read + 13;
        int i5 = i4 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i5;
        int i6 = i4 % 2;
        int i7 = (i >> i2) & 31;
        int i8 = i5 + 75;
        read = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return i7;
    }

    public static void IconCompatParcelizer(Object obj, String str) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 95;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (obj == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(str);
            return;
        }
        int i4 = i2 + 75;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r4 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r4 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r2 = r2 + 115;
        coil3.util.UtilsKt.read = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void RemoteActionCompatParcelizer(java.lang.String r3, boolean r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = coil3.util.UtilsKt.read
            int r1 = r1 + 111
            int r2 = r1 % 128
            coil3.util.UtilsKt.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L15
            r1 = 70
            int r1 = r1 / 0
            if (r4 == 0) goto L1f
            goto L17
        L15:
            if (r4 == 0) goto L1f
        L17:
            int r2 = r2 + 115
            int r3 = r2 % 128
            coil3.util.UtilsKt.read = r3
            int r2 = r2 % r0
            return
        L1f:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.util.UtilsKt.RemoteActionCompatParcelizer(java.lang.String, boolean):void");
    }

    public static void read(int i) {
        int i2 = 2 % 2;
        if (i >= 0) {
            int i3 = RemoteActionCompatParcelizer + 93;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            DrawableTransformation.write();
            int i5 = RemoteActionCompatParcelizer + 115;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
    }

    public static void serializer(boolean z) {
        int i = 2 % 2;
        int i2 = read + 1;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (z) {
            return;
        }
        DrawableTransformation.write();
        int i3 = read + 73;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public static void IconCompatParcelizer(String str, boolean z) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 59;
        read = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (!z) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str);
            return;
        }
        int i4 = i2 + 69;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public accessgetScp RemoteActionCompatParcelizer(Context context, Looper looper, MetricsBatchProcessor metricsBatchProcessor, Object obj, zabk zabkVar, zabk zabkVar2) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public static final EnumEntriesList read(Enum[] enumArr) {
        int i = 2 % 2;
        enumArr.getClass();
        EnumEntriesList enumEntriesList = new EnumEntriesList(enumArr);
        int i2 = RemoteActionCompatParcelizer + 17;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 7 / 0;
        }
        return enumEntriesList;
    }

    public accessgetScp IconCompatParcelizer(Context context, Looper looper, MetricsBatchProcessor metricsBatchProcessor, Object obj, accessgetNumPad4cp accessgetnumpad4cp, accessgetNumPadDeletecp accessgetnumpaddeletecp) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return RemoteActionCompatParcelizer(context, looper, metricsBatchProcessor, obj, (zabk) accessgetnumpad4cp, (zabk) accessgetnumpaddeletecp);
        }
        RemoteActionCompatParcelizer(context, looper, metricsBatchProcessor, obj, (zabk) accessgetnumpad4cp, (zabk) accessgetnumpaddeletecp);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        int i = 2 % 2;
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(objArr[0].getClass().getSimpleName());
        int i2 = RemoteActionCompatParcelizer + 49;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdalmkbrrgswwtv97obrsj7trj7ai;
        }
        throw null;
    }

    public static String RemoteActionCompatParcelizer(setInAppMessageImageViewAttributes setinappmessageimageviewattributes) {
        int i = 2 % 2;
        int i2 = read + 101;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setinappmessageimageviewattributes.getClass();
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        String strIconCompatParcelizer = ImageHeaderParserImageType.serializer(setinappmessageimageviewattributes.url).read("MD5").IconCompatParcelizer();
        int i4 = read + 41;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strIconCompatParcelizer;
        }
        throw null;
    }

    public static final TransformGestureDetectorKtdetectTransformGestures2 serializer(TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2) {
        int i = 2 % 2;
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2RemoteActionCompatParcelizer = transformGestureDetectorKtdetectTransformGestures2.RemoteActionCompatParcelizer();
        int iIconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures2RemoteActionCompatParcelizer.IconCompatParcelizer();
        int i2 = 0;
        while (i2 < iIconCompatParcelizer) {
            transformGestureDetectorKtdetectTransformGestures2RemoteActionCompatParcelizer.write(transformGestureDetectorKtdetectTransformGestures2.write(i2), i2);
            i2++;
            int i3 = read + 3;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        int i5 = read + 11;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return transformGestureDetectorKtdetectTransformGestures2RemoteActionCompatParcelizer;
    }

    public static void write(ComponentActivity componentActivity, DragAndDropTargetModifierNode dragAndDropTargetModifierNode) {
        int i = 2 % 2;
        componentActivity.getClass();
        addOnNewIntentListener.RemoteActionCompatParcelizer(componentActivity, new DragAndDropTargetModifierNode(new ModalBottomSheetDialogsW7UJKQ(dragAndDropTargetModifierNode, 2), true, 770780347));
        int i2 = read + 43;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public static final getUnregisteredInAppMessageannotations read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        int i = 2 % 2;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        if (!(!(r8lambda92m0p9sit5uf70mvjf4rwmruda instanceof DefaultInAppMessageHtmlViewFactory))) {
            return ((DefaultInAppMessageHtmlViewFactory) r8lambda92m0p9sit5uf70mvjf4rwmruda).read;
        }
        if (!(r8lambda92m0p9sit5uf70mvjf4rwmruda instanceof onOtherUrlActionlambda2)) {
            int i2 = RemoteActionCompatParcelizer + 45;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = read + 17;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return read(((onOtherUrlActionlambda2) r8lambda92m0p9sit5uf70mvjf4rwmruda).IconCompatParcelizer);
        }
        int i5 = 40 / 0;
        return read(((onOtherUrlActionlambda2) r8lambda92m0p9sit5uf70mvjf4rwmruda).IconCompatParcelizer);
    }

    public static final FragmentActivity RemoteActionCompatParcelizer(Context context) {
        int i = 2 % 2;
        int i2 = read + 39;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            context.getClass();
            throw null;
        }
        context.getClass();
        while (context instanceof ContextWrapper) {
            if (context instanceof FragmentActivity) {
                return (FragmentActivity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            context.getClass();
            int i3 = RemoteActionCompatParcelizer + 11;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("This should be called in the context of an FragmentActivity");
        return null;
    }

    public static final Activity write(Context context) {
        int i = 2 % 2;
        int i2 = read + 15;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        context.getClass();
        while (context instanceof ContextWrapper) {
            int i4 = read + 37;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                boolean z = context instanceof Activity;
                throw null;
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            context.getClass();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("This should be called in the context of an Activity");
        return null;
    }

    public static onDrawBehind RemoteActionCompatParcelizer(obtainShadowContext obtainshadowcontext) {
        int i = 2 % 2;
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = obtainshadowcontext.getClass();
        try {
            Object objSerializer = obtainshadowcontext.serializer(ondrawwithcontent);
            if (objSerializer == null) {
                int i2 = RemoteActionCompatParcelizer + 11;
                read = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return ondrawbehind;
            }
            int i4 = RemoteActionCompatParcelizer + 49;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            ondrawwithcontent.RemoteActionCompatParcelizer = objSerializer;
            return ondrawbehind;
        } catch (Exception e) {
            ondrawbehind.write(e);
            return ondrawbehind;
        }
    }

    public static final int write(UncheckedColordefault uncheckedColordefault, String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            uncheckedColordefault.getClass();
            read(uncheckedColordefault, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        uncheckedColordefault.getClass();
        int i3 = read(uncheckedColordefault, str);
        if (i3 >= 0) {
            int i4 = read + 41;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return i3;
        }
        int iRemoteActionCompatParcelizer = uncheckedColordefault.RemoteActionCompatParcelizer();
        ArrayList arrayList = new ArrayList(iRemoteActionCompatParcelizer);
        for (int i6 = 0; i6 < iRemoteActionCompatParcelizer; i6++) {
            int i7 = read + 73;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            arrayList.add(uncheckedColordefault.RemoteActionCompatParcelizer(i6));
        }
        DrawableTransformation.serializer("Column '", str, "' does not exist. Available columns: [", onContentCardDismissed.IconCompatParcelizer(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static final int read(UncheckedColordefault uncheckedColordefault, String str) {
        int i = 2 % 2;
        int i2 = read + 57;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        uncheckedColordefault.getClass();
        int iRemoteActionCompatParcelizer = uncheckedColordefault.RemoteActionCompatParcelizer();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= iRemoteActionCompatParcelizer) {
                i5 = -1;
                break;
            }
            if (str.equals(uncheckedColordefault.RemoteActionCompatParcelizer(i5))) {
                break;
            }
            i5++;
        }
        if (i5 >= 0) {
            int i6 = RemoteActionCompatParcelizer + 43;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return i5;
        }
        String strM = m1$$ExternalSyntheticOutline0.m('`', "`", str);
        int iRemoteActionCompatParcelizer2 = uncheckedColordefault.RemoteActionCompatParcelizer();
        while (true) {
            if (i4 >= iRemoteActionCompatParcelizer2) {
                i4 = -1;
                break;
            }
            if (strM.equals(uncheckedColordefault.RemoteActionCompatParcelizer(i4))) {
                int i8 = RemoteActionCompatParcelizer + 5;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    break;
                }
                int i9 = 5 % 3;
                break;
            }
            i4++;
        }
        if (i4 >= 0) {
            int i10 = RemoteActionCompatParcelizer + 59;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                return i4;
            }
            throw null;
        }
        int i11 = read + 121;
        RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
        if (i11 % 2 != 0) {
            return -1;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[PHI: r1
  0x0059: PHI (r1v7 o.accessrewindjd) = (r1v6 o.accessrewindjd), (r1v13 o.accessrewindjd) binds: [B:10:0x0032, B:12:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    public static final ImageShaderF49vj9s write(ShaderKt shaderKt, Throwable th) {
        accessrewindjd accessrewindjdVar;
        int i = 2 % 2;
        if (!(th instanceof NullRequestDataException)) {
            accessrewindjdVar = (accessrewindjd) shaderKt.MediaDescriptionCompat.invoke(shaderKt);
            if (accessrewindjdVar == null) {
                accessrewindjdVar = (accessrewindjd) shaderKt.IconCompatParcelizer.serializer.invoke(shaderKt);
            }
        } else {
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = shaderKt.MediaMetadataCompat;
            ImageShaderF49vj9sdefault imageShaderF49vj9sdefault = shaderKt.IconCompatParcelizer;
            accessrewindjd accessrewindjdVar2 = (accessrewindjd) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(shaderKt);
            if (accessrewindjdVar2 == null) {
                accessrewindjdVar2 = (accessrewindjd) imageShaderF49vj9sdefault.MediaMetadataCompat.invoke(shaderKt);
            }
            if (accessrewindjdVar2 == null) {
                int i2 = RemoteActionCompatParcelizer + 1;
                read = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                accessrewindjdVar2 = (accessrewindjd) shaderKt.MediaDescriptionCompat.invoke(shaderKt);
                if (accessrewindjdVar2 == null) {
                    int i4 = RemoteActionCompatParcelizer + 33;
                    read = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    accessrewindjdVar = (accessrewindjd) imageShaderF49vj9sdefault.serializer.invoke(shaderKt);
                } else {
                    accessrewindjdVar = accessrewindjdVar2;
                }
            } else {
                accessrewindjdVar = accessrewindjdVar2;
            }
        }
        return new ImageShaderF49vj9s(accessrewindjdVar, shaderKt, th);
    }

    public static void serializer(String str, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer;
        int i6 = i5 + 91;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        }
        int i8 = i5 + 91;
        read = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        if (i <= i3) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        resetMessageMarginslambda00 resetmessagemarginslambda00 = (resetMessageMarginslambda00) objArr[0];
        int i = 2 % 2;
        int iRemoteActionCompatParcelizer = resetmessagemarginslambda00.RemoteActionCompatParcelizer();
        TreeSet treeSet = null;
        int i2 = 0;
        while (i2 < iRemoteActionCompatParcelizer) {
            if ("Vary".equalsIgnoreCase(resetmessagemarginslambda00.serializer(i2))) {
                String str = resetmessagemarginslambda00.read(i2);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    comparator.getClass();
                    treeSet = new TreeSet(comparator);
                }
                Iterator it = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(str, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(hideCurrentlyDisplayingInAppMessage.read((CharSequence) it.next()).toString());
                }
            }
            i2++;
            int i3 = read + 57;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        if (treeSet == null) {
            return ItemTouchHelperAdapter.serializer;
        }
        int i5 = read + 115;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return treeSet;
    }

    public static boolean inRing(Point point, List list) {
        boolean z;
        int i = 2 % 2;
        int size = list.size() - 1;
        boolean z2 = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            double dLongitude = ((Point) list.get(i2)).longitude();
            double dLatitude = ((Point) list.get(i2)).latitude();
            double dLongitude2 = ((Point) list.get(size)).longitude();
            double dLatitude2 = ((Point) list.get(size)).latitude();
            if (dLatitude > point.latitude()) {
                int i3 = RemoteActionCompatParcelizer + 21;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z != (dLatitude2 > point.latitude()) && point.longitude() < (((point.latitude() - dLatitude) * (dLongitude2 - dLongitude)) / (dLatitude2 - dLatitude)) + dLongitude) {
                int i5 = read;
                int i6 = i5 + 55;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    z2 = !z2;
                }
                int i7 = i5 + 97;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
            size = i2;
        }
        return z2;
    }

    public static getDistanceSquaredimpl IconCompatParcelizer(Context context) {
        ProviderInfo providerInfo;
        scheduleInvalidationForOwner scheduleinvalidationforowner;
        int i = 2 % 2;
        PackageManager packageManager = context.getPackageManager();
        IconCompatParcelizer(packageManager, "Package manager required to locate emoji font provider");
        int i2 = 0;
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null) {
                int i3 = read + 57;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                ApplicationInfo applicationInfo = providerInfo.applicationInfo;
                if (applicationInfo != null) {
                    int i5 = read + 91;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        int i6 = applicationInfo.flags;
                        break;
                    }
                    if ((applicationInfo.flags & 1) == 1) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (providerInfo == null) {
            int i7 = read + 85;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            scheduleinvalidationforowner = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                int length = signatureArr.length;
                int i9 = RemoteActionCompatParcelizer + 41;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                while (i2 < length) {
                    int i11 = RemoteActionCompatParcelizer + 9;
                    read = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 != 0) {
                        arrayList.add(signatureArr[i2].toByteArray());
                        i2 += 18;
                    } else {
                        arrayList.add(signatureArr[i2].toByteArray());
                        i2++;
                    }
                }
                scheduleinvalidationforowner = new scheduleInvalidationForOwner(str, str2, "emojicompat-emoji-font", null, null, Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                SentryLogcatAdapter.serializer(e);
                int i12 = read + 85;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                scheduleinvalidationforowner = null;
            }
        }
        if (scheduleinvalidationforowner == null) {
            return null;
        }
        return new getDistanceSquaredimpl(new minusMKHz9U(context, scheduleinvalidationforowner));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:14:0x0038 A[PHI: r9
  0x0038: PHI (r9v5 o.getPostalCode) = (r9v1 o.getPostalCode), (r9v6 o.getPostalCode) binds: [B:8:0x0022, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r9
  0x0024: PHI (r9v2 o.getPostalCode) = (r9v1 o.getPostalCode), (r9v6 o.getPostalCode) binds: [B:8:0x0022, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void serializer(boolean z, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        boolean z2;
        Object obj;
        int i4 = 2 % 2;
        int i5 = read + 93;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1149037724);
            if ((i & 36) == 0) {
                int i6 = RemoteActionCompatParcelizer + 35;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (getpostalcode.write(z)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1149037724);
            if ((i & 6) == 0) {
                int i8 = RemoteActionCompatParcelizer + 35;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (getpostalcode.write(z)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        int i10 = 1;
        if ((i & 48) == 0) {
            i3 |= !(getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ^ true) ? 32 : 16;
        }
        int i11 = 0;
        if ((i3 & 19) != 18) {
            int i12 = read + 107;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (!getpostalcode.write(i3 & 1, z2)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            getpostalcode.serializer(418661302);
            if (!z && (((Configuration) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalConfiguration())).uiMode & 48) == 32) {
                int i14 = RemoteActionCompatParcelizer + 49;
                read = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    obj = SecureFlagPolicy.getPopupTheme;
                    int i15 = 39 / 0;
                } else {
                    obj = SecureFlagPolicy.getPopupTheme;
                }
            } else {
                obj = SecureFlagPolicy_androidKtWhenMappings.setWindowTitle;
            }
            getpostalcode.IconCompatParcelizer(false);
            AndroidContentCaptureManagerCompanion.read(performMeasureDjhGOtQ.RemoteActionCompatParcelizer.write(obj), ExtrasKt.write(539459548, new equalString(dragAndDropTargetModifierNode, i10), getpostalcode), getpostalcode, 56);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getOpenHelper(i, i11, dragAndDropTargetModifierNode, z);
            int i16 = RemoteActionCompatParcelizer + 5;
            read = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
        }
    }

    public static r8lambdadeOzq815xUUwmlLYYvm_QV79QY write(Object obj, Long l, boolean z, serializer serializerVar, List list, ActivityLifecycleIntegration$$ExternalSyntheticLambda1 activityLifecycleIntegration$$ExternalSyntheticLambda1) {
        NetworkBody networkBody;
        LinkedHashMap linkedHashMap;
        int i = 2 % 2;
        Object obj2 = null;
        if (z) {
            networkBody = serializerVar.read(obj);
            int i2 = RemoteActionCompatParcelizer + 101;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            networkBody = null;
        }
        if (activityLifecycleIntegration$$ExternalSyntheticLambda1.RemoteActionCompatParcelizer != 25) {
            _get_messageWebView_lambda1 _get_messagewebview_lambda1 = (_get_messageWebView_lambda1) obj;
            _get_messagewebview_lambda1.getClass();
            linkedHashMap = RemoteActionCompatParcelizer.read(_get_messagewebview_lambda1.headers);
        } else {
            r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = (r8lambday113fDFTSR5e4PZj6XsSXLtpL60) obj;
            r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
            linkedHashMap = RemoteActionCompatParcelizer.read(r8lambday113fdftsr5e4pzj6xssxltpl60.headers);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                int i4 = RemoteActionCompatParcelizer + 35;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    hashSet.add(str.toLowerCase(Locale.ROOT));
                    obj2.hashCode();
                    throw null;
                }
                hashSet.add(str.toLowerCase(Locale.ROOT));
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (!(!it2.hasNext())) {
            int i5 = read + 117;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            Map.Entry entry = (Map.Entry) it2.next();
            if (hashSet.contains(((String) entry.getKey()).toLowerCase(Locale.ROOT))) {
                linkedHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return new r8lambdadeOzq815xUUwmlLYYvm_QV79QY(l, networkBody, linkedHashMap2, 13);
    }

    private static /* synthetic */ Object write(Object[] objArr) throws IOException {
        RegistryMissingComponentException registryMissingComponentException;
        long j;
        GifDrawableTransformation gifDrawableTransformation = (GifDrawableTransformation) objArr[0];
        int i = 2 % 2;
        int i2 = read + 119;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        try {
            if (i2 % 2 == 0) {
                registryMissingComponentException = gifDrawableTransformation.bufferField;
                gifDrawableTransformation.MediaMetadataCompat(0L);
                j = 1;
            } else {
                registryMissingComponentException = gifDrawableTransformation.bufferField;
                gifDrawableTransformation.MediaMetadataCompat(1L);
                j = 0;
            }
            while (true) {
                long j2 = j + 1;
                if (gifDrawableTransformation.write(j2)) {
                    int i3 = read + 97;
                    RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    byte bIconCompatParcelizer = registryMissingComponentException.IconCompatParcelizer(j);
                    if (bIconCompatParcelizer < 48 || bIconCompatParcelizer > 57) {
                        if (j == 0) {
                            int i5 = read + 119;
                            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                            int i6 = i5 % 2;
                            if (bIconCompatParcelizer != 45) {
                            }
                        }
                        if (j == 0) {
                            TuplesKt.RemoteActionCompatParcelizer(16);
                            String string = Integer.toString(bIconCompatParcelizer, 16);
                            string.getClass();
                            throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
                        }
                    }
                    int i7 = RemoteActionCompatParcelizer + 53;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    j = j2;
                }
                long jMediaSessionCompatToken = registryMissingComponentException.MediaSessionCompatToken();
                String strSerializer = gifDrawableTransformation.serializer(Long.MAX_VALUE);
                if (jMediaSessionCompatToken >= 0 && jMediaSessionCompatToken <= 2147483647L) {
                    int i9 = read + 115;
                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    if (strSerializer.length() <= 0) {
                        return Integer.valueOf((int) jMediaSessionCompatToken);
                    }
                }
                throw new IOException("expected an int but was \"" + jMediaSessionCompatToken + strSerializer + '\"');
            }
        } catch (NumberFormatException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer(e.getMessage());
            return 0;
        }
    }

    public static final void read(WorkDatabase workDatabase, graphicsLayerpANQ8Wgdefault graphicslayerpanq8wgdefault, ImageBitmapConfigCompanion imageBitmapConfigCompanion) {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 63;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        workDatabase.getClass();
        graphicslayerpanq8wgdefault.getClass();
        ArrayList arrayList = (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new ImageBitmapConfigCompanion[]{imageBitmapConfigCompanion}}, getQueryParameterslambda2.serializer(), 866125100, getQueryParameterslambda2.serializer());
        int i5 = 0;
        while (true) {
            int i6 = 1;
            Object obj = null;
            if (!(!arrayList.isEmpty())) {
                if (i5 == 0) {
                    return;
                }
                int iIntValue = ((Number) TuplesKt.write(((translateimpldefault) workDatabase.MediaMetadataCompat()).IconCompatParcelizer, true, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new hg$$ExternalSyntheticLambda5(i6))).intValue();
                int i7 = graphicslayerpanq8wgdefault.serializer;
                if (iIntValue + i5 <= i7) {
                    return;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(i5, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", m1$$ExternalSyntheticOutline0.m(i7, iIntValue, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: ")));
                int i8 = RemoteActionCompatParcelizer + 63;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            List list = ((ImageBitmapConfigCompanion) onContentCardDismissed.MediaSessionCompatQueueItem((List) arrayList)).MediaDescriptionCompat;
            list.getClass();
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                int i9 = read + 121;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i = 0;
            } else {
                Iterator it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    int i11 = RemoteActionCompatParcelizer + 123;
                    read = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    if ((!((setRotationY) it.next()).IconCompatParcelizer.read.write.isEmpty()) && (i = i + 1) < 0) {
                        SQLite.RemoteActionCompatParcelizer();
                        throw null;
                    }
                }
            }
            i5 += i;
        }
    }

    public static void IconCompatParcelizer(SentryBaseEvent sentryBaseEvent, OkHttpCall$1 okHttpCall$1, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj = null;
        if (sentryBaseEvent.MediaMetadataCompat != null) {
            int i4 = RemoteActionCompatParcelizer + 55;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                okHttpCall$1.write("event_id");
                okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, sentryBaseEvent.MediaMetadataCompat);
                obj.hashCode();
                throw null;
            }
            okHttpCall$1.write("event_id");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, sentryBaseEvent.MediaMetadataCompat);
        }
        okHttpCall$1.write("contexts");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, sentryBaseEvent.read);
        if (sentryBaseEvent.PlaybackStateCompat != null) {
            okHttpCall$1.write("sdk");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, sentryBaseEvent.PlaybackStateCompat);
        }
        if (sentryBaseEvent.MediaBrowserCompatMediaItem != null) {
            okHttpCall$1.write("request");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, sentryBaseEvent.MediaBrowserCompatMediaItem);
            int i5 = read + 35;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        AbstractMap abstractMap = sentryBaseEvent.PlaybackStateCompatCustomAction;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            okHttpCall$1.write("tags");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, sentryBaseEvent.PlaybackStateCompatCustomAction);
        }
        if (sentryBaseEvent.RatingCompat != null) {
            okHttpCall$1.write("release");
            okHttpCall$1.IconCompatParcelizer(sentryBaseEvent.RatingCompat);
        }
        if (sentryBaseEvent.serializer != null) {
            okHttpCall$1.write(UtilKt.ENVIRONMENT_KEY);
            okHttpCall$1.IconCompatParcelizer(sentryBaseEvent.serializer);
        }
        if (sentryBaseEvent.MediaSessionCompatQueueItem != null) {
            okHttpCall$1.write("platform");
            okHttpCall$1.IconCompatParcelizer(sentryBaseEvent.MediaSessionCompatQueueItem);
        }
        if (sentryBaseEvent.ParcelableVolumeInfo != null) {
            okHttpCall$1.write(FeedbackEvent.UI);
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, sentryBaseEvent.ParcelableVolumeInfo);
        }
        if (sentryBaseEvent.MediaSessionCompatResultReceiverWrapper != null) {
            okHttpCall$1.write("server_name");
            okHttpCall$1.IconCompatParcelizer(sentryBaseEvent.MediaSessionCompatResultReceiverWrapper);
        }
        if (sentryBaseEvent.RemoteActionCompatParcelizer != null) {
            int i7 = read + 61;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                okHttpCall$1.write("dist");
                okHttpCall$1.IconCompatParcelizer(sentryBaseEvent.RemoteActionCompatParcelizer);
                throw null;
            }
            okHttpCall$1.write("dist");
            okHttpCall$1.IconCompatParcelizer(sentryBaseEvent.RemoteActionCompatParcelizer);
        }
        List list = sentryBaseEvent.IconCompatParcelizer;
        if (list != null) {
            int i8 = read + 79;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                list.isEmpty();
                obj.hashCode();
                throw null;
            }
            if (!list.isEmpty()) {
                okHttpCall$1.write("breadcrumbs");
                okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, sentryBaseEvent.IconCompatParcelizer);
            }
        }
        if (sentryBaseEvent.write != null) {
            okHttpCall$1.write("debug_meta");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, sentryBaseEvent.write);
        }
        AbstractMap abstractMap2 = sentryBaseEvent.MediaDescriptionCompat;
        if (abstractMap2 == null || abstractMap2.isEmpty()) {
            return;
        }
        okHttpCall$1.write(Constants.BRAZE_PUSH_EXTRAS_KEY);
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, sentryBaseEvent.MediaDescriptionCompat);
    }

    public static Set serializer(resetMessageMarginslambda00 resetmessagemarginslambda00) {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        return (Set) RemoteActionCompatParcelizer(-1396060161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{resetmessagemarginslambda00}, 1396060164, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
    }

    public static r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI serializer(Object obj) {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        return (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{obj}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
    }

    public static final void serializer(ComposeView composeView, boolean z, DragAndDropTargetModifierNode dragAndDropTargetModifierNode) {
        RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, Boolean.valueOf(z), dragAndDropTargetModifierNode}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
    }

    public static int IconCompatParcelizer(GifDrawableTransformation gifDrawableTransformation) {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        return ((Integer) RemoteActionCompatParcelizer(-2048791160, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{gifDrawableTransformation}, 2048791160, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read())).intValue();
    }

    public static Rstyleable IconCompatParcelizer(String str) {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        return (Rstyleable) RemoteActionCompatParcelizer(1751724500, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{str}, -1751724496, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
    }
}
