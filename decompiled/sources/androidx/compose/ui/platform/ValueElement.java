package androidx.compose.ui.platform;

import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class ValueElement {
    public static final int $stable = 8;
    private final String name;
    private final Object value;

    public final String component1() {
        return this.name;
    }

    public final Object component2() {
        return this.value;
    }

    public final String getName() {
        return this.name;
    }

    public final Object getValue() {
        return this.value;
    }

    public final ValueElement copy(String str, Object obj) {
        return new ValueElement(str, obj);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode();
        Object obj = this.value;
        return (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public ValueElement(String str, Object obj) {
        this.name = str;
        this.value = obj;
    }

    public static /* synthetic */ ValueElement copy$default(ValueElement valueElement, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = valueElement.name;
        }
        if ((i & 2) != 0) {
            obj = valueElement.value;
        }
        return valueElement.copy(str, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValueElement)) {
            return false;
        }
        ValueElement valueElement = (ValueElement) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, valueElement.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, valueElement.value}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ValueElement(name=");
        sb.append(this.name);
        sb.append(", value=");
        return IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.value, ')');
    }
}
