package com.roadrunner.delivery.ontheway.tripplanner.actions.presentation.compose;

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
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.CoroutineLiveDataExternalSyntheticLambda0;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.IconCompatParcelizer;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.getApplicationInfo;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getNewPassword;
import o.getPostalCode;
import o.isValidParameter;
import o.lambda321;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setBrushAndDrawyzxVdVo;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ActionsBottomSheetKt {
    private static int read = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    public static final void ContactInfo(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        str.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(627857608);
        if ((i & 6) == 0) {
            if (getpostalcode2.read(str)) {
                int i5 = read + 103;
                serializer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    i3 = 2;
                } else {
                    i3 = 4;
                }
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(str2) ? 32 : 16;
            int i6 = serializer + 103;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        int i8 = i2 | 384;
        if (getpostalcode2.write(i8 & 1, (i8 & 147) != 146)) {
            int i9 = read + 69;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dimensions.setShowingForActionMode, 7);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
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
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper, getpostalcode2, i8 & 14, 0, 131066);
            if (str2 == null) {
                getpostalcode2.serializer(1133258999);
                getpostalcode2.IconCompatParcelizer(false);
                z = true;
                getpostalcode = getpostalcode2;
            } else {
                getpostalcode2.serializer(1133259000);
                TextKt.m131TextNvy7gAk(str2, PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, (i8 >> 3) & 14, 0, 131064);
                getpostalcode = getpostalcode2;
                getpostalcode.IconCompatParcelizer(false);
                z = true;
            }
            getpostalcode.IconCompatParcelizer(z);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new lambda321(str, str2, modifier2, i, 1);
            int i11 = read + 59;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c6  */
    public static final void ActionsBottomSheet(setBrushAndDrawyzxVdVo setbrushanddrawyzxvdvo, Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Object obj;
        boolean z;
        int i3;
        boolean zIconCompatParcelizer;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-383512735);
        Modifier modifier2 = null;
        if ((i & 6) == 0) {
            if ((i & 8) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(setbrushanddrawyzxvdvo);
            } else {
                int i6 = serializer + 93;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    zIconCompatParcelizer = getpostalcode.read(setbrushanddrawyzxvdvo);
                } else {
                    getpostalcode.read(setbrushanddrawyzxvdvo);
                    modifier2.hashCode();
                    throw null;
                }
            }
            if (zIconCompatParcelizer) {
                int i7 = read + 117;
                serializer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
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
        int i8 = i2 | 48;
        if ((i & 384) == 0) {
            int i9 = read + 117;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                i8 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                throw null;
            }
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i10 = read + 119;
                serializer = i10 % Fields.SpotShadowColor;
                i3 = i10 % 2 == 0 ? 30346 : Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i8 |= i3;
        }
        if (getpostalcode.write(i8 & 1, (i8 & 1171) != 1170)) {
            int i11 = serializer + 43;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            Modifier.Companion companion = Modifier.Companion;
            float f = Dimensions.setActionBarVisibilityCallback;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion, f, f, f, 0.0f, 8);
            modifierM74paddingqDBjuR0$default.getClass();
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i13 = read + 119;
                    serializer = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 != 0) {
                        getpostalcode.serializer(constructor);
                        modifier2 = null;
                    } else {
                        getpostalcode.serializer(constructor);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                ContactInfo(0, getpostalcode, modifier2, setbrushanddrawyzxvdvo.IconCompatParcelizer, setbrushanddrawyzxvdvo.write);
                getApplicationInfo getapplicationinfo = setbrushanddrawyzxvdvo.RemoteActionCompatParcelizer;
                if (getapplicationinfo == null) {
                    getpostalcode.serializer(386430450);
                    getpostalcode.IconCompatParcelizer(false);
                    z = false;
                } else {
                    getpostalcode.serializer(386430451);
                    String str = getapplicationinfo.title;
                    Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion, 1.0f), 0.0f, 0.0f, 0.0f, f, 7);
                    modifierM74paddingqDBjuR0$default2.getClass();
                    z = false;
                    isValidParameter.RemoteActionCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierM74paddingqDBjuR0$default2, false, false, Integer.valueOf(R.drawable.ic_bold_large_phone_default), null, null, null, getpostalcode, (i8 >> 6) & 112, 984);
                    getpostalcode.IconCompatParcelizer(false);
                }
                CoroutineLiveDataExternalSyntheticLambda0 coroutineLiveDataExternalSyntheticLambda0 = setbrushanddrawyzxvdvo.serializer;
                if (coroutineLiveDataExternalSyntheticLambda0 == null) {
                    getpostalcode.serializer(386858684);
                    getpostalcode.IconCompatParcelizer(z);
                } else {
                    getpostalcode.serializer(386858685);
                    String str2 = coroutineLiveDataExternalSyntheticLambda0.title;
                    Modifier modifierM74paddingqDBjuR0$default3 = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion, 1.0f), 0.0f, 0.0f, 0.0f, f, 7);
                    modifierM74paddingqDBjuR0$default3.getClass();
                    boolean z2 = (i8 & 896) == 256 ? true : z;
                    boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(coroutineLiveDataExternalSyntheticLambda0);
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    if (zIconCompatParcelizer2 | z2) {
                        objComponentActivity = new ViewUtils$$ExternalSyntheticLambda6(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 26, coroutineLiveDataExternalSyntheticLambda0);
                        getpostalcode.write(objComponentActivity);
                    } else {
                        int i14 = serializer + 35;
                        read = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        if (objComponentActivity == getCreditCardExpirationMonth.write) {
                            objComponentActivity = new ViewUtils$$ExternalSyntheticLambda6(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 26, coroutineLiveDataExternalSyntheticLambda0);
                            getpostalcode.write(objComponentActivity);
                        }
                    }
                    isValidParameter.RemoteActionCompatParcelizer(str2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierM74paddingqDBjuR0$default3, false, false, Integer.valueOf(R.drawable.ic_bold_large_chat_chat_bubbles), null, null, null, getpostalcode, 0, 984);
                    getpostalcode.IconCompatParcelizer(z);
                }
                IconCompatParcelizer.IconCompatParcelizer(companion, Dimensions.getNestedScrollAxes, getpostalcode, true);
                obj = companion;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            obj = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera(i, 21, setbrushanddrawyzxvdvo, obj, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }
}
