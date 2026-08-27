package o;

import com.google.firebase.inappmessaging.ExperimentPayloadProto$ExperimentPayload;

/* JADX INFO: loaded from: classes4.dex */
public final class OwnerSnapshotObserveronCommitAffectingLayoutModifierInLookahead1 implements decodeByte {
    public static final OwnerSnapshotObserveronCommitAffectingLayoutModifierInLookahead1 serializer = new OwnerSnapshotObserveronCommitAffectingLayoutModifierInLookahead1();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return ExperimentPayloadProto$ExperimentPayload.IconCompatParcelizer.forNumber(i) != null;
    }
}
