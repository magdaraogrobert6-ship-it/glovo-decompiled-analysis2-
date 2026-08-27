package com.ui.common.widget.chooseoption.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.access700;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class SelectionOptionViewEntity implements Parcelable {
    public static final Parcelable.Creator<SelectionOptionViewEntity> CREATOR = new access700(16);
    private final String description;
    private final String id;
    private final boolean isSelected;
    private final String name;

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final boolean component4() {
        return this.isSelected;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.name);
        String str = this.description;
        return Boolean.hashCode(this.isSelected) + ((iM + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.description;
        boolean z = this.isSelected;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("SelectionOptionViewEntity(id=", str, ", name=", str2, ", description=");
        sbM.append(str3);
        sbM.append(", isSelected=");
        sbM.append(z);
        sbM.append(")");
        return sbM.toString();
    }

    public SelectionOptionViewEntity(String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.isSelected = z;
    }

    public final SelectionOptionViewEntity copy(String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        return new SelectionOptionViewEntity(str, str2, str3, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    public static /* synthetic */ SelectionOptionViewEntity copy$default(SelectionOptionViewEntity selectionOptionViewEntity, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectionOptionViewEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = selectionOptionViewEntity.name;
        }
        if ((i & 4) != 0) {
            str3 = selectionOptionViewEntity.description;
        }
        if ((i & 8) != 0) {
            z = selectionOptionViewEntity.isSelected;
        }
        return selectionOptionViewEntity.copy(str, str2, str3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionOptionViewEntity)) {
            return false;
        }
        SelectionOptionViewEntity selectionOptionViewEntity = (SelectionOptionViewEntity) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, selectionOptionViewEntity.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, selectionOptionViewEntity.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, selectionOptionViewEntity.description}, getCieXyz.write())).booleanValue() && this.isSelected == selectionOptionViewEntity.isSelected;
    }

    public /* synthetic */ SelectionOptionViewEntity(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z);
    }
}
