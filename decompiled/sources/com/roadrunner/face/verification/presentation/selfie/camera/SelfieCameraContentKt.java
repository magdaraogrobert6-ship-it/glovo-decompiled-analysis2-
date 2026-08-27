package com.roadrunner.face.verification.presentation.selfie.camera;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda0;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpd;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.roadrunner.face.verification.domain.ImageCaptureUseCaseImpl;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;
import io.grpc.LoadBalancer$Helper;
import io.sentry.SentryUUID;
import java.util.LinkedHashSet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFontTypefaceLoader;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FragmentTransitionSupport;
import o.StretchedVideoResolutionQuirk;
import o.SwipeRefreshLayoutSavedState;
import o.accessisRenderNodeCompatiblecp;
import o.getBirthDateFull;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getLogoDescription;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.minIntrinsicWidth;
import o.onAttachedToLayoutParams;
import o.onDependentViewRemoved;
import o.onItemDismiss;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setNavigationOnClickListener;
import o.setWidgetBaseline;
import o.toFlashState;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SelfieCameraContentKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r1 r3
  0x002b: PHI (r1v12 com.roadrunner.face.verification.presentation.selfie.camera.SelfieCameraContentKt$getCameraProvider$1) = 
  (r1v11 com.roadrunner.face.verification.presentation.selfie.camera.SelfieCameraContentKt$getCameraProvider$1)
  (r1v14 com.roadrunner.face.verification.presentation.selfie.camera.SelfieCameraContentKt$getCameraProvider$1)
 binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r3v2 int) = (r3v1 int), (r3v4 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    public static final Object access$getCameraProvider(Context context, ContinuationImpl continuationImpl) {
        SelfieCameraContentKt$getCameraProvider$1 selfieCameraContentKt$getCameraProvider$1;
        int i;
        int i2 = 2 % 2;
        if (continuationImpl instanceof SelfieCameraContentKt$getCameraProvider$1) {
            int i3 = IconCompatParcelizer + 95;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                selfieCameraContentKt$getCameraProvider$1 = (SelfieCameraContentKt$getCameraProvider$1) continuationImpl;
                i = selfieCameraContentKt$getCameraProvider$1.RemoteActionCompatParcelizer;
                int i4 = 93 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    selfieCameraContentKt$getCameraProvider$1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    selfieCameraContentKt$getCameraProvider$1 = new SelfieCameraContentKt$getCameraProvider$1(continuationImpl);
                    int i5 = IconCompatParcelizer + 71;
                    read = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                }
            } else {
                selfieCameraContentKt$getCameraProvider$1 = (SelfieCameraContentKt$getCameraProvider$1) continuationImpl;
                i = selfieCameraContentKt$getCameraProvider$1.RemoteActionCompatParcelizer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    selfieCameraContentKt$getCameraProvider$1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    selfieCameraContentKt$getCameraProvider$1 = new SelfieCameraContentKt$getCameraProvider$1(continuationImpl);
                    int i7 = IconCompatParcelizer + 71;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                }
            }
        } else {
            selfieCameraContentKt$getCameraProvider$1 = new SelfieCameraContentKt$getCameraProvider$1(continuationImpl);
            int i9 = IconCompatParcelizer + 71;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        Object result = selfieCameraContentKt$getCameraProvider$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = selfieCameraContentKt$getCameraProvider$1.RemoteActionCompatParcelizer;
        int i12 = 1;
        if (i11 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(result);
            selfieCameraContentKt$getCameraProvider$1.RemoteActionCompatParcelizer = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(selfieCameraContentKt$getCameraProvider$1));
            cancellableContinuationImpl.read();
            minIntrinsicWidth minintrinsicwidth = minIntrinsicWidth.IconCompatParcelizer;
            StretchedVideoResolutionQuirk stretchedVideoResolutionQuirkWrite = zzpd.write(context);
            stretchedVideoResolutionQuirkWrite.RemoteActionCompatParcelizer(new SwipeRefreshLayoutSavedState(cancellableContinuationImpl, stretchedVideoResolutionQuirkWrite, i12), context.getMainExecutor());
            cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new FragmentTransitionSupport(stretchedVideoResolutionQuirkWrite, 1));
            result = cancellableContinuationImpl.getResult();
            if (result == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i13 = read + 105;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(result);
            int i15 = read + 33;
            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
        }
        return ((onItemDismiss) result).IconCompatParcelizer;
    }

    public static final void IconCompatParcelizer(setNavigationOnClickListener setnavigationonclicklistener, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(636864663);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(setnavigationonclicklistener) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i4 & 19) != 18) {
            int i5 = IconCompatParcelizer + 91;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i4 & 1, z)) {
            modifier2 = Modifier.Companion;
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                int i7 = read + 109;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    objComponentActivity = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode);
                    getpostalcode.write(objComponentActivity);
                    int i8 = 11 / 0;
                } else {
                    objComponentActivity = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode);
                    getpostalcode.write(objComponentActivity);
                }
            }
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(new toFlashState(0));
            getLogoDescription getlogodescription = new getLogoDescription(linkedHashSet);
            Modifier modifierThen = modifier2.then(SizeKt.read);
            modifierThen.getClass();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getcontentviewgroupparentlayout);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(accessisrendernodecompatiblecp);
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(getlogodescription);
            boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(setnavigationonclicklistener);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3 | zIconCompatParcelizer4) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new NavControllerImpl$$ExternalSyntheticLambda0(getcontentviewgroupparentlayout, accessisrendernodecompatiblecp, getlogodescription, setnavigationonclicklistener, 14);
                getpostalcode.write(objComponentActivity2);
            }
            AndroidView_androidKt.AndroidView((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, modifierThen, null, getpostalcode, 0, 4);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i9 = IconCompatParcelizer + 79;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                int i10 = 2 / 4;
            }
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 28, setnavigationonclicklistener, modifier2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0052  */
    /* JADX WARN: Code duplicated, block: B:13:0x0058  */
    /* JADX WARN: Code duplicated, block: B:16:0x0064  */
    /* JADX WARN: Code duplicated, block: B:17:0x0066  */
    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:21:0x006d A[PHI: r2
  0x006d: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0045, B:5:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0047 A[PHI: r2
  0x0047: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0045, B:5:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void SelfieCameraContent(int i, getBirthDateFull getbirthdatefull, Modifier modifier, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, setWidgetBaseline setwidgetbaseline, onDependentViewRemoved ondependentviewremoved, NestFragment.AnonymousClass1 anonymousClass1, NestFragment.AnonymousClass1 anonymousClass2, NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = IconCompatParcelizer + 85;
        read = i9 % Fields.SpotShadowColor;
        Object obj = null;
        if (i9 % 2 != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            ondependentviewremoved.getClass();
            setwidgetbaseline.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(573866852);
            if ((i & 64) == 0) {
                i2 = IconCompatParcelizer + 87;
                read = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    if (getpostalcode.IconCompatParcelizer(anonymousClass1)) {
                        i5 = read + 121;
                        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                        if (i5 % 2 == 0) {
                            i3 = 2;
                        } else {
                            i3 = 4;
                        }
                    } else {
                        i3 = 2;
                    }
                    i4 = i3 | i;
                } else {
                    getpostalcode.IconCompatParcelizer(anonymousClass1);
                    throw null;
                }
            } else {
                i4 = i;
            }
        } else {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            ondependentviewremoved.getClass();
            setwidgetbaseline.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(573866852);
            if ((i & 6) == 0) {
                i2 = IconCompatParcelizer + 87;
                read = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    if (getpostalcode.IconCompatParcelizer(anonymousClass1)) {
                        i5 = read + 121;
                        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                        if (i5 % 2 == 0) {
                            i3 = 2;
                        } else {
                            i3 = 4;
                        }
                    } else {
                        i3 = 2;
                    }
                    i4 = i3 | i;
                } else {
                    getpostalcode.IconCompatParcelizer(anonymousClass1);
                    throw null;
                }
            } else {
                i4 = i;
            }
        }
        if ((i & 48) == 0) {
            i4 |= !(getpostalcode.IconCompatParcelizer(nestScreenKt$NestScreen$1$1) ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= getpostalcode.IconCompatParcelizer(anonymousClass2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i10 = read + 65;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                i4 |= getpostalcode.IconCompatParcelizer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) ? Fields.CameraDistance : Fields.RotationZ;
            } else {
                getpostalcode.IconCompatParcelizer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1);
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i11 = IconCompatParcelizer + 91;
                read = i11 % Fields.SpotShadowColor;
                i7 = i11 % 2 != 0 ? 19339 : Fields.Clip;
            } else {
                i7 = 8192;
            }
            i4 |= i7;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(ondependentviewremoved)) {
                int i12 = read + 19;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i6 = Fields.RenderEffect;
            } else {
                i6 = 65536;
            }
            i4 |= i6;
        }
        if ((1572864 & i) == 0) {
            i4 |= getpostalcode.IconCompatParcelizer(setwidgetbaseline) ^ true ? Fields.BlendMode : 1048576;
        }
        if ((12582912 & i) == 0) {
            int i14 = IconCompatParcelizer + 3;
            read = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            i4 |= getpostalcode.read(modifier) ? 8388608 : 4194304;
        }
        if (getpostalcode.write(i4 & 1, (4793491 & i4) != 4793490)) {
            int i16 = read + 19;
            IconCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            Modifier modifierThen = modifier.then(SizeKt.read);
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Object objMediaSessionCompatResultReceiverWrapper = ((ImageCaptureUseCaseImpl) setwidgetbaseline).IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                objMediaSessionCompatResultReceiverWrapper.getClass();
                IconCompatParcelizer((setNavigationOnClickListener) objMediaSessionCompatResultReceiverWrapper, null, getpostalcode, 0);
                CameraInstructionsOverlayKt.CameraInstructionsOverlayColumn(null, getpostalcode, 0);
                int i18 = i4 << 6;
                SelfieCameraControlsKt.CameraControls(null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, anonymousClass1, nestScreenKt$NestScreen$1$1, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, anonymousClass2, setwidgetbaseline, ondependentviewremoved.IconCompatParcelizer, ondependentviewremoved.MediaSessionCompatQueueItem, getpostalcode, (i18 & 7168) | ((i4 >> 9) & 112) | (i18 & 896) | ((i4 << 3) & 57344) | (458752 & (i4 << 9)) | (i4 & 3670016));
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new onAttachedToLayoutParams(anonymousClass1, nestScreenKt$NestScreen$1$1, anonymousClass2, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, ondependentviewremoved, setwidgetbaseline, modifier, i);
        }
    }
}
