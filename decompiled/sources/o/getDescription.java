package o;

import com.sentiance.core.model.events.I$b;
import com.sentiance.sdk.eventtimeline.timelines.creators.CallType;
import io.socket.parser.IOParser$Decoder;
import java.util.List;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public class getDescription extends getCardType<r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4> {
    private final parseLonglambda0 serializer;

    @Override // o.getCardType
    public final short IconCompatParcelizer() {
        return (short) 106;
    }

    @Override // o.getCardType
    public final getDefaultNotificationAccentColorandroid_sdk_base_release IconCompatParcelizer(r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE r8lambdajpyyzonaiuxh7ebz6m40cuqfrme) {
        Byte b;
        getSdkFlavorandroid_sdk_base_release getsdkflavorandroid_sdk_base_releaseMediaSessionCompatQueueItem;
        getSessionTimeoutandroid_sdk_base_release getsessiontimeoutandroid_sdk_base_release;
        CallType callTypeMediaBrowserCompatMediaItem = ((r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4) r8lambdajpyyzonaiuxh7ebz6m40cuqfrme).MediaBrowserCompatMediaItem();
        if (callTypeMediaBrowserCompatMediaItem == CallType.UNKNOWN) {
            b = (byte) 0;
        } else if (callTypeMediaBrowserCompatMediaItem == CallType.NO_CALL) {
            b = (byte) 1;
        } else if (callTypeMediaBrowserCompatMediaItem == CallType.MOBILE_CALL) {
            b = (byte) 2;
        } else {
            b = callTypeMediaBrowserCompatMediaItem == CallType.VOIP_CALL ? (byte) 3 : null;
        }
        IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
        if (callTypeMediaBrowserCompatMediaItem == CallType.MOBILE_CALL) {
            iOParser$Decoder.RemoteActionCompatParcelizer = new getShouldAddStatusBarPaddingToInAppMessagesandroid_sdk_base_release();
            getsdkflavorandroid_sdk_base_releaseMediaSessionCompatQueueItem = iOParser$Decoder.MediaSessionCompatQueueItem();
        } else if (callTypeMediaBrowserCompatMediaItem == CallType.VOIP_CALL) {
            iOParser$Decoder.read = new getShouldUseWindowFlagSecureInActivitiesandroid_sdk_base_release();
            getsdkflavorandroid_sdk_base_releaseMediaSessionCompatQueueItem = iOParser$Decoder.MediaSessionCompatQueueItem();
        } else {
            getsdkflavorandroid_sdk_base_releaseMediaSessionCompatQueueItem = null;
        }
        if (b == null) {
            this.serializer.RemoteActionCompatParcelizer("Unknown call state for type: %s", callTypeMediaBrowserCompatMediaItem);
            getsessiontimeoutandroid_sdk_base_release = null;
        } else {
            FormBody.Builder builder = new FormBody.Builder();
            builder.serializer = b;
            builder.RemoteActionCompatParcelizer = getsdkflavorandroid_sdk_base_releaseMediaSessionCompatQueueItem;
            getsessiontimeoutandroid_sdk_base_release = new getSessionTimeoutandroid_sdk_base_release(builder);
        }
        if (getsessiontimeoutandroid_sdk_base_release == null) {
            return null;
        }
        I$b i$b = new I$b(0);
        i$b.MediaSessionCompatQueueItem = getsessiontimeoutandroid_sdk_base_release;
        return i$b.write();
    }

    public getDescription(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, parseLonglambda0 parselonglambda0, List<r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4> list) {
        super(setsoundifpresentandsupportedlambda1, list);
        this.serializer = parselonglambda0;
    }
}
