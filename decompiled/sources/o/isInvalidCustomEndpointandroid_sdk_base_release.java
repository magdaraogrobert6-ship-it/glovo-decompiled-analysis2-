package o;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class isInvalidCustomEndpointandroid_sdk_base_release implements Runnable {
    public final /* synthetic */ int read;
    public final /* synthetic */ WebContentUtilsExternalSyntheticLambda9 serializer;

    public /* synthetic */ isInvalidCustomEndpointandroid_sdk_base_release(WebContentUtilsExternalSyntheticLambda9 webContentUtilsExternalSyntheticLambda9, int i) {
        this.read = i;
        this.serializer = webContentUtilsExternalSyntheticLambda9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        WebContentUtilsExternalSyntheticLambda9 webContentUtilsExternalSyntheticLambda9 = this.serializer;
        if (i == 0) {
            webContentUtilsExternalSyntheticLambda9.PlaybackStateCompat.read();
            return;
        }
        getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release getmaxunpackedzipentrysizebytesandroid_sdk_base_release = webContentUtilsExternalSyntheticLambda9.ParcelableVolumeInfo;
        getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release getmaxunpackedzipentrysizebytesandroid_sdk_base_release2 = webContentUtilsExternalSyntheticLambda9.ParcelableVolumeInfo;
        LinkedHashSet linkedHashSet = getmaxunpackedzipentrysizebytesandroid_sdk_base_release.write.menuHostHelperlambda0;
        if (linkedHashSet != null) {
            linkedHashSet.remove(webContentUtilsExternalSyntheticLambda9);
            if (getmaxunpackedzipentrysizebytesandroid_sdk_base_release2.write.menuHostHelperlambda0.isEmpty()) {
                hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = getmaxunpackedzipentrysizebytesandroid_sdk_base_release2.write;
                hastoomanyzipentrieslambda0.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.RemoteActionCompatParcelizer(hastoomanyzipentrieslambda0.fullyDrawnReporter_delegatelambda00, false);
                hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda1 = getmaxunpackedzipentrysizebytesandroid_sdk_base_release2.write;
                hastoomanyzipentrieslambda1.menuHostHelperlambda0 = null;
                if (hastoomanyzipentrieslambda1.addContentView.get()) {
                    getmaxunpackedzipentrysizebytesandroid_sdk_base_release2.write.getDefaultViewModelCreationExtras.serializer(hasTooManyZipEntrieslambda0.RemoteActionCompatParcelizer);
                }
            }
        }
    }
}
