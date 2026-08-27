package o;

import androidx.datastore.core.SimpleActor$offer$2;
import bo.app.a5$$ExternalSyntheticLambda0;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
public final class getBlueannotations implements accessgetWhitecp {
    public final String IconCompatParcelizer;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new a5$$ExternalSyntheticLambda0(11, this));
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 serializer;
    public final Colordefault write;

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        isAdapterPositionOnScreen isadapterpositiononscreen = this.RemoteActionCompatParcelizer;
        if (isadapterpositiononscreen.MediaSessionCompatToken()) {
            ((tintxETnrds) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).close();
        }
    }

    public getBlueannotations(Colordefault colordefault, String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.write = colordefault;
        this.IconCompatParcelizer = str;
        this.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    @Override // o.accessgetWhitecp
    public final Object useConnection(boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView) {
        getColorSpaceannotations getcolorspaceannotations = (getColorSpaceannotations) shortNewsContentCardView.getContext().get(getColorSpaceannotations.IconCompatParcelizer);
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        androidx.room.coroutines.PassthroughConnection passthroughConnection = getcolorspaceannotations != null ? getcolorspaceannotations.write : null;
        if (passthroughConnection != null) {
            return r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(passthroughConnection, shortNewsContentCardView);
        }
        androidx.room.coroutines.PassthroughConnection passthroughConnection2 = new androidx.room.coroutines.PassthroughConnection(this.serializer, (tintxETnrds) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper());
        return BuildersKt.withContext(new getColorSpaceannotations(passthroughConnection2), new SimpleActor$offer$2(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, passthroughConnection2, shortNewsContentCardView2, 7), shortNewsContentCardView);
    }
}
