package com.roadrunner.liveness.recording.presentation.compose;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpd;
import io.grpc.LoadBalancer$Helper;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.AndroidContentCaptureManager;
import o.AndroidEdgeEffectOverscrollEffect;
import o.FragmentTransitionSupport;
import o.StretchedVideoResolutionQuirk;
import o.SwipeRefreshLayoutSavedState;
import o.accessisRenderNodeCompatiblecp;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getLogoDescription;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getWrapper;
import o.minIntrinsicWidth;
import o.onItemDismiss;
import o.p7;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setInternalPaintui_graphics;
import o.setNavigationOnClickListener;
import o.setSlingshotDistance;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CameraContentKt {
    private static int serializer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    public static final Object access$getCameraProvider(Context context, ContinuationImpl continuationImpl) {
        CameraContentKt$getCameraProvider$1 cameraContentKt$getCameraProvider$1;
        int i = 2 % 2;
        Object obj = null;
        if (continuationImpl instanceof CameraContentKt$getCameraProvider$1) {
            int i2 = write + 15;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((CameraContentKt$getCameraProvider$1) continuationImpl).serializer;
                obj.hashCode();
                throw null;
            }
            cameraContentKt$getCameraProvider$1 = (CameraContentKt$getCameraProvider$1) continuationImpl;
            int i4 = cameraContentKt$getCameraProvider$1.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cameraContentKt$getCameraProvider$1.serializer = i4 - Integer.MIN_VALUE;
            } else {
                cameraContentKt$getCameraProvider$1 = new CameraContentKt$getCameraProvider$1(continuationImpl);
            }
        } else {
            cameraContentKt$getCameraProvider$1 = new CameraContentKt$getCameraProvider$1(continuationImpl);
        }
        Object result = cameraContentKt$getCameraProvider$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = cameraContentKt$getCameraProvider$1.serializer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(result);
            cameraContentKt$getCameraProvider$1.serializer = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(cameraContentKt$getCameraProvider$1));
            cancellableContinuationImpl.read();
            minIntrinsicWidth minintrinsicwidth = minIntrinsicWidth.IconCompatParcelizer;
            StretchedVideoResolutionQuirk stretchedVideoResolutionQuirkWrite = zzpd.write(context);
            stretchedVideoResolutionQuirkWrite.RemoteActionCompatParcelizer(new SwipeRefreshLayoutSavedState(cancellableContinuationImpl, stretchedVideoResolutionQuirkWrite, 0), context.getMainExecutor());
            cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new FragmentTransitionSupport(stretchedVideoResolutionQuirkWrite, 0));
            result = cancellableContinuationImpl.getResult();
            if (result == coroutineSingletons) {
                int i6 = serializer + 29;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(result);
        }
        Object obj2 = ((onItemDismiss) result).IconCompatParcelizer;
        int i8 = write + 101;
        serializer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return obj2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:64:0x015c  */
    public static final void serializer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getWrapper getwrapper, setNavigationOnClickListener setnavigationonclicklistener, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Object obj;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1132414170);
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i7 = write + 125;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(getwrapper)) {
                int i9 = serializer + 57;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
            int i11 = serializer + 95;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(setnavigationonclicklistener) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        boolean z2 = false;
        if ((i & 3072) == 0) {
            int i13 = write + 119;
            serializer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                if (getpostalcode.read(modifier)) {
                    i3 = Fields.CameraDistance;
                } else {
                    i3 = Fields.RotationZ;
                }
            } else {
                int i14 = 4 / 0;
                if (getpostalcode.read(modifier)) {
                    i3 = Fields.CameraDistance;
                } else {
                    i3 = Fields.RotationZ;
                }
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            int i15 = write + 93;
            serializer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            Context context = (Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) getpostalcode.write((getNewPassword) setInternalPaintui_graphics.write);
            getLogoDescription getlogodescription = getLogoDescription.write;
            getlogodescription.getClass();
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                obj = objComponentActivity;
                AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect2 = new AndroidEdgeEffectOverscrollEffect(context);
                androidEdgeEffectOverscrollEffect2.setClipToOutline(true);
                getpostalcode.write(androidEdgeEffectOverscrollEffect2);
                obj = androidEdgeEffectOverscrollEffect2;
            }
            obj = objComponentActivity;
            AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect3 = (AndroidEdgeEffectOverscrollEffect) obj;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(context);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(androidEdgeEffectOverscrollEffect3);
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(getlogodescription);
            boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(accessisrendernodecompatiblecp);
            boolean zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(getwrapper);
            boolean zIconCompatParcelizer6 = getpostalcode.IconCompatParcelizer(setnavigationonclicklistener);
            boolean z3 = (i2 & 14) == 4;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (((zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3 | zIconCompatParcelizer4 | zIconCompatParcelizer5 | zIconCompatParcelizer6) || z3) || objComponentActivity2 == androidContentCaptureManager) {
                androidEdgeEffectOverscrollEffect = androidEdgeEffectOverscrollEffect3;
                CameraContentKt$CameraPreview$1$1 cameraContentKt$CameraPreview$1$1 = new CameraContentKt$CameraPreview$1$1(context, getlogodescription, accessisrendernodecompatiblecp, getwrapper, setnavigationonclicklistener, androidEdgeEffectOverscrollEffect, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null);
                getpostalcode.write(cameraContentKt$CameraPreview$1$1);
                objComponentActivity2 = cameraContentKt$CameraPreview$1$1;
            } else {
                androidEdgeEffectOverscrollEffect = androidEdgeEffectOverscrollEffect3;
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, getlogodescription, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
            Modifier modifierThen = modifier.then(SizeKt.read);
            modifierThen.getClass();
            AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect4 = androidEdgeEffectOverscrollEffect;
            boolean zIconCompatParcelizer7 = getpostalcode.IconCompatParcelizer(androidEdgeEffectOverscrollEffect4);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (!zIconCompatParcelizer7) {
                int i17 = write + 51;
                serializer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new setSlingshotDistance(androidEdgeEffectOverscrollEffect4, z2);
                    getpostalcode.write(objComponentActivity3);
                }
            } else {
                objComponentActivity3 = new setSlingshotDistance(androidEdgeEffectOverscrollEffect4, z2);
                getpostalcode.write(objComponentActivity3);
            }
            AndroidView_androidKt.AndroidView((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, modifierThen, null, getpostalcode, 0, 4);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7((Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) getwrapper, (Object) setnavigationonclicklistener, modifier, i, 8);
        }
    }
}
