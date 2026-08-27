package com.deliveryhero.perseus.data.remote.api.model;

import androidx.annotation.Keep;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class HitsRequest {

    @SerializedName("hits")
    private List<HitDetails> hits;

    public final List<HitDetails> getHits() {
        return this.hits;
    }

    public HitsRequest(List<HitDetails> list) {
        list.getClass();
        this.hits = list;
    }

    public final void setHits(List<HitDetails> list) {
        list.getClass();
        this.hits = list;
    }

    public String toString() {
        return ff$$ExternalSyntheticOutline0.m("hits: {", onContentCardDismissed.IconCompatParcelizer(this.hits, "}, {", null, null, null, 62), "}");
    }
}
