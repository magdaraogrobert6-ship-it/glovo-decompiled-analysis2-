package com.roadrunner.delivery.ontheway.crowdsourcing.sharing.data;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import o.SetComposingTextCommand;
import o.getCompositionMzsxiRA;
import o.getCurrentInputSessionui_text;
import o.getDefaulteUduSuo;
import o.getPhonePjHm6EEannotations;

/* JADX INFO: loaded from: classes3.dex */
public final class UploadSharedContentWorker extends CoroutineWorker {
    private static int ParcelableVolumeInfo = 0;
    private static int PlaybackStateCompat = 1;
    public final ExecuteApiRequest MediaDescriptionCompat;
    public final getDefaulteUduSuo MediaMetadataCompat;
    public final getPhonePjHm6EEannotations MediaSessionCompatQueueItem;
    public final SetComposingTextCommand MediaSessionCompatResultReceiverWrapper;
    public final getCurrentInputSessionui_text PlaybackStateCompatCustomAction;
    public final getCompositionMzsxiRA RatingCompat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadSharedContentWorker(Context context, WorkerParameters workerParameters, SetComposingTextCommand setComposingTextCommand, ExecuteApiRequest executeApiRequest, getDefaulteUduSuo getdefaulteudusuo, getCurrentInputSessionui_text getcurrentinputsessionui_text, getCompositionMzsxiRA getcompositionmzsxira, getPhonePjHm6EEannotations getphonepjhm6eeannotations) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        setComposingTextCommand.getClass();
        executeApiRequest.getClass();
        getdefaulteudusuo.getClass();
        getcurrentinputsessionui_text.getClass();
        getcompositionmzsxira.getClass();
        getphonepjhm6eeannotations.getClass();
        this.MediaSessionCompatResultReceiverWrapper = setComposingTextCommand;
        this.MediaDescriptionCompat = executeApiRequest;
        this.MediaMetadataCompat = getdefaulteudusuo;
        this.PlaybackStateCompatCustomAction = getcurrentinputsessionui_text;
        this.RatingCompat = getcompositionmzsxira;
        this.MediaSessionCompatQueueItem = getphonepjhm6eeannotations;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0161, code lost:
    
        if (r0 == r11) goto L58;
     */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(o.ShortNewsContentCardView r25) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.ontheway.crowdsourcing.sharing.data.UploadSharedContentWorker.doWork(o.ShortNewsContentCardView):java.lang.Object");
    }
}
