package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class onHideTranslationui extends BlockInnerShadowNodeobtainPainter1 implements getPlatformAndroidManager, setColor8_81llA {
    public onLayoutChangeui IconCompatParcelizer;

    @Override // o.blur1fqSgw
    public final BlurKt IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.blur1fqSgw
    public final BlurKt RemoteActionCompatParcelizer(BlurKt blurKt, BlurKt blurKt2, BlurKt blurKt3) {
        if (((onLayoutChangeui) blurKt2).write == ((onLayoutChangeui) blurKt3).write) {
            return blurKt2;
        }
        return null;
    }

    @Override // o.setColor8_81llA
    public final AndroidContentCaptureManager write() {
        return AndroidContentCaptureManager.write;
    }

    public final int serializer() {
        return ((onLayoutChangeui) getOffsetF1C5BW0.IconCompatParcelizer(this.IconCompatParcelizer, this)).write;
    }

    public final void serializer(int i) {
        getBrush getbrushWrite;
        onLayoutChangeui onlayoutchangeui = (onLayoutChangeui) getOffsetF1C5BW0.IconCompatParcelizer(this.IconCompatParcelizer);
        if (onlayoutchangeui.write != i) {
            onLayoutChangeui onlayoutchangeui2 = this.IconCompatParcelizer;
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite = getOffsetF1C5BW0.write();
                ((onLayoutChangeui) getOffsetF1C5BW0.read(onlayoutchangeui2, this, getbrushWrite, onlayoutchangeui)).write = i;
            }
            getOffsetF1C5BW0.write(getbrushWrite, this);
        }
    }

    public final String toString() {
        return "MutableIntState(value=" + ((onLayoutChangeui) getOffsetF1C5BW0.IconCompatParcelizer(this.IconCompatParcelizer)).write + ")@" + hashCode();
    }

    @Override // o.blur1fqSgw
    public final void serializer(BlurKt blurKt) {
        blurKt.getClass();
        this.IconCompatParcelizer = (onLayoutChangeui) blurKt;
    }

    @Override // o.PopulateViewStructure_androidKtpopulate7
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM component2() {
        return new InlineChildren(24, this);
    }

    @Override // o.PopulateViewStructure_androidKtpopulate7
    public final Object component1() {
        return Integer.valueOf(serializer());
    }
}
