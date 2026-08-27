package o;

import android.content.Context;
import android.location.Location;
import android.net.wifi.WifiInfo;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public class BrazeHuaweiPushHandler extends r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 {
    private final BrazeCompanionExternalSyntheticLambda4 RemoteActionCompatParcelizer;
    private final BrazeCompanionExternalSyntheticLambda4 read;

    public final BrazeCompanionExternalSyntheticLambda4 IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 IconCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu, int i, long j) {
        return null;
    }

    public final BrazeCompanionExternalSyntheticLambda4 RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 serializer(invokeFallbackFirebaseServicelambda1 invokefallbackfirebaseservicelambda1) {
        return null;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM serializer() {
        Location locationWrite;
        handleIncomingIntent handleincomingintent;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = this.RemoteActionCompatParcelizer;
        if (brazeCompanionExternalSyntheticLambda4 == null) {
            return null;
        }
        MediaBrowserCompatMediaItem().serializer().getClass();
        Location locationWrite2 = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda5 = this.read;
        if (brazeCompanionExternalSyntheticLambda5 != null) {
            MediaBrowserCompatMediaItem().serializer().getClass();
            locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda5);
        } else {
            locationWrite = null;
        }
        isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1IconCompatParcelizer = MediaBrowserCompatMediaItem().IconCompatParcelizer();
        WifiInfo wifiInfoRemoteActionCompatParcelizer = isgeofencesenabledfromenvironmentlambda1IconCompatParcelizer.MediaDescriptionCompat() ? isgeofencesenabledfromenvironmentlambda1IconCompatParcelizer.RemoteActionCompatParcelizer() : null;
        getVerticalAccuracy getverticalaccuracySerializer = MediaBrowserCompatMediaItem().serializer();
        long jMediaDescriptionCompat = MediaDescriptionCompat();
        getverticalaccuracySerializer.getClass();
        stopInstancelambda10 stopinstancelambda10 = new stopInstancelambda10();
        stopinstancelambda10.IconCompatParcelizer = getVerticalAccuracy.serializer(locationWrite2);
        stopinstancelambda10.serializer = locationWrite == null ? null : getVerticalAccuracy.serializer(locationWrite);
        if (wifiInfoRemoteActionCompatParcelizer != null) {
            String ssid = wifiInfoRemoteActionCompatParcelizer.getSSID();
            if (ssid == null) {
                handleincomingintent = null;
            } else {
                r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(5);
                r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer = ssid;
                handleincomingintent = new handleIncomingIntent(r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k);
            }
            stopinstancelambda10.RemoteActionCompatParcelizer = handleincomingintent;
        }
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jMediaDescriptionCompat);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        if (stopinstancelambda10.IconCompatParcelizer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'location' is missing");
            return null;
        }
        r8lambdaromdixahini0blcevvl7ehebhj0._init_lambda2 = new r8lambdaDtwA3Yx1E9CVSzaAGaEmIDZVt8A(stopinstancelambda10);
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final String write() {
        return "StationaryState";
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 IconCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu, int i, long j, BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4) {
        MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer().IconCompatParcelizer("Received an exit event", new Object[0]);
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda5 = r8lambdazeccixubf3xvz58yt5bojkwhdu.serializer;
        if (brazeCompanionExternalSyntheticLambda5 != null) {
            parseLonglambda0 parselonglambda0RemoteActionCompatParcelizer = MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer();
            parselonglambda0RemoteActionCompatParcelizer.IconCompatParcelizer("Exit triggering location has a timestamp of %s. State creation time is %s.", com.sentiance.sdk.util.x.c(brazeCompanionExternalSyntheticLambda5.RemoteActionCompatParcelizer.longValue()), com.sentiance.sdk.util.x.c(MediaDescriptionCompat()));
            if (RatingCompat() != null && RatingCompat().getClass() == invokeFallbackFirebaseServiceandroid_sdk_ui_release.class) {
                parselonglambda0RemoteActionCompatParcelizer.IconCompatParcelizer("Previous state is a geofenceless stationary with creation time of %s.", com.sentiance.sdk.util.x.c(RatingCompat().MediaDescriptionCompat()));
            }
        }
        if ((brazeCompanionExternalSyntheticLambda5 == null || brazeCompanionExternalSyntheticLambda5.RemoteActionCompatParcelizer.longValue() <= MediaDescriptionCompat()) && (RatingCompat() == null || RatingCompat().getClass() != invokeFallbackFirebaseServiceandroid_sdk_ui_release.class || brazeCompanionExternalSyntheticLambda5 == null || brazeCompanionExternalSyntheticLambda5.RemoteActionCompatParcelizer.longValue() <= RatingCompat().MediaDescriptionCompat())) {
            return null;
        }
        if (brazeCompanionExternalSyntheticLambda4.RemoteActionCompatParcelizer.longValue() > j - 600000) {
            j = brazeCompanionExternalSyntheticLambda4.RemoteActionCompatParcelizer.longValue();
        }
        return new r8lambdaQMriIuHDeDtNo94f7n84_zLW7oI(read(), this, MediaBrowserCompatMediaItem(), Integer.valueOf(i), j);
    }

    public BrazeHuaweiPushHandler(Context context, r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4, handleBrazeRemoteMessagelambda5 handlebrazeremotemessagelambda5, Integer num, BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4, BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda5, long j) {
        super(context, r8lambdanez6ekwx2hesalwlynojtz0dlj4, handlebrazeremotemessagelambda5, num, j);
        this.RemoteActionCompatParcelizer = brazeCompanionExternalSyntheticLambda4;
        this.read = brazeCompanionExternalSyntheticLambda5;
    }
}
