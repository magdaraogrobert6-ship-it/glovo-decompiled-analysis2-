package o;

import androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2;
import androidx.lifecycle.BlockRunner$maybeRun$1;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: loaded from: classes.dex */
public final class addOnPictureInPictureModeChangedListener extends getDefaultViewModelProviderFactory {
    public r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public BufferedChannel read;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU serializer;
    public final getContentViewGroupParentLayout write;

    public final void RemoteActionCompatParcelizer(boolean z) {
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
        if (!z && super.IconCompatParcelizer() && (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.serializer) != null && !r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.I_()) {
            write();
        }
        this.MediaBrowserCompatMediaItem.setEnabled(z);
        this.MediaSessionCompatQueueItem.read(z);
    }

    public addOnPictureInPictureModeChangedListener(getContentViewGroupParentLayout getcontentviewgroupparentlayout, enterPictureInPictureMode enterpictureinpicturemode) {
        super(enterpictureinpicturemode);
        this.write = getcontentviewgroupparentlayout;
        this.IconCompatParcelizer = new ScrollExtensionsKt$stopScroll$2(2, 1, null);
    }

    @Override // o.getDefaultViewModelProviderFactory
    public final void RemoteActionCompatParcelizer() {
        write();
        if (super.IconCompatParcelizer()) {
            this.RemoteActionCompatParcelizer = true;
            this.read = androidx.sqlite.SQLite.IconCompatParcelizer(-2, 4, IInAppMessageViewWrapper.SUSPEND);
            this.serializer = BuildersKt.RemoteActionCompatParcelizer(this.write, null, null, new BlockRunner$maybeRun$1(this, (ShortNewsContentCardView) null, 1), 3);
        }
    }

    @Override // o.getDefaultViewModelProviderFactory
    public final void read() {
        if (this.read != null && !this.RemoteActionCompatParcelizer) {
            write();
        }
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (this.read == null) {
            this.RemoteActionCompatParcelizer = false;
            this.read = androidx.sqlite.SQLite.IconCompatParcelizer(-2, 4, IInAppMessageViewWrapper.SUSPEND);
            this.serializer = BuildersKt.RemoteActionCompatParcelizer(this.write, null, null, new BlockRunner$maybeRun$1(this, shortNewsContentCardView, 1), 3);
        }
        BufferedChannel bufferedChannel = this.read;
        if (bufferedChannel != null) {
            bufferedChannel.IconCompatParcelizer((Throwable) null);
        }
        this.RemoteActionCompatParcelizer = false;
    }

    @Override // o.getDefaultViewModelProviderFactory
    public final void serializer(r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys) {
        BufferedChannel bufferedChannel = this.read;
        if (bufferedChannel != null) {
            bufferedChannel.b_(r8lambda54beh8zsbru0cxi2ccsp2synys);
        }
    }

    @Override // o.getDefaultViewModelProviderFactory
    public final void write() {
        BufferedChannel bufferedChannel = this.read;
        if (bufferedChannel != null) {
            bufferedChannel.read((Throwable) new CancellationException("onBack cancelled"), true);
        }
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.serializer;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.read = null;
        this.serializer = null;
        this.RemoteActionCompatParcelizer = false;
    }
}
