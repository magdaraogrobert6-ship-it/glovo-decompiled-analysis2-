package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class accessorjd {
    public final LinkedHashMap serializer;

    public accessorjd(accessplusjd accessplusjdVar) {
        this.serializer = onMove.write(accessplusjdVar.read);
    }

    public accessorjd() {
        this.serializer = new LinkedHashMap();
    }
}
