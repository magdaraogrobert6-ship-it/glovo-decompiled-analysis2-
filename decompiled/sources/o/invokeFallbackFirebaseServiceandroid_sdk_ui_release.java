package o;

import android.content.Context;
import android.location.Location;
import android.net.wifi.WifiInfo;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;

/* JADX INFO: loaded from: classes3.dex */
public class invokeFallbackFirebaseServiceandroid_sdk_ui_release extends r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 {
    private final BrazeCompanionExternalSyntheticLambda4 IconCompatParcelizer;
    private final BrazeCompanionExternalSyntheticLambda4 read;

    public final BrazeCompanionExternalSyntheticLambda4 IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final BrazeCompanionExternalSyntheticLambda4 RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM serializer() {
        handleIncomingIntent handleincomingintent;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = this.read;
        if (brazeCompanionExternalSyntheticLambda4 == null) {
            return null;
        }
        isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1IconCompatParcelizer = MediaBrowserCompatMediaItem().IconCompatParcelizer();
        WifiInfo wifiInfoRemoteActionCompatParcelizer = isgeofencesenabledfromenvironmentlambda1IconCompatParcelizer.MediaDescriptionCompat() ? isgeofencesenabledfromenvironmentlambda1IconCompatParcelizer.RemoteActionCompatParcelizer() : null;
        getVerticalAccuracy getverticalaccuracySerializer = MediaBrowserCompatMediaItem().serializer();
        long jMediaDescriptionCompat = MediaDescriptionCompat();
        getverticalaccuracySerializer.getClass();
        stopInstancelambda10 stopinstancelambda10 = new stopInstancelambda10();
        if (brazeCompanionExternalSyntheticLambda4 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'location' cannot be null");
            return null;
        }
        stopinstancelambda10.IconCompatParcelizer = brazeCompanionExternalSyntheticLambda4;
        stopinstancelambda10.serializer = this.IconCompatParcelizer;
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
        r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer = new wipeDatalambda0(stopinstancelambda10);
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final String write() {
        return "GeofencelessStationaryState";
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 IconCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu, int i, long j, BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4) {
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda5 = r8lambdazeccixubf3xvz58yt5bojkwhdu.serializer;
        if (brazeCompanionExternalSyntheticLambda5 == null) {
            return null;
        }
        return new r8lambdaQMriIuHDeDtNo94f7n84_zLW7oI(read(), this, MediaBrowserCompatMediaItem(), null, Math.max(brazeCompanionExternalSyntheticLambda5.RemoteActionCompatParcelizer.longValue(), MediaDescriptionCompat() + 1));
    }

    public invokeFallbackFirebaseServiceandroid_sdk_ui_release(Context context, r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4, handleBrazeRemoteMessagelambda5 handlebrazeremotemessagelambda5, BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4, BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda5, long j) {
        super(context, r8lambdanez6ekwx2hesalwlynojtz0dlj4, handlebrazeremotemessagelambda5, null, j);
        this.read = brazeCompanionExternalSyntheticLambda4;
        this.IconCompatParcelizer = brazeCompanionExternalSyntheticLambda5;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 IconCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu, int i, long j) {
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdazeccixubf3xvz58yt5bojkwhdu.serializer;
        if (brazeCompanionExternalSyntheticLambda4 == null) {
            return null;
        }
        if (serializer(brazeCompanionExternalSyntheticLambda4)) {
            return new r8lambdaQMriIuHDeDtNo94f7n84_zLW7oI(read(), this, MediaBrowserCompatMediaItem(), null, brazeCompanionExternalSyntheticLambda4.RemoteActionCompatParcelizer.longValue());
        }
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda5 = this.IconCompatParcelizer;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda6 = this.read;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda7 = brazeCompanionExternalSyntheticLambda5 != null ? brazeCompanionExternalSyntheticLambda5 : brazeCompanionExternalSyntheticLambda6;
        if (brazeCompanionExternalSyntheticLambda7 == null || brazeCompanionExternalSyntheticLambda4 == null) {
            return null;
        }
        r8lambdaVErYkPFxABVjGz2VB5XGlrkR4_0 r8lambdaverykpfxabvjgz2vb5xglrkr4_0 = r8lambdazeccixubf3xvz58yt5bojkwhdu.RemoteActionCompatParcelizer;
        if (brazeCompanionExternalSyntheticLambda5 == null) {
            brazeCompanionExternalSyntheticLambda5 = brazeCompanionExternalSyntheticLambda6;
        }
        if (brazeCompanionExternalSyntheticLambda5 == null || brazeCompanionExternalSyntheticLambda5.read.intValue() != r8lambdaverykpfxabvjgz2vb5xglrkr4_0.RemoteActionCompatParcelizer.intValue() || brazeCompanionExternalSyntheticLambda5.write.intValue() != r8lambdaverykpfxabvjgz2vb5xglrkr4_0.read.intValue()) {
            return null;
        }
        MediaBrowserCompatMediaItem().serializer().getClass();
        Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
        MediaBrowserCompatMediaItem().serializer().getClass();
        if (((int) locationWrite.distanceTo(getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda7))) < 100) {
            return new BrazeHuaweiPushHandler(read(), this, MediaBrowserCompatMediaItem(), Integer.valueOf(i), this.read, this.IconCompatParcelizer, j);
        }
        return null;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 write(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku) {
        if (!serializer(r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer)) {
            return null;
        }
        return new r8lambdaQMriIuHDeDtNo94f7n84_zLW7oI(read(), this, MediaBrowserCompatMediaItem(), null, Math.max(r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.longValue(), MediaDescriptionCompat() + 1));
    }

    private boolean serializer(BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4) {
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda5 = this.IconCompatParcelizer;
        if (brazeCompanionExternalSyntheticLambda5 == null) {
            brazeCompanionExternalSyntheticLambda5 = this.read;
        }
        if (brazeCompanionExternalSyntheticLambda5 == null || brazeCompanionExternalSyntheticLambda4.RemoteActionCompatParcelizer.longValue() <= MediaDescriptionCompat() - DeviceOrientationRequest.OUTPUT_PERIOD_FAST) {
            return false;
        }
        MediaBrowserCompatMediaItem().serializer().getClass();
        Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
        MediaBrowserCompatMediaItem().serializer().getClass();
        return ((int) locationWrite.distanceTo(getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda5))) > brazeCompanionExternalSyntheticLambda4.serializer.shortValue() + 50;
    }
}
