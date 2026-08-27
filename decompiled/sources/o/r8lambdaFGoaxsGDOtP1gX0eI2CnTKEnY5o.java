package o;

import android.content.Context;
import com.deliveryhero.fwf_http.ConstantKt;
import com.sentiance.sdk.InjectUsing;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "DataSyncApi")
public final class r8lambdaFGoaxsGDOtP1gX0eI2CnTKEnY5o extends r8lambdabkLMk0V9hJhnciUMVieoORp5FU {
    private final r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI MediaMetadataCompat;
    private final parseLonglambda0 RatingCompat;
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs write;

    public static final void IconCompatParcelizer(r8lambdaFGoaxsGDOtP1gX0eI2CnTKEnY5o r8lambdafgoaxsgdotp1gx0ei2cntkeny5o, ArrayList arrayList, readResourceValuelambda2 readresourcevaluelambda2) throws IOException {
        parseLonglambda0 parselonglambda0 = r8lambdafgoaxsgdotp1gx0ei2cntkeny5o.RatingCompat;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r8lambdaArOHHDRou134ziY3uMxObWCm_j0.IconCompatParcelizer iconCompatParcelizer = (r8lambdaArOHHDRou134ziY3uMxObWCm_j0.IconCompatParcelizer) it.next();
            byte[] bArrIconCompatParcelizer = r8lambdafgoaxsgdotp1gx0ei2cntkeny5o.MediaMetadataCompat.IconCompatParcelizer(iconCompatParcelizer.serializer());
            if (bArrIconCompatParcelizer == null) {
                parselonglambda0.RemoteActionCompatParcelizer("Cannot get content of payload with ID ".concat(iconCompatParcelizer.serializer()), new Object[0]);
            } else {
                try {
                    readresourcevaluelambda2.MediaMetadataCompat(iconCompatParcelizer.IconCompatParcelizer());
                    readresourcevaluelambda2.MediaMetadataCompat((int) iconCompatParcelizer.write());
                    readresourcevaluelambda2.write(bArrIconCompatParcelizer);
                } catch (IOException e) {
                    parselonglambda0.IconCompatParcelizer(false, e, "Failed to write the payload to the buffer", new Object[0]);
                }
            }
        }
    }

    public final r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 RemoteActionCompatParcelizer(r8lambdaArOHHDRou134ziY3uMxObWCm_j0 r8lambdaarohhdrou134ziy3umxobwcm_j0) {
        r8lambdaGhUkArry4_x0SJj1IEcwZTwwK4 r8lambdaghukarry4_x0sjj1iecwztwwk4 = new r8lambdaGhUkArry4_x0SJj1IEcwZTwwK4(r8lambdaarohhdrou134ziy3umxobwcm_j0, this);
        String strSerializer = this.IconCompatParcelizer.serializer();
        setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release = new setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release();
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.RemoteActionCompatParcelizer(strSerializer.concat("ondevice-data-sync/sdk/upload"));
        GooglePlayLocationUtils googlePlayLocationUtils = this.RemoteActionCompatParcelizer;
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer(ConstantKt.USER_AGENT_HEADER, googlePlayLocationUtils.write());
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer("Date", googlePlayLocationUtils.read());
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.RemoteActionCompatParcelizer("Content-Encoding", "compress/gzip");
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer("POST", r8lambdaghukarry4_x0sjj1iecwztwwk4);
        r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer = this.write.write().RemoteActionCompatParcelizer();
        if (r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer == null) {
            this.RatingCompat.RemoteActionCompatParcelizer("Cannot fetch auth info.", new Object[0]);
            return null;
        }
        String strMediaSessionCompatQueueItem = r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.MediaSessionCompatQueueItem();
        if (strMediaSessionCompatQueueItem == null) {
            return null;
        }
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.IconCompatParcelizer("Sentiance-User", r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.serializer());
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer.IconCompatParcelizer("Authorization", "Bearer ".concat(strMediaSessionCompatQueueItem));
        return this.read.RemoteActionCompatParcelizer(setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.write());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaFGoaxsGDOtP1gX0eI2CnTKEnY5o(Context context, getLastKnownGpsLocationIfValidlambda0 getlastknowngpslocationifvalidlambda0, GooglePlayLocationUtils googlePlayLocationUtils, registerGeofencesWithGooglePlayIfNecessarylambda10 registergeofenceswithgoogleplayifnecessarylambda10, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, parseLonglambda0 parselonglambda0, r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI r8lambda43c3j9_07_y35qq6grmdmadkbhi) {
        super(context, getlastknowngpslocationifvalidlambda0, googlePlayLocationUtils, registergeofenceswithgoogleplayifnecessarylambda10);
        context.getClass();
        getlastknowngpslocationifvalidlambda0.getClass();
        googlePlayLocationUtils.getClass();
        registergeofenceswithgoogleplayifnecessarylambda10.getClass();
        r8lambdaw447glwjfoun4bg91upxnadqezs.getClass();
        parselonglambda0.getClass();
        r8lambda43c3j9_07_y35qq6grmdmadkbhi.getClass();
        this.write = r8lambdaw447glwjfoun4bg91upxnadqezs;
        this.RatingCompat = parselonglambda0;
        this.MediaMetadataCompat = r8lambda43c3j9_07_y35qq6grmdmadkbhi;
    }
}
