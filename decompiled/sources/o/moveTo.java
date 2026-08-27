package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class moveTo {
    public final toAndroidPathDashPathEffectStyleoQv6xUo IconCompatParcelizer;
    public final String write;
    public final LinkedHashMap read = new LinkedHashMap();
    public final ArrayList serializer = new ArrayList();
    public final LinkedHashMap RemoteActionCompatParcelizer = new LinkedHashMap();

    public opN5in7k0 RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.write();
    }

    public moveTo(toAndroidPathDashPathEffectStyleoQv6xUo toandroidpathdashpatheffectstyleoqv6xuo, String str) {
        this.IconCompatParcelizer = toandroidpathdashpatheffectstyleoqv6xuo;
        this.write = str;
    }

    public opN5in7k0 IconCompatParcelizer() {
        opN5in7k0 opn5in7k0RemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        opn5in7k0RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem = null;
        for (Map.Entry entry : this.read.entrySet()) {
            String str = (String) entry.getKey();
            addArcRad addarcrad = (addArcRad) entry.getValue();
            str.getClass();
            addarcrad.getClass();
            r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg = opn5in7k0RemoteActionCompatParcelizer.serializer;
            r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.getClass();
            ((LinkedHashMap) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.IconCompatParcelizer).put(str, addarcrad);
        }
        Iterator it = this.serializer.iterator();
        while (it.hasNext()) {
            opn5in7k0RemoteActionCompatParcelizer.write((getFillTypeRgk1Os) it.next());
        }
        for (Map.Entry entry2 : this.RemoteActionCompatParcelizer.entrySet()) {
            opn5in7k0RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(((Number) entry2.getKey()).intValue(), (addOval) entry2.getValue());
        }
        String str2 = this.write;
        if (str2 != null) {
            opn5in7k0RemoteActionCompatParcelizer.serializer(str2);
        }
        return opn5in7k0RemoteActionCompatParcelizer;
    }
}
