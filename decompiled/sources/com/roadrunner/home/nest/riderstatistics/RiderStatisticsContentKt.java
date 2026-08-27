package com.roadrunner.home.nest.riderstatistics;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.LinearLayoutManager;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.Preference;
import o.PreferenceBaseSavedState;
import o.PreferenceDialogFragment;
import o.PreferenceFragment;
import o.SwitchDefaults;
import o.TextFieldDefaults;
import o.buildMapping;
import o.canReadPlayIds;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.hasSwipeFlag;
import o.internalPathIteratorPeek;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;
import o.snapElevation;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RiderStatisticsContentKt {
    private static int read = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x008f A[PHI: r8
  0x008f: PHI (r8v7 androidx.compose.ui.Modifier) = (r8v6 androidx.compose.ui.Modifier), (r8v9 androidx.compose.ui.Modifier) binds: [B:35:0x008d, B:32:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[PHI: r2 r8
  0x00a2: PHI (r2v12 o.PreferenceFragment) = (r2v10 o.PreferenceFragment), (r2v18 o.PreferenceFragment) binds: [B:35:0x008d, B:32:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x00a2: PHI (r8v8 androidx.compose.ui.Modifier) = (r8v6 androidx.compose.ui.Modifier), (r8v9 androidx.compose.ui.Modifier) binds: [B:35:0x008d, B:32:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
    public static final void read(LinearLayoutManager linearLayoutManager, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        PreferenceFragment preferenceFragment;
        int i3;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer;
        int i4;
        int i5;
        int i6 = 2 % 2;
        linearLayoutManager.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1659457039);
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(linearLayoutManager)) {
                int i7 = serializer + 87;
                read = i7 % Fields.SpotShadowColor;
                i5 = i7 % 2 != 0 ? 5 : 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        int i8 = i2 | 384;
        if ((i8 & 147) != 146) {
            int i9 = serializer + 73;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i8 & 1, z)) {
            int i10 = read + 11;
            serializer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                modifier = Modifier.Companion;
                preferenceFragment = (PreferenceFragment) ExtrasKt.write(linearLayoutManager.IconCompatParcelizer, getpostalcode, 1).getValue();
                if (preferenceFragment instanceof PreferenceDialogFragment) {
                    int i11 = serializer + 11;
                    read = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    getpostalcode.serializer(-1305339531);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    if (preferenceFragment instanceof PreferenceBaseSavedState) {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1305342495, false);
                    }
                    i3 = read + 47;
                    serializer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        getpostalcode.serializer(-1810780208);
                        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = removeNodeAtDepth.RemoteActionCompatParcelizer(((PreferenceBaseSavedState) preferenceFragment).serializer);
                        i4 = i8 & 32581;
                    } else {
                        getpostalcode.serializer(-1810780208);
                        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = removeNodeAtDepth.RemoteActionCompatParcelizer(((PreferenceBaseSavedState) preferenceFragment).serializer);
                        i4 = i8 & 1008;
                    }
                    IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, getpostalcode, i4);
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                modifier = Modifier.Companion;
                preferenceFragment = (PreferenceFragment) ExtrasKt.write(linearLayoutManager.IconCompatParcelizer, getpostalcode, 0).getValue();
                if (preferenceFragment instanceof PreferenceDialogFragment) {
                    int i13 = serializer + 11;
                    read = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    getpostalcode.serializer(-1305339531);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    if (preferenceFragment instanceof PreferenceBaseSavedState) {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1305342495, false);
                    }
                    i3 = read + 47;
                    serializer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        getpostalcode.serializer(-1810780208);
                        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = removeNodeAtDepth.RemoteActionCompatParcelizer(((PreferenceBaseSavedState) preferenceFragment).serializer);
                        i4 = i8 & 32581;
                    } else {
                        getpostalcode.serializer(-1810780208);
                        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = removeNodeAtDepth.RemoteActionCompatParcelizer(((PreferenceBaseSavedState) preferenceFragment).serializer);
                        i4 = i8 & 1008;
                    }
                    IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, getpostalcode, i4);
                    getpostalcode.IconCompatParcelizer(false);
                }
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        Modifier modifier2 = modifier;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 16, linearLayoutManager, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00cb  */
    public static final void IconCompatParcelizer(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-189317536);
        if ((i & 6) == 0) {
            int i5 = serializer + 15;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0 ? (i & 8) == 0 : (i & 61) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i6 = serializer + 71;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                if (getpostalcode2.read(modifier)) {
                    int i7 = serializer + 113;
                    read = i7 % Fields.SpotShadowColor;
                    i3 = i7 % 2 != 0 ? 31995 : Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
                i2 |= i3;
            } else {
                getpostalcode2.read(modifier);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 147) != 146)) {
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            float f = Dimensions.setTabContainer;
            snapElevation snapelevationIconCompatParcelizer = Arrangement.IconCompatParcelizer(f);
            float f2 = Dimensions.getAnimatedVisibility;
            SwitchDefaults switchDefaults = new SwitchDefaults(f2, f, f2, f);
            if ((i2 & 14) != 4) {
                int i8 = serializer + 27;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0 ? (i2 & 8) != 0 : (i2 & 23) != 0) {
                    if (getpostalcode2.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk)) {
                        z = true;
                    }
                }
                z = false;
            } else {
                z = true;
            }
            boolean z2 = (i2 & 112) == 32;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if ((z | z2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new SuspendingWorkUseCase$$ExternalSyntheticLambda0(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, 21, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                getpostalcode2.write(objComponentActivity);
            }
            getpostalcode = getpostalcode2;
            LazyDslKt.RemoteActionCompatParcelizer(modifier, null, switchDefaults, snapelevationIconCompatParcelizer, null, null, false, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode2, (i2 >> 6) & 14);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new hasSwipeFlag(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:57:0x0125  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0139  */
    /* JADX WARN: Code duplicated, block: B:63:0x0177  */
    /* JADX WARN: Code duplicated, block: B:64:0x017b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0190  */
    /* JADX WARN: Code duplicated, block: B:69:0x019e  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:73:0x022b  */
    public static final void RiderStatistic(Preference preference, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        Modifier.Companion companion;
        Alignment.Companion companion2;
        Alignment.Horizontal centerHorizontally;
        Modifier.Companion companion3;
        Alignment.Companion companion4;
        Alignment.Horizontal horizontal;
        boolean z;
        boolean z2;
        Object objComponentActivity;
        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion5;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2;
        Integer num;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        preference.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-501610443);
        getAddressCountry getaddresscountry = getpostalcode.read;
        Object obj = null;
        if ((i & 6) == 0) {
            if ((i & 8) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(preference);
            } else {
                int i5 = serializer + 75;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    zIconCompatParcelizer = getpostalcode.read(preference);
                } else {
                    getpostalcode.read(preference);
                    obj.hashCode();
                    throw null;
                }
            }
            i2 = i | (zIconCompatParcelizer ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        int i6 = i2 | 384;
        if (!getpostalcode.write(i6 & 1, (i6 & 147) != 146)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        } else {
            int i7 = serializer + 5;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                companion = Modifier.Companion;
                companion2 = Alignment.Companion;
                centerHorizontally = companion2.getCenterHorizontally();
                preference.IconCompatParcelizer.getValue();
                companion.getClass();
                if ((i6 & 32) != 3) {
                    if ((i6 & 8) != 0 || !getpostalcode.IconCompatParcelizer(preference)) {
                        companion3 = companion;
                        companion4 = companion2;
                        horizontal = centerHorizontally;
                        z = false;
                    }
                }
                if ((i6 & 112) == 32) {
                    int i8 = read + 35;
                    serializer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!(z2 | z)) {
                    int i10 = read + 87;
                    serializer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(preference, 25, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                        getpostalcode.write(objComponentActivity);
                    }
                } else {
                    objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(preference, 25, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                    getpostalcode.write(objComponentActivity);
                }
                Modifier modifier3 = canReadPlayIds.read(companion3, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 63);
                modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, horizontal, getpostalcode, 48);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier3);
                companion5 = ComposeUiNode.Companion;
                constructor = companion5.getConstructor();
                if (getaddresscountry != null) {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                        int i12 = serializer + 37;
                        read = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion5, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    getpostalcode.serializer(2024554064);
                    supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(Dimensions.getActionBarHideOffset), companion4.getCenterVertically(), getpostalcode, 48);
                    int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, companion3);
                    constructor2 = companion5.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor2);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion5, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                    num = preference.write;
                    if (num == null) {
                        i3 = read + 71;
                        serializer = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 == 0) {
                            getpostalcode.serializer(-1680450725);
                            getpostalcode.IconCompatParcelizer(true);
                        } else {
                            getpostalcode.serializer(-1680450725);
                            getpostalcode.IconCompatParcelizer(false);
                        }
                    } else {
                        getpostalcode.serializer(-1680450724);
                        IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(num.intValue(), getpostalcode, 0), (String) null, (Modifier) null, Color.Companion.m758getUnspecified0d7_KjU(), getpostalcode, Painter.$stable | 3120, 4);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    String str = preference.read;
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatToken(), getpostalcode, 0, 0, 131066);
                    getpostalcode.IconCompatParcelizer(true);
                    TextKt.m131TextNvy7gAk(preference.serializer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode, 0, 0, 131066);
                    getpostalcode.IconCompatParcelizer(false);
                    getpostalcode.IconCompatParcelizer(true);
                    modifier2 = companion3;
                } else {
                    SentryUUID.write();
                    throw null;
                }
            } else {
                Modifier.Companion companion6 = Modifier.Companion;
                Alignment.Companion companion7 = Alignment.Companion;
                Alignment.Horizontal centerHorizontally2 = companion7.getCenterHorizontally();
                preference.IconCompatParcelizer.getValue();
                companion6.getClass();
                if ((i6 & 14) != 4) {
                    companion = companion6;
                    companion2 = companion7;
                    centerHorizontally = centerHorizontally2;
                    if ((i6 & 8) != 0) {
                    }
                    companion3 = companion;
                    companion4 = companion2;
                    horizontal = centerHorizontally;
                    z = false;
                    if ((i6 & 112) == 32) {
                        int i14 = read + 35;
                        serializer = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (!(z2 | z)) {
                        int i16 = read + 87;
                        serializer = i16 % Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                        if (objComponentActivity == getCreditCardExpirationMonth.write) {
                            objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(preference, 25, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                            getpostalcode.write(objComponentActivity);
                        }
                    } else {
                        objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(preference, 25, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                        getpostalcode.write(objComponentActivity);
                    }
                    Modifier modifier4 = canReadPlayIds.read(companion3, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 63);
                    modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, horizontal, getpostalcode, 48);
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier4);
                    companion5 = ComposeUiNode.Companion;
                    constructor = companion5.getConstructor();
                    if (getaddresscountry != null) {
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            getpostalcode.serializer(constructor);
                            int i18 = serializer + 37;
                            read = i18 % Fields.SpotShadowColor;
                            int i19 = i18 % 2;
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        c8$$ExternalSyntheticOutline0.m(companion5, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                        getpostalcode.serializer(2024554064);
                        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(Dimensions.getActionBarHideOffset), companion4.getCenterVertically(), getpostalcode, 48);
                        int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, companion3);
                        constructor2 = companion5.getConstructor();
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            getpostalcode.serializer(constructor2);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion5, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                        num = preference.write;
                        if (num == null) {
                            i3 = read + 71;
                            serializer = i3 % Fields.SpotShadowColor;
                            if (i3 % 2 == 0) {
                                getpostalcode.serializer(-1680450725);
                                getpostalcode.IconCompatParcelizer(true);
                            } else {
                                getpostalcode.serializer(-1680450725);
                                getpostalcode.IconCompatParcelizer(false);
                            }
                        } else {
                            getpostalcode.serializer(-1680450724);
                            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(num.intValue(), getpostalcode, 0), (String) null, (Modifier) null, Color.Companion.m758getUnspecified0d7_KjU(), getpostalcode, Painter.$stable | 3120, 4);
                            getpostalcode.IconCompatParcelizer(false);
                        }
                        String str2 = preference.read;
                        setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                        TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatToken(), getpostalcode, 0, 0, 131066);
                        getpostalcode.IconCompatParcelizer(true);
                        TextKt.m131TextNvy7gAk(preference.serializer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode, 0, 0, 131066);
                        getpostalcode.IconCompatParcelizer(false);
                        getpostalcode.IconCompatParcelizer(true);
                        modifier2 = companion3;
                    } else {
                        SentryUUID.write();
                        throw null;
                    }
                } else {
                    companion = companion6;
                    companion2 = companion7;
                    centerHorizontally = centerHorizontally2;
                }
            }
            int i20 = serializer + 13;
            read = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            companion3 = companion;
            companion4 = companion2;
            horizontal = centerHorizontally;
            z = true;
            if ((i6 & 112) == 32) {
                int i110 = read + 35;
                serializer = i110 % Fields.SpotShadowColor;
                int i111 = i110 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            objComponentActivity = getpostalcode.ComponentActivity();
            if (!(z2 | z)) {
                int i112 = read + 87;
                serializer = i112 % Fields.SpotShadowColor;
                int i113 = i112 % 2;
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(preference, 25, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                    getpostalcode.write(objComponentActivity);
                }
            } else {
                objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(preference, 25, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                getpostalcode.write(objComponentActivity);
            }
            Modifier modifier5 = canReadPlayIds.read(companion3, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 63);
            modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, horizontal, getpostalcode, 48);
            iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier5);
            companion5 = ComposeUiNode.Companion;
            constructor = companion5.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                    int i114 = serializer + 37;
                    read = i114 % Fields.SpotShadowColor;
                    int i115 = i114 % 2;
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion5, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                getpostalcode.serializer(2024554064);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer3 = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(Dimensions.getActionBarHideOffset), companion4.getCenterVertically(), getpostalcode, 48);
                int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, companion3);
                constructor2 = companion5.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion5, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
                num = preference.write;
                if (num == null) {
                    i3 = read + 71;
                    serializer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        getpostalcode.serializer(-1680450725);
                        getpostalcode.IconCompatParcelizer(true);
                    } else {
                        getpostalcode.serializer(-1680450725);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                } else {
                    getpostalcode.serializer(-1680450724);
                    IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(num.intValue(), getpostalcode, 0), (String) null, (Modifier) null, Color.Companion.m758getUnspecified0d7_KjU(), getpostalcode, Painter.$stable | 3120, 4);
                    getpostalcode.IconCompatParcelizer(false);
                }
                String str3 = preference.read;
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui3 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                TextKt.m131TextNvy7gAk(str3, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui3)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatToken(), getpostalcode, 0, 0, 131066);
                getpostalcode.IconCompatParcelizer(true);
                TextKt.m131TextNvy7gAk(preference.serializer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui3)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode, 0, 0, 131066);
                getpostalcode.IconCompatParcelizer(false);
                getpostalcode.IconCompatParcelizer(true);
                modifier2 = companion3;
            } else {
                SentryUUID.write();
                throw null;
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 17, preference, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2);
        }
    }
}
