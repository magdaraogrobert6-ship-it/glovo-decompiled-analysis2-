package kotlinx.coroutines.flow;

import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.List;
import o.BaseContentCardViewExternalSyntheticLambda0;
import o.DrawableTransformation;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes4.dex */
final class StartedWhileSubscribed implements SharingStarted {
    public final long IconCompatParcelizer;
    public final long read;

    public final int hashCode() {
        return Long.hashCode(this.read) + (Long.hashCode(this.IconCompatParcelizer) * 31);
    }

    public StartedWhileSubscribed(long j, long j2) {
        this.IconCompatParcelizer = j;
        this.read = j2;
        if (j < 0) {
            DrawableTransformation.serializer((Object) m1$$ExternalSyntheticOutline0.m(j, "stopTimeout(", " ms) cannot be negative"));
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        DrawableTransformation.serializer((Object) m1$$ExternalSyntheticOutline0.m(j2, "replayExpiration(", " ms) cannot be negative"));
        throw null;
    }

    public final String toString() {
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = new BaseContentCardViewExternalSyntheticLambda0(2);
        long j = this.IconCompatParcelizer;
        if (j > 0) {
            baseContentCardViewExternalSyntheticLambda0.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.read;
        if (j2 < Long.MAX_VALUE) {
            baseContentCardViewExternalSyntheticLambda0.add("replayExpiration=" + j2 + "ms");
        }
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("SharingStarted.WhileSubscribed("), onContentCardDismissed.IconCompatParcelizer(SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0), null, null, null, null, 63), ')');
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public final Flow write(StateFlow stateFlow) {
        return FlowKt.serializer(new FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1(new StartedWhileSubscribed$command$2(2, null), FlowKt.RemoteActionCompatParcelizer(stateFlow, new StartedWhileSubscribed$command$1(this, null))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StartedWhileSubscribed)) {
            return false;
        }
        StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
        return this.IconCompatParcelizer == startedWhileSubscribed.IconCompatParcelizer && this.read == startedWhileSubscribed.read;
    }
}
