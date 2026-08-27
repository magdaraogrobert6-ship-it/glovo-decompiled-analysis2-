package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "FocusScoreCalculator")
public final class ShortNewsCard implements IInAppMessage {
    private final parseLonglambda0 serializer;
    private final setDurationInMilliseconds write;

    @Override // o.IInAppMessage
    public final parseLonglambda0 serializer() {
        return this.serializer;
    }

    public ShortNewsCard(parseLonglambda0 parselonglambda0, setDurationInMilliseconds setdurationinmilliseconds) {
        parselonglambda0.getClass();
        setdurationinmilliseconds.getClass();
        this.serializer = parselonglambda0;
        this.write = setdurationinmilliseconds;
    }

    @Override // o.IInAppMessage
    public final r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k write(long j, String str, long j2) {
        str.getClass();
        getBackgroundColor getbackgroundcolorRemoteActionCompatParcelizer = ImageOnlyCard.RemoteActionCompatParcelizer(this, str, j, j2);
        if (getbackgroundcolorRemoteActionCompatParcelizer == null) {
            return null;
        }
        return new r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k(str, SafetyScoreType.FOCUS, setRequestDisallowInterceptTouchEvent.RemoteActionCompatParcelizer(1.0d - (getbackgroundcolorRemoteActionCompatParcelizer.serializer() / getbackgroundcolorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer())));
    }

    @Override // o.IInAppMessage
    public final setDurationInMilliseconds write() {
        return this.write;
    }
}
