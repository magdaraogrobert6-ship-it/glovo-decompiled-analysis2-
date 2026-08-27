package o;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetQcp extends BasePendingResult {
    public final Status write;

    public accessgetQcp(Status status) {
        super(null);
        this.write = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final accessgetNumPadCommacp serializer(Status status) {
        return this.write;
    }
}
