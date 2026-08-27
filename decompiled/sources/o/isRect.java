package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class isRect extends AnimationSet implements Runnable {
    public boolean IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public final View read;
    public final ViewGroup serializer;
    public boolean write;

    public isRect(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.write = true;
        this.serializer = viewGroup;
        this.read = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.write = true;
        if (this.IconCompatParcelizer) {
            return !this.RemoteActionCompatParcelizer;
        }
        if (!super.getTransformation(j, transformation)) {
            this.IconCompatParcelizer = true;
            accesstoUsingEnterExitScope.read(this.serializer, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.IconCompatParcelizer;
        ViewGroup viewGroup = this.serializer;
        if (z || !this.write) {
            viewGroup.endViewTransition(this.read);
            this.RemoteActionCompatParcelizer = true;
        } else {
            this.write = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.write = true;
        if (this.IconCompatParcelizer) {
            return !this.RemoteActionCompatParcelizer;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.IconCompatParcelizer = true;
            accesstoUsingEnterExitScope.read(this.serializer, this);
        }
        return true;
    }
}
