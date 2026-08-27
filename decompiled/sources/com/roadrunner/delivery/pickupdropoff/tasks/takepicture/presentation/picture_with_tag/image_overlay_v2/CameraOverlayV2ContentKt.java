package com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2;

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
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt$CameraOverlayV2Content$3$1;
import com.roadrunner.delivery.pickupdropoff.tasks.model.OverlayItems$Tag$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import java.util.List;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.C0158device;
import o.CommitTextCommand;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.ShortNewsContentCardView;
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
import o.toIntRectozmzZPI;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CameraOverlayV2ContentKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        if (androidx.compose.animation.core.Animatable.IconCompatParcelizer(r9, r10, r2, r1, 12) == r3) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$startOpacityAnimation(androidx.compose.animation.core.Animatable r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.read
            int r1 = r1 + 27
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.IconCompatParcelizer = r2
            int r1 = r1 % r0
            boolean r1 = r10 instanceof o.timeskPz2Gy4
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L13
            goto L2b
        L13:
            r1 = r10
            o.timeskPz2Gy4 r1 = (o.timeskPz2Gy4) r1
            int r3 = r1.read
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L2b
            int r10 = com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.read
            int r10 = r10 + 5
            int r5 = r10 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.IconCompatParcelizer = r5
            int r10 = r10 % r0
            int r3 = r3 + r4
            r1.read = r3
            goto L30
        L2b:
            o.timeskPz2Gy4 r1 = new o.timeskPz2Gy4
            r1.<init>(r10)
        L30:
            java.lang.Object r10 = r1.IconCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r1.read
            r5 = 12
            r6 = 0
            if (r4 == 0) goto L67
            if (r4 == r2) goto L61
            int r9 = com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.IconCompatParcelizer
            int r9 = r9 + 99
            int r1 = r9 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.read = r1
            int r9 = r9 % r0
            if (r9 == 0) goto L4c
            r9 = 3
            if (r4 != r9) goto L5b
            goto L4e
        L4c:
            if (r4 != r0) goto L5b
        L4e:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            int r9 = com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.IconCompatParcelizer
            int r9 = r9 + 111
            int r10 = r9 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.read = r10
            int r9 = r9 % r0
            goto L9f
        L5b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            return r6
        L61:
            androidx.compose.animation.core.Animatable r9 = r1.write
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L84
        L67:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            java.lang.Float r10 = new java.lang.Float
            r4 = 1061997773(0x3f4ccccd, float:0.8)
            r10.<init>(r4)
            o.requiredWidthInVpY3zN4default r4 = new o.requiredWidthInVpY3zN4default
            r7 = 0
            r8 = 7
            r4.<init>(r7, r6, r8)
            r1.write = r9
            r1.read = r2
            java.lang.Object r10 = androidx.compose.animation.core.Animatable.IconCompatParcelizer(r9, r10, r4, r1, r5)
            if (r10 != r3) goto L84
            goto L9e
        L84:
            java.lang.Float r10 = new java.lang.Float
            r2 = 1053609165(0x3ecccccd, float:0.4)
            r10.<init>(r2)
            o.requiredWidthInVpY3zN4default r2 = new o.requiredWidthInVpY3zN4default
            r4 = 1000(0x3e8, float:1.401E-42)
            r7 = 4
            r2.<init>(r4, r6, r7)
            r1.write = r6
            r1.read = r0
            java.lang.Object r9 = androidx.compose.animation.core.Animatable.IconCompatParcelizer(r9, r10, r2, r1, r5)
            if (r9 != r3) goto L9f
        L9e:
            return r3
        L9f:
            o.createFromParcel r9 = o.createFromParcel.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2.CameraOverlayV2ContentKt.access$startOpacityAnimation(androidx.compose.animation.core.Animatable, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:116:0x034a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:55:0x010b  */
    public static final void CameraOverlayV2Content(final toIntRectozmzZPI tointrectozmzzpi, Modifier modifier, float f, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        final Modifier modifier2;
        final float f2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        Modifier modifier3;
        float f3;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        int i3;
        int i4 = 2 % 2;
        tointrectozmzzpi.getClass();
        List list = tointrectozmzzpi.serializer;
        List list2 = tointrectozmzzpi.RemoteActionCompatParcelizer;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1922836338);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(tointrectozmzzpi) : getpostalcode.IconCompatParcelizer(tointrectozmzzpi)) {
                int i5 = IconCompatParcelizer + 49;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 48;
        if ((i & 384) == 0) {
            i7 = i2 | 176;
        }
        if (getpostalcode.write(i7 & 1, !((i7 & 147) == 146))) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0) {
                int i8 = read + 53;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (getpostalcode.PlaybackStateCompat()) {
                    modifier3 = Modifier.Companion;
                    f3 = 0.8f;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    modifier3 = modifier;
                    f3 = f;
                }
            } else {
                modifier3 = Modifier.Companion;
                f3 = 0.8f;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (list2.isEmpty()) {
                int i10 = IconCompatParcelizer + 81;
                read = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    list.isEmpty();
                    throw null;
                }
                if (!(!list.isEmpty())) {
                    int i11 = read + 59;
                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                    if (gethandleruiannotationsMediaDescriptionCompat == null) {
                        return;
                    }
                    final int i13 = 0;
                    final Modifier modifier4 = modifier3;
                    final float f4 = f3;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.isSpimpl
                        private static int MediaBrowserCompatMediaItem = 1;
                        private static int MediaSessionCompatQueueItem;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            int i14 = 2 % 2;
                            int i15 = MediaSessionCompatQueueItem + 23;
                            MediaBrowserCompatMediaItem = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i16 = i15 % 2;
                            int i17 = i13;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i18 = i;
                            float f5 = f4;
                            androidx.compose.ui.Modifier modifier5 = modifier4;
                            toIntRectozmzZPI tointrectozmzzpi2 = tointrectozmzzpi;
                            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                            ((Integer) obj2).getClass();
                            if (i17 != 0) {
                                CameraOverlayV2ContentKt.CameraOverlayV2Content(tointrectozmzzpi2, modifier5, f5, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i18 | 1));
                                return createfromparcel;
                            }
                            CameraOverlayV2ContentKt.CameraOverlayV2Content(tointrectozmzzpi2, modifier5, f5, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i18 | 1));
                            int i19 = MediaBrowserCompatMediaItem + 93;
                            MediaSessionCompatQueueItem = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i20 = i19 % 2;
                            return createfromparcel;
                        }
                    };
                }
                gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
            }
            boolean zBooleanValue = ((Boolean) getpostalcode.write((getNewPassword) InspectionModeKt.getLocalInspectionMode())).booleanValue();
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                int i14 = read + 55;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                if (i14 % 2 == 0) {
                    objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode);
                    int i15 = 21 / 0;
                } else {
                    objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode);
                }
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) objComponentActivity;
            boolean z = getpostalcode.read(list);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z) {
                objComponentActivity2 = removeNodeAtDepth.read(list);
                getpostalcode.write(objComponentActivity2);
            } else {
                int i16 = IconCompatParcelizer + 37;
                read = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = removeNodeAtDepth.read(list);
                    getpostalcode.write(objComponentActivity2);
                }
            }
            r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq = (r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ) objComponentActivity2;
            boolean z2 = getpostalcode.read(list2);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (z2 || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = removeNodeAtDepth.read(list2);
                getpostalcode.write(objComponentActivity3);
            }
            r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq2 = (r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ) objComponentActivity3;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                int i17 = read + 31;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    objComponentActivity4 = mainAxisk4lQ0M.write(f3);
                    getpostalcode.write(objComponentActivity4);
                    int i18 = 35 / 0;
                } else {
                    objComponentActivity4 = mainAxisk4lQ0M.write(f3);
                    getpostalcode.write(objComponentActivity4);
                }
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
                objComponentActivity6 = new CommitTextCommand(getplatformandroidmanager, 3);
                getpostalcode.write(objComponentActivity6);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity6;
            WindowInfo windowInfo = (WindowInfo) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalWindowInfo());
            Density density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
            boolean z3 = getpostalcode.read(windowInfo);
            Object objComponentActivity7 = getpostalcode.ComponentActivity();
            if (z3 || objComponentActivity7 == androidContentCaptureManager) {
                float fMo45toDpu2uoSUM = density.mo45toDpu2uoSUM((int) (windowInfo.mo2753getContainerSizeYbymL2g() & 4294967295L));
                if (!zBooleanValue) {
                    fMo45toDpu2uoSUM = Dp.m3673constructorimpl(fMo45toDpu2uoSUM * 0.4f);
                }
                objComponentActivity7 = Dp.m3671boximpl(fMo45toDpu2uoSUM);
                getpostalcode.write(objComponentActivity7);
            }
            float fM3687unboximpl = ((Dp) objComponentActivity7).m3687unboximpl();
            int iSerializer = ((onHideTranslationui) getplatformandroidmanager).serializer();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(animatable);
            Object objComponentActivity8 = getpostalcode.ComponentActivity();
            int i19 = 8;
            if (zIconCompatParcelizer || objComponentActivity8 == androidContentCaptureManager) {
                objComponentActivity8 = new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable, shortNewsContentCardView, i19);
                getpostalcode.write(objComponentActivity8);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, Integer.valueOf(iSerializer), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity8);
            boolean zIconCompatParcelizer2 = scrollState.RatingCompat.IconCompatParcelizer();
            boolean z4 = getpostalcode.read(scrollState);
            Object objComponentActivity9 = getpostalcode.ComponentActivity();
            if (z4 || objComponentActivity9 == androidContentCaptureManager) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                objComponentActivity9 = new CameraOverlayV2ContentKt$CameraOverlayV2Content$3$1(scrollState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, shortNewsContentCardView, 1);
                getpostalcode.write(objComponentActivity9);
            } else {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
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
                objComponentActivity11 = new getDpannotations(setalpha, 3);
                getpostalcode.write(objComponentActivity11);
            }
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity11;
            float f5 = Dimensions.setMenu;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
            Modifier modifierWrite = SizeKt.write(SizeKt.m76heightInVpY3zN4$default(PaddingKt.m74paddingqDBjuR0$default(modifier3, f5, f5, f5, 0.0f, 8), 0.0f, fM3687unboximpl, 1), 1.0f);
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(animatable);
            Object objComponentActivity12 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer3 || objComponentActivity12 == androidContentCaptureManager) {
                objComponentActivity12 = new setEditorBoundsInfo(animatable, 4);
                getpostalcode.write(objComponentActivity12);
            }
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(GraphicsLayerModifierKt.graphicsLayer(modifierWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity12), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setPadding)), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), RectangleShapeKt.getRectangleShape());
            Object objComponentActivity13 = getpostalcode.ComponentActivity();
            if (objComponentActivity13 == androidContentCaptureManager) {
                objComponentActivity13 = new b1$$ExternalSyntheticLambda0(15, r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                getpostalcode.write(objComponentActivity13);
                int i20 = IconCompatParcelizer + 75;
                read = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
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
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            InstructionsListContentKt.InstructionsListContent(r8lambdaiidsddyirtymdul5lt6pmt2zysq, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, removeNodeAtDepth.IconCompatParcelizer(setalpha), r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, null, getpostalcode, 3120);
            if (r8lambdaiidsddyirtymdul5lt6pmt2zysq.isEmpty()) {
                getpostalcode.serializer(710370590);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                int i22 = IconCompatParcelizer + 77;
                read = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                if (r8lambdaiidsddyirtymdul5lt6pmt2zysq2.isEmpty()) {
                    getpostalcode.serializer(710370590);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    int i24 = read + 57;
                    IconCompatParcelizer = i24 % Fields.SpotShadowColor;
                    int i25 = i24 % 2;
                    getpostalcode.serializer(710267763);
                    DividerKt.read(0.0f, 0, 6, 0L, getpostalcode, PaddingKt.m73paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dimensions.setActionBarVisibilityCallback, 1));
                    getpostalcode.IconCompatParcelizer(false);
                }
            }
            OverlayItems$Tag$Companion overlayItems$Tag$Companion = C0158device.Companion;
            TagsListContentKt.TagsList(r8lambdaiidsddyirtymdul5lt6pmt2zysq2, null, getpostalcode, 8);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = modifier3;
            f2 = f3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            f2 = f;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i26 = 1;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.isSpimpl
                private static int MediaBrowserCompatMediaItem = 1;
                private static int MediaSessionCompatQueueItem;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i110 = 2 % 2;
                    int i111 = MediaSessionCompatQueueItem + 23;
                    MediaBrowserCompatMediaItem = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i112 = i111 % 2;
                    int i113 = i26;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i114 = i;
                    float f6 = f2;
                    androidx.compose.ui.Modifier modifier5 = modifier2;
                    toIntRectozmzZPI tointrectozmzzpi2 = tointrectozmzzpi;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    ((Integer) obj2).getClass();
                    if (i113 != 0) {
                        CameraOverlayV2ContentKt.CameraOverlayV2Content(tointrectozmzzpi2, modifier5, f6, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i114 | 1));
                        return createfromparcel;
                    }
                    CameraOverlayV2ContentKt.CameraOverlayV2Content(tointrectozmzzpi2, modifier5, f6, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i114 | 1));
                    int i115 = MediaBrowserCompatMediaItem + 93;
                    MediaSessionCompatQueueItem = i115 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i27 = i115 % 2;
                    return createfromparcel;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
    }
}
