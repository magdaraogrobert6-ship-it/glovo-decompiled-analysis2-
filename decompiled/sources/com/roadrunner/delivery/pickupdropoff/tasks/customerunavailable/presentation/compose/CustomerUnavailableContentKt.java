package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose;

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
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose.CustomerUnavailableContentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$Companion;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.addAnimations;
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
import o.hasAnimationlambda00;
import o.makeTreedefault;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CustomerUnavailableContentKt {
    private static int read = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Code duplicated, block: B:17:0x0047 A[PHI: r14
  0x0047: PHI (r14v6 o.getPostalCode) = (r14v1 o.getPostalCode), (r14v7 o.getPostalCode) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r14
  0x0030: PHI (r14v2 o.getPostalCode) = (r14v1 o.getPostalCode), (r14v7 o.getPostalCode) binds: [B:8:0x002e, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void write(final CustomerUnavailableTaskUiModelImpl customerUnavailableTaskUiModelImpl, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        boolean z;
        final Modifier modifier2;
        int i5 = 2 % 2;
        int i6 = serializer + 9;
        read = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            customerUnavailableTaskUiModelImpl.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-853125974);
            if ((i & 98) == 0) {
                if (getpostalcode.read(customerUnavailableTaskUiModelImpl)) {
                    i4 = serializer + 61;
                    read = i4 % Fields.SpotShadowColor;
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
                int i7 = read + 71;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = i;
            }
        } else {
            customerUnavailableTaskUiModelImpl.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-853125974);
            if ((i & 6) == 0) {
                if (getpostalcode.read(customerUnavailableTaskUiModelImpl)) {
                    i4 = serializer + 61;
                    read = i4 % Fields.SpotShadowColor;
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
                int i9 = read + 71;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        int i11 = i3 | 384;
        if ((i11 & 147) != 146) {
            int i12 = read + 83;
            serializer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i11 & 1, z)) {
            final Modifier.Companion companion = Modifier.Companion;
            hasAnimationlambda00 hasanimationlambda00 = (hasAnimationlambda00) ExtrasKt.write(customerUnavailableTaskUiModelImpl.PlaybackStateCompat, getpostalcode, 0).getValue();
            if (!(hasanimationlambda00 instanceof addAnimations)) {
                getpostalcode.serializer(2141121010);
                getpostalcode.IconCompatParcelizer(false);
                getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    final int i13 = 0;
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.TriggerComposeAnimation
                        private static int MediaDescriptionCompat = 1;
                        private static int MediaMetadataCompat;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            int i14 = 2 % 2;
                            int i15 = MediaDescriptionCompat + 107;
                            MediaMetadataCompat = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i16 = i15 % 2;
                            int i17 = i13;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i18 = i;
                            androidx.compose.ui.Modifier modifier3 = companion;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                            CustomerUnavailableTaskUiModelImpl customerUnavailableTaskUiModelImpl2 = customerUnavailableTaskUiModelImpl;
                            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                            ((Integer) obj2).getClass();
                            if (i17 != 0) {
                                CustomerUnavailableContentKt.write(customerUnavailableTaskUiModelImpl2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i18 | 1));
                                return createfromparcel;
                            }
                            CustomerUnavailableContentKt.write(customerUnavailableTaskUiModelImpl2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i18 | 1));
                            int i19 = MediaMetadataCompat + 15;
                            MediaDescriptionCompat = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i19 % 2 != 0) {
                                return createfromparcel;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    };
                    return;
                }
                return;
            }
            getpostalcode.serializer(484704161);
            makeTreedefault maketreedefault = ((addAnimations) hasanimationlambda00).write;
            CustomerUnavailableTaskUiItem$Companion customerUnavailableTaskUiItem$Companion = makeTreedefault.Companion;
            CustomerUnavailableContent(maketreedefault, r8lambdaunavo3sxub_pc9xroryotnrlvsm, companion, getpostalcode, (i11 & 896) | (i11 & 112) | 8);
            getpostalcode.IconCompatParcelizer(false);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat2 = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat2 != null) {
            final int i14 = 1;
            gethandleruiannotationsMediaDescriptionCompat2.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.TriggerComposeAnimation
                private static int MediaDescriptionCompat = 1;
                private static int MediaMetadataCompat;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = 2 % 2;
                    int i16 = MediaDescriptionCompat + 107;
                    MediaMetadataCompat = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    int i18 = i14;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i19 = i;
                    androidx.compose.ui.Modifier modifier3 = modifier2;
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                    CustomerUnavailableTaskUiModelImpl customerUnavailableTaskUiModelImpl2 = customerUnavailableTaskUiModelImpl;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    ((Integer) obj2).getClass();
                    if (i18 != 0) {
                        CustomerUnavailableContentKt.write(customerUnavailableTaskUiModelImpl2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i19 | 1));
                        return createfromparcel;
                    }
                    CustomerUnavailableContentKt.write(customerUnavailableTaskUiModelImpl2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i19 | 1));
                    int i110 = MediaMetadataCompat + 15;
                    MediaDescriptionCompat = i110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i110 % 2 != 0) {
                        return createfromparcel;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x014a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    public static final void CustomerUnavailableContent(makeTreedefault maketreedefault, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        boolean zIconCompatParcelizer;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(444919891);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i6 = read + 33;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                zIconCompatParcelizer = getpostalcode.read(maketreedefault);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(maketreedefault);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = read + 71;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ^ true ? 16 : 32;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i10 = read + 51;
                serializer = i10 % Fields.SpotShadowColor;
                i4 = i10 % 2 != 0 ? 19833 : Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        int i11 = i2;
        if ((i11 & 147) != 146) {
            int i12 = serializer + 109;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!getpostalcode.write(i11 & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
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
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!(!getpostalcode.ComponentActivity)) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i14 = read + 109;
                serializer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Object obj = null;
            DividerKt.read(0.0f, 0, 5, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPopupTheme(), getpostalcode, null);
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierWrite2 = PaddingKt.write(SizeKt.write(companion3, 1.0f), Dimensions.setActionBarVisibilityCallback);
            if ((i11 & 112) == 32) {
                int i16 = read + 95;
                serializer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i11 & 14) != 4) {
                int i18 = serializer + 79;
                int i19 = i18 % Fields.SpotShadowColor;
                read = i19;
                int i20 = i18 % 2;
                if ((i11 & 8) != 0) {
                    int i21 = i19 + 105;
                    serializer = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    z3 = getpostalcode.IconCompatParcelizer(maketreedefault);
                }
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (!z2 && !z3) {
                int i23 = read + 31;
                serializer = i23 % Fields.SpotShadowColor;
                if (i23 % 2 != 0) {
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    obj.hashCode();
                    throw null;
                }
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 10, maketreedefault);
                    getpostalcode.write(objComponentActivity);
                }
            } else {
                objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 10, maketreedefault);
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
                int i24 = serializer + 111;
                read = i24 % Fields.SpotShadowColor;
                if (i24 % 2 == 0) {
                    getpostalcode.serializer(constructor2);
                    i3 = 0;
                    int i25 = 38 / 0;
                } else {
                    i3 = 0;
                    getpostalcode.serializer(constructor2);
                }
            } else {
                i3 = 0;
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            TextKt.m131TextNvy7gAk(maketreedefault.title, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[i3], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131066);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, companion3.then(new show(1.0f, true))});
            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_bold_medium_arrow_right, getpostalcode, 0), "", (Modifier) null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setEmojiCompatEnabled(), getpostalcode, Painter.$stable | 48, 4);
            getpostalcode.IconCompatParcelizer(true);
            DividerKt.read(0.0f, 0, 5, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPopupTheme(), getpostalcode, null);
            getpostalcode.IconCompatParcelizer(true);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 20, maketreedefault, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier);
        }
    }
}
