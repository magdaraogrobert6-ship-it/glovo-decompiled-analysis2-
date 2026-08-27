package com.deliveryhero.perseus.data.local.db.entity;

import androidx.annotation.Keep;
import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class CustomField {
    private final String name;
    private final String value;

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.value;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("CustomField(name=", this.name, ", value=", this.value, ")");
    }

    public CustomField(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.name = str;
        this.value = str2;
    }

    public final CustomField copy(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new CustomField(str, str2);
    }

    public static /* synthetic */ CustomField copy$default(CustomField customField, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customField.name;
        }
        if ((i & 2) != 0) {
            str2 = customField.value;
        }
        return customField.copy(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomField)) {
            return false;
        }
        CustomField customField = (CustomField) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, customField.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, customField.value}, getCieXyz.write())).booleanValue();
    }
}
