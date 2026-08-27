package o;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.cardview.widget.CardView$1;
import coil3.Extras$Key;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zae;
import com.google.android.gms.tasks.zzw;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetNumPad7cp implements accessgetNumPadAddcp {
    public final accessgetNumPadDividecp MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final accessgetNumPad2cp MediaMetadataCompat;
    public final Extras$Key MediaSessionCompatQueueItem;
    public final FlingCancellationException MediaSessionCompatResultReceiverWrapper;
    public final int MediaSessionCompatToken;
    public final accessgetNumPadSubtractcp ParcelableVolumeInfo;
    public final Looper PlaybackStateCompat;
    public final accessgetNumLockcp RatingCompat;
    public final GoogleApiManager read;
    public final Context write;

    @Override // o.accessgetNumPadAddcp
    public final accessgetNumPadDividecp getApiKey() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final zzw RemoteActionCompatParcelizer(CardView$1 cardView$1) {
        accessgetSystemNavigationDowncp.serializer((accessgetNumPadEntercp) ((accessgetPageDowncp) cardView$1.RemoteActionCompatParcelizer).write.RemoteActionCompatParcelizer, "Listener has already been released.");
        CardView$1 cardView$2 = (CardView$1) cardView$1.IconCompatParcelizer;
        accessgetSystemNavigationDowncp.serializer((accessgetNumPadEntercp) cardView$2.RemoteActionCompatParcelizer, "Listener has already been released.");
        accessgetPageDowncp accessgetpagedowncp = (accessgetPageDowncp) cardView$1.RemoteActionCompatParcelizer;
        GoogleApiManager googleApiManager = this.read;
        googleApiManager.getClass();
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
        googleApiManager.serializer(parentDataModifierDefaultImpls, accessgetpagedowncp.RemoteActionCompatParcelizer, this);
        accessgetPageUpcp accessgetpageupcp = new accessgetPageUpcp(new accessgetPowercp(new accessgetPeriodcp(accessgetpagedowncp, cardView$2), parentDataModifierDefaultImpls), googleApiManager.MediaSessionCompatResultReceiverWrapper.get(), this);
        getBackEK5gGoQ getbackek5ggoq = googleApiManager.ComponentActivity;
        getbackek5ggoq.sendMessage(getbackek5ggoq.obtainMessage(8, accessgetpageupcp));
        return parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
    }

    public final zzw read(int i, accessgetNumPadPageUpcp accessgetnumpadpageupcp) {
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
        GoogleApiManager googleApiManager = this.read;
        googleApiManager.getClass();
        googleApiManager.serializer(parentDataModifierDefaultImpls, accessgetnumpadpageupcp.serializer, this);
        accessgetPageUpcp accessgetpageupcp = new accessgetPageUpcp(new accessgetPrintScreencp(i, accessgetnumpadpageupcp, parentDataModifierDefaultImpls, this.MediaSessionCompatResultReceiverWrapper), googleApiManager.MediaSessionCompatResultReceiverWrapper.get(), this);
        getBackEK5gGoQ getbackek5ggoq = googleApiManager.ComponentActivity;
        getbackek5ggoq.sendMessage(getbackek5ggoq.obtainMessage(4, accessgetpageupcp));
        return parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
    }

    public final zzw write(accessgetNumPadEntercp accessgetnumpadentercp, int i) {
        accessgetSystemNavigationDowncp.serializer(accessgetnumpadentercp, "Listener key cannot be null.");
        GoogleApiManager googleApiManager = this.read;
        googleApiManager.getClass();
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
        googleApiManager.serializer(parentDataModifierDefaultImpls, i, this);
        accessgetPageUpcp accessgetpageupcp = new accessgetPageUpcp(new accessgetProfileSwitchcp(accessgetnumpadentercp, parentDataModifierDefaultImpls), googleApiManager.MediaSessionCompatResultReceiverWrapper.get(), this);
        getBackEK5gGoQ getbackek5ggoq = googleApiManager.ComponentActivity;
        getbackek5ggoq.sendMessage(getbackek5ggoq.obtainMessage(13, accessgetpageupcp));
        return parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
    }

    public final void serializer(int i, accessgetNumPadDotcp accessgetnumpaddotcp) {
        accessgetnumpaddotcp.IconCompatParcelizer();
        GoogleApiManager googleApiManager = this.read;
        googleApiManager.getClass();
        accessgetPageUpcp accessgetpageupcp = new accessgetPageUpcp(new zae(i, accessgetnumpaddotcp), googleApiManager.MediaSessionCompatResultReceiverWrapper.get(), this);
        getBackEK5gGoQ getbackek5ggoq = googleApiManager.ComponentActivity;
        getbackek5ggoq.sendMessage(getbackek5ggoq.obtainMessage(4, accessgetpageupcp));
    }

    public accessgetNumPad7cp(Context context, Activity activity, accessgetNumLockcp accessgetnumlockcp, accessgetNumPad2cp accessgetnumpad2cp, accessgetNumPad8cp accessgetnumpad8cp) {
        accessgetSystemNavigationDowncp.serializer(context, "Null context is not permitted.");
        accessgetSystemNavigationDowncp.serializer(accessgetnumlockcp, "Api must not be null.");
        accessgetSystemNavigationDowncp.serializer(accessgetnumpad8cp, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        accessgetSystemNavigationDowncp.serializer(applicationContext, "The provided context did not have an application context.");
        this.write = applicationContext;
        int i = Build.VERSION.SDK_INT;
        Extras$Key extras$Key = null;
        String attributionTag = (i < 30 || i < 30) ? null : context.getAttributionTag();
        this.MediaDescriptionCompat = attributionTag;
        if (i >= 31) {
            extras$Key = new Extras$Key(21, context.getAttributionSource());
        }
        this.MediaSessionCompatQueueItem = extras$Key;
        this.RatingCompat = accessgetnumlockcp;
        this.MediaMetadataCompat = accessgetnumpad2cp;
        this.PlaybackStateCompat = accessgetnumpad8cp.RemoteActionCompatParcelizer;
        accessgetNumPadDividecp accessgetnumpaddividecp = new accessgetNumPadDividecp(accessgetnumlockcp, accessgetnumpad2cp, attributionTag);
        this.MediaBrowserCompatMediaItem = accessgetnumpaddividecp;
        this.ParcelableVolumeInfo = new accessgetNumPadSubtractcp(this);
        GoogleApiManager googleApiManagerIconCompatParcelizer = GoogleApiManager.IconCompatParcelizer(applicationContext);
        this.read = googleApiManagerIconCompatParcelizer;
        this.MediaSessionCompatToken = googleApiManagerIconCompatParcelizer.PlaybackStateCompat.getAndIncrement();
        this.MediaSessionCompatResultReceiverWrapper = accessgetnumpad8cp.write;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            accessgetNumPadLeftParenthesiscp accessgetnumpadleftparenthesiscp = accessgetNumPadMoveEndcp.read(activity);
            accessgetNumPadPageDowncp accessgetnumpadpagedowncp = (accessgetNumPadPageDowncp) accessgetnumpadleftparenthesiscp.serializer("ConnectionlessLifecycleHelper", accessgetNumPadPageDowncp.class);
            accessgetnumpadpagedowncp = accessgetnumpadpagedowncp == null ? new accessgetNumPadPageDowncp(accessgetnumpadleftparenthesiscp, googleApiManagerIconCompatParcelizer, GoogleApiAvailability.getInstance()) : accessgetnumpadpagedowncp;
            accessgetnumpadpagedowncp.serializer.add(accessgetnumpaddividecp);
            googleApiManagerIconCompatParcelizer.write(accessgetnumpadpagedowncp);
        }
        getBackEK5gGoQ getbackek5ggoq = googleApiManagerIconCompatParcelizer.ComponentActivity;
        getbackek5ggoq.sendMessage(getbackek5ggoq.obtainMessage(7, this));
    }

    public final androidx.emoji2.text.EmojiProcessor IconCompatParcelizer() {
        androidx.emoji2.text.EmojiProcessor emojiProcessor = new androidx.emoji2.text.EmojiProcessor(20, false);
        Set set = Collections.EMPTY_SET;
        if (((createnHHXs2Y) emojiProcessor.serializer) == null) {
            emojiProcessor.serializer = new createnHHXs2Y(0);
        }
        ((createnHHXs2Y) emojiProcessor.serializer).addAll(set);
        Context context = this.write;
        emojiProcessor.IconCompatParcelizer = context.getClass().getName();
        emojiProcessor.read = context.getPackageName();
        return emojiProcessor;
    }
}
