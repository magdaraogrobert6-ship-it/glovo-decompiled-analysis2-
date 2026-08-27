package o;

import android.view.View;
import androidx.emoji2.text.EmojiCompat$InitCallback;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetUnspecifiedcp implements Runnable {
    public final Object IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 1;
    public final Object serializer;

    public accessgetUnspecifiedcp(List list, int i, Throwable th) {
        coil3.util.UtilsKt.IconCompatParcelizer(list, "initCallbacks cannot be null");
        this.serializer = new ArrayList(list);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        Object obj2 = this.IconCompatParcelizer;
        int i3 = 0;
        if (i != 0) {
            ((BottomSheetBehavior) obj2).startSettling((View) obj, i2, false);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        if (i2 != 1) {
            while (i3 < size) {
                ((EmojiCompat$InitCallback) arrayList.get(i3)).onFailed((Throwable) obj2);
                i3++;
            }
        } else {
            while (i3 < size) {
                ((EmojiCompat$InitCallback) arrayList.get(i3)).onInitialized();
                i3++;
            }
        }
    }

    public accessgetUnspecifiedcp(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.IconCompatParcelizer = bottomSheetBehavior;
        this.serializer = view;
        this.RemoteActionCompatParcelizer = i;
    }
}
