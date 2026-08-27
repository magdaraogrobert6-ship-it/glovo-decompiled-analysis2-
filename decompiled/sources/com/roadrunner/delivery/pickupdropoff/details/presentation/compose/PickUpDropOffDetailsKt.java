package com.roadrunner.delivery.pickupdropoff.details.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.delivery.pickupdropoff.details.api.PickUpDropOffDetailsUiModel;
import com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.details.presentation.compose.v1.OrderHeaderV1Kt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import com.roadrunner.vendor.review.api.presentation.VendorReviewOptionKt;
import com.roadrunner.vendor.review.presentation.option.VendorReviewOptionUiModelImpl;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.accesstoViewInfoFactory;
import o.findDesignInfoProviderslambda10;
import o.getBirthDateFull;
import o.getClockui_toolingannotations;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambda6ugNDFPZCmsyUQ0qlnt0YI4vxE;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.toAndroidDragEvent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PickUpDropOffDetailsKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    /* JADX WARN: Code duplicated, block: B:101:0x022b  */
    /* JADX WARN: Code duplicated, block: B:104:0x023f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0244  */
    /* JADX WARN: Code duplicated, block: B:107:0x0260  */
    /* JADX WARN: Code duplicated, block: B:109:0x0265  */
    /* JADX WARN: Code duplicated, block: B:111:0x027e  */
    /* JADX WARN: Code duplicated, block: B:112:0x028a  */
    /* JADX WARN: Code duplicated, block: B:117:0x029c  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01af  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x0202  */
    /* JADX WARN: Code duplicated, block: B:87:0x0204  */
    /* JADX WARN: Code duplicated, block: B:91:0x020d  */
    /* JADX WARN: Code duplicated, block: B:94:0x021d  */
    /* JADX WARN: Code duplicated, block: B:95:0x021f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v25 */
    public static final void PickUpDropOffDetails(PickUpDropOffDetailsUiModel pickUpDropOffDetailsUiModel, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        boolean z;
        findDesignInfoProviderslambda10 finddesigninfoproviderslambda10;
        Object obj;
        boolean z2;
        boolean zIconCompatParcelizer;
        Object objComponentActivity;
        boolean z3;
        Object objComponentActivity2;
        boolean z4;
        Object objComponentActivity3;
        ?? r8;
        Object objComponentActivity4;
        boolean z5;
        Object objComponentActivity5;
        int i3;
        int i4 = 2 % 2;
        pickUpDropOffDetailsUiModel.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1773836054);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(pickUpDropOffDetailsUiModel) ? 4 : 2) | i;
        } else {
            int i5 = RemoteActionCompatParcelizer + 63;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i7 = IconCompatParcelizer + 1;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 3 / 3;
                }
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        Object obj2 = null;
        if ((i & 3072) == 0) {
            int i9 = RemoteActionCompatParcelizer + 25;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                obj2.hashCode();
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i10 = i2 | 24576;
        if (getpostalcode.write(i10 & 1, (i10 & 9363) != 9362)) {
            int i11 = IconCompatParcelizer + 33;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            Modifier.Companion companion = Modifier.Companion;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(((PickUpDropOffDetailsUiModelImpl) pickUpDropOffDetailsUiModel).MediaBrowserCompatMediaItem, getpostalcode, 0);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
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
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity6 == androidContentCaptureManager) {
                int i13 = RemoteActionCompatParcelizer + 63;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                getpostalcode.write((Object) null);
                objComponentActivity6 = null;
            }
            String str = (String) objComponentActivity6;
            getpostalcode.serializer(-84785203);
            int i15 = IconCompatParcelizer + 55;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            for (findDesignInfoProviderslambda10 finddesigninfoproviderslambda11 : (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) populateViewStructure_androidKtpopulate7Write.getValue()) {
                if (str != null) {
                    int i17 = RemoteActionCompatParcelizer + 1;
                    IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    if (!(!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) || str.equals(finddesigninfoproviderslambda11.getClass().getName())) {
                        z = true;
                    } else {
                        getpostalcode.serializer(-1822840081);
                        companion = companion;
                        i10 = i10;
                        finddesigninfoproviderslambda11 = finddesigninfoproviderslambda11;
                        z = true;
                        DividerKt.read(0.0f, 0, 7, 0L, getpostalcode, null);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    String name = finddesigninfoproviderslambda11.getClass().getName();
                    finddesigninfoproviderslambda10 = finddesigninfoproviderslambda11;
                    if (finddesigninfoproviderslambda10 instanceof getClockui_toolingannotations) {
                        getpostalcode.serializer(-1822651539);
                        objComponentActivity4 = getpostalcode.ComponentActivity();
                        if (objComponentActivity4 == androidContentCaptureManager) {
                            objComponentActivity4 = ((getClockui_toolingannotations) finddesigninfoproviderslambda10).IconCompatParcelizer;
                            getpostalcode.write(objComponentActivity4);
                        }
                        VendorReviewOptionUiModelImpl vendorReviewOptionUiModelImpl = (VendorReviewOptionUiModelImpl) objComponentActivity4;
                        if ((i10 & 112) == 32) {
                            z5 = z;
                        } else {
                            z5 = false;
                        }
                        objComponentActivity5 = getpostalcode.ComponentActivity();
                        if (z5 || objComponentActivity5 == androidContentCaptureManager) {
                            objComponentActivity5 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(23, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                            getpostalcode.write(objComponentActivity5);
                        }
                        Modifier modifierWrite = SizeKt.write(Modifier.Companion, 1.0f);
                        float f = Dimensions.setActionBarVisibilityCallback;
                        VendorReviewOptionKt.VendorReviewOption(vendorReviewOptionUiModelImpl, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5, PaddingKt.RemoteActionCompatParcelizer(modifierWrite, f, f), getpostalcode, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        if (finddesigninfoproviderslambda10 instanceof r8lambda6ugNDFPZCmsyUQ0qlnt0YI4vxE) {
                            getpostalcode.serializer(-58775751);
                            r8lambda6ugNDFPZCmsyUQ0qlnt0YI4vxE r8lambda6ugndfpzcmsyuq0qlnt0yi4vxe = (r8lambda6ugNDFPZCmsyUQ0qlnt0YI4vxE) finddesigninfoproviderslambda10;
                            if ((i10 & 896) == 256) {
                                z3 = z;
                            } else {
                                z3 = false;
                            }
                            objComponentActivity2 = getpostalcode.ComponentActivity();
                            if (z3 || objComponentActivity2 == androidContentCaptureManager) {
                                objComponentActivity2 = new toAndroidDragEvent(2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                                getpostalcode.write(objComponentActivity2);
                            }
                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2;
                            if ((i10 & 14) == 4) {
                                z4 = z;
                            } else {
                                z4 = false;
                            }
                            objComponentActivity3 = getpostalcode.ComponentActivity();
                            if (!z4 || objComponentActivity3 == androidContentCaptureManager) {
                                r8 = 0;
                                objComponentActivity3 = new PickUpDropOffDetailsKt$$ExternalSyntheticLambda2(pickUpDropOffDetailsUiModel, 0 == true ? 1 : 0);
                                getpostalcode.write(objComponentActivity3);
                            } else {
                                r8 = 0;
                            }
                            InstructionsKt.RemoteActionCompatParcelizer(r8lambda6ugndfpzcmsyuq0qlnt0yi4vxe, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode, r8);
                            getpostalcode.IconCompatParcelizer((boolean) r8);
                        } else if (finddesigninfoproviderslambda10 instanceof accesstoViewInfoFactory) {
                            int i19 = IconCompatParcelizer + 63;
                            RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                            int i20 = i19 % 2;
                            getpostalcode.serializer(-58760715);
                            obj = null;
                            PaymentKt.RemoteActionCompatParcelizer((accesstoViewInfoFactory) finddesigninfoproviderslambda10, null, getpostalcode, 0);
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            obj = null;
                            if (finddesigninfoproviderslambda10 instanceof r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ) {
                                throw d$$ExternalSyntheticOutline0.m(getpostalcode, -58796071, false);
                            }
                            int i21 = RemoteActionCompatParcelizer + 11;
                            IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                            int i22 = i21 % 2;
                            getpostalcode.serializer(-58758265);
                            r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ r8lambdayigkjx4opgvyddqvttr8slptylq = (r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ) finddesigninfoproviderslambda10;
                            if ((i10 & 7168) == 2048) {
                                int i23 = IconCompatParcelizer + 9;
                                RemoteActionCompatParcelizer = i23 % Fields.SpotShadowColor;
                                int i24 = i23 % 2;
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(finddesigninfoproviderslambda10);
                            objComponentActivity = getpostalcode.ComponentActivity();
                            if (((z2 | zIconCompatParcelizer) ^ z) == z || objComponentActivity == androidContentCaptureManager) {
                                objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 5, finddesigninfoproviderslambda10);
                                getpostalcode.write(objComponentActivity);
                            }
                            OrderHeaderV1Kt.OrderHeaderV1(r8lambdayigkjx4opgvyddqvttr8slptylq, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, null, getpostalcode, 0);
                            getpostalcode.IconCompatParcelizer(false);
                        }
                        companion = companion;
                        i10 = i10;
                        str = name;
                    }
                    obj = null;
                    companion = companion;
                    i10 = i10;
                    str = name;
                } else {
                    z = true;
                }
                getpostalcode.serializer(-1822787226);
                getpostalcode.IconCompatParcelizer(false);
                String name2 = finddesigninfoproviderslambda11.getClass().getName();
                finddesigninfoproviderslambda10 = finddesigninfoproviderslambda11;
                if (finddesigninfoproviderslambda10 instanceof getClockui_toolingannotations) {
                    getpostalcode.serializer(-1822651539);
                    objComponentActivity4 = getpostalcode.ComponentActivity();
                    if (objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = ((getClockui_toolingannotations) finddesigninfoproviderslambda10).IconCompatParcelizer;
                        getpostalcode.write(objComponentActivity4);
                    }
                    VendorReviewOptionUiModelImpl vendorReviewOptionUiModelImpl2 = (VendorReviewOptionUiModelImpl) objComponentActivity4;
                    if ((i10 & 112) == 32) {
                        z5 = z;
                    } else {
                        z5 = false;
                    }
                    objComponentActivity5 = getpostalcode.ComponentActivity();
                    if (z5) {
                        objComponentActivity5 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(23, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                        getpostalcode.write(objComponentActivity5);
                    } else {
                        objComponentActivity5 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(23, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                        getpostalcode.write(objComponentActivity5);
                    }
                    Modifier modifierWrite2 = SizeKt.write(Modifier.Companion, 1.0f);
                    float f2 = Dimensions.setActionBarVisibilityCallback;
                    VendorReviewOptionKt.VendorReviewOption(vendorReviewOptionUiModelImpl2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5, PaddingKt.RemoteActionCompatParcelizer(modifierWrite2, f2, f2), getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    if (finddesigninfoproviderslambda10 instanceof r8lambda6ugNDFPZCmsyUQ0qlnt0YI4vxE) {
                        getpostalcode.serializer(-58775751);
                        r8lambda6ugNDFPZCmsyUQ0qlnt0YI4vxE r8lambda6ugndfpzcmsyuq0qlnt0yi4vxe2 = (r8lambda6ugNDFPZCmsyUQ0qlnt0YI4vxE) finddesigninfoproviderslambda10;
                        if ((i10 & 896) == 256) {
                            z3 = z;
                        } else {
                            z3 = false;
                        }
                        objComponentActivity2 = getpostalcode.ComponentActivity();
                        if (z3) {
                            objComponentActivity2 = new toAndroidDragEvent(2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                            getpostalcode.write(objComponentActivity2);
                        } else {
                            objComponentActivity2 = new toAndroidDragEvent(2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                            getpostalcode.write(objComponentActivity2);
                        }
                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2;
                        if ((i10 & 14) == 4) {
                            z4 = z;
                        } else {
                            z4 = false;
                        }
                        objComponentActivity3 = getpostalcode.ComponentActivity();
                        if (z4) {
                            r8 = 0;
                            objComponentActivity3 = new PickUpDropOffDetailsKt$$ExternalSyntheticLambda2(pickUpDropOffDetailsUiModel, 0 == true ? 1 : 0);
                            getpostalcode.write(objComponentActivity3);
                        } else {
                            r8 = 0;
                            objComponentActivity3 = new PickUpDropOffDetailsKt$$ExternalSyntheticLambda2(pickUpDropOffDetailsUiModel, 0 == true ? 1 : 0);
                            getpostalcode.write(objComponentActivity3);
                        }
                        InstructionsKt.RemoteActionCompatParcelizer(r8lambda6ugndfpzcmsyuq0qlnt0yi4vxe2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode, r8);
                        getpostalcode.IconCompatParcelizer((boolean) r8);
                    } else if (finddesigninfoproviderslambda10 instanceof accesstoViewInfoFactory) {
                        int i110 = IconCompatParcelizer + 63;
                        RemoteActionCompatParcelizer = i110 % Fields.SpotShadowColor;
                        int i25 = i110 % 2;
                        getpostalcode.serializer(-58760715);
                        obj = null;
                        PaymentKt.RemoteActionCompatParcelizer((accesstoViewInfoFactory) finddesigninfoproviderslambda10, null, getpostalcode, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        obj = null;
                        if (finddesigninfoproviderslambda10 instanceof r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode, -58796071, false);
                        }
                        int i26 = RemoteActionCompatParcelizer + 11;
                        IconCompatParcelizer = i26 % Fields.SpotShadowColor;
                        int i27 = i26 % 2;
                        getpostalcode.serializer(-58758265);
                        r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ r8lambdayigkjx4opgvyddqvttr8slptylq2 = (r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ) finddesigninfoproviderslambda10;
                        if ((i10 & 7168) == 2048) {
                            int i28 = IconCompatParcelizer + 9;
                            RemoteActionCompatParcelizer = i28 % Fields.SpotShadowColor;
                            int i29 = i28 % 2;
                            z2 = z;
                        } else {
                            z2 = false;
                        }
                        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(finddesigninfoproviderslambda10);
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (((z2 | zIconCompatParcelizer) ^ z) == z) {
                            objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 5, finddesigninfoproviderslambda10);
                            getpostalcode.write(objComponentActivity);
                        } else {
                            objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 5, finddesigninfoproviderslambda10);
                            getpostalcode.write(objComponentActivity);
                        }
                        OrderHeaderV1Kt.OrderHeaderV1(r8lambdayigkjx4opgvyddqvttr8slptylq2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, null, getpostalcode, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    companion = companion;
                    i10 = i10;
                    str = name2;
                }
                obj = null;
                companion = companion;
                i10 = i10;
                str = name2;
            }
            modifier2 = companion;
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM((Object) pickUpDropOffDetailsUiModel, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, i, 18);
        }
    }
}
