package o;

import android.os.Parcelable;
import com.google.mlkit.vision.face.internal.zzm;
import com.huawei.location.lite.common.util.filedownload.DownloadFileParam;
import com.huawei.location.logic.zp;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getOnAutofillRequested {
    public DownloadFileParam IconCompatParcelizer;
    public zp RemoteActionCompatParcelizer;
    public zzm read;

    public void IconCompatParcelizer(zp zpVar) {
        this.RemoteActionCompatParcelizer = zpVar;
        zzm zzmVar = (zzm) zpVar.IconCompatParcelizer;
        this.read = zzmVar;
        Parcelable parcelableWrite = ((getContentChild) zzmVar.IconCompatParcelizer).write("download_file_param");
        if (parcelableWrite instanceof DownloadFileParam) {
            this.IconCompatParcelizer = (DownloadFileParam) parcelableWrite;
        } else {
            write(10000, "param error");
        }
    }

    public final void write(int i, String str) {
        WrappedCompositionsetContent1211.read("DownloadBaseTask", "download  failed:" + i + "desc:" + str);
        HashMap map = new HashMap();
        map.put("download_result_code_key", Integer.valueOf(i));
        map.put("download_result_desc_key", str);
        getContentChild getcontentchild = new getContentChild();
        getcontentchild.IconCompatParcelizer = new HashMap(map);
        WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2 windowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2 = new WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2();
        windowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2.read = getcontentchild;
        this.read.serializer(windowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2, this.RemoteActionCompatParcelizer);
    }
}
