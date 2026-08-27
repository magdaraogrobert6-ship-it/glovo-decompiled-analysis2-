package com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3$1$1;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import bo.app.b1$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayState;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.CommitTextCommand;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.ShortNewsContentCardView;
import o.Transition3;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getDpannotations;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPlatformAndroidManager;
import o.getPostalCode;
import o.mainAxisk4lQ0M;
import o.onHideTranslationui;
import o.performMeasureDjhGOtQ;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setAlpha;
import o.setEditorBoundsInfo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CameraOverlayV2ContentKt {
    private static int serializer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (androidx.compose.animation.core.Animatable.IconCompatParcelizer(r9, r10, r3, r1, 12) == r2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$startOpacityAnimation(androidx.compose.animation.core.Animatable r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r10 instanceof o.builddefault
            if (r1 == 0) goto L16
            r1 = r10
            o.builddefault r1 = (o.builddefault) r1
            int r2 = r1.IconCompatParcelizer
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 + r3
            r1.IconCompatParcelizer = r2
            goto L1b
        L16:
            o.builddefault r1 = new o.builddefault
            r1.<init>(r10)
        L1b:
            java.lang.Object r10 = r1.serializer
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.IconCompatParcelizer
            r4 = 12
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L59
            int r9 = com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.serializer
            int r9 = r9 + 51
            int r7 = r9 % 128
            com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.write = r7
            int r9 = r9 % r0
            if (r9 != 0) goto L35
            if (r3 == r5) goto L53
            goto L37
        L35:
            if (r3 == r5) goto L53
        L37:
            if (r3 != r0) goto L44
            int r7 = r7 + 17
            int r9 = r7 % 128
            com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.serializer = r9
            int r7 = r7 % r0
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L91
        L44:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            int r9 = com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.serializer
            int r9 = r9 + 27
            int r10 = r9 % 128
            com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.write = r10
            int r9 = r9 % r0
            return r6
        L53:
            androidx.compose.animation.core.Animatable r9 = r1.RemoteActionCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L76
        L59:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            java.lang.Float r10 = new java.lang.Float
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            r10.<init>(r3)
            o.requiredWidthInVpY3zN4default r3 = new o.requiredWidthInVpY3zN4default
            r7 = 0
            r8 = 7
            r3.<init>(r7, r6, r8)
            r1.RemoteActionCompatParcelizer = r9
            r1.IconCompatParcelizer = r5
            java.lang.Object r10 = androidx.compose.animation.core.Animatable.IconCompatParcelizer(r9, r10, r3, r1, r4)
            if (r10 != r2) goto L76
            goto L90
        L76:
            java.lang.Float r10 = new java.lang.Float
            r3 = 1053609165(0x3ecccccd, float:0.4)
            r10.<init>(r3)
            o.requiredWidthInVpY3zN4default r3 = new o.requiredWidthInVpY3zN4default
            r5 = 1000(0x3e8, float:1.401E-42)
            r7 = 4
            r3.<init>(r5, r6, r7)
            r1.RemoteActionCompatParcelizer = r6
            r1.IconCompatParcelizer = r0
            java.lang.Object r9 = androidx.compose.animation.core.Animatable.IconCompatParcelizer(r9, r10, r3, r1, r4)
            if (r9 != r2) goto L91
        L90:
            return r2
        L91:
            o.createFromParcel r9 = o.createFromParcel.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.access$startOpacityAnimation(androidx.compose.animation.core.Animatable, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e2  */
    public static final void CameraOverlayV2Content(InAppCameraOverlayState inAppCameraOverlayState, Modifier modifier, float f, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        float f2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Transition3 transition3;
        Modifier modifier3;
        float f3;
        Object objM3671boximpl;
        int i3;
        int i4 = 2 % 2;
        inAppCameraOverlayState.getClass();
        ArrayList arrayList = inAppCameraOverlayState.RemoteActionCompatParcelizer;
        ArrayList arrayList2 = inAppCameraOverlayState.read;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(901552266);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(inAppCameraOverlayState) : getpostalcode.IconCompatParcelizer(inAppCameraOverlayState)) {
                int i5 = write + 99;
                serializer = i5 % Fields.SpotShadowColor;
                i3 = i5 % 2 != 0 ? 3 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if ((i & 384) == 0) {
            i6 = i2 | 176;
        }
        if (getpostalcode.write(i6 & 1, (i6 & 147) != 146)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0 || getpostalcode.PlaybackStateCompat()) {
                modifier3 = Modifier.Companion;
                f3 = 0.8f;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier;
                f3 = f;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            if (arrayList2.isEmpty() && arrayList.isEmpty()) {
                int i7 = serializer + 15;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat == null) {
                    return;
                } else {
                    transition3 = new Transition3(inAppCameraOverlayState, modifier3, f3, i, 1);
                }
            } else {
                boolean zBooleanValue = ((Boolean) getpostalcode.write((getNewPassword) InspectionModeKt.getLocalInspectionMode())).booleanValue();
                Object objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode);
                    int i9 = serializer + 103;
                    write = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) objComponentActivity;
                boolean z = getpostalcode.read((Object) arrayList);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z) {
                    objComponentActivity2 = removeNodeAtDepth.read(arrayList);
                    getpostalcode.write(objComponentActivity2);
                } else {
                    int i11 = serializer + 33;
                    write = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = removeNodeAtDepth.read(arrayList);
                        getpostalcode.write(objComponentActivity2);
                    }
                }
                r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq = (r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ) objComponentActivity2;
                boolean z2 = getpostalcode.read((Object) arrayList2);
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (z2 || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = removeNodeAtDepth.read(arrayList2);
                    getpostalcode.write(objComponentActivity3);
                }
                r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq2 = (r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ) objComponentActivity3;
                Object objComponentActivity4 = getpostalcode.ComponentActivity();
                if (objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = mainAxisk4lQ0M.write(f3);
                    getpostalcode.write(objComponentActivity4);
                }
                Animatable animatable = (Animatable) objComponentActivity4;
                ScrollState scrollState = PagerWrapperFlingBehavior.read(0, getpostalcode, 1);
                Object objComponentActivity5 = getpostalcode.ComponentActivity();
                if (objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = CompositionKt.read(0);
                    getpostalcode.write(objComponentActivity5);
                }
                getPlatformAndroidManager getplatformandroidmanager = (getPlatformAndroidManager) objComponentActivity5;
                Object objComponentActivity6 = getpostalcode.ComponentActivity();
                if (objComponentActivity6 == androidContentCaptureManager) {
                    objComponentActivity6 = new CommitTextCommand(getplatformandroidmanager, 1);
                    getpostalcode.write(objComponentActivity6);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity6;
                WindowInfo windowInfo = (WindowInfo) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalWindowInfo());
                Density density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
                boolean z3 = getpostalcode.read(windowInfo);
                Object objComponentActivity7 = getpostalcode.ComponentActivity();
                if (z3 || objComponentActivity7 == androidContentCaptureManager) {
                    float fMo45toDpu2uoSUM = density.mo45toDpu2uoSUM((int) (windowInfo.mo2753getContainerSizeYbymL2g() & 4294967295L));
                    if (!zBooleanValue) {
                        fMo45toDpu2uoSUM = Dp.m3673constructorimpl(fMo45toDpu2uoSUM * 0.4f);
                    }
                    objM3671boximpl = Dp.m3671boximpl(fMo45toDpu2uoSUM);
                    getpostalcode.write(objM3671boximpl);
                } else {
                    objM3671boximpl = objComponentActivity7;
                }
                float fM3687unboximpl = ((Dp) objM3671boximpl).m3687unboximpl();
                int iSerializer = ((onHideTranslationui) getplatformandroidmanager).serializer();
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(animatable);
                Object objComponentActivity8 = getpostalcode.ComponentActivity();
                ShortNewsContentCardView shortNewsContentCardView = null;
                if (zIconCompatParcelizer || objComponentActivity8 == androidContentCaptureManager) {
                    objComponentActivity8 = new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable, shortNewsContentCardView, 2);
                    getpostalcode.write(objComponentActivity8);
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, Integer.valueOf(iSerializer), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity8);
                boolean zIconCompatParcelizer2 = scrollState.RatingCompat.IconCompatParcelizer();
                boolean z4 = getpostalcode.read(scrollState);
                Object objComponentActivity9 = getpostalcode.ComponentActivity();
                if (z4 || objComponentActivity9 == androidContentCaptureManager) {
                    objComponentActivity9 = new CameraOverlayV2ContentKt$CameraOverlayV2Content$3$1(scrollState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, shortNewsContentCardView, 0);
                    getpostalcode.write(objComponentActivity9);
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, Boolean.valueOf(zIconCompatParcelizer2), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity9);
                Object objComponentActivity10 = getpostalcode.ComponentActivity();
                if (objComponentActivity10 == androidContentCaptureManager) {
                    objComponentActivity10 = new setAlpha();
                    getpostalcode.write(objComponentActivity10);
                }
                setAlpha setalpha = (setAlpha) objComponentActivity10;
                Object objComponentActivity11 = getpostalcode.ComponentActivity();
                if (objComponentActivity11 == androidContentCaptureManager) {
                    objComponentActivity11 = new getDpannotations(setalpha, 1);
                    getpostalcode.write(objComponentActivity11);
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity11;
                float f4 = Dimensions.setMenu;
                Modifier modifierWrite = SizeKt.write(SizeKt.m76heightInVpY3zN4$default(PaddingKt.m74paddingqDBjuR0$default(modifier3, f4, f4, f4, 0.0f, 8), 0.0f, fM3687unboximpl, 1), 1.0f);
                boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(animatable);
                Object objComponentActivity12 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer3 || objComponentActivity12 == androidContentCaptureManager) {
                    objComponentActivity12 = new setEditorBoundsInfo(animatable, 1);
                    getpostalcode.write(objComponentActivity12);
                }
                Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(GraphicsLayerModifierKt.graphicsLayer(modifierWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity12), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setPadding)), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), RectangleShapeKt.getRectangleShape());
                Object objComponentActivity13 = getpostalcode.ComponentActivity();
                if (objComponentActivity13 == androidContentCaptureManager) {
                    objComponentActivity13 = new b1$$ExternalSyntheticLambda0(8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity13);
                }
                Modifier modifierWrite2 = PaddingKt.write(PagerWrapperFlingBehavior.IconCompatParcelizer(ClickableKt.serializer(modifierM20backgroundbw27NRU, mutableInteractionSourceImpl, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity13, 28), scrollState, false, 14), Dimensions.getNestedScrollAxes);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
                int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
                if (getpostalcode.read == null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i13 = serializer + 69;
                    write = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                InstructionsListContentKt.InstructionsListContent(r8lambdaiidsddyirtymdul5lt6pmt2zysq, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, removeNodeAtDepth.IconCompatParcelizer(setalpha), r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, null, getpostalcode, 3120);
                if (r8lambdaiidsddyirtymdul5lt6pmt2zysq.isEmpty() || r8lambdaiidsddyirtymdul5lt6pmt2zysq2.isEmpty()) {
                    getpostalcode.serializer(235907790);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    int i15 = serializer + 103;
                    write = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 == 0) {
                        getpostalcode.serializer(235804963);
                        DividerKt.read(2.0f, 1, 112, 0L, getpostalcode, PaddingKt.m73paddingVpY3zN4$default(Modifier.Companion, 1.0f, Dimensions.setActionBarVisibilityCallback, 0));
                        getpostalcode.IconCompatParcelizer(true);
                    } else {
                        getpostalcode.serializer(235804963);
                        DividerKt.read(0.0f, 0, 6, 0L, getpostalcode, PaddingKt.m73paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dimensions.setActionBarVisibilityCallback, 1));
                        getpostalcode.IconCompatParcelizer(false);
                    }
                }
                int i16 = write + 5;
                serializer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    TagsListContentKt.TagsList(r8lambdaiidsddyirtymdul5lt6pmt2zysq2, null, getpostalcode, 120);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    TagsListContentKt.TagsList(r8lambdaiidsddyirtymdul5lt6pmt2zysq2, null, getpostalcode, 8);
                    getpostalcode.IconCompatParcelizer(true);
                }
                modifier2 = modifier3;
                f2 = f3;
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = transition3;
        }
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        modifier2 = modifier;
        f2 = f;
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            transition3 = new Transition3(inAppCameraOverlayState, modifier2, f2, i, 2);
            gethandleruiannotationsMediaDescriptionCompat.serializer = transition3;
        }
    }
}
