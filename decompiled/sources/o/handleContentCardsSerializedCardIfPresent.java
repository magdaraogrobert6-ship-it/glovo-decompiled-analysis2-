package o;

import android.location.Location;
import android.util.Pair;
import io.socket.parser.IOParser$Decoder;

/* JADX INFO: loaded from: classes3.dex */
final class handleContentCardsSerializedCardIfPresent extends migrateMetadataToJsonlambda4<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> {
    final /* synthetic */ handleCancelNotificationActionlambda0 write;

    public handleContentCardsSerializedCardIfPresent(handleCancelNotificationActionlambda0 handlecancelnotificationactionlambda0) {
        this.write = handlecancelnotificationactionlambda0;
    }

    @Override // o.migrateMetadataToJsonlambda4
    public final Pair write() {
        handleCancelNotificationActionlambda0 handlecancelnotificationactionlambda0 = this.write;
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = handlecancelnotificationactionlambda0.write;
        Location location = handlecancelnotificationactionlambda0.RemoteActionCompatParcelizer;
        String str = handlecancelnotificationactionlambda0.serializer;
        r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls();
        setsoundifpresentandsupportedlambda1.getClass();
        r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem = setSoundIfPresentAndSupportedlambda1.read(location);
        setContentCardsUnreadVisualIndicatorEnabled setcontentcardsunreadvisualindicatorenabledRatingCompat = r8lambdayc78smgbbb6fudfjq0u5z3_ls.RatingCompat();
        IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
        iOParser$Decoder.RemoteActionCompatParcelizer(str);
        iOParser$Decoder.read = setcontentcardsunreadvisualindicatorenabledRatingCompat;
        return new Pair(setsoundifpresentandsupportedlambda1.write(iOParser$Decoder.MediaDescriptionCompat(), Long.valueOf(location.getTime())), null);
    }
}
