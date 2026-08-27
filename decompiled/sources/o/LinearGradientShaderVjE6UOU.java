package o;

import android.graphics.Bitmap;
import coil3.Extras$Key;

/* JADX INFO: loaded from: classes.dex */
public abstract class LinearGradientShaderVjE6UOU {
    public static final Extras$Key IconCompatParcelizer;
    public static final Extras$Key MediaDescriptionCompat;
    public static final Extras$Key RatingCompat;
    public static final Extras$Key RemoteActionCompatParcelizer;
    public static final Extras$Key read;
    public static final Extras$Key serializer;
    public static final Extras$Key write;

    public static final Bitmap.Config IconCompatParcelizer(getBlurRadiusannotations getblurradiusannotations) {
        return (Bitmap.Config) coil3.ExtrasKt.read(getblurradiusannotations, IconCompatParcelizer);
    }

    static {
        int i = 0;
        MediaDescriptionCompat = new Extras$Key(i, accessgetTranslatecp.write);
        IconCompatParcelizer = new Extras$Key(i, accessgetBevelcp.IconCompatParcelizer);
        Object obj = null;
        RemoteActionCompatParcelizer = new Extras$Key(i, obj);
        Boolean bool = Boolean.TRUE;
        RatingCompat = new Extras$Key(i, bool);
        write = new Extras$Key(i, obj);
        serializer = new Extras$Key(i, bool);
        read = new Extras$Key(i, Boolean.FALSE);
    }
}
