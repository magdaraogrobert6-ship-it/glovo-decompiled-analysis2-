package o;

import java.lang.ref.Reference;
import java.net.Socket;

/* JADX INFO: loaded from: classes3.dex */
public final class setTriggerActionMinimumTimeIntervalSeconds {
    public static setTriggerActionMinimumTimeIntervalSeconds IconCompatParcelizer;
    public static final setTriggerActionMinimumTimeIntervalSeconds serializer = new setTriggerActionMinimumTimeIntervalSeconds();
    public static final setTriggerActionMinimumTimeIntervalSeconds write = new setTriggerActionMinimumTimeIntervalSeconds();
    public static final setTriggerActionMinimumTimeIntervalSeconds read = new setTriggerActionMinimumTimeIntervalSeconds();
    public static final setTriggerActionMinimumTimeIntervalSeconds RemoteActionCompatParcelizer = new setTriggerActionMinimumTimeIntervalSeconds();

    public static Socket read(getVersionCode getversioncode, setSmallNotificationIcon setsmallnotificationicon, r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw r8lambdat8fev0yhsugjmgcolxj0pkxlpw) {
        for (r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve : getversioncode.read) {
            if (r8lambdaik1pft6kfq5yrxiftoy3aewpve.IconCompatParcelizer(setsmallnotificationicon, null) && r8lambdaik1pft6kfq5yrxiftoy3aewpve.MediaSessionCompatQueueItem != null && r8lambdaik1pft6kfq5yrxiftoy3aewpve != r8lambdat8fev0yhsugjmgcolxj0pkxlpw.RemoteActionCompatParcelizer()) {
                if (r8lambdat8fev0yhsugjmgcolxj0pkxlpw.PlaybackStateCompatCustomAction != null || r8lambdat8fev0yhsugjmgcolxj0pkxlpw.MediaBrowserCompatMediaItem.MediaSessionCompatToken.size() != 1) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
                    break;
                }
                Reference reference = (Reference) r8lambdat8fev0yhsugjmgcolxj0pkxlpw.MediaBrowserCompatMediaItem.MediaSessionCompatToken.get(0);
                Socket socket = r8lambdat8fev0yhsugjmgcolxj0pkxlpw.read(true, false, false);
                r8lambdat8fev0yhsugjmgcolxj0pkxlpw.MediaBrowserCompatMediaItem = r8lambdaik1pft6kfq5yrxiftoy3aewpve;
                r8lambdaik1pft6kfq5yrxiftoy3aewpve.MediaSessionCompatToken.add(reference);
                return socket;
            }
        }
        return null;
    }

    public static void IconCompatParcelizer(getVersionCode getversioncode, setSmallNotificationIcon setsmallnotificationicon, r8lambdat8fEv0yHSUgjmGCOLXJ0PkXlpw r8lambdat8fev0yhsugjmgcolxj0pkxlpw, setTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release) {
        for (r8lambdaIK1pFt6Kfq5YrXIfTOY3aeWPvE r8lambdaik1pft6kfq5yrxiftoy3aewpve : getversioncode.read) {
            if (r8lambdaik1pft6kfq5yrxiftoy3aewpve.IconCompatParcelizer(setsmallnotificationicon, settouchmoderequiredforhtmlinappmessagesandroid_sdk_base_release)) {
                if (r8lambdat8fev0yhsugjmgcolxj0pkxlpw.MediaBrowserCompatMediaItem == null) {
                    r8lambdat8fev0yhsugjmgcolxj0pkxlpw.MediaBrowserCompatMediaItem = r8lambdaik1pft6kfq5yrxiftoy3aewpve;
                    r8lambdat8fev0yhsugjmgcolxj0pkxlpw.MediaSessionCompatResultReceiverWrapper = true;
                    r8lambdaik1pft6kfq5yrxiftoy3aewpve.MediaSessionCompatToken.add(new r8lambda_rBBbfSaSmW9ZaqWlktZwFDxzPQ(r8lambdat8fev0yhsugjmgcolxj0pkxlpw, r8lambdat8fev0yhsugjmgcolxj0pkxlpw.MediaDescriptionCompat));
                    return;
                }
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
                return;
            }
        }
    }
}
