package o;

import android.content.ContentResolver;

/* JADX INFO: loaded from: classes.dex */
public final class drawRectnJ9OG0 implements drawImagegbVJVH8 {
    public final ContentResolver RemoteActionCompatParcelizer;
    public final boolean read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ drawRectnJ9OG0(ContentResolver contentResolver, boolean z, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = contentResolver;
        this.read = z;
    }

    @Override // o.drawImagegbVJVH8
    public final drawImage9jGpkUE IconCompatParcelizer(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
        int i = this.serializer;
        if (i != 0) {
            return i != 1 ? new drawPointsGsft0Ws(this) : new drawPointsGsft0Ws(this);
        }
        return new drawPointsGsft0Ws(this);
    }
}
