package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class BrazeNotificationPayloadConversationPerson extends r8lambdaQAShlesJf6NzG1CuBMO3e9m802I {
    final /* synthetic */ parseNonBlankStringlambda0 read;

    public BrazeNotificationPayloadConversationPerson(parseNonBlankStringlambda0 parsenonblankstringlambda0) {
        this.read = parsenonblankstringlambda0;
    }

    @Override // o.r8lambdaQAShlesJf6NzG1CuBMO3e9m802I
    public final void serializer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release) throws IOException {
        parseNonBlankStringlambda0 parsenonblankstringlambda0 = this.read;
        try {
            if (!setshouldpersistwebviewwhenbackgroundingapp.write()) {
                parsenonblankstringlambda0.serializer(null, new Exception("Failed to retrieve signed log upload url"));
            } else {
                if (setsmallnotificationiconnameandroid_sdk_base_release == null) {
                    parsenonblankstringlambda0.serializer(null, new Exception("Failed to retrieve signed log upload url"));
                    return;
                }
                r8lambda2P0PC5SA4k2zK1ydh8mII2iQrIg r8lambda2p0pc5sa4k2zk1ydh8mii2iqrig = new r8lambda2P0PC5SA4k2zK1ydh8mII2iQrIg();
                r8lambda2p0pc5sa4k2zk1ydh8mii2iqrig.RemoteActionCompatParcelizer(setsmallnotificationiconnameandroid_sdk_base_release.serializer());
                parsenonblankstringlambda0.serializer(r8lambda2p0pc5sa4k2zk1ydh8mii2iqrig.read(), null);
            }
        } catch (Exception e) {
            parsenonblankstringlambda0.serializer(null, e);
        }
    }

    @Override // o.r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ
    public final void RemoteActionCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, IOException iOException) {
        this.read.serializer(null, iOException);
    }
}
