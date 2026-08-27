package com.google.firebase.firestore.model;

import androidx.room.RoomDatabase$createConnectionManager$2;
import com.google.firestore.v1.Value;
import o.NodeCoordinatorCompaniononCommitAffectingLayer1;
import o.shouldHitTest;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Values$Enterprise {
    public static final RoomDatabase$createConnectionManager$2 IconCompatParcelizer = new RoomDatabase$createConnectionManager$2(2, NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer, NodeCoordinatorCompaniononCommitAffectingLayer1.class, "compare", "compare(Lcom/google/firestore/v1/Value;Lcom/google/firestore/v1/Value;)I", 0, 1);

    public static shouldHitTest read(Value value, Value value2) {
        if (value == null && value2 == null) {
            return shouldHitTest.EQUAL;
        }
        if (value != null && value2 != null) {
            int iRemoteActionCompatParcelizer = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer(value);
            if (iRemoteActionCompatParcelizer != NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer(value2)) {
                return shouldHitTest.TYPE_MISMATCH;
            }
            NodeCoordinatorCompaniononCommitAffectingLayer1 nodeCoordinatorCompaniononCommitAffectingLayer1 = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer;
            int i = NodeCoordinatorCompaniononCommitAffectingLayer1.read(iRemoteActionCompatParcelizer, value, value2);
            if (i < 0) {
                return shouldHitTest.LESS_THAN;
            }
            if (i > 0) {
                return shouldHitTest.GREATER_THAN;
            }
            return shouldHitTest.EQUAL;
        }
        return shouldHitTest.TYPE_MISMATCH;
    }
}
