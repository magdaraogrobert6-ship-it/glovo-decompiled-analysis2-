package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class onButtonClicked implements r8lambda92M0P9sIT5Uf70mvjF4RwMruDA {
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA read;

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final int IconCompatParcelizer() {
        return 1;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean MediaBrowserCompatMediaItem() {
        return false;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final RegexKt RemoteActionCompatParcelizer() {
        return r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.RemoteActionCompatParcelizer;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final List read() {
        return instance_delegatelambda0.write;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean write() {
        return false;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA RemoteActionCompatParcelizer(int i) {
        if (i >= 0) {
            return this.read;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read(ff$$ExternalSyntheticOutline0.m(i, "Illegal index ", ", "), serializer(), " expects only non-negative indices");
        return null;
    }

    public final int hashCode() {
        return serializer().hashCode() + (this.read.hashCode() * 31);
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final List serializer(int i) {
        if (i >= 0) {
            return instance_delegatelambda0.write;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read(ff$$ExternalSyntheticOutline0.m(i, "Illegal index ", ", "), serializer(), " expects only non-negative indices");
        return null;
    }

    public final String toString() {
        return serializer() + '(' + this.read + ')';
    }

    public onButtonClicked(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        this.read = r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onButtonClicked)) {
            return false;
        }
        onButtonClicked onbuttonclicked = (onButtonClicked) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, onbuttonclicked.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{serializer(), onbuttonclicked.serializer()}, getCieXyz.write())).booleanValue();
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
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean write(int i) {
        if (i >= 0) {
            return false;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read(ff$$ExternalSyntheticOutline0.m(i, "Illegal index ", ", "), serializer(), " expects only non-negative indices");
        return false;
    }
}
