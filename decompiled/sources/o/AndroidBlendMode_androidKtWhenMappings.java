package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidBlendMode_androidKtWhenMappings implements android.transition.Transition.TransitionListener {
    public final /* synthetic */ ArrayList IconCompatParcelizer;
    public final /* synthetic */ ArrayList RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ AndroidBlendMode_androidKt write;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(android.transition.Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(android.transition.Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(android.transition.Transition transition) {
        AndroidBlendMode_androidKt androidBlendMode_androidKt = this.write;
        Object obj = this.serializer;
        if (obj != null) {
            androidBlendMode_androidKt.IconCompatParcelizer(obj, this.IconCompatParcelizer, null);
        }
        Object obj2 = this.read;
        if (obj2 != null) {
            androidBlendMode_androidKt.IconCompatParcelizer(obj2, this.RemoteActionCompatParcelizer, null);
        }
    }

    public AndroidBlendMode_androidKtWhenMappings(AndroidBlendMode_androidKt androidBlendMode_androidKt, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.write = androidBlendMode_androidKt;
        this.serializer = obj;
        this.IconCompatParcelizer = arrayList;
        this.read = obj2;
        this.RemoteActionCompatParcelizer = arrayList2;
    }
}
