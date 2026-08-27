package coil3.memory;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.runtime.MultiSubscriptionSnapshotFlowManager;
import androidx.compose.ui.graphics.Fields;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.emoji2.text.EmojiProcessor;
import androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2;
import androidx.sqlite.SQLite;
import androidx.work.impl.WorkManagerImpl;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.ImageLoader$Builder;
import coil3.RealImageLoader;
import coil3.UriKt;
import com.bumptech.glide.load.engine.DecodeJob;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.hits.PerseusWorker;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.material.internal.ViewUtils$$ExternalSyntheticLambda0;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.BlurFilter;
import o.C0165focusRequester;
import o.C0172getimpl;
import o.CSSParseException;
import o.Colordefault;
import o.DrawableTransformation;
import o.FocusPropertiesImpl;
import o.FocusPropertiesNode;
import o.FocusRequesterKt;
import o.FocusRequesterModifier;
import o.FocusRequesterModifierKt;
import o.FocusRequesterModifierNode;
import o.FocusRequesterModifierNodeKt;
import o.FocusRequesterNode;
import o.GroupComponent;
import o.HttpUrlFetcher;
import o.ImageBitmapConfigCompanion;
import o.LinearGradientShaderVjE6UOU;
import o.LinearGradientShaderVjE6UOUdefault;
import o.LookaheadScopeImpl;
import o.LookaheadScopeKt;
import o.LookaheadScopeKtLookaheadScope221;
import o.LookaheadScopeKtLookaheadScope4;
import o.MeasureScopeDefaultImpls;
import o.NoWindowInsetsAnimation;
import o.PathDefaultImpls;
import o.RadialGradient;
import o.RectHelper_androidKt;
import o.RecyclableBufferedInputStream;
import o.ShaderKt;
import o.ShadowCompanion;
import o.SnapFlingBehavior;
import o.StrokeCompanion;
import o.SubcomposeLayoutStatesetRoot1;
import o.TransformGestureDetectorKtdetectTransformGestures2;
import o.accessgetBevelcp;
import o.accessgetLayerBlockp;
import o.accessgetNumPadInsertcp;
import o.accessgetPointscp;
import o.accessiteratorjd;
import o.accessquadraticTojd;
import o.accessrewindjd;
import o.accesssetColorFilterjd;
import o.accessunpack;
import o.boundsUpdatesEventLoopui;
import o.compositeComponent;
import o.copyeZhPAX0;
import o.copyqcb84PMdefault;
import o.findFocusTargetui;
import o.getBlurRadius;
import o.getBlurRadiusannotations;
import o.getBrush;
import o.getButtonThumbLeftEK5gGoQ;
import o.getButtonZEK5gGoQ;
import o.getCieXyz;
import o.getContentCaptureSessionuiannotations;
import o.getDirectionRightEK5gGoQ;
import o.getExponentimpl;
import o.getFocusEK5gGoQ;
import o.getFocusRequester;
import o.getInAppMessageEventMap;
import o.getInvalidateListenerui;
import o.getMeasuredWidth;
import o.getNoneannotations;
import o.getOffsetF1C5BW0;
import o.getOnContentCaptureSession;
import o.getPointsr_lszbg;
import o.getPolygonr_lszbg;
import o.getPositiveZeroslo4al4;
import o.getPowersOfTen;
import o.getQueryParameterslambda2;
import o.getRadiusui_graphics;
import o.getSafeGestures;
import o.getUnregisteredInAppMessageannotations;
import o.getWillClipPath;
import o.handleUrlOverridelambda1;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isCaptured;
import o.logUnregisterActivitylambda1;
import o.markNotTintable;
import o.onContentCardDismissed;
import o.onKeyDown;
import o.onLayoutRectChanged;
import o.onViewAttachedToWindowlambda0;
import o.parseGroup;
import o.pinFocusedChild;
import o.premeasure0kLqBqw;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdahgODiqgPByAI8PyoNAxx8PBqX4;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.relocationOffsetfbGrOKE;
import o.removeNodeAtDepth;
import o.resizeGraphicFrameIfAppropriate;
import o.scale0AR0LA0default;
import o.scaledefault;
import o.setButtonDrawable;
import o.setOutlineui;
import o.setRight;
import o.setRotationY;
import o.startActivityForResult;
import o.startUpdater;
import o.tintxETnrds;
import o.toAndroidRect;
import o.toComposeRect;
import o.truncslo4al4;
import o.widthInVpY3zN4default;
import okio.Options;
import okio.Path$Companion;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public class MemoryCacheService implements FocusPropertiesImpl, widthInVpY3zN4default, isCaptured, Colordefault, getPositiveZeroslo4al4, StrokeCompanion, getDirectionRightEK5gGoQ, accessgetNumPadInsertcp, onLayoutRectChanged, getSafeGestures {
    private static int IconCompatParcelizer = 0;
    public static volatile MemoryCacheService read = null;
    private static int serializer = 1;
    public Object RemoteActionCompatParcelizer;

    @Override // o.Colordefault
    public boolean MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = serializer + 15;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 105;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b A[PHI: r10
  0x004b: PHI (r10v1 int) = (r10v0 int), (r10v4 int), (r10v5 int) binds: [B:5:0x0016, B:15:0x0036, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    public MemoryCacheService(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int length = fArr.length - 1;
        SnapFlingBehavior[][] snapFlingBehaviorArr = new SnapFlingBehavior[length][];
        int i2 = 2 % 2;
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length) {
            int i6 = iArr[i5];
            int i7 = 3;
            if (i6 != 0) {
                int i8 = serializer + 71;
                int i9 = i8 % Fields.SpotShadowColor;
                IconCompatParcelizer = i9;
                int i10 = i8 % 2;
                if (i6 != 1) {
                    int i11 = i9 + 45;
                    serializer = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 != 0 ? i6 != 2 : i6 != 2) {
                        if (i6 != 3) {
                            i7 = 4;
                            if (i6 != 4) {
                                i7 = 5;
                                if (i6 != 5) {
                                    int i12 = i9 + 5;
                                    serializer = i12 % Fields.SpotShadowColor;
                                    int i13 = i12 % 2;
                                } else {
                                    i4 = i7;
                                    int i14 = IconCompatParcelizer + 115;
                                    serializer = i14 % Fields.SpotShadowColor;
                                    int i15 = i14 % 2;
                                }
                            } else {
                                i4 = i7;
                                int i16 = IconCompatParcelizer + 115;
                                serializer = i16 % Fields.SpotShadowColor;
                                int i17 = i16 % 2;
                            }
                            i = i4;
                        } else if (i3 != 1) {
                            i3 = 1;
                        }
                    }
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                i = i3;
            } else {
                i4 = i7;
                int i18 = IconCompatParcelizer + 115;
                serializer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                i = i4;
            }
            float[] fArr3 = fArr2[i5];
            int i20 = i5 + 1;
            float[] fArr4 = fArr2[i20];
            float f = fArr[i5];
            float f2 = fArr[i20];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            SnapFlingBehavior[] snapFlingBehaviorArr2 = new SnapFlingBehavior[length2];
            int i21 = 0;
            while (i21 < length2) {
                int i22 = i21 * 2;
                int i23 = i22 + 1;
                int i24 = i21;
                SnapFlingBehavior[] snapFlingBehaviorArr3 = snapFlingBehaviorArr2;
                snapFlingBehaviorArr3[i24] = new SnapFlingBehavior(i, f, f2, fArr3[i22], fArr3[i23], fArr4[i22], fArr4[i23]);
                i21 = i24 + 1;
                snapFlingBehaviorArr2 = snapFlingBehaviorArr3;
                length2 = length2;
                fArr3 = fArr3;
            }
            snapFlingBehaviorArr[i5] = snapFlingBehaviorArr2;
            i4 = i;
            i5 = i20;
        }
        this.RemoteActionCompatParcelizer = snapFlingBehaviorArr;
    }

    public RadialGradient RemoteActionCompatParcelizer(ShaderKt shaderKt, accessgetPointscp accessgetpointscp, accessgetLayerBlockp accessgetlayerblockp, getBlurRadius getblurradius) {
        RadialGradient radialGradient;
        accessgetLayerBlockp accessgetlayerblockp2;
        int iAbs;
        setOutlineui setoutlineui = shaderKt.ResultReceiver;
        getNoneannotations getnoneannotations = shaderKt.ComponentActivity;
        if (setoutlineui.getReadEnabled()) {
            getRadiusui_graphics getradiusui_graphicsWrite = ((RealImageLoader) this.RemoteActionCompatParcelizer).write();
            if (getradiusui_graphicsWrite != null) {
                synchronized (getradiusui_graphicsWrite.RemoteActionCompatParcelizer) {
                    RectHelper_androidKt rectHelper_androidKt = (RectHelper_androidKt) ((LinkedHashMap) getradiusui_graphicsWrite.IconCompatParcelizer.RemoteActionCompatParcelizer.serializer).get(accessgetpointscp);
                    radialGradient = rectHelper_androidKt != null ? new RadialGradient(rectHelper_androidKt.read, rectHelper_androidKt.RemoteActionCompatParcelizer) : null;
                    if (radialGradient == null) {
                        CSSParseException cSSParseException = getradiusui_graphicsWrite.serializer;
                        ArrayList arrayList = (ArrayList) ((LinkedHashMap) cSSParseException.RemoteActionCompatParcelizer).get(accessgetpointscp);
                        if (arrayList == null) {
                            radialGradient = null;
                        } else {
                            int size = arrayList.size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    radialGradient = null;
                                    break;
                                }
                                toComposeRect tocomposerect = (toComposeRect) arrayList.get(i);
                                accessrewindjd accessrewindjdVar = (accessrewindjd) tocomposerect.IconCompatParcelizer().get();
                                RadialGradient radialGradient2 = accessrewindjdVar != null ? new RadialGradient(accessrewindjdVar, tocomposerect.RemoteActionCompatParcelizer()) : null;
                                if (radialGradient2 != null) {
                                    radialGradient = radialGradient2;
                                    break;
                                }
                                i++;
                            }
                            cSSParseException.serializer();
                        }
                    }
                    if (radialGradient != null && !radialGradient.IconCompatParcelizer.serializer()) {
                        synchronized (getradiusui_graphicsWrite.RemoteActionCompatParcelizer) {
                            toAndroidRect toandroidrect = getradiusui_graphicsWrite.IconCompatParcelizer.RemoteActionCompatParcelizer;
                            Object objRemove = ((LinkedHashMap) toandroidrect.serializer).remove(accessgetpointscp);
                            if (objRemove != null) {
                                toandroidrect.write = toandroidrect.RemoteActionCompatParcelizer() - toandroidrect.serializer(accessgetpointscp, objRemove);
                                toandroidrect.IconCompatParcelizer(accessgetpointscp, objRemove, null);
                            }
                            ((LinkedHashMap) getradiusui_graphicsWrite.serializer.RemoteActionCompatParcelizer).remove(accessgetpointscp);
                        }
                    }
                }
            } else {
                radialGradient = null;
            }
            if (radialGradient != null) {
                accessrewindjd accessrewindjdVar2 = radialGradient.IconCompatParcelizer;
                boolean z = accessrewindjdVar2 instanceof accessiteratorjd;
                accessiteratorjd accessiteratorjdVar = z ? (accessiteratorjd) accessrewindjdVar2 : null;
                if (accessiteratorjdVar != null) {
                    Bitmap.Config config = accessiteratorjdVar.serializer.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    if (config == Bitmap.Config.HARDWARE) {
                        if (!((Boolean) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{shaderKt, LinearGradientShaderVjE6UOU.serializer})).booleanValue()) {
                            return null;
                        }
                    }
                }
                String str = (String) accessgetpointscp.read.get("coil#size");
                if (str != null) {
                    if (str.equals(accessgetlayerblockp.toString())) {
                        return radialGradient;
                    }
                } else {
                    Object obj = radialGradient.read.get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    if (bool == null || !bool.booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{accessgetlayerblockp, accessgetLayerBlockp.serializer}, getCieXyz.write())).booleanValue() && getnoneannotations != getNoneannotations.INEXACT) {
                        }
                        return radialGradient;
                    }
                    int iRemoteActionCompatParcelizer = accessrewindjdVar2.RemoteActionCompatParcelizer();
                    int iIconCompatParcelizer = accessrewindjdVar2.IconCompatParcelizer();
                    if (z) {
                        accessgetlayerblockp2 = (accessgetLayerBlockp) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{shaderKt, LinearGradientShaderVjE6UOUdefault.write});
                    } else {
                        accessgetlayerblockp2 = accessgetLayerBlockp.serializer;
                    }
                    copyqcb84PMdefault copyqcb84pmdefault = accessgetlayerblockp.IconCompatParcelizer;
                    int i2 = copyqcb84pmdefault instanceof ShadowCompanion ? ((ShadowCompanion) copyqcb84pmdefault).serializer : Integer.MAX_VALUE;
                    copyqcb84PMdefault copyqcb84pmdefault2 = accessgetlayerblockp2.IconCompatParcelizer;
                    int iMin = Math.min(i2, copyqcb84pmdefault2 instanceof ShadowCompanion ? ((ShadowCompanion) copyqcb84pmdefault2).serializer : Integer.MAX_VALUE);
                    copyqcb84PMdefault copyqcb84pmdefault3 = accessgetlayerblockp.read;
                    int i3 = copyqcb84pmdefault3 instanceof ShadowCompanion ? ((ShadowCompanion) copyqcb84pmdefault3).serializer : Integer.MAX_VALUE;
                    copyqcb84PMdefault copyqcb84pmdefault4 = accessgetlayerblockp2.read;
                    int iMin2 = Math.min(i3, copyqcb84pmdefault4 instanceof ShadowCompanion ? ((ShadowCompanion) copyqcb84pmdefault4).serializer : Integer.MAX_VALUE);
                    double d = ((double) iMin) / ((double) iRemoteActionCompatParcelizer);
                    double d2 = ((double) iMin2) / ((double) iIconCompatParcelizer);
                    int i4 = getPolygonr_lszbg.read[((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? getBlurRadius.FIT : getblurradius).ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        if (d < d2) {
                            iAbs = Math.abs(iMin - iRemoteActionCompatParcelizer);
                        } else {
                            iAbs = Math.abs(iMin2 - iIconCompatParcelizer);
                            d = d2;
                        }
                    } else if (d > d2) {
                        iAbs = Math.abs(iMin - iRemoteActionCompatParcelizer);
                    } else {
                        iAbs = Math.abs(iMin2 - iIconCompatParcelizer);
                        d = d2;
                    }
                    if (iAbs > 1) {
                        int i5 = getPolygonr_lszbg.IconCompatParcelizer[getnoneannotations.ordinal()];
                        if (i5 != 1) {
                            if (i5 != 2) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return null;
                            }
                            if (d <= 1.0d) {
                            }
                        } else if (d == 1.0d) {
                        }
                    }
                    return radialGradient;
                }
            }
        }
        return null;
    }

    @Override // o.size3ABfNKs
    public long RemoteActionCompatParcelizer(TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long jRemoteActionCompatParcelizer = ((ImageLoader$Builder) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, transformGestureDetectorKtdetectTransformGestures4);
        int i4 = IconCompatParcelizer + 65;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return jRemoteActionCompatParcelizer;
    }

    @Override // o.widthInVpY3zN4default, o.size3ABfNKs
    public boolean l_() {
        int i = 2 % 2;
        int i2 = serializer + 87;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((ImageLoader$Builder) this.RemoteActionCompatParcelizer).getClass();
        int i4 = serializer + 55;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.size3ABfNKs
    public TransformGestureDetectorKtdetectTransformGestures2 write(TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2Write = ((ImageLoader$Builder) this.RemoteActionCompatParcelizer).write(transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, transformGestureDetectorKtdetectTransformGestures4);
        int i4 = IconCompatParcelizer + 123;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return transformGestureDetectorKtdetectTransformGestures2Write;
        }
        throw null;
    }

    @Override // o.getPositiveZeroslo4al4
    public String[] write() {
        int i = 2 % 2;
        int i2 = serializer + 49;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String[] supportedFeatures = ((WebViewProviderFactoryBoundaryInterface) this.RemoteActionCompatParcelizer).getSupportedFeatures();
        int i4 = serializer + 3;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return supportedFeatures;
    }

    @Override // o.accessgetNumPadInsertcp
    public /* synthetic */ void write(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((LocationCallback) obj).onLocationResult((LocationResult) this.RemoteActionCompatParcelizer);
        int i4 = serializer + 105;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.size3ABfNKs
    public TransformGestureDetectorKtdetectTransformGestures2 read(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        int i = 2 % 2;
        int i2 = serializer + 89;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ((ImageLoader$Builder) this.RemoteActionCompatParcelizer).read(j, transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, transformGestureDetectorKtdetectTransformGestures4);
        }
        ((ImageLoader$Builder) this.RemoteActionCompatParcelizer).read(j, transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, transformGestureDetectorKtdetectTransformGestures4);
        throw null;
    }

    @Override // o.size3ABfNKs
    public TransformGestureDetectorKtdetectTransformGestures2 serializer(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ((ImageLoader$Builder) this.RemoteActionCompatParcelizer).serializer(j, transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, transformGestureDetectorKtdetectTransformGestures4);
        }
        int i3 = 88 / 0;
        return ((ImageLoader$Builder) this.RemoteActionCompatParcelizer).serializer(j, transformGestureDetectorKtdetectTransformGestures2, transformGestureDetectorKtdetectTransformGestures3, transformGestureDetectorKtdetectTransformGestures4);
    }

    @Override // o.getPositiveZeroslo4al4
    public StaticsBoundaryInterface k_() {
        int i = 2 % 2;
        int i2 = serializer + 123;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object[] objArr = {StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.RemoteActionCompatParcelizer).getStatics()};
            return (StaticsBoundaryInterface) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1514248696, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), objArr, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1514248694);
        }
        Object[] objArr2 = {StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.RemoteActionCompatParcelizer).getStatics()};
        throw null;
    }

    @Override // o.getPositiveZeroslo4al4
    public WebkitToCompatConverterBoundaryInterface read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object[] objArr = {WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.RemoteActionCompatParcelizer).getWebkitToCompatConverter()};
            return (WebkitToCompatConverterBoundaryInterface) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1514248696, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), objArr, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1514248694);
        }
        Object[] objArr2 = {WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.RemoteActionCompatParcelizer).getWebkitToCompatConverter()};
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.StrokeCompanion
    public Object RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = (resizeGraphicFrameIfAppropriate) this.RemoteActionCompatParcelizer;
        DecodeJob decodeJob = new DecodeJob((scale0AR0LA0default) resizegraphicframeifappropriate.read, (EmojiProcessor) resizegraphicframeifappropriate.write);
        int i2 = IconCompatParcelizer + 35;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return decodeJob;
    }

    public void IconCompatParcelizer(long j, String str, String str2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        str2.getClass();
        copyeZhPAX0 copyezhpax0 = (copyeZhPAX0) ((ConcurrentHashMap) this.RemoteActionCompatParcelizer).get(str);
        if (copyezhpax0 != null) {
            int i4 = serializer + 39;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            copyezhpax0.RemoteActionCompatParcelizer(str2, j);
        }
        int i6 = serializer + 25;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 59 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028 A[PHI: r1
  0x0028: PHI (r1v7 androidx.drawerlayout.widget.DrawerLayout) = (r1v5 androidx.drawerlayout.widget.DrawerLayout), (r1v9 androidx.drawerlayout.widget.DrawerLayout) binds: [B:8:0x0026, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.isCaptured
    public boolean read(View view) {
        DrawerLayout drawerLayout;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 29;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            drawerLayout = (DrawerLayout) this.RemoteActionCompatParcelizer;
            int i4 = 57 / 0;
            if (DrawerLayout.IconCompatParcelizer(view)) {
                if (drawerLayout.read(view) != 2) {
                    i = IconCompatParcelizer + 67;
                    serializer = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        drawerLayout.serializer(view);
                        return true;
                    }
                    drawerLayout.serializer(view);
                    return true;
                }
            }
        } else {
            drawerLayout = (DrawerLayout) this.RemoteActionCompatParcelizer;
            if (DrawerLayout.IconCompatParcelizer(view)) {
                if (drawerLayout.read(view) != 2) {
                    i = IconCompatParcelizer + 67;
                    serializer = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        drawerLayout.serializer(view);
                        return true;
                    }
                    drawerLayout.serializer(view);
                    return true;
                }
            }
        }
        int i5 = serializer + 21;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return false;
    }

    public boolean MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = serializer + 23;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            LookaheadScopeKt lookaheadScopeKt = ((LookaheadScopeKtLookaheadScope221) this.RemoteActionCompatParcelizer).PlaybackStateCompatCustomAction;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
            if (lookaheadScopeKt.ResultReceiver.RemoteActionCompatParcelizer() > 0) {
                return true;
            }
        } else {
            LookaheadScopeKt lookaheadScopeKt2 = ((LookaheadScopeKtLookaheadScope221) this.RemoteActionCompatParcelizer).PlaybackStateCompatCustomAction;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt2);
            if (lookaheadScopeKt2.ResultReceiver.RemoteActionCompatParcelizer() > 0) {
                return true;
            }
        }
        int i3 = IconCompatParcelizer + 79;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void serializer() {
        InputMethodManager inputMethodManager;
        IBinder windowToken;
        int i;
        int i2 = 2 % 2;
        View view = (View) this.RemoteActionCompatParcelizer;
        if (view != null) {
            int i3 = serializer + 119;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
                windowToken = view.getWindowToken();
                i = 1;
            } else {
                inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
                windowToken = view.getWindowToken();
                i = 0;
            }
            inputMethodManager.hideSoftInputFromWindow(windowToken, i);
        }
        int i4 = IconCompatParcelizer + 71;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.getPositiveZeroslo4al4
    public void write(truncslo4al4 truncslo4al4Var, OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0) {
        int i = 2 % 2;
        ((WebViewProviderFactoryBoundaryInterface) this.RemoteActionCompatParcelizer).startUpWebView(new startUpdater(new getExponentimpl(5, truncslo4al4Var)), new startUpdater(new getExponentimpl(4, onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0)));
        int i2 = serializer + 23;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 58 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    public static MemoryCacheService IconCompatParcelizer(String str) {
        MeasureScopeDefaultImpls measureScopeDefaultImpls;
        int i = 2 % 2;
        if (TextUtils.isEmpty(str)) {
            measureScopeDefaultImpls = MeasureScopeDefaultImpls.UNINITIALIZED;
        } else {
            int i2 = IconCompatParcelizer + 119;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (str.length() > 1) {
                measureScopeDefaultImpls = MeasureScopeDefaultImpls.UNINITIALIZED;
            } else {
                measureScopeDefaultImpls = getMeasuredWidth.read(str.charAt(0));
            }
        }
        MemoryCacheService memoryCacheService = new MemoryCacheService(measureScopeDefaultImpls);
        int i4 = IconCompatParcelizer + 1;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return memoryCacheService;
        }
        throw null;
    }

    public boolean serializer(String str) {
        int i = 2 % 2;
        str.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.RemoteActionCompatParcelizer;
        if (concurrentHashMap.containsKey(str)) {
            int i2 = IconCompatParcelizer + 39;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        copyeZhPAX0 copyezhpax0 = new copyeZhPAX0();
        long jUptimeMillis = SystemClock.uptimeMillis();
        copyezhpax0.serializer.serializer = Long.valueOf(jUptimeMillis);
        concurrentHashMap.put(str, copyezhpax0);
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.write(0, str);
        int i4 = serializer + 7;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }

    @Override // o.onLayoutRectChanged
    public void RemoteActionCompatParcelizer(String str, String str2, Bundle bundle) {
        int i = 2 % 2;
        int i2 = serializer + 1;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        NoWindowInsetsAnimation noWindowInsetsAnimation = (NoWindowInsetsAnimation) this.RemoteActionCompatParcelizer;
        if (!zIsEmpty) {
            noWindowInsetsAnimation.getClass();
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Unexpected call on client side");
            return;
        }
        ((LookaheadScopeKtLookaheadScope221) noWindowInsetsAnimation.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        noWindowInsetsAnimation.RemoteActionCompatParcelizer("auto", "_err", bundle, true, true, System.currentTimeMillis());
        int i4 = IconCompatParcelizer + 59;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.getDirectionRightEK5gGoQ
    public Object serializer(String str, HashMap map) {
        int i = 2 % 2;
        try {
            ((getButtonZEK5gGoQ) this.RemoteActionCompatParcelizer).IconCompatParcelizer.RemoteActionCompatParcelizer(str, map);
            int i2 = IconCompatParcelizer + 69;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } catch (RemoteException e) {
            getButtonThumbLeftEK5gGoQ.write("Error calling customEvaluator proxy:".concat(String.valueOf(e.getMessage())));
        }
        int i4 = serializer + 83;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public boolean MediaDescriptionCompat() {
        int i = 2 % 2;
        if (!MediaMetadataCompat()) {
            return false;
        }
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.RemoteActionCompatParcelizer;
        lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        if (jCurrentTimeMillis - lookaheadScopeKt.ResultReceiver.RemoteActionCompatParcelizer() <= lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.RemoteActionCompatParcelizer(null, premeasure0kLqBqw.getLastCustomNonConfigurationInstance)) {
            return false;
        }
        int i2 = serializer;
        int i3 = i2 + 69;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 65;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }

    @Override // o.getSafeGestures
    public Object m_() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 89;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Context context = ((getFocusEK5gGoQ) this.RemoteActionCompatParcelizer).write;
        int i4 = IconCompatParcelizer + 27;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return context;
    }

    public void serializer(long j, accesssetColorFilterjd accesssetcolorfilterjd) {
        int i = 2 % 2;
        accesssetcolorfilterjd.getClass();
        setRotationY setrotationyRemoteActionCompatParcelizer = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(PerseusWorker.class).serializer(j, TimeUnit.SECONDS).RemoteActionCompatParcelizer();
        WorkManagerImpl workManagerImpl = (WorkManagerImpl) this.RemoteActionCompatParcelizer;
        workManagerImpl.getClass();
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        List list = (List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, 516583654, new Object[]{setrotationyRemoteActionCompatParcelizer}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
        if (list.isEmpty()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("beginUniqueWork needs at least one OneTimeWorkRequest.");
            return;
        }
        new ImageBitmapConfigCompanion(workManagerImpl, "perseus_worker", accesssetcolorfilterjd, list, 0).write();
        int i2 = serializer + 97;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    public void IconCompatParcelizer() {
        View viewFindViewById;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 45;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        View view = (View) this.RemoteActionCompatParcelizer;
        if (view == null) {
            int i5 = i2 + 53;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        if (!view.isInEditMode()) {
            int i7 = serializer + 125;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (view.onCheckIsTextEditor()) {
                view.requestFocus();
                viewFindViewById = view;
            } else {
                viewFindViewById = view.getRootView().findFocus();
            }
        } else {
            view.requestFocus();
            viewFindViewById = view;
        }
        if (viewFindViewById == null) {
            int i9 = IconCompatParcelizer + 13;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById != null) {
            int i11 = serializer + 115;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                int i12 = 1 / 0;
                if (!viewFindViewById.hasWindowFocus()) {
                    return;
                }
            } else if (!viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new ViewUtils$$ExternalSyntheticLambda0(1, viewFindViewById));
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    public CoroutineSingletons collect(TriggerBasedInvalidationTracker$createFlow$1$2 triggerBasedInvalidationTracker$createFlow$1$2, ContinuationImpl continuationImpl) {
        scaledefault scaledefaultVar;
        int i = 2 % 2;
        int i2 = serializer + 89;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = continuationImpl instanceof scaledefault;
            obj.hashCode();
            throw null;
        }
        if (!(continuationImpl instanceof scaledefault)) {
            scaledefaultVar = new scaledefault(this, continuationImpl);
        } else {
            scaledefaultVar = (scaledefault) continuationImpl;
            int i3 = scaledefaultVar.read;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = IconCompatParcelizer + 23;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    scaledefaultVar.read = i3 >>> Integer.MIN_VALUE;
                } else {
                    scaledefaultVar.read = i3 - Integer.MIN_VALUE;
                }
            } else {
                scaledefaultVar = new scaledefault(this, continuationImpl);
            }
        }
        Object obj2 = scaledefaultVar.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = scaledefaultVar.read;
        if (i5 != 0) {
            int i6 = serializer + 59;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? i5 != 1 : i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            MutableStateFlow mutableStateFlow = (MutableStateFlow) this.RemoteActionCompatParcelizer;
            scaledefaultVar.read = 1;
            if (mutableStateFlow.collect(triggerBasedInvalidationTracker$createFlow$1$2, scaledefaultVar) == coroutineSingletons) {
                int i7 = IconCompatParcelizer + 45;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return coroutineSingletons;
            }
        }
        DrawableTransformation.read();
        int i9 = serializer + 113;
        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return null;
    }

    @Override // o.Colordefault
    public tintxETnrds read(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 107;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        compositeComponent compositecomponent = (compositeComponent) this.RemoteActionCompatParcelizer;
        String strWrite = compositecomponent.write();
        if (strWrite == null) {
            int i4 = serializer + 39;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                str.equals(":memory:");
                throw null;
            }
            if (!str.equals(":memory:")) {
                DrawableTransformation.serializer((Object) ff$$ExternalSyntheticOutline0.m("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                int i5 = serializer + 61;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 99 / 0;
                }
                return null;
            }
        } else if (!strWrite.equals(str)) {
            int i7 = IconCompatParcelizer + 39;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('/', strWrite, strWrite).equals(hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('/', str, str))) {
                throw new IllegalArgumentException(("This driver is configured to open a database named '" + compositecomponent.write() + "' but '" + str + "' was requested.").toString());
            }
        }
        return new C0172getimpl(compositecomponent.IconCompatParcelizer());
    }

    public void RemoteActionCompatParcelizer(Bundle bundle, String str) {
        int i = 2 % 2;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.RemoteActionCompatParcelizer;
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope221.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKt lookaheadScopeKt = lookaheadScopeKtLookaheadScope221.PlaybackStateCompatCustomAction;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
        lookaheadScopeKtLookaheadScope4.MediaSessionCompatToken();
        if (lookaheadScopeKtLookaheadScope221.write()) {
            return;
        }
        String string = null;
        if (bundle.isEmpty()) {
            int i2 = IconCompatParcelizer + 7;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            if (true == str.isEmpty()) {
                int i4 = IconCompatParcelizer + 83;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    string.hashCode();
                    throw null;
                }
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            Iterator<String> it = bundle.keySet().iterator();
            int i5 = IconCompatParcelizer + 87;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            while (it.hasNext()) {
                int i7 = serializer + 123;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    String next = it.next();
                    builder.appendQueryParameter(next, bundle.getString(next));
                    throw null;
                }
                String next2 = it.next();
                builder.appendQueryParameter(next2, bundle.getString(next2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        lookaheadScopeKt.ComponentActivity.IconCompatParcelizer(string);
        LookaheadScopeImpl lookaheadScopeImpl = lookaheadScopeKt.ResultReceiver;
        lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        lookaheadScopeImpl.serializer(System.currentTimeMillis());
    }

    public void read(String str, String str2, GroupComponent groupComponent) {
        int i = 2 % 2;
        int i2 = serializer + 47;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        BlurFilter blurFilter = (BlurFilter) this.RemoteActionCompatParcelizer;
        String strConcat = "sm_".concat(str);
        Iterator it = groupComponent.RemoteActionCompatParcelizer.entrySet().iterator();
        while (!(!it.hasNext())) {
            Map.Entry entry = (Map.Entry) it.next();
            blurFilter.read(strConcat, (String) entry.getKey(), ((markNotTintable) entry.getValue()).IconCompatParcelizer, ((markNotTintable) entry.getValue()).read, ((markNotTintable) entry.getValue()).RemoteActionCompatParcelizer);
        }
        for (Map.Entry entry2 : groupComponent.write.entrySet()) {
            int i4 = IconCompatParcelizer + 101;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            blurFilter.RemoteActionCompatParcelizer(strConcat, (String) entry2.getKey(), (String) entry2.getValue());
            int i6 = serializer + 119;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        blurFilter.IconCompatParcelizer(strConcat, str2);
        blurFilter.write(strConcat);
    }

    public MemoryCacheService(int i, boolean z) {
        if (i == 12) {
            this.RemoteActionCompatParcelizer = Handler.createAsync(Looper.getMainLooper());
            return;
        }
        if (i == 16) {
            this.RemoteActionCompatParcelizer = new ConcurrentHashMap();
        } else if (i != 17) {
            this.RemoteActionCompatParcelizer = new HashSet();
        } else {
            this.RemoteActionCompatParcelizer = new getInAppMessageEventMap("_[a-zA-Z]");
        }
    }

    public static void write(SubcomposeLayoutStatesetRoot1 subcomposeLayoutStatesetRoot1, parseGroup parsegroup) {
        int i = 2 % 2;
        if (!(!parsegroup.equals(parseGroup.write))) {
            int i2 = IconCompatParcelizer + 27;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            subcomposeLayoutStatesetRoot1.serializer(subcomposeLayoutStatesetRoot1.RemoteActionCompatParcelizer().getColor(com.logistics.rider.glovo.R.color.success_main));
            subcomposeLayoutStatesetRoot1.write(subcomposeLayoutStatesetRoot1.RemoteActionCompatParcelizer().getColor(com.logistics.rider.glovo.R.color.neutral_00));
            return;
        }
        if (parsegroup.equals(parseGroup.serializer)) {
            int i4 = IconCompatParcelizer + 37;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            subcomposeLayoutStatesetRoot1.serializer(subcomposeLayoutStatesetRoot1.RemoteActionCompatParcelizer().getColor(com.logistics.rider.glovo.R.color.error_main));
            subcomposeLayoutStatesetRoot1.write(subcomposeLayoutStatesetRoot1.RemoteActionCompatParcelizer().getColor(com.logistics.rider.glovo.R.color.neutral_00));
            return;
        }
        if (!parsegroup.equals(parseGroup.IconCompatParcelizer)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return;
        }
        subcomposeLayoutStatesetRoot1.serializer(subcomposeLayoutStatesetRoot1.RemoteActionCompatParcelizer().getColor(com.logistics.rider.glovo.R.color.alert_main));
        subcomposeLayoutStatesetRoot1.write(subcomposeLayoutStatesetRoot1.RemoteActionCompatParcelizer().getColor(com.logistics.rider.glovo.R.color.neutral_100));
        subcomposeLayoutStatesetRoot1.RemoteActionCompatParcelizer(subcomposeLayoutStatesetRoot1.RemoteActionCompatParcelizer().getColor(com.logistics.rider.glovo.R.color.neutral_100));
    }

    public MemoryCacheService(compositeComponent compositecomponent) {
        compositecomponent.getClass();
        this.RemoteActionCompatParcelizer = compositecomponent;
    }

    public /* synthetic */ MemoryCacheService(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
    }

    public void write(String str, getPowersOfTen getpowersoften, getWillClipPath getwillclippath) {
        int i = 2 % 2;
        getpowersoften.getClass();
        getwillclippath.getClass();
        String strConcat = "sm_".concat(str);
        ConcurrentHashMap concurrentHashMap = getInvalidateListenerui.write;
        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(getInvalidateListenerui.IconCompatParcelizer);
        if (getInvalidateListenerui.write.putIfAbsent(str, new GroupComponent()) != null) {
            int i2 = serializer + 35;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ConcurrentLinkedDeque concurrentLinkedDeque = getInvalidateListenerui.serializer;
            concurrentLinkedDeque.remove(str);
            concurrentLinkedDeque.addLast(str);
        } else {
            ConcurrentLinkedDeque concurrentLinkedDeque2 = getInvalidateListenerui.serializer;
            concurrentLinkedDeque2.remove(str);
            concurrentLinkedDeque2.addLast(str);
            getInvalidateListenerui.write();
        }
        getInvalidateListenerui.RemoteActionCompatParcelizer(str, "screenName", getpowersoften.IconCompatParcelizer);
        getInvalidateListenerui.RemoteActionCompatParcelizer(str, "screenType", getpowersoften.RemoteActionCompatParcelizer);
        String lowerCase = getwillclippath.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        getInvalidateListenerui.RemoteActionCompatParcelizer(str, "screenContainerType", lowerCase);
        AtomicReference atomicReference = getInvalidateListenerui.read;
        String str2 = (String) atomicReference.get();
        getInvalidateListenerui.RemoteActionCompatParcelizer(str, "isFromDeeplink", String.valueOf(str2 != null));
        if (str2 != null) {
            int i4 = serializer + 67;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                throw null;
            }
            String str3 = (String) atomicReference.get();
            if (str3 != null) {
                getInvalidateListenerui.RemoteActionCompatParcelizer(str, "deeplinkPath", str3);
            }
        }
        ((BlurFilter) this.RemoteActionCompatParcelizer).serializer(strConcat);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac A[LOOP:0: B:24:0x0060->B:40:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00af A[EDGE_INSN: B:61:0x00af->B:41:0x00af BREAK  A[LOOP:0: B:24:0x0060->B:40:0x00ac], SYNTHETIC] */
    public Object IconCompatParcelizer(logUnregisterActivitylambda1 logunregisteractivitylambda1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        getOnContentCaptureSession getoncontentcapturesession;
        r8lambdahgODiqgPByAI8PyoNAxx8PBqX4 r8lambdahgodiqgpbyai8pyonaxx8pbqx4;
        int i = 2 % 2;
        int i2 = serializer + 121;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            if (((boundsUpdatesEventLoopui) this.RemoteActionCompatParcelizer) == null) {
                getContentCaptureSessionuiannotations.write("Called runAndWatch on a manager that has been disposed of");
            }
            boundsUpdatesEventLoopui boundsupdateseventloopui = (boundsUpdatesEventLoopui) this.RemoteActionCompatParcelizer;
            if ((boundsupdateseventloopui instanceof getOnContentCaptureSession) && (r8lambdahgodiqgpbyai8pyonaxx8pbqx4 = (getoncontentcapturesession = (getOnContentCaptureSession) boundsupdateseventloopui).RemoteActionCompatParcelizer) != null && !r8lambdahgodiqgpbyai8pyonaxx8pbqx4.equals(logunregisteractivitylambda1)) {
                MultiSubscriptionSnapshotFlowManager multiSubscriptionSnapshotFlowManager = new MultiSubscriptionSnapshotFlowManager();
                r8lambdahgODiqgPByAI8PyoNAxx8PBqX4 r8lambdahgodiqgpbyai8pyonaxx8pbqx5 = getoncontentcapturesession.RemoteActionCompatParcelizer;
                if (r8lambdahgodiqgpbyai8pyonaxx8pbqx5 == null) {
                    getContentCaptureSessionuiannotations.write("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
                }
                relocationOffsetfbGrOKE relocationoffsetfbgroke = getoncontentcapturesession.serializer;
                if (relocationoffsetfbgroke == null) {
                    Object obj = getoncontentcapturesession.IconCompatParcelizer;
                    obj.getClass();
                    multiSubscriptionSnapshotFlowManager.write(obj, r8lambdahgodiqgpbyai8pyonaxx8pbqx5);
                } else {
                    Object[] objArr = relocationoffsetfbgroke.RemoteActionCompatParcelizer;
                    long[] jArr = relocationoffsetfbgroke.IconCompatParcelizer;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = IconCompatParcelizer + 123;
                        serializer = i3 % Fields.SpotShadowColor;
                        int i4 = i3 % 2;
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    int i9 = serializer + 45;
                                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                                    if (i9 % 2 != 0) {
                                        if (255 / j < 128) {
                                            multiSubscriptionSnapshotFlowManager.write(objArr[(i5 << 3) + i8], r8lambdahgodiqgpbyai8pyonaxx8pbqx5);
                                        }
                                    } else if ((j & 255) < 128) {
                                        multiSubscriptionSnapshotFlowManager.write(objArr[(i5 << 3) + i8], r8lambdahgodiqgpbyai8pyonaxx8pbqx5);
                                    }
                                    j >>= 8;
                                    i8++;
                                    i6 = 8;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                }
                multiSubscriptionSnapshotFlowManager.read();
                getoncontentcapturesession.IconCompatParcelizer();
                this.RemoteActionCompatParcelizer = multiSubscriptionSnapshotFlowManager;
            }
            boundsUpdatesEventLoopui boundsupdateseventloopui2 = (boundsUpdatesEventLoopui) this.RemoteActionCompatParcelizer;
            boundsupdateseventloopui2.getClass();
            getBrush getbrush = getOffsetF1C5BW0.write().read(boundsupdateseventloopui2.RemoteActionCompatParcelizer(logunregisteractivitylambda1));
            boundsupdateseventloopui2.write(logunregisteractivitylambda1);
            try {
                getBrush getbrushR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getbrush.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                try {
                    Object objInvoke = r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                    getBrush.write(getbrushR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                    getbrush.serializer();
                    boundsupdateseventloopui2.read();
                    return objInvoke;
                } catch (Throwable th) {
                    getBrush.write(getbrushR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                    throw th;
                }
            } catch (Throwable th2) {
                getbrush.serializer();
                throw th2;
            }
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:32:0x011a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0125  */
    /* JADX WARN: Code duplicated, block: B:43:0x01d0  */
    public accessgetPointscp RemoteActionCompatParcelizer(ShaderKt shaderKt, Object obj, getBlurRadiusannotations getblurradiusannotations, accessquadraticTojd accessquadratictojd) {
        String str;
        int i;
        int i2 = 2 % 2;
        setOutlineui setoutlineui = shaderKt.ResultReceiver;
        Map map = shaderKt.PlaybackStateCompat;
        if (setoutlineui != setOutlineui.DISABLED) {
            String str2 = shaderKt.PlaybackStateCompatCustomAction;
            if (str2 != null) {
                return new accessgetPointscp(str2, map);
            }
            List list = ((RealImageLoader) this.RemoteActionCompatParcelizer).serializer.RemoteActionCompatParcelizer;
            int size = list.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    str = null;
                    break;
                }
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) list.get(i3);
                getPointsr_lszbg getpointsr_lszbg = (getPointsr_lszbg) onviewattachedtowindowlambda0.serializer;
                if (!(!((r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) ((getUnregisteredInAppMessageannotations) onviewattachedtowindowlambda0.write)).read(obj))) {
                    getpointsr_lszbg.getClass();
                    int i4 = getpointsr_lszbg.serializer;
                    if (i4 == 0) {
                        str = ((PathDefaultImpls) obj).write;
                    } else if (i4 != 1) {
                        PathDefaultImpls pathDefaultImpls = (PathDefaultImpls) obj;
                        String str3 = pathDefaultImpls.IconCompatParcelizer;
                        if ((str3 == null || str3.equals("file")) && pathDefaultImpls.read != null) {
                            int i5 = serializer + 121;
                            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                            if (i5 % 2 != 0) {
                                Bitmap.Config[] configArr = accessgetBevelcp.write;
                                int i6 = 75 / 0;
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{pathDefaultImpls.IconCompatParcelizer, "file"}, getCieXyz.write())).booleanValue()) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{onContentCardDismissed.MediaMetadataCompat((List) UriKt.RemoteActionCompatParcelizer(accessunpack.serializer(), accessunpack.serializer(), 1023072373, -1023072371, new Object[]{pathDefaultImpls}, accessunpack.serializer(), accessunpack.serializer())), "android_asset"}, getCieXyz.write())).booleanValue()) {
                                        i = serializer + 111;
                                        IconCompatParcelizer = i % Fields.SpotShadowColor;
                                        if (i % 2 != 0) {
                                            int i7 = 4 / 4;
                                        }
                                    }
                                    str = null;
                                }
                            } else {
                                Bitmap.Config[] configArr2 = accessgetBevelcp.write;
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{pathDefaultImpls.IconCompatParcelizer, "file"}, getCieXyz.write())).booleanValue()) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{onContentCardDismissed.MediaMetadataCompat((List) UriKt.RemoteActionCompatParcelizer(accessunpack.serializer(), accessunpack.serializer(), 1023072373, -1023072371, new Object[]{pathDefaultImpls}, accessunpack.serializer(), accessunpack.serializer())), "android_asset"}, getCieXyz.write())).booleanValue()) {
                                        i = serializer + 111;
                                        IconCompatParcelizer = i % Fields.SpotShadowColor;
                                        if (i % 2 != 0) {
                                            int i8 = 4 / 4;
                                        }
                                    }
                                    str = null;
                                }
                            }
                            if (((Boolean) ExtrasKt.read(getblurradiusannotations, LinearGradientShaderVjE6UOUdefault.RemoteActionCompatParcelizer)).booleanValue()) {
                                String str4 = (String) UriKt.RemoteActionCompatParcelizer(accessunpack.serializer(), accessunpack.serializer(), -1728327972, 1728327973, new Object[]{pathDefaultImpls}, accessunpack.serializer(), accessunpack.serializer());
                                if (str4 != null) {
                                    HttpUrlFetcher httpUrlFetcher = getblurradiusannotations.IconCompatParcelizer;
                                    String str5 = RecyclableBufferedInputStream.DIRECTORY_SEPARATOR;
                                    str = pathDefaultImpls + "-" + ((Long) httpUrlFetcher.MediaMetadataCompat(Path$Companion.IconCompatParcelizer(str4)).MediaSessionCompatQueueItem);
                                } else {
                                    str = null;
                                }
                            } else {
                                str = null;
                            }
                        } else {
                            str = null;
                        }
                    } else {
                        PathDefaultImpls pathDefaultImpls2 = (PathDefaultImpls) obj;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{pathDefaultImpls2.IconCompatParcelizer, "android.resource"}, getCieXyz.write())).booleanValue()) {
                            Configuration configuration = getblurradiusannotations.write.getResources().getConfiguration();
                            Bitmap.Config[] configArr3 = accessgetBevelcp.write;
                            str = pathDefaultImpls2 + ":" + (configuration.uiMode & 48);
                        } else {
                            str = null;
                        }
                    }
                    if (str != null) {
                        int i9 = serializer + 21;
                        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        break;
                    }
                }
                i3++;
            }
            if (str != null) {
                Object[] objArr = {shaderKt, LinearGradientShaderVjE6UOUdefault.IconCompatParcelizer};
                if (((List) ExtrasKt.read(-832930121, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), 832930123, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr)).isEmpty()) {
                    return new accessgetPointscp(str, map);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("coil#size", getblurradiusannotations.MediaSessionCompatQueueItem.toString());
                return new accessgetPointscp(str, linkedHashMap);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x005e A[PHI: r8
  0x005e: PHI (r8v18 android.view.ViewGroup$MarginLayoutParams) = (r8v15 android.view.ViewGroup$MarginLayoutParams), (r8v21 android.view.ViewGroup$MarginLayoutParams) binds: [B:14:0x005c, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    /* JADX WARN: Code duplicated, block: B:19:0x0076 A[PHI: r8
  0x0076: PHI (r8v16 android.view.ViewGroup$MarginLayoutParams) = (r8v15 android.view.ViewGroup$MarginLayoutParams), (r8v21 android.view.ViewGroup$MarginLayoutParams) binds: [B:14:0x005c, B:11:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d6 A[Catch: NoSuchMethodException -> 0x00db, TRY_LEAVE, TryCatch #0 {NoSuchMethodException -> 0x00db, blocks: (B:28:0x00b9, B:30:0x00d6), top: B:136:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:40:0x0100  */
    /* JADX WARN: Code duplicated, block: B:43:0x0108  */
    /* JADX WARN: Code duplicated, block: B:45:0x0113  */
    /* JADX WARN: Code duplicated, block: B:51:0x011e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0125  */
    /* JADX WARN: Code duplicated, block: B:58:0x015e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0162  */
    /* JADX WARN: Code duplicated, block: B:62:0x016e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0189  */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01be  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c6 A[PHI: r16
  0x01c6: PHI (r16v6 int) = (r16v5 int), (r16v7 int) binds: [B:83:0x01c4, B:80:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fe  */
    @Override // o.FocusPropertiesImpl
    public FocusRequesterModifierKt onApplyWindowInsets(View view, FocusRequesterModifierKt focusRequesterModifierKt) {
        int i;
        FocusRequesterModifier focusRequesterKt;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Rect rect;
        Rect rect2;
        ViewGroup viewGroup;
        Method method;
        Method declaredMethod;
        int i2;
        int i3;
        int i4;
        FocusRequesterModifierKt focusRequesterModifierKt2;
        int i5;
        int iSerializer;
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i6;
        int i7;
        View view3;
        boolean z;
        int i8;
        View view4;
        int color;
        int i9;
        FocusRequesterModifierKt focusRequesterModifierKtRemoteActionCompatParcelizer = focusRequesterModifierKt;
        int i10 = 2 % 2;
        int iRemoteActionCompatParcelizer = focusRequesterModifierKt.RemoteActionCompatParcelizer();
        startActivityForResult startactivityforresult = (startActivityForResult) this.RemoteActionCompatParcelizer;
        Context context = startactivityforresult.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        int iRemoteActionCompatParcelizer2 = focusRequesterModifierKt.RemoteActionCompatParcelizer();
        onKeyDown onkeydown = startactivityforresult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        boolean z2 = true;
        boolean z3 = false;
        if (onkeydown != null) {
            int i11 = serializer + 53;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                boolean z4 = onkeydown.getLayoutParams() instanceof ViewGroup.MarginLayoutParams;
                throw null;
            }
            if (onkeydown.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int i12 = serializer + 105;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) startactivityforresult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getLayoutParams();
                    if (startactivityforresult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.isShown()) {
                        if (startactivityforresult.addOnPictureInPictureModeChangedListener == null) {
                            startactivityforresult.addOnPictureInPictureModeChangedListener = new Rect();
                            startactivityforresult.enterPictureInPictureMode = new Rect();
                        }
                        rect = startactivityforresult.addOnPictureInPictureModeChangedListener;
                        rect2 = startactivityforresult.enterPictureInPictureMode;
                        rect.set(focusRequesterModifierKt.read(), focusRequesterModifierKt.RemoteActionCompatParcelizer(), focusRequesterModifierKt.serializer(), focusRequesterModifierKt.write());
                        viewGroup = startactivityforresult.addMenuProvider;
                        if (Build.VERSION.SDK_INT >= 29) {
                            setButtonDrawable.RemoteActionCompatParcelizer(viewGroup, rect, rect2);
                        } else {
                            if (!TuplesKt.MediaBrowserCompatMediaItem) {
                                int i13 = IconCompatParcelizer + 123;
                                serializer = i13 % Fields.SpotShadowColor;
                                int i14 = i13 % 2;
                                TuplesKt.MediaBrowserCompatMediaItem = true;
                                try {
                                    declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                                    TuplesKt.RatingCompat = declaredMethod;
                                    if (!declaredMethod.isAccessible()) {
                                        TuplesKt.RatingCompat.setAccessible(true);
                                    }
                                } catch (NoSuchMethodException unused) {
                                }
                            }
                            method = TuplesKt.RatingCompat;
                            if (method != null) {
                                try {
                                    method.invoke(viewGroup, rect, rect2);
                                } catch (Exception unused2) {
                                }
                            }
                        }
                        i2 = rect.top;
                        i3 = rect.left;
                        i4 = rect.right;
                        ViewGroup viewGroup2 = startactivityforresult.addMenuProvider;
                        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                        focusRequesterModifierKt2 = findFocusTargetui.read(viewGroup2);
                        if (focusRequesterModifierKt2 == null) {
                            i5 = 0;
                        } else {
                            i5 = focusRequesterModifierKt2.read();
                        }
                        if (focusRequesterModifierKt2 == null) {
                            iSerializer = 0;
                        } else {
                            iSerializer = focusRequesterModifierKt2.serializer();
                        }
                        if (marginLayoutParams.topMargin == i2) {
                            i9 = serializer + 41;
                            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                            if (i9 % 2 == 0) {
                                int i15 = marginLayoutParams.leftMargin;
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            if (marginLayoutParams.leftMargin == i3 || marginLayoutParams.rightMargin != i4) {
                                marginLayoutParams.topMargin = i2;
                                marginLayoutParams.leftMargin = i3;
                                marginLayoutParams.rightMargin = i4;
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            marginLayoutParams.topMargin = i2;
                            marginLayoutParams.leftMargin = i3;
                            marginLayoutParams.rightMargin = i4;
                            z2 = true;
                        }
                        if (i2 > 0 || startactivityforresult.addOnMultiWindowModeChangedListener != null) {
                            view2 = startactivityforresult.addOnMultiWindowModeChangedListener;
                            if (view2 != null) {
                                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                                i6 = marginLayoutParams2.height;
                                i7 = marginLayoutParams.topMargin;
                                if (i6 == i7 || marginLayoutParams2.leftMargin != i5) {
                                    marginLayoutParams2.height = i7;
                                    marginLayoutParams2.leftMargin = i5;
                                    marginLayoutParams2.rightMargin = iSerializer;
                                    startactivityforresult.addOnMultiWindowModeChangedListener.setLayoutParams(marginLayoutParams2);
                                } else {
                                    int i16 = serializer + 7;
                                    IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                                    if (i16 % 2 != 0) {
                                        int i17 = marginLayoutParams2.rightMargin;
                                        Object obj2 = null;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    if (marginLayoutParams2.rightMargin != iSerializer) {
                                        marginLayoutParams2.height = i7;
                                        marginLayoutParams2.leftMargin = i5;
                                        marginLayoutParams2.rightMargin = iSerializer;
                                        startactivityforresult.addOnMultiWindowModeChangedListener.setLayoutParams(marginLayoutParams2);
                                    }
                                }
                            }
                        } else {
                            View view5 = new View(context);
                            startactivityforresult.addOnMultiWindowModeChangedListener = view5;
                            view5.setVisibility(8);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                            layoutParams.leftMargin = i5;
                            layoutParams.rightMargin = iSerializer;
                            startactivityforresult.addMenuProvider.addView(startactivityforresult.addOnMultiWindowModeChangedListener, -1, layoutParams);
                            int i18 = IconCompatParcelizer + 29;
                            serializer = i18 % Fields.SpotShadowColor;
                            int i19 = i18 % 2;
                        }
                        view3 = startactivityforresult.addOnMultiWindowModeChangedListener;
                        if (view3 != null) {
                            int i20 = IconCompatParcelizer + 123;
                            serializer = i20 % Fields.SpotShadowColor;
                            int i21 = i20 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            i8 = serializer + 19;
                            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                            if (i8 % 2 != 0) {
                                i = 0;
                                int i22 = 72 / 0;
                                if (view3.getVisibility() != 0) {
                                    view4 = startactivityforresult.addOnMultiWindowModeChangedListener;
                                    if ((view4.getWindowSystemUiVisibility() & 8192) != 0) {
                                        color = context.getColor(com.logistics.rider.glovo.R.color.abc_decor_view_status_guard_light);
                                    } else {
                                        color = context.getColor(com.logistics.rider.glovo.R.color.abc_decor_view_status_guard);
                                    }
                                    view4.setBackgroundColor(color);
                                }
                            } else {
                                i = 0;
                                if (view3.getVisibility() != 0) {
                                    view4 = startactivityforresult.addOnMultiWindowModeChangedListener;
                                    if ((view4.getWindowSystemUiVisibility() & 8192) != 0) {
                                        color = context.getColor(com.logistics.rider.glovo.R.color.abc_decor_view_status_guard_light);
                                    } else {
                                        color = context.getColor(com.logistics.rider.glovo.R.color.abc_decor_view_status_guard);
                                    }
                                    view4.setBackgroundColor(color);
                                }
                            }
                        } else {
                            i = 0;
                        }
                        if (!startactivityforresult.onBackPressedInput_delegatelambda0 && z) {
                            iRemoteActionCompatParcelizer2 = i;
                        }
                        z3 = z;
                    } else if (marginLayoutParams.topMargin != 0) {
                        int i23 = IconCompatParcelizer + 27;
                        serializer = i23 % Fields.SpotShadowColor;
                        int i24 = i23 % 2;
                        marginLayoutParams.topMargin = 0;
                        i = 0;
                    } else {
                        z2 = false;
                        i = 0;
                    }
                } else {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) startactivityforresult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getLayoutParams();
                    if (startactivityforresult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.isShown()) {
                        if (startactivityforresult.addOnPictureInPictureModeChangedListener == null) {
                            startactivityforresult.addOnPictureInPictureModeChangedListener = new Rect();
                            startactivityforresult.enterPictureInPictureMode = new Rect();
                        }
                        rect = startactivityforresult.addOnPictureInPictureModeChangedListener;
                        rect2 = startactivityforresult.enterPictureInPictureMode;
                        rect.set(focusRequesterModifierKt.read(), focusRequesterModifierKt.RemoteActionCompatParcelizer(), focusRequesterModifierKt.serializer(), focusRequesterModifierKt.write());
                        viewGroup = startactivityforresult.addMenuProvider;
                        if (Build.VERSION.SDK_INT >= 29) {
                            setButtonDrawable.RemoteActionCompatParcelizer(viewGroup, rect, rect2);
                        } else {
                            if (!TuplesKt.MediaBrowserCompatMediaItem) {
                                int i110 = IconCompatParcelizer + 123;
                                serializer = i110 % Fields.SpotShadowColor;
                                int i111 = i110 % 2;
                                TuplesKt.MediaBrowserCompatMediaItem = true;
                                declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                                TuplesKt.RatingCompat = declaredMethod;
                                if (!declaredMethod.isAccessible()) {
                                    TuplesKt.RatingCompat.setAccessible(true);
                                }
                            }
                            method = TuplesKt.RatingCompat;
                            if (method != null) {
                                method.invoke(viewGroup, rect, rect2);
                            }
                        }
                        i2 = rect.top;
                        i3 = rect.left;
                        i4 = rect.right;
                        ViewGroup viewGroup3 = startactivityforresult.addMenuProvider;
                        WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
                        focusRequesterModifierKt2 = findFocusTargetui.read(viewGroup3);
                        if (focusRequesterModifierKt2 == null) {
                            i5 = 0;
                        } else {
                            i5 = focusRequesterModifierKt2.read();
                        }
                        if (focusRequesterModifierKt2 == null) {
                            iSerializer = 0;
                        } else {
                            iSerializer = focusRequesterModifierKt2.serializer();
                        }
                        if (marginLayoutParams.topMargin == i2) {
                            i9 = serializer + 41;
                            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                            if (i9 % 2 == 0) {
                                int i112 = marginLayoutParams.leftMargin;
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            if (marginLayoutParams.leftMargin == i3) {
                                marginLayoutParams.topMargin = i2;
                                marginLayoutParams.leftMargin = i3;
                                marginLayoutParams.rightMargin = i4;
                                z2 = true;
                            } else {
                                marginLayoutParams.topMargin = i2;
                                marginLayoutParams.leftMargin = i3;
                                marginLayoutParams.rightMargin = i4;
                                z2 = true;
                            }
                        } else {
                            marginLayoutParams.topMargin = i2;
                            marginLayoutParams.leftMargin = i3;
                            marginLayoutParams.rightMargin = i4;
                            z2 = true;
                        }
                        if (i2 > 0) {
                            view2 = startactivityforresult.addOnMultiWindowModeChangedListener;
                            if (view2 != null) {
                                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                                i6 = marginLayoutParams2.height;
                                i7 = marginLayoutParams.topMargin;
                                if (i6 == i7) {
                                    marginLayoutParams2.height = i7;
                                    marginLayoutParams2.leftMargin = i5;
                                    marginLayoutParams2.rightMargin = iSerializer;
                                    startactivityforresult.addOnMultiWindowModeChangedListener.setLayoutParams(marginLayoutParams2);
                                } else {
                                    marginLayoutParams2.height = i7;
                                    marginLayoutParams2.leftMargin = i5;
                                    marginLayoutParams2.rightMargin = iSerializer;
                                    startactivityforresult.addOnMultiWindowModeChangedListener.setLayoutParams(marginLayoutParams2);
                                }
                            }
                        } else {
                            view2 = startactivityforresult.addOnMultiWindowModeChangedListener;
                            if (view2 != null) {
                                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                                i6 = marginLayoutParams2.height;
                                i7 = marginLayoutParams.topMargin;
                                if (i6 == i7) {
                                    marginLayoutParams2.height = i7;
                                    marginLayoutParams2.leftMargin = i5;
                                    marginLayoutParams2.rightMargin = iSerializer;
                                    startactivityforresult.addOnMultiWindowModeChangedListener.setLayoutParams(marginLayoutParams2);
                                } else {
                                    marginLayoutParams2.height = i7;
                                    marginLayoutParams2.leftMargin = i5;
                                    marginLayoutParams2.rightMargin = iSerializer;
                                    startactivityforresult.addOnMultiWindowModeChangedListener.setLayoutParams(marginLayoutParams2);
                                }
                            }
                        }
                        view3 = startactivityforresult.addOnMultiWindowModeChangedListener;
                        if (view3 != null) {
                            int i25 = IconCompatParcelizer + 123;
                            serializer = i25 % Fields.SpotShadowColor;
                            int i26 = i25 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            i8 = serializer + 19;
                            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                            if (i8 % 2 != 0) {
                                i = 0;
                                int i27 = 72 / 0;
                                if (view3.getVisibility() != 0) {
                                    view4 = startactivityforresult.addOnMultiWindowModeChangedListener;
                                    if ((view4.getWindowSystemUiVisibility() & 8192) != 0) {
                                        color = context.getColor(com.logistics.rider.glovo.R.color.abc_decor_view_status_guard_light);
                                    } else {
                                        color = context.getColor(com.logistics.rider.glovo.R.color.abc_decor_view_status_guard);
                                    }
                                    view4.setBackgroundColor(color);
                                }
                            } else {
                                i = 0;
                                if (view3.getVisibility() != 0) {
                                    view4 = startactivityforresult.addOnMultiWindowModeChangedListener;
                                    if ((view4.getWindowSystemUiVisibility() & 8192) != 0) {
                                        color = context.getColor(com.logistics.rider.glovo.R.color.abc_decor_view_status_guard_light);
                                    } else {
                                        color = context.getColor(com.logistics.rider.glovo.R.color.abc_decor_view_status_guard);
                                    }
                                    view4.setBackgroundColor(color);
                                }
                            }
                        } else {
                            i = 0;
                        }
                        if (!startactivityforresult.onBackPressedInput_delegatelambda0) {
                            iRemoteActionCompatParcelizer2 = i;
                        }
                        z3 = z;
                    } else if (marginLayoutParams.topMargin != 0) {
                        int i28 = IconCompatParcelizer + 27;
                        serializer = i28 % Fields.SpotShadowColor;
                        int i29 = i28 % 2;
                        marginLayoutParams.topMargin = 0;
                        i = 0;
                    } else {
                        z2 = false;
                        i = 0;
                    }
                }
                if (z2) {
                    startactivityforresult.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setLayoutParams(marginLayoutParams);
                }
            } else {
                i = 0;
                z3 = false;
            }
        } else {
            i = 0;
            z3 = false;
        }
        View view6 = startactivityforresult.addOnMultiWindowModeChangedListener;
        if (view6 != null) {
            view6.setVisibility(!(z3 ^ true) ? i : 8);
        }
        if (iRemoteActionCompatParcelizer != iRemoteActionCompatParcelizer2) {
            int i30 = serializer + 115;
            IconCompatParcelizer = i30 % Fields.SpotShadowColor;
            int i31 = i30 % 2;
            int i32 = focusRequesterModifierKt.read();
            int iSerializer2 = focusRequesterModifierKt.serializer();
            int iWrite = focusRequesterModifierKt.write();
            int i33 = Build.VERSION.SDK_INT;
            if (i33 >= 36) {
                focusRequesterKt = new pinFocusedChild(focusRequesterModifierKtRemoteActionCompatParcelizer);
            } else if (i33 >= 35) {
                focusRequesterKt = new FocusRequesterNode(focusRequesterModifierKtRemoteActionCompatParcelizer);
            } else if (i33 >= 34) {
                focusRequesterKt = new FocusRequesterModifierNode(focusRequesterModifierKtRemoteActionCompatParcelizer);
            } else if (i33 >= 31) {
                focusRequesterKt = new C0165focusRequester(focusRequesterModifierKtRemoteActionCompatParcelizer);
            } else if (i33 >= 30) {
                focusRequesterKt = new FocusRequesterModifierNodeKt(focusRequesterModifierKtRemoteActionCompatParcelizer);
            } else {
                focusRequesterKt = i33 >= 29 ? new FocusRequesterKt(focusRequesterModifierKtRemoteActionCompatParcelizer) : new getFocusRequester(focusRequesterModifierKtRemoteActionCompatParcelizer);
            }
            focusRequesterKt.write(setRight.IconCompatParcelizer(i32, iRemoteActionCompatParcelizer2, iSerializer2, iWrite));
            focusRequesterModifierKtRemoteActionCompatParcelizer = focusRequesterKt.RemoteActionCompatParcelizer();
        }
        WeakHashMap weakHashMap3 = FocusPropertiesNode.RatingCompat;
        WindowInsets windowInsetsIconCompatParcelizer = focusRequesterModifierKtRemoteActionCompatParcelizer.IconCompatParcelizer();
        if (windowInsetsIconCompatParcelizer == null) {
            return focusRequesterModifierKtRemoteActionCompatParcelizer;
        }
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsIconCompatParcelizer);
        return !windowInsetsOnApplyWindowInsets.equals(windowInsetsIconCompatParcelizer) ? FocusRequesterModifierKt.write(view, windowInsetsOnApplyWindowInsets) : focusRequesterModifierKtRemoteActionCompatParcelizer;
    }

    public MemoryCacheService() {
    }
}
