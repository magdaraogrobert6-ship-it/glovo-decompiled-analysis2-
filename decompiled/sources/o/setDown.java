package o;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class setDown {
    public final Resources IconCompatParcelizer;
    public final Resources.Theme serializer;

    public final int hashCode() {
        return Objects.hash(this.IconCompatParcelizer, this.serializer);
    }

    public setDown(Resources resources, Resources.Theme theme) {
        this.IconCompatParcelizer = resources;
        this.serializer = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || setDown.class != obj.getClass()) {
            return false;
        }
        setDown setdown = (setDown) obj;
        return this.IconCompatParcelizer.equals(setdown.IconCompatParcelizer) && Objects.equals(this.serializer, setdown.serializer);
    }
}
