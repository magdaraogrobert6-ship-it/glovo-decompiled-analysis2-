package com.deliveryhero.perseus;

import androidx.annotation.Keep;
import java.util.Map;
import o.ImageVectorBuilder;
import o.OnVisibilityChangedModifierKt;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@onItemDismisslambda0
public final class PerseusFunctionCall implements OnVisibilityChangedModifierKt {
    @Override // o.OnVisibilityChangedModifierKt
    @Keep
    public void execute(Map<String, ? extends Object> map) {
        map.getClass();
        ImageVectorBuilder.RemoteActionCompatParcelizer(map);
    }
}
