package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "LegalScoreCalculatorV1")
public final class getCropType implements getAnimateOutannotations {
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final ConfigurationManager serializer;

    @Override // o.getAnimateOutannotations
    public final double IconCompatParcelizer() {
        return 5.0d;
    }

    @Override // o.getAnimateOutannotations
    public final parseLonglambda0 MediaMetadataCompat() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.getAnimateOutannotations
    public final float RemoteActionCompatParcelizer() {
        return 3.0f;
    }

    @Override // o.getAnimateOutannotations
    public final int read() {
        return 80;
    }

    @Override // o.getAnimateOutannotations
    public final ConfigurationManager serializer() {
        return this.serializer;
    }

    @Override // o.getAnimateOutannotations
    public final double write() {
        return 0.5d;
    }

    public getCropType(parseLonglambda0 parselonglambda0, ConfigurationManager configurationManager) {
        parselonglambda0.getClass();
        configurationManager.getClass();
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.serializer = configurationManager;
    }

    @Override // o.getAnimateOutannotations
    public final r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k serializer(String str, ArrayList arrayList) {
        str.getClass();
        getClickAction getclickaction = setClickBehaviordefault.read(this, str, arrayList);
        if (getclickaction == null) {
            return null;
        }
        return new r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k(str, SafetyScoreType.LEGAL, setRequestDisallowInterceptTouchEvent.RemoteActionCompatParcelizer(1.0d - (getclickaction.write() / ((double) getclickaction.IconCompatParcelizer()))));
    }
}
