package o;

import android.content.ContentValues;
import com.sentiance.sdk.eventtimeline.timelines.creators.ScreenState;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug extends r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE {
    private final int MediaBrowserCompatMediaItem;

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final r8lambdaRF7yHcZZTbILW1GecuYcCn6jNYs<r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug> write() {
        return r8lambdarXm3srEgcKmzPN35zK_oZPt51M.read();
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String IconCompatParcelizer() {
        return "Screen";
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE, o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final ContentValues RemoteActionCompatParcelizer() {
        ContentValues contentValues = new ContentValues(super.RemoteActionCompatParcelizer());
        contentValues.put("state", Integer.valueOf(this.MediaBrowserCompatMediaItem));
        return contentValues;
    }

    public final ScreenState serializer() {
        return ScreenState.findByValue(this.MediaBrowserCompatMediaItem);
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug) && super.equals(obj) && this.MediaBrowserCompatMediaItem == ((r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug) obj).MediaBrowserCompatMediaItem;
    }

    @Override // o.r8lambda5Ta641Qk4EjFIDAa2Z9nUUDE5E0
    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenEntry{state=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", uniqueId='");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("', eventTime=");
        sb.append(this.write);
        sb.append(", timeHorizon=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", id=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.read, '}');
    }

    @Override // o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.MediaBrowserCompatMediaItem));
    }

    public r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug(long j, String str, int i, long j2, long j3, long j4, long j5) {
        super(j, str, j2, j3, j4, j5);
        this.MediaBrowserCompatMediaItem = i;
    }

    public r8lambdaGFX2d0S8xnD6NnQUZmUE4F_pLug(String str, ScreenState screenState, long j, long j2, long j3, long j4) {
        super(str, j, j2, j3, j4);
        this.MediaBrowserCompatMediaItem = screenState.value;
    }
}
