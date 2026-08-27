package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class getContentCaptureSessionui extends BlockInnerShadowNodeobtainPainter1 implements populate, setColor8_81llA {
    public isEnabledui serializer;

    @Override // o.blur1fqSgw
    public final BlurKt IconCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.blur1fqSgw
    public final BlurKt RemoteActionCompatParcelizer(BlurKt blurKt, BlurKt blurKt2, BlurKt blurKt3) {
        if (((isEnabledui) blurKt2).IconCompatParcelizer == ((isEnabledui) blurKt3).IconCompatParcelizer) {
            return blurKt2;
        }
        return null;
    }

    @Override // o.setColor8_81llA
    public final AndroidContentCaptureManager write() {
        return AndroidContentCaptureManager.write;
    }

    public final void IconCompatParcelizer(float f) {
        getBrush getbrushWrite;
        isEnabledui isenabledui = (isEnabledui) getOffsetF1C5BW0.IconCompatParcelizer(this.serializer);
        if (isenabledui.IconCompatParcelizer == f) {
            return;
        }
        isEnabledui isenabledui2 = this.serializer;
        synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
            getbrushWrite = getOffsetF1C5BW0.write();
            ((isEnabledui) getOffsetF1C5BW0.read(isenabledui2, this, getbrushWrite, isenabledui)).IconCompatParcelizer = f;
        }
        getOffsetF1C5BW0.write(getbrushWrite, this);
    }

    public final float serializer() {
        return ((isEnabledui) getOffsetF1C5BW0.IconCompatParcelizer(this.serializer, this)).IconCompatParcelizer;
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((isEnabledui) getOffsetF1C5BW0.IconCompatParcelizer(this.serializer)).IconCompatParcelizer + ")@" + hashCode();
    }

    @Override // o.PopulateViewStructure_androidKtpopulate7
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM component2() {
        return new onClearTranslationui(this, 0);
    }

    @Override // o.blur1fqSgw
    public final void serializer(BlurKt blurKt) {
        blurKt.getClass();
        this.serializer = (isEnabledui) blurKt;
    }

    @Override // o.PopulateViewStructure_androidKtpopulate7
    public final Object component1() {
        return Float.valueOf(serializer());
    }
}
