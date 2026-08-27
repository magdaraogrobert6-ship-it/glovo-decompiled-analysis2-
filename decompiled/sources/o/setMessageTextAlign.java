package o;

import android.util.Pair;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "SpeedingEventsProvider")
public final class setMessageTextAlign {
    private final setHeaderTextColor IconCompatParcelizer;
    private final ConfigurationManager RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;
    private final migrateTriggersStorageToJsonlambda1 serializer;
    private final setMessageExtras write;

    public setMessageTextAlign(parseLonglambda0 parselonglambda0, setHeaderTextColor setheadertextcolor, migrateTriggersStorageToJsonlambda1 migratetriggersstoragetojsonlambda1, ConfigurationManager configurationManager, setMessageExtras setmessageextras) {
        parselonglambda0.getClass();
        setheadertextcolor.getClass();
        migratetriggersstoragetojsonlambda1.getClass();
        configurationManager.getClass();
        setmessageextras.getClass();
        this.read = parselonglambda0;
        this.IconCompatParcelizer = setheadertextcolor;
        this.serializer = migratetriggersstoragetojsonlambda1;
        this.RemoteActionCompatParcelizer = configurationManager;
        this.write = setmessageextras;
    }

    public final List<r8lambdaRleDsXHyrU7hnnAyr0DPXgvoX80> serializer(String str) {
        Long l;
        str.getClass();
        boolean zEnsureViewModelStore = this.RemoteActionCompatParcelizer.ensureViewModelStore();
        parseLonglambda0 parselonglambda0 = this.read;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (!zEnsureViewModelStore) {
            parselonglambda0.IconCompatParcelizer("Speeding event detection is disabled", new Object[0]);
            return instance_delegatelambda0Var;
        }
        Pair<Long, Long> pairSerializer = this.serializer.serializer(str);
        if (pairSerializer != null && (l = (Long) pairSerializer.second) != null) {
            long jLongValue = l.longValue();
            List listIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(InAppMessageHtml.MediaBrowserCompatMediaItem(), str);
            listIconCompatParcelizer.getClass();
            handleLogClick handlelogclick = (handleLogClick) onContentCardDismissed.MediaMetadataCompat(listIconCompatParcelizer);
            if (handlelogclick != null) {
                List<handleLogClickdefault> listMediaSessionCompatResultReceiverWrapper = handlelogclick.MediaSessionCompatResultReceiverWrapper();
                listMediaSessionCompatResultReceiverWrapper.getClass();
                List<r8lambdaRleDsXHyrU7hnnAyr0DPXgvoX80> listRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(jLongValue, listMediaSessionCompatResultReceiverWrapper);
                parselonglambda0.IconCompatParcelizer("Retrieved %d speeding events for transport with ID: %s", Integer.valueOf(listRemoteActionCompatParcelizer.size()), str);
                return listRemoteActionCompatParcelizer;
            }
        }
        return instance_delegatelambda0Var;
    }
}
