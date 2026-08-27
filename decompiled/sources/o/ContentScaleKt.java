package o;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentScaleKt implements Map, Serializable {
    public transient AbstractCollection IconCompatParcelizer;
    public final transient Object[] RemoteActionCompatParcelizer;
    public transient AbstractCollection read;
    public final /* synthetic */ int serializer;
    public transient AbstractCollection write;

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }

    public /* synthetic */ ContentScaleKt(int i, Object[] objArr) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        int i = this.serializer;
        Object[] objArr = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            if (obj == null) {
                obj2 = null;
            } else {
                Object obj5 = objArr[0];
                obj5.getClass();
                if (obj5.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                } else {
                    obj2 = null;
                }
            }
            if (obj2 == null) {
                return null;
            }
            return obj2;
        }
        if (i != 1) {
            if (obj == null) {
                obj4 = null;
            } else {
                Object obj6 = objArr[0];
                obj6.getClass();
                if (obj6.equals(obj)) {
                    obj4 = objArr[1];
                    obj4.getClass();
                } else {
                    obj4 = null;
                }
            }
            if (obj4 == null) {
                return null;
            }
            return obj4;
        }
        if (obj == null) {
            obj3 = null;
        } else {
            Object obj7 = objArr[0];
            Objects.requireNonNull(obj7);
            if (obj7.equals(obj)) {
                obj3 = objArr[1];
                Objects.requireNonNull(obj3);
            } else {
                obj3 = null;
            }
        }
        if (obj3 == null) {
            return null;
        }
        return obj3;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        int i = this.serializer;
        if (i == 0) {
            return get(obj) != null;
        }
        if (i != 1) {
            return get(obj) != null;
        }
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        int i = this.serializer;
        if (i == 0) {
            getFit getfit = (getFit) this.write;
            if (getfit != null) {
                return getfit;
            }
            getFit getfit2 = new getFit(this, this.RemoteActionCompatParcelizer);
            this.write = getfit2;
            return getfit2;
        }
        if (i != 1) {
            accessgetAftercp accessgetaftercp = (accessgetAftercp) this.write;
            if (accessgetaftercp != null) {
                return accessgetaftercp;
            }
            accessgetAftercp accessgetaftercp2 = new accessgetAftercp(this, this.RemoteActionCompatParcelizer);
            this.write = accessgetaftercp2;
            return accessgetaftercp2;
        }
        addFreshIds addfreshids = (addFreshIds) this.write;
        if (addfreshids != null) {
            return addfreshids;
        }
        addFreshIds addfreshids2 = new addFreshIds(this, this.RemoteActionCompatParcelizer);
        this.write = addfreshids2;
        return addfreshids2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        int i = this.serializer;
        if (i == 0) {
            Object obj3 = get(obj);
            return obj3 != null ? obj3 : obj2;
        }
        if (i != 1) {
            Object obj4 = get(obj);
            return obj4 != null ? obj4 : obj2;
        }
        Object obj5 = get(obj);
        return obj5 != null ? obj5 : obj2;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.serializer;
        if (i == 0) {
            ContentScaleCompanionInside1 contentScaleCompanionInside1 = (ContentScaleCompanionInside1) this.IconCompatParcelizer;
            if (contentScaleCompanionInside1 == null) {
                ContentScaleCompanionInside1 contentScaleCompanionInside2 = new ContentScaleCompanionInside1(1, this.RemoteActionCompatParcelizer);
                this.IconCompatParcelizer = contentScaleCompanionInside2;
                contentScaleCompanionInside1 = contentScaleCompanionInside2;
            }
            return contentScaleCompanionInside1.contains(obj);
        }
        if (i != 1) {
            accessgetBeforecp accessgetbeforecp = (accessgetBeforecp) this.IconCompatParcelizer;
            if (accessgetbeforecp == null) {
                accessgetBeforecp accessgetbeforecp2 = new accessgetBeforecp(1, this.RemoteActionCompatParcelizer);
                this.IconCompatParcelizer = accessgetbeforecp2;
                accessgetbeforecp = accessgetbeforecp2;
            }
            return accessgetbeforecp.contains(obj);
        }
        localToScreen58bKbWc localtoscreen58bkbwc = (localToScreen58bKbWc) this.IconCompatParcelizer;
        if (localtoscreen58bkbwc == null) {
            localToScreen58bKbWc localtoscreen58bkbwc2 = new localToScreen58bKbWc(1, this.RemoteActionCompatParcelizer);
            this.IconCompatParcelizer = localtoscreen58bkbwc2;
            localtoscreen58bkbwc = localtoscreen58bkbwc2;
        }
        return localtoscreen58bkbwc.contains(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i = this.serializer;
        if (i == 0) {
            getFit getfit = (getFit) this.write;
            if (getfit == null) {
                getFit getfit2 = new getFit(this, this.RemoteActionCompatParcelizer);
                this.write = getfit2;
                getfit = getfit2;
            }
            Iterator it = getfit.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode += next != null ? next.hashCode() : 0;
            }
            return iHashCode;
        }
        if (i == 1) {
            addFreshIds addfreshids = (addFreshIds) this.write;
            if (addfreshids == null) {
                addFreshIds addfreshids2 = new addFreshIds(this, this.RemoteActionCompatParcelizer);
                this.write = addfreshids2;
                addfreshids = addfreshids2;
            }
            return ApproachLayoutModifierNodemeasure11.serializer(addfreshids);
        }
        accessgetAftercp accessgetaftercp = (accessgetAftercp) this.write;
        if (accessgetaftercp == null) {
            accessgetAftercp accessgetaftercp2 = new accessgetAftercp(this, this.RemoteActionCompatParcelizer);
            this.write = accessgetaftercp2;
            accessgetaftercp = accessgetaftercp2;
        }
        Iterator it2 = accessgetaftercp.iterator();
        int iHashCode2 = 0;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            iHashCode2 += next2 != null ? next2.hashCode() : 0;
        }
        return iHashCode2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        int i = this.serializer;
        if (i == 0) {
            ContentScaleCompanionFit1 contentScaleCompanionFit1 = (ContentScaleCompanionFit1) this.read;
            if (contentScaleCompanionFit1 != null) {
                return contentScaleCompanionFit1;
            }
            ContentScaleCompanionFit1 contentScaleCompanionFit2 = new ContentScaleCompanionFit1(this, new ContentScaleCompanionInside1(0, this.RemoteActionCompatParcelizer));
            this.read = contentScaleCompanionFit2;
            return contentScaleCompanionFit2;
        }
        if (i != 1) {
            accessgetAbovecp accessgetabovecp = (accessgetAbovecp) this.read;
            if (accessgetabovecp != null) {
                return accessgetabovecp;
            }
            accessgetAbovecp accessgetabovecp2 = new accessgetAbovecp(this, new accessgetBeforecp(0, this.RemoteActionCompatParcelizer));
            this.read = accessgetabovecp2;
            return accessgetabovecp2;
        }
        convertToIndirectPointerEventk92h6UUuidefault converttoindirectpointereventk92h6uuuidefault = (convertToIndirectPointerEventk92h6UUuidefault) this.read;
        if (converttoindirectpointereventk92h6uuuidefault != null) {
            return converttoindirectpointereventk92h6uuuidefault;
        }
        convertToIndirectPointerEventk92h6UUuidefault converttoindirectpointereventk92h6uuuidefault2 = new convertToIndirectPointerEventk92h6UUuidefault(this, new localToScreen58bKbWc(0, this.RemoteActionCompatParcelizer));
        this.read = converttoindirectpointereventk92h6uuuidefault2;
        return converttoindirectpointereventk92h6uuuidefault2;
    }

    @Override // java.util.Map
    public final Collection values() {
        int i = this.serializer;
        if (i == 0) {
            ContentScaleCompanionInside1 contentScaleCompanionInside1 = (ContentScaleCompanionInside1) this.IconCompatParcelizer;
            if (contentScaleCompanionInside1 != null) {
                return contentScaleCompanionInside1;
            }
            ContentScaleCompanionInside1 contentScaleCompanionInside2 = new ContentScaleCompanionInside1(1, this.RemoteActionCompatParcelizer);
            this.IconCompatParcelizer = contentScaleCompanionInside2;
            return contentScaleCompanionInside2;
        }
        if (i != 1) {
            accessgetBeforecp accessgetbeforecp = (accessgetBeforecp) this.IconCompatParcelizer;
            if (accessgetbeforecp != null) {
                return accessgetbeforecp;
            }
            accessgetBeforecp accessgetbeforecp2 = new accessgetBeforecp(1, this.RemoteActionCompatParcelizer);
            this.IconCompatParcelizer = accessgetbeforecp2;
            return accessgetbeforecp2;
        }
        localToScreen58bKbWc localtoscreen58bkbwc = (localToScreen58bKbWc) this.IconCompatParcelizer;
        if (localtoscreen58bkbwc != null) {
            return localtoscreen58bkbwc;
        }
        localToScreen58bKbWc localtoscreen58bkbwc2 = new localToScreen58bKbWc(1, this.RemoteActionCompatParcelizer);
        this.IconCompatParcelizer = localtoscreen58bkbwc2;
        return localtoscreen58bkbwc2;
    }

    @Override // java.util.Map
    public final void clear() {
        int i = this.serializer;
        if (i == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 1) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i = this.serializer;
        if (i == 0) {
            throw new UnsupportedOperationException();
        }
        if (i != 1) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int i = this.serializer;
        if (i == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 1) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        int i = this.serializer;
        if (i == 0) {
            throw new UnsupportedOperationException();
        }
        if (i != 1) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        int i = this.serializer;
        if (i == 0) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Map) {
                return entrySet().equals(((Map) obj).entrySet());
            }
            return false;
        }
        if (i != 1) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Map) {
                return entrySet().equals(((Map) obj).entrySet());
            }
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public final String toString() {
        int i = this.serializer;
        boolean z = true;
        if (i == 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(8L, 1073741824L));
            sb.append('{');
            for (Map.Entry entry : (getFit) entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z = false;
            }
            sb.append('}');
            return sb.toString();
        }
        if (i != 1) {
            StringBuilder sb2 = new StringBuilder((int) Math.min(8L, 1073741824L));
            sb2.append('{');
            for (Map.Entry entry2 : (accessgetAftercp) entrySet()) {
                if (!z) {
                    sb2.append(", ");
                }
                sb2.append(entry2.getKey());
                sb2.append('=');
                sb2.append(entry2.getValue());
                z = false;
            }
            sb2.append('}');
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder((int) Math.min(8L, 1073741824L));
        sb3.append('{');
        for (Map.Entry entry3 : (addFreshIds) entrySet()) {
            if (!z) {
                sb3.append(", ");
            }
            sb3.append(entry3.getKey());
            sb3.append('=');
            sb3.append(entry3.getValue());
            z = false;
        }
        sb3.append('}');
        return sb3.toString();
    }
}
