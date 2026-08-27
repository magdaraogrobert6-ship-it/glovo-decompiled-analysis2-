package o;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaQMriIuHDeDtNo94f7n84_zLW7oI extends r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 {
    public r8lambdaQMriIuHDeDtNo94f7n84_zLW7oI(Context context, r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4, handleBrazeRemoteMessagelambda5 handlebrazeremotemessagelambda5, Integer num, long j) {
        super(context, r8lambdanez6ekwx2hesalwlynojtz0dlj4, handlebrazeremotemessagelambda5, num, j);
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 IconCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu, int i, long j) {
        return null;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 IconCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu, int i, long j, BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4) {
        return null;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final long MediaSessionCompatQueueItem() {
        return 240000L;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final String write() {
        return "UnconfirmedMovingState";
    }

    private BrazeCompanionExternalSyntheticLambda4 RemoteActionCompatParcelizer() {
        if (RatingCompat() == null) {
            return null;
        }
        if (!Arrays.asList(BrazeHuaweiPushHandler.class, invokeFallbackFirebaseServiceandroid_sdk_ui_release.class).contains(RatingCompat().getClass())) {
            return null;
        }
        if (RatingCompat().getClass() == BrazeHuaweiPushHandler.class) {
            return ((BrazeHuaweiPushHandler) RatingCompat()).RemoteActionCompatParcelizer();
        }
        if (RatingCompat().getClass() == invokeFallbackFirebaseServiceandroid_sdk_ui_release.class) {
            return ((invokeFallbackFirebaseServiceandroid_sdk_ui_release) RatingCompat()).RemoteActionCompatParcelizer();
        }
        return null;
    }

    private BrazeCompanionExternalSyntheticLambda4 IconCompatParcelizer() {
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4IconCompatParcelizer = null;
        if (RatingCompat() != null) {
            if (Arrays.asList(BrazeHuaweiPushHandler.class, invokeFallbackFirebaseServiceandroid_sdk_ui_release.class).contains(RatingCompat().getClass())) {
                brazeCompanionExternalSyntheticLambda4IconCompatParcelizer = RatingCompat().getClass() == BrazeHuaweiPushHandler.class ? ((BrazeHuaweiPushHandler) RatingCompat()).IconCompatParcelizer() : null;
                if (brazeCompanionExternalSyntheticLambda4IconCompatParcelizer == null && RatingCompat().getClass() == invokeFallbackFirebaseServiceandroid_sdk_ui_release.class) {
                    return ((invokeFallbackFirebaseServiceandroid_sdk_ui_release) RatingCompat()).IconCompatParcelizer();
                }
            }
        }
        return brazeCompanionExternalSyntheticLambda4IconCompatParcelizer;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 write(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku) {
        long jMediaDescriptionCompat = MediaDescriptionCompat();
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer;
        long jMax = Math.max(jMediaDescriptionCompat + 1, brazeCompanionExternalSyntheticLambda4.RemoteActionCompatParcelizer.longValue());
        if (MediaBrowserCompatMediaItem().write() - MediaDescriptionCompat() < DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT) {
            return null;
        }
        Long l = read(brazeCompanionExternalSyntheticLambda4);
        if (l != null && l.longValue() > brazeCompanionExternalSyntheticLambda4.serializer.shortValue() + 50 && brazeCompanionExternalSyntheticLambda4.serializer.shortValue() < 120) {
            if (MediaDescriptionCompat() + 49000 < brazeCompanionExternalSyntheticLambda4.RemoteActionCompatParcelizer.longValue()) {
                return new invokeFallbackFirebaseServicelambda5(read(), this, MediaBrowserCompatMediaItem(), null, jMax);
            }
        }
        Long l2 = read(brazeCompanionExternalSyntheticLambda4);
        if (l2 == null || l2.longValue() >= 50) {
            return null;
        }
        return new invokeFallbackFirebaseServiceandroid_sdk_ui_release(read(), this, MediaBrowserCompatMediaItem(), RemoteActionCompatParcelizer(), IconCompatParcelizer(), jMax);
    }

    private Long read(BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4) {
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4RemoteActionCompatParcelizer;
        if (IconCompatParcelizer() != null) {
            brazeCompanionExternalSyntheticLambda4RemoteActionCompatParcelizer = IconCompatParcelizer();
        } else {
            brazeCompanionExternalSyntheticLambda4RemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        }
        if (brazeCompanionExternalSyntheticLambda4RemoteActionCompatParcelizer == null) {
            return null;
        }
        MediaBrowserCompatMediaItem().serializer().getClass();
        Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
        MediaBrowserCompatMediaItem().serializer().getClass();
        return Long.valueOf((long) locationWrite.distanceTo(getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4RemoteActionCompatParcelizer)));
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM serializer() {
        getVerticalAccuracy getverticalaccuracySerializer = MediaBrowserCompatMediaItem().serializer();
        long jMediaDescriptionCompat = MediaDescriptionCompat();
        r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg r8lambdaqgihof_5nhjpnmm9fgnt61b4dmg = new r8lambdaqgiHOF_5nhJPnmM9fgNT61B4Dmg();
        getverticalaccuracySerializer.getClass();
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jMediaDescriptionCompat);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.ensureViewModelStore = r8lambdaqgihof_5nhjpnmm9fgnt61b4dmg;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 write(long j) {
        return new invokeFallbackFirebaseServicelambda5(read(), this, MediaBrowserCompatMediaItem(), null, j);
    }
}
