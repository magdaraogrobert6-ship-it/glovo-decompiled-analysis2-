package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class getComponentCount {
    public static final Object IconCompatParcelizer = new Object();
    public final Map read;
    public final Context serializer;
    public final String write;

    public getComponentCount(Drawable.Callback callback, Map map) {
        if (!TextUtils.isEmpty(null)) {
            throw null;
        }
        this.write = null;
        this.read = map;
        if (callback instanceof View) {
            this.serializer = ((View) callback).getContext().getApplicationContext();
        } else {
            this.serializer = null;
        }
    }
}
