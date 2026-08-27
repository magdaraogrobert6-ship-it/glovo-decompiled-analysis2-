package o;

import android.net.ConnectivityManager;
import coil3.compose.AsyncImagePainter$launchJob$1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: classes.dex */
public final class addInterval implements getMin {
    public final ConnectivityManager write;

    @Override // o.getMin
    public final boolean serializer(setFrom58bKbWc setfrom58bkbwc) {
        return (setfrom58bkbwc.read.write() == null && setfrom58bkbwc.read.MediaDescriptionCompat == setCompositingStrategyaDBOjCE.NOT_REQUIRED) ? false : true;
    }

    public addInterval(ConnectivityManager connectivityManager) {
        this.write = connectivityManager;
    }

    @Override // o.getMin
    public final Flow serializer(toolingGraphicsLayer toolinggraphicslayer) {
        toolinggraphicslayer.getClass();
        return FlowKt.write(new AsyncImagePainter$launchJob$1(toolinggraphicslayer, this, null, 9));
    }
}
