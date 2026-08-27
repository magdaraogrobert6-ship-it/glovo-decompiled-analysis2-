package o;

import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class getWhite0d7_KjUannotations {
    public static final Window IconCompatParcelizer(View view) {
        Field field;
        view.getClass();
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = io.sentry.android.replay.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.write;
        View rootView = view.getRootView();
        rootView.getClass();
        Class cls = (Class) io.sentry.android.replay.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.write.MediaSessionCompatResultReceiverWrapper();
        if (cls == null || !cls.isInstance(rootView) || (field = (Field) io.sentry.android.replay.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()) == null) {
            return null;
        }
        Object obj = field.get(rootView);
        obj.getClass();
        return (Window) obj;
    }

    public static final void read(ImageKt imageKt, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        imageKt.getClass();
        ImageKt imageKt2 = new ImageKt(999);
        int i = imageKt.MediaMetadataCompat;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            imageKt2.put(imageKt.IconCompatParcelizer(i2), imageKt.write(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(imageKt2);
                imageKt2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(imageKt2);
        }
    }
}
