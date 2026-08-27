package o;

import android.content.Context;
import io.socket.parser.IOParser$Decoder;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class invokeFallbackFirebaseServicelambda4 extends r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 {
    private final Byte read;
    private final Map<String, String> write;

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 IconCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu, int i, long j) {
        return null;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 IconCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu, int i, long j, BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4) {
        return null;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 serializer(invokeFallbackFirebaseServicelambda1 invokefallbackfirebaseservicelambda1) {
        return null;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final String write() {
        return "ForcedMovingState";
    }

    public invokeFallbackFirebaseServicelambda4(Context context, r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4, handleBrazeRemoteMessagelambda5 handlebrazeremotemessagelambda5, Integer num, long j, Map<String, String> map, Byte b) {
        super(context, r8lambdanez6ekwx2hesalwlynojtz0dlj4, handlebrazeremotemessagelambda5, num, j);
        this.write = map;
        this.read = b;
    }

    @Override // o.r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4
    public final r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM serializer() {
        getVerticalAccuracy getverticalaccuracySerializer = MediaBrowserCompatMediaItem().serializer();
        long jMediaDescriptionCompat = MediaDescriptionCompat();
        getverticalaccuracySerializer.getClass();
        IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
        iOParser$Decoder.RemoteActionCompatParcelizer = this.write;
        iOParser$Decoder.read = this.read;
        r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I r8lambdaxnkp5mxo9act549dmvgqnyhj0i = new r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I(iOParser$Decoder);
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jMediaDescriptionCompat);
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.fullyDrawnReporter_delegatelambda0 = r8lambdaxnkp5mxo9act549dmvgqnyhj0i;
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }
}
