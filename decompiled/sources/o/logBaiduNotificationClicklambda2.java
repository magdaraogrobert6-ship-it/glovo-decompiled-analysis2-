package o;

import android.util.Pair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.socket.parser.IOParser$Decoder;

/* JADX INFO: loaded from: classes3.dex */
final class logBaiduNotificationClicklambda2 extends migrateMetadataToJsonlambda4<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> {
    final /* synthetic */ refreshBannersIfAppropriatelambda0 read;

    public logBaiduNotificationClicklambda2(refreshBannersIfAppropriatelambda0 refreshbannersifappropriatelambda0) {
        this.read = refreshbannersifappropriatelambda0;
    }

    @Override // o.migrateMetadataToJsonlambda4
    public final Pair write() {
        removeFromCustomAttributeArraylambda1 removefromcustomattributearraylambda1Serializer;
        refreshBannersIfAppropriatelambda0 refreshbannersifappropriatelambda0 = this.read;
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = refreshbannersifappropriatelambda0.RemoteActionCompatParcelizer;
        long j = refreshbannersifappropriatelambda0.serializer;
        String str = refreshbannersifappropriatelambda0.IconCompatParcelizer;
        handleIncomingIntent handleincomingintent = refreshbannersifappropriatelambda0.read;
        setsoundifpresentandsupportedlambda1.getClass();
        r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
        r8lambda1mnczrzuv4owduwgkg6cjtsws.write = Long.valueOf(j);
        if (handleincomingintent == null) {
            removefromcustomattributearraylambda1Serializer = null;
        } else {
            r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(6);
            String str2 = handleincomingintent.IconCompatParcelizer;
            if (str2 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'ssid' cannot be null");
                return null;
            }
            r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer = str2;
            removefromcustomattributearraylambda1Serializer = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.serializer();
        }
        r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = removefromcustomattributearraylambda1Serializer;
        if (((Long) r8lambda1mnczrzuv4owduwgkg6cjtsws.write) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'start' is missing");
            return null;
        }
        setLineId setlineid = new setLineId(r8lambda1mnczrzuv4owduwgkg6cjtsws);
        isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(5);
        iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer = setlineid;
        setLanguage setlanguageSerializer = iscontentcardsunreadvisualindicatorenabled.serializer();
        IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'stationary_id' cannot be null");
            return null;
        }
        iOParser$Decoder.RemoteActionCompatParcelizer = str;
        iOParser$Decoder.read = setlanguageSerializer;
        return new Pair(setsoundifpresentandsupportedlambda1.write(iOParser$Decoder.write(), Long.valueOf(j)), null);
    }
}
