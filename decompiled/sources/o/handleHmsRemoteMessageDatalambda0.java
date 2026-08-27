package o;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class handleHmsRemoteMessageDatalambda0 extends r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 {
    public handleHmsRemoteMessageDatalambda0(Context context, r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4, handleBrazeRemoteMessagelambda5 handlebrazeremotemessagelambda5, Integer num, long j) {
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
    public final String write() {
        return "UnknownState";
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final long MediaSessionCompatQueueItem() {
        return MediaBrowserCompatMediaItem().read() + 60000;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM serializer() {
        getVerticalAccuracy getverticalaccuracySerializer = MediaBrowserCompatMediaItem().serializer();
        long jMediaDescriptionCompat = MediaDescriptionCompat();
        BrazeBootReceiver brazeBootReceiver = new BrazeBootReceiver();
        getverticalaccuracySerializer.getClass();
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jMediaDescriptionCompat);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.accessensureViewModelStore = brazeBootReceiver;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 serializer(invokeFallbackFirebaseServicelambda1 invokefallbackfirebaseservicelambda1) {
        return RemoteActionCompatParcelizer(invokefallbackfirebaseservicelambda1);
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 write(long j) {
        return new invokeFallbackFirebaseServicelambda5(read(), this, MediaBrowserCompatMediaItem(), null, j);
    }
}
