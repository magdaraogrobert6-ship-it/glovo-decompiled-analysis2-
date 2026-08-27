package o;

import com.google.firestore.v1.Value;

/* JADX INFO: loaded from: classes2.dex */
public enum getInsertedannotations {
    ASCENDING(NodeCoordinatorCompaniononCommitAffectingLayer1.write("ascending")),
    DESCENDING(NodeCoordinatorCompaniononCommitAffectingLayer1.write("descending"));

    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = coil3.util.UtilsKt.read((Enum[]) values());
    private final Value proto;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final Value getProto() {
        return this.proto;
    }

    getInsertedannotations(Value value) {
        this.proto = value;
    }
}
