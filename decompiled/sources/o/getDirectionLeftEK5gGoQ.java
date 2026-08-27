package o;

import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzbv;
import io.grpc.LoadBalancer$Helper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getDirectionLeftEK5gGoQ extends getDirectionDownRightEK5gGoQ {
    public final /* synthetic */ int read;

    public /* synthetic */ getDirectionLeftEK5gGoQ(int i) {
        this.read = i;
    }

    @Override // o.getDirectionDownRightEK5gGoQ
    public final getFunctionEK5gGoQ IconCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        boolean z;
        String strIconCompatParcelizer;
        getFunctionEK5gGoQ getfunctionek5ggoqRemoteActionCompatParcelizer;
        boolean z2;
        getFunctionEK5gGoQ getfunctionek5ggoqRemoteActionCompatParcelizer2;
        int i;
        boolean z3;
        getFunctionEK5gGoQ getfunctionek5ggoqRemoteActionCompatParcelizer3;
        int i2;
        boolean z4;
        int iMin;
        boolean z5;
        getGraveEK5gGoQ getgraveek5ggoq;
        int iMin2;
        int i3 = this.read;
        getFunctionEK5gGoQ getfunctionek5ggoq = getHelpEK5gGoQ.read;
        int i4 = -1;
        int i5 = -1;
        int iMax = 0;
        z = false;
        boolean z6 = false;
        z = false;
        boolean z7 = false;
        switch (i3) {
            case 0:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length > 0);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                getHenkanEK5gGoQ gethenkanek5ggoq = (getHenkanEK5gGoQ) getfunctionek5ggoqArr[0];
                ArrayList arrayList = new ArrayList();
                Iterator it = gethenkanek5ggoq.serializer.iterator();
                while (it.hasNext()) {
                    arrayList.add((getFunctionEK5gGoQ) it.next());
                }
                for (int i6 = 1; i6 < getfunctionek5ggoqArr.length; i6++) {
                    getFunctionEK5gGoQ getfunctionek5ggoq2 = getfunctionek5ggoqArr[i6];
                    if (getfunctionek5ggoq2 instanceof getHenkanEK5gGoQ) {
                        Iterator it2 = ((getHenkanEK5gGoQ) getfunctionek5ggoq2).serializer.iterator();
                        while (it2.hasNext()) {
                            arrayList.add((getFunctionEK5gGoQ) it2.next());
                        }
                    } else {
                        arrayList.add(getfunctionek5ggoq2);
                    }
                }
                return new getHenkanEK5gGoQ(arrayList);
            case 1:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[1] instanceof getGraveEK5gGoQ);
                getHenkanEK5gGoQ gethenkanek5ggoq2 = (getHenkanEK5gGoQ) getfunctionek5ggoqArr[0];
                getGraveEK5gGoQ getgraveek5ggoq2 = (getGraveEK5gGoQ) getfunctionek5ggoqArr[1];
                ArrayList arrayList2 = gethenkanek5ggoq2.serializer;
                int size = arrayList2.size();
                boolean zSerializer = true;
                for (int i7 = 0; zSerializer && i7 < size && i7 < gethenkanek5ggoq2.serializer.size(); i7++) {
                    if (gethenkanek5ggoq2.RemoteActionCompatParcelizer(i7)) {
                        zSerializer = LoadBalancer$Helper.serializer(getgraveek5ggoq2.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(zzbvVar, (getFunctionEK5gGoQ) arrayList2.get(i7), new getGEK5gGoQ(Double.valueOf(i7)), gethenkanek5ggoq2));
                    }
                }
                return new getGuideEK5gGoQ(Boolean.valueOf(zSerializer));
            case 2:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[1] instanceof getGraveEK5gGoQ);
                getHenkanEK5gGoQ gethenkanek5ggoq3 = (getHenkanEK5gGoQ) getfunctionek5ggoqArr[0];
                getGraveEK5gGoQ getgraveek5ggoq3 = (getGraveEK5gGoQ) getfunctionek5ggoqArr[1];
                ArrayList arrayList3 = gethenkanek5ggoq3.serializer;
                int size2 = arrayList3.size();
                ArrayList arrayList4 = new ArrayList();
                for (int i8 = 0; i8 < size2 && i8 < gethenkanek5ggoq3.serializer.size(); i8++) {
                    if (gethenkanek5ggoq3.RemoteActionCompatParcelizer(i8) && LoadBalancer$Helper.serializer(getgraveek5ggoq3.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(zzbvVar, (getFunctionEK5gGoQ) arrayList3.get(i8), new getGEK5gGoQ(Double.valueOf(i8)), gethenkanek5ggoq3))) {
                        arrayList4.add((getFunctionEK5gGoQ) arrayList3.get(i8));
                    }
                }
                return new getHenkanEK5gGoQ(arrayList4);
            case 3:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[1] instanceof getGraveEK5gGoQ);
                getHenkanEK5gGoQ gethenkanek5ggoq4 = (getHenkanEK5gGoQ) getfunctionek5ggoqArr[0];
                getGraveEK5gGoQ getgraveek5ggoq4 = (getGraveEK5gGoQ) getfunctionek5ggoqArr[1];
                ArrayList arrayList5 = gethenkanek5ggoq4.serializer;
                int size3 = arrayList5.size();
                for (int i9 = 0; i9 < size3 && i9 < gethenkanek5ggoq4.serializer.size(); i9++) {
                    if (gethenkanek5ggoq4.RemoteActionCompatParcelizer(i9)) {
                        getgraveek5ggoq4.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(zzbvVar, (getFunctionEK5gGoQ) arrayList5.get(i9), new getGEK5gGoQ(Double.valueOf(i9)), gethenkanek5ggoq4);
                    }
                }
                return getfunctionek5ggoq;
            case 4:
                int length = getfunctionek5ggoqArr.length;
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(length > 0 && length <= 3);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                getHenkanEK5gGoQ gethenkanek5ggoq5 = (getHenkanEK5gGoQ) getfunctionek5ggoqArr[0];
                getFunctionEK5gGoQ getfunctionek5ggoq3 = length < 2 ? getfunctionek5ggoq : getfunctionek5ggoqArr[1];
                getFunctionEK5gGoQ getfunctionek5ggoq4 = length < 3 ? getfunctionek5ggoq : getfunctionek5ggoqArr[2];
                ArrayList arrayList6 = gethenkanek5ggoq5.serializer;
                int size4 = arrayList6.size();
                if (getfunctionek5ggoq4 != getfunctionek5ggoq) {
                    int i10 = (int) LoadBalancer$Helper.read(getfunctionek5ggoq4);
                    iMax = i10 < 0 ? Math.max(size4 - Math.abs(i10), 0) : i10;
                }
                while (iMax < size4) {
                    if (gethenkanek5ggoq5.RemoteActionCompatParcelizer(iMax) && LoadBalancer$Helper.write(getfunctionek5ggoq3, (getFunctionEK5gGoQ) arrayList6.get(iMax))) {
                        i4 = iMax;
                        return new getGEK5gGoQ(Double.valueOf(i4));
                    }
                    iMax++;
                }
                return new getGEK5gGoQ(Double.valueOf(i4));
            case 5:
                int length2 = getfunctionek5ggoqArr.length;
                if (length2 == 1) {
                    z = true;
                } else if (length2 == 2) {
                    length2 = 2;
                    z = true;
                } else {
                    z = false;
                }
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(z);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                ArrayList<getFunctionEK5gGoQ> arrayList7 = ((getHenkanEK5gGoQ) getfunctionek5ggoqArr[0]).serializer;
                getFunctionEK5gGoQ getfunctionek5ggoq5 = length2 < 2 ? getfunctionek5ggoq : getfunctionek5ggoqArr[1];
                if (getfunctionek5ggoq5 == getfunctionek5ggoq) {
                    strIconCompatParcelizer = ",";
                } else {
                    strIconCompatParcelizer = LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq5);
                }
                ArrayList arrayList8 = new ArrayList();
                for (getFunctionEK5gGoQ getfunctionek5ggoq6 : arrayList7) {
                    if (getfunctionek5ggoq6 != getHelpEK5gGoQ.serializer && getfunctionek5ggoq6 != getfunctionek5ggoq) {
                        arrayList8.add(LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoq6));
                    } else {
                        arrayList8.add("");
                    }
                }
                return new getInfoEK5gGoQ(TextUtils.join(strIconCompatParcelizer, arrayList8));
            case 6:
                int length3 = getfunctionek5ggoqArr.length;
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(length3 > 0 && length3 <= 3);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                getHenkanEK5gGoQ gethenkanek5ggoq6 = (getHenkanEK5gGoQ) getfunctionek5ggoqArr[0];
                if (length3 >= 2) {
                    getfunctionek5ggoq = getfunctionek5ggoqArr[1];
                }
                ArrayList arrayList9 = gethenkanek5ggoq6.serializer;
                int size5 = arrayList9.size();
                int iMin3 = size5 - 1;
                if (length3 == 3) {
                    int i11 = (int) LoadBalancer$Helper.read(getfunctionek5ggoqArr[2]);
                    if (i11 < 0) {
                        iMin3 = size5 - Math.abs(i11);
                    } else {
                        iMin3 = Math.min(i11, iMin3);
                    }
                }
                while (iMin3 >= 0) {
                    if (gethenkanek5ggoq6.RemoteActionCompatParcelizer(iMin3) && LoadBalancer$Helper.write(getfunctionek5ggoq, (getFunctionEK5gGoQ) arrayList9.get(iMin3))) {
                        i5 = iMin3;
                        return new getGEK5gGoQ(Double.valueOf(i5));
                    }
                    iMin3--;
                }
                return new getGEK5gGoQ(Double.valueOf(i5));
            case 7:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[1] instanceof getGraveEK5gGoQ);
                getHenkanEK5gGoQ gethenkanek5ggoq7 = (getHenkanEK5gGoQ) getfunctionek5ggoqArr[0];
                getGraveEK5gGoQ getgraveek5ggoq5 = (getGraveEK5gGoQ) getfunctionek5ggoqArr[1];
                ArrayList arrayList10 = gethenkanek5ggoq7.serializer;
                int size6 = arrayList10.size();
                ArrayList arrayList11 = new ArrayList();
                for (int i12 = 0; i12 < size6 && i12 < gethenkanek5ggoq7.serializer.size(); i12++) {
                    if (gethenkanek5ggoq7.RemoteActionCompatParcelizer(i12)) {
                        getfunctionek5ggoqRemoteActionCompatParcelizer = getgraveek5ggoq5.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(zzbvVar, (getFunctionEK5gGoQ) arrayList10.get(i12), new getGEK5gGoQ(Double.valueOf(i12)), gethenkanek5ggoq7);
                        accessgetSystemNavigationDowncp.IconCompatParcelizer(!androidx.room.Room.RemoteActionCompatParcelizer(getfunctionek5ggoqRemoteActionCompatParcelizer));
                    } else {
                        getfunctionek5ggoqRemoteActionCompatParcelizer = null;
                    }
                    arrayList11.add(getfunctionek5ggoqRemoteActionCompatParcelizer);
                }
                return new getHenkanEK5gGoQ(arrayList11);
            case 8:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 1);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                ArrayList arrayList12 = ((getHenkanEK5gGoQ) getfunctionek5ggoqArr[0]).serializer;
                return !arrayList12.isEmpty() ? (getFunctionEK5gGoQ) arrayList12.remove(arrayList12.size() - 1) : getfunctionek5ggoq;
            case 9:
                int length4 = getfunctionek5ggoqArr.length;
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(length4 > 0);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                getHenkanEK5gGoQ gethenkanek5ggoq8 = (getHenkanEK5gGoQ) getfunctionek5ggoqArr[0];
                int size7 = gethenkanek5ggoq8.serializer.size();
                gethenkanek5ggoq8.IconCompatParcelizer((length4 + size7) - 1);
                for (int i13 = 1; i13 < getfunctionek5ggoqArr.length; i13++) {
                    getFunctionEK5gGoQ getfunctionek5ggoq7 = getfunctionek5ggoqArr[i13];
                    if (size7 >= 0) {
                        ArrayList arrayList13 = gethenkanek5ggoq8.serializer;
                        if (size7 >= arrayList13.size()) {
                            gethenkanek5ggoq8.IconCompatParcelizer(size7 + 1);
                        }
                        arrayList13.set(size7, getfunctionek5ggoq7);
                        size7++;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                }
                return new getGEK5gGoQ(Double.valueOf(size7));
            case 10:
                int length5 = getfunctionek5ggoqArr.length;
                if (length5 == 2) {
                    z2 = true;
                } else if (length5 == 3) {
                    length5 = 3;
                    z2 = true;
                } else {
                    z2 = false;
                }
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(z2);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[1] instanceof getGraveEK5gGoQ);
                getHenkanEK5gGoQ gethenkanek5ggoq9 = (getHenkanEK5gGoQ) getfunctionek5ggoqArr[0];
                getGraveEK5gGoQ getgraveek5ggoq6 = (getGraveEK5gGoQ) getfunctionek5ggoqArr[1];
                ArrayList arrayList14 = gethenkanek5ggoq9.serializer;
                int size8 = arrayList14.size();
                if (length5 == 3) {
                    getfunctionek5ggoqRemoteActionCompatParcelizer2 = getfunctionek5ggoqArr[2];
                    i = 0;
                } else {
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(size8 > 0);
                    getfunctionek5ggoqRemoteActionCompatParcelizer2 = gethenkanek5ggoq9.read(0);
                    int i14 = 0;
                    while (true) {
                        if (i14 < size8) {
                            i = i14 + 1;
                            if (gethenkanek5ggoq9.RemoteActionCompatParcelizer(i14)) {
                                getfunctionek5ggoqRemoteActionCompatParcelizer2 = gethenkanek5ggoq9.read(i14);
                            } else {
                                i14 = i;
                            }
                        } else {
                            i = 1;
                        }
                    }
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(i14 < size8);
                }
                while (i < size8 && i < gethenkanek5ggoq9.serializer.size()) {
                    if (gethenkanek5ggoq9.RemoteActionCompatParcelizer(i)) {
                        getfunctionek5ggoqRemoteActionCompatParcelizer2 = getgraveek5ggoq6.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(zzbvVar, getfunctionek5ggoqRemoteActionCompatParcelizer2, (getFunctionEK5gGoQ) arrayList14.get(i), new getGEK5gGoQ(Double.valueOf(i)), gethenkanek5ggoq9);
                    }
                    i++;
                }
                return getfunctionek5ggoqRemoteActionCompatParcelizer2;
            case 11:
                int length6 = getfunctionek5ggoqArr.length;
                if (length6 == 2) {
                    z3 = true;
                } else if (length6 == 3) {
                    length6 = 3;
                    z3 = true;
                } else {
                    z3 = false;
                }
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(z3);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[1] instanceof getGraveEK5gGoQ);
                getHenkanEK5gGoQ gethenkanek5ggoq10 = (getHenkanEK5gGoQ) getfunctionek5ggoqArr[0];
                getGraveEK5gGoQ getgraveek5ggoq7 = (getGraveEK5gGoQ) getfunctionek5ggoqArr[1];
                ArrayList arrayList15 = gethenkanek5ggoq10.serializer;
                int size9 = arrayList15.size();
                int i15 = size9 - 1;
                if (length6 == 3) {
                    getfunctionek5ggoqRemoteActionCompatParcelizer3 = getfunctionek5ggoqArr[2];
                } else {
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(size9 > 0);
                    getfunctionek5ggoqRemoteActionCompatParcelizer3 = gethenkanek5ggoq10.read(i15);
                    while (true) {
                        if (i15 >= 0) {
                            i2 = i15 - 1;
                            if (gethenkanek5ggoq10.RemoteActionCompatParcelizer(i15)) {
                                getfunctionek5ggoqRemoteActionCompatParcelizer3 = gethenkanek5ggoq10.read(i15);
                            } else {
                                i15 = i2;
                            }
                        } else {
                            i2 = size9 - 2;
                        }
                    }
                    accessgetSystemNavigationDowncp.IconCompatParcelizer(i15 >= 0);
                    i15 = i2;
                }
                while (i15 >= 0) {
                    if (gethenkanek5ggoq10.RemoteActionCompatParcelizer(i15)) {
                        getfunctionek5ggoqRemoteActionCompatParcelizer3 = getgraveek5ggoq7.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(zzbvVar, getfunctionek5ggoqRemoteActionCompatParcelizer3, (getFunctionEK5gGoQ) arrayList15.get(i15), new getGEK5gGoQ(Double.valueOf(i15)), gethenkanek5ggoq10);
                    }
                    i15--;
                }
                return getfunctionek5ggoqRemoteActionCompatParcelizer3;
            case 12:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 1);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                Collections.reverse(((getHenkanEK5gGoQ) getfunctionek5ggoqArr[0]).serializer);
                return getfunctionek5ggoqArr[0];
            case 13:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 1);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                ArrayList arrayList16 = ((getHenkanEK5gGoQ) getfunctionek5ggoqArr[0]).serializer;
                return !arrayList16.isEmpty() ? (getFunctionEK5gGoQ) arrayList16.remove(0) : getfunctionek5ggoq;
            case 14:
                int length7 = getfunctionek5ggoqArr.length;
                if (length7 == 2) {
                    z4 = true;
                } else if (length7 == 3) {
                    length7 = 3;
                    z4 = true;
                } else {
                    z4 = false;
                }
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(z4);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                getHenkanEK5gGoQ gethenkanek5ggoq11 = (getHenkanEK5gGoQ) getfunctionek5ggoqArr[0];
                int i16 = (int) LoadBalancer$Helper.read(getfunctionek5ggoqArr[1]);
                if (i16 < 0) {
                    iMin = Math.max(gethenkanek5ggoq11.serializer.size() + i16, 0);
                } else {
                    iMin = Math.min(i16, gethenkanek5ggoq11.serializer.size());
                }
                ArrayList arrayList17 = gethenkanek5ggoq11.serializer;
                int size10 = arrayList17.size();
                if (length7 == 3) {
                    int i17 = (int) LoadBalancer$Helper.read(getfunctionek5ggoqArr[2]);
                    if (i17 < 0) {
                        size10 = Math.max(arrayList17.size() + i17, 0);
                    } else {
                        size10 = Math.min(i17, arrayList17.size());
                    }
                }
                return new getHenkanEK5gGoQ(new ArrayList(arrayList17.subList(iMin, Math.max(iMin, size10))));
            case 15:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[1] instanceof getGraveEK5gGoQ);
                getHenkanEK5gGoQ gethenkanek5ggoq12 = (getHenkanEK5gGoQ) getfunctionek5ggoqArr[0];
                getGraveEK5gGoQ getgraveek5ggoq8 = (getGraveEK5gGoQ) getfunctionek5ggoqArr[1];
                ArrayList arrayList18 = gethenkanek5ggoq12.serializer;
                int size11 = arrayList18.size();
                boolean zSerializer2 = false;
                for (int i18 = 0; !zSerializer2 && i18 < size11 && i18 < gethenkanek5ggoq12.serializer.size(); i18++) {
                    if (gethenkanek5ggoq12.RemoteActionCompatParcelizer(i18)) {
                        zSerializer2 = LoadBalancer$Helper.serializer(getgraveek5ggoq8.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(zzbvVar, (getFunctionEK5gGoQ) arrayList18.get(i18), new getGEK5gGoQ(Double.valueOf(i18)), gethenkanek5ggoq12));
                    }
                }
                return new getGuideEK5gGoQ(Boolean.valueOf(zSerializer2));
            case 16:
                int length8 = getfunctionek5ggoqArr.length;
                if (length8 == 1) {
                    z5 = true;
                } else if (length8 == 2) {
                    length8 = 2;
                    z5 = true;
                } else {
                    z5 = false;
                }
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(z5);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                getHenkanEK5gGoQ gethenkanek5ggoq13 = (getHenkanEK5gGoQ) getfunctionek5ggoqArr[0];
                if (length8 == 2) {
                    accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[1] instanceof getGraveEK5gGoQ);
                    getgraveek5ggoq = (getGraveEK5gGoQ) getfunctionek5ggoqArr[1];
                } else {
                    getgraveek5ggoq = new getGraveEK5gGoQ(new getDirectionDownLeftEK5gGoQ(iMax));
                }
                Collections.sort(gethenkanek5ggoq13.serializer, new accessnoLocalProvidedFor(getgraveek5ggoq, zzbvVar));
                return getfunctionek5ggoqArr[0];
            case 17:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length >= 3);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                getHenkanEK5gGoQ gethenkanek5ggoq14 = (getHenkanEK5gGoQ) getfunctionek5ggoqArr[0];
                int i19 = (int) LoadBalancer$Helper.read(getfunctionek5ggoqArr[1]);
                if (i19 < 0) {
                    iMin2 = Math.max(gethenkanek5ggoq14.serializer.size() + i19, 0);
                } else {
                    iMin2 = Math.min(i19, gethenkanek5ggoq14.serializer.size());
                }
                int iMax2 = Math.max((int) LoadBalancer$Helper.read(getfunctionek5ggoqArr[2]), 0);
                ArrayList arrayList19 = gethenkanek5ggoq14.serializer;
                int iMin4 = Math.min(iMax2, arrayList19.size() - iMin2) + iMin2;
                ArrayList arrayList20 = new ArrayList(arrayList19.subList(iMin2, iMin4));
                arrayList19.subList(iMin2, iMin4).clear();
                ArrayList arrayList21 = new ArrayList();
                for (int i20 = 3; i20 < getfunctionek5ggoqArr.length; i20++) {
                    arrayList21.add(getfunctionek5ggoqArr[i20]);
                }
                arrayList19.addAll(iMin2, arrayList21);
                return new getHenkanEK5gGoQ(arrayList20);
            case 18:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length > 0);
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0] instanceof getHenkanEK5gGoQ);
                getHenkanEK5gGoQ gethenkanek5ggoq15 = (getHenkanEK5gGoQ) getfunctionek5ggoqArr[0];
                ArrayList arrayList22 = new ArrayList();
                for (int i21 = 1; i21 < getfunctionek5ggoqArr.length; i21++) {
                    arrayList22.add(getfunctionek5ggoqArr[i21]);
                }
                gethenkanek5ggoq15.serializer.addAll(0, arrayList22);
                return new getGEK5gGoQ(Double.valueOf(gethenkanek5ggoq15.serializer.size()));
            case 19:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                return new getGuideEK5gGoQ(Boolean.valueOf(LoadBalancer$Helper.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0], getfunctionek5ggoqArr[1])));
            case 20:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                return new getGuideEK5gGoQ(Boolean.valueOf(LoadBalancer$Helper.read(getfunctionek5ggoqArr[1], getfunctionek5ggoqArr[0])));
            case 21:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                getFunctionEK5gGoQ getinfoek5ggoq = getfunctionek5ggoqArr[0];
                boolean z8 = getinfoek5ggoq instanceof getHomeEK5gGoQ;
                getFunctionEK5gGoQ getinfoek5ggoq2 = getfunctionek5ggoqArr[1];
                if (z8 || (getinfoek5ggoq instanceof getHenkanEK5gGoQ) || (getinfoek5ggoq instanceof getGraveEK5gGoQ)) {
                    getinfoek5ggoq = new getInfoEK5gGoQ(LoadBalancer$Helper.IconCompatParcelizer(getinfoek5ggoq));
                }
                if ((getinfoek5ggoq2 instanceof getHomeEK5gGoQ) || (getinfoek5ggoq2 instanceof getHenkanEK5gGoQ) || (getinfoek5ggoq2 instanceof getGraveEK5gGoQ)) {
                    getinfoek5ggoq2 = new getInfoEK5gGoQ(LoadBalancer$Helper.IconCompatParcelizer(getinfoek5ggoq2));
                }
                if (((getinfoek5ggoq instanceof getInfoEK5gGoQ) && (getinfoek5ggoq2 instanceof getInfoEK5gGoQ)) || (!Double.isNaN(LoadBalancer$Helper.RemoteActionCompatParcelizer(getinfoek5ggoq)) && !Double.isNaN(LoadBalancer$Helper.RemoteActionCompatParcelizer(getinfoek5ggoq2)))) {
                    z7 = !LoadBalancer$Helper.read(getinfoek5ggoq, getinfoek5ggoq2);
                }
                return new getGuideEK5gGoQ(Boolean.valueOf(z7));
            case 22:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                return new getGuideEK5gGoQ(Boolean.valueOf(LoadBalancer$Helper.write(getfunctionek5ggoqArr[1], getfunctionek5ggoqArr[0])));
            case 23:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                return new getGuideEK5gGoQ(Boolean.valueOf(!LoadBalancer$Helper.write(getfunctionek5ggoqArr[1], getfunctionek5ggoqArr[0])));
            case 24:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                return new getGuideEK5gGoQ(Boolean.valueOf(LoadBalancer$Helper.read(getfunctionek5ggoqArr[0], getfunctionek5ggoqArr[1])));
            case 25:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                getFunctionEK5gGoQ getinfoek5ggoq3 = getfunctionek5ggoqArr[0];
                boolean z9 = getinfoek5ggoq3 instanceof getHomeEK5gGoQ;
                getFunctionEK5gGoQ getinfoek5ggoq4 = getfunctionek5ggoqArr[1];
                if (z9 || (getinfoek5ggoq3 instanceof getHenkanEK5gGoQ) || (getinfoek5ggoq3 instanceof getGraveEK5gGoQ)) {
                    getinfoek5ggoq3 = new getInfoEK5gGoQ(LoadBalancer$Helper.IconCompatParcelizer(getinfoek5ggoq3));
                }
                if ((getinfoek5ggoq4 instanceof getHomeEK5gGoQ) || (getinfoek5ggoq4 instanceof getHenkanEK5gGoQ) || (getinfoek5ggoq4 instanceof getGraveEK5gGoQ)) {
                    getinfoek5ggoq4 = new getInfoEK5gGoQ(LoadBalancer$Helper.IconCompatParcelizer(getinfoek5ggoq4));
                }
                if (((getinfoek5ggoq3 instanceof getInfoEK5gGoQ) && (getinfoek5ggoq4 instanceof getInfoEK5gGoQ)) || (!Double.isNaN(LoadBalancer$Helper.RemoteActionCompatParcelizer(getinfoek5ggoq3)) && !Double.isNaN(LoadBalancer$Helper.RemoteActionCompatParcelizer(getinfoek5ggoq4)))) {
                    z6 = !LoadBalancer$Helper.read(getinfoek5ggoq4, getinfoek5ggoq3);
                }
                return new getGuideEK5gGoQ(Boolean.valueOf(z6));
            case 26:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 1);
                return new getGEK5gGoQ(Double.valueOf(-LoadBalancer$Helper.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0])));
            case 27:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 1);
                return new getGuideEK5gGoQ(Boolean.valueOf(!LoadBalancer$Helper.serializer(getfunctionek5ggoqArr[0])));
            case 28:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                return new getGuideEK5gGoQ(Boolean.valueOf(!LoadBalancer$Helper.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[1], getfunctionek5ggoqArr[0])));
            default:
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
                return getfunctionek5ggoqArr[0];
        }
    }
}
