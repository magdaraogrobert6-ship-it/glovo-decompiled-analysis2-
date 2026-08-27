package o;

import android.os.SystemClock;
import java.util.Calendar;
import kotlinx.serialization.json.JsonNullSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class performPushDeliveryFlushlambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int serializer;

    public /* synthetic */ performPushDeliveryFlushlambda1(publishError publisherror) {
        this.serializer = 0;
    }

    public /* synthetic */ performPushDeliveryFlushlambda1(int i) {
        this.serializer = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        switch (this.serializer) {
            case 0:
                return ensureMenuView.write();
            case 1:
                return new r8lambdajLZjISTEcJDErHfjnoa2Tfm8wI(displayInAppMessagelambda1.serializer(Calendar.class), new setGraphicModalMaxWidthDp[0]);
            case 2:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 3:
                return new setWasCloseMessageCalled(onAttributionChanged.serializer, 0);
            case 4:
                setWasCloseMessageCalled setwasclosemessagecalled = new setWasCloseMessageCalled(afterClosed.IconCompatParcelizer, 0);
                int i2 = IconCompatParcelizer + 89;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return setwasclosemessagecalled;
                }
                throw null;
            case 5:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 6:
                return Long.valueOf(SystemClock.uptimeMillis());
            case 7:
                return new setWasCloseMessageCalled(r8lambdaivE2RM1mml2A9H2IkVxUz0Ay7OU.serializer, 0);
            case 8:
                return new setWasCloseMessageCalled(r8lambdaivE2RM1mml2A9H2IkVxUz0Ay7OU.serializer, 0);
            case 9:
                return new setWasCloseMessageCalled(r8lambdajbxBm0A7iJGxAyZffWwcxD8hq8k.Companion.serializer(), 0);
            case 10:
                return r8lambdaugY17WQO8mpsLV5Hi_noV0m5c6M.serializer.getDescriptor();
            case 11:
                return JsonNullSerializer.read.getDescriptor();
            case 12:
                return r8lambdaW1Un4um7jYXCqpIQphdSIfhdGU.write.getDescriptor();
            case 13:
                r8lambdagPJkKPmK6NmiRVYpj74Jv2gOTik r8lambdagpjkkpmk6nmirvypj74jv2gotik = r8lambdaiI68GpvQ5K1derb8jFmgrH4UbGc.IconCompatParcelizer;
                int i3 = IconCompatParcelizer + 103;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return r8lambdagpjkkpmk6nmirvypj74jv2gotik;
                }
                throw null;
            default:
                return performDismiss.IconCompatParcelizer.getDescriptor();
        }
    }
}
