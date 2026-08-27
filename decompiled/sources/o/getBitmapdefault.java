package o;

import com.squareup.moshi.CollectionJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class getBitmapdefault extends CollectionJsonAdapter {
    public getBitmapdefault(JsonAdapter jsonAdapter) {
        super(jsonAdapter);
    }

    @Override // com.squareup.moshi.CollectionJsonAdapter
    public final Collection write() {
        return new LinkedHashSet();
    }
}
