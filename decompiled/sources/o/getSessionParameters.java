package o;

import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import com.roadrunner.rider.state.quests.data.QuestStatus;
import com.roadrunner.rrds.compose.component.image.zoomable.ZoomableNode;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.DelayKt;
import kotlinx.serialization.internal.EnumSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getSessionParameters implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int serializer;

    public /* synthetic */ getSessionParameters(ZoomableNode zoomableNode) {
        this.serializer = 27;
    }

    public /* synthetic */ getSessionParameters(int i) {
        this.serializer = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        Object obj = null;
        switch (this.serializer) {
            case 0:
                return QuestStatus.$r8$lambda$eIah_mRsCeS60Wa4Ziihug8TFUU();
            case 1:
                ActivityHandler23[] activityHandler23ArrValues = ActivityHandler23.values();
                activityHandler23ArrValues.getClass();
                return new EnumSerializer("com.roadrunner.rider.recruitment.accountcreation.password_creation.data.model.AccountStatus", (Enum[]) activityHandler23ArrValues);
            case 2:
                return DelayKt.serializer(new NafathLogger$$ExternalSyntheticLambda0(25));
            case 3:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 4:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 5:
                return new AtomicBoolean(false);
            case 6:
                return new setWasCloseMessageCalled(setGooglePlayInstant.serializer, 0);
            case 7:
                beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                return new beforeOpened(beforeinappmessageviewclosed, beforeinappmessageviewclosed);
            case 8:
                return new setWasCloseMessageCalled(getRevenue.serializer, 0);
            case 9:
                return new setWasCloseMessageCalled(sendFirstPackage.serializer, 0);
            case 10:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 11:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 12:
                return new setWasCloseMessageCalled(sendReftagReferrers.read, 0);
            case 13:
                return new setWasCloseMessageCalled(afterClosed.IconCompatParcelizer, 0);
            case 14:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 15:
                return new setWasCloseMessageCalled(new setWasCloseMessageCalled(new setWasCloseMessageCalled(r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer, 0), 0), 0);
            case 16:
                return new setWasCloseMessageCalled(onEventTrackingSucceeded.IconCompatParcelizer, 0);
            case 17:
                setWasCloseMessageCalled setwasclosemessagecalled = new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
                int i2 = write + 27;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return setwasclosemessagecalled;
            case 18:
                return QuestStatus.Companion.serializer();
            case 19:
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = QuestStatus.Companion.serializer();
                int i4 = write + 123;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return setgraphicmodalmaxwidthdpSerializer;
                }
                obj.hashCode();
                throw null;
            case 20:
                return new setWasCloseMessageCalled(getMeasurementConsentParameters.read, 0);
            case 21:
                return new setWasCloseMessageCalled(PackageHandler4.IconCompatParcelizer, 0);
            case 22:
                return new setWasCloseMessageCalled(PackageHandler5.serializer, 0);
            case 23:
                return new setWasCloseMessageCalled(PackageHandler2.IconCompatParcelizer, 0);
            case 24:
                return androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(null);
            case 25:
                return androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(null);
            case 26:
                return androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
            case 27:
                return Boolean.FALSE;
            case 28:
                return new setWasCloseMessageCalled(r8lambdaNdoXU6mZMdprh2aRHhH7NbiG20s.RemoteActionCompatParcelizer, 0);
            default:
                return new setWasCloseMessageCalled(r8lambdaKtdKiRrtgSEewC_AURrRCqv4EP4.write, 0);
        }
    }
}
