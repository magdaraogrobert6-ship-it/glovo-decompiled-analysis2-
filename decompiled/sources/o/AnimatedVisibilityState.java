package o;

import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageCardContainerKt;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.model.IvrState;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$PaymentStatus;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CardCashPaymentTaskUiItem$PaymentType;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.delivery.state.TrackingEvent$$serializer;
import com.roadrunner.delivery.state.pudo.ButtonTypeToken;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.EnumSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AnimatedVisibilityState implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int read;

    public /* synthetic */ AnimatedVisibilityState(int i) {
        this.read = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        switch (this.read) {
            case 0:
                return new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, packFloats.read);
            case 1:
                int i3 = ActionableMessageCardContainerKt.RemoteActionCompatParcelizer;
                return createFromParcel.INSTANCE;
            case 2:
                return new setWasCloseMessageCalled(setFontAttributeslambda2.RemoteActionCompatParcelizer, 0);
            case 3:
                return new getInheritSecurePolicyui(AndroidViewHolderlayoutNode13.IconCompatParcelizer);
            case 4:
                return new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.overdue.data.model.IssueRequestBody", displayInAppMessagelambda1.serializer(from8_81llA.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(TextForegroundStyleUnspecified.class), displayInAppMessagelambda1.serializer(TextForegroundStyleExternalSyntheticLambda0.class)}, new setGraphicModalMaxWidthDp[]{TextForegroundStyleCompanion.RemoteActionCompatParcelizer, TextGeometricTransform.serializer}, new Annotation[0]);
            case 5:
                return new setWasCloseMessageCalled(onDismissed.write, 0);
            case 6:
                return new setWasCloseMessageCalled(onDismissed.write, 0);
            case 7:
                setWasCloseMessageCalled setwasclosemessagecalled = new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
                int i4 = serializer + 37;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 67 / 0;
                }
                return setwasclosemessagecalled;
            case 8:
                return new setWasCloseMessageCalled(onDismissed.write, 0);
            case 9:
                return new setWasCloseMessageCalled(TrackingEvent$$serializer.write, 0);
            case 10:
                return IvrState.Companion.serializer();
            case 11:
                beforeOpened beforeopened = new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, getWasCloseMessageCalled.write);
                int i6 = IconCompatParcelizer + 97;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return beforeopened;
            case 12:
                return IvrState.m4931$r8$lambda$BDXDz6bDivQHLhbxOI8ExiK5M();
            case 13:
                return new setWasCloseMessageCalled(AnimatedVisibilityStateCompanion.RemoteActionCompatParcelizer, 0);
            case 14:
                return new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.pickupdropoff.tasks.model.ButtonAction", displayInAppMessagelambda1.serializer(getNoopState.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(UnsupportedSearchInfo.class), displayInAppMessagelambda1.serializer(CompositionDataTree.class), displayInAppMessagelambda1.serializer(mapTree.class), displayInAppMessagelambda1.serializer(findParameters.class), displayInAppMessagelambda1.serializer(showSystemUi.class)}, new setGraphicModalMaxWidthDp[]{NoopState_androidKt.write, new EnumSerializer("com.roadrunner.delivery.pickupdropoff.tasks.model.ChatAction", CompositionDataTree.INSTANCE, new Annotation[0]), new EnumSerializer("com.roadrunner.delivery.pickupdropoff.tasks.model.ChatOrCallAction", mapTree.INSTANCE, new Annotation[0]), getGroup.RemoteActionCompatParcelizer, widthDp.write}, new Annotation[0]);
            case 15:
                return getNoopState.Companion.serializer();
            case 16:
                return new setWasCloseMessageCalled(TrackingEvent$$serializer.write, 0);
            case 17:
                return ButtonTypeToken.Companion.serializer();
            case 18:
                return CardCashPaymentTaskUiItem$PaymentType.Companion.serializer();
            case 19:
                return CardCashPaymentTaskUiItem$PaymentStatus.Companion.serializer();
            case 20:
                return CardCashPaymentTaskUiItem$PaymentStatus.m4942$r8$lambda$FqHlInwPf0LohvVxl0C4HxY_Sc();
            case 21:
                return CardCashPaymentTaskUiItem$PaymentType.$r8$lambda$zVI3yKQMP80lSkvnQkB6zbo9f2c();
            case 22:
                return CashPaymentTaskUiItem.UiMode.Companion.serializer();
            case 23:
                return new setWasCloseMessageCalled(TrackingEvent$$serializer.write, 0);
            case 24:
                return CashPaymentTaskUiItem.UiMode.m4943$r8$lambda$HdevVG0Gmk6BwKtNN8VIxy7kEk();
            case 25:
                return new EnumSerializer("com.roadrunner.delivery.pickupdropoff.tasks.model.ChatAction", CompositionDataTree.INSTANCE, new Annotation[0]);
            case 26:
                return new EnumSerializer("com.roadrunner.delivery.pickupdropoff.tasks.model.ChatOrCallAction", mapTree.INSTANCE, new Annotation[0]);
            case 27:
                return getNoopState.Companion.serializer();
            case 28:
                return new setWasCloseMessageCalled(showBackground.Companion.serializer(), 0);
            default:
                return new setWasCloseMessageCalled(TrackingEvent$$serializer.write, 0);
        }
    }
}
