package o;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
final class handleNotificationOpened extends migrateMetadataToJsonlambda4<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> {
    final /* synthetic */ handleNotificationDeletedlambda1 IconCompatParcelizer;

    public handleNotificationOpened(handleNotificationDeletedlambda1 handlenotificationdeletedlambda1) {
        this.IconCompatParcelizer = handlenotificationdeletedlambda1;
    }

    @Override // o.migrateMetadataToJsonlambda4
    public final Pair write() {
        handleNotificationDeletedlambda1 handlenotificationdeletedlambda1 = this.IconCompatParcelizer;
        setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1 = handlenotificationdeletedlambda1.read;
        initializeGeofenceslambda0 initializegeofenceslambda0 = handlenotificationdeletedlambda1.RemoteActionCompatParcelizer;
        r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug r8lambdafjifijxjxuf3vopuwrut7txivug = handlenotificationdeletedlambda1.serializer;
        initializegeofenceslambda0.getClass();
        return new Pair(setsoundifpresentandsupportedlambda1.write(initializeGeofenceslambda0.read(r8lambdafjifijxjxuf3vopuwrut7txivug), null), null);
    }
}
