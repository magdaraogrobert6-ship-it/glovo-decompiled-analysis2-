package o;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageVectorCache {

    @SerializedName("tileInfoList")
    private List<fontResourceFromContext> IconCompatParcelizer;

    @SerializedName("code")
    private String RemoteActionCompatParcelizer;

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final List write() {
        return this.IconCompatParcelizer;
    }

    public ImageVectorCache(String str, ArrayList arrayList) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = arrayList;
    }
}
