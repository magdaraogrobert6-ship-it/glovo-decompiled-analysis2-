package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.util.Optional;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "OnDevicePayloadCreator")
public class IPropertiesObjectCompanion implements getValidNotificationChannellambda0 {
    private final getStringProperty IconCompatParcelizer;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final setHeaderTextColor read;
    private final CaptionedImageCard serializer;
    private final getCooldownEnterSeconds write;

    public IPropertiesObjectCompanion(CaptionedImageCard captionedImageCard, parseLonglambda0 parselonglambda0, getStringProperty getstringproperty, setHeaderTextColor setheadertextcolor, getCooldownEnterSeconds getcooldownenterseconds) {
        this.serializer = captionedImageCard;
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.IconCompatParcelizer = getstringproperty;
        this.read = setheadertextcolor;
        this.write = getcooldownenterseconds;
    }

    public final void read(long j, setSummaryTextIfPresentAndSupported setsummarytextifpresentandsupported) {
        Optional optional = this.write.read(r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog.class, Long.valueOf(j));
        if (optional.IconCompatParcelizer()) {
            setsummarytextifpresentandsupported.RemoteActionCompatParcelizer(r8lambda9USXHPeqpvLiHO7lRRPwtU075E.class, r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog.class, ((getCooldownEnterSeconds.read) optional.write()).RemoteActionCompatParcelizer());
        }
    }

    public final HashMap write() {
        HashMap map = new HashMap();
        map.put(r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog.class, new IPutIntoJson(this));
        return map;
    }
}
