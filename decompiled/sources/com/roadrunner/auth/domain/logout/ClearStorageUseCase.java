package com.roadrunner.auth.domain.logout;

import com.roadrunner.database.domain.ClearDatabaseUseCase;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.order.history.domain.ClearHistoryDatabaseUseCaseImpl;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.state.provider.database.ClearRiderStateDatabaseImpl;
import o.SystemFontFamily;
import o.createOpenHelper;
import o.getAdidWithTimeout;
import o.injectStoreInfoToParameters;
import o.setNextTransition;
import o.vg;

/* JADX INFO: loaded from: classes3.dex */
public final class ClearStorageUseCase {
    private static int MediaSessionCompatToken = 1;
    private static int PlaybackStateCompatCustomAction;
    public final OpportunitiesRepository IconCompatParcelizer;
    public final getAdidWithTimeout MediaBrowserCompatMediaItem;
    public final ClearDatabaseUseCase MediaDescriptionCompat;
    public final GetAppStateImpl MediaMetadataCompat;
    public final SystemFontFamily MediaSessionCompatQueueItem;
    public final createOpenHelper MediaSessionCompatResultReceiverWrapper;
    public final setNextTransition ParcelableVolumeInfo;
    public final vg PlaybackStateCompat;
    public final ClearRiderStateDatabaseImpl RatingCompat;
    public final ClearHistoryDatabaseUseCaseImpl RemoteActionCompatParcelizer;
    public final SendTestPushUseCase read;
    public final SendTestPushUseCase serializer;
    public final injectStoreInfoToParameters write;

    public ClearStorageUseCase(ClearHistoryDatabaseUseCaseImpl clearHistoryDatabaseUseCaseImpl, ClearDatabaseUseCase clearDatabaseUseCase, createOpenHelper createopenhelper, ClearRiderStateDatabaseImpl clearRiderStateDatabaseImpl, SystemFontFamily systemFontFamily, setNextTransition setnexttransition, getAdidWithTimeout getadidwithtimeout, OpportunitiesRepository opportunitiesRepository, vg vgVar, injectStoreInfoToParameters injectstoreinfotoparameters, SendTestPushUseCase sendTestPushUseCase, SendTestPushUseCase sendTestPushUseCase2, GetAppStateImpl getAppStateImpl) {
        clearHistoryDatabaseUseCaseImpl.getClass();
        clearDatabaseUseCase.getClass();
        createopenhelper.getClass();
        clearRiderStateDatabaseImpl.getClass();
        systemFontFamily.getClass();
        setnexttransition.getClass();
        getadidwithtimeout.getClass();
        opportunitiesRepository.getClass();
        vgVar.getClass();
        injectstoreinfotoparameters.getClass();
        sendTestPushUseCase.getClass();
        sendTestPushUseCase2.getClass();
        getAppStateImpl.getClass();
        this.RemoteActionCompatParcelizer = clearHistoryDatabaseUseCaseImpl;
        this.MediaDescriptionCompat = clearDatabaseUseCase;
        this.MediaSessionCompatResultReceiverWrapper = createopenhelper;
        this.RatingCompat = clearRiderStateDatabaseImpl;
        this.MediaSessionCompatQueueItem = systemFontFamily;
        this.ParcelableVolumeInfo = setnexttransition;
        this.MediaBrowserCompatMediaItem = getadidwithtimeout;
        this.IconCompatParcelizer = opportunitiesRepository;
        this.PlaybackStateCompat = vgVar;
        this.write = injectstoreinfotoparameters;
        this.read = sendTestPushUseCase;
        this.serializer = sendTestPushUseCase2;
        this.MediaMetadataCompat = getAppStateImpl;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x010f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0114  */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Code duplicated, block: B:56:0x013f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0144  */
    /* JADX WARN: Code duplicated, block: B:62:0x0156  */
    /* JADX WARN: Code duplicated, block: B:65:0x015a  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0171  */
    /* JADX WARN: Code duplicated, block: B:74:0x0175  */
    /* JADX WARN: Code duplicated, block: B:77:0x0179  */
    /* JADX WARN: Code duplicated, block: B:80:0x019a  */
    /* JADX WARN: Code duplicated, block: B:83:0x019e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019f, code lost:
    
        if (r13 == r4) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.auth.domain.logout.ClearStorageUseCase.invoke(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
