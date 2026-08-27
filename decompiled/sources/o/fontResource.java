package o;

import com.huawei.location.lite.common.util.filedownload.DownLoadFileBean;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class fontResource implements getOnPasteRequested {
    public final /* synthetic */ colorResource serializer;

    public fontResource(colorResource colorresource) {
        this.serializer = colorresource;
    }

    @Override // o.getOnPasteRequested
    public final boolean read(DownLoadFileBean downLoadFileBean) {
        String version = downLoadFileBean.getFileAccessInfo().getVersion();
        colorResource colorresource = this.serializer;
        colorresource.getClass();
        File file = new File(bringIntoViewdefault.RemoteActionCompatParcelizer);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SdmFileManager", "the file isFileExist is " + file.exists());
        if (!file.exists()) {
            return true;
        }
        String str = (String) colorresource.write;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SdmFileManager", "versionNumFromServer is: " + version + ", versionNumSp is: " + str);
        return version.compareTo(str) > 0;
    }
}
