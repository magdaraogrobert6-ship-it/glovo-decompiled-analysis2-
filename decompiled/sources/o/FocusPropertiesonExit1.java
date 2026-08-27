package o;

import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class FocusPropertiesonExit1 {
    public int[] IconCompatParcelizer;
    public ViewParent RemoteActionCompatParcelizer;
    public ViewParent read;
    public boolean serializer;
    public final View write;

    public final boolean read(int i) {
        return IconCompatParcelizer(i) != null;
    }

    public final boolean serializer(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentIconCompatParcelizer;
        int i6;
        int i7;
        int[] iArr3;
        if (this.serializer && (viewParentIconCompatParcelizer = IconCompatParcelizer(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                View view = this.write;
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.IconCompatParcelizer == null) {
                        this.IconCompatParcelizer = new int[2];
                    }
                    int[] iArr4 = this.IconCompatParcelizer;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                ContentCardsFragmentonRefresh1.read(viewParentIconCompatParcelizer, this.write, i, i2, i3, i4, i5, iArr3);
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public FocusPropertiesonExit1(View view) {
        this.write = view;
    }

    public final void write(boolean z) {
        if (this.serializer) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            this.write.stopNestedScroll();
        }
        this.serializer = z;
    }

    public final boolean serializer(float f, float f2) {
        ViewParent viewParentIconCompatParcelizer;
        if (!this.serializer || (viewParentIconCompatParcelizer = IconCompatParcelizer(0)) == null) {
            return false;
        }
        return ContentCardsFragmentonRefresh1.write(viewParentIconCompatParcelizer, this.write, f, f2);
    }

    public final boolean serializer(float f, float f2, boolean z) {
        ViewParent viewParentIconCompatParcelizer;
        if (!this.serializer || (viewParentIconCompatParcelizer = IconCompatParcelizer(0)) == null) {
            return false;
        }
        return ContentCardsFragmentonRefresh1.read(viewParentIconCompatParcelizer, this.write, f, f2, z);
    }

    public final void serializer(int i) {
        ViewParent viewParentIconCompatParcelizer = IconCompatParcelizer(i);
        if (viewParentIconCompatParcelizer != null) {
            ContentCardsFragmentonRefresh1.RemoteActionCompatParcelizer(viewParentIconCompatParcelizer, this.write, i);
            if (i == 0) {
                this.read = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.RemoteActionCompatParcelizer = null;
            }
        }
    }

    public final ViewParent IconCompatParcelizer(int i) {
        if (i == 0) {
            return this.read;
        }
        if (i != 1) {
            return null;
        }
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean serializer(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        ViewParent viewParentIconCompatParcelizer;
        int i4;
        int i5;
        int[] iArr3;
        if (this.serializer && (viewParentIconCompatParcelizer = IconCompatParcelizer(i3)) != null) {
            if (i != 0 || i2 != 0) {
                View view = this.write;
                if (iArr2 != null) {
                    view.getLocationInWindow(iArr2);
                    i4 = iArr2[0];
                    i5 = iArr2[1];
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (iArr == null) {
                    if (this.IconCompatParcelizer == null) {
                        this.IconCompatParcelizer = new int[2];
                    }
                    iArr3 = this.IconCompatParcelizer;
                } else {
                    iArr3 = iArr;
                }
                iArr3[0] = 0;
                iArr3[1] = 0;
                ContentCardsFragmentonRefresh1.write(viewParentIconCompatParcelizer, this.write, i, i2, iArr3, i3);
                if (iArr2 != null) {
                    view.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i4;
                    iArr2[1] = iArr2[1] - i5;
                }
                if (iArr3[0] != 0 || iArr3[1] != 0) {
                    return true;
                }
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final boolean serializer(int i, int i2) {
        if (read(i2)) {
            return true;
        }
        if (!this.serializer) {
            return false;
        }
        View view = this.write;
        View view2 = view;
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (ContentCardsFragmentonRefresh1.serializer(parent, view2, view, i, i2)) {
                if (i2 == 0) {
                    this.read = parent;
                } else if (i2 == 1) {
                    this.RemoteActionCompatParcelizer = parent;
                }
                ContentCardsFragmentonRefresh1.RemoteActionCompatParcelizer(parent, view2, view, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view2 = parent;
            }
        }
        return false;
    }
}
