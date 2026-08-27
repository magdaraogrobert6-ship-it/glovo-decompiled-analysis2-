package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambda6Ot85zzE2WPJQCHehJD39ddUvoc implements r8lambda92M0P9sIT5Uf70mvjF4RwMruDA {
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA IconCompatParcelizer;
    public final String read;
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA write;

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final int IconCompatParcelizer() {
        return 2;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean MediaBrowserCompatMediaItem() {
        return false;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final RegexKt RemoteActionCompatParcelizer() {
        return r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.serializer;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final List read() {
        return instance_delegatelambda0.write;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final String serializer() {
        return this.read;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean write() {
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        return this.IconCompatParcelizer.hashCode() + ((this.write.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final List serializer(int i) {
        if (i >= 0) {
            return instance_delegatelambda0.write;
        }
        DrawableTransformation.serializer((Object) ff$$ExternalSyntheticOutline0.m(ff$$ExternalSyntheticOutline0.m(i, "Illegal index ", ", "), this.read, " expects only non-negative indices"));
        return null;
    }

    public final String toString() {
        return this.read + '(' + this.write + ", " + this.IconCompatParcelizer + ')';
    }

    public r8lambda6Ot85zzE2WPJQCHehJD39ddUvoc(String str, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2) {
        this.read = str;
        this.write = r8lambda92m0p9sit5uf70mvjf4rwmruda;
        this.IconCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda2;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA RemoteActionCompatParcelizer(int i) {
        if (i >= 0) {
            int i2 = i % 2;
            if (i2 == 0) {
                return this.write;
            }
            if (i2 == 1) {
                return this.IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Unreached");
            return null;
        }
        DrawableTransformation.serializer((Object) ff$$ExternalSyntheticOutline0.m(ff$$ExternalSyntheticOutline0.m(i, "Illegal index ", ", "), this.read, " expects only non-negative indices"));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambda6Ot85zzE2WPJQCHehJD39ddUvoc)) {
            return false;
        }
        r8lambda6Ot85zzE2WPJQCHehJD39ddUvoc r8lambda6ot85zze2wpjqchehjd39dduvoc = (r8lambda6Ot85zzE2WPJQCHehJD39ddUvoc) obj;
        return this.read.equals(r8lambda6ot85zze2wpjqchehjd39dduvoc.read) && this.write.equals(r8lambda6ot85zze2wpjqchehjd39dduvoc.write) && this.IconCompatParcelizer.equals(r8lambda6ot85zze2wpjqchehjd39dduvoc.IconCompatParcelizer);
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final String IconCompatParcelizer(int i) {
        return String.valueOf(i);
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final int read(String str) {
        str.getClass();
        Integer numMediaSessionCompatQueueItem = setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str);
        if (numMediaSessionCompatQueueItem != null) {
            return numMediaSessionCompatQueueItem.intValue();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean write(int i) {
        if (i >= 0) {
            return false;
        }
        DrawableTransformation.serializer((Object) ff$$ExternalSyntheticOutline0.m(ff$$ExternalSyntheticOutline0.m(i, "Illegal index ", ", "), this.read, " expects only non-negative indices"));
        return false;
    }
}
