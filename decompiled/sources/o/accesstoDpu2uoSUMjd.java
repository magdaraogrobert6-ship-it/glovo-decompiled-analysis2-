package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class accesstoDpu2uoSUMjd extends DropShadowScope {
    public ArrayList RemoteActionCompatParcelizer;

    public final void IconCompatParcelizer(float f, String str) {
        RemoteActionCompatParcelizer(str, new accesstoRectjd(f));
    }

    public final boolean RatingCompat(String str) {
        for (DropShadowScope dropShadowScope : this.RemoteActionCompatParcelizer) {
            if ((dropShadowScope instanceof accesstoPx0680j_4jd) && ((accesstoPx0680j_4jd) dropShadowScope).write().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final DropShadowScope RemoteActionCompatParcelizer(String str) {
        Iterator it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            accesstoPx0680j_4jd accesstopx0680j_4jd = (accesstoPx0680j_4jd) ((DropShadowScope) it.next());
            if (accesstopx0680j_4jd.write().equals(str)) {
                if (accesstopx0680j_4jd.RemoteActionCompatParcelizer.size() > 0) {
                    return (DropShadowScope) accesstopx0680j_4jd.RemoteActionCompatParcelizer.get(0);
                }
                return null;
            }
        }
        return null;
    }

    public final void RemoteActionCompatParcelizer(String str, DropShadowScope dropShadowScope) {
        Iterator it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            accesstoPx0680j_4jd accesstopx0680j_4jd = (accesstoPx0680j_4jd) ((DropShadowScope) it.next());
            if (accesstopx0680j_4jd.write().equals(str)) {
                int size = accesstopx0680j_4jd.RemoteActionCompatParcelizer.size();
                ArrayList arrayList = accesstopx0680j_4jd.RemoteActionCompatParcelizer;
                if (size > 0) {
                    arrayList.set(0, dropShadowScope);
                    return;
                } else {
                    arrayList.add(dropShadowScope);
                    return;
                }
            }
        }
        accesstoPx0680j_4jd accesstopx0680j_4jd2 = new accesstoPx0680j_4jd(str.toCharArray());
        accesstopx0680j_4jd2.write = 0L;
        accesstopx0680j_4jd2.write(str.length() - 1);
        int size2 = accesstopx0680j_4jd2.RemoteActionCompatParcelizer.size();
        ArrayList arrayList2 = accesstopx0680j_4jd2.RemoteActionCompatParcelizer;
        if (size2 > 0) {
            arrayList2.set(0, dropShadowScope);
        } else {
            arrayList2.add(dropShadowScope);
        }
        this.RemoteActionCompatParcelizer.add(accesstopx0680j_4jd2);
    }

    @Override // o.DropShadowScope
    public int hashCode() {
        return Objects.hash(this.RemoteActionCompatParcelizer, Integer.valueOf(super.hashCode()));
    }

    public final DropShadowScope read(String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        Iterator it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            accesstoPx0680j_4jd accesstopx0680j_4jd = (accesstoPx0680j_4jd) ((DropShadowScope) it.next());
            if (accesstopx0680j_4jd.write().equals(str)) {
                if (accesstopx0680j_4jd.RemoteActionCompatParcelizer.size() > 0) {
                    return (DropShadowScope) accesstopx0680j_4jd.RemoteActionCompatParcelizer.get(0);
                }
                return null;
            }
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException(ff$$ExternalSyntheticOutline0.m("no element for key <", str, ">"), this);
    }

    public final ArrayList serializer() {
        ArrayList arrayList = new ArrayList();
        for (DropShadowScope dropShadowScope : this.RemoteActionCompatParcelizer) {
            if (dropShadowScope instanceof accesstoPx0680j_4jd) {
                arrayList.add(((accesstoPx0680j_4jd) dropShadowScope).write());
            }
        }
        return arrayList;
    }

    public final void serializer(String str, String str2) {
        accesstoDpSizekrfVVMjd accesstodpsizekrfvvmjd = new accesstoDpSizekrfVVMjd(str2.toCharArray());
        accesstodpsizekrfvvmjd.write = 0L;
        accesstodpsizekrfvvmjd.write(str2.length() - 1);
        RemoteActionCompatParcelizer(str, accesstodpsizekrfvvmjd);
    }

    public final void serializer(DropShadowScope dropShadowScope) {
        this.RemoteActionCompatParcelizer.add(dropShadowScope);
    }

    @Override // o.DropShadowScope
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (DropShadowScope dropShadowScope : this.RemoteActionCompatParcelizer) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(dropShadowScope);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public final String IconCompatParcelizer(String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        DropShadowScope dropShadowScope = read(str);
        if (dropShadowScope instanceof accesstoDpSizekrfVVMjd) {
            return dropShadowScope.write();
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("no string found for key <", str, ">, found [", dropShadowScope != null ? dropShadowScope.RatingCompat() : null, "] : ");
        sbM.append(dropShadowScope);
        throw new androidx.constraintlayout.core.parser.CLParsingException(sbM.toString(), this);
    }

    @Override // o.DropShadowScope
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public accesstoDpu2uoSUMjd read() {
        accesstoDpu2uoSUMjd accesstodpu2uosumjd = (accesstoDpu2uoSUMjd) super.read();
        ArrayList arrayList = new ArrayList(this.RemoteActionCompatParcelizer.size());
        Iterator it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            DropShadowScope dropShadowScope = ((DropShadowScope) it.next()).read();
            dropShadowScope.IconCompatParcelizer = accesstodpu2uosumjd;
            arrayList.add(dropShadowScope);
        }
        accesstodpu2uosumjd.RemoteActionCompatParcelizer = arrayList;
        return accesstodpu2uosumjd;
    }

    @Override // o.DropShadowScope
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof accesstoDpu2uoSUMjd) {
            return this.RemoteActionCompatParcelizer.equals(((accesstoDpu2uoSUMjd) obj).RemoteActionCompatParcelizer);
        }
        return false;
    }

    public final String write(String str) {
        DropShadowScope dropShadowScopeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (dropShadowScopeRemoteActionCompatParcelizer instanceof accesstoDpSizekrfVVMjd) {
            return dropShadowScopeRemoteActionCompatParcelizer.write();
        }
        return null;
    }

    public accesstoDpu2uoSUMjd(char[] cArr) {
        super(cArr);
        this.RemoteActionCompatParcelizer = new ArrayList();
    }

    public final int IconCompatParcelizer(int i) throws androidx.constraintlayout.core.parser.CLParsingException {
        DropShadowScope dropShadowScope = read(i);
        if (dropShadowScope != null) {
            return dropShadowScope.MediaMetadataCompat();
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException(c8$$ExternalSyntheticOutline0.m(i, "no int at index "), this);
    }

    public final float serializer(String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        DropShadowScope dropShadowScope = read(str);
        if (dropShadowScope != null) {
            return dropShadowScope.IconCompatParcelizer();
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("no float found for key <", str, ">, found [");
        sbM.append(dropShadowScope.RatingCompat());
        sbM.append("] : ");
        sbM.append(dropShadowScope);
        throw new androidx.constraintlayout.core.parser.CLParsingException(sbM.toString(), this);
    }

    public final float RemoteActionCompatParcelizer(int i) throws androidx.constraintlayout.core.parser.CLParsingException {
        DropShadowScope dropShadowScope = read(i);
        if (dropShadowScope != null) {
            return dropShadowScope.IconCompatParcelizer();
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException(c8$$ExternalSyntheticOutline0.m(i, "no float at index "), this);
    }

    public final String write(int i) throws androidx.constraintlayout.core.parser.CLParsingException {
        DropShadowScope dropShadowScope = read(i);
        if (dropShadowScope instanceof accesstoDpSizekrfVVMjd) {
            return dropShadowScope.write();
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException(c8$$ExternalSyntheticOutline0.m(i, "no string at index "), this);
    }

    public final DropShadowScope serializer(int i) {
        if (i < 0 || i >= this.RemoteActionCompatParcelizer.size()) {
            return null;
        }
        return (DropShadowScope) this.RemoteActionCompatParcelizer.get(i);
    }

    public final DropShadowScope read(int i) throws androidx.constraintlayout.core.parser.CLParsingException {
        if (i >= 0 && i < this.RemoteActionCompatParcelizer.size()) {
            return (DropShadowScope) this.RemoteActionCompatParcelizer.get(i);
        }
        throw new androidx.constraintlayout.core.parser.CLParsingException(c8$$ExternalSyntheticOutline0.m(i, "no element at index "), this);
    }
}
