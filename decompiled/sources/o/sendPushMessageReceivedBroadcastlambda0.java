package o;

import android.util.Pair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.thrift.DetectionTrigger;
import io.socket.parser.IOParser$Decoder;

/* JADX INFO: loaded from: classes3.dex */
final class sendPushMessageReceivedBroadcastlambda0 extends migrateMetadataToJsonlambda4<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> {
    final /* synthetic */ sendPushActionIntent IconCompatParcelizer;

    public sendPushMessageReceivedBroadcastlambda0(sendPushActionIntent sendpushactionintent) {
        this.IconCompatParcelizer = sendpushactionintent;
    }

    @Override // o.migrateMetadataToJsonlambda4
    public final Pair write() {
        sendPushActionIntent sendpushactionintent = this.IconCompatParcelizer;
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = sendpushactionintent.RemoteActionCompatParcelizer;
        long j = sendpushactionintent.IconCompatParcelizer;
        String str = sendpushactionintent.serializer;
        DetectionTrigger detectionTrigger = sendpushactionintent.read;
        Byte b = sendpushactionintent.write;
        b.getClass();
        setsoundifpresentandsupportedlambda1.getClass();
        isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(12);
        iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer = Long.valueOf(j);
        if (detectionTrigger == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'trip_close_trigger' cannot be null");
            return null;
        }
        iscontentcardsunreadvisualindicatorenabled.write = detectionTrigger;
        iscontentcardsunreadvisualindicatorenabled.read = Byte.valueOf(detectionTrigger == DetectionTrigger.EXTERNAL ? (byte) 2 : (byte) 1);
        iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer = b;
        setApiKeyandroid_sdk_base_release setapikeyandroid_sdk_base_releaseWrite = iscontentcardsunreadvisualindicatorenabled.write();
        r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls();
        r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer = setapikeyandroid_sdk_base_releaseWrite;
        setContentCardsUnreadVisualIndicatorEnabled setcontentcardsunreadvisualindicatorenabledRatingCompat = r8lambdayc78smgbbb6fudfjq0u5z3_ls.RatingCompat();
        IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
        iOParser$Decoder.RemoteActionCompatParcelizer(str);
        iOParser$Decoder.read = setcontentcardsunreadvisualindicatorenabledRatingCompat;
        return new Pair(setsoundifpresentandsupportedlambda1.write(iOParser$Decoder.MediaDescriptionCompat(), Long.valueOf(j)), new sendPushMessageReceivedBroadcast(sendpushactionintent.IconCompatParcelizer, sendpushactionintent.serializer));
    }
}
