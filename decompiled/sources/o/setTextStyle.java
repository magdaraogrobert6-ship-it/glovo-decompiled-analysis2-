package o;

import androidx.camera.core.ImageCapture$Metadata;
import com.huawei.location.lite.common.util.filedownload.DownLoadFileBean;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class setTextStyle implements getOnCopyRequested {
    public final /* synthetic */ colorResource serializer;

    @Override // o.getOnCopyRequested
    public final void onSuccess(DownLoadFileBean downLoadFileBean, File file) {
        colorResource colorresource = this.serializer;
        String fileSha256 = downLoadFileBean.getFileAccessInfo().getFileSha256();
        String version = downLoadFileBean.getFileAccessInfo().getVersion();
        colorresource.getClass();
        synchronized (colorResource.class) {
            boolean z = ComposeScrollCaptureCallbackonScrollCaptureImageRequest3.read(file, fileSha256);
            StringBuilder sb = new StringBuilder();
            String str = bringIntoViewdefault.read;
            sb.append(str);
            sb.append(File.separator);
            sb.append("libSdm.7z");
            String string = sb.toString();
            if (!z) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SdmFileManager", "file is not integrity");
                new File(string).delete();
            } else if (new ImageCapture$Metadata(6).serializer(string, str)) {
                ((getOrder) colorresource.IconCompatParcelizer).IconCompatParcelizer("libSdm_version_num", version);
                ((getOrder) colorresource.IconCompatParcelizer).write("libSdm_last_time", System.currentTimeMillis());
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SdmFileManager", "unzip plugin success!");
                new File(string).delete();
            } else {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SdmFileManager", "unzip file fail!");
                new File(string).delete();
            }
        }
    }

    public setTextStyle(colorResource colorresource) {
        this.serializer = colorresource;
    }

    @Override // o.getOnCopyRequested
    public final void onFail(int i, String str) {
        if (i == 10005) {
            ((getOrder) this.serializer.IconCompatParcelizer).write("libSdm_last_time", System.currentTimeMillis());
        }
        WrappedCompositionsetContent1211.read("SdmFileManager", "download error errorCode:" + i + " errorDesc:" + str);
    }
}
