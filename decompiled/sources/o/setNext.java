package o;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class setNext {
    public final ColorStateList RemoteActionCompatParcelizer;
    public final int read;
    public final Configuration write;

    public setNext(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.RemoteActionCompatParcelizer = colorStateList;
        this.write = configuration;
        this.read = theme == null ? 0 : theme.hashCode();
    }
}
