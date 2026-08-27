package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.sdk.InjectUsing;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "CrashDetectionThriftUtil")
public class r8lambdaOXfsZ5bXwSG876KWYcsN742T8 extends getVerticalAccuracy {
    public r8lambdaOXfsZ5bXwSG876KWYcsN742T8(parseLonglambda0 parselonglambda0, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, configureFromServerConfiglambda1 configurefromserverconfiglambda1) {
        super(parselonglambda0, r8lambdaw447glwjfoun4bg91upxnadqezs, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, configurefromserverconfiglambda1);
    }

    public static r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM write(r8lambdaM9t1o8mutdXZpGli6kvcUJHiWA r8lambdam9t1o8mutdxzpgli6kvcujhiwa, List list, byte b) {
        ArrayList arrayList = new ArrayList();
        for (populatePushStoryPage populatepushstorypage : r8lambdam9t1o8mutdxzpgli6kvcujhiwa.RatingCompat()) {
            BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 = new BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4();
            String strMediaSessionCompatQueueItem = populatepushstorypage.MediaSessionCompatQueueItem();
            if (strMediaSessionCompatQueueItem == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'name' cannot be null");
                return null;
            }
            brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.serializer = strMediaSessionCompatQueueItem;
            brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.RemoteActionCompatParcelizer = populatepushstorypage.read();
            String strMediaBrowserCompatMediaItem = populatepushstorypage.MediaBrowserCompatMediaItem();
            if (strMediaBrowserCompatMediaItem == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'version' cannot be null");
                return null;
            }
            brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.write = strMediaBrowserCompatMediaItem;
            arrayList.add(brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.IconCompatParcelizer());
        }
        r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q r8lambdabirsljoagmyxhikohl5z5hht12q = new r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q();
        r8lambdabirsljoagmyxhikohl5z5hht12q.RemoteActionCompatParcelizer = arrayList;
        r8lambdabirsljoagmyxhikohl5z5hht12q.serializer = getVerticalAccuracy.serializer(r8lambdam9t1o8mutdxzpgli6kvcujhiwa.RemoteActionCompatParcelizer());
        r8lambdabirsljoagmyxhikohl5z5hht12q.RatingCompat = Short.valueOf(r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.serializer(r8lambdam9t1o8mutdxzpgli6kvcujhiwa.MediaSessionCompatQueueItem()));
        r8lambdabirsljoagmyxhikohl5z5hht12q.IconCompatParcelizer = Short.valueOf(r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.serializer((float) (((double) r8lambdam9t1o8mutdxzpgli6kvcujhiwa.MediaSessionCompatQueueItem()) * 9.800000190734863d)));
        r8lambdabirsljoagmyxhikohl5z5hht12q.write = Short.valueOf(r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.serializer(r8lambdam9t1o8mutdxzpgli6kvcujhiwa.read()));
        r8lambdabirsljoagmyxhikohl5z5hht12q.read = Short.valueOf(r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.serializer(r8lambdam9t1o8mutdxzpgli6kvcujhiwa.MediaBrowserCompatMediaItem()));
        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaMetadataCompat = Short.valueOf(r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.serializer(r8lambdam9t1o8mutdxzpgli6kvcujhiwa.serializer()));
        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaSessionCompatQueueItem = list;
        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaDescriptionCompat = Byte.valueOf(b);
        if (r8lambdam9t1o8mutdxzpgli6kvcujhiwa.IconCompatParcelizer() != null) {
            r8lambdabirsljoagmyxhikohl5z5hht12q.MediaBrowserCompatMediaItem = r8lambdam9t1o8mutdxzpgli6kvcujhiwa.IconCompatParcelizer().toThriftEventConstant();
        }
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(r8lambdam9t1o8mutdxzpgli6kvcujhiwa.MediaMetadataCompat());
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.getFullyDrawnReporter = new r8lambdaE7oIx09KQauliA8paOfGanE2_e8(r8lambdabirsljoagmyxhikohl5z5hht12q);
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        return r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm;
    }
}
