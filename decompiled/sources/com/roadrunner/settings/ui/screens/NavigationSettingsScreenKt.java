package com.roadrunner.settings.ui.screens;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticLambda28;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.forms.RadioButtonKt;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import com.roadrunner.settings.ui.components.PreferenceItemKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.RadioButton;
import o.ShortNewsContentCardView;
import o.TextFieldDefaults;
import o.buildMapping;
import o.canReadPlayIds;
import o.dc;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getLength;
import o.getNewPassword;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.p6;
import o.p7;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI;
import o.r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o;
import o.r8lambdaVgLfNFYp2qCVVXh_8D8TU6XRSCQ;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdabm6Xd4G6qvXesbF9M1n8iztWq4c;
import o.r8lambdacZGLsqbIi18k4n4AP4URd1_0N0w;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.shouldRetryAfterFailure;
import o.snapElevation;
import o.supportingTextPaddinga9UjIt4material3default;
import o.trigger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NavigationSettingsScreenKt {
    private static int read = 0;
    private static int serializer = 1;

    public static final void serializer(r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1290267490);
        boolean z = true;
        if ((i & 6) == 0) {
            if (!(!getpostalcode.read(r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c))) {
                i4 = 4;
            } else {
                int i6 = read + 33;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i3 = 32;
            } else {
                int i8 = read + 71;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = 16;
            }
            i2 |= i3;
        }
        int i10 = i2 | 384;
        if ((i10 & 147) != 146) {
            int i11 = serializer + 3;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        } else {
            z = false;
        }
        if (getpostalcode.write(i10 & 1, z)) {
            modifier = Modifier.Companion;
            PreferenceItemKt.serializer(r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c.write, null, r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c.read, r8lambdaunavo3sxub_pc9xroryotnrlvsm, PaddingKt.m74paddingqDBjuR0$default(modifier, Dimensions.setMenu, 0.0f, 0.0f, 0.0f, 14), r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c.IconCompatParcelizer, getpostalcode, ((i10 << 6) & 7168) | 48);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i13 = read + 21;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        }
        Modifier modifier2 = modifier;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 20, r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d A[PHI: r3
  0x004d: PHI (r3v13 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v15 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r3
  0x0030: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v15 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void serializer(int i, getBirthDateFull getbirthdatefull, Modifier modifier, r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI r8lambdav9hvubmv32qeolrxalsjens1hri, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        boolean z;
        Modifier modifier2;
        int i4;
        int i5 = 2 % 2;
        int i6 = serializer + 101;
        read = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1685604481);
            if ((i & 85) == 0) {
                if (!getpostalcode.read(r8lambdav9hvubmv32qeolrxalsjens1hri)) {
                    i2 = 2;
                } else {
                    int i7 = read + 29;
                    serializer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    i2 = 4;
                }
                i3 = i2 | i;
                int i9 = serializer + 91;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1685604481);
            if ((i & 6) == 0) {
                if (!getpostalcode.read(r8lambdav9hvubmv32qeolrxalsjens1hri)) {
                    i2 = 2;
                } else {
                    int i11 = read + 29;
                    serializer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    i2 = 4;
                }
                i3 = i2 | i;
                int i13 = serializer + 91;
                read = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            int i15 = read + 39;
            serializer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i17 = serializer + 119;
                read = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i19 = i3 | 384;
        if ((i19 & 147) != 146) {
            int i20 = read + 115;
            serializer = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i19 & 1, z)) {
            int i22 = read + 77;
            serializer = i22 % Fields.SpotShadowColor;
            int i23 = i22 % 2;
            Modifier.Companion companion = Modifier.Companion;
            SheetState sheetStateRemoteActionCompatParcelizer = ModalBottomSheetKt.RemoteActionCompatParcelizer(null, getpostalcode, 6, 2);
            boolean z2 = r8lambdav9hvubmv32qeolrxalsjens1hri.write;
            boolean z3 = (i19 & 14) == 4;
            boolean z4 = getpostalcode.read(sheetStateRemoteActionCompatParcelizer);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (!z4 && !z3) {
                int i24 = read + 43;
                serializer = i24 % Fields.SpotShadowColor;
                if (i24 % 2 == 0) {
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    throw null;
                }
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new RxConvertKt$asFlow$1(r8lambdav9hvubmv32qeolrxalsjens1hri, sheetStateRemoteActionCompatParcelizer, (ShortNewsContentCardView) null, 14);
                    getpostalcode.write(objComponentActivity);
                }
            } else {
                objComponentActivity = new RxConvertKt$asFlow$1(r8lambdav9hvubmv32qeolrxalsjens1hri, sheetStateRemoteActionCompatParcelizer, (ShortNewsContentCardView) null, 14);
                getpostalcode.write(objComponentActivity);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, Boolean.valueOf(z2), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            if (r8lambdav9hvubmv32qeolrxalsjens1hri.write) {
                getpostalcode.serializer(-914073489);
                float f = Dimensions.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                getPostalCode getpostalcode2 = getpostalcode;
                ModalBottomSheetKt.m118ModalBottomSheetYbuCTN8(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, companion, sheetStateRemoteActionCompatParcelizer, 0.0f, false, RoundedCornerShapeKt.m97RoundedCornerShapea9UjIt4$default(f, f, 0.0f, 0.0f, 12), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), 0L, 0.0f, 0L, null, null, null, ExtrasKt.write(-458043608, new PagerDefaults$$ExternalSyntheticLambda0(r8lambdav9hvubmv32qeolrxalsjens1hri, 23, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), getpostalcode2, (i19 >> 3) & 126, 3078, 7064);
                getpostalcode = getpostalcode2;
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-913558207);
                getpostalcode.IconCompatParcelizer(false);
            }
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdacZGLsqbIi18k4n4AP4URd1_0N0w(r8lambdav9hvubmv32qeolrxalsjens1hri, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i);
        }
    }

    public static final void NavigationRadioButton(r8lambdaVgLfNFYp2qCVVXh_8D8TU6XRSCQ r8lambdavglfnfyp2qcvvxh_8d8tu6xrscq, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z2;
        boolean z3;
        int i3 = 2 % 2;
        int i4 = serializer + 77;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1245401396);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdavglfnfyp2qcvvxh_8d8tu6xrscq) ? 4 : 2) | i;
        } else {
            int i6 = serializer + 73;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i8 = i2 | 3072;
        if (getpostalcode.write(i8 & 1, (i8 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!(!getpostalcode.ComponentActivity)) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    int i9 = read + 59;
                    serializer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier modifierWrite2 = SizeKt.write(PaddingKt.RemoteActionCompatParcelizer(companion, Dimensions.setHasNonEmbeddedTabs, Dimensions.setLogo), 1.0f);
                String str = r8lambdavglfnfyp2qcvvxh_8d8tu6xrscq.write;
                String str2 = r8lambdavglfnfyp2qcvvxh_8d8tu6xrscq.read;
                int i11 = i8 & 112;
                if (i11 == 32) {
                    int i12 = serializer + 97;
                    read = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i8 & 896) == 256) {
                    int i14 = serializer + 85;
                    read = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdavglfnfyp2qcvvxh_8d8tu6xrscq);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if ((zIconCompatParcelizer | z2 | z3) || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new m1$$ExternalSyntheticLambda28(z, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdavglfnfyp2qcvvxh_8d8tu6xrscq);
                    getpostalcode.write(objComponentActivity);
                }
                modifier = companion;
                RadioButtonKt.RadioButton(str, z, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierWrite2, str2, false, false, getpostalcode, i11 | 1572864, 32);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        Modifier modifier2 = modifier;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p6(r8lambdavglfnfyp2qcvvxh_8d8tu6xrscq, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, i, 12);
        }
    }

    public static final void BulletPointRow(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4 = 2 % 2;
        int i5 = serializer + 89;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1496784572);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = read + 123;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode2.read(modifier)) {
                int i9 = read + 57;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
            int i11 = read + 99;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        int i13 = i2;
        if (getpostalcode2.write(i13 & 1, (i13 & 19) != 18)) {
            int i14 = serializer + 47;
            read = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getTop(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i16 = read + 99;
                serializer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 == 0) {
                    int i17 = 4 / 2;
                }
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk("•", PaddingKt.m73paddingVpY3zN4$default(Modifier.Companion, Dimensions.setMenu, 0.0f, 2), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleIconCompatParcelizer, getpostalcode2, 6, 0, 131064);
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, i13 & 14, 0, 131066);
            getpostalcode = getpostalcode2;
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier, 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    public static final void NaverDescriptionContent(int i, getBirthDateFull getbirthdatefull, Modifier modifier, r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI r8lambdav9hvubmv32qeolrxalsjens1hri, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1617195517);
        if ((i & 6) == 0) {
            if (getpostalcode2.read(r8lambdav9hvubmv32qeolrxalsjens1hri)) {
                int i6 = serializer + 95;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    i4 = 2;
                } else {
                    i4 = 4;
                }
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 48;
        if ((i & 384) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i8 = read + 9;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i7 |= i3;
        }
        if ((i7 & 147) != 146) {
            int i10 = serializer + 33;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i7 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = PaddingKt.write(SizeKt.write(companion, 1.0f), Dimensions.setActionBarVisibilityCallback);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!getpostalcode2.ComponentActivity) {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            } else {
                int i12 = serializer + 53;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                getpostalcode2.serializer(constructor);
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            String str = r8lambdav9hvubmv32qeolrxalsjens1hri.IconCompatParcelizer;
            TextStyle textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatResultReceiverWrapper();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper, getpostalcode2, 0, 0, 131066);
            TextKt.m131TextNvy7gAk(r8lambdav9hvubmv32qeolrxalsjens1hri.serializer, PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 131064);
            getpostalcode2.serializer(-1247356289);
            Iterator<E> it = r8lambdav9hvubmv32qeolrxalsjens1hri.RemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                int i14 = read + 125;
                serializer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                BulletPointRow(0, getpostalcode2, PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dimensions.getNestedScrollAxes, 0.0f, 0.0f, 13), (String) it.next());
            }
            getpostalcode2.IconCompatParcelizer(false);
            getpostalcode = getpostalcode2;
            TertiaryKt.IconCompatParcelizer(r8lambdav9hvubmv32qeolrxalsjens1hri.read, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(Modifier.Companion, 1.0f).then(new RadioButton(Alignment.Companion.getCenterHorizontally())), 0.0f, Dimensions.setHideOnContentScrollEnabled, 0.0f, 0.0f, 13), false, 0, null, null, null, getpostalcode2, (i7 >> 3) & 112, 248);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdacZGLsqbIi18k4n4AP4URd1_0N0w(r8lambdav9hvubmv32qeolrxalsjens1hri, modifier2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v22 */
    public static final void NavigationAppPreference(r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o r8lambdavvrejdwf2brhzpg2b8cht1nsk8o, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1142084396);
        if ((i & 6) == 0) {
            int i5 = read + 65;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdavvrejdwf2brhzpg2b8cht1nsk8o) ? 4 : 2) | i;
        } else {
            int i7 = serializer + 39;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 3 / 4;
            }
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = serializer + 43;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i11 = serializer + 79;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                int i13 = read + 19;
                int i14 = i13 % Fields.SpotShadowColor;
                serializer = i14;
                int i15 = i13 % 2;
                int i16 = i14 + 45;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = true;
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            float f = 0.0f;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(Modifier.Companion, 1.0f), 0.0f, Dimensions.setLogo, 1);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!(!getpostalcode.ComponentActivity)) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            List list = r8lambdavvrejdwf2brhzpg2b8cht1nsk8o.serializer;
            if (list == null) {
                getpostalcode.serializer(-507801196);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-507801195);
                Iterator it = list.iterator();
                while (it.hasNext() == z3) {
                    r8lambdaVgLfNFYp2qCVVXh_8D8TU6XRSCQ r8lambdavglfnfyp2qcvvxh_8d8tu6xrscq = (r8lambdaVgLfNFYp2qCVVXh_8D8TU6XRSCQ) it.next();
                    boolean z5 = r8lambdavvrejdwf2brhzpg2b8cht1nsk8o.IconCompatParcelizer == r8lambdavglfnfyp2qcvvxh_8d8tu6xrscq.RemoteActionCompatParcelizer ? z3 ? 1 : 0 : z2;
                    boolean z6 = z5;
                    float f2 = f;
                    NavigationRadioButton(r8lambdavglfnfyp2qcvvxh_8d8tu6xrscq, z5, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, getpostalcode, (i2 << 3) & 896);
                    getpostalcode.serializer(814914924);
                    Iterator it2 = r8lambdavglfnfyp2qcvvxh_8d8tu6xrscq.serializer.iterator();
                    ?? r12 = z3;
                    while (it2.hasNext()) {
                        int i18 = read + 15;
                        serializer = i18 % Fields.SpotShadowColor;
                        if (i18 % 2 == 0) {
                            getpostalcode.serializer(814916150);
                            throw null;
                        }
                        r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c = (r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c) it2.next();
                        getpostalcode.serializer(814916150);
                        Modifier modifierAlpha = AlphaKt.alpha(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, Dimensions.setMenu, 0.0f, 0.0f, 0.0f, 14), (z6 ? Integer.valueOf((int) r12) : Double.valueOf(0.4d)).floatValue());
                        String str = r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c.write;
                        String str2 = r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c.IconCompatParcelizer;
                        Integer num = r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c.serializer;
                        boolean z7 = r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c.read;
                        Iterator it3 = it;
                        if ((i2 & 896) == 256) {
                            int i19 = read + 27;
                            serializer = i19 % Fields.SpotShadowColor;
                            int i20 = i19 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean z8 = getpostalcode.read(r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c);
                        boolean zWrite = getpostalcode.write(z6);
                        Object objComponentActivity = getpostalcode.ComponentActivity();
                        if ((z | z8 | zWrite) || objComponentActivity == getCreditCardExpirationMonth.write) {
                            objComponentActivity = new getLength(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c, z6, 5);
                            getpostalcode.write(objComponentActivity);
                        }
                        PreferenceItemKt.serializer(str, num, z7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifierAlpha, str2, getpostalcode, 0);
                        getpostalcode.IconCompatParcelizer(false);
                        z6 = z6 ? 1 : 0;
                        it = it3;
                        r12 = 1;
                    }
                    getpostalcode.IconCompatParcelizer(false);
                    z2 = false;
                    f = f2;
                    it = it;
                    z3 = true;
                }
                getpostalcode.IconCompatParcelizer(z2);
                z4 = z3;
            }
            getpostalcode.IconCompatParcelizer(z4);
            DividerKt.read(0.0f, 0, 6, 0L, getpostalcode, PaddingKt.m73paddingVpY3zN4$default(Modifier.Companion, Dimensions.setActionBarVisibilityCallback, f, 2));
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 21, r8lambdavvrejdwf2brhzpg2b8cht1nsk8o, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
        }
    }

    public static final void NaverRoutePreviewSwitch(r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1735431411);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c) ^ true ? 2 : 4) | i;
        } else {
            int i5 = read + 69;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i7 = i2 | 3072;
        if (getpostalcode.write(i7 & 1, (i7 & 1171) != 1170)) {
            int i8 = serializer + 13;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            Modifier.Companion companion = Modifier.Companion;
            int i10 = i7 & 112;
            if (i10 == 32) {
                int i11 = serializer + 99;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                z = true;
            } else {
                z = false;
            }
            boolean z2 = (i7 & 14) == 4;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z2 | z) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 19, r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c);
                getpostalcode.write(objComponentActivity);
            }
            Modifier modifierWrite = SizeKt.write(PaddingKt.RemoteActionCompatParcelizer(canReadPlayIds.read(companion, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 63), Dimensions.getContentHeight, Dimensions.getAnimatedVisibility), 1.0f);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            snapElevation snapelevationIconCompatParcelizer = Arrangement.IconCompatParcelizer(Dimensions.setTabContainer);
            Alignment.Companion companion2 = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(snapelevationIconCompatParcelizer, companion2.getCenterVertically(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i13 = read + 119;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Modifier modifierM = d$$ExternalSyntheticOutline0.m(1.0f, true, companion);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, centerVertically, getpostalcode, 48);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i15 = read + 105;
                serializer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    getpostalcode.serializer(constructor2);
                    i3 = 0;
                    int i16 = 61 / 0;
                } else {
                    i3 = 0;
                    getpostalcode.serializer(constructor2);
                }
            } else {
                i3 = 0;
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            int i17 = i3;
            modifier2 = companion;
            TextKt.m131TextNvy7gAk(r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c.write, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[i17], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131066);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_essentials_info, getpostalcode, i17);
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(canReadPlayIds.read(modifier2, null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, 63), Dimensions.getNestedScrollAxes, 0.0f, 0.0f, 0.0f, 14);
            modifierM74paddingqDBjuR0$default.getClass();
            IconKt.m116Iconww6aTOc(painterPainterResource, (String) null, modifierM74paddingqDBjuR0$default, 0L, getpostalcode, Painter.$stable | 48, 8);
            getpostalcode.IconCompatParcelizer(true);
            shouldRetryAfterFailure.read(r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c.read, r8lambdaunavo3sxub_pc9xroryotnrlvsm, SizeKt.m86width3ABfNKs(SizeKt.m75height3ABfNKs(modifier2, Dimensions.setVisibility), Dimensions.setCustomView), false, getpostalcode, i10, 8);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7(i, 24, modifier2, r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }

    public static final void NavigationSettingsScreen(r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o r8lambdavvrejdwf2brhzpg2b8cht1nsk8o, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = read + 115;
        serializer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        r8lambdavvrejdwf2brhzpg2b8cht1nsk8o.getClass();
        r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c = r8lambdavvrejdwf2brhzpg2b8cht1nsk8o.RemoteActionCompatParcelizer;
        r8lambdaV9HVuBmV32QEOLrxAlSjeNs1hrI r8lambdav9hvubmv32qeolrxalsjens1hri = r8lambdavvrejdwf2brhzpg2b8cht1nsk8o.write;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1886104860);
        if ((i & 6) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdavvrejdwf2brhzpg2b8cht1nsk8o)) {
                int i9 = read + 69;
                serializer = i9 % Fields.SpotShadowColor;
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
            int i11 = read + 59;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
            int i13 = read + 69;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        }
        if ((i & 384) == 0) {
            int i15 = read + 83;
            serializer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                int i17 = read + 21;
                serializer = i17 % Fields.SpotShadowColor;
                i4 = i17 % 2 == 0 ? 26077 : Fields.Clip;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode2.read(modifier) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            int i18 = read + 89;
            serializer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3)) {
                int i20 = read + 91;
                serializer = i20 % Fields.SpotShadowColor;
                if (i20 % 2 == 0) {
                    throw null;
                }
                i3 = 1048576;
            } else {
                i3 = Fields.BlendMode;
            }
            i2 |= i3;
        }
        if ((12582912 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? 67108864 : 33554432;
        }
        int i21 = i2;
        if (getpostalcode2.write(i21 & 1, (i21 & 38347923) != 38347922)) {
            int i22 = serializer + 65;
            read = i22 % Fields.SpotShadowColor;
            int i23 = i22 % 2;
            Modifier modifierThen = modifier.then(SizeKt.read);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            HeaderKt.serializer(null, StringResources_androidKt.stringResource(R.string.settings_navigation_title, getpostalcode2, 0), 0L, ExtrasKt.write(-1330957882, new trigger(19, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode2), null, null, null, getpostalcode2, 24576, 237);
            List list = r8lambdavvrejdwf2brhzpg2b8cht1nsk8o.serializer;
            if (list == null || list.isEmpty()) {
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(-1001385228);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(-1001612024);
                int i24 = i21 >> 3;
                NavigationAppPreference(r8lambdavvrejdwf2brhzpg2b8cht1nsk8o, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode, (i24 & 896) | (i21 & 14) | (i24 & 112));
                getpostalcode.IconCompatParcelizer(false);
            }
            if (r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c != null) {
                int i25 = serializer + 67;
                read = i25 % Fields.SpotShadowColor;
                int i26 = i25 % 2;
                getpostalcode.serializer(-1001335907);
                serializer(r8lambda8j_i46kclc2ajjgbjpbbsxu3a_c, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, (Modifier) null, getpostalcode, (i21 >> 9) & 112);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1001160044);
                getpostalcode.IconCompatParcelizer(false);
            }
            if (r8lambdav9hvubmv32qeolrxalsjens1hri != null) {
                getpostalcode.serializer(-1001098726);
                NaverRoutePreviewSwitch(r8lambdav9hvubmv32qeolrxalsjens1hri.MediaSessionCompatQueueItem, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, getpostalcode, (i21 >> 15) & 1008);
                serializer((i21 >> 21) & 112, getpostalcode, (Modifier) null, r8lambdav9hvubmv32qeolrxalsjens1hri, r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1000673964);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdabm6Xd4G6qvXesbF9M1n8iztWq4c(r8lambdavvrejdwf2brhzpg2b8cht1nsk8o, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, i);
        }
    }
}
