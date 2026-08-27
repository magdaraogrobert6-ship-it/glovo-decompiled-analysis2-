package o;

import android.os.Handler;
import android.os.Message;
import com.huawei.hmf.tasks.a.i$d;

/* JADX INFO: loaded from: classes2.dex */
public final class compareAndSetFactory implements Handler.Callback {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ compareAndSetFactory(int i, Object obj) {
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = this.write;
        if (i == 0) {
            com.huawei.location.callback.d2 d2Var = (com.huawei.location.callback.d2) this.RemoteActionCompatParcelizer;
            int i2 = message.what;
            if (i2 == 1001) {
                d2Var.serializer(message.getData());
            } else if (i2 == 1002) {
                d2Var.read();
            } else {
                WrappedCompositionsetContent1211.write("HwBaseCallback", "handleMessage error");
            }
            return false;
        }
        if (i == 1) {
            com.bumptech.glide.load.resource.gif.GifFrameLoader gifFrameLoader = (com.bumptech.glide.load.resource.gif.GifFrameLoader) this.RemoteActionCompatParcelizer;
            int i3 = message.what;
            if (i3 == 1) {
                gifFrameLoader.RemoteActionCompatParcelizer((drawLine1RTmtNcdefault) message.obj);
                return true;
            }
            if (i3 != 2) {
                return false;
            }
            gifFrameLoader.MediaSessionCompatResultReceiverWrapper.read((drawLine1RTmtNcdefault) message.obj);
            return false;
        }
        if (i == 2) {
            if (message.what == 1 && getCameraEK5gGoQ.IconCompatParcelizer == message.obj) {
                i$d i_d = (i$d) this.RemoteActionCompatParcelizer;
                getCameraEK5gGoQ getcameraek5ggoq = (getCameraEK5gGoQ) i_d.read;
                getcameraek5ggoq.write();
                if (!getcameraek5ggoq.serializer()) {
                    i_d.RemoteActionCompatParcelizer();
                }
            }
            return true;
        }
        if (message.what != 0) {
            return false;
        }
        androidx.transition.TransitionValuesMaps transitionValuesMaps = (androidx.transition.TransitionValuesMaps) this.RemoteActionCompatParcelizer;
        forEach foreach = (forEach) message.obj;
        synchronized (transitionValuesMaps.MediaBrowserCompatMediaItem) {
            if (((forEach) transitionValuesMaps.MediaMetadataCompat) == foreach || ((forEach) transitionValuesMaps.RatingCompat) == foreach) {
                transitionValuesMaps.read(foreach, 2);
            }
        }
        return true;
    }
}
