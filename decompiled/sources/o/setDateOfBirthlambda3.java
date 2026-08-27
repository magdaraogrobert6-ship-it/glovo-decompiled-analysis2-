package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.GeneratedMessageLite;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class setDateOfBirthlambda3 extends InputStream implements requestPushPermissionPromptlambda0 {
    public final component23 IconCompatParcelizer;
    public GeneratedMessageLite RemoteActionCompatParcelizer;
    public ByteArrayInputStream write;

    public setDateOfBirthlambda3(GeneratedMessageLite generatedMessageLite, component23 component23Var) {
        this.RemoteActionCompatParcelizer = generatedMessageLite;
        this.IconCompatParcelizer = component23Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        GeneratedMessageLite generatedMessageLite = this.RemoteActionCompatParcelizer;
        if (generatedMessageLite != null) {
            return generatedMessageLite.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.write;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        GeneratedMessageLite generatedMessageLite = this.RemoteActionCompatParcelizer;
        if (generatedMessageLite != null) {
            int serializedSize = generatedMessageLite.getSerializedSize();
            if (serializedSize == 0) {
                this.RemoteActionCompatParcelizer = null;
                this.write = null;
                return -1;
            }
            if (i2 >= serializedSize) {
                java.util.logging.Logger logger = ComposeView.RemoteActionCompatParcelizer;
                ProvideCompositionLocalsui provideCompositionLocalsui = new ProvideCompositionLocalsui(bArr, i, serializedSize);
                this.RemoteActionCompatParcelizer.writeTo(provideCompositionLocalsui);
                if (provideCompositionLocalsui.RemoteActionCompatParcelizer() != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Did not write as much data as expected.");
                    return 0;
                }
                this.RemoteActionCompatParcelizer = null;
                this.write = null;
                return serializedSize;
            }
            this.write = new ByteArrayInputStream(this.RemoteActionCompatParcelizer.toByteArray());
            this.RemoteActionCompatParcelizer = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.write;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.RemoteActionCompatParcelizer != null) {
            this.write = new ByteArrayInputStream(this.RemoteActionCompatParcelizer.toByteArray());
            this.RemoteActionCompatParcelizer = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.write;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }
}
