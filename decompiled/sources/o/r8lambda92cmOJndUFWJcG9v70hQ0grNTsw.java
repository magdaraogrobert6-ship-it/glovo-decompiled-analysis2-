package o;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda92cmOJndUFWJcG9v70hQ0grNTsw extends r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE {
    private final boolean MediaMetadataCompat;
    private final int MediaSessionCompatQueueItem;

    public final int read() {
        return this.MediaSessionCompatQueueItem;
    }

    public final boolean serializer() {
        return this.MediaMetadataCompat;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs write() {
        return InAppMessageControl.read();
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE, o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final ContentValues RemoteActionCompatParcelizer() {
        ContentValues contentValues = new ContentValues(super.RemoteActionCompatParcelizer());
        contentValues.put("duration_millis", Integer.valueOf(this.MediaSessionCompatQueueItem));
        contentValues.put("is_phone_usage_event", Boolean.valueOf(this.MediaMetadataCompat));
        return contentValues;
    }

    public final r8lambda92cmOJndUFWJcG9v70hQ0grNTsw read(int i, long j) {
        long j2 = this.read;
        String str = this.RemoteActionCompatParcelizer;
        str.getClass();
        return new r8lambda92cmOJndUFWJcG9v70hQ0grNTsw(j2, str, j, this.IconCompatParcelizer, i, this.MediaMetadataCompat, this.serializer, this.RatingCompat);
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneUsageEvaluationEntry(uniqueId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(",eventTime=");
        sb.append(this.write);
        sb.append(",durationMillis=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(",isPhoneUsageEvent=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.MediaMetadataCompat, ')');
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r8lambda92cmOJndUFWJcG9v70hQ0grNTsw.class.equals(obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        obj.getClass();
        r8lambda92cmOJndUFWJcG9v70hQ0grNTsw r8lambda92cmojndufwjcg9v70hq0grntsw = (r8lambda92cmOJndUFWJcG9v70hQ0grNTsw) obj;
        return this.MediaSessionCompatQueueItem == r8lambda92cmojndufwjcg9v70hq0grntsw.MediaSessionCompatQueueItem && this.MediaMetadataCompat == r8lambda92cmojndufwjcg9v70hq0grntsw.MediaMetadataCompat;
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE
    public final int hashCode() {
        int iHashCode = super.hashCode();
        return Boolean.hashCode(this.MediaMetadataCompat) + (((iHashCode * 31) + this.MediaSessionCompatQueueItem) * 31);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda92cmOJndUFWJcG9v70hQ0grNTsw(long j, String str, long j2, long j3, int i, boolean z, long j4, long j5) {
        super(j, str, j2, j3, j4, j5);
        str.getClass();
        this.MediaSessionCompatQueueItem = i;
        this.MediaMetadataCompat = z;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String IconCompatParcelizer() {
        return "PhoneUsageEvaluationEntry";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda92cmOJndUFWJcG9v70hQ0grNTsw(String str, long j, long j2, int i, boolean z, long j3, long j4) {
        super(str, j, j2, j3, j4);
        str.getClass();
        this.MediaSessionCompatQueueItem = i;
        this.MediaMetadataCompat = z;
    }
}
