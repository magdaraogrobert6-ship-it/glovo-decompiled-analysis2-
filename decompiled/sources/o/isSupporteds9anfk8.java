package o;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class isSupporteds9anfk8 implements android.transition.Transition.TransitionListener {
    public final /* synthetic */ ArrayList IconCompatParcelizer;
    public final /* synthetic */ View read;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(android.transition.Transition transition) {
    }

    public isSupporteds9anfk8(View view, ArrayList arrayList) {
        this.read = view;
        this.IconCompatParcelizer = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(android.transition.Transition transition) {
        transition.removeListener(this);
        this.read.setVisibility(8);
        ArrayList arrayList = this.IconCompatParcelizer;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(android.transition.Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
