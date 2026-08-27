package com.roadrunner.rider.recruitment.accountcreation.email_and_phone.presentation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b1$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.forms.PhonePrefixCardKt;
import com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.applyTo;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getBoolean;
import o.getCenterHorizontally;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeGlobalCallbackParametersI;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;
import o.trigger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EmailAndPhoneScreenKt {
    private static int serializer = 1;
    private static int write;

    public static final void IconCompatParcelizer(final getBoolean getboolean, final String str, Modifier modifier, final boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final boolean z2, final String str2, final String str3, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean zIconCompatParcelizer;
        int i7 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1559736748);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i8 = write + 23;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                zIconCompatParcelizer = getpostalcode.read(getboolean);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getboolean);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(str) ? 32 : 16;
        }
        int i10 = i2 | 384;
        Object obj = null;
        if ((i & 3072) == 0) {
            int i11 = write + 35;
            serializer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                getpostalcode.write(z);
                throw null;
            }
            i10 |= getpostalcode.write(z) ^ true ? Fields.RotationZ : Fields.CameraDistance;
        }
        int i12 = i10 | 24576;
        if ((196608 & i) == 0) {
            if (getpostalcode.write(z2)) {
                int i13 = serializer + 33;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i6 = Fields.RenderEffect;
            } else {
                i6 = 65536;
            }
            i12 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (getpostalcode.read(str2)) {
                int i15 = write + 111;
                serializer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i5 = 1048576;
            } else {
                i5 = Fields.BlendMode;
            }
            i12 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (getpostalcode.read(str3)) {
                int i17 = write + 113;
                serializer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    throw null;
                }
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i12 |= i4;
            int i18 = serializer + 77;
            write = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
        }
        if ((100663296 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i20 = write + 77;
                serializer = i20 % Fields.SpotShadowColor;
                if (i20 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i12 |= i3;
        }
        if (getpostalcode.write(i12 & 1, (38347923 & i12) != 38347922)) {
            final Modifier.Companion companion = Modifier.Companion;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new NafathLogger$$ExternalSyntheticLambda0(21);
                getpostalcode.write(objComponentActivity);
            }
            final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
            AndroidContentCaptureManagerCompanion.read(CompositionLocalsKt.getLocalLayoutDirection().write(LayoutDirection.Ltr), ExtrasKt.write(2068157676, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.removeGlobalPartnerParameters
                private static int MediaMetadataCompat = 0;
                private static int PlaybackStateCompatCustomAction = 1;

                /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
                /* JADX WARN: Code duplicated, block: B:8:0x0025  */
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    boolean z3;
                    int i21 = 2 % 2;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 3) != 2) {
                        int i22 = MediaMetadataCompat + 111;
                        PlaybackStateCompatCustomAction = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i22 % 2 == 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                    } else {
                        z3 = false;
                    }
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (!(!getpostalcode2.write(iIntValue & 1, z3))) {
                        int i23 = MediaMetadataCompat + 37;
                        PlaybackStateCompatCustomAction = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i24 = i23 % 2;
                        androidx.compose.ui.Modifier modifierIconCompatParcelizer = androidx.compose.foundation.layout.SizeKt.IconCompatParcelizer(companion, null, 3);
                        expand expandVar = expand.Min;
                        androidx.compose.ui.Modifier modifierHeight = androidx.compose.foundation.layout.IntrinsicKt.height(modifierIconCompatParcelizer, expandVar);
                        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem, androidx.compose.ui.Alignment.Companion.getTop(), getpostalcode2, 0);
                        int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                        androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode2, modifierHeight);
                        androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                        if (getpostalcode2.read == null) {
                            SentryUUID.write();
                            throw null;
                        }
                        int i25 = PlaybackStateCompatCustomAction + 103;
                        MediaMetadataCompat = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i26 = i25 % 2;
                        getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode2.ComponentActivity) {
                            getpostalcode2.serializer(constructor);
                        } else {
                            getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                        String str4 = str;
                        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                        if (str4 == null) {
                            int i27 = MediaMetadataCompat + 17;
                            PlaybackStateCompatCustomAction = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i28 = i27 % 2;
                            getpostalcode2.serializer(1376310269);
                            getpostalcode2.IconCompatParcelizer(false);
                        } else {
                            getpostalcode2.serializer(1376310270);
                            androidx.compose.ui.Modifier modifierRemoteActionCompatParcelizer = androidx.compose.ui.Modifier.Companion;
                            androidx.compose.ui.Modifier modifierHeight2 = androidx.compose.foundation.layout.IntrinsicKt.height(androidx.compose.foundation.layout.SizeKt.IconCompatParcelizer(androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(modifierRemoteActionCompatParcelizer, 0.0f, 0.0f, Dimensions.setTabContainer, 0.0f, 11), null, 3), expandVar);
                            boolean z4 = z;
                            if (z4) {
                                getpostalcode2.serializer(-2125561371);
                                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                                boolean z5 = getpostalcode2.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                                Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                                if (z5) {
                                    objComponentActivity2 = new b1$$ExternalSyntheticLambda0(27, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                                    getpostalcode2.write(objComponentActivity2);
                                } else {
                                    int i29 = PlaybackStateCompatCustomAction + 125;
                                    MediaMetadataCompat = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i30 = i29 % 2;
                                    if (objComponentActivity2 == androidContentCaptureManager) {
                                        objComponentActivity2 = new b1$$ExternalSyntheticLambda0(27, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                                        getpostalcode2.write(objComponentActivity2);
                                    }
                                }
                                modifierRemoteActionCompatParcelizer = androidx.compose.foundation.ClickableKt.RemoteActionCompatParcelizer(modifierRemoteActionCompatParcelizer, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, 15);
                            } else {
                                getpostalcode2.serializer(-2125560210);
                            }
                            getpostalcode2.IconCompatParcelizer(false);
                            PhonePrefixCardKt.PhonePrefixCard(str4, modifierHeight2.then(modifierRemoteActionCompatParcelizer), z4, getpostalcode2, 0, 0);
                            getpostalcode2.IconCompatParcelizer(false);
                        }
                        getBoolean getboolean2 = getboolean;
                        String strWrite = getboolean2.write();
                        String str5 = getboolean2.IconCompatParcelizer;
                        getCenterHorizontally getcenterhorizontally = new getCenterHorizontally(getboolean2.MediaSessionCompatQueueItem, 0, 123);
                        boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(getboolean2);
                        Object objComponentActivity3 = getpostalcode2.ComponentActivity();
                        if (zIconCompatParcelizer2 || objComponentActivity3 == androidContentCaptureManager) {
                            objComponentActivity3 = new d0ExternalSyntheticLambda0(getboolean2, 2);
                            getpostalcode2.write(objComponentActivity3);
                        }
                        TextInputBigV2Kt.TextInputBigV2(strWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, null, false, null, str5, null, null, z2, str2, null, true, 0, getcenterhorizontally, null, null, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, str3, null, getpostalcode2, 0, 3072, 0, 5198780);
                        getpostalcode2.IconCompatParcelizer(true);
                    } else {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, 56);
            int i21 = write + 95;
            serializer = i21 % Fields.SpotShadowColor;
            int i22 = i21 % 2;
            modifier2 = companion;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new applyTo(getboolean, str, modifier2, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, z2, str2, str3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    public static final void EmailAndPhoneContent(removeGlobalCallbackParametersI removeglobalcallbackparametersi, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        removeglobalcallbackparametersi.getClass();
        getBoolean getboolean = removeglobalcallbackparametersi.MediaSessionCompatResultReceiverWrapper;
        getBoolean getboolean2 = removeglobalcallbackparametersi.MediaBrowserCompatMediaItem;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2046730417);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(removeglobalcallbackparametersi) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i6 = write + 15;
            serializer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                getpostalcode.read(modifier);
                throw null;
            }
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i7 = write + 69;
            serializer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 66 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                    i4 = Fields.Clip;
                } else {
                    i4 = 8192;
                }
            } else if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                i4 = Fields.Clip;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3)) {
                int i9 = write + 71;
                serializer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                i3 = Fields.RenderEffect;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        int i10 = i2;
        if ((i10 & 74899) != 74898) {
            z = true;
        } else {
            int i11 = serializer + 7;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = false;
        }
        if (getpostalcode.write(i10 & 1, z)) {
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier.then(SizeKt.read), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
                int i13 = serializer + 35;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i15 = write + 55;
                serializer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    int i16 = 3 % 5;
                }
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            HeaderKt.RemoteActionCompatParcelizer(null, null, 0L, ExtrasKt.write(-1986197320, new trigger(11, r8lambdardpfsr94j4iebcwx_kpqzpm8k2), getpostalcode), null, null, getpostalcode, 24576, 111);
            Modifier.Companion companion3 = Modifier.Companion;
            float f = Dimensions.getAnimatedVisibility;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion3, f, f, f, 0.0f, 8);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i17 = write + 49;
                serializer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            TextKt.m132TextZ58ophY(removeglobalcallbackparametersi.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, null, 0L, 0L, FontWeight.Companion.getBlack(), 0L, null, 0L, 0, false, 0, 0, null, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 1572864, 0, 262078);
            float f2 = Dimensions.setSplitBackground;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f2)});
            TextKt.m131TextNvy7gAk(removeglobalcallbackparametersi.ResultReceiver, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131070);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f)});
            if (removeglobalcallbackparametersi.ParcelableVolumeInfo) {
                getpostalcode.serializer(82184503);
                Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, Dimensions.setTabContainer, 7);
                String str = getboolean2.IconCompatParcelizer;
                String strWrite = getboolean2.write();
                String str2 = (String) getboolean2.serializer.getValue();
                boolean zRemoteActionCompatParcelizer = getboolean2.RemoteActionCompatParcelizer();
                getCenterHorizontally getcenterhorizontally = new getCenterHorizontally(KeyboardType.Companion.m3317getEmailPjHm6EE(), 0, 123);
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(removeglobalcallbackparametersi);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new TncContentKt$$ExternalSyntheticLambda2(11, removeglobalcallbackparametersi);
                    getpostalcode.write(objComponentActivity);
                }
                boolean z3 = !zRemoteActionCompatParcelizer;
                z2 = true;
                TextInputBigV2Kt.TextInputBigV2(strWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifierM74paddingqDBjuR0$default2, false, null, str, null, null, z3, str2, null, true, 0, getcenterhorizontally, null, null, null, "EMAIL_AND_PHONE_EMAIL_INPUT_FIELD_TEST_TAG", null, getpostalcode, 0, 199680, 48, 6247352);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                z2 = true;
                getpostalcode.serializer(82890311);
                getpostalcode.IconCompatParcelizer(false);
            }
            IconCompatParcelizer(getboolean, removeglobalcallbackparametersi.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, null, removeglobalcallbackparametersi.MediaSessionCompatToken, null, !getboolean.RemoteActionCompatParcelizer(), (String) getboolean.serializer.getValue(), "EMAIL_AND_PHONE_PHONE_INPUT_FIELD_TEST_TAG", r8lambdardpfsr94j4iebcwx_kpqzpm8k3, getpostalcode, ((i10 << 9) & 234881024) | 12582920);
            getpostalcode.IconCompatParcelizer(z2);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, companion3.then(new show(1.0f, z2))});
            Modifier modifierM74paddingqDBjuR0$default3 = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion3, 1.0f), f, 0.0f, f, f, 2);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer3 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default3);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i19 = write + 105;
                serializer = i19 % Fields.SpotShadowColor;
                if (i19 % 2 == 0) {
                    getpostalcode.serializer(constructor3);
                    throw null;
                }
                getpostalcode.serializer(constructor3);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
            Modifier modifierWrite = SizeKt.write(companion3, 1.0f);
            modifierWrite.getClass();
            PrimaryKt.write(removeglobalcallbackparametersi.IconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierWrite, ((Boolean) removeglobalcallbackparametersi.RatingCompat.getValue()).booleanValue(), false, null, null, null, null, null, getpostalcode, ((i10 >> 3) & 112) | 384, 0, 2032);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, Dimensions.setTabContainer)});
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.IconCompatParcelizer;
            Modifier modifierWrite2 = SizeKt.write(companion3, 1.0f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(arrangement$Center$1, companion.getCenterVertically(), getpostalcode, 54);
            int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor4);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
            TextKt.m131TextNvy7gAk(removeglobalcallbackparametersi.MediaMetadataCompat, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131070);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion3, f2)});
            TertiaryKt.IconCompatParcelizer(removeglobalcallbackparametersi.MediaDescriptionCompat, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, companion3, false, 0, null, null, null, getpostalcode, ((i10 >> 6) & 112) | 384, 248);
            af$$ExternalSyntheticOutline0.m(getpostalcode, z2, z2, z2);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY(removeglobalcallbackparametersi, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, i);
        }
    }
}
