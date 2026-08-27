package o;

import com.ui.common.base.BaseRxViewModelKt;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class setPainter extends setAlignment {
    public setAlignment[] removeOnContextAvailableListener = new setAlignment[4];
    public int removeOnMultiWindowModeChangedListener = 0;

    public void r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
    }

    public final void write(int i, getClip getclip, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.removeOnMultiWindowModeChangedListener; i2++) {
            getclip.write(this.removeOnContextAvailableListener[i2]);
        }
        for (int i3 = 0; i3 < this.removeOnMultiWindowModeChangedListener; i3++) {
            BaseRxViewModelKt.read(this.removeOnContextAvailableListener[i3], i, arrayList, getclip);
        }
    }

    public final void write(setAlignment setalignment) {
        if (setalignment == this || setalignment == null) {
            return;
        }
        int i = this.removeOnMultiWindowModeChangedListener;
        setAlignment[] setalignmentArr = this.removeOnContextAvailableListener;
        if (i + 1 > setalignmentArr.length) {
            this.removeOnContextAvailableListener = (setAlignment[]) Arrays.copyOf(setalignmentArr, setalignmentArr.length * 2);
        }
        setAlignment[] setalignmentArr2 = this.removeOnContextAvailableListener;
        int i2 = this.removeOnMultiWindowModeChangedListener;
        setalignmentArr2[i2] = setalignment;
        this.removeOnMultiWindowModeChangedListener = i2 + 1;
    }
}
