package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdaUM3EKNivlpu_OeoydQAPHN3yvk extends getLatitudeannotations<r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU> {
    final /* synthetic */ r8lambda1mlF560MCjaA_ExgR2d0icEgcF0 serializer;

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU> getlongitudeannotations) {
        r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4IconCompatParcelizer;
        r8lambdaZEcCIXubF3xVZ58Yt5bojKWhdU r8lambdazeccixubf3xvz58yt5bojkwhdu = getlongitudeannotations.read();
        Integer numIconCompatParcelizer = getlongitudeannotations.IconCompatParcelizer();
        long jWrite = getlongitudeannotations.write();
        synchronized (this.serializer) {
            r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4 r8lambdanez6ekwx2hesalwlynojtz0dlj4 = (r8lambdaNez6EkWX2hESalWLynOJTz0dLJ4) this.serializer.PlaybackStateCompat.read();
            r8lambda1mlF560MCjaA_ExgR2d0icEgcF0 r8lambda1mlf560mcjaa_exgr2d0icegcf0 = this.serializer;
            if (r8lambdanez6ekwx2hesalwlynojtz0dlj4 == null) {
                r8lambda1mlf560mcjaa_exgr2d0icegcf0.write.IconCompatParcelizer("Current state is null", new Object[0]);
                return;
            }
            if (!r8lambda1mlf560mcjaa_exgr2d0icegcf0.ComponentActivity) {
                this.serializer.write.IconCompatParcelizer("Not started", new Object[0]);
                return;
            }
            if (!Arrays.asList((byte) 6, (byte) 7).contains(r8lambdazeccixubf3xvz58yt5bojkwhdu.read) && numIconCompatParcelizer == null) {
                this.serializer.write.IconCompatParcelizer("Geofence event of type %d is missing event id", r8lambdazeccixubf3xvz58yt5bojkwhdu.read);
                return;
            }
            if (!Arrays.asList((byte) 6, (byte) 7, (byte) 5).contains(r8lambdazeccixubf3xvz58yt5bojkwhdu.read) && r8lambdazeccixubf3xvz58yt5bojkwhdu.serializer == null) {
                this.serializer.write.IconCompatParcelizer("Geofence event of type %d is missing a location", r8lambdazeccixubf3xvz58yt5bojkwhdu.read);
                return;
            }
            int iIntValue = numIconCompatParcelizer == null ? 0 : numIconCompatParcelizer.intValue();
            byte bByteValue = r8lambdazeccixubf3xvz58yt5bojkwhdu.read.byteValue();
            if (bByteValue != 1) {
                r8lambdanez6ekwx2hesalwlynojtz0dlj4IconCompatParcelizer = (bByteValue == 2 || bByteValue == 9) ? r8lambdanez6ekwx2hesalwlynojtz0dlj4.IconCompatParcelizer(r8lambdazeccixubf3xvz58yt5bojkwhdu, iIntValue, jWrite, r8lambdazeccixubf3xvz58yt5bojkwhdu.serializer) : null;
            } else {
                r8lambdanez6ekwx2hesalwlynojtz0dlj4IconCompatParcelizer = r8lambdanez6ekwx2hesalwlynojtz0dlj4.IconCompatParcelizer(r8lambdazeccixubf3xvz58yt5bojkwhdu, iIntValue, jWrite);
            }
            if (r8lambdanez6ekwx2hesalwlynojtz0dlj4IconCompatParcelizer != null) {
                this.serializer.read(r8lambdanez6ekwx2hesalwlynojtz0dlj4IconCompatParcelizer);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaUM3EKNivlpu_OeoydQAPHN3yvk(r8lambda1mlF560MCjaA_ExgR2d0icEgcF0 r8lambda1mlf560mcjaa_exgr2d0icegcf0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "MovingStateDetector");
        this.serializer = r8lambda1mlf560mcjaa_exgr2d0icegcf0;
    }
}
