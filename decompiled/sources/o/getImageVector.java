package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.location.tiles.utils.LW;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getImageVector implements Runnable {
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ getTheme write;

    public getImageVector(getTheme gettheme, String str) {
        this.write = gettheme;
        this.IconCompatParcelizer = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        List list;
        Thread.currentThread().setName("SDM-TileStoreManager-" + hashCode());
        getTheme gettheme = this.write;
        gettheme.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (true) {
            StringBuilder sb = new StringBuilder();
            str = this.IconCompatParcelizer;
            sb.append(str);
            sb.append(BundleUtil.UNDERLINE_TAG);
            sb.append(i);
            try {
                list = (List) new Gson().fromJson(LW.write(sb.toString()), new ImageVectorCacheKey().getType());
                if (list != null) {
                    try {
                        arrayList.addAll(list);
                    } catch (JsonSyntaxException unused) {
                        WrappedCompositionsetContent1211.read("TileStoreManager", "json syntax error");
                    }
                }
            } catch (JsonSyntaxException unused2) {
                list = null;
            }
            if (list == null || list.size() < 59) {
                break;
            } else {
                i++;
            }
        }
        try {
            List list2 = (List) new Gson().fromJson(LW.write(str), new imageResource().getType());
            if (list2 != null) {
                arrayList.addAll(list2);
            }
        } catch (JsonSyntaxException unused3) {
            WrappedCompositionsetContent1211.read("TileStoreManager", "json syntax error");
        }
        if (arrayList.size() > 0) {
            gettheme.MediaSessionCompatQueueItem = new ImageVectorCache(str, arrayList);
            String json = new Gson().toJson(gettheme.MediaSessionCompatQueueItem);
            File file = new File(ff$$ExternalSyntheticOutline0.m(new StringBuilder(), getTheme.serializer, str));
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            integerResource.RemoteActionCompatParcelizer(file, json);
        }
    }
}
