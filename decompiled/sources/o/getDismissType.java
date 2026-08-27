package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "LegalScoreCalculatorV2")
public final class getDismissType implements getAnimateOutannotations {
    private final int IconCompatParcelizer;
    private final double RatingCompat;
    private final double RemoteActionCompatParcelizer;
    private final ConfigurationManager read;
    private final float serializer;
    private final parseLonglambda0 write;

    @Override // o.getAnimateOutannotations
    public final double IconCompatParcelizer() {
        return this.RatingCompat;
    }

    @Override // o.getAnimateOutannotations
    public final parseLonglambda0 MediaMetadataCompat() {
        return this.write;
    }

    @Override // o.getAnimateOutannotations
    public final int read() {
        return this.IconCompatParcelizer;
    }

    @Override // o.getAnimateOutannotations
    public final ConfigurationManager serializer() {
        return this.read;
    }

    @Override // o.getAnimateOutannotations
    public final double write() {
        return this.RemoteActionCompatParcelizer;
    }

    public getDismissType(parseLonglambda0 parselonglambda0, ConfigurationManager configurationManager, getCropType getcroptype) {
        parselonglambda0.getClass();
        configurationManager.getClass();
        getcroptype.getClass();
        this.write = parselonglambda0;
        this.read = configurationManager;
        this.IconCompatParcelizer = 80;
        this.serializer = 3.0f;
        this.RemoteActionCompatParcelizer = 0.5d;
        this.RatingCompat = 5.0d;
    }

    @Override // o.getAnimateOutannotations
    public final r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k serializer(String str, ArrayList arrayList) {
        str.getClass();
        getClickAction getclickaction = setClickBehaviordefault.read(this, str, arrayList);
        if (getclickaction == null) {
            return null;
        }
        return new r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k(str, SafetyScoreType.LEGAL, setRequestDisallowInterceptTouchEvent.RemoteActionCompatParcelizer(Math.pow(1.0d - (getclickaction.write() / ((double) getclickaction.IconCompatParcelizer())), 3.0d)));
    }

    @Override // o.getAnimateOutannotations
    public final float RemoteActionCompatParcelizer() {
        return this.serializer;
    }
}
