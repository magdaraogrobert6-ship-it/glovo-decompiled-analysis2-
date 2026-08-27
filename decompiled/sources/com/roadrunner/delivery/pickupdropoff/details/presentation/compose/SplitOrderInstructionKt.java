package com.roadrunner.delivery.pickupdropoff.details.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda3;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.Iterator;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.buildMapping;
import o.disposeui_tooling;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPostalCode;
import o.getStore;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambda4xemsQi_rXvuhFGMMjGIfxFd9k;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SplitOrderInstructionKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    public static final void RiderDetail(String str, String str2, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        Modifier.Companion companion;
        int i3;
        int i4;
        int i5 = 2 % 2;
        str.getClass();
        str2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1570084487);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
            int i6 = IconCompatParcelizer + 77;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 2 / 2;
            }
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(str2)) {
                int i8 = IconCompatParcelizer + 7;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i10 = RemoteActionCompatParcelizer + 111;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                int i11 = 48 / 0;
                if (getpostalcode.write(z)) {
                    i3 = Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
            } else if (!getpostalcode.write(z)) {
                i3 = Fields.SpotShadowColor;
            } else {
                i3 = Fields.RotationX;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i12 = i2 | 24576;
        if (getpostalcode.write(i12 & 1, (i12 & 9363) != 9362)) {
            int i13 = IconCompatParcelizer + 99;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            Modifier.Companion companion2 = Modifier.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getCenterVertically(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
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
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(str);
            builder.append(":");
            AnnotatedString annotatedString = builder.toAnnotatedString();
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m132TextZ58ophY(annotatedString, PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 11), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, textStyleIconCompatParcelizer, getpostalcode, 0, 0, 262136);
            if (z) {
                int i15 = IconCompatParcelizer + 89;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                getpostalcode.serializer(-1169857237);
                companion2.getClass();
                TertiaryKt.IconCompatParcelizer(str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, companion2, false, R.drawable.ic_bold_large_phone_default, null, null, null, getpostalcode, ((i12 >> 3) & 14) | 384 | ((i12 >> 6) & 112), 232);
                getpostalcode.IconCompatParcelizer(false);
                companion = companion2;
            } else {
                getpostalcode.serializer(-1169568007);
                TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
                long supportBackgroundTintMode = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode();
                int iM3569getEllipsisgIe3tQ8 = TextOverflow.Companion.m3569getEllipsisgIe3tQ8();
                Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(companion2, 0.0f, Dimensions.setMenu, 1);
                modifierM73paddingVpY3zN4$default.getClass();
                companion = companion2;
                TextKt.m131TextNvy7gAk(str2, modifierM73paddingVpY3zN4$default, supportBackgroundTintMode, 0L, null, null, 0L, null, 0L, iM3569getEllipsisgIe3tQ8, false, 1, 0, null, textStyle, getpostalcode, (i12 >> 3) & 14, 24960, 110584);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i17 = RemoteActionCompatParcelizer + 17;
            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new disposeui_tooling(str, str2, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0248  */
    /* JADX WARN: Code duplicated, block: B:84:0x0291  */
    public static final void SplitOrderInstruction(r8lambda4xemsQi_rXvuhFGMMjGIfxFd9k r8lambda4xemsqi_rxvuhfgmmjgifxfd9k, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Object obj;
        int i3;
        boolean z2;
        boolean z3;
        Object objComponentActivity;
        int i4;
        boolean zIconCompatParcelizer;
        int i5 = 2 % 2;
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-517257642);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i6 = RemoteActionCompatParcelizer + 41;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                zIconCompatParcelizer = getpostalcode.read(r8lambda4xemsqi_rxvuhfgmmjgifxfd9k);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambda4xemsqi_rxvuhfgmmjgifxfd9k);
            }
            i2 = i | (zIconCompatParcelizer ? 4 : 2);
        } else {
            i2 = i;
        }
        Object obj2 = null;
        if ((i & 48) == 0) {
            int i8 = IconCompatParcelizer + 35;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                obj2.hashCode();
                throw null;
            }
            if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                int i9 = RemoteActionCompatParcelizer + 123;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                i4 = i9 % 2 != 0 ? 71 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        int i10 = i2 | 384;
        if ((i10 & 147) != 146) {
            int i11 = RemoteActionCompatParcelizer + 107;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i10 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            float f = Dimensions.setActionBarVisibilityCallback;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(modifierWrite, f, 0.0f, 2);
            modifierM73paddingVpY3zN4$default.getClass();
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            Alignment.Companion companion2 = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion2.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i13 = RemoteActionCompatParcelizer + 81;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Integer num = r8lambda4xemsqi_rxvuhfgmmjgifxfd9k.RemoteActionCompatParcelizer;
            if (num == null) {
                getpostalcode.serializer(-535468245);
                getpostalcode.IconCompatParcelizer(false);
                i3 = 0;
            } else {
                getpostalcode.serializer(-535468244);
                int iIntValue = num.intValue();
                getNonZeroRgk1Os.write(Integer.valueOf(iIntValue), null, null, Okio.RemoteActionCompatParcelizer(iIntValue, getpostalcode, 0), null, null, null, null, ContentScale.Companion.getNone(), ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0, 2, null), getpostalcode, (Painter.$stable << 9) | 48, 6, 27636);
                i3 = 0;
                getpostalcode.IconCompatParcelizer(false);
            }
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion, f)});
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion2.getStart(), getpostalcode, i3);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            TextKt.m131TextNvy7gAk(r8lambda4xemsqi_rxvuhfgmmjgifxfd9k.write, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[i3], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131070);
            getpostalcode.serializer(-2065370709);
            Iterator it = r8lambda4xemsqi_rxvuhfgmmjgifxfd9k.IconCompatParcelizer.iterator();
            while (it.hasNext()) {
                int i15 = RemoteActionCompatParcelizer + 3;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0) {
                    String str = ((InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider) it.next()).IconCompatParcelizer;
                    obj2.hashCode();
                    throw null;
                }
                InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider = (InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider) it.next();
                String str2 = instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider.IconCompatParcelizer;
                boolean z4 = str2 == null || str2.length() == 0;
                String str3 = instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider.read;
                String str4 = instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider.write;
                if ((i10 & 112) == 32) {
                    int i16 = RemoteActionCompatParcelizer + 119;
                    IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider);
                if ((i10 & 14) != 4) {
                    int i17 = IconCompatParcelizer + 115;
                    RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    if ((i10 & 8) == 0 || !getpostalcode.IconCompatParcelizer(r8lambda4xemsqi_rxvuhfgmmjgifxfd9k)) {
                        int i19 = IconCompatParcelizer + 37;
                        RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                        if (i19 % 2 == 0) {
                            int i20 = 2 / 2;
                        }
                        z3 = false;
                    } else {
                        int i21 = IconCompatParcelizer + 113;
                        RemoteActionCompatParcelizer = i21 % Fields.SpotShadowColor;
                        int i22 = i21 % 2;
                    }
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if ((!(z2 | zIconCompatParcelizer2 | z3)) || objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new n$$ExternalSyntheticLambda3(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider, r8lambda4xemsqi_rxvuhfgmmjgifxfd9k, 20);
                        getpostalcode.write(objComponentActivity);
                    }
                    RiderDetail(str3, str4, !z4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, null, getpostalcode, 0);
                }
                z3 = true;
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!(z2 | zIconCompatParcelizer2 | z3)) {
                    objComponentActivity = new n$$ExternalSyntheticLambda3(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider, r8lambda4xemsqi_rxvuhfgmmjgifxfd9k, 20);
                    getpostalcode.write(objComponentActivity);
                } else {
                    objComponentActivity = new n$$ExternalSyntheticLambda3(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, instructionsItemUi$Instruction$SplitOrderInstruction$OtherRider, r8lambda4xemsqi_rxvuhfgmmjgifxfd9k, 20);
                    getpostalcode.write(objComponentActivity);
                }
                RiderDetail(str3, str4, !z4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, null, getpostalcode, 0);
            }
            af$$ExternalSyntheticOutline0.m(getpostalcode, false, true, true);
            obj = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            obj = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 16, r8lambda4xemsqi_rxvuhfgmmjgifxfd9k, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, obj);
        }
    }
}
