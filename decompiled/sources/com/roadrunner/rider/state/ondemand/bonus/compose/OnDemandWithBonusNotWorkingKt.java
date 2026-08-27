package com.roadrunner.rider.state.ondemand.bonus.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.login.presentation.otp.OtpNavigationKt$$ExternalSyntheticLambda4;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.message.BannerMessageKt;
import io.sentry.SentryUUID;
import o.AdjustReferrerReceiver;
import o.AdjustRemoteTrigger;
import o.AdjustSessionFailure;
import o.AdjustThirdPartySharing;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.UiMediaScopeImpl;
import o.accessisMainThread;
import o.buildMapping;
import o.enableBridgeSecurity;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getVerificationStatus;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;
import o.t3;
import o.ua;
import o.xb;
import o.y0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OnDemandWithBonusNotWorkingKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:131:0x039c  */
    /* JADX WARN: Code duplicated, block: B:13:0x004f  */
    /* JADX WARN: Code duplicated, block: B:151:0x0409  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    public static final void OnDemandWithBonusNotWorkingColumn(final AdjustThirdPartySharing adjustThirdPartySharing, xb xbVar, accessisMainThread accessismainthread, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        float f;
        AndroidContentCaptureManager androidContentCaptureManager;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        boolean zIconCompatParcelizer;
        int i6;
        int i7 = 2 % 2;
        t3 t3Var = adjustThirdPartySharing.write;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-280474568);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(adjustThirdPartySharing);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(adjustThirdPartySharing);
            }
            if (zIconCompatParcelizer) {
                int i8 = IconCompatParcelizer + 115;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    i6 = 2;
                } else {
                    i6 = 4;
                }
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = RemoteActionCompatParcelizer + 125;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                if (getpostalcode2.IconCompatParcelizer(xbVar)) {
                    i5 = 32;
                } else {
                    i5 = 16;
                }
            } else {
                int i10 = 20 / 0;
                if (getpostalcode2.IconCompatParcelizer(xbVar)) {
                    i5 = 32;
                } else {
                    i5 = 16;
                }
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.IconCompatParcelizer(accessismainthread)) {
                int i11 = IconCompatParcelizer + 119;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                i4 = i11 % 2 == 0 ? 31210 : Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= !getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 8192 : Fields.Clip;
        }
        Object obj = null;
        if ((196608 & i) == 0) {
            int i12 = IconCompatParcelizer + 101;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.RenderEffect : 65536;
            } else {
                getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                throw null;
            }
        }
        if ((1572864 & i) == 0) {
            int i13 = RemoteActionCompatParcelizer + 33;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                i2 |= getpostalcode2.read(modifier) ? 1048576 : Fields.BlendMode;
            } else {
                getpostalcode2.read(modifier);
                obj.hashCode();
                throw null;
            }
        }
        int i14 = i2;
        if (getpostalcode2.write(i14 & 1, (599187 & i14) != 599186)) {
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager2) {
                int i15 = IconCompatParcelizer + 113;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                objComponentActivity = y0.read;
                getpostalcode2.write(objComponentActivity);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager2) {
                objComponentActivity2 = ua.IconCompatParcelizer;
                getpostalcode2.write(objComponentActivity2);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity2;
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            float f2 = Dimensions.setTabContainer;
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifierWrite, f2, f2);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                String str = adjustThirdPartySharing.PlaybackStateCompat;
                TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, 0, 0, 131066);
                Modifier.Companion companion3 = Modifier.Companion;
                float f3 = Dimensions.setSplitBackground;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(companion3, f3)});
                if (adjustThirdPartySharing.serializer) {
                    getpostalcode2.serializer(-2089168539);
                    Modifier modifierWrite2 = SizeKt.write(companion3, 1.0f);
                    supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.read, companion.getBottom(), getpostalcode2, 54);
                    int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite2);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                    getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode2.ComponentActivity) {
                        getpostalcode2.serializer(constructor2);
                    } else {
                        getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
                    if (t3Var == null) {
                        getpostalcode2.serializer(60122460);
                    } else {
                        getpostalcode2.serializer(60122461);
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(t3.write(t3Var), getpostalcode2, 48);
                    }
                    getpostalcode2.IconCompatParcelizer(false);
                    getpostalcode2.IconCompatParcelizer(true);
                    getpostalcode2.IconCompatParcelizer(false);
                    androidContentCaptureManager = androidContentCaptureManager2;
                    getpostalcode = getpostalcode2;
                    f = 1.0f;
                    i3 = 4;
                } else {
                    getpostalcode2.serializer(-2088839288);
                    Modifier modifierWrite3 = SizeKt.write(companion3, 1.0f);
                    supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion.getCenterVertically(), getpostalcode2, 48);
                    int iHashCode3 = Long.hashCode(getpostalcode2.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode2.serializer();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite3);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
                    getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode2.ComponentActivity) {
                        getpostalcode2.serializer(constructor3);
                    } else {
                        getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode3), getpostalcode2));
                    if (t3Var == null) {
                        getpostalcode2.serializer(-1849776780);
                        getpostalcode2.IconCompatParcelizer(false);
                    } else {
                        getpostalcode2.serializer(-1849776779);
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(t3.write(t3Var), getpostalcode2, 48);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(companion3, f3)});
                        getpostalcode2.IconCompatParcelizer(false);
                    }
                    getpostalcode = getpostalcode2;
                    f = 1.0f;
                    TextKt.m131TextNvy7gAk(adjustThirdPartySharing.MediaMetadataCompat, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode, 0, 0, 131066);
                    if (adjustThirdPartySharing.RemoteActionCompatParcelizer) {
                        getpostalcode.serializer(-1849395014);
                        boolean z5 = !((458752 & i14) != 131072);
                        i3 = 4;
                        if ((i14 & 14) != 4) {
                            if ((i14 & 8) != 0) {
                                int i17 = RemoteActionCompatParcelizer + 9;
                                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                                if (i17 % 2 == 0) {
                                    if (getpostalcode.IconCompatParcelizer(adjustThirdPartySharing)) {
                                    }
                                } else {
                                    int i18 = 57 / 0;
                                    z2 = getpostalcode.IconCompatParcelizer(adjustThirdPartySharing);
                                }
                            }
                        }
                        Object objComponentActivity3 = getpostalcode.ComponentActivity();
                        if (!z2 && !z5) {
                            int i19 = RemoteActionCompatParcelizer + 123;
                            IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                            int i20 = i19 % 2;
                            androidContentCaptureManager = androidContentCaptureManager2;
                            if (objComponentActivity3 == androidContentCaptureManager) {
                            }
                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, getpostalcode, 48);
                            z = false;
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            androidContentCaptureManager = androidContentCaptureManager2;
                        }
                        objComponentActivity3 = new OtpNavigationKt$$ExternalSyntheticLambda4(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 28, adjustThirdPartySharing);
                        getpostalcode.write(objComponentActivity3);
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, getpostalcode, 48);
                        z = false;
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        androidContentCaptureManager = androidContentCaptureManager2;
                        z = false;
                        i3 = 4;
                        getpostalcode.serializer(-1849285460);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(z);
                }
                AdjustRemoteTrigger adjustRemoteTrigger = adjustThirdPartySharing.read;
                if (adjustRemoteTrigger instanceof getVerificationStatus) {
                    getpostalcode.serializer(-1591376973);
                    String str2 = adjustThirdPartySharing.IconCompatParcelizer;
                    if ((i14 & 7168) == 2048) {
                        int i21 = IconCompatParcelizer + 35;
                        RemoteActionCompatParcelizer = i21 % Fields.SpotShadowColor;
                        if (i21 % 2 == 0) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                    } else {
                        z4 = false;
                    }
                    boolean z6 = (i14 & 14) == i3 || ((i14 & 8) != 0 && getpostalcode.IconCompatParcelizer(adjustThirdPartySharing));
                    Object objComponentActivity4 = getpostalcode.ComponentActivity();
                    if ((z4 | z6) || objComponentActivity4 == androidContentCaptureManager) {
                        final int i22 = 0;
                        objComponentActivity4 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.pauseSending
                            private static int RemoteActionCompatParcelizer = 0;
                            private static int serializer = 1;

                            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                            public final Object invoke() {
                                int i23 = 2 % 2;
                                int i24 = serializer + 67;
                                RemoteActionCompatParcelizer = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i25 = i24 % 2;
                                int i26 = i22;
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                AdjustThirdPartySharing adjustThirdPartySharing2 = adjustThirdPartySharing;
                                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                                if (i26 == 0) {
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(Integer.valueOf(adjustThirdPartySharing2.PlaybackStateCompatCustomAction));
                                    return createfromparcel;
                                }
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(Integer.valueOf(adjustThirdPartySharing2.PlaybackStateCompatCustomAction));
                                int i27 = serializer + 81;
                                RemoteActionCompatParcelizer = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i27 % 2 == 0) {
                                    return createfromparcel;
                                }
                                throw null;
                            }
                        };
                        getpostalcode.write(objComponentActivity4);
                    }
                    PrimaryKt.write(str2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion3, f), 0.0f, f2, 0.0f, 0.0f, 13), false, false, null, null, null, null, null, getpostalcode, 0, 0, 2040);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    if (adjustRemoteTrigger instanceof AdjustSessionFailure) {
                        getpostalcode.serializer(-1591366753);
                        BannerMessageKt.m5059BannerMessageError1xFH4wI(PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion3, f), 0.0f, f2, 0.0f, 0.0f, 13), null, null, adjustThirdPartySharing.RatingCompat, null, null, null, 0L, null, 0L, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), 0L, 0L, getpostalcode, 0, 0, 28654);
                        getpostalcode.IconCompatParcelizer(false);
                    } else if (adjustRemoteTrigger instanceof AdjustReferrerReceiver) {
                        getpostalcode.serializer(-1591355829);
                        Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion3, f), 0.0f, f2, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).enterPictureInPictureMode(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss));
                        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
                        int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion2.getConstructor();
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            int i23 = RemoteActionCompatParcelizer + 95;
                            IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                            if (i23 % 2 == 0) {
                                getpostalcode.serializer(constructor4);
                            } else {
                                getpostalcode.serializer(constructor4);
                                obj.hashCode();
                                throw null;
                            }
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
                        BannerMessageKt.IconCompatParcelizer(SizeKt.write(companion3, f), (ImageVector) null, adjustThirdPartySharing.MediaDescriptionCompat, (String) null, (AnnotatedString) null, (String) null, (enableBridgeSecurity) null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) null, getpostalcode, 6, 502);
                        String str3 = adjustThirdPartySharing.MediaSessionCompatQueueItem;
                        boolean z7 = (57344 & i14) == 16384;
                        boolean z8 = (i14 & 14) == i3 || ((i14 & 8) != 0 && getpostalcode.IconCompatParcelizer(adjustThirdPartySharing));
                        Object objComponentActivity5 = getpostalcode.ComponentActivity();
                        if ((z7 | z8) || objComponentActivity5 == androidContentCaptureManager) {
                            final int i24 = 1;
                            objComponentActivity5 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.pauseSending
                                private static int RemoteActionCompatParcelizer = 0;
                                private static int serializer = 1;

                                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                                public final Object invoke() {
                                    int i25 = 2 % 2;
                                    int i26 = serializer + 67;
                                    RemoteActionCompatParcelizer = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i27 = i26 % 2;
                                    int i28 = i24;
                                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                    AdjustThirdPartySharing adjustThirdPartySharing2 = adjustThirdPartySharing;
                                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                                    if (i28 == 0) {
                                        r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(Integer.valueOf(adjustThirdPartySharing2.PlaybackStateCompatCustomAction));
                                        return createfromparcel;
                                    }
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(Integer.valueOf(adjustThirdPartySharing2.PlaybackStateCompatCustomAction));
                                    int i29 = serializer + 81;
                                    RemoteActionCompatParcelizer = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i29 % 2 == 0) {
                                        return createfromparcel;
                                    }
                                    throw null;
                                }
                            };
                            getpostalcode.write(objComponentActivity5);
                        }
                        PrimaryKt.write(str3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5, SizeKt.write(companion3, f), false, false, null, null, null, null, null, getpostalcode, 384, 0, 2040);
                        z3 = true;
                        getpostalcode.IconCompatParcelizer(true);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1591378511, false);
                    }
                    getpostalcode.IconCompatParcelizer(z3);
                }
                z3 = true;
                getpostalcode.IconCompatParcelizer(z3);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScopeImpl(adjustThirdPartySharing, xbVar, accessismainthread, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier, i);
        }
    }
}
