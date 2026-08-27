package o;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultHapticFeedback {
    public static final decodeTextUnitXSAIIZE serializer = new decodeTextUnitXSAIIZE(0);
    public final Object write;

    public void IconCompatParcelizer(int i, long j) {
        ((ComposeView) this.write).write(i, j);
    }

    public void IconCompatParcelizer(int i, Object obj) {
        boolean z = obj instanceof getClipMetadata;
        ComposeView composeView = (ComposeView) this.write;
        if (z) {
            composeView.read(i, (getClipMetadata) obj);
        } else {
            composeView.read(i, (getElevation) obj);
        }
    }

    public void IconCompatParcelizer(int i, getClipMetadata getclipmetadata) {
        ((ComposeView) this.write).write(i, getclipmetadata);
    }

    public void read(int i, int i2) {
        ((ComposeView) this.write).read(i, i2);
    }

    public void read(int i, Object obj, DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0) {
        ((ComposeView) this.write).RemoteActionCompatParcelizer(i, (getElevation) obj, disposableSaveableStateRegistrylambda0);
    }

    public void serializer(int i, int i2) {
        ((ComposeView) this.write).write(i, i2);
    }

    public void serializer(int i, long j) {
        ((ComposeView) this.write).RemoteActionCompatParcelizer(i, j);
    }

    public void write(int i, Object obj, DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0) {
        ComposeView composeView = (ComposeView) this.write;
        composeView.RemoteActionCompatParcelizer(i, 3);
        disposableSaveableStateRegistrylambda0.IconCompatParcelizer((getElevation) obj, composeView.IconCompatParcelizer);
        composeView.RemoteActionCompatParcelizer(i, 4);
    }

    public DefaultHapticFeedback() {
        getClipToBounds getcliptobounds;
        try {
            getcliptobounds = (getClipToBounds) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            getcliptobounds = serializer;
        }
        getClipToBounds[] getcliptoboundsArr = {decodeTextUnitXSAIIZE.RemoteActionCompatParcelizer, getcliptobounds};
        DeviceRenderNode deviceRenderNode = new DeviceRenderNode();
        deviceRenderNode.RemoteActionCompatParcelizer = getcliptoboundsArr;
        Charset charset = CompositionLocalsKtLocalWindowInfo1.serializer;
        this.write = deviceRenderNode;
    }

    public DefaultHapticFeedback(ComposeView composeView) {
        CompositionLocalsKtLocalWindowInfo1.read(composeView, "output");
        this.write = composeView;
        composeView.IconCompatParcelizer = this;
    }
}
