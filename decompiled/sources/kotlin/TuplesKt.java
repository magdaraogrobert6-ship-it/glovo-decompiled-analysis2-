package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Base64;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1;
import androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2;
import androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1;
import androidx.work.WorkerParameters;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.RealImageLoader$execute$2$job$1;
import coil3.util.ContextsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.zzw;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.messaging.GmsRpc;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.CameraAnimatorOptions;
import com.mapbox.maps.plugin.animation.CameraAnimatorsFactory;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import com.mapbox.maps.plugin.animation.animator.CameraBearingAnimator;
import com.mapbox.maps.plugin.gestures.GesturesPluginImpl;
import com.mapbox.maps.util.CameraOptionsUtils;
import com.mapbox.turf.TurfConversion;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import io.grpc.internal.MetadataApplierImpl;
import io.reactivex.subjects.BehaviorSubject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import o.AndroidShadowContext_androidKt;
import o.CanvasUtils;
import o.DefaultInAppMessageViewWrapperFactory;
import o.DrawableTransformation;
import o.GroupComponentwrappedListener1;
import o.InAppMessageHtmlBaseViewCompanion;
import o.LayoutNodeCompanionErrorMeasurePolicy1;
import o.MeasureScopelayout1;
import o.OnAdidReadListener;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.UncheckedColordefault;
import o.accessgetNinecp;
import o.accessgetSystemNavigationDowncp;
import o.accessregisterComponentCallback;
import o.accesssetSpotShadowColor8_81llAjd;
import o.actualTintColorFilterxETnrds;
import o.createInAppMessageViewlambda1;
import o.displayInAppMessagelambda1;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getBitmapui_graphics;
import o.getCoordinatesAccessedDuringModifierPlacement;
import o.getCoordinatesAccessedDuringPlacement;
import o.getCyan0d7_KjU;
import o.getGray0d7_KjUannotations;
import o.getHasAlpha;
import o.getInvalidateListenerui;
import o.getLightGray0d7_KjU;
import o.getLongPressTimeoutMillis;
import o.getMagenta0d7_KjUannotations;
import o.getMessageIconView;
import o.getModulateAlphake2Ky5w;
import o.getNextChildPlaceOrderui;
import o.getSUFFIX_CACHE_USER_ID_KEYannotations;
import o.getSelectionEndui_text;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isCurrentlyDisplayingInAppMessage;
import o.isEndBoundary;
import o.minApproachIntrinsicWidth;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc;
import o.r8lambdaU31FnmCtqQics3i75Jr9dkZcEk;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.resetMessageMarginslambda00;
import o.restore;
import o.setGraphicModalMaxWidthDp;
import o.setOnAttachui;
import o.setRotationX;
import o.setSupportButtonTintList;
import o.setTransformOrigin__ExYCQ;
import o.supportsColorMatrixQuery;
import o.tintxETnrds;
import o.toColorLong8_81llA;
import o.withSave;
import okio.Okio;
import okio.Options;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TuplesKt {
    private static int IconCompatParcelizer = 1;
    public static boolean MediaBrowserCompatMediaItem = false;
    public static Method RatingCompat = null;
    private static byte read = -112;
    private static int serializer;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | (~(i7 | i)) | (~(i8 | i));
        int i10 = ~i;
        int i11 = (~(i10 | i6)) | (~(i8 | i6));
        int i12 = ~(i8 | i7 | i10);
        int i13 = i + i6 + i4 + ((-2109949842) * i3) + (2078889904 * i5);
        int i14 = i13 * i13;
        int i15 = ((-1963971821) * i) + 932184064 + (61854959 * i6) + (1134570258 * i9) + (i11 * (-1134570258)) + ((-1134570258) * i12) + (1196425216 * i4) + (610271232 * i3) + (922746880 * i5) + (671350784 * i14);
        int i16 = (i * (-573803825)) + 196542130 + (i6 * (-573802789)) + (i9 * (-518)) + (i11 * 518) + (i12 * 518) + (i4 * (-573803307)) + (i3 * (-843101306)) + (i5 * (-1524517520)) + (i14 * 458489856);
        switch (i15 + (i16 * i16 * 64749568)) {
            case 1:
                Object obj = objArr[0];
                String str = (String) objArr[1];
                int i17 = 2 % 2;
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(str, obj);
                int i18 = serializer + 89;
                IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                return onviewattachedtowindowlambda0;
            case 2:
                char cCharValue = ((Character) objArr[0]).charValue();
                int i20 = 2 % 2;
                int i21 = serializer + 63;
                IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                if (!Character.isWhitespace(cCharValue)) {
                    if (!Character.isSpaceChar(cCharValue)) {
                        return false;
                    }
                    int i23 = serializer + 33;
                    IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                    int i24 = i23 % 2;
                }
                return true;
            case 3:
                String str2 = (String) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i25 = 2 % 2;
                int i26 = IconCompatParcelizer + 21;
                serializer = i26 % Fields.SpotShadowColor;
                int i27 = i26 % 2;
                if (!zBooleanValue) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write(str2);
                    int i28 = IconCompatParcelizer + 35;
                    serializer = i28 % Fields.SpotShadowColor;
                    int i29 = i28 % 2;
                }
                return null;
            case 4:
                return write(objArr);
            case 5:
                return RemoteActionCompatParcelizer(objArr);
            case 6:
                return serializer(objArr);
            case 7:
                return read(objArr);
            case 8:
                return RatingCompat(objArr);
            default:
                return IconCompatParcelizer(objArr);
        }
    }

    public abstract void IconCompatParcelizer();

    public abstract void IconCompatParcelizer(getSUFFIX_CACHE_USER_ID_KEYannotations getsuffix_cache_user_id_keyannotations, Executor executor, MetadataApplierImpl metadataApplierImpl);

    public abstract String serializer();

    public abstract accesssetSpotShadowColor8_81llAjd write(Context context, String str, WorkerParameters workerParameters);

    public abstract void write(UncheckedColordefault uncheckedColordefault, Object obj);

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        zzw zzwVarRemoteActionCompatParcelizer;
        int i;
        final Context context = (Context) objArr[0];
        int i2 = 1;
        GmsRpc gmsRpc = (GmsRpc) objArr[1];
        final boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        if (Build.VERSION.SDK_INT >= 29) {
            SharedPreferences sharedPreferences = read(context);
            if (sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == zBooleanValue) {
                return null;
            }
            Rpc rpc = gmsRpc.serializer;
            if (rpc.MediaMetadataCompat.read() >= 241100000) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("proxy_retention", zBooleanValue);
                r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcekWrite = r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.write(rpc.IconCompatParcelizer);
                synchronized (r8lambdau31fnmctqqics3i75jr9dkzcekWrite) {
                    i = r8lambdau31fnmctqqics3i75jr9dkzcekWrite.MediaBrowserCompatMediaItem;
                    r8lambdau31fnmctqqics3i75jr9dkzcekWrite.MediaBrowserCompatMediaItem = i + 1;
                }
                zzwVarRemoteActionCompatParcelizer = r8lambdau31fnmctqqics3i75jr9dkzcekWrite.RemoteActionCompatParcelizer(new accessgetNinecp(i, 4, bundle, 0));
            } else {
                Object[] objArr2 = {new IOException("SERVICE_NOT_AVAILABLE")};
                zzwVarRemoteActionCompatParcelizer = (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr2);
            }
            zzwVarRemoteActionCompatParcelizer.addOnSuccessListener(new setSupportButtonTintList(i2), new OnSuccessListener() { // from class: o.convertToAnnotatedString
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    SharedPreferences.Editor editorEdit = TuplesKt.read(context).edit();
                    editorEdit.putBoolean("proxy_retention", zBooleanValue);
                    editorEdit.apply();
                }
            });
        }
        return null;
    }

    public static final Cursor IconCompatParcelizer(RoomDatabase roomDatabase, CanvasUtils canvasUtils) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 13;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        roomDatabase.getClass();
        Cursor cursorQuery = roomDatabase.query(canvasUtils, (CancellationSignal) null);
        int i4 = IconCompatParcelizer + 11;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return cursorQuery;
        }
        throw null;
    }

    public static /* synthetic */ void easeTo$default(CameraAnimationsPlugin cameraAnimationsPlugin, CameraOptions cameraOptions) {
        int i = 2 % 2;
        int i2 = serializer + 59;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).easeTo(cameraOptions, GesturesPluginImpl.IMMEDIATE_ANIMATION_OPTIONS, null);
        } else {
            ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).easeTo(cameraOptions, GesturesPluginImpl.IMMEDIATE_ANIMATION_OPTIONS, null);
            obj.hashCode();
            throw null;
        }
    }

    public static CameraBearingAnimator createBearingAnimator$default(CameraAnimationsPlugin cameraAnimationsPlugin, CameraAnimatorOptions cameraAnimatorOptions, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = 2 % 2;
        ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).getClass();
        CameraBearingAnimator cameraBearingAnimator = new CameraBearingAnimator(cameraAnimatorOptions, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        int i2 = IconCompatParcelizer + 29;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return cameraBearingAnimator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Flow write(BehaviorSubject behaviorSubject) {
        int i = 2 % 2;
        Flow flowWrite = FlowKt.write(new RxConvertKt$asFlow$1(behaviorSubject, (ShortNewsContentCardView) null, 0));
        int i2 = serializer + 111;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return flowWrite;
        }
        throw null;
    }

    public static boolean RemoteActionCompatParcelizer(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 97;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        int i5 = i2 + 61;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        if (!obj.equals(obj2)) {
            return false;
        }
        int i7 = serializer + 15;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }

    public static boolean write(Object obj, Object obj2) {
        int i = 2 % 2;
        if (obj != obj2) {
            if (obj == null) {
                return false;
            }
            int i2 = IconCompatParcelizer + 69;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return obj.equals(obj2);
        }
        int i4 = serializer + 83;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    public static SharedPreferences read(Context context) {
        int i = 2 % 2;
        int i2 = serializer + 7;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            context.getApplicationContext();
            throw null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            int i3 = IconCompatParcelizer + 27;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final File read(Context context, String str) {
        int i = 2 % 2;
        context.getClass();
        File file = new File(context.getApplicationContext().getFilesDir(), removeNodeAtDepth.write((Object) str, "datastore/"));
        int i2 = serializer + 5;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return file;
    }

    public static final void write(ViewModel viewModel, getLightGray0d7_KjU getlightgray0d7_kju, supportsColorMatrixQuery supportscolormatrixquery) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getlightgray0d7_kju.getClass();
        supportscolormatrixquery.getClass();
        getHasAlpha gethasalpha = (getHasAlpha) viewModel.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (gethasalpha != null) {
            int i4 = IconCompatParcelizer + 53;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (!(!gethasalpha.IconCompatParcelizer)) {
                return;
            }
            gethasalpha.IconCompatParcelizer(supportscolormatrixquery, getlightgray0d7_kju);
            write(supportscolormatrixquery, getlightgray0d7_kju);
        }
    }

    public static void RemoteActionCompatParcelizer(int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 55;
        int i4 = i3 % Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (2 <= i) {
            int i6 = i4 + 123;
            serializer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                if (i < 108) {
                    return;
                }
            } else if (i < 37) {
                return;
            }
        }
        DrawableTransformation.read(ff$$ExternalSyntheticOutline0.m(i, "radix ", " was not in valid range "), new ensureSubscribedToInAppMessageEventslambda7(2, 36, 1));
        int i7 = IconCompatParcelizer + 47;
        serializer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public static int IconCompatParcelizer(byte[] bArr, int i, isEndBoundary isendboundary) throws InvalidProtocolBufferException {
        int i2 = 2 % 2;
        Object[] objArr = {bArr, Integer.valueOf(i), isendboundary};
        int iIntValue = ((Integer) RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), objArr, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
        int i3 = isendboundary.IconCompatParcelizer;
        if (i3 < 0) {
            throw InvalidProtocolBufferException.write();
        }
        int i4 = IconCompatParcelizer + 21;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i3 != 0) {
            isendboundary.write = getNextChildPlaceOrderui.RemoteActionCompatParcelizer.serializer(bArr, iIntValue, i3);
            return iIntValue + i3;
        }
        isendboundary.write = "";
        int i5 = IconCompatParcelizer + 23;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
        return iIntValue;
    }

    private static void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ read);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public static final setGraphicModalMaxWidthDp serializer(AbstractPolymorphicSerializer abstractPolymorphicSerializer, DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        abstractPolymorphicSerializer.getClass();
        obj.getClass();
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = abstractPolymorphicSerializer.serializer(defaultInAppMessageViewWrapperFactory, obj);
        if (setgraphicmodalmaxwidthdpSerializer == null) {
            kotlinx.serialization.internal.TuplesKt.serializer(displayInAppMessagelambda1.serializer(obj.getClass()), abstractPolymorphicSerializer.read());
            throw null;
        }
        int i4 = IconCompatParcelizer + 81;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setgraphicmodalmaxwidthdpSerializer;
    }

    public static final setGraphicModalMaxWidthDp IconCompatParcelizer(AbstractPolymorphicSerializer abstractPolymorphicSerializer, createInAppMessageViewlambda1 createinappmessageviewlambda1, String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        abstractPolymorphicSerializer.getClass();
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = abstractPolymorphicSerializer.read(createinappmessageviewlambda1, str);
        if (setgraphicmodalmaxwidthdp == null) {
            kotlinx.serialization.internal.TuplesKt.RemoteActionCompatParcelizer(str, abstractPolymorphicSerializer.read());
            throw null;
        }
        int i4 = serializer + 47;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return setgraphicmodalmaxwidthdp;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042 A[RETURN] */
    public static final boolean IconCompatParcelizer(char c, char c2, boolean z) {
        int i = 2 % 2;
        if (c == c2) {
            int i2 = IconCompatParcelizer + 11;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        if (upperCase != upperCase2) {
            int i4 = IconCompatParcelizer + 95;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                if (Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                    return false;
                }
            } else {
                int i5 = 24 / 0;
                if (Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
    
        r8 = kotlin.TuplesKt.serializer + 107;
        kotlin.TuplesKt.IconCompatParcelizer = r8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0078, code lost:
    
        if ((r8 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        r10.write = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        r10.write = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0080, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0081, code lost:
    
        r10.write = new java.lang.String(r8, r9, r1, o.getMinimumTouchTargetSizeMYxV2XQ.write);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
    
        return r9 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.write();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
    
        if (r1 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
    
        if (r1 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006b, code lost:
    
        if (r1 != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int serializer(byte[] r8, int r9, o.isEndBoundary r10) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.TuplesKt.serializer
            int r1 = r1 + 5
            int r2 = r1 % 128
            kotlin.TuplesKt.IconCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L3f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r3 = new java.lang.Object[]{r8, r9, r10}
            int r2 = o.getSelectionEndui_text.IconCompatParcelizer()
            int r5 = o.getSelectionEndui_text.IconCompatParcelizer()
            int r4 = o.getSelectionEndui_text.IconCompatParcelizer()
            int r6 = o.getSelectionEndui_text.IconCompatParcelizer()
            r1 = -806706614(0xffffffffcfeaa24a, float:-7.8730086E9)
            r7 = 806706620(0x30155dbc, float:5.433909E-10)
            java.lang.Object r9 = RemoteActionCompatParcelizer(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            int r1 = r10.IconCompatParcelizer
            r2 = 84
            int r2 = r2 / 0
            if (r1 < 0) goto L8c
            goto L6b
        L3f:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r3 = new java.lang.Object[]{r8, r9, r10}
            int r2 = o.getSelectionEndui_text.IconCompatParcelizer()
            int r5 = o.getSelectionEndui_text.IconCompatParcelizer()
            int r4 = o.getSelectionEndui_text.IconCompatParcelizer()
            int r6 = o.getSelectionEndui_text.IconCompatParcelizer()
            r1 = -806706614(0xffffffffcfeaa24a, float:-7.8730086E9)
            r7 = 806706620(0x30155dbc, float:5.433909E-10)
            java.lang.Object r9 = RemoteActionCompatParcelizer(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            int r1 = r10.IconCompatParcelizer
            if (r1 < 0) goto L8c
        L6b:
            if (r1 != 0) goto L81
            int r8 = kotlin.TuplesKt.serializer
            int r8 = r8 + 107
            int r1 = r8 % 128
            kotlin.TuplesKt.IconCompatParcelizer = r1
            int r8 = r8 % r0
            java.lang.String r0 = ""
            if (r8 == 0) goto L7d
            r10.write = r0
            return r9
        L7d:
            r10.write = r0
            r8 = 0
            throw r8
        L81:
            java.nio.charset.Charset r0 = o.getMinimumTouchTargetSizeMYxV2XQ.write
            java.lang.String r2 = new java.lang.String
            r2.<init>(r8, r9, r1, r0)
            r10.write = r2
            int r9 = r9 + r1
            return r9
        L8c:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.write()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TuplesKt.serializer(byte[], int, o.isEndBoundary):int");
    }

    public static void write(supportsColorMatrixQuery supportscolormatrixquery, getLightGray0d7_KjU getlightgray0d7_kju) {
        int i = 2 % 2;
        int i2 = serializer + 57;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        toColorLong8_81llA tocolorlong8_81lla = ((accessregisterComponentCallback) supportscolormatrixquery).RatingCompat;
        if (tocolorlong8_81lla == toColorLong8_81llA.INITIALIZED || tocolorlong8_81lla.isAtLeast(toColorLong8_81llA.STARTED)) {
            getlightgray0d7_kju.serializer();
            return;
        }
        supportscolormatrixquery.IconCompatParcelizer(new actualTintColorFilterxETnrds(supportscolormatrixquery, getlightgray0d7_kju));
        int i4 = serializer + 93;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039 A[DONT_INVERT, PHI: r6
  0x0039: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v8 java.lang.String) binds: [B:10:0x0037, B:7:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0044 A[SYNTHETIC] */
    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        String str;
        String str2 = (String) objArr[0];
        String[] strArr = (String[]) objArr[1];
        String[] strArr2 = (String[]) objArr[2];
        int i = 2 % 2;
        int iMin = Math.min(strArr.length, strArr2.length);
        int i2 = IconCompatParcelizer + 57;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < iMin; i4++) {
            int i5 = serializer + 101;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                str = strArr[i4];
                if (str2 == null) {
                    if (str != null) {
                    }
                }
                return strArr2[i4];
            }
            str = strArr[i4];
            int i6 = 5 / 0;
            if (str2 == null) {
                if (str != null) {
                }
            }
            return strArr2[i4];
            if (str2 != null && str2.equals(str)) {
                return strArr2[i4];
            }
        }
        return null;
    }

    public static int serializer(int i, byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = serializer;
        int i4 = i3 + 51;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        int i7 = i3 + 89;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return i6;
    }

    public void IconCompatParcelizer(tintxETnrds tintxetnrds, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            tintxetnrds.getClass();
            obj2.hashCode();
            throw null;
        }
        tintxetnrds.getClass();
        if (obj == null) {
            return;
        }
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer(serializer());
        try {
            write(uncheckedColordefaultRemoteActionCompatParcelizer, obj);
            uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer();
            Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, null);
            int i3 = serializer + 3;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, th);
                throw th2;
            }
        }
    }

    private static /* synthetic */ Object RatingCompat(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        LayoutNodeCompanionErrorMeasurePolicy1 layoutNodeCompanionErrorMeasurePolicy1 = (LayoutNodeCompanionErrorMeasurePolicy1) objArr[4];
        isEndBoundary isendboundary = (isEndBoundary) objArr[5];
        int i = 2 % 2;
        int i2 = serializer + 35;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getLongPressTimeoutMillis getlongpresstimeoutmillis = (getLongPressTimeoutMillis) layoutNodeCompanionErrorMeasurePolicy1;
        Object[] objArr2 = {bArr, Integer.valueOf(iIntValue2), isendboundary};
        int iIntValue4 = ((Integer) RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), objArr2, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
        getlongpresstimeoutmillis.serializer(isendboundary.IconCompatParcelizer);
        while (iIntValue4 < iIntValue3) {
            int i4 = IconCompatParcelizer + 117;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Object[] objArr3 = {bArr, Integer.valueOf(iIntValue4), isendboundary};
            int iIntValue5 = ((Integer) RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), objArr3, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
            if (iIntValue != isendboundary.IconCompatParcelizer) {
                int i6 = IconCompatParcelizer + 47;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                break;
            }
            Object[] objArr4 = {bArr, Integer.valueOf(iIntValue5), isendboundary};
            iIntValue4 = ((Integer) RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), objArr4, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
            getlongpresstimeoutmillis.serializer(isendboundary.IconCompatParcelizer);
        }
        return Integer.valueOf(iIntValue4);
    }

    public static int RemoteActionCompatParcelizer(Object obj, getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacement, byte[] bArr, int i, int i2, isEndBoundary isendboundary) throws InvalidProtocolBufferException {
        int i3 = 2 % 2;
        int iWrite = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            iWrite = write(i4, bArr, iWrite, isendboundary);
            i4 = isendboundary.IconCompatParcelizer;
        }
        int i5 = iWrite;
        if (i4 >= 0) {
            int i6 = IconCompatParcelizer + 97;
            serializer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? i4 <= i2 - i5 : i4 <= i2 + i5) {
                int i7 = i4 + i5;
                getcoordinatesaccessedduringplacement.IconCompatParcelizer(obj, bArr, i5, i7, isendboundary);
                isendboundary.write = obj;
                int i8 = serializer + 21;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return i7;
                }
                throw null;
            }
        }
        throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
    }

    private static /* synthetic */ Object read(Object[] objArr) throws InvalidProtocolBufferException {
        byte[] bArr = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        isEndBoundary isendboundary = (isEndBoundary) objArr[2];
        int i = 2 % 2;
        Object[] objArr2 = {bArr, Integer.valueOf(iIntValue), isendboundary};
        int iIntValue2 = ((Integer) RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), objArr2, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
        int i2 = isendboundary.IconCompatParcelizer;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.write();
        }
        int i3 = IconCompatParcelizer + 79;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0 ? i2 > bArr.length - iIntValue2 : i2 > bArr.length % iIntValue2) {
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }
        if (i2 == 0) {
            isendboundary.write = setOnAttachui.IconCompatParcelizer;
            return Integer.valueOf(iIntValue2);
        }
        isendboundary.write = setOnAttachui.RemoteActionCompatParcelizer(bArr, iIntValue2, i2);
        int i4 = IconCompatParcelizer + 101;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return Integer.valueOf(iIntValue2 + i2);
    }

    public static void flyTo$default(CameraAnimationsPlugin cameraAnimationsPlugin, CameraOptions cameraOptions, MapAnimationOptions mapAnimationOptions, int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 121;
        int i4 = i3 % Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 3) != 0) {
            int i5 = i4 + 53;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            mapAnimationOptions = null;
        }
        CameraAnimationsPluginImpl cameraAnimationsPluginImpl = (CameraAnimationsPluginImpl) cameraAnimationsPlugin;
        cameraAnimationsPluginImpl.getClass();
        if (CameraOptionsUtils.isEmpty(cameraOptions)) {
            int i7 = serializer + 75;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            MapboxLogger.logW("Mbgl-CameraManager", "No-op flyTo camera high-level animation as CameraOptions.isEmpty == true.");
            return;
        }
        CameraAnimatorsFactory cameraAnimationsFactory = cameraAnimationsPluginImpl.getCameraAnimationsFactory();
        restore restoreVar = CameraAnimatorsFactory.DEFAULT_INTERPOLATOR;
        cameraAnimationsPluginImpl.startHighLevelAnimation(cameraAnimationsFactory.getFlyTo(cameraOptions, null), mapAnimationOptions, null);
        int i9 = serializer + 101;
        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
    }

    public static final Object write(RoomDatabase roomDatabase, boolean z, boolean z2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = 2 % 2;
        int i2 = serializer + 41;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        roomDatabase.getClass();
        roomDatabase.assertNotMainThread();
        roomDatabase.assertNotSuspendingTransaction();
        TextAnnouncementContentCardView textAnnouncementContentCardView = roomDatabase.getSuspendingTransactionContext().get();
        if (textAnnouncementContentCardView == null) {
            int i4 = IconCompatParcelizer + 41;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc r8lambda2qmxd75iptxkfld4rjabqemoamc = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            textAnnouncementContentCardView = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
        }
        return ContextsKt.RemoteActionCompatParcelizer(new DBUtil__DBUtil_androidKt$performBlocking$1(textAnnouncementContentCardView, roomDatabase, z2, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null));
    }

    public static String RemoteActionCompatParcelizer(byte[] bArr) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i2 = serializer + 13;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = b & 255;
            sb.append("0123456789abcdef".charAt(i4 / 16));
            sb.append("0123456789abcdef".charAt(i4 % 16));
        }
        String string = sb.toString();
        int i5 = serializer + 65;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0052 A[SYNTHETIC] */
    public static int write(byte[] bArr, int i, isEndBoundary isendboundary) {
        int i2;
        long j;
        long j2;
        int i3;
        byte b;
        int i4;
        long j3;
        int i5;
        int i6 = 2 % 2;
        int i7 = IconCompatParcelizer;
        int i8 = i7 + 71;
        serializer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            j2 = bArr[i];
            if (j2 < 1) {
                j = j2;
                i2 = i;
                i3 = i + 2;
                b = bArr[i2];
                i4 = 7;
                j3 = (j & 127) | (((long) (b & 127)) << 7);
                int i9 = i7 + 11;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                while (b < 0) {
                    i5 = IconCompatParcelizer + 15;
                    serializer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        b = bArr[i3];
                        i4 += 73;
                        j3 += ((long) (b & 86)) >> i4;
                        i3 += 80;
                    } else {
                        b = bArr[i3];
                        i4 += 7;
                        j3 |= ((long) (b & 127)) << i4;
                        i3++;
                    }
                }
                isendboundary.read = j3;
                return i3;
            }
            int i11 = i7 + 27;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            isendboundary.read = j2;
            return i;
        }
        i2 = i + 1;
        j = bArr[i];
        if (j >= 0) {
            i = i2;
            j2 = j;
            int i13 = i7 + 27;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            isendboundary.read = j2;
            return i;
        }
        i3 = i + 2;
        b = bArr[i2];
        i4 = 7;
        j3 = (j & 127) | (((long) (b & 127)) << 7);
        int i15 = i7 + 11;
        serializer = i15 % Fields.SpotShadowColor;
        int i16 = i15 % 2;
        while (b < 0) {
            i5 = IconCompatParcelizer + 15;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                b = bArr[i3];
                i4 += 73;
                j3 += ((long) (b & 86)) >> i4;
                i3 += 80;
            } else {
                b = bArr[i3];
                i4 += 7;
                j3 |= ((long) (b & 127)) << i4;
                i3++;
            }
        }
        isendboundary.read = j3;
        return i3;
    }

    public static String read(int i, int i2, String str) {
        int i3 = 2 % 2;
        if (i < 0) {
            String strIconCompatParcelizer = minApproachIntrinsicWidth.IconCompatParcelizer("%s (%s) must not be negative", str, Integer.valueOf(i));
            int i4 = serializer + 51;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 86 / 0;
            }
            return strIconCompatParcelizer;
        }
        if (i2 >= 0) {
            int i6 = IconCompatParcelizer + 125;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return minApproachIntrinsicWidth.IconCompatParcelizer("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i2, "negative size: "));
        return null;
    }

    public static boolean serializer(File file) {
        int i = 2 % 2;
        int i2 = serializer + 15;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (file != null) {
            int i4 = i3 + 105;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                file.exists();
                obj.hashCode();
                throw null;
            }
            if (file.exists()) {
                if (file.isFile()) {
                    int i5 = serializer + 109;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        return file.delete();
                    }
                    int i6 = 49 / 0;
                    return file.delete();
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    int i7 = serializer + 81;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    return i7 % 2 != 0;
                }
                int length = fileArrListFiles.length;
                int i8 = 0;
                while (i8 < length) {
                    if (!serializer(fileArrListFiles[i8])) {
                        int i9 = IconCompatParcelizer + 3;
                        serializer = i9 % Fields.SpotShadowColor;
                        return i9 % 2 != 0;
                    }
                    i8++;
                    int i10 = serializer + 37;
                    IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                }
                return file.delete();
            }
        }
        return true;
    }

    public static final getHasAlpha IconCompatParcelizer(getLightGray0d7_KjU getlightgray0d7_kju, supportsColorMatrixQuery supportscolormatrixquery, String str, Bundle bundle) {
        getBitmapui_graphics getbitmapui_graphics;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 41;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getlightgray0d7_kju.getClass();
        supportscolormatrixquery.getClass();
        Bundle bundleWrite = getlightgray0d7_kju.write(str);
        if (bundleWrite != null) {
            int i4 = IconCompatParcelizer + 63;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            bundle = bundleWrite;
        }
        if (bundle == null) {
            getbitmapui_graphics = new getBitmapui_graphics();
        } else {
            ClassLoader classLoader = getBitmapui_graphics.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            getbitmapui_graphics = new getBitmapui_graphics(getCyan0d7_KjU.serializer(bundle));
        }
        getHasAlpha gethasalpha = new getHasAlpha(str, getbitmapui_graphics);
        gethasalpha.IconCompatParcelizer(supportscolormatrixquery, getlightgray0d7_kju);
        write(supportscolormatrixquery, getlightgray0d7_kju);
        return gethasalpha;
    }

    public static void RemoteActionCompatParcelizer(int i, int i2, int i3) {
        String strIconCompatParcelizer;
        int i4 = 2 % 2;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strIconCompatParcelizer = read(i, i3, "start index");
            } else {
                int i5 = IconCompatParcelizer + 3;
                int i6 = i5 % Fields.SpotShadowColor;
                serializer = i6;
                int i7 = i5 % 2;
                if (i2 < 0) {
                    strIconCompatParcelizer = read(i2, i3, "end index");
                } else if (i2 <= i3) {
                    strIconCompatParcelizer = minApproachIntrinsicWidth.IconCompatParcelizer("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
                } else {
                    int i8 = i6 + 119;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    strIconCompatParcelizer = read(i2, i3, "end index");
                }
            }
            throw new IndexOutOfBoundsException(strIconCompatParcelizer);
        }
    }

    public static int serializer(getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacement, int i, byte[] bArr, int i2, int i3, LayoutNodeCompanionErrorMeasurePolicy1 layoutNodeCompanionErrorMeasurePolicy1, isEndBoundary isendboundary) throws InvalidProtocolBufferException {
        int i4 = 2 % 2;
        int i5 = serializer + 35;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        Object objSerializer = getcoordinatesaccessedduringplacement.serializer();
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(objSerializer, getcoordinatesaccessedduringplacement, bArr, i2, i3, isendboundary);
        getcoordinatesaccessedduringplacement.write(objSerializer);
        isendboundary.write = objSerializer;
        layoutNodeCompanionErrorMeasurePolicy1.add(objSerializer);
        while (iRemoteActionCompatParcelizer < i3) {
            Object[] objArr = {bArr, Integer.valueOf(iRemoteActionCompatParcelizer), isendboundary};
            int iIntValue = ((Integer) RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), objArr, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
            if (i != isendboundary.IconCompatParcelizer) {
                int i7 = IconCompatParcelizer + 49;
                serializer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    break;
                }
                int i8 = 4 / 3;
                break;
            }
            Object objSerializer2 = getcoordinatesaccessedduringplacement.serializer();
            int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(objSerializer2, getcoordinatesaccessedduringplacement, bArr, iIntValue, i3, isendboundary);
            getcoordinatesaccessedduringplacement.write(objSerializer2);
            isendboundary.write = objSerializer2;
            layoutNodeCompanionErrorMeasurePolicy1.add(objSerializer2);
            int i9 = IconCompatParcelizer + 45;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            iRemoteActionCompatParcelizer = iRemoteActionCompatParcelizer2;
        }
        return iRemoteActionCompatParcelizer;
    }

    public static OnAdidReadListener IconCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        try {
            r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = getModulateAlphake2Ky5w.serializer;
            r8lambda3kmch7yklpui_5smgazrgczhglc.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(OnAdidReadListener.Companion.serializer());
            OnAdidReadListener onAdidReadListener = (OnAdidReadListener) r8lambda3kmch7yklpui_5smgazrgczhglc.serializer(str, setgraphicmodalmaxwidthdp);
            int i4 = serializer + 121;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return onAdidReadListener;
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.write(new Throwable(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                         |Error in deserializing the JSON data in type converter\n                         |json value = " + str + "\n                        "), e));
            return null;
        }
    }

    public static final TextAnnouncementContentCardView serializer(RoomDatabase roomDatabase, boolean z, ContinuationImpl continuationImpl) {
        TextAnnouncementContentCardView textAnnouncementContentCardView;
        int i = 2 % 2;
        withSave withsave = (withSave) continuationImpl.getContext().get(withSave.write);
        Object obj = null;
        if (withsave != null) {
            textAnnouncementContentCardView = withsave.IconCompatParcelizer;
            int i2 = IconCompatParcelizer + 47;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 3 % 3;
            }
        } else {
            textAnnouncementContentCardView = null;
        }
        if (!roomDatabase.inCompatibilityMode()) {
            TextAnnouncementContentCardView queryContext = roomDatabase.getQueryContext();
            if (textAnnouncementContentCardView == null) {
                textAnnouncementContentCardView = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
            }
            return queryContext.plus(textAnnouncementContentCardView);
        }
        if (textAnnouncementContentCardView != null) {
            TextAnnouncementContentCardView textAnnouncementContentCardViewPlus = roomDatabase.getQueryContext().plus(textAnnouncementContentCardView);
            int i4 = serializer + 93;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return textAnnouncementContentCardViewPlus;
            }
            obj.hashCode();
            throw null;
        }
        if (z) {
            int i5 = IconCompatParcelizer + 53;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return roomDatabase.getTransactionContext$room_runtime();
        }
        TextAnnouncementContentCardView queryContext2 = roomDatabase.getQueryContext();
        int i7 = IconCompatParcelizer + 51;
        serializer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 79 / 0;
        }
        return queryContext2;
    }

    public static void RemoteActionCompatParcelizer(int i, int i2) {
        String strIconCompatParcelizer;
        int i3 = 2 % 2;
        if (i >= 0) {
            int i4 = IconCompatParcelizer + 67;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (i < i2) {
                return;
            }
        }
        if (i >= 0) {
            int i5 = IconCompatParcelizer + 117;
            int i6 = i5 % Fields.SpotShadowColor;
            serializer = i6;
            int i7 = i5 % 2;
            if (i2 < 0) {
                int i8 = i6 + 17;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i2, "negative size: "));
                return;
            }
            strIconCompatParcelizer = minApproachIntrinsicWidth.IconCompatParcelizer("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            strIconCompatParcelizer = minApproachIntrinsicWidth.IconCompatParcelizer("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(strIconCompatParcelizer);
    }

    public long write(tintxETnrds tintxetnrds, Object obj) {
        int i = 2 % 2;
        tintxetnrds.getClass();
        UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer(serializer());
        try {
            write(uncheckedColordefaultRemoteActionCompatParcelizer, obj);
            uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer();
            Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, null);
            int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            if (((Integer) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1469081550, -1469081547, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{tintxetnrds})).intValue() == 0) {
                int i2 = serializer + 83;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return -1L;
                }
                throw null;
            }
            UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer2 = tintxetnrds.RemoteActionCompatParcelizer("SELECT last_insert_rowid()");
            try {
                uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer();
                long jSerializer = uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(0);
                Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer2, null);
                int i3 = IconCompatParcelizer + 51;
                serializer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i4 = 80 / 0;
                }
                return jSerializer;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer2, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                Okio.RemoteActionCompatParcelizer(uncheckedColordefaultRemoteActionCompatParcelizer, th3);
                throw th4;
            }
        }
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        Context context = (Context) objArr[0];
        String strRemoteActionCompatParcelizer = (String) objArr[1];
        int i = 2 % 2;
        int i2 = serializer + 49;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
                strRemoteActionCompatParcelizer = MeasureScopelayout1.RemoteActionCompatParcelizer(context);
                int i3 = serializer + 65;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
            int identifier = resources.getIdentifier("google_app_id", "string", strRemoteActionCompatParcelizer);
            if (identifier == 0) {
                int i5 = serializer + 67;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return null;
            }
            try {
                String string = resources.getString(identifier);
                if (!string.startsWith("%('")) {
                    return string;
                }
                int i7 = IconCompatParcelizer + 89;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                Object[] objArr2 = new Object[1];
                a(string.substring(3), objArr2);
                return ((String) objArr2[0]).intern();
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
        context.getResources();
        TextUtils.isEmpty(strRemoteActionCompatParcelizer);
        throw null;
    }

    public static byte[] write(String str) {
        int length;
        byte[] bArr;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 71;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0 ? str.length() % 2 != 0 : str.length() / 3 != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Expected a string of even length");
            return null;
        }
        int i4 = IconCompatParcelizer + 7;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            length = str.length() >> 4;
            bArr = new byte[length];
            i = 1;
        } else {
            length = str.length() / 2;
            bArr = new byte[length];
            i = 0;
        }
        while (i < length) {
            int i5 = i * 2;
            int iDigit = Character.digit(str.charAt(i5), 16);
            int iDigit2 = Character.digit(str.charAt(i5 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("input is not hexadecimal");
                return null;
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
            i++;
        }
        return bArr;
    }

    public static long RemoteActionCompatParcelizer(int i, byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 5;
        int i4 = i3 % Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        long j = ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        int i6 = i4 + 1;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return j;
    }

    public static final long serializer(long j, long j2, long j3) {
        int i;
        int i2 = 2 % 2;
        int i3 = serializer;
        int i4 = i3 + 17;
        int i5 = i4 % Fields.SpotShadowColor;
        IconCompatParcelizer = i5;
        if (i4 % 2 != 0 ? j3 <= 0 : j3 <= 0) {
            if (i >= 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Step is zero.");
                return 0L;
            }
            int i6 = i3 + 73;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (j > j2) {
                long j4 = -j3;
                long j5 = j % j4;
                if (j5 < 0) {
                    j5 += j4;
                }
                long j6 = j2 % j4;
                if (j6 < 0) {
                    j6 += j4;
                }
                long j7 = (j5 - j6) % j4;
                if (j7 < 0) {
                    j7 += j4;
                }
                return j2 + j7;
            }
        } else if (j < j2) {
            long j8 = j2 % j3;
            if (j8 < 0) {
                j8 += j3;
            }
            long j9 = j % j3;
            if (j9 < 0) {
                j9 += j3;
            }
            long j10 = (j8 - j9) % j3;
            if (j10 >= 0) {
                int i8 = i5 + 123;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            } else {
                j10 += j3;
            }
            return j2 - j10;
        }
        return j2;
    }

    public static final int read(int i, int i2, int i3) {
        int i4 = 2 % 2;
        Object obj = null;
        if (i3 > 0) {
            int i5 = serializer + 3;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i < i2) {
                int i6 = i2 % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                int i7 = i % i3;
                if (i7 < 0) {
                    i7 += i3;
                }
                int i8 = (i6 - i7) % i3;
                if (i8 < 0) {
                    i8 += i3;
                }
                return i2 - i8;
            }
        } else {
            if (i3 >= 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Step is zero.");
                return 0;
            }
            int i9 = IconCompatParcelizer + 43;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (i > i2) {
                int i10 = -i3;
                int i11 = i % i10;
                if (i11 < 0) {
                    i11 += i10;
                }
                int i12 = i2 % i10;
                if (i12 < 0) {
                    i12 += i10;
                }
                int i13 = (i11 - i12) % i10;
                if (i13 < 0) {
                    i13 += i10;
                }
                return i13 + i2;
            }
        }
        return i2;
    }

    public static int write(int i, byte[] bArr, int i2, isEndBoundary isendboundary) {
        int i3 = 2 % 2;
        int i4 = i & 127;
        int i5 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            int i6 = serializer + 37;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            isendboundary.IconCompatParcelizer = i4 | (b << 7);
            return i5;
        }
        int i8 = i4 | ((b & 127) << 7);
        int i9 = i2 + 2;
        byte b2 = bArr[i5];
        if (b2 >= 0) {
            isendboundary.IconCompatParcelizer = i8 | (b2 << 14);
            return i9;
        }
        int i10 = i8 | ((b2 & 127) << 14);
        int i11 = i2 + 3;
        byte b3 = bArr[i9];
        if (b3 >= 0) {
            int i12 = serializer + 13;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            isendboundary.IconCompatParcelizer = i10 | (b3 << 21);
            return i11;
        }
        int i14 = i10 | ((b3 & 127) << 21);
        int i15 = i2 + 4;
        byte b4 = bArr[i11];
        if (b4 >= 0) {
            isendboundary.IconCompatParcelizer = i14 | (b4 << 28);
            return i15;
        }
        while (true) {
            int i16 = i15 + 1;
            if (bArr[i15] >= 0) {
                isendboundary.IconCompatParcelizer = i14 | ((b4 & 127) << 28);
                return i16;
            }
            int i17 = IconCompatParcelizer + 121;
            serializer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            i15 = i16;
        }
    }

    public static String RemoteActionCompatParcelizer(File file) throws IOException {
        int i = 2 % 2;
        int i2 = serializer + 7;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (file != null) {
            int i5 = i3 + 5;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                file.exists();
                obj.hashCode();
                throw null;
            }
            if (file.exists() && file.isFile()) {
                int i6 = serializer + 25;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (file.canRead()) {
                    StringBuilder sb = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    try {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            sb.append(line);
                        }
                        while (true) {
                            String line2 = bufferedReader.readLine();
                            if (line2 == null) {
                                bufferedReader.close();
                                return sb.toString();
                            }
                            sb.append("\n");
                            sb.append(line2);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        isEndBoundary isendboundary = (isEndBoundary) objArr[2];
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 53;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = iIntValue + 1;
        byte b = bArr[iIntValue];
        if (b < 0) {
            return Integer.valueOf(write(b, bArr, i5, isendboundary));
        }
        int i6 = i2 + 33;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            isendboundary.IconCompatParcelizer = b;
            int i7 = 72 / 0;
        } else {
            isendboundary.IconCompatParcelizer = b;
        }
        int i8 = IconCompatParcelizer + 57;
        serializer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return Integer.valueOf(i5);
        }
        int i9 = 82 / 0;
        return Integer.valueOf(i5);
    }

    public static void RemoteActionCompatParcelizer(String str, GroupComponentwrappedListener1 groupComponentwrappedListener1) {
        int i = 2 % 2;
        int i2 = serializer + 95;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ConcurrentHashMap concurrentHashMap = getInvalidateListenerui.write;
        long j = groupComponentwrappedListener1.RatingCompat;
        AndroidShadowContext_androidKt androidShadowContext_androidKt = AndroidShadowContext_androidKt.QUANTITY;
        getInvalidateListenerui.write(str, "frozen_frames", j, androidShadowContext_androidKt);
        long j2 = groupComponentwrappedListener1.MediaBrowserCompatMediaItem;
        AndroidShadowContext_androidKt androidShadowContext_androidKt2 = AndroidShadowContext_androidKt.PERCENTAGE;
        getInvalidateListenerui.write(str, "frozen_frames_rate", j2, androidShadowContext_androidKt2);
        getInvalidateListenerui.write(str, "frozen_frame_rate", groupComponentwrappedListener1.MediaMetadataCompat, androidShadowContext_androidKt2);
        getInvalidateListenerui.write(str, "slow_frames", groupComponentwrappedListener1.IconCompatParcelizer, androidShadowContext_androidKt);
        getInvalidateListenerui.write(str, "slow_frames_rates", groupComponentwrappedListener1.read, androidShadowContext_androidKt2);
        getInvalidateListenerui.write(str, "slow_frame_rates", groupComponentwrappedListener1.RemoteActionCompatParcelizer, androidShadowContext_androidKt2);
        getInvalidateListenerui.write(str, "dynamic_slow_frames", groupComponentwrappedListener1.write, androidShadowContext_androidKt);
        getInvalidateListenerui.write(str, "dynamic_slow_frames_rate", groupComponentwrappedListener1.MediaDescriptionCompat, androidShadowContext_androidKt2);
        getInvalidateListenerui.write(str, "dynamic_slow_frame_rate", groupComponentwrappedListener1.serializer, androidShadowContext_androidKt2);
        getInvalidateListenerui.write(str, "total_frames", groupComponentwrappedListener1.MediaSessionCompatQueueItem, androidShadowContext_androidKt);
        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Performance-Rendering");
        int i4 = IconCompatParcelizer + 93;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static double bearing(Point point, Point point2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        double dDegreesToRadians = TurfConversion.degreesToRadians(point.longitude());
        double dDegreesToRadians2 = TurfConversion.degreesToRadians(point2.longitude());
        double dDegreesToRadians3 = TurfConversion.degreesToRadians(point.latitude());
        double dDegreesToRadians4 = TurfConversion.degreesToRadians(point2.latitude());
        double d = dDegreesToRadians2 - dDegreesToRadians;
        double dSin = Math.sin(d);
        double dCos = Math.cos(dDegreesToRadians4);
        double dCos2 = Math.cos(dDegreesToRadians3);
        double dSin2 = Math.sin(dDegreesToRadians4);
        double dSin3 = Math.sin(dDegreesToRadians3);
        double dAtan2 = ((Math.atan2(dCos * dSin, (dSin2 * dCos2) - (Math.cos(d) * (Math.cos(dDegreesToRadians4) * dSin3))) % 6.283185307179586d) * 180.0d) / 3.141592653589793d;
        int i4 = serializer + 1;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return dAtan2;
    }

    public static double distance(Point point, Point point2, String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        double dDegreesToRadians = TurfConversion.degreesToRadians(point2.latitude() - point.latitude());
        double dDegreesToRadians2 = TurfConversion.degreesToRadians(point2.longitude() - point.longitude());
        double dDegreesToRadians3 = TurfConversion.degreesToRadians(point.latitude());
        double dDegreesToRadians4 = TurfConversion.degreesToRadians(point2.latitude());
        double dPow = Math.pow(Math.sin(dDegreesToRadians / 2.0d), 2.0d);
        double dPow2 = Math.pow(Math.sin(dDegreesToRadians2 / 2.0d), 2.0d);
        double dCos = (Math.cos(dDegreesToRadians4) * Math.cos(dDegreesToRadians3) * dPow2) + dPow;
        double dDoubleValue = ((Double) TurfConversion.FACTORS.get(str)).doubleValue() * Math.atan2(Math.sqrt(dCos), Math.sqrt(1.0d - dCos)) * 2.0d;
        int i4 = IconCompatParcelizer + 1;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return dDoubleValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Point destination(Point point, double d, double d2, String str) {
        int i = 2 % 2;
        int i2 = serializer + 79;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        double dDegreesToRadians = TurfConversion.degreesToRadians(point.longitude());
        double dDegreesToRadians2 = TurfConversion.degreesToRadians(point.latitude());
        double dDegreesToRadians3 = TurfConversion.degreesToRadians(d2);
        double dDoubleValue = d / ((Double) TurfConversion.FACTORS.get(str)).doubleValue();
        double dSin = Math.sin(dDegreesToRadians2);
        double dCos = Math.cos(dDoubleValue);
        double dCos2 = Math.cos(dDegreesToRadians2);
        double dAsin = Math.asin((Math.cos(dDegreesToRadians3) * Math.sin(dDoubleValue) * dCos2) + (dCos * dSin));
        double dSin2 = Math.sin(dDegreesToRadians3);
        double dSin3 = Math.sin(dDoubleValue);
        Point pointFromLngLat = Point.fromLngLat((((Math.atan2(Math.cos(dDegreesToRadians2) * (dSin3 * dSin2), Math.cos(dDoubleValue) - (Math.sin(dAsin) * Math.sin(dDegreesToRadians2))) + dDegreesToRadians) % 6.283185307179586d) * 180.0d) / 3.141592653589793d, ((dAsin % 6.283185307179586d) * 180.0d) / 3.141592653589793d);
        int i4 = serializer + 25;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return pointFromLngLat;
    }

    public accesssetSpotShadowColor8_81llAjd RemoteActionCompatParcelizer(Context context, String str, WorkerParameters workerParameters) {
        int i = 2 % 2;
        context.getClass();
        str.getClass();
        accesssetSpotShadowColor8_81llAjd accesssetspotshadowcolor8_81llajdWrite = write(context, str, workerParameters);
        if (accesssetspotshadowcolor8_81llajdWrite == null) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(accesssetSpotShadowColor8_81llAjd.class);
                clsAsSubclass.getClass();
                try {
                    Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    objNewInstance.getClass();
                    accesssetspotshadowcolor8_81llajdWrite = (accesssetSpotShadowColor8_81llAjd) objNewInstance;
                    int i2 = IconCompatParcelizer + 49;
                    serializer = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                } catch (Throwable th) {
                    setRotationX.read().IconCompatParcelizer(setTransformOrigin__ExYCQ.IconCompatParcelizer, "Could not instantiate ".concat(str), th);
                    throw th;
                }
            } catch (Throwable th2) {
                setRotationX.read().IconCompatParcelizer(setTransformOrigin__ExYCQ.IconCompatParcelizer, "Invalid class: ".concat(str), th2);
                throw th2;
            }
        }
        if (accesssetspotshadowcolor8_81llajdWrite.IconCompatParcelizer) {
            throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        }
        int i4 = serializer + 123;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return accesssetspotshadowcolor8_81llajdWrite;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int IconCompatParcelizer(int i, byte[] bArr, int i2, int i3, getCoordinatesAccessedDuringModifierPlacement getcoordinatesaccessedduringmodifierplacement, isEndBoundary isendboundary) throws InvalidProtocolBufferException {
        Object obj;
        int iIconCompatParcelizer = i2;
        int i4 = 2 % 2;
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.read();
        }
        int i5 = IconCompatParcelizer;
        int i6 = i5 + 123;
        serializer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        int i8 = i & 7;
        if (i8 != 0) {
            int i9 = i5 + 49;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0 ? i8 == 1 : i8 == 0) {
                getcoordinatesaccessedduringmodifierplacement.serializer(i, Long.valueOf(RemoteActionCompatParcelizer(iIconCompatParcelizer, bArr)));
                return iIconCompatParcelizer + 8;
            }
            if (i8 == 2) {
                Object[] objArr = {bArr, Integer.valueOf(i2), isendboundary};
                int iIntValue = ((Integer) RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), objArr, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                int i10 = isendboundary.IconCompatParcelizer;
                if (i10 >= 0) {
                    int i11 = serializer + 39;
                    int i12 = i11 % Fields.SpotShadowColor;
                    IconCompatParcelizer = i12;
                    int i13 = i11 % 2;
                    if (i10 <= bArr.length - iIntValue) {
                        int i14 = i12 + 55;
                        serializer = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        if (i10 == 0) {
                            getcoordinatesaccessedduringmodifierplacement.serializer(i, setOnAttachui.IconCompatParcelizer);
                        } else {
                            getcoordinatesaccessedduringmodifierplacement.serializer(i, setOnAttachui.RemoteActionCompatParcelizer(bArr, iIntValue, i10));
                        }
                        return iIntValue + i10;
                    }
                    throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
                throw InvalidProtocolBufferException.write();
            }
            if (i8 != 3) {
                if (i8 == 5) {
                    getcoordinatesaccessedduringmodifierplacement.serializer(i, Integer.valueOf(serializer(iIconCompatParcelizer, bArr)));
                    return iIconCompatParcelizer + 4;
                }
                throw InvalidProtocolBufferException.read();
            }
            getCoordinatesAccessedDuringModifierPlacement getcoordinatesaccessedduringmodifierplacementWrite = getCoordinatesAccessedDuringModifierPlacement.write();
            int i16 = (i & (-8)) | 4;
            int i17 = 0;
            while (true) {
                obj = null;
                if (iIconCompatParcelizer >= i3) {
                    break;
                }
                int i18 = IconCompatParcelizer + 103;
                serializer = i18 % Fields.SpotShadowColor;
                if (i18 % 2 == 0) {
                    Object[] objArr2 = {bArr, Integer.valueOf(iIconCompatParcelizer), isendboundary};
                    int iIntValue2 = ((Integer) RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), objArr2, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                    int i19 = isendboundary.IconCompatParcelizer;
                    if (i19 == i16) {
                        iIconCompatParcelizer = iIntValue2;
                        i17 = i19;
                        break;
                    }
                    iIconCompatParcelizer = IconCompatParcelizer(i19, bArr, iIntValue2, i3, getcoordinatesaccessedduringmodifierplacementWrite, isendboundary);
                    i17 = i19;
                } else {
                    Object[] objArr3 = {bArr, Integer.valueOf(iIconCompatParcelizer), isendboundary};
                    ((Integer) RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), objArr3, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
                    int i20 = isendboundary.IconCompatParcelizer;
                    obj.hashCode();
                    throw null;
                }
            }
            int i21 = serializer;
            int i22 = i21 + 27;
            IconCompatParcelizer = i22 % Fields.SpotShadowColor;
            int i23 = i22 % 2;
            if (iIconCompatParcelizer > i3 || i17 != i16) {
                throw InvalidProtocolBufferException.RatingCompat();
            }
            int i24 = i21 + 97;
            IconCompatParcelizer = i24 % Fields.SpotShadowColor;
            if (i24 % 2 != 0) {
                getcoordinatesaccessedduringmodifierplacement.serializer(i, getcoordinatesaccessedduringmodifierplacementWrite);
                return iIconCompatParcelizer;
            }
            getcoordinatesaccessedduringmodifierplacement.serializer(i, getcoordinatesaccessedduringmodifierplacementWrite);
            obj.hashCode();
            throw null;
        }
        int iWrite = write(bArr, iIconCompatParcelizer, isendboundary);
        getcoordinatesaccessedduringmodifierplacement.serializer(i, Long.valueOf(isendboundary.read));
        return iWrite;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object performInTransactionSuspending(RoomDatabase roomDatabase, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) throws Throwable {
        getMagenta0d7_KjUannotations getmagenta0d7_kjuannotations;
        Object objUseConnection;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 25;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof getMagenta0d7_KjUannotations) {
            getmagenta0d7_kjuannotations = (getMagenta0d7_KjUannotations) continuationImpl;
            int i4 = getmagenta0d7_kjuannotations.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                getmagenta0d7_kjuannotations.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                getmagenta0d7_kjuannotations = new getMagenta0d7_KjUannotations(continuationImpl);
            }
        } else {
            getmagenta0d7_kjuannotations = new getMagenta0d7_KjUannotations(continuationImpl);
        }
        Object objSerializer = getmagenta0d7_kjuannotations.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = getmagenta0d7_kjuannotations.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
            int i6 = 0;
            if (roomDatabase.inCompatibilityMode()) {
                DBUtil__DBUtil_androidKt$performInTransactionSuspending$2 dBUtil__DBUtil_androidKt$performInTransactionSuspending$2 = new DBUtil__DBUtil_androidKt$performInTransactionSuspending$2(roomDatabase, r8lambdaunavo3sxub_pc9xroryotnrlvsm, shortNewsContentCardView, i6);
                getmagenta0d7_kjuannotations.IconCompatParcelizer = 1;
                Object objWithTransactionContext = Options.Companion.withTransactionContext(roomDatabase, getmagenta0d7_kjuannotations, dBUtil__DBUtil_androidKt$performInTransactionSuspending$2);
                if (objWithTransactionContext != coroutineSingletons) {
                    return objWithTransactionContext;
                }
            } else if (roomDatabase.inCompatibilityMode()) {
                int i7 = serializer + 107;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 33 / 0;
                    if (roomDatabase.isOpenInternal$room_runtime()) {
                        int i9 = serializer + 101;
                        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        if (roomDatabase.inTransaction()) {
                            NavHostKt$NavHost$29$1 navHostKt$NavHost$29$1 = new NavHostKt$NavHost$29$1(roomDatabase, null, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                            getmagenta0d7_kjuannotations.IconCompatParcelizer = 2;
                            objUseConnection = roomDatabase.useConnection(false, navHostKt$NavHost$29$1, getmagenta0d7_kjuannotations);
                            if (objUseConnection == coroutineSingletons) {
                                return objUseConnection;
                            }
                        }
                    }
                } else if (roomDatabase.isOpenInternal$room_runtime()) {
                    int i11 = serializer + 101;
                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    if (roomDatabase.inTransaction()) {
                        NavHostKt$NavHost$29$1 navHostKt$NavHost$29$2 = new NavHostKt$NavHost$29$1(roomDatabase, null, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                        getmagenta0d7_kjuannotations.IconCompatParcelizer = 2;
                        objUseConnection = roomDatabase.useConnection(false, navHostKt$NavHost$29$2, getmagenta0d7_kjuannotations);
                        if (objUseConnection == coroutineSingletons) {
                            return objUseConnection;
                        }
                    }
                }
                getmagenta0d7_kjuannotations.read = roomDatabase;
                getmagenta0d7_kjuannotations.write = (SuspendLambda) r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                getmagenta0d7_kjuannotations.IconCompatParcelizer = 3;
                objSerializer = serializer(roomDatabase, true, (ContinuationImpl) getmagenta0d7_kjuannotations);
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                if (objSerializer != coroutineSingletons) {
                }
            } else {
                getmagenta0d7_kjuannotations.read = roomDatabase;
                getmagenta0d7_kjuannotations.write = (SuspendLambda) r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                getmagenta0d7_kjuannotations.IconCompatParcelizer = 3;
                objSerializer = serializer(roomDatabase, true, (ContinuationImpl) getmagenta0d7_kjuannotations);
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                if (objSerializer != coroutineSingletons) {
                }
            }
        }
        if (i5 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
            return objSerializer;
        }
        int i13 = IconCompatParcelizer + 37;
        int i14 = i13 % Fields.SpotShadowColor;
        serializer = i14;
        if (i13 % 2 == 0 ? i5 == 2 : i5 == 4) {
            ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
            return objSerializer;
        }
        int i15 = i14 + 65;
        IconCompatParcelizer = i15 % Fields.SpotShadowColor;
        int i16 = i15 % 2;
        if (i5 != 3) {
            int i17 = i14 + 21;
            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            if (i5 == 4) {
                ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
                return objSerializer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) getmagenta0d7_kjuannotations.write;
        roomDatabase = getmagenta0d7_kjuannotations.read;
        ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        RealImageLoader$execute$2$job$1 realImageLoader$execute$2$job$1 = new RealImageLoader$execute$2$job$1(roomDatabase, (ShortNewsContentCardView) null, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
        getmagenta0d7_kjuannotations.read = null;
        getmagenta0d7_kjuannotations.write = null;
        getmagenta0d7_kjuannotations.IconCompatParcelizer = 4;
        Object objWithContext = BuildersKt.withContext((TextAnnouncementContentCardView) objSerializer, realImageLoader$execute$2$job$1, getmagenta0d7_kjuannotations);
        return objWithContext == coroutineSingletons ? coroutineSingletons : objWithContext;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    public static final Object performSuspending(RoomDatabase roomDatabase, boolean z, boolean z2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        getGray0d7_KjUannotations getgray0d7_kjuannotations;
        boolean z3;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        RoomDatabase roomDatabase2;
        boolean z4;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 113;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (shortNewsContentCardView instanceof getGray0d7_KjUannotations) {
            getgray0d7_kjuannotations = (getGray0d7_KjUannotations) shortNewsContentCardView;
            int i4 = getgray0d7_kjuannotations.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = serializer + 19;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                getgray0d7_kjuannotations.write = i4 - Integer.MIN_VALUE;
            } else {
                getgray0d7_kjuannotations = new getGray0d7_KjUannotations(shortNewsContentCardView);
                int i7 = IconCompatParcelizer + 119;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        } else {
            getgray0d7_kjuannotations = new getGray0d7_KjUannotations(shortNewsContentCardView);
            int i9 = IconCompatParcelizer + 119;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        getGray0d7_KjUannotations getgray0d7_kjuannotations2 = getgray0d7_kjuannotations;
        Object objSerializer = getgray0d7_kjuannotations2.MediaMetadataCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = getgray0d7_kjuannotations2.write;
        if (i11 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
            if (!roomDatabase.inCompatibilityMode()) {
                getgray0d7_kjuannotations2.RemoteActionCompatParcelizer = roomDatabase;
                getgray0d7_kjuannotations2.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                getgray0d7_kjuannotations2.read = z;
                getgray0d7_kjuannotations2.IconCompatParcelizer = z2;
                getgray0d7_kjuannotations2.write = 2;
                objSerializer = serializer(roomDatabase, z2, getgray0d7_kjuannotations2);
                if (objSerializer != coroutineSingletons) {
                    z3 = z2;
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                    roomDatabase2 = roomDatabase;
                    z4 = z;
                }
            } else {
                int i12 = serializer + 9;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (roomDatabase.isOpenInternal$room_runtime() && roomDatabase.inTransaction()) {
                    DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(z2, z, roomDatabase, null, r8lambdaunavo3sxub_pc9xroryotnrlvsm, 0);
                    getgray0d7_kjuannotations2.write = 1;
                    Object objUseConnection = roomDatabase.useConnection(z, dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1, getgray0d7_kjuannotations2);
                    if (objUseConnection != coroutineSingletons) {
                        return objUseConnection;
                    }
                } else {
                    getgray0d7_kjuannotations2.RemoteActionCompatParcelizer = roomDatabase;
                    getgray0d7_kjuannotations2.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                    getgray0d7_kjuannotations2.read = z;
                    getgray0d7_kjuannotations2.IconCompatParcelizer = z2;
                    getgray0d7_kjuannotations2.write = 2;
                    objSerializer = serializer(roomDatabase, z2, getgray0d7_kjuannotations2);
                    if (objSerializer != coroutineSingletons) {
                        z3 = z2;
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                        roomDatabase2 = roomDatabase;
                        z4 = z;
                    }
                }
            }
        }
        int i14 = IconCompatParcelizer;
        int i15 = i14 + 41;
        serializer = i15 % Fields.SpotShadowColor;
        int i16 = i15 % 2;
        if (i11 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
            return objSerializer;
        }
        if (i11 != 2) {
            int i17 = i14 + 59;
            serializer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 == 0 ? i11 != 3 : i11 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i18 = i14 + 115;
            serializer = i18 % Fields.SpotShadowColor;
            if (i18 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
                return objSerializer;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
            throw null;
        }
        boolean z5 = getgray0d7_kjuannotations2.IconCompatParcelizer;
        boolean z6 = getgray0d7_kjuannotations2.read;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = getgray0d7_kjuannotations2.serializer;
        RoomDatabase roomDatabase3 = getgray0d7_kjuannotations2.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
        z3 = z5;
        z4 = z6;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        roomDatabase2 = roomDatabase3;
        DBUtil__DBUtil_androidKt$performBlocking$1.AnonymousClass1 anonymousClass1 = new DBUtil__DBUtil_androidKt$performBlocking$1.AnonymousClass1((ShortNewsContentCardView) null, roomDatabase2, z4, z3, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
        getgray0d7_kjuannotations2.RemoteActionCompatParcelizer = null;
        getgray0d7_kjuannotations2.serializer = null;
        getgray0d7_kjuannotations2.write = 3;
        Object objWithContext = BuildersKt.withContext((TextAnnouncementContentCardView) objSerializer, anonymousClass1, getgray0d7_kjuannotations2);
        return objWithContext == coroutineSingletons ? coroutineSingletons : objWithContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r1.isFile() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r2 = kotlin.TuplesKt.serializer + 39;
        kotlin.TuplesKt.IconCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if ((r2 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r5 = 18 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r1.canRead() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r1.canRead() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r1.length() > r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        r6 = new java.io.FileInputStream(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        r7 = new java.io.BufferedInputStream(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r8 = new java.io.ByteArrayOutputStream();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        r1 = new byte[androidx.compose.ui.graphics.Fields.RotationZ];
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        r2 = r7.read(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r2 == (-1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        r8.write(r1, 0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        r0 = r8.toByteArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        r8 = kotlin.TuplesKt.serializer + 93;
        kotlin.TuplesKt.IconCompatParcelizer = r8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        r1.addSuppressed(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0092, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0093, code lost:
    
        r8.addSuppressed(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009d, code lost:
    
        r7.addSuppressed(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bc, code lost:
    
        throw new java.io.IOException(java.lang.String.format("Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.", r8, java.lang.Long.valueOf(r1.length()), java.lang.Long.valueOf(r6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bd, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.serializer(bo.app.ff$$ExternalSyntheticOutline0.m("Reading the item ", r8, " failed, because can't read the file."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.serializer(bo.app.ff$$ExternalSyntheticOutline0.m("Reading path ", r8, " failed, because it's not a file."));
        r6 = kotlin.TuplesKt.serializer + 41;
        kotlin.TuplesKt.IconCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dd, code lost:
    
        if ((r6 % 2) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00df, code lost:
    
        r6 = 92 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r1.isFile() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] serializer(long r6, java.lang.String r8) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TuplesKt.serializer(long, java.lang.String):byte[]");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:102:0x0205  */
    /* JADX WARN: Code duplicated, block: B:124:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0065 A[EDGE_INSN: B:126:0x0065->B:22:0x0065 BREAK  A[LOOP:2: B:16:0x004e->B:20:0x005d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:2: B:16:0x004e->B:20:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:58:0x0121  */
    /* JADX WARN: Code duplicated, block: B:61:0x012d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132  */
    /* JADX WARN: Code duplicated, block: B:64:0x013a  */
    /* JADX WARN: Code duplicated, block: B:65:0x013f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0147  */
    /* JADX WARN: Code duplicated, block: B:69:0x0150  */
    /* JADX WARN: Code duplicated, block: B:71:0x0159  */
    /* JADX WARN: Code duplicated, block: B:72:0x015f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0167  */
    /* JADX WARN: Code duplicated, block: B:75:0x0176  */
    /* JADX WARN: Code duplicated, block: B:77:0x017e  */
    /* JADX WARN: Code duplicated, block: B:78:0x018e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0196  */
    /* JADX WARN: Code duplicated, block: B:81:0x019c  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01af  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fa  */
    public static getMessageIconView write(resetMessageMarginslambda00 resetmessagemarginslambda00) {
        int i;
        int length;
        int length2;
        String string;
        int i2;
        String string2;
        int i3;
        int i4;
        int iWrite;
        int i5;
        int i6 = 2 % 2;
        resetmessagemarginslambda00.getClass();
        int iRemoteActionCompatParcelizer = resetmessagemarginslambda00.RemoteActionCompatParcelizer();
        int i7 = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int iWrite2 = -1;
        int iWrite3 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int iWrite4 = -1;
        int i8 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i7 < iRemoteActionCompatParcelizer) {
            String strSerializer = resetmessagemarginslambda00.serializer(i7);
            String str2 = resetmessagemarginslambda00.read(i7);
            if (strSerializer.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = str2;
                }
                for (i = 0; i < str2.length(); i = i2) {
                    length = str2.length();
                    length2 = i;
                    while (true) {
                        if (length2 < length) {
                            length2 = str2.length();
                            break;
                        }
                        if (hideCurrentlyDisplayingInAppMessage.read("=,;", str2.charAt(length2))) {
                            break;
                        }
                        length2++;
                    }
                    string = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str2.substring(i, length2)).toString();
                    if (length2 != str2.length()) {
                        i5 = serializer + 47;
                        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                        if (i5 % 2 == 0 ? str2.charAt(length2) == ',' : str2.charAt(length2) == 7) {
                            i2 = length2 + 1;
                            string2 = null;
                        } else if (str2.charAt(length2) == ';') {
                            i2 = length2 + 1;
                            string2 = null;
                        } else {
                            int length3 = length2 + 1;
                            byte[] bArr = InAppMessageHtmlBaseViewCompanion.read;
                            int length4 = str2.length();
                            while (true) {
                                if (length3 >= length4) {
                                    length3 = str2.length();
                                    int i9 = serializer + 25;
                                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                                    if (i9 % 2 != 0) {
                                        break;
                                    }
                                    int i10 = 3 % 2;
                                    break;
                                }
                                char cCharAt = str2.charAt(length3);
                                if (cCharAt != ' ') {
                                    int i11 = serializer + 119;
                                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                                    int i12 = i11 % 2;
                                    if (cCharAt != '\t') {
                                        break;
                                    }
                                }
                                length3++;
                            }
                            if (length3 >= str2.length() || str2.charAt(length3) != '\"') {
                                int length5 = str2.length();
                                int length6 = length3;
                                while (true) {
                                    if (length6 >= length5) {
                                        length6 = str2.length();
                                        break;
                                    }
                                    if (hideCurrentlyDisplayingInAppMessage.read(",;", str2.charAt(length6))) {
                                        break;
                                    }
                                    length6++;
                                }
                                int i13 = length6;
                                string2 = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str2.substring(length3, length6)).toString();
                                i2 = i13;
                            } else {
                                int i14 = length3 + 1;
                                int iWrite5 = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str2, '\"', i14, false, 4);
                                string2 = str2.substring(i14, iWrite5);
                                i2 = iWrite5 + 1;
                            }
                        }
                    } else {
                        i2 = length2 + 1;
                        string2 = null;
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z3 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iWrite2 = InAppMessageHtmlBaseViewCompanion.write(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iWrite3 = InAppMessageHtmlBaseViewCompanion.write(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        int i15 = serializer + 43;
                        IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        z4 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        int i17 = IconCompatParcelizer + 99;
                        serializer = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        z5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z6 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iWrite4 = InAppMessageHtmlBaseViewCompanion.write(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        i4 = IconCompatParcelizer + 37;
                        serializer = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 != 0) {
                            iWrite = InAppMessageHtmlBaseViewCompanion.write(-1, string2);
                            int i19 = 49 / 0;
                        } else {
                            iWrite = InAppMessageHtmlBaseViewCompanion.write(-1, string2);
                        }
                        i8 = iWrite;
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z7 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        i3 = IconCompatParcelizer + 19;
                        serializer = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 != 0) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z9 = true;
                    }
                }
                i7++;
                int i20 = serializer + 81;
                IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
            } else {
                if (strSerializer.equalsIgnoreCase("Pragma")) {
                }
                i7++;
                int i22 = serializer + 81;
                IconCompatParcelizer = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
            }
            z = false;
            while (i < str2.length()) {
                length = str2.length();
                length2 = i;
                while (true) {
                    if (length2 < length) {
                        length2 = str2.length();
                        break;
                    }
                    if (hideCurrentlyDisplayingInAppMessage.read("=,;", str2.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                }
                string = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str2.substring(i, length2)).toString();
                if (length2 != str2.length()) {
                    i5 = serializer + 47;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                    }
                    i2 = length2 + 1;
                    string2 = null;
                } else {
                    i2 = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z2 = true;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z3 = true;
                } else if ("max-age".equalsIgnoreCase(string)) {
                    iWrite2 = InAppMessageHtmlBaseViewCompanion.write(-1, string2);
                } else if ("s-maxage".equalsIgnoreCase(string)) {
                    iWrite3 = InAppMessageHtmlBaseViewCompanion.write(-1, string2);
                } else if ("private".equalsIgnoreCase(string)) {
                    int i110 = serializer + 43;
                    IconCompatParcelizer = i110 % Fields.SpotShadowColor;
                    int i111 = i110 % 2;
                    z4 = true;
                } else if ("public".equalsIgnoreCase(string)) {
                    int i112 = IconCompatParcelizer + 99;
                    serializer = i112 % Fields.SpotShadowColor;
                    int i113 = i112 % 2;
                    z5 = true;
                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                    z6 = true;
                } else if ("max-stale".equalsIgnoreCase(string)) {
                    iWrite4 = InAppMessageHtmlBaseViewCompanion.write(Integer.MAX_VALUE, string2);
                } else if ("min-fresh".equalsIgnoreCase(string)) {
                    i4 = IconCompatParcelizer + 37;
                    serializer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        iWrite = InAppMessageHtmlBaseViewCompanion.write(-1, string2);
                        int i114 = 49 / 0;
                    } else {
                        iWrite = InAppMessageHtmlBaseViewCompanion.write(-1, string2);
                    }
                    i8 = iWrite;
                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                    z7 = true;
                } else if ("no-transform".equalsIgnoreCase(string)) {
                    i3 = IconCompatParcelizer + 19;
                    serializer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                } else if ("immutable".equalsIgnoreCase(string)) {
                    z9 = true;
                }
            }
            i7++;
            int i24 = serializer + 81;
            IconCompatParcelizer = i24 % Fields.SpotShadowColor;
            int i25 = i24 % 2;
        }
        return new getMessageIconView(z2, z3, iWrite2, iWrite3, z4, z5, z6, iWrite4, i8, z7, z8, z9, !z ? null : str);
    }

    public static void IconCompatParcelizer(String str, boolean z) {
        Object[] objArr = {str, Boolean.valueOf(z)};
        RemoteActionCompatParcelizer(503622116, getSelectionEndui_text.IconCompatParcelizer(), objArr, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -503622113);
    }

    public static String RemoteActionCompatParcelizer(String str, String[] strArr, String[] strArr2) {
        return (String) RemoteActionCompatParcelizer(1514272013, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{str, strArr, strArr2}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -1514272013);
    }

    public static String RemoteActionCompatParcelizer(Context context, String str) {
        return (String) RemoteActionCompatParcelizer(-1772022421, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{context, str}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 1772022425);
    }

    public static final onViewAttachedToWindowlambda0 write(Object obj, String str) {
        return (onViewAttachedToWindowlambda0) RemoteActionCompatParcelizer(175346517, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{obj, str}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -175346516);
    }

    public static void IconCompatParcelizer(Context context, GmsRpc gmsRpc, boolean z) {
        Object[] objArr = {context, gmsRpc, Boolean.valueOf(z)};
        RemoteActionCompatParcelizer(1419546143, getSelectionEndui_text.IconCompatParcelizer(), objArr, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -1419546138);
    }

    public static boolean RemoteActionCompatParcelizer(char c) {
        Object[] objArr = {Character.valueOf(c)};
        return ((Boolean) RemoteActionCompatParcelizer(2031304659, getSelectionEndui_text.IconCompatParcelizer(), objArr, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -2031304657)).booleanValue();
    }

    public static int write(int i, byte[] bArr, int i2, int i3, LayoutNodeCompanionErrorMeasurePolicy1 layoutNodeCompanionErrorMeasurePolicy1, isEndBoundary isendboundary) {
        Object[] objArr = {Integer.valueOf(i), bArr, Integer.valueOf(i2), Integer.valueOf(i3), layoutNodeCompanionErrorMeasurePolicy1, isendboundary};
        return ((Integer) RemoteActionCompatParcelizer(276612930, getSelectionEndui_text.IconCompatParcelizer(), objArr, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -276612922)).intValue();
    }

    public static int read(byte[] bArr, int i, isEndBoundary isendboundary) {
        Object[] objArr = {bArr, Integer.valueOf(i), isendboundary};
        return ((Integer) RemoteActionCompatParcelizer(-806706614, getSelectionEndui_text.IconCompatParcelizer(), objArr, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 806706620)).intValue();
    }

    public static int RemoteActionCompatParcelizer(byte[] bArr, int i, isEndBoundary isendboundary) {
        Object[] objArr = {bArr, Integer.valueOf(i), isendboundary};
        return ((Integer) RemoteActionCompatParcelizer(622484807, getSelectionEndui_text.IconCompatParcelizer(), objArr, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -622484800)).intValue();
    }
}
