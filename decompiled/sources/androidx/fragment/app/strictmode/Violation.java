package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public abstract class Violation extends RuntimeException {
    public final Fragment RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(Fragment fragment, String str) {
        super(str);
        fragment.getClass();
        this.RemoteActionCompatParcelizer = fragment;
    }
}
