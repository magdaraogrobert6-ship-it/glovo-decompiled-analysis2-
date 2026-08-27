package o;

import com.google.firestore.v1.Value;
import com.google.protobuf.Timestamp;

/* JADX INFO: loaded from: classes2.dex */
public final class getDrawOLwlOKw {
    public static getDrawOLwlOKwannotations RemoteActionCompatParcelizer(long j) {
        NodeCoordinatorCompaniononCommitAffectingLayer1 nodeCoordinatorCompaniononCommitAffectingLayer1 = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer;
        accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
        accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer();
        ((Value) accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer).setIntegerValue(j);
        return new getDrawOLwlOKwannotations((Value) accesscontainsdescendantNewBuilder.serializer());
    }

    public static getDrawOLwlOKwannotations serializer(boolean z) {
        return z ? getBringIntoViewOLwlOKw.read : getBringIntoViewOLwlOKw.write;
    }

    public static getDrawOLwlOKwannotations write(double d) {
        NodeCoordinatorCompaniononCommitAffectingLayer1 nodeCoordinatorCompaniononCommitAffectingLayer1 = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer;
        accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
        accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer(d);
        return new getDrawOLwlOKwannotations((Value) accesscontainsdescendantNewBuilder.serializer());
    }

    public static getBringIntoViewOLwlOKw RemoteActionCompatParcelizer(int i, long j) {
        try {
            Timestamp timestamp = NodeCoordinatorCompaniononCommitAffectingLayer1.read(i, j);
            accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
            accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer();
            ((Value) accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer).setTimestampValue(timestamp);
            return new getDrawOLwlOKwannotations((Value) accesscontainsdescendantNewBuilder.serializer());
        } catch (IllegalArgumentException unused) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
    }
}
