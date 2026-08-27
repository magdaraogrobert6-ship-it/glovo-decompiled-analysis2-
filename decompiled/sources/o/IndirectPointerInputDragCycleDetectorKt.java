package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.stacked.delivery.list.compose.OrderNumberVerticalIndicatorKt;
import com.roadrunner.delivery.stacked.delivery.list.compose.v1.OrderDetailsContainerKt;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class IndirectPointerInputDragCycleDetectorKt extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int MediaBrowserCompatMediaItem = 0;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaMetadataCompat;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndirectPointerInputDragCycleDetectorKt(androidx.compose.animation.core.Transition transition, androidx.compose.ui.Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Alignment alignment, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i) {
        super(2);
        this.RatingCompat = transition;
        this.IconCompatParcelizer = modifier;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = alignment;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.RemoteActionCompatParcelizer = dragAndDropTargetModifierNode;
        this.write = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndirectPointerInputDragCycleDetectorKt(androidx.compose.animation.core.Transition transition, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1, TapGestureDetectorKt tapGestureDetectorKt, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i) {
        super(2);
        this.RatingCompat = transition;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = modifier;
        this.read = scrollingLogicdoFlingAnimation2reverseScope1;
        this.serializer = tapGestureDetectorKt;
        this.RemoteActionCompatParcelizer = dragAndDropTargetModifierNode;
        this.write = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndirectPointerInputDragCycleDetectorKt(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, DrawBehindElement drawBehindElement, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ r8lambdayigkjx4opgvyddqvttr8slptylq, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        super(2);
        this.RatingCompat = populateViewStructure_androidKtpopulate7;
        this.IconCompatParcelizer = drawBehindElement;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdayigkjx4opgvyddqvttr8slptylq;
        this.write = i;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x016f  */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        TagColorToken tagColorToken;
        boolean z;
        int i = 2 % 2;
        int i2 = this.MediaBrowserCompatMediaItem;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.read;
        int i3 = this.write;
        Object obj4 = this.RatingCompat;
        Object obj5 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj6 = this.serializer;
        if (i2 == 0) {
            ((Number) obj2).intValue();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(1 | i3);
            androidx.compose.animation.AnimatedContentKt.AnimatedContent((androidx.compose.animation.core.Transition) obj4, (androidx.compose.ui.Modifier) obj5, this.MediaMetadataCompat, (androidx.compose.ui.Alignment) obj6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, (DragAndDropTargetModifierNode) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel;
        }
        if (i2 == 1) {
            ((Number) obj2).intValue();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(1 | i3);
            androidx.compose.animation.AnimatedVisibilityKt.IconCompatParcelizer((androidx.compose.animation.core.Transition) obj4, this.MediaMetadataCompat, (androidx.compose.ui.Modifier) obj5, (ScrollingLogicdoFlingAnimation2reverseScope1) obj3, (TapGestureDetectorKt) obj6, (DragAndDropTargetModifierNode) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
            return createfromparcel;
        }
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ r8lambdayigkjx4opgvyddqvttr8slptylq = (r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ) obj6;
        DrawBehindElement drawBehindElement = (DrawBehindElement) obj5;
        if ((((Number) obj2).intValue() & 3) == 2) {
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.MediaSessionCompatToken()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                return createfromparcel;
            }
        }
        ((PopulateViewStructure_androidKtpopulate7) obj4).setValue(createfromparcel);
        int i4 = drawBehindElement.MediaSessionCompatQueueItem;
        drawBehindElement.read();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.serializer(-1599525993);
        DrawBehindElement drawBehindElement2 = (DrawBehindElement) drawBehindElement.serializer().serializer;
        ClipKt clipKtRemoteActionCompatParcelizer = drawBehindElement2.RemoteActionCompatParcelizer();
        ClipKt clipKtRemoteActionCompatParcelizer2 = drawBehindElement2.RemoteActionCompatParcelizer();
        WrapPreview wrapPreview = r8lambdayigkjx4opgvyddqvttr8slptylq.MediaBrowserCompatMediaItem;
        if (wrapPreview == null || (tagColorToken = wrapPreview.write) == null) {
            tagColorToken = TagColorToken.NaturalPale;
        }
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
        androidx.compose.ui.Modifier modifierM74paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dimensions.setActionBarVisibilityCallback, 0.0f, 11);
        Object objComponentActivity = getpostalcode2.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (objComponentActivity == androidContentCaptureManager) {
            int i5 = MediaSessionCompatQueueItem + 29;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                getpostalcode2.write(forScale.RemoteActionCompatParcelizer);
                throw null;
            }
            objComponentActivity = forScale.RemoteActionCompatParcelizer;
            getpostalcode2.write(objComponentActivity);
        }
        OrderNumberVerticalIndicatorKt.OrderNumberVerticalIndicator(tagColorToken, i3 + 1, DrawBehindElement.read(modifierM74paddingqDBjuR0$default, clipKtRemoteActionCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), getpostalcode2, 0);
        boolean z2 = getpostalcode2.read(clipKtRemoteActionCompatParcelizer);
        Object objComponentActivity2 = getpostalcode2.ComponentActivity();
        if (z2 || objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = new readConnectionResponse(clipKtRemoteActionCompatParcelizer, 6);
            getpostalcode2.write(objComponentActivity2);
        }
        androidx.compose.ui.Modifier modifier = DrawBehindElement.read(companion, clipKtRemoteActionCompatParcelizer2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2);
        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(androidx.compose.foundation.layout.Arrangement.MediaDescriptionCompat, androidx.compose.ui.Alignment.Companion.getStart(), getpostalcode2, 0);
        int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
        androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode2, modifier);
        androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
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
        c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
        AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
        if (wrapPreview == null) {
            int i6 = MediaDescriptionCompat + 29;
            MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                getpostalcode2.serializer(-2045496810);
                getpostalcode2.IconCompatParcelizer(true);
                z = false;
            } else {
                getpostalcode2.serializer(-2045496810);
                z = false;
                getpostalcode2.IconCompatParcelizer(false);
            }
        } else {
            z = false;
            getpostalcode2.serializer(-2045496809);
            putInto.RemoteActionCompatParcelizer(wrapPreview, androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dimensions.setMenu, 7), getpostalcode2, 0);
            getpostalcode2.IconCompatParcelizer(false);
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.MediaMetadataCompat;
        boolean z3 = getpostalcode2.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(r8lambdayigkjx4opgvyddqvttr8slptylq);
        Object objComponentActivity3 = getpostalcode2.ComponentActivity();
        if (!z3 && !zIconCompatParcelizer) {
            int i7 = MediaDescriptionCompat + 7;
            MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new AndroidSqliteDriverCallback(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 9, r8lambdayigkjx4opgvyddqvttr8slptylq);
                getpostalcode2.write(objComponentActivity3);
            }
        } else {
            objComponentActivity3 = new AndroidSqliteDriverCallback(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 9, r8lambdayigkjx4opgvyddqvttr8slptylq);
            getpostalcode2.write(objComponentActivity3);
        }
        OrderDetailsContainerKt.OrderDetailsContainer(r8lambdayigkjx4opgvyddqvttr8slptylq, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, this.RemoteActionCompatParcelizer, companion, getpostalcode2, 3080);
        getpostalcode2.IconCompatParcelizer(true);
        getpostalcode2.IconCompatParcelizer(z);
        if (drawBehindElement.MediaSessionCompatQueueItem == i4) {
            return createfromparcel;
        }
        getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, getpostalcode2);
        return createfromparcel;
    }
}
