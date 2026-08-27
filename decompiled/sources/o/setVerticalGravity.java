package o;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class setVerticalGravity {
    public Object read;

    public Object RemoteActionCompatParcelizer() {
        return this.read;
    }

    public void write(Object obj) {
        this.read = obj;
    }

    public /* synthetic */ setVerticalGravity(Object obj) {
        this.read = obj;
    }

    public static setVerticalGravity serializer(float f, float f2, float f3) {
        return new setVerticalGravity(AccessibilityNodeInfo.RangeInfo.obtain(1, f, f2, f3));
    }

    public setVerticalGravity() {
    }
}
