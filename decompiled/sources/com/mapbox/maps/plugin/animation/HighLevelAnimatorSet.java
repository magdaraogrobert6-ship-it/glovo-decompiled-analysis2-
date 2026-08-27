package com.mapbox.maps.plugin.animation;

import android.animation.AnimatorSet;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.threading.AnimationThreadController;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class HighLevelAnimatorSet implements Cancelable {
    public final AnimatorSet animatorSet;
    public final String owner;

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.animation.HighLevelAnimatorSet$cancel$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ HighLevelAnimatorSet this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(HighLevelAnimatorSet highLevelAnimatorSet, int i) {
            super(0);
            this.$r8$classId = i;
            this.this$0 = highLevelAnimatorSet;
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Object invoke() {
            int i = this.$r8$classId;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            HighLevelAnimatorSet highLevelAnimatorSet = this.this$0;
            if (i == 0) {
                highLevelAnimatorSet.animatorSet.cancel();
                return createfromparcel;
            }
            highLevelAnimatorSet.animatorSet.cancel();
            highLevelAnimatorSet.animatorSet.removeAllListeners();
            return createfromparcel;
        }
    }

    public HighLevelAnimatorSet(String str, AnimatorSet animatorSet) {
        this.owner = str;
        this.animatorSet = animatorSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighLevelAnimatorSet)) {
            return false;
        }
        HighLevelAnimatorSet highLevelAnimatorSet = (HighLevelAnimatorSet) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.owner, highLevelAnimatorSet.owner}, getCieXyz.write())).booleanValue() && this.animatorSet.equals(highLevelAnimatorSet.animatorSet);
    }

    public final String toString() {
        return "HighLevelAnimatorSet(owner=" + this.owner + ", animatorSet=" + this.animatorSet + ')';
    }

    @Override // com.mapbox.common.Cancelable
    public final void cancel() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new AnonymousClass1(this, 0));
    }

    public final int hashCode() {
        String str = this.owner;
        return this.animatorSet.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
