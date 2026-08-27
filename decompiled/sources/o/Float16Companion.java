package o;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class Float16Companion extends toRawBitsimpl {
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Float16Companion(String str, String str2, int i) {
        super(str, str2);
        this.write = i;
    }

    @Override // o.toRawBitsimpl
    public final boolean write() {
        int i = this.write;
        if (i == 0 || i == 1) {
            return true;
        }
        if (i != 2) {
            return i == 3 || i == 4 || i == 5 || Build.VERSION.SDK_INT >= 29;
        }
        return false;
    }
}
