package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class onCreateVirtualViewTranslationRequestsui extends BlockInnerShadowNodeobtainPainter1 implements PopulateViewStructure_androidKt, setColor8_81llA {
    public onViewDetachedFromWindow serializer;

    @Override // o.blur1fqSgw
    public final BlurKt IconCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.blur1fqSgw
    public final BlurKt RemoteActionCompatParcelizer(BlurKt blurKt, BlurKt blurKt2, BlurKt blurKt3) {
        if (((onViewDetachedFromWindow) blurKt2).write == ((onViewDetachedFromWindow) blurKt3).write) {
            return blurKt2;
        }
        return null;
    }

    @Override // o.setColor8_81llA
    public final AndroidContentCaptureManager write() {
        return AndroidContentCaptureManager.write;
    }

    public final long RemoteActionCompatParcelizer() {
        return ((onViewDetachedFromWindow) getOffsetF1C5BW0.IconCompatParcelizer(this.serializer, this)).write;
    }

    public final String toString() {
        return "MutableLongState(value=" + ((onViewDetachedFromWindow) getOffsetF1C5BW0.IconCompatParcelizer(this.serializer)).write + ")@" + hashCode();
    }

    public final void write(long j) {
        getBrush getbrushWrite;
        onViewDetachedFromWindow onviewdetachedfromwindow = (onViewDetachedFromWindow) getOffsetF1C5BW0.IconCompatParcelizer(this.serializer);
        if (onviewdetachedfromwindow.write != j) {
            onViewDetachedFromWindow onviewdetachedfromwindow2 = this.serializer;
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite = getOffsetF1C5BW0.write();
                ((onViewDetachedFromWindow) getOffsetF1C5BW0.read(onviewdetachedfromwindow2, this, getbrushWrite, onviewdetachedfromwindow)).write = j;
            }
            getOffsetF1C5BW0.write(getbrushWrite, this);
        }
    }

    @Override // o.blur1fqSgw
    public final void serializer(BlurKt blurKt) {
        blurKt.getClass();
        this.serializer = (onViewDetachedFromWindow) blurKt;
    }

    @Override // o.PopulateViewStructure_androidKtpopulate7
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM component2() {
        return new InlineChildren(25, this);
    }

    @Override // o.PopulateViewStructure_androidKtpopulate7
    public final Object component1() {
        return Long.valueOf(RemoteActionCompatParcelizer());
    }
}
