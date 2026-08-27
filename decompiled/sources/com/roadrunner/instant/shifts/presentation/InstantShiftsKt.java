package com.roadrunner.instant.shifts.presentation;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.fragment.app.FragmentActivity;
import androidx.room.RoomDatabase$closeBarrier$1;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropSourceModifierNode;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.NestRiderStateSummary;
import o.PagerWrapperFlingBehavior;
import o.StaggeredGridLayoutManager;
import o.StaggeredGridLayoutManagerLazySpanLookupFullSpanItem;
import o.StaggeredGridLayoutManagerLazySpanLookupFullSpanItem1;
import o.TextFieldDefaults;
import o.buildMapping;
import o.createFromParcel;
import o.expand;
import o.findKNearestNeighbors;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getInternalPaintui_graphics;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getQueryContext;
import o.getStrokeJoinLxFBmk8;
import o.handleUrlOverridelambda1;
import o.p7;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;
import o.shouldIgnore;
import o.show;
import o.stopIgnoring;
import o.supportingTextPaddinga9UjIt4material3default;
import o.updatePath;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InstantShiftsKt {
    private static int read = 1;
    private static int write;

    public static final void NoBookableShiftsColumn(NestRiderStateSummary nestRiderStateSummary, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-887470474);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(nestRiderStateSummary);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(nestRiderStateSummary);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i5 = read + 91;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            int i7 = read + 89;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            Object obj = null;
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i9 = read + 43;
            write = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                InstantShiftsTitle(0, getpostalcode, null, nestRiderStateSummary.write, nestRiderStateSummary.IconCompatParcelizer);
                Modifier.Companion companion2 = Modifier.Companion;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(companion2, Dimensions.setTabContainer)});
                PrimaryKt.write(nestRiderStateSummary.serializer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SizeKt.write(companion2, 1.0f), false, false, null, null, null, null, null, getpostalcode, (i2 & 112) | 384, 0, 2040);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z2 = getpostalcode.ComponentActivity;
                obj.hashCode();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getInternalPaintui_graphics(i, 8, nestRiderStateSummary, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    public static final void InstantShiftsTitle(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        int i5 = write + 105;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(410339182);
        if ((i & 6) == 0) {
            i2 = i | (getpostalcode2.read(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.read(str2)) {
                int i7 = write + 25;
                read = i7 % Fields.SpotShadowColor;
                i3 = i7 % 2 == 0 ? 97 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i8 = i2 | 384;
        if ((i8 & 147) != 146) {
            int i9 = read + 41;
            write = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode2.write(i8 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i10 = write + 89;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                int i11 = 41 / 0;
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            } else {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            int iM3569getEllipsisgIe3tQ8 = TextOverflow.Companion.m3569getEllipsisgIe3tQ8();
            TextStyle textStyleMediaDescriptionCompat = performLayout.MediaDescriptionCompat();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setHideOnContentScrollEnabled(), 0L, null, null, 0L, null, 0L, iM3569getEllipsisgIe3tQ8, false, 1, 0, null, textStyleMediaDescriptionCompat, getpostalcode2, i8 & 14, 24960, 110586);
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, (i8 >> 3) & 14, 0, 131066);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new findKNearestNeighbors(str, str2, modifier2, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    public static final void InstantShiftsColumn(StaggeredGridLayoutManager staggeredGridLayoutManager, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        boolean zIconCompatParcelizer;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-468304162);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(staggeredGridLayoutManager);
                int i6 = read + 57;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 4 % 4;
                }
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(staggeredGridLayoutManager);
            }
            if (zIconCompatParcelizer) {
                int i8 = read + 81;
                write = i8 % Fields.SpotShadowColor;
                i4 = i8 % 2 != 0 ? 2 : 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i9 = write + 117;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                throw null;
            }
        }
        if ((i & 384) == 0) {
            int i10 = read + 111;
            write = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 3072) == 0) {
            int i11 = read + 95;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode.read(modifier)) {
                int i13 = read + 25;
                write = i13 % Fields.SpotShadowColor;
                i3 = i13 % 2 != 0 ? 4725 : Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), RectangleShapeKt.getRectangleShape());
            float f = Dimensions.getAnimatedVisibility;
            Modifier modifierWrite = SizeKt.write(PaddingKt.m73paddingVpY3zN4$default(modifierM20backgroundbw27NRU, 0.0f, f, 1), 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                if (staggeredGridLayoutManager instanceof StaggeredGridLayoutManagerLazySpanLookupFullSpanItem1) {
                    getpostalcode.serializer(553384822);
                    BookableShiftsColumn((StaggeredGridLayoutManagerLazySpanLookupFullSpanItem1) staggeredGridLayoutManager, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, getpostalcode, i2 & 1022);
                    getpostalcode.IconCompatParcelizer(false);
                } else if (staggeredGridLayoutManager instanceof NestRiderStateSummary) {
                    getpostalcode.serializer(-24696629);
                    NoBookableShiftsColumn((NestRiderStateSummary) staggeredGridLayoutManager, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PaddingKt.m73paddingVpY3zN4$default(Modifier.Companion, f, 0.0f, 2), getpostalcode, i2 & 126);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{staggeredGridLayoutManager, StaggeredGridLayoutManagerLazySpanLookupFullSpanItem.write}, getCieXyz.write())).booleanValue()) {
                        getpostalcode.serializer(553402028);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, 553383624, false);
                    }
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStrokeJoinLxFBmk8(staggeredGridLayoutManager, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:12:0x004c  */
    /* JADX WARN: Code duplicated, block: B:14:0x004f A[PHI: r2 r3
  0x004f: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r3v12 o.getAddressCountry) = (r3v2 o.getAddressCountry), (r3v13 o.getAddressCountry) binds: [B:8:0x002e, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r2 r3
  0x0030: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0030: PHI (r3v3 o.getAddressCountry) = (r3v2 o.getAddressCountry), (r3v13 o.getAddressCountry) binds: [B:8:0x002e, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void InstantShiftsTitleWithViewAllButton(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2, String str3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = read + 93;
        write = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1025124917);
            getaddresscountry = getpostalcode.read;
            if ((i & 70) == 0) {
                int i8 = write + 23;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (getpostalcode.read(str)) {
                    int i10 = write + 117;
                    read = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1025124917);
            getaddresscountry = getpostalcode.read;
            if ((i & 6) == 0) {
                int i12 = write + 23;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (getpostalcode.read(str)) {
                    int i14 = write + 117;
                    read = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(str2)) {
                int i16 = write + 33;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.read(str3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i18 = write + 115;
            read = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true ? Fields.RotationZ : Fields.CameraDistance;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.read(modifier)) {
                int i20 = write + 5;
                read = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                i4 = Fields.Clip;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            int i22 = read + 57;
            write = i22 % Fields.SpotShadowColor;
            int i23 = i22 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            int i24 = write + 69;
            read = i24 % Fields.SpotShadowColor;
            int i25 = i24 % 2;
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            Object obj = null;
            if (getaddresscountry == null) {
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
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.read;
            Modifier.Companion companion3 = Modifier.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(arrangement$Center$1, centerVertically, getpostalcode, 54);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, companion3);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i26 = read + 95;
                write = i26 % Fields.SpotShadowColor;
                if (i26 % 2 != 0) {
                    getpostalcode.serializer(constructor2);
                    obj.hashCode();
                    throw null;
                }
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            getPostalCode getpostalcode2 = getpostalcode;
            TextKt.m131TextNvy7gAk(str, companion3.then(new show(1.0f, true)), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setHideOnContentScrollEnabled(), 0L, null, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, performLayout.MediaDescriptionCompat(), getpostalcode2, i3 & 14, 24960, 110584);
            int i27 = i3 >> 6;
            TertiaryKt.IconCompatParcelizer(str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, false, 0, null, null, null, getpostalcode, ((i3 >> 3) & 14) | (i27 & 112), 252);
            getpostalcode.IconCompatParcelizer(true);
            TextKt.m131TextNvy7gAk(str3, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, i27 & 14, 0, 131070);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new stopIgnoring(i, str, str2, str3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb  */
    public static final void BookableShiftsColumn(StaggeredGridLayoutManagerLazySpanLookupFullSpanItem1 staggeredGridLayoutManagerLazySpanLookupFullSpanItem1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        Modifier modifierM74paddingqDBjuR0$default;
        int i3;
        int i4;
        boolean zIconCompatParcelizer;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1211382999);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if ((i & 8) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(staggeredGridLayoutManagerLazySpanLookupFullSpanItem1);
            } else {
                int i6 = write + 123;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    zIconCompatParcelizer = getpostalcode.read(staggeredGridLayoutManagerLazySpanLookupFullSpanItem1);
                } else {
                    getpostalcode.read(staggeredGridLayoutManagerLazySpanLookupFullSpanItem1);
                    throw null;
                }
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = write + 75;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                if (!(!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0))) {
                    i4 = 32;
                } else {
                    i4 = 16;
                }
            } else {
                int i8 = 76 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i4 = 32;
                } else {
                    i4 = 16;
                }
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i9 = read + 21;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        int i11 = i2 | 3072;
        if (!getpostalcode.write(i11 & 1, (i11 & 1171) != 1170)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        } else {
            int i12 = write + 111;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            Modifier.Companion companion = Modifier.Companion;
            ScrollState scrollState = PagerWrapperFlingBehavior.read(0, getpostalcode, 1);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i14 = write + 7;
            read = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                int i15 = 79 / 0;
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            } else {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(companion, Dimensions.getAnimatedVisibility, 0.0f, 2);
            String str = staggeredGridLayoutManagerLazySpanLookupFullSpanItem1.write;
            String str2 = staggeredGridLayoutManagerLazySpanLookupFullSpanItem1.RemoteActionCompatParcelizer;
            InstantShiftsTitleWithViewAllButton((i11 << 6) & 7168, getpostalcode, modifierM73paddingVpY3zN4$default, str, str2, staggeredGridLayoutManagerLazySpanLookupFullSpanItem1.IconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(companion, Dimensions.setTabContainer)});
            Modifier modifierSerializer = PagerWrapperFlingBehavior.serializer(IntrinsicKt.height(companion, expand.Max), scrollState);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion2.getTop(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierSerializer);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i16 = read + 41;
                write = i16 % Fields.SpotShadowColor;
                if (i16 % 2 == 0) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.serializer(constructor2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            getpostalcode.serializer(-617517845);
            int i17 = 0;
            for (Object obj2 : staggeredGridLayoutManagerLazySpanLookupFullSpanItem1.serializer) {
                if (i17 >= 0) {
                    shouldIgnore shouldignore = (shouldIgnore) obj2;
                    Modifier.Companion companion4 = Modifier.Companion;
                    if (i17 == 0) {
                        modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion4, Dimensions.getAnimatedVisibility, 0.0f, 0.0f, 0.0f, 14);
                    } else {
                        modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion4, Dimensions.setStackedBackground, 0.0f, 0.0f, 0.0f, 14);
                    }
                    BookableShiftColumnKt.BookableShiftColumn(r8lambdaunavo3sxub_pc9xroryotnrlvsm, shouldignore, modifierM74paddingqDBjuR0$default, getpostalcode, (i11 >> 6) & 14);
                    i17++;
                } else {
                    SQLite.serializer();
                    throw null;
                }
            }
            getpostalcode.IconCompatParcelizer(false);
            InstantShiftViewAllColumnKt.InstantShiftViewAllColumn(staggeredGridLayoutManagerLazySpanLookupFullSpanItem1.read, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, Dimensions.setStackedBackground, 0.0f, Dimensions.getAnimatedVisibility, 0.0f, 10), getpostalcode, (i11 << 3) & 896);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7((Object) staggeredGridLayoutManagerLazySpanLookupFullSpanItem1, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, i, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0122  */
    public static final void InstantShifts(InstantShiftsUiModel instantShiftsUiModel, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        boolean z;
        int i4;
        int i5 = 2 % 2;
        instantShiftsUiModel.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm3.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-90796566);
        if ((i & 6) == 0) {
            int i6 = write + 73;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 = (getpostalcode.read(instantShiftsUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i8 = write + 21;
                read = i8 % Fields.SpotShadowColor;
                i4 = i8 % 2 == 0 ? 30 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 256 : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3) ? 2048 : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i9 = write + 3;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.Clip : 8192;
        }
        int i11 = i2 | 196608;
        if (getpostalcode.write(i11 & 1, (74899 & i11) != 74898)) {
            Modifier.Companion companion = Modifier.Companion;
            FragmentActivity fragmentActivityRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
            boolean z2 = (i11 & 112) == 32;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer);
            boolean z3 = (i11 & 896) == 256;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z2 | zIconCompatParcelizer | z3) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new updatePath(r8lambdaunavo3sxub_pc9xroryotnrlvsm, fragmentActivityRemoteActionCompatParcelizer, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 2);
                getpostalcode.write(objComponentActivity);
            }
            getPhoneNumberNational.serializer(createFromParcel.INSTANCE, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode);
            InstantShiftsUiModelImpl instantShiftsUiModelImpl = (InstantShiftsUiModelImpl) instantShiftsUiModel;
            getQueryContext getquerycontext = instantShiftsUiModelImpl.read;
            boolean z4 = (i11 & 7168) == 2048;
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer);
            boolean z5 = (57344 & i11) == 16384;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((z4 | zIconCompatParcelizer2) || z5) {
                objComponentActivity2 = new updatePath(r8lambdaunavo3sxub_pc9xroryotnrlvsm3, fragmentActivityRemoteActionCompatParcelizer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 3);
                getpostalcode.write(objComponentActivity2);
            } else {
                int i12 = read + 105;
                write = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    throw null;
                }
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new updatePath(r8lambdaunavo3sxub_pc9xroryotnrlvsm3, fragmentActivityRemoteActionCompatParcelizer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 3);
                    getpostalcode.write(objComponentActivity2);
                }
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 8);
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) ExtrasKt.write(instantShiftsUiModelImpl.MediaDescriptionCompat, getpostalcode, 0).getValue();
            int i13 = i11 & 14;
            boolean z6 = i13 == 4;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (z6 || objComponentActivity3 == androidContentCaptureManager) {
                i3 = 4;
                RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1 = new RoomDatabase$closeBarrier$1(0, instantShiftsUiModel, InstantShiftsUiModel.class, "onSeeAvailableShiftsClicked", "onSeeAvailableShiftsClicked()V", 0, 14);
                getpostalcode.write(roomDatabase$closeBarrier$1);
                objComponentActivity3 = roomDatabase$closeBarrier$1;
            } else {
                i3 = 4;
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity3;
            if (i13 == i3) {
                int i14 = write + 31;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                z = true;
            } else {
                z = false;
            }
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (z || objComponentActivity4 == androidContentCaptureManager) {
                HomeFragment.AnonymousClass1 anonymousClass1 = new HomeFragment.AnonymousClass1(1, instantShiftsUiModel, InstantShiftsUiModel.class, "onShiftActionClicked", "onShiftActionClicked(Lcom/roadrunner/instant/shifts/presentation/InstantShiftsUiModel$InstantShiftViewEntity;)V", 0, 22);
                getpostalcode.write(anonymousClass1);
                objComponentActivity4 = anonymousClass1;
            }
            InstantShiftsColumn(staggeredGridLayoutManager, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion, getpostalcode, (i11 >> 6) & 7168);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new DragAndDropSourceModifierNode(instantShiftsUiModel, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier2, i, 2);
            int i16 = read + 37;
            write = i16 % Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                int i17 = 5 % 4;
            }
        }
    }
}
