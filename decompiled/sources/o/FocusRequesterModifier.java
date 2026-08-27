package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class FocusRequesterModifier {
    public final android.graphics.Rect[][] IconCompatParcelizer;
    public final android.graphics.Rect[][] RemoteActionCompatParcelizer;
    public setRight[] read;
    public final FocusRequesterModifierKt write;

    public abstract void IconCompatParcelizer(setRight setright);

    public abstract FocusRequesterModifierKt RemoteActionCompatParcelizer();

    public void RemoteActionCompatParcelizer(setRight setright) {
    }

    public void read(setRight setright) {
    }

    public void serializer(setRight setright) {
    }

    public abstract void write(setRight setright);

    public FocusRequesterModifier(FocusRequesterModifierKt focusRequesterModifierKt) {
        this.RemoteActionCompatParcelizer = new android.graphics.Rect[10][];
        this.IconCompatParcelizer = new android.graphics.Rect[10][];
        this.write = focusRequesterModifierKt;
        read(focusRequesterModifierKt);
    }

    public void read(FocusRequesterModifierKt focusRequesterModifierKt) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<android.graphics.Rect> boundingRects = focusRequesterModifierKt.IconCompatParcelizer.getBoundingRects(i);
            int iRemoteActionCompatParcelizer = coil3.UriKt.RemoteActionCompatParcelizer(i);
            this.RemoteActionCompatParcelizer[iRemoteActionCompatParcelizer] = (android.graphics.Rect[]) boundingRects.toArray(new android.graphics.Rect[boundingRects.size()]);
            if (i != 8) {
                List<android.graphics.Rect> boundingRectsIgnoringVisibility = focusRequesterModifierKt.IconCompatParcelizer.getBoundingRectsIgnoringVisibility(i);
                this.IconCompatParcelizer[iRemoteActionCompatParcelizer] = (android.graphics.Rect[]) boundingRectsIgnoringVisibility.toArray(new android.graphics.Rect[boundingRectsIgnoringVisibility.size()]);
            }
        }
    }

    public final void serializer() {
        setRight[] setrightArr = this.read;
        if (setrightArr != null) {
            setRight insets = setrightArr[0];
            setRight insets2 = setrightArr[1];
            FocusRequesterModifierKt focusRequesterModifierKt = this.write;
            if (insets2 == null) {
                insets2 = focusRequesterModifierKt.IconCompatParcelizer.getInsets(2);
            }
            if (insets == null) {
                insets = focusRequesterModifierKt.IconCompatParcelizer.getInsets(1);
            }
            write(setRight.write(insets, insets2));
            setRight setright = this.read[coil3.UriKt.RemoteActionCompatParcelizer(16)];
            if (setright != null) {
                read(setright);
            }
            setRight setright2 = this.read[coil3.UriKt.RemoteActionCompatParcelizer(32)];
            if (setright2 != null) {
                serializer(setright2);
            }
            setRight setright3 = this.read[coil3.UriKt.RemoteActionCompatParcelizer(64)];
            if (setright3 != null) {
                RemoteActionCompatParcelizer(setright3);
            }
        }
    }

    public void IconCompatParcelizer(int i, setRight setright) {
        if (this.read == null) {
            this.read = new setRight[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.read[coil3.UriKt.RemoteActionCompatParcelizer(i2)] = setright;
            }
        }
    }

    public FocusRequesterModifier() {
        this(new FocusRequesterModifierKt((FocusRequesterModifierKt) null));
    }
}
