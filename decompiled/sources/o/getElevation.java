package o;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface getElevation extends dumpRenderNodeData {
    component23 getParserForType();

    int getSerializedSize();

    getClipToOutline newBuilderForType();

    getClipToOutline toBuilder();

    byte[] toByteArray();

    void writeTo(OutputStream outputStream);

    void writeTo(ComposeView composeView);
}
