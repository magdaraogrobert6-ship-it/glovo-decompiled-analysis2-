package o;

import android.content.ContentValues;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class InAppMessageBase extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 {
    final long read;
    public final Long serializer;

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String IconCompatParcelizer() {
        throw null;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<InAppMessageBase> write() {
        return handleLogClicklambda2.read();
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final ContentValues RemoteActionCompatParcelizer() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(this.read));
        contentValues.put("sdk_event_ingestion_time", this.serializer);
        return contentValues;
    }

    public InAppMessageBase(long j, Long l) {
        this.read = j;
        this.serializer = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppMessageBase)) {
            return false;
        }
        InAppMessageBase inAppMessageBase = (InAppMessageBase) obj;
        return this.read == inAppMessageBase.read && Objects.equals(this.serializer, inAppMessageBase.serializer);
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String toString() {
        return "Common{id=" + this.read + ", lastProcessedSdkEventIngestionTime=" + this.serializer + '}';
    }

    public final int hashCode() {
        int i = (int) this.read;
        Long l = this.serializer;
        return (i * 31) + (l == null ? 0 : l.hashCode());
    }
}
