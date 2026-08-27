package o;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class drawOvalnJ9OG0 implements drawImagegbVJVH8, drawOvalnJ9OG0default {
    public final Resources RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ drawOvalnJ9OG0(Resources resources, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = resources;
    }

    @Override // o.drawImagegbVJVH8
    public drawImage9jGpkUE IconCompatParcelizer(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
        int i = this.serializer;
        Resources resources = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            return i != 1 ? new configureStrokePaintQ_0CZUIdefault(resources, multiModelLoaderFactory.serializer(Uri.class, InputStream.class)) : new configureStrokePaintQ_0CZUIdefault(resources, multiModelLoaderFactory.serializer(Uri.class, AssetFileDescriptor.class));
        }
        return new configureStrokePaintQ_0CZUIdefault(resources, drawRoundRectZuiqVtQ.RemoteActionCompatParcelizer);
    }

    @Override // o.drawOvalnJ9OG0default
    public generateOetf RemoteActionCompatParcelizer(generateOetf generateoetf, getEotfFuncui_graphics geteotffuncui_graphics) {
        if (generateoetf == null) {
            return null;
        }
        return new getCanvas(this.RemoteActionCompatParcelizer, generateoetf);
    }
}
