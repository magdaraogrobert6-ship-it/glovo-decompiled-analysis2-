package o;

import androidx.camera.core.ImageCapture$Metadata;
import com.huawei.location.lite.common.util.filedownload.DownLoadFileBean;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class drawDebugOverlay implements getOnCopyRequested {
    public final /* synthetic */ drawDebugBackground IconCompatParcelizer;

    @Override // o.getOnCopyRequested
    public final void onFail(int i, String str) {
        boolean z;
        drawDebugBackground drawdebugbackground = this.IconCompatParcelizer;
        if (i == 10005) {
            drawdebugbackground.serializer.write("libVdr_last_time", System.currentTimeMillis());
            z = true;
        } else {
            z = false;
        }
        drawdebugbackground.RemoteActionCompatParcelizer.handleLoadResult(z);
        WrappedCompositionsetContent1211.read("VdrFileManager", "download error errorCode:" + i + " errorDesc:" + str);
    }

    public drawDebugOverlay(drawDebugBackground drawdebugbackground) {
        this.IconCompatParcelizer = drawdebugbackground;
    }

    @Override // o.getOnCopyRequested
    public final void onSuccess(DownLoadFileBean downLoadFileBean, File file) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("VdrFileManager", "libVdr download Success");
        drawDebugBackground drawdebugbackground = this.IconCompatParcelizer;
        String fileSha256 = downLoadFileBean.getFileAccessInfo().getFileSha256();
        String version = downLoadFileBean.getFileAccessInfo().getVersion();
        synchronized (drawDebugBackground.class) {
            boolean z = ComposeScrollCaptureCallbackonScrollCaptureImageRequest3.read(file, fileSha256);
            StringBuilder sb = new StringBuilder();
            String str = onScrollCaptureStart.IconCompatParcelizer;
            sb.append(str);
            sb.append(File.separator);
            sb.append("libVdr.7z");
            String string = sb.toString();
            if (!z) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("VdrFileManager", "file is not integrity");
                new File(string).delete();
                drawdebugbackground.RemoteActionCompatParcelizer.handleLoadResult(false);
            } else if (!new ImageCapture$Metadata(6).serializer(string, str)) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("VdrFileManager", "unzip file fail!");
                new File(string).delete();
                drawdebugbackground.RemoteActionCompatParcelizer.handleLoadResult(false);
            } else {
                drawdebugbackground.RemoteActionCompatParcelizer.handleLoadResult(true);
                drawdebugbackground.serializer.IconCompatParcelizer("libVdr_version_num", version);
                drawdebugbackground.serializer.write("libVdr_last_time", System.currentTimeMillis());
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("VdrFileManager", "vdr unzip plugin success!");
                new File(string).delete();
            }
        }
    }
}
