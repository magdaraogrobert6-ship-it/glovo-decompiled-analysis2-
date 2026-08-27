package o;

import com.roadrunner.liveness.presentation.LivenessDetectionActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class SavedStateRegistryImplExternalSyntheticLambda0 implements DBUtil__DBUtil_androidKtperformInTransactionSuspending2 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final SqlPreparedStatement read;

    public SavedStateRegistryImplExternalSyntheticLambda0(SqlPreparedStatement sqlPreparedStatement) {
        this.read = sqlPreparedStatement;
    }

    public final SparseArraySerializerSparseArraySurrogateCompanion write(SQLite sQLite, LivenessDetectionActivity livenessDetectionActivity) {
        int i = 2 % 2;
        SparseArraySerializerSparseArraySurrogateCompanion sparseArraySerializerSparseArraySurrogateCompanion = new SparseArraySerializerSparseArraySurrogateCompanion(sQLite, livenessDetectionActivity, (inRing) this.read.IconCompatParcelizer.write());
        int i2 = serializer + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return sparseArraySerializerSparseArraySurrogateCompanion;
    }
}
