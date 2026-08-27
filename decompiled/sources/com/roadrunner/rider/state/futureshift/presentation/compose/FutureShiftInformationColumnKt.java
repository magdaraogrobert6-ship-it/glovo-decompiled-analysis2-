package com.roadrunner.rider.state.futureshift.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.login.presentation.otp.OtpNavigationKt$$ExternalSyntheticLambda4;
import com.roadrunner.rider.state.futureshift.presentation.compose.FutureShiftInformationColumnKt;
import io.sentry.SentryUUID;
import o.AdjustInstance101;
import o.AdjustInstance12;
import o.AdjustInstance13;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.buildMapping;
import o.canReadPlayIds;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.p7;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;
import o.t1ExternalSyntheticLambda1;
import o.t3;
import o.t6;
import o.u6;
import o.u9;
import o.xb;
import o.y0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FutureShiftInformationColumnKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0044  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x005a  */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[PHI: r0
  0x0071: PHI (r0v16 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v18 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r0
  0x0030: PHI (r0v6 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v18 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ShowOnMapButton-942rkJo, reason: not valid java name */
    public static final void m5026ShowOnMapButton942rkJo(final AdjustInstance101 adjustInstance101, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final float f, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        final Modifier modifier2;
        boolean z;
        int i7;
        int i8 = 2 % 2;
        int i9 = RemoteActionCompatParcelizer + 107;
        read = i9 % Fields.SpotShadowColor;
        Object obj = null;
        if (i9 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(767204812);
            if ((i & 52) == 0) {
                if ((i & 8) == 0) {
                    i6 = RemoteActionCompatParcelizer + 93;
                    read = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        getpostalcode.read(adjustInstance101);
                        obj.hashCode();
                        throw null;
                    }
                    zIconCompatParcelizer = getpostalcode.read(adjustInstance101);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(adjustInstance101);
                    i2 = RemoteActionCompatParcelizer + 49;
                    read = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        int i10 = 3 % 5;
                    }
                }
                if (zIconCompatParcelizer) {
                    i5 = RemoteActionCompatParcelizer + 107;
                    read = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        i3 = 3;
                    } else {
                        i3 = 4;
                    }
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(767204812);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    i6 = RemoteActionCompatParcelizer + 93;
                    read = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        getpostalcode.read(adjustInstance101);
                        obj.hashCode();
                        throw null;
                    }
                    zIconCompatParcelizer = getpostalcode.read(adjustInstance101);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(adjustInstance101);
                    i2 = RemoteActionCompatParcelizer + 49;
                    read = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        int i11 = 3 % 5;
                    }
                }
                if (zIconCompatParcelizer) {
                    i5 = RemoteActionCompatParcelizer + 107;
                    read = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        i3 = 3;
                    } else {
                        i3 = 4;
                    }
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        }
        if ((i & 48) == 0) {
            int i12 = RemoteActionCompatParcelizer + 13;
            read = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                int i13 = 5 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i7 = 32;
                } else {
                    i7 = 16;
                }
            } else if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i4 |= i7;
        }
        if ((i & 384) == 0) {
            i4 |= getpostalcode.serializer(f) ^ true ? Fields.SpotShadowColor : Fields.RotationX;
        }
        int i14 = i4 | 3072;
        if (!(!getpostalcode.write(i14 & 1, (i14 & 1171) != 1170))) {
            Modifier.Companion companion = Modifier.Companion;
            if ((i14 & 112) == 32) {
                int i15 = RemoteActionCompatParcelizer + 45;
                read = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                z = true;
            } else {
                z = false;
            }
            boolean z2 = (i14 & 14) == 4 || ((i14 & 8) != 0 && getpostalcode.IconCompatParcelizer(adjustInstance101));
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z2 | z) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new OtpNavigationKt$$ExternalSyntheticLambda4(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 26, adjustInstance101);
                getpostalcode.write(objComponentActivity);
            }
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(canReadPlayIds.read(companion, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 63), 0.0f, f, 0.0f, 0.0f, 13);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer, Alignment.Companion.getTop(), getpostalcode, 6);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i17 = read + 89;
            RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 != 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z3 = getpostalcode.ComponentActivity;
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_medium_map_map, getpostalcode, 0);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            IconKt.m116Iconww6aTOc(painterPainterResource, (String) null, (Modifier) null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setEmojiCompatEnabled(), getpostalcode, Painter.$stable | 48, 4);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(companion, Dimensions.setPrimaryBackground)});
            TextKt.m131TextNvy7gAk(adjustInstance101.RemoteActionCompatParcelizer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setEmojiCompatEnabled(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131066);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.AdjustInstance81
                private static int MediaBrowserCompatMediaItem = 0;
                private static int RatingCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    int i18 = 2 % 2;
                    int i19 = RatingCompat + 53;
                    MediaBrowserCompatMediaItem = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    ((Integer) obj3).getClass();
                    FutureShiftInformationColumnKt.m5026ShowOnMapButton942rkJo(adjustInstance101, r8lambdaunavo3sxub_pc9xroryotnrlvsm, f, modifier2, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i21 = RatingCompat + 17;
                    MediaBrowserCompatMediaItem = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    return createfromparcel;
                }
            };
        }
        int i18 = RemoteActionCompatParcelizer + 81;
        read = i18 % Fields.SpotShadowColor;
        if (i18 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final void FutureShiftInformationColumn(AdjustInstance13 adjustInstance13, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        Modifier.Companion companion;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6 = 2 % 2;
        int i7 = RemoteActionCompatParcelizer + 19;
        read = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        t3 t3Var = adjustInstance13.serializer;
        AdjustInstance12 adjustInstance12 = adjustInstance13.RatingCompat;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-255639330);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode2.read(adjustInstance13) : getpostalcode2.IconCompatParcelizer(adjustInstance13) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i9 = read + 81;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                int i11 = RemoteActionCompatParcelizer + 1;
                read = i11 % Fields.SpotShadowColor;
                i5 = i11 % 2 == 0 ? 14150 : Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i2 |= i5;
        }
        int i12 = i2 | 3072;
        if ((i12 & 1171) != 1170) {
            int i13 = RemoteActionCompatParcelizer + 45;
            read = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i12 & 1, z)) {
            int i15 = RemoteActionCompatParcelizer + 27;
            read = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            Modifier.Companion companion2 = Modifier.Companion;
            xb xbVar = (xb) getpostalcode2.write((getNewPassword) t6.IconCompatParcelizer);
            u6 u6Var = (u6) getpostalcode2.write((getNewPassword) t1ExternalSyntheticLambda1.write);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                int i17 = read + 33;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                objComponentActivity = xbVar != null ? y0.read : null;
                getpostalcode2.write(objComponentActivity);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = u6Var != null ? u9.RemoteActionCompatParcelizer : null;
                getpostalcode2.write(objComponentActivity2);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity2;
            Modifier modifierWrite = SizeKt.write(companion2, 1.0f);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierWrite, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).addOnPictureInPictureUiStateChangedListener(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.getSavedStateRegistryControllerannotations));
            float f = Dimensions.setTransitioning;
            Modifier modifierWrite2 = PaddingKt.write(modifierM20backgroundbw27NRU, f);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion3 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion3.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion4.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            TextKt.m131TextNvy7gAk(adjustInstance12.serializer, null, adjustInstance12.write, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, 0, 0, 131066);
            float f2 = Dimensions.setPrimaryBackground;
            TextKt.m131TextNvy7gAk(adjustInstance13.read, PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, f2, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, 0, 0, 131064);
            float f3 = Dimensions.setSplitBackground;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, f3, 0.0f, 0.0f, 13);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer, companion3.getTop(), getpostalcode2, 6);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM74paddingqDBjuR0$default);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion4.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!getpostalcode2.ComponentActivity) {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            } else {
                getpostalcode2.serializer(constructor2);
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion4, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            getpostalcode = getpostalcode2;
            float f4 = f3;
            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_map_location_on, getpostalcode2, 0), (String) null, (Modifier) null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setOnMenuItemClickListener(), getpostalcode2, Painter.$stable | 48, 4);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(companion2, f4)});
            TextKt.m131TextNvy7gAk(adjustInstance13.IconCompatParcelizer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode, 0, 0, 131066);
            getpostalcode.IconCompatParcelizer(true);
            if (t3Var == null) {
                getpostalcode.serializer(666732538);
                getpostalcode.IconCompatParcelizer(false);
                f4 = f4;
                i3 = i12;
                companion = companion2;
            } else {
                getpostalcode.serializer(666732539);
                if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry != null) {
                    getpostalcode.serializer(235581699);
                    companion = companion2;
                    Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion, 1.0f), 0.0f, f4, 0.0f, 0.0f, 13);
                    supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(Arrangement.read, companion3.getCenterVertically(), getpostalcode, 54);
                    int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default2);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion4.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (!getpostalcode.ComponentActivity) {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        i4 = 2;
                    } else {
                        int i19 = RemoteActionCompatParcelizer + 39;
                        read = i19 % Fields.SpotShadowColor;
                        i4 = 2;
                        int i20 = i19 % 2;
                        getpostalcode.serializer(constructor3);
                    }
                    int i21 = RemoteActionCompatParcelizer + 43;
                    read = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % i4;
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion4, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                    Modifier modifierM74paddingqDBjuR0$default3 = PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, 0.0f, f, 0.0f, 11);
                    ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion3.getStart(), getpostalcode, 0);
                    int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default3);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion4.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor4);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion4, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(t3Var, getpostalcode, 48);
                    getpostalcode.IconCompatParcelizer(true);
                    if (adjustInstance13.RemoteActionCompatParcelizer.equals(Boolean.TRUE)) {
                        getpostalcode.serializer(317345922);
                        if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 == null) {
                            getpostalcode.serializer(1247788991);
                            z2 = false;
                            getpostalcode.IconCompatParcelizer(false);
                            f4 = f4;
                            i3 = i12;
                        } else {
                            getpostalcode.serializer(317345922);
                            i3 = i12;
                            boolean z4 = (i3 & 14) == 4 || ((i3 & 8) != 0 && getpostalcode.IconCompatParcelizer(adjustInstance13));
                            boolean z5 = (i3 & 896) == 256;
                            Object objComponentActivity3 = getpostalcode.ComponentActivity();
                            if ((z5 | z4) || objComponentActivity3 == androidContentCaptureManager) {
                                objComponentActivity3 = new OtpNavigationKt$$ExternalSyntheticLambda4(adjustInstance13, 25, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                                getpostalcode.write(objComponentActivity3);
                            }
                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, getpostalcode, 48);
                            z2 = false;
                            getpostalcode.IconCompatParcelizer(false);
                        }
                        getpostalcode.IconCompatParcelizer(z2);
                    } else {
                        f4 = f4;
                        i3 = i12;
                        z2 = false;
                        getpostalcode.serializer(1247953044);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(z2);
                } else {
                    f4 = f4;
                    i3 = i12;
                    companion = companion2;
                    z2 = false;
                    getpostalcode.serializer(236287507);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(z2);
            }
            if (t3Var == null || r8lambdafjq9b8d5osr_i2bajdxqnw6rnry == null) {
                z3 = false;
            } else {
                int i23 = RemoteActionCompatParcelizer + 93;
                read = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                z3 = true;
            }
            AdjustInstance101 adjustInstance101 = adjustInstance13.MediaDescriptionCompat;
            if (adjustInstance101 == null) {
                getpostalcode.serializer(667665917);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(667665918);
                m5026ShowOnMapButton942rkJo(adjustInstance101, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z3 ? f4 : f2, null, getpostalcode, i3 & 112);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i25 = RemoteActionCompatParcelizer + 93;
            read = i25 % Fields.SpotShadowColor;
            int i26 = i25 % 2;
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7((Object) adjustInstance13, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier2, i, 18);
        }
    }
}
