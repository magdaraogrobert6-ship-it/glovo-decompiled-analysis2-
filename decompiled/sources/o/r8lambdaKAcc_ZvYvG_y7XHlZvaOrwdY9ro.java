package o;

import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdaKAcc_ZvYvG_y7XHlZvaOrwdY9ro extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ r8lambda1mlF560MCjaA_ExgR2d0icEgcF0 read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaKAcc_ZvYvG_y7XHlZvaOrwdY9ro(r8lambda1mlF560MCjaA_ExgR2d0icEgcF0 r8lambda1mlf560mcjaa_exgr2d0icegcf0, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "MovingStateDetector");
        this.read = r8lambda1mlf560mcjaa_exgr2d0icegcf0;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        if (controlMessage == ControlMessage.FORCED_MOVING_START) {
            r8lambda1mlF560MCjaA_ExgR2d0icEgcF0.read(this.read, (isTestSend) obj);
            return;
        }
        if (controlMessage == ControlMessage.FORCED_MOVING_STOP) {
            r8lambda1mlF560MCjaA_ExgR2d0icEgcF0.write(this.read, false);
            return;
        }
        if (controlMessage == ControlMessage.MOVING_STATE_TIMEOUT && (obj instanceof r8lambdausxx_nBCDjux6DjI7stc6kTRA)) {
            r8lambda1mlF560MCjaA_ExgR2d0icEgcF0.RemoteActionCompatParcelizer(this.read, (r8lambdausxx_nBCDjux6DjI7stc6kTRA) obj);
            return;
        }
        if (controlMessage == ControlMessage.FORCED_MOVING_TIMEOUT) {
            r8lambda1mlF560MCjaA_ExgR2d0icEgcF0.write(this.read, true);
            return;
        }
        if (controlMessage == ControlMessage.LIKELY_STATIONARY && this.read.IconCompatParcelizer()) {
            invokeFallbackFirebaseServicelambda1 invokefallbackfirebaseservicelambda1 = (invokeFallbackFirebaseServicelambda1) obj;
            r8lambda1mlF560MCjaA_ExgR2d0icEgcF0 r8lambda1mlf560mcjaa_exgr2d0icegcf0 = this.read;
            if (invokefallbackfirebaseservicelambda1 == null) {
                r8lambda1mlf560mcjaa_exgr2d0icegcf0.write.RemoteActionCompatParcelizer("Likely stationary without an event", new Object[0]);
                return;
            }
            synchronized (r8lambda1mlf560mcjaa_exgr2d0icegcf0) {
                r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4 = (r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4) this.read.PlaybackStateCompat.read();
                r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4Serializer = r8lambdanez6ekwx2hesalwlynojtz0dlj4 != null ? r8lambdanez6ekwx2hesalwlynojtz0dlj4.serializer(invokefallbackfirebaseservicelambda1) : null;
                if (r8lambdanez6ekwx2hesalwlynojtz0dlj4Serializer != null) {
                    this.read.read(r8lambdanez6ekwx2hesalwlynojtz0dlj4Serializer);
                }
            }
        }
    }
}
