package com.google.accompanist.permissions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.accessgetAltRightcp;
import o.accessgetAvReceiverInputcp;
import o.accessgetBackcp;
import o.accessgetBreakcp;
import o.instance_delegatelambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class PreviewMultiplePermissionsState implements accessgetAltRightcp {
    public final ArrayList RemoteActionCompatParcelizer;
    public final instance_delegatelambda0 read;

    @Override // o.accessgetAltRightcp
    public final boolean IconCompatParcelizer() {
        return false;
    }

    @Override // o.accessgetAltRightcp
    public final void RemoteActionCompatParcelizer() {
    }

    @Override // o.accessgetAltRightcp
    public final boolean read() {
        return false;
    }

    @Override // o.accessgetAltRightcp
    public final List serializer() {
        return this.read;
    }

    @Override // o.accessgetAltRightcp
    public final List write() {
        return this.RemoteActionCompatParcelizer;
    }

    public PreviewMultiplePermissionsState(List list, Map map) {
        list.getClass();
        map.getClass();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            accessgetAvReceiverInputcp accessgetavreceiverinputcp = (accessgetAvReceiverInputcp) map.get(str);
            if (accessgetavreceiverinputcp == null) {
                accessgetavreceiverinputcp = accessgetBackcp.serializer;
            }
            arrayList.add(new accessgetBreakcp(str, accessgetavreceiverinputcp));
        }
        this.RemoteActionCompatParcelizer = arrayList;
        this.read = instance_delegatelambda0.write;
    }
}
