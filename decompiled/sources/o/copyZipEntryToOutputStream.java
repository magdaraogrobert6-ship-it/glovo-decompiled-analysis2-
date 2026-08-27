package o;

/* JADX INFO: loaded from: classes4.dex */
public final class copyZipEntryToOutputStream implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambday78CcsNUxER22a2WVqifR2BmBdo read;

    public /* synthetic */ copyZipEntryToOutputStream(r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo, int i) {
        this.IconCompatParcelizer = i;
        this.read = r8lambday78ccsnuxer22a2wvqifr2bmbdo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo = this.read;
        if (i != 0) {
            r8lambday78ccsnuxer22a2wvqifr2bmbdo.PlaybackStateCompatCustomAction = null;
            r8lambday78ccsnuxer22a2wvqifr2bmbdo.RatingCompat.serializer(optEnum.INFO, "CONNECTING after backoff");
            r8lambday78CcsNUxER22a2WVqifR2BmBdo.IconCompatParcelizer(r8lambday78ccsnuxer22a2wvqifr2bmbdo, setResourcePackageNamelambda0.CONNECTING);
            r8lambday78CcsNUxER22a2WVqifR2BmBdo.serializer(r8lambday78ccsnuxer22a2wvqifr2bmbdo);
            return;
        }
        r8lambday78ccsnuxer22a2wvqifr2bmbdo.RatingCompat.serializer(optEnum.INFO, "Terminated");
        hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = ((cExternalSyntheticLambda7) r8lambday78ccsnuxer22a2wvqifr2bmbdo.MediaBrowserCompatMediaItem.write).PlaybackStateCompat;
        hastoomanyzipentrieslambda0.addOnContextAvailableListener.remove(r8lambday78ccsnuxer22a2wvqifr2bmbdo);
        hasTooManyZipEntrieslambda0.serializer(hastoomanyzipentrieslambda0);
    }
}
