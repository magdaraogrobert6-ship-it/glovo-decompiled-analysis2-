package androidx.compose.ui.tooling.data;

import bo.app.d$$ExternalSyntheticOutline0;
import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
@UiToolingDataApi
public final class ParameterInformation {
    public static final int $stable = 8;
    private final boolean compared;
    private final boolean fromDefault;
    private final String inlineClass;
    private final String name;
    private final boolean stable;

    /* JADX INFO: renamed from: static, reason: not valid java name */
    private final boolean f2static;
    private final Object value;

    public final String component1() {
        return this.name;
    }

    public final Object component2() {
        return this.value;
    }

    public final boolean component3() {
        return this.fromDefault;
    }

    public final boolean component4() {
        return this.f2static;
    }

    public final boolean component5() {
        return this.compared;
    }

    public final String component6() {
        return this.inlineClass;
    }

    public final boolean component7() {
        return this.stable;
    }

    public final boolean getCompared() {
        return this.compared;
    }

    public final boolean getFromDefault() {
        return this.fromDefault;
    }

    public final String getInlineClass() {
        return this.inlineClass;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getStable() {
        return this.stable;
    }

    public final boolean getStatic() {
        return this.f2static;
    }

    public final Object getValue() {
        return this.value;
    }

    public final ParameterInformation copy(String str, Object obj, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        return new ParameterInformation(str, obj, z, z2, z3, str2, z4);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode();
        Object obj = this.value;
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(((iHashCode * 31) + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.fromDefault), 31, this.f2static), 31, this.compared);
        String str = this.inlineClass;
        return Boolean.hashCode(this.stable) + ((iM + (str != null ? str.hashCode() : 0)) * 31);
    }

    public ParameterInformation(String str, Object obj, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        this.name = str;
        this.value = obj;
        this.fromDefault = z;
        this.f2static = z2;
        this.compared = z3;
        this.inlineClass = str2;
        this.stable = z4;
    }

    public static /* synthetic */ ParameterInformation copy$default(ParameterInformation parameterInformation, String str, Object obj, boolean z, boolean z2, boolean z3, String str2, boolean z4, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = parameterInformation.name;
        }
        if ((i & 2) != 0) {
            obj = parameterInformation.value;
        }
        Object obj3 = obj;
        if ((i & 4) != 0) {
            z = parameterInformation.fromDefault;
        }
        boolean z5 = z;
        if ((i & 8) != 0) {
            z2 = parameterInformation.f2static;
        }
        boolean z6 = z2;
        if ((i & 16) != 0) {
            z3 = parameterInformation.compared;
        }
        boolean z7 = z3;
        if ((i & 32) != 0) {
            str2 = parameterInformation.inlineClass;
        }
        String str3 = str2;
        if ((i & 64) != 0) {
            z4 = parameterInformation.stable;
        }
        return parameterInformation.copy(str, obj3, z5, z6, z7, str3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParameterInformation)) {
            return false;
        }
        ParameterInformation parameterInformation = (ParameterInformation) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, parameterInformation.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, parameterInformation.value}, getCieXyz.write())).booleanValue() || this.fromDefault != parameterInformation.fromDefault || this.f2static != parameterInformation.f2static || this.compared != parameterInformation.compared) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.inlineClass, parameterInformation.inlineClass}, getCieXyz.write())).booleanValue() && this.stable == parameterInformation.stable;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ParameterInformation(name=");
        sb.append(this.name);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", fromDefault=");
        sb.append(this.fromDefault);
        sb.append(", static=");
        sb.append(this.f2static);
        sb.append(", compared=");
        sb.append(this.compared);
        sb.append(", inlineClass=");
        sb.append(this.inlineClass);
        sb.append(", stable=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.stable, ')');
    }
}
