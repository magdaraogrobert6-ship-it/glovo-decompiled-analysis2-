package o;

import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
final class getStoryPageId extends r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE {
    private final getTitleGravity RemoteActionCompatParcelizer;
    final /* synthetic */ setStoryPageId serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getStoryPageId(setStoryPageId setstorypageid, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getTitleGravity gettitlegravity) {
        super(readandroid_sdk_base_releaseVar);
        this.serializer = setstorypageid;
        this.RemoteActionCompatParcelizer = gettitlegravity;
    }

    @Override // o.r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE
    public final void IconCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, IOException iOException) {
        this.serializer.RemoteActionCompatParcelizer.IconCompatParcelizer(false, iOException, "Error while trying to get unfulfilled requests", new Object[0]);
        ((isBot) this.RemoteActionCompatParcelizer).IconCompatParcelizer();
    }

    @Override // o.r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE
    public final void write(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release) {
        getTitleGravity gettitlegravity = this.RemoteActionCompatParcelizer;
        setStoryPageId setstorypageid = this.serializer;
        try {
            int i = setshouldpersistwebviewwhenbackgroundingapp.serializer;
            if (i == 200 && setsmallnotificationiconnameandroid_sdk_base_release != null) {
                ((isBot) gettitlegravity).RemoteActionCompatParcelizer(setStoryPageId.write(setstorypageid, new ArrayList(r8lambdaiQEV_tanPVE3vsMXIsq4smLFSM.RemoteActionCompatParcelizer(r8lambda7_6uuySr2Pfu4FrsMBeetrQwiRc.class, setsmallnotificationiconnameandroid_sdk_base_release.serializer(), "requests"))));
                return;
            }
            setstorypageid.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Could not fetch unfulfilled requests, response code: %d", Integer.valueOf(i));
            ((isBot) gettitlegravity).IconCompatParcelizer();
        } catch (IOException e) {
            setstorypageid.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to read response body", new Object[0]);
            ((isBot) gettitlegravity).IconCompatParcelizer();
        } catch (JSONException e2) {
            setstorypageid.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e2, "Failed to parse response body", new Object[0]);
            ((isBot) gettitlegravity).IconCompatParcelizer();
        }
    }

    @Override // o.r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE
    public final void IconCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, IOException iOException) {
        this.serializer.RemoteActionCompatParcelizer.IconCompatParcelizer(false, iOException, "Unexpected IOException while handling unfulfilled requests response", new Object[0]);
        ((isBot) this.RemoteActionCompatParcelizer).IconCompatParcelizer();
    }
}
