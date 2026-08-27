package com.roadrunner.home.nest.profile;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.LinearGradientShaderVjE6UOU;
import o.LinearGradientShaderVjE6UOUdefault;
import o.ListPreference;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.MultiSelectListPreference;
import o.MultiSelectListPreferenceDialogFragment;
import o.MultiSelectListPreferenceSavedState;
import o.ShaderKt;
import o.SimpleGraphicsLayerModifiermeasure1;
import o.SweepGradientShader9KIMszo;
import o.TextFieldDefaults;
import o.buildMapping;
import o.convertToAbsoluteDirection;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getMovementFlags;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPostalCode;
import o.getSwipeThreshold;
import o.getTopLeftannotations;
import o.handleUrlOverridelambda1;
import o.internalPathIteratorPeek;
import o.onMessageReceived;
import o.p2;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.setTransformQ8lPUPs;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RiderProfileContentKt {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    public static final void RiderProfileContainer(getSwipeThreshold getswipethreshold, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer + 121;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        getswipethreshold.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(186620356);
        if ((i & 6) == 0) {
            int i6 = IconCompatParcelizer + 101;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 = (getpostalcode.IconCompatParcelizer(getswipethreshold) ? 4 : 2) | i;
        } else {
            int i8 = IconCompatParcelizer + 31;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 = i;
        }
        int i10 = i2 | 48;
        if ((i10 & 19) != 18) {
            int i11 = write + 85;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i10 & 1, z)) {
            modifier = Modifier.Companion;
            ListPreference listPreference = (ListPreference) ExtrasKt.write(getswipethreshold.IconCompatParcelizer, getpostalcode, 0).getValue();
            if (listPreference instanceof MultiSelectListPreference) {
                int i13 = IconCompatParcelizer + 59;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                getpostalcode.serializer(-1046457720);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(listPreference instanceof MultiSelectListPreferenceDialogFragment)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1046460566, false);
                }
                int i15 = write + 37;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                getpostalcode.serializer(-1046456387);
                Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifier, Dimensions.getAnimatedVisibility, Dimensions.setTabContainer);
                modifierRemoteActionCompatParcelizer.getClass();
                RiderProfileContent((MultiSelectListPreferenceDialogFragment) listPreference, modifierRemoteActionCompatParcelizer, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 11, getswipethreshold, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    public static final void StatusTag(String str, MultiSelectListPreferenceSavedState multiSelectListPreferenceSavedState, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-968888254);
        if ((i & 6) == 0) {
            int i6 = write + 67;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 63 / 0;
                if (getpostalcode.read(str)) {
                    i4 = 4;
                } else {
                    i4 = 2;
                }
            } else if (getpostalcode.read(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(multiSelectListPreferenceSavedState.ordinal())) {
                int i8 = write + 53;
                int i9 = i8 % Fields.SpotShadowColor;
                IconCompatParcelizer = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 27;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i13 = i2 | 384;
        if (getpostalcode.write(i13 & 1, (i13 & 147) != 146)) {
            int i14 = IconCompatParcelizer + 43;
            write = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            Modifier.Companion companion = Modifier.Companion;
            int i16 = getMovementFlags.read[multiSelectListPreferenceSavedState.ordinal()];
            if (i16 == 1) {
                getpostalcode.serializer(906295479);
                TagsKt.RemoteActionCompatParcelizer(str, companion, 0, 0, getpostalcode, (i13 & 14) | ((i13 >> 3) & 112), 28);
                getpostalcode.IconCompatParcelizer(false);
                int i17 = IconCompatParcelizer + 79;
                write = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
            } else if (i16 != 2) {
                int i19 = IconCompatParcelizer + 81;
                write = i19 % Fields.SpotShadowColor;
                if (i19 % 2 != 0 ? i16 == 3 : i16 == 4) {
                    getpostalcode.serializer(906302293);
                    TagsKt.serializer(2032277805, onMessageReceived.IconCompatParcelizer(), onMessageReceived.IconCompatParcelizer(), -2032277804, new Object[]{str, companion, 0, 0, getpostalcode, Integer.valueOf(((i13 >> 3) & 112) | (i13 & 14)), 28}, onMessageReceived.IconCompatParcelizer(), onMessageReceived.IconCompatParcelizer());
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    if (i16 != 4) {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, 906294744, false);
                    }
                    getpostalcode.serializer(906305557);
                    TagsKt.serializer(str, companion, 0, 0, getpostalcode, (i13 & 14) | ((i13 >> 3) & 112), 28);
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                getpostalcode.serializer(906298871);
                TagsKt.write(str, companion, 0, 0, getpostalcode, (i13 & 14) | ((i13 >> 3) & 112), 28);
                getpostalcode.IconCompatParcelizer(false);
            }
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 15, str, multiSelectListPreferenceSavedState, modifier2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052 A[PHI: r4 r5
  0x0052: PHI (r4v9 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r5v15 o.getAddressCountry) = (r5v2 o.getAddressCountry), (r5v16 o.getAddressCountry) binds: [B:8:0x0030, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[PHI: r4 r5
  0x0032: PHI (r4v6 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r5v3 o.getAddressCountry) = (r5v2 o.getAddressCountry), (r5v16 o.getAddressCountry) binds: [B:8:0x0030, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void RiderProfileContent(MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = write + 79;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(776614315);
            getaddresscountry = getpostalcode.read;
            if ((i & 15) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(multiSelectListPreferenceDialogFragment);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(multiSelectListPreferenceDialogFragment);
                }
                if (zIconCompatParcelizer) {
                    i4 = IconCompatParcelizer + 25;
                    write = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        i2 = 2;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(776614315);
            getaddresscountry = getpostalcode.read;
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(multiSelectListPreferenceDialogFragment);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(multiSelectListPreferenceDialogFragment);
                }
                if (zIconCompatParcelizer) {
                    i4 = IconCompatParcelizer + 25;
                    write = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        i2 = 2;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if (!getpostalcode.write(i3 & 1, (i3 & 19) != 18)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            i5 = 0;
        } else {
            int i8 = IconCompatParcelizer + 11;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(playbackStateCompatCustomAction, centerVertically, getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                int i10 = write + 17;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Avatar(multiSelectListPreferenceDialogFragment, null, getpostalcode, i3 & 14);
                Modifier.Companion companion3 = Modifier.Companion;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion3, Dimensions.setTabContainer)});
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion.getStart(), getpostalcode, 0);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, companion3);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                String str = multiSelectListPreferenceDialogFragment.read;
                TextStyle textStyleMediaSessionCompatQueueItem = performLayout.MediaSessionCompatQueueItem();
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatQueueItem, getpostalcode, 0, 0, 131066);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion.getCenterVertically(), getpostalcode, 48);
                int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, companion3);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor3);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                int i12 = IconCompatParcelizer + 63;
                write = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                StatusTag(multiSelectListPreferenceDialogFragment.serializer, multiSelectListPreferenceDialogFragment.write, null, getpostalcode, 0);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion3, Dimensions.setSplitBackground)});
                i5 = 0;
                TextKt.m131TextNvy7gAk(multiSelectListPreferenceDialogFragment.RemoteActionCompatParcelizer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode, 0, 0, 131066);
                af$$ExternalSyntheticOutline0.m(getpostalcode, true, true, true);
            } else {
                SentryUUID.write();
                throw null;
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new convertToAbsoluteDirection(multiSelectListPreferenceDialogFragment, modifier, i, i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[DONT_INVERT, PHI: r4 r7 r8
  0x0066: PHI (r4v12 androidx.compose.ui.Modifier$Companion) = (r4v11 androidx.compose.ui.Modifier$Companion), (r4v26 androidx.compose.ui.Modifier$Companion) binds: [B:25:0x0064, B:22:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x0066: PHI (r7v2 int[]) = (r7v1 int[]), (r7v10 int[]) binds: [B:25:0x0064, B:22:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x0066: PHI (r8v2 int) = (r8v1 int), (r8v31 int) binds: [B:25:0x0064, B:22:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4 A[PHI: r4 r7
  0x00c4: PHI (r4v25 androidx.compose.ui.Modifier$Companion) = (r4v11 androidx.compose.ui.Modifier$Companion), (r4v26 androidx.compose.ui.Modifier$Companion) binds: [B:25:0x0064, B:22:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x00c4: PHI (r7v9 int[]) = (r7v1 int[]), (r7v10 int[]) binds: [B:25:0x0064, B:22:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void Avatar(MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        Modifier modifier2;
        Modifier.Companion companion;
        int[] iArr;
        int i4;
        long supportBackgroundTintList;
        int i5;
        long overflowIcon;
        boolean zIconCompatParcelizer;
        int i6 = 2;
        int i7 = 2 % 2;
        MultiSelectListPreferenceSavedState multiSelectListPreferenceSavedState = multiSelectListPreferenceDialogFragment.write;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(112411254);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(multiSelectListPreferenceDialogFragment);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(multiSelectListPreferenceDialogFragment);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i8 = i2 | 48;
        if (getpostalcode.write(i8 & 1, (i8 & 19) != 18)) {
            int i9 = write + 59;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                companion = Modifier.Companion;
                iArr = getMovementFlags.read;
                i4 = iArr[multiSelectListPreferenceSavedState.ordinal()];
                if (i4 == 1) {
                    getpostalcode.serializer(653037280);
                    supportBackgroundTintList = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
                    getpostalcode.IconCompatParcelizer(false);
                } else if (i4 != 2) {
                    getpostalcode.serializer(653038465);
                    supportBackgroundTintList = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportBackgroundTintList();
                    getpostalcode.IconCompatParcelizer(false);
                } else if (i4 != 3) {
                    getpostalcode.serializer(653039711);
                    supportBackgroundTintList = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getWindowSystemUiVisibility();
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    i5 = IconCompatParcelizer + 121;
                    write = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0 ? i4 == 4 : i4 == 3) {
                        getpostalcode.serializer(653040799);
                        supportBackgroundTintList = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).read();
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, 653035969, false);
                    }
                }
            } else {
                companion = Modifier.Companion;
                iArr = getMovementFlags.read;
                i4 = iArr[multiSelectListPreferenceSavedState.ordinal()];
                if (i4 == 1) {
                    getpostalcode.serializer(653037280);
                    supportBackgroundTintList = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
                    getpostalcode.IconCompatParcelizer(false);
                } else if (i4 != 2) {
                    getpostalcode.serializer(653038465);
                    supportBackgroundTintList = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportBackgroundTintList();
                    getpostalcode.IconCompatParcelizer(false);
                } else if (i4 != 3) {
                    getpostalcode.serializer(653039711);
                    supportBackgroundTintList = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getWindowSystemUiVisibility();
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    i5 = IconCompatParcelizer + 121;
                    write = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, 653035969, false);
                    }
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 653035969, false);
                }
            }
            modifier2 = companion;
            long j = supportBackgroundTintList;
            int i10 = write + 1;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            int i12 = iArr[multiSelectListPreferenceSavedState.ordinal()];
            if (i12 == 1) {
                getpostalcode.serializer(653043519);
                overflowIcon = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowIcon();
                getpostalcode.IconCompatParcelizer(false);
            } else if (i12 == 2) {
                getpostalcode.serializer(653044674);
                overflowIcon = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setDropDownBackgroundResource();
                getpostalcode.IconCompatParcelizer(false);
                int i13 = IconCompatParcelizer + 23;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
            } else if (i12 == 3) {
                getpostalcode.serializer(653045952);
                overflowIcon = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setShowingForActionMode();
                getpostalcode.IconCompatParcelizer(false);
            } else if (i12 == 4) {
                getpostalcode.serializer(653047072);
                overflowIcon = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).RemoteActionCompatParcelizer();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                throw d$$ExternalSyntheticOutline0.m(getpostalcode, 653042211, false);
            }
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion2.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion3, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                setTransformQ8lPUPs settransformq8lpups = new setTransformQ8lPUPs((Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                settransformq8lpups.IconCompatParcelizer = multiSelectListPreferenceDialogFragment.IconCompatParcelizer;
                Extras$Key extras$Key = LinearGradientShaderVjE6UOU.MediaDescriptionCompat;
                int i15 = R.drawable.rider_profile_placeholder;
                settransformq8lpups.PlaybackStateCompatCustomAction = new SweepGradientShader9KIMszo(i15, i6);
                settransformq8lpups.RatingCompat = new SweepGradientShader9KIMszo(i15, 0);
                LinearGradientShaderVjE6UOUdefault.write(settransformq8lpups);
                LinearGradientShaderVjE6UOUdefault.serializer(settransformq8lpups, new SimpleGraphicsLayerModifiermeasure1());
                ShaderKt shaderKtIconCompatParcelizer = settransformq8lpups.IconCompatParcelizer();
                String str = multiSelectListPreferenceDialogFragment.read;
                Modifier modifierM75height3ABfNKs = SizeKt.m75height3ABfNKs(SizeKt.m86width3ABfNKs(modifier2, Dimensions.OnBackPressedCallback), Dimensions.addCloseableactivity);
                float f = Dimensions.RemoteActionCompatParcelizer;
                getTopLeftannotations gettopleftannotations = RoundedCornerShapeKt.IconCompatParcelizer;
                Modifier modifierWrite = BorderKt.write(modifierM75height3ABfNKs, f, overflowIcon, gettopleftannotations);
                float f2 = Dimensions.IconCompatParcelizer;
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                Modifier modifierClip = ClipKt.clip(BorderKt.write(modifierWrite, f2, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), gettopleftannotations), gettopleftannotations);
                Alignment center = companion2.getCenter();
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.serializer;
                getNonZeroRgk1Os.RemoteActionCompatParcelizer(shaderKtIconCompatParcelizer, str, boxScopeInstance.align(modifierClip, center), null, null, getpostalcode, 0, 2040);
                BoxKt.Box(boxScopeInstance.align(BackgroundKt.m20backgroundbw27NRU(PaddingKt.write(BackgroundKt.m20backgroundbw27NRU(SizeKt.m83size3ABfNKs(OffsetKt.read(modifier2, Dp.m3673constructorimpl(-6.0f), Dp.m3673constructorimpl(6.0f)), Dimensions.setTransitioning), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), gettopleftannotations), f), j, gettopleftannotations), companion2.getTopEnd()), getpostalcode, 0);
                i3 = 1;
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            i3 = 1;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new convertToAbsoluteDirection(multiSelectListPreferenceDialogFragment, modifier2, i, i3);
        }
    }
}
