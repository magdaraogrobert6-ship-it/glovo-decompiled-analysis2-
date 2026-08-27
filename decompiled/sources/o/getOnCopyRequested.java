package o;

import com.huawei.location.lite.common.util.filedownload.DownLoadFileBean;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public interface getOnCopyRequested {
    void onFail(int i, String str);

    void onSuccess(DownLoadFileBean downLoadFileBean, File file);
}
