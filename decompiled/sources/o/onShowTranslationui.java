package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class onShowTranslationui extends BlockInnerShadowNodeobtainPainter1 implements setColor8_81llA {
    public final AndroidContentCaptureManager IconCompatParcelizer;
    public onVirtualViewTranslationResponsesui read;

    @Override // o.blur1fqSgw
    public final BlurKt IconCompatParcelizer() {
        return this.read;
    }

    @Override // o.PopulateViewStructure_androidKtpopulate7
    public final Object component1() {
        return getValue();
    }

    @Override // o.setColor8_81llA
    public final AndroidContentCaptureManager write() {
        return this.IconCompatParcelizer;
    }

    @Override // o.onViewAttachedToWindow
    public final Object getValue() {
        return ((onVirtualViewTranslationResponsesui) getOffsetF1C5BW0.IconCompatParcelizer(this.read, this)).serializer;
    }

    @Override // o.PopulateViewStructure_androidKtpopulate7
    public final void setValue(Object obj) {
        getBrush getbrushWrite;
        onVirtualViewTranslationResponsesui onvirtualviewtranslationresponsesui = (onVirtualViewTranslationResponsesui) getOffsetF1C5BW0.IconCompatParcelizer(this.read);
        if (this.IconCompatParcelizer.serializer(onvirtualviewtranslationresponsesui.serializer, obj)) {
            return;
        }
        onVirtualViewTranslationResponsesui onvirtualviewtranslationresponsesui2 = this.read;
        synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
            getbrushWrite = getOffsetF1C5BW0.write();
            ((onVirtualViewTranslationResponsesui) getOffsetF1C5BW0.read(onvirtualviewtranslationresponsesui2, this, getbrushWrite, onvirtualviewtranslationresponsesui)).serializer = obj;
        }
        getOffsetF1C5BW0.write(getbrushWrite, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((onVirtualViewTranslationResponsesui) getOffsetF1C5BW0.IconCompatParcelizer(this.read)).serializer + ")@" + hashCode();
    }

    public onShowTranslationui(Object obj, AndroidContentCaptureManager androidContentCaptureManager) {
        this.IconCompatParcelizer = androidContentCaptureManager;
        getBrush getbrushWrite = getOffsetF1C5BW0.write();
        onVirtualViewTranslationResponsesui onvirtualviewtranslationresponsesui = new onVirtualViewTranslationResponsesui(getbrushWrite.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), obj);
        if (!(getbrushWrite instanceof setShape)) {
            onvirtualviewtranslationresponsesui.MediaSessionCompatQueueItem = new onVirtualViewTranslationResponsesui(1L, obj);
        }
        this.read = onvirtualviewtranslationresponsesui;
    }

    @Override // o.blur1fqSgw
    public final BlurKt RemoteActionCompatParcelizer(BlurKt blurKt, BlurKt blurKt2, BlurKt blurKt3) {
        if (this.IconCompatParcelizer.serializer(((onVirtualViewTranslationResponsesui) blurKt2).serializer, ((onVirtualViewTranslationResponsesui) blurKt3).serializer)) {
            return blurKt2;
        }
        return null;
    }

    @Override // o.blur1fqSgw
    public final void serializer(BlurKt blurKt) {
        blurKt.getClass();
        this.read = (onVirtualViewTranslationResponsesui) blurKt;
    }

    @Override // o.PopulateViewStructure_androidKtpopulate7
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM component2() {
        return new InlineChildren(26, this);
    }
}
