package com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.presentation.compose;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda0;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda3;
import coil3.ExtrasKt;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.huawei.riemann.location.common.utils.Constant;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.presentation.CardCashPaymentTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.presentation.compose.CardCashPaymentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.compose.CashPaymentKt$CashTaskColumn$2$1;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$Companion;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$PaymentStatus;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$PaymentType;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.forms.DropdownKt;
import com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt;
import com.roadrunner.rrds.compose.component.forms.ToggleKt;
import io.reactivex.subjects.BehaviorSubject;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidContentCaptureManagerTranslateStatus;
import o.AndroidFontTypefaceLoader;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
import o.AnimateXAsStateComposeAnimationCompanion;
import o.CallGroup;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TextFieldDefaults;
import o.UiMediaScopeImpl;
import o.UtilNetworking1;
import o.allChildren;
import o.animatedContentSearchlambda0;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCenterHorizontally;
import o.getCreditCardExpirationMonth;
import o.getEnterjXw82LU;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getLocation;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.hideCurrentlyDisplayingInAppMessage;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdabm6Xd4G6qvXesbF9M1n8iztWq4c;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.show;
import o.snapElevation;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CardCashPaymentKt {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[PHI: r4
  0x0043: PHI (r4v9 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v11 o.getPostalCode) binds: [B:8:0x002d, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r4
  0x002f: PHI (r4v6 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v11 o.getPostalCode) binds: [B:8:0x002d, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void IconCompatParcelizer(getEnterjXw82LU getenterjxw82lu, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4 = 2 % 2;
        int i5 = write + 59;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-342790883);
            if ((i & 78) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(getenterjxw82lu);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getenterjxw82lu);
                }
                if (zIconCompatParcelizer) {
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
            getpostalcode.MediaSessionCompatQueueItem(-342790883);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(getenterjxw82lu);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getenterjxw82lu);
                }
                if (zIconCompatParcelizer) {
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
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        boolean z5 = false;
        if ((i3 & 19) != 18) {
            int i6 = IconCompatParcelizer + 123;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            int i7 = IconCompatParcelizer + 53;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                str = getenterjxw82lu.cardItem.actionButtonText;
                z2 = getenterjxw82lu.isActive;
                if ((i3 & 81) == 97) {
                    int i8 = IconCompatParcelizer + 75;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    z3 = z2;
                    z4 = true;
                } else {
                    z3 = z2;
                    z4 = false;
                }
            } else {
                str = getenterjxw82lu.cardItem.actionButtonText;
                boolean z6 = getenterjxw82lu.isActive;
                if ((i3 & 112) == 32) {
                    z2 = z6;
                    int i10 = IconCompatParcelizer + 75;
                    write = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    z3 = z2;
                    z4 = true;
                } else {
                    z2 = z6;
                    z3 = z2;
                    z4 = false;
                }
            }
            if ((i3 & 14) == 4 || ((i3 & 8) != 0 && getpostalcode.IconCompatParcelizer(getenterjxw82lu))) {
                z5 = true;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z4 | z5) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 6, getenterjxw82lu);
                getpostalcode.write(objComponentActivity);
            }
            TertiaryKt.IconCompatParcelizer(str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, null, z3, 0, null, null, null, getpostalcode, 0, Constant.ERROR_GNSS_STATUS_INVALID);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 21, getenterjxw82lu, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    public static final void Progress(getEnterjXw82LU getenterjxw82lu, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1682197065);
        if ((i & 6) == 0) {
            int i5 = write + 59;
            int i6 = i5 % Fields.SpotShadowColor;
            IconCompatParcelizer = i6;
            int i7 = i5 % 2;
            if ((i & 8) == 0) {
                int i8 = i6 + 15;
                write = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    zIconCompatParcelizer = getpostalcode2.read(getenterjxw82lu);
                } else {
                    getpostalcode2.read(getenterjxw82lu);
                    throw null;
                }
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getenterjxw82lu);
            }
            if (zIconCompatParcelizer) {
                int i9 = IconCompatParcelizer + 47;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i11 = write + 101;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier.Companion companion = Modifier.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, centerVertically, getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read != null) {
                int i12 = IconCompatParcelizer + 7;
                write = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    int i13 = 12 / 0;
                    if (getpostalcode2.ComponentActivity) {
                        getpostalcode2.serializer(constructor);
                        int i14 = write + 13;
                        IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                    } else {
                        getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        int i16 = write + 35;
                        IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                    }
                } else {
                    getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode2.ComponentActivity) {
                        getpostalcode2.serializer(constructor);
                        int i18 = write + 13;
                        IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                    } else {
                        getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        int i110 = write + 35;
                        IconCompatParcelizer = i110 % Fields.SpotShadowColor;
                        int i111 = i110 % 2;
                    }
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(companion, Dp.m3673constructorimpl(16.0f));
                float fM3673constructorimpl = Dp.m3673constructorimpl(1.0f);
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                ProgressIndicatorKt.write(modifierM83size3ABfNKs, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setEmojiCompatEnabled(), fM3673constructorimpl, 0L, 0, 0.0f, getpostalcode2, 390);
                Object[] objArr = {getpostalcode2, SizeKt.m86width3ABfNKs(companion, Dp.m3673constructorimpl(6.0f))};
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
                String str = getenterjxw82lu.progressText;
                TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
                long onMenuItemClickListener = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setOnMenuItemClickListener();
                getpostalcode = getpostalcode2;
                TextKt.m131TextNvy7gAk(str, null, onMenuItemClickListener, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleIconCompatParcelizer, getpostalcode, 0, 0, 131066);
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(getenterjxw82lu, i, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01a3  */
    public static final void read(getEnterjXw82LU getenterjxw82lu, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean zIconCompatParcelizer;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2030114098);
        if ((i & 6) == 0) {
            int i6 = IconCompatParcelizer;
            int i7 = i6 + 81;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if ((i & 8) == 0) {
                int i9 = i6 + 69;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                zIconCompatParcelizer = getpostalcode.read(getenterjxw82lu);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getenterjxw82lu);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
            int i11 = IconCompatParcelizer + 87;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        if ((i & 384) == 0) {
            int i13 = IconCompatParcelizer + 9;
            write = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i15 = write + 97;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde2) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            if (!(!getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde3))) {
                int i17 = IconCompatParcelizer + 31;
                write = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        if ((100663296 & i) == 0) {
            i2 |= getpostalcode.read(modifier) ? 67108864 : 33554432;
        }
        if ((38347923 & i2) != 38347922) {
            int i19 = IconCompatParcelizer + 67;
            write = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!getpostalcode.write(i2 & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i21 = write + 23;
            IconCompatParcelizer = i21 % Fields.SpotShadowColor;
            if (i21 % 2 != 0) {
                CashPaymentTaskUiItem cashPaymentTaskUiItem = getenterjxw82lu.cashItem;
                boolean z2 = getenterjxw82lu.isSuccess;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CashPaymentTaskUiItem cashPaymentTaskUiItem2 = getenterjxw82lu.cashItem;
            if (getenterjxw82lu.isSuccess) {
                getpostalcode.serializer(-1024474634);
                CardCashPaymentTaskUiItem$Companion cardCashPaymentTaskUiItem$Companion = getEnterjXw82LU.Companion;
                Done(getenterjxw82lu, modifier, getpostalcode, ((i2 >> 21) & 112) | (i2 & 14) | 8);
                getpostalcode.IconCompatParcelizer(false);
            } else if (getenterjxw82lu.paymentType != CardCashPaymentTaskUiItem$PaymentType.CASH) {
                getpostalcode.serializer(-1024458878);
                CardCashPaymentTaskUiItem$Companion cardCashPaymentTaskUiItem$Companion2 = getEnterjXw82LU.Companion;
                DefaultState(getenterjxw82lu, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, modifier, getpostalcode, (i2 & 14) | 8 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | ((i2 >> 12) & 57344));
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if ((cashPaymentTaskUiItem2 != null ? cashPaymentTaskUiItem2.uiMode : null) != CashPaymentTaskUiItem.UiMode.EditPayment || cashPaymentTaskUiItem2 == null) {
                    getpostalcode.serializer(-1024458878);
                    CardCashPaymentTaskUiItem$Companion cardCashPaymentTaskUiItem$Companion3 = getEnterjXw82LU.Companion;
                    DefaultState(getenterjxw82lu, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, modifier, getpostalcode, (i2 & 14) | 8 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | ((i2 >> 12) & 57344));
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    int i22 = IconCompatParcelizer + 11;
                    write = i22 % Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    getpostalcode.serializer(-1024470486);
                    CardCashPaymentTaskUiItem$Companion cardCashPaymentTaskUiItem$Companion4 = getEnterjXw82LU.Companion;
                    CashPaymentTaskUiItem.Companion companion = CashPaymentTaskUiItem.Companion;
                    int i24 = i2 >> 6;
                    ChangeAmount(getenterjxw82lu, cashPaymentTaskUiItem2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, modifier, getpostalcode, (3670016 & i24) | (i2 & 14) | 72 | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752));
                    getpostalcode.IconCompatParcelizer(false);
                }
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdabm6Xd4G6qvXesbF9M1n8iztWq4c(getenterjxw82lu, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, modifier, i);
            int i25 = IconCompatParcelizer + 59;
            write = i25 % Fields.SpotShadowColor;
            int i26 = i25 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046 A[PHI: r6
  0x0046: PHI (r6v9 o.getPostalCode) = (r6v5 o.getPostalCode), (r6v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x013b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[PHI: r6
  0x0032: PHI (r6v6 o.getPostalCode) = (r6v5 o.getPostalCode), (r6v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void ActionButtons(CashPaymentTaskUiItem cashPaymentTaskUiItem, getEnterjXw82LU getenterjxw82lu, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        Modifier.Companion companion;
        boolean z;
        boolean z2;
        boolean z3;
        boolean zIconCompatParcelizer2;
        int i4;
        int i5 = 2 % 2;
        int i6 = write + 37;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-589403514);
            if ((i & 90) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(cashPaymentTaskUiItem);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(cashPaymentTaskUiItem);
                }
                if (zIconCompatParcelizer) {
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
            getpostalcode.MediaSessionCompatQueueItem(-589403514);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(cashPaymentTaskUiItem);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(cashPaymentTaskUiItem);
                }
                if (zIconCompatParcelizer) {
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
            if ((i & 64) != 0) {
                zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(getenterjxw82lu);
            } else {
                int i7 = write + 63;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    zIconCompatParcelizer2 = getpostalcode.read(getenterjxw82lu);
                } else {
                    getpostalcode.read(getenterjxw82lu);
                    throw null;
                }
            }
            if (zIconCompatParcelizer2) {
                int i8 = IconCompatParcelizer + 59;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i10 = i3;
        if (getpostalcode.write(i10 & 1, (i10 & 1171) != 1170)) {
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            snapElevation snapelevationIconCompatParcelizer = Arrangement.IconCompatParcelizer(Dimensions.setHideOnContentScrollEnabled);
            Modifier.Companion companion2 = Modifier.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(snapelevationIconCompatParcelizer, Alignment.Companion.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i11 = IconCompatParcelizer + 23;
                    write = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                boolean zIsInViewMode = cashPaymentTaskUiItem.uiMode.isInViewMode();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (!zIsInViewMode) {
                    getpostalcode.serializer(-298054190);
                    String str = cashPaymentTaskUiItem.cancelActionTitle;
                    boolean z4 = (i10 & 7168) == 2048;
                    if ((i10 & 112) != 32) {
                        int i13 = write + 59;
                        IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                        if (i13 % 2 == 0 ? (i10 & 64) != 0 : (i10 & 6) != 0) {
                            z3 = getpostalcode.IconCompatParcelizer(getenterjxw82lu);
                        }
                    }
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    if ((z4 | z3) || objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new AnimateXAsStateComposeAnimationCompanion(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, getenterjxw82lu, 1);
                        getpostalcode.write(objComponentActivity);
                    }
                    companion2.getClass();
                    companion = companion2;
                    z = false;
                    TertiaryKt.IconCompatParcelizer(str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, companion, false, 0, null, null, null, getpostalcode, 384, 248);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    companion = companion2;
                    z = false;
                    getpostalcode.serializer(-297802408);
                    getpostalcode.IconCompatParcelizer(false);
                }
                if (!cashPaymentTaskUiItem.uiMode.isInViewMode()) {
                    getpostalcode.serializer(-297733867);
                    String str2 = cashPaymentTaskUiItem.doneActionTitle;
                    boolean zBooleanValue = ((Boolean) CashPaymentTaskUiItem.RemoteActionCompatParcelizer(BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -1494128477, 1494128477, new Object[]{cashPaymentTaskUiItem}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write())).booleanValue();
                    companion.getClass();
                    boolean z5 = (i10 & 896) == 256 ? true : z;
                    if ((i10 & 112) != 32) {
                        int i14 = write + 31;
                        IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                        if (i14 % 2 == 0 ? (i10 & 64) != 0 : (i10 & 113) != 0) {
                            if (getpostalcode.IconCompatParcelizer(getenterjxw82lu)) {
                                z2 = true;
                            }
                        }
                        z2 = z;
                    } else {
                        z2 = true;
                    }
                    Object objComponentActivity2 = getpostalcode.ComponentActivity();
                    if ((z2 | z5) || objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new AnimateXAsStateComposeAnimationCompanion(r8lambdaunavo3sxub_pc9xroryotnrlvsm, getenterjxw82lu, 2);
                        getpostalcode.write(objComponentActivity2);
                    }
                    TertiaryKt.IconCompatParcelizer(str2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, companion, zBooleanValue, 0, null, null, null, getpostalcode, 384, 240);
                    getpostalcode.IconCompatParcelizer(z);
                } else {
                    getpostalcode.serializer(-297444296);
                    getpostalcode.IconCompatParcelizer(z);
                }
                int i15 = IconCompatParcelizer + 69;
                write = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    getpostalcode.IconCompatParcelizer(z);
                } else {
                    getpostalcode.IconCompatParcelizer(true);
                }
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera(cashPaymentTaskUiItem, getenterjxw82lu, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, i, 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:137:0x023a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0198  */
    public static final void read(final CardCashPaymentTaskUiModelImpl cardCashPaymentTaskUiModelImpl, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4, final Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = IconCompatParcelizer + 33;
        write = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        cardCashPaymentTaskUiModelImpl.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm3.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm4.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1001096064);
        if ((i & 6) == 0) {
            if (getpostalcode.read(cardCashPaymentTaskUiModelImpl)) {
                int i9 = IconCompatParcelizer + 19;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i5 = 4;
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
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i11 = IconCompatParcelizer + 25;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i4 = Fields.Clip;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3)) {
                int i13 = write + 95;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i3 = 1048576;
            } else {
                i3 = Fields.BlendMode;
            }
            i2 |= i3;
        }
        if ((12582912 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm4) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= getpostalcode.read(modifier) ? 67108864 : 33554432;
        }
        if ((i2 & 38347923) != 38347922) {
            int i15 = IconCompatParcelizer + 105;
            write = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            allChildren allchildren = (allChildren) ExtrasKt.write(cardCashPaymentTaskUiModelImpl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, getpostalcode, 0).getValue();
            if (allchildren instanceof getLocation) {
                int i17 = write + 61;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                getpostalcode.serializer(-19335632);
                getEnterjXw82LU getenterjxw82lu = ((getLocation) allchildren).IconCompatParcelizer;
                boolean z3 = !((i2 & 112) != 32);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z3 || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new AndroidContentCaptureManagerTranslateStatus(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 2);
                    getpostalcode.write(objComponentActivity);
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity;
                boolean z4 = (i2 & 896) == 256;
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z4 || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(24, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity2);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2;
                boolean z5 = (i2 & 7168) == 2048;
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (z5) {
                    objComponentActivity3 = new AndroidContentCaptureManagerTranslateStatus(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 3);
                    getpostalcode.write(objComponentActivity3);
                } else {
                    int i19 = write + 91;
                    IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    if (objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = new AndroidContentCaptureManagerTranslateStatus(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 3);
                        getpostalcode.write(objComponentActivity3);
                    }
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity3;
                if ((57344 & i2) == 16384) {
                    int i21 = IconCompatParcelizer + 47;
                    write = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object objComponentActivity4 = getpostalcode.ComponentActivity();
                if (z2) {
                    objComponentActivity4 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(25, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                    getpostalcode.write(objComponentActivity4);
                } else {
                    int i23 = write + 23;
                    IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                    if (i23 % 2 != 0) {
                        throw null;
                    }
                    if (objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(25, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                        getpostalcode.write(objComponentActivity4);
                    }
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4;
                boolean z6 = (458752 & i2) == 131072;
                Object objComponentActivity5 = getpostalcode.ComponentActivity();
                if (z6 || objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(26, r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                    getpostalcode.write(objComponentActivity5);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm7 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5;
                boolean z7 = (3670016 & i2) == 1048576;
                Object objComponentActivity6 = getpostalcode.ComponentActivity();
                if (z7 || objComponentActivity6 == androidContentCaptureManager) {
                    objComponentActivity6 = new AndroidContentCaptureManagerTranslateStatus(r8lambdaunavo3sxub_pc9xroryotnrlvsm3, 4);
                    getpostalcode.write(objComponentActivity6);
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde3 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity6;
                boolean z8 = (29360128 & i2) == 8388608;
                Object objComponentActivity7 = getpostalcode.ComponentActivity();
                if (z8) {
                    objComponentActivity7 = new AndroidContentCaptureManagerTranslateStatus(r8lambdaunavo3sxub_pc9xroryotnrlvsm4, 5);
                    getpostalcode.write(objComponentActivity7);
                } else {
                    int i24 = IconCompatParcelizer + 13;
                    write = i24 % Fields.SpotShadowColor;
                    int i25 = i24 % 2;
                    if (objComponentActivity7 == androidContentCaptureManager) {
                        objComponentActivity7 = new AndroidContentCaptureManagerTranslateStatus(r8lambdaunavo3sxub_pc9xroryotnrlvsm4, 5);
                        getpostalcode.write(objComponentActivity7);
                    }
                }
                CardCashPaymentTaskUiItem$Companion cardCashPaymentTaskUiItem$Companion = getEnterjXw82LU.Companion;
                read(getenterjxw82lu, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaunavo3sxub_pc9xroryotnrlvsm5, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdaunavo3sxub_pc9xroryotnrlvsm6, r8lambdaunavo3sxub_pc9xroryotnrlvsm7, r8lambdaa6_tctqmksh3fk6hjgcbkuvde3, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity7, modifier, getpostalcode, (234881024 & i2) | 8);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-598756132);
                getpostalcode.IconCompatParcelizer(false);
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat == null) {
                    return;
                }
                final int i26 = 0;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.AnimatedVisibilityComposeAnimation
                    private static int ParcelableVolumeInfo = 0;
                    private static int PlaybackStateCompat = 1;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i27 = 2 % 2;
                        int i28 = i26;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i29 = i;
                        if (i28 != 0) {
                            ((Integer) obj2).getClass();
                            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i29 | 1);
                            CardCashPaymentKt.read(cardCashPaymentTaskUiModelImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, modifier, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
                            int i30 = PlaybackStateCompat + 35;
                            ParcelableVolumeInfo = i30 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i31 = i30 % 2;
                            return createfromparcel;
                        }
                        ((Integer) obj2).getClass();
                        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i29 | 1);
                        CardCashPaymentKt.read(cardCashPaymentTaskUiModelImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, modifier, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
                        int i32 = PlaybackStateCompat + 49;
                        ParcelableVolumeInfo = i32 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i33 = i32 % 2;
                        return createfromparcel;
                    }
                };
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i27 = 1;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.AnimatedVisibilityComposeAnimation
                private static int ParcelableVolumeInfo = 0;
                private static int PlaybackStateCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i28 = 2 % 2;
                    int i29 = i27;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i210 = i;
                    if (i29 != 0) {
                        ((Integer) obj2).getClass();
                        int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i210 | 1);
                        CardCashPaymentKt.read(cardCashPaymentTaskUiModelImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, modifier, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
                        int i30 = PlaybackStateCompat + 35;
                        ParcelableVolumeInfo = i30 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i31 = i30 % 2;
                        return createfromparcel;
                    }
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i210 | 1);
                    CardCashPaymentKt.read(cardCashPaymentTaskUiModelImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, modifier, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
                    int i32 = PlaybackStateCompat + 49;
                    ParcelableVolumeInfo = i32 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i33 = i32 % 2;
                    return createfromparcel;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
    }

    public static final void Done(getEnterjXw82LU getenterjxw82lu, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-360344543);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode2.read(getenterjxw82lu) : getpostalcode2.IconCompatParcelizer(getenterjxw82lu) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!getpostalcode2.read(modifier)) {
                i3 = 16;
            } else {
                int i5 = write + 1;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                i3 = i5 % 2 != 0 ? 116 : 32;
            }
            i2 |= i3;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 19) != 18)) {
            int i6 = write + 117;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            Modifier modifierWrite = AnimationModifierKt.write(SizeKt.write(modifier, 1.0f), null, 3);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i8 = IconCompatParcelizer + 123;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            TextKt.m131TextNvy7gAk(getenterjxw82lu.title, null, BuildersKt.MediaBrowserCompatMediaItem(getpostalcode2), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.onMultiWindowModeChanged.MediaSessionCompatResultReceiverWrapper(), getpostalcode2, 0, 0, 131066);
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifier2 = SizeKt.read(companion3, 0.0f, Dp.m3673constructorimpl(48.0f), 1);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(playbackStateCompatCustomAction, centerVertically, getpostalcode2, 48);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifier2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i10 = IconCompatParcelizer + 87;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            int i12 = IconCompatParcelizer + 91;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            TextKt.m131TextNvy7gAk(getenterjxw82lu.MediaSessionCompatQueueItem(), null, BuildersKt.MediaBrowserCompatMediaItem(getpostalcode2), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaMetadataCompat(), getpostalcode2, 0, 0, 131066);
            float f = Dimensions.setPrimaryBackground;
            Object[] objArr = {getpostalcode2, SizeKt.m86width3ABfNKs(companion3, f)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
            TextKt.m131TextNvy7gAk(getenterjxw82lu.RatingCompat(), null, BuildersKt.MediaBrowserCompatMediaItem(getpostalcode2), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaMetadataCompat(), getpostalcode2, 0, 0, 131066);
            Object[] objArr2 = {getpostalcode2, SizeKt.m86width3ABfNKs(companion3, f)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr2);
            TextKt.m131TextNvy7gAk(getenterjxw82lu.successPaidWithText, null, BuildersKt.MediaBrowserCompatMediaItem(getpostalcode2), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.serializer(), getpostalcode2, 0, 0, 131066);
            getpostalcode2.IconCompatParcelizer(true);
            Object[] objArr3 = {getpostalcode2, SizeKt.m75height3ABfNKs(companion3, Dimensions.setMenu)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr3);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion.getTop(), getpostalcode2, 0);
            int iHashCode3 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode2, companion3);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor3);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode3), getpostalcode2));
            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_bold_medium_tick_circle_filled, getpostalcode2, 0), (String) null, (Modifier) null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportBackgroundTintList(), getpostalcode2, Painter.$stable | 48, 4);
            Object[] objArr4 = {getpostalcode2, SizeKt.m86width3ABfNKs(companion3, f)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr4);
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(getenterjxw82lu.successText, null, BuildersKt.MediaMetadataCompat(getpostalcode2), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 20, getenterjxw82lu, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0276  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:128:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:130:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:136:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:139:0x03cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:145:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:151:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:154:0x0400  */
    /* JADX WARN: Code duplicated, block: B:155:0x0402  */
    /* JADX WARN: Code duplicated, block: B:158:0x0406  */
    /* JADX WARN: Code duplicated, block: B:164:0x0413  */
    /* JADX WARN: Code duplicated, block: B:167:0x041c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x0422  */
    /* JADX WARN: Code duplicated, block: B:172:0x0443  */
    /* JADX WARN: Code duplicated, block: B:93:0x0259  */
    public static final void ChangeAmount(getEnterjXw82LU getenterjxw82lu, CashPaymentTaskUiItem cashPaymentTaskUiItem, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        boolean z2;
        int i3;
        boolean z3;
        Object objComponentActivity;
        int i4;
        boolean z4;
        Object objComponentActivity2;
        int i5;
        boolean z5;
        boolean z6;
        boolean z7;
        Object objComponentActivity3;
        int i6;
        int i7 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(2036847442);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode2.read(getenterjxw82lu) : getpostalcode2.IconCompatParcelizer(getenterjxw82lu) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = write + 31;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 |= (i & 64) == 0 ? getpostalcode2.read(cashPaymentTaskUiItem) : getpostalcode2.IconCompatParcelizer(cashPaymentTaskUiItem) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? Fields.CameraDistance : Fields.RotationZ;
        } else {
            int i10 = write + 17;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                int i12 = IconCompatParcelizer + 27;
                write = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i6 = Fields.Clip;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode2.read(modifier) ? 1048576 : Fields.BlendMode;
        }
        int i14 = i2;
        if (!getpostalcode2.write(i14 & 1, (599187 & i14) != 599186)) {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            getpostalcode = getpostalcode2;
        } else {
            Modifier modifierWrite = AnimationModifierKt.write(SizeKt.write(modifier, 1.0f), null, 3);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i15 = IconCompatParcelizer + 91;
            write = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i17 = IconCompatParcelizer + 41;
                write = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    getpostalcode2.serializer(constructor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierWrite2 = SizeKt.write(companion3, 1.0f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, centerVertically, getpostalcode2, 48);
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
            String str = getenterjxw82lu.title;
            TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
            Modifier modifierM = d$$ExternalSyntheticOutline0.m(1.0f, true, companion3);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, modifierM, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setOverlayMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, 0, 0, 131064);
            CashPaymentTaskUiItem.Companion companion4 = CashPaymentTaskUiItem.Companion;
            CardCashPaymentTaskUiItem$Companion cardCashPaymentTaskUiItem$Companion = getEnterjXw82LU.Companion;
            getpostalcode = getpostalcode2;
            ActionButtons(cashPaymentTaskUiItem, getenterjxw82lu, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, getpostalcode2, ((i14 >> 3) & 14) | 72 | ((i14 << 3) & 112) | (i14 & 896) | (i14 & 7168));
            getpostalcode.IconCompatParcelizer(true);
            boolean z8 = getpostalcode.read(cashPaymentTaskUiItem.taskId);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z8 || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = CompositionKt.RemoteActionCompatParcelizer(cashPaymentTaskUiItem.RemoteActionCompatParcelizer());
                getpostalcode.write(objComponentActivity4);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity4;
            String strRemoteActionCompatParcelizer = cashPaymentTaskUiItem.RemoteActionCompatParcelizer();
            boolean z9 = getpostalcode.read(populateViewStructure_androidKtpopulate7);
            int i18 = i14 & 112;
            if (i18 != 32) {
                int i19 = IconCompatParcelizer + 19;
                write = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                if ((i14 & 64) == 0 || !getpostalcode.IconCompatParcelizer(cashPaymentTaskUiItem)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (!z9 && !z) {
                int i21 = write + 65;
                IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                if (i21 % 2 != 0) {
                    int i22 = 36 / 0;
                    if (objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = new CashPaymentKt$CashTaskColumn$2$1(cashPaymentTaskUiItem, populateViewStructure_androidKtpopulate7, null, 1);
                        getpostalcode.write(objComponentActivity5);
                    }
                } else if (objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = new CashPaymentKt$CashTaskColumn$2$1(cashPaymentTaskUiItem, populateViewStructure_androidKtpopulate7, null, 1);
                    getpostalcode.write(objComponentActivity5);
                }
            } else {
                objComponentActivity5 = new CashPaymentKt$CashTaskColumn$2$1(cashPaymentTaskUiItem, populateViewStructure_androidKtpopulate7, null, 1);
                getpostalcode.write(objComponentActivity5);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, strRemoteActionCompatParcelizer, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity5);
            String str2 = (String) populateViewStructure_androidKtpopulate7.getValue();
            boolean zIsInEditMode = cashPaymentTaskUiItem.uiMode.isInEditMode();
            String str3 = cashPaymentTaskUiItem.formattedOriginalAmount;
            String str4 = cashPaymentTaskUiItem.currency;
            getCenterHorizontally getcenterhorizontally = new getCenterHorizontally(KeyboardType.Companion.m3316getDecimalPjHm6EE(), 0, 123);
            boolean z10 = getpostalcode.read(populateViewStructure_androidKtpopulate7);
            if ((i14 & 57344) == 16384) {
                z2 = true;
            } else {
                int i23 = IconCompatParcelizer + 79;
                write = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                z2 = false;
            }
            int i25 = i14 & 14;
            if (i25 != 4) {
                int i26 = write + 35;
                i3 = i25;
                IconCompatParcelizer = i26 % Fields.SpotShadowColor;
                if (i26 % 2 == 0 ? (i14 & 8) != 0 : (i14 & 87) != 0) {
                    if (getpostalcode.IconCompatParcelizer(getenterjxw82lu)) {
                    }
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (!(z10 | z2 | z3) || objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getenterjxw82lu, populateViewStructure_androidKtpopulate7, 29);
                        getpostalcode.write(objComponentActivity);
                    }
                    i4 = i3;
                    TextInputBigV2Kt.TextInputBigV2(str2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, companion3, zIsInEditMode, null, str3, null, null, false, null, null, false, 0, getcenterhorizontally, null, str4, null, "cardCashPaymentEditTextTestTag", null, getpostalcode, 384, 196608, 48, 5996464);
                    float f = Dimensions.setMenu;
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f)});
                    TextKt.m131TextNvy7gAk(getenterjxw82lu.description, SizeKt.write(companion3, 1.0f), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getActionBarHideOffset(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 48, 0, 131064);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f)});
                    if (cashPaymentTaskUiItem.reasons != null) {
                        getpostalcode.serializer(394852802);
                        String strMediaBrowserCompatMediaItem = cashPaymentTaskUiItem.MediaBrowserCompatMediaItem();
                        boolean zMediaSessionCompatToken = cashPaymentTaskUiItem.MediaSessionCompatToken();
                        if (i18 != 32 || ((i14 & 64) != 0 && getpostalcode.IconCompatParcelizer(cashPaymentTaskUiItem))) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objComponentActivity2 = getpostalcode.ComponentActivity();
                        if (!z4 || objComponentActivity2 == androidContentCaptureManager) {
                            i5 = 1;
                            objComponentActivity2 = new animatedContentSearchlambda0(cashPaymentTaskUiItem, 1);
                            getpostalcode.write(objComponentActivity2);
                        } else {
                            i5 = 1;
                        }
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion3, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, i5, null);
                        modifierSemantics$default.getClass();
                        if (i18 != 32 || ((i14 & 64) != 0 && getpostalcode.IconCompatParcelizer(cashPaymentTaskUiItem))) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if ((i14 & 458752) == 131072) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (i4 != 4 || ((i14 & 8) != 0 && getpostalcode.IconCompatParcelizer(getenterjxw82lu))) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        objComponentActivity3 = getpostalcode.ComponentActivity();
                        if (!(z6 | z5 | z7) || objComponentActivity3 == androidContentCaptureManager) {
                            objComponentActivity3 = new n$$ExternalSyntheticLambda3(cashPaymentTaskUiItem, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, getenterjxw82lu, 21);
                            getpostalcode.write(objComponentActivity3);
                        }
                        DropdownKt.read(strMediaBrowserCompatMediaItem, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, modifierSemantics$default, zMediaSessionCompatToken, 0, null, getpostalcode, 0, 112);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(395500826);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    int i27 = IconCompatParcelizer + 69;
                    write = i27 % Fields.SpotShadowColor;
                    int i28 = i27 % 2;
                    getpostalcode.IconCompatParcelizer(true);
                }
                z3 = false;
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!(z10 | z2) && !z3) {
                    objComponentActivity = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getenterjxw82lu, populateViewStructure_androidKtpopulate7, 29);
                    getpostalcode.write(objComponentActivity);
                } else {
                    objComponentActivity = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getenterjxw82lu, populateViewStructure_androidKtpopulate7, 29);
                    getpostalcode.write(objComponentActivity);
                }
                i4 = i3;
                TextInputBigV2Kt.TextInputBigV2(str2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, companion3, zIsInEditMode, null, str3, null, null, false, null, null, false, 0, getcenterhorizontally, null, str4, null, "cardCashPaymentEditTextTestTag", null, getpostalcode, 384, 196608, 48, 5996464);
                float f2 = Dimensions.setMenu;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f2)});
                TextKt.m131TextNvy7gAk(getenterjxw82lu.description, SizeKt.write(companion3, 1.0f), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getActionBarHideOffset(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 48, 0, 131064);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f2)});
                if (cashPaymentTaskUiItem.reasons != null) {
                    getpostalcode.serializer(394852802);
                    String strMediaBrowserCompatMediaItem2 = cashPaymentTaskUiItem.MediaBrowserCompatMediaItem();
                    boolean zMediaSessionCompatToken2 = cashPaymentTaskUiItem.MediaSessionCompatToken();
                    if (i18 != 32) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (z4) {
                        i5 = 1;
                        objComponentActivity2 = new animatedContentSearchlambda0(cashPaymentTaskUiItem, 1);
                        getpostalcode.write(objComponentActivity2);
                    } else {
                        i5 = 1;
                        objComponentActivity2 = new animatedContentSearchlambda0(cashPaymentTaskUiItem, 1);
                        getpostalcode.write(objComponentActivity2);
                    }
                    Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(companion3, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, i5, null);
                    modifierSemantics$default2.getClass();
                    if (i18 != 32) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if ((i14 & 458752) == 131072) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (i4 != 4) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    objComponentActivity3 = getpostalcode.ComponentActivity();
                    if (!(z6 | z5) && !z7) {
                        objComponentActivity3 = new n$$ExternalSyntheticLambda3(cashPaymentTaskUiItem, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, getenterjxw82lu, 21);
                        getpostalcode.write(objComponentActivity3);
                    } else {
                        objComponentActivity3 = new n$$ExternalSyntheticLambda3(cashPaymentTaskUiItem, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, getenterjxw82lu, 21);
                        getpostalcode.write(objComponentActivity3);
                    }
                    DropdownKt.read(strMediaBrowserCompatMediaItem2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, modifierSemantics$default2, zMediaSessionCompatToken2, 0, null, getpostalcode, 0, 112);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(395500826);
                    getpostalcode.IconCompatParcelizer(false);
                }
                int i29 = IconCompatParcelizer + 69;
                write = i29 % Fields.SpotShadowColor;
                int i210 = i29 % 2;
                getpostalcode.IconCompatParcelizer(true);
            } else {
                i3 = i25;
            }
            z3 = true;
            objComponentActivity = getpostalcode.ComponentActivity();
            if (!(z10 | z2) && !z3) {
                objComponentActivity = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getenterjxw82lu, populateViewStructure_androidKtpopulate7, 29);
                getpostalcode.write(objComponentActivity);
            } else {
                objComponentActivity = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getenterjxw82lu, populateViewStructure_androidKtpopulate7, 29);
                getpostalcode.write(objComponentActivity);
            }
            i4 = i3;
            TextInputBigV2Kt.TextInputBigV2(str2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, companion3, zIsInEditMode, null, str3, null, null, false, null, null, false, 0, getcenterhorizontally, null, str4, null, "cardCashPaymentEditTextTestTag", null, getpostalcode, 384, 196608, 48, 5996464);
            float f3 = Dimensions.setMenu;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f3)});
            TextKt.m131TextNvy7gAk(getenterjxw82lu.description, SizeKt.write(companion3, 1.0f), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getActionBarHideOffset(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 48, 0, 131064);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f3)});
            if (cashPaymentTaskUiItem.reasons != null) {
                getpostalcode.serializer(394852802);
                String strMediaBrowserCompatMediaItem3 = cashPaymentTaskUiItem.MediaBrowserCompatMediaItem();
                boolean zMediaSessionCompatToken3 = cashPaymentTaskUiItem.MediaSessionCompatToken();
                if (i18 != 32) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z4) {
                    i5 = 1;
                    objComponentActivity2 = new animatedContentSearchlambda0(cashPaymentTaskUiItem, 1);
                    getpostalcode.write(objComponentActivity2);
                } else {
                    i5 = 1;
                    objComponentActivity2 = new animatedContentSearchlambda0(cashPaymentTaskUiItem, 1);
                    getpostalcode.write(objComponentActivity2);
                }
                Modifier modifierSemantics$default3 = SemanticsModifierKt.semantics$default(companion3, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, i5, null);
                modifierSemantics$default3.getClass();
                if (i18 != 32) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if ((i14 & 458752) == 131072) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (i4 != 4) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                objComponentActivity3 = getpostalcode.ComponentActivity();
                if (!(z6 | z5) && !z7) {
                    objComponentActivity3 = new n$$ExternalSyntheticLambda3(cashPaymentTaskUiItem, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, getenterjxw82lu, 21);
                    getpostalcode.write(objComponentActivity3);
                } else {
                    objComponentActivity3 = new n$$ExternalSyntheticLambda3(cashPaymentTaskUiItem, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, getenterjxw82lu, 21);
                    getpostalcode.write(objComponentActivity3);
                }
                DropdownKt.read(strMediaBrowserCompatMediaItem3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, modifierSemantics$default3, zMediaSessionCompatToken3, 0, null, getpostalcode, 0, 112);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(395500826);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i211 = IconCompatParcelizer + 69;
            write = i211 % Fields.SpotShadowColor;
            int i212 = i211 % 2;
            getpostalcode.IconCompatParcelizer(true);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScopeImpl(getenterjxw82lu, cashPaymentTaskUiItem, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, modifier, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:206:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:207:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:209:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:210:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:215:0x0708  */
    /* JADX WARN: Code duplicated, block: B:218:0x0739  */
    /* JADX WARN: Code duplicated, block: B:219:0x074f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:220:0x0751  */
    /* JADX WARN: Code duplicated, block: B:221:0x076d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e9  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void DefaultState(final getEnterjXw82LU getenterjxw82lu, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        CardCashPaymentTaskUiItem$PaymentType cardCashPaymentTaskUiItem$PaymentType;
        CallGroup callGroup;
        int i4;
        CardCashPaymentTaskUiItem$PaymentStatus cardCashPaymentTaskUiItem$PaymentStatus;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        final int i5;
        boolean z7;
        boolean z8;
        int i6;
        int i7;
        int i8 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-796310966);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode2.read(getenterjxw82lu) : getpostalcode2.IconCompatParcelizer(getenterjxw82lu) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                int i9 = write + 11;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                i7 = i9 % 2 != 0 ? 59 : 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            int i10 = write + 1;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                int i11 = 49 / 0;
                if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i6 = Fields.RotationX;
                } else {
                    i6 = Fields.SpotShadowColor;
                }
            } else if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i6 = Fields.RotationX;
            } else {
                i6 = Fields.SpotShadowColor;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode2.read(modifier) ? Fields.Clip : 8192;
            int i12 = write + 73;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 9363) != 9362)) {
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
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            CashPaymentTaskUiItem cashPaymentTaskUiItem = getenterjxw82lu.cashItem;
            CardCashPaymentTaskUiItem$PaymentStatus cardCashPaymentTaskUiItem$PaymentStatus2 = getenterjxw82lu.status;
            CallGroup callGroup2 = getenterjxw82lu.cardItem;
            CardCashPaymentTaskUiItem$PaymentType cardCashPaymentTaskUiItem$PaymentType2 = getenterjxw82lu.paymentType;
            CardCashPaymentTaskUiItem$PaymentType cardCashPaymentTaskUiItem$PaymentType3 = CardCashPaymentTaskUiItem$PaymentType.CASH;
            boolean z9 = cardCashPaymentTaskUiItem$PaymentType2 == cardCashPaymentTaskUiItem$PaymentType3 && cashPaymentTaskUiItem != null && cashPaymentTaskUiItem.editable;
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
            TextKt.m131TextNvy7gAk(getenterjxw82lu.title, null, BuildersKt.MediaBrowserCompatMediaItem(getpostalcode2), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.onMultiWindowModeChanged.MediaSessionCompatResultReceiverWrapper(), getpostalcode2, 0, 0, 131066);
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (!z9 || cashPaymentTaskUiItem == null) {
                getpostalcode2.serializer(949223902);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(948936129);
                String str = cashPaymentTaskUiItem.actionTitle;
                boolean z10 = getenterjxw82lu.isActive;
                if ((i2 & 896) == 256) {
                    int i14 = IconCompatParcelizer + 29;
                    write = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    z7 = true;
                } else {
                    z7 = false;
                }
                if ((i2 & 14) != 4) {
                    if ((i2 & 8) != 0) {
                        int i16 = IconCompatParcelizer + 111;
                        write = i16 % Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                        z8 = getpostalcode2.IconCompatParcelizer(getenterjxw82lu);
                    }
                }
                Object objComponentActivity = getpostalcode2.ComponentActivity();
                if ((z8 | z7) || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new AnimateXAsStateComposeAnimationCompanion(r8lambdaunavo3sxub_pc9xroryotnrlvsm, getenterjxw82lu, 0);
                    getpostalcode2.write(objComponentActivity);
                }
                TertiaryKt.IconCompatParcelizer(str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, companion3, z10, 0, null, null, null, getpostalcode2, 384, 240);
                getpostalcode2.IconCompatParcelizer(false);
            }
            getpostalcode2.IconCompatParcelizer(true);
            float f = Dimensions.setPrimaryBackground;
            Modifier.Companion companion4 = companion3;
            Modifier modifierWrite3 = AnimationModifierKt.write(af$$ExternalSyntheticOutline1.m(companion4, f, getpostalcode2, companion4, 1.0f), null, 3);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer, companion.getStart(), getpostalcode2, 6);
            int iHashCode3 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite3);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i18 = write + 1;
                IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                if (i18 % 2 != 0) {
                    getpostalcode2.serializer(constructor3);
                    int i19 = 88 / 0;
                } else {
                    getpostalcode2.serializer(constructor3);
                }
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode3), getpostalcode2));
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion.getTop(), getpostalcode2, 0);
            int iHashCode4 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode2, companion4);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion2.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i20 = IconCompatParcelizer + 17;
                write = i20 % Fields.SpotShadowColor;
                if (i20 % 2 == 0) {
                    getpostalcode2.serializer(constructor4);
                    throw null;
                }
                getpostalcode2.serializer(constructor4);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer4);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode4), getpostalcode2));
            TextKt.m131TextNvy7gAk(getenterjxw82lu.MediaSessionCompatQueueItem(), null, BuildersKt.MediaBrowserCompatMediaItem(getpostalcode2), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaMetadataCompat(), getpostalcode2, 0, 0, 131066);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m86width3ABfNKs(companion4, f)});
            TextKt.m131TextNvy7gAk(getenterjxw82lu.RatingCompat(), companion4, BuildersKt.MediaBrowserCompatMediaItem(getpostalcode2), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaMetadataCompat(), getpostalcode2, 48, 0, 131064);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, companion4.then(new show(1.0f, true))});
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m86width3ABfNKs(companion4, f)});
            if (cashPaymentTaskUiItem != null) {
                getpostalcode2.serializer(523139008);
                callGroup = callGroup2;
                String str2 = callGroup.title;
                if (cardCashPaymentTaskUiItem$PaymentType == CardCashPaymentTaskUiItem$PaymentType.CARD) {
                    cardCashPaymentTaskUiItem$PaymentType = cardCashPaymentTaskUiItem$PaymentType2;
                    z4 = true;
                } else {
                    cardCashPaymentTaskUiItem$PaymentType = cardCashPaymentTaskUiItem$PaymentType2;
                    z4 = false;
                }
                int i21 = i2 & 14;
                boolean z11 = i21 == 4 || ((i2 & 8) != 0 && getpostalcode2.IconCompatParcelizer(getenterjxw82lu));
                Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                if (z11 || objComponentActivity2 == androidContentCaptureManager) {
                    z5 = false;
                    final Object[] objArr = 0 == true ? 1 : 0;
                    objComponentActivity2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.parseAnimatedContent
                        private static int IconCompatParcelizer = 0;
                        private static int serializer = 1;

                        /* JADX WARN: Code duplicated, block: B:8:0x0023  */
                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj) {
                            boolean z12;
                            int i22 = 2 % 2;
                            int i23 = objArr;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            getEnterjXw82LU getenterjxw82lu2 = getenterjxw82lu;
                            androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver = (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj;
                            if (i23 == 0) {
                                semanticsPropertyReceiver.getClass();
                                androidx.compose.ui.semantics.SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, getenterjxw82lu2.paymentType == CardCashPaymentTaskUiItem$PaymentType.CARD);
                                int i24 = IconCompatParcelizer + 81;
                                serializer = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i25 = i24 % 2;
                                return createfromparcel;
                            }
                            semanticsPropertyReceiver.getClass();
                            if (getenterjxw82lu2.paymentType == CardCashPaymentTaskUiItem$PaymentType.CASH) {
                                int i26 = serializer + 93;
                                IconCompatParcelizer = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                z12 = i26 % 2 == 0;
                            }
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z12);
                            return createfromparcel;
                        }
                    };
                    getpostalcode2.write(objComponentActivity2);
                } else {
                    z5 = false;
                }
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion4, z5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, 1, null);
                modifierSemantics$default.getClass();
                UtilNetworking1 utilNetworking1 = new UtilNetworking1(str2, modifierSemantics$default, z4);
                String str3 = cashPaymentTaskUiItem.title;
                boolean z12 = cardCashPaymentTaskUiItem$PaymentType == cardCashPaymentTaskUiItem$PaymentType3;
                int i22 = IconCompatParcelizer + 7;
                write = i22 % Fields.SpotShadowColor;
                if (i22 % 2 != 0 ? i21 == 4 : i21 == 2) {
                    z6 = true;
                } else if ((i2 & 8) == 0 || !getpostalcode2.IconCompatParcelizer(getenterjxw82lu)) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                Object objComponentActivity3 = getpostalcode2.ComponentActivity();
                if (z6 || objComponentActivity3 == androidContentCaptureManager) {
                    i5 = 1;
                    objComponentActivity3 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.parseAnimatedContent
                        private static int IconCompatParcelizer = 0;
                        private static int serializer = 1;

                        /* JADX WARN: Code duplicated, block: B:8:0x0023  */
                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj) {
                            boolean z13;
                            int i23 = 2 % 2;
                            int i24 = i5;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            getEnterjXw82LU getenterjxw82lu2 = getenterjxw82lu;
                            androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver = (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj;
                            if (i24 == 0) {
                                semanticsPropertyReceiver.getClass();
                                androidx.compose.ui.semantics.SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, getenterjxw82lu2.paymentType == CardCashPaymentTaskUiItem$PaymentType.CARD);
                                int i25 = IconCompatParcelizer + 81;
                                serializer = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i26 = i25 % 2;
                                return createfromparcel;
                            }
                            semanticsPropertyReceiver.getClass();
                            if (getenterjxw82lu2.paymentType == CardCashPaymentTaskUiItem$PaymentType.CASH) {
                                int i27 = serializer + 93;
                                IconCompatParcelizer = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                z13 = i27 % 2 == 0;
                            }
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z13);
                            return createfromparcel;
                        }
                    };
                    getpostalcode2.write(objComponentActivity3);
                } else {
                    i5 = 1;
                }
                Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(companion4, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, i5, null);
                modifierSemantics$default2.getClass();
                UtilNetworking1 utilNetworking2 = new UtilNetworking1(str3, modifierSemantics$default2, z12);
                List list = SQLite.read(utilNetworking1, utilNetworking2);
                boolean z13 = getenterjxw82lu.isActive;
                boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(utilNetworking2);
                boolean z14 = (i2 & 112) == 32;
                boolean z15 = i21 == 4 || ((i2 & 8) != 0 && getpostalcode2.IconCompatParcelizer(getenterjxw82lu));
                boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(utilNetworking1);
                Object objComponentActivity4 = getpostalcode2.ComponentActivity();
                if (((zIconCompatParcelizer | z14 | z15) || zIconCompatParcelizer2) || objComponentActivity4 == androidContentCaptureManager) {
                    i3 = i2;
                    getpostalcode = getpostalcode2;
                    objComponentActivity4 = new NavControllerImpl$$ExternalSyntheticLambda0(utilNetworking2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getenterjxw82lu, utilNetworking1, 11);
                    getpostalcode.write(objComponentActivity4);
                } else {
                    i3 = i2;
                    getpostalcode = getpostalcode2;
                }
                ToggleKt.ToggleBig(list, z13, companion4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, getpostalcode, 384);
                i4 = 0;
                getpostalcode.IconCompatParcelizer(false);
            } else {
                i3 = i2;
                companion4 = companion4;
                getpostalcode = getpostalcode2;
                flingCancellationException = flingCancellationException;
                cardCashPaymentTaskUiItem$PaymentType = cardCashPaymentTaskUiItem$PaymentType2;
                callGroup = callGroup2;
                i4 = 0;
                getpostalcode.serializer(524530536);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
            float f2 = Dimensions.setMenu;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion4, f2)});
            CardCashPaymentTaskUiItem$PaymentType cardCashPaymentTaskUiItem$PaymentType4 = CardCashPaymentTaskUiItem$PaymentType.CARD;
            if (cardCashPaymentTaskUiItem$PaymentType == cardCashPaymentTaskUiItem$PaymentType4) {
                cardCashPaymentTaskUiItem$PaymentStatus = cardCashPaymentTaskUiItem$PaymentStatus2;
                if (cardCashPaymentTaskUiItem$PaymentStatus == CardCashPaymentTaskUiItem$PaymentStatus.FAILED) {
                    String str4 = callGroup.errorTitle;
                    String str5 = callGroup.errorDescription;
                    if (str4.length() > 0 || str5.length() > 0) {
                        getpostalcode.serializer(-1169452675);
                        Modifier modifierWrite4 = SizeKt.write(companion4, 1.0f);
                        setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                        Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierWrite4, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setShowingForActionMode(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setItemInvoker));
                        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer3 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, i4);
                        int iHashCode5 = Long.hashCode(getpostalcode.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode.serializer();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor5 = companion2.getConstructor();
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            getpostalcode.serializer(constructor5);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer5);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode5), getpostalcode));
                        String str6 = callGroup.errorTitle;
                        float f3 = Dimensions.setTransitioning;
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion4, f3)});
                        if (str6.length() > 0) {
                            int i23 = write + 1;
                            IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                            int i24 = i23 % 2;
                            getpostalcode.serializer(337252538);
                            TextKt.m131TextNvy7gAk(str6, PaddingKt.m74paddingqDBjuR0$default(companion4, f3, 0.0f, f3, 0.0f, 10), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getWindowSystemUiVisibility(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131064);
                            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str5)) {
                                z3 = false;
                                getpostalcode.serializer(337846715);
                                getpostalcode.IconCompatParcelizer(false);
                            } else {
                                getpostalcode.serializer(337733317);
                                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion4, f)});
                                z3 = false;
                                getpostalcode.IconCompatParcelizer(false);
                            }
                            getpostalcode.IconCompatParcelizer(z3);
                        } else {
                            getpostalcode.serializer(337868539);
                            getpostalcode.IconCompatParcelizer(false);
                        }
                        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str5)) {
                            getpostalcode.serializer(338385371);
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            getpostalcode.serializer(337962810);
                            TextKt.m131TextNvy7gAk(str5, PaddingKt.m74paddingqDBjuR0$default(companion4, f3, 0.0f, f3, 0.0f, 10), BuildersKt.MediaBrowserCompatMediaItem(getpostalcode), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode, 0, 0, 131064);
                            getpostalcode.IconCompatParcelizer(false);
                        }
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion4, f3)});
                        getpostalcode.IconCompatParcelizer(true);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(true);
                    if (cardCashPaymentTaskUiItem$PaymentStatus == CardCashPaymentTaskUiItem$PaymentStatus.PROGRESS) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cardCashPaymentTaskUiItem$PaymentType == cardCashPaymentTaskUiItem$PaymentType4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z || z2) {
                        getpostalcode.serializer(-1985763304);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion4, f2)});
                    } else {
                        getpostalcode.serializer(-1429066462);
                    }
                    getpostalcode.IconCompatParcelizer(false);
                    if (!(!z)) {
                        getpostalcode.serializer(-1985760146);
                        CardCashPaymentTaskUiItem$Companion cardCashPaymentTaskUiItem$Companion = getEnterjXw82LU.Companion;
                        Progress(getenterjxw82lu, getpostalcode, (i3 & 14) | 8);
                        getpostalcode.IconCompatParcelizer(false);
                    } else if (z2) {
                        getpostalcode.serializer(-1985758682);
                        CardCashPaymentTaskUiItem$Companion cardCashPaymentTaskUiItem$Companion2 = getEnterjXw82LU.Companion;
                        IconCompatParcelizer(getenterjxw82lu, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, getpostalcode, (i3 & 14) | 8 | ((i3 >> 6) & 112));
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-1428930558);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    int i25 = IconCompatParcelizer + 5;
                    write = i25 % Fields.SpotShadowColor;
                    int i26 = i25 % 2;
                    getpostalcode.IconCompatParcelizer(true);
                }
            } else {
                cardCashPaymentTaskUiItem$PaymentStatus = r10;
            }
            getpostalcode.serializer(-1167625721);
            TextKt.m131TextNvy7gAk(getenterjxw82lu.description, null, BuildersKt.MediaBrowserCompatMediaItem(getpostalcode), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(true);
            if (cardCashPaymentTaskUiItem$PaymentStatus == CardCashPaymentTaskUiItem$PaymentStatus.PROGRESS) {
                z = true;
            } else {
                z = false;
            }
            if (cardCashPaymentTaskUiItem$PaymentType == cardCashPaymentTaskUiItem$PaymentType4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                getpostalcode.serializer(-1985763304);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion4, f2)});
            } else {
                getpostalcode.serializer(-1985763304);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion4, f2)});
            }
            getpostalcode.IconCompatParcelizer(false);
            if (!(!z)) {
                getpostalcode.serializer(-1985760146);
                CardCashPaymentTaskUiItem$Companion cardCashPaymentTaskUiItem$Companion3 = getEnterjXw82LU.Companion;
                Progress(getenterjxw82lu, getpostalcode, (i3 & 14) | 8);
                getpostalcode.IconCompatParcelizer(false);
            } else if (z2) {
                getpostalcode.serializer(-1985758682);
                CardCashPaymentTaskUiItem$Companion cardCashPaymentTaskUiItem$Companion4 = getEnterjXw82LU.Companion;
                IconCompatParcelizer(getenterjxw82lu, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, getpostalcode, (i3 & 14) | 8 | ((i3 >> 6) & 112));
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1428930558);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i27 = IconCompatParcelizer + 5;
            write = i27 % Fields.SpotShadowColor;
            int i28 = i27 % 2;
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM((Object) getenterjxw82lu, (Object) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, modifier, i, 20);
        }
    }
}
