package o;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class getLocalHtmlUrlFromRemoteUrllambda3 implements Runnable {
    public final /* synthetic */ getMaxUnpackedZipEntryCountandroid_sdk_base_releaseannotations read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ getLocalHtmlUrlFromRemoteUrllambda3(getMaxUnpackedZipEntryCountandroid_sdk_base_releaseannotations getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations, int i) {
        this.serializer = i;
        this.read = getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations;
    }

    @Override // java.lang.Runnable
    public final void run() {
        getMaxUnpackedZipEntryCountandroid_sdk_base_releaseannotations getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations;
        boolean z;
        long jNextLong;
        boolean z2 = false;
        boolean z3 = true;
        if (this.serializer == 0) {
            synchronized (this.read) {
                getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations = this.read;
                getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations = getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations.RatingCompat;
                getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations2 = getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.DISCONNECTED;
                if (getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations != getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations2) {
                    getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations.RatingCompat = getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations2;
                    z2 = true;
                }
            }
            if (z2) {
                ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations.read.write).serializer(Status.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("Keepalive failed. The connection is likely gone"));
                return;
            }
            return;
        }
        synchronized (this.read) {
            getMaxUnpackedZipEntryCountandroid_sdk_base_releaseannotations getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations2 = this.read;
            getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations2.IconCompatParcelizer = null;
            getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations3 = getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations2.RatingCompat;
            getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations4 = getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.PING_SCHEDULED;
            if (getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations3 == getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations4) {
                getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations2.RatingCompat = getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.PING_SENT;
                getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations2.MediaMetadataCompat = getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations2.RemoteActionCompatParcelizer.schedule(getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations2.MediaBrowserCompatMediaItem, getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations2.serializer, TimeUnit.NANOSECONDS);
                z = true;
            } else {
                if (getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations3 == getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_releaseannotations.PING_DELAYED) {
                    getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations2.IconCompatParcelizer = getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations2.RemoteActionCompatParcelizer.schedule(getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations2.MediaSessionCompatQueueItem, getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations2.write - getmaxunpackedzipentrycountandroid_sdk_base_releaseannotations2.MediaDescriptionCompat.RemoteActionCompatParcelizer(), TimeUnit.NANOSECONDS);
                    this.read.RatingCompat = getmaxunpackedzipentrysizebytesandroid_sdk_base_releaseannotations4;
                }
                z = false;
            }
        }
        if (z) {
            setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = this.read.read;
            r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write;
            getLocalHtmlUrlFromRemoteUrllambda4 getlocalhtmlurlfromremoteurllambda4 = new getLocalHtmlUrlFromRemoteUrllambda4(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release);
            DpTouchBoundsExpansionCompanion dpTouchBoundsExpansionCompanion = DpTouchBoundsExpansionCompanion.INSTANCE;
            synchronized (r8lambda1dlenebwpksdsvf_xikspxtdeu.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                if (r8lambda1dlenebwpksdsvf_xikspxtdeu.PlaybackStateCompatCustomAction == null) {
                    throw new IllegalStateException();
                }
                if (r8lambda1dlenebwpksdsvf_xikspxtdeu.addObserverForBackInvoker) {
                    r8lambdaT8koEBPGb_C2i_6i0vhRQcFBB2I.read(getlocalhtmlurlfromremoteurllambda4, dpTouchBoundsExpansionCompanion, r8lambda1dlenebwpksdsvf_xikspxtdeu.RemoteActionCompatParcelizer());
                    return;
                }
                r8lambdaT8koEBPGb_C2i_6i0vhRQcFBB2I r8lambdat8koebpgb_c2i_6i0vhrqcfbb2i = r8lambda1dlenebwpksdsvf_xikspxtdeu.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                if (r8lambdat8koebpgb_c2i_6i0vhrqcfbb2i != null) {
                    jNextLong = 0;
                    z3 = false;
                } else {
                    jNextLong = r8lambda1dlenebwpksdsvf_xikspxtdeu._init_lambda1.nextLong();
                    visitSubtreeYYKmhodefault visitsubtreeyykmhodefault = (visitSubtreeYYKmhodefault) r8lambda1dlenebwpksdsvf_xikspxtdeu.ensureViewModelStore.B_();
                    visitsubtreeyykmhodefault.write();
                    r8lambdaT8koEBPGb_C2i_6i0vhRQcFBB2I r8lambdat8koebpgb_c2i_6i0vhrqcfbb2i2 = new r8lambdaT8koEBPGb_C2i_6i0vhRQcFBB2I(jNextLong, visitsubtreeyykmhodefault);
                    r8lambda1dlenebwpksdsvf_xikspxtdeu.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = r8lambdat8koebpgb_c2i_6i0vhrqcfbb2i2;
                    r8lambda1dlenebwpksdsvf_xikspxtdeu.fullyDrawnReporter_delegatelambda00.getClass();
                    r8lambdat8koebpgb_c2i_6i0vhrqcfbb2i = r8lambdat8koebpgb_c2i_6i0vhrqcfbb2i2;
                }
                if (z3) {
                    r8lambda1dlenebwpksdsvf_xikspxtdeu.PlaybackStateCompatCustomAction.read((int) (jNextLong >>> 32), (int) jNextLong, false);
                }
                r8lambdat8koebpgb_c2i_6i0vhrqcfbb2i.IconCompatParcelizer(getlocalhtmlurlfromremoteurllambda4, dpTouchBoundsExpansionCompanion);
            }
        }
    }
}
