package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.compose.CashPaymentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.forms.DropdownKt;
import io.sentry.SentryUUID;
import io.sentry.util.UrlUtils;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class setContentSensitive implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int MediaSessionCompatToken;
    public final /* synthetic */ int IconCompatParcelizer = 2;
    public final /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ Object ParcelableVolumeInfo;
    public final /* synthetic */ Object PlaybackStateCompatCustomAction;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public final /* synthetic */ androidx.compose.ui.Modifier write;

    public /* synthetic */ setContentSensitive(androidx.compose.ui.Modifier modifier, String str, boolean z, extractAuthorizationHeader extractauthorizationheader, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, position positionVar, androidx.compose.material3.ButtonColors buttonColors, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, String str2, int i, androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.write = modifier;
        this.RatingCompat = str;
        this.RemoteActionCompatParcelizer = z;
        this.MediaBrowserCompatMediaItem = extractauthorizationheader;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaDescriptionCompat = positionVar;
        this.MediaMetadataCompat = buttonColors;
        this.ParcelableVolumeInfo = mutableInteractionSourceImpl;
        this.MediaSessionCompatQueueItem = str2;
        this.read = i;
        this.PlaybackStateCompatCustomAction = colorFilter;
    }

    public /* synthetic */ setContentSensitive(CashPaymentTaskUiItem cashPaymentTaskUiItem, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, androidx.compose.ui.Modifier modifier, int i) {
        this.RatingCompat = cashPaymentTaskUiItem;
        this.RemoteActionCompatParcelizer = z;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaMetadataCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaBrowserCompatMediaItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        this.MediaDescriptionCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaSessionCompatQueueItem = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.ParcelableVolumeInfo = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.PlaybackStateCompatCustomAction = r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
        this.write = modifier;
        this.read = i;
    }

    public /* synthetic */ setContentSensitive(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.ui.graphics.Shape shape, androidx.compose.material3.ButtonColors buttonColors, SensitiveContentNode sensitiveContentNode, position positionVar, SwitchKt switchKt, androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i) {
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = modifier;
        this.RemoteActionCompatParcelizer = z;
        this.RatingCompat = shape;
        this.MediaMetadataCompat = buttonColors;
        this.MediaBrowserCompatMediaItem = sensitiveContentNode;
        this.MediaDescriptionCompat = positionVar;
        this.MediaSessionCompatQueueItem = switchKt;
        this.ParcelableVolumeInfo = mutableInteractionSourceImpl;
        this.PlaybackStateCompatCustomAction = dragAndDropTargetModifierNode;
        this.read = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.PlaybackStateCompatCustomAction;
        final int i3 = this.read;
        Object obj4 = this.MediaSessionCompatQueueItem;
        Object obj5 = this.ParcelableVolumeInfo;
        Object obj6 = this.MediaMetadataCompat;
        Object obj7 = this.MediaDescriptionCompat;
        Object obj8 = this.MediaBrowserCompatMediaItem;
        Object obj9 = this.RatingCompat;
        if (i2 == 0) {
            ((Integer) obj2).getClass();
            androidx.compose.material3.ButtonKt.RemoteActionCompatParcelizer(this.serializer, this.write, this.RemoteActionCompatParcelizer, (androidx.compose.ui.graphics.Shape) obj9, (androidx.compose.material3.ButtonColors) obj6, (SensitiveContentNode) obj8, (position) obj7, (SwitchKt) obj4, (androidx.compose.foundation.interaction.MutableInteractionSourceImpl) obj5, (DragAndDropTargetModifierNode) obj3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i3));
            return createfromparcel;
        }
        if (i2 == 1) {
            ((Integer) obj2).getClass();
            CashPaymentKt.CashTaskColumn((CashPaymentTaskUiItem) obj9, this.RemoteActionCompatParcelizer, this.serializer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, this.write, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i3));
            return createfromparcel;
        }
        String str = (String) obj9;
        extractAuthorizationHeader extractauthorizationheader = (extractAuthorizationHeader) obj8;
        position positionVar = (position) obj7;
        androidx.compose.material3.ButtonColors buttonColors = (androidx.compose.material3.ButtonColors) obj6;
        androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl = (androidx.compose.foundation.interaction.MutableInteractionSourceImpl) obj5;
        final String str2 = (String) obj4;
        final androidx.compose.ui.graphics.ColorFilter colorFilter = (androidx.compose.ui.graphics.ColorFilter) obj3;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (!getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            return createfromparcel;
        }
        int i4 = MediaSessionCompatToken + 69;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(androidx.compose.foundation.layout.Arrangement.MediaDescriptionCompat, androidx.compose.ui.Alignment.Companion.getStart(), getpostalcode, 0);
        int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
        androidx.compose.ui.Modifier modifier = this.write;
        androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode, modifier);
        androidx.compose.ui.node.ComposeUiNode.Companion companion = androidx.compose.ui.node.ComposeUiNode.Companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
        position positionVar2 = null;
        if (getpostalcode.read == null) {
            SentryUUID.write();
            throw null;
        }
        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
        if (getpostalcode.ComponentActivity) {
            int i6 = MediaSessionCompatResultReceiverWrapper + 57;
            MediaSessionCompatToken = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            getpostalcode.serializer(constructor);
        } else {
            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        }
        c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
        boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
        boolean z = this.RemoteActionCompatParcelizer;
        if (!zSerializer) {
            getpostalcode.serializer(1438817671);
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.Companion;
            DropdownKt.TitleAndRequiredText(str, z, companion2, getpostalcode, 384);
            IconCompatParcelizer.IconCompatParcelizer(companion2, Dimensions.setBackgroundResource, getpostalcode, false);
        } else {
            getpostalcode.serializer(1439115581);
            getpostalcode.IconCompatParcelizer(false);
            int i8 = MediaSessionCompatToken + 117;
            MediaSessionCompatResultReceiverWrapper = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        extractauthorizationheader.getClass();
        getpostalcode.serializer(1439189392);
        SealedClassSerializer$$ExternalSyntheticLambda0 sealedClassSerializer$$ExternalSyntheticLambda0IconCompatParcelizer = UrlUtils.IconCompatParcelizer(500L, getpostalcode, 0).IconCompatParcelizer(this.serializer);
        getpostalcode.IconCompatParcelizer(false);
        getTopLeftannotations gettopleftannotations = DropdownKt.write;
        SwitchDefaults switchDefaults = new SwitchDefaults(Dimensions.ActivityResult, Dimensions.accessgetKeyToRcp, Dimensions.PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1, Dimensions.ComposePredictiveBackHandlerlaunchNewGesture11);
        SwitchDefaults switchDefaults2 = androidx.compose.material3.ButtonDefaults.serializer;
        SensitiveContentNode sensitiveContentNodeIconCompatParcelizer = androidx.compose.material3.ButtonDefaults.IconCompatParcelizer(androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f), 0);
        if (z) {
            int i10 = MediaSessionCompatToken + 73;
            MediaSessionCompatResultReceiverWrapper = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            positionVar2 = positionVar;
        }
        androidx.compose.material3.ButtonKt.RemoteActionCompatParcelizer(sealedClassSerializer$$ExternalSyntheticLambda0IconCompatParcelizer, modifier, z, gettopleftannotations, buttonColors, sensitiveContentNodeIconCompatParcelizer, positionVar2, switchDefaults, mutableInteractionSourceImpl, coil3.ExtrasKt.write(1630501043, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: o.updateSendingParameters
            private static int RemoteActionCompatParcelizer = 1;
            private static int write;

            /* JADX WARN: Code duplicated, block: B:10:0x0050 A[PHI: r5 r6
  0x0050: PHI (r5v5 o.getBirthDateFull) = (r5v1 o.getBirthDateFull), (r5v7 o.getBirthDateFull) binds: [B:8:0x0043, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x0050: PHI (r6v15 int) = (r6v2 int), (r6v18 int) binds: [B:8:0x0043, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:37:0x0107  */
            /* JADX WARN: Code duplicated, block: B:9:0x0045 A[PHI: r5 r6
  0x0045: PHI (r5v2 o.getBirthDateFull) = (r5v1 o.getBirthDateFull), (r5v7 o.getBirthDateFull) binds: [B:8:0x0043, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r6v3 int) = (r6v2 int), (r6v18 int) binds: [B:8:0x0043, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
            public final Object invoke(Object obj10, Object obj11, Object obj12) {
                getBirthDateFull getbirthdatefull2;
                int iIntValue2;
                boolean z2;
                int i12 = 2 % 2;
                int i13 = RemoteActionCompatParcelizer + 75;
                write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    getbirthdatefull2 = (getBirthDateFull) obj11;
                    iIntValue2 = ((Integer) obj12).intValue();
                    ((copyejIjP34) obj10).getClass();
                    if ((iIntValue2 & 122) != 84) {
                        int i14 = RemoteActionCompatParcelizer + 71;
                        write = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    getbirthdatefull2 = (getBirthDateFull) obj11;
                    iIntValue2 = ((Integer) obj12).intValue();
                    ((copyejIjP34) obj10).getClass();
                    if ((iIntValue2 & 17) != 16) {
                        int i16 = RemoteActionCompatParcelizer + 71;
                        write = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                boolean zWrite = getpostalcode2.write(iIntValue2 & 1, z2);
                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                if (zWrite) {
                    androidx.compose.ui.Modifier modifierWrite = androidx.compose.foundation.layout.SizeKt.write(androidx.compose.ui.Modifier.Companion, 1.0f);
                    getpostalcode2.serializer(-1003410150);
                    getpostalcode2.serializer(212064437);
                    getpostalcode2.IconCompatParcelizer(false);
                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) getpostalcode2.write((getNewPassword) androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                    Object objComponentActivity = getpostalcode2.ComponentActivity();
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new androidx.constraintlayout.compose.Measurer2(density);
                        getpostalcode2.write(objComponentActivity);
                    }
                    androidx.constraintlayout.compose.Measurer2 measurer2 = (androidx.constraintlayout.compose.Measurer2) objComponentActivity;
                    Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new DrawBehindElement();
                        getpostalcode2.write(objComponentActivity2);
                    }
                    DrawBehindElement drawBehindElement = (DrawBehindElement) objComponentActivity2;
                    Object objComponentActivity3 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                        getpostalcode2.write(objComponentActivity3);
                        int i18 = RemoteActionCompatParcelizer + 53;
                        write = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                    }
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity3;
                    Object objComponentActivity4 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = new DrawBackgroundModifier(drawBehindElement);
                        getpostalcode2.write(objComponentActivity4);
                    }
                    DrawBackgroundModifier drawBackgroundModifier = (DrawBackgroundModifier) objComponentActivity4;
                    Object objComponentActivity5 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = androidx.compose.runtime.CompositionKt.serializer(createfromparcel2, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
                        getpostalcode2.write(objComponentActivity5);
                    }
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity5;
                    boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(measurer2);
                    boolean z3 = getpostalcode2.read(257);
                    Object objComponentActivity6 = getpostalcode2.ComponentActivity();
                    Object obj13 = null;
                    if (!(zIconCompatParcelizer | z3)) {
                        int i20 = RemoteActionCompatParcelizer + 19;
                        write = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i20 % 2 != 0) {
                            obj13.hashCode();
                            throw null;
                        }
                        if (objComponentActivity6 == androidContentCaptureManager) {
                            ActivityPackageSender1 activityPackageSender1 = new ActivityPackageSender1(populateViewStructure_androidKtpopulate8, measurer2, drawBackgroundModifier, populateViewStructure_androidKtpopulate7, 0);
                            getpostalcode2.write(activityPackageSender1);
                            objComponentActivity6 = activityPackageSender1;
                        }
                    } else {
                        ActivityPackageSender1 activityPackageSender2 = new ActivityPackageSender1(populateViewStructure_androidKtpopulate8, measurer2, drawBackgroundModifier, populateViewStructure_androidKtpopulate7, 0);
                        getpostalcode2.write(activityPackageSender2);
                        objComponentActivity6 = activityPackageSender2;
                    }
                    androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) objComponentActivity6;
                    Object objComponentActivity7 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity7 == androidContentCaptureManager) {
                        objComponentActivity7 = new IActivityPackageSender(populateViewStructure_androidKtpopulate7, drawBackgroundModifier, 0);
                        getpostalcode2.write(objComponentActivity7);
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity7;
                    boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(measurer2);
                    Object objComponentActivity8 = getpostalcode2.ComponentActivity();
                    if (zIconCompatParcelizer2 || objComponentActivity8 == androidContentCaptureManager) {
                        objComponentActivity8 = new IActivityPackageSenderResponseDataCallbackSubscriber(measurer2, 0);
                        getpostalcode2.write(objComponentActivity8);
                    }
                    androidx.compose.ui.layout.LayoutKt.MultiMeasureLayout(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifierWrite, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, 1, null), coil3.ExtrasKt.write(1200550679, new ScrollExtensionsKtstopScroll2(populateViewStructure_androidKtpopulate8, drawBehindElement, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, str2, i3, colorFilter), getpostalcode2), measurePolicy, getpostalcode2, 48, 0);
                    getpostalcode2.IconCompatParcelizer(false);
                    return createfromparcel2;
                }
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                return createfromparcel2;
            }
        }, getpostalcode), getpostalcode, 805309440);
        getpostalcode.IconCompatParcelizer(true);
        return createfromparcel;
    }
}
