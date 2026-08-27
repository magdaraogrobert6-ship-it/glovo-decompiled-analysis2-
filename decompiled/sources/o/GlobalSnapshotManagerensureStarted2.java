package o;

import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class GlobalSnapshotManagerensureStarted2 extends com.google.protobuf.UnknownFieldSchema {
    @Override // com.google.protobuf.UnknownFieldSchema
    public final GraphicsLayerOwnerLayer IconCompatParcelizer(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = generatedMessageLite.RemoteActionCompatParcelizer;
        if (graphicsLayerOwnerLayer != GraphicsLayerOwnerLayer.serializer) {
            return graphicsLayerOwnerLayer;
        }
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer2 = new GraphicsLayerOwnerLayer();
        generatedMessageLite.RemoteActionCompatParcelizer = graphicsLayerOwnerLayer2;
        return graphicsLayerOwnerLayer2;
    }

    @Override // com.google.protobuf.UnknownFieldSchema
    public final void RemoteActionCompatParcelizer(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).RemoteActionCompatParcelizer = (GraphicsLayerOwnerLayer) obj2;
    }
}
