package o;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
final class refreshFeatureFlagsIfAppropriatelambda0 extends migrateMetadataToJsonlambda4<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> {
    final /* synthetic */ routeUserWithNotificationOpenedIntent write;

    public refreshFeatureFlagsIfAppropriatelambda0(routeUserWithNotificationOpenedIntent routeuserwithnotificationopenedintent) {
        this.write = routeuserwithnotificationopenedintent;
    }

    @Override // o.migrateMetadataToJsonlambda4
    public final Pair write() {
        routeUserWithNotificationOpenedIntent routeuserwithnotificationopenedintent = this.write;
        byte bByteValue = routeuserwithnotificationopenedintent.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.byteValue();
        byte b = 1;
        if (bByteValue != 1) {
            b = 2;
            if (bByteValue != 2) {
                b = 3;
            }
        }
        setEmailNotificationSubscriptionTypelambda0 setemailnotificationsubscriptiontypelambda0RemoteActionCompatParcelizer = routeUserWithNotificationOpenedIntent.RemoteActionCompatParcelizer(routeuserwithnotificationopenedintent, routeuserwithnotificationopenedintent.RemoteActionCompatParcelizer.IconCompatParcelizer);
        setPhoneNumber setphonenumberRemoteActionCompatParcelizer = routeUserWithNotificationOpenedIntent.RemoteActionCompatParcelizer(routeuserwithnotificationopenedintent, routeuserwithnotificationopenedintent.RemoteActionCompatParcelizer.write);
        setCustomUserAttributelambda2 setcustomuserattributelambda2Serializer = routeUserWithNotificationOpenedIntent.serializer(routeuserwithnotificationopenedintent, routeuserwithnotificationopenedintent.RemoteActionCompatParcelizer.serializer);
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = routeuserwithnotificationopenedintent.IconCompatParcelizer;
        long j = routeuserwithnotificationopenedintent.serializer;
        setsoundifpresentandsupportedlambda1.getClass();
        isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(7);
        iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer = Byte.valueOf(b);
        iscontentcardsunreadvisualindicatorenabled.write = setemailnotificationsubscriptiontypelambda0RemoteActionCompatParcelizer;
        iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer = setphonenumberRemoteActionCompatParcelizer;
        iscontentcardsunreadvisualindicatorenabled.read = setcustomuserattributelambda2Serializer;
        return new Pair(setsoundifpresentandsupportedlambda1.write(iscontentcardsunreadvisualindicatorenabled.read(), Long.valueOf(j)), null);
    }
}
