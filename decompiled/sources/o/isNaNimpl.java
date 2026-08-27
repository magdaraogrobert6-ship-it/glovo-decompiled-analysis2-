package o;

/* JADX INFO: loaded from: classes.dex */
public final class isNaNimpl extends BlendModeColorFilterxETnrds {
    public final /* synthetic */ Object read;
    public final /* synthetic */ int write;

    @Override // o.BlendModeColorFilterxETnrds
    public final void IconCompatParcelizer(int i, int i2) {
        IconCompatParcelizer();
    }

    @Override // o.BlendModeColorFilterxETnrds
    public final void RemoteActionCompatParcelizer(int i, int i2) {
        IconCompatParcelizer();
    }

    @Override // o.BlendModeColorFilterxETnrds
    public final void RemoteActionCompatParcelizer(int i, int i2, Object obj) {
        IconCompatParcelizer();
    }

    @Override // o.BlendModeColorFilterxETnrds
    public final void serializer(int i, int i2) {
        IconCompatParcelizer();
    }

    public /* synthetic */ isNaNimpl(int i, Object obj) {
        this.write = i;
        this.read = obj;
    }

    @Override // o.BlendModeColorFilterxETnrds
    public final void IconCompatParcelizer() {
        int i = this.write;
        Object obj = this.read;
        if (i != 0) {
            ((androidx.transition.TransitionValuesMaps) obj).ParcelableVolumeInfo();
            return;
        }
        androidx.viewpager2.widget.ViewPager2 viewPager2 = (androidx.viewpager2.widget.ViewPager2) obj;
        viewPager2.read = true;
        viewPager2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer = true;
    }
}
