package com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayItem$Instruction;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.ListIterator;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.CursorAnchorInfoBuilder_androidKt;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SelectionMagnifierKt;
import o.TextFieldDefaults;
import o.addCharacterBounds;
import o.buildMapping;
import o.canReadPlayIds;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.r8lambdaKGJqwjLmUs58_kpRh__GGuNRqTQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.setInsertionMarker;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;
import o.urlWithExtraPathByActivityKind;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InstructionsListContentKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:66:0x0164  */
    public static final void InstructionsListContent(r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaKGJqwjLmUs58_kpRh__GGuNRqTQ r8lambdakgjqwjlmus58_kprh__ggunrqtq, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        boolean z;
        boolean z2;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2;
        int i5 = 2 % 2;
        r8lambdaiidsddyirtymdul5lt6pmt2zysq.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdakgjqwjlmus58_kprh__ggunrqtq.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1110423987);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(r8lambdaiidsddyirtymdul5lt6pmt2zysq);
                int i6 = RemoteActionCompatParcelizer + 35;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdaiidsddyirtymdul5lt6pmt2zysq);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
            int i8 = RemoteActionCompatParcelizer + 93;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = read + 73;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(r8lambdakgjqwjlmus58_kprh__ggunrqtq) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i11 = RemoteActionCompatParcelizer + 107;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                int i13 = RemoteActionCompatParcelizer + 85;
                read = i13 % Fields.SpotShadowColor;
                i3 = i13 % 2 != 0 ? 28304 : Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        int i14 = i2 | 24576;
        if (getpostalcode.write(i14 & 1, (i14 & 9363) != 9362)) {
            int i15 = read + 37;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            Modifier.Companion companion = Modifier.Companion;
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer(Dimensions.setActionBarVisibilityCallback), Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i17 = read + 5;
            RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getpostalcode.serializer(1835273404);
            ListIterator<Object> listIterator = r8lambdaiidsddyirtymdul5lt6pmt2zysq.listIterator(0);
            int i19 = 0;
            while (listIterator.hasNext()) {
                int i20 = read + 63;
                RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                if (i20 % i4 == 0) {
                    listIterator.next();
                    throw null;
                }
                Object next = listIterator.next();
                if (i19 < 0) {
                    SQLite.serializer();
                    throw null;
                }
                InAppCameraOverlayItem$Instruction inAppCameraOverlayItem$Instruction = (InAppCameraOverlayItem$Instruction) next;
                boolean zBooleanValue = ((Boolean) r8lambdakgjqwjlmus58_kprh__ggunrqtq.getOrDefault(Integer.valueOf(i19), Boolean.FALSE)).booleanValue();
                String str = inAppCameraOverlayItem$Instruction.write;
                int i21 = inAppCameraOverlayItem$Instruction.serializer;
                if ((i14 & 7168) == 2048) {
                    int i22 = RemoteActionCompatParcelizer + 109;
                    read = i22 % Fields.SpotShadowColor;
                    if (i22 % i4 != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                boolean z3 = getpostalcode.read(i19);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if ((z || z3) || objComponentActivity == getCreditCardExpirationMonth.write) {
                    z2 = false;
                    objComponentActivity = new setInsertionMarker(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, i19, 0);
                    getpostalcode.write(objComponentActivity);
                } else {
                    z2 = false;
                }
                InstructionsItem(str, i21, zBooleanValue, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, 0, getpostalcode, (i14 << 9) & 57344);
                i19++;
                i14 = i14;
                i4 = 2;
            }
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new CursorAnchorInfoBuilder_androidKt(r8lambdaiidsddyirtymdul5lt6pmt2zysq, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdakgjqwjlmus58_kprh__ggunrqtq, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier2, i, 0);
        }
    }

    public static final void InstructionsItem(String str, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, int i2, getBirthDateFull getbirthdatefull, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Modifier.Companion companion;
        int i6;
        Modifier.Companion companion2;
        int i7;
        boolean z2;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 2 % 2;
        str.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1065017566);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i3 & 6) == 0) {
            i4 = (getpostalcode.read(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            int i14 = RemoteActionCompatParcelizer + 109;
            read = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            i4 |= getpostalcode.read(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            int i16 = RemoteActionCompatParcelizer + 103;
            read = i16 % Fields.SpotShadowColor;
            if (i16 % 2 == 0) {
                i4 |= getpostalcode.write(z) ^ true ? Fields.SpotShadowColor : Fields.RotationX;
            } else {
                getpostalcode.write(z);
                throw null;
            }
        }
        if ((i3 & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i17 = read + 61;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                i12 = i17 % 2 == 0 ? 26580 : Fields.CameraDistance;
            } else {
                i12 = Fields.RotationZ;
            }
            i4 |= i12;
        }
        if ((i3 & 24576) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i18 = RemoteActionCompatParcelizer + 7;
                read = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i4 |= i11;
        }
        int i20 = i4 | 1769472;
        if (getpostalcode.write(i20 & 1, !((599187 & i20) == 599186))) {
            int i21 = read + 117;
            RemoteActionCompatParcelizer = i21 % Fields.SpotShadowColor;
            if (i21 % 2 == 0) {
                companion = Modifier.Companion;
                i6 = i20 & 70;
                if (i6 == 5) {
                    companion2 = companion;
                    i7 = i6;
                    z2 = true;
                } else {
                    companion2 = companion;
                    i7 = i6;
                    z2 = false;
                }
            } else {
                Modifier.Companion companion3 = Modifier.Companion;
                int i22 = i20 & 14;
                if (i22 == 4) {
                    companion = companion3;
                    i6 = i22;
                    companion2 = companion;
                    i7 = i6;
                    z2 = true;
                } else {
                    companion = companion3;
                    i6 = i22;
                    companion2 = companion;
                    i7 = i6;
                    z2 = false;
                }
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2 || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode.write(objComponentActivity);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new SelectionMagnifierKt(populateViewStructure_androidKtpopulate7, 5);
                getpostalcode.write(objComponentActivity2);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2;
            Modifier modifierWrite = SizeKt.write(companion2, 1.0f);
            boolean z4 = (i20 & 57344) == 16384;
            boolean z5 = (i20 & 7168) == 2048;
            int i23 = i20 & 896;
            if (i23 == 256) {
                int i24 = RemoteActionCompatParcelizer + 9;
                read = i24 % Fields.SpotShadowColor;
                int i25 = i24 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if ((z5 | z4 | z3) || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new addCharacterBounds(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z, 0);
                getpostalcode.write(objComponentActivity3);
            }
            Modifier.Companion companion4 = companion2;
            Modifier modifier3 = canReadPlayIds.read(modifierWrite, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, getpostalcode, 63);
            Alignment.Companion companion5 = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion5.getCenterVertically(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier3);
            ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion6.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion6, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion6, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                ImageVector.Companion companion7 = ImageVector.Companion;
                ImageVector imageVectorVectorResource = VectorResources_androidKt.vectorResource(companion7, i, getpostalcode, (i20 & 112) | 6);
                Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(companion4, Dimensions.setLogo);
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                IconKt.m117Iconww6aTOc(imageVectorVectorResource, (String) null, modifierM83size3ABfNKs, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), getpostalcode, 48, 0);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion4, Dimensions.getNestedScrollAxes)});
                Modifier modifierThen = companion4.then(new show(1.0f, true));
                MeasurePolicy measurePolicy = BoxKt.read(companion5.getTopStart(), false);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion6.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion6, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion6, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                if (z) {
                    int i26 = RemoteActionCompatParcelizer + 39;
                    read = i26 % Fields.SpotShadowColor;
                    int i27 = i26 % 2;
                    i8 = Integer.MAX_VALUE;
                } else {
                    i8 = 2;
                }
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), 0L, null, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, i8, 0, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, performLayout.IconCompatParcelizer(), getpostalcode, i7, 1573248, 45050);
                getpostalcode.IconCompatParcelizer(true);
                boolean z6 = i23 == 256;
                Object objComponentActivity4 = getpostalcode.ComponentActivity();
                if (z6 || objComponentActivity4 == androidContentCaptureManager) {
                    if (z) {
                        int i28 = read + 43;
                        RemoteActionCompatParcelizer = i28 % Fields.SpotShadowColor;
                        if (i28 % 2 == 0) {
                            throw null;
                        }
                        i9 = R.drawable.ic_bold_small_arrow_up;
                    } else {
                        i9 = R.drawable.ic_bold_small_arrow_down;
                    }
                    objComponentActivity4 = Integer.valueOf(i9);
                    getpostalcode.write(objComponentActivity4);
                }
                int iIntValue = ((Number) objComponentActivity4).intValue();
                if (((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()) {
                    getpostalcode.serializer(768701539);
                    IconKt.m117Iconww6aTOc(VectorResources_androidKt.vectorResource(companion7, iIntValue, getpostalcode, 6), "Expand Collapse Carat", (Modifier) null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), getpostalcode, 48, 4);
                    getpostalcode.IconCompatParcelizer(false);
                    i10 = 2;
                } else {
                    getpostalcode.serializer(768900776);
                    getpostalcode.IconCompatParcelizer(false);
                    int i29 = RemoteActionCompatParcelizer + 123;
                    read = i29 % Fields.SpotShadowColor;
                    i10 = 2;
                    int i30 = i29 % 2;
                }
                int i31 = read + 21;
                RemoteActionCompatParcelizer = i31 % Fields.SpotShadowColor;
                int i32 = i31 % i10;
                getpostalcode.IconCompatParcelizer(true);
                modifier2 = companion4;
                i5 = i10;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            i5 = i2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new urlWithExtraPathByActivityKind(str, i, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i5, i3, 1);
        }
    }
}
