package o;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadLayoutCoordinates implements Runnable {
    public final int IconCompatParcelizer;
    public final Object MediaMetadataCompat;
    public final Object RatingCompat;
    public final Object RemoteActionCompatParcelizer;
    public final Object read;
    public final /* synthetic */ int serializer = 1;
    public final String write;

    public /* synthetic */ LookaheadLayoutCoordinates(String str, LookaheadLayoutCoordinatesKt lookaheadLayoutCoordinatesKt, int i, IOException iOException, byte[] bArr, Map map) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(lookaheadLayoutCoordinatesKt);
        this.RemoteActionCompatParcelizer = lookaheadLayoutCoordinatesKt;
        this.IconCompatParcelizer = i;
        this.read = iOException;
        this.MediaMetadataCompat = bArr;
        this.write = str;
        this.RatingCompat = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.serializer != 0) {
            ((LookaheadLayoutCoordinatesKt) this.RemoteActionCompatParcelizer).IconCompatParcelizer(this.write, this.IconCompatParcelizer, (Throwable) this.read, (byte[]) this.MediaMetadataCompat, (Map) this.RatingCompat);
            return;
        }
        getLookaheadDelegate getlookaheaddelegate = (getLookaheadDelegate) this.RatingCompat;
        LookaheadScopeKt lookaheadScopeKt = ((LookaheadScopeKtLookaheadScope221) getlookaheaddelegate.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompatCustomAction;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(lookaheadScopeKt);
        if (!lookaheadScopeKt.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) {
            Log.println(6, getlookaheaddelegate.ResultReceiver(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (getlookaheaddelegate.RemoteActionCompatParcelizer == 0) {
            setComposedWithReusableContentHost setcomposedwithreusablecontenthost = ((LookaheadScopeKtLookaheadScope221) getlookaheaddelegate.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompat;
            if (setcomposedwithreusablecontenthost.IconCompatParcelizer == null) {
                synchronized (setcomposedwithreusablecontenthost) {
                    if (setcomposedwithreusablecontenthost.IconCompatParcelizer == null) {
                        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) setcomposedwithreusablecontenthost.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        ApplicationInfo applicationInfo = lookaheadScopeKtLookaheadScope221.MediaDescriptionCompat.getApplicationInfo();
                        String strIconCompatParcelizer = MemoryCachedecodeFeatures11.IconCompatParcelizer();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            setcomposedwithreusablecontenthost.IconCompatParcelizer = Boolean.valueOf(str != null && str.equals(strIconCompatParcelizer));
                        }
                        if (setcomposedwithreusablecontenthost.IconCompatParcelizer == null) {
                            setcomposedwithreusablecontenthost.IconCompatParcelizer = Boolean.TRUE;
                            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                            getlookaheaddelegate2.serializer.RemoteActionCompatParcelizer("My process not in the list of running processes");
                        }
                    }
                }
            }
            if (setcomposedwithreusablecontenthost.IconCompatParcelizer.booleanValue()) {
                getlookaheaddelegate.RemoteActionCompatParcelizer = 'C';
            } else {
                getlookaheaddelegate.RemoteActionCompatParcelizer = 'c';
            }
        }
        if (getlookaheaddelegate.IconCompatParcelizer < 0) {
            ((LookaheadScopeKtLookaheadScope221) getlookaheaddelegate.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompat.read();
            getlookaheaddelegate.IconCompatParcelizer = 133005L;
        }
        int i = this.IconCompatParcelizer;
        char c = getlookaheaddelegate.RemoteActionCompatParcelizer;
        long j = getlookaheaddelegate.IconCompatParcelizer;
        String str2 = this.write;
        Object obj = this.RemoteActionCompatParcelizer;
        Object obj2 = this.read;
        Object obj3 = this.MediaMetadataCompat;
        char cCharAt = "01VDIWEA?".charAt(i);
        String strRemoteActionCompatParcelizer = getLookaheadDelegate.RemoteActionCompatParcelizer(true, str2, obj, obj2, obj3);
        int length = String.valueOf(cCharAt).length();
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(c).length() + String.valueOf(j).length() + 1 + strRemoteActionCompatParcelizer.length());
        sb.append("2");
        sb.append(cCharAt);
        sb.append(c);
        sb.append(j);
        sb.append(":");
        sb.append(strRemoteActionCompatParcelizer);
        String string = sb.toString();
        if (string.length() > 1024) {
            string = str2.substring(0, androidx.compose.ui.graphics.Fields.RotationZ);
        }
        localLookaheadPositionOfauaQtc locallookaheadpositionofauaqtc = lookaheadScopeKt.IconCompatParcelizer;
        if (locallookaheadpositionofauaqtc != null) {
            String str3 = (String) locallookaheadpositionofauaqtc.write;
            LookaheadScopeKt lookaheadScopeKt2 = (LookaheadScopeKt) locallookaheadpositionofauaqtc.IconCompatParcelizer;
            lookaheadScopeKt2.MediaSessionCompatToken();
            if (((LookaheadScopeKt) locallookaheadpositionofauaqtc.IconCompatParcelizer).serializer().getLong((String) locallookaheadpositionofauaqtc.read, 0L) == 0) {
                locallookaheadpositionofauaqtc.read();
            }
            SharedPreferences sharedPreferencesSerializer = lookaheadScopeKt2.serializer();
            String str4 = (String) locallookaheadpositionofauaqtc.serializer;
            long j2 = sharedPreferencesSerializer.getLong(str4, 0L);
            if (j2 <= 0) {
                SharedPreferences.Editor editorEdit = lookaheadScopeKt2.serializer().edit();
                editorEdit.putString(str3, string);
                editorEdit.putLong(str4, 1L);
                editorEdit.apply();
                return;
            }
            onLayoutRectChangeddefault onlayoutrectchangeddefault = ((LookaheadScopeKtLookaheadScope221) lookaheadScopeKt2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
            long jNextLong = onlayoutrectchangeddefault.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus().nextLong();
            long j3 = j2 + 1;
            long j4 = Long.MAX_VALUE / j3;
            SharedPreferences.Editor editorEdit2 = lookaheadScopeKt2.serializer().edit();
            if ((Long.MAX_VALUE & jNextLong) < j4) {
                editorEdit2.putString(str3, string);
            }
            editorEdit2.putLong(str4, j3);
            editorEdit2.apply();
        }
    }

    public LookaheadLayoutCoordinates(getLookaheadDelegate getlookaheaddelegate, int i, String str, Object obj, Object obj2, Object obj3) {
        this.IconCompatParcelizer = i;
        this.write = str;
        this.RemoteActionCompatParcelizer = obj;
        this.read = obj2;
        this.MediaMetadataCompat = obj3;
        this.RatingCompat = getlookaheaddelegate;
    }
}
