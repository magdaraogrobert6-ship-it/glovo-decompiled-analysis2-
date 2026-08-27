package com.deliveryhero.perseus;

import androidx.annotation.Keep;
import com.huawei.hms.dtm.ICustomTag;
import java.util.Map;
import o.ImageVectorBuilder;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class DtmPerseusFunctionCall implements ICustomTag {
    @Keep
    public void call(Map<String, ? extends Object> map) {
        map.getClass();
        ImageVectorBuilder.RemoteActionCompatParcelizer(map);
    }
}
