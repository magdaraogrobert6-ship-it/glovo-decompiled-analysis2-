package o;

import android.util.Pair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.C$b;
import io.socket.parser.IOParser$Decoder;

/* JADX INFO: loaded from: classes3.dex */
final class prefetchBitmapsIfNewlyReceivedStoryPush extends migrateMetadataToJsonlambda4<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> {
    final /* synthetic */ refreshBannersIfAppropriate RemoteActionCompatParcelizer;

    public prefetchBitmapsIfNewlyReceivedStoryPush(refreshBannersIfAppropriate refreshbannersifappropriate) {
        this.RemoteActionCompatParcelizer = refreshbannersifappropriate;
    }

    @Override // o.migrateMetadataToJsonlambda4
    public final Pair write() {
        refreshBannersIfAppropriate refreshbannersifappropriate = this.RemoteActionCompatParcelizer;
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = refreshbannersifappropriate.write;
        long j = refreshbannersifappropriate.IconCompatParcelizer;
        String str = refreshbannersifappropriate.RemoteActionCompatParcelizer;
        byte b = refreshbannersifappropriate.read;
        setsoundifpresentandsupportedlambda1.getClass();
        C$b c$b = new C$b();
        c$b.write = Byte.valueOf(b);
        c$b.serializer = Long.valueOf(j);
        setCustomUserAttributeToSecondsFromEpoch setcustomuserattributetosecondsfromepoch = new setCustomUserAttributeToSecondsFromEpoch(c$b);
        isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(5);
        iscontentcardsunreadvisualindicatorenabled.write = setcustomuserattributetosecondsfromepoch;
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
