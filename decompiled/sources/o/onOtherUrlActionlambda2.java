package o;

import java.util.List;
import java.util.Set;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes4.dex */
public final class onOtherUrlActionlambda2 implements r8lambda92M0P9sIT5Uf70mvjF4RwMruDA, InAppMessageJavascriptInterfacerequestPushPermission11 {
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA IconCompatParcelizer;
    public final Set read;
    public final String write;

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean MediaBrowserCompatMediaItem() {
        return true;
    }

    @Override // o.InAppMessageJavascriptInterfacerequestPushPermission11
    public final Set MediaSessionCompatQueueItem() {
        return this.read;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final String serializer() {
        return this.write;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final String IconCompatParcelizer(int i) {
        return this.IconCompatParcelizer.IconCompatParcelizer(i);
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final RegexKt RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA RemoteActionCompatParcelizer(int i) {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(i);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() * 31;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final List read() {
        return this.IconCompatParcelizer.read();
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final List serializer(int i) {
        return this.IconCompatParcelizer.serializer(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer);
        sb.append('?');
        return sb.toString();
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean write() {
        return this.IconCompatParcelizer.write();
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean write(int i) {
        return this.IconCompatParcelizer.write(i);
    }

    public onOtherUrlActionlambda2(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        this.IconCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda;
        this.write = r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer() + '?';
        this.read = r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final int read(String str) {
        str.getClass();
        return this.IconCompatParcelizer.read(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onOtherUrlActionlambda2)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, ((onOtherUrlActionlambda2) obj).IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }
}
