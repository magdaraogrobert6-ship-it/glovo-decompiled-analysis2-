package o;

import android.content.res.AssetManager;

/* JADX INFO: loaded from: classes.dex */
public final class configurePaintswdJneEdefault implements drawImagegbVJVH8 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final AssetManager serializer;

    public /* synthetic */ configurePaintswdJneEdefault(AssetManager assetManager, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = assetManager;
    }

    @Override // o.drawImagegbVJVH8
    public final drawImage9jGpkUE IconCompatParcelizer(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
        return this.RemoteActionCompatParcelizer != 0 ? new configureStrokePaintQ_0CZUIdefault(this.serializer, 0, this) : new configureStrokePaintQ_0CZUIdefault(this.serializer, 0, this);
    }
}
