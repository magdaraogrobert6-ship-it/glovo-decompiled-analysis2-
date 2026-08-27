package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.CalculatorState;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferButtonState;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewState;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.home.nest.NestFragment$$ExternalSyntheticLambda1;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFontTypefaceLoader;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.ArrangementCenter1;
import o.BoxMeasurePolicy;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.TextFieldDefaults;
import o.attachAllAnimations;
import o.buildMapping;
import o.computeVerticalScrollExtent;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getNewPassword;
import o.getPostalCode;
import o.getStore;
import o.handleUrlOverridelambda1;
import o.performFling;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.placeSpaceBetweenfoundation_layout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8;
import o.r8lambdafDO76o9OYYvjKpysJSsx90eBs8;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.requiredWidthInVpY3zN4default;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;
import o.trigger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TransferChangeScreenKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static final void write(r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8 r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-165490181);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i4 = IconCompatParcelizer + 57;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                zIconCompatParcelizer = getpostalcode2.read(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 3) != 2)) {
            getpostalcode = getpostalcode2;
            SurfaceKt.m126SurfaceT9BRK9s(null, RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setChecked), ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowIcon(), 0L, 0.0f, 0.0f, null, ExtrasKt.write(-290235136, new NestFragment$$ExternalSyntheticLambda1(8, r8lambdacmvjstjhw3hzog60vfqxbrs6hs8), getpostalcode2), getpostalcode2, 12582912, 121);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, i, 18);
        }
        int i6 = IconCompatParcelizer + 91;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    public static final void read(r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8 r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer + 119;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(107158741);
        if ((i & 6) == 0) {
            int i6 = read;
            int i7 = i6 + 9;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if ((i & 8) == 0) {
                int i9 = i6 + 15;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    getpostalcode.read(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                zIconCompatParcelizer = getpostalcode.read(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i10 = IconCompatParcelizer + 21;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            String str = r8lambdacmvjstjhw3hzog60vfqxbrs6hs8.toolbarTitle;
            Modifier.Companion companion = Modifier.Companion;
            companion.getClass();
            HeaderKt.serializer(companion, str, 0L, ExtrasKt.write(-1521518995, new trigger(4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), null, null, null, getpostalcode, 24582, 236);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 22, r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00c8  */
    public static final void IconCompatParcelizer(TransferButtonState transferButtonState, r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8 r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2088779267);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(transferButtonState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z2 = true;
        if ((i & 48) == 0) {
            if ((i & 64) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8);
                int i4 = IconCompatParcelizer + 79;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                int i6 = read + 1;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    zIconCompatParcelizer = getpostalcode.read(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8);
                    int i7 = 72 / 0;
                } else {
                    zIconCompatParcelizer = getpostalcode.read(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8);
                }
            }
            i2 |= zIconCompatParcelizer ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i8 = IconCompatParcelizer + 43;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 256 : Fields.SpotShadowColor;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        if ((i2 & 147) != 146) {
            int i9 = IconCompatParcelizer + 3;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            String str = r8lambdacmvjstjhw3hzog60vfqxbrs6hs8.transferChangeButtonText;
            boolean z3 = (i2 & 896) == 256;
            if ((i2 & 112) != 32) {
                if ((i2 & 64) != 0) {
                    int i11 = IconCompatParcelizer + 79;
                    read = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 == 0) {
                        if (!getpostalcode.IconCompatParcelizer(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8)) {
                            z2 = false;
                        }
                    } else {
                        int i12 = 59 / 0;
                        if (!getpostalcode.IconCompatParcelizer(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8)) {
                            z2 = false;
                        }
                    }
                } else {
                    z2 = false;
                }
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z3 | z2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 9, r8lambdacmvjstjhw3hzog60vfqxbrs6hs8);
                getpostalcode.write(objComponentActivity);
            }
            Modifier modifierWrite = SizeKt.write(Modifier.Companion, 1.0f);
            modifierWrite.getClass();
            PrimaryKt.write(str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierWrite, transferButtonState.read, false, null, null, null, null, null, getpostalcode, 384, 0, 2032);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 19, transferButtonState, r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }

    public static final void Content(TransferChangeViewState transferChangeViewState, r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8 r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, p0 p0Var, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-740902359);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(transferChangeViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!((i & 64) == 0 ? getpostalcode.read(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8) : getpostalcode.IconCompatParcelizer(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8))) {
                i5 = 16;
            } else {
                int i7 = IconCompatParcelizer + 71;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 32;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            int i9 = IconCompatParcelizer + 75;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.read(p0Var)) {
                i4 = Fields.Clip;
            } else {
                int i10 = read + 75;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i3 = Fields.RenderEffect;
            } else {
                int i12 = read + 97;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i3 = 65536;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (74899 & i2) != 74898)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = PaddingKt.write(PagerWrapperFlingBehavior.IconCompatParcelizer(companion, PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14), Dimensions.setLogo);
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
            int i14 = IconCompatParcelizer + 21;
            read = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z = getpostalcode.ComponentActivity;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!(!getpostalcode.ComponentActivity)) {
                int i15 = read + 43;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    getpostalcode.serializer(constructor);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i16 = IconCompatParcelizer + 51;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            int i18 = r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8.$stable;
            int i19 = i2 >> 3;
            write(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, getpostalcode, (i19 & 14) | i18);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, Dimensions.getAnimatedVisibility)});
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                p0Var.getClass();
                objComponentActivity = attachAllAnimations.serializer;
                getpostalcode.write(objComponentActivity);
            }
            int i20 = i18 << 3;
            int i21 = i2 & 112;
            ((r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM) objComponentActivity).read(transferChangeViewState.RemoteActionCompatParcelizer, r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, Integer.valueOf((i2 & 896) | i20 | 24576 | i21 | ((i2 >> 6) & 7168)));
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, Dimensions.setTabContainer)});
            int i22 = i20 | i21;
            Calculator(transferChangeViewState.serializer, r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, getpostalcode, i22);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, Dimensions.setTransitioning)});
            IconCompatParcelizer(transferChangeViewState.IconCompatParcelizer, r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode, i22 | (i19 & 896));
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY(transferChangeViewState, r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, p0Var, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i);
        }
    }

    public static final void TransferChangeScreen(TransferChangeViewState transferChangeViewState, r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8 r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, p0 p0Var, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4;
        boolean zIconCompatParcelizer;
        int i5;
        int i6 = 2 % 2;
        transferChangeViewState.getClass();
        r8lambdacmvjstjhw3hzog60vfqxbrs6hs8.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        p0Var.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-172793236);
        if ((i & 6) == 0) {
            i2 = (!getpostalcode.read(transferChangeViewState) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                int i7 = IconCompatParcelizer + 23;
                read = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    zIconCompatParcelizer = getpostalcode.read(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8);
                    int i8 = 96 / 0;
                } else {
                    zIconCompatParcelizer = getpostalcode.read(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8);
                }
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8);
            }
            if (zIconCompatParcelizer) {
                int i9 = IconCompatParcelizer + 69;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            int i11 = read + 117;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i4 = Fields.RotationX;
            } else {
                int i13 = read + 115;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                int i15 = IconCompatParcelizer + 71;
                read = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        Object obj = null;
        if ((i & 24576) == 0) {
            int i17 = read + 111;
            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.read(p0Var) ? 1048576 : Fields.BlendMode;
        }
        int i18 = i2 | 12582912;
        if ((4793491 & i18) != 4793490) {
            int i19 = read + 13;
            IconCompatParcelizer = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i18 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierThen = companion.then(SizeKt.read);
            modifierThen.getClass();
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i21 = IconCompatParcelizer + 115;
                read = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i23 = IconCompatParcelizer + 67;
                read = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            int i25 = r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8.$stable;
            int i26 = i18 >> 3;
            read(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, (i26 & 14) | i25 | (i26 & 112));
            modifier2 = companion;
            Content(transferChangeViewState, r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, p0Var, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode, (i25 << 3) | (i18 & 14) | (i18 & 112) | (i26 & 896) | (i26 & 7168) | (57344 & (i18 >> 6)) | (458752 & i18));
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeVerticalScrollExtent(transferChangeViewState, r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, p0Var, modifier2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[PHI: r4 r5
  0x0053: PHI (r4v9 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v11 o.getPostalCode) binds: [B:8:0x0031, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0053: PHI (r5v25 o.getAddressCountry) = (r5v2 o.getAddressCountry), (r5v26 o.getAddressCountry) binds: [B:8:0x0031, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r4 r5
  0x0033: PHI (r4v6 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v11 o.getPostalCode) binds: [B:8:0x0031, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r5v3 o.getAddressCountry) = (r5v2 o.getAddressCountry), (r5v26 o.getAddressCountry) binds: [B:8:0x0031, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void Calculator(CalculatorState calculatorState, r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8 r8lambdacmvjstjhw3hzog60vfqxbrs6hs8, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        int i2;
        int i3;
        int i4;
        boolean z;
        long windowCallback;
        int i5 = 2 % 2;
        int i6 = read + 103;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-298200170);
            getaddresscountry = getpostalcode.read;
            if ((i & 28) == 0) {
                i2 = read + 79;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i7 = 15 / 0;
                    if (getpostalcode.read(calculatorState)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                } else if (getpostalcode.read(calculatorState)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-298200170);
            getaddresscountry = getpostalcode.read;
            if ((i & 6) == 0) {
                i2 = read + 79;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i8 = 15 / 0;
                    if (getpostalcode.read(calculatorState)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                } else if (getpostalcode.read(calculatorState)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        }
        if ((i & 48) == 0) {
            i4 |= !((i & 64) == 0 ? getpostalcode.read(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8) : getpostalcode.IconCompatParcelizer(r8lambdacmvjstjhw3hzog60vfqxbrs6hs8)) ? 16 : 32;
        }
        if (getpostalcode.write(i4 & 1, (i4 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion;
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i9 = IconCompatParcelizer + 83;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            String str = r8lambdacmvjstjhw3hzog60vfqxbrs6hs8.calculatorTitle;
            TextStyle textStyle = (TextStyle) performLayout.addOnMultiWindowModeChangedListener.MediaSessionCompatResultReceiverWrapper();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long jGenerateLayoutParams = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).generateLayoutParams();
            companion.getClass();
            TextKt.m131TextNvy7gAk(str, companion, jGenerateLayoutParams, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode, 48, 0, 131064);
            Modifier modifierM = af$$ExternalSyntheticOutline1.m(companion, Dimensions.setSplitBackground, getpostalcode, companion, 1.0f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.read, companion2.getTop(), getpostalcode, 6);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            String str2 = r8lambdacmvjstjhw3hzog60vfqxbrs6hs8.calculatorChangeAmountMessage;
            TextStyle textStyle2 = (TextStyle) performLayout.addOnPictureInPictureUiStateChangedListener.MediaSessionCompatResultReceiverWrapper();
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dimensions.setStackedBackground, 0.0f, 11);
            modifierM74paddingqDBjuR0$default.getClass();
            TextKt.m131TextNvy7gAk(str2, modifierM74paddingqDBjuR0$default, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setHasNonEmbeddedTabs(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle2, getpostalcode, 0, 0, 131064);
            if (calculatorState.serializer) {
                int i11 = IconCompatParcelizer + 111;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                getpostalcode.serializer(416539767);
                Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_medium_sync_two_direction, getpostalcode, 0);
                z = true;
                placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layoutIconCompatParcelizer = ArrangementCenter1.IconCompatParcelizer(ArrangementCenter1.read(null, getpostalcode, 1), 360.0f, 0.0f, DelayKt.RemoteActionCompatParcelizer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{800, 0, performFling.read, 2}), (BoxMeasurePolicy) null, 6), null, getpostalcode, 4536, 8);
                long presenter = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
                boolean z2 = getpostalcode.read(placespacebetweenfoundation_layoutIconCompatParcelizer);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (z2 || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new r8lambdafDO76o9OYYvjKpysJSsx90eBs8(placespacebetweenfoundation_layoutIconCompatParcelizer, 9);
                    getpostalcode.write(objComponentActivity);
                }
                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity);
                modifierGraphicsLayer.getClass();
                IconKt.m116Iconww6aTOc(painterPainterResource, "Loading", modifierGraphicsLayer, presenter, getpostalcode, Painter.$stable | 48, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                z = true;
                getpostalcode.serializer(417522963);
                String str3 = calculatorState.RemoteActionCompatParcelizer;
                TextStyle textStyle3 = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
                if (calculatorState.read) {
                    getpostalcode.serializer(429119001);
                    windowCallback = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getWindowSystemUiVisibility();
                } else {
                    getpostalcode.serializer(429119730);
                    windowCallback = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setWindowCallback();
                }
                long j = windowCallback;
                getpostalcode.IconCompatParcelizer(false);
                TextKt.m131TextNvy7gAk(str3, companion, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle3, getpostalcode, 48, 0, 131064);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(z);
            getpostalcode.IconCompatParcelizer(z);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 23, calculatorState, r8lambdacmvjstjhw3hzog60vfqxbrs6hs8);
        }
    }
}
