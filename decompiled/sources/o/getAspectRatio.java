package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.I$b;
import com.sentiance.sdk.eventtimeline.timelines.creators.ScreenState;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class getAspectRatio extends getCardType<r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug> {
    private final parseLonglambda0 write;

    @Override // o.getCardType
    public final short IconCompatParcelizer() {
        return (short) 104;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    @Override // o.getCardType
    public final getDefaultNotificationAccentColorandroid_sdk_base_release IconCompatParcelizer(r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE r8lambdajpyyzonaiuxh7ebz6m40cuqfrme) {
        setAdmMessagingRegistrationEnabledandroid_sdk_base_release setadmmessagingregistrationenabledandroid_sdk_base_release;
        r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug r8lambdagfx2d0s8xnd6nnquzmue4f_plug = (r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug) r8lambdajpyyzonaiuxh7ebz6m40cuqfrme;
        ScreenState screenStateSerializer = r8lambdagfx2d0s8xnd6nnquzmue4f_plug.serializer();
        r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM r8lambdaxdc9yg9rrx23qvlbekkfzieitwm = new r8lambdaXdc9yg9rrx23qvlBEKkfzIEiTWM();
        if (screenStateSerializer == ScreenState.UNKNOWN) {
            r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer = (byte) 0;
        } else {
            if (screenStateSerializer != ScreenState.ON) {
                if (screenStateSerializer == ScreenState.OFF) {
                    r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer = (byte) 2;
                } else {
                    setadmmessagingregistrationenabledandroid_sdk_base_release = null;
                }
                if (setadmmessagingregistrationenabledandroid_sdk_base_release == null) {
                    this.write.RemoteActionCompatParcelizer("Unknown screen state: %s", r8lambdagfx2d0s8xnd6nnquzmue4f_plug.serializer());
                    return null;
                }
                I$b i$b = new I$b(0);
                i$b.MediaSessionCompatResultReceiverWrapper = setadmmessagingregistrationenabledandroid_sdk_base_release;
                return i$b.write();
            }
            r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer = (byte) 1;
        }
        if (r8lambdaxdc9yg9rrx23qvlbekkfzieitwm.serializer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'value' is missing");
            return null;
        }
        setadmmessagingregistrationenabledandroid_sdk_base_release = new setAdmMessagingRegistrationEnabledandroid_sdk_base_release(r8lambdaxdc9yg9rrx23qvlbekkfzieitwm);
        if (setadmmessagingregistrationenabledandroid_sdk_base_release == null) {
            this.write.RemoteActionCompatParcelizer("Unknown screen state: %s", r8lambdagfx2d0s8xnd6nnquzmue4f_plug.serializer());
            return null;
        }
        I$b i$b2 = new I$b(0);
        i$b2.MediaSessionCompatResultReceiverWrapper = setadmmessagingregistrationenabledandroid_sdk_base_release;
        return i$b2.write();
    }

    public getAspectRatio(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, parseLonglambda0 parselonglambda0, List<r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug> list) {
        super(setsoundifpresentandsupportedlambda1, list);
        this.write = parselonglambda0;
    }
}
