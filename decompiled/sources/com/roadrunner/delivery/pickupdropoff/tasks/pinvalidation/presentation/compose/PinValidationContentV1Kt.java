package com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.presentation.compose;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.pcn;
import com.roadrunner.delivery.pickupdropoff.tasks.api.mapper.MessageBoxTypeTokenMapperKt;
import com.roadrunner.delivery.pickupdropoff.tasks.model.PinValidationTaskUiItem$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.presentation.PinValidationTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.presentation.compose.PinValidationContentV1Kt;
import com.roadrunner.delivery.state.pudo.MessageBoxTypeToken;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.pin.PinValidationRowKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidUiModes;
import o.C0212wallpaper;
import o.ComposeAnimationState;
import o.Device;
import o.Devices;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PreviewLightDark;
import o.apiLevel;
import o.buildMapping;
import o.enableBridgeSecurity;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getNewPassword;
import o.getPostalCode;
import o.getWEAR_OS_LARGE_ROUNDannotations;
import o.getWEAR_OS_RECTannotations;
import o.handleUrlOverridelambda1;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isSpecified0680j_4;
import o.isSpecified0680j_4annotations;
import o.mapTreeWithStitching;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PinValidationContentV1Kt {
    private static int serializer = 0;
    private static int write = 1;

    public static final void serializer(final PinValidationTaskUiModelImpl pinValidationTaskUiModelImpl, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        final Modifier modifier2;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i3;
        int i4;
        int i5 = 2 % 2;
        pinValidationTaskUiModelImpl.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(136709568);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(pinValidationTaskUiModelImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = write + 37;
            serializer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i7 = serializer + 39;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (!(!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0))) {
                i3 = Fields.RotationX;
            } else {
                int i9 = write + 21;
                serializer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    int i10 = 3 / 4;
                }
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        int i11 = i2 | 3072;
        if (getpostalcode.write(i11 & 1, (i11 & 1171) != 1170)) {
            final Modifier.Companion companion = Modifier.Companion;
            isSpecified0680j_4annotations isspecified0680j_4annotations = (isSpecified0680j_4annotations) ExtrasKt.write(pinValidationTaskUiModelImpl.ParcelableVolumeInfo, getpostalcode, 0).getValue();
            if (isspecified0680j_4annotations instanceof isSpecified0680j_4) {
                int i12 = serializer + 67;
                write = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                getpostalcode.serializer(1086098260);
                PreviewLightDark previewLightDark = ((isSpecified0680j_4) isspecified0680j_4annotations).RemoteActionCompatParcelizer;
                PinValidationTaskUiItem$Companion pinValidationTaskUiItem$Companion = PreviewLightDark.Companion;
                PinValidationContentV1(previewLightDark, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, companion, getpostalcode, (i11 & 112) | 8 | (i11 & 896) | (i11 & 7168));
                getpostalcode.IconCompatParcelizer(false);
                modifier2 = companion;
            } else {
                getpostalcode.serializer(1086375772);
                getpostalcode.IconCompatParcelizer(false);
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat == null) {
                    return;
                }
                final int i14 = 0;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.lerpxhh869w
                    private static int MediaBrowserCompatMediaItem = 0;
                    private static int MediaSessionCompatQueueItem = 1;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj2, Object obj3) {
                        int i15 = 2 % 2;
                        int i16 = MediaSessionCompatQueueItem + 61;
                        MediaBrowserCompatMediaItem = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i16 % 2 != 0) {
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            throw null;
                        }
                        int i17 = i14;
                        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                        int i18 = i;
                        if (i17 == 0) {
                            ((Integer) obj3).getClass();
                            PinValidationContentV1Kt.serializer(pinValidationTaskUiModelImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, companion, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i18 | 1));
                            return createfromparcel2;
                        }
                        ((Integer) obj3).getClass();
                        PinValidationContentV1Kt.serializer(pinValidationTaskUiModelImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, companion, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i18 | 1));
                        int i19 = MediaBrowserCompatMediaItem + 87;
                        MediaSessionCompatQueueItem = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i19 % 2 != 0) {
                            return createfromparcel2;
                        }
                        throw null;
                    }
                };
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        modifier2 = modifier;
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i15 = 1;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.lerpxhh869w
                private static int MediaBrowserCompatMediaItem = 0;
                private static int MediaSessionCompatQueueItem = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    int i16 = 2 % 2;
                    int i17 = MediaSessionCompatQueueItem + 61;
                    MediaBrowserCompatMediaItem = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i17 % 2 != 0) {
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        throw null;
                    }
                    int i18 = i15;
                    createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                    int i19 = i;
                    if (i18 == 0) {
                        ((Integer) obj3).getClass();
                        PinValidationContentV1Kt.serializer(pinValidationTaskUiModelImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i19 | 1));
                        return createfromparcel2;
                    }
                    ((Integer) obj3).getClass();
                    PinValidationContentV1Kt.serializer(pinValidationTaskUiModelImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i19 | 1));
                    int i110 = MediaBrowserCompatMediaItem + 87;
                    MediaSessionCompatQueueItem = i110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i110 % 2 != 0) {
                        return createfromparcel2;
                    }
                    throw null;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0292  */
    /* JADX WARN: Code duplicated, block: B:83:0x038d  */
    public static final void PinValidationContentV1(PreviewLightDark previewLightDark, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C0212wallpaper c0212wallpaper;
        mapTreeWithStitching maptreewithstitching;
        boolean z5;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1716254985);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i5 = serializer + 93;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                zIconCompatParcelizer = getpostalcode.read(previewLightDark);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(previewLightDark);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = serializer + 117;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i9 = write + 105;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            int i11 = serializer + 41;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i2 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 1171) != 1170)) {
            String str = previewLightDark.errorMessage;
            apiLevel apilevel = previewLightDark.offlineValidation;
            getWEAR_OS_LARGE_ROUNDannotations getwear_os_large_roundannotations = previewLightDark.offlineValidationStatus;
            boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
            Modifier modifierWrite = AnimationModifierKt.write(SizeKt.write(modifier, 1.0f), null, 3);
            modifierWrite.getClass();
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i13 = write + 59;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            String str2 = previewLightDark.title;
            TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long overlayMode = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOverlayMode();
            Modifier.Companion companion2 = Modifier.Companion;
            companion2.getClass();
            TextKt.m131TextNvy7gAk(str2, companion2, overlayMode, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode, 48, 0, 131064);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.getActionBarHideOffset)});
            TextKt.m131TextNvy7gAk(previewLightDark.description, companion2, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getActionBarHideOffset(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.PlaybackStateCompatCustomAction(), getpostalcode, 48, 0, 131064);
            if (getwear_os_large_roundannotations instanceof Devices) {
                getpostalcode.serializer(308818721);
                getpostalcode.IconCompatParcelizer(false);
                z3 = true;
                z4 = false;
            } else {
                int i15 = write + 73;
                serializer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                getpostalcode.serializer(308153709);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.setMenu)});
                TextKt.m131TextNvy7gAk(previewLightDark.pinFieldTitle, PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, Dimensions.getNestedScrollAxes, 7), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getActionBarHideOffset(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-961708487, pcn.serializer(), new Object[0], 961708487, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131064);
                int i17 = previewLightDark.numDigits;
                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = previewLightDark.enteredPin;
                String str3 = previewLightDark.errorMessage;
                if (!zSerializer) {
                    z = false;
                } else {
                    int i18 = write + 29;
                    serializer = i18 % Fields.SpotShadowColor;
                    if (i18 % 2 != 0) {
                        boolean z6 = getwear_os_large_roundannotations instanceof getWEAR_OS_RECTannotations;
                        z = false;
                        int i19 = 5 / 0;
                        if (z6) {
                            z2 = true;
                        }
                    } else {
                        z = false;
                        if (getwear_os_large_roundannotations instanceof getWEAR_OS_RECTannotations) {
                            z2 = true;
                        }
                    }
                    z3 = true;
                    PinValidationRowKt.PinValidationRow(i17, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str3, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, z2, null, false, false, null, false, false, !(getwear_os_large_roundannotations instanceof Device), null, null, null, getpostalcode, (i2 << 6) & 7168, 0, 61392);
                    z4 = false;
                    getpostalcode.IconCompatParcelizer(false);
                }
                z2 = z;
                z3 = true;
                PinValidationRowKt.PinValidationRow(i17, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str3, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, z2, null, false, false, null, false, false, !(getwear_os_large_roundannotations instanceof Device), null, null, null, getpostalcode, (i2 << 6) & 7168, 0, 61392);
                z4 = false;
                getpostalcode.IconCompatParcelizer(false);
            }
            if (zSerializer) {
                getpostalcode.serializer(308898174);
                Device device = Device.INSTANCE;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getwear_os_large_roundannotations, device}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getwear_os_large_roundannotations, getWEAR_OS_RECTannotations.INSTANCE}, getCieXyz.write())).booleanValue()) {
                        int i20 = serializer + 105;
                        write = i20 % Fields.SpotShadowColor;
                        int i21 = i20 % 2;
                        if (apilevel != null) {
                            maptreewithstitching = apilevel.errorMessage;
                        } else {
                            maptreewithstitching = null;
                        }
                    } else {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getwear_os_large_roundannotations, Devices.INSTANCE}, getCieXyz.write())).booleanValue()) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getwear_os_large_roundannotations, AndroidUiModes.INSTANCE}, getCieXyz.write())).booleanValue()) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return;
                            }
                        } else if (apilevel != null && (c0212wallpaper = apilevel.pinAttempts) != null) {
                            maptreewithstitching = c0212wallpaper.errorMessage;
                        }
                        maptreewithstitching = null;
                    }
                } else if (apilevel != null) {
                    maptreewithstitching = apilevel.successMessage;
                } else {
                    maptreewithstitching = null;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getwear_os_large_roundannotations, device}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getwear_os_large_roundannotations, getWEAR_OS_RECTannotations.INSTANCE}, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getwear_os_large_roundannotations, Devices.INSTANCE}, getCieXyz.write())).booleanValue()) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getwear_os_large_roundannotations, AndroidUiModes.INSTANCE}, getCieXyz.write())).booleanValue()) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return;
                            }
                        }
                    }
                }
                if (maptreewithstitching == null) {
                    getpostalcode.serializer(309780061);
                    getpostalcode.IconCompatParcelizer(z4);
                    z5 = z4;
                } else {
                    getpostalcode.serializer(309780062);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(r14, Dimensions.setMenu)});
                    MessageBoxTypeToken messageBoxTypeToken = maptreewithstitching.type;
                    Integer num = maptreewithstitching.icon;
                    String str4 = maptreewithstitching.title;
                    String str5 = maptreewithstitching.body;
                    ComposeAnimationState composeAnimationState = maptreewithstitching.button;
                    z5 = z4;
                    MessageBoxTypeTokenMapperKt.read(messageBoxTypeToken, companion2, num, str4, str5, composeAnimationState != null ? composeAnimationState.actionTitle : null, enableBridgeSecurity.SECONDARY_SMALL, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, ((i2 << 15) & 29360128) | 1572864, 0);
                    getpostalcode.IconCompatParcelizer(z5);
                }
                getpostalcode.IconCompatParcelizer(z5);
            } else {
                getpostalcode.serializer(310407905);
                getpostalcode.IconCompatParcelizer(z4);
            }
            int i22 = write + 69;
            serializer = i22 % Fields.SpotShadowColor;
            int i23 = i22 % 2;
            getpostalcode.IconCompatParcelizer(z3);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera(previewLightDark, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i);
        }
    }
}
