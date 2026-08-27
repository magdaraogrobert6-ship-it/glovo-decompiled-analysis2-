package com.roadrunner.delivery.accept.backToBackOrder.presentation.banner;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b1$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.k7$$ExternalSyntheticLambda2;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
import o.ArrangementCenter1;
import o.AwaitFirstLayoutModifier;
import o.BoxMeasurePolicy;
import o.ColorModel;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.SnapFlingBehaviorKt;
import o.StrokeJoinCompanion;
import o.TextLinkStyles;
import o.buildMapping;
import o.canReadPlayIds;
import o.createFromParcel;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCmykxdoWZVw;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.placeSpaceBetweenfoundation_layout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafDO76o9OYYvjKpysJSsx90eBs8;
import o.requiredWidthInVpY3zN4default;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BackToBackOrderOverlayBannerKt {
    private static int read = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:102:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:104:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x021e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0222  */
    /* JADX WARN: Code duplicated, block: B:84:0x0255  */
    /* JADX WARN: Code duplicated, block: B:86:0x0261  */
    /* JADX WARN: Code duplicated, block: B:87:0x0265  */
    /* JADX WARN: Code duplicated, block: B:89:0x0269  */
    /* JADX WARN: Code duplicated, block: B:92:0x028a  */
    /* JADX WARN: Code duplicated, block: B:95:0x028f  */
    /* JADX WARN: Code duplicated, block: B:99:0x02ba A[ADDED_TO_REGION] */
    public static final void BackToBackOrderOverlayBanner(int i, int i2, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        int i3;
        boolean z;
        Modifier modifier2;
        boolean z2;
        boolean z3;
        AndroidContentCaptureManager androidContentCaptureManager;
        AndroidContentCaptureManager androidContentCaptureManager2;
        Alignment.Companion companion;
        MeasurePolicy measurePolicy;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3;
        boolean z4;
        Object objComponentActivity;
        AndroidContentCaptureManager androidContentCaptureManager3;
        boolean zSerializer;
        Object objComponentActivity2;
        int i4;
        int i5 = 2 % 2;
        str.getClass();
        str2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1706835678);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i2 & 6) == 0) {
            i3 = (!(getpostalcode.read(i) ^ true) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode.read(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= getpostalcode.read(str2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 16384 : 8192;
        }
        int i6 = i3 | 196608;
        if ((74899 & i6) != 74898) {
            int i7 = read + 73;
            serializer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i6 & 1, z)) {
            Modifier.Companion companion3 = Modifier.Companion;
            if ((57344 & i6) == 16384) {
                int i8 = serializer + 3;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager4 = getCreditCardExpirationMonth.write;
            if (z2) {
                objComponentActivity3 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(6, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                getpostalcode.write(objComponentActivity3);
            } else {
                int i9 = read + 97;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (objComponentActivity3 == androidContentCaptureManager4) {
                    objComponentActivity3 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(6, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                    getpostalcode.write(objComponentActivity3);
                }
            }
            getPhoneNumberNational.serializer(createFromParcel.INSTANCE, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode);
            placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layoutIconCompatParcelizer = ArrangementCenter1.IconCompatParcelizer(ArrangementCenter1.read(null, getpostalcode, 1), 1.0f, 0.0f, DelayKt.RemoteActionCompatParcelizer(new requiredWidthInVpY3zN4default(600, 600, SnapFlingBehaviorKt.read), BoxMeasurePolicy.Reverse, 4), null, getpostalcode, 4536, 8);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setEmojiCompatEnabled(), 0.04f, 0.0f, 0.0f, 0.0f, 14, null);
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(PaddingKt.m73paddingVpY3zN4$default(SizeKt.serializer(SizeKt.write(companion3, 1.0f), (Alignment.Vertical) null, 3), Dimensions.setHideOnContentScrollEnabled, 0.0f, 2), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.initialize)), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            if ((i6 & 7168) == 2048) {
                int i11 = read + 39;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (z3) {
                androidContentCaptureManager = androidContentCaptureManager4;
            } else {
                androidContentCaptureManager = androidContentCaptureManager4;
                if (objComponentActivity4 == androidContentCaptureManager) {
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4;
                androidContentCaptureManager2 = androidContentCaptureManager;
                Modifier modifier3 = canReadPlayIds.read(modifierM20backgroundbw27NRU, null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, getpostalcode, 63);
                companion = Alignment.Companion;
                measurePolicy = BoxKt.read(companion.getTopStart(), false);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier3);
                companion2 = ComposeUiNode.Companion;
                constructor = companion2.getConstructor();
                if (getaddresscountry != null) {
                    SentryUUID.write();
                    throw null;
                }
                int i13 = serializer + 69;
                read = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                Alignment center = companion.getCenter();
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.serializer;
                Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(boxScopeInstance.align(companion3, center), 0.0f, Dimensions.setLogo, 1);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, centerHorizontally, getpostalcode, 48);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
                constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                MeasurePolicy measurePolicy2 = BoxKt.read(companion.getCenter(), false);
                int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, companion3);
                constructor3 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    i4 = serializer + 61;
                    read = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        getpostalcode.serializer(constructor3);
                        throw null;
                    }
                    getpostalcode.serializer(constructor3);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                Modifier modifierWrite = SizeKt.write(companion3, 1.0f);
                z4 = getpostalcode.read(placespacebetweenfoundation_layoutIconCompatParcelizer);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (z4) {
                    androidContentCaptureManager3 = androidContentCaptureManager2;
                } else {
                    androidContentCaptureManager3 = androidContentCaptureManager2;
                    if (objComponentActivity == androidContentCaptureManager3) {
                    }
                    Modifier modifierM73paddingVpY3zN4$default2 = PaddingKt.m73paddingVpY3zN4$default(boxScopeInstance.align(GraphicsLayerModifierKt.graphicsLayer(modifierWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), companion.getCenter()), 0.0f, 0.0f, 3);
                    zSerializer = getpostalcode.serializer(jM721copywmQWz5c$default);
                    objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (zSerializer || objComponentActivity2 == androidContentCaptureManager3) {
                        objComponentActivity2 = new k7$$ExternalSyntheticLambda2(jM721copywmQWz5c$default, 6);
                        getpostalcode.write(objComponentActivity2);
                    }
                    AwaitFirstLayoutModifier.serializer(modifierM73paddingVpY3zN4$default2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 0);
                    ColorModel.read((StrokeJoinCompanion) RememberLottieCompositionKt.IconCompatParcelizer(new getCmykxdoWZVw(i), getpostalcode).getValue(), SizeKt.m83size3ABfNKs(companion3, Dimensions.addOnTrimMemoryListener), Integer.MAX_VALUE, false, null, null, getpostalcode, 1572864, 0, 0, 4194236);
                    getpostalcode.IconCompatParcelizer(true);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, Dimensions.setActionBarVisibilityCallback)});
                    TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, (i6 >> 3) & 14, 0, 131066);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, Dimensions.getNestedScrollAxes)});
                    TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.serializer(), getpostalcode, (i6 >> 6) & 14, 0, 131066);
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(true);
                    modifier2 = companion3;
                }
                objComponentActivity = new r8lambdafDO76o9OYYvjKpysJSsx90eBs8(placespacebetweenfoundation_layoutIconCompatParcelizer, 4);
                getpostalcode.write(objComponentActivity);
                Modifier modifierM73paddingVpY3zN4$default3 = PaddingKt.m73paddingVpY3zN4$default(boxScopeInstance.align(GraphicsLayerModifierKt.graphicsLayer(modifierWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), companion.getCenter()), 0.0f, 0.0f, 3);
                zSerializer = getpostalcode.serializer(jM721copywmQWz5c$default);
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (zSerializer) {
                    objComponentActivity2 = new k7$$ExternalSyntheticLambda2(jM721copywmQWz5c$default, 6);
                    getpostalcode.write(objComponentActivity2);
                } else {
                    objComponentActivity2 = new k7$$ExternalSyntheticLambda2(jM721copywmQWz5c$default, 6);
                    getpostalcode.write(objComponentActivity2);
                }
                AwaitFirstLayoutModifier.serializer(modifierM73paddingVpY3zN4$default3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 0);
                ColorModel.read((StrokeJoinCompanion) RememberLottieCompositionKt.IconCompatParcelizer(new getCmykxdoWZVw(i), getpostalcode).getValue(), SizeKt.m83size3ABfNKs(companion3, Dimensions.addOnTrimMemoryListener), Integer.MAX_VALUE, false, null, null, getpostalcode, 1572864, 0, 0, 4194236);
                getpostalcode.IconCompatParcelizer(true);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, Dimensions.setActionBarVisibilityCallback)});
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, (i6 >> 3) & 14, 0, 131066);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, Dimensions.getNestedScrollAxes)});
                TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.serializer(), getpostalcode, (i6 >> 6) & 14, 0, 131066);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
                modifier2 = companion3;
            }
            objComponentActivity4 = new b1$$ExternalSyntheticLambda0(3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            getpostalcode.write(objComponentActivity4);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4;
            androidContentCaptureManager2 = androidContentCaptureManager;
            Modifier modifier4 = canReadPlayIds.read(modifierM20backgroundbw27NRU, null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, getpostalcode, 63);
            companion = Alignment.Companion;
            measurePolicy = BoxKt.read(companion.getTopStart(), false);
            iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier4);
            companion2 = ComposeUiNode.Companion;
            constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                SentryUUID.write();
                throw null;
            }
            int i15 = serializer + 69;
            read = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Alignment.Horizontal centerHorizontally2 = companion.getCenterHorizontally();
            Alignment center2 = companion.getCenter();
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.serializer;
            Modifier modifierM73paddingVpY3zN4$default4 = PaddingKt.m73paddingVpY3zN4$default(boxScopeInstance2.align(companion3, center2), 0.0f, Dimensions.setLogo, 1);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, centerHorizontally2, getpostalcode, 48);
            int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default4);
            constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
            MeasurePolicy measurePolicy3 = BoxKt.read(companion.getCenter(), false);
            int iHashCode5 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(getpostalcode, companion3);
            constructor3 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                i4 = serializer + 61;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    getpostalcode.serializer(constructor3);
                    throw null;
                }
                getpostalcode.serializer(constructor3);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer5);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode5), getpostalcode));
            Modifier modifierWrite2 = SizeKt.write(companion3, 1.0f);
            z4 = getpostalcode.read(placespacebetweenfoundation_layoutIconCompatParcelizer);
            objComponentActivity = getpostalcode.ComponentActivity();
            if (z4) {
                androidContentCaptureManager3 = androidContentCaptureManager2;
                if (objComponentActivity == androidContentCaptureManager3) {
                }
                Modifier modifierM73paddingVpY3zN4$default5 = PaddingKt.m73paddingVpY3zN4$default(boxScopeInstance2.align(GraphicsLayerModifierKt.graphicsLayer(modifierWrite2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), companion.getCenter()), 0.0f, 0.0f, 3);
                zSerializer = getpostalcode.serializer(jM721copywmQWz5c$default);
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (zSerializer) {
                    objComponentActivity2 = new k7$$ExternalSyntheticLambda2(jM721copywmQWz5c$default, 6);
                    getpostalcode.write(objComponentActivity2);
                } else {
                    objComponentActivity2 = new k7$$ExternalSyntheticLambda2(jM721copywmQWz5c$default, 6);
                    getpostalcode.write(objComponentActivity2);
                }
                AwaitFirstLayoutModifier.serializer(modifierM73paddingVpY3zN4$default5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 0);
                ColorModel.read((StrokeJoinCompanion) RememberLottieCompositionKt.IconCompatParcelizer(new getCmykxdoWZVw(i), getpostalcode).getValue(), SizeKt.m83size3ABfNKs(companion3, Dimensions.addOnTrimMemoryListener), Integer.MAX_VALUE, false, null, null, getpostalcode, 1572864, 0, 0, 4194236);
                getpostalcode.IconCompatParcelizer(true);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, Dimensions.setActionBarVisibilityCallback)});
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, (i6 >> 3) & 14, 0, 131066);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, Dimensions.getNestedScrollAxes)});
                TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.serializer(), getpostalcode, (i6 >> 6) & 14, 0, 131066);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
                modifier2 = companion3;
            } else {
                androidContentCaptureManager3 = androidContentCaptureManager2;
            }
            objComponentActivity = new r8lambdafDO76o9OYYvjKpysJSsx90eBs8(placespacebetweenfoundation_layoutIconCompatParcelizer, 4);
            getpostalcode.write(objComponentActivity);
            Modifier modifierM73paddingVpY3zN4$default6 = PaddingKt.m73paddingVpY3zN4$default(boxScopeInstance2.align(GraphicsLayerModifierKt.graphicsLayer(modifierWrite2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), companion.getCenter()), 0.0f, 0.0f, 3);
            zSerializer = getpostalcode.serializer(jM721copywmQWz5c$default);
            objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zSerializer) {
                objComponentActivity2 = new k7$$ExternalSyntheticLambda2(jM721copywmQWz5c$default, 6);
                getpostalcode.write(objComponentActivity2);
            } else {
                objComponentActivity2 = new k7$$ExternalSyntheticLambda2(jM721copywmQWz5c$default, 6);
                getpostalcode.write(objComponentActivity2);
            }
            AwaitFirstLayoutModifier.serializer(modifierM73paddingVpY3zN4$default6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 0);
            ColorModel.read((StrokeJoinCompanion) RememberLottieCompositionKt.IconCompatParcelizer(new getCmykxdoWZVw(i), getpostalcode).getValue(), SizeKt.m83size3ABfNKs(companion3, Dimensions.addOnTrimMemoryListener), Integer.MAX_VALUE, false, null, null, getpostalcode, 1572864, 0, 0, 4194236);
            getpostalcode.IconCompatParcelizer(true);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, Dimensions.setActionBarVisibilityCallback)});
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, (i6 >> 3) & 14, 0, 131066);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, Dimensions.getNestedScrollAxes)});
            TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.serializer(), getpostalcode, (i6 >> 6) & 14, 0, 131066);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new TextLinkStyles(i, str, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i2);
        }
    }
}
