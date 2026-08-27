package o;

import android.text.TextUtils;
import com.huawei.location.lite.common.util.filedownload.DownLoadFileBean;
import com.huawei.location.logic.zp;

/* JADX INFO: loaded from: classes4.dex */
public final class WeakCache implements getOnPasteRequested {
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ zp RemoteActionCompatParcelizer;
    public final /* synthetic */ String serializer;

    public WeakCache(zp zpVar, String str, String str2) {
        this.RemoteActionCompatParcelizer = zpVar;
        this.serializer = str;
        this.IconCompatParcelizer = str2;
    }

    @Override // o.getOnPasteRequested
    public final boolean read(DownLoadFileBean downLoadFileBean) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "is Support DownloadFile");
        String strRemoteActionCompatParcelizer = ((getOrder) this.RemoteActionCompatParcelizer.serializer).RemoteActionCompatParcelizer(this.serializer);
        String version = downLoadFileBean.getFileAccessInfo().getVersion();
        if (!zp.RemoteActionCompatParcelizer(placeAtf8xVGno.read(), this.IconCompatParcelizer)) {
            return true;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ModelFileManager", "versionNumFromServer is: " + version + ", versionNumSp is: " + strRemoteActionCompatParcelizer);
        return (TextUtils.isEmpty(version) || TextUtils.isEmpty(strRemoteActionCompatParcelizer) || version.compareTo(strRemoteActionCompatParcelizer) <= 0) ? false : true;
    }
}
