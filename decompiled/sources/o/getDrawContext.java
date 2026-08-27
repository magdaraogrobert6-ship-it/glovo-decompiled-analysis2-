package o;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class getDrawContext implements drawImagegbVJVH8 {
    public final Context read;
    public final Class serializer;

    @Override // o.drawImagegbVJVH8
    public final drawImage9jGpkUE IconCompatParcelizer(com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory) {
        Class cls = this.serializer;
        return new CanvasDrawScopeDrawParams(this.read, multiModelLoaderFactory.serializer(File.class, cls), multiModelLoaderFactory.serializer(Uri.class, cls), cls);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getDrawContext(Context context, int i) {
        this(context, InputStream.class);
        if (i != 1) {
        } else {
            this(context, ParcelFileDescriptor.class);
        }
    }

    public getDrawContext(Context context, Class cls) {
        this.read = context;
        this.serializer = cls;
    }
}
