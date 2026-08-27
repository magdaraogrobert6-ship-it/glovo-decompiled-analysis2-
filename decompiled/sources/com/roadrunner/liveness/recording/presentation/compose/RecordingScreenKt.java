package com.roadrunner.liveness.recording.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.liveness.recording.presentation.RecordingViewModel;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import io.sentry.SentryUUID;
import kotlin.ranges.RangesKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.BackspaceCommand;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetDialogWrapper;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.accessisRenderNodeCompatiblecp;
import o.buildMapping;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getQueryContext;
import o.getWrapper;
import o.p7;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;
import o.setFillColor;
import o.setLegacyRequestDisallowInterceptTouchEventEnabled;
import o.setNavigationOnClickListener;
import o.setOnRefreshListener;
import o.setRefreshingWithoutSwipeGesture;
import o.setTargetOffsetTopAndBottom;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RecordingScreenKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x003c A[PHI: r2
  0x003c: PHI (r2v66 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v68 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r2
  0x0030: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v68 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void RecordingContent(setRefreshingWithoutSwipeGesture setrefreshingwithoutswipegesture, getWrapper getwrapper, setNavigationOnClickListener setnavigationonclicklistener, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        getPostalCode getpostalcode3;
        Integer num;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = serializer + 47;
        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1096467605);
            if ((i & 4) == 0) {
                if (getpostalcode.read(setrefreshingwithoutswipegesture)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1096467605);
            if ((i & 6) == 0) {
                if (getpostalcode.read(setrefreshingwithoutswipegesture)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.IconCompatParcelizer(getwrapper)) {
                int i10 = serializer + 15;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                i7 = i10 % 2 != 0 ? 83 : 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i & 384) == 0) {
            int i11 = IconCompatParcelizer + 11;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode2.IconCompatParcelizer(setnavigationonclicklistener)) {
                int i13 = IconCompatParcelizer + 81;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i6 = Fields.RotationX;
            } else {
                i6 = Fields.SpotShadowColor;
            }
            i3 |= i6;
        }
        if ((i & 3072) == 0) {
            int i15 = IconCompatParcelizer + 123;
            serializer = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    int i16 = IconCompatParcelizer + 109;
                    serializer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    i5 = Fields.CameraDistance;
                } else {
                    i5 = Fields.RotationZ;
                }
            } else {
                int i18 = 96 / 0;
                if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    int i19 = IconCompatParcelizer + 109;
                    serializer = i19 % Fields.SpotShadowColor;
                    int i110 = i19 % 2;
                    i5 = Fields.CameraDistance;
                } else {
                    i5 = Fields.RotationZ;
                }
            }
            i3 |= i5;
        }
        Object obj = null;
        if ((i & 24576) == 0) {
            int i20 = IconCompatParcelizer + 13;
            serializer = i20 % Fields.SpotShadowColor;
            if (i20 % 2 != 0) {
                if (getpostalcode2.read(modifier)) {
                    int i21 = IconCompatParcelizer + 9;
                    serializer = i21 % Fields.SpotShadowColor;
                    i4 = i21 % 2 == 0 ? 31868 : Fields.Clip;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            } else {
                getpostalcode2.read(modifier);
                obj.hashCode();
                throw null;
            }
        }
        if (getpostalcode2.write(i3 & 1, (i3 & 9363) != 9362)) {
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier.then(SizeKt.read), ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                setLegacyRequestDisallowInterceptTouchEventEnabled setlegacyrequestdisallowintercepttoucheventenabled = setrefreshingwithoutswipegesture.serializer;
                Integer num2 = setrefreshingwithoutswipegesture.write;
                setOnRefreshListener setonrefreshlistener = setrefreshingwithoutswipegesture.RatingCompat;
                if (setonrefreshlistener != null) {
                    Integer numValueOf = Integer.valueOf(setonrefreshlistener.RemoteActionCompatParcelizer);
                    int i22 = serializer + 47;
                    IconCompatParcelizer = i22 % Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    num = numValueOf;
                } else {
                    num = null;
                }
                Modifier.Companion companion2 = Modifier.Companion;
                setTargetOffsetTopAndBottom.RemoteActionCompatParcelizer(setlegacyrequestdisallowintercepttoucheventenabled, num2, num, getwrapper, setnavigationonclicklistener, r8lambdaunavo3sxub_pc9xroryotnrlvsm, SizeKt.write(ModalBottomSheetDialogWrapper.IconCompatParcelizer(companion2, 1.0f), 1.0f), getpostalcode2, (i3 << 6) & 523264);
                getpostalcode3 = getpostalcode2;
                InstructionsContentKt.InstructionsContent(setrefreshingwithoutswipegesture.MediaSessionCompatQueueItem, setrefreshingwithoutswipegesture.RemoteActionCompatParcelizer, setrefreshingwithoutswipegesture.IconCompatParcelizer, setrefreshingwithoutswipegesture.read, setrefreshingwithoutswipegesture.MediaMetadataCompat, setrefreshingwithoutswipegesture.RatingCompat, SizeKt.write(ModalBottomSheetDialogWrapper.IconCompatParcelizer(companion2, 1.0f), 1.0f), getpostalcode3, 0);
                getpostalcode3.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode3 = getpostalcode2;
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg((Object) setrefreshingwithoutswipegesture, (Object) getwrapper, (Object) setnavigationonclicklistener, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, i, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b9  */
    public static final void read(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, RecordingViewModel recordingViewModel, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = serializer + 105;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        recordingViewModel.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1707385733);
        if ((i & 6) == 0) {
            int i9 = IconCompatParcelizer + 57;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i11 = serializer + 101;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                i5 = i11 % 2 != 0 ? 33 : 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            int i12 = IconCompatParcelizer + 73;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            if (!(!getpostalcode.IconCompatParcelizer(recordingViewModel))) {
                int i14 = serializer + 31;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.read(modifier)) {
                int i16 = serializer + 57;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                i3 = i16 % 2 != 0 ? 20849 : Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            int i17 = IconCompatParcelizer + 21;
            serializer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(recordingViewModel.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, getpostalcode, 0);
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(recordingViewModel);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new setFillColor(recordingViewModel, 0);
                getpostalcode.write(objComponentActivity);
            }
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            RangesKt.read(980236944, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{createfromparcel, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 6}, BackspaceCommand.write(), -980236935, BackspaceCommand.write());
            getQueryContext getquerycontext = recordingViewModel.IconCompatParcelizer;
            boolean z2 = (i2 & 14) == 4;
            boolean z3 = (i2 & 112) == 32;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((z2 | z3) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new SuspendingWorkUseCase$$ExternalSyntheticLambda0(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 26, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity2);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 8);
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(accessisrendernodecompatiblecp);
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(recordingViewModel);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer2 | zIconCompatParcelizer3) || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new PushEventPublisherImpl$emit$1(accessisrendernodecompatiblecp, recordingViewModel, null, 11);
                getpostalcode.write(objComponentActivity3);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, recordingViewModel, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity3);
            setRefreshingWithoutSwipeGesture setrefreshingwithoutswipegesture = (setRefreshingWithoutSwipeGesture) populateViewStructure_androidKtpopulate7Write.getValue();
            Object objMediaSessionCompatResultReceiverWrapper = recordingViewModel.serializer.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
            objMediaSessionCompatResultReceiverWrapper.getClass();
            getWrapper getwrapper = (getWrapper) objMediaSessionCompatResultReceiverWrapper;
            Object objMediaSessionCompatResultReceiverWrapper2 = recordingViewModel.RatingCompat.read.MediaSessionCompatResultReceiverWrapper();
            objMediaSessionCompatResultReceiverWrapper2.getClass();
            setNavigationOnClickListener setnavigationonclicklistener = (setNavigationOnClickListener) objMediaSessionCompatResultReceiverWrapper2;
            boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(recordingViewModel);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer4 || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new setFillColor(recordingViewModel, 3);
                getpostalcode.write(objComponentActivity4);
            }
            RecordingContent(setrefreshingwithoutswipegesture, getwrapper, setnavigationonclicklistener, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, modifier, getpostalcode, (i2 << 3) & 57344);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7((Object) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) recordingViewModel, modifier, i, 9);
        }
    }
}
