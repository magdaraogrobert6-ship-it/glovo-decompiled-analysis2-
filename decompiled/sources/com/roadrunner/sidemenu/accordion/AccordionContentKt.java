package com.roadrunner.sidemenu.accordion;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;
import com.roadrunner.settings.ui.screens.SettingsScreenKt$SettingsScreen$2$1;
import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TapGestureDetectorKtprocessTapGestureresetJob1;
import o.TextFieldDefaults;
import o.accessgetClearConfigSentinelcp;
import o.accessgetTextCentercp;
import o.buildMapping;
import o.getAndroidType;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.onKeyEventZmokQxo;
import o.onViewAttachedToWindow;
import o.p7;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaeTmD53lKOnFij4CBzEIrqp4Jyw;
import o.r8lambdafDO76o9OYYvjKpysJSsx90eBs8;
import o.r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;
import o.r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4;
import o.registerInAppMessageManagerlambda0;
import o.requiredWidthInVpY3zN4default;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AccordionContentKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final SemanticsPropertyKey read = new SemanticsPropertyKey("rotation_angle_property_key", (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) null, 2, (DefaultConstructorMarker) null);
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = write + 89;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static final void serializer(r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk r8lambdafoipryykxsg19oxlsccw3x8q4qk, r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4 r8lambdavhjvxyggllvhk5agniqgyzerf4, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        r8lambdafoipryykxsg19oxlsccw3x8q4qk.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1657376471);
        if ((i & 6) == 0) {
            i2 = (!getpostalcode.IconCompatParcelizer(r8lambdafoipryykxsg19oxlsccw3x8q4qk) ? 2 : 4) | i;
            int i5 = RemoteActionCompatParcelizer + 71;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdavhjvxyggllvhk5agniqgyzerf4)) {
                int i7 = RemoteActionCompatParcelizer + 51;
                serializer = i7 % Fields.SpotShadowColor;
                i3 = i7 % 2 != 0 ? 92 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i8 = i2 | 384;
        if (true ^ getpostalcode.write(i8 & 1, (i8 & 147) != 146)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        } else {
            int i9 = RemoteActionCompatParcelizer + 47;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            Modifier.Companion companion = Modifier.Companion;
            int i11 = i8 << 3;
            AccordionScreen(r8lambdafoipryykxsg19oxlsccw3x8q4qk, (r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8) ExtrasKt.write(r8lambdafoipryykxsg19oxlsccw3x8q4qk.read, getpostalcode, 0).getValue(), r8lambdavhjvxyggllvhk5agniqgyzerf4, companion, getpostalcode, (i11 & 7168) | (i8 & 14) | (i11 & 896));
            modifier2 = companion;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 22, r8lambdafoipryykxsg19oxlsccw3x8q4qk, r8lambdavhjvxyggllvhk5agniqgyzerf4, modifier2);
        }
        int i12 = RemoteActionCompatParcelizer + 53;
        serializer = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
    }

    public static final void AccordionScreen(r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk r8lambdafoipryykxsg19oxlsccw3x8q4qk, r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8 r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8, r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4 r8lambdavhjvxyggllvhk5agniqgyzerf4, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1187991853);
        if ((i & 6) == 0) {
            int i5 = serializer + 3;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdafoipryykxsg19oxlsccw3x8q4qk) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                int i7 = serializer + 35;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    zIconCompatParcelizer = getpostalcode.read(r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8);
                    int i8 = 14 / 0;
                } else {
                    zIconCompatParcelizer = getpostalcode.read(r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8);
                }
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8);
            }
            if (zIconCompatParcelizer) {
                i3 = 32;
            } else {
                int i9 = RemoteActionCompatParcelizer + 5;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            int i11 = RemoteActionCompatParcelizer + 7;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i2 |= !(getpostalcode.IconCompatParcelizer(r8lambdavhjvxyggllvhk5agniqgyzerf4) ^ true) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i13 = RemoteActionCompatParcelizer + 1;
            serializer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                getpostalcode.read(modifier);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i14 = i2;
        if (getpostalcode.write(i14 & 1, (i14 & 1171) != 1170)) {
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(r8lambdafoipryykxsg19oxlsccw3x8q4qk);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer2 || objComponentActivity == androidContentCaptureManager) {
                SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$1 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdafoipryykxsg19oxlsccw3x8q4qk, r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk.class, "onToggleExpansionClicked", "onToggleExpansionClicked()V", 0, 23);
                getpostalcode.write(settingsScreenKt$SettingsScreen$2$1);
                objComponentActivity = settingsScreenKt$SettingsScreen$2$1;
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(r8lambdafoipryykxsg19oxlsccw3x8q4qk);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer3 || objComponentActivity2 == androidContentCaptureManager) {
                JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$1 = new JobKt__JobKt$invokeOnCompletion$1(1, r8lambdafoipryykxsg19oxlsccw3x8q4qk, r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk.class, "getMenuItemUiModel", "getMenuItemUiModel(Lcom/roadrunner/sidemenu/menuitems/MenuItemUiState;)Lcom/roadrunner/sidemenu/menuitems/MenuItemsUiModel;", 0, 10);
                getpostalcode.write(jobKt__JobKt$invokeOnCompletion$1);
                objComponentActivity2 = jobKt__JobKt$invokeOnCompletion$1;
            }
            int i15 = i14 << 3;
            Accordion(r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity2), r8lambdavhjvxyggllvhk5agniqgyzerf4, modifier, getpostalcode, ((i14 >> 3) & 14) | (i15 & 7168) | (i15 & 57344));
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7((Object) r8lambdafoipryykxsg19oxlsccw3x8q4qk, (Object) r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8, (Object) r8lambdavhjvxyggllvhk5agniqgyzerf4, modifier, i, 26);
        }
    }

    public static final void Accordion(r8lambdag0m0JVUE1KB8aI8kjJMGJSHe1o8 r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4 r8lambdavhjvxyggllvhk5agniqgyzerf4, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        boolean zIconCompatParcelizer;
        int i5;
        int i6 = 2 % 2;
        int i7 = serializer + 31;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2027111581);
        if ((i & 6) == 0) {
            int i9 = serializer + 13;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0 ? (i & 8) == 0 : (i & 31) == 0) {
                zIconCompatParcelizer = getpostalcode.read(r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8);
            }
            if (zIconCompatParcelizer) {
                int i10 = RemoteActionCompatParcelizer + 53;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i12 = RemoteActionCompatParcelizer + 79;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i14 = serializer + 1;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                i4 = i14 % 2 == 0 ? 40 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
            int i15 = RemoteActionCompatParcelizer + 39;
            serializer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdavhjvxyggllvhk5agniqgyzerf4)) {
                int i17 = serializer + 123;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 9363) != 9362)) {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode = new DragAndDropTargetModifierNode(new TncComposableFactoryImpl$$ExternalSyntheticLambda0(10, r8lambdavhjvxyggllvhk5agniqgyzerf4), true, -1312009089);
                getpostalcode.write(dragAndDropTargetModifierNode);
                objComponentActivity = dragAndDropTargetModifierNode;
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity;
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                AccordionHeader(r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8.RemoteActionCompatParcelizer, r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8.write, r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8.IconCompatParcelizer, r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8.read, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, getpostalcode, 57344 & (i2 << 9));
                AnimatedVisibilityKt.serializer(r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8.IconCompatParcelizer, null, onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, companion.getTop(), 13).serializer(onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 1)), onKeyEventZmokQxo.serializer((accessgetTextCentercp) null, 3).read(onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, (Alignment.Vertical) null, 15)).read(onKeyEventZmokQxo.write(null, 3)), null, ExtrasKt.write(813814799, new r8lambdaeTmD53lKOnFij4CBzEIrqp4Jyw(r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, 0), getpostalcode), getpostalcode, 1600518, 18);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(r8lambdag0m0jvue1kb8ai8kjjmgjshe1o8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdavhjvxyggllvhk5agniqgyzerf4, modifier, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:84:0x02c4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean, int] */
    public static final void AccordionHeader(String str, String str2, boolean z, String str3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z2;
        Modifier modifier2;
        getPostalCode getpostalcode;
        float f;
        int i3;
        getPostalCode getpostalcode2;
        boolean z3;
        Modifier.Companion companion;
        getPostalCode getpostalcode3;
        ?? r8;
        float f2;
        getPostalCode getpostalcode4;
        boolean z4;
        int i4;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 29;
        serializer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        str.getClass();
        str2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull;
        getpostalcode5.MediaSessionCompatQueueItem(-836425465);
        Object obj = null;
        if ((i & 6) == 0) {
            int i8 = serializer + 9;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                i2 = (getpostalcode5.read(str) ? 4 : 2) | i;
            } else {
                getpostalcode5.read(str);
                obj.hashCode();
                throw null;
            }
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = serializer + 7;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                if (getpostalcode5.read(str2)) {
                    int i10 = RemoteActionCompatParcelizer + 81;
                    serializer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i2 |= i4;
            } else {
                getpostalcode5.read(str2);
                throw null;
            }
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode5.write(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= !getpostalcode5.read(str3) ? Fields.RotationZ : Fields.CameraDistance;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode5.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.Clip : 8192;
        }
        int i12 = i2 | 196608;
        if ((i12 & 74899) != 74898) {
            int i13 = serializer + 95;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (getpostalcode5.write(i12 & 1, z2)) {
            int i14 = RemoteActionCompatParcelizer + 57;
            serializer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                Modifier.Companion companion2 = Modifier.Companion;
                Object objComponentActivity = getpostalcode5.ComponentActivity();
                Object obj2 = getCreditCardExpirationMonth.write;
                if (objComponentActivity == obj2) {
                    objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode5);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) objComponentActivity;
                PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                float f3 = Dimensions.setTabContainer;
                Modifier modifierSerializer = ClickableKt.serializer(PaddingKt.write(companion2, f3), mutableInteractionSourceImpl, null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 28);
                modifierSerializer.getClass();
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(playbackStateCompatCustomAction, centerVertically, getpostalcode5, 54);
                int iHashCode = Long.hashCode(getpostalcode5.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode5.serializer();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode5, modifierSerializer);
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
                if (getpostalcode5.read != null) {
                    getpostalcode5.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (!getpostalcode5.ComponentActivity) {
                        f = f3;
                        i3 = 0;
                        getpostalcode5.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    } else {
                        int i15 = RemoteActionCompatParcelizer + 51;
                        f = f3;
                        serializer = i15 % Fields.SpotShadowColor;
                        if (i15 % 2 != 0) {
                            getpostalcode5.serializer(constructor);
                            i3 = 0;
                            int i16 = 99 / 0;
                        } else {
                            i3 = 0;
                            getpostalcode5.serializer(constructor);
                        }
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode5, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode5, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode5, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode5, Integer.valueOf(iHashCode), getpostalcode5));
                    int i17 = i12 & 14;
                    int i18 = i12 << 3;
                    int i19 = i3;
                    accessgetClearConfigSentinelcp.write(str, null, str2, null, getpostalcode5, i17 | (i18 & 896), 10);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode5, SizeKt.m86width3ABfNKs(companion2, f)});
                    int iM3516getStarte0LSkKk = TextAlign.Companion.m3516getStarte0LSkKk();
                    TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[i19], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    TextKt.m131TextNvy7gAk(str, d$$ExternalSyntheticOutline0.m(1.0f, true, companion2), ((buildMapping) getpostalcode5.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(iM3516getStarte0LSkKk), 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 2, 0, null, textStyle, getpostalcode5, i17, 24960, 109560);
                    if (str3 != null) {
                        getpostalcode5.serializer(-775679346);
                        getpostalcode4 = getpostalcode5;
                        z4 = i19;
                        TagsKt.write(str3, null, 0, 0, getpostalcode4, (i12 >> 9) & 14, 30);
                        companion = companion2;
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode4, SizeKt.m86width3ABfNKs(companion, Dimensions.setSplitBackground)});
                        getpostalcode4.IconCompatParcelizer(z4);
                    } else {
                        getpostalcode2 = getpostalcode5;
                        z3 = i19;
                        companion = companion2;
                        getpostalcode2.serializer(-775578441);
                        getpostalcode2.IconCompatParcelizer(z3);
                    }
                    if (z) {
                        r8 = z3;
                        getpostalcode3 = getpostalcode2;
                        int i20 = serializer + 27;
                        RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                        if (i20 % 2 == 0) {
                            r8 = z4;
                            getpostalcode3 = getpostalcode4;
                            r3.hashCode();
                            throw 0;
                        }
                        r8 = z4;
                        getpostalcode3 = getpostalcode4;
                        f2 = 180.0f;
                    } else {
                        r8 = z3;
                        getpostalcode3 = getpostalcode2;
                        r8 = z4;
                        getpostalcode3 = getpostalcode4;
                        f2 = 0.0f;
                    }
                    int i21 = RemoteActionCompatParcelizer + 117;
                    serializer = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtprocessTapGestureresetJob1.IconCompatParcelizer(f2, null, "arrowRotation", null, getpostalcode3, 3072, 22);
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_small_arrow_down, getpostalcode3, r8);
                    long presenter = ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
                    boolean z5 = getpostalcode3.read(onviewattachedtowindowIconCompatParcelizer);
                    Object objComponentActivity2 = getpostalcode3.ComponentActivity();
                    if (!z5) {
                        int i23 = RemoteActionCompatParcelizer + 97;
                        serializer = i23 % Fields.SpotShadowColor;
                        int i24 = i23 % 2;
                        if (objComponentActivity2 == obj2) {
                            objComponentActivity2 = new r8lambdafDO76o9OYYvjKpysJSsx90eBs8(onviewattachedtowindowIconCompatParcelizer, r8);
                            getpostalcode3.write(objComponentActivity2);
                        }
                    } else {
                        objComponentActivity2 = new r8lambdafDO76o9OYYvjKpysJSsx90eBs8(onviewattachedtowindowIconCompatParcelizer, r8);
                        getpostalcode3.write(objComponentActivity2);
                    }
                    IconKt.m116Iconww6aTOc(painterPainterResource, str, RotateKt.rotate(SemanticsModifierKt.semantics$default(companion, r8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, r5, r3), ((Number) onviewattachedtowindowIconCompatParcelizer.getValue()).floatValue()), presenter, getpostalcode3, Painter.$stable | (i18 & 112), 0);
                    getpostalcode3.IconCompatParcelizer(true);
                    modifier2 = companion;
                    getpostalcode = getpostalcode3;
                } else {
                    SentryUUID.write();
                    throw null;
                }
            } else {
                Modifier.Companion companion4 = Modifier.Companion;
                getpostalcode5.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                throw null;
            }
        } else {
            getPostalCode getpostalcode6 = getpostalcode5;
            getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            getpostalcode = getpostalcode6;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getAndroidType(str, str2, z, str3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 11);
        }
    }
}
