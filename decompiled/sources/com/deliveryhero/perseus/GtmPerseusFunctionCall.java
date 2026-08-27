package com.deliveryhero.perseus;

import androidx.annotation.Keep;
import java.util.Map;
import o.ImageVectorBuilder;
import o.OnVisibilityChangedModifierKt;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class GtmPerseusFunctionCall implements OnVisibilityChangedModifierKt {
    @Override // o.OnVisibilityChangedModifierKt
    @Keep
    public void execute(Map<String, ? extends Object> map) {
        map.getClass();
        ImageVectorBuilder.RemoteActionCompatParcelizer(map);
    }
}
