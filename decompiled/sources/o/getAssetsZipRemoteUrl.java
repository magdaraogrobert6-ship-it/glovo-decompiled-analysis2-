package o;

import android.content.ContentValues;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public class getAssetsZipRemoteUrl extends r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0 {
    private final String IconCompatParcelizer;
    private final String read;
    private final long write;

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String IconCompatParcelizer() {
        throw null;
    }

    public final String MediaDescriptionCompat() {
        return this.IconCompatParcelizer;
    }

    public final String read() {
        return this.read;
    }

    public final long serializer() {
        return this.write;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<getAssetsZipRemoteUrl> write() {
        return handleLogClicklambda1.read();
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final ContentValues RemoteActionCompatParcelizer() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tag_key", this.read);
        contentValues.put("tag_value", this.IconCompatParcelizer);
        return contentValues;
    }

    public final int hashCode() {
        long j = this.write;
        return this.IconCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(((int) (j ^ (j >>> 32))) * 31, 31, this.read);
    }

    public getAssetsZipRemoteUrl(long j, String str, String str2) {
        this.write = j;
        this.read = str;
        this.IconCompatParcelizer = str2;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String toString() {
        StringBuilder sb = new StringBuilder("TagEntry{id=");
        sb.append(this.write);
        sb.append(", key='");
        sb.append(this.read);
        sb.append("', value='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, "'}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getAssetsZipRemoteUrl getassetszipremoteurl = (getAssetsZipRemoteUrl) obj;
        if (this.write == getassetszipremoteurl.write && this.read.equals(getassetszipremoteurl.read)) {
            return this.IconCompatParcelizer.equals(getassetszipremoteurl.IconCompatParcelizer);
        }
        return false;
    }

    public getAssetsZipRemoteUrl(String str, String str2) {
        this.read = str;
        this.IconCompatParcelizer = str2;
    }
}
