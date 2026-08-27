package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class getPerson extends r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE {
    final /* synthetic */ d0$$ExternalSyntheticLambda0 RemoteActionCompatParcelizer;
    final /* synthetic */ getBitmapUrl read;
    final /* synthetic */ boolean serializer;
    final /* synthetic */ String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getPerson(getBitmapUrl getbitmapurl, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar, String str, d0$$ExternalSyntheticLambda0 d0__externalsyntheticlambda0, boolean z) {
        super(clearandroid_sdk_base_releaseVar);
        this.read = getbitmapurl;
        this.write = str;
        this.RemoteActionCompatParcelizer = d0__externalsyntheticlambda0;
        this.serializer = z;
    }

    @Override // o.r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE
    public final void IconCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, IOException iOException) {
        parseLonglambda0 parselonglambda0 = this.read.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("Failed to notify the remote of the fulfillment of request ");
        String str = this.write;
        sb.append(str);
        parselonglambda0.IconCompatParcelizer(false, iOException, sb.toString(), new Object[0]);
        stringAndKey.RemoteActionCompatParcelizer((stringAndKey) this.RemoteActionCompatParcelizer.read, new getBitmapUrl.read(str, this.serializer, false));
    }

    @Override // o.r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE
    public final void write(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release) {
        stringAndKey stringandkey = (stringAndKey) this.RemoteActionCompatParcelizer.read;
        int i = setshouldpersistwebviewwhenbackgroundingapp.serializer;
        boolean z = this.serializer;
        getBitmapUrl getbitmapurl = this.read;
        String str = this.write;
        if (i == 200) {
            getbitmapurl.RemoteActionCompatParcelizer.serializer(ff$$ExternalSyntheticOutline0.m("Request ", str, " has been successfully fulfilled."), new Object[0]);
            stringAndKey.RemoteActionCompatParcelizer(stringandkey, new getBitmapUrl.read(str, z, true));
            return;
        }
        if (setsmallnotificationiconnameandroid_sdk_base_release != null) {
            try {
                String strSerializer = setsmallnotificationiconnameandroid_sdk_base_release.serializer();
                getbitmapurl.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Failed to notify the remote of the fulfillment of request " + str + " with response code " + i + ", body: " + strSerializer, new Object[0]);
            } catch (IOException e) {
                getbitmapurl.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to read response body", new Object[0]);
            }
        }
        stringAndKey.RemoteActionCompatParcelizer(stringandkey, new getBitmapUrl.read(str, z, false));
    }

    @Override // o.r8lambdaWFZs9fZBV91sXuExLJ2TMbetIVE
    public final void IconCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, IOException iOException) {
        parseLonglambda0 parselonglambda0 = this.read.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("Unexpected IOException while handling the fulfillment response for request ");
        String str = this.write;
        sb.append(str);
        parselonglambda0.IconCompatParcelizer(false, iOException, sb.toString(), new Object[0]);
        stringAndKey.RemoteActionCompatParcelizer((stringAndKey) this.RemoteActionCompatParcelizer.read, new getBitmapUrl.read(str, this.serializer, false));
    }
}
