package o;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ShaderKt {
    public final getNoneannotations ComponentActivity;
    public final ImageShaderF49vj9sdefault IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaDescriptionCompat;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaMetadataCompat;
    public final setOutlineui MediaSessionCompatQueueItem;
    public final TextAnnouncementContentCardView MediaSessionCompatResultReceiverWrapper;
    public final TextAnnouncementContentCardView MediaSessionCompatToken;
    public final HttpUrlFetcher ParcelableVolumeInfo;
    public final Map PlaybackStateCompat;
    public final String PlaybackStateCompatCustomAction;
    public final accessplusjd RatingCompat;
    public final TextAnnouncementContentCardView RemoteActionCompatParcelizer;
    public final setOutlineui ResultReceiver;
    public final setOutlineui r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final getBlurRadius r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final SimpleGraphicsLayerModifier r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final SimpleGraphicsLayerModifierlayerBlock1 r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final Context read;
    public final CompositeShader7EN7VTw serializer;
    public final Object write;

    public static setTransformQ8lPUPs write(ShaderKt shaderKt) {
        Context context = shaderKt.read;
        shaderKt.getClass();
        return new setTransformQ8lPUPs(shaderKt, context);
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.write.hashCode();
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        int iHashCode3 = simpleGraphicsLayerModifier == null ? 0 : simpleGraphicsLayerModifier.hashCode();
        String str = this.PlaybackStateCompatCustomAction;
        int iRemoteActionCompatParcelizer = IconCompatParcelizer.RemoteActionCompatParcelizer((((((iHashCode2 + (iHashCode * 31)) * 31) + iHashCode3) * 961) + (str == null ? 0 : str.hashCode())) * 31, this.PlaybackStateCompat, 31);
        String str2 = this.MediaBrowserCompatMediaItem;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        int iHashCode5 = this.ParcelableVolumeInfo.hashCode();
        int iHashCode6 = this.MediaSessionCompatToken.hashCode();
        int iHashCode7 = this.MediaSessionCompatResultReceiverWrapper.hashCode();
        int iHashCode8 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode9 = this.ResultReceiver.hashCode();
        int iHashCode10 = this.MediaSessionCompatQueueItem.hashCode();
        int iHashCode11 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.hashCode();
        int iHashCode12 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.hashCode();
        int iHashCode13 = this.MediaDescriptionCompat.hashCode();
        int iHashCode14 = this.MediaMetadataCompat.hashCode();
        int iHashCode15 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.hashCode();
        return this.IconCompatParcelizer.hashCode() + ((this.serializer.hashCode() + IconCompatParcelizer.RemoteActionCompatParcelizer((this.ComponentActivity.hashCode() + ((this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.hashCode() + ((iHashCode15 + ((iHashCode14 + ((iHashCode13 + ((iHashCode12 + ((iHashCode11 + ((iHashCode10 + ((iHashCode9 + ((iHashCode8 + ((iHashCode7 + ((iHashCode6 + ((iHashCode5 + ((iRemoteActionCompatParcelizer + iHashCode4) * 31)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, this.RatingCompat.read, 31)) * 31);
    }

    public ShaderKt(Context context, Object obj, SimpleGraphicsLayerModifier simpleGraphicsLayerModifier, String str, Map map, String str2, HttpUrlFetcher httpUrlFetcher, TextAnnouncementContentCardView textAnnouncementContentCardView, TextAnnouncementContentCardView textAnnouncementContentCardView2, TextAnnouncementContentCardView textAnnouncementContentCardView3, setOutlineui setoutlineui, setOutlineui setoutlineui2, setOutlineui setoutlineui3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, SimpleGraphicsLayerModifierlayerBlock1 simpleGraphicsLayerModifierlayerBlock1, getBlurRadius getblurradius, getNoneannotations getnoneannotations, accessplusjd accessplusjdVar, CompositeShader7EN7VTw compositeShader7EN7VTw, ImageShaderF49vj9sdefault imageShaderF49vj9sdefault) {
        this.read = context;
        this.write = obj;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = simpleGraphicsLayerModifier;
        this.PlaybackStateCompatCustomAction = str;
        this.PlaybackStateCompat = map;
        this.MediaBrowserCompatMediaItem = str2;
        this.ParcelableVolumeInfo = httpUrlFetcher;
        this.MediaSessionCompatToken = textAnnouncementContentCardView;
        this.MediaSessionCompatResultReceiverWrapper = textAnnouncementContentCardView2;
        this.RemoteActionCompatParcelizer = textAnnouncementContentCardView3;
        this.ResultReceiver = setoutlineui;
        this.MediaSessionCompatQueueItem = setoutlineui2;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = setoutlineui3;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaDescriptionCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = simpleGraphicsLayerModifierlayerBlock1;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = getblurradius;
        this.ComponentActivity = getnoneannotations;
        this.RatingCompat = accessplusjdVar;
        this.serializer = compositeShader7EN7VTw;
        this.IconCompatParcelizer = imageShaderF49vj9sdefault;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShaderKt)) {
            return false;
        }
        ShaderKt shaderKt = (ShaderKt) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, shaderKt.read}, getCieXyz.write())).booleanValue() || !this.write.equals(shaderKt.write)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, shaderKt.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.PlaybackStateCompatCustomAction, shaderKt.PlaybackStateCompatCustomAction}, getCieXyz.write())).booleanValue() || !this.PlaybackStateCompat.equals(shaderKt.PlaybackStateCompat)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, shaderKt.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.ParcelableVolumeInfo, shaderKt.ParcelableVolumeInfo}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatToken, shaderKt.MediaSessionCompatToken}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatResultReceiverWrapper, shaderKt.MediaSessionCompatResultReceiverWrapper}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, shaderKt.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() || this.ResultReceiver != shaderKt.ResultReceiver || this.MediaSessionCompatQueueItem != shaderKt.MediaSessionCompatQueueItem || this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != shaderKt.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, shaderKt.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, shaderKt.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, shaderKt.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, shaderKt.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4}, getCieXyz.write())).booleanValue() || this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != shaderKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY || this.ComponentActivity != shaderKt.ComponentActivity || !this.RatingCompat.equals(shaderKt.RatingCompat) || !this.serializer.equals(shaderKt.serializer)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, shaderKt.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ImageRequest(context=" + this.read + ", data=" + this.write + ", target=" + this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + ", listener=null, memoryCacheKey=" + this.PlaybackStateCompatCustomAction + ", memoryCacheKeyExtras=" + this.PlaybackStateCompat + ", diskCacheKey=" + this.MediaBrowserCompatMediaItem + ", fileSystem=" + this.ParcelableVolumeInfo + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.MediaSessionCompatToken + ", fetcherCoroutineContext=" + this.MediaSessionCompatResultReceiverWrapper + ", decoderCoroutineContext=" + this.RemoteActionCompatParcelizer + ", memoryCachePolicy=" + this.ResultReceiver + ", diskCachePolicy=" + this.MediaSessionCompatQueueItem + ", networkCachePolicy=" + this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + ", errorFactory=" + this.MediaDescriptionCompat + ", fallbackFactory=" + this.MediaMetadataCompat + ", sizeResolver=" + this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + ", scale=" + this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + ", precision=" + this.ComponentActivity + ", extras=" + this.RatingCompat + ", defined=" + this.serializer + ", defaults=" + this.IconCompatParcelizer + ")";
    }
}
