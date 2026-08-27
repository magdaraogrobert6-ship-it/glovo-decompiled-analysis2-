package com.roadrunner.home.nest;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.rrds.compose.component.screenstate.ErrorScreenKt;
import io.sentry.SentryUUID;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.PopulateViewStructure_androidKtpopulate7;
import o.execSessionSuccessCallbackCommand;
import o.fieldToInteger;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getPhoneNumberNational;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.getRouternavigation_release;
import o.getSources;
import o.internalPathIteratorPeek;
import o.invoke0E7RQCE;
import o.invokeBWLJW6A;
import o.invokegIAlus;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.registerInAppMessageManagerlambda0;
import o.setCountrylambda1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NestScreenKt {
    private static int serializer = 1;
    private static int write;

    public static final void write(getSources getsources, execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean zIconCompatParcelizer;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-196315443);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(getsources) : getpostalcode.IconCompatParcelizer(getsources)) {
                int i6 = serializer + 41;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                int i8 = serializer + 113;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                zIconCompatParcelizer = getpostalcode.read(execsessionsuccesscallbackcommand);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(execsessionsuccesscallbackcommand);
            }
            if (zIconCompatParcelizer) {
                int i10 = write + 29;
                serializer = i10 % Fields.SpotShadowColor;
                i3 = i10 % 2 == 0 ? 99 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
            int i11 = serializer + 41;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            ErrorScreenKt.ErrorScreen(new fieldToInteger(getsources.read, getsources.IconCompatParcelizer, execsessionsuccesscallbackcommand), modifier, getpostalcode, (i2 >> 3) & 112, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 0, getsources, execsessionsuccesscallbackcommand, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x0199  */
    public static final void NestScreen(getRouternavigation_release getrouternavigation_release, setCountrylambda1 setcountrylambda1, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4 = 2 % 2;
        int i5 = serializer + 91;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getrouternavigation_release.getClass();
        setcountrylambda1.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1118967205);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(getrouternavigation_release) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(setcountrylambda1) ^ true ? 16 : 32;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                int i7 = serializer + 95;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 2048 : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i9 = serializer + 115;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
        }
        int i11 = i2;
        if ((i11 & 9363) != 9362) {
            int i12 = serializer + 5;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!getpostalcode.write(i11 & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i14 = write + 73;
            serializer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(getrouternavigation_release.MediaSessionCompatResultReceiverWrapper, getpostalcode, 0);
            invoke0E7RQCE invoke0e7rqce = (invoke0E7RQCE) populateViewStructure_androidKtpopulate7Write.getValue();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getrouternavigation_release);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer) {
                NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$1 = new NestScreenKt$NestScreen$1$1(0, getrouternavigation_release, getRouternavigation_release.class, "onCloseClick", "onCloseClick()V", 0, 0);
                getpostalcode.write(nestScreenKt$NestScreen$1$1);
                objComponentActivity = nestScreenKt$NestScreen$1$1;
            } else {
                int i16 = serializer + 17;
                write = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    throw null;
                }
                if (objComponentActivity == androidContentCaptureManager) {
                    NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$2 = new NestScreenKt$NestScreen$1$1(0, getrouternavigation_release, getRouternavigation_release.class, "onCloseClick", "onCloseClick()V", 0, 0);
                    getpostalcode.write(nestScreenKt$NestScreen$1$2);
                    objComponentActivity = nestScreenKt$NestScreen$1$2;
                }
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity;
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(getrouternavigation_release);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2 || objComponentActivity2 == androidContentCaptureManager) {
                NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$3 = new NestScreenKt$NestScreen$1$1(0, getrouternavigation_release, getRouternavigation_release.class, "onTryAgain", "onTryAgain()V", 0, 29);
                getpostalcode.write(nestScreenKt$NestScreen$1$3);
                objComponentActivity2 = nestScreenKt$NestScreen$1$3;
            }
            NestContent(invoke0e7rqce, setcountrylambda1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, modifier, getpostalcode, (i11 & 112) | (57344 & (i11 << 6)) | ((i11 << 3) & 458752));
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode.write(objComponentActivity3);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity3;
            boolean z3 = ((invoke0E7RQCE) populateViewStructure_androidKtpopulate7Write.getValue()) instanceof invokegIAlus;
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(getrouternavigation_release);
            if ((i11 & 7168) == 2048) {
                int i17 = serializer + 91;
                write = i17 % Fields.SpotShadowColor;
                if (i17 % 2 != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (!(!(zIconCompatParcelizer3 | z2)) || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new NestScreenKt$$ExternalSyntheticLambda0(getrouternavigation_release, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, populateViewStructure_androidKtpopulate7, 0);
                getpostalcode.write(objComponentActivity4);
            }
            getPhoneNumberNational.serializer(Boolean.valueOf(z3), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, getpostalcode);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM((Object) getrouternavigation_release, (Object) setcountrylambda1, (Object) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    public static final void NestContent(invoke0E7RQCE invoke0e7rqce, setCountrylambda1 setcountrylambda1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        invoke0e7rqce.getClass();
        setcountrylambda1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(756761933);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(invoke0e7rqce) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(setcountrylambda1)) {
                int i7 = serializer + 107;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i9 = write + 1;
                serializer = i9 % Fields.SpotShadowColor;
                i4 = i9 % 2 == 0 ? 2638 : Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            int i10 = write + 47;
            serializer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 23 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i3 = Fields.CameraDistance;
                } else {
                    i3 = Fields.RotationZ;
                }
            } else if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            int i12 = write + 61;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RenderEffect : 65536;
        }
        if (getpostalcode.write(i2 & 1, !((74899 & i2) == 74898))) {
            Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(SizeKt.write(AnimationModifierKt.write(modifier, DelayKt.IconCompatParcelizer(0.75f, 200.0f, 4, (Object) null), 2), 1.0f), PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i14 = write + 45;
            serializer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i16 = serializer + 29;
                write = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            if (invoke0e7rqce instanceof invokeBWLJW6A) {
                getpostalcode.serializer(-619667075);
                NestSkeletonKt.NestSkeleton(null, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
                z = true;
            } else if (invoke0e7rqce instanceof invokegIAlus) {
                getpostalcode.serializer(-619574726);
                z = true;
                NestItemsContentKt.NestItemsContent((invokegIAlus) invoke0e7rqce, setcountrylambda1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, null, getpostalcode, (i2 & 1022) | ((i2 >> 3) & 7168));
                getpostalcode.IconCompatParcelizer(false);
            } else {
                z = true;
                if (!(invoke0e7rqce instanceof getSources)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1642577765, false);
                }
                getpostalcode.serializer(-619262773);
                write((getSources) invoke0e7rqce, new execSessionSuccessCallbackCommand(StringResources_androidKt.stringResource(R.string.retryable_error_view_button_label, getpostalcode, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k1), d$$ExternalSyntheticOutline0.m(1.0f, true, Modifier.Companion), getpostalcode, i2 & 14);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(z);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY((Object) invoke0e7rqce, (Object) setcountrylambda1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (Object) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, modifier, i, 12);
        }
    }
}
