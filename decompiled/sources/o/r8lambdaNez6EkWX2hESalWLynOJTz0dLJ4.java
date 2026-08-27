package o;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 {
    private final handleBrazeRemoteMessagelambda5 IconCompatParcelizer;
    private final Integer RemoteActionCompatParcelizer;
    private final Context read;
    private final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 serializer;
    private final long write;

    public abstract r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 IconCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu, int i, long j);

    public abstract r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 IconCompatParcelizer(r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu, int i, long j, BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4);

    public final handleBrazeRemoteMessagelambda5 MediaBrowserCompatMediaItem() {
        return this.IconCompatParcelizer;
    }

    public final long MediaDescriptionCompat() {
        return this.write;
    }

    public final Integer MediaMetadataCompat() {
        return this.RemoteActionCompatParcelizer;
    }

    public long MediaSessionCompatQueueItem() {
        return -1L;
    }

    public final r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 RatingCompat() {
        return this.serializer;
    }

    public r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 serializer(invokeFallbackFirebaseServicelambda1 invokefallbackfirebaseservicelambda1) {
        return null;
    }

    public abstract r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM serializer();

    public abstract String write();

    public r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 write(long j) {
        return null;
    }

    public r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 write(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku) {
        return null;
    }

    public r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4(Context context, r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4, handleBrazeRemoteMessagelambda5 handlebrazeremotemessagelambda5, Integer num, long j) {
        this.read = context;
        this.serializer = r8lambdanez6ekwx2hesalwlynojtz0dlj4;
        this.RemoteActionCompatParcelizer = num;
        this.write = j;
        this.IconCompatParcelizer = handlebrazeremotemessagelambda5;
    }

    public final invokeFallbackFirebaseServiceandroid_sdk_ui_release RemoteActionCompatParcelizer(invokeFallbackFirebaseServicelambda1 invokefallbackfirebaseservicelambda1) {
        long jLongValue = invokefallbackfirebaseservicelambda1.serializer().RemoteActionCompatParcelizer.longValue();
        return new invokeFallbackFirebaseServiceandroid_sdk_ui_release(this.read, this, this.IconCompatParcelizer, invokefallbackfirebaseservicelambda1.serializer(), invokefallbackfirebaseservicelambda1.RemoteActionCompatParcelizer(), jLongValue);
    }

    public final Context read() {
        return this.read;
    }
}
