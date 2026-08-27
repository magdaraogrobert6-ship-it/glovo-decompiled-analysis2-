package com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.compose;

import android.content.Context;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda3;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.pcn;
import com.roadrunner.delivery.pickupdropoff.tasks.model.SignatureTaskUiItem$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.compose.SignatureContentKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.LinearGradientShaderVjE6UOUdefault;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShaderKt;
import o.TextFieldDefaults;
import o.TooltipKtTooltipBoxwrappedContent1;
import o.Wallpapers;
import o.accessgetMorphcp;
import o.buildMapping;
import o.computeDirection;
import o.containsgyyYBs;
import o.generateLoremIpsum;
import o.generateLoremIpsumlambda0;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCenternOccac;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;
import o.setTransformQ8lPUPs;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;
import o.wrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SignatureContentKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void Signature(final SignatureTaskUiModelImpl signatureTaskUiModelImpl, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        final Modifier modifier2;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i3;
        int i4;
        int i5 = 2 % 2;
        signatureTaskUiModelImpl.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1599543831);
        if ((i & 6) == 0) {
            int i6 = serializer + 17;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (getpostalcode.read(signatureTaskUiModelImpl)) {
                int i8 = serializer + 11;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i10 = serializer + 35;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                i3 = i10 % 2 != 0 ? 71 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            int i11 = serializer + 63;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i12 = i2 | 3072;
        if (getpostalcode.write(i12 & 1, (i12 & 1171) != 1170)) {
            int i13 = IconCompatParcelizer + 99;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            final Modifier.Companion companion = Modifier.Companion;
            getCenternOccac getcenternoccac = (getCenternOccac) ExtrasKt.write(signatureTaskUiModelImpl.PlaybackStateCompatCustomAction, getpostalcode, 0).getValue();
            if (getcenternoccac instanceof containsgyyYBs) {
                getpostalcode.serializer(-436659243);
                wrapper wrapperVar = ((containsgyyYBs) getcenternoccac).RemoteActionCompatParcelizer;
                SignatureTaskUiItem$Companion signatureTaskUiItem$Companion = wrapper.Companion;
                SignatureContent(wrapperVar, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, companion, getpostalcode, i12 & 8176);
                getpostalcode.IconCompatParcelizer(false);
                int i15 = IconCompatParcelizer + 75;
                serializer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                modifier2 = companion;
            } else {
                getpostalcode.serializer(-651334011);
                getpostalcode.IconCompatParcelizer(false);
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat == null) {
                    return;
                }
                final int i17 = 0;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.IntRectKt
                    private static int MediaMetadataCompat = 1;
                    private static int MediaSessionCompatQueueItem;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj2, Object obj3) {
                        int i18 = 2 % 2;
                        int i19 = MediaSessionCompatQueueItem + 77;
                        MediaMetadataCompat = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i20 = i19 % 2;
                        int i21 = i17;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i22 = i;
                        if (i21 == 0) {
                            ((Integer) obj3).getClass();
                            SignatureContentKt.Signature(signatureTaskUiModelImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, companion, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i22 | 1));
                            return createfromparcel;
                        }
                        ((Integer) obj3).getClass();
                        SignatureContentKt.Signature(signatureTaskUiModelImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, companion, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i22 | 1));
                        int i23 = MediaSessionCompatQueueItem + 19;
                        MediaMetadataCompat = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i23 % 2 == 0) {
                            int i24 = 18 / 0;
                        }
                        return createfromparcel;
                    }
                };
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        modifier2 = modifier;
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i18 = 1;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.IntRectKt
                private static int MediaMetadataCompat = 1;
                private static int MediaSessionCompatQueueItem;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    int i19 = 2 % 2;
                    int i110 = MediaSessionCompatQueueItem + 77;
                    MediaMetadataCompat = i110 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i20 = i110 % 2;
                    int i21 = i18;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i22 = i;
                    if (i21 == 0) {
                        ((Integer) obj3).getClass();
                        SignatureContentKt.Signature(signatureTaskUiModelImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier2, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i22 | 1));
                        return createfromparcel;
                    }
                    ((Integer) obj3).getClass();
                    SignatureContentKt.Signature(signatureTaskUiModelImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier2, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i22 | 1));
                    int i23 = MediaSessionCompatQueueItem + 19;
                    MediaMetadataCompat = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i23 % 2 == 0) {
                        int i24 = 18 / 0;
                    }
                    return createfromparcel;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e1  */
    public static final void SignatureContent(wrapper wrapperVar, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        boolean z2;
        String str;
        String str2;
        int i3;
        boolean zIconCompatParcelizer;
        int i4;
        int i5 = 2 % 2;
        int i6 = serializer + 65;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1972937652);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            int i8 = serializer + 3;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0 ? (i & 8) == 0 : (i & 68) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(wrapperVar);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(wrapperVar);
            }
            if (zIconCompatParcelizer) {
                int i9 = serializer + 115;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i11 = IconCompatParcelizer + 7;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i13 = serializer + 47;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 256 : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i15 = i2;
        if (getpostalcode2.write(i15 & 1, (i15 & 1171) != 1170)) {
            int i16 = i15 & 14;
            if (i16 != 4) {
                int i17 = serializer + 85;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                if ((i15 & 8) == 0 || !getpostalcode2.IconCompatParcelizer(wrapperVar)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            boolean z3 = (i15 & 112) == 32;
            if ((i15 & 896) == 256) {
                int i19 = IconCompatParcelizer + 59;
                serializer = i19 % Fields.SpotShadowColor;
                if (i19 % 2 == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z | z3 | z2) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new n$$ExternalSyntheticLambda3(wrapperVar, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 23);
                getpostalcode2.write(objComponentActivity);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity;
            Modifier modifierWrite = AnimationModifierKt.write(SizeKt.write(modifier, 1.0f), null, 3);
            modifierWrite.getClass();
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
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
                Arrangement$Center$1 arrangement$Center$1 = Arrangement.read;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierWrite2 = SizeKt.write(companion3, 1.0f);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(arrangement$Center$1, centerVertically, getpostalcode2, 54);
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
                String str3 = wrapperVar.title;
                String str4 = wrapperVar.requiredText;
                Wallpapers wallpapers = wrapperVar.state;
                TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
                double d = 1.0f;
                if (d <= 0.0d) {
                    TooltipKtTooltipBoxwrappedContent1.read("invalid weight; must be greater than zero");
                }
                Modifier modifierThen = companion3.then(new show(1.0f, false));
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                TextKt.m131TextNvy7gAk(str3, modifierThen, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setOverlayMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, 0, 0, 131064);
                boolean z4 = wallpapers instanceof generateLoremIpsum;
                if (z4) {
                    str = wrapperVar.actionTitleDelete;
                    int i20 = IconCompatParcelizer + 43;
                    serializer = i20 % Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                } else {
                    str = wrapperVar.actionTitle;
                }
                float f = Dimensions.setActionBarVisibilityCallback;
                Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion3, f, 0.0f, 0.0f, 0.0f, 14);
                modifierM74paddingqDBjuR0$default.getClass();
                TertiaryKt.IconCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierM74paddingqDBjuR0$default, false, 0, null, null, null, getpostalcode2, 0, 248);
                getpostalcode2.IconCompatParcelizer(true);
                float f2 = Dimensions.getActionBarHideOffset;
                Modifier modifierM = af$$ExternalSyntheticOutline1.m(companion3, f2, getpostalcode2, companion3, 1.0f);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(arrangement$Center$1, companion.getTop(), getpostalcode2, 6);
                int iHashCode3 = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor3);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode3), getpostalcode2));
                if (d <= 0.0d) {
                    TooltipKtTooltipBoxwrappedContent1.read("invalid weight; must be greater than zero");
                }
                boolean z5 = false;
                Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(companion3.then(new show(1.0f, false)), 0.0f, 0.0f, f, 0.0f, 11);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
                int iHashCode4 = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM74paddingqDBjuR0$default2);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion2.getConstructor();
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!(!getpostalcode2.ComponentActivity)) {
                    getpostalcode2.serializer(constructor4);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode4), getpostalcode2));
                TextKt.m131TextNvy7gAk(wrapperVar.description, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getActionBarHideOffset(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.PlaybackStateCompatCustomAction(), getpostalcode2, 0, 0, 131066);
                if (str4 != null) {
                    getpostalcode2.serializer(-280889220);
                    getpostalcode = getpostalcode2;
                    TextKt.m131TextNvy7gAk(str4, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setOnMenuItemClickListener(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.PlaybackStateCompatCustomAction(), getpostalcode, 0, 0, 131066);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode = getpostalcode2;
                    getpostalcode.serializer(-280685891);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(true);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion3, f2)});
                float fMo48toPx0680j_4 = ((Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity())).mo48toPx0680j_4(Dimensions.setItemInvoker);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = CompositionKt.RemoteActionCompatParcelizer("");
                    getpostalcode.write(objComponentActivity2);
                }
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity2;
                if (z4) {
                    str2 = ((generateLoremIpsum) wallpapers).thumbnailUri;
                } else {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{wallpapers, generateLoremIpsumlambda0.INSTANCE}, getCieXyz.write())).booleanValue()) {
                        str2 = null;
                    } else if (wallpapers instanceof o.Density) {
                        str2 = ((o.Density) wallpapers).thumbnailUri;
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                }
                setTransformQ8lPUPs settransformq8lpups = new setTransformQ8lPUPs((Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                settransformq8lpups.IconCompatParcelizer = str2;
                LinearGradientShaderVjE6UOUdefault.serializer(settransformq8lpups, new accessgetMorphcp(fMo48toPx0680j_4));
                ShaderKt shaderKtIconCompatParcelizer = settransformq8lpups.IconCompatParcelizer();
                if (i16 == 4 || ((i15 & 8) != 0 && getpostalcode.IconCompatParcelizer(wrapperVar))) {
                    z5 = true;
                }
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (z5 || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new SuspendingWorkUseCase$$ExternalSyntheticLambda0(wrapperVar, 12, populateViewStructure_androidKtpopulate7);
                    getpostalcode.write(objComponentActivity3);
                }
                ImageKt.Image(computeDirection.RemoteActionCompatParcelizer(shaderKtIconCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, null, getpostalcode, 0, 26), (String) populateViewStructure_androidKtpopulate7.getValue(), SizeKt.m78requiredSize3ABfNKs(companion3, Dimensions.getFullyDrawnReporter), null, null, 0.0f, null, getpostalcode, 0, 120);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera((Object) wrapperVar, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier, i, 29);
        }
    }
}
