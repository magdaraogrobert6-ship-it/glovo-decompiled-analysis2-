package o;

import android.location.Location;

/* JADX INFO: renamed from: o.getUseWebview, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC0171getUseWebview implements Runnable {
    final /* synthetic */ setActionId IconCompatParcelizer;
    final /* synthetic */ Location RemoteActionCompatParcelizer;
    final /* synthetic */ Boolean write;

    @Override // java.lang.Runnable
    public final void run() {
        setActionId setactionid = this.IconCompatParcelizer;
        Location location = this.RemoteActionCompatParcelizer;
        if (location != null && setactionid.serializer != null) {
            Long lRemoteActionCompatParcelizer = setActionId.RemoteActionCompatParcelizer(setactionid);
            setActionId.serializer(setactionid, location.getTime());
            getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = setactionid.PlaybackStateCompat;
            getVerticalAccuracy getverticalaccuracy = setactionid.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            long time = location.getTime();
            Integer num = setactionid.serializer;
            num.getClass();
            r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk r8lambdamlvle2kr5fvc3vtodzmadfjxk = new r8lambdamLVLe2Kr5FVc3vToDZmAdFjXk();
            getverticalaccuracy.getClass();
            r8lambdamlvle2kr5fvc3vtodzmadfjxk.write = getVerticalAccuracy.serializer(location);
            refreshBanners refreshbanners = new refreshBanners(r8lambdamlvle2kr5fvc3vtodzmadfjxk);
            r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(time);
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.IconCompatParcelizer = num;
            r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
            r8lambdaromdixahini0blcevvl7ehebhj0.RemoteActionCompatParcelizer = refreshbanners;
            r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
            getanalyticsenabledenterannotations.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
            if (setActionId.IconCompatParcelizer(setactionid, location.getTime(), lRemoteActionCompatParcelizer)) {
                setactionid.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer();
                return;
            } else {
                setActionId.serializer(setactionid, location);
                setactionid.write(location);
            }
        }
        setActionId.read(setactionid, this.write);
        setactionid.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer();
    }

    public RunnableC0171getUseWebview(setActionId setactionid, Location location, Boolean bool) {
        this.IconCompatParcelizer = setactionid;
        this.RemoteActionCompatParcelizer = location;
        this.write = bool;
    }
}
