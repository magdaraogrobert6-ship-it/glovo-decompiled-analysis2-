package o;

import android.content.Context;
import coil3.ImageLoader$Builder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class combinexh6zSI8 implements iteratordefault {
    @Override // o.iteratordefault
    public final coil3.RealImageLoader write(Context context) {
        ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(context);
        accessorjd accessorjdVar = (accessorjd) imageLoader$Builder.serializer;
        accessorjdVar.serializer.put(addRoundRectdefault.serializer, createFromParcel.INSTANCE);
        return imageLoader$Builder.IconCompatParcelizer();
    }
}
