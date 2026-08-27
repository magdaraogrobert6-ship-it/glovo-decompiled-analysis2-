package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.compose;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.compose.CashPaymentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.forms.DropdownKt;
import com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt;
import io.reactivex.subjects.BehaviorSubject;
import io.sentry.SentryUUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidContentCaptureManagerTranslateStatus;
import o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
import o.AnimatedVisibilityComposeAnimation_androidKt;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.FragmentActivity;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.TextFieldDefaults;
import o.animatedContentSearchlambda0;
import o.buildMapping;
import o.extractAuthorizationHeader;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCenterHorizontally;
import o.getChildTransitionannotations;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.hasRootCause;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isInline;
import o.isValidParameter;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.purchaseVerificationUrlChoices;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaX9oYHljBNKlnwJiwehaYfTB7JCw;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaurFQ1uiZ_ezwuFf5ls30jKUPDSo;
import o.registerAndGetInstance;
import o.setContentSensitive;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;
import o.width;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CashPaymentKt {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:58:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:95:0x0199  */
    public static final void write(final CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z;
        final Modifier modifier2;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        cashPaymentTaskUiModelImpl.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(719186571);
        if ((i & 6) == 0) {
            if (!(!getpostalcode.read(cashPaymentTaskUiModelImpl))) {
                int i7 = serializer + 83;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            int i9 = serializer + 61;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                int i11 = serializer + 57;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i4 = Fields.RenderEffect;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                int i13 = IconCompatParcelizer + 65;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i3 = 1048576;
            } else {
                i3 = Fields.BlendMode;
            }
            i2 |= i3;
        }
        int i15 = i2 | 12582912;
        if ((4793491 & i15) != 4793490) {
            int i16 = IconCompatParcelizer + 61;
            serializer = i16 % Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i15 & 1, z)) {
            modifier2 = Modifier.Companion;
            AnimatedVisibilityComposeAnimation_androidKt animatedVisibilityComposeAnimation_androidKt = (AnimatedVisibilityComposeAnimation_androidKt) ExtrasKt.write(cashPaymentTaskUiModelImpl.MediaSessionCompatToken, getpostalcode, 0).getValue();
            if (animatedVisibilityComposeAnimation_androidKt instanceof getChildTransitionannotations) {
                getpostalcode.serializer(-351418973);
                CashPaymentTaskUiItem cashPaymentTaskUiItem = ((getChildTransitionannotations) animatedVisibilityComposeAnimation_androidKt).serializer;
                boolean z4 = (i15 & 112) == 32;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z4 || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(27, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity);
                    int i17 = IconCompatParcelizer + 79;
                    serializer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
                boolean z5 = (i15 & 896) == 256;
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z5 || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(28, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                    getpostalcode.write(objComponentActivity2);
                    int i19 = serializer + 75;
                    IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2;
                boolean z6 = (i15 & 7168) == 2048;
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (!(!z6) || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(29, r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                    getpostalcode.write(objComponentActivity3);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3;
                boolean z7 = (57344 & i15) == 16384;
                Object objComponentActivity4 = getpostalcode.ComponentActivity();
                if (z7) {
                    objComponentActivity4 = new AndroidContentCaptureManagerTranslateStatus(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 6);
                    getpostalcode.write(objComponentActivity4);
                } else {
                    int i21 = IconCompatParcelizer + 81;
                    serializer = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    if (objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = new AndroidContentCaptureManagerTranslateStatus(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 6);
                        getpostalcode.write(objComponentActivity4);
                    }
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4;
                if ((458752 & i15) == 131072) {
                    int i23 = IconCompatParcelizer + 121;
                    serializer = i23 % Fields.SpotShadowColor;
                    int i24 = i23 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object objComponentActivity5 = getpostalcode.ComponentActivity();
                if (z2 || objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = new FragmentActivity(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, 1);
                    getpostalcode.write(objComponentActivity5);
                }
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity5;
                boolean z8 = (i15 & 3670016) == 1048576;
                Object objComponentActivity6 = getpostalcode.ComponentActivity();
                if (z8) {
                    z3 = false;
                } else {
                    int i25 = IconCompatParcelizer + 47;
                    serializer = i25 % Fields.SpotShadowColor;
                    if (i25 % 2 != 0) {
                        z3 = false;
                        int i26 = 23 / 0;
                        if (objComponentActivity6 == androidContentCaptureManager) {
                        }
                    } else {
                        z3 = false;
                        if (objComponentActivity6 == androidContentCaptureManager) {
                        }
                    }
                    CashPaymentTaskUiItem.Companion companion = CashPaymentTaskUiItem.Companion;
                    RemoteActionCompatParcelizer(cashPaymentTaskUiItem, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaunavo3sxub_pc9xroryotnrlvsm5, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity6, modifier2, getpostalcode, (29360128 & i15) | 8, 0);
                    getpostalcode.IconCompatParcelizer(z3);
                }
                objComponentActivity6 = new AndroidContentCaptureManagerTranslateStatus(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 7);
                getpostalcode.write(objComponentActivity6);
                CashPaymentTaskUiItem.Companion companion2 = CashPaymentTaskUiItem.Companion;
                RemoteActionCompatParcelizer(cashPaymentTaskUiItem, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaunavo3sxub_pc9xroryotnrlvsm5, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity6, modifier2, getpostalcode, (29360128 & i15) | 8, 0);
                getpostalcode.IconCompatParcelizer(z3);
            } else {
                getpostalcode.serializer(1991600625);
                getpostalcode.IconCompatParcelizer(false);
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat == null) {
                    return;
                }
                final int i27 = 0;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.animatedVisibilitySearchlambda0
                    private static int PlaybackStateCompat = 1;
                    private static int PlaybackStateCompatCustomAction;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i28 = 2 % 2;
                        int i29 = PlaybackStateCompatCustomAction + 5;
                        PlaybackStateCompat = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i30 = i29 % 2;
                        int i31 = i27;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i32 = i;
                        if (i31 == 0) {
                            ((Integer) obj2).getClass();
                            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i32 | 1);
                            CashPaymentKt.write(cashPaymentTaskUiModelImpl, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier2, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
                            return createfromparcel;
                        }
                        ((Integer) obj2).getClass();
                        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i32 | 1);
                        CashPaymentKt.write(cashPaymentTaskUiModelImpl, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier2, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
                        int i33 = PlaybackStateCompat + 75;
                        PlaybackStateCompatCustomAction = i33 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i33 % 2 == 0) {
                            return createfromparcel;
                        }
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                };
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        modifier2 = modifier;
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i28 = 1;
            final Modifier modifier3 = modifier2;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.animatedVisibilitySearchlambda0
                private static int PlaybackStateCompat = 1;
                private static int PlaybackStateCompatCustomAction;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i29 = 2 % 2;
                    int i210 = PlaybackStateCompatCustomAction + 5;
                    PlaybackStateCompat = i210 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i30 = i210 % 2;
                    int i31 = i28;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i32 = i;
                    if (i31 == 0) {
                        ((Integer) obj2).getClass();
                        int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i32 | 1);
                        CashPaymentKt.write(cashPaymentTaskUiModelImpl, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
                        return createfromparcel;
                    }
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i32 | 1);
                    CashPaymentKt.write(cashPaymentTaskUiModelImpl, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
                    int i33 = PlaybackStateCompat + 75;
                    PlaybackStateCompatCustomAction = i33 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i33 % 2 == 0) {
                        return createfromparcel;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0195  */
    /* JADX WARN: Code duplicated, block: B:164:0x0238  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    public static final void RemoteActionCompatParcelizer(final CashPaymentTaskUiItem cashPaymentTaskUiItem, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, Modifier modifier, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        boolean z2;
        int i4;
        int i5;
        int i6;
        boolean zIconCompatParcelizer;
        Modifier modifier3 = modifier;
        int i7 = 2 % 2;
        cashPaymentTaskUiItem.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm3.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(100286589);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(cashPaymentTaskUiItem);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(cashPaymentTaskUiItem);
                int i8 = serializer + 97;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            }
            i3 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i10 = serializer + 83;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 93 / 0;
                if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i6 = 32;
                } else {
                    i6 = 16;
                }
            } else if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                int i12 = serializer + 121;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                i5 = i12 % 2 == 0 ? 14912 : Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.Clip : 8192;
        }
        Object obj = null;
        if ((i & 196608) == 0) {
            int i13 = serializer + 1;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
                obj.hashCode();
                throw null;
            }
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1)) {
                int i14 = IconCompatParcelizer + 109;
                serializer = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    throw null;
                }
                i4 = 1048576;
            } else {
                i4 = Fields.BlendMode;
            }
            i3 |= i4;
        }
        int i15 = i2 & Fields.SpotShadowColor;
        if (i15 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            int i16 = IconCompatParcelizer + 37;
            serializer = i16 % Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                getpostalcode2.read(modifier3);
                obj.hashCode();
                throw null;
            }
            i3 |= getpostalcode2.read(modifier3) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) != 4793490) {
            int i17 = IconCompatParcelizer + 79;
            serializer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i3 & 1, z)) {
            if (i15 != 0) {
                modifier3 = Modifier.Companion;
            }
            Modifier modifier4 = modifier3;
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalSoftwareKeyboardController());
            boolean zIsInEditMode = cashPaymentTaskUiItem.uiMode.isInEditMode();
            boolean z3 = (i3 & 112) == 32;
            int i19 = i3 & 14;
            boolean z4 = i19 == 4 || ((i3 & 8) != 0 && getpostalcode2.IconCompatParcelizer(cashPaymentTaskUiItem));
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (!z4 && !z3) {
                int i20 = serializer + 1;
                IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                if (objComponentActivity == androidContentCaptureManager) {
                    final int i22 = 0;
                    objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.animateXAsStateSearchlambda0
                        private static int serializer = 0;
                        private static int write = 1;

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i23 = 2 % 2;
                            int i24 = serializer + 15;
                            write = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i24 % 2 == 0) {
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                throw null;
                            }
                            int i25 = i22;
                            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                            CashPaymentTaskUiItem cashPaymentTaskUiItem2 = cashPaymentTaskUiItem;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                            if (i25 == 0) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(cashPaymentTaskUiItem2.taskId);
                                return createfromparcel2;
                            }
                            if (i25 != 1) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(cashPaymentTaskUiItem2.taskId);
                                return createfromparcel2;
                            }
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(cashPaymentTaskUiItem2.taskId);
                            int i26 = serializer + 63;
                            write = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i26 % 2 == 0) {
                                int i27 = 91 / 0;
                            }
                            return createfromparcel2;
                        }
                    };
                    getpostalcode2.write(objComponentActivity);
                }
            } else {
                final int i23 = 0;
                objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.animateXAsStateSearchlambda0
                    private static int serializer = 0;
                    private static int write = 1;

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i24 = 2 % 2;
                        int i25 = serializer + 15;
                        write = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i25 % 2 == 0) {
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            throw null;
                        }
                        int i26 = i23;
                        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                        CashPaymentTaskUiItem cashPaymentTaskUiItem2 = cashPaymentTaskUiItem;
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                        if (i26 == 0) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(cashPaymentTaskUiItem2.taskId);
                            return createfromparcel2;
                        }
                        if (i26 != 1) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(cashPaymentTaskUiItem2.taskId);
                            return createfromparcel2;
                        }
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(cashPaymentTaskUiItem2.taskId);
                        int i27 = serializer + 63;
                        write = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i27 % 2 == 0) {
                            int i28 = 91 / 0;
                        }
                        return createfromparcel2;
                    }
                };
                getpostalcode2.write(objComponentActivity);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity;
            boolean z5 = (i3 & 896) == 256;
            int i24 = IconCompatParcelizer + 13;
            serializer = i24 % Fields.SpotShadowColor;
            int i25 = i24 % 2;
            boolean z6 = i19 == 4 || ((i3 & 8) != 0 && getpostalcode2.IconCompatParcelizer(cashPaymentTaskUiItem));
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if ((z6 | z5) || objComponentActivity2 == androidContentCaptureManager) {
                final int i26 = 2;
                objComponentActivity2 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.animateXAsStateSearchlambda0
                    private static int serializer = 0;
                    private static int write = 1;

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i27 = 2 % 2;
                        int i28 = serializer + 15;
                        write = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i28 % 2 == 0) {
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            throw null;
                        }
                        int i29 = i26;
                        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                        CashPaymentTaskUiItem cashPaymentTaskUiItem2 = cashPaymentTaskUiItem;
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                        if (i29 == 0) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(cashPaymentTaskUiItem2.taskId);
                            return createfromparcel2;
                        }
                        if (i29 != 1) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(cashPaymentTaskUiItem2.taskId);
                            return createfromparcel2;
                        }
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(cashPaymentTaskUiItem2.taskId);
                        int i210 = serializer + 63;
                        write = i210 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i210 % 2 == 0) {
                            int i211 = 91 / 0;
                        }
                        return createfromparcel2;
                    }
                };
                getpostalcode2.write(objComponentActivity2);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
            boolean z7 = (i3 & 7168) == 2048;
            boolean z8 = i19 == 4 || ((i3 & 8) != 0 && getpostalcode2.IconCompatParcelizer(cashPaymentTaskUiItem));
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if ((z7 | z8) || objComponentActivity3 == androidContentCaptureManager) {
                final int i27 = 1;
                objComponentActivity3 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: o.animateXAsStateSearchlambda0
                    private static int serializer = 0;
                    private static int write = 1;

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i28 = 2 % 2;
                        int i29 = serializer + 15;
                        write = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i29 % 2 == 0) {
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            throw null;
                        }
                        int i210 = i27;
                        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                        CashPaymentTaskUiItem cashPaymentTaskUiItem2 = cashPaymentTaskUiItem;
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                        if (i210 == 0) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(cashPaymentTaskUiItem2.taskId);
                            return createfromparcel2;
                        }
                        if (i210 != 1) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(cashPaymentTaskUiItem2.taskId);
                            return createfromparcel2;
                        }
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm4.invoke(cashPaymentTaskUiItem2.taskId);
                        int i211 = serializer + 63;
                        write = i211 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i211 % 2 == 0) {
                            int i212 = 91 / 0;
                        }
                        return createfromparcel2;
                    }
                };
                getpostalcode2.write(objComponentActivity3);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3;
            boolean z9 = (i3 & 3670016) == 1048576;
            if (i19 != 4) {
                int i28 = IconCompatParcelizer + 33;
                serializer = i28 % Fields.SpotShadowColor;
                if (i28 % 2 == 0 ? (i3 & 8) != 0 : (i3 & 33) != 0) {
                    z2 = getpostalcode2.IconCompatParcelizer(cashPaymentTaskUiItem);
                }
            }
            Object objComponentActivity4 = getpostalcode2.ComponentActivity();
            if ((z9 | z2) || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new SessionDao_Impl$$ExternalSyntheticLambda1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, 28, cashPaymentTaskUiItem);
                getpostalcode2.write(objComponentActivity4);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4;
            boolean z10 = getpostalcode2.read(softwareKeyboardController);
            Object objComponentActivity5 = getpostalcode2.ComponentActivity();
            if (z10 || objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = new r8lambdaX9oYHljBNKlnwJiwehaYfTB7JCw(softwareKeyboardController, 0);
                getpostalcode2.write(objComponentActivity5);
            }
            CashPaymentTaskUiItem.Companion companion = CashPaymentTaskUiItem.Companion;
            int i29 = i3 << 6;
            getpostalcode = getpostalcode2;
            CashTaskColumn(cashPaymentTaskUiItem, zIsInEditMode, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5, modifier4, getpostalcode, i19 | 8 | (3670016 & i29) | (29360128 & i29) | (i29 & 1879048192));
            modifier2 = modifier4;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier3;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new registerAndGetInstance(cashPaymentTaskUiItem, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, modifier2, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:170:0x057d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x057f  */
    /* JADX WARN: Code duplicated, block: B:179:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:185:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:188:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:190:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:194:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:197:0x0602  */
    /* JADX WARN: Code duplicated, block: B:198:0x0604  */
    /* JADX WARN: Code duplicated, block: B:204:0x0613  */
    /* JADX WARN: Code duplicated, block: B:209:0x0645  */
    /* JADX WARN: Code duplicated, block: B:211:0x066b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:213:0x0712  */
    /* JADX WARN: Code duplicated, block: B:215:0x071e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0780  */
    /* JADX WARN: Code duplicated, block: B:228:0x078e  */
    /* JADX WARN: Code duplicated, block: B:230:0x0799  */
    /* JADX WARN: Code duplicated, block: B:233:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:235:0x07b8 A[PHI: r0
  0x07b8: PHI (r0v67 java.lang.Double) = (r0v66 java.lang.Double), (r0v71 java.lang.Double) binds: [B:231:0x07b1, B:234:0x07b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0154  */
    public static final void CashTaskColumn(CashPaymentTaskUiItem cashPaymentTaskUiItem, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        width widthVar;
        boolean z5;
        boolean z6;
        Object objComponentActivity;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objComponentActivity2;
        boolean z10;
        isInline isinline;
        Double d;
        double dDoubleValue;
        int i3;
        int i4 = 2 % 2;
        cashPaymentTaskUiItem.getClass();
        String str = cashPaymentTaskUiItem.note;
        CashPaymentTaskUiItem.Reasons reasons = cashPaymentTaskUiItem.reasons;
        CashPaymentTaskUiItem.UiMode uiMode = cashPaymentTaskUiItem.uiMode;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k3.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1470244945);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(cashPaymentTaskUiItem) : getpostalcode.IconCompatParcelizer(cashPaymentTaskUiItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!getpostalcode.write(z)) {
                i3 = 16;
            } else {
                int i5 = IconCompatParcelizer + 123;
                serializer = i5 % Fields.SpotShadowColor;
                i3 = i5 % 2 != 0 ? 92 : 32;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i6 = IconCompatParcelizer + 45;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.CameraDistance : Fields.RotationZ;
            int i8 = IconCompatParcelizer + 101;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ^ true ? Fields.BlendMode : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= getpostalcode.read(modifier) ? 536870912 : 268435456;
        }
        int i10 = i2;
        if (!(!getpostalcode.write(i10 & 1, (i10 & 306783379) != 306783378))) {
            if ((i10 & 112) == 32) {
                int i11 = IconCompatParcelizer + 83;
                serializer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            if ((i10 & 234881024) == 67108864) {
                int i12 = serializer + 11;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z2 | z3) || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new DividerUiModelImpl$1.AnonymousClass1(z, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, (ShortNewsContentCardView) null);
                getpostalcode.write(objComponentActivity3);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, Boolean.valueOf(z), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity3);
            boolean z11 = getpostalcode.read(cashPaymentTaskUiItem.taskId);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (z11 || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = CompositionKt.RemoteActionCompatParcelizer(cashPaymentTaskUiItem.RemoteActionCompatParcelizer());
                getpostalcode.write(objComponentActivity4);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity4;
            String strRemoteActionCompatParcelizer = cashPaymentTaskUiItem.RemoteActionCompatParcelizer();
            boolean z12 = getpostalcode.read(populateViewStructure_androidKtpopulate7);
            int i14 = i10 & 14;
            if (i14 != 4) {
                if ((i10 & 8) != 0) {
                    int i15 = IconCompatParcelizer + 71;
                    serializer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    z4 = getpostalcode.IconCompatParcelizer(cashPaymentTaskUiItem);
                }
            }
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if ((z12 || z4) || objComponentActivity5 == androidContentCaptureManager) {
                widthVar = null;
                objComponentActivity5 = new CashPaymentKt$CashTaskColumn$2$1(cashPaymentTaskUiItem, populateViewStructure_androidKtpopulate7, null, 0);
                getpostalcode.write(objComponentActivity5);
            } else {
                widthVar = null;
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, strRemoteActionCompatParcelizer, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity5);
            Modifier modifierWrite = AnimationModifierKt.write(SizeKt.write(modifier, 1.0f), widthVar, 3);
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
            int i17 = IconCompatParcelizer + 109;
            serializer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            String str2 = cashPaymentTaskUiItem.title;
            TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
            Modifier.Companion companion3 = Modifier.Companion;
            companion3.getClass();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str2, companion3, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOverlayMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode, 48, 0, 131064);
            float f = Dimensions.getActionBarHideOffset;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f)});
            String str3 = cashPaymentTaskUiItem.description;
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            long actionBarHideOffset = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getActionBarHideOffset();
            Modifier modifierWrite2 = SizeKt.write(companion3, 1.0f);
            modifierWrite2.getClass();
            TextKt.m131TextNvy7gAk(str3, modifierWrite2, actionBarHideOffset, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleIconCompatParcelizer, getpostalcode, 48, 0, 131064);
            float f2 = Dimensions.setMenu;
            Modifier modifierM = af$$ExternalSyntheticOutline1.m(companion3, f2, getpostalcode, companion3, 1.0f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.read, companion.getCenterVertically(), getpostalcode, 54);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            if (z) {
                getpostalcode.serializer(1464558665);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
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
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                Modifier modifierWrite3 = SizeKt.write(companion3, 1.0f);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(Arrangement.RemoteActionCompatParcelizer, companion.getTop(), getpostalcode, 6);
                int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite3);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor4);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
                TertiaryKt.IconCompatParcelizer(cashPaymentTaskUiItem.cancelActionTitle, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, companion3, false, 0, null, null, null, getpostalcode, ((i10 >> 6) & 112) | 384, 248);
                TertiaryKt.IconCompatParcelizer(cashPaymentTaskUiItem.doneActionTitle, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, companion3, ((Boolean) CashPaymentTaskUiItem.RemoteActionCompatParcelizer(BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -1494128477, 1494128477, new Object[]{cashPaymentTaskUiItem}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write())).booleanValue(), 0, null, null, null, getpostalcode, ((i10 >> 9) & 112) | 384, 240);
                getpostalcode.IconCompatParcelizer(true);
                String str4 = (String) populateViewStructure_androidKtpopulate7.getValue();
                boolean zIsInEditMode = uiMode.isInEditMode();
                String str5 = cashPaymentTaskUiItem.formattedOriginalAmount;
                String str6 = cashPaymentTaskUiItem.currency;
                getCenterHorizontally getcenterhorizontally = new getCenterHorizontally(KeyboardType.Companion.m3316getDecimalPjHm6EE(), 0, 123);
                boolean z13 = getpostalcode.read(populateViewStructure_androidKtpopulate7);
                boolean z14 = (i10 & 458752) == 131072;
                Object objComponentActivity6 = getpostalcode.ComponentActivity();
                if ((z13 | z14) || objComponentActivity6 == androidContentCaptureManager) {
                    objComponentActivity6 = new purchaseVerificationUrlChoices(r8lambdaunavo3sxub_pc9xroryotnrlvsm, populateViewStructure_androidKtpopulate7, 1);
                    getpostalcode.write(objComponentActivity6);
                }
                TextInputBigV2Kt.TextInputBigV2(str4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6, companion3, zIsInEditMode, null, str5, null, null, false, null, null, false, 0, getcenterhorizontally, null, str6, null, "cashPaymentEditTextTestTag", null, getpostalcode, 384, 196608, 48, 5996464);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(1466027042);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer3 = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(f), companion.getTop(), getpostalcode, 0);
                int iHashCode5 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(getpostalcode, companion3);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor5 = companion2.getConstructor();
                if (getaddresscountry == null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor5);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer5);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode5), getpostalcode));
                TextKt.m131TextNvy7gAk(cashPaymentTaskUiItem.currency, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setLogo(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatQueueItem(), getpostalcode, 0, 0, 131066);
                TextKt.m131TextNvy7gAk(cashPaymentTaskUiItem.RemoteActionCompatParcelizer(), companion3, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setLogo(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatQueueItem(), getpostalcode, 48, 0, 131064);
                getpostalcode.IconCompatParcelizer(true);
                if (cashPaymentTaskUiItem.editable) {
                    getpostalcode.serializer(1466716048);
                    isValidParameter.RemoteActionCompatParcelizer(cashPaymentTaskUiItem.actionTitle, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Modifier) companion3, false, Integer.valueOf(R.drawable.ic_pencil), (hasRootCause) null, (extractAuthorizationHeader) null, (MutableInteractionSourceImpl) null, (getBirthDateFull) getpostalcode, ((i10 >> 3) & 112) | 384, 488);
                    z5 = false;
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    z5 = false;
                    getpostalcode.serializer(1467019321);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(z5);
            }
            int i19 = IconCompatParcelizer;
            int i20 = i19 + 21;
            serializer = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            int i22 = i19 + 5;
            serializer = i22 % Fields.SpotShadowColor;
            if (i22 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(true);
                if (z) {
                    if (reasons != null) {
                        getpostalcode.serializer(357663197);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, r16)});
                        String strMediaBrowserCompatMediaItem = cashPaymentTaskUiItem.MediaBrowserCompatMediaItem();
                        boolean zMediaSessionCompatToken = cashPaymentTaskUiItem.MediaSessionCompatToken();
                        if (i14 != 4 || ((i10 & 8) != 0 && getpostalcode.IconCompatParcelizer(cashPaymentTaskUiItem))) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (!z6 || objComponentActivity == androidContentCaptureManager) {
                            z7 = false;
                            objComponentActivity = new animatedContentSearchlambda0(cashPaymentTaskUiItem, 0);
                            getpostalcode.write(objComponentActivity);
                        } else {
                            z7 = false;
                        }
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion3, z7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, 1, null);
                        if (i14 == 4) {
                            if ((i10 & 8) != 0) {
                                int i23 = IconCompatParcelizer + 51;
                                serializer = i23 % Fields.SpotShadowColor;
                                int i24 = i23 % 2;
                                z8 = getpostalcode.IconCompatParcelizer(cashPaymentTaskUiItem);
                            }
                        }
                        if ((i10 & 3670016) == 1048576) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objComponentActivity2 = getpostalcode.ComponentActivity();
                        if (!(z8 | z9) || objComponentActivity2 == androidContentCaptureManager) {
                            objComponentActivity2 = new DeviceManager$$ExternalSyntheticLambda1(cashPaymentTaskUiItem, 7, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                            getpostalcode.write(objComponentActivity2);
                        }
                        DropdownKt.read(strMediaBrowserCompatMediaItem, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, modifierSemantics$default, zMediaSessionCompatToken, 0, null, getpostalcode, 0, 112);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                }
                if (uiMode.isInViewMode()) {
                    if (((Boolean) CashPaymentTaskUiItem.RemoteActionCompatParcelizer(BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), 42748691, -42748689, new Object[]{cashPaymentTaskUiItem}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write())).booleanValue() || reasons == null) {
                        getpostalcode.serializer(359060925);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(358438197);
                        TextKt.m131TextNvy7gAk(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(cashPaymentTaskUiItem.currency, cashPaymentTaskUiItem.formattedOriginalAmount), PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion3, 1.0f), 0.0f, Dimensions.getNestedScrollAxes, 0.0f, 0.0f, 13), BuildersKt.MediaMetadataCompat(getpostalcode), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write().merge(new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getLineThrough(), (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16773119, (DefaultConstructorMarker) null)), getpostalcode, 0, 0, 131064);
                        TextKt.m131TextNvy7gAk(cashPaymentTaskUiItem.editedReasonLabel, companion3, BuildersKt.MediaMetadataCompat(getpostalcode), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode, 48, 0, 131064);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                } else {
                    getpostalcode.serializer(359060925);
                    getpostalcode.IconCompatParcelizer(false);
                }
                if (str == null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) && uiMode.isInViewMode()) {
                    getpostalcode.serializer(359120104);
                    String str7 = str == null ? "" : str;
                    TextStyle textStyleWrite = performLayout.write();
                    long jMediaMetadataCompat = BuildersKt.MediaMetadataCompat(getpostalcode);
                    Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion3, 1.0f), 0.0f, Dimensions.getNestedScrollAxes, 0.0f, 0.0f, 13);
                    modifierM74paddingqDBjuR0$default.getClass();
                    TextKt.m131TextNvy7gAk(str7, modifierM74paddingqDBjuR0$default, jMediaMetadataCompat, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleWrite, getpostalcode, 0, 0, 131064);
                    z10 = false;
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    z10 = false;
                    getpostalcode.serializer(359457725);
                    getpostalcode.IconCompatParcelizer(false);
                }
                isinline = cashPaymentTaskUiItem.transferChangeItem;
                if (isinline == null) {
                    getpostalcode.serializer(359505185);
                    getpostalcode.IconCompatParcelizer(z10);
                } else {
                    getpostalcode.serializer(359505186);
                    Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f2, 0.0f, 0.0f, 13);
                    d = cashPaymentTaskUiItem.selectedAmount;
                    if (d != null && (d = cashPaymentTaskUiItem.originalAmount) == null) {
                        dDoubleValue = 0.0d;
                    } else {
                        dDoubleValue = d.doubleValue();
                    }
                    r8lambdaurFQ1uiZ_ezwuFf5ls30jKUPDSo.write(isinline, dDoubleValue, cashPaymentTaskUiItem.currency, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, modifierM74paddingqDBjuR0$default2, getpostalcode, (i10 >> 12) & 7168);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(true);
            } else {
                getpostalcode.IconCompatParcelizer(true);
                if (z) {
                    if (reasons != null) {
                        getpostalcode.serializer(357663197);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, r16)});
                        String strMediaBrowserCompatMediaItem2 = cashPaymentTaskUiItem.MediaBrowserCompatMediaItem();
                        boolean zMediaSessionCompatToken2 = cashPaymentTaskUiItem.MediaSessionCompatToken();
                        if (i14 != 4) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (z6) {
                            z7 = false;
                            objComponentActivity = new animatedContentSearchlambda0(cashPaymentTaskUiItem, 0);
                            getpostalcode.write(objComponentActivity);
                        } else {
                            z7 = false;
                            objComponentActivity = new animatedContentSearchlambda0(cashPaymentTaskUiItem, 0);
                            getpostalcode.write(objComponentActivity);
                        }
                        Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(companion3, z7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, 1, null);
                        if (i14 == 4) {
                            if ((i10 & 8) != 0) {
                                int i25 = IconCompatParcelizer + 51;
                                serializer = i25 % Fields.SpotShadowColor;
                                int i26 = i25 % 2;
                                if (getpostalcode.IconCompatParcelizer(cashPaymentTaskUiItem)) {
                                }
                            }
                        }
                        if ((i10 & 3670016) == 1048576) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objComponentActivity2 = getpostalcode.ComponentActivity();
                        if (!z8 && !z9) {
                            objComponentActivity2 = new DeviceManager$$ExternalSyntheticLambda1(cashPaymentTaskUiItem, 7, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                            getpostalcode.write(objComponentActivity2);
                        } else {
                            objComponentActivity2 = new DeviceManager$$ExternalSyntheticLambda1(cashPaymentTaskUiItem, 7, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                            getpostalcode.write(objComponentActivity2);
                        }
                        DropdownKt.read(strMediaBrowserCompatMediaItem2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, modifierSemantics$default2, zMediaSessionCompatToken2, 0, null, getpostalcode, 0, 112);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                }
                if (uiMode.isInViewMode()) {
                    if (((Boolean) CashPaymentTaskUiItem.RemoteActionCompatParcelizer(BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), 42748691, -42748689, new Object[]{cashPaymentTaskUiItem}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write())).booleanValue()) {
                        getpostalcode.serializer(359060925);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(359060925);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                } else {
                    getpostalcode.serializer(359060925);
                    getpostalcode.IconCompatParcelizer(false);
                }
                if (str == null) {
                    z10 = false;
                    getpostalcode.serializer(359457725);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    z10 = false;
                    getpostalcode.serializer(359457725);
                    getpostalcode.IconCompatParcelizer(false);
                }
                isinline = cashPaymentTaskUiItem.transferChangeItem;
                if (isinline == null) {
                    getpostalcode.serializer(359505185);
                    getpostalcode.IconCompatParcelizer(z10);
                } else {
                    getpostalcode.serializer(359505186);
                    Modifier modifierM74paddingqDBjuR0$default3 = PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f2, 0.0f, 0.0f, 13);
                    d = cashPaymentTaskUiItem.selectedAmount;
                    if (d != null) {
                        dDoubleValue = d.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    r8lambdaurFQ1uiZ_ezwuFf5ls30jKUPDSo.write(isinline, dDoubleValue, cashPaymentTaskUiItem.currency, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, modifierM74paddingqDBjuR0$default3, getpostalcode, (i10 >> 12) & 7168);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(true);
            }
            getpostalcode.serializer(358370493);
            getpostalcode.IconCompatParcelizer(false);
            if (uiMode.isInViewMode()) {
                if (((Boolean) CashPaymentTaskUiItem.RemoteActionCompatParcelizer(BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), 42748691, -42748689, new Object[]{cashPaymentTaskUiItem}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write())).booleanValue()) {
                    getpostalcode.serializer(359060925);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(359060925);
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                getpostalcode.serializer(359060925);
                getpostalcode.IconCompatParcelizer(false);
            }
            if (str == null) {
                z10 = false;
                getpostalcode.serializer(359457725);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                z10 = false;
                getpostalcode.serializer(359457725);
                getpostalcode.IconCompatParcelizer(false);
            }
            isinline = cashPaymentTaskUiItem.transferChangeItem;
            if (isinline == null) {
                getpostalcode.serializer(359505185);
                getpostalcode.IconCompatParcelizer(z10);
            } else {
                getpostalcode.serializer(359505186);
                Modifier modifierM74paddingqDBjuR0$default4 = PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f2, 0.0f, 0.0f, 13);
                d = cashPaymentTaskUiItem.selectedAmount;
                if (d != null) {
                    dDoubleValue = d.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                r8lambdaurFQ1uiZ_ezwuFf5ls30jKUPDSo.write(isinline, dDoubleValue, cashPaymentTaskUiItem.currency, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, modifierM74paddingqDBjuR0$default4, getpostalcode, (i10 >> 12) & 7168);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new setContentSensitive(cashPaymentTaskUiItem, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, modifier, i);
        }
    }
}
