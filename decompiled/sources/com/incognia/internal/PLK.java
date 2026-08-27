package com.incognia.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.accessgetInstancedelegatecp;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getInAppMessageStackannotations;
import o.onContentCardDismissed;
import o.onMove;

/* JADX INFO: loaded from: classes2.dex */
public final class PLK implements ETe {
    public final String BGx;
    public final boolean HQ;
    public final List mbG;

    public PLK(String str, List list, boolean z) {
        this.BGx = str;
        this.mbG = list;
        this.HQ = z;
        new z3v(new p09());
    }

    @Override // com.incognia.internal.ETe
    public final void BGx(nn nnVar) {
        List list;
        String str;
        if (!this.HQ || (list = this.mbG) == null) {
            nnVar.pA0 = this.mbG;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            LCt lCt = (LCt) obj;
            if (lCt.hIl != null && (str = lCt.hs) != null) {
                Pattern patternCompile = Pattern.compile("^([0-9A-Fa-f]{1,2}[:-]){5}([0-9A-Fa-f]{1,2})$");
                patternCompile.getClass();
                if (patternCompile.matcher(str).matches()) {
                    char[] charArray = lCt.hs.toCharArray();
                    ArrayList arrayList2 = new ArrayList();
                    for (char c : charArray) {
                        if (c != ':' && c != '-') {
                            arrayList2.add(Character.valueOf(c));
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                        arrayList3.add(Integer.valueOf(Character.digit(((Character) obj2).charValue(), 16)));
                    }
                    int[] iArrRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) arrayList3);
                    LinkedHashSet linkedHashSet = new LinkedHashSet(onMove.RemoteActionCompatParcelizer(iArrRemoteActionCompatParcelizer.length));
                    for (int i2 : iArrRemoteActionCompatParcelizer) {
                        linkedHashSet.add(Integer.valueOf(i2));
                    }
                    if (onContentCardDismissed.PlaybackStateCompat(linkedHashSet).size() >= 3) {
                        int length = iArrRemoteActionCompatParcelizer.length - 1;
                        int[] iArr = new int[length];
                        getInAppMessageStackannotations it = ((ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{1, Integer.valueOf(iArrRemoteActionCompatParcelizer.length)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write())).iterator();
                        while (it.RemoteActionCompatParcelizer) {
                            int iRemoteActionCompatParcelizer = it.RemoteActionCompatParcelizer();
                            int i3 = iRemoteActionCompatParcelizer - 1;
                            iArr[i3] = iArrRemoteActionCompatParcelizer[iRemoteActionCompatParcelizer] - iArrRemoteActionCompatParcelizer[i3];
                        }
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet(onMove.RemoteActionCompatParcelizer(length));
                        for (int i4 = 0; i4 < length; i4++) {
                            linkedHashSet2.add(Integer.valueOf(iArr[i4]));
                        }
                        if (onContentCardDismissed.PlaybackStateCompat(linkedHashSet2).size() >= 3 && (lCt.N || lCt.BGx >= -89)) {
                            arrayList.add(obj);
                        }
                    }
                }
            }
        }
        nnVar.pA0 = arrayList;
    }

    @Override // com.incognia.internal.ETe
    public final String BGx() {
        return this.BGx;
    }
}
