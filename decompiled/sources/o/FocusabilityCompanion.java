package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class FocusabilityCompanion extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ androidx.datastore.migrations.SharedPreferencesMigration read;
    public /* synthetic */ Object serializer;
    public androidx.datastore.migrations.SharedPreferencesMigration write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusabilityCompanion(androidx.datastore.migrations.SharedPreferencesMigration sharedPreferencesMigration, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = sharedPreferencesMigration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.read.shouldMigrate(null, this);
    }
}
