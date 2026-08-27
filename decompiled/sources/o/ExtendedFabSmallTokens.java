package o;

import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class ExtendedFabSmallTokens implements onViewAttachedToWindow {
    public int RemoteActionCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 serializer;

    @Override // o.onViewAttachedToWindow
    public final Object getValue() {
        return (ensureSubscribedToInAppMessageEventslambda7) ((onShowTranslationui) this.serializer).getValue();
    }

    public ExtendedFabSmallTokens(int i) {
        int i2 = (i / 30) * 30;
        this.serializer = androidx.compose.runtime.CompositionKt.serializer((ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{Integer.valueOf(Math.max(i2 - 100, 0)), Integer.valueOf(i2 + 130)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write()), AndroidContentCaptureManager.write);
        this.RemoteActionCompatParcelizer = i;
    }

    public final void IconCompatParcelizer(int i) {
        if (i != this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = i;
            int i2 = (i / 30) * 30;
            ((onShowTranslationui) this.serializer).setValue((ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{Integer.valueOf(Math.max(i2 - 100, 0)), Integer.valueOf(i2 + 130)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write()));
        }
    }
}
