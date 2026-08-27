package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import androidx.transition.TransitionValuesMaps;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.OnVisibilityChangedNode;
import o.accessgetTwocp;
import o.getButtonThumbLeftEK5gGoQ;
import o.getContactsEK5gGoQ;
import o.setLastReportedResult;

/* JADX INFO: loaded from: classes4.dex */
@DynamiteApi
public class TagManagerApiImpl extends zzs {
    public TagManagerApiImpl() {
        super("com.google.android.gms.tagmanager.ITagManagerApi");
    }

    @Override // o.getLastReportedResult
    @Deprecated
    public void preview(Intent intent, accessgetTwocp accessgettwocp) {
        getButtonThumbLeftEK5gGoQ.serializer("Deprecated. Please use previewIntent instead.");
    }

    @Override // o.getLastReportedResult
    public void initialize(accessgetTwocp accessgettwocp, setLastReportedResult setlastreportedresult, OnVisibilityChangedNode onVisibilityChangedNode) throws RemoteException {
        getContactsEK5gGoQ.IconCompatParcelizer((Context) ObjectWrapper.unwrap(accessgettwocp), setlastreportedresult).write();
    }

    @Override // o.getLastReportedResult
    public void previewIntent(Intent intent, accessgetTwocp accessgettwocp, accessgetTwocp accessgettwocp2, setLastReportedResult setlastreportedresult, OnVisibilityChangedNode onVisibilityChangedNode) {
        Context context = (Context) ObjectWrapper.unwrap(accessgettwocp);
        new TransitionValuesMaps(intent, context, (Context) ObjectWrapper.unwrap(accessgettwocp2), getContactsEK5gGoQ.IconCompatParcelizer(context, setlastreportedresult)).MediaSessionCompatResultReceiverWrapper();
    }
}
