package o;

import com.squareup.moshi.CollectionJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class getBitmapMetadataFromStream extends CollectionJsonAdapter {
    @Override // com.squareup.moshi.CollectionJsonAdapter
    public final Collection write() {
        return new ArrayList();
    }

    public getBitmapMetadataFromStream(JsonAdapter jsonAdapter) {
        super(jsonAdapter);
    }
}
