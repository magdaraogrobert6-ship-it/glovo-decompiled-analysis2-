package o;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class toRectuvyYCjk {
    public static final toAndroidBlendModes9anfk8 read;
    public static final AndroidBlendMode_androidKt serializer = new AndroidBlendMode_androidKt();

    static {
        toAndroidBlendModes9anfk8 toandroidblendmodes9anfk8 = null;
        try {
            toandroidblendmodes9anfk8 = (toAndroidBlendModes9anfk8) androidx.transition.FragmentTransitionSupport.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        read = toandroidblendmodes9anfk8;
    }

    public static final void RemoteActionCompatParcelizer(int i, ArrayList arrayList) {
        arrayList.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }

    public static final void serializer(ImageKt imageKt, ImageKt imageKt2) {
        for (int i = imageKt.MediaMetadataCompat - 1; -1 < i; i--) {
            if (!imageKt2.containsKey((String) imageKt.write(i))) {
                imageKt.RemoteActionCompatParcelizer(i);
            }
        }
    }
}
