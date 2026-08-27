package o;

import androidx.camera.core.ImageCapture$Metadata;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.location.lite.common.util.filedownload.DownLoadFileBean;
import com.huawei.location.logic.zp;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class getHostDefault implements getOnCopyRequested {
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ zp read;
    public final /* synthetic */ String write;

    public getHostDefault(zp zpVar, String str, String str2) {
        this.read = zpVar;
        this.write = str;
        this.IconCompatParcelizer = str2;
    }

    @Override // o.getOnCopyRequested
    public final void onFail(int i, String str) {
        WrappedCompositionsetContent1211.read("ModelFileManager", "download error errorCode:" + i + " errorDesc:" + str);
        zp zpVar = this.read;
        if (i == 10005) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "download fail update the request time");
            ((getOrder) zpVar.serializer).write(this.IconCompatParcelizer, System.currentTimeMillis());
        }
        zp.serializer(zpVar, this.write);
    }

    @Override // o.getOnCopyRequested
    public final void onSuccess(DownLoadFileBean downLoadFileBean, File file) throws Throwable {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "download success:");
        String str = this.write;
        zp zpVar = this.read;
        if (file == null) {
            WrappedCompositionsetContent1211.read("ModelFileManager", "file or downLoadFileBean is null");
            zp.serializer(zpVar, str);
            return;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "file and downLoadFileBean is not null begin downLoadSuccessDeal");
        String fileSha256 = downLoadFileBean.getFileAccessInfo().getFileSha256();
        String version = downLoadFileBean.getFileAccessInfo().getVersion();
        boolean z = ComposeScrollCaptureCallbackonScrollCaptureImageRequest3.read(file, fileSha256);
        StringBuilder sb = new StringBuilder();
        String str2 = clearWeakReferences.write;
        String strM = ff$$ExternalSyntheticOutline0.m(sb, str2, str);
        if (!str.equals("activity.7z")) {
            if (z) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "file is integrity");
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "save file success");
                ((getOrder) zpVar.serializer).IconCompatParcelizer("spModelVersionNum", version);
                ((getOrder) zpVar.serializer).write("spModelLastTime", System.currentTimeMillis());
                zpVar.read();
                return;
            }
            WrappedCompositionsetContent1211.read("ModelFileManager", "model file is not integrity");
            ((getOrder) zpVar.serializer).IconCompatParcelizer("spModelVersionNum", "-1");
            ((getOrder) zpVar.serializer).write("spModelLastTime", System.currentTimeMillis() - 604800000);
            zp.write();
            throw null;
        }
        if (z) {
            if (new ImageCapture$Metadata(6).serializer(strM, str2)) {
                ((getOrder) zpVar.serializer).IconCompatParcelizer("spSoVersionNum", version);
                ((getOrder) zpVar.serializer).write("spSoLastTime", System.currentTimeMillis());
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "unzip file success!");
                new File(strM).delete();
                zpVar.IconCompatParcelizer();
                return;
            }
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "unzip file fail!");
            zp.write();
            throw null;
        }
        WrappedCompositionsetContent1211.read("ModelFileManager", "so file is not integrity");
        ((getOrder) zpVar.serializer).IconCompatParcelizer("spSoVersionNum", "-1");
        ((getOrder) zpVar.serializer).write("spSoLastTime", System.currentTimeMillis() - 604800000);
        zp.write();
        throw null;
    }
}
