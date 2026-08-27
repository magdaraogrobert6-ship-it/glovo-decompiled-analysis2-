package com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.compose;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.accept.laststop.api.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModel;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.login.presentation.navigation.LoginNavigationKt$$ExternalSyntheticLambda9;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import o.AdjustBridgeInstance3;
import o.AndroidAutofillManager;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPrefetchScheduler;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.IconCompatParcelizer;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.accessgetTextCentercp;
import o.buildMapping;
import o.canReadPlayIds;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getDrawFilter;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPlatformAndroidManager;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.hasSwipeFlag;
import o.isOpaque;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.setDrawFilter;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LastStopSelectionBottomSheetContentKt {
    private static int read = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:14:0x003e A[PHI: r14
  0x003e: PHI (r14v5 o.getPostalCode) = (r14v1 o.getPostalCode), (r14v6 o.getPostalCode) binds: [B:8:0x0028, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002a A[PHI: r14
  0x002a: PHI (r14v2 o.getPostalCode) = (r14v1 o.getPostalCode), (r14v6 o.getPostalCode) binds: [B:8:0x0028, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void read(LastStopSelectionBottomSheetUiModel lastStopSelectionBottomSheetUiModel, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5 = 2 % 2;
        int i6 = read + 19;
        write = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            lastStopSelectionBottomSheetUiModel.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1357225584);
            if ((i & 68) == 0) {
                if (getpostalcode.read(lastStopSelectionBottomSheetUiModel)) {
                    int i7 = read + 5;
                    write = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            lastStopSelectionBottomSheetUiModel.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1357225584);
            if ((i & 6) == 0) {
                if (getpostalcode.read(lastStopSelectionBottomSheetUiModel)) {
                    int i9 = read + 5;
                    write = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        int i11 = i3 | 48;
        int i12 = 1;
        if ((i11 & 19) != 18) {
            int i13 = read + 37;
            write = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i11 & 1, z)) {
            modifier = Modifier.Companion;
            isOpaque isopaque = (isOpaque) ExtrasKt.write(((LastStopSelectionBottomSheetUiModelImpl) lastStopSelectionBottomSheetUiModel).MediaSessionCompatResultReceiverWrapper, getpostalcode, 0).getValue();
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = CompositionKt.read(1);
                getpostalcode.write(objComponentActivity);
            }
            getPlatformAndroidManager getplatformandroidmanager = (getPlatformAndroidManager) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new accessgetTextCentercp(21);
                getpostalcode.write(objComponentActivity2);
            }
            AnimatedContentKt.write(isopaque, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, null, "bottomSheetStateTransition", null, ExtrasKt.write(2026996700, new LoginNavigationKt$$ExternalSyntheticLambda9(lastStopSelectionBottomSheetUiModel, getplatformandroidmanager, modifier, i12), getpostalcode), getpostalcode, 1597824, 42);
            i4 = read + 55;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            i4 = read + 99;
        }
        write = i4 % Fields.SpotShadowColor;
        int i15 = i4 % 2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(lastStopSelectionBottomSheetUiModel, modifier, i, 21);
        }
    }

    public static final void RecentLocations(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3 = 2 % 2;
        int i4 = write + 91;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(214435441);
        if ((i & 6) == 0) {
            int i6 = write + 119;
            read = i6 % Fields.SpotShadowColor;
            i2 = i | ((i6 % 2 == 0 ? (i & 8) != 0 : (i & 18) != 0) ? getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) : getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        int i7 = i2 | 384;
        if ((i7 & 147) != 146) {
            int i8 = write + 97;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 4 / 4;
            }
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i7 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = PaddingKt.write(companion, Dimensions.setPrimaryBackground);
            modifierWrite.getClass();
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i10 = read + 101;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getpostalcode.serializer(1889973554);
            int i12 = 0;
            for (Object obj : r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
                if (i12 < 0) {
                    SQLite.serializer();
                    throw null;
                }
                int i13 = read + 35;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                RecentLocationItem(i12, (getDrawFilter) obj, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, getpostalcode, (i7 << 3) & 896);
                i12++;
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new hasSwipeFlag(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:14:0x004b A[PHI: r4 r7
  0x004b: PHI (r4v9 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v11 o.getPostalCode) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x004b: PHI (r7v32 o.getAddressCountry) = (r7v1 o.getAddressCountry), (r7v33 o.getAddressCountry) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0040 A[PHI: r4 r7
  0x0040: PHI (r4v6 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v11 o.getPostalCode) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r7v2 o.getAddressCountry) = (r7v1 o.getAddressCountry), (r7v33 o.getAddressCountry) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void RecentLocationItem(int i, getDrawFilter getdrawfilter, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i2) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        int i3;
        int i4;
        boolean z;
        Modifier modifier2;
        int i5;
        String str;
        boolean zIconCompatParcelizer;
        int i6 = 2 % 2;
        int i7 = write + 117;
        read = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            getdrawfilter.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1024951627);
            getaddresscountry = getpostalcode.read;
            if ((i2 & 50) == 0) {
                if (getpostalcode.read(i)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i2;
            } else {
                i4 = i2;
            }
        } else {
            getdrawfilter.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1024951627);
            getaddresscountry = getpostalcode.read;
            if ((i2 & 6) == 0) {
                if (getpostalcode.read(i)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                zIconCompatParcelizer = getpostalcode.read(getdrawfilter);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getdrawfilter);
            }
            i4 |= zIconCompatParcelizer ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i8 = i4 | 3072;
        if ((i8 & 1171) != 1170) {
            int i9 = write + 41;
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
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            float f = Dimensions.setSplitBackground;
            float f2 = Dimensions.setStackedBackground;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifierWrite, f, 0.0f, f2, 0.0f, 10);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            modifier2 = companion;
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                if (i == 0) {
                    i5 = 0;
                    getpostalcode.serializer(1406113251);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    int i10 = read + 13;
                    write = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    getpostalcode.serializer(1406013307);
                    i5 = 0;
                    DividerKt.RemoteActionCompatParcelizer(Dimensions.read, 0, 6, 0L, getpostalcode, null);
                    getpostalcode.IconCompatParcelizer(false);
                }
                Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(modifier2, 0.0f, f2, 1);
                int i12 = (i8 & 896) == 256 ? 1 : i5;
                int i13 = (i8 & 14) == 4 ? 1 : i5;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if ((i13 | i12) != 0 || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new AdjustBridgeInstance3(i, 1, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                    getpostalcode.write(objComponentActivity);
                }
                Modifier modifier3 = canReadPlayIds.read(modifierM73paddingVpY3zN4$default, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 63);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion2.getTop(), getpostalcode, i5);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifier3);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i14 = read + 9;
                    write = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0) {
                        getpostalcode.serializer(constructor2);
                    } else {
                        getpostalcode.serializer(constructor2);
                        throw null;
                    }
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                int i15 = read + 9;
                write = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_clock, getpostalcode, i5), "Recent location", SizeKt.m83size3ABfNKs(modifier2, Dimensions.removeMenuProvider), 0L, getpostalcode, Painter.$stable | 48, 8);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(modifier2, Dimensions.setTabContainer)});
                String str2 = getdrawfilter.IconCompatParcelizer;
                if (str2 == null) {
                    int i17 = read + 119;
                    write = i17 % Fields.SpotShadowColor;
                    str = "";
                    if (i17 % 2 == 0) {
                        int i18 = 62 / i5;
                    }
                } else {
                    str = str2;
                }
                TextKt.m131TextNvy7gAk(str, SizeKt.write(modifier2, 1.0f), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 48, 0, 131064);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidAutofillManager(i, getdrawfilter, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, i2, 8);
        }
    }

    public static final void LastStopSelectionBottomSheetContent(isOpaque isopaque, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, Modifier modifier, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-79413746);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i2 & 6) == 0) {
            i3 = (getpostalcode.read(isopaque) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i6 = read + 75;
                write = i6 % Fields.SpotShadowColor;
                i4 = i6 % 2 == 0 ? 27698 : Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i3 |= i4;
        }
        if ((i2 & 3072) == 0) {
            i3 |= getpostalcode.read(i) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= getpostalcode.read(modifier) ? Fields.RenderEffect : 65536;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            int i7 = read + 41;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(modifier, Dimensions.setPrimaryBackground, 0.0f, 2);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i9 = write + 61;
                read = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    getpostalcode.serializer(constructor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier.Companion companion3 = Modifier.Companion;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, Dimensions.setTransitioning)});
            float f = Dimensions.setStackedBackground;
            Modifier modifierM73paddingVpY3zN4$default2 = PaddingKt.m73paddingVpY3zN4$default(companion3, f, 0.0f, 2);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i10 = write + 15;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            String str = isopaque.MediaBrowserCompatMediaItem;
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = isopaque.RemoteActionCompatParcelizer;
            setDrawFilter setdrawfilter = isopaque.IconCompatParcelizer;
            TextStyle textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatResultReceiverWrapper();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, companion3, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper, getpostalcode, 48, 0, 131064);
            float f2 = Dimensions.setSplitBackground;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f2)});
            TextKt.m131TextNvy7gAk(isopaque.MediaDescriptionCompat, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode, 0, 0, 131066);
            float f3 = Dimensions.setTabContainer;
            IconCompatParcelizer.IconCompatParcelizer(companion3, f3, getpostalcode, true);
            LastStopSelectionLocationContentKt.LastStopSelectionLocationContent(isopaque.serializer, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, null, getpostalcode, (i3 >> 6) & 1008);
            if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.isEmpty()) {
                z2 = false;
                getpostalcode.serializer(-1977559233);
                IconCompatParcelizer.IconCompatParcelizer(companion3, Dimensions.getAnimatedVisibility, getpostalcode, false);
            } else {
                getpostalcode.serializer(-1977925002);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer3 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
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
                int i12 = read + 13;
                write = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f2)});
                RecentLocations(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, getpostalcode, (i3 >> 3) & 112);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f2)});
                getpostalcode.IconCompatParcelizer(true);
                z2 = false;
                getpostalcode.IconCompatParcelizer(false);
            }
            if (setdrawfilter.read) {
                getpostalcode.serializer(-1977425375);
                String str2 = setdrawfilter.serializer;
                boolean z3 = setdrawfilter.RemoteActionCompatParcelizer;
                boolean z4 = setdrawfilter.write;
                Modifier modifierM73paddingVpY3zN4$default3 = PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(companion3, 1.0f), f, 0.0f, 2);
                modifierM73paddingVpY3zN4$default3.getClass();
                PrimaryKt.write(str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierM73paddingVpY3zN4$default3, z3, z4, null, null, null, null, null, getpostalcode, i3 & 112, 0, 2016);
                IconCompatParcelizer.IconCompatParcelizer(companion3, f3, getpostalcode, z2);
            } else {
                getpostalcode.serializer(-1976924694);
                getpostalcode.IconCompatParcelizer(z2);
            }
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidViewBindingKt$$ExternalSyntheticLambda7(isopaque, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier, i2);
        }
    }
}
