package o;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.location.tiles.utils.LW;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getConfigFlags implements Runnable {
    public final /* synthetic */ int read;
    public final /* synthetic */ getTheme serializer;

    public /* synthetic */ getConfigFlags(getTheme gettheme, int i) {
        this.read = i;
        this.serializer = gettheme;
    }

    @Override // java.lang.Runnable
    public final void run() {
        loadVectorResource loadvectorresource;
        if (this.read != 0) {
            Thread.currentThread().setName("SDM-TileStoreManager-" + hashCode());
            getTheme.IconCompatParcelizer(this.serializer);
            return;
        }
        Thread.currentThread().setName("SDM-TileStoreManager-" + hashCode());
        getTheme gettheme = this.serializer;
        synchronized (gettheme) {
            try {
                if (gettheme.MediaBrowserCompatMediaItem == null) {
                    String strWrite = LW.write("CITYADMIN-WKT");
                    if (TextUtils.isEmpty(strWrite)) {
                        WrappedCompositionsetContent1211.read();
                    } else {
                        try {
                            List list = (List) new Gson().fromJson(strWrite, new PrimitiveResources_androidKt().getType());
                            if (list == null || list.size() == 0 || (loadvectorresource = (loadVectorResource) list.get(0)) == null) {
                                WrappedCompositionsetContent1211.read();
                            } else {
                                gettheme.MediaBrowserCompatMediaItem = loadvectorresource;
                                integerResource.RemoteActionCompatParcelizer(new File(getTheme.write + "CityAdminJson"), new Gson().toJson(gettheme.MediaBrowserCompatMediaItem));
                            }
                        } catch (JsonSyntaxException unused) {
                            WrappedCompositionsetContent1211.read("TileStoreManager", "json syntax error");
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        getTheme.IconCompatParcelizer(this.serializer);
    }
}
