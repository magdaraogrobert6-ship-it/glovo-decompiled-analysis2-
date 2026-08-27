package o;

import io.grpc.Status;
import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.io.TextStreamsKt;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdatUS6XQ_eCqvrQ4AX_ZhZEa3usI extends UserJavascriptInterfaceBaseExternalSyntheticLambda1 {
    public final JsonUtilsExternalSyntheticLambda1 IconCompatParcelizer;
    public final /* synthetic */ IAction MediaDescriptionCompat;
    public wouldPushPermissionPromptDisplaylambda4 MediaSessionCompatQueueItem;
    public final r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc RatingCompat;
    public PackageUtils RemoteActionCompatParcelizer;
    public UriAction serializer;
    public boolean write;

    @Override // o.UserJavascriptInterfaceBaseExternalSyntheticLambda1
    public final JsonUtilsExternalSyntheticLambda1 MediaSessionCompatResultReceiverWrapper() {
        return this.IconCompatParcelizer;
    }

    public final void PlaybackStateCompat() {
        this.write = true;
        wouldPushPermissionPromptDisplaylambda4 wouldpushpermissionpromptdisplaylambda4 = this.MediaSessionCompatQueueItem;
        Status status = Status.MediaSessionCompatResultReceiverWrapper;
        TextStreamsKt.read("The error status must not be OK", true ^ status.IconCompatParcelizer());
        wouldpushpermissionpromptdisplaylambda4.write(new PackageUtils(setResourcePackageNamelambda0.TRANSIENT_FAILURE, status));
        this.RatingCompat.IconCompatParcelizer(optEnum.INFO, "Subchannel ejected: {0}", this);
    }

    @Override // o.UserJavascriptInterfaceBaseExternalSyntheticLambda1, o.JsonUtilsExternalSyntheticLambda1
    public final void IconCompatParcelizer(List list) {
        IAction iAction = this.MediaDescriptionCompat;
        if (IAction.RemoteActionCompatParcelizer(write()) && IAction.RemoteActionCompatParcelizer(list)) {
            getChannel getchannel = iAction.PlaybackStateCompatCustomAction;
            if (getchannel.IconCompatParcelizer.containsValue(this.serializer)) {
                UriAction uriAction = this.serializer;
                uriAction.getClass();
                this.serializer = null;
                uriAction.MediaBrowserCompatMediaItem.remove(this);
            }
            SocketAddress socketAddress = (SocketAddress) ((r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) list.get(0)).read.get(0);
            if (iAction.PlaybackStateCompatCustomAction.IconCompatParcelizer.containsKey(socketAddress)) {
                ((UriAction) iAction.PlaybackStateCompatCustomAction.IconCompatParcelizer.get(socketAddress)).IconCompatParcelizer(this);
            }
        } else if (IAction.RemoteActionCompatParcelizer(write()) && !IAction.RemoteActionCompatParcelizer(list)) {
            getChannel getchannel2 = iAction.PlaybackStateCompatCustomAction;
            if (getchannel2.IconCompatParcelizer.containsKey(read().read.get(0))) {
                getChannel getchannel3 = iAction.PlaybackStateCompatCustomAction;
                UriAction uriAction2 = (UriAction) getchannel3.IconCompatParcelizer.get(read().read.get(0));
                uriAction2.getClass();
                this.serializer = null;
                uriAction2.MediaBrowserCompatMediaItem.remove(this);
                FormBody.Builder builder = uriAction2.IconCompatParcelizer;
                ((AtomicLong) builder.serializer).set(0L);
                ((AtomicLong) builder.RemoteActionCompatParcelizer).set(0L);
                FormBody.Builder builder2 = uriAction2.write;
                ((AtomicLong) builder2.serializer).set(0L);
                ((AtomicLong) builder2.RemoteActionCompatParcelizer).set(0L);
            }
        } else if (!IAction.RemoteActionCompatParcelizer(write()) && IAction.RemoteActionCompatParcelizer(list)) {
            SocketAddress socketAddress2 = (SocketAddress) ((r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) list.get(0)).read.get(0);
            if (iAction.PlaybackStateCompatCustomAction.IconCompatParcelizer.containsKey(socketAddress2)) {
                ((UriAction) iAction.PlaybackStateCompatCustomAction.IconCompatParcelizer.get(socketAddress2)).IconCompatParcelizer(this);
            }
        }
        this.IconCompatParcelizer.IconCompatParcelizer(list);
    }

    @Override // o.JsonUtilsExternalSyntheticLambda1
    public final getPrettyPrintedStringlambda0 serializer() {
        UriAction uriAction = this.serializer;
        JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 = this.IconCompatParcelizer;
        if (uriAction == null) {
            return jsonUtilsExternalSyntheticLambda1.serializer();
        }
        getPrettyPrintedStringlambda0 getprettyprintedstringlambda0Serializer = jsonUtilsExternalSyntheticLambda1.serializer();
        getprettyprintedstringlambda0Serializer.getClass();
        UriAction uriAction2 = this.serializer;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(IAction.MediaBrowserCompatMediaItem, uriAction2);
        for (Map.Entry entry : getprettyprintedstringlambda0Serializer.read.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((parseJsonObjectIntoBundle) entry.getKey(), entry.getValue());
            }
        }
        return new getPrettyPrintedStringlambda0(identityHashMap);
    }

    public r8lambdatUS6XQ_eCqvrQ4AX_ZhZEa3usI(IAction iAction, requestPushPermissionPromptlambda2 requestpushpermissionpromptlambda2, r8lambda7fNFoEPKuxoy0sqvCQdnDlsPgJo r8lambda7fnfoepkuxoy0sqvcqdndlspgjo) {
        this.MediaDescriptionCompat = iAction;
        wouldPushPermissionPromptDisplaylambda4 wouldpushpermissionpromptdisplaylambda4 = (wouldPushPermissionPromptDisplaylambda4) requestpushpermissionpromptlambda2.IconCompatParcelizer();
        if (wouldpushpermissionpromptdisplaylambda4 != null) {
            this.MediaSessionCompatQueueItem = wouldpushpermissionpromptdisplaylambda4;
            accessrunOnUser accessrunonuser = new accessrunOnUser(this, wouldpushpermissionpromptdisplaylambda4, 1);
            requestPushPermissionPromptlambda2 requestpushpermissionpromptlambda2Write = requestPushPermissionPromptlambda2.write();
            requestpushpermissionpromptlambda2Write.RemoteActionCompatParcelizer(requestpushpermissionpromptlambda2.write);
            getPrettyPrintedStringlambda0 getprettyprintedstringlambda0 = requestpushpermissionpromptlambda2.serializer;
            TextStreamsKt.serializer(getprettyprintedstringlambda0, "attrs");
            requestpushpermissionpromptlambda2Write.serializer = getprettyprintedstringlambda0;
            Object[][] objArr = requestpushpermissionpromptlambda2.RemoteActionCompatParcelizer;
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
            requestpushpermissionpromptlambda2Write.RemoteActionCompatParcelizer = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            requestpushpermissionpromptlambda2Write.read(accessrunonuser);
            this.IconCompatParcelizer = r8lambda7fnfoepkuxoy0sqvcqdndlspgjo.read(new requestPushPermissionPromptlambda2(requestpushpermissionpromptlambda2Write.write, requestpushpermissionpromptlambda2Write.serializer, requestpushpermissionpromptlambda2Write.RemoteActionCompatParcelizer));
        } else {
            this.IconCompatParcelizer = r8lambda7fnfoepkuxoy0sqvcqdndlspgjo.read(requestpushpermissionpromptlambda2);
        }
        this.RatingCompat = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // o.JsonUtilsExternalSyntheticLambda1
    public final void serializer(wouldPushPermissionPromptDisplaylambda4 wouldpushpermissionpromptdisplaylambda4) {
        if (this.MediaSessionCompatQueueItem != null) {
            MediaSessionCompatResultReceiverWrapper().serializer(wouldpushpermissionpromptdisplaylambda4);
            return;
        }
        this.MediaSessionCompatQueueItem = wouldpushpermissionpromptdisplaylambda4;
        MediaSessionCompatResultReceiverWrapper().serializer(new accessrunOnUser(this, wouldpushpermissionpromptdisplaylambda4, 1));
    }

    @Override // o.UserJavascriptInterfaceBaseExternalSyntheticLambda1
    public final String toString() {
        return "OutlierDetectionSubchannel{addresses=" + this.IconCompatParcelizer.write() + '}';
    }

    @Override // o.UserJavascriptInterfaceBaseExternalSyntheticLambda1, o.JsonUtilsExternalSyntheticLambda1
    public final void RatingCompat() {
        UriAction uriAction = this.serializer;
        if (uriAction != null) {
            this.serializer = null;
            uriAction.MediaBrowserCompatMediaItem.remove(this);
        }
        super.RatingCompat();
    }
}
