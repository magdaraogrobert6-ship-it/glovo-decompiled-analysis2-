package o;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class updateSizeuvyYCjkfoundation extends OrientationEventListener {
    public final /* synthetic */ androidx.navigation.NavArgsLazy read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public updateSizeuvyYCjkfoundation(androidx.navigation.NavArgsLazy navArgsLazy, Context context) {
        super(context);
        this.read = navArgsLazy;
        this.write = -1;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int i2;
        ArrayList<ClickableKt> arrayList;
        if (i == -1) {
            return;
        }
        if (i >= 315 || i < 45) {
            i2 = 0;
        } else if (i >= 225) {
            i2 = 1;
        } else {
            i2 = i >= 135 ? 2 : 3;
        }
        if (this.write != i2) {
            this.write = i2;
            synchronized (this.read.MediaSessionCompatQueueItem) {
                arrayList = new ArrayList(((HashMap) this.read.RatingCompat).values());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            for (ClickableKt clickableKt : arrayList) {
                clickableKt.serializer.execute(new brazelogdefault(clickableKt, i2, 5));
            }
        }
    }
}
