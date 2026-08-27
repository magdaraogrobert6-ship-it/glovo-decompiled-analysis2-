package o;

import com.sentiance.protobuf.WireFormat$FieldType;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdarqb9rTVN7C2TW8SxKqK3QtBwbpA {
    public final r8lambdadeOzq815xUUwmlLYYvm_QV79QY IconCompatParcelizer;
    public final Object write;

    public static int serializer(r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qy, Object obj, Object obj2) {
        return ImageStyle.serializer((WireFormat$FieldType) r8lambdadeozq815xuuwmllyyvm_qv79qy.write, 2, obj2) + ImageStyle.serializer((WireFormat$FieldType) r8lambdadeozq815xuuwmllyyvm_qv79qy.RemoteActionCompatParcelizer, 1, obj);
    }

    public r8lambdarqb9rTVN7C2TW8SxKqK3QtBwbpA(WireFormat$FieldType wireFormat$FieldType, WireFormat$FieldType wireFormat$FieldType2, Object obj) {
        this.IconCompatParcelizer = new r8lambdadeOzq815xUUwmlLYYvm_QV79QY(wireFormat$FieldType, wireFormat$FieldType2, obj, 0);
        this.write = obj;
    }
}
