package o;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambda38Av5n_CfcSM1Kv1dAEkWLBk5wA {
    private final long IconCompatParcelizer;
    private long read;
    private long write;

    public final void IconCompatParcelizer(long j, long j2) {
        this.read = j;
        this.write = j2;
    }

    public final ContentValues read() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("venue_id", Long.valueOf(this.read));
        contentValues.put("tag_id", Long.valueOf(this.write));
        return contentValues;
    }

    public r8lambda38Av5n_CfcSM1Kv1dAEkWLBk5wA(long j, long j2, long j3) {
        this.IconCompatParcelizer = j;
        this.read = j2;
        this.write = j3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VenueTagEntry{id=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", venueId=");
        sb.append(this.read);
        sb.append(", tagId=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.write, '}');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            r8lambda38Av5n_CfcSM1Kv1dAEkWLBk5wA r8lambda38av5n_cfcsm1kv1daekwlbk5wa = (r8lambda38Av5n_CfcSM1Kv1dAEkWLBk5wA) obj;
            if (this.IconCompatParcelizer == r8lambda38av5n_cfcsm1kv1daekwlbk5wa.IconCompatParcelizer && this.read == r8lambda38av5n_cfcsm1kv1daekwlbk5wa.read && this.write == r8lambda38av5n_cfcsm1kv1daekwlbk5wa.write) {
                return true;
            }
        }
        return false;
    }

    public r8lambda38Av5n_CfcSM1Kv1dAEkWLBk5wA(long j, long j2) {
        this.read = j;
        this.write = j2;
    }

    public final int hashCode() {
        long j = this.IconCompatParcelizer;
        long j2 = this.read;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.write;
        return (((((int) (j ^ (j >>> 32))) * 31) + i) * 31) + ((int) ((j3 >>> 32) ^ j3));
    }
}
