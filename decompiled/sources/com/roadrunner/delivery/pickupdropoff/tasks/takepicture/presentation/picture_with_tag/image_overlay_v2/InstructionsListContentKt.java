package com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2;

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
import o.getWEAR_OS_SMALL_ROUNDannotations;
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
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:59:0x014c  */
    /* JADX WARN: Code duplicated, block: B:62:0x015b  */
    /* JADX WARN: Code duplicated, block: B:63:0x015d  */
    /* JADX WARN: Code duplicated, block: B:67:0x016b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0172  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void InstructionsListContent(r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaKGJqwjLmUs58_kpRh__GGuNRqTQ r8lambdakgjqwjlmus58_kprh__ggunrqtq, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        Object next;
        boolean z;
        boolean z2;
        Object objComponentActivity;
        boolean z3;
        int i3;
        int i4;
        boolean zIconCompatParcelizer;
        int i5;
        int i6 = 2 % 2;
        int i7 = read + 117;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        r8lambdaiidsddyirtymdul5lt6pmt2zysq.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdakgjqwjlmus58_kprh__ggunrqtq.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-74615737);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i9 = read + 41;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                zIconCompatParcelizer = getpostalcode.read(r8lambdaiidsddyirtymdul5lt6pmt2zysq);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdaiidsddyirtymdul5lt6pmt2zysq);
            }
            if (zIconCompatParcelizer) {
                int i11 = read + 11;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i13 = RemoteActionCompatParcelizer + 11;
            read = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i4 = 32;
            } else {
                int i15 = RemoteActionCompatParcelizer + 49;
                read = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(r8lambdakgjqwjlmus58_kprh__ggunrqtq) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i17 = i2 | 24576;
        int i18 = 0;
        if (getpostalcode.write(i17 & 1, (i17 & 9363) != 9362)) {
            int i19 = RemoteActionCompatParcelizer + 79;
            read = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
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
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getpostalcode.serializer(1277618512);
            int i21 = 0;
            for (ListIterator<Object> listIterator = r8lambdaiidsddyirtymdul5lt6pmt2zysq.listIterator(0); listIterator.hasNext(); listIterator = listIterator) {
                int i22 = RemoteActionCompatParcelizer + 5;
                read = i22 % Fields.SpotShadowColor;
                if (i22 % 2 == 0) {
                    next = listIterator.next();
                    int i23 = 46 / i18;
                    if (i21 < 0) {
                        SQLite.serializer();
                        throw null;
                    }
                    getWEAR_OS_SMALL_ROUNDannotations getwear_os_small_roundannotations = (getWEAR_OS_SMALL_ROUNDannotations) next;
                    boolean zBooleanValue = ((Boolean) r8lambdakgjqwjlmus58_kprh__ggunrqtq.getOrDefault(Integer.valueOf(i21), Boolean.FALSE)).booleanValue();
                    String str = getwear_os_small_roundannotations.text;
                    int i24 = getwear_os_small_roundannotations.icon;
                    if ((i17 & 7168) == 2048) {
                        i3 = RemoteActionCompatParcelizer + 117;
                        read = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 == 0) {
                            z = true;
                        }
                        z2 = getpostalcode.read(i21);
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (!(z || z2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                            z3 = true;
                            objComponentActivity = new setInsertionMarker(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, i21, 1);
                            getpostalcode.write(objComponentActivity);
                        } else {
                            z3 = true;
                        }
                        InstructionsItem(str, i24, zBooleanValue, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, 0, getpostalcode, (i17 << 9) & 57344);
                        i21++;
                        i18 = 0;
                        companion = companion;
                    }
                    z = false;
                    z2 = getpostalcode.read(i21);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (z || z2) {
                        z3 = true;
                        objComponentActivity = new setInsertionMarker(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, i21, 1);
                        getpostalcode.write(objComponentActivity);
                    } else {
                        z3 = true;
                        objComponentActivity = new setInsertionMarker(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, i21, 1);
                        getpostalcode.write(objComponentActivity);
                    }
                    InstructionsItem(str, i24, zBooleanValue, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, 0, getpostalcode, (i17 << 9) & 57344);
                    i21++;
                    i18 = 0;
                    companion = companion;
                } else {
                    next = listIterator.next();
                    if (i21 < 0) {
                        SQLite.serializer();
                        throw null;
                    }
                    getWEAR_OS_SMALL_ROUNDannotations getwear_os_small_roundannotations2 = (getWEAR_OS_SMALL_ROUNDannotations) next;
                    boolean zBooleanValue2 = ((Boolean) r8lambdakgjqwjlmus58_kprh__ggunrqtq.getOrDefault(Integer.valueOf(i21), Boolean.FALSE)).booleanValue();
                    String str2 = getwear_os_small_roundannotations2.text;
                    int i25 = getwear_os_small_roundannotations2.icon;
                    if ((i17 & 7168) == 2048) {
                        i3 = RemoteActionCompatParcelizer + 117;
                        read = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 == 0) {
                            z = true;
                        }
                        z2 = getpostalcode.read(i21);
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (z || z2) {
                            z3 = true;
                            objComponentActivity = new setInsertionMarker(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, i21, 1);
                            getpostalcode.write(objComponentActivity);
                        } else {
                            z3 = true;
                            objComponentActivity = new setInsertionMarker(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, i21, 1);
                            getpostalcode.write(objComponentActivity);
                        }
                        InstructionsItem(str2, i25, zBooleanValue2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, 0, getpostalcode, (i17 << 9) & 57344);
                        i21++;
                        i18 = 0;
                        companion = companion;
                    }
                    z = false;
                    z2 = getpostalcode.read(i21);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (z || z2) {
                        z3 = true;
                        objComponentActivity = new setInsertionMarker(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, i21, 1);
                        getpostalcode.write(objComponentActivity);
                    } else {
                        z3 = true;
                        objComponentActivity = new setInsertionMarker(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, i21, 1);
                        getpostalcode.write(objComponentActivity);
                    }
                    InstructionsItem(str2, i25, zBooleanValue2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, 0, getpostalcode, (i17 << 9) & 57344);
                    i21++;
                    i18 = 0;
                    companion = companion;
                }
            }
            getpostalcode.IconCompatParcelizer((boolean) i18);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new CursorAnchorInfoBuilder_androidKt(r8lambdaiidsddyirtymdul5lt6pmt2zysq, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdakgjqwjlmus58_kprh__ggunrqtq, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier2, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:102:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:76:0x0138  */
    public static final void InstructionsItem(String str, int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, int i2, getBirthDateFull getbirthdatefull, int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        str.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-797943822);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i3 & 6) == 0) {
            if (!getpostalcode.read(str)) {
                i9 = 2;
            } else {
                int i11 = RemoteActionCompatParcelizer + 73;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i9 = 4;
            }
            i4 = i9 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            int i13 = RemoteActionCompatParcelizer + 83;
            read = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i4 |= getpostalcode.read(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (getpostalcode.write(z)) {
                int i15 = read + 21;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i8 = Fields.RotationX;
            } else {
                int i17 = RemoteActionCompatParcelizer + 101;
                read = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                i8 = Fields.SpotShadowColor;
            }
            i4 |= i8;
        }
        if ((i3 & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i19 = read + 75;
                RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                i7 = i19 % 2 != 0 ? 774 : 2048;
            } else {
                i7 = Fields.RotationZ;
            }
            i4 |= i7;
        }
        if ((i3 & 24576) == 0) {
            i4 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 16384 : 8192;
        }
        int i20 = 1769472 | i4;
        if (getpostalcode.write(i20 & 1, !((599187 & i20) == 599186))) {
            Modifier.Companion companion = Modifier.Companion;
            int i21 = i20 & 14;
            boolean z3 = i21 == 4;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z3 || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode.write(objComponentActivity);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new SelectionMagnifierKt(populateViewStructure_androidKtpopulate7, 10);
                getpostalcode.write(objComponentActivity2);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            boolean z4 = (i20 & 57344) == 16384;
            boolean z5 = (i20 & 7168) == 2048;
            int i22 = i20 & 896;
            boolean z6 = i22 == 256;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (!(!(z5 | z4 | z6))) {
                z2 = true;
                objComponentActivity3 = new addCharacterBounds(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z, 1);
                getpostalcode.write(objComponentActivity3);
            } else {
                int i23 = read + 103;
                RemoteActionCompatParcelizer = i23 % Fields.SpotShadowColor;
                if (i23 % 2 != 0) {
                    throw null;
                }
                if (objComponentActivity3 == androidContentCaptureManager) {
                    z2 = true;
                    objComponentActivity3 = new addCharacterBounds(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z, 1);
                    getpostalcode.write(objComponentActivity3);
                } else {
                    z2 = true;
                }
            }
            boolean z7 = z2;
            Modifier modifier3 = canReadPlayIds.read(modifierWrite, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, getpostalcode, 63);
            Alignment.Companion companion2 = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion2.getCenterVertically(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier3);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i24 = read + 75;
            RemoteActionCompatParcelizer = i24 % Fields.SpotShadowColor;
            int i25 = i24 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            ImageVector.Companion companion4 = ImageVector.Companion;
            ImageVector imageVectorVectorResource = VectorResources_androidKt.vectorResource(companion4, i, getpostalcode, (i20 & 112) | 6);
            Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(companion, Dimensions.setLogo);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            IconKt.m117Iconww6aTOc(imageVectorVectorResource, (String) null, modifierM83size3ABfNKs, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), getpostalcode, 48, 0);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion, Dimensions.getNestedScrollAxes)});
            Modifier modifierThen = companion.then(new show(1.0f, z7));
            MeasurePolicy measurePolicy = BoxKt.read(companion2.getTopStart(), false);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion3, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), 0L, null, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, z ? Integer.MAX_VALUE : 2, 0, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, performLayout.IconCompatParcelizer(), getpostalcode, i21, 1573248, 45050);
            getpostalcode.IconCompatParcelizer(z7);
            boolean z8 = i22 == 256 ? z7 : false;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (z8) {
                if (z) {
                    int i26 = RemoteActionCompatParcelizer + 3;
                    read = i26 % Fields.SpotShadowColor;
                    int i27 = i26 % 2;
                    i6 = R.drawable.ic_bold_small_arrow_up;
                } else {
                    i6 = R.drawable.ic_bold_small_arrow_down;
                }
                objComponentActivity4 = Integer.valueOf(i6);
                getpostalcode.write(objComponentActivity4);
            } else {
                int i28 = read + 23;
                RemoteActionCompatParcelizer = i28 % Fields.SpotShadowColor;
                int i29 = i28 % 2;
                if (objComponentActivity4 == androidContentCaptureManager) {
                    if (z) {
                        int i210 = RemoteActionCompatParcelizer + 3;
                        read = i210 % Fields.SpotShadowColor;
                        int i211 = i210 % 2;
                        i6 = R.drawable.ic_bold_small_arrow_up;
                    } else {
                        i6 = R.drawable.ic_bold_small_arrow_down;
                    }
                    objComponentActivity4 = Integer.valueOf(i6);
                    getpostalcode.write(objComponentActivity4);
                }
            }
            int iIntValue = ((Number) objComponentActivity4).intValue();
            if (((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()) {
                getpostalcode.serializer(1916255631);
                IconKt.m117Iconww6aTOc(VectorResources_androidKt.vectorResource(companion4, iIntValue, getpostalcode, 6), "Expand Collapse Carat", (Modifier) null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), getpostalcode, 48, 4);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(1916454868);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i30 = read + 113;
            RemoteActionCompatParcelizer = i30 % Fields.SpotShadowColor;
            int i31 = i30 % 2;
            getpostalcode.IconCompatParcelizer(z7);
            i5 = 2;
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            i5 = i2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new urlWithExtraPathByActivityKind(str, i, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i5, i3, 2);
        }
    }
}
