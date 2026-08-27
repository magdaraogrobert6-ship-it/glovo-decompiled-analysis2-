package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.OnVisibilityChangedNode;
import o.accessgetTwocp;
import o.getButtonL2EK5gGoQ;
import o.getChannelUpEK5gGoQ;
import o.setLastReportedResult;

/* JADX INFO: loaded from: classes4.dex */
@DynamiteApi
public class TagManagerServiceProviderImpl extends zzv {
    public static volatile getChannelUpEK5gGoQ zza;

    public TagManagerServiceProviderImpl() {
        super("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
    }

    @Override // o.OuterRectRulers
    public getButtonL2EK5gGoQ getService(accessgetTwocp accessgettwocp, setLastReportedResult setlastreportedresult, OnVisibilityChangedNode onVisibilityChangedNode) throws RemoteException {
        getChannelUpEK5gGoQ getchannelupek5ggoq;
        getChannelUpEK5gGoQ getchannelupek5ggoq2 = zza;
        if (getchannelupek5ggoq2 != null) {
            return getchannelupek5ggoq2;
        }
        synchronized (TagManagerServiceProviderImpl.class) {
            getchannelupek5ggoq = zza;
            if (getchannelupek5ggoq == null) {
                getchannelupek5ggoq = new getChannelUpEK5gGoQ((Context) ObjectWrapper.unwrap(accessgettwocp), setlastreportedresult, onVisibilityChangedNode);
                zza = getchannelupek5ggoq;
            }
        }
        return getchannelupek5ggoq;
    }
}
