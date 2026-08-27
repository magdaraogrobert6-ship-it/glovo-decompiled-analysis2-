package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetLookaheadAndAncestorMeasureSetp implements Map, Serializable {
    public static final accessgetLookaheadAndAncestorMeasureSetp write = new accessgetLookaheadAndAncestorMeasureSetp(0, null, new Object[0]);
    public transient getAffectsLookaheadMeasure IconCompatParcelizer;
    public transient areItemsTheSame MediaBrowserCompatMediaItem;
    public final transient int MediaDescriptionCompat;
    public transient DepthSortedSetsForDifferentPasses RemoteActionCompatParcelizer;
    public final transient Object[] read;
    public final transient Object serializer;

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return accessgetDepthComparatorp.read(this, obj);
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final int size() {
        return this.MediaDescriptionCompat;
    }

    public final String toString() {
        return accessgetDepthComparatorp.IconCompatParcelizer(this);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public accessgetLookaheadAndAncestorMeasureSetp(int i, Object obj, Object[] objArr) {
        this.serializer = obj;
        this.read = objArr;
        this.MediaDescriptionCompat = i;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return DiffCallback.serializer(entrySet());
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.read;
            if (this.MediaDescriptionCompat == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.serializer;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length;
                    int iIconCompatParcelizer = pauseWebviewIfNecessarylambda10.IconCompatParcelizer(obj.hashCode());
                    while (true) {
                        int i = iIconCompatParcelizer & (length - 1);
                        int i2 = bArr[i] & 255;
                        if (i2 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i2])) {
                            obj2 = objArr[i2 ^ 1];
                        } else {
                            iIconCompatParcelizer = i + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length;
                    int iIconCompatParcelizer2 = pauseWebviewIfNecessarylambda10.IconCompatParcelizer(obj.hashCode());
                    while (true) {
                        int i3 = iIconCompatParcelizer2 & (length2 - 1);
                        int i4 = sArr[i3] & 65535;
                        if (i4 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i4])) {
                            obj2 = objArr[i4 ^ 1];
                        } else {
                            iIconCompatParcelizer2 = i3 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length;
                    int iIconCompatParcelizer3 = pauseWebviewIfNecessarylambda10.IconCompatParcelizer(obj.hashCode());
                    while (true) {
                        int i5 = iIconCompatParcelizer3 & (length3 - 1);
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iIconCompatParcelizer3 = i5 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: serializer, reason: merged with bridge method [inline-methods] */
    public final undelegateUnprotectedui entrySet() {
        getAffectsLookaheadMeasure getaffectslookaheadmeasure = this.IconCompatParcelizer;
        if (getaffectslookaheadmeasure != null) {
            return getaffectslookaheadmeasure;
        }
        getAffectsLookaheadMeasure getaffectslookaheadmeasure2 = new getAffectsLookaheadMeasure(this, this.read, this.MediaDescriptionCompat);
        this.IconCompatParcelizer = getaffectslookaheadmeasure2;
        return getaffectslookaheadmeasure2;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        areItemsTheSame areitemsthesame = this.MediaBrowserCompatMediaItem;
        if (areitemsthesame == null) {
            areItemsTheSame areitemsthesame2 = new areItemsTheSame(1, this.MediaDescriptionCompat, this.read);
            this.MediaBrowserCompatMediaItem = areitemsthesame2;
            areitemsthesame = areitemsthesame2;
        }
        return areitemsthesame.contains(obj);
    }

    @Override // java.util.Map
    public final Set keySet() {
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = this.RemoteActionCompatParcelizer;
        if (depthSortedSetsForDifferentPasses != null) {
            return depthSortedSetsForDifferentPasses;
        }
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses2 = new DepthSortedSetsForDifferentPasses(this, new areItemsTheSame(0, this.MediaDescriptionCompat, this.read));
        this.RemoteActionCompatParcelizer = depthSortedSetsForDifferentPasses2;
        return depthSortedSetsForDifferentPasses2;
    }

    @Override // java.util.Map
    public final Collection values() {
        areItemsTheSame areitemsthesame = this.MediaBrowserCompatMediaItem;
        if (areitemsthesame != null) {
            return areitemsthesame;
        }
        areItemsTheSame areitemsthesame2 = new areItemsTheSame(1, this.MediaDescriptionCompat, this.read);
        this.MediaBrowserCompatMediaItem = areitemsthesame2;
        return areitemsthesame2;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r6v3 ??, r6v5 ??, r6v4 ??, r6v6 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.trySplitConstInsns(FixTypesVisitor.java:580)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        */
    public static o.accessgetLookaheadAndAncestorMeasureSetp RemoteActionCompatParcelizer(int r16, java.lang.Object[] r17, o.resizeGraphicFrameIfAppropriate r18) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessgetLookaheadAndAncestorMeasureSetp.RemoteActionCompatParcelizer(int, java.lang.Object[], o.resizeGraphicFrameIfAppropriate):o.accessgetLookaheadAndAncestorMeasureSetp");
    }
}
