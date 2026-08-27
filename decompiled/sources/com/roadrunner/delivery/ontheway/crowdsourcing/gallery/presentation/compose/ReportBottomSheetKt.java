package com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.forms.CheckboxKt;
import com.roadrunner.rrds.compose.component.forms.RadioButtonKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.InputMethodManagerImpl;
import o.InputState_androidKt;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.buildMapping;
import o.convertToHex;
import o.dividedefault;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.hideSoftInput;
import o.invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdanw7AWrZT1ZtNTucsvl4gTUEQRqg;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;
import o.snapElevation;
import o.unregisterFacebookSDKJSInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ReportBottomSheetKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;

    static {
        removeNodeAtDepth.serializer(new InputMethodManagerImpl("INACCURATE", "Inaccurate or Irrelevant"), new InputMethodManagerImpl("POOR_QUALITY", "Poor Quality / Blurry"), new InputMethodManagerImpl("PRIVACY_VIOLATION", "Privacy Violation (Faces, License Plates)"), new InputMethodManagerImpl("OFFENSIVE", "Offensive or Inappropriate"), new InputMethodManagerImpl("OTHER", "Other")).getClass();
        int i = IconCompatParcelizer + 53;
        write = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x003c A[PHI: r2
  0x003c: PHI (r2v31 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v33 o.getPostalCode) binds: [B:8:0x002d, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r2
  0x002f: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v33 o.getPostalCode) binds: [B:8:0x002d, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void SheetHeader(String str, String str2, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        boolean z;
        getPostalCode getpostalcode3;
        int i4;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 95;
        read = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(966381599);
            if ((i & 5) == 0) {
                if (!getpostalcode.read(str)) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(966381599);
            if ((i & 6) == 0) {
                if (!getpostalcode.read(str)) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.read(str2) ? 32 : 16;
        }
        int i7 = i3;
        if ((i7 & 19) != 18) {
            z = true;
        } else {
            int i8 = RemoteActionCompatParcelizer + 115;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = false;
        }
        if (getpostalcode2.write(i7 & 1, z)) {
            int i10 = read + 83;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            snapElevation snapelevationIconCompatParcelizer = Arrangement.IconCompatParcelizer(Dimensions.getActionBarHideOffset);
            Modifier.Companion companion = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(snapelevationIconCompatParcelizer, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                TextStyle textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatResultReceiverWrapper();
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                getPostalCode getpostalcode4 = getpostalcode2;
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper, getpostalcode4, i7 & 14, 0, 131066);
                TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode4.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode4, (i7 >> 3) & 14, 0, 131066);
                getpostalcode3 = getpostalcode4;
                i4 = 1;
                getpostalcode3.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode3 = getpostalcode2;
            i4 = 1;
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new unregisterFacebookSDKJSInterface(str, str2, i, i4);
        }
    }

    public static final void SheetActions(String str, String str2, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = read + 123;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1359114499);
        if ((i & 6) == 0) {
            int i6 = read + 119;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.write(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
            int i8 = read + 75;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.Clip : 8192;
            int i10 = RemoteActionCompatParcelizer + 91;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 9363) != 9362)) {
            int i12 = RemoteActionCompatParcelizer + 13;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            snapElevation snapelevationIconCompatParcelizer = Arrangement.IconCompatParcelizer(Dimensions.setMenu);
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Modifier.Companion companion = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(snapelevationIconCompatParcelizer, centerHorizontally, getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i14 = RemoteActionCompatParcelizer + 109;
            read = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            companion.getClass();
            PrimaryKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SizeKt.write(companion, 1.0f), z, false, null, null, null, null, null, getpostalcode, (i2 & 14) | 384 | ((i2 >> 6) & 112) | ((i2 << 3) & 7168), 0, 2032);
            TertiaryKt.IconCompatParcelizer(str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, SizeKt.write(companion, 1.0f), false, 0, null, null, null, getpostalcode, ((i2 >> 3) & 14) | 384 | ((i2 >> 9) & 112), 248);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new convertToHex(str, str2, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    public static final void write(hideSoftInput hidesoftinput, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        boolean zIconCompatParcelizer;
        int i4;
        int i5 = 2 % 2;
        hidesoftinput.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(529070276);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(hidesoftinput);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(hidesoftinput);
            }
            if (zIconCompatParcelizer) {
                int i6 = read + 123;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    i4 = 2;
                } else {
                    i4 = 4;
                }
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i7 = read + 87;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i9 = RemoteActionCompatParcelizer + 47;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.Clip : 8192;
        }
        int i11 = i2 | 196608;
        if (getpostalcode2.write(i11 & 1, (i11 & 74899) != 74898)) {
            Modifier.Companion companion = Modifier.Companion;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(3);
                getpostalcode2.write(objComponentActivity);
            }
            SheetState sheetStateRemoteActionCompatParcelizer = ModalBottomSheetKt.RemoteActionCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode2, 54, 0);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                int i12 = RemoteActionCompatParcelizer + 93;
                read = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    objComponentActivity2 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                    getpostalcode2.write(objComponentActivity2);
                } else {
                    getpostalcode2.write(getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2));
                    throw null;
                }
            }
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity2;
            float f = Dimensions.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            getTopLeftannotations gettopleftannotationsM97RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m97RoundedCornerShapea9UjIt4$default(f, f, 0.0f, 0.0f, 12);
            long jIconCompatParcelizer = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer();
            companion.getClass();
            getpostalcode = getpostalcode2;
            ModalBottomSheetKt.m118ModalBottomSheetYbuCTN8(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SizeKt.write(companion, 1.0f), sheetStateRemoteActionCompatParcelizer, 0.0f, false, gettopleftannotationsM97RoundedCornerShapea9UjIt4$default, jIconCompatParcelizer, 0L, 0.0f, 0L, null, null, null, ExtrasKt.write(180088098, new dividedefault(hidesoftinput, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, getcontentviewgroupparentlayout, sheetStateRemoteActionCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 3), getpostalcode2), getpostalcode, (i11 >> 3) & 14, 3078, 7064);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY((Object) hidesoftinput, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier2, i, 3);
            int i13 = read + 15;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00eb  */
    public static final void BlockUserCheckboxRow(InputState_androidKt inputState_androidKt, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1155414663);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(inputState_androidKt);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(inputState_androidKt);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= !(getpostalcode.write(z) ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 256 : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            int i4 = RemoteActionCompatParcelizer + 85;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                String str = inputState_androidKt.serializer;
                if ((i2 & 896) == 256) {
                    int i6 = read + 121;
                    int i7 = i6 % Fields.SpotShadowColor;
                    RemoteActionCompatParcelizer = i7;
                    int i8 = i6 % 2;
                    int i9 = i7 + 101;
                    read = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (z2) {
                    objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(14, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity);
                } else {
                    int i11 = read + 15;
                    RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 != 0) {
                        if (objComponentActivity == getCreditCardExpirationMonth.write) {
                            objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(14, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                            getpostalcode.write(objComponentActivity);
                        }
                    } else {
                        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                        throw null;
                    }
                }
                CheckboxKt.m5038CheckboxBigPIknLig(str, z, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, companion, false, getpostalcode, (i2 & 112) | 3072);
                String str2 = inputState_androidKt.RemoteActionCompatParcelizer;
                if (str2 == null) {
                    int i12 = read + 79;
                    RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                    if (i12 % 2 == 0) {
                        getpostalcode.serializer(1915381984);
                        z3 = false;
                    } else {
                        z3 = false;
                        getpostalcode.serializer(1915381984);
                    }
                    getpostalcode.IconCompatParcelizer(z3);
                } else {
                    getpostalcode.serializer(1915381985);
                    TextKt.m131TextNvy7gAk(str2, PaddingKt.m74paddingqDBjuR0$default(companion, Dp.m3673constructorimpl(Dimensions.onPreparePanel + Dimensions.setMenu), 0.0f, 0.0f, 0.0f, 14), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131064);
                    getpostalcode.IconCompatParcelizer(false);
                }
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdanw7AWrZT1ZtNTucsvl4gTUEQRqg(inputState_androidKt, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0096  */
    /* JADX WARN: Code duplicated, block: B:42:0x0099  */
    public static final void ReportSheetContent(hideSoftInput hidesoftinput, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        boolean z2;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 101;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(589710033);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            int i7 = RemoteActionCompatParcelizer + 39;
            read = i7 % Fields.SpotShadowColor;
            i2 = ((i7 % 2 == 0 ? (i & 8) != 0 : (i & 22) != 0) ? getpostalcode2.IconCompatParcelizer(hidesoftinput) : getpostalcode2.read(hidesoftinput) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = read + 67;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= !(getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i10 = read + 21;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 76 / 0;
                if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i3 = Fields.CameraDistance;
                } else {
                    i3 = Fields.RotationZ;
                }
            } else if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.Clip : 8192;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 9363) != 9362)) {
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            snapElevation snapelevationIconCompatParcelizer = Arrangement.IconCompatParcelizer(Dimensions.setHideOnContentScrollEnabled);
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = PaddingKt.write(PagerWrapperFlingBehavior.IconCompatParcelizer(BackgroundKt.m20backgroundbw27NRU(SizeKt.write(companion, 1.0f), ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape()), PagerWrapperFlingBehavior.read(0, getpostalcode2, 1), false, 14), Dimensions.setActionBarVisibilityCallback);
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(snapelevationIconCompatParcelizer, companion2.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i12 = RemoteActionCompatParcelizer + 3;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            String str = hidesoftinput.MediaSessionCompatQueueItem;
            String str2 = hidesoftinput.RatingCompat;
            SheetHeader(str, hidesoftinput.write, getpostalcode2, 0);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer(Dimensions.setMenu), companion2.getStart(), getpostalcode2, 0);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            getpostalcode2.serializer(599908606);
            for (InputMethodManagerImpl inputMethodManagerImpl : hidesoftinput.MediaBrowserCompatMediaItem) {
                String str3 = inputMethodManagerImpl.IconCompatParcelizer;
                boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{inputMethodManagerImpl.serializer, str2}, getCieXyz.write())).booleanValue();
                if ((i2 & 112) == 32) {
                    int i14 = RemoteActionCompatParcelizer + 109;
                    read = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(inputMethodManagerImpl);
                Object objComponentActivity = getpostalcode2.ComponentActivity();
                if (!(z2 | zIconCompatParcelizer)) {
                    int i16 = read + 91;
                    RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 == 0) {
                        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                        throw null;
                    }
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    }
                    RadioButtonKt.RadioButton(str3, zBooleanValue, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, SizeKt.write(Modifier.Companion, 1.0f), null, false, false, getpostalcode2, 3072, 112);
                }
                objComponentActivity = new ViewUtils$$ExternalSyntheticLambda6(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 19, inputMethodManagerImpl);
                getpostalcode2.write(objComponentActivity);
                RadioButtonKt.RadioButton(str3, zBooleanValue, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, SizeKt.write(Modifier.Companion, 1.0f), null, false, false, getpostalcode2, 3072, 112);
            }
            getpostalcode2.IconCompatParcelizer(false);
            getpostalcode2.IconCompatParcelizer(true);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction2 = Arrangement.MediaBrowserCompatMediaItem;
            snapElevation snapelevationIconCompatParcelizer2 = Arrangement.IconCompatParcelizer(Dimensions.setMenu);
            Modifier.Companion companion4 = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer3 = ModalBottomSheetKtModalBottomSheet311.serializer(snapelevationIconCompatParcelizer2, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode3 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode2, companion4);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion5.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor3);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion5, getpostalcode2, modalBottomSheetYbuCTN8Serializer3, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode2, Integer.valueOf(iHashCode3), getpostalcode2));
            InputState_androidKt inputState_androidKt = hidesoftinput.read;
            if (inputState_androidKt == null) {
                getpostalcode2.serializer(-225178171);
                z = false;
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                z = false;
                getpostalcode2.serializer(-225178170);
                BlockUserCheckboxRow(inputState_androidKt, hidesoftinput.IconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode2, i2 & 896);
                getpostalcode2.IconCompatParcelizer(false);
            }
            getpostalcode = getpostalcode2;
            SheetActions(hidesoftinput.serializer, hidesoftinput.RemoteActionCompatParcelizer, str2 != null ? true : z, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, getpostalcode2, i2 & 64512);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM(hidesoftinput, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, i, 12);
        }
    }
}
