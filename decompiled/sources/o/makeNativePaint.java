package o;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class makeNativePaint {
    public static final Object IconCompatParcelizer = new Object();
    public static makeNativePaint serializer;
    public final Context RemoteActionCompatParcelizer;
    public final toAutofillIdCompat read;
    public final HashMap MediaDescriptionCompat = new HashMap();
    public final HashMap write = new HashMap();
    public final ArrayList MediaMetadataCompat = new ArrayList();

    public static makeNativePaint IconCompatParcelizer(Context context) {
        makeNativePaint makenativepaint;
        synchronized (IconCompatParcelizer) {
            if (serializer == null) {
                serializer = new makeNativePaint(context.getApplicationContext());
            }
            makenativepaint = serializer;
        }
        return makenativepaint;
    }

    public makeNativePaint(Context context) {
        this.RemoteActionCompatParcelizer = context;
        this.read = new toAutofillIdCompat(this, context.getMainLooper(), 1);
    }
}
