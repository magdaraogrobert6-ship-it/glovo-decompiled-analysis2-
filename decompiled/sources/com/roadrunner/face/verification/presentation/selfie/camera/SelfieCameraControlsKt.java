package com.roadrunner.face.verification.presentation.selfie.camera;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.MutatorMutex$mutate$2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import bo.app.b1$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.roadrunner.face.verification.api.selfie.CameraImage;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;
import com.roadrunner.rrds.compose.component.message.SnackbarKt$$ExternalSyntheticLambda2;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import kotlinx.coroutines.BuildersKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.BasicTextKt;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TooltipStateImplshow2;
import o.canReadPlayIds;
import o.deletePackageQueue;
import o.getBirthDateFull;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setWidgetBaseline;
import o.show;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SelfieCameraControlsKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    public static final void read(int i, getBirthDateFull getbirthdatefull, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-876562114);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i4 = read + 91;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i6 = read + 9;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 |= getpostalcode.write(z) ? 256 : Fields.SpotShadowColor;
        }
        if ((i2 & 147) != 146) {
            int i8 = read + 87;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i2 & 1, z2)) {
            if ((i2 & 896) == 256) {
                z3 = true;
            } else {
                int i10 = IconCompatParcelizer + 55;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                z3 = false;
            }
            if ((i2 & 112) == 32) {
                int i12 = read + 81;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                z4 = true;
            } else {
                z4 = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (!z4 && !z3) {
                int i14 = IconCompatParcelizer + 115;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new BasicTextKt(1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z);
                    getpostalcode.write(objComponentActivity);
                }
            } else {
                objComponentActivity = new BasicTextKt(1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z);
                getpostalcode.write(objComponentActivity);
            }
            Modifier modifier2 = canReadPlayIds.read(modifier, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 63);
            modifier2.getClass();
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_selfie_camera_button, getpostalcode, 0), null, modifier2, null, null, 0.0f, null, getpostalcode, Painter.$stable | 48, 120);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new deletePackageQueue(modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z, i, 3);
        }
    }

    public static final void CameraControls(Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final NestFragment.AnonymousClass1 anonymousClass1, final NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$1, final DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, final NestFragment.AnonymousClass1 anonymousClass2, final setWidgetBaseline setwidgetbaseline, final CameraImage cameraImage, boolean z, getBirthDateFull getbirthdatefull, int i) {
        boolean z2;
        Modifier modifier2;
        boolean z3;
        AndroidContentCaptureManager androidContentCaptureManager;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        setwidgetbaseline.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1110246629);
        int i7 = i | 6;
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i8 = read + 1;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                i5 = i8 % 2 == 0 ? 102 : 32;
            } else {
                i5 = 16;
            }
            i7 |= i5;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(anonymousClass1)) {
                int i9 = read + 93;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                i4 = i9 % 2 == 0 ? 7211 : Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i7 |= i4;
        }
        if ((i & 3072) == 0) {
            int i10 = read + 11;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i7 |= getpostalcode.IconCompatParcelizer(nestScreenKt$NestScreen$1$1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i7 |= getpostalcode.IconCompatParcelizer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) ? Fields.Clip : 8192;
        }
        if ((i & 196608) == 0) {
            i7 |= getpostalcode.IconCompatParcelizer(anonymousClass2) ? Fields.RenderEffect : 65536;
        }
        if ((i & 1572864) == 0) {
            i7 |= getpostalcode.IconCompatParcelizer(setwidgetbaseline) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            i7 |= getpostalcode.IconCompatParcelizer(cameraImage) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            if (getpostalcode.write(z)) {
                i3 = 67108864;
            } else {
                int i12 = IconCompatParcelizer + 65;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i3 = 33554432;
            }
            i7 |= i3;
        }
        int i14 = i7;
        if ((38347923 & i14) != 38347922) {
            int i15 = IconCompatParcelizer + 13;
            read = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i14 & 1, z2)) {
            Modifier.Companion companion = Modifier.Companion;
            final Context context = (Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager2) {
                int i17 = read + 33;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                objComponentActivity = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode);
                getpostalcode.write(objComponentActivity);
            }
            final getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getcontentviewgroupparentlayout);
            if ((i14 & 7168) == 2048) {
                int i19 = read + 45;
                IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(setwidgetbaseline);
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(context);
            boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(cameraImage);
            boolean z4 = (i14 & 896) == 256;
            boolean z5 = (458752 & i14) == 131072;
            boolean z6 = (57344 & i14) == 16384;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (((z3 | zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3 | zIconCompatParcelizer4 | z4 | z5) || z6) || objComponentActivity2 == androidContentCaptureManager2) {
                androidContentCaptureManager = androidContentCaptureManager2;
                i2 = 32;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.blocksInteractionBelow
                    private static int MediaBrowserCompatMediaItem = 0;
                    private static int MediaMetadataCompat = 1;

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i21 = 2 % 2;
                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new MutatorMutex$mutate$2(nestScreenKt$NestScreen$1$1, setwidgetbaseline, context, cameraImage, anonymousClass1, anonymousClass2, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, null, 8), 3);
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i22 = MediaBrowserCompatMediaItem + 17;
                        MediaMetadataCompat = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i22 % 2 == 0) {
                            int i23 = 76 / 0;
                        }
                        return createfromparcel;
                    }
                };
                getpostalcode.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                objComponentActivity2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
            } else {
                androidContentCaptureManager = androidContentCaptureManager2;
                i2 = 32;
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
            Modifier modifierThen = modifier2.then(SizeKt.read);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i21 = read + 29;
            IconCompatParcelizer = i21 % Fields.SpotShadowColor;
            if (i21 % 2 != 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                HeaderKt.m5063HeaderbbrV0mI(null, null, null, Color.Companion.m757getTransparent0d7_KjU(), 0.0f, ExtrasKt.write(589132538, new SnackbarKt$$ExternalSyntheticLambda2(companion, 9, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), null, null, null, getpostalcode, 199680, 471);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, modifier2.then(new show(1.0f, true))});
                float f = Dimensions.getActionView;
                read((i14 >> 18) & 896, getpostalcode, PaddingKt.read(modifier2, f, f, f, Dimensions.setCustomView), r8lambdardpfsr94j4iebcwx_kpqzpm8k2, z);
                getpostalcode.IconCompatParcelizer(true);
                boolean z7 = (i14 & 112) == i2;
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (z7 || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new b1$$ExternalSyntheticLambda0(16, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity3);
                }
                DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, getpostalcode, 0, 1);
            } else {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z8 = getpostalcode.ComponentActivity;
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new TooltipStateImplshow2(modifier2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, anonymousClass1, nestScreenKt$NestScreen$1$1, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, anonymousClass2, setwidgetbaseline, cameraImage, z, i);
        }
    }
}
