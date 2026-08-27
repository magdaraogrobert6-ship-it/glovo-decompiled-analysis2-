package com.roadrunner.vendor.review.api.presentation;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.gwi.util.GwiErrorCode;
import com.huawei.riemann.location.common.utils.Constant;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import java.util.LinkedHashMap;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.SweepGradientShader9KIMszo;
import o.TapGestureDetectorKt;
import o.TextFieldDefaults;
import o.TouchSlopDetector;
import o.buildMapping;
import o.consumeUntilUp;
import o.extractJsonLong;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostSlopOffsetqto3Fdw;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.onKeyEventZmokQxo;
import o.p6;
import o.performMeasureDjhGOtQ;
import o.performSaveInstanceState;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdab6E1D0lY25DehDHETb0gPJfQmz4;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.requiredSizeInqDBjuR0default;
import o.requiredWidthInVpY3zN4default;
import o.subscribeToNoMatchingTriggerForEventlambda0;
import o.subscribeToSdkAuthenticationFailureslambda0;
import o.subscribeToSdkAuthenticationFailureslambda1;
import o.subscribeToSessionUpdateslambda0;
import o.subscribeToSessionUpdateslambda1;
import o.supportingTextPaddinga9UjIt4material3default;
import o.tryAwaitRelease;
import o.validateAndStorePushIdlambda0;
import o.verifyProperSdkSetup;
import o.verifyProperSdkSetuplambda0;
import o.verifyProperSdkSetuplambda1;
import o.waitForUpOrCancellation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class VendorReviewOptionKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    public static final void write(boolean z, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1513589231);
        if ((i & 6) == 0) {
            int i5 = RemoteActionCompatParcelizer + 27;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = (getpostalcode.write(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(modifier)) {
                int i7 = RemoteActionCompatParcelizer + 53;
                serializer = i7 % Fields.SpotShadowColor;
                i3 = i7 % 2 != 0 ? GwiErrorCode.ALG_LIBRARY_NOT_EXIST : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
            int i8 = serializer + 15;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            int i10 = RemoteActionCompatParcelizer + 125;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            Object[] objArr = {0, Integer.valueOf(Constant.ERROR_UNKNOWN), null, 5};
            AnimatedVisibilityKt.RemoteActionCompatParcelizer(z, modifier, onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), objArr), 2), null, null, subscribeToSdkAuthenticationFailureslambda1.read, getpostalcode, (i2 & 14) | 196992 | (i2 & 112), 24);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new performSaveInstanceState(z, modifier, i, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    public static final void ReviewTitleBox(boolean z, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1245762942);
        if ((i & 6) == 0) {
            int i5 = RemoteActionCompatParcelizer + 101;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 21 / 0;
                if (getpostalcode.write(z)) {
                    i3 = 4;
                } else {
                    int i7 = serializer + 103;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    i3 = 2;
                }
            } else if (getpostalcode.write(z)) {
                i3 = 4;
            } else {
                int i9 = serializer + 103;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i11 = i2 | 48;
        if (getpostalcode.write(i11 & 1, (i11 & 19) != 18)) {
            modifier2 = Modifier.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i12 = RemoteActionCompatParcelizer + 35;
            serializer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z2 = getpostalcode.ComponentActivity;
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            AnimatedContentKt.write(Boolean.valueOf(z), null, null, null, "ReviewTitle", null, subscribeToSdkAuthenticationFailureslambda1.serializer, getpostalcode, (i11 & 14) | 1597440, 46);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new performSaveInstanceState(z, modifier2, i, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00f6  */
    public static final void serializer(subscribeToNoMatchingTriggerForEventlambda0 subscribetonomatchingtriggerforeventlambda0, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-341818288);
        if ((i & 6) == 0) {
            int i7 = serializer + 47;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode.read(subscribetonomatchingtriggerforeventlambda0.ordinal())) {
                int i9 = serializer + 67;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
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
            i2 |= getpostalcode.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 256 : Fields.SpotShadowColor;
        }
        Object obj = null;
        if ((i & 3072) == 0) {
            int i11 = serializer + 55;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                getpostalcode.read(modifier);
                obj.hashCode();
                throw null;
            }
            if (getpostalcode.read(modifier)) {
                int i12 = RemoteActionCompatParcelizer + 83;
                serializer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i4 = Fields.CameraDistance;
            } else {
                i4 = Fields.RotationZ;
            }
            i2 |= i4;
        }
        if (getpostalcode.write(i2 & 1, !((i2 & 1171) == 1170))) {
            int i14 = subscribeToSdkAuthenticationFailureslambda0.write[subscribetonomatchingtriggerforeventlambda0.ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                i3 = z ? R.drawable.ic_emoji_sad_selected_small : R.drawable.ic_emoji_sad_unselected_small;
            } else if (z) {
                i3 = R.drawable.ic_emoji_happy_selected_small;
            } else {
                int i15 = serializer + 41;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i3 = R.drawable.ic_emoji_happy_unselected_small;
            }
            Painter painterPainterResource = PainterResources_androidKt.painterResource(i3, getpostalcode, 0);
            Modifier modifierClip = ClipKt.clip(modifier, RoundedCornerShapeKt.IconCompatParcelizer);
            boolean z2 = (i2 & 896) == 256;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z2) {
                objComponentActivity = new extractJsonLong(9, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
            } else {
                int i17 = serializer + 113;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    int i18 = 14 / 0;
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new extractJsonLong(9, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                        getpostalcode.write(objComponentActivity);
                    }
                } else if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new extractJsonLong(9, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity);
                }
            }
            ImageKt.Image(painterPainterResource, null, ClickableKt.RemoteActionCompatParcelizer(modifierClip, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, 15), null, ContentScale.Companion.getFillBounds(), 0.0f, null, getpostalcode, Painter.$stable | 24624, 104);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p6(subscribetonomatchingtriggerforeventlambda0, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    public static final void BinaryReviewBox(subscribeToNoMatchingTriggerForEventlambda0 subscribetonomatchingtriggerforeventlambda0, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4;
        int iOrdinal;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 41;
        serializer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(155225014);
        if ((i & 6) != 0) {
            int i8 = RemoteActionCompatParcelizer + 49;
            serializer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 3 % 3;
            }
            i2 = i;
        } else {
            int i10 = RemoteActionCompatParcelizer + 67;
            serializer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                int i11 = 85 / 0;
                if (subscribetonomatchingtriggerforeventlambda0 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = subscribetonomatchingtriggerforeventlambda0.ordinal();
                }
            } else if (subscribetonomatchingtriggerforeventlambda0 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = subscribetonomatchingtriggerforeventlambda0.ordinal();
            }
            i2 = (getpostalcode.read(iOrdinal) ? 4 : 2) | i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.write(z)) {
                int i12 = RemoteActionCompatParcelizer + 5;
                serializer = i12 % Fields.SpotShadowColor;
                i4 = i12 % 2 != 0 ? 83 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i13 = RemoteActionCompatParcelizer + 45;
            serializer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true ? Fields.SpotShadowColor : Fields.RotationX;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i14 = serializer + 5;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        int i16 = i2 | 24576;
        if (getpostalcode.write(i16 & 1, (i16 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion2.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!(!getpostalcode.ComponentActivity)) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion3, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Alignment center = companion2.getCenter();
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.serializer;
                write(z, boxScopeInstance.align(companion, center), getpostalcode, (i16 >> 3) & 14);
                BinaryScoresRow(subscribetonomatchingtriggerforeventlambda0, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, boxScopeInstance.align(companion, companion2.getCenter()), getpostalcode, i16 & 8190);
                getpostalcode.IconCompatParcelizer(true);
                modifier2 = companion;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new subscribeToSessionUpdateslambda1(subscribetonomatchingtriggerforeventlambda0, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i, 0);
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v0 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void VendorReviewOption(com.roadrunner.vendor.review.presentation.option.VendorReviewOptionUiModelImpl r24, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r25, androidx.compose.ui.Modifier r26, o.getBirthDateFull r27, int r28) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.vendor.review.api.presentation.VendorReviewOptionKt.VendorReviewOption(com.roadrunner.vendor.review.presentation.option.VendorReviewOptionUiModelImpl, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM, androidx.compose.ui.Modifier, o.getBirthDateFull, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:46:0x0099  */
    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:57:0x0135  */
    /* JADX WARN: Code duplicated, block: B:59:0x013c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141  */
    /* JADX WARN: Code duplicated, block: B:63:0x014d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0157  */
    /* JADX WARN: Code duplicated, block: B:65:0x015d  */
    /* JADX WARN: Code duplicated, block: B:67:0x018a  */
    /* JADX WARN: Code duplicated, block: B:69:0x018e  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void VendorReviewOptionContent(subscribeToSessionUpdateslambda0 subscribetosessionupdateslambda0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Modifier modifier3;
        Modifier modifier4;
        boolean z2;
        float f;
        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        subscribeToNoMatchingTriggerForEventlambda0 subscribetonomatchingtriggerforeventlambda0;
        int i4;
        subscribeToNoMatchingTriggerForEventlambda0 subscribetonomatchingtriggerforeventlambda1;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-133570763);
        if ((i & 6) == 0) {
            i3 = (getpostalcode.read(subscribetosessionupdateslambda0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= !getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i6 = serializer + 31;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ^ true ? Fields.SpotShadowColor : Fields.RotationX;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                int i9 = RemoteActionCompatParcelizer + 95;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                modifier2 = modifier;
                i3 |= getpostalcode.read(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (!getpostalcode.write(i3 & 1, z)) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier4 = modifier2;
            } else {
                if (i8 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (subscribetosessionupdateslambda0 instanceof verifyProperSdkSetup) {
                    getpostalcode.serializer(-2065891443);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-2066657360);
                    z2 = subscribetosessionupdateslambda0 instanceof verifyProperSdkSetuplambda0;
                    Modifier modifierWrite = BorderKt.write(modifier3, Dimensions.read, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowReserved(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.BaseMenuWrapper));
                    f = Dimensions.setTabContainer;
                    Modifier modifierWrite2 = PaddingKt.write(modifierWrite, f);
                    modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer, Alignment.Companion.getCenterHorizontally(), getpostalcode, 54);
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
                    companion = ComposeUiNode.Companion;
                    constructor = companion.getConstructor();
                    if (getpostalcode.read != null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    ReviewTitleBox(z2, null, getpostalcode, 0);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(Modifier.Companion, f)});
                    subscribetosessionupdateslambda0.getClass();
                    if (subscribetosessionupdateslambda0 instanceof verifyProperSdkSetuplambda1) {
                        subscribetonomatchingtriggerforeventlambda1 = ((verifyProperSdkSetuplambda1) subscribetosessionupdateslambda0).read;
                    } else {
                        if (!(!z2)) {
                            i4 = RemoteActionCompatParcelizer + 95;
                            serializer = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 != 0) {
                                subscribetonomatchingtriggerforeventlambda1 = ((verifyProperSdkSetuplambda0) subscribetosessionupdateslambda0).read;
                                int i11 = 43 / 0;
                            } else {
                                subscribetonomatchingtriggerforeventlambda1 = ((verifyProperSdkSetuplambda0) subscribetosessionupdateslambda0).read;
                            }
                        } else {
                            subscribetonomatchingtriggerforeventlambda0 = null;
                        }
                        int i12 = serializer + 69;
                        RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        BinaryReviewBox(subscribetonomatchingtriggerforeventlambda0, z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, getpostalcode, (i3 << 3) & 8064);
                        getpostalcode.IconCompatParcelizer(true);
                        getpostalcode.IconCompatParcelizer(false);
                        int i14 = serializer + 79;
                        RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                    }
                    subscribetonomatchingtriggerforeventlambda0 = subscribetonomatchingtriggerforeventlambda1;
                    int i16 = serializer + 69;
                    RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    BinaryReviewBox(subscribetonomatchingtriggerforeventlambda0, z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, getpostalcode, (i3 << 3) & 8064);
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                    int i18 = serializer + 79;
                    RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                }
                modifier4 = modifier3;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdab6E1D0lY25DehDHETb0gPJfQmz4(subscribetosessionupdateslambda0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier4, i, i2, 4);
            }
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (!getpostalcode.write(i3 & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier4 = modifier2;
        } else {
            if (i8 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (subscribetosessionupdateslambda0 instanceof verifyProperSdkSetup) {
                getpostalcode.serializer(-2066657360);
                z2 = subscribetosessionupdateslambda0 instanceof verifyProperSdkSetuplambda0;
                Modifier modifierWrite3 = BorderKt.write(modifier3, Dimensions.read, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowReserved(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.BaseMenuWrapper));
                f = Dimensions.setTabContainer;
                Modifier modifierWrite4 = PaddingKt.write(modifierWrite3, f);
                modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer, Alignment.Companion.getCenterHorizontally(), getpostalcode, 54);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite4);
                companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                if (getpostalcode.read != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                ReviewTitleBox(z2, null, getpostalcode, 0);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(Modifier.Companion, f)});
                subscribetosessionupdateslambda0.getClass();
                if (subscribetosessionupdateslambda0 instanceof verifyProperSdkSetuplambda1) {
                    subscribetonomatchingtriggerforeventlambda1 = ((verifyProperSdkSetuplambda1) subscribetosessionupdateslambda0).read;
                } else {
                    if (!(!z2)) {
                        i4 = RemoteActionCompatParcelizer + 95;
                        serializer = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 != 0) {
                            subscribetonomatchingtriggerforeventlambda1 = ((verifyProperSdkSetuplambda0) subscribetosessionupdateslambda0).read;
                            int i110 = 43 / 0;
                        } else {
                            subscribetonomatchingtriggerforeventlambda1 = ((verifyProperSdkSetuplambda0) subscribetosessionupdateslambda0).read;
                        }
                    } else {
                        subscribetonomatchingtriggerforeventlambda0 = null;
                    }
                    int i111 = serializer + 69;
                    RemoteActionCompatParcelizer = i111 % Fields.SpotShadowColor;
                    int i112 = i111 % 2;
                    BinaryReviewBox(subscribetonomatchingtriggerforeventlambda0, z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, getpostalcode, (i3 << 3) & 8064);
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                    int i113 = serializer + 79;
                    RemoteActionCompatParcelizer = i113 % Fields.SpotShadowColor;
                    int i114 = i113 % 2;
                }
                subscribetonomatchingtriggerforeventlambda0 = subscribetonomatchingtriggerforeventlambda1;
                int i115 = serializer + 69;
                RemoteActionCompatParcelizer = i115 % Fields.SpotShadowColor;
                int i116 = i115 % 2;
                BinaryReviewBox(subscribetonomatchingtriggerforeventlambda0, z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, getpostalcode, (i3 << 3) & 8064);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(false);
                int i117 = serializer + 79;
                RemoteActionCompatParcelizer = i117 % Fields.SpotShadowColor;
                int i118 = i117 % 2;
            } else {
                getpostalcode.serializer(-2065891443);
                getpostalcode.IconCompatParcelizer(false);
            }
            modifier4 = modifier3;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdab6E1D0lY25DehDHETb0gPJfQmz4(subscribetosessionupdateslambda0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier4, i, i2, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:95:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:96:0x02e8  */
    public static final void BinaryScoresRow(subscribeToNoMatchingTriggerForEventlambda0 subscribetonomatchingtriggerforeventlambda0, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1649466544);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(subscribetonomatchingtriggerforeventlambda0 == null ? -1 : subscribetonomatchingtriggerforeventlambda0.ordinal()) ? 4 : 2) | i;
            int i8 = serializer + 123;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.write(z)) {
                int i10 = serializer + 51;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                i6 = i10 % 2 == 0 ? 3 : 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i11 = serializer + 125;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i13 = serializer + 63;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                i5 = i13 % 2 == 0 ? 25053 : Fields.CameraDistance;
            } else {
                i5 = Fields.RotationZ;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i14 = serializer + 77;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i4 = Fields.Clip;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 9363) != 9362)) {
            int i16 = getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl ? -1 : 1;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer, Alignment.Companion.getCenterVertically(), getpostalcode2, 54);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i17 = serializer + 73;
            RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 == 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z2 = getpostalcode2.ComponentActivity;
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            boolean z3 = subscribetonomatchingtriggerforeventlambda0 == subscribeToNoMatchingTriggerForEventlambda0.NEGATIVE;
            boolean z4 = !z;
            requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default = (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{Integer.valueOf(Constant.ERROR_UNKNOWN), 0, null, 6});
            boolean z5 = getpostalcode2.read(i16);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z5 || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new SweepGradientShader9KIMszo(i16, 9);
                getpostalcode2.write(objComponentActivity);
            }
            requiredSizeInqDBjuR0default requiredsizeinqdbjur0default = onKeyEventZmokQxo.read;
            TapGestureDetectorKt tapGestureDetectorKt = new TapGestureDetectorKt(new getPostSlopOffsetqto3Fdw((consumeUntilUp) null, new TouchSlopDetector(requiredwidthinvpy3zn4default, new EnterExitTransitionKt$slideOutHorizontally$2((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, 0)), (tryAwaitRelease) null, (waitForUpOrCancellation) null, (LinkedHashMap) null, 125)).read(onKeyEventZmokQxo.write((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{0, Integer.valueOf(Constant.ERROR_UNKNOWN), null, 5}), 2));
            Modifier.Companion companion2 = Modifier.Companion;
            int i18 = i16;
            AnimatedVisibilityKt.IconCompatParcelizer(z4, ZIndexModifierKt.zIndex(companion2, z3 ^ true ? 0.0f : 1.0f), null, tapGestureDetectorKt, null, ExtrasKt.write(-81591916, new validateAndStorePushIdlambda0(0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, z3), getpostalcode2), getpostalcode2, 1572870, 20);
            AnimatedVisibilityKt.IconCompatParcelizer(z4, null, null, null, null, subscribeToSdkAuthenticationFailureslambda1.IconCompatParcelizer, getpostalcode2, 1572870, 30);
            boolean z6 = subscribetonomatchingtriggerforeventlambda0 == subscribeToNoMatchingTriggerForEventlambda0.POSITIVE;
            requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default2 = (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{Integer.valueOf(Constant.ERROR_UNKNOWN), 0, null, 6});
            boolean z7 = getpostalcode2.read(i18);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (z7) {
                i3 = 0;
            } else {
                int i19 = serializer + 15;
                RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                if (i19 % 2 == 0) {
                    i3 = 0;
                    int i20 = 89 / 0;
                    if (objComponentActivity2 == androidContentCaptureManager) {
                    }
                } else {
                    i3 = 0;
                    if (objComponentActivity2 == androidContentCaptureManager) {
                    }
                }
                TapGestureDetectorKt tapGestureDetectorKt2 = new TapGestureDetectorKt(new getPostSlopOffsetqto3Fdw((consumeUntilUp) null, new TouchSlopDetector(requiredwidthinvpy3zn4default2, new EnterExitTransitionKt$slideOutHorizontally$2((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, i3)), (tryAwaitRelease) null, (waitForUpOrCancellation) null, (LinkedHashMap) null, 125)).read(onKeyEventZmokQxo.write((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{Integer.valueOf(i3), Integer.valueOf(Constant.ERROR_UNKNOWN), null, 5}), 2));
                if (z6) {
                    int i21 = RemoteActionCompatParcelizer + 117;
                    serializer = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                getpostalcode = getpostalcode2;
                AnimatedVisibilityKt.IconCompatParcelizer(z4, ZIndexModifierKt.zIndex(companion2, f), null, tapGestureDetectorKt2, null, ExtrasKt.write(-1251146980, new validateAndStorePushIdlambda0(3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z6), getpostalcode2), getpostalcode2, 1572870, 20);
                getpostalcode.IconCompatParcelizer(true);
            }
            objComponentActivity2 = new SweepGradientShader9KIMszo(i18, 10);
            getpostalcode2.write(objComponentActivity2);
            TapGestureDetectorKt tapGestureDetectorKt3 = new TapGestureDetectorKt(new getPostSlopOffsetqto3Fdw((consumeUntilUp) null, new TouchSlopDetector(requiredwidthinvpy3zn4default2, new EnterExitTransitionKt$slideOutHorizontally$2((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, i3)), (tryAwaitRelease) null, (waitForUpOrCancellation) null, (LinkedHashMap) null, 125)).read(onKeyEventZmokQxo.write((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{Integer.valueOf(i3), Integer.valueOf(Constant.ERROR_UNKNOWN), null, 5}), 2));
            if (z6) {
                int i23 = RemoteActionCompatParcelizer + 117;
                serializer = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            getpostalcode = getpostalcode2;
            AnimatedVisibilityKt.IconCompatParcelizer(z4, ZIndexModifierKt.zIndex(companion2, f), null, tapGestureDetectorKt3, null, ExtrasKt.write(-1251146980, new validateAndStorePushIdlambda0(3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z6), getpostalcode2), getpostalcode2, 1572870, 20);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new subscribeToSessionUpdateslambda1(subscribetonomatchingtriggerforeventlambda0, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i, 1);
        }
    }
}
