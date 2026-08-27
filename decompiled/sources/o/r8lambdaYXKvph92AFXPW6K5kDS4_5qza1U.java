package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaYXKvph92AFXPW6K5kDS4_5qza1U extends r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0 {
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA IconCompatParcelizer;
    public final String read;
    public final boolean serializer;

    @Override // o.r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0
    public final String IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0
    public final boolean RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    public final int hashCode() {
        return this.read.hashCode() + (Boolean.hashCode(this.serializer) * 31);
    }

    @Override // o.r8lambdagBEKCaSkeCAmm7h9dYqNzofOn0
    public final String toString() {
        boolean z = this.serializer;
        String str = this.read;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        prepareInAppMessageWithBitmapDownloadlambda5.IconCompatParcelizer(str, sb);
        return sb.toString();
    }

    public r8lambdaYXKvph92AFXPW6K5kDS4_5qza1U(Object obj, boolean z, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        obj.getClass();
        this.serializer = z;
        this.IconCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda;
        this.read = obj.toString();
        if (r8lambda92m0p9sit5uf70mvjf4rwmruda == null || r8lambda92m0p9sit5uf70mvjf4rwmruda.write()) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r8lambdaYXKvph92AFXPW6K5kDS4_5qza1U.class != obj.getClass()) {
            return false;
        }
        r8lambdaYXKvph92AFXPW6K5kDS4_5qza1U r8lambdayxkvph92afxpw6k5kds4_5qza1u = (r8lambdaYXKvph92AFXPW6K5kDS4_5qza1U) obj;
        if (this.serializer != r8lambdayxkvph92afxpw6k5kds4_5qza1u.serializer) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, r8lambdayxkvph92afxpw6k5kds4_5qza1u.read}, getCieXyz.write())).booleanValue();
    }
}
