package androidx.compose.ui.input.pointer;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPointerIconType implements PointerIcon {
    public static final int $stable = 0;
    private final int type;

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type;
    }

    public AndroidPointerIconType(int i) {
        this.type = i;
    }

    public String toString() {
        return af$$ExternalSyntheticOutline0.m(new StringBuilder("AndroidPointerIcon(type="), this.type, ')');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AndroidPointerIconType.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.type == ((AndroidPointerIconType) obj).type;
    }
}
