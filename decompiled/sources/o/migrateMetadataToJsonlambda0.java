package o;

import kotlin.collections.ReversedListReadOnly;

/* JADX INFO: loaded from: classes4.dex */
public abstract class migrateMetadataToJsonlambda0 {
    public static final r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM IconCompatParcelizer(String str) {
        str.getClass();
        r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM.IconCompatParcelizer.getClass();
        getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessageIconCompatParcelizer = r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM.RemoteActionCompatParcelizer.IconCompatParcelizer(str);
        if (getiscurrentlydisplayinginappmessageIconCompatParcelizer == null) {
            return null;
        }
        String str2 = (String) ((ReversedListReadOnly) getiscurrentlydisplayinginappmessageIconCompatParcelizer.IconCompatParcelizer()).get(1);
        String str3 = (String) ((ReversedListReadOnly) getiscurrentlydisplayinginappmessageIconCompatParcelizer.IconCompatParcelizer()).get(2);
        String str4 = (String) ((ReversedListReadOnly) getiscurrentlydisplayinginappmessageIconCompatParcelizer.IconCompatParcelizer()).get(3);
        Integer numPlaybackStateCompat = setCarryoverInAppMessage.PlaybackStateCompat(str2);
        if (numPlaybackStateCompat == null) {
            return null;
        }
        int iIntValue = numPlaybackStateCompat.intValue();
        Integer numPlaybackStateCompat2 = setCarryoverInAppMessage.PlaybackStateCompat(str3);
        if (numPlaybackStateCompat2 == null) {
            return null;
        }
        int iIntValue2 = numPlaybackStateCompat2.intValue();
        Integer numPlaybackStateCompat3 = setCarryoverInAppMessage.PlaybackStateCompat(str4);
        if (numPlaybackStateCompat3 != null) {
            return new r8lambdaueKwLz29fMfZ7fdYSaDi7bqYOfM(iIntValue, iIntValue2, numPlaybackStateCompat3.intValue());
        }
        return null;
    }
}
