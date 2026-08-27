package o;

/* JADX INFO: loaded from: classes3.dex */
final class setContentCardSyncData extends getLatitudeannotations<r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU> {
    final /* synthetic */ setContentCardSyncUserId write;

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU> getlongitudeannotations) {
        setContentCardSyncUserId setcontentcardsyncuserid = this.write;
        setcontentcardsyncuserid.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this);
        if (setcontentcardsyncuserid.MediaBrowserCompatMediaItem) {
            setcontentcardsyncuserid.write(setcontentcardsyncuserid.MediaBrowserCompatMediaItem(), "Location fix received, but state is already stopped", new Object[0]);
            return;
        }
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku = getlongitudeannotations.read();
        if (r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer != null) {
            setcontentcardsyncuserid.write(setcontentcardsyncuserid.MediaBrowserCompatMediaItem(), "Location fix received", new Object[0]);
            getVerticalAccuracy getverticalaccuracy = setcontentcardsyncuserid.write;
            BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer;
            getverticalaccuracy.getClass();
            setContentCardSyncUserId.RemoteActionCompatParcelizer(setcontentcardsyncuserid, getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setContentCardSyncData(setContentCardSyncUserId setcontentcardsyncuserid, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "LostState");
        this.write = setcontentcardsyncuserid;
    }
}
