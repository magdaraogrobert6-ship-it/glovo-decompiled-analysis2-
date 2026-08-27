package o;

import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import com.roadrunner.database.entity.state.Courier$VehicleType;
import com.roadrunner.delivery.state.TrackingEvent$$serializer;
import java.lang.annotation.Annotation;
import kotlinx.coroutines.DelayKt;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class accessgetAboveBaselinecp implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int read;

    public /* synthetic */ accessgetAboveBaselinecp(int i) {
        this.read = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 59;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj = null;
        switch (this.read) {
            case 0:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 1:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 2:
                setWasCloseMessageCalled setwasclosemessagecalled = new setWasCloseMessageCalled(toUpperCase.IconCompatParcelizer, 0);
                int i4 = IconCompatParcelizer + 81;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return setwasclosemessagecalled;
                }
                throw null;
            case 3:
                return new setWasCloseMessageCalled(toUpperCase.IconCompatParcelizer, 0);
            case 4:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 5:
                return new setWasCloseMessageCalled(withLink.write, 0);
            case 6:
                return SelfServiceCustomerChatActivity.RemoteActionCompatParcelizer();
            case 7:
                return new setWasCloseMessageCalled(PlaceholderVerticalAlignCompanion.serializer, 0);
            case 8:
                return new r8lambdajLZjISTEcJDErHfjnoa2Tfm8wI(displayInAppMessagelambda1.serializer(DateTime.class), new setGraphicModalMaxWidthDp[0]);
            case 9:
                r8lambdajLZjISTEcJDErHfjnoa2Tfm8wI r8lambdajlzjistecjderhfjnoa2tfm8wi = new r8lambdajLZjISTEcJDErHfjnoa2Tfm8wI(displayInAppMessagelambda1.serializer(DateTime.class), new setGraphicModalMaxWidthDp[0]);
                int i5 = RemoteActionCompatParcelizer + 95;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return r8lambdajlzjistecjderhfjnoa2tfm8wi;
                }
                obj.hashCode();
                throw null;
            case 10:
                return Courier$VehicleType.$r8$lambda$zjE7mrWibigRZX9b9KY_mmD6vlc();
            case 11:
                return new setWasCloseMessageCalled(accessgetCurrentlyFocusedRect.Companion.serializer(), 0);
            case 12:
                return AndroidPopup_androidKtPopup41.Companion.serializer();
            case 13:
                return new setWasCloseMessageCalled(obtainAndroidOutline.Companion.serializer(), 0);
            case 14:
                return new setWasCloseMessageCalled(TrackingEvent$$serializer.write, 0);
            case 15:
                return AndroidPopup_androidKtPopup41.Companion.serializer();
            case 16:
                return new setWasCloseMessageCalled(obtainAndroidOutline.Companion.serializer(), 0);
            case 17:
                return new setWasCloseMessageCalled(TrackingEvent$$serializer.write, 0);
            case 18:
                return "Delivery details";
            case 19:
                return new PopupLayoutHelperImpl29(getLineSpacingExtra.Companion.serializer());
            case 20:
                return new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreen.LastStopScreenComponent", displayInAppMessagelambda1.serializer(getLineSpacingExtra.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(getJustificationMode.class), displayInAppMessagelambda1.serializer(getRightIndents.class), displayInAppMessagelambda1.serializer(getTextDir.class), displayInAppMessagelambda1.serializer(clipPath.class), displayInAppMessagelambda1.serializer(TextAlignmentAdapter.class)}, new setGraphicModalMaxWidthDp[]{getUseFallbackLineSpacing.write, getLineSpacingMultiplier.serializer, getPaint.RemoteActionCompatParcelizer, clipRect.RemoteActionCompatParcelizer, TextAndroidCanvas.read}, new Annotation[0]);
            case 21:
                return new setWasCloseMessageCalled(TrackingEvent$$serializer.write, 0);
            case 22:
                return new setWasCloseMessageCalled(TrackingEvent$$serializer.write, 0);
            case 23:
                return new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, packFloats.read);
            case 24:
                return new setWasCloseMessageCalled(TrackingEvent$$serializer.write, 0);
            case 25:
                return new setWasCloseMessageCalled(TrackingEvent$$serializer.write, 0);
            case 26:
                return "Cash tags";
            case 27:
                return DelayKt.serializer(new accessgetTextCentercp(26));
            case 28:
                return new setWasCloseMessageCalled(loadWithTimeoutOrNullui_text.IconCompatParcelizer, 0);
            default:
                return new getFocusable(obtainAndroidOutline.Companion.serializer());
        }
    }
}
