package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose.v2;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose.v2.CustomerUnavailableV2ContentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableV2TaskUiItem$Companion;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.AnimationSearchDecaySearch;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.accessibleField;
import o.buildMapping;
import o.canReadPlayIds;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getStore;
import o.handleUrlOverridelambda1;
import o.notifySubscribe;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;
import o.toAnimationGroup;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CustomerUnavailableV2ContentKt {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    public static final void read(final notifySubscribe notifysubscribe, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z;
        final Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        notifysubscribe.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1879081188);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(notifysubscribe) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i5 = write + 125;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i7 = i2 | 384;
        if ((i7 & 147) != 146) {
            int i8 = IconCompatParcelizer + 119;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i7 & 1, z)) {
            final Modifier.Companion companion = Modifier.Companion;
            toAnimationGroup toanimationgroup = (toAnimationGroup) ExtrasKt.write(notifysubscribe.RatingCompat, getpostalcode, 0).getValue();
            if (!(toanimationgroup instanceof AnimationSearchDecaySearch)) {
                getpostalcode.serializer(896632960);
                getpostalcode.IconCompatParcelizer(false);
                getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    final int i10 = 0;
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.setClockTimeNanos
                        private static int MediaBrowserCompatMediaItem = 1;
                        private static int MediaDescriptionCompat;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            int i11 = 2 % 2;
                            int i12 = MediaBrowserCompatMediaItem + 71;
                            MediaDescriptionCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            int i14 = i10;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i15 = i;
                            androidx.compose.ui.Modifier modifier3 = companion;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                            notifySubscribe notifysubscribe2 = notifysubscribe;
                            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                            ((Integer) obj2).getClass();
                            if (i14 != 0) {
                                CustomerUnavailableV2ContentKt.read(notifysubscribe2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i15 | 1));
                                return createfromparcel;
                            }
                            CustomerUnavailableV2ContentKt.read(notifysubscribe2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i15 | 1));
                            int i16 = MediaBrowserCompatMediaItem + 89;
                            MediaDescriptionCompat = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                            return createfromparcel;
                        }
                    };
                    return;
                }
            } else {
                getpostalcode.serializer(-1910745385);
                accessibleField accessiblefield = ((AnimationSearchDecaySearch) toanimationgroup).IconCompatParcelizer;
                CustomerUnavailableV2TaskUiItem$Companion customerUnavailableV2TaskUiItem$Companion = accessibleField.Companion;
                CustomerUnavailableV2Content(accessiblefield, r8lambdaunavo3sxub_pc9xroryotnrlvsm, companion, getpostalcode, (i7 & 112) | 8 | (i7 & 896));
                getpostalcode.IconCompatParcelizer(false);
                modifier2 = companion;
            }
            int i11 = write + 31;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        modifier2 = modifier;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat2 = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat2 != null) {
            final int i13 = 1;
            gethandleruiannotationsMediaDescriptionCompat2.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.setClockTimeNanos
                private static int MediaBrowserCompatMediaItem = 1;
                private static int MediaDescriptionCompat;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i14 = 2 % 2;
                    int i15 = MediaBrowserCompatMediaItem + 71;
                    MediaDescriptionCompat = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    int i17 = i13;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i18 = i;
                    androidx.compose.ui.Modifier modifier3 = modifier2;
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                    notifySubscribe notifysubscribe2 = notifysubscribe;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    ((Integer) obj2).getClass();
                    if (i17 != 0) {
                        CustomerUnavailableV2ContentKt.read(notifysubscribe2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i18 | 1));
                        return createfromparcel;
                    }
                    CustomerUnavailableV2ContentKt.read(notifysubscribe2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i18 | 1));
                    int i19 = MediaBrowserCompatMediaItem + 89;
                    MediaDescriptionCompat = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i110 = i19 % 2;
                    return createfromparcel;
                }
            };
        }
        int i14 = write + 31;
        IconCompatParcelizer = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0042  */
    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x0053 A[PHI: r2 r7
  0x0053: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0033, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0053: PHI (r7v19 o.getAddressCountry) = (r7v1 o.getAddressCountry), (r7v20 o.getAddressCountry) binds: [B:8:0x0033, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0035 A[PHI: r2 r7
  0x0035: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0033, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r7v2 o.getAddressCountry) = (r7v1 o.getAddressCountry), (r7v20 o.getAddressCountry) binds: [B:8:0x0033, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void CustomerUnavailableV2Content(accessibleField accessiblefield, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 9;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-2134072677);
            getaddresscountry = getpostalcode.read;
            if ((i & 44) == 0) {
                int i6 = IconCompatParcelizer + 97;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(accessiblefield);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(accessiblefield);
                }
                if (!(!zIconCompatParcelizer)) {
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
            getpostalcode.MediaSessionCompatQueueItem(-2134072677);
            getaddresscountry = getpostalcode.read;
            if ((i & 6) == 0) {
                int i8 = IconCompatParcelizer + 97;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(accessiblefield);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(accessiblefield);
                }
                if (!(!zIconCompatParcelizer)) {
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
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
            int i10 = IconCompatParcelizer + 59;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        if ((i & 384) == 0) {
            int i12 = IconCompatParcelizer + 17;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            i3 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i14 = i3;
        if (getpostalcode.write(i14 & 1, !((i14 & 147) == 146))) {
            int i15 = IconCompatParcelizer + 83;
            write = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            Object obj = null;
            Modifier modifierWrite = AnimationModifierKt.write(SizeKt.write(modifier, 1.0f), null, 3);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i17 = write + 55;
            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i19 = IconCompatParcelizer + 23;
                write = i19 % Fields.SpotShadowColor;
                if (i19 % 2 == 0) {
                    getpostalcode.serializer(constructor);
                    throw null;
                }
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            DividerKt.read(0.0f, 0, 5, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPopupTheme(), getpostalcode, null);
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierWrite2 = PaddingKt.write(SizeKt.write(companion3, 1.0f), Dimensions.setActionBarVisibilityCallback);
            boolean z = (i14 & 112) == 32;
            boolean z2 = (i14 & 14) == 4 || ((i14 & 8) != 0 && getpostalcode.IconCompatParcelizer(accessiblefield));
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z2 | z) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 12, accessiblefield);
                getpostalcode.write(objComponentActivity);
            }
            Modifier modifier2 = canReadPlayIds.read(modifierWrite2, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 63);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, centerVertically, getpostalcode, 48);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i20 = write + 103;
                IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                if (i20 % 2 != 0) {
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
            TextKt.m131TextNvy7gAk(accessiblefield.title, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131066);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, companion3.then(new show(1.0f, true))});
            getPostalCode getpostalcode2 = getpostalcode;
            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_bold_medium_arrow_right, getpostalcode, 0), "", (Modifier) null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setEmojiCompatEnabled(), getpostalcode2, Painter.$stable | 48, 4);
            getpostalcode.IconCompatParcelizer(true);
            DividerKt.read(0.0f, 0, 5, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPopupTheme(), getpostalcode2, null);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 21, accessiblefield, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier);
        }
    }
}
