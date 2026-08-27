package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.auth.api.tokens.SessionInvalidException;
import com.roadrunner.auth.domain.AuthDataNullException;
import com.roadrunner.auth.domain.RefreshAccessTokenUseCaseImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.concurrent.atomic.AtomicReference;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class onFillDatadefault {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final setTextdefault IconCompatParcelizer;
    public final getIndexForKey MediaBrowserCompatMediaItem;
    public final RefreshAccessTokenUseCaseImpl RatingCompat;
    public final transferSessionPackageI RemoteActionCompatParcelizer;
    public final pageLeft read;
    public final getInputText serializer;
    public final getToggleableState write;

    public onFillDatadefault(getToggleableState gettoggleablestate, getInputText getinputtext, RefreshAccessTokenUseCaseImpl refreshAccessTokenUseCaseImpl, pageLeft pageleft, setTextdefault settextdefault, transferSessionPackageI transfersessionpackagei, getIndexForKey getindexforkey) {
        gettoggleablestate.getClass();
        getinputtext.getClass();
        refreshAccessTokenUseCaseImpl.getClass();
        pageleft.getClass();
        settextdefault.getClass();
        transfersessionpackagei.getClass();
        getindexforkey.getClass();
        this.write = gettoggleablestate;
        this.serializer = getinputtext;
        this.RatingCompat = refreshAccessTokenUseCaseImpl;
        this.read = pageleft;
        this.IconCompatParcelizer = settextdefault;
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
        this.MediaBrowserCompatMediaItem = getindexforkey;
    }

    public final void read(String str) {
        getIndexForKey getindexforkey;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 113;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Trigger logout for ".concat(str), new Object[1]);
            getindexforkey = this.MediaBrowserCompatMediaItem;
        } else {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Trigger logout for ".concat(str), new Object[0]);
            getindexforkey = this.MediaBrowserCompatMediaItem;
        }
        ((isContainerdelegate) getindexforkey).write(str);
    }

    public final void RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 113;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        try {
            if (i2 % 2 != 0) {
                serializer(str);
                Timber.RemoteActionCompatParcelizer.getClass();
            } else {
                serializer(str);
                Timber.RemoteActionCompatParcelizer.getClass();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } catch (IllegalMonitorStateException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "IllegalMonitorStateException during lock release - Owner: " + str + ", Mutex locked: " + this.IconCompatParcelizer.isLocked(), new Object[0]);
        }
    }

    public final void write(String str) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 99;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object[] objArr = {this.IconCompatParcelizer.read.get(), str};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Releasing lock with owner ".concat(str), new Object[0]);
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer;
        firebaseRemoteConfigImpl.getClass();
        if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.SHOULD_UNLOCK_MUTEX_AUTH_SAFELY)) {
            serializer(str);
            int i4 = MediaMetadataCompat + 97;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        int i6 = MediaSessionCompatQueueItem + 93;
        MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            RemoteActionCompatParcelizer(str);
        } else {
            RemoteActionCompatParcelizer(str);
            throw null;
        }
    }

    public final void RemoteActionCompatParcelizer(String str, r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60) {
        int i = 2 % 2;
        if (r8lambday113fdftsr5e4pzj6xssxltpl60 == null) {
            int i2 = MediaMetadataCompat + 93;
            MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                Object[] objArr = {this.IconCompatParcelizer.read.get(), str};
                ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
                throw null;
            }
            Object[] objArr2 = {this.IconCompatParcelizer.read.get(), str};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("owner ", str, ", releasing mutex ", str, " in authenticator"), new Object[0]);
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer;
                firebaseRemoteConfigImpl.getClass();
                if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.SHOULD_UNLOCK_MUTEX_AUTH_SAFELY)) {
                    RemoteActionCompatParcelizer(str);
                    return;
                }
                serializer(str);
            }
        }
        int i3 = MediaMetadataCompat + 13;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final void serializer(String str) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 31;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setTextdefault settextdefault = this.IconCompatParcelizer;
        settextdefault.getClass();
        AtomicReference atomicReference = settextdefault.read;
        if (!str.equals(atomicReference.get())) {
            String str2 = "Cannot unlock [with catch] " + str + "- owner mismatch with " + atomicReference.get();
            getDisabled getdisabled = settextdefault.IconCompatParcelizer;
            getdisabled.getClass();
            ff$$ExternalSyntheticOutline0.m("failureReason", str2, getdisabled.write, "mutex_unlock_failed");
            Timber.RemoteActionCompatParcelizer.write(new IllegalArgumentException(str2));
            return;
        }
        settextdefault.unlock();
        if (!(!settextdefault.isLocked())) {
            return;
        }
        int i4 = MediaMetadataCompat + 1;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i4 % 2 == 0) {
            atomicReference.set(null);
            obj.hashCode();
            throw null;
        }
        atomicReference.set(null);
        int i5 = MediaMetadataCompat + 113;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046 A[PHI: r4
  0x0046: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v9 java.lang.String) binds: [B:14:0x0044, B:11:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x005f  */
    public final r8lambday113fDFTSR5e4PZj6XsSXLtpL60 IconCompatParcelizer(_get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        String strConcat;
        String str;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 3;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = _get_messagewebview_lambda1.request;
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        String strWrite = r8lambday113fdftsr5e4pzj6xssxltpl60.headers.write("retry_count");
        int i4 = strWrite != null ? Integer.parseInt(strWrite) : 0;
        getTraversalIndexdelegate gettraversalindexdelegateRemoteActionCompatParcelizer = this.read.IconCompatParcelizer.serializer.RemoteActionCompatParcelizer();
        Object obj = null;
        if (gettraversalindexdelegateRemoteActionCompatParcelizer != null) {
            int i5 = MediaMetadataCompat + 111;
            MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                str = gettraversalindexdelegateRemoteActionCompatParcelizer.accessToken;
                int i6 = 58 / 0;
                if (str != null) {
                    int i7 = MediaSessionCompatQueueItem + 123;
                    MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    strConcat = "Bearer ".concat(str);
                    int i9 = MediaMetadataCompat + 39;
                    MediaSessionCompatQueueItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                } else {
                    strConcat = null;
                }
            } else {
                str = gettraversalindexdelegateRemoteActionCompatParcelizer.accessToken;
                if (str != null) {
                    int i11 = MediaSessionCompatQueueItem + 123;
                    MediaMetadataCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    strConcat = "Bearer ".concat(str);
                    int i13 = MediaMetadataCompat + 39;
                    MediaSessionCompatQueueItem = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                } else {
                    strConcat = null;
                }
            }
        } else {
            strConcat = null;
        }
        if (strConcat != null) {
            _get_messageWebView_lambda0 _get_messagewebview_lambda0 = r8lambday113fdftsr5e4pzj6xssxltpl60.read();
            _get_messagewebview_lambda0.IconCompatParcelizer("retry_count", String.valueOf(i4 + 1));
            _get_messagewebview_lambda0.IconCompatParcelizer("Authorization", strConcat);
            return new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
        }
        Timber.RemoteActionCompatParcelizer.write(new SessionInvalidException("Access token is null in authenticator"));
        int i15 = MediaSessionCompatQueueItem + 29;
        MediaMetadataCompat = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i15 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final r8lambday113fDFTSR5e4PZj6XsSXLtpL60 read(_get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        int i = 2 % 2;
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = _get_messagewebview_lambda1.request;
        boolean z = ((getInputTextdelegate) this.serializer).read("Authenticator");
        boolean zRemoteActionCompatParcelizer = ((pageUp) this.write).RemoteActionCompatParcelizer();
        Object obj = null;
        if (z || !zRemoteActionCompatParcelizer) {
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            forest.IconCompatParcelizer("Logout in progress : [" + z + "], user signed in: [" + zRemoteActionCompatParcelizer + "]", new Object[0]);
            setInAppMessageImageViewAttributes setinappmessageimageviewattributes = r8lambday113fdftsr5e4pzj6xssxltpl60.url;
            StringBuilder sb = new StringBuilder("Logout for ");
            sb.append(setinappmessageimageviewattributes);
            sb.append(" is in progress during re-authentication, will not refresh token.");
            forest.IconCompatParcelizer(sb.toString(), new Object[0]);
            return null;
        }
        r8lambday113fdftsr5e4pzj6xssxltpl60.getClass();
        String strWrite = r8lambday113fdftsr5e4pzj6xssxltpl60.headers.write("retry_count");
        if (strWrite != null && Integer.parseInt(strWrite) >= 2) {
            int i2 = MediaSessionCompatQueueItem + 53;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                read("Max retries reached");
                return null;
            }
            read("Max retries reached");
            obj.hashCode();
            throw null;
        }
        Object objRemoteActionCompatParcelizer = this.RatingCompat.RemoteActionCompatParcelizer("in authenticator: " + r8lambday113fdftsr5e4pzj6xssxltpl60.url);
        Throwable thSerializer = onItemDismiss.serializer(objRemoteActionCompatParcelizer);
        if (thSerializer == null) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Success refreshing token for " + r8lambday113fdftsr5e4pzj6xssxltpl60.url, new Object[0]);
            return IconCompatParcelizer(_get_messagewebview_lambda1);
        }
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer;
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_FORCE_UPDATE_DIALOG_ON_LOGOUT_ENABLED)) {
            int i3 = MediaSessionCompatQueueItem + 107;
            int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaMetadataCompat = i4;
            int i5 = i3 % 2;
            if (thSerializer instanceof com.data.error.ApiException.ForceAppUpdateRequired) {
                int i6 = i4 + 69;
                MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Logout cause of force update", new Object[1]);
                    read("Force update");
                    return null;
                }
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Logout cause of force update", new Object[0]);
                read("Force update");
                return null;
            }
        }
        if (!(!(thSerializer instanceof AuthDataNullException))) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Auth data is null when trying to refresh token", new Object[0]);
        } else {
            if (!com.data.extensions.ThrowableExtensionsKt.RemoteActionCompatParcelizer(thSerializer)) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Failed to refresh token. Will retry", new Object[0]);
                return IconCompatParcelizer(_get_messagewebview_lambda1);
            }
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Received 4XX error when trying to refresh token", new Object[0]);
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Failed to refresh token. Logout", new Object[0]);
        read("Refresh Token failure");
        return null;
    }
}
