package o;

import com.google.firebase.firestore.model.Values$Enterprise;
import com.google.firestore.v1.Value;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getGlobalPositionAwareOLwlOKwannotations implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ List read;
    public final /* synthetic */ int serializer;

    public getGlobalPositionAwareOLwlOKwannotations(List list) {
        this.serializer = 1;
        getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
        this.read = list;
    }

    public /* synthetic */ getGlobalPositionAwareOLwlOKwannotations(List list, int i) {
        this.serializer = i;
        this.read = list;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int iIntValue;
        int i;
        int iIntValue2;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 19;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.serializer;
        List list = this.read;
        switch (i4) {
            case 0:
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource1.getClass();
                List list2 = list;
                ArrayList<getBringIntoViewOLwlOKw> arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                Iterator it = list2.iterator();
                int i5 = RemoteActionCompatParcelizer + 11;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                while (it.hasNext()) {
                    int i7 = IconCompatParcelizer + 13;
                    RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    arrayList.add((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it.next()).invoke(nodeCoordinatorCompanionPointerInputSource1));
                }
                try {
                    if (arrayList.size() < 2) {
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    Value value = null;
                    for (getBringIntoViewOLwlOKw getbringintoviewolwlokw : arrayList) {
                        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                            int i9 = IconCompatParcelizer + 41;
                            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                        Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
                        int i11 = valueTypeCase == null ? -1 : getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase.ordinal()];
                        if (i11 != -1 && i11 != 1) {
                            valueIconCompatParcelizer.getClass();
                            if (value == null || ((iIntValue = ((Number) Values$Enterprise.IconCompatParcelizer.invoke(value, valueIconCompatParcelizer)).intValue()) != 0 && iIntValue <= 0)) {
                                value = valueIconCompatParcelizer;
                            }
                        }
                    }
                    if (value == null) {
                        return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                    }
                    getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                    return new getDrawOLwlOKwannotations(value);
                } catch (Exception unused) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
            case 1:
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource2 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource2.getClass();
                List list3 = list;
                ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    int i12 = IconCompatParcelizer + 97;
                    RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    arrayList2.add((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it2.next()).invoke(nodeCoordinatorCompanionPointerInputSource2));
                }
                try {
                    ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    int i14 = IconCompatParcelizer + 71;
                    RemoteActionCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    while (it3.hasNext()) {
                        Value valueIconCompatParcelizer2 = ((getBringIntoViewOLwlOKw) it3.next()).IconCompatParcelizer();
                        if (valueIconCompatParcelizer2 == null) {
                            int i16 = IconCompatParcelizer + 11;
                            RemoteActionCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        arrayList3.add(valueIconCompatParcelizer2);
                    }
                    getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                    return new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.write(arrayList3));
                } catch (Exception unused2) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
            case 2:
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource3 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource3.getClass();
                List list4 = list;
                ArrayList<getBringIntoViewOLwlOKw> arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
                Iterator it4 = list4.iterator();
                while (!(!it4.hasNext())) {
                    arrayList4.add((getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it4.next()).invoke(nodeCoordinatorCompanionPointerInputSource3));
                }
                try {
                    if (arrayList4.size() < 2) {
                        int i18 = RemoteActionCompatParcelizer + 31;
                        IconCompatParcelizer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                        return getBringIntoViewOLwlOKwannotations.serializer;
                    }
                    Value value2 = null;
                    for (getBringIntoViewOLwlOKw getbringintoviewolwlokw2 : arrayList4) {
                        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
                            return getBringIntoViewOLwlOKwannotations.serializer;
                        }
                        Value valueIconCompatParcelizer3 = getbringintoviewolwlokw2.IconCompatParcelizer();
                        Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer3 != null ? valueIconCompatParcelizer3.getValueTypeCase() : null;
                        if (valueTypeCase2 == null) {
                            int i20 = RemoteActionCompatParcelizer + 109;
                            IconCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i20 % 2 != 0) {
                                obj2.hashCode();
                                throw null;
                            }
                            i = -1;
                        } else {
                            i = getFocusPropertiesOLwlOKwannotations.serializer[valueTypeCase2.ordinal()];
                        }
                        if (i != -1 && i != 1) {
                            int i21 = RemoteActionCompatParcelizer + 25;
                            IconCompatParcelizer = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i22 = i21 % 2;
                            valueIconCompatParcelizer3.getClass();
                            if (value2 == null || ((iIntValue2 = ((Number) Values$Enterprise.IconCompatParcelizer.invoke(value2, valueIconCompatParcelizer3)).intValue()) != 0 && iIntValue2 > 0)) {
                                value2 = valueIconCompatParcelizer3;
                            }
                        }
                    }
                    if (value2 == null) {
                        return getBringIntoViewOLwlOKw.IconCompatParcelizer;
                    }
                    getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                    return new getDrawOLwlOKwannotations(value2);
                } catch (Exception unused3) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
            case 3:
                list.get(((Number) obj).intValue());
                return null;
            case 4:
                list.get(((Number) obj).intValue());
                return null;
            case 5:
                list.get(((Number) obj).intValue());
                return null;
            case 6:
                list.get(((Number) obj).intValue());
                return null;
            default:
                list.get(((Number) obj).intValue());
                return null;
        }
    }
}
