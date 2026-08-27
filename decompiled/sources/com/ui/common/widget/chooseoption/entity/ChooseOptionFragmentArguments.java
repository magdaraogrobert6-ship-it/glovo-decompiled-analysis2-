package com.ui.common.widget.chooseoption.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.SimpleItemTouchHelperCallback;
import o.access700;
import o.getCieXyz;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class ChooseOptionFragmentArguments implements Parcelable {
    public static final Parcelable.Creator<ChooseOptionFragmentArguments> CREATOR = new access700(15);
    private final Map<String, String> extras;
    private final List<SelectionOptionViewEntity> options;
    private final SelectionMode selectionMode;
    private final String title;

    public final String component1() {
        return this.title;
    }

    public final List<SelectionOptionViewEntity> component2() {
        return this.options;
    }

    public final SelectionMode component3() {
        return this.selectionMode;
    }

    public final Map<String, String> component4() {
        return this.extras;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final List<SelectionOptionViewEntity> getOptions() {
        return this.options;
    }

    public final SelectionMode getSelectionMode() {
        return this.selectionMode;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM = c8$$ExternalSyntheticOutline0.m(this.options, this.title.hashCode() * 31, 31);
        return this.extras.hashCode() + ((this.selectionMode.hashCode() + iM) * 31);
    }

    public String toString() {
        String str = this.title;
        List<SelectionOptionViewEntity> list = this.options;
        SelectionMode selectionMode = this.selectionMode;
        Map<String, String> map = this.extras;
        StringBuilder sbSerializer = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("ChooseOptionFragmentArguments(title=", str, ", options=", list, ", selectionMode=");
        sbSerializer.append(selectionMode);
        sbSerializer.append(", extras=");
        sbSerializer.append(map);
        sbSerializer.append(")");
        return sbSerializer.toString();
    }

    public ChooseOptionFragmentArguments(String str, List<SelectionOptionViewEntity> list, SelectionMode selectionMode, Map<String, String> map) {
        str.getClass();
        list.getClass();
        selectionMode.getClass();
        map.getClass();
        this.title = str;
        this.options = list;
        this.selectionMode = selectionMode;
        this.extras = map;
    }

    public final ChooseOptionFragmentArguments copy(String str, List<SelectionOptionViewEntity> list, SelectionMode selectionMode, Map<String, String> map) {
        str.getClass();
        list.getClass();
        selectionMode.getClass();
        map.getClass();
        return new ChooseOptionFragmentArguments(str, list, selectionMode, map);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        List<SelectionOptionViewEntity> list = this.options;
        parcel.writeInt(list.size());
        Iterator<SelectionOptionViewEntity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.selectionMode.name());
        Map<String, String> map = this.extras;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChooseOptionFragmentArguments copy$default(ChooseOptionFragmentArguments chooseOptionFragmentArguments, String str, List list, SelectionMode selectionMode, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chooseOptionFragmentArguments.title;
        }
        if ((i & 2) != 0) {
            list = chooseOptionFragmentArguments.options;
        }
        if ((i & 4) != 0) {
            selectionMode = chooseOptionFragmentArguments.selectionMode;
        }
        if ((i & 8) != 0) {
            map = chooseOptionFragmentArguments.extras;
        }
        return chooseOptionFragmentArguments.copy(str, list, selectionMode, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChooseOptionFragmentArguments)) {
            return false;
        }
        ChooseOptionFragmentArguments chooseOptionFragmentArguments = (ChooseOptionFragmentArguments) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, chooseOptionFragmentArguments.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.options, chooseOptionFragmentArguments.options}, getCieXyz.write())).booleanValue() || this.selectionMode != chooseOptionFragmentArguments.selectionMode) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.extras, chooseOptionFragmentArguments.extras}, getCieXyz.write())).booleanValue();
    }

    public /* synthetic */ ChooseOptionFragmentArguments(String str, List list, SelectionMode selectionMode, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, selectionMode, (i & 8) != 0 ? SimpleItemTouchHelperCallback.serializer : map);
    }
}
